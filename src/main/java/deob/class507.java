package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("to")
public final class class507 {

    @ObfuscatedName("to.at")
    public RandomAccessFile field5034;

    @ObfuscatedName("to.ah")
    public final long field5035;

    @ObfuscatedName("to.ar")
    public long field5037;

    public class507(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5034 = new RandomAccessFile(arg0, arg1);
        this.field5035 = arg2;
        this.field5037 = 0L;
        int var5 = this.field5034.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5034.seek(0L);
            this.field5034.write(var5);
        }
        this.field5034.seek(0L);
    }

    @ObfuscatedName("to.at(J)V")
    public final void method8193(long arg0) throws IOException {
        this.field5034.seek(arg0);
        this.field5037 = arg0;
    }

    @ObfuscatedName("to.ah([BIII)V")
    public final void method8203(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5037 + (long) arg2 > this.field5035) {
            this.field5034.seek(this.field5035);
            this.field5034.write(1);
            throw new EOFException();
        } else {
            this.field5034.write(arg0, arg1, arg2);
            this.field5037 += (long) arg2;
        }
    }

    @ObfuscatedName("to.ar(B)V")
    public final void method8195() throws IOException {
        this.method8196(false);
    }

    @ObfuscatedName("to.ao(ZB)V")
    public final void method8196(boolean arg0) throws IOException {
        if (this.field5034 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5034.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5034.close();
        this.field5034 = null;
    }

    @ObfuscatedName("to.ab(I)J")
    public final long method8214() throws IOException {
        return this.field5034.length();
    }

    @ObfuscatedName("to.au([BIII)I")
    public final int method8198(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5034.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5037 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5034 != null) {
            System.out.println("");
            this.method8195();
        }
    }
}
