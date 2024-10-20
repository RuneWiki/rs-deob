package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gl")
public final class class196 {

    @ObfuscatedName("gl.g")
    public RandomAccessFile field2936;

    @ObfuscatedName("gl.s")
    public long field2937;

    @ObfuscatedName("gl.v")
    public long field2938;

    public class196(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2936 = new RandomAccessFile(arg0, arg1);
        this.field2937 = arg2;
        this.field2938 = 0L;
        int var5 = this.field2936.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2936.seek(0L);
            this.field2936.write(var5);
        }
        this.field2936.seek(0L);
    }

    @ObfuscatedName("gl.g(J)V")
    public final void method3402(long arg0) throws IOException {
        this.field2936.seek(arg0);
        this.field2938 = arg0;
    }

    @ObfuscatedName("gl.s([BIII)V")
    public final void method3401(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2938 + (long) arg2 > this.field2937) {
            this.field2936.seek(this.field2937 + 1L);
            this.field2936.write(1);
            throw new EOFException();
        } else {
            this.field2936.write(arg0, arg1, arg2);
            this.field2938 += (long) arg2;
        }
    }

    @ObfuscatedName("gl.v(I)V")
    public final void method3406() throws IOException {
        if (this.field2936 != null) {
            this.field2936.close();
            this.field2936 = null;
        }
    }

    @ObfuscatedName("gl.o(I)J")
    public final long method3403() throws IOException {
        return this.field2936.length();
    }

    @ObfuscatedName("gl.k([BIIS)I")
    public final int method3399(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2936.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2938 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2936 != null) {
            System.out.println("");
            this.method3406();
        }
    }
}
