package com.dongeui.dongeui.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ProductSummaryResponse {

  private String name;
  private String image;
}
