package com.bbongdoo.doo.controller;

import com.bbongdoo.doo.service.ProductsService;
import com.bbongdoo.doo.service.model.response.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "1. Products Apis")
@RequestMapping("api/")
@RequiredArgsConstructor
public class ProductsRestController {


   private final ProductsService productsService;




    @CrossOrigin("*")
    @ApiOperation(value = "index", notes = "색인 데이타 확인")
    @GetMapping("data")
    public CommonResult getDatas(
            @ApiParam(value = "인덱스 종류") @RequestParam(value = "indexKey", defaultValue = "tensor", required = true) @Validated final String indexKey,
            @ApiParam(value = "이미지 명") @RequestParam(value = "imageName", defaultValue = "", required = true) @Validated final String imageName
    ) {
        return productsService.getProducts();
    }




}
