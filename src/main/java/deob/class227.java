package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hq")
public final class class227 {

    @ObfuscatedName("hq.y")
    public RandomAccessFile field3190;

    @ObfuscatedName("hq.d")
    public long field3189;

    @ObfuscatedName("hq.g")
    public long field3191;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3190 = new RandomAccessFile(arg0, arg1);
        this.field3189 = arg2;
        this.field3191 = 0L;
        int var5 = this.field3190.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3190.seek(0L);
            this.field3190.write(var5);
        }
        this.field3190.seek(0L);
    }

    @ObfuscatedName("hq.y(J)V")
    public final void method3799(long arg0) throws IOException {
        this.field3190.seek(arg0);
        this.field3191 = arg0;
    }

    @ObfuscatedName("hq.d([BIII)V")
    public final void method3791(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3191 + (long) arg2 > this.field3189) {
            this.field3190.seek(this.field3189 + 1L);
            this.field3190.write(1);
            throw new EOFException();
        } else {
            this.field3190.write(arg0, arg1, arg2);
            this.field3191 += (long) arg2;
        }
    }

    @ObfuscatedName("hq.g(I)V")
    public final void method3788() throws IOException {
        if (this.field3190 != null) {
            this.field3190.close();
            this.field3190 = null;
        }
    }

    @ObfuscatedName("hq.w(I)J")
    public final long method3792() throws IOException {
        return this.field3190.length();
    }

    @ObfuscatedName("hq.e([BIII)I")
    public final int method3793(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3190.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3191 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3190 != null) {
            System.out.println("");
            this.method3788();
        }
    }
}
