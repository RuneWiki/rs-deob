package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class133 {

    @ObfuscatedName("ex.d")
    public static class186 field2071 = null;

    @ObfuscatedName("ex.t")
    public static class186 field2063 = null;

    @ObfuscatedName("ex.j")
    public static class186 field2064 = null;

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.m(Ljava/io/File;Ljava/io/File;B)V")
    public static void method2392(File arg0, File arg1) {
        try {
            class185 var2 = new class185(Statics.field2058, "rw", 10000L);
            class104 var3 = new class104(500);
            var3.method2133(3);
            var3.method2133(arg1 == null ? 0 : 1);
            var3.method2260(arg0.getPath());
            if (arg1 != null) {
                var3.method2260(arg1.getPath());
            }
            var2.method3350(var3.field1808, 0, var3.field1806);
            var2.method3351();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("dp.k(Ljava/io/File;ZI)Z")
    public static boolean method2426(File arg0, boolean arg1) {
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

    @ObfuscatedName("ax.y(Ljava/lang/String;Ljava/lang/String;ZI)Lgp;")
    public static class185 method965(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2057, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class185(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2065 == 33) {
            var6 = "_rc";
        } else if (Statics.field2065 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1912, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class185(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class185(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cm.g(Lcb;I)V")
    public static void method1867(class104 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2071.method3372(0L);
            field2071.method3374(var1);
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
        arg0.method2124(var1, 0, 24);
    }

    @ObfuscatedName("ad.r(Lcb;IB)V")
    public static void method649(class104 arg0, int arg1) {
        if (field2071 == null) {
            return;
        }
        try {
            field2071.method3372(0L);
            field2071.method3377(arg0.field1808, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("z.i(I)V")
    public static void method532() {
        try {
            field2063.method3371();
            for (int var0 = 0; var0 < Statics.field2061; var0++) {
                Statics.field583[var0].method3371();
            }
            field2064.method3371();
            field2071.method3371();
        } catch (Exception var2) {
        }
    }
}
