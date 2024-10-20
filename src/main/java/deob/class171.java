package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gi")
public class class171 {

    @ObfuscatedName("gi.ax")
    public static class461 field1822 = null;

    @ObfuscatedName("gi.as")
    public static class461 field1818 = null;

    @ObfuscatedName("gi.ay")
    public static class461 field1823 = null;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.aj(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2183(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1961 = arg3;
        Statics.field26 = arg2;
        try {
            Statics.field991 = System.getProperty("os.name");
        } catch (Exception var56) {
            Statics.field991 = "Unknown";
        }
        Statics.field1454 = Statics.field991.toLowerCase();
        try {
            Statics.field83 = System.getProperty("user.home");
            if (Statics.field83 != null) {
                Statics.field83 = Statics.field83 + "/";
            }
        } catch (Exception var55) {
        }
        try {
            if (Statics.field1454.startsWith("win")) {
                if (Statics.field83 == null) {
                    Statics.field83 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field83 == null) {
                Statics.field83 = System.getenv("HOME");
            }
            if (Statics.field83 != null) {
                Statics.field83 = Statics.field83 + "/";
            }
        } catch (Exception var54) {
        }
        if (Statics.field83 == null) {
            Statics.field83 = "~/";
        }
        Statics.field1781 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field83, "/tmp/", "" };
        Statics.field3778 = new String[] { ".jagex_cache_" + Statics.field26, ".file_store_" + Statics.field26 };
        int var7 = 0;
        label229: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1625 = new File(Statics.field83, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1625.exists()) {
                try {
                    class460 var12 = new class460(Statics.field1625, "rw", 10000L);
                    class478 var13 = new class478((int) var12.method7658());
                    while (var13.field4904 < var13.field4906.length) {
                        int var14 = var12.method7660(var13.field4906, var13.field4904, var13.field4906.length - var13.field4904);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field4904 += var14;
                    }
                    var13.field4904 = 0;
                    int var15 = var13.method7909();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method7909();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method8144();
                        if (var16 == 1) {
                            var10 = var13.method8144();
                        }
                    } else {
                        var9 = var13.method7915();
                        if (var16 == 1) {
                            var10 = var13.method7915();
                        }
                    }
                    var12.method7678();
                } catch (IOException var58) {
                    var58.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    boolean var22;
                    try {
                        RandomAccessFile var20 = new RandomAccessFile(var19, "rw");
                        int var21 = var20.read();
                        var20.seek(0L);
                        var20.write(var21);
                        var20.seek(0L);
                        var20.close();
                        var19.delete();
                        var22 = true;
                    } catch (Exception var53) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label204: for (int var24 = 0; var24 < Statics.field3778.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field1781.length; var25++) {
                        File var26 = new File(Statics.field1781[var25] + Statics.field3778[var24] + File.separatorChar + arg0 + File.separatorChar);
                        if (var26.exists()) {
                            File var27 = new File(var26, "test.dat");
                            boolean var30;
                            try {
                                RandomAccessFile var28 = new RandomAccessFile(var27, "rw");
                                int var29 = var28.read();
                                var28.seek(0L);
                                var28.write(var29);
                                var28.seek(0L);
                                var28.close();
                                var27.delete();
                                var30 = true;
                            } catch (Exception var52) {
                                var30 = false;
                            }
                            if (var30) {
                                var9 = var26.toString();
                                var11 = true;
                                break label204;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field83 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var32 = new File(var10);
                File var33 = new File(var9);
                try {
                    File[] var34 = var32.listFiles();
                    File[] var35 = var34;
                    for (int var36 = 0; var36 < var35.length; var36++) {
                        File var37 = var35[var36];
                        File var38 = new File(var33, var37.getName());
                        boolean var39 = var37.renameTo(var38);
                        if (!var39) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var57) {
                    var57.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method5779(new File(var9), (File) null);
            }
            File var41 = new File(var9);
            Statics.field322 = var41;
            if (!Statics.field322.exists()) {
                Statics.field322.mkdirs();
            }
            File[] var42 = Statics.field322.listFiles();
            if (var42 != null) {
                File[] var43 = var42;
                for (int var44 = 0; var44 < var43.length; var44++) {
                    File var45 = var43[var44];
                    boolean var48;
                    try {
                        RandomAccessFile var46 = new RandomAccessFile(var45, "rw");
                        int var47 = var46.read();
                        var46.seek(0L);
                        var46.write(var47);
                        var46.seek(0L);
                        var46.close();
                        var48 = true;
                    } catch (Exception var51) {
                        var48 = false;
                    }
                    if (!var48) {
                        var7++;
                        continue label229;
                    }
                }
            }
            break;
        }
        Statics.method2828(Statics.field322);
        method2053();
        field1818 = new class461(new class460(class173.method2832("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1823 = new class461(new class460(class173.method2832("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1824 = new class461[Statics.field1961];
        for (int var50 = 0; var50 < Statics.field1961; var50++) {
            Statics.field1824[var50] = new class461(new class460(class173.method2832("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("mc.al(Ljava/io/File;Ljava/io/File;I)V")
    public static void method5779(File arg0, File arg1) {
        try {
            class460 var2 = new class460(Statics.field1625, "rw", 10000L);
            class478 var3 = new class478(500);
            var3.method7886(3);
            var3.method7886(arg1 == null ? 0 : 1);
            var3.method7895(arg0.getPath());
            if (arg1 != null) {
                var3.method7895(arg1.getPath());
            }
            var2.method7662(var3.field4906, 0, var3.field4904);
            var2.method7678();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("nb.ac(Ljava/lang/String;Ljava/lang/String;ZI)Lre;")
    public static class460 method6049(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field322, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class460(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field26 == 33) {
            var6 = "_rc";
        } else if (Statics.field26 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field83, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class460(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class460(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("du.ab(B)V")
    public static void method2053() {
        try {
            File var0 = new File(Statics.field83, "random.dat");
            if (var0.exists()) {
                field1822 = new class461(new class460(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3778.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1781.length; var2++) {
                        File var3 = new File(Statics.field1781[var2] + Statics.field3778[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1822 = new class461(new class460(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1822 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1822 = new class461(new class460(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cu.an(Lsy;II)V")
    public static void method1955(class478 arg0, int arg1) {
        if (field1822 == null) {
            return;
        }
        try {
            field1822.method7684(0L);
            field1822.method7689(arg0.field4906, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("jq.ao(I)V")
    public static void method4732() {
        try {
            field1818.method7683();
            for (int var0 = 0; var0 < Statics.field1961; var0++) {
                Statics.field1824[var0].method7683();
            }
            field1823.method7683();
            field1822.method7683();
        } catch (Exception var2) {
        }
    }
}
