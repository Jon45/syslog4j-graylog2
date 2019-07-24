package org.graylog2.syslog4j.impl.unix;

import org.graylog2.syslog4j.SyslogConstants;
import org.graylog2.syslog4j.SyslogRuntimeException;
import org.graylog2.syslog4j.impl.AbstractSyslogConfig;
import org.productivity.java.syslog4j.SyslogBackLogHandlerIF;
import org.productivity.java.syslog4j.SyslogMessageModifierIF;

/**
 * UnixSyslogConfig is an extension of AbstractNetSyslogConfig that provides
 * configuration support for Unix-based syslog clients.
 * <p/>
 * <p>Syslog4j is licensed under the Lesser GNU Public License v2.1.  A copy
 * of the LGPL license is available in the META-INF folder in all
 * distributions of Syslog4j and in the base directory of the "doc" ZIP.</p>
 *
 * @author &lt;syslog4j@productivity.org&gt;
 * @version $Id: UnixSyslogConfig.java,v 1.13 2010/10/25 03:50:25 cvs Exp $
 */
public class UnixSyslogConfig extends AbstractSyslogConfig {
    private static final long serialVersionUID = -4805767812011660656L;

    protected String library = SyslogConstants.SYSLOG_LIBRARY_DEFAULT;
    protected int option = SyslogConstants.OPTION_NONE;

    public UnixSyslogConfig() {
        // Unix-based syslog does not need localName sent
        this.setSendLocalName(false);
    }

    public Class getSyslogClass() {
        return UnixSyslog.class;
    }

    public String getHost() {
        return null;
    }

    public int getPort() {
        return 0;
    }

    public void setHost(String host) throws SyslogRuntimeException {
        throw new SyslogRuntimeException("Host not appropriate for class \"" + this.getClass().getName() + "\"");
    }

    @Override
    public void addMessageModifier(SyslogMessageModifierIF messageModifier) {

    }

    @Override
    public void insertMessageModifier(int index, SyslogMessageModifierIF messageModifier) {

    }

    @Override
    public void removeMessageModifier(SyslogMessageModifierIF messageModifier) {

    }

    @Override
    public void addBackLogHandler(SyslogBackLogHandlerIF backLogHandler) {

    }

    @Override
    public void insertBackLogHandler(int index, SyslogBackLogHandlerIF backLogHandler) {

    }

    @Override
    public void removeBackLogHandler(SyslogBackLogHandlerIF backLogHandler) {

    }

    public void setPort(int port) throws SyslogRuntimeException {
        throw new SyslogRuntimeException("Port not appropriate for class \"" + this.getClass().getName() + "\"");
    }

    public String getLibrary() {
        return this.library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public int getOption() {
        return this.option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getMaxQueueSize() {
        throw new SyslogRuntimeException("UnixSyslog protocol does not uses a queueing mechanism");
    }

    public void setMaxQueueSize(int maxQueueSize) {
        throw new SyslogRuntimeException("UnixSyslog protocol does not uses a queueing mechanism");
    }
}
