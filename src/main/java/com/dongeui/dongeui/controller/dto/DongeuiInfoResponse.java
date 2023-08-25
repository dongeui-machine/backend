package com.dongeui.dongeui.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class DongeuiInfoResponse {

  private String companyName;
  private String representativeName;
  private String phoneNumber;
  private String address;
}
