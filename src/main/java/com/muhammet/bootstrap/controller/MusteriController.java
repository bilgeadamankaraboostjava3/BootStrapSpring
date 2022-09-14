package com.muhammet.bootstrap.controller;

import com.muhammet.bootstrap.repository.MusteriRepository;
import com.muhammet.bootstrap.repository.entity.Musteri;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/musteri")
@RequiredArgsConstructor
public class MusteriController {

    private final MusteriRepository musteriRepository;
    // localhost:9090/musteri/save
    @PostMapping("/save")
    public Object save(String ad, String soyad, String adres){
        Musteri musteri = Musteri.builder()
                .ad(ad)
                .adres(adres)
                .soyad(soyad)
                .build();
        musteriRepository.save(musteri);
        return "redirect:localhost:9090/bostSatis.html";
    }
}
