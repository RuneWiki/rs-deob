package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fc")
public class class157 {

    @ObfuscatedName("fc.l")
    public static class123 field2254 = null;

    @ObfuscatedName("fc.t")
    public static class123 field2251 = null;

    @ObfuscatedName("fc.y")
    public static class123 field2256 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.i(Ljava/io/File;ZI)Z")
    public static boolean method1009(File arg0, boolean arg1) {
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

    @ObfuscatedName("fr.j(Ljava/lang/String;Ljava/lang/String;ZI)Ldc;")
    public static class124 method2894(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field613, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class124(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field552 == 33) {
            var6 = "_rc";
        } else if (Statics.field552 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2258, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class124(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class124(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.a(B)V")
    public static void method1000() {
        try {
            File var0 = new File(Statics.field2258, "random.dat");
            if (var0.exists()) {
                field2254 = new class123(new class124(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2324.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2125.length; var2++) {
                        File var3 = new File(Statics.field2125[var2] + Statics.field2324[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2254 = new class123(new class124(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2254 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2254 = new class123(new class124(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("hx.r(I)[B")
    public static byte[] method3784() {
        byte[] var0 = new byte[24];
        try {
            field2254.method2155(0L);
            field2254.method2132(var0);
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
