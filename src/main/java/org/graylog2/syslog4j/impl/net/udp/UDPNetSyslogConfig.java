package org.graylog2.syslog4j.impl.net.udp;

import org.graylog2.syslog4j.impl.net.AbstractNetSyslogConfig;
import org.productivity.java.syslog4j.SyslogBackLogHandlerIF;
import org.productivity.java.syslog4j.SyslogMessageModifierIF;

/**
 * UDPNetSyslogConfig is an extension of AbstractNetSyslogConfig that provides
 * configuration support for UDP/IP-based syslog clients.
 * <p/>
 * <p>Syslog4j is licensed under the Lesser GNU Public License v2.1.  A copy
 * of the LGPL license is available in the META-INF folder in all
 * distributions of Syslog4j and in the base directory of the "doc" ZIP.</p>
 *
 * @author &lt;syslog4j@productivity.org&gt;
 * @version $Id: UDPNetSyslogConfig.java,v 1.6 2008/11/14 04:32:00 cvs Exp $
 */
public class UDPNetSyslogConfig extends AbstractNetSyslogConfig {
    private static final long serialVersionUID = 4465067182562754345L;

    public UDPNetSyslogConfig() {
        super();
    }

    public UDPNetSyslogConfig(int facility, String host, int port) {
        super(facility, host, port);
    }

    public UDPNetSyslogConfig(int facility, String host) {
        super(facility, host);
    }

    public UDPNetSyslogConfig(int facility) {
        super(facility);
    }

    public UDPNetSyslogConfig(String host, int port) {
        super(host, port);
    }

    public UDPNetSyslogConfig(String host) {
        super(host);
    }

    public Class getSyslogClass() {
        return UDPNetSyslog.class;
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
}
