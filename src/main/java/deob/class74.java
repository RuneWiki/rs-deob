package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bz")
public final class class74 {

    @ObfuscatedName("bz.i")
    public RandomAccessFile field1194;

    @ObfuscatedName("bz.e")
    public long field1198;

    @ObfuscatedName("bz.f")
    public long field1195;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1194 = new RandomAccessFile(arg0, arg1);
        this.field1198 = arg2;
        this.field1195 = 0L;
        int var5 = this.field1194.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1194.seek(0L);
            this.field1194.write(var5);
        }
        this.field1194.seek(0L);
    }

    @ObfuscatedName("bz.i(J)V")
    public final void method1313(long arg0) throws IOException {
        this.field1194.seek(arg0);
        this.field1195 = arg0;
    }

    @ObfuscatedName("bz.e([BIIB)V")
    public final void method1310(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1195 + (long) arg2 > this.field1198) {
            this.field1194.seek(this.field1198 + 1L);
            this.field1194.write(1);
            throw new EOFException();
        } else {
            this.field1194.write(arg0, arg1, arg2);
            this.field1195 += (long) arg2;
        }
    }

    @ObfuscatedName("bz.f(I)V")
    public final void method1311() throws IOException {
        if (this.field1194 != null) {
            this.field1194.close();
            this.field1194 = null;
        }
    }

    @ObfuscatedName("bz.k(I)J")
    public final long method1312() throws IOException {
        return this.field1194.length();
    }

    @ObfuscatedName("bz.a([BIIB)I")
    public final int method1314(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1194.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1195 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1194 != null) {
            System.out.println("");
            this.method1311();
        }
    }
}
