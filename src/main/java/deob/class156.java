package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("em")
public class class156 {

    @ObfuscatedName("em.s")
    public static class103 field2224 = null;

    @ObfuscatedName("em.o")
    public static class103 field2225 = null;

    @ObfuscatedName("em.p")
    public static class103 field2229 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.d(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method37(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2219 = arg3;
        Statics.field2228 = arg2;
        try {
            Statics.field2220 = System.getProperty("os.name");
        } catch (Exception var53) {
            Statics.field2220 = "Unknown";
        }
        Statics.field782 = Statics.field2220.toLowerCase();
        try {
            Statics.field721 = System.getProperty("user.home");
            if (Statics.field721 != null) {
                Statics.field721 = Statics.field721 + "/";
            }
        } catch (Exception var52) {
        }
        try {
            if (Statics.field782.startsWith("win")) {
                if (Statics.field721 == null) {
                    Statics.field721 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field721 == null) {
                Statics.field721 = System.getenv("HOME");
            }
            if (Statics.field721 != null) {
                Statics.field721 = Statics.field721 + "/";
            }
        } catch (Exception var51) {
        }
        if (Statics.field721 == null) {
            Statics.field721 = "~/";
        }
        Statics.field2195 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field721, "/tmp/", "" };
        Statics.field854 = new String[] { ".jagex_cache_" + Statics.field2228, ".file_store_" + Statics.field2228 };
        int var7 = 0;
        label257: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2222 = new File(Statics.field721, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2222.exists()) {
                try {
                    class104 var12 = new class104(Statics.field2222, "rw", 10000L);
                    class174 var13 = new class174((int) var12.method1758());
                    while (var13.field2364 < var13.field2367.length) {
                        int var14 = var12.method1759(var13.field2367, var13.field2364, var13.field2367.length - var13.field2364);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2364 += var14;
                    }
                    var13.field2364 = 0;
                    int var15 = var13.method2921();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2921();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2923();
                        if (var16 == 1) {
                            var10 = var13.method2923();
                        }
                    } else {
                        var9 = var13.method3041();
                        if (var16 == 1) {
                            var10 = var13.method3041();
                        }
                    }
                    var12.method1762();
                } catch (IOException var56) {
                    var56.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method317(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label231: for (int var20 = 0; var20 < Statics.field854.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2195.length; var21++) {
                        File var22 = new File(Statics.field2195[var21] + Statics.field854[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method317(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label231;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field721 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var55) {
                    var55.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class104 var34 = new class104(Statics.field2222, "rw", 10000L);
                    class174 var35 = new class174(500);
                    var35.method2899(3);
                    var35.method2899(var33 == null ? 0 : 1);
                    var35.method2907(var32.getPath());
                    if (var33 != null) {
                        var35.method2907(((File) var33).getPath());
                    }
                    var34.method1760(var35.field2367, 0, var35.field2364);
                    var34.method1762();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2218 = var37;
            if (!Statics.field2218.exists()) {
                Statics.field2218.mkdirs();
            }
            File[] var38 = Statics.field2218.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method317(var41, false)) {
                        var7++;
                        continue label257;
                    }
                }
            }
            break;
        }
        class158.method1013(Statics.field2218);
        try {
            File var42 = new File(Statics.field721, "random.dat");
            if (var42.exists()) {
                field2224 = new class103(new class104(var42, "rw", 25L), 24, 0);
            } else {
                label184: for (int var43 = 0; var43 < Statics.field854.length; var43++) {
                    for (int var44 = 0; var44 < Statics.field2195.length; var44++) {
                        File var45 = new File(Statics.field2195[var44] + Statics.field854[var43] + File.separatorChar + "random.dat");
                        if (var45.exists()) {
                            field2224 = new class103(new class104(var45, "rw", 25L), 24, 0);
                            break label184;
                        }
                    }
                }
            }
            if (field2224 == null) {
                RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                int var47 = var46.read();
                var46.seek(0L);
                var46.write(var47);
                var46.seek(0L);
                var46.close();
                field2224 = new class103(new class104(var42, "rw", 25L), 24, 0);
            }
        } catch (IOException var54) {
        }
        field2225 = new class103(new class104(class158.method1999("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2229 = new class103(new class104(class158.method1999("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2227 = new class103[Statics.field2219];
        for (int var49 = 0; var49 < Statics.field2219; var49++) {
            Statics.field2227[var49] = new class103(new class104(class158.method1999("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ae.q(Ljava/io/File;ZB)Z")
    public static boolean method317(File arg0, boolean arg1) {
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

    @ObfuscatedName("ay.x(Ljava/lang/String;Ljava/lang/String;ZI)Lcn;")
    public static class104 method535(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2218, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class104(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2228 == 33) {
            var6 = "_rc";
        } else if (Statics.field2228 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field721, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class104(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class104(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.y(B)[B")
    public static byte[] method688() {
        byte[] var0 = new byte[24];
        try {
            field2224.method1723(0L);
            field2224.method1725(var0);
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
