package br.edu.up.modulehr;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Author {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;

	    public Author() {
	    }

	    public Author(String name) {
	        this.setName(name);
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
