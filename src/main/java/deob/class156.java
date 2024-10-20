package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eg")
public class class156 {

    @ObfuscatedName("eg.o")
    public static class124 field2259 = null;

    @ObfuscatedName("eg.z")
    public static class124 field2260 = null;

    @ObfuscatedName("eg.l")
    public static class124 field2263 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.i(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1009(File arg0, File arg1) {
        try {
            class125 var2 = new class125(Statics.field2258, "rw", 10000L);
            class174 var3 = new class174(500);
            var3.method2865(3);
            var3.method2865(arg1 == null ? 0 : 1);
            var3.method2873(arg0.getPath());
            if (arg1 != null) {
                var3.method2873(arg1.getPath());
            }
            var2.method2139(var3.field2405, 0, var3.field2399);
            var2.method2157();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("bo.w(Ljava/io/File;ZI)Z")
    public static boolean method991(File arg0, boolean arg1) {
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

    @ObfuscatedName("d.a(Ljava/lang/String;Ljava/lang/String;ZI)Ldp;")
    public static class125 method150(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2159, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field515 == 33) {
            var6 = "_rc";
        } else if (Statics.field515 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1384, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class125(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class125(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bq.t(I)V")
    public static void method1068() {
        try {
            File var0 = new File(Statics.field1384, "random.dat");
            if (var0.exists()) {
                field2259 = new class124(new class125(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2154.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field534.length; var2++) {
                        File var3 = new File(Statics.field534[var2] + Statics.field2154[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2259 = new class124(new class125(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2259 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2259 = new class124(new class125(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("aq.s(B)[B")
    public static byte[] method477() {
        byte[] var0 = new byte[24];
        try {
            field2259.method2114(0L);
            field2259.method2112(var0);
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

    @ObfuscatedName("hj.r(I)V")
    public static void method3724() {
        try {
            field2260.method2109();
            for (int var0 = 0; var0 < Statics.field2446; var0++) {
                Statics.field33[var0].method2109();
            }
            field2263.method2109();
            field2259.method2109();
        } catch (Exception var2) {
        }
    }
}
