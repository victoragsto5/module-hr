package br.edu.up.modulehr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AuthorRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AuthorRepository repository;

    @Test
    public void testFindByName() {

        entityManager.persist(new Author("Victor Augusto"));

        List<Author> authors = repository.findByName("Victor Augusto");
        assertEquals(1, authors.size());

        assertThat(authors).extracting(Author::getName).containsOnly("Victor Augusto");

    }

}
