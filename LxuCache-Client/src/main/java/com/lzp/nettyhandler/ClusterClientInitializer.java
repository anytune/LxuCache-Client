package com.lzp.nettyhandler;

import com.lzp.protocol.*;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

/**
 * Description:
 *
 * @author: Lu ZePing
 * @date: 2020/7/1 12:58
 */
public class ClusterClientInitializer extends ChannelInitializer {
    @Override
    protected void initChannel(Channel channel) {
        channel.pipeline().addLast(new LzpMessageDecoder()).addLast(new LzpProtobufDecoder(ResponseDTO.Response.getDefaultInstance()))
                .addLast(new LzpMessageEncoder()).addLast(new LzpProtobufEncoder()).addLast(new ClusterClientHandler());
    }
}
