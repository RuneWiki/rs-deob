package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ca")
public class class82 {

    @ObfuscatedName("ca.f")
    public static class30 field1429 = null;

    @ObfuscatedName("ca.b")
    public static class30 field1430 = null;

    @ObfuscatedName("ca.z")
    public static class30 field1431 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.g(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method2(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field380 = arg3;
        Statics.field1427 = arg2;
        try {
            Statics.field1263 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field1263 = "Unknown";
        }
        Statics.field1394 = Statics.field1263.toLowerCase();
        try {
            Statics.field1433 = System.getProperty("user.home");
            if (Statics.field1433 != null) {
                Statics.field1433 = Statics.field1433 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field1394.startsWith("win")) {
                if (Statics.field1433 == null) {
                    Statics.field1433 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1433 == null) {
                Statics.field1433 = System.getenv("HOME");
            }
            if (Statics.field1433 != null) {
                Statics.field1433 = Statics.field1433 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1433 == null) {
            Statics.field1433 = "~/";
        }
        Statics.field238 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1433, "/tmp/", "" };
        Statics.field1291 = new String[] { ".jagex_cache_" + Statics.field1427, ".file_store_" + Statics.field1427 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field1421 = method119(arg0, arg1, var7);
            if (!Statics.field1421.exists()) {
                Statics.field1421.mkdirs();
            }
            File[] var8 = Statics.field1421.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label115;
                }
                File var11 = var9[var10];
                if (!method187(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class72.method1(Statics.field1421);
        try {
            File var12 = new File(Statics.field1433, "random.dat");
            if (var12.exists()) {
                field1429 = new class30(new class29(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field1291.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field238.length; var14++) {
                        File var15 = new File(Statics.field238[var14] + Statics.field1291[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field1429 = new class30(new class29(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field1429 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field1429 = new class30(new class29(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field1430 = new class30(new class29(class72.method189("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1431 = new class30(new class29(class72.method189("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1432 = new class30[Statics.field380];
        for (int var19 = 0; var19 < Statics.field380; var19++) {
            Statics.field1432[var19] = new class30(new class29(class72.method189("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("z.m(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method119(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1424 = new File(Statics.field1433, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1424.exists()) {
            try {
                class29 var7 = new class29(Statics.field1424, "rw", 10000L);
                class127 var8 = new class127((int) var7.method548());
                while (var8.field2023 < var8.field2028.length) {
                    int var9 = var7.method546(var8.field2028, var8.field2023, var8.field2028.length - var8.field2023);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2023 += var9;
                }
                var8.field2023 = 0;
                int var10 = var8.method2414();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2414();
                }
                if (var10 <= 2) {
                    var4 = var8.method2423();
                    if (var11 == 1) {
                        var5 = var8.method2423();
                    }
                } else {
                    var4 = var8.method2424();
                    if (var11 == 1) {
                        var5 = var8.method2424();
                    }
                }
                var7.method544();
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
                if (!method187(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1291.length; var15++) {
                for (int var16 = 0; var16 < Statics.field238.length; var16++) {
                    File var17 = new File(Statics.field238[var16] + Statics.field1291[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method187(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1433 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1569(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ct.v(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1569(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1424, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2498(3);
            var3.method2498(arg1 == null ? 0 : 1);
            var3.method2407(arg0.getPath());
            if (arg1 != null) {
                var3.method2407(arg1.getPath());
            }
            var2.method543(var3.field2028, 0, var3.field2023);
            var2.method544();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("a.r(Ljava/io/File;ZI)Z")
    public static boolean method187(File arg0, boolean arg1) {
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

    @ObfuscatedName("m.n(Ljava/lang/String;Ljava/lang/String;ZI)Lau;")
    public static class29 method11(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1421, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1427 == 33) {
            var6 = "_rc";
        } else if (Statics.field1427 == 34) {
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

    @ObfuscatedName("eu.i(Ldr;I)V")
    public static void method2652(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1429.method568(0L);
            field1429.method570(var1);
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
        arg0.method2408(var1, 0, 24);
    }
}
