package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gs")
public final class class195 {

    @ObfuscatedName("gs.g")
    public RandomAccessFile field2929;

    @ObfuscatedName("gs.v")
    public long field2932;

    @ObfuscatedName("gs.z")
    public long field2931;

    public class195(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2929 = new RandomAccessFile(arg0, arg1);
        this.field2932 = arg2;
        this.field2931 = 0L;
        int var5 = this.field2929.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2929.seek(0L);
            this.field2929.write(var5);
        }
        this.field2929.seek(0L);
    }

    @ObfuscatedName("gs.g(J)V")
    public final void method3428(long arg0) throws IOException {
        this.field2929.seek(arg0);
        this.field2931 = arg0;
    }

    @ObfuscatedName("gs.v([BIII)V")
    public final void method3437(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2931 + (long) arg2 > this.field2932) {
            this.field2929.seek(this.field2932 + 1L);
            this.field2929.write(1);
            throw new EOFException();
        } else {
            this.field2929.write(arg0, arg1, arg2);
            this.field2931 += (long) arg2;
        }
    }

    @ObfuscatedName("gs.z(I)V")
    public final void method3430() throws IOException {
        if (this.field2929 != null) {
            this.field2929.close();
            this.field2929 = null;
        }
    }

    @ObfuscatedName("gs.h(I)J")
    public final long method3431() throws IOException {
        return this.field2929.length();
    }

    @ObfuscatedName("gs.k([BIII)I")
    public final int method3434(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2929.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2931 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2929 != null) {
            System.out.println("");
            this.method3430();
        }
    }
}
