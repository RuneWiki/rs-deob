package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gd")
public final class class193 {

    @ObfuscatedName("gd.b")
    public RandomAccessFile field2919;

    @ObfuscatedName("gd.u")
    public long field2917;

    @ObfuscatedName("gd.x")
    public long field2918;

    public class193(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2919 = new RandomAccessFile(arg0, arg1);
        this.field2917 = arg2;
        this.field2918 = 0L;
        int var5 = this.field2919.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2919.seek(0L);
            this.field2919.write(var5);
        }
        this.field2919.seek(0L);
    }

    @ObfuscatedName("gd.b(J)V")
    public final void method3410(long arg0) throws IOException {
        this.field2919.seek(arg0);
        this.field2918 = arg0;
    }

    @ObfuscatedName("gd.u([BIIB)V")
    public final void method3392(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2918 + (long) arg2 > this.field2917) {
            this.field2919.seek(this.field2917 + 1L);
            this.field2919.write(1);
            throw new EOFException();
        } else {
            this.field2919.write(arg0, arg1, arg2);
            this.field2918 += (long) arg2;
        }
    }

    @ObfuscatedName("gd.x(I)V")
    public final void method3399() throws IOException {
        if (this.field2919 != null) {
            this.field2919.close();
            this.field2919 = null;
        }
    }

    @ObfuscatedName("gd.j(B)J")
    public final long method3394() throws IOException {
        return this.field2919.length();
    }

    @ObfuscatedName("gd.o([BIIB)I")
    public final int method3395(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2919.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2918 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2919 != null) {
            System.out.println("");
            this.method3399();
        }
    }
}
