package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hg")
public final class class227 {

    @ObfuscatedName("hg.l")
    public RandomAccessFile field3202;

    @ObfuscatedName("hg.e")
    public long field3201;

    @ObfuscatedName("hg.q")
    public long field3203;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3202 = new RandomAccessFile(arg0, arg1);
        this.field3201 = arg2;
        this.field3203 = 0L;
        int var5 = this.field3202.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3202.seek(0L);
            this.field3202.write(var5);
        }
        this.field3202.seek(0L);
    }

    @ObfuscatedName("hg.l(J)V")
    public final void method3813(long arg0) throws IOException {
        this.field3202.seek(arg0);
        this.field3203 = arg0;
    }

    @ObfuscatedName("hg.e([BIII)V")
    public final void method3829(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3203 + (long) arg2 > this.field3201) {
            this.field3202.seek(this.field3201 + 1L);
            this.field3202.write(1);
            throw new EOFException();
        } else {
            this.field3202.write(arg0, arg1, arg2);
            this.field3203 += (long) arg2;
        }
    }

    @ObfuscatedName("hg.q(B)V")
    public final void method3817() throws IOException {
        if (this.field3202 != null) {
            this.field3202.close();
            this.field3202 = null;
        }
    }

    @ObfuscatedName("hg.o(I)J")
    public final long method3816() throws IOException {
        return this.field3202.length();
    }

    @ObfuscatedName("hg.g([BIII)I")
    public final int method3812(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3202.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3203 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3202 != null) {
            System.out.println("");
            this.method3817();
        }
    }
}
