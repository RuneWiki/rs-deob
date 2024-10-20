package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cs")
public class class82 {

    @ObfuscatedName("cs.j")
    public static class30 field1476 = null;

    @ObfuscatedName("cs.h")
    public static class30 field1470 = null;

    @ObfuscatedName("cs.x")
    public static class30 field1471 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.t(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method627(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1238 = arg3;
        Statics.field1464 = arg2;
        try {
            Statics.field1293 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field1293 = "Unknown";
        }
        Statics.field2073 = Statics.field1293.toLowerCase();
        try {
            Statics.field1475 = System.getProperty("user.home");
            if (Statics.field1475 != null) {
                Statics.field1475 = Statics.field1475 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field2073.startsWith("win")) {
                if (Statics.field1475 == null) {
                    Statics.field1475 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1475 == null) {
                Statics.field1475 = System.getenv("HOME");
            }
            if (Statics.field1475 != null) {
                Statics.field1475 = Statics.field1475 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field1475 == null) {
            Statics.field1475 = "~/";
        }
        Statics.field2047 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1475, "/tmp/", "" };
        Statics.field1473 = new String[] { ".jagex_cache_" + Statics.field1464, ".file_store_" + Statics.field1464 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field298 = method1335(arg0, arg1, var7);
            if (!Statics.field298.exists()) {
                Statics.field298.mkdirs();
            }
            File[] var8 = Statics.field298.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label79;
                }
                File var11 = var9[var10];
                if (!method23(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class72.method559(Statics.field298);
        method816();
        field1470 = new class30(new class29(class72.method3163("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1471 = new class30(new class29(class72.method3163("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1472 = new class30[Statics.field1238];
        for (int var12 = 0; var12 < Statics.field1238; var12++) {
            Statics.field1472[var12] = new class30(new class29(class72.method3163("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bw.l(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1335(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1466 = new File(Statics.field1475, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1466.exists()) {
            try {
                class29 var7 = new class29(Statics.field1466, "rw", 10000L);
                class127 var8 = new class127((int) var7.method568());
                while (var8.field2059 < var8.field2061.length) {
                    int var9 = var7.method569(var8.field2061, var8.field2059, var8.field2061.length - var8.field2059);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2059 += var9;
                }
                var8.field2059 = 0;
                int var10 = var8.method2438();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2438();
                }
                if (var10 <= 2) {
                    var4 = var8.method2447();
                    if (var11 == 1) {
                        var5 = var8.method2447();
                    }
                } else {
                    var4 = var8.method2430();
                    if (var11 == 1) {
                        var5 = var8.method2430();
                    }
                }
                var7.method567();
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
                if (!method23(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1473.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2047.length; var16++) {
                    File var17 = new File(Statics.field2047[var16] + Statics.field1473[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method23(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1475 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class29 var29 = new class29(Statics.field1466, "rw", 10000L);
                class127 var30 = new class127(500);
                var30.method2424(3);
                var30.method2424(var28 == null ? 0 : 1);
                var30.method2560(var27.getPath());
                if (var28 != null) {
                    var30.method2560(((File) var28).getPath());
                }
                var29.method570(var30.field2061, 0, var30.field2059);
                var29.method567();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("c.c(Ljava/io/File;ZB)Z")
    public static boolean method23(File arg0, boolean arg1) {
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

    @ObfuscatedName("da.d(Ljava/lang/String;Ljava/lang/String;ZI)Lap;")
    public static class29 method2231(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field298, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1464 == 33) {
            var6 = "_rc";
        } else if (Statics.field1464 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1475, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ah.b(B)V")
    public static void method816() {
        try {
            File var0 = new File(Statics.field1475, "random.dat");
            if (var0.exists()) {
                field1476 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1473.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2047.length; var2++) {
                        File var3 = new File(Statics.field2047[var2] + Statics.field1473[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1476 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1476 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1476 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
