package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cf")
public class class82 {

    @ObfuscatedName("cf.q")
    public static class30 field1434 = null;

    @ObfuscatedName("cf.w")
    public static class30 field1430 = null;

    @ObfuscatedName("cf.v")
    public static class30 field1439 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.p(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method916(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1441 = arg3;
        Statics.field1308 = arg2;
        try {
            Statics.field1226 = System.getProperty("os.name");
        } catch (Exception var46) {
            Statics.field1226 = "Unknown";
        }
        Statics.field1678 = Statics.field1226.toLowerCase();
        try {
            Statics.field1433 = System.getProperty("user.home");
            if (Statics.field1433 != null) {
                Statics.field1433 = Statics.field1433 + "/";
            }
        } catch (Exception var45) {
        }
        try {
            if (Statics.field1678.startsWith("win")) {
                if (Statics.field1433 == null) {
                    Statics.field1433 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1433 == null) {
                Statics.field1433 = System.getenv("HOME");
            }
            if (Statics.field1433 != null) {
                Statics.field1433 = Statics.field1433 + "/";
            }
        } catch (Exception var44) {
        }
        if (Statics.field1433 == null) {
            Statics.field1433 = "~/";
        }
        Statics.field1440 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1433, "/tmp/", "" };
        Statics.field253 = new String[] { ".jagex_cache_" + Statics.field1308, ".file_store_" + Statics.field1308 };
        int var7 = 0;
        label221: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1443 = new File(Statics.field1433, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1443.exists()) {
                try {
                    class29 var12 = new class29(Statics.field1443, "rw", 10000L);
                    class127 var13 = new class127((int) var12.method583());
                    while (var13.field2029 < var13.field2033.length) {
                        int var14 = var12.method578(var13.field2033, var13.field2029, var13.field2033.length - var13.field2029);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2029 += var14;
                    }
                    var13.field2029 = 0;
                    int var15 = var13.method2494();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2494();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2492();
                        if (var16 == 1) {
                            var10 = var13.method2492();
                        }
                    } else {
                        var9 = var13.method2504();
                        if (var16 == 1) {
                            var10 = var13.method2504();
                        }
                    }
                    var12.method559();
                } catch (IOException var48) {
                    var48.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2399(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label195: for (int var20 = 0; var20 < Statics.field253.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1440.length; var21++) {
                        File var22 = new File(Statics.field1440[var21] + Statics.field253[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2399(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label195;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1433 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var23 = new File(var10);
                File var24 = new File(var9);
                try {
                    File[] var25 = var23.listFiles();
                    File[] var26 = var25;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        File var28 = var26[var27];
                        File var29 = new File(var24, var28.getName());
                        boolean var30 = var28.renameTo(var29);
                        if (!var30) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var47) {
                    var47.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class29 var34 = new class29(Statics.field1443, "rw", 10000L);
                    class127 var35 = new class127(500);
                    var35.method2657(3);
                    var35.method2657(var33 == null ? 0 : 1);
                    var35.method2487(var32.getPath());
                    if (var33 != null) {
                        var35.method2487(((File) var33).getPath());
                    }
                    var34.method561(var35.field2033, 0, var35.field2029);
                    var34.method559();
                } catch (IOException var43) {
                    var43.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field1100 = var37;
            if (!Statics.field1100.exists()) {
                Statics.field1100.mkdirs();
            }
            File[] var38 = Statics.field1100.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method2399(var41, false)) {
                        var7++;
                        continue label221;
                    }
                }
            }
            break;
        }
        class72.method1880(Statics.field1100);
        method227();
        field1430 = new class30(new class29(class72.method3118("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1439 = new class30(new class29(class72.method3118("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field279 = new class30[Statics.field1441];
        for (int var42 = 0; var42 < Statics.field1441; var42++) {
            Statics.field279[var42] = new class30(new class29(class72.method3118("main_file_cache.idx" + var42), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dd.e(Ljava/io/File;ZI)Z")
    public static boolean method2399(File arg0, boolean arg1) {
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

    @ObfuscatedName("bk.a(Ljava/lang/String;Ljava/lang/String;ZI)Lam;")
    public static class29 method1392(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1100, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1308 == 33) {
            var6 = "_rc";
        } else if (Statics.field1308 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1433, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class29(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class29(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("g.h(I)V")
    public static void method227() {
        try {
            File var0 = new File(Statics.field1433, "random.dat");
            if (var0.exists()) {
                field1434 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field253.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1440.length; var2++) {
                        File var3 = new File(Statics.field1440[var2] + Statics.field253[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1434 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1434 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1434 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("y.y(Ldj;IB)V")
    public static void method43(class127 arg0, int arg1) {
        if (field1434 == null) {
            return;
        }
        try {
            field1434.method587(0L);
            field1434.method592(arg0.field2033, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ar.j(B)V")
    public static void method840() {
        try {
            field1430.method586();
            for (int var0 = 0; var0 < Statics.field1441; var0++) {
                Statics.field279[var0].method586();
            }
            field1439.method586();
            field1434.method586();
        } catch (Exception var2) {
        }
    }
}
