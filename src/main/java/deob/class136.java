package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eh")
public class class136 {

    @ObfuscatedName("eh.r")
    public static class197 field2103 = null;

    @ObfuscatedName("eh.j")
    public static class197 field2104 = null;

    @ObfuscatedName("eh.c")
    public static class197 field2105 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.g(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method116(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1837 = arg3;
        Statics.field1493 = arg2;
        try {
            Statics.field2682 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field2682 = "Unknown";
        }
        Statics.field1955 = Statics.field2682.toLowerCase();
        try {
            Statics.field979 = System.getProperty("user.home");
            if (Statics.field979 != null) {
                Statics.field979 = Statics.field979 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field1955.startsWith("win")) {
                if (Statics.field979 == null) {
                    Statics.field979 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field979 == null) {
                Statics.field979 = System.getenv("HOME");
            }
            if (Statics.field979 != null) {
                Statics.field979 = Statics.field979 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field979 == null) {
            Statics.field979 = "~/";
        }
        Statics.field1289 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field979, "/tmp/", "" };
        Statics.field1302 = new String[] { ".jagex_cache_" + Statics.field1493, ".file_store_" + Statics.field1493 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field2099 = method153(arg0, arg1, var7);
            if (!Statics.field2099.exists()) {
                Statics.field2099.mkdirs();
            }
            File[] var8 = Statics.field2099.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label83;
                }
                File var11 = var9[var10];
                if (!method2343(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2099;
        Statics.field1950 = var12;
        if (!Statics.field1950.exists()) {
            throw new RuntimeException("");
        }
        class122.field1952 = true;
        method1568();
        field2104 = new class197(new class196(class122.method1574("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2105 = new class197(new class196(class122.method1574("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field977 = new class197[Statics.field1837];
        for (int var13 = 0; var13 < Statics.field1837; var13++) {
            Statics.field977[var13] = new class197(new class196(class122.method1574("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("n.s(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method153(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2048 = new File(Statics.field979, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2048.exists()) {
            try {
                class196 var7 = new class196(Statics.field2048, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3403());
                while (var8.field1851 < var8.field1854.length) {
                    int var9 = var7.method3399(var8.field1854, var8.field1851, var8.field1854.length - var8.field1851);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1851 += var9;
                }
                var8.field1851 = 0;
                int var10 = var8.method2116();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2116();
                }
                if (var10 <= 2) {
                    var4 = var8.method2101();
                    if (var11 == 1) {
                        var5 = var8.method2101();
                    }
                } else {
                    var4 = var8.method2080();
                    if (var11 == 1) {
                        var5 = var8.method2080();
                    }
                }
                var7.method3406();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method2343(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1302.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1289.length; var16++) {
                    File var17 = new File(Statics.field1289[var16] + Statics.field1302[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2343(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field979 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class196 var29 = new class196(Statics.field2048, "rw", 10000L);
                class107 var30 = new class107(500);
                var30.method2079(3);
                var30.method2079(var28 == null ? 0 : 1);
                var30.method2120(var27.getPath());
                if (var28 != null) {
                    var30.method2120(((File) var28).getPath());
                }
                var29.method3401(var30.field1854, 0, var30.field1851);
                var29.method3406();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("da.v(Ljava/io/File;ZI)Z")
    public static boolean method2343(File arg0, boolean arg1) {
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

    @ObfuscatedName("cl.o(Ljava/lang/String;Ljava/lang/String;ZI)Lgl;")
    public static class196 method1840(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2099, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class196(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1493 == 33) {
            var6 = "_rc";
        } else if (Statics.field1493 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field979, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class196(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class196(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.k(S)V")
    public static void method1568() {
        try {
            File var0 = new File(Statics.field979, "random.dat");
            if (var0.exists()) {
                field2103 = new class197(new class196(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1302.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1289.length; var2++) {
                        File var3 = new File(Statics.field1289[var2] + Statics.field1302[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2103 = new class197(new class196(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2103 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2103 = new class197(new class196(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("n.m(Lde;B)V")
    public static void method154(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2103.method3437(0L);
            field2103.method3423(var1);
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
        arg0.method2187(var1, 0, 24);
    }
}
