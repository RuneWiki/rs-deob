package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hm")
public final class class227 {

    @ObfuscatedName("hm.j")
    public RandomAccessFile field3200;

    @ObfuscatedName("hm.m")
    public long field3198;

    @ObfuscatedName("hm.f")
    public long field3199;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3200 = new RandomAccessFile(arg0, arg1);
        this.field3198 = arg2;
        this.field3199 = 0L;
        int var5 = this.field3200.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3200.seek(0L);
            this.field3200.write(var5);
        }
        this.field3200.seek(0L);
    }

    @ObfuscatedName("hm.j(J)V")
    public final void method3900(long arg0) throws IOException {
        this.field3200.seek(arg0);
        this.field3199 = arg0;
    }

    @ObfuscatedName("hm.m([BIII)V")
    public final void method3912(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3199 + (long) arg2 > this.field3198) {
            this.field3200.seek(this.field3198 + 1L);
            this.field3200.write(1);
            throw new EOFException();
        } else {
            this.field3200.write(arg0, arg1, arg2);
            this.field3199 += (long) arg2;
        }
    }

    @ObfuscatedName("hm.f(B)V")
    public final void method3910() throws IOException {
        if (this.field3200 != null) {
            this.field3200.close();
            this.field3200 = null;
        }
    }

    @ObfuscatedName("hm.l(I)J")
    public final long method3903() throws IOException {
        return this.field3200.length();
    }

    @ObfuscatedName("hm.u([BIIB)I")
    public final int method3904(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3200.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3199 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3200 != null) {
            System.out.println("");
            this.method3910();
        }
    }
}
