package com.pribbackend.web.storeHouse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor
@Table(name = "storeHouse")
public class StoreHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "store_index_key")
    private Long id;

    @Column (name = "saved_date")
    private LocalDateTime savedDate;

    @Column (name = "news_key", nullable = false)
    private String newsKey;

    @Column (name = "user_key", nullable = false)
    private String userKey;

}
