package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bz")
public final class class74 {

    @ObfuscatedName("bz.b")
    public RandomAccessFile field1177;

    @ObfuscatedName("bz.l")
    public long field1181;

    @ObfuscatedName("bz.i")
    public long field1176;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1177 = new RandomAccessFile(arg0, arg1);
        this.field1181 = arg2;
        this.field1176 = 0L;
        int var5 = this.field1177.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1177.seek(0L);
            this.field1177.write(var5);
        }
        this.field1177.seek(0L);
    }

    @ObfuscatedName("bz.b(J)V")
    public final void method1390(long arg0) throws IOException {
        this.field1177.seek(arg0);
        this.field1176 = arg0;
    }

    @ObfuscatedName("bz.l([BIIB)V")
    public final void method1391(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1176 + (long) arg2 > this.field1181) {
            this.field1177.seek(this.field1181 + 1L);
            this.field1177.write(1);
            throw new EOFException();
        } else {
            this.field1177.write(arg0, arg1, arg2);
            this.field1176 += (long) arg2;
        }
    }

    @ObfuscatedName("bz.i(I)V")
    public final void method1394() throws IOException {
        if (this.field1177 != null) {
            this.field1177.close();
            this.field1177 = null;
        }
    }

    @ObfuscatedName("bz.t(I)J")
    public final long method1393() throws IOException {
        return this.field1177.length();
    }

    @ObfuscatedName("bz.k([BIII)I")
    public final int method1392(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1177.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1176 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1177 != null) {
            System.out.println("");
            this.method1394();
        }
    }
}
