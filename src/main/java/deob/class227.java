package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hw")
public final class class227 {

    @ObfuscatedName("hw.n")
    public RandomAccessFile field3201;

    @ObfuscatedName("hw.q")
    public long field3200;

    @ObfuscatedName("hw.c")
    public long field3199;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3201 = new RandomAccessFile(arg0, arg1);
        this.field3200 = arg2;
        this.field3199 = 0L;
        int var5 = this.field3201.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3201.seek(0L);
            this.field3201.write(var5);
        }
        this.field3201.seek(0L);
    }

    @ObfuscatedName("hw.n(J)V")
    public final void method3851(long arg0) throws IOException {
        this.field3201.seek(arg0);
        this.field3199 = arg0;
    }

    @ObfuscatedName("hw.q([BIII)V")
    public final void method3856(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3199 + (long) arg2 > this.field3200) {
            this.field3201.seek(this.field3200 + 1L);
            this.field3201.write(1);
            throw new EOFException();
        } else {
            this.field3201.write(arg0, arg1, arg2);
            this.field3199 += (long) arg2;
        }
    }

    @ObfuscatedName("hw.c(I)V")
    public final void method3852() throws IOException {
        if (this.field3201 != null) {
            this.field3201.close();
            this.field3201 = null;
        }
    }

    @ObfuscatedName("hw.l(I)J")
    public final long method3853() throws IOException {
        return this.field3201.length();
    }

    @ObfuscatedName("hw.r([BIII)I")
    public final int method3854(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3201.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3199 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3201 != null) {
            System.out.println("");
            this.method3852();
        }
    }
}
