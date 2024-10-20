package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ft")
public class class163 {

    @ObfuscatedName("ft.f")
    public static class117 field2042 = null;

    @ObfuscatedName("ft.i")
    public static class117 field2052 = null;

    @ObfuscatedName("ft.m")
    public static class117 field2055 = null;

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.n(Ljava/io/File;ZB)Z")
    public static boolean method1839(File arg0, boolean arg1) {
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

    @ObfuscatedName("ep.l(I)[B")
    public static byte[] method2864() {
        byte[] var0 = new byte[24];
        try {
            field2042.method2497(0L);
            field2042.method2490(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }
}
