package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hk")
public final class class227 {

    @ObfuscatedName("hk.j")
    public RandomAccessFile field3210;

    @ObfuscatedName("hk.l")
    public long field3207;

    @ObfuscatedName("hk.a")
    public long field3208;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3210 = new RandomAccessFile(arg0, arg1);
        this.field3207 = arg2;
        this.field3208 = 0L;
        int var5 = this.field3210.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3210.seek(0L);
            this.field3210.write(var5);
        }
        this.field3210.seek(0L);
    }

    @ObfuscatedName("hk.j(J)V")
    public final void method3809(long arg0) throws IOException {
        this.field3210.seek(arg0);
        this.field3208 = arg0;
    }

    @ObfuscatedName("hk.l([BIII)V")
    public final void method3810(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3208 + (long) arg2 > this.field3207) {
            this.field3210.seek(this.field3207 + 1L);
            this.field3210.write(1);
            throw new EOFException();
        } else {
            this.field3210.write(arg0, arg1, arg2);
            this.field3208 += (long) arg2;
        }
    }

    @ObfuscatedName("hk.a(I)V")
    public final void method3818() throws IOException {
        if (this.field3210 != null) {
            this.field3210.close();
            this.field3210 = null;
        }
    }

    @ObfuscatedName("hk.i(I)J")
    public final long method3816() throws IOException {
        return this.field3210.length();
    }

    @ObfuscatedName("hk.f([BIII)I")
    public final int method3817(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3210.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3208 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3210 != null) {
            System.out.println("");
            this.method3818();
        }
    }
}
