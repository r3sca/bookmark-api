package com.tony.bookmaker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tony.bookmaker.domain.Bookmark;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookmarksDTO {
    private List<BookmarkDTO> data;
    private long totalElements;
    private int totalPages;
    private int currentPage;
    @JsonProperty("isFirst")
    private boolean isFirst;
    @JsonProperty("isLast")
    private boolean isLast;
    private boolean hasNext;
    private boolean hasPrevious;

    public BookmarksDTO(Page<BookmarkDTO> bookmarkPage) {
        this.data = bookmarkPage.getContent();
        this.totalElements = bookmarkPage.getTotalElements();
        this.totalPages = bookmarkPage.getTotalPages();
        this.currentPage = bookmarkPage.getNumber();
        this.isFirst = bookmarkPage.isFirst();
        this.isLast = bookmarkPage.isLast();
        this.hasNext = bookmarkPage.hasNext();
        this.hasPrevious = bookmarkPage.hasPrevious();
    }
}
