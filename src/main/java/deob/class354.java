package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("mc")
public final class class354 {

    @ObfuscatedName("mc.n")
    public RandomAccessFile field4099;

    @ObfuscatedName("mc.v")
    public final long field4103;

    @ObfuscatedName("mc.d")
    public long field4100;

    public class354(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4099 = new RandomAccessFile(arg0, arg1);
        this.field4103 = arg2;
        this.field4100 = 0L;
        int var5 = this.field4099.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4099.seek(0L);
            this.field4099.write(var5);
        }
        this.field4099.seek(0L);
    }

    @ObfuscatedName("mc.n(J)V")
    public final void method6280(long arg0) throws IOException {
        this.field4099.seek(arg0);
        this.field4100 = arg0;
    }

    @ObfuscatedName("mc.v([BIII)V")
    public final void method6266(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4100 + (long) arg2 > this.field4103) {
            this.field4099.seek(this.field4103);
            this.field4099.write(1);
            throw new EOFException();
        } else {
            this.field4099.write(arg0, arg1, arg2);
            this.field4100 += (long) arg2;
        }
    }

    @ObfuscatedName("mc.d(B)V")
    public final void method6267() throws IOException {
        this.method6268(false);
    }

    @ObfuscatedName("mc.c(ZB)V")
    public final void method6268(boolean arg0) throws IOException {
        if (this.field4099 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4099.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4099.close();
        this.field4099 = null;
    }

    @ObfuscatedName("mc.y(B)J")
    public final long method6272() throws IOException {
        return this.field4099.length();
    }

    @ObfuscatedName("mc.h([BIII)I")
    public final int method6269(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4099.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4100 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4099 != null) {
            System.out.println("");
            this.method6267();
        }
    }
}
