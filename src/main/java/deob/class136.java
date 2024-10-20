package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eh")
public class class136 {

    @ObfuscatedName("eh.c")
    public static class193 field2091 = null;

    @ObfuscatedName("eh.f")
    public static class193 field2083 = null;

    @ObfuscatedName("eh.o")
    public static class193 field2093 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.y(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method549(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2925 = arg3;
        Statics.field2836 = arg2;
        try {
            Statics.field137 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field137 = "Unknown";
        }
        Statics.field2884 = Statics.field137.toLowerCase();
        try {
            Statics.field2651 = System.getProperty("user.home");
            if (Statics.field2651 != null) {
                Statics.field2651 = Statics.field2651 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field2884.startsWith("win")) {
                if (Statics.field2651 == null) {
                    Statics.field2651 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2651 == null) {
                Statics.field2651 = System.getenv("HOME");
            }
            if (Statics.field2651 != null) {
                Statics.field2651 = Statics.field2651 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field2651 == null) {
            Statics.field2651 = "~/";
        }
        Statics.field622 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2651, "/tmp/", "" };
        Statics.field1953 = new String[] { ".jagex_cache_" + Statics.field2836, ".file_store_" + Statics.field2836 };
        int var7 = 0;
        label225: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2090 = new File(Statics.field2651, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2090.exists()) {
                try {
                    class192 var12 = new class192(Statics.field2090, "rw", 10000L);
                    class107 var13 = new class107((int) var12.method3382());
                    while (var13.field1854 < var13.field1856.length) {
                        int var14 = var12.method3383(var13.field1856, var13.field1854, var13.field1856.length - var13.field1854);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1854 += var14;
                    }
                    var13.field1854 = 0;
                    int var15 = var13.method2109();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2109();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2118();
                        if (var16 == 1) {
                            var10 = var13.method2118();
                        }
                    } else {
                        var9 = var13.method2218();
                        if (var16 == 1) {
                            var10 = var13.method2218();
                        }
                    }
                    var12.method3381();
                } catch (IOException var49) {
                    var49.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method1328(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label199: for (int var20 = 0; var20 < Statics.field1953.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field622.length; var21++) {
                        File var22 = new File(Statics.field622[var21] + Statics.field1953[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1328(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label199;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field2651 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var48) {
                    var48.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class192 var34 = new class192(Statics.field2090, "rw", 10000L);
                    class107 var35 = new class107(500);
                    var35.method2278(3);
                    var35.method2278(var33 == null ? 0 : 1);
                    var35.method2102(var32.getPath());
                    if (var33 != null) {
                        var35.method2102(((File) var33).getPath());
                    }
                    var34.method3386(var35.field1856, 0, var35.field1854);
                    var34.method3381();
                } catch (IOException var44) {
                    var44.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2087 = var37;
            if (!Statics.field2087.exists()) {
                Statics.field2087.mkdirs();
            }
            File[] var38 = Statics.field2087.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method1328(var41, false)) {
                        var7++;
                        continue label225;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field2087;
        Statics.field1933 = var42;
        if (!Statics.field1933.exists()) {
            throw new RuntimeException("");
        }
        class122.field1935 = true;
        method2402();
        field2083 = new class193(new class192(class122.method142("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2093 = new class193(new class192(class122.method142("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field233 = new class193[Statics.field2925];
        for (int var43 = 0; var43 < Statics.field2925; var43++) {
            Statics.field233[var43] = new class193(new class192(class122.method142("main_file_cache.idx" + var43), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bo.u(Ljava/io/File;ZB)Z")
    public static boolean method1328(File arg0, boolean arg1) {
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

    @ObfuscatedName("dv.v(I)V")
    public static void method2402() {
        try {
            File var0 = new File(Statics.field2651, "random.dat");
            if (var0.exists()) {
                field2091 = new class193(new class192(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1953.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field622.length; var2++) {
                        File var3 = new File(Statics.field622[var2] + Statics.field1953[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2091 = new class193(new class192(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2091 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2091 = new class193(new class192(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ce.l(Ldo;I)V")
    public static void method2049(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2091.method3422(0L);
            field2091.method3406(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var5) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2098(var1, 0, 24);
    }
}
