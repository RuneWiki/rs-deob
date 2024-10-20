package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("by")
public final class class74 {

    @ObfuscatedName("by.b")
    public RandomAccessFile field1202;

    @ObfuscatedName("by.e")
    public long field1201;

    @ObfuscatedName("by.c")
    public long field1204;

    public class74(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1202 = new RandomAccessFile(arg0, arg1);
        this.field1201 = arg2;
        this.field1204 = 0L;
        int var5 = this.field1202.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1202.seek(0L);
            this.field1202.write(var5);
        }
        this.field1202.seek(0L);
    }

    @ObfuscatedName("by.b(J)V")
    public final void method1354(long arg0) throws IOException {
        this.field1202.seek(arg0);
        this.field1204 = arg0;
    }

    @ObfuscatedName("by.e([BIII)V")
    public final void method1368(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1204 + (long) arg2 > this.field1201) {
            this.field1202.seek(this.field1201 + 1L);
            this.field1202.write(1);
            throw new EOFException();
        } else {
            this.field1202.write(arg0, arg1, arg2);
            this.field1204 += (long) arg2;
        }
    }

    @ObfuscatedName("by.c(B)V")
    public final void method1356() throws IOException {
        if (this.field1202 != null) {
            this.field1202.close();
            this.field1202 = null;
        }
    }

    @ObfuscatedName("by.l(B)J")
    public final long method1362() throws IOException {
        return this.field1202.length();
    }

    @ObfuscatedName("by.y([BIII)I")
    public final int method1375(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1202.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1204 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1202 != null) {
            System.out.println("");
            this.method1356();
        }
    }
}
