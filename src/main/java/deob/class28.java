package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ao")
public final class class28 {

    @ObfuscatedName("ao.j")
    public RandomAccessFile field740;

    @ObfuscatedName("ao.y")
    public long field734;

    @ObfuscatedName("ao.x")
    public long field731;

    public class28(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field740 = new RandomAccessFile(arg0, arg1);
        this.field734 = arg2;
        this.field731 = 0L;
        int var5 = this.field740.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field740.seek(0L);
            this.field740.write(var5);
        }
        this.field740.seek(0L);
    }

    @ObfuscatedName("ao.j(J)V")
    public final void method539(long arg0) throws IOException {
        this.field740.seek(arg0);
        this.field731 = arg0;
    }

    @ObfuscatedName("ao.y([BIIB)V")
    public final void method563(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field731 + (long) arg2 > this.field734) {
            this.field740.seek(this.field734 + 1L);
            this.field740.write(1);
            throw new EOFException();
        } else {
            this.field740.write(arg0, arg1, arg2);
            this.field731 += (long) arg2;
        }
    }

    @ObfuscatedName("ao.x(I)V")
    public final void method559() throws IOException {
        if (this.field740 != null) {
            this.field740.close();
            this.field740 = null;
        }
    }

    @ObfuscatedName("ao.z(B)J")
    public final long method543() throws IOException {
        return this.field740.length();
    }

    @ObfuscatedName("ao.c([BIII)I")
    public final int method541(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field740.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field731 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field740 != null) {
            System.out.println("");
            this.method559();
        }
    }
}
