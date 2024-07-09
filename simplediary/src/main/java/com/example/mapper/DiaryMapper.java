package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Diary;

@Mapper
public interface DiaryMapper {
    List<Diary> getAllDiaries();

    Diary getDiary(Long id);

    void insertDiary(Diary diary);

    void updateDiary(Diary diary);

    void deleteDiary(Long id);
}
