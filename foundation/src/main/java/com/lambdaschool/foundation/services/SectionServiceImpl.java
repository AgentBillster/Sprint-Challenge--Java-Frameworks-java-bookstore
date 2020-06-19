package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.Author;
import com.lambdaschool.foundation.models.Section;
import com.lambdaschool.foundation.repository.SectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class SectionServiceImpl implements SectionService {


    @Autowired
    private SectionRepo sectionRepo;

    @Transactional
    @Override
    public List<Section> getAllSections() {
        List<Section> list = new ArrayList<>();

        sectionRepo.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Section save(Section section) {
        return null;
    }
}
