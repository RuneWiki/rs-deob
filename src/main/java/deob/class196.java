package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gz")
public final class class196 {

    @ObfuscatedName("gz.g")
    public RandomAccessFile field2939;

    @ObfuscatedName("gz.s")
    public long field2936;

    @ObfuscatedName("gz.h")
    public long field2937;

    public class196(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2939 = new RandomAccessFile(arg0, arg1);
        this.field2936 = arg2;
        this.field2937 = 0L;
        int var5 = this.field2939.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2939.seek(0L);
            this.field2939.write(var5);
        }
        this.field2939.seek(0L);
    }

    @ObfuscatedName("gz.g(J)V")
    public final void method3420(long arg0) throws IOException {
        this.field2939.seek(arg0);
        this.field2937 = arg0;
    }

    @ObfuscatedName("gz.s([BIIB)V")
    public final void method3426(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2937 + (long) arg2 > this.field2936) {
            this.field2939.seek(this.field2936 + 1L);
            this.field2939.write(1);
            throw new EOFException();
        } else {
            this.field2939.write(arg0, arg1, arg2);
            this.field2937 += (long) arg2;
        }
    }

    @ObfuscatedName("gz.h(B)V")
    public final void method3422() throws IOException {
        if (this.field2939 != null) {
            this.field2939.close();
            this.field2939 = null;
        }
    }

    @ObfuscatedName("gz.m(I)J")
    public final long method3423() throws IOException {
        return this.field2939.length();
    }

    @ObfuscatedName("gz.u([BIII)I")
    public final int method3424(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2939.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2937 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2939 != null) {
            System.out.println("");
            this.method3422();
        }
    }
}
