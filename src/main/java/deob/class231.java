package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hz")
public final class class231 {

    @ObfuscatedName("hz.m")
    public RandomAccessFile field3264;

    @ObfuscatedName("hz.w")
    public long field3263;

    @ObfuscatedName("hz.e")
    public long field3265;

    public class231(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3264 = new RandomAccessFile(arg0, arg1);
        this.field3263 = arg2;
        this.field3265 = 0L;
        int var5 = this.field3264.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3264.seek(0L);
            this.field3264.write(var5);
        }
        this.field3264.seek(0L);
    }

    @ObfuscatedName("hz.m(J)V")
    public final void method3937(long arg0) throws IOException {
        this.field3264.seek(arg0);
        this.field3265 = arg0;
    }

    @ObfuscatedName("hz.w([BIIB)V")
    public final void method3938(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3265 + (long) arg2 > this.field3263) {
            this.field3264.seek(this.field3263 + 1L);
            this.field3264.write(1);
            throw new EOFException();
        } else {
            this.field3264.write(arg0, arg1, arg2);
            this.field3265 += (long) arg2;
        }
    }

    @ObfuscatedName("hz.e(I)V")
    public final void method3954() throws IOException {
        if (this.field3264 != null) {
            this.field3264.close();
            this.field3264 = null;
        }
    }

    @ObfuscatedName("hz.o(I)J")
    public final long method3945() throws IOException {
        return this.field3264.length();
    }

    @ObfuscatedName("hz.g([BIII)I")
    public final int method3941(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3264.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3265 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3264 != null) {
            System.out.println("");
            this.method3954();
        }
    }
}
