package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ej")
public class class156 {

    @ObfuscatedName("ej.r")
    public static class124 field2222 = null;

    @ObfuscatedName("ej.b")
    public static class124 field2232 = null;

    @ObfuscatedName("ej.x")
    public static class124 field2230 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.i(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2224 = arg3;
        Statics.field2231 = arg2;
        try {
            Statics.field848 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field848 = "Unknown";
        }
        Statics.field2114 = Statics.field848.toLowerCase();
        try {
            Statics.field736 = System.getProperty("user.home");
            if (Statics.field736 != null) {
                Statics.field736 = Statics.field736 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field2114.startsWith("win")) {
                if (Statics.field736 == null) {
                    Statics.field736 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field736 == null) {
                Statics.field736 = System.getenv("HOME");
            }
            if (Statics.field736 != null) {
                Statics.field736 = Statics.field736 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field736 == null) {
            Statics.field736 = "~/";
        }
        Statics.field737 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field736, "/tmp/", "" };
        Statics.field2228 = new String[] { ".jagex_cache_" + Statics.field2231, ".file_store_" + Statics.field2231 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field2225 = method1470(arg0, arg1, var7);
            if (!Statics.field2225.exists()) {
                Statics.field2225.mkdirs();
            }
            File[] var8 = Statics.field2225.listFiles();
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
                if (!method1040(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class158.method1638(Statics.field2225);
        method468();
        field2232 = new class124(new class125(class158.method204("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2230 = new class124(new class125(class158.method204("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1995 = new class124[Statics.field2224];
        for (int var12 = 0; var12 < Statics.field2224; var12++) {
            Statics.field1995[var12] = new class124(new class125(class158.method204("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cd.h(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method1470(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3127 = new File(Statics.field736, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3127.exists()) {
            try {
                class125 var7 = new class125(Statics.field3127, "rw", 10000L);
                class174 var8 = new class174((int) var7.method2170());
                while (var8.field2384 < var8.field2387.length) {
                    int var9 = var7.method2171(var8.field2387, var8.field2384, var8.field2387.length - var8.field2384);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2384 += var9;
                }
                var8.field2384 = 0;
                int var10 = var8.method2930();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2930();
                }
                if (var10 <= 2) {
                    var4 = var8.method2939();
                    if (var11 == 1) {
                        var5 = var8.method2939();
                    }
                } else {
                    var4 = var8.method2940();
                    if (var11 == 1) {
                        var5 = var8.method2940();
                    }
                }
                var7.method2169();
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
                if (!method1040(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2228.length; var15++) {
                for (int var16 = 0; var16 < Statics.field737.length; var16++) {
                    File var17 = new File(Statics.field737[var16] + Statics.field2228[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1040(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field736 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class125 var29 = new class125(Statics.field3127, "rw", 10000L);
                class174 var30 = new class174(500);
                var30.method3031(3);
                var30.method3031(var28 == null ? 0 : 1);
                var30.method2934(var27.getPath());
                if (var28 != null) {
                    var30.method2934(((File) var28).getPath());
                }
                var29.method2168(var30.field2387, 0, var30.field2384);
                var29.method2169();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("bu.u(Ljava/io/File;ZI)Z")
    public static boolean method1040(File arg0, boolean arg1) {
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

    @ObfuscatedName("m.q(Ljava/lang/String;Ljava/lang/String;ZI)Ldp;")
    public static class125 method105(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2225, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2231 == 33) {
            var6 = "_rc";
        } else if (Statics.field2231 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field736, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class125(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class125(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ae.g(B)V")
    public static void method468() {
        try {
            File var0 = new File(Statics.field736, "random.dat");
            if (var0.exists()) {
                field2222 = new class124(new class125(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2228.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field737.length; var2++) {
                        File var3 = new File(Statics.field737[var2] + Statics.field2228[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2222 = new class124(new class125(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2222 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2222 = new class124(new class125(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ea.v(B)[B")
    public static byte[] method2402() {
        byte[] var0 = new byte[24];
        try {
            field2222.method2142(0L);
            field2222.method2164(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }

    @ObfuscatedName("cu.t(Lfv;IB)V")
    public static void method1716(class174 arg0, int arg1) {
        if (field2222 == null) {
            return;
        }
        try {
            field2222.method2142(0L);
            field2222.method2140(arg0.field2387, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
