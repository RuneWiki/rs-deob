package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ck")
public class class82 {

    @ObfuscatedName("ck.n")
    public static class30 field1414 = null;

    @ObfuscatedName("ck.c")
    public static class30 field1406 = null;

    @ObfuscatedName("ck.h")
    public static class30 field1407 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.x(Ljava/lang/String;Ljava/lang/String;IIS)V")
    public static void method520(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1248 = arg3;
        Statics.field1408 = arg2;
        try {
            Statics.field1791 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field1791 = "Unknown";
        }
        Statics.field2455 = Statics.field1791.toLowerCase();
        try {
            Statics.field1761 = System.getProperty("user.home");
            if (Statics.field1761 != null) {
                Statics.field1761 = Statics.field1761 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field2455.startsWith("win")) {
                if (Statics.field1761 == null) {
                    Statics.field1761 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1761 == null) {
                Statics.field1761 = System.getenv("HOME");
            }
            if (Statics.field1761 != null) {
                Statics.field1761 = Statics.field1761 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field1761 == null) {
            Statics.field1761 = "~/";
        }
        Statics.field1401 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1761, "/tmp/", "" };
        Statics.field1239 = new String[] { ".jagex_cache_" + Statics.field1408, ".file_store_" + Statics.field1408 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field2832 = method217(arg0, arg1, var7);
            if (!Statics.field2832.exists()) {
                Statics.field2832.mkdirs();
            }
            File[] var8 = Statics.field2832.listFiles();
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
                if (!Statics.method2625(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class72.method6(Statics.field2832);
        method105();
        field1406 = new class30(new class29(class72.method214("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1407 = new class30(new class29(class72.method214("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2817 = new class30[Statics.field1248];
        for (int var12 = 0; var12 < Statics.field1248; var12++) {
            Statics.field2817[var12] = new class30(new class29(class72.method214("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("d.p(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method217(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1398 = new File(Statics.field1761, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1398.exists()) {
            try {
                class29 var7 = new class29(Statics.field1398, "rw", 10000L);
                class127 var8 = new class127((int) var7.method527());
                while (var8.field2008 < var8.field2015.length) {
                    int var9 = var7.method524(var8.field2015, var8.field2008, var8.field2015.length - var8.field2008);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2008 += var9;
                }
                var8.field2008 = 0;
                int var10 = var8.method2484();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2484();
                }
                if (var10 <= 2) {
                    var4 = var8.method2399();
                    if (var11 == 1) {
                        var5 = var8.method2399();
                    }
                } else {
                    var4 = var8.method2410();
                    if (var11 == 1) {
                        var5 = var8.method2410();
                    }
                }
                var7.method526();
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
                if (!Statics.method2625(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1239.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1401.length; var16++) {
                    File var17 = new File(Statics.field1401[var16] + Statics.field1239[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && Statics.method2625(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1761 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2147(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("dk.k(Ljava/io/File;Ljava/io/File;S)V")
    public static void method2147(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1398, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2396(3);
            var3.method2396(arg1 == null ? 0 : 1);
            var3.method2429(arg0.getPath());
            if (arg1 != null) {
                var3.method2429(arg1.getPath());
            }
            var2.method525(var3.field2015, 0, var3.field2008);
            var2.method526();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ds.q(Ljava/lang/String;Ljava/lang/String;ZB)Las;")
    public static class29 method2299(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2832, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1408 == 33) {
            var6 = "_rc";
        } else if (Statics.field1408 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1761, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("s.j(I)V")
    public static void method105() {
        try {
            File var0 = new File(Statics.field1761, "random.dat");
            if (var0.exists()) {
                field1414 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1239.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1401.length; var2++) {
                        File var3 = new File(Statics.field1401[var2] + Statics.field1239[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1414 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1414 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1414 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("am.v(Ldg;I)V")
    public static void method622(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1414.method553(0L);
            field1414.method555(var1);
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
        arg0.method2404(var1, 0, 24);
    }
}
