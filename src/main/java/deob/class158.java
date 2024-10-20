package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fp")
public class class158 {

    @ObfuscatedName("fp.p")
    public static class425 field1725 = null;

    @ObfuscatedName("fp.w")
    public static class425 field1726 = null;

    @ObfuscatedName("fp.k")
    public static class425 field1727 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.v(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method3451(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1723 = arg3;
        Statics.field2406 = arg2;
        try {
            Statics.field49 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field49 = "Unknown";
        }
        Statics.field1520 = Statics.field49.toLowerCase();
        try {
            Statics.field1752 = System.getProperty("user.home");
            if (Statics.field1752 != null) {
                Statics.field1752 = Statics.field1752 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field1520.startsWith("win")) {
                if (Statics.field1752 == null) {
                    Statics.field1752 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1752 == null) {
                Statics.field1752 = System.getenv("HOME");
            }
            if (Statics.field1752 != null) {
                Statics.field1752 = Statics.field1752 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1752 == null) {
            Statics.field1752 = "~/";
        }
        Statics.field1013 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1752, "/tmp/", "" };
        Statics.field2393 = new String[] { ".jagex_cache_" + Statics.field2406, ".file_store_" + Statics.field2406 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field1722 = method3691(arg0, arg1, var7);
            if (!Statics.field1722.exists()) {
                Statics.field1722.mkdirs();
            }
            File[] var8 = Statics.field1722.listFiles();
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
                if (!method3964(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class160.method2692(Statics.field1722);
        try {
            File var12 = new File(Statics.field1752, "random.dat");
            if (var12.exists()) {
                field1725 = new class425(new class424(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field2393.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field1013.length; var14++) {
                        File var15 = new File(Statics.field1013[var14] + Statics.field2393[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field1725 = new class425(new class424(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field1725 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field1725 = new class425(new class424(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field1726 = new class425(new class424(class160.method1052("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1727 = new class425(new class424(class160.method1052("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1398 = new class425[Statics.field1723];
        for (int var19 = 0; var19 < Statics.field1723; var19++) {
            Statics.field1398[var19] = new class425(new class424(class160.method1052("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("gu.c(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3691(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field169 = new File(Statics.field1752, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field169.exists()) {
            try {
                class424 var7 = new class424(Statics.field169, "rw", 10000L);
                class438 var8 = new class438((int) var7.method6813());
                while (var8.field4621 < var8.field4618.length) {
                    int var9 = var7.method6810(var8.field4618, var8.field4621, var8.field4618.length - var8.field4621);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4621 += var9;
                }
                var8.field4621 = 0;
                int var10 = var8.method6971();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method6971();
                }
                if (var10 <= 2) {
                    var4 = var8.method7023();
                    if (var11 == 1) {
                        var5 = var8.method7023();
                    }
                } else {
                    var4 = var8.method6983();
                    if (var11 == 1) {
                        var5 = var8.method6983();
                    }
                }
                var7.method6814();
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
                if (!method3964(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2393.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1013.length; var16++) {
                    File var17 = new File(Statics.field1013[var16] + Statics.field2393[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method3964(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1752 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method189(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("u.i(Ljava/io/File;Ljava/io/File;I)V")
    public static void method189(File arg0, File arg1) {
        try {
            class424 var2 = new class424(Statics.field169, "rw", 10000L);
            class438 var3 = new class438(500);
            var3.method6954(3);
            var3.method6954(arg1 == null ? 0 : 1);
            var3.method6963(arg0.getPath());
            if (arg1 != null) {
                var3.method6963(arg1.getPath());
            }
            var2.method6822(var3.field4618, 0, var3.field4621);
            var2.method6814();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("hq.f(Ljava/io/File;ZB)Z")
    public static boolean method3964(File arg0, boolean arg1) {
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

    @ObfuscatedName("lv.b(Ljava/lang/String;Ljava/lang/String;ZB)Lph;")
    public static class424 method5515(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1722, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class424(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2406 == 33) {
            var6 = "_rc";
        } else if (Statics.field2406 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1752, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class424(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class424(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nk.n(I)V")
    public static void method6079() {
        try {
            field1726.method6848();
            for (int var0 = 0; var0 < Statics.field1723; var0++) {
                Statics.field1398[var0].method6848();
            }
            field1727.method6848();
            field1725.method6848();
        } catch (Exception var2) {
        }
    }
}
