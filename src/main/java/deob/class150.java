package deob;

import java.io.File;
import java.io.IOException;

@ObfuscatedName("eu")
public class class150 {

    @ObfuscatedName("eu.l")
    public static class229 field2243 = null;

    @ObfuscatedName("eu.t")
    public static class229 field2244 = null;

    @ObfuscatedName("eu.i")
    public static class229 field2245 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fh.s(Ljava/io/File;Ljava/io/File;B)V")
    public static void method2945(File arg0, File arg1) {
        try {
            class228 var2 = new class228(Statics.field1978, "rw", 10000L);
            class120 var3 = new class120(500);
            var3.method2323(3);
            var3.method2323(arg1 == null ? 0 : 1);
            var3.method2331(arg0.getPath());
            if (arg1 != null) {
                var3.method2331(arg1.getPath());
            }
            var2.method3838(var3.field2008, 0, var3.field2006);
            var2.method3853();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("v.p(Ljava/lang/String;Ljava/lang/String;ZI)Lha;")
    public static class228 method609(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field73, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class228(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2246 == 33) {
            var6 = "_rc";
        } else if (Statics.field2246 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field259, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class228(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class228(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cd.x(Lds;B)V")
    public static void method2126(class120 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2243.method3873(0L);
            field2243.method3862(var1);
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
        arg0.method2332(var1, 0, 24);
    }

    @ObfuscatedName("cg.d(I)V")
    public static void method1936() {
        try {
            field2244.method3859();
            for (int var0 = 0; var0 < Statics.field1072; var0++) {
                Statics.field571[var0].method3859();
            }
            field2245.method3859();
            field2243.method3859();
        } catch (Exception var2) {
        }
    }
}
