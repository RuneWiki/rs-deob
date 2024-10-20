package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ey")
public class class149 {

    @ObfuscatedName("ey.h")
    public static class228 field2238 = null;

    @ObfuscatedName("ey.z")
    public static class228 field2243 = null;

    @ObfuscatedName("ey.w")
    public static class228 field2250 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.v(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method159(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1948 = arg3;
        Statics.field1031 = arg2;
        try {
            Statics.field2246 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field2246 = "Unknown";
        }
        Statics.field2651 = Statics.field2246.toLowerCase();
        try {
            Statics.field1942 = System.getProperty("user.home");
            if (Statics.field1942 != null) {
                Statics.field1942 = Statics.field1942 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field2651.startsWith("win")) {
                if (Statics.field1942 == null) {
                    Statics.field1942 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1942 == null) {
                Statics.field1942 = System.getenv("HOME");
            }
            if (Statics.field1942 != null) {
                Statics.field1942 = Statics.field1942 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field1942 == null) {
            Statics.field1942 = "~/";
        }
        Statics.field2245 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1942, "/tmp/", "" };
        Statics.field1092 = new String[] { ".jagex_cache_" + Statics.field1031, ".file_store_" + Statics.field1031 };
        int var7 = 0;
        label225: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2239 = new File(Statics.field1942, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2239.exists()) {
                try {
                    class227 var12 = new class227(Statics.field2239, "rw", 10000L);
                    class119 var13 = new class119((int) var12.method3840());
                    while (var13.field1984 < var13.field1988.length) {
                        int var14 = var12.method3841(var13.field1988, var13.field1984, var13.field1988.length - var13.field1984);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1984 += var14;
                    }
                    var13.field1984 = 0;
                    int var15 = var13.method2400();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2400();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2366();
                        if (var16 == 1) {
                            var10 = var13.method2366();
                        }
                    } else {
                        var9 = var13.method2359();
                        if (var16 == 1) {
                            var10 = var13.method2359();
                        }
                    }
                    var12.method3848();
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
                    if (!method1588(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label199: for (int var20 = 0; var20 < Statics.field1092.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2245.length; var21++) {
                        File var22 = new File(Statics.field2245[var21] + Statics.field1092[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1588(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label199;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1942 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                    class227 var34 = new class227(Statics.field2239, "rw", 10000L);
                    class119 var35 = new class119(500);
                    var35.method2398(3);
                    var35.method2398(var33 == null ? 0 : 1);
                    var35.method2343(var32.getPath());
                    if (var33 != null) {
                        var35.method2343(((File) var33).getPath());
                    }
                    var34.method3839(var35.field1988, 0, var35.field1984);
                    var34.method3848();
                } catch (IOException var44) {
                    var44.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2240 = var37;
            if (!Statics.field2240.exists()) {
                Statics.field2240.mkdirs();
            }
            File[] var38 = Statics.field2240.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method1588(var41, false)) {
                        var7++;
                        continue label225;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field2240;
        Statics.field2086 = var42;
        if (!Statics.field2086.exists()) {
            throw new RuntimeException("");
        }
        class135.field2087 = true;
        method238();
        field2243 = new class228(new class227(Statics.method38("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2250 = new class228(new class227(Statics.method38("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1889 = new class228[Statics.field1948];
        for (int var43 = 0; var43 < Statics.field1948; var43++) {
            Statics.field1889[var43] = new class228(new class227(Statics.method38("main_file_cache.idx" + var43), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bh.f(Ljava/io/File;ZI)Z")
    public static boolean method1588(File arg0, boolean arg1) {
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

    @ObfuscatedName("fi.i(Ljava/lang/String;Ljava/lang/String;ZB)Lhs;")
    public static class227 method3213(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2240, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1031 == 33) {
            var6 = "_rc";
        } else if (Statics.field1031 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1942, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class227(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class227(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("m.d(I)V")
    public static void method238() {
        try {
            File var0 = new File(Statics.field1942, "random.dat");
            if (var0.exists()) {
                field2238 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1092.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2245.length; var2++) {
                        File var3 = new File(Statics.field2245[var2] + Statics.field1092[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2238 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2238 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2238 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("q.o(Ldx;B)V")
    public static void method171(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2238.method3857(0L);
            field2238.method3859(var1);
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
        arg0.method2344(var1, 0, 24);
    }

    @ObfuscatedName("di.c(Ldx;II)V")
    public static void method2635(class119 arg0, int arg1) {
        if (field2238 == null) {
            return;
        }
        try {
            field2238.method3857(0L);
            field2238.method3864(arg0.field1988, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
