package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gb")
public final class class207 {

    @ObfuscatedName("gb.g")
    public RandomAccessFile field2983;

    @ObfuscatedName("gb.j")
    public long field2980;

    @ObfuscatedName("gb.z")
    public long field2981;

    public class207(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2983 = new RandomAccessFile(arg0, arg1);
        this.field2980 = arg2;
        this.field2981 = 0L;
        int var5 = this.field2983.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2983.seek(0L);
            this.field2983.write(var5);
        }
        this.field2983.seek(0L);
    }

    @ObfuscatedName("gb.g(J)V")
    public final void method3435(long arg0) throws IOException {
        this.field2983.seek(arg0);
        this.field2981 = arg0;
    }

    @ObfuscatedName("gb.j([BIIB)V")
    public final void method3436(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2981 + (long) arg2 > this.field2980) {
            this.field2983.seek(this.field2980 + 1L);
            this.field2983.write(1);
            throw new EOFException();
        } else {
            this.field2983.write(arg0, arg1, arg2);
            this.field2981 += (long) arg2;
        }
    }

    @ObfuscatedName("gb.z(I)V")
    public final void method3449() throws IOException {
        if (this.field2983 != null) {
            this.field2983.close();
            this.field2983 = null;
        }
    }

    @ObfuscatedName("gb.b(B)J")
    public final long method3437() throws IOException {
        return this.field2983.length();
    }

    @ObfuscatedName("gb.k([BIII)I")
    public final int method3450(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2983.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2981 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2983 != null) {
            System.out.println("");
            this.method3449();
        }
    }
}
