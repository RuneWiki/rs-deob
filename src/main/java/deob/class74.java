package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bz")
public final class class74 {

    @ObfuscatedName("bz.x")
    public RandomAccessFile field1206;

    @ObfuscatedName("bz.j")
    public long field1199;

    @ObfuscatedName("bz.c")
    public long field1200;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1206 = new RandomAccessFile(arg0, arg1);
        this.field1199 = arg2;
        this.field1200 = 0L;
        int var5 = this.field1206.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1206.seek(0L);
            this.field1206.write(var5);
        }
        this.field1206.seek(0L);
    }

    @ObfuscatedName("bz.x(J)V")
    public final void method1392(long arg0) throws IOException {
        this.field1206.seek(arg0);
        this.field1200 = arg0;
    }

    @ObfuscatedName("bz.j([BIII)V")
    public final void method1396(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1200 + (long) arg2 > this.field1199) {
            this.field1206.seek(this.field1199 + 1L);
            this.field1206.write(1);
            throw new EOFException();
        } else {
            this.field1206.write(arg0, arg1, arg2);
            this.field1200 += (long) arg2;
        }
    }

    @ObfuscatedName("bz.c(B)V")
    public final void method1394() throws IOException {
        if (this.field1206 != null) {
            this.field1206.close();
            this.field1206 = null;
        }
    }

    @ObfuscatedName("bz.d(B)J")
    public final long method1395() throws IOException {
        return this.field1206.length();
    }

    @ObfuscatedName("bz.w([BIII)I")
    public final int method1391(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1206.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1200 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1206 != null) {
            System.out.println("");
            this.method1394();
        }
    }
}
