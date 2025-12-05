package com.springbootexample.models;

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Document("Books") // Indica que a classe representa documentos na coleção "Books" do MongoDB
@Data // Declaração de Dado(getters, setters...)

public class Book {
    @Id
    public String id;

    @JsonProperty("Name")
    public String name;

    @JsonProperty("Author")
    public String author;

    @JsonProperty("Price")
    public BigDecimal price;

    @JsonProperty("Category")
    public String category;
}
