package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cl")
public class class81 {

    @ObfuscatedName("cl.l")
    public static class29 field1416 = null;

    @ObfuscatedName("cl.o")
    public static class29 field1417 = null;

    @ObfuscatedName("cl.h")
    public static class29 field1418 = null;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.v(Ljava/lang/String;Ljava/lang/String;IIS)V")
    public static void method198(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1776 = arg3;
        Statics.field82 = arg2;
        try {
            Statics.field1278 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field1278 = "Unknown";
        }
        Statics.field109 = Statics.field1278.toLowerCase();
        try {
            Statics.field2435 = System.getProperty("user.home");
            if (Statics.field2435 != null) {
                Statics.field2435 = Statics.field2435 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field109.startsWith("win")) {
                if (Statics.field2435 == null) {
                    Statics.field2435 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2435 == null) {
                Statics.field2435 = System.getenv("HOME");
            }
            if (Statics.field2435 != null) {
                Statics.field2435 = Statics.field2435 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field2435 == null) {
            Statics.field2435 = "~/";
        }
        Statics.field339 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2435, "/tmp/", "" };
        Statics.field2552 = new String[] { ".jagex_cache_" + Statics.field82, ".file_store_" + Statics.field82 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field1413 = method102(arg0, arg1, var7);
            if (!Statics.field1413.exists()) {
                Statics.field1413.mkdirs();
            }
            File[] var8 = Statics.field1413.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label119;
                }
                File var11 = var9[var10];
                if (!method2451(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field1413;
        Statics.field1284 = var12;
        if (!Statics.field1284.exists()) {
            throw new RuntimeException("");
        }
        class71.field1287 = true;
        try {
            File var13 = new File(Statics.field2435, "random.dat");
            if (var13.exists()) {
                field1416 = new class29(new class28(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field2552.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field339.length; var15++) {
                        File var16 = new File(Statics.field339[var15] + Statics.field2552[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field1416 = new class29(new class28(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field1416 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field1416 = new class29(new class28(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field1417 = new class29(new class28(class71.method552("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1418 = new class29(new class28(class71.method552("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field938 = new class29[Statics.field1776];
        for (int var20 = 0; var20 < Statics.field1776; var20++) {
            Statics.field938[var20] = new class29(new class28(class71.method552("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("s.f(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method102(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field193 = new File(Statics.field2435, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field193.exists()) {
            try {
                class28 var7 = new class28(Statics.field193, "rw", 10000L);
                class126 var8 = new class126((int) var7.method558());
                while (var8.field2027 < var8.field2029.length) {
                    int var9 = var7.method570(var8.field2029, var8.field2027, var8.field2029.length - var8.field2027);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2027 += var9;
                }
                var8.field2027 = 0;
                int var10 = var8.method2466();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2466();
                }
                if (var10 <= 2) {
                    var4 = var8.method2475();
                    if (var11 == 1) {
                        var5 = var8.method2475();
                    }
                } else {
                    var4 = var8.method2476();
                    if (var11 == 1) {
                        var5 = var8.method2476();
                    }
                }
                var7.method554();
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
                if (!method2451(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2552.length; var15++) {
                for (int var16 = 0; var16 < Statics.field339.length; var16++) {
                    File var17 = new File(Statics.field339[var16] + Statics.field2552[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2451(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2435 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method3079(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ee.n(Ljava/io/File;Ljava/io/File;B)V")
    public static void method3079(File arg0, File arg1) {
        try {
            class28 var2 = new class28(Statics.field193, "rw", 10000L);
            class126 var3 = new class126(500);
            var3.method2452(3);
            var3.method2452(arg1 == null ? 0 : 1);
            var3.method2535(arg0.getPath());
            if (arg1 != null) {
                var3.method2535(arg1.getPath());
            }
            var2.method556(var3.field2029, 0, var3.field2027);
            var2.method554();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("dr.c(Ljava/io/File;ZI)Z")
    public static boolean method2451(File arg0, boolean arg1) {
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

    @ObfuscatedName("t.r(Ldr;S)V")
    public static void method139(class126 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1416.method578(0L);
            field1416.method590(var1);
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
        arg0.method2460(var1, 0, 24);
    }

    @ObfuscatedName("ca.k(Ldr;II)V")
    public static void method2053(class126 arg0, int arg1) {
        if (field1416 == null) {
            return;
        }
        try {
            field1416.method578(0L);
            field1416.method582(arg0.field2029, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("as.e(I)V")
    public static void method807() {
        try {
            field1417.method577();
            for (int var0 = 0; var0 < Statics.field1776; var0++) {
                Statics.field938[var0].method577();
            }
            field1418.method577();
            field1416.method577();
        } catch (Exception var2) {
        }
    }
}
