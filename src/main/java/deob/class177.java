package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fj")
public class class177 {

    @ObfuscatedName("fj.y")
    public static class352 field2072 = null;

    @ObfuscatedName("fj.c")
    public static class352 field2079 = null;

    @ObfuscatedName("fj.h")
    public static class352 field2069 = null;

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.m(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1938(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field230 = arg3;
        Statics.field2139 = arg2;
        try {
            Statics.field2588 = System.getProperty("os.name");
        } catch (Exception var50) {
            Statics.field2588 = "Unknown";
        }
        Statics.field2078 = Statics.field2588.toLowerCase();
        try {
            Statics.field548 = System.getProperty("user.home");
            if (Statics.field548 != null) {
                Statics.field548 = Statics.field548 + "/";
            }
        } catch (Exception var49) {
        }
        try {
            if (Statics.field2078.startsWith("win")) {
                if (Statics.field548 == null) {
                    Statics.field548 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field548 == null) {
                Statics.field548 = System.getenv("HOME");
            }
            if (Statics.field548 != null) {
                Statics.field548 = Statics.field548 + "/";
            }
        } catch (Exception var48) {
        }
        if (Statics.field548 == null) {
            Statics.field548 = "~/";
        }
        Statics.field3097 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field548, "/tmp/", "" };
        Statics.field591 = new String[] { ".jagex_cache_" + Statics.field2139, ".file_store_" + Statics.field2139 };
        int var7 = 0;
        label222: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2071 = new File(Statics.field548, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2071.exists()) {
                try {
                    class353 var12 = new class353(Statics.field2071, "rw", 10000L);
                    class310 var13 = new class310((int) var12.method6227());
                    while (var13.field3734 < var13.field3736.length) {
                        int var14 = var12.method6228(var13.field3736, var13.field3734, var13.field3736.length - var13.field3734);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field3734 += var14;
                    }
                    var13.field3734 = 0;
                    int var15 = var13.method5227();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method5227();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method5403();
                        if (var16 == 1) {
                            var10 = var13.method5403();
                        }
                    } else {
                        var9 = var13.method5458();
                        if (var16 == 1) {
                            var10 = var13.method5458();
                        }
                    }
                    var12.method6232();
                } catch (IOException var52) {
                    var52.printStackTrace();
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
                    } catch (Exception var47) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label196: for (int var24 = 0; var24 < Statics.field591.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field3097.length; var25++) {
                        File var26 = new File(Statics.field3097[var25] + Statics.field591[var24] + File.separatorChar + arg0 + File.separatorChar);
                        if (var26.exists() && method40(new File(var26, "test.dat"), true)) {
                            var9 = var26.toString();
                            var11 = true;
                            break label196;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field548 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var27 = new File(var10);
                File var28 = new File(var9);
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
                } catch (Exception var51) {
                    var51.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method1612(new File(var9), (File) null);
            }
            File var36 = new File(var9);
            Statics.field2076 = var36;
            if (!Statics.field2076.exists()) {
                Statics.field2076.mkdirs();
            }
            File[] var37 = Statics.field2076.listFiles();
            if (var37 != null) {
                File[] var38 = var37;
                for (int var39 = 0; var39 < var38.length; var39++) {
                    File var40 = var38[var39];
                    boolean var43;
                    try {
                        RandomAccessFile var41 = new RandomAccessFile(var40, "rw");
                        int var42 = var41.read();
                        var41.seek(0L);
                        var41.write(var42);
                        var41.seek(0L);
                        var41.close();
                        var43 = true;
                    } catch (Exception var46) {
                        var43 = false;
                    }
                    if (!var43) {
                        var7++;
                        continue label222;
                    }
                }
            }
            break;
        }
        class179.method3647(Statics.field2076);
        method3592();
        field2079 = new class352(new class353(class179.method3877("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2069 = new class352(new class353(class179.method3877("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2068 = new class352[Statics.field230];
        for (int var45 = 0; var45 < Statics.field230; var45++) {
            Statics.field2068[var45] = new class352(new class353(class179.method3877("main_file_cache.idx" + var45), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("client.o(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1612(File arg0, File arg1) {
        try {
            class353 var2 = new class353(Statics.field2071, "rw", 10000L);
            class310 var3 = new class310(500);
            var3.method5437(3);
            var3.method5437(arg1 == null ? 0 : 1);
            var3.method5219(arg0.getPath());
            if (arg1 != null) {
                var3.method5219(arg1.getPath());
            }
            var2.method6223(var3.field3736, 0, var3.field3734);
            var2.method6232();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("p.q(Ljava/io/File;ZS)Z")
    public static boolean method40(File arg0, boolean arg1) {
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

    @ObfuscatedName("bn.j(Ljava/lang/String;Ljava/lang/String;ZI)Lmy;")
    public static class353 method958(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2076, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class353(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2139 == 33) {
            var6 = "_rc";
        } else if (Statics.field2139 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field548, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class353(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class353(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hm.p(B)V")
    public static void method3592() {
        try {
            File var0 = new File(Statics.field548, "random.dat");
            if (var0.exists()) {
                field2072 = new class352(new class353(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field591.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field3097.length; var2++) {
                        File var3 = new File(Statics.field3097[var2] + Statics.field591[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2072 = new class352(new class353(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2072 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2072 = new class352(new class353(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("be.g(Lkn;IB)V")
    public static void method746(class310 arg0, int arg1) {
        if (field2072 == null) {
            return;
        }
        try {
            field2072.method6200(0L);
            field2072.method6198(arg0.field3736, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dg.n(B)V")
    public static void method2376() {
        try {
            field2079.method6197();
            for (int var0 = 0; var0 < Statics.field230; var0++) {
                Statics.field2068[var0].method6197();
            }
            field2069.method6197();
            field2072.method6197();
        } catch (Exception var2) {
        }
    }
}
