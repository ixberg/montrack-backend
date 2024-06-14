package com.springdatajjpa.montrack.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "rsa")
public record RsaConfiguration(RSAPrivateKey privateKey, RSAPublicKey publicKey) {
}
