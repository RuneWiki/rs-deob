package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ep")
public class class149 {

    @ObfuscatedName("ep.i")
    public static class228 field2211 = null;

    @ObfuscatedName("ep.g")
    public static class228 field2215 = null;

    @ObfuscatedName("ep.t")
    public static class228 field2206 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.k(Ljava/io/File;ZI)Z")
    public static boolean method191(File arg0, boolean arg1) {
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

    @ObfuscatedName("ap.h(Ljava/lang/String;Ljava/lang/String;ZB)Lhk;")
    public static class227 method694(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2110, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2214 == 33) {
            var6 = "_rc";
        } else if (Statics.field2214 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field267, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("cr.o(I)V")
    public static void method1951() {
        try {
            File var0 = new File(Statics.field267, "random.dat");
            if (var0.exists()) {
                field2211 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3051.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2911.length; var2++) {
                        File var3 = new File(Statics.field2911[var2] + Statics.field3051[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2211 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2211 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2211 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("de.z(Ldk;B)V")
    public static void method2650(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2211.method3881(0L);
            field2211.method3904(var1);
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
        arg0.method2320(var1, 0, 24);
    }

    @ObfuscatedName("ai.c(I)V")
    public static void method894() {
        try {
            field2215.method3885();
            for (int var0 = 0; var0 < Statics.field2209; var0++) {
                Statics.field2213[var0].method3885();
            }
            field2206.method3885();
            field2211.method3885();
        } catch (Exception var2) {
        }
    }
}
