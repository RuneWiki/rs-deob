package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ah")
public final class class29 {

    @ObfuscatedName("ah.p")
    public RandomAccessFile field730;

    @ObfuscatedName("ah.l")
    public long field739;

    @ObfuscatedName("ah.d")
    public long field729;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field730 = new RandomAccessFile(arg0, arg1);
        this.field739 = arg2;
        this.field729 = 0L;
        int var5 = this.field730.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field730.seek(0L);
            this.field730.write(var5);
        }
        this.field730.seek(0L);
    }

    @ObfuscatedName("ah.p(J)V")
    public final void method550(long arg0) throws IOException {
        this.field730.seek(arg0);
        this.field729 = arg0;
    }

    @ObfuscatedName("ah.l([BIII)V")
    public final void method551(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field729 + (long) arg2 > this.field739) {
            this.field730.seek(this.field739 + 1L);
            this.field730.write(1);
            throw new EOFException();
        } else {
            this.field730.write(arg0, arg1, arg2);
            this.field729 += (long) arg2;
        }
    }

    @ObfuscatedName("ah.d(B)V")
    public final void method556() throws IOException {
        if (this.field730 != null) {
            this.field730.close();
            this.field730 = null;
        }
    }

    @ObfuscatedName("ah.x(I)J")
    public final long method553() throws IOException {
        return this.field730.length();
    }

    @ObfuscatedName("ah.o([BIII)I")
    public final int method554(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field730.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field729 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field730 != null) {
            System.out.println("");
            this.method556();
        }
    }
}
