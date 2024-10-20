package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eb")
public class class153 {

    @ObfuscatedName("eb.m")
    public static class232 field2302 = null;

    @ObfuscatedName("eb.q")
    public static class232 field2297 = null;

    @ObfuscatedName("eb.p")
    public static class232 field2298 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.l(Ljava/io/File;ZI)Z")
    public static boolean method1270(File arg0, boolean arg1) {
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

    @ObfuscatedName("db.g(Ljava/lang/String;Ljava/lang/String;ZI)Lhl;")
    public static class231 method2401(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2301, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field228 == 33) {
            var6 = "_rc";
        } else if (Statics.field228 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field68, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class231(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class231(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dj.r(I)V")
    public static void method2251() {
        try {
            File var0 = new File(Statics.field68, "random.dat");
            if (var0.exists()) {
                field2302 = new class232(new class231(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2101.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2293.length; var2++) {
                        File var3 = new File(Statics.field2293[var2] + Statics.field2101[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2302 = new class232(new class231(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2302 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2302 = new class232(new class231(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dy.e(I)V")
    public static void method2795() {
        try {
            field2297.method4033();
            for (int var0 = 0; var0 < Statics.field2299; var0++) {
                Statics.field153[var0].method4033();
            }
            field2298.method4033();
            field2302.method4033();
        } catch (Exception var2) {
        }
    }
}
