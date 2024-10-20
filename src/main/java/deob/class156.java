package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("en")
public class class156 {

    @ObfuscatedName("en.o")
    public static class124 field2258 = null;

    @ObfuscatedName("en.x")
    public static class124 field2255 = null;

    @ObfuscatedName("en.a")
    public static class124 field2260 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.n(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method62(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2254 = arg3;
        Statics.field3160 = arg2;
        try {
            Statics.field3690 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field3690 = "Unknown";
        }
        Statics.field2204 = Statics.field3690.toLowerCase();
        try {
            Statics.field15 = System.getProperty("user.home");
            if (Statics.field15 != null) {
                Statics.field15 = Statics.field15 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field2204.startsWith("win")) {
                if (Statics.field15 == null) {
                    Statics.field15 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field15 == null) {
                Statics.field15 = System.getenv("HOME");
            }
            if (Statics.field15 != null) {
                Statics.field15 = Statics.field15 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field15 == null) {
            Statics.field15 = "~/";
        }
        Statics.field500 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field15, "/tmp/", "" };
        Statics.field2261 = new String[] { ".jagex_cache_" + Statics.field3160, ".file_store_" + Statics.field3160 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field348 = method1013(arg0, arg1, var7);
            if (!Statics.field348.exists()) {
                Statics.field348.mkdirs();
            }
            File[] var8 = Statics.field348.listFiles();
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
                if (!method979(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field348;
        Statics.field2269 = var12;
        if (!Statics.field2269.exists()) {
            throw new RuntimeException("");
        }
        class158.field2271 = true;
        try {
            File var13 = new File(Statics.field15, "random.dat");
            if (var13.exists()) {
                field2258 = new class124(new class125(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field2261.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field500.length; var15++) {
                        File var16 = new File(Statics.field500[var15] + Statics.field2261[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2258 = new class124(new class125(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2258 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2258 = new class124(new class125(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2255 = new class124(new class125(class158.method193("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2260 = new class124(new class125(class158.method193("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field433 = new class124[Statics.field2254];
        for (int var20 = 0; var20 < Statics.field2254; var20++) {
            Statics.field433[var20] = new class124(new class125(class158.method193("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bw.p(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1013(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field768 = new File(Statics.field15, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field768.exists()) {
            try {
                class125 var7 = new class125(Statics.field768, "rw", 10000L);
                class174 var8 = new class174((int) var7.method2179());
                while (var8.field2400 < var8.field2401.length) {
                    int var9 = var7.method2178(var8.field2401, var8.field2400, var8.field2401.length - var8.field2400);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2400 += var9;
                }
                var8.field2400 = 0;
                int var10 = var8.method2925();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2925();
                }
                if (var10 <= 2) {
                    var4 = var8.method3025();
                    if (var11 == 1) {
                        var5 = var8.method3025();
                    }
                } else {
                    var4 = var8.method3083();
                    if (var11 == 1) {
                        var5 = var8.method3083();
                    }
                }
                var7.method2177();
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
                if (!method979(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2261.length; var15++) {
                for (int var16 = 0; var16 < Statics.field500.length; var16++) {
                    File var17 = new File(Statics.field500[var16] + Statics.field2261[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method979(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field15 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class125 var29 = new class125(Statics.field768, "rw", 10000L);
                class174 var30 = new class174(500);
                var30.method2906(3);
                var30.method2906(var28 == null ? 0 : 1);
                var30.method2914(var27.getPath());
                if (var28 != null) {
                    var30.method2914(((File) var28).getPath());
                }
                var29.method2175(var30.field2401, 0, var30.field2400);
                var29.method2177();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("by.i(Ljava/io/File;ZI)Z")
    public static boolean method979(File arg0, boolean arg1) {
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

    @ObfuscatedName("fw.j(Ljava/lang/String;Ljava/lang/String;ZS)Ldg;")
    public static class125 method2821(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field348, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3160 == 33) {
            var6 = "_rc";
        } else if (Statics.field3160 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field15, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("aa.f(I)V")
    public static void method240() {
        try {
            field2255.method2160();
            for (int var0 = 0; var0 < Statics.field2254; var0++) {
                Statics.field433[var0].method2160();
            }
            field2260.method2160();
            field2258.method2160();
        } catch (Exception var2) {
        }
    }
}
