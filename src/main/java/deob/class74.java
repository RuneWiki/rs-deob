package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bk")
public final class class74 {

    @ObfuscatedName("bk.p")
    public RandomAccessFile field1195;

    @ObfuscatedName("bk.g")
    public long field1194;

    @ObfuscatedName("bk.x")
    public long field1191;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1195 = new RandomAccessFile(arg0, arg1);
        this.field1194 = arg2;
        this.field1191 = 0L;
        int var5 = this.field1195.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1195.seek(0L);
            this.field1195.write(var5);
        }
        this.field1195.seek(0L);
    }

    @ObfuscatedName("bk.p(J)V")
    public final void method1306(long arg0) throws IOException {
        this.field1195.seek(arg0);
        this.field1191 = arg0;
    }

    @ObfuscatedName("bk.g([BIII)V")
    public final void method1304(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1191 + (long) arg2 > this.field1194) {
            this.field1195.seek(this.field1194 + 1L);
            this.field1195.write(1);
            throw new EOFException();
        } else {
            this.field1195.write(arg0, arg1, arg2);
            this.field1191 += (long) arg2;
        }
    }

    @ObfuscatedName("bk.x(I)V")
    public final void method1305() throws IOException {
        if (this.field1195 != null) {
            this.field1195.close();
            this.field1195 = null;
        }
    }

    @ObfuscatedName("bk.q(I)J")
    public final long method1320() throws IOException {
        return this.field1195.length();
    }

    @ObfuscatedName("bk.d([BIIB)I")
    public final int method1307(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1195.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1191 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1195 != null) {
            System.out.println("");
            this.method1305();
        }
    }
}
