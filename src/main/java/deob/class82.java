package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cr")
public class class82 {

    @ObfuscatedName("cr.d")
    public static class30 field1425 = null;

    @ObfuscatedName("cr.z")
    public static class30 field1417 = null;

    @ObfuscatedName("cr.n")
    public static class30 field1413 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.b(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2376(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1414 = arg3;
        Statics.field1419 = arg2;
        try {
            Statics.field940 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field940 = "Unknown";
        }
        Statics.field2729 = Statics.field940.toLowerCase();
        try {
            Statics.field365 = System.getProperty("user.home");
            if (Statics.field365 != null) {
                Statics.field365 = Statics.field365 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field2729.startsWith("win")) {
                if (Statics.field365 == null) {
                    Statics.field365 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field365 == null) {
                Statics.field365 = System.getenv("HOME");
            }
            if (Statics.field365 != null) {
                Statics.field365 = Statics.field365 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field365 == null) {
            Statics.field365 = "~/";
        }
        Statics.field364 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field365, "/tmp/", "" };
        Statics.field89 = new String[] { ".jagex_cache_" + Statics.field1419, ".file_store_" + Statics.field1419 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field388 = method671(arg0, arg1, var7);
            if (!Statics.field388.exists()) {
                Statics.field388.mkdirs();
            }
            File[] var8 = Statics.field388.listFiles();
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
                if (!method2857(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        Statics.method1364(Statics.field388);
        method2696();
        field1417 = new class30(new class29(class72.method1526("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1413 = new class30(new class29(class72.method1526("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field14 = new class30[Statics.field1414];
        for (int var12 = 0; var12 < Statics.field1414; var12++) {
            Statics.field14[var12] = new class30(new class29(class72.method1526("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("am.e(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method671(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1411 = new File(Statics.field365, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1411.exists()) {
            try {
                class29 var7 = new class29(Statics.field1411, "rw", 10000L);
                class126 var8 = new class126((int) var7.method564());
                while (var8.field2027 < var8.field2026.length) {
                    int var9 = var7.method550(var8.field2026, var8.field2027, var8.field2026.length - var8.field2027);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2027 += var9;
                }
                var8.field2027 = 0;
                int var10 = var8.method2436();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2436();
                }
                if (var10 <= 2) {
                    var4 = var8.method2445();
                    if (var11 == 1) {
                        var5 = var8.method2445();
                    }
                } else {
                    var4 = var8.method2446();
                    if (var11 == 1) {
                        var5 = var8.method2446();
                    }
                }
                var7.method548();
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
                if (!method2857(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field89.length; var15++) {
                for (int var16 = 0; var16 < Statics.field364.length; var16++) {
                    File var17 = new File(Statics.field364[var16] + Statics.field89[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2857(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field365 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1352(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ba.g(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1352(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1411, "rw", 10000L);
            class126 var3 = new class126(500);
            var3.method2422(3);
            var3.method2422(arg1 == null ? 0 : 1);
            var3.method2429(arg0.getPath());
            if (arg1 != null) {
                var3.method2429(arg1.getPath());
            }
            var2.method545(var3.field2026, 0, var3.field2027);
            var2.method548();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("eg.o(Ljava/io/File;ZB)Z")
    public static boolean method2857(File arg0, boolean arg1) {
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

    @ObfuscatedName("by.a(Ljava/lang/String;Ljava/lang/String;ZS)Lax;")
    public static class29 method1508(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field388, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1419 == 33) {
            var6 = "_rc";
        } else if (Statics.field1419 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field365, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ed.h(I)V")
    public static void method2696() {
        try {
            File var0 = new File(Statics.field365, "random.dat");
            if (var0.exists()) {
                field1425 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field89.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field364.length; var2++) {
                        File var3 = new File(Statics.field364[var2] + Statics.field89[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1425 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1425 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1425 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("x.j(Ldv;I)V")
    public static void method142(class126 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1425.method568(0L);
            field1425.method570(var1);
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
        arg0.method2430(var1, 0, 24);
    }

    @ObfuscatedName("p.f(Ldv;IB)V")
    public static void method207(class126 arg0, int arg1) {
        if (field1425 == null) {
            return;
        }
        try {
            field1425.method568(0L);
            field1425.method573(arg0.field2026, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("z.q(B)V")
    public static void method113() {
        try {
            field1417.method567();
            for (int var0 = 0; var0 < Statics.field1414; var0++) {
                Statics.field14[var0].method567();
            }
            field1413.method567();
            field1425.method567();
        } catch (Exception var2) {
        }
    }
}
