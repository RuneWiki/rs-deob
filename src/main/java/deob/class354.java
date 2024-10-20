package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("mr")
public final class class354 {

    @ObfuscatedName("mr.f")
    public RandomAccessFile field4098;

    @ObfuscatedName("mr.b")
    public final long field4097;

    @ObfuscatedName("mr.l")
    public long field4099;

    public class354(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4098 = new RandomAccessFile(arg0, arg1);
        this.field4097 = arg2;
        this.field4099 = 0L;
        int var5 = this.field4098.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4098.seek(0L);
            this.field4098.write(var5);
        }
        this.field4098.seek(0L);
    }

    @ObfuscatedName("mr.f(J)V")
    public final void method6179(long arg0) throws IOException {
        this.field4098.seek(arg0);
        this.field4099 = arg0;
    }

    @ObfuscatedName("mr.b([BIII)V")
    public final void method6199(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4099 + (long) arg2 > this.field4097) {
            this.field4098.seek(this.field4097);
            this.field4098.write(1);
            throw new EOFException();
        } else {
            this.field4098.write(arg0, arg1, arg2);
            this.field4099 += (long) arg2;
        }
    }

    @ObfuscatedName("mr.l(I)V")
    public final void method6181() throws IOException {
        this.method6182(false);
    }

    @ObfuscatedName("mr.m(ZI)V")
    public final void method6182(boolean arg0) throws IOException {
        if (this.field4098 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4098.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4098.close();
        this.field4098 = null;
    }

    @ObfuscatedName("mr.z(I)J")
    public final long method6195() throws IOException {
        return this.field4098.length();
    }

    @ObfuscatedName("mr.q([BIIB)I")
    public final int method6190(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4098.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4099 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4098 != null) {
            System.out.println("");
            this.method6181();
        }
    }
}
