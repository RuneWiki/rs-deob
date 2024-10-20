package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("am")
public final class class29 {

    @ObfuscatedName("am.p")
    public RandomAccessFile field742;

    @ObfuscatedName("am.e")
    public long field745;

    @ObfuscatedName("am.a")
    public long field741;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field742 = new RandomAccessFile(arg0, arg1);
        this.field745 = arg2;
        this.field741 = 0L;
        int var5 = this.field742.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field742.seek(0L);
            this.field742.write(var5);
        }
        this.field742.seek(0L);
    }

    @ObfuscatedName("am.p(J)V")
    public final void method560(long arg0) throws IOException {
        this.field742.seek(arg0);
        this.field741 = arg0;
    }

    @ObfuscatedName("am.e([BIII)V")
    public final void method561(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field741 + (long) arg2 > this.field745) {
            this.field742.seek(this.field745 + 1L);
            this.field742.write(1);
            throw new EOFException();
        } else {
            this.field742.write(arg0, arg1, arg2);
            this.field741 += (long) arg2;
        }
    }

    @ObfuscatedName("am.a(I)V")
    public final void method559() throws IOException {
        if (this.field742 != null) {
            this.field742.close();
            this.field742 = null;
        }
    }

    @ObfuscatedName("am.h(I)J")
    public final long method583() throws IOException {
        return this.field742.length();
    }

    @ObfuscatedName("am.y([BIII)I")
    public final int method578(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field742.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field741 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field742 != null) {
            System.out.println("");
            this.method559();
        }
    }
}
