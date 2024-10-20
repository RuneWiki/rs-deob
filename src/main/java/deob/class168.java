package deob;

import java.io.File;
import java.io.IOException;

@ObfuscatedName("fj")
public class class168 {

    @ObfuscatedName("fj.a")
    public static class122 field2205 = null;

    @ObfuscatedName("fj.e")
    public static class122 field2212 = null;

    @ObfuscatedName("fj.f")
    public static class122 field2213 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jj.i(Ljava/io/File;Ljava/io/File;B)V")
    public static void method4679(File arg0, File arg1) {
        try {
            class123 var2 = new class123(Statics.field2206, "rw", 10000L);
            class195 var3 = new class195(500);
            var3.method3209(3);
            var3.method3209(arg1 == null ? 0 : 1);
            var3.method3308(arg0.getPath());
            if (arg1 != null) {
                var3.method3308(arg1.getPath());
            }
            var2.method2322(var3.field2567, 0, var3.field2566);
            var2.method2323();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ek.o(Ljava/lang/String;Ljava/lang/String;ZI)Ldp;")
    public static class123 method2855(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2207, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class123(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1147 == 33) {
            var6 = "_rc";
        } else if (Statics.field1147 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field328, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class123(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class123(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("aa.j(I)[B")
    public static byte[] method342() {
        byte[] var0 = new byte[24];
        try {
            field2205.method2293(0L);
            field2205.method2294(var0);
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
