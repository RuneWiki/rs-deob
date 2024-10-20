package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gp")
public final class class185 {

    @ObfuscatedName("gp.m")
    public RandomAccessFile field2873;

    @ObfuscatedName("gp.k")
    public long field2874;

    @ObfuscatedName("gp.y")
    public long field2872;

    public class185(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2873 = new RandomAccessFile(arg0, arg1);
        this.field2874 = arg2;
        this.field2872 = 0L;
        int var5 = this.field2873.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2873.seek(0L);
            this.field2873.write(var5);
        }
        this.field2873.seek(0L);
    }

    @ObfuscatedName("gp.m(J)V")
    public final void method3349(long arg0) throws IOException {
        this.field2873.seek(arg0);
        this.field2872 = arg0;
    }

    @ObfuscatedName("gp.k([BIIB)V")
    public final void method3350(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2872 + (long) arg2 > this.field2874) {
            this.field2873.seek(this.field2874 + 1L);
            this.field2873.write(1);
            throw new EOFException();
        } else {
            this.field2873.write(arg0, arg1, arg2);
            this.field2872 += (long) arg2;
        }
    }

    @ObfuscatedName("gp.y(B)V")
    public final void method3351() throws IOException {
        if (this.field2873 != null) {
            this.field2873.close();
            this.field2873 = null;
        }
    }

    @ObfuscatedName("gp.g(I)J")
    public final long method3355() throws IOException {
        return this.field2873.length();
    }

    @ObfuscatedName("gp.r([BIIB)I")
    public final int method3353(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2873.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2872 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2873 != null) {
            System.out.println("");
            this.method3351();
        }
    }
}
