package com.tony.bookmaker.mapper;

import com.tony.bookmaker.domain.Bookmark;
import com.tony.bookmaker.dto.BookmarkDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface BookmarkMapper {

    // Entity -> DTO
    BookmarkDTO toDto(Bookmark bookmark);

    // DTO -> Entity
    Bookmark toEntity(BookmarkDTO dto);
}
