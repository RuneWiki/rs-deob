package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bf")
public final class class74 {

    @ObfuscatedName("bf.s")
    public RandomAccessFile field1197;

    @ObfuscatedName("bf.c")
    public long field1193;

    @ObfuscatedName("bf.f")
    public long field1194;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1197 = new RandomAccessFile(arg0, arg1);
        this.field1193 = arg2;
        this.field1194 = 0L;
        int var5 = this.field1197.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1197.seek(0L);
            this.field1197.write(var5);
        }
        this.field1197.seek(0L);
    }

    @ObfuscatedName("bf.s(J)V")
    public final void method1302(long arg0) throws IOException {
        this.field1197.seek(arg0);
        this.field1194 = arg0;
    }

    @ObfuscatedName("bf.c([BIII)V")
    public final void method1321(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1194 + (long) arg2 > this.field1193) {
            this.field1197.seek(this.field1193 + 1L);
            this.field1197.write(1);
            throw new EOFException();
        } else {
            this.field1197.write(arg0, arg1, arg2);
            this.field1194 += (long) arg2;
        }
    }

    @ObfuscatedName("bf.f(I)V")
    public final void method1303() throws IOException {
        if (this.field1197 != null) {
            this.field1197.close();
            this.field1197 = null;
        }
    }

    @ObfuscatedName("bf.g(S)J")
    public final long method1304() throws IOException {
        return this.field1197.length();
    }

    @ObfuscatedName("bf.k([BIIB)I")
    public final int method1305(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1197.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1194 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1197 != null) {
            System.out.println("");
            this.method1303();
        }
    }
}
