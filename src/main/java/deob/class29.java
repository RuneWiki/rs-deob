package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ap")
public final class class29 {

    @ObfuscatedName("ap.t")
    public RandomAccessFile field776;

    @ObfuscatedName("ap.l")
    public long field773;

    @ObfuscatedName("ap.c")
    public long field772;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field776 = new RandomAccessFile(arg0, arg1);
        this.field773 = arg2;
        this.field772 = 0L;
        int var5 = this.field776.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field776.seek(0L);
            this.field776.write(var5);
        }
        this.field776.seek(0L);
    }

    @ObfuscatedName("ap.t(J)V")
    public final void method566(long arg0) throws IOException {
        this.field776.seek(arg0);
        this.field772 = arg0;
    }

    @ObfuscatedName("ap.l([BIII)V")
    public final void method570(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field772 + (long) arg2 > this.field773) {
            this.field776.seek(this.field773 + 1L);
            this.field776.write(1);
            throw new EOFException();
        } else {
            this.field776.write(arg0, arg1, arg2);
            this.field772 += (long) arg2;
        }
    }

    @ObfuscatedName("ap.c(B)V")
    public final void method567() throws IOException {
        if (this.field776 != null) {
            this.field776.close();
            this.field776 = null;
        }
    }

    @ObfuscatedName("ap.d(I)J")
    public final long method568() throws IOException {
        return this.field776.length();
    }

    @ObfuscatedName("ap.b([BIII)I")
    public final int method569(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field776.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field772 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field776 != null) {
            System.out.println("");
            this.method567();
        }
    }
}
