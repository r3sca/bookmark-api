package com.tony.bookmaker.repository;

import com.tony.bookmaker.domain.Bookmark;
import com.tony.bookmaker.dto.BookmarkDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    @Query("select new com.tony.bookmaker.dto.BookmarkDTO(b.id, b.title, b.url, b.createdAt) from Bookmark b")
    Page<BookmarkDTO> findBookmarks(Pageable pageable);
}
