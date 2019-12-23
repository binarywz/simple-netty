package com.simple.netty.buffer;

import com.simple.netty.common.internal.ReferenceCounted;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;

/**
 * Date: 2019-12-14
 * Time: 12:35
 *
 * @author yrw
 */
public abstract class ByteBuf implements ReferenceCounted {

    public abstract int capacity();

    public abstract ByteBuf capacity(int newCapacity);

    public abstract int maxCapacity();

    public abstract ByteBufAllocator alloc();

    public abstract boolean isDirect();


    public abstract int readerIndex();

    public abstract ByteBuf readerIndex(int readerIndex);

    public abstract int writerIndex();

    public abstract ByteBuf writerIndex(int writerIndex);


    public abstract int readableBytes();

    public abstract int writableBytes();

    public abstract boolean isReadable();

    public abstract boolean isReadable(int size);

    public abstract boolean isWritable();

    public abstract boolean isWritable(int size);

    public abstract ByteBuf clear();


    public abstract ByteBuf markReaderIndex();

    public abstract ByteBuf resetReaderIndex();

    public abstract ByteBuf markWriterIndex();

    public abstract ByteBuf resetWriterIndex();


    public abstract boolean getBoolean(int index);

    public abstract byte getByte(int index);

    public abstract short getShort(int index);

    public abstract int getInt(int index);

    public abstract long getLong(int index);

    public abstract char getChar(int index);

    public abstract double getDouble(int index);

    public abstract ByteBuf getBytes(int index, ByteBuf dst);

    public abstract ByteBuf getBytes(int index, ByteBuf dst, int length);

    public abstract ByteBuf getBytes(int index, ByteBuf dst, int dstIndex, int length);

    public abstract ByteBuf getBytes(int index, byte[] dst);

    public abstract ByteBuf getBytes(int index, ByteBuffer dst);

    public abstract ByteBuf getBytes(int index, byte[] dst, int dstIndex, int length);

    public abstract int getBytes(int index, GatheringByteChannel out, int length) throws IOException;

    public abstract int getBytes(int index, FileChannel out, long position, int length) throws IOException;


    public abstract ByteBuf setBytes(int index, byte[] src, int srcIndex, int length);

    public abstract ByteBuf setBytes(int index, ByteBuffer src);


    public abstract boolean readBoolean();

    public abstract byte readByte();

    public abstract short readShort();

    public abstract int readInt();

    public abstract long readLong();

    public abstract char readChar();

    public abstract double readDouble();

    public abstract ByteBuf readBytes(int length);

    public abstract ByteBuf readBytes(ByteBuf dst);

    public abstract ByteBuf readBytes(ByteBuf dst, int length);

    public abstract ByteBuf readBytes(byte[] dst);

    public abstract ByteBuf readBytes(byte[] dst, int dstIndex, int length);

    public abstract ByteBuf readBytes(ByteBuffer dst);

    public abstract int readBytes(GatheringByteChannel out, int length) throws IOException;

    public abstract int readBytes(FileChannel out, long position, int length) throws IOException;


    public abstract ByteBuf writeBoolean(boolean value);

    public abstract ByteBuf writeByte(int value);

    public abstract ByteBuf writeInt(int value);

    public abstract ByteBuf writeShort(int value);

    public abstract ByteBuf writeChar(int value);

    public abstract ByteBuf writeBytes(ByteBuf src);

    public abstract ByteBuf writeBytes(ByteBuf src, int length);

    public abstract ByteBuf writeBytes(byte[] src);

    public abstract ByteBuf writeBytes(byte[] src, int srcIndex, int length);

    public abstract ByteBuf writeBytes(ByteBuffer src);

    public abstract ByteBuf writeBytes(ByteBuf src, int srcIndex, int length);

    boolean isAccessible() {
        return refCnt() != 0;
    }
}