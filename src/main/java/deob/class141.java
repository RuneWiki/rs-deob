package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("en")
public class class141 {

    @ObfuscatedName("en.v")
    public static class219 field2139 = null;

    @ObfuscatedName("en.n")
    public static class219 field2137 = null;

    @ObfuscatedName("en.z")
    public static class219 field2138 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.b(Ljava/io/File;ZI)Z")
    public static boolean method1772(File arg0, boolean arg1) {
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

    @ObfuscatedName("az.e(Ljava/lang/String;Ljava/lang/String;ZI)Lht;")
    public static class218 method745(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2133, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2885 == 33) {
            var6 = "_rc";
        } else if (Statics.field2885 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1848, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("v.a(I)V")
    public static void method123() {
        try {
            File var0 = new File(Statics.field1848, "random.dat");
            if (var0.exists()) {
                field2139 = new class219(new class218(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2129.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field535.length; var2++) {
                        File var3 = new File(Statics.field535[var2] + Statics.field2129[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2139 = new class219(new class218(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2139 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2139 = new class219(new class218(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dr.k(Ldj;I)V")
    public static void method2441(class111 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2139.method3646(0L);
            field2139.method3649(var1);
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
        arg0.method2121(var1, 0, 24);
    }

    @ObfuscatedName("dt.p(Ldj;II)V")
    public static void method2375(class111 arg0, int arg1) {
        if (field2139 == null) {
            return;
        }
        try {
            field2139.method3646(0L);
            field2139.method3652(arg0.field1897, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
