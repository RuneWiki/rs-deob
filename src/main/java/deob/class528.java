package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("um")
public final class class528 {

    @ObfuscatedName("um.ab")
    public RandomAccessFile field5267;

    @ObfuscatedName("um.ay")
    public final long field5266;

    @ObfuscatedName("um.an")
    public long field5268;

    public class528(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5267 = new RandomAccessFile(arg0, arg1);
        this.field5266 = arg2;
        this.field5268 = 0L;
        int var5 = this.field5267.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5267.seek(0L);
            this.field5267.write(var5);
        }
        this.field5267.seek(0L);
    }

    @ObfuscatedName("um.ab(J)V")
    public final void method8579(long arg0) throws IOException {
        this.field5267.seek(arg0);
        this.field5268 = arg0;
    }

    @ObfuscatedName("um.ay([BIII)V")
    public final void method8588(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5268 + (long) arg2 > this.field5266) {
            this.field5267.seek(this.field5266);
            this.field5267.write(1);
            throw new EOFException();
        } else {
            this.field5267.write(arg0, arg1, arg2);
            this.field5268 += (long) arg2;
        }
    }

    @ObfuscatedName("um.an(I)V")
    public final void method8576() throws IOException {
        this.method8577(false);
    }

    @ObfuscatedName("um.au(ZI)V")
    public final void method8577(boolean arg0) throws IOException {
        if (this.field5267 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5267.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5267.close();
        this.field5267 = null;
    }

    @ObfuscatedName("um.ax(B)J")
    public final long method8578() throws IOException {
        return this.field5267.length();
    }

    @ObfuscatedName("um.ao([BIII)I")
    public final int method8594(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5267.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5268 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5267 != null) {
            System.out.println("");
            this.method8576();
        }
    }
}
