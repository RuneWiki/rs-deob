package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("un")
public final class class537 {

    @ObfuscatedName("un.ap")
    public RandomAccessFile field5352;

    @ObfuscatedName("un.aw")
    public final long field5355;

    @ObfuscatedName("un.ak")
    public long field5351;

    public class537(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5352 = new RandomAccessFile(arg0, arg1);
        this.field5355 = arg2;
        this.field5351 = 0L;
        int var5 = this.field5352.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5352.seek(0L);
            this.field5352.write(var5);
        }
        this.field5352.seek(0L);
    }

    @ObfuscatedName("un.ap(J)V")
    public final void method9028(long arg0) throws IOException {
        this.field5352.seek(arg0);
        this.field5351 = arg0;
    }

    @ObfuscatedName("un.aw([BIII)V")
    public final void method9029(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5351 + (long) arg2 > this.field5355) {
            this.field5352.seek(this.field5355);
            this.field5352.write(1);
            throw new EOFException();
        } else {
            this.field5352.write(arg0, arg1, arg2);
            this.field5351 += (long) arg2;
        }
    }

    @ObfuscatedName("un.ak(I)V")
    public final void method9027() throws IOException {
        this.method9040(false);
    }

    @ObfuscatedName("un.aj(ZB)V")
    public final void method9040(boolean arg0) throws IOException {
        if (this.field5352 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5352.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5352.close();
        this.field5352 = null;
    }

    @ObfuscatedName("un.ai(B)J")
    public final long method9031() throws IOException {
        return this.field5352.length();
    }

    @ObfuscatedName("un.ay([BIII)I")
    public final int method9032(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5352.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5351 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5352 != null) {
            System.out.println("");
            this.method9027();
        }
    }
}
