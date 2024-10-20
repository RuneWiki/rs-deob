package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ff")
public class class157 {

    @ObfuscatedName("ff.m")
    public static class125 field2250 = null;

    @ObfuscatedName("ff.i")
    public static class125 field2258 = null;

    @ObfuscatedName("ff.s")
    public static class125 field2254 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.j(Ljava/io/File;Ljava/io/File;I)V")
    public static void method67(File arg0, File arg1) {
        try {
            class126 var2 = new class126(Statics.field2257, "rw", 10000L);
            class175 var3 = new class175(500);
            var3.method2888(3);
            var3.method2888(arg1 == null ? 0 : 1);
            var3.method2896(arg0.getPath());
            if (arg1 != null) {
                var3.method2896(arg1.getPath());
            }
            var2.method2159(var3.field2390, 0, var3.field2394);
            var2.method2161();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ay.h(Ljava/io/File;ZB)Z")
    public static boolean method702(File arg0, boolean arg1) {
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

    @ObfuscatedName("i.f(Ljava/lang/String;Ljava/lang/String;ZI)Ldr;")
    public static class126 method53(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2246, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class126(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1418 == 33) {
            var6 = "_rc";
        } else if (Statics.field1418 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field448, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class126(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class126(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ft.p(I)[B")
    public static byte[] method2817() {
        byte[] var0 = new byte[24];
        try {
            field2250.method2133(0L);
            field2250.method2134(var0);
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

    @ObfuscatedName("ch.x(B)V")
    public static void method1449() {
        try {
            field2258.method2149();
            for (int var0 = 0; var0 < Statics.field2248; var0++) {
                Statics.field2430[var0].method2149();
            }
            field2254.method2149();
            field2250.method2149();
        } catch (Exception var2) {
        }
    }
}
