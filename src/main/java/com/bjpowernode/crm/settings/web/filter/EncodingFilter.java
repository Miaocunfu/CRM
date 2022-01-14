package com.bjpowernode.crm.settings.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Miaocunfu
 * @Description
 * @Classname EncodingFilter
 * @date 2022/1/10 18:51
 */

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        chain.doFilter(req,resp);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
