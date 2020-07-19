package com.pribbackend.web.news;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "news_key")
    private Long id;

    @Column(name = "news_link", nullable = false)
    private String newsLink;

    @Column(name = "news_category", nullable = false)
    private String news_category;
}