package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("tf")
public final class class514 {

    @ObfuscatedName("tf.aq")
    public RandomAccessFile field5099;

    @ObfuscatedName("tf.aw")
    public final long field5098;

    @ObfuscatedName("tf.al")
    public long field5100;

    public class514(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5099 = new RandomAccessFile(arg0, arg1);
        this.field5098 = arg2;
        this.field5100 = 0L;
        int var5 = this.field5099.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5099.seek(0L);
            this.field5099.write(var5);
        }
        this.field5099.seek(0L);
    }

    @ObfuscatedName("tf.aq(J)V")
    public final void method8358(long arg0) throws IOException {
        this.field5099.seek(arg0);
        this.field5100 = arg0;
    }

    @ObfuscatedName("tf.aw([BIIB)V")
    public final void method8359(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5100 + (long) arg2 > this.field5098) {
            this.field5099.seek(this.field5098);
            this.field5099.write(1);
            throw new EOFException();
        } else {
            this.field5099.write(arg0, arg1, arg2);
            this.field5100 += (long) arg2;
        }
    }

    @ObfuscatedName("tf.al(I)V")
    public final void method8360() throws IOException {
        this.method8361(false);
    }

    @ObfuscatedName("tf.ai(ZB)V")
    public final void method8361(boolean arg0) throws IOException {
        if (this.field5099 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5099.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5099.close();
        this.field5099 = null;
    }

    @ObfuscatedName("tf.ar(B)J")
    public final long method8362() throws IOException {
        return this.field5099.length();
    }

    @ObfuscatedName("tf.as([BIII)I")
    public final int method8363(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5099.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5100 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5099 != null) {
            System.out.println("");
            this.method8360();
        }
    }
}
