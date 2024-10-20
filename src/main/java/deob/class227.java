package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hj")
public final class class227 {

    @ObfuscatedName("hj.m")
    public RandomAccessFile field3191;

    @ObfuscatedName("hj.l")
    public long field3190;

    @ObfuscatedName("hj.y")
    public long field3192;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3191 = new RandomAccessFile(arg0, arg1);
        this.field3190 = arg2;
        this.field3192 = 0L;
        int var5 = this.field3191.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3191.seek(0L);
            this.field3191.write(var5);
        }
        this.field3191.seek(0L);
    }

    @ObfuscatedName("hj.m(J)V")
    public final void method3919(long arg0) throws IOException {
        this.field3191.seek(arg0);
        this.field3192 = arg0;
    }

    @ObfuscatedName("hj.l([BIII)V")
    public final void method3920(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3192 + (long) arg2 > this.field3190) {
            this.field3191.seek(this.field3190 + 1L);
            this.field3191.write(1);
            throw new EOFException();
        } else {
            this.field3191.write(arg0, arg1, arg2);
            this.field3192 += (long) arg2;
        }
    }

    @ObfuscatedName("hj.y(I)V")
    public final void method3921() throws IOException {
        if (this.field3191 != null) {
            this.field3191.close();
            this.field3191 = null;
        }
    }

    @ObfuscatedName("hj.u(I)J")
    public final long method3932() throws IOException {
        return this.field3191.length();
    }

    @ObfuscatedName("hj.k([BIII)I")
    public final int method3922(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3191.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3192 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3191 != null) {
            System.out.println("");
            this.method3921();
        }
    }
}
