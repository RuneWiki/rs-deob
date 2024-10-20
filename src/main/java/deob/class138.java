package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ez")
public class class138 {

    @ObfuscatedName("ez.k")
    public static class208 field2089 = null;

    @ObfuscatedName("ez.q")
    public static class208 field2090 = null;

    @ObfuscatedName("ez.b")
    public static class208 field2091 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.x(Ljava/io/File;ZI)Z")
    public static boolean method2691(File arg0, boolean arg1) {
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

    @ObfuscatedName("am.v(Ljava/lang/String;Ljava/lang/String;ZB)Lgl;")
    public static class207 method603(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2086, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class207(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1908 == 33) {
            var6 = "_rc";
        } else if (Statics.field1908 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2413, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class207(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class207(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cc.e(Ldm;I)V")
    public static void method1881(class108 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2089.method3576(0L);
            field2089.method3578(var1);
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
        arg0.method2312(var1, 0, 24);
    }

    @ObfuscatedName("c.h(I)V")
    public static void method154() {
        try {
            field2090.method3600();
            for (int var0 = 0; var0 < Statics.field803; var0++) {
                Statics.field2025[var0].method3600();
            }
            field2091.method3600();
            field2089.method3600();
        } catch (Exception var2) {
        }
    }
}
