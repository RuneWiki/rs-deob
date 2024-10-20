package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("er")
public class class150 {

    @ObfuscatedName("er.p")
    public static class229 field2220 = null;

    @ObfuscatedName("er.n")
    public static class229 field2221 = null;

    @ObfuscatedName("er.w")
    public static class229 field2222 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.b(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method36(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2217 = arg3;
        Statics.field2022 = arg2;
        try {
            Statics.field2126 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field2126 = "Unknown";
        }
        Statics.field1939 = Statics.field2126.toLowerCase();
        try {
            Statics.field1986 = System.getProperty("user.home");
            if (Statics.field1986 != null) {
                Statics.field1986 = Statics.field1986 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field1939.startsWith("win")) {
                if (Statics.field1986 == null) {
                    Statics.field1986 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1986 == null) {
                Statics.field1986 = System.getenv("HOME");
            }
            if (Statics.field1986 != null) {
                Statics.field1986 = Statics.field1986 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field1986 == null) {
            Statics.field1986 = "~/";
        }
        Statics.field2223 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1986, "/tmp/", "" };
        Statics.field1994 = new String[] { ".jagex_cache_" + Statics.field2022, ".file_store_" + Statics.field2022 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field1760 = method737(arg0, arg1, var7);
            if (!Statics.field1760.exists()) {
                Statics.field1760.mkdirs();
            }
            File[] var8 = Statics.field1760.listFiles();
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
                if (!method2656(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field1760;
        Statics.field2063 = var12;
        if (!Statics.field2063.exists()) {
            throw new RuntimeException("");
        }
        class136.field2072 = true;
        try {
            File var13 = new File(Statics.field1986, "random.dat");
            if (var13.exists()) {
                field2220 = new class229(new class228(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field1994.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field2223.length; var15++) {
                        File var16 = new File(Statics.field2223[var15] + Statics.field1994[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2220 = new class229(new class228(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2220 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2220 = new class229(new class228(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2221 = new class229(new class228(class136.method2282("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2222 = new class229(new class228(class136.method2282("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field622 = new class229[Statics.field2217];
        for (int var20 = 0; var20 < Statics.field2217; var20++) {
            Statics.field622[var20] = new class229(new class228(class136.method2282("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ar.g(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method737(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3172 = new File(Statics.field1986, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3172.exists()) {
            try {
                class228 var7 = new class228(Statics.field3172, "rw", 10000L);
                class120 var8 = new class120((int) var7.method3837());
                while (var8.field1977 < var8.field1983.length) {
                    int var9 = var7.method3842(var8.field1983, var8.field1977, var8.field1983.length - var8.field1977);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1977 += var9;
                }
                var8.field1977 = 0;
                int var10 = var8.method2344();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2344();
                }
                if (var10 <= 2) {
                    var4 = var8.method2357();
                    if (var11 == 1) {
                        var5 = var8.method2357();
                    }
                } else {
                    var4 = var8.method2470();
                    if (var11 == 1) {
                        var5 = var8.method2470();
                    }
                }
                var7.method3840();
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
                if (!method2656(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1994.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2223.length; var16++) {
                    File var17 = new File(Statics.field2223[var16] + Statics.field1994[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2656(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1986 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class228 var29 = new class228(Statics.field3172, "rw", 10000L);
                class120 var30 = new class120(500);
                var30.method2480(3);
                var30.method2480(var28 == null ? 0 : 1);
                var30.method2337(var27.getPath());
                if (var28 != null) {
                    var30.method2337(((File) var28).getPath());
                }
                var29.method3851(var30.field1983, 0, var30.field1977);
                var29.method3840();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("dp.j(Ljava/io/File;ZI)Z")
    public static boolean method2656(File arg0, boolean arg1) {
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

    @ObfuscatedName("ey.d(Ljava/lang/String;Ljava/lang/String;ZI)Lhy;")
    public static class228 method2798(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1760, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class228(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2022 == 33) {
            var6 = "_rc";
        } else if (Statics.field2022 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1986, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class228(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class228(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fb.x(Lds;B)V")
    public static void method3214(class120 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2220.method3870(0L);
            field2220.method3858(var1);
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
        arg0.method2338(var1, 0, 24);
    }

    @ObfuscatedName("dk.y(I)V")
    public static void method2680() {
        try {
            field2221.method3855();
            for (int var0 = 0; var0 < Statics.field2217; var0++) {
                Statics.field622[var0].method3855();
            }
            field2222.method3855();
            field2220.method3855();
        } catch (Exception var2) {
        }
    }
}
