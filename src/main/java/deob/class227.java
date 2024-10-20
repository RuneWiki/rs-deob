package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hs")
public final class class227 {

    @ObfuscatedName("hs.v")
    public RandomAccessFile field3209;

    @ObfuscatedName("hs.f")
    public long field3208;

    @ObfuscatedName("hs.i")
    public long field3207;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3209 = new RandomAccessFile(arg0, arg1);
        this.field3208 = arg2;
        this.field3207 = 0L;
        int var5 = this.field3209.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3209.seek(0L);
            this.field3209.write(var5);
        }
        this.field3209.seek(0L);
    }

    @ObfuscatedName("hs.v(J)V")
    public final void method3849(long arg0) throws IOException {
        this.field3209.seek(arg0);
        this.field3207 = arg0;
    }

    @ObfuscatedName("hs.f([BIII)V")
    public final void method3839(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3207 + (long) arg2 > this.field3208) {
            this.field3209.seek(this.field3208 + 1L);
            this.field3209.write(1);
            throw new EOFException();
        } else {
            this.field3209.write(arg0, arg1, arg2);
            this.field3207 += (long) arg2;
        }
    }

    @ObfuscatedName("hs.i(B)V")
    public final void method3848() throws IOException {
        if (this.field3209 != null) {
            this.field3209.close();
            this.field3209 = null;
        }
    }

    @ObfuscatedName("hs.d(B)J")
    public final long method3840() throws IOException {
        return this.field3209.length();
    }

    @ObfuscatedName("hs.o([BIIB)I")
    public final int method3841(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3209.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3207 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3209 != null) {
            System.out.println("");
            this.method3848();
        }
    }
}
