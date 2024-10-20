package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hh")
public final class class218 {

    @ObfuscatedName("hh.n")
    public RandomAccessFile field3108;

    @ObfuscatedName("hh.d")
    public long field3107;

    @ObfuscatedName("hh.z")
    public long field3109;

    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3108 = new RandomAccessFile(arg0, arg1);
        this.field3107 = arg2;
        this.field3109 = 0L;
        int var5 = this.field3108.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3108.seek(0L);
            this.field3108.write(var5);
        }
        this.field3108.seek(0L);
    }

    @ObfuscatedName("hh.n(J)V")
    public final void method3737(long arg0) throws IOException {
        this.field3108.seek(arg0);
        this.field3109 = arg0;
    }

    @ObfuscatedName("hh.d([BIIB)V")
    public final void method3739(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3109 + (long) arg2 > this.field3107) {
            this.field3108.seek(this.field3107 + 1L);
            this.field3108.write(1);
            throw new EOFException();
        } else {
            this.field3108.write(arg0, arg1, arg2);
            this.field3109 += (long) arg2;
        }
    }

    @ObfuscatedName("hh.z(I)V")
    public final void method3740() throws IOException {
        if (this.field3108 != null) {
            this.field3108.close();
            this.field3108 = null;
        }
    }

    @ObfuscatedName("hh.y(I)J")
    public final long method3741() throws IOException {
        return this.field3108.length();
    }

    @ObfuscatedName("hh.e([BIII)I")
    public final int method3755(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3108.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3109 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3108 != null) {
            System.out.println("");
            this.method3740();
        }
    }
}
