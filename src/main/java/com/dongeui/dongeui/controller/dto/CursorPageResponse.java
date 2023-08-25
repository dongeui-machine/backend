package com.dongeui.dongeui.controller.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CursorPageResponse<T> {

  private List<T> items;
  private Cursor cursor;

  @AllArgsConstructor
  @Getter
  public static class Cursor {

    private String next;
    private int size;
  }
}
