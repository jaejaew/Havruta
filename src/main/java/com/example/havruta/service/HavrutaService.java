package com.example.havruta.service;

import com.example.havruta.data.dto.*;

public interface HavrutaService {

    public ResponseDto signIn(SignInRequestDto reqbody);
    public GroupListResponseDto mainPage();
}
