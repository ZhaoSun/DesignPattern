// log4j日志框架的适配器
import org.apache.log4j.Level;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

import java.io.Serializable;

public final class Log4jLoggerAdapter implements Logger, Serializable {
    private static final String FQCN = "Log4jLoggerAdapter";
    final transient org.apache.log4j.Logger logger; // log4j

    public Log4jLoggerAdapter(org.apache.log4j.Logger logger) {
        this.logger = logger;
    }

    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    public void debug(String msg) {
        logger.log(FQCN, Level.DEBUG, msg, null);
    }

    public void debug(String format, Object arg) {
        if (logger.isDebugEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            logger.log(FQCN, Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    public void debug(String format, Object arg1, Object arg2) {
        if (logger.isDebugEnabled()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            logger.log(FQCN, Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    public void debug(String format, Object[] argArray) {
        if (logger.isDebugEnabled()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            logger.log(FQCN, Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    public void debug(String msg, Throwable t) {
        logger.log(FQCN, Level.DEBUG, msg, t);
    }
    //...省略一堆接口的实现...
}