package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cn")
public class class82 {

    @ObfuscatedName("cn.z")
    public static class30 field1415 = null;

    @ObfuscatedName("cn.o")
    public static class30 field1413 = null;

    @ObfuscatedName("cn.u")
    public static class30 field1412 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.j(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method670(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1409 = arg3;
        Statics.field256 = arg2;
        try {
            Statics.field1661 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field1661 = "Unknown";
        }
        Statics.field1417 = Statics.field1661.toLowerCase();
        try {
            Statics.field1992 = System.getProperty("user.home");
            if (Statics.field1992 != null) {
                Statics.field1992 = Statics.field1992 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field1417.startsWith("win")) {
                if (Statics.field1992 == null) {
                    Statics.field1992 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1992 == null) {
                Statics.field1992 = System.getenv("HOME");
            }
            if (Statics.field1992 != null) {
                Statics.field1992 = Statics.field1992 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field1992 == null) {
            Statics.field1992 = "~/";
        }
        Statics.field1416 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1992, "/tmp/", "" };
        Statics.field233 = new String[] { ".jagex_cache_" + Statics.field256, ".file_store_" + Statics.field256 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field1414 = method171(arg0, arg1, var7);
            if (!Statics.field1414.exists()) {
                Statics.field1414.mkdirs();
            }
            File[] var8 = Statics.field1414.listFiles();
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
                if (!method3069(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field1414;
        Statics.field1293 = var12;
        if (!Statics.field1293.exists()) {
            throw new RuntimeException("");
        }
        class72.field1294 = true;
        method1532();
        field1413 = new class30(new class29(class72.method546("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1412 = new class30(new class29(class72.method546("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1406 = new class30[Statics.field1409];
        for (int var13 = 0; var13 < Statics.field1409; var13++) {
            Statics.field1406[var13] = new class30(new class29(class72.method546("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("w.r(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method171(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1411 = new File(Statics.field1992, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1411.exists()) {
            try {
                class29 var7 = new class29(Statics.field1411, "rw", 10000L);
                class127 var8 = new class127((int) var7.method553());
                while (var8.field2022 < var8.field2025.length) {
                    int var9 = var7.method560(var8.field2025, var8.field2022, var8.field2025.length - var8.field2022);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2022 += var9;
                }
                var8.field2022 = 0;
                int var10 = var8.method2441();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2441();
                }
                if (var10 <= 2) {
                    var4 = var8.method2520();
                    if (var11 == 1) {
                        var5 = var8.method2520();
                    }
                } else {
                    var4 = var8.method2451();
                    if (var11 == 1) {
                        var5 = var8.method2451();
                    }
                }
                var7.method554();
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
                if (!method3069(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field233.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1416.length; var16++) {
                    File var17 = new File(Statics.field1416[var16] + Statics.field233[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method3069(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1992 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class29 var29 = new class29(Statics.field1411, "rw", 10000L);
                class127 var30 = new class127(500);
                var30.method2482(3);
                var30.method2482(var28 == null ? 0 : 1);
                var30.method2434(var27.getPath());
                if (var28 != null) {
                    var30.method2434(((File) var28).getPath());
                }
                var29.method567(var30.field2025, 0, var30.field2022);
                var29.method554();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ei.v(Ljava/io/File;ZI)Z")
    public static boolean method3069(File arg0, boolean arg1) {
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

    @ObfuscatedName("az.p(Ljava/lang/String;Ljava/lang/String;ZB)Lau;")
    public static class29 method1186(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1414, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field256 == 33) {
            var6 = "_rc";
        } else if (Statics.field256 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1992, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class29(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class29(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bj.e(S)V")
    public static void method1532() {
        try {
            File var0 = new File(Statics.field1992, "random.dat");
            if (var0.exists()) {
                field1415 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field233.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1416.length; var2++) {
                        File var3 = new File(Statics.field1416[var2] + Statics.field233[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1415 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1415 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1415 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("fo.d(Ldn;I)V")
    public static void method3148(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1415.method571(0L);
            field1415.method573(var1);
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
        arg0.method2435(var1, 0, 24);
    }

    @ObfuscatedName("q.y(Ldn;II)V")
    public static void method160(class127 arg0, int arg1) {
        if (field1415 == null) {
            return;
        }
        try {
            field1415.method571(0L);
            field1415.method597(arg0.field2025, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
