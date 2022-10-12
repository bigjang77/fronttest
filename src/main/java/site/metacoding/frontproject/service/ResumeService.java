package site.metacoding.frontproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.frontproject.domain.resume.Resume;
import site.metacoding.frontproject.domain.resume.ResumeDao;

@Service
@RequiredArgsConstructor
public class ResumeService {

    private final ResumeDao resumeDao;

    public Resume 이력서상세보기(Integer resumeId) {
        return resumeDao.findById(resumeId);
    }
}