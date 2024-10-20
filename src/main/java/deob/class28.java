package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ai")
public final class class28 {

    @ObfuscatedName("ai.g")
    public RandomAccessFile field742;

    @ObfuscatedName("ai.e")
    public long field741;

    @ObfuscatedName("ai.n")
    public long field743;

    public class28(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field742 = new RandomAccessFile(arg0, arg1);
        this.field741 = arg2;
        this.field743 = 0L;
        int var5 = this.field742.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field742.seek(0L);
            this.field742.write(var5);
        }
        this.field742.seek(0L);
    }

    @ObfuscatedName("ai.g(J)V")
    public final void method562(long arg0) throws IOException {
        this.field742.seek(arg0);
        this.field743 = arg0;
    }

    @ObfuscatedName("ai.e([BIII)V")
    public final void method560(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field743 + (long) arg2 > this.field741) {
            this.field742.seek(this.field741 + 1L);
            this.field742.write(1);
            throw new EOFException();
        } else {
            this.field742.write(arg0, arg1, arg2);
            this.field743 += (long) arg2;
        }
    }

    @ObfuscatedName("ai.n(I)V")
    public final void method555() throws IOException {
        if (this.field742 != null) {
            this.field742.close();
            this.field742 = null;
        }
    }

    @ObfuscatedName("ai.j(I)J")
    public final long method558() throws IOException {
        return this.field742.length();
    }

    @ObfuscatedName("ai.i([BIIS)I")
    public final int method556(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field742.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field743 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field742 != null) {
            System.out.println("");
            this.method555();
        }
    }
}
