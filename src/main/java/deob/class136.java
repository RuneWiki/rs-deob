package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ej")
public class class136 {

    @ObfuscatedName("ej.w")
    public static class196 field2057 = null;

    @ObfuscatedName("ej.m")
    public static class196 field2064 = null;

    @ObfuscatedName("ej.x")
    public static class196 field2059 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.t(Ljava/io/File;ZB)Z")
    public static boolean method566(File arg0, boolean arg1) {
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

    @ObfuscatedName("cg.o(Ljava/lang/String;Ljava/lang/String;ZI)Lgg;")
    public static class195 method2057(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2955, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1966 == 33) {
            var6 = "_rc";
        } else if (Statics.field1966 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2062, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ee.i(B)V")
    public static void method2646() {
        try {
            field2064.method3399();
            for (int var0 = 0; var0 < Statics.field2054; var0++) {
                Statics.field164[var0].method3399();
            }
            field2059.method3399();
            field2057.method3399();
        } catch (Exception var2) {
        }
    }
}
