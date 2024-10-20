package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fr")
public class class158 {

    @ObfuscatedName("fr.u")
    public static class123 field2167 = null;

    @ObfuscatedName("fr.p")
    public static class123 field2171 = null;

    @ObfuscatedName("fr.w")
    public static class123 field2172 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.n(Ljava/lang/String;Ljava/lang/String;IIS)V")
    public static void method468(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2166 = arg3;
        Statics.field3818 = arg2;
        try {
            Statics.field1575 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field1575 = "Unknown";
        }
        Statics.field2175 = Statics.field1575.toLowerCase();
        try {
            Statics.field2136 = System.getProperty("user.home");
            if (Statics.field2136 != null) {
                Statics.field2136 = Statics.field2136 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field2175.startsWith("win")) {
                if (Statics.field2136 == null) {
                    Statics.field2136 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2136 == null) {
                Statics.field2136 = System.getenv("HOME");
            }
            if (Statics.field2136 != null) {
                Statics.field2136 = Statics.field2136 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field2136 == null) {
            Statics.field2136 = "~/";
        }
        Statics.field407 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2136, "/tmp/", "" };
        Statics.field571 = new String[] { ".jagex_cache_" + Statics.field3818, ".file_store_" + Statics.field3818 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2170 = new File(Statics.field2136, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2170.exists()) {
                try {
                    class124 var12 = new class124(Statics.field2170, "rw", 10000L);
                    class185 var13 = new class185((int) var12.method2208());
                    while (var13.field2529 < var13.field2528.length) {
                        int var14 = var12.method2203(var13.field2528, var13.field2529, var13.field2528.length - var13.field2529);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2529 += var14;
                    }
                    var13.field2529 = 0;
                    int var15 = var13.method3021();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method3021();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method3031();
                        if (var16 == 1) {
                            var10 = var13.method3031();
                        }
                    } else {
                        var9 = var13.method3007();
                        if (var16 == 1) {
                            var10 = var13.method3007();
                        }
                    }
                    var12.method2195();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method45(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field571.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field407.length; var21++) {
                        File var22 = new File(Statics.field407[var21] + Statics.field571[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method45(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field2136 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var49) {
                    var49.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method2516(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field2165 = var32;
            if (!Statics.field2165.exists()) {
                Statics.field2165.mkdirs();
            }
            File[] var33 = Statics.field2165.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method45(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        class161.method1011(Statics.field2165);
        try {
            File var37 = new File(Statics.field2136, "random.dat");
            if (var37.exists()) {
                field2167 = new class123(new class124(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field571.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field407.length; var39++) {
                        File var40 = new File(Statics.field407[var39] + Statics.field571[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field2167 = new class123(new class124(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field2167 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field2167 = new class123(new class124(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field2171 = new class123(new class124(class161.method620("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2172 = new class123(new class124(class161.method620("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2164 = new class123[Statics.field2166];
        for (int var44 = 0; var44 < Statics.field2166; var44++) {
            Statics.field2164[var44] = new class123(new class124(class161.method620("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ei.v(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2516(File arg0, File arg1) {
        try {
            class124 var2 = new class124(Statics.field2170, "rw", 10000L);
            class185 var3 = new class185(500);
            var3.method3157(3);
            var3.method3157(arg1 == null ? 0 : 1);
            var3.method3014(arg0.getPath());
            if (arg1 != null) {
                var3.method3014(arg1.getPath());
            }
            var2.method2194(var3.field2528, 0, var3.field2529);
            var2.method2195();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("z.y(Ljava/io/File;ZI)Z")
    public static boolean method45(File arg0, boolean arg1) {
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

    @ObfuscatedName("z.r(Ljava/lang/String;Ljava/lang/String;ZI)Ldg;")
    public static class124 method44(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2165, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class124(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3818 == 33) {
            var6 = "_rc";
        } else if (Statics.field3818 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2136, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class124(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class124(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("f.h(B)[B")
    public static byte[] method42() {
        byte[] var0 = new byte[24];
        try {
            field2167.method2175(0L);
            field2167.method2177(var0);
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

    @ObfuscatedName("jh.d(I)V")
    public static void method4459() {
        try {
            field2171.method2167();
            for (int var0 = 0; var0 < Statics.field2166; var0++) {
                Statics.field2164[var0].method2167();
            }
            field2172.method2167();
            field2167.method2167();
        } catch (Exception var2) {
        }
    }
}
