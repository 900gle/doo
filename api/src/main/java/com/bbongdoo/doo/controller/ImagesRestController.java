package com.bbongdoo.doo.controller;

import com.bbongdoo.doo.dto.ImageIndexDTO;
import com.bbongdoo.doo.model.response.CommonResult;
import com.bbongdoo.doo.service.OpencvImageIndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@Api(tags = "3. Products Apis")
@RequestMapping("api/images")
@RequiredArgsConstructor
public class ImagesRestController {


    private final OpencvImageIndexService opencvImageIndexService;


    @CrossOrigin("*")
    @ApiOperation(value = "index", notes = "이미지 검색 - 이미지 데이타 색인")
    @PostMapping("opencv")
    public CommonResult staticIndexer(
            @ApiParam(value = "파일") @RequestParam(value = "file", required = true) @Validated final MultipartFile file,
            @ApiParam(value = "이미지 아이디") @RequestParam(value = "imageId", defaultValue = "1", required = true) @Validated final int imageId
    ) {
        return opencvImageIndexService.staticIndex(ImageIndexDTO.builder().imageId(imageId).file(file).build());
    }

}
