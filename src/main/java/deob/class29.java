package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ah")
public final class class29 {

    @ObfuscatedName("ah.j")
    public RandomAccessFile field747;

    @ObfuscatedName("ah.f")
    public long field746;

    @ObfuscatedName("ah.o")
    public long field748;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field747 = new RandomAccessFile(arg0, arg1);
        this.field746 = arg2;
        this.field748 = 0L;
        int var5 = this.field747.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field747.seek(0L);
            this.field747.write(var5);
        }
        this.field747.seek(0L);
    }

    @ObfuscatedName("ah.j(J)V")
    public final void method569(long arg0) throws IOException {
        this.field747.seek(arg0);
        this.field748 = arg0;
    }

    @ObfuscatedName("ah.f([BIIB)V")
    public final void method570(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field748 + (long) arg2 > this.field746) {
            this.field747.seek(this.field746 + 1L);
            this.field747.write(1);
            throw new EOFException();
        } else {
            this.field747.write(arg0, arg1, arg2);
            this.field748 += (long) arg2;
        }
    }

    @ObfuscatedName("ah.o(B)V")
    public final void method589() throws IOException {
        if (this.field747 != null) {
            this.field747.close();
            this.field747 = null;
        }
    }

    @ObfuscatedName("ah.h(I)J")
    public final long method588() throws IOException {
        return this.field747.length();
    }

    @ObfuscatedName("ah.u([BIIB)I")
    public final int method573(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field747.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field748 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field747 != null) {
            System.out.println("");
            this.method589();
        }
    }
}
