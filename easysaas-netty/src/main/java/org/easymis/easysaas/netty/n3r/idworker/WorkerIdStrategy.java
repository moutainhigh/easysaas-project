package org.easymis.easysaas.netty.n3r.idworker;

public interface WorkerIdStrategy {

    void initialize();

    long availableWorkerId();

    void release();
}
