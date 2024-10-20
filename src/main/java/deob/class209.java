package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hz")
public final class class209 {

    @ObfuscatedName("hz.p")
    public RandomAccessFile field3000;

    @ObfuscatedName("hz.y")
    public long field3001;

    @ObfuscatedName("hz.d")
    public long field3002;

    public class209(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3000 = new RandomAccessFile(arg0, arg1);
        this.field3001 = arg2;
        this.field3002 = 0L;
        int var5 = this.field3000.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3000.seek(0L);
            this.field3000.write(var5);
        }
        this.field3000.seek(0L);
    }

    @ObfuscatedName("hz.p(J)V")
    public final void method3562(long arg0) throws IOException {
        this.field3000.seek(arg0);
        this.field3002 = arg0;
    }

    @ObfuscatedName("hz.y([BIIB)V")
    public final void method3563(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3002 + (long) arg2 > this.field3001) {
            this.field3000.seek(this.field3001 + 1L);
            this.field3000.write(1);
            throw new EOFException();
        } else {
            this.field3000.write(arg0, arg1, arg2);
            this.field3002 += (long) arg2;
        }
    }

    @ObfuscatedName("hz.d(B)V")
    public final void method3564() throws IOException {
        if (this.field3000 != null) {
            this.field3000.close();
            this.field3000 = null;
        }
    }

    @ObfuscatedName("hz.c(I)J")
    public final long method3565() throws IOException {
        return this.field3000.length();
    }

    @ObfuscatedName("hz.r([BIII)I")
    public final int method3570(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3000.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3002 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3000 != null) {
            System.out.println("");
            this.method3564();
        }
    }
}
