package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("ud")
public final class class530 {

    @ObfuscatedName("ud.ac")
    public RandomAccessFile field5304;

    @ObfuscatedName("ud.ae")
    public final long field5303;

    @ObfuscatedName("ud.ag")
    public long field5305;

    public class530(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5304 = new RandomAccessFile(arg0, arg1);
        this.field5303 = arg2;
        this.field5305 = 0L;
        int var5 = this.field5304.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5304.seek(0L);
            this.field5304.write(var5);
        }
        this.field5304.seek(0L);
    }

    @ObfuscatedName("ud.ac(J)V")
    public final void method8723(long arg0) throws IOException {
        this.field5304.seek(arg0);
        this.field5305 = arg0;
    }

    @ObfuscatedName("ud.ae([BIII)V")
    public final void method8732(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5305 + (long) arg2 > this.field5303) {
            this.field5304.seek(this.field5303);
            this.field5304.write(1);
            throw new EOFException();
        } else {
            this.field5304.write(arg0, arg1, arg2);
            this.field5305 += (long) arg2;
        }
    }

    @ObfuscatedName("ud.ag(B)V")
    public final void method8725() throws IOException {
        this.method8726(false);
    }

    @ObfuscatedName("ud.am(ZB)V")
    public final void method8726(boolean arg0) throws IOException {
        if (this.field5304 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5304.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5304.close();
        this.field5304 = null;
    }

    @ObfuscatedName("ud.ax(I)J")
    public final long method8727() throws IOException {
        return this.field5304.length();
    }

    @ObfuscatedName("ud.aq([BIIB)I")
    public final int method8728(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5304.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5305 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5304 != null) {
            System.out.println("");
            this.method8725();
        }
    }
}
