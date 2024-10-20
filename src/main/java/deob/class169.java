package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fs")
public class class169 {

    @ObfuscatedName("fs.k")
    public static class118 field2047 = null;

    @ObfuscatedName("fs.n")
    public static class118 field2048 = null;

    @ObfuscatedName("fs.i")
    public static class118 field2049 = null;

    public class169() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.m(Ljava/io/File;Ljava/io/File;I)V")
    public static void method150(File arg0, File arg1) {
        try {
            class119 var2 = new class119(Statics.field4035, "rw", 10000L);
            class202 var3 = new class202(500);
            var3.method3565(3);
            var3.method3565(arg1 == null ? 0 : 1);
            var3.method3410(arg0.getPath());
            if (arg1 != null) {
                var3.method3410(arg1.getPath());
            }
            var2.method2473(var3.field2440, 0, var3.field2439);
            var2.method2474();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("az.f(Ljava/io/File;ZI)Z")
    public static boolean method709(File arg0, boolean arg1) {
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

    @ObfuscatedName("gl.q(Ljava/lang/String;Ljava/lang/String;ZS)Ldk;")
    public static class119 method3317(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2042, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class119(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2467 == 33) {
            var6 = "_rc";
        } else if (Statics.field2467 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field352, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class119(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class119(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bv.w(B)V")
    public static void method1811() {
        try {
            File var0 = new File(Statics.field352, "random.dat");
            if (var0.exists()) {
                field2047 = new class118(new class119(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field391.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field276.length; var2++) {
                        File var3 = new File(Statics.field276[var2] + Statics.field391[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2047 = new class118(new class119(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2047 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2047 = new class118(new class119(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cj.o(I)[B")
    public static byte[] method1854() {
        byte[] var0 = new byte[24];
        try {
            field2047.method2458(0L);
            field2047.method2459(var0);
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
