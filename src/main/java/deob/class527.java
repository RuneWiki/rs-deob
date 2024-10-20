package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("us")
public final class class527 {

    @ObfuscatedName("us.aq")
    public RandomAccessFile field5264;

    @ObfuscatedName("us.ad")
    public final long field5263;

    @ObfuscatedName("us.ag")
    public long field5262;

    public class527(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5264 = new RandomAccessFile(arg0, arg1);
        this.field5263 = arg2;
        this.field5262 = 0L;
        int var5 = this.field5264.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5264.seek(0L);
            this.field5264.write(var5);
        }
        this.field5264.seek(0L);
    }

    @ObfuscatedName("us.aq(J)V")
    public final void method8504(long arg0) throws IOException {
        this.field5264.seek(arg0);
        this.field5262 = arg0;
    }

    @ObfuscatedName("us.ad([BIII)V")
    public final void method8511(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5262 + (long) arg2 > this.field5263) {
            this.field5264.seek(this.field5263);
            this.field5264.write(1);
            throw new EOFException();
        } else {
            this.field5264.write(arg0, arg1, arg2);
            this.field5262 += (long) arg2;
        }
    }

    @ObfuscatedName("us.ag(B)V")
    public final void method8506() throws IOException {
        this.method8507(false);
    }

    @ObfuscatedName("us.ak(ZB)V")
    public final void method8507(boolean arg0) throws IOException {
        if (this.field5264 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5264.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5264.close();
        this.field5264 = null;
    }

    @ObfuscatedName("us.ap(I)J")
    public final long method8508() throws IOException {
        return this.field5264.length();
    }

    @ObfuscatedName("us.an([BIII)I")
    public final int method8524(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5264.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5262 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5264 != null) {
            System.out.println("");
            this.method8506();
        }
    }
}
