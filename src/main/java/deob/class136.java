package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eu")
public class class136 {

    @ObfuscatedName("eu.r")
    public static class194 field2077 = null;

    @ObfuscatedName("eu.o")
    public static class194 field2078 = null;

    @ObfuscatedName("eu.f")
    public static class194 field2079 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.z(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2665(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2070 = arg3;
        Statics.field1929 = arg2;
        try {
            Statics.field1974 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field1974 = "Unknown";
        }
        Statics.field18 = Statics.field1974.toLowerCase();
        try {
            Statics.field1246 = System.getProperty("user.home");
            if (Statics.field1246 != null) {
                Statics.field1246 = Statics.field1246 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field18.startsWith("win")) {
                if (Statics.field1246 == null) {
                    Statics.field1246 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1246 == null) {
                Statics.field1246 = System.getenv("HOME");
            }
            if (Statics.field1246 != null) {
                Statics.field1246 = Statics.field1246 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1246 == null) {
            Statics.field1246 = "~/";
        }
        Statics.field1918 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1246, "/tmp/", "" };
        Statics.field2076 = new String[] { ".jagex_cache_" + Statics.field1929, ".file_store_" + Statics.field1929 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field2073 = method171(arg0, arg1, var7);
            if (!Statics.field2073.exists()) {
                Statics.field2073.mkdirs();
            }
            File[] var8 = Statics.field2073.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label115;
                }
                File var11 = var9[var10];
                if (!method567(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class122.method2811(Statics.field2073);
        try {
            File var12 = new File(Statics.field1246, "random.dat");
            if (var12.exists()) {
                field2077 = new class194(new class193(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field2076.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field1918.length; var14++) {
                        File var15 = new File(Statics.field1918[var14] + Statics.field2076[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2077 = new class194(new class193(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2077 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2077 = new class194(new class193(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2078 = new class194(new class193(class122.method527("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2079 = new class194(new class193(class122.method527("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2074 = new class194[Statics.field2070];
        for (int var19 = 0; var19 < Statics.field2070; var19++) {
            Statics.field2074[var19] = new class194(new class193(class122.method527("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("w.j(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method171(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2072 = new File(Statics.field1246, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2072.exists()) {
            try {
                class193 var7 = new class193(Statics.field2072, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3454());
                while (var8.field1819 < var8.field1823.length) {
                    int var9 = var7.method3444(var8.field1823, var8.field1819, var8.field1823.length - var8.field1819);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1819 += var9;
                }
                var8.field1819 = 0;
                int var10 = var8.method2122();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2122();
                }
                if (var10 <= 2) {
                    var4 = var8.method2131();
                    if (var11 == 1) {
                        var5 = var8.method2131();
                    }
                } else {
                    var4 = var8.method2132();
                    if (var11 == 1) {
                        var5 = var8.method2132();
                    }
                }
                var7.method3437();
            } catch (IOException var28) {
                var28.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method567(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2076.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1918.length; var16++) {
                    File var17 = new File(Statics.field1918[var16] + Statics.field2076[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method567(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1246 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var18 = new File(var5);
            File var19 = new File(var4);
            try {
                File[] var20 = var18.listFiles();
                File[] var21 = var20;
                for (int var22 = 0; var22 < var21.length; var22++) {
                    File var23 = var21[var22];
                    File var24 = new File(var19, var23.getName());
                    boolean var25 = var23.renameTo(var24);
                    if (!var25) {
                        throw new IOException();
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            Statics.method1855(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ag.y(Ljava/io/File;ZI)Z")
    public static boolean method567(File arg0, boolean arg1) {
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

    @ObfuscatedName("de.b(I)V")
    public static void method2485() {
        try {
            field2078.method3468();
            for (int var0 = 0; var0 < Statics.field2070; var0++) {
                Statics.field2074[var0].method3468();
            }
            field2079.method3468();
            field2077.method3468();
        } catch (Exception var2) {
        }
    }
}
