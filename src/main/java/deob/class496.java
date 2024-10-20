package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("tn")
public final class class496 {

    @ObfuscatedName("tn.aw")
    public RandomAccessFile field5002;

    @ObfuscatedName("tn.ay")
    public final long field5003;

    @ObfuscatedName("tn.ar")
    public long field5001;

    public class496(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5002 = new RandomAccessFile(arg0, arg1);
        this.field5003 = arg2;
        this.field5001 = 0L;
        int var5 = this.field5002.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5002.seek(0L);
            this.field5002.write(var5);
        }
        this.field5002.seek(0L);
    }

    @ObfuscatedName("tn.aw(J)V")
    public final void method8017(long arg0) throws IOException {
        this.field5002.seek(arg0);
        this.field5001 = arg0;
    }

    @ObfuscatedName("tn.ay([BIII)V")
    public final void method8019(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5001 + (long) arg2 > this.field5003) {
            this.field5002.seek(this.field5003);
            this.field5002.write(1);
            throw new EOFException();
        } else {
            this.field5002.write(arg0, arg1, arg2);
            this.field5001 += (long) arg2;
        }
    }

    @ObfuscatedName("tn.ar(I)V")
    public final void method8020() throws IOException {
        this.method8033(false);
    }

    @ObfuscatedName("tn.am(ZI)V")
    public final void method8033(boolean arg0) throws IOException {
        if (this.field5002 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5002.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5002.close();
        this.field5002 = null;
    }

    @ObfuscatedName("tn.as(I)J")
    public final long method8022() throws IOException {
        return this.field5002.length();
    }

    @ObfuscatedName("tn.aj([BIII)I")
    public final int method8024(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5002.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5001 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5002 != null) {
            System.out.println("");
            this.method8020();
        }
    }
}
