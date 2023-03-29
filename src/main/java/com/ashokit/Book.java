package com.ashokit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Books")
public class Book {
	@Id
	@Column(name="Books_id")
	private Integer Booksid;
	
	@Column(name="Books_name")
	private String Booksname;
	
	@Column(name="Books_price")
	private Double Booksprice;

	public Integer getBooksid() {
		return Booksid;
	}

	public void setBooksid(Integer booksid) {
		Booksid = booksid;
	}

	public String getBooksname() {
		return Booksname;
	}

	public void setBooksname(String booksname) {
		Booksname = booksname;
	}

	public Double getBooksprice() {
		return Booksprice;
	}

	public void setBooksprice(Double booksprice) {
		Booksprice = booksprice;
	}

	@Override
	public String toString() {
		return "Book [Booksid=" + Booksid + ", Booksname=" + Booksname + ", Booksprice=" + Booksprice + "]";
	}

	
	

	
}
