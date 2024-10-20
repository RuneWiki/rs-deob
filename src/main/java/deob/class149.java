package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("em")
public class class149 {

    @ObfuscatedName("em.h")
    public static class228 field2221 = null;

    @ObfuscatedName("em.e")
    public static class228 field2230 = null;

    @ObfuscatedName("em.v")
    public static class228 field2224 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.n(Ljava/io/File;ZI)Z")
    public static boolean method2282(File arg0, boolean arg1) {
        try {
            RandomAccessFile var2 = new RandomAccessFile(arg0, "rw");
            int var3 = var2.read();
            var2.seek(0L);
            var2.write(var3);
            var2.seek(0L);
            var2.close();
            if (arg1) {
                arg0.delete();
            }
            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    @ObfuscatedName("aj.c(Ldc;I)V")
    public static void method663(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2221.method3870(0L);
            field2221.method3874(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var5) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2355(var1, 0, 24);
    }
}
