package deob;

import java.io.File;
import java.io.IOException;

@ObfuscatedName("cd")
public class class82 {

    @ObfuscatedName("cd.c")
    public static class30 field1437 = null;

    @ObfuscatedName("cd.z")
    public static class30 field1438 = null;

    @ObfuscatedName("cd.s")
    public static class30 field1446 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.a(Ljava/io/File;Ljava/io/File;I)V")
    public static void method44(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1433, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2455(3);
            var3.method2455(arg1 == null ? 0 : 1);
            var3.method2404(arg0.getPath());
            if (arg1 != null) {
                var3.method2404(arg1.getPath());
            }
            var2.method550(var3.field2036, 0, var3.field2035);
            var2.method552();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("z.x(Ljava/lang/String;Ljava/lang/String;ZI)Lay;")
    public static class29 method149(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1430, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2053 == 33) {
            var6 = "_rc";
        } else if (Statics.field2053 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field282, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class29(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class29(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ay.r(Ldy;B)V")
    public static void method574(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1437.method588(0L);
            field1437.method579(var1);
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
        arg0.method2405(var1, 0, 24);
    }

    @ObfuscatedName("w.p(I)V")
    public static void method172() {
        try {
            field1438.method586();
            for (int var0 = 0; var0 < Statics.field2316; var0++) {
                Statics.field1440[var0].method586();
            }
            field1446.method586();
            field1437.method586();
        } catch (Exception var2) {
        }
    }
}
