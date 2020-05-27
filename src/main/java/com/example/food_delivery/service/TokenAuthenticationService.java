// package com.example.food_delivery.service;

// import java.util.Date;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.springframework.security.core.Authentication;

// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;

// public class TokenAuthenticationService {
// 	static final long EXPIRATIONTIME = 864_000_000; // 10 days

// 	static final String SECRET = "secret";

// 	static final String TOKEN_PREFIX = "Bearer";

// 	static final String HEADER_STRING = "Authorization";

// 	public static void addAuthentication(HttpServletResponse response, String username) {
// 		String JWT = Jwts.builder().setSubject(username)
// 				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
// 				.signWith(SignatureAlgorithm.HS512, SECRET).compact();
// 		response.addHeader(HEADER_STRING, JWT);
// 	}

// 	public static Authentication getAuthentication(HttpServletRequest request) {
// 		return null;
// 	}

// }
