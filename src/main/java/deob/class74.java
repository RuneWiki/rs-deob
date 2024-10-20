package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ba")
public final class class74 {

    @ObfuscatedName("ba.d")
    public RandomAccessFile field1177;

    @ObfuscatedName("ba.c")
    public long field1178;

    @ObfuscatedName("ba.n")
    public long field1176;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1177 = new RandomAccessFile(arg0, arg1);
        this.field1178 = arg2;
        this.field1176 = 0L;
        int var5 = this.field1177.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1177.seek(0L);
            this.field1177.write(var5);
        }
        this.field1177.seek(0L);
    }

    @ObfuscatedName("ba.d(J)V")
    public final void method1338(long arg0) throws IOException {
        this.field1177.seek(arg0);
        this.field1176 = arg0;
    }

    @ObfuscatedName("ba.c([BIII)V")
    public final void method1339(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1176 + (long) arg2 > this.field1178) {
            this.field1177.seek(this.field1178 + 1L);
            this.field1177.write(1);
            throw new EOFException();
        } else {
            this.field1177.write(arg0, arg1, arg2);
            this.field1176 += (long) arg2;
        }
    }

    @ObfuscatedName("ba.n(I)V")
    public final void method1340() throws IOException {
        if (this.field1177 != null) {
            this.field1177.close();
            this.field1177 = null;
        }
    }

    @ObfuscatedName("ba.q(I)J")
    public final long method1353() throws IOException {
        return this.field1177.length();
    }

    @ObfuscatedName("ba.t([BIII)I")
    public final int method1342(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1177.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1176 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1177 != null) {
            System.out.println("");
            this.method1340();
        }
    }
}
