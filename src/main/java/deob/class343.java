package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("mh")
public final class class343 {

    @ObfuscatedName("mh.z")
    public RandomAccessFile field4061;

    @ObfuscatedName("mh.n")
    public final long field4060;

    @ObfuscatedName("mh.v")
    public long field4062;

    public class343(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4061 = new RandomAccessFile(arg0, arg1);
        this.field4060 = arg2;
        this.field4062 = 0L;
        int var5 = this.field4061.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4061.seek(0L);
            this.field4061.write(var5);
        }
        this.field4061.seek(0L);
    }

    @ObfuscatedName("mh.z(J)V")
    public final void method5979(long arg0) throws IOException {
        this.field4061.seek(arg0);
        this.field4062 = arg0;
    }

    @ObfuscatedName("mh.n([BIII)V")
    public final void method5993(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4062 + (long) arg2 > this.field4060) {
            this.field4061.seek(this.field4060);
            this.field4061.write(1);
            throw new EOFException();
        } else {
            this.field4061.write(arg0, arg1, arg2);
            this.field4062 += (long) arg2;
        }
    }

    @ObfuscatedName("mh.v(I)V")
    public final void method5997() throws IOException {
        this.method5977(false);
    }

    @ObfuscatedName("mh.u(ZI)V")
    public final void method5977(boolean arg0) throws IOException {
        if (this.field4061 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4061.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4061.close();
        this.field4061 = null;
    }

    @ObfuscatedName("mh.r(I)J")
    public final long method5982() throws IOException {
        return this.field4061.length();
    }

    @ObfuscatedName("mh.p([BIII)I")
    public final int method5983(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4061.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4062 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4061 != null) {
            System.out.println("");
            this.method5997();
        }
    }
}
