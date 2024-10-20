package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cd")
public class class82 {

    @ObfuscatedName("cd.c")
    public static class30 field1441 = null;

    @ObfuscatedName("cd.b")
    public static class30 field1434 = null;

    @ObfuscatedName("cd.m")
    public static class30 field1444 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.j(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method885(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1435 = arg3;
        Statics.field1387 = arg2;
        try {
            Statics.field1446 = System.getProperty("os.name");
        } catch (Exception var28) {
            Statics.field1446 = "Unknown";
        }
        Statics.field112 = Statics.field1446.toLowerCase();
        try {
            Statics.field1271 = System.getProperty("user.home");
            if (Statics.field1271 != null) {
                Statics.field1271 = Statics.field1271 + "/";
            }
        } catch (Exception var27) {
        }
        try {
            if (Statics.field112.startsWith("win")) {
                if (Statics.field1271 == null) {
                    Statics.field1271 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1271 == null) {
                Statics.field1271 = System.getenv("HOME");
            }
            if (Statics.field1271 != null) {
                Statics.field1271 = Statics.field1271 + "/";
            }
        } catch (Exception var26) {
        }
        if (Statics.field1271 == null) {
            Statics.field1271 = "~/";
        }
        Statics.field400 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1271, "/tmp/", "" };
        Statics.field1989 = new String[] { ".jagex_cache_" + Statics.field1387, ".file_store_" + Statics.field1387 };
        int var7 = 0;
        label127: while (var7 < 4) {
            Statics.field1438 = method566(arg0, arg1, var7);
            if (!Statics.field1438.exists()) {
                Statics.field1438.mkdirs();
            }
            File[] var8 = Statics.field1438.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label127;
                }
                File var11 = var9[var10];
                boolean var14;
                try {
                    RandomAccessFile var12 = new RandomAccessFile(var11, "rw");
                    int var13 = var12.read();
                    var12.seek(0L);
                    var12.write(var13);
                    var12.seek(0L);
                    var12.close();
                    var14 = true;
                } catch (Exception var25) {
                    var14 = false;
                }
                if (!var14) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var16 = Statics.field1438;
        Statics.field1321 = var16;
        if (!Statics.field1321.exists()) {
            throw new RuntimeException("");
        }
        class72.field1327 = true;
        try {
            File var17 = new File(Statics.field1271, "random.dat");
            if (var17.exists()) {
                field1441 = new class30(new class29(var17, "rw", 25L), 24, 0);
            } else {
                label106: for (int var18 = 0; var18 < Statics.field1989.length; var18++) {
                    for (int var19 = 0; var19 < Statics.field400.length; var19++) {
                        File var20 = new File(Statics.field400[var19] + Statics.field1989[var18] + File.separatorChar + "random.dat");
                        if (var20.exists()) {
                            field1441 = new class30(new class29(var20, "rw", 25L), 24, 0);
                            break label106;
                        }
                    }
                }
            }
            if (field1441 == null) {
                RandomAccessFile var21 = new RandomAccessFile(var17, "rw");
                int var22 = var21.read();
                var21.seek(0L);
                var21.write(var22);
                var21.seek(0L);
                var21.close();
                field1441 = new class30(new class29(var17, "rw", 25L), 24, 0);
            }
        } catch (IOException var29) {
        }
        field1434 = new class30(new class29(class72.method7("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1444 = new class30(new class29(class72.method7("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1443 = new class30[Statics.field1435];
        for (int var24 = 0; var24 < Statics.field1435; var24++) {
            Statics.field1443[var24] = new class30(new class29(class72.method7("main_file_cache.idx" + var24), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ai.f(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method566(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1437 = new File(Statics.field1271, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1437.exists()) {
            try {
                class29 var7 = new class29(Statics.field1437, "rw", 10000L);
                class127 var8 = new class127((int) var7.method588());
                while (var8.field2035 < var8.field2037.length) {
                    int var9 = var7.method573(var8.field2037, var8.field2035, var8.field2037.length - var8.field2035);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2035 += var9;
                }
                var8.field2035 = 0;
                int var10 = var8.method2464();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2464();
                }
                if (var10 <= 2) {
                    var4 = var8.method2473();
                    if (var11 == 1) {
                        var5 = var8.method2473();
                    }
                } else {
                    var4 = var8.method2472();
                    if (var11 == 1) {
                        var5 = var8.method2472();
                    }
                }
                var7.method589();
            } catch (IOException var45) {
                var45.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var43) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label134: for (int var19 = 0; var19 < Statics.field1989.length; var19++) {
                for (int var20 = 0; var20 < Statics.field400.length; var20++) {
                    File var21 = new File(Statics.field400[var20] + Statics.field1989[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var42) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label134;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1271 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var36 = new File(var4);
            Object var37 = null;
            try {
                class29 var38 = new class29(Statics.field1437, "rw", 10000L);
                class127 var39 = new class127(500);
                var39.method2450(3);
                var39.method2450(var37 == null ? 0 : 1);
                var39.method2647(var36.getPath());
                if (var37 != null) {
                    var39.method2647(((File) var37).getPath());
                }
                var38.method570(var39.field2037, 0, var39.field2035);
                var38.method589();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("bp.o(Ljava/lang/String;Ljava/lang/String;ZB)Lah;")
    public static class29 method1388(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1438, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1387 == 33) {
            var6 = "_rc";
        } else if (Statics.field1387 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1271, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("f.h(Ldq;I)V")
    public static void method13(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1441.method592(0L);
            field1441.method619(var1);
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
        arg0.method2458(var1, 0, 24);
    }

    @ObfuscatedName("bf.u(I)V")
    public static void method1574() {
        try {
            field1434.method591();
            for (int var0 = 0; var0 < Statics.field1435; var0++) {
                Statics.field1443[var0].method591();
            }
            field1444.method591();
            field1441.method591();
        } catch (Exception var2) {
        }
    }
}
