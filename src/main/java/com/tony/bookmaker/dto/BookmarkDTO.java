package com.tony.bookmaker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkDTO {
    private Long id;
    private String title;
    private String url;
    private Instant createdAt;
}
