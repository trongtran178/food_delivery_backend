// package com.example.food_delivery.filter;

// import java.io.IOException;
// import java.util.Collections;
// import java.util.stream.Collectors;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
// import org.springframework.security.web.util.matcher.RequestMatcher;

// import com.example.food_delivery.service.TokenAuthenticationService;

// public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

// 	protected JWTLoginFilter(RequestMatcher requiresAuthenticationRequestMatcher) {
// 		super(requiresAuthenticationRequestMatcher);

// 	}

// 	public JWTLoginFilter(String url, AuthenticationManager authManager) {
// 		super(new AntPathRequestMatcher(url));
// 		setAuthenticationManager(authManager);
// 	}

// 	@Override
// 	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
// 			throws AuthenticationException, IOException, ServletException {
// 		String username = "trongtran", password = "trongtran";

// 		if (request.getMethod().equalsIgnoreCase("POST")) {
// 			String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
// 			System.out.println(body);
// 		}
// 		return getAuthenticationManager()
// 				.authenticate(new UsernamePasswordAuthenticationToken(username, password, Collections.emptyList()));

// 	}

// 	@Override
// 	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
// 			Authentication authResult) throws IOException, ServletException {
// 		System.out.println("JWTLoginFilter.successfulAuthentication:");

// 		// Write Authorization to Headers of Response.
// 		TokenAuthenticationService.addAuthentication(response, authResult.getName());

// 		String authorizationString = response.getHeader("Authorization");

// 		System.out.println("Authorization String=" + authorizationString);
// 	}

// }