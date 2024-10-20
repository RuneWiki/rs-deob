package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bp")
public final class class74 {

    @ObfuscatedName("bp.x")
    public RandomAccessFile field1211;

    @ObfuscatedName("bp.n")
    public long field1208;

    @ObfuscatedName("bp.g")
    public long field1210;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1211 = new RandomAccessFile(arg0, arg1);
        this.field1208 = arg2;
        this.field1210 = 0L;
        int var5 = this.field1211.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1211.seek(0L);
            this.field1211.write(var5);
        }
        this.field1211.seek(0L);
    }

    @ObfuscatedName("bp.x(J)V")
    public final void method1408(long arg0) throws IOException {
        this.field1211.seek(arg0);
        this.field1210 = arg0;
    }

    @ObfuscatedName("bp.n([BIII)V")
    public final void method1417(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1210 + (long) arg2 > this.field1208) {
            this.field1211.seek(this.field1208 + 1L);
            this.field1211.write(1);
            throw new EOFException();
        } else {
            this.field1211.write(arg0, arg1, arg2);
            this.field1210 += (long) arg2;
        }
    }

    @ObfuscatedName("bp.g(B)V")
    public final void method1410() throws IOException {
        if (this.field1211 != null) {
            this.field1211.close();
            this.field1211 = null;
        }
    }

    @ObfuscatedName("bp.v(I)J")
    public final long method1411() throws IOException {
        return this.field1211.length();
    }

    @ObfuscatedName("bp.y([BIII)I")
    public final int method1412(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1211.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1210 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1211 != null) {
            System.out.println("");
            this.method1410();
        }
    }
}
