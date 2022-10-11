package site.metacoding.frontproject.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class IndexController {

    // @GetMapping("/onclick")
    // public String resume_detail2() {
    //     return "onclick_form";
    // }

    // @GetMapping("/upload")
    // public String upload() {
    //     return "upload";
    // }

    // // @GetMapping("/index")
    // // public String index() {
    // //     return "/index";
    // // }

    // @PostMapping("/upload")
    // public @ResponseBody String create(@RequestPart MultipartFile file) {
    //     String fileName = file.getOriginalFilename();
    //     System.out.println("fileName : " + fileName);
    //     // 받은 file을 DB에 넣을지, 서버 하드디스크에 기록할지
    //     String filePath = "c:\\upload\\" + fileName;
    //     System.out.println("filePath:" + filePath);

    //     File dest = new File(filePath);
    //     try {
    //         Files.copy(file.getInputStream(), dest.toPath());
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    //     return "ok";
    // }

}