package com.checkpoint.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.checkpoint.service.LogService;

@Service("LogService1")
public class LogServiceImpl implements LogService {

    private static final Log LOG = LogFactory.getLog(LogServiceImpl.class);

    @Override
    public void showLog() {
        LOG.info("El servicio ha sido usado");
    }

}
