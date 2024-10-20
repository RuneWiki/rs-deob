package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hv")
public final class class227 {

    @ObfuscatedName("hv.d")
    public RandomAccessFile field3198;

    @ObfuscatedName("hv.p")
    public long field3199;

    @ObfuscatedName("hv.v")
    public long field3200;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3198 = new RandomAccessFile(arg0, arg1);
        this.field3199 = arg2;
        this.field3200 = 0L;
        int var5 = this.field3198.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3198.seek(0L);
            this.field3198.write(var5);
        }
        this.field3198.seek(0L);
    }

    @ObfuscatedName("hv.d(J)V")
    public final void method3909(long arg0) throws IOException {
        this.field3198.seek(arg0);
        this.field3200 = arg0;
    }

    @ObfuscatedName("hv.p([BIII)V")
    public final void method3931(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3200 + (long) arg2 > this.field3199) {
            this.field3198.seek(this.field3199 + 1L);
            this.field3198.write(1);
            throw new EOFException();
        } else {
            this.field3198.write(arg0, arg1, arg2);
            this.field3200 += (long) arg2;
        }
    }

    @ObfuscatedName("hv.v(I)V")
    public final void method3927() throws IOException {
        if (this.field3198 != null) {
            this.field3198.close();
            this.field3198 = null;
        }
    }

    @ObfuscatedName("hv.l(I)J")
    public final long method3912() throws IOException {
        return this.field3198.length();
    }

    @ObfuscatedName("hv.y([BIII)I")
    public final int method3910(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3198.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3200 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3198 != null) {
            System.out.println("");
            this.method3927();
        }
    }
}
