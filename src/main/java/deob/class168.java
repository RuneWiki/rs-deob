package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fu")
public class class168 {

    @ObfuscatedName("fu.o")
    public static class122 field2201 = null;

    @ObfuscatedName("fu.d")
    public static class122 field2202 = null;

    @ObfuscatedName("fu.r")
    public static class122 field2205 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.g(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;")
    public static File method1889(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2198 = new File(Statics.field2206, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2198.exists()) {
            try {
                class123 var7 = new class123(Statics.field2198, "rw", 10000L);
                class195 var8 = new class195((int) var7.method2441());
                while (var8.field2562 < var8.field2563.length) {
                    int var9 = var7.method2432(var8.field2563, var8.field2562, var8.field2563.length - var8.field2562);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2562 += var9;
                }
                var8.field2562 = 0;
                int var10 = var8.method3332();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3332();
                }
                if (var10 <= 2) {
                    var4 = var8.method3318();
                    if (var11 == 1) {
                        var5 = var8.method3318();
                    }
                } else {
                    var4 = var8.method3517();
                    if (var11 == 1) {
                        var5 = var8.method3517();
                    }
                }
                var7.method2444();
            } catch (IOException var28) {
                var28.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method43(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1135.length; var15++) {
                for (int var16 = 0; var16 < Statics.field433.length; var16++) {
                    File var17 = new File(Statics.field433[var16] + Statics.field1135[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method43(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2206 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var18 = new File(var5);
            File var19 = new File(var4);
            try {
                File[] var20 = var18.listFiles();
                File[] var21 = var20;
                for (int var22 = 0; var22 < var21.length; var22++) {
                    File var23 = var21[var22];
                    File var24 = new File(var19, var23.getName());
                    boolean var25 = var23.renameTo(var24);
                    if (!var25) {
                        throw new IOException();
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method2572(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("eg.e(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2572(File arg0, File arg1) {
        try {
            class123 var2 = new class123(Statics.field2198, "rw", 10000L);
            class195 var3 = new class195(500);
            var3.method3363(3);
            var3.method3363(arg1 == null ? 0 : 1);
            var3.method3302(arg0.getPath());
            if (arg1 != null) {
                var3.method3302(arg1.getPath());
            }
            var2.method2429(var3.field2563, 0, var3.field2562);
            var2.method2444();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("h.b(Ljava/io/File;ZI)Z")
    public static boolean method43(File arg0, boolean arg1) {
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

    @ObfuscatedName("n.z(Ljava/lang/String;Ljava/lang/String;ZI)Ldb;")
    public static class123 method9(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1913, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class123(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field848 == 33) {
            var6 = "_rc";
        } else if (Statics.field848 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2206, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class123(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class123(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ce.n(I)[B")
    public static byte[] method1659() {
        byte[] var0 = new byte[24];
        try {
            field2201.method2401(0L);
            field2201.method2403(var0);
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

    @ObfuscatedName("d.l(Lgg;IB)V")
    public static void method63(class195 arg0, int arg1) {
        if (field2201 == null) {
            return;
        }
        try {
            field2201.method2401(0L);
            field2201.method2423(arg0.field2563, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
