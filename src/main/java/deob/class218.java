package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hg")
public final class class218 {

    @ObfuscatedName("hg.y")
    public RandomAccessFile field3117;

    @ObfuscatedName("hg.k")
    public long field3114;

    @ObfuscatedName("hg.g")
    public long field3115;

    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3117 = new RandomAccessFile(arg0, arg1);
        this.field3114 = arg2;
        this.field3115 = 0L;
        int var5 = this.field3117.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3117.seek(0L);
            this.field3117.write(var5);
        }
        this.field3117.seek(0L);
    }

    @ObfuscatedName("hg.y(J)V")
    public final void method3700(long arg0) throws IOException {
        this.field3117.seek(arg0);
        this.field3115 = arg0;
    }

    @ObfuscatedName("hg.k([BIII)V")
    public final void method3701(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3115 + (long) arg2 > this.field3114) {
            this.field3117.seek(this.field3114 + 1L);
            this.field3117.write(1);
            throw new EOFException();
        } else {
            this.field3117.write(arg0, arg1, arg2);
            this.field3115 += (long) arg2;
        }
    }

    @ObfuscatedName("hg.g(I)V")
    public final void method3705() throws IOException {
        if (this.field3117 != null) {
            this.field3117.close();
            this.field3117 = null;
        }
    }

    @ObfuscatedName("hg.n(I)J")
    public final long method3703() throws IOException {
        return this.field3117.length();
    }

    @ObfuscatedName("hg.t([BIII)I")
    public final int method3704(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3117.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3115 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3117 != null) {
            System.out.println("");
            this.method3705();
        }
    }
}
