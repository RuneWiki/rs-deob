package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ej")
public class class136 {

    @ObfuscatedName("ej.s")
    public static class196 field2082 = null;

    @ObfuscatedName("ej.f")
    public static class196 field2085 = null;

    @ObfuscatedName("ej.p")
    public static class196 field2084 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.e(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method151(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2658 = arg3;
        Statics.field2114 = arg2;
        try {
            Statics.field1486 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field1486 = "Unknown";
        }
        Statics.field244 = Statics.field1486.toLowerCase();
        try {
            Statics.field611 = System.getProperty("user.home");
            if (Statics.field611 != null) {
                Statics.field611 = Statics.field611 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field244.startsWith("win")) {
                if (Statics.field611 == null) {
                    Statics.field611 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field611 == null) {
                Statics.field611 = System.getenv("HOME");
            }
            if (Statics.field611 != null) {
                Statics.field611 = Statics.field611 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field611 == null) {
            Statics.field611 = "~/";
        }
        Statics.field1660 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field611, "/tmp/", "" };
        Statics.field1858 = new String[] { ".jagex_cache_" + Statics.field2114, ".file_store_" + Statics.field2114 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field2508 = method2657(arg0, arg1, var7);
            if (!Statics.field2508.exists()) {
                Statics.field2508.mkdirs();
            }
            File[] var8 = Statics.field2508.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label119;
                }
                File var11 = var9[var10];
                if (!method1328(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2508;
        Statics.field1928 = var12;
        if (!Statics.field1928.exists()) {
            throw new RuntimeException("");
        }
        class122.field1933 = true;
        try {
            File var13 = new File(Statics.field611, "random.dat");
            if (var13.exists()) {
                field2082 = new class196(new class195(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field1858.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field1660.length; var15++) {
                        File var16 = new File(Statics.field1660[var15] + Statics.field1858[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2082 = new class196(new class195(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2082 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2082 = new class196(new class195(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2085 = new class196(new class195(class122.method544("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2084 = new class196(new class195(class122.method544("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1819 = new class196[Statics.field2658];
        for (int var20 = 0; var20 < Statics.field2658; var20++) {
            Statics.field1819[var20] = new class196(new class195(class122.method544("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ej.v(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2657(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field604 = new File(Statics.field611, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field604.exists()) {
            try {
                class195 var7 = new class195(Statics.field604, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3392());
                while (var8.field1844 < var8.field1849.length) {
                    int var9 = var7.method3393(var8.field1849, var8.field1844, var8.field1849.length - var8.field1844);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1844 += var9;
                }
                var8.field1844 = 0;
                int var10 = var8.method2226();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2226();
                }
                if (var10 <= 2) {
                    var4 = var8.method2125();
                    if (var11 == 1) {
                        var5 = var8.method2125();
                    }
                } else {
                    var4 = var8.method2126();
                    if (var11 == 1) {
                        var5 = var8.method2126();
                    }
                }
                var7.method3389();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method1328(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1858.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1660.length; var16++) {
                    File var17 = new File(Statics.field1660[var16] + Statics.field1858[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1328(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field611 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class195 var29 = new class195(Statics.field604, "rw", 10000L);
                class107 var30 = new class107(500);
                var30.method2102(3);
                var30.method2102(var28 == null ? 0 : 1);
                var30.method2109(var27.getPath());
                if (var28 != null) {
                    var30.method2109(((File) var28).getPath());
                }
                var29.method3391(var30.field1849, 0, var30.field1844);
                var29.method3389();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("bq.i(Ljava/io/File;ZI)Z")
    public static boolean method1328(File arg0, boolean arg1) {
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

    @ObfuscatedName("ac.g(Ljava/lang/String;Ljava/lang/String;ZI)Lgv;")
    public static class195 method555(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2508, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2114 == 33) {
            var6 = "_rc";
        } else if (Statics.field2114 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field611, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cf.x(Ldk;I)V")
    public static void method1774(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2082.method3426(0L);
            field2082.method3418(var1);
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
        arg0.method2241(var1, 0, 24);
    }

    @ObfuscatedName("aw.b(Ldk;IB)V")
    public static void method788(class107 arg0, int arg1) {
        if (field2082 == null) {
            return;
        }
        try {
            field2082.method3426(0L);
            field2082.method3417(arg0.field1849, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
