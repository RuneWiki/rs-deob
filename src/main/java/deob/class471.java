package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("sy")
public final class class471 {

    @ObfuscatedName("sy.af")
    public RandomAccessFile field4924;

    @ObfuscatedName("sy.an")
    public final long field4923;

    @ObfuscatedName("sy.aw")
    public long field4922;

    public class471(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4924 = new RandomAccessFile(arg0, arg1);
        this.field4923 = arg2;
        this.field4922 = 0L;
        int var5 = this.field4924.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4924.seek(0L);
            this.field4924.write(var5);
        }
        this.field4924.seek(0L);
    }

    @ObfuscatedName("sy.af(J)V")
    public final void method8006(long arg0) throws IOException {
        this.field4924.seek(arg0);
        this.field4922 = arg0;
    }

    @ObfuscatedName("sy.an([BIII)V")
    public final void method8023(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4922 + (long) arg2 > this.field4923) {
            this.field4924.seek(this.field4923);
            this.field4924.write(1);
            throw new EOFException();
        } else {
            this.field4924.write(arg0, arg1, arg2);
            this.field4922 += (long) arg2;
        }
    }

    @ObfuscatedName("sy.aw(B)V")
    public final void method8005() throws IOException {
        this.method8009(false);
    }

    @ObfuscatedName("sy.ac(ZB)V")
    public final void method8009(boolean arg0) throws IOException {
        if (this.field4924 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4924.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4924.close();
        this.field4924 = null;
    }

    @ObfuscatedName("sy.au(I)J")
    public final long method8010() throws IOException {
        return this.field4924.length();
    }

    @ObfuscatedName("sy.ab([BIII)I")
    public final int method8011(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4924.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4922 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4924 != null) {
            System.out.println("");
            this.method8005();
        }
    }
}
