package com.tony.bookmaker.service;

import com.tony.bookmaker.domain.Bookmark;
import com.tony.bookmaker.dto.BookmarkDTO;
import com.tony.bookmaker.dto.BookmarksDTO;
import com.tony.bookmaker.mapper.BookmarkMapper;
import com.tony.bookmaker.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    @Transactional(readOnly = true)
    public BookmarksDTO getAllBookmark(Integer page, Integer size) {
        int pageNo = page == null ||  page < 1 ? 0 : page - 1;
        Pageable pageable = PageRequest.of(pageNo, size, Sort.Direction.DESC, "createdAt");
        Page<BookmarkDTO> bookmarkDTOPage = bookmarkRepository.findBookmarks(pageable);
        return new BookmarksDTO(bookmarkDTOPage);
    }

}
