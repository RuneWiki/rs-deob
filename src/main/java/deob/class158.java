package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fw")
public class class158 {

    @ObfuscatedName("fw.m")
    public static class112 field2039 = null;

    @ObfuscatedName("fw.d")
    public static class112 field2029 = null;

    @ObfuscatedName("fw.j")
    public static class112 field2030 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.g(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1027(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2025 = arg3;
        Statics.field2034 = arg2;
        try {
            Statics.field1955 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field1955 = "Unknown";
        }
        Statics.field285 = Statics.field1955.toLowerCase();
        try {
            Statics.field207 = System.getProperty("user.home");
            if (Statics.field207 != null) {
                Statics.field207 = Statics.field207 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field285.startsWith("win")) {
                if (Statics.field207 == null) {
                    Statics.field207 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field207 == null) {
                Statics.field207 = System.getenv("HOME");
            }
            if (Statics.field207 != null) {
                Statics.field207 = Statics.field207 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field207 == null) {
            Statics.field207 = "~/";
        }
        Statics.field2647 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field207, "/tmp/", "" };
        Statics.field67 = new String[] { ".jagex_cache_" + Statics.field2034, ".file_store_" + Statics.field2034 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2024 = new File(Statics.field207, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2024.exists()) {
                try {
                    class113 var12 = new class113(Statics.field2024, "rw", 10000L);
                    class185 var13 = new class185((int) var12.method2517());
                    while (var13.field2406 < var13.field2405.length) {
                        int var14 = var12.method2518(var13.field2405, var13.field2406, var13.field2405.length - var13.field2406);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2406 += var14;
                    }
                    var13.field2406 = 0;
                    int var15 = var13.method3679();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method3679();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method3475();
                        if (var16 == 1) {
                            var10 = var13.method3475();
                        }
                    } else {
                        var9 = var13.method3476();
                        if (var16 == 1) {
                            var10 = var13.method3476();
                        }
                    }
                    var12.method2515();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method3708(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field67.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2647.length; var21++) {
                        File var22 = new File(Statics.field2647[var21] + Statics.field67[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method3708(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field207 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var49) {
                    var49.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method3266(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field520 = var32;
            if (!Statics.field520.exists()) {
                Statics.field520.mkdirs();
            }
            File[] var33 = Statics.field520.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method3708(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        class161.method3105(Statics.field520);
        try {
            File var37 = new File(Statics.field207, "random.dat");
            if (var37.exists()) {
                field2039 = new class112(new class113(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field67.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field2647.length; var39++) {
                        File var40 = new File(Statics.field2647[var39] + Statics.field67[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field2039 = new class112(new class113(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field2039 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field2039 = new class112(new class113(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field2029 = new class112(new class113(class161.method586("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2030 = new class112(new class113(class161.method586("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2031 = new class112[Statics.field2025];
        for (int var44 = 0; var44 < Statics.field2025; var44++) {
            Statics.field2031[var44] = new class112(new class113(class161.method586("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("fa.r(Ljava/io/File;Ljava/io/File;I)V")
    public static void method3266(File arg0, File arg1) {
        try {
            class113 var2 = new class113(Statics.field2024, "rw", 10000L);
            class185 var3 = new class185(500);
            var3.method3501(3);
            var3.method3501(arg1 == null ? 0 : 1);
            var3.method3685(arg0.getPath());
            if (arg1 != null) {
                var3.method3685(arg1.getPath());
            }
            var2.method2514(var3.field2405, 0, var3.field2406);
            var2.method2515();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ga.e(Ljava/io/File;ZI)Z")
    public static boolean method3708(File arg0, boolean arg1) {
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

    @ObfuscatedName("w.q(Ljava/lang/String;Ljava/lang/String;ZI)Ldn;")
    public static class113 method86(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field520, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class113(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2034 == 33) {
            var6 = "_rc";
        } else if (Statics.field2034 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field207, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class113(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class113(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dn.c(I)V")
    public static void method2521() {
        try {
            field2029.method2480();
            for (int var0 = 0; var0 < Statics.field2025; var0++) {
                Statics.field2031[var0].method2480();
            }
            field2030.method2480();
            field2039.method2480();
        } catch (Exception var2) {
        }
    }
}
