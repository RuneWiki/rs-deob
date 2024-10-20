package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bj")
public final class class74 {

    @ObfuscatedName("bj.u")
    public RandomAccessFile field1186;

    @ObfuscatedName("bj.x")
    public long field1189;

    @ObfuscatedName("bj.i")
    public long field1188;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1186 = new RandomAccessFile(arg0, arg1);
        this.field1189 = arg2;
        this.field1188 = 0L;
        int var5 = this.field1186.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1186.seek(0L);
            this.field1186.write(var5);
        }
        this.field1186.seek(0L);
    }

    @ObfuscatedName("bj.u(J)V")
    public final void method1299(long arg0) throws IOException {
        this.field1186.seek(arg0);
        this.field1188 = arg0;
    }

    @ObfuscatedName("bj.x([BIIB)V")
    public final void method1305(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1188 + (long) arg2 > this.field1189) {
            this.field1186.seek(this.field1189 + 1L);
            this.field1186.write(1);
            throw new EOFException();
        } else {
            this.field1186.write(arg0, arg1, arg2);
            this.field1188 += (long) arg2;
        }
    }

    @ObfuscatedName("bj.i(I)V")
    public final void method1295() throws IOException {
        if (this.field1186 != null) {
            this.field1186.close();
            this.field1186 = null;
        }
    }

    @ObfuscatedName("bj.a(I)J")
    public final long method1297() throws IOException {
        return this.field1186.length();
    }

    @ObfuscatedName("bj.c([BIII)I")
    public final int method1298(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1186.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1188 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1186 != null) {
            System.out.println("");
            this.method1295();
        }
    }
}
