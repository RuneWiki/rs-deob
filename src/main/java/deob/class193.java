package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gk")
public final class class193 {

    @ObfuscatedName("gk.z")
    public RandomAccessFile field2918;

    @ObfuscatedName("gk.j")
    public long field2914;

    @ObfuscatedName("gk.a")
    public long field2916;

    public class193(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2918 = new RandomAccessFile(arg0, arg1);
        this.field2914 = arg2;
        this.field2916 = 0L;
        int var5 = this.field2918.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2918.seek(0L);
            this.field2918.write(var5);
        }
        this.field2918.seek(0L);
    }

    @ObfuscatedName("gk.z(J)V")
    public final void method3443(long arg0) throws IOException {
        this.field2918.seek(arg0);
        this.field2916 = arg0;
    }

    @ObfuscatedName("gk.j([BIIB)V")
    public final void method3436(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2916 + (long) arg2 > this.field2914) {
            this.field2918.seek(this.field2914 + 1L);
            this.field2918.write(1);
            throw new EOFException();
        } else {
            this.field2918.write(arg0, arg1, arg2);
            this.field2916 += (long) arg2;
        }
    }

    @ObfuscatedName("gk.a(I)V")
    public final void method3437() throws IOException {
        if (this.field2918 != null) {
            this.field2918.close();
            this.field2918 = null;
        }
    }

    @ObfuscatedName("gk.y(B)J")
    public final long method3454() throws IOException {
        return this.field2918.length();
    }

    @ObfuscatedName("gk.i([BIII)I")
    public final int method3444(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2918.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2916 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2918 != null) {
            System.out.println("");
            this.method3437();
        }
    }
}
