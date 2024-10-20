package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("qq")
public final class class449 {

    @ObfuscatedName("qq.h")
    public RandomAccessFile field4847;

    @ObfuscatedName("qq.e")
    public final long field4848;

    @ObfuscatedName("qq.v")
    public long field4849;

    public class449(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4847 = new RandomAccessFile(arg0, arg1);
        this.field4848 = arg2;
        this.field4849 = 0L;
        int var5 = this.field4847.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4847.seek(0L);
            this.field4847.write(var5);
        }
        this.field4847.seek(0L);
    }

    @ObfuscatedName("qq.h(J)V")
    public final void method7561(long arg0) throws IOException {
        this.field4847.seek(arg0);
        this.field4849 = arg0;
    }

    @ObfuscatedName("qq.e([BIII)V")
    public final void method7562(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4849 + (long) arg2 > this.field4848) {
            this.field4847.seek(this.field4848);
            this.field4847.write(1);
            throw new EOFException();
        } else {
            this.field4847.write(arg0, arg1, arg2);
            this.field4849 += (long) arg2;
        }
    }

    @ObfuscatedName("qq.v(I)V")
    public final void method7563() throws IOException {
        this.method7564(false);
    }

    @ObfuscatedName("qq.x(ZB)V")
    public final void method7564(boolean arg0) throws IOException {
        if (this.field4847 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4847.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4847.close();
        this.field4847 = null;
    }

    @ObfuscatedName("qq.m(I)J")
    public final long method7572() throws IOException {
        return this.field4847.length();
    }

    @ObfuscatedName("qq.q([BIII)I")
    public final int method7566(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4847.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4849 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4847 != null) {
            System.out.println("");
            this.method7563();
        }
    }
}
