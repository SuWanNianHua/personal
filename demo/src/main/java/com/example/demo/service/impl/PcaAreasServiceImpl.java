package com.example.demo.service.impl;

import com.example.demo.bean.PcaAreas;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.PcaAreasMapper;
import com.example.demo.service.PcaAreasService;

import java.util.List;

@Service
public class PcaAreasServiceImpl implements PcaAreasService{

    @Resource
    private PcaAreasMapper pcaAreasMapper;

    @Override
    public List<PcaAreas> getAll() {
        return pcaAreasMapper.selectAll();
    }
}
