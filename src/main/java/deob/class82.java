package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ca")
public class class82 {

    @ObfuscatedName("ca.g")
    public static class30 field1418 = null;

    @ObfuscatedName("ca.s")
    public static class30 field1419 = null;

    @ObfuscatedName("ca.b")
    public static class30 field1420 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.f(Ljava/io/File;Ljava/io/File;I)V")
    public static void method151(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field329, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2536(3);
            var3.method2536(arg1 == null ? 0 : 1);
            var3.method2451(arg0.getPath());
            if (arg1 != null) {
                var3.method2451(arg1.getPath());
            }
            var2.method554(var3.field2030, 0, var3.field2033);
            var2.method555();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ek.t(Ljava/io/File;ZI)Z")
    public static boolean method2952(File arg0, boolean arg1) {
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

    @ObfuscatedName("an.n(Ljava/lang/String;Ljava/lang/String;ZI)Lad;")
    public static class29 method693(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1427, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2868 == 33) {
            var6 = "_rc";
        } else if (Statics.field2868 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2455, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("al.e(I)V")
    public static void method751() {
        try {
            field1419.method576();
            for (int var0 = 0; var0 < Statics.field1415; var0++) {
                Statics.field1820[var0].method576();
            }
            field1420.method576();
            field1418.method576();
        } catch (Exception var2) {
        }
    }
}
