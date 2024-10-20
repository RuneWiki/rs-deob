package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bu")
public final class class74 {

    @ObfuscatedName("bu.k")
    public RandomAccessFile field1194;

    @ObfuscatedName("bu.y")
    public long field1197;

    @ObfuscatedName("bu.o")
    public long field1195;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1194 = new RandomAccessFile(arg0, arg1);
        this.field1197 = arg2;
        this.field1195 = 0L;
        int var5 = this.field1194.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1194.seek(0L);
            this.field1194.write(var5);
        }
        this.field1194.seek(0L);
    }

    @ObfuscatedName("bu.k(J)V")
    public final void method1331(long arg0) throws IOException {
        this.field1194.seek(arg0);
        this.field1195 = arg0;
    }

    @ObfuscatedName("bu.y([BIIB)V")
    public final void method1332(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1195 + (long) arg2 > this.field1197) {
            this.field1194.seek(this.field1197 + 1L);
            this.field1194.write(1);
            throw new EOFException();
        } else {
            this.field1194.write(arg0, arg1, arg2);
            this.field1195 += (long) arg2;
        }
    }

    @ObfuscatedName("bu.o(I)V")
    public final void method1333() throws IOException {
        if (this.field1194 != null) {
            this.field1194.close();
            this.field1194 = null;
        }
    }

    @ObfuscatedName("bu.r(I)J")
    public final long method1334() throws IOException {
        return this.field1194.length();
    }

    @ObfuscatedName("bu.w([BIIB)I")
    public final int method1335(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1194.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1195 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1194 != null) {
            System.out.println("");
            this.method1333();
        }
    }
}
