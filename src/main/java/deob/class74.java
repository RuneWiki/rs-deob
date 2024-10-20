package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bs")
public final class class74 {

    @ObfuscatedName("bs.n")
    public RandomAccessFile field1188;

    @ObfuscatedName("bs.d")
    public long field1185;

    @ObfuscatedName("bs.m")
    public long field1186;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1188 = new RandomAccessFile(arg0, arg1);
        this.field1185 = arg2;
        this.field1186 = 0L;
        int var5 = this.field1188.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1188.seek(0L);
            this.field1188.write(var5);
        }
        this.field1188.seek(0L);
    }

    @ObfuscatedName("bs.n(J)V")
    public final void method1369(long arg0) throws IOException {
        this.field1188.seek(arg0);
        this.field1186 = arg0;
    }

    @ObfuscatedName("bs.d([BIII)V")
    public final void method1351(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1186 + (long) arg2 > this.field1185) {
            this.field1188.seek(this.field1185 + 1L);
            this.field1188.write(1);
            throw new EOFException();
        } else {
            this.field1188.write(arg0, arg1, arg2);
            this.field1186 += (long) arg2;
        }
    }

    @ObfuscatedName("bs.m(I)V")
    public final void method1352() throws IOException {
        if (this.field1188 != null) {
            this.field1188.close();
            this.field1188 = null;
        }
    }

    @ObfuscatedName("bs.h(B)J")
    public final long method1349() throws IOException {
        return this.field1188.length();
    }

    @ObfuscatedName("bs.w([BIIS)I")
    public final int method1354(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1188.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1186 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1188 != null) {
            System.out.println("");
            this.method1352();
        }
    }
}
