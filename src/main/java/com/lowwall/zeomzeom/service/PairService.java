package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.repository.PairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PairService {
    private final PairRepository pairRepository;
}
