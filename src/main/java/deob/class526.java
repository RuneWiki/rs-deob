package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("ue")
public final class class526 {

    @ObfuscatedName("ue.ak")
    public RandomAccessFile field5237;

    @ObfuscatedName("ue.al")
    public final long field5239;

    @ObfuscatedName("ue.aj")
    public long field5238;

    public class526(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5237 = new RandomAccessFile(arg0, arg1);
        this.field5239 = arg2;
        this.field5238 = 0L;
        int var5 = this.field5237.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5237.seek(0L);
            this.field5237.write(var5);
        }
        this.field5237.seek(0L);
    }

    @ObfuscatedName("ue.ak(J)V")
    public final void method8561(long arg0) throws IOException {
        this.field5237.seek(arg0);
        this.field5238 = arg0;
    }

    @ObfuscatedName("ue.al([BIII)V")
    public final void method8562(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5238 + (long) arg2 > this.field5239) {
            this.field5237.seek(this.field5239);
            this.field5237.write(1);
            throw new EOFException();
        } else {
            this.field5237.write(arg0, arg1, arg2);
            this.field5238 += (long) arg2;
        }
    }

    @ObfuscatedName("ue.aj(B)V")
    public final void method8566() throws IOException {
        this.method8563(false);
    }

    @ObfuscatedName("ue.az(ZI)V")
    public final void method8563(boolean arg0) throws IOException {
        if (this.field5237 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5237.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5237.close();
        this.field5237 = null;
    }

    @ObfuscatedName("ue.af(I)J")
    public final long method8568() throws IOException {
        return this.field5237.length();
    }

    @ObfuscatedName("ue.aa([BIIB)I")
    public final int method8576(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5237.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5238 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5237 != null) {
            System.out.println("");
            this.method8566();
        }
    }
}
