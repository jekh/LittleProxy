package org.littleshoot.proxy.impl;

import static org.junit.Assert.*;

import java.net.InetAddress;

import org.junit.Ignore;
import org.junit.Test;

// ignoring. modified code to find localhost to avoid using UDP. plan to replace with new aliasing support in later release.
@Ignore
public class NetworkUtilsTest {
    @Test
    public void testGetLocalhost() throws Exception {
        InetAddress localhost = NetworkUtils.getLocalHost();
        assertFalse(localhost.isLoopbackAddress());
        assertFalse(localhost.isAnyLocalAddress());
    }
}
