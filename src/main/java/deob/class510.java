package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("to")
public final class class510 {

    @ObfuscatedName("to.ac")
    public RandomAccessFile field5046;

    @ObfuscatedName("to.al")
    public final long field5045;

    @ObfuscatedName("to.ak")
    public long field5044;

    public class510(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5046 = new RandomAccessFile(arg0, arg1);
        this.field5045 = arg2;
        this.field5044 = 0L;
        int var5 = this.field5046.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5046.seek(0L);
            this.field5046.write(var5);
        }
        this.field5046.seek(0L);
    }

    @ObfuscatedName("to.ac(J)V")
    public final void method8121(long arg0) throws IOException {
        this.field5046.seek(arg0);
        this.field5044 = arg0;
    }

    @ObfuscatedName("to.al([BIII)V")
    public final void method8122(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5044 + (long) arg2 > this.field5045) {
            this.field5046.seek(this.field5045);
            this.field5046.write(1);
            throw new EOFException();
        } else {
            this.field5046.write(arg0, arg1, arg2);
            this.field5044 += (long) arg2;
        }
    }

    @ObfuscatedName("to.ak(I)V")
    public final void method8123() throws IOException {
        this.method8124(false);
    }

    @ObfuscatedName("to.ax(ZB)V")
    public final void method8124(boolean arg0) throws IOException {
        if (this.field5046 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5046.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5046.close();
        this.field5046 = null;
    }

    @ObfuscatedName("to.ao(B)J")
    public final long method8125() throws IOException {
        return this.field5046.length();
    }

    @ObfuscatedName("to.ah([BIII)I")
    public final int method8147(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5046.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5044 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5046 != null) {
            System.out.println("");
            this.method8123();
        }
    }
}
