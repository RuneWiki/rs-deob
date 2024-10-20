package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fp")
public class class158 {

    @ObfuscatedName("fp.c")
    public static class427 field1771 = null;

    @ObfuscatedName("fp.w")
    public static class427 field1765 = null;

    @ObfuscatedName("fp.b")
    public static class427 field1773 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.o(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2044(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1415 = arg3;
        Statics.field57 = arg2;
        try {
            Statics.field1777 = System.getProperty("os.name");
        } catch (Exception var28) {
            Statics.field1777 = "Unknown";
        }
        Statics.field2749 = Statics.field1777.toLowerCase();
        try {
            Statics.field4353 = System.getProperty("user.home");
            if (Statics.field4353 != null) {
                Statics.field4353 = Statics.field4353 + "/";
            }
        } catch (Exception var27) {
        }
        try {
            if (Statics.field2749.startsWith("win")) {
                if (Statics.field4353 == null) {
                    Statics.field4353 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field4353 == null) {
                Statics.field4353 = System.getenv("HOME");
            }
            if (Statics.field4353 != null) {
                Statics.field4353 = Statics.field4353 + "/";
            }
        } catch (Exception var26) {
        }
        if (Statics.field4353 == null) {
            Statics.field4353 = "~/";
        }
        Statics.field1006 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field4353, "/tmp/", "" };
        Statics.field1094 = new String[] { ".jagex_cache_" + Statics.field57, ".file_store_" + Statics.field57 };
        int var7 = 0;
        label127: while (var7 < 4) {
            Statics.field1767 = method3422(arg0, arg1, var7);
            if (!Statics.field1767.exists()) {
                Statics.field1767.mkdirs();
            }
            File[] var8 = Statics.field1767.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label127;
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
                } catch (Exception var25) {
                    var14 = false;
                }
                if (!var14) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var16 = Statics.field1767;
        Statics.field1779 = var16;
        if (!Statics.field1779.exists()) {
            throw new RuntimeException("");
        }
        class160.field1782 = true;
        try {
            File var17 = new File(Statics.field4353, "random.dat");
            if (var17.exists()) {
                field1771 = new class427(new class426(var17, "rw", 25L), 24, 0);
            } else {
                label106: for (int var18 = 0; var18 < Statics.field1094.length; var18++) {
                    for (int var19 = 0; var19 < Statics.field1006.length; var19++) {
                        File var20 = new File(Statics.field1006[var19] + Statics.field1094[var18] + File.separatorChar + "random.dat");
                        if (var20.exists()) {
                            field1771 = new class427(new class426(var20, "rw", 25L), 24, 0);
                            break label106;
                        }
                    }
                }
            }
            if (field1771 == null) {
                RandomAccessFile var21 = new RandomAccessFile(var17, "rw");
                int var22 = var21.read();
                var21.seek(0L);
                var21.write(var22);
                var21.seek(0L);
                var21.close();
                field1771 = new class427(new class426(var17, "rw", 25L), 24, 0);
            }
        } catch (IOException var29) {
        }
        field1765 = new class427(new class426(class160.method2994("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1773 = new class427(new class426(class160.method2994("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1774 = new class427[Statics.field1415];
        for (int var24 = 0; var24 < Statics.field1415; var24++) {
            Statics.field1774[var24] = new class427(new class426(class160.method2994("main_file_cache.idx" + var24), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("gq.q(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3422(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1768 = new File(Statics.field4353, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1768.exists()) {
            try {
                class426 var7 = new class426(Statics.field1768, "rw", 10000L);
                class440 var8 = new class440((int) var7.method6724());
                while (var8.field4678 < var8.field4679.length) {
                    int var9 = var7.method6731(var8.field4679, var8.field4678, var8.field4679.length - var8.field4678);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4678 += var9;
                }
                var8.field4678 = 0;
                int var10 = var8.method7071();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method7071();
                }
                if (var10 <= 2) {
                    var4 = var8.method6904();
                    if (var11 == 1) {
                        var5 = var8.method6904();
                    }
                } else {
                    var4 = var8.method6905();
                    if (var11 == 1) {
                        var5 = var8.method6905();
                    }
                }
                var7.method6725();
            } catch (IOException var39) {
                var39.printStackTrace();
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
                } catch (Exception var37) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label119: for (int var19 = 0; var19 < Statics.field1094.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1006.length; var20++) {
                    File var21 = new File(Statics.field1006[var20] + Statics.field1094[var19] + File.separatorChar + arg0 + File.separatorChar);
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
                        } catch (Exception var36) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label119;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field4353 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var38) {
                var38.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method4608(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ju.l(Ljava/io/File;Ljava/io/File;I)V")
    public static void method4608(File arg0, File arg1) {
        try {
            class426 var2 = new class426(Statics.field1768, "rw", 10000L);
            class440 var3 = new class440(500);
            var3.method6876(3);
            var3.method6876(arg1 == null ? 0 : 1);
            var3.method6885(arg0.getPath());
            if (arg1 != null) {
                var3.method6885(arg1.getPath());
            }
            var2.method6735(var3.field4679, 0, var3.field4678);
            var2.method6725();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("dy.k(Ljava/lang/String;Ljava/lang/String;ZI)Lpu;")
    public static class426 method2457(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1767, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class426(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field57 == 33) {
            var6 = "_rc";
        } else if (Statics.field57 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field4353, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class426(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class426(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
