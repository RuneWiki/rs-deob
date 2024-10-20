package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ay")
public final class class29 {

    @ObfuscatedName("ay.a")
    public RandomAccessFile field759;

    @ObfuscatedName("ay.x")
    public long field760;

    @ObfuscatedName("ay.e")
    public long field761;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field759 = new RandomAccessFile(arg0, arg1);
        this.field760 = arg2;
        this.field761 = 0L;
        int var5 = this.field759.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field759.seek(0L);
            this.field759.write(var5);
        }
        this.field759.seek(0L);
    }

    @ObfuscatedName("ay.a(J)V")
    public final void method558(long arg0) throws IOException {
        this.field759.seek(arg0);
        this.field761 = arg0;
    }

    @ObfuscatedName("ay.x([BIII)V")
    public final void method550(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field761 + (long) arg2 > this.field760) {
            this.field759.seek(this.field760 + 1L);
            this.field759.write(1);
            throw new EOFException();
        } else {
            this.field759.write(arg0, arg1, arg2);
            this.field761 += (long) arg2;
        }
    }

    @ObfuscatedName("ay.e(I)V")
    public final void method552() throws IOException {
        if (this.field759 != null) {
            this.field759.close();
            this.field759 = null;
        }
    }

    @ObfuscatedName("ay.r(I)J")
    public final long method553() throws IOException {
        return this.field759.length();
    }

    @ObfuscatedName("ay.p([BIII)I")
    public final int method549(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field759.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field761 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field759 != null) {
            System.out.println("");
            this.method552();
        }
    }
}
