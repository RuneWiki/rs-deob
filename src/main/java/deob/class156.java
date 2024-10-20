package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ef")
public class class156 {

    @ObfuscatedName("ef.b")
    public static class110 field1969 = null;

    @ObfuscatedName("ef.n")
    public static class110 field1970 = null;

    @ObfuscatedName("ef.f")
    public static class110 field1971 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.z(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method3212(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1914 = arg3;
        Statics.field1886 = arg2;
        try {
            Statics.field2588 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field2588 = "Unknown";
        }
        Statics.field1066 = Statics.field2588.toLowerCase();
        try {
            Statics.field144 = System.getProperty("user.home");
            if (Statics.field144 != null) {
                Statics.field144 = Statics.field144 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field1066.startsWith("win")) {
                if (Statics.field144 == null) {
                    Statics.field144 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field144 == null) {
                Statics.field144 = System.getenv("HOME");
            }
            if (Statics.field144 != null) {
                Statics.field144 = Statics.field144 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field144 == null) {
            Statics.field144 = "~/";
        }
        Statics.field1966 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field144, "/tmp/", "" };
        Statics.field53 = new String[] { ".jagex_cache_" + Statics.field1886, ".file_store_" + Statics.field1886 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field1967 = method1476(arg0, arg1, var7);
            if (!Statics.field1967.exists()) {
                Statics.field1967.mkdirs();
            }
            File[] var8 = Statics.field1967.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label83;
                }
                File var11 = var9[var10];
                if (!Statics.method1656(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field1967;
        Statics.field1975 = var12;
        if (!Statics.field1975.exists()) {
            throw new RuntimeException("");
        }
        class159.field1980 = true;
        method437();
        field1970 = new class110(new class111(class159.method2997("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1971 = new class110(new class111(class159.method2997("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1069 = new class110[Statics.field1914];
        for (int var13 = 0; var13 < Statics.field1914; var13++) {
            Statics.field1069[var13] = new class110(new class111(class159.method2997("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bb.w(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;")
    public static File method1476(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1965 = new File(Statics.field144, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1965.exists()) {
            try {
                class111 var7 = new class111(Statics.field1965, "rw", 10000L);
                class183 var8 = new class183((int) var7.method2305());
                while (var8.field2340 < var8.field2339.length) {
                    int var9 = var7.method2306(var8.field2339, var8.field2340, var8.field2339.length - var8.field2340);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2340 += var9;
                }
                var8.field2340 = 0;
                int var10 = var8.method3247();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3247();
                }
                if (var10 <= 2) {
                    var4 = var8.method3261();
                    if (var11 == 1) {
                        var5 = var8.method3261();
                    }
                } else {
                    var4 = var8.method3262();
                    if (var11 == 1) {
                        var5 = var8.method3262();
                    }
                }
                var7.method2303();
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
                if (!Statics.method1656(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field53.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1966.length; var16++) {
                    File var17 = new File(Statics.field1966[var16] + Statics.field53[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && Statics.method1656(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field144 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class111 var29 = new class111(Statics.field1965, "rw", 10000L);
                class183 var30 = new class183(500);
                var30.method3235(3);
                var30.method3235(var28 == null ? 0 : 1);
                var30.method3244(var27.getPath());
                if (var28 != null) {
                    var30.method3244(((File) var28).getPath());
                }
                var29.method2302(var30.field2339, 0, var30.field2340);
                var29.method2303();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("d.l(Ljava/lang/String;Ljava/lang/String;ZI)Ldv;")
    public static class111 method264(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1967, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class111(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1886 == 33) {
            var6 = "_rc";
        } else if (Statics.field1886 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field144, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class111(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class111(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("aw.u(I)V")
    public static void method437() {
        try {
            File var0 = new File(Statics.field144, "random.dat");
            if (var0.exists()) {
                field1969 = new class110(new class111(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field53.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1966.length; var2++) {
                        File var3 = new File(Statics.field1966[var2] + Statics.field53[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1969 = new class110(new class111(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1969 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1969 = new class110(new class111(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("et.q(Lgk;IB)V")
    public static void method2959(class183 arg0, int arg1) {
        if (field1969 == null) {
            return;
        }
        try {
            field1969.method2272(0L);
            field1969.method2277(arg0.field2339, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
