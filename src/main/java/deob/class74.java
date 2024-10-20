package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bn")
public final class class74 {

    @ObfuscatedName("bn.o")
    public RandomAccessFile field1196;

    @ObfuscatedName("bn.m")
    public long field1195;

    @ObfuscatedName("bn.b")
    public long field1194;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1196 = new RandomAccessFile(arg0, arg1);
        this.field1195 = arg2;
        this.field1194 = 0L;
        int var5 = this.field1196.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1196.seek(0L);
            this.field1196.write(var5);
        }
        this.field1196.seek(0L);
    }

    @ObfuscatedName("bn.o(J)V")
    public final void method1312(long arg0) throws IOException {
        this.field1196.seek(arg0);
        this.field1194 = arg0;
    }

    @ObfuscatedName("bn.m([BIII)V")
    public final void method1311(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1194 + (long) arg2 > this.field1195) {
            this.field1196.seek(this.field1195 + 1L);
            this.field1196.write(1);
            throw new EOFException();
        } else {
            this.field1196.write(arg0, arg1, arg2);
            this.field1194 += (long) arg2;
        }
    }

    @ObfuscatedName("bn.b(I)V")
    public final void method1324() throws IOException {
        if (this.field1196 != null) {
            this.field1196.close();
            this.field1196 = null;
        }
    }

    @ObfuscatedName("bn.g(I)J")
    public final long method1313() throws IOException {
        return this.field1196.length();
    }

    @ObfuscatedName("bn.l([BIIB)I")
    public final int method1315(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1196.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1194 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1196 != null) {
            System.out.println("");
            this.method1324();
        }
    }
}
