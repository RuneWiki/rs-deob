package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("at")
public final class class29 {

    @ObfuscatedName("at.g")
    public RandomAccessFile field755;

    @ObfuscatedName("at.h")
    public long field758;

    @ObfuscatedName("at.s")
    public long field756;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field755 = new RandomAccessFile(arg0, arg1);
        this.field758 = arg2;
        this.field756 = 0L;
        int var5 = this.field755.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field755.seek(0L);
            this.field755.write(var5);
        }
        this.field755.seek(0L);
    }

    @ObfuscatedName("at.g(J)V")
    public final void method551(long arg0) throws IOException {
        this.field755.seek(arg0);
        this.field756 = arg0;
    }

    @ObfuscatedName("at.h([BIII)V")
    public final void method552(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field756 + (long) arg2 > this.field758) {
            this.field755.seek(this.field758 + 1L);
            this.field755.write(1);
            throw new EOFException();
        } else {
            this.field755.write(arg0, arg1, arg2);
            this.field756 += (long) arg2;
        }
    }

    @ObfuscatedName("at.s(I)V")
    public final void method574() throws IOException {
        if (this.field755 != null) {
            this.field755.close();
            this.field755 = null;
        }
    }

    @ObfuscatedName("at.o(B)J")
    public final long method558() throws IOException {
        return this.field755.length();
    }

    @ObfuscatedName("at.p([BIII)I")
    public final int method555(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field755.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field756 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field755 != null) {
            System.out.println("");
            this.method574();
        }
    }
}
