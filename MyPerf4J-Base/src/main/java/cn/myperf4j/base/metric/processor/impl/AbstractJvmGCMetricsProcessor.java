package cn.myperf4j.base.metric.processor.impl;

import cn.myperf4j.base.metric.processor.JvmGCMetricsProcessor;

/**
 * Created by LinShunkang on 2018/8/25
 */
public abstract class AbstractJvmGCMetricsProcessor implements JvmGCMetricsProcessor {

    @Override
    public void beforeProcess(long processId, long startMillis, long stopMillis) {
        //empty
    }

    @Override
    public void afterProcess(long processId, long startMillis, long stopMillis) {
        //empty
    }
}