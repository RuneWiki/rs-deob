package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("at")
public final class class28 {

    @ObfuscatedName("at.p")
    public RandomAccessFile field754;

    @ObfuscatedName("at.j")
    public long field752;

    @ObfuscatedName("at.w")
    public long field753;

    public class28(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field754 = new RandomAccessFile(arg0, arg1);
        this.field752 = arg2;
        this.field753 = 0L;
        int var5 = this.field754.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field754.seek(0L);
            this.field754.write(var5);
        }
        this.field754.seek(0L);
    }

    @ObfuscatedName("at.p(J)V")
    public final void method526(long arg0) throws IOException {
        this.field754.seek(arg0);
        this.field753 = arg0;
    }

    @ObfuscatedName("at.j([BIII)V")
    public final void method508(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field753 + (long) arg2 > this.field752) {
            this.field754.seek(this.field752 + 1L);
            this.field754.write(1);
            throw new EOFException();
        } else {
            this.field754.write(arg0, arg1, arg2);
            this.field753 += (long) arg2;
        }
    }

    @ObfuscatedName("at.w(I)V")
    public final void method509() throws IOException {
        if (this.field754 != null) {
            this.field754.close();
            this.field754 = null;
        }
    }

    @ObfuscatedName("at.h(I)J")
    public final long method521() throws IOException {
        return this.field754.length();
    }

    @ObfuscatedName("at.v([BIII)I")
    public final int method510(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field754.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field753 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field754 != null) {
            System.out.println("");
            this.method509();
        }
    }
}
