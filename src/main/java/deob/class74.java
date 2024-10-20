package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("bf")
public final class class74 {

    @ObfuscatedName("bf.q")
    public RandomAccessFile field1209;

    @ObfuscatedName("bf.d")
    public long field1208;

    @ObfuscatedName("bf.h")
    public long field1207;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1209 = new RandomAccessFile(arg0, arg1);
        this.field1208 = arg2;
        this.field1207 = 0L;
        int var5 = this.field1209.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1209.seek(0L);
            this.field1209.write(var5);
        }
        this.field1209.seek(0L);
    }

    @ObfuscatedName("bf.q(J)V")
    public final void method1403(long arg0) throws IOException {
        this.field1209.seek(arg0);
        this.field1207 = arg0;
    }

    @ObfuscatedName("bf.d([BIIS)V")
    public final void method1404(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1207 + (long) arg2 > this.field1208) {
            this.field1209.seek(this.field1208 + 1L);
            this.field1209.write(1);
            throw new EOFException();
        } else {
            this.field1209.write(arg0, arg1, arg2);
            this.field1207 += (long) arg2;
        }
    }

    @ObfuscatedName("bf.h(S)V")
    public final void method1410() throws IOException {
        if (this.field1209 != null) {
            this.field1209.close();
            this.field1209 = null;
        }
    }

    @ObfuscatedName("bf.p(I)J")
    public final long method1412() throws IOException {
        return this.field1209.length();
    }

    @ObfuscatedName("bf.j([BIII)I")
    public final int method1407(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1209.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1207 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1209 != null) {
            System.out.println("");
            this.method1410();
        }
    }
}
