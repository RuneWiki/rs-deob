package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fh")
public class class177 {

    @ObfuscatedName("fh.p")
    public static class352 field2054 = null;

    @ObfuscatedName("fh.n")
    public static class352 field2052 = null;

    @ObfuscatedName("fh.u")
    public static class352 field2056 = null;

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.x(Ljava/io/File;Ljava/io/File;S)V")
    public static void method3122(File arg0, File arg1) {
        try {
            class353 var2 = new class353(Statics.field2049, "rw", 10000L);
            class310 var3 = new class310(500);
            var3.method5121(3);
            var3.method5121(arg1 == null ? 0 : 1);
            var3.method5130(arg0.getPath());
            if (arg1 != null) {
                var3.method5130(arg1.getPath());
            }
            var2.method6197(var3.field3710, 0, var3.field3711);
            var2.method6192();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("bo.m(Ljava/lang/String;Ljava/lang/String;ZI)Lmb;")
    public static class353 method763(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1181, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class353(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field41 == 33) {
            var6 = "_rc";
        } else if (Statics.field41 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field213, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class353(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class353(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hb.k(I)V")
    public static void method3678() {
        try {
            File var0 = new File(Statics.field213, "random.dat");
            if (var0.exists()) {
                field2054 = new class352(new class353(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3872.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2523.length; var2++) {
                        File var3 = new File(Statics.field2523[var2] + Statics.field3872[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2054 = new class352(new class353(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2054 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2054 = new class352(new class353(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cs.d(I)[B")
    public static byte[] method1935() {
        byte[] var0 = new byte[24];
        try {
            field2054.method6156(0L);
            field2054.method6158(var0);
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

    @ObfuscatedName("am.w(Lkb;II)V")
    public static void method438(class310 arg0, int arg1) {
        if (field2054 == null) {
            return;
        }
        try {
            field2054.method6156(0L);
            field2054.method6177(arg0.field3710, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
