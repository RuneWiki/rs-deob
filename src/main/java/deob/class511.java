package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("tt")
public final class class511 {

    @ObfuscatedName("tt.am")
    public RandomAccessFile field5079;

    @ObfuscatedName("tt.ap")
    public final long field5078;

    @ObfuscatedName("tt.af")
    public long field5080;

    public class511(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5079 = new RandomAccessFile(arg0, arg1);
        this.field5078 = arg2;
        this.field5080 = 0L;
        int var5 = this.field5079.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5079.seek(0L);
            this.field5079.write(var5);
        }
        this.field5079.seek(0L);
    }

    @ObfuscatedName("tt.am(J)V")
    public final void method8372(long arg0) throws IOException {
        this.field5079.seek(arg0);
        this.field5080 = arg0;
    }

    @ObfuscatedName("tt.ap([BIII)V")
    public final void method8348(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5080 + (long) arg2 > this.field5078) {
            this.field5079.seek(this.field5078);
            this.field5079.write(1);
            throw new EOFException();
        } else {
            this.field5079.write(arg0, arg1, arg2);
            this.field5080 += (long) arg2;
        }
    }

    @ObfuscatedName("tt.af(B)V")
    public final void method8352() throws IOException {
        this.method8362(false);
    }

    @ObfuscatedName("tt.aj(ZI)V")
    public final void method8362(boolean arg0) throws IOException {
        if (this.field5079 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5079.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5079.close();
        this.field5079 = null;
    }

    @ObfuscatedName("tt.aq(B)J")
    public final long method8350() throws IOException {
        return this.field5079.length();
    }

    @ObfuscatedName("tt.ar([BIII)I")
    public final int method8351(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5079.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5080 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5079 != null) {
            System.out.println("");
            this.method8352();
        }
    }
}
