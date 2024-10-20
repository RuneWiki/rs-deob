package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cq")
public class class82 {

    @ObfuscatedName("cq.a")
    public static class30 field1422 = null;

    @ObfuscatedName("cq.z")
    public static class30 field1428 = null;

    @ObfuscatedName("cq.s")
    public static class30 field1429 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.i(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method226(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2555 = arg3;
        Statics.field1426 = arg2;
        try {
            Statics.field359 = System.getProperty("os.name");
        } catch (Exception var41) {
            Statics.field359 = "Unknown";
        }
        Statics.field200 = Statics.field359.toLowerCase();
        try {
            Statics.field1840 = System.getProperty("user.home");
            if (Statics.field1840 != null) {
                Statics.field1840 = Statics.field1840 + "/";
            }
        } catch (Exception var40) {
        }
        try {
            if (Statics.field200.startsWith("win")) {
                if (Statics.field1840 == null) {
                    Statics.field1840 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1840 == null) {
                Statics.field1840 = System.getenv("HOME");
            }
            if (Statics.field1840 != null) {
                Statics.field1840 = Statics.field1840 + "/";
            }
        } catch (Exception var39) {
        }
        if (Statics.field1840 == null) {
            Statics.field1840 = "~/";
        }
        Statics.field188 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1840, "/tmp/", "" };
        Statics.field383 = new String[] { ".jagex_cache_" + Statics.field1426, ".file_store_" + Statics.field1426 };
        int var7 = 0;
        label210: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2832 = new File(Statics.field1840, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2832.exists()) {
                try {
                    class29 var12 = new class29(Statics.field2832, "rw", 10000L);
                    class127 var13 = new class127((int) var12.method555());
                    while (var13.field2045 < var13.field2049.length) {
                        int var14 = var12.method561(var13.field2049, var13.field2045, var13.field2049.length - var13.field2045);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2045 += var14;
                    }
                    var13.field2045 = 0;
                    int var15 = var13.method2472();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2472();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2538();
                        if (var16 == 1) {
                            var10 = var13.method2538();
                        }
                    } else {
                        var9 = var13.method2462();
                        if (var16 == 1) {
                            var10 = var13.method2462();
                        }
                    }
                    var12.method563();
                } catch (IOException var43) {
                    var43.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method130(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label184: for (int var20 = 0; var20 < Statics.field383.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field188.length; var21++) {
                        File var22 = new File(Statics.field188[var21] + Statics.field383[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method130(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label184;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1840 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var42) {
                    var42.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method129(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1435 = var32;
            if (!Statics.field1435.exists()) {
                Statics.field1435.mkdirs();
            }
            File[] var33 = Statics.field1435.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method130(var36, false)) {
                        var7++;
                        continue label210;
                    }
                }
            }
            break;
        }
        File var37 = Statics.field1435;
        Statics.field1308 = var37;
        if (!Statics.field1308.exists()) {
            throw new RuntimeException("");
        }
        class72.field1302 = true;
        method175();
        field1428 = new class30(new class29(Statics.method892("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1429 = new class30(new class29(Statics.method892("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field184 = new class30[Statics.field2555];
        for (int var38 = 0; var38 < Statics.field2555; var38++) {
            Statics.field184[var38] = new class30(new class29(Statics.method892("main_file_cache.idx" + var38), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("a.w(Ljava/io/File;Ljava/io/File;I)V")
    public static void method129(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field2832, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2438(3);
            var3.method2438(arg1 == null ? 0 : 1);
            var3.method2445(arg0.getPath());
            if (arg1 != null) {
                var3.method2445(arg1.getPath());
            }
            var2.method551(var3.field2049, 0, var3.field2045);
            var2.method563();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("a.f(Ljava/io/File;ZI)Z")
    public static boolean method130(File arg0, boolean arg1) {
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

    @ObfuscatedName("r.e(Ljava/lang/String;Ljava/lang/String;ZS)Laa;")
    public static class29 method111(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1435, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1426 == 33) {
            var6 = "_rc";
        } else if (Statics.field1426 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1840, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("j.t(I)V")
    public static void method175() {
        try {
            File var0 = new File(Statics.field1840, "random.dat");
            if (var0.exists()) {
                field1422 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field383.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field188.length; var2++) {
                        File var3 = new File(Statics.field188[var2] + Statics.field383[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1422 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1422 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1422 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("er.p(I)V")
    public static void method2888() {
        try {
            field1428.method577();
            for (int var0 = 0; var0 < Statics.field2555; var0++) {
                Statics.field184[var0].method577();
            }
            field1429.method577();
            field1422.method577();
        } catch (Exception var2) {
        }
    }
}
