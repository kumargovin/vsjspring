package com.blogspot.varanasisoftwarejunction.vsjmysql;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String bookName;

	public List<Reader> getReaderList() {
		return readerList;
	}

	public void setReaderList(List<Reader> readerList) {
		this.readerList = readerList;
	}

	private String subject;
	private Integer price;

	@OneToMany(mappedBy = "book")
	private List<Reader> readerList;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
