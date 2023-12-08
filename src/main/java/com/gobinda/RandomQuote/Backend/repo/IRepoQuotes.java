package com.gobinda.RandomQuote.Backend.repo;

import com.gobinda.RandomQuote.Backend.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoQuotes extends JpaRepository<Quote,Integer> {

    Quote findFirstByAuthor(String author);
}
