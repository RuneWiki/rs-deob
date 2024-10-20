package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hd")
public final class class221 {

    @ObfuscatedName("hd.j")
    public RandomAccessFile field3140;

    @ObfuscatedName("hd.y")
    public long field3139;

    @ObfuscatedName("hd.z")
    public long field3141;

    public class221(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3140 = new RandomAccessFile(arg0, arg1);
        this.field3139 = arg2;
        this.field3141 = 0L;
        int var5 = this.field3140.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3140.seek(0L);
            this.field3140.write(var5);
        }
        this.field3140.seek(0L);
    }

    @ObfuscatedName("hd.j(J)V")
    public final void method3750(long arg0) throws IOException {
        this.field3140.seek(arg0);
        this.field3141 = arg0;
    }

    @ObfuscatedName("hd.y([BIII)V")
    public final void method3752(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3141 + (long) arg2 > this.field3139) {
            this.field3140.seek(this.field3139 + 1L);
            this.field3140.write(1);
            throw new EOFException();
        } else {
            this.field3140.write(arg0, arg1, arg2);
            this.field3141 += (long) arg2;
        }
    }

    @ObfuscatedName("hd.z(B)V")
    public final void method3767() throws IOException {
        if (this.field3140 != null) {
            this.field3140.close();
            this.field3140 = null;
        }
    }

    @ObfuscatedName("hd.l(I)J")
    public final long method3762() throws IOException {
        return this.field3140.length();
    }

    @ObfuscatedName("hd.w([BIII)I")
    public final int method3755(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3140.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3141 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3140 != null) {
            System.out.println("");
            this.method3767();
        }
    }
}
