package org.easymis.easysaas.gateway.security.test1.filter;

import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

/**
 * @Author : KingFish
 * @Email : XXXXXX
 * @Data: 2019/10/30
 * @Des: Token有效性验证拦截器
 */
public class JwtTokenFilter implements WebFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		System.out.print("JwtTokenFilter");
		return null;
	}}