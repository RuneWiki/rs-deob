package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class149 {

    @ObfuscatedName("ex.j")
    public static class228 field2237 = null;

    @ObfuscatedName("ex.a")
    public static class228 field2236 = null;

    @ObfuscatedName("ex.b")
    public static class228 field2239 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.z(Ljava/io/File;Ljava/io/File;S)V")
    public static void method2639(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field1885, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2285(3);
            var3.method2285(arg1 == null ? 0 : 1);
            var3.method2294(arg0.getPath());
            if (arg1 != null) {
                var3.method2294(arg1.getPath());
            }
            var2.method3767(var3.field1987, 0, var3.field1986);
            var2.method3769();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("aj.q(Ljava/io/File;ZB)Z")
    public static boolean method699(File arg0, boolean arg1) {
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

    @ObfuscatedName("di.k(Ljava/lang/String;Ljava/lang/String;ZI)Lhr;")
    public static class227 method2227(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2144, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2233 == 33) {
            var6 = "_rc";
        } else if (Statics.field2233 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2299, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class227(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class227(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dp.f(Lda;I)V")
    public static void method2588(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2237.method3811(0L);
            field2237.method3787(var1);
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
        arg0.method2295(var1, 0, 24);
    }

    @ObfuscatedName("ch.d(Lda;II)V")
    public static void method2095(class119 arg0, int arg1) {
        if (field2237 == null) {
            return;
        }
        try {
            field2237.method3811(0L);
            field2237.method3790(arg0.field1987, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bq.l(B)V")
    public static void method1536() {
        try {
            field2236.method3784();
            for (int var0 = 0; var0 < Statics.field3166; var0++) {
                Statics.field1525[var0].method3784();
            }
            field2239.method3784();
            field2237.method3784();
        } catch (Exception var2) {
        }
    }
}
