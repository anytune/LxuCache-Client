package com.lzp.protocol;

import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

import java.util.List;

import static io.netty.buffer.Unpooled.wrappedBuffer;

/**
 * Description:
 *
 * @author: Lu ZePing
 * @date: 2020/6/30 17:07
 */
public class LzpProtobufEncoder extends ProtobufEncoder {

    @Override
    protected void encode(ChannelHandlerContext ctx, MessageLiteOrBuilder msg, List<Object> out) {
        out.add(((MessageLite) msg).toByteArray());
    }
}
