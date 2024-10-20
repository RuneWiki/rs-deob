package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gl")
public final class class192 {

    @ObfuscatedName("gl.y")
    public RandomAccessFile field2889;

    @ObfuscatedName("gl.u")
    public long field2887;

    @ObfuscatedName("gl.k")
    public long field2888;

    public class192(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2889 = new RandomAccessFile(arg0, arg1);
        this.field2887 = arg2;
        this.field2888 = 0L;
        int var5 = this.field2889.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2889.seek(0L);
            this.field2889.write(var5);
        }
        this.field2889.seek(0L);
    }

    @ObfuscatedName("gl.y(J)V")
    public final void method3380(long arg0) throws IOException {
        this.field2889.seek(arg0);
        this.field2888 = arg0;
    }

    @ObfuscatedName("gl.u([BIII)V")
    public final void method3386(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2888 + (long) arg2 > this.field2887) {
            this.field2889.seek(this.field2887 + 1L);
            this.field2889.write(1);
            throw new EOFException();
        } else {
            this.field2889.write(arg0, arg1, arg2);
            this.field2888 += (long) arg2;
        }
    }

    @ObfuscatedName("gl.k(I)V")
    public final void method3381() throws IOException {
        if (this.field2889 != null) {
            this.field2889.close();
            this.field2889 = null;
        }
    }

    @ObfuscatedName("gl.v(B)J")
    public final long method3382() throws IOException {
        return this.field2889.length();
    }

    @ObfuscatedName("gl.l([BIII)I")
    public final int method3383(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2889.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2888 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2889 != null) {
            System.out.println("");
            this.method3381();
        }
    }
}
