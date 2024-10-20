package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ha")
public final class class228 {

    @ObfuscatedName("ha.t")
    public RandomAccessFile field3216;

    @ObfuscatedName("ha.i")
    public long field3217;

    @ObfuscatedName("ha.g")
    public long field3218;

    public class228(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3216 = new RandomAccessFile(arg0, arg1);
        this.field3217 = arg2;
        this.field3218 = 0L;
        int var5 = this.field3216.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3216.seek(0L);
            this.field3216.write(var5);
        }
        this.field3216.seek(0L);
    }

    @ObfuscatedName("ha.t(J)V")
    public final void method3801(long arg0) throws IOException {
        this.field3216.seek(arg0);
        this.field3218 = arg0;
    }

    @ObfuscatedName("ha.i([BIII)V")
    public final void method3802(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3218 + (long) arg2 > this.field3217) {
            this.field3216.seek(this.field3217 + 1L);
            this.field3216.write(1);
            throw new EOFException();
        } else {
            this.field3216.write(arg0, arg1, arg2);
            this.field3218 += (long) arg2;
        }
    }

    @ObfuscatedName("ha.g(I)V")
    public final void method3803() throws IOException {
        if (this.field3216 != null) {
            this.field3216.close();
            this.field3216 = null;
        }
    }

    @ObfuscatedName("ha.h(I)J")
    public final long method3804() throws IOException {
        return this.field3216.length();
    }

    @ObfuscatedName("ha.z([BIIB)I")
    public final int method3815(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3216.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3218 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3216 != null) {
            System.out.println("");
            this.method3803();
        }
    }
}
