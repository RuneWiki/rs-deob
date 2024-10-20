package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gz")
public final class class195 {

    @ObfuscatedName("gz.k")
    public RandomAccessFile field2931;

    @ObfuscatedName("gz.r")
    public long field2929;

    @ObfuscatedName("gz.y")
    public long field2930;

    public class195(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2931 = new RandomAccessFile(arg0, arg1);
        this.field2929 = arg2;
        this.field2930 = 0L;
        int var5 = this.field2931.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2931.seek(0L);
            this.field2931.write(var5);
        }
        this.field2931.seek(0L);
    }

    @ObfuscatedName("gz.k(J)V")
    public final void method3408(long arg0) throws IOException {
        this.field2931.seek(arg0);
        this.field2930 = arg0;
    }

    @ObfuscatedName("gz.r([BIII)V")
    public final void method3409(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2930 + (long) arg2 > this.field2929) {
            this.field2931.seek(this.field2929 + 1L);
            this.field2931.write(1);
            throw new EOFException();
        } else {
            this.field2931.write(arg0, arg1, arg2);
            this.field2930 += (long) arg2;
        }
    }

    @ObfuscatedName("gz.y(B)V")
    public final void method3422() throws IOException {
        if (this.field2931 != null) {
            this.field2931.close();
            this.field2931 = null;
        }
    }

    @ObfuscatedName("gz.w(S)J")
    public final long method3415() throws IOException {
        return this.field2931.length();
    }

    @ObfuscatedName("gz.m([BIII)I")
    public final int method3412(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2931.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2930 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2931 != null) {
            System.out.println("");
            this.method3422();
        }
    }
}
