package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bx")
public final class class74 {

    @ObfuscatedName("bx.f")
    public RandomAccessFile field1215;

    @ObfuscatedName("bx.i")
    public long field1219;

    @ObfuscatedName("bx.u")
    public long field1217;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1215 = new RandomAccessFile(arg0, arg1);
        this.field1219 = arg2;
        this.field1217 = 0L;
        int var5 = this.field1215.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1215.seek(0L);
            this.field1215.write(var5);
        }
        this.field1215.seek(0L);
    }

    @ObfuscatedName("bx.f(J)V")
    public final void method1366(long arg0) throws IOException {
        this.field1215.seek(arg0);
        this.field1217 = arg0;
    }

    @ObfuscatedName("bx.i([BIII)V")
    public final void method1360(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1217 + (long) arg2 > this.field1219) {
            this.field1215.seek(this.field1219 + 1L);
            this.field1215.write(1);
            throw new EOFException();
        } else {
            this.field1215.write(arg0, arg1, arg2);
            this.field1217 += (long) arg2;
        }
    }

    @ObfuscatedName("bx.u(B)V")
    public final void method1361() throws IOException {
        if (this.field1215 != null) {
            this.field1215.close();
            this.field1215 = null;
        }
    }

    @ObfuscatedName("bx.r(I)J")
    public final long method1362() throws IOException {
        return this.field1215.length();
    }

    @ObfuscatedName("bx.o([BIII)I")
    public final int method1363(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1215.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1217 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1215 != null) {
            System.out.println("");
            this.method1361();
        }
    }
}
