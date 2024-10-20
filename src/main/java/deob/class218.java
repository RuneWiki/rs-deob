package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hk")
public final class class218 {

    @ObfuscatedName("hk.o")
    public RandomAccessFile field3110;

    @ObfuscatedName("hk.l")
    public long field3108;

    @ObfuscatedName("hk.g")
    public long field3109;

    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3110 = new RandomAccessFile(arg0, arg1);
        this.field3108 = arg2;
        this.field3109 = 0L;
        int var5 = this.field3110.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3110.seek(0L);
            this.field3110.write(var5);
        }
        this.field3110.seek(0L);
    }

    @ObfuscatedName("hk.o(J)V")
    public final void method3739(long arg0) throws IOException {
        this.field3110.seek(arg0);
        this.field3109 = arg0;
    }

    @ObfuscatedName("hk.l([BIII)V")
    public final void method3740(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3109 + (long) arg2 > this.field3108) {
            this.field3110.seek(this.field3108 + 1L);
            this.field3110.write(1);
            throw new EOFException();
        } else {
            this.field3110.write(arg0, arg1, arg2);
            this.field3109 += (long) arg2;
        }
    }

    @ObfuscatedName("hk.g(B)V")
    public final void method3741() throws IOException {
        if (this.field3110 != null) {
            this.field3110.close();
            this.field3110 = null;
        }
    }

    @ObfuscatedName("hk.u(I)J")
    public final long method3742() throws IOException {
        return this.field3110.length();
    }

    @ObfuscatedName("hk.q([BIII)I")
    public final int method3758(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3110.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3109 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3110 != null) {
            System.out.println("");
            this.method3741();
        }
    }
}
