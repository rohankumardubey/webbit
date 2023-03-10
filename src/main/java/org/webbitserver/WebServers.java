package org.webbitserver;

import org.webbitserver.netty.NettyWebServer;

import java.net.SocketAddress;
import java.net.URI;
import java.util.concurrent.Executor;

public class WebServers {

    /**
    * Returns a new {@link WebServer} object, which runs on the provided port.
    *
    * @see NettyWebServer
    * @param port
    * @return {@link WebServer} object
    */
    public static WebServer createWebServer(int port) {
        return new NettyWebServer(port);
    }

    /**
    * Returns a new {@link WebServer} object, which runs on the provided port
    * and adds the executor to the List of executor services to be called when
    * the server is running.
    *
    * @see NettyWebServer
    * @param executor
    * @param port
    * @return {@link WebServer} object
    */
    public static WebServer createWebServer(Executor executor, int port) {
        return new NettyWebServer(executor, port);
    }

    /**
    * Returns a new {@link WebServer} object, adding the executor to the list
    * of executor services, running on the stated socket address and accessible
    * from the provided public URI.
    *
    * @see NettyWebServer
    * @param executor
    * @param socketAddress
    * @param publicUri
    * @return {@link WebServer} object
    */
    public static WebServer createWebServer(Executor executor, SocketAddress socketAddress, URI publicUri) {
        return new NettyWebServer(executor, socketAddress, publicUri);
    }

}
