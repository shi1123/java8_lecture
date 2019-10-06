package com.szp.netty.firstserver;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

public class TestHttpServerHandler extends SimpleChannelInboundHandler<HttpObject> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
        if(msg instanceof HttpRequest) {
            ByteBuf content = Unpooled.copiedBuffer("hello world", CharsetUtil.UTF_8);

            FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, content);

            response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH, content.readableBytes());

            ctx.writeAndFlush(response);
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception{
        System.out.println("channel active");
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception{
        System.out.println("channel channelInactive");
        super.channelInactive(ctx);
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception{
        System.out.println("channel channelRegistered");
        super.channelRegistered(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception{
        System.out.println("channel channelUnregistered");
        super.channelUnregistered(ctx);
    }

//    @Override
//    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
//        String s = (String) e.getMessage();
//        System.out.println("服务端接收到消息:" + s);
//        ctx.getChannel().write("返回客户端一个消息:你好，" + s );
//        super.messageReceived(ctx, e);
//    }
//
//    @Override
//    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
//        super.exceptionCaught(ctx, e);
//    }
//
//    @Override
//    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
//        super.channelOpen(ctx, e);
//    }
//
//    @Override
//    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
//        super.channelConnected(ctx, e);
//    }
//
//    @Override
//    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
//        super.channelDisconnected(ctx, e);
//    }
//
//    @Override
//    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
//        super.channelClosed(ctx, e);
//    }

}
