package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("tu")
public final class class495 {

    @ObfuscatedName("tu.au")
    public RandomAccessFile field5004;

    @ObfuscatedName("tu.ae")
    public final long field5005;

    @ObfuscatedName("tu.ao")
    public long field5006;

    public class495(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5004 = new RandomAccessFile(arg0, arg1);
        this.field5005 = arg2;
        this.field5006 = 0L;
        int var5 = this.field5004.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5004.seek(0L);
            this.field5004.write(var5);
        }
        this.field5004.seek(0L);
    }

    @ObfuscatedName("tu.au(J)V")
    public final void method8076(long arg0) throws IOException {
        this.field5004.seek(arg0);
        this.field5006 = arg0;
    }

    @ObfuscatedName("tu.ae([BIII)V")
    public final void method8077(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5006 + (long) arg2 > this.field5005) {
            this.field5004.seek(this.field5005);
            this.field5004.write(1);
            throw new EOFException();
        } else {
            this.field5004.write(arg0, arg1, arg2);
            this.field5006 += (long) arg2;
        }
    }

    @ObfuscatedName("tu.ao(I)V")
    public final void method8094() throws IOException {
        this.method8095(false);
    }

    @ObfuscatedName("tu.at(ZB)V")
    public final void method8095(boolean arg0) throws IOException {
        if (this.field5004 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5004.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5004.close();
        this.field5004 = null;
    }

    @ObfuscatedName("tu.ac(I)J")
    public final long method8080() throws IOException {
        return this.field5004.length();
    }

    @ObfuscatedName("tu.ai([BIIB)I")
    public final int method8081(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5004.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5006 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5004 != null) {
            System.out.println("");
            this.method8094();
        }
    }
}
