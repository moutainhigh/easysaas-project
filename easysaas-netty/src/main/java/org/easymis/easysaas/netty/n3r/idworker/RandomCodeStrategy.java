package org.easymis.easysaas.netty.n3r.idworker;
public interface RandomCodeStrategy {

    void init();

    int prefix();

    int next();

    void release();
}
