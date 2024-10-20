package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fh")
public class class168 {

    @ObfuscatedName("fh.p")
    public static class342 field2026 = null;

    @ObfuscatedName("fh.h")
    public static class342 field2027 = null;

    @ObfuscatedName("fh.k")
    public static class342 field2029 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gm.a(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3449(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2024 = arg3;
        Statics.field2317 = arg2;
        try {
            Statics.field364 = System.getProperty("os.name");
        } catch (Exception var21) {
            Statics.field364 = "Unknown";
        }
        Statics.field1300 = Statics.field364.toLowerCase();
        try {
            Statics.field251 = System.getProperty("user.home");
            if (Statics.field251 != null) {
                Statics.field251 = Statics.field251 + "/";
            }
        } catch (Exception var20) {
        }
        try {
            if (Statics.field1300.startsWith("win")) {
                if (Statics.field251 == null) {
                    Statics.field251 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field251 == null) {
                Statics.field251 = System.getenv("HOME");
            }
            if (Statics.field251 != null) {
                Statics.field251 = Statics.field251 + "/";
            }
        } catch (Exception var19) {
        }
        if (Statics.field251 == null) {
            Statics.field251 = "~/";
        }
        Statics.field1860 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field251, "/tmp/", "" };
        Statics.field3804 = new String[] { ".jagex_cache_" + Statics.field2317, ".file_store_" + Statics.field2317 };
        int var7 = 0;
        label91: while (var7 < 4) {
            Statics.field2023 = method2823(arg0, arg1, var7);
            if (!Statics.field2023.exists()) {
                Statics.field2023.mkdirs();
            }
            File[] var8 = Statics.field2023.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label91;
                }
                File var11 = var9[var10];
                boolean var14;
                try {
                    RandomAccessFile var12 = new RandomAccessFile(var11, "rw");
                    int var13 = var12.read();
                    var12.seek(0L);
                    var12.write(var13);
                    var12.seek(0L);
                    var12.close();
                    var14 = true;
                } catch (Exception var18) {
                    var14 = false;
                }
                if (!var14) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var16 = Statics.field2023;
        Statics.field2033 = var16;
        if (!Statics.field2033.exists()) {
            throw new RuntimeException("");
        }
        class170.field2032 = true;
        method172();
        field2027 = new class342(new class343(class170.method1650("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2029 = new class342(new class343(class170.method1650("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field522 = new class342[Statics.field2024];
        for (int var17 = 0; var17 < Statics.field2024; var17++) {
            Statics.field522[var17] = new class342(new class343(class170.method1650("main_file_cache.idx" + var17), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("de.t(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2823(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field510 = new File(Statics.field251, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field510.exists()) {
            try {
                class343 var7 = new class343(Statics.field510, "rw", 10000L);
                class300 var8 = new class300((int) var7.method6172());
                while (var8.field3694 < var8.field3699.length) {
                    int var9 = var7.method6159(var8.field3699, var8.field3694, var8.field3699.length - var8.field3694);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field3694 += var9;
                }
                var8.field3694 = 0;
                int var10 = var8.method5123();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5123();
                }
                if (var10 <= 2) {
                    var4 = var8.method5340();
                    if (var11 == 1) {
                        var5 = var8.method5340();
                    }
                } else {
                    var4 = var8.method5171();
                    if (var11 == 1) {
                        var5 = var8.method5171();
                    }
                }
                var7.method6156();
            } catch (IOException var45) {
                var45.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var43) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label134: for (int var19 = 0; var19 < Statics.field3804.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1860.length; var20++) {
                    File var21 = new File(Statics.field1860[var20] + Statics.field3804[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var42) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label134;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field251 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var36 = new File(var4);
            Object var37 = null;
            try {
                class343 var38 = new class343(Statics.field510, "rw", 10000L);
                class300 var39 = new class300(500);
                var39.method5253(3);
                var39.method5253(var37 == null ? 0 : 1);
                var39.method5116(var36.getPath());
                if (var37 != null) {
                    var39.method5116(((File) var37).getPath());
                }
                var38.method6158(var39.field3699, 0, var39.field3694);
                var38.method6156();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("fm.n(Ljava/lang/String;Ljava/lang/String;ZI)Lmh;")
    public static class343 method3330(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2023, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class343(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2317 == 33) {
            var6 = "_rc";
        } else if (Statics.field2317 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field251, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class343(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class343(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("x.q(I)V")
    public static void method172() {
        try {
            File var0 = new File(Statics.field251, "random.dat");
            if (var0.exists()) {
                field2026 = new class342(new class343(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3804.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1860.length; var2++) {
                        File var3 = new File(Statics.field1860[var2] + Statics.field3804[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2026 = new class342(new class343(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2026 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2026 = new class342(new class343(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dh.v(B)V")
    public static void method2726() {
        try {
            field2027.method6127();
            for (int var0 = 0; var0 < Statics.field2024; var0++) {
                Statics.field522[var0].method6127();
            }
            field2029.method6127();
            field2026.method6127();
        } catch (Exception var2) {
        }
    }
}
