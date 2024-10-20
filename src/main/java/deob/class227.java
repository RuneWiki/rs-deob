package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hb")
public final class class227 {

    @ObfuscatedName("hb.o")
    public RandomAccessFile field3199;

    @ObfuscatedName("hb.e")
    public long field3200;

    @ObfuscatedName("hb.u")
    public long field3201;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3199 = new RandomAccessFile(arg0, arg1);
        this.field3200 = arg2;
        this.field3201 = 0L;
        int var5 = this.field3199.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3199.seek(0L);
            this.field3199.write(var5);
        }
        this.field3199.seek(0L);
    }

    @ObfuscatedName("hb.o(J)V")
    public final void method3882(long arg0) throws IOException {
        this.field3199.seek(arg0);
        this.field3201 = arg0;
    }

    @ObfuscatedName("hb.e([BIII)V")
    public final void method3865(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3201 + (long) arg2 > this.field3200) {
            this.field3199.seek(this.field3200 + 1L);
            this.field3199.write(1);
            throw new EOFException();
        } else {
            this.field3199.write(arg0, arg1, arg2);
            this.field3201 += (long) arg2;
        }
    }

    @ObfuscatedName("hb.u(B)V")
    public final void method3866() throws IOException {
        if (this.field3199 != null) {
            this.field3199.close();
            this.field3199 = null;
        }
    }

    @ObfuscatedName("hb.b(I)J")
    public final long method3867() throws IOException {
        return this.field3199.length();
    }

    @ObfuscatedName("hb.p([BIII)I")
    public final int method3864(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3199.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3201 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3199 != null) {
            System.out.println("");
            this.method3866();
        }
    }
}
