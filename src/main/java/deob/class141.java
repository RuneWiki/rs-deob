package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eb")
public class class141 {

    @ObfuscatedName("eb.v")
    public static class219 field2118 = null;

    @ObfuscatedName("eb.a")
    public static class219 field2119 = null;

    @ObfuscatedName("eb.l")
    public static class219 field2120 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.t(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method31(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field184 = arg3;
        Statics.field2121 = arg2;
        try {
            Statics.field584 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field584 = "Unknown";
        }
        Statics.field1307 = Statics.field584.toLowerCase();
        try {
            Statics.field2116 = System.getProperty("user.home");
            if (Statics.field2116 != null) {
                Statics.field2116 = Statics.field2116 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field1307.startsWith("win")) {
                if (Statics.field2116 == null) {
                    Statics.field2116 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2116 == null) {
                Statics.field2116 = System.getenv("HOME");
            }
            if (Statics.field2116 != null) {
                Statics.field2116 = Statics.field2116 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field2116 == null) {
            Statics.field2116 = "~/";
        }
        Statics.field975 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2116, "/tmp/", "" };
        Statics.field618 = new String[] { ".jagex_cache_" + Statics.field2121, ".file_store_" + Statics.field2121 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field2174 = method2571(arg0, arg1, var7);
            if (!Statics.field2174.exists()) {
                Statics.field2174.mkdirs();
            }
            File[] var8 = Statics.field2174.listFiles();
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
                if (!method2002(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class127.method152(Statics.field2174);
        method2003();
        field2119 = new class219(new class218(class127.method830("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2120 = new class219(new class218(class127.method830("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1266 = new class219[Statics.field184];
        for (int var12 = 0; var12 < Statics.field184; var12++) {
            Statics.field1266[var12] = new class219(new class218(class127.method830("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dp.b(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;")
    public static File method2571(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2543 = new File(Statics.field2116, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2543.exists()) {
            try {
                class218 var7 = new class218(Statics.field2543, "rw", 10000L);
                class111 var8 = new class111((int) var7.method3690());
                while (var8.field1867 < var8.field1869.length) {
                    int var9 = var7.method3702(var8.field1869, var8.field1867, var8.field1869.length - var8.field1867);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1867 += var9;
                }
                var8.field1867 = 0;
                int var10 = var8.method2172();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2172();
                }
                if (var10 <= 2) {
                    var4 = var8.method2181();
                    if (var11 == 1) {
                        var5 = var8.method2181();
                    }
                } else {
                    var4 = var8.method2289();
                    if (var11 == 1) {
                        var5 = var8.method2289();
                    }
                }
                var7.method3689();
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
                if (!method2002(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field618.length; var15++) {
                for (int var16 = 0; var16 < Statics.field975.length; var16++) {
                    File var17 = new File(Statics.field975[var16] + Statics.field618[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2002(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2116 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method768(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ab.p(Ljava/io/File;Ljava/io/File;I)V")
    public static void method768(File arg0, File arg1) {
        try {
            class218 var2 = new class218(Statics.field2543, "rw", 10000L);
            class111 var3 = new class111(500);
            var3.method2158(3);
            var3.method2158(arg1 == null ? 0 : 1);
            var3.method2268(arg0.getPath());
            if (arg1 != null) {
                var3.method2268(arg1.getPath());
            }
            var2.method3692(var3.field1869, 0, var3.field1867);
            var2.method3689();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ca.e(Ljava/io/File;ZB)Z")
    public static boolean method2002(File arg0, boolean arg1) {
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

    @ObfuscatedName("au.i(Ljava/lang/String;Ljava/lang/String;ZI)Lhd;")
    public static class218 method614(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2174, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2121 == 33) {
            var6 = "_rc";
        } else if (Statics.field2121 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2116, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class218(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class218(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ca.o(B)V")
    public static void method2003() {
        try {
            File var0 = new File(Statics.field2116, "random.dat");
            if (var0.exists()) {
                field2118 = new class219(new class218(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field618.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field975.length; var2++) {
                        File var3 = new File(Statics.field975[var2] + Statics.field618[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2118 = new class219(new class218(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2118 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2118 = new class219(new class218(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
