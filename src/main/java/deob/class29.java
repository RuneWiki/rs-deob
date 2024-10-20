package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ax")
public final class class29 {

    @ObfuscatedName("ax.b")
    public RandomAccessFile field745;

    @ObfuscatedName("ax.e")
    public long field742;

    @ObfuscatedName("ax.g")
    public long field741;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field745 = new RandomAccessFile(arg0, arg1);
        this.field742 = arg2;
        this.field741 = 0L;
        int var5 = this.field745.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field745.seek(0L);
            this.field745.write(var5);
        }
        this.field745.seek(0L);
    }

    @ObfuscatedName("ax.b(J)V")
    public final void method559(long arg0) throws IOException {
        this.field745.seek(arg0);
        this.field741 = arg0;
    }

    @ObfuscatedName("ax.e([BIII)V")
    public final void method545(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field741 + (long) arg2 > this.field742) {
            this.field745.seek(this.field742 + 1L);
            this.field745.write(1);
            throw new EOFException();
        } else {
            this.field745.write(arg0, arg1, arg2);
            this.field741 += (long) arg2;
        }
    }

    @ObfuscatedName("ax.g(I)V")
    public final void method548() throws IOException {
        if (this.field745 != null) {
            this.field745.close();
            this.field745 = null;
        }
    }

    @ObfuscatedName("ax.o(I)J")
    public final long method564() throws IOException {
        return this.field745.length();
    }

    @ObfuscatedName("ax.a([BIII)I")
    public final int method550(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field745.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field741 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field745 != null) {
            System.out.println("");
            this.method548();
        }
    }
}
