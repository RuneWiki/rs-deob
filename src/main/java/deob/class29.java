package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("aa")
public final class class29 {

    @ObfuscatedName("aa.i")
    public RandomAccessFile field761;

    @ObfuscatedName("aa.w")
    public long field766;

    @ObfuscatedName("aa.f")
    public long field760;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field761 = new RandomAccessFile(arg0, arg1);
        this.field766 = arg2;
        this.field760 = 0L;
        int var5 = this.field761.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field761.seek(0L);
            this.field761.write(var5);
        }
        this.field761.seek(0L);
    }

    @ObfuscatedName("aa.i(J)V")
    public final void method552(long arg0) throws IOException {
        this.field761.seek(arg0);
        this.field760 = arg0;
    }

    @ObfuscatedName("aa.w([BIII)V")
    public final void method551(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field760 + (long) arg2 > this.field766) {
            this.field761.seek(this.field766 + 1L);
            this.field761.write(1);
            throw new EOFException();
        } else {
            this.field761.write(arg0, arg1, arg2);
            this.field760 += (long) arg2;
        }
    }

    @ObfuscatedName("aa.f(B)V")
    public final void method563() throws IOException {
        if (this.field761 != null) {
            this.field761.close();
            this.field761 = null;
        }
    }

    @ObfuscatedName("aa.e(B)J")
    public final long method555() throws IOException {
        return this.field761.length();
    }

    @ObfuscatedName("aa.t([BIII)I")
    public final int method561(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field761.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field760 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field761 != null) {
            System.out.println("");
            this.method563();
        }
    }
}
