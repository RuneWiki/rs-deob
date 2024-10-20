package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hq")
public final class class218 {

    @ObfuscatedName("hq.p")
    public RandomAccessFile field3114;

    @ObfuscatedName("hq.k")
    public long field3115;

    @ObfuscatedName("hq.e")
    public long field3116;

    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3114 = new RandomAccessFile(arg0, arg1);
        this.field3115 = arg2;
        this.field3116 = 0L;
        int var5 = this.field3114.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3114.seek(0L);
            this.field3114.write(var5);
        }
        this.field3114.seek(0L);
    }

    @ObfuscatedName("hq.p(J)V")
    public final void method3724(long arg0) throws IOException {
        this.field3114.seek(arg0);
        this.field3116 = arg0;
    }

    @ObfuscatedName("hq.k([BIII)V")
    public final void method3719(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3116 + (long) arg2 > this.field3115) {
            this.field3114.seek(this.field3115 + 1L);
            this.field3114.write(1);
            throw new EOFException();
        } else {
            this.field3114.write(arg0, arg1, arg2);
            this.field3116 += (long) arg2;
        }
    }

    @ObfuscatedName("hq.e(I)V")
    public final void method3720() throws IOException {
        if (this.field3114 != null) {
            this.field3114.close();
            this.field3114 = null;
        }
    }

    @ObfuscatedName("hq.f(I)J")
    public final long method3721() throws IOException {
        return this.field3114.length();
    }

    @ObfuscatedName("hq.w([BIII)I")
    public final int method3731(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3114.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3116 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3114 != null) {
            System.out.println("");
            this.method3720();
        }
    }
}
