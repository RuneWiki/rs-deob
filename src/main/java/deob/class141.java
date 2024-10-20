package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("em")
public class class141 {

    @ObfuscatedName("em.e")
    public static class219 field2134 = null;

    @ObfuscatedName("em.z")
    public static class219 field2139 = null;

    @ObfuscatedName("em.v")
    public static class219 field2136 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.n(Ljava/io/File;Ljava/io/File;I)V")
    public static void method3366(File arg0, File arg1) {
        try {
            class218 var2 = new class218(Statics.field2561, "rw", 10000L);
            class111 var3 = new class111(500);
            var3.method2219(3);
            var3.method2219(arg1 == null ? 0 : 1);
            var3.method2361(arg0.getPath());
            if (arg1 != null) {
                var3.method2361(arg1.getPath());
            }
            var2.method3733(var3.field1889, 0, var3.field1890);
            var2.method3724();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ey.o(Ljava/io/File;ZI)Z")
    public static boolean method2669(File arg0, boolean arg1) {
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

    @ObfuscatedName("cd.a(Ljava/lang/String;Ljava/lang/String;ZI)Lho;")
    public static class218 method1949(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2128, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2137 == 33) {
            var6 = "_rc";
        } else if (Statics.field2137 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2138, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class218(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class218(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("av.w(B)V")
    public static void method576() {
        try {
            File var0 = new File(Statics.field2138, "random.dat");
            if (var0.exists()) {
                field2134 = new class219(new class218(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2132.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1903.length; var2++) {
                        File var3 = new File(Statics.field1903[var2] + Statics.field2132[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2134 = new class219(new class218(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2134 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2134 = new class219(new class218(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("di.m(Ldl;I)V")
    public static void method2559(class111 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2134.method3742(0L);
            field2134.method3761(var1);
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
        arg0.method2285(var1, 0, 24);
    }

    @ObfuscatedName("ai.h(I)V")
    public static void method984() {
        try {
            field2139.method3741();
            for (int var0 = 0; var0 < Statics.field2131; var0++) {
                Statics.field1933[var0].method3741();
            }
            field2136.method3741();
            field2134.method3741();
        } catch (Exception var2) {
        }
    }
}
