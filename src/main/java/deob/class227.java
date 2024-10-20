package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hv")
public final class class227 {

    @ObfuscatedName("hv.c")
    public RandomAccessFile field3190;

    @ObfuscatedName("hv.h")
    public long field3193;

    @ObfuscatedName("hv.k")
    public long field3189;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3190 = new RandomAccessFile(arg0, arg1);
        this.field3193 = arg2;
        this.field3189 = 0L;
        int var5 = this.field3190.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3190.seek(0L);
            this.field3190.write(var5);
        }
        this.field3190.seek(0L);
    }

    @ObfuscatedName("hv.c(J)V")
    public final void method3823(long arg0) throws IOException {
        this.field3190.seek(arg0);
        this.field3189 = arg0;
    }

    @ObfuscatedName("hv.h([BIII)V")
    public final void method3832(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3189 + (long) arg2 > this.field3193) {
            this.field3190.seek(this.field3193 + 1L);
            this.field3190.write(1);
            throw new EOFException();
        } else {
            this.field3190.write(arg0, arg1, arg2);
            this.field3189 += (long) arg2;
        }
    }

    @ObfuscatedName("hv.k(I)V")
    public final void method3826() throws IOException {
        if (this.field3190 != null) {
            this.field3190.close();
            this.field3190 = null;
        }
    }

    @ObfuscatedName("hv.t(I)J")
    public final long method3824() throws IOException {
        return this.field3190.length();
    }

    @ObfuscatedName("hv.g([BIII)I")
    public final int method3827(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3190.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3189 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3190 != null) {
            System.out.println("");
            this.method3826();
        }
    }
}
