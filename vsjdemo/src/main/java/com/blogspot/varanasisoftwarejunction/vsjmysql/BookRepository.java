package com.blogspot.varanasisoftwarejunction.vsjmysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}