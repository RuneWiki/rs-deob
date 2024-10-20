package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ao")
public final class class29 {

    @ObfuscatedName("ao.q")
    public RandomAccessFile field754;

    @ObfuscatedName("ao.c")
    public long field749;

    @ObfuscatedName("ao.p")
    public long field750;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field754 = new RandomAccessFile(arg0, arg1);
        this.field749 = arg2;
        this.field750 = 0L;
        int var5 = this.field754.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field754.seek(0L);
            this.field754.write(var5);
        }
        this.field754.seek(0L);
    }

    @ObfuscatedName("ao.q(J)V")
    public final void method559(long arg0) throws IOException {
        this.field754.seek(arg0);
        this.field750 = arg0;
    }

    @ObfuscatedName("ao.c([BIII)V")
    public final void method550(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field750 + (long) arg2 > this.field749) {
            this.field754.seek(this.field749 + 1L);
            this.field754.write(1);
            throw new EOFException();
        } else {
            this.field754.write(arg0, arg1, arg2);
            this.field750 += (long) arg2;
        }
    }

    @ObfuscatedName("ao.p(I)V")
    public final void method539() throws IOException {
        if (this.field754 != null) {
            this.field754.close();
            this.field754 = null;
        }
    }

    @ObfuscatedName("ao.z(I)J")
    public final long method540() throws IOException {
        return this.field754.length();
    }

    @ObfuscatedName("ao.m([BIII)I")
    public final int method538(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field754.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field750 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field754 != null) {
            System.out.println("");
            this.method539();
        }
    }
}
