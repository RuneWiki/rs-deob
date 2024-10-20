package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cy")
public class class137 {

    @ObfuscatedName("cy.g")
    public static class166 field2116 = null;

    @ObfuscatedName("cy.o")
    public static class166 field2126 = null;

    @ObfuscatedName("cy.x")
    public static class166 field2121 = null;

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.b(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method898(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field554 = arg3;
        Statics.field650 = arg2;
        try {
            Statics.field2512 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field2512 = "Unknown";
        }
        Statics.field2659 = Statics.field2512.toLowerCase();
        try {
            Statics.field1445 = System.getProperty("user.home");
            if (Statics.field1445 != null) {
                Statics.field1445 = Statics.field1445 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field2659.startsWith("win")) {
                if (Statics.field1445 == null) {
                    Statics.field1445 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1445 == null) {
                Statics.field1445 = System.getenv("HOME");
            }
            if (Statics.field1445 != null) {
                Statics.field1445 = Statics.field1445 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field1445 == null) {
            Statics.field1445 = "~/";
        }
        Statics.field2124 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1445, "/tmp/", "" };
        Statics.field2125 = new String[] { ".jagex_cache_" + Statics.field650, ".file_store_" + Statics.field650 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field2123 = method2111(arg0, arg1, var7);
            if (!Statics.field2123.exists()) {
                Statics.field2123.mkdirs();
            }
            File[] var8 = Statics.field2123.listFiles();
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
                if (!method2931(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2123;
        Statics.field2016 = var12;
        if (!Statics.field2016.exists()) {
            throw new RuntimeException("");
        }
        class126.field2023 = true;
        try {
            File var13 = new File(Statics.field1445, "random.dat");
            if (var13.exists()) {
                field2121 = new class166(new class168(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field2125.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field2124.length; var15++) {
                        File var16 = new File(Statics.field2124[var15] + Statics.field2125[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2121 = new class166(new class168(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2121 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2121 = new class166(new class168(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2116 = new class166(new class168(class126.method2308("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2126 = new class166(new class168(class126.method2308("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2143 = new class166[Statics.field554];
        for (int var20 = 0; var20 < Statics.field554; var20++) {
            Statics.field2143[var20] = new class166(new class168(class126.method2308("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("l.l(I)V")
    public static void method1143() {
        try {
            field2116.method2876();
            for (int var0 = 0; var0 < Statics.field554; var0++) {
                Statics.field2143[var0].method2876();
            }
            field2126.method2876();
            field2121.method2876();
        } catch (Exception var2) {
        }
    }

    @ObfuscatedName("ej.d(Ldp;I)V")
    public static void method1360(class50 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2121.method2877(0L);
            field2121.method2891(var1);
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
        arg0.method674(var1, 0, 24);
    }

    @ObfuscatedName("bn.h(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method2111(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2117 = new File(Statics.field1445, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2117.exists()) {
            try {
                class168 var7 = new class168(Statics.field2117, "rw", 10000L);
                class50 var8 = new class50((int) var7.method2928());
                while (var8.field540 < var8.field541.length) {
                    int var9 = var7.method2910(var8.field541, var8.field540, var8.field541.length - var8.field540);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field540 += var9;
                }
                var8.field540 = 0;
                int var10 = var8.method726();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method726();
                }
                if (var10 <= 2) {
                    var4 = var8.method689();
                    if (var11 == 1) {
                        var5 = var8.method689();
                    }
                } else {
                    var4 = var8.method690();
                    if (var11 == 1) {
                        var5 = var8.method690();
                    }
                }
                var7.method2913();
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
                if (!method2931(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2125.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2124.length; var16++) {
                    File var17 = new File(Statics.field2124[var16] + Statics.field2125[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2931(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1445 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2271(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("bg.k(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2271(File arg0, File arg1) {
        try {
            class168 var2 = new class168(Statics.field2117, "rw", 10000L);
            class50 var3 = new class50(500);
            var3.method666(3);
            var3.method666(arg1 == null ? 0 : 1);
            var3.method787(arg0.getPath());
            if (arg1 != null) {
                var3.method787(arg1.getPath());
            }
            var2.method2912(var3.field541, 0, var3.field540);
            var2.method2913();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("av.w(Ljava/io/File;ZI)Z")
    public static boolean method2931(File arg0, boolean arg1) {
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

    @ObfuscatedName("ab.t(Ljava/lang/String;Ljava/lang/String;ZS)Law;")
    public static class168 method3333(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2123, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class168(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field650 == 33) {
            var6 = "_rc";
        } else if (Statics.field650 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1445, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class168(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class168(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
