package com.tellin.dto.response.oauth;

import lombok.Data;

@Data
public class OAuth2AccessTokenResponse  {
    private String token_type;
    private String access_token;
    private int expires_in;
    private String refresh_token;
    private int refresh_token_expires_in;
}
