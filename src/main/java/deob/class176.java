package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ga")
public class class176 {

    @ObfuscatedName("ga.ag")
    public static class516 field1884 = null;

    @ObfuscatedName("ga.ai")
    public static class516 field1885 = null;

    @ObfuscatedName("ga.ax")
    public static class516 field1880 = null;

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ts.az(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method7903(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field4559 = arg4;
        Statics.field4572 = arg3;
        try {
            Statics.field1481 = System.getProperty("os.name");
        } catch (Exception var60) {
            Statics.field1481 = "Unknown";
        }
        Statics.field2957 = Statics.field1481.toLowerCase();
        Statics.field1625 = null;
        try {
            Statics.field1625 = System.getProperty("jagex.userhome");
        } catch (Exception var59) {
        }
        if (Statics.field1625 == null) {
            try {
                Statics.field1625 = System.getProperty("user.home");
            } catch (Exception var58) {
            }
        }
        if (Statics.field1625 != null) {
            Statics.field1625 = Statics.field1625 + "/";
        }
        try {
            if (Statics.field2957.startsWith("win")) {
                if (Statics.field1625 == null) {
                    Statics.field1625 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1625 == null) {
                Statics.field1625 = System.getenv("HOME");
            }
            if (Statics.field1625 != null) {
                Statics.field1625 = Statics.field1625 + "/";
            }
        } catch (Exception var57) {
        }
        if (Statics.field1625 == null) {
            Statics.field1625 = "~/";
        }
        Statics.field1328 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1625, "/tmp/", "" };
        Statics.field424 = new String[] { ".jagex_cache_" + Statics.field4572, ".file_store_" + Statics.field4572 };
        int var9 = 0;
        label250: while (var9 < 4) {
            String var10 = var9 == 0 ? "" : "" + var9;
            Statics.field1987 = new File(Statics.field1625, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
            String var11 = null;
            String var12 = null;
            boolean var13 = false;
            if (Statics.field1987.exists()) {
                try {
                    class515 var14 = new class515(Statics.field1987, "rw", 10000L);
                    class535 var15 = new class535((int) var14.method8243());
                    while (var15.field5233 < var15.field5231.length) {
                        int var16 = var14.method8238(var15.field5231, var15.field5233, var15.field5231.length - var15.field5233);
                        if (var16 == -1) {
                            throw new IOException();
                        }
                        var15.field5233 += var16;
                    }
                    var15.field5233 = 0;
                    int var17 = var15.method8462();
                    if (var17 < 1 || var17 > 3) {
                        throw new IOException("" + var17);
                    }
                    int var18 = 0;
                    if (var17 > 1) {
                        var18 = var15.method8462();
                    }
                    if (var17 <= 2) {
                        var11 = var15.method8474();
                        if (var18 == 1) {
                            var12 = var15.method8474();
                        }
                    } else {
                        var11 = var15.method8475();
                        if (var18 == 1) {
                            var12 = var15.method8475();
                        }
                    }
                    var14.method8247();
                } catch (IOException var62) {
                    var62.printStackTrace();
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
                    } catch (Exception var56) {
                        var24 = false;
                    }
                    if (!var24) {
                        var11 = null;
                    }
                }
            }
            if (var11 == null && var9 == 0) {
                label224: for (int var26 = 0; var26 < Statics.field424.length; var26++) {
                    for (int var27 = 0; var27 < Statics.field1328.length; var27++) {
                        File var28 = new File(Statics.field1328[var27] + Statics.field424[var26] + File.separatorChar + arg0 + File.separatorChar);
                        if (var28.exists()) {
                            File var29 = new File(var28, "test.dat");
                            boolean var32;
                            try {
                                RandomAccessFile var30 = new RandomAccessFile(var29, "rw");
                                int var31 = var30.read();
                                var30.seek(0L);
                                var30.write(var31);
                                var30.seek(0L);
                                var30.close();
                                var29.delete();
                                var32 = true;
                            } catch (Exception var55) {
                                var32 = false;
                            }
                            if (var32) {
                                var11 = var28.toString();
                                var13 = true;
                                break label224;
                            }
                        }
                    }
                }
            }
            if (var11 == null) {
                var11 = Statics.field1625 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
                var13 = true;
            }
            if (var12 != null) {
                File var34 = new File(var12);
                File var35 = new File(var11);
                try {
                    File[] var36 = var34.listFiles();
                    File[] var37 = var36;
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        File var39 = var37[var38];
                        File var40 = new File(var35, var39.getName());
                        boolean var41 = var39.renameTo(var40);
                        if (!var41) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var61) {
                    var61.printStackTrace();
                }
                var13 = true;
            }
            if (var13) {
                method3202(new File(var11), (File) null);
            }
            File var43 = new File(var11);
            Statics.field1881 = var43;
            if (!Statics.field1881.exists()) {
                Statics.field1881.mkdirs();
            }
            File[] var44 = Statics.field1881.listFiles();
            if (var44 != null) {
                File[] var45 = var44;
                for (int var46 = 0; var46 < var45.length; var46++) {
                    File var47 = var45[var46];
                    boolean var50;
                    try {
                        RandomAccessFile var48 = new RandomAccessFile(var47, "rw");
                        int var49 = var48.read();
                        var48.seek(0L);
                        var48.write(var49);
                        var48.seek(0L);
                        var48.close();
                        var50 = true;
                    } catch (Exception var54) {
                        var50 = false;
                    }
                    if (!var50) {
                        var9++;
                        continue label250;
                    }
                }
            }
            break;
        }
        File var52 = Statics.field1881;
        Statics.field1889 = var52;
        if (!Statics.field1889.exists()) {
            throw new RuntimeException("");
        }
        class178.field1892 = true;
        method2982();
        field1885 = new class516(new class515(class178.method2862("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1880 = new class516(new class515(class178.method2862("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1483 = new class516[Statics.field4559];
        for (int var53 = 0; var53 < Statics.field4559; var53++) {
            Statics.field1483[var53] = new class516(new class515(class178.method2862("main_file_cache.idx" + var53), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("gy.ah(Ljava/io/File;Ljava/io/File;I)V")
    public static void method3202(File arg0, File arg1) {
        try {
            class515 var2 = new class515(Statics.field1987, "rw", 10000L);
            class535 var3 = new class535(500);
            var3.method8445(3);
            var3.method8445(arg1 == null ? 0 : 1);
            var3.method8526(arg0.getPath());
            if (arg1 != null) {
                var3.method8526(arg1.getPath());
            }
            var2.method8234(var3.field5231, 0, var3.field5233);
            var2.method8247();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("gi.af(Ljava/lang/String;Ljava/lang/String;ZB)Ltz;")
    public static class515 method3126(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1881, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class515(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field4572 == 33) {
            var6 = "_rc";
        } else if (Statics.field4572 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1625, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class515(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class515(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.at(I)V")
    public static void method2982() {
        try {
            File var0 = new File(Statics.field1625, "random.dat");
            if (var0.exists()) {
                field1884 = new class516(new class515(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field424.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1328.length; var2++) {
                        File var3 = new File(Statics.field1328[var2] + Statics.field424[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1884 = new class516(new class515(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1884 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1884 = new class516(new class515(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("di.an(I)[B")
    public static byte[] method2226() {
        byte[] var0 = new byte[24];
        try {
            field1884.method8282(0L);
            field1884.method8260(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }

    @ObfuscatedName("ju.ao(Lur;II)V")
    public static void method4514(class535 arg0, int arg1) {
        if (field1884 == null) {
            return;
        }
        try {
            field1884.method8282(0L);
            field1884.method8266(arg0.field5231, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ov.ab(B)V")
    public static void method6324() {
        try {
            field1885.method8261();
            for (int var0 = 0; var0 < Statics.field4559; var0++) {
                Statics.field1483[var0].method8261();
            }
            field1880.method8261();
            field1884.method8261();
        } catch (Exception var2) {
        }
    }
}
