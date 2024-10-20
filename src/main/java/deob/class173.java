package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gn")
public class class173 {

    @ObfuscatedName("gn.aa")
    public static class484 field1834 = null;

    @ObfuscatedName("gn.aj")
    public static class484 field1835 = null;

    @ObfuscatedName("gn.ad")
    public static class484 field1836 = null;

    public class173() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hz.at(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method3677(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1831 = arg3;
        Statics.field4999 = arg2;
        try {
            Statics.field4733 = System.getProperty("os.name");
        } catch (Exception var54) {
            Statics.field4733 = "Unknown";
        }
        Statics.field1493 = Statics.field4733.toLowerCase();
        try {
            Statics.field1660 = System.getProperty("user.home");
            if (Statics.field1660 != null) {
                Statics.field1660 = Statics.field1660 + "/";
            }
        } catch (Exception var53) {
        }
        try {
            if (Statics.field1493.startsWith("win")) {
                if (Statics.field1660 == null) {
                    Statics.field1660 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1660 == null) {
                Statics.field1660 = System.getenv("HOME");
            }
            if (Statics.field1660 != null) {
                Statics.field1660 = Statics.field1660 + "/";
            }
        } catch (Exception var52) {
        }
        if (Statics.field1660 == null) {
            Statics.field1660 = "~/";
        }
        Statics.field2117 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1660, "/tmp/", "" };
        Statics.field130 = new String[] { ".jagex_cache_" + Statics.field4999, ".file_store_" + Statics.field4999 };
        int var7 = 0;
        label261: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1830 = new File(Statics.field1660, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1830.exists()) {
                try {
                    class483 var12 = new class483(Statics.field1830, "rw", 10000L);
                    class501 var13 = new class501((int) var12.method7919());
                    while (var13.field5017 < var13.field5016.length) {
                        int var14 = var12.method7920(var13.field5016, var13.field5017, var13.field5016.length - var13.field5017);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field5017 += var14;
                    }
                    var13.field5017 = 0;
                    int var15 = var13.method8129();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method8129();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method8193();
                        if (var16 == 1) {
                            var10 = var13.method8193();
                        }
                    } else {
                        var9 = var13.method8141();
                        if (var16 == 1) {
                            var10 = var13.method8141();
                        }
                    }
                    var12.method7922();
                } catch (IOException var57) {
                    var57.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2120(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label235: for (int var20 = 0; var20 < Statics.field130.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2117.length; var21++) {
                        File var22 = new File(Statics.field2117[var21] + Statics.field130[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2120(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label235;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1660 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var56) {
                    var56.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class483 var34 = new class483(Statics.field1830, "rw", 10000L);
                    class501 var35 = new class501(500);
                    var35.method8113(3);
                    var35.method8113(var33 == null ? 0 : 1);
                    var35.method8121(var32.getPath());
                    if (var33 != null) {
                        var35.method8121(((File) var33).getPath());
                    }
                    var34.method7916(var35.field5016, 0, var35.field5017);
                    var34.method7922();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field4406 = var37;
            if (!Statics.field4406.exists()) {
                Statics.field4406.mkdirs();
            }
            File[] var38 = Statics.field4406.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method2120(var41, false)) {
                        var7++;
                        continue label261;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field4406;
        Statics.field1840 = var42;
        if (!Statics.field1840.exists()) {
            throw new RuntimeException("");
        }
        class175.field1841 = true;
        try {
            File var43 = new File(Statics.field1660, "random.dat");
            if (var43.exists()) {
                field1834 = new class484(new class483(var43, "rw", 25L), 24, 0);
            } else {
                label186: for (int var44 = 0; var44 < Statics.field130.length; var44++) {
                    for (int var45 = 0; var45 < Statics.field2117.length; var45++) {
                        File var46 = new File(Statics.field2117[var45] + Statics.field130[var44] + File.separatorChar + "random.dat");
                        if (var46.exists()) {
                            field1834 = new class484(new class483(var46, "rw", 25L), 24, 0);
                            break label186;
                        }
                    }
                }
            }
            if (field1834 == null) {
                RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
                int var48 = var47.read();
                var47.seek(0L);
                var47.write(var48);
                var47.seek(0L);
                var47.close();
                field1834 = new class484(new class483(var43, "rw", 25L), 24, 0);
            }
        } catch (IOException var55) {
        }
        field1835 = new class484(new class483(class175.method2755("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1836 = new class484(new class483(class175.method2755("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2966 = new class484[Statics.field1831];
        for (int var50 = 0; var50 < Statics.field1831; var50++) {
            Statics.field2966[var50] = new class484(new class483(class175.method2755("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dn.an(Ljava/io/File;ZB)Z")
    public static boolean method2120(File arg0, boolean arg1) {
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

    @ObfuscatedName("sb.av(Ljava/lang/String;Ljava/lang/String;ZB)Lsu;")
    public static class483 method7828(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field4406, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class483(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field4999 == 33) {
            var6 = "_rc";
        } else if (Statics.field4999 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1660, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class483(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class483(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ku.as(I)[B")
    public static byte[] method5032() {
        byte[] var0 = new byte[24];
        try {
            field1834.method7936(0L);
            field1834.method7938(var0);
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
}
