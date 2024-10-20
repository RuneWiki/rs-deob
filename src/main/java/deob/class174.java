package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gp")
public class class174 {

    @ObfuscatedName("gp.aq")
    public static class496 field1864 = null;

    @ObfuscatedName("gp.al")
    public static class496 field1865 = null;

    @ObfuscatedName("gp.an")
    public static class496 field1866 = null;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.au(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2155(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field1863 = arg4;
        Statics.field1867 = arg3;
        try {
            Statics.field492 = System.getProperty("os.name");
        } catch (Exception var49) {
            Statics.field492 = "Unknown";
        }
        Statics.field1423 = Statics.field492.toLowerCase();
        Statics.field258 = null;
        try {
            Statics.field258 = System.getProperty("jagex.userhome");
        } catch (Exception var48) {
        }
        if (Statics.field258 == null) {
            try {
                Statics.field258 = System.getProperty("user.home");
            } catch (Exception var47) {
            }
        }
        if (Statics.field258 != null) {
            Statics.field258 = Statics.field258 + "/";
        }
        try {
            if (Statics.field1423.startsWith("win")) {
                if (Statics.field258 == null) {
                    Statics.field258 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field258 == null) {
                Statics.field258 = System.getenv("HOME");
            }
            if (Statics.field258 != null) {
                Statics.field258 = Statics.field258 + "/";
            }
        } catch (Exception var46) {
        }
        if (Statics.field258 == null) {
            Statics.field258 = "~/";
        }
        Statics.field4515 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field258, "/tmp/", "" };
        Statics.field1868 = new String[] { ".jagex_cache_" + Statics.field1867, ".file_store_" + Statics.field1867 };
        int var9 = 0;
        label233: while (var9 < 4) {
            String var10 = var9 == 0 ? "" : "" + var9;
            Statics.field1870 = new File(Statics.field258, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
            String var11 = null;
            String var12 = null;
            boolean var13 = false;
            if (Statics.field1870.exists()) {
                try {
                    class495 var14 = new class495(Statics.field1870, "rw", 10000L);
                    class515 var15 = new class515((int) var14.method8080());
                    while (var15.field5111 < var15.field5108.length) {
                        int var16 = var14.method8081(var15.field5108, var15.field5111, var15.field5108.length - var15.field5111);
                        if (var16 == -1) {
                            throw new IOException();
                        }
                        var15.field5111 += var16;
                    }
                    var15.field5111 = 0;
                    int var17 = var15.method8300();
                    if (var17 < 1 || var17 > 3) {
                        throw new IOException("" + var17);
                    }
                    int var18 = 0;
                    if (var17 > 1) {
                        var18 = var15.method8300();
                    }
                    if (var17 <= 2) {
                        var11 = var15.method8452();
                        if (var18 == 1) {
                            var12 = var15.method8452();
                        }
                    } else {
                        var11 = var15.method8393();
                        if (var18 == 1) {
                            var12 = var15.method8393();
                        }
                    }
                    var14.method8094();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
                if (var11 != null) {
                    File var20 = new File(var11);
                    if (!var20.exists()) {
                        var11 = null;
                    }
                }
                if (var11 != null) {
                    File var21 = new File(var11, "test.dat");
                    boolean var24;
                    try {
                        RandomAccessFile var22 = new RandomAccessFile(var21, "rw");
                        int var23 = var22.read();
                        var22.seek(0L);
                        var22.write(var23);
                        var22.seek(0L);
                        var22.close();
                        var21.delete();
                        var24 = true;
                    } catch (Exception var45) {
                        var24 = false;
                    }
                    if (!var24) {
                        var11 = null;
                    }
                }
            }
            if (var11 == null && var9 == 0) {
                label208: for (int var26 = 0; var26 < Statics.field1868.length; var26++) {
                    for (int var27 = 0; var27 < Statics.field4515.length; var27++) {
                        File var28 = new File(Statics.field4515[var27] + Statics.field1868[var26] + File.separatorChar + arg0 + File.separatorChar);
                        if (var28.exists() && method1125(new File(var28, "test.dat"), true)) {
                            var11 = var28.toString();
                            var13 = true;
                            break label208;
                        }
                    }
                }
            }
            if (var11 == null) {
                var11 = Statics.field258 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
                var13 = true;
            }
            if (var12 != null) {
                File var29 = new File(var12);
                File var30 = new File(var11);
                try {
                    File[] var31 = var29.listFiles();
                    File[] var32 = var31;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        File var34 = var32[var33];
                        File var35 = new File(var30, var34.getName());
                        boolean var36 = var34.renameTo(var35);
                        if (!var36) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var50) {
                    var50.printStackTrace();
                }
                var13 = true;
            }
            if (var13) {
                method3101(new File(var11), (File) null);
            }
            File var38 = new File(var11);
            Statics.field1862 = var38;
            if (!Statics.field1862.exists()) {
                Statics.field1862.mkdirs();
            }
            File[] var39 = Statics.field1862.listFiles();
            if (var39 != null) {
                File[] var40 = var39;
                for (int var41 = 0; var41 < var40.length; var41++) {
                    File var42 = var40[var41];
                    if (!method1125(var42, false)) {
                        var9++;
                        continue label233;
                    }
                }
            }
            break;
        }
        File var43 = Statics.field1862;
        Statics.field1872 = var43;
        if (!Statics.field1872.exists()) {
            throw new RuntimeException("");
        }
        class176.field1871 = true;
        method3245();
        field1865 = new class496(new class495(Statics.method5208("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1866 = new class496(new class495(Statics.method5208("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2855 = new class496[Statics.field1863];
        for (int var44 = 0; var44 < Statics.field1863; var44++) {
            Statics.field2855[var44] = new class496(new class495(Statics.method5208("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("gb.ae(Ljava/io/File;Ljava/io/File;I)V")
    public static void method3101(File arg0, File arg1) {
        try {
            class495 var2 = new class495(Statics.field1870, "rw", 10000L);
            class515 var3 = new class515(500);
            var3.method8283(3);
            var3.method8283(arg1 == null ? 0 : 1);
            var3.method8280(arg0.getPath());
            if (arg1 != null) {
                var3.method8280(arg1.getPath());
            }
            var2.method8077(var3.field5108, 0, var3.field5111);
            var2.method8094();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("co.ao(Ljava/io/File;ZI)Z")
    public static boolean method1125(File arg0, boolean arg1) {
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

    @ObfuscatedName("cx.at(Ljava/lang/String;Ljava/lang/String;ZI)Ltu;")
    public static class495 method1076(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1862, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class495(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1867 == 33) {
            var6 = "_rc";
        } else if (Statics.field1867 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field258, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class495(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class495(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ga.ac(B)V")
    public static void method3245() {
        try {
            File var0 = new File(Statics.field258, "random.dat");
            if (var0.exists()) {
                field1864 = new class496(new class495(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1868.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field4515.length; var2++) {
                        File var3 = new File(Statics.field4515[var2] + Statics.field1868[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1864 = new class496(new class495(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1864 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1864 = new class496(new class495(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("an.ai(Ltm;II)V")
    public static void method154(class515 arg0, int arg1) {
        if (field1864 == null) {
            return;
        }
        try {
            field1864.method8105(0L);
            field1864.method8110(arg0.field5108, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ty.az(S)V")
    public static void method8235() {
        try {
            field1865.method8104();
            for (int var0 = 0; var0 < Statics.field1863; var0++) {
                Statics.field2855[var0].method8104();
            }
            field1866.method8104();
            field1864.method8104();
        } catch (Exception var2) {
        }
    }
}
