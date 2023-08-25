package com.dongeui.dongeui.controller;

import com.dongeui.dongeui.controller.dto.CursorPageResponse;
import com.dongeui.dongeui.controller.dto.CursorPageResponse.Cursor;
import com.dongeui.dongeui.controller.dto.DongeuiInfoResponse;
import com.dongeui.dongeui.controller.dto.ProductSummaryResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Apis", description = "")
@RestController
public class Controller {

  @Operation(summary = "회사 정보 조회")
  @GetMapping("/api/v1/company-info")
  public ResponseEntity<DongeuiInfoResponse> getCompanyInfo() {
    return ResponseEntity.ok().body(DongeuiInfoResponse.builder()
        .companyName("(주) 동의메디칼, 동의기계")
        .representativeName("최정호")
        .phoneNumber("010-5223-1151")
        .address("서울특별시 양천구 지양로9길 12 제일B/D 1층")
        .build());
  }

  @Operation(summary = "제품 목록 조회")
  @GetMapping("/api/v1/products")
  public ResponseEntity<CursorPageResponse<ProductSummaryResponse>> getProducts() {
    return ResponseEntity.ok(new CursorPageResponse(
        List.of(
            ProductSummaryResponse.builder()
                .image("https://cdn-pro-web-219-28.cdn-nhncommerce.com/nahyo3_godomall_com/data/goods/23/01/01/1090/1090_main_098.jpg")
                .name("명의(스파우트)(90X150)기본수량1000매(쫄대 별도구매)")
                .build()
        ),
        new Cursor(null, 20)
    ));
  }
}
