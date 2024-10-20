package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hl")
public final class class231 {

    @ObfuscatedName("hl.l")
    public RandomAccessFile field3258;

    @ObfuscatedName("hl.g")
    public long field3261;

    @ObfuscatedName("hl.r")
    public long field3259;

    public class231(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3258 = new RandomAccessFile(arg0, arg1);
        this.field3261 = arg2;
        this.field3259 = 0L;
        int var5 = this.field3258.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3258.seek(0L);
            this.field3258.write(var5);
        }
        this.field3258.seek(0L);
    }

    @ObfuscatedName("hl.l(J)V")
    public final void method4012(long arg0) throws IOException {
        this.field3258.seek(arg0);
        this.field3259 = arg0;
    }

    @ObfuscatedName("hl.g([BIII)V")
    public final void method4016(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3259 + (long) arg2 > this.field3261) {
            this.field3258.seek(this.field3261 + 1L);
            this.field3258.write(1);
            throw new EOFException();
        } else {
            this.field3258.write(arg0, arg1, arg2);
            this.field3259 += (long) arg2;
        }
    }

    @ObfuscatedName("hl.r(I)V")
    public final void method4024() throws IOException {
        if (this.field3258 != null) {
            this.field3258.close();
            this.field3258 = null;
        }
    }

    @ObfuscatedName("hl.e(I)J")
    public final long method4014() throws IOException {
        return this.field3258.length();
    }

    @ObfuscatedName("hl.h([BIIS)I")
    public final int method4015(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3258.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3259 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3258 != null) {
            System.out.println("");
            this.method4024();
        }
    }
}
