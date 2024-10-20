package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("aq")
public final class class29 {

    @ObfuscatedName("aq.i")
    public RandomAccessFile field764;

    @ObfuscatedName("aq.p")
    public long field760;

    @ObfuscatedName("aq.a")
    public long field761;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field764 = new RandomAccessFile(arg0, arg1);
        this.field760 = arg2;
        this.field761 = 0L;
        int var5 = this.field764.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field764.seek(0L);
            this.field764.write(var5);
        }
        this.field764.seek(0L);
    }

    @ObfuscatedName("aq.i(J)V")
    public final void method549(long arg0) throws IOException {
        this.field764.seek(arg0);
        this.field761 = arg0;
    }

    @ObfuscatedName("aq.p([BIIB)V")
    public final void method550(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field761 + (long) arg2 > this.field760) {
            this.field764.seek(this.field760 + 1L);
            this.field764.write(1);
            throw new EOFException();
        } else {
            this.field764.write(arg0, arg1, arg2);
            this.field761 += (long) arg2;
        }
    }

    @ObfuscatedName("aq.a(I)V")
    public final void method548() throws IOException {
        if (this.field764 != null) {
            this.field764.close();
            this.field764 = null;
        }
    }

    @ObfuscatedName("aq.l(I)J")
    public final long method552() throws IOException {
        return this.field764.length();
    }

    @ObfuscatedName("aq.q([BIII)I")
    public final int method553(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field764.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field761 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field764 != null) {
            System.out.println("");
            this.method548();
        }
    }
}
