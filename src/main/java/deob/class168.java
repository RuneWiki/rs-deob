package deob;

import java.io.File;
import java.io.IOException;

@ObfuscatedName("fs")
public class class168 {

    @ObfuscatedName("fs.x")
    public static class342 field2049 = null;

    @ObfuscatedName("fs.o")
    public static class342 field2050 = null;

    @ObfuscatedName("fs.e")
    public static class342 field2048 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.u(Ljava/lang/String;Ljava/lang/String;ZI)Lmd;")
    public static class343 method3393(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3822, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class343(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field933 == 33) {
            var6 = "_rc";
        } else if (Statics.field933 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2043, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class343(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class343(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("y.f(Lkg;II)V")
    public static void method66(class300 arg0, int arg1) {
        if (field2049 == null) {
            return;
        }
        try {
            field2049.method6094(0L);
            field2049.method6089(arg0.field3708, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
