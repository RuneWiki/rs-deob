package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("er")
public class class144 {

    @ObfuscatedName("er.y")
    public static class386 field1553 = null;

    @ObfuscatedName("er.k")
    public static class386 field1554 = null;

    @ObfuscatedName("er.t")
    public static class386 field1555 = null;

    public class144() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kv.i(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method4938(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field997 = arg3;
        Statics.field1559 = arg2;
        try {
            Statics.field1552 = System.getProperty("os.name");
        } catch (Exception var40) {
            Statics.field1552 = "Unknown";
        }
        Statics.field2003 = Statics.field1552.toLowerCase();
        try {
            Statics.field3968 = System.getProperty("user.home");
            if (Statics.field3968 != null) {
                Statics.field3968 = Statics.field3968 + "/";
            }
        } catch (Exception var39) {
        }
        try {
            if (Statics.field2003.startsWith("win")) {
                if (Statics.field3968 == null) {
                    Statics.field3968 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3968 == null) {
                Statics.field3968 = System.getenv("HOME");
            }
            if (Statics.field3968 != null) {
                Statics.field3968 = Statics.field3968 + "/";
            }
        } catch (Exception var38) {
        }
        if (Statics.field3968 == null) {
            Statics.field3968 = "~/";
        }
        Statics.field1206 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3968, "/tmp/", "" };
        Statics.field4373 = new String[] { ".jagex_cache_" + Statics.field1559, ".file_store_" + Statics.field1559 };
        int var7 = 0;
        label206: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field4027 = new File(Statics.field3968, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field4027.exists()) {
                try {
                    class385 var12 = new class385(Statics.field4027, "rw", 10000L);
                    class401 var13 = new class401((int) var12.method6075());
                    while (var13.field4300 < var13.field4302.length) {
                        int var14 = var12.method6065(var13.field4302, var13.field4300, var13.field4302.length - var13.field4300);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field4300 += var14;
                    }
                    var13.field4300 = 0;
                    int var15 = var13.method6240();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method6240();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method6250();
                        if (var16 == 1) {
                            var10 = var13.method6250();
                        }
                    } else {
                        var9 = var13.method6251();
                        if (var16 == 1) {
                            var10 = var13.method6251();
                        }
                    }
                    var12.method6062();
                } catch (IOException var42) {
                    var42.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2224(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label180: for (int var20 = 0; var20 < Statics.field4373.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1206.length; var21++) {
                        File var22 = new File(Statics.field1206[var21] + Statics.field4373[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2224(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label180;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field3968 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var41) {
                    var41.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method2335(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1550 = var32;
            if (!Statics.field1550.exists()) {
                Statics.field1550.mkdirs();
            }
            File[] var33 = Statics.field1550.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method2224(var36, false)) {
                        var7++;
                        continue label206;
                    }
                }
            }
            break;
        }
        class146.method2373(Statics.field1550);
        method3519();
        field1554 = new class386(new class385(class146.method5593("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1555 = new class386(new class385(class146.method5593("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2184 = new class386[Statics.field997];
        for (int var37 = 0; var37 < Statics.field997; var37++) {
            Statics.field2184[var37] = new class386(new class385(class146.method5593("main_file_cache.idx" + var37), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cb.w(Ljava/io/File;Ljava/io/File;B)V")
    public static void method2335(File arg0, File arg1) {
        try {
            class385 var2 = new class385(Statics.field4027, "rw", 10000L);
            class401 var3 = new class401(500);
            var3.method6223(3);
            var3.method6223(arg1 == null ? 0 : 1);
            var3.method6232(arg0.getPath());
            if (arg1 != null) {
                var3.method6232(arg1.getPath());
            }
            var2.method6061(var3.field4302, 0, var3.field4300);
            var2.method6062();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ch.s(Ljava/io/File;ZB)Z")
    public static boolean method2224(File arg0, boolean arg1) {
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

    @ObfuscatedName("h.a(Ljava/lang/String;Ljava/lang/String;ZI)Lnv;")
    public static class385 method359(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1550, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class385(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1559 == 33) {
            var6 = "_rc";
        } else if (Statics.field1559 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3968, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class385(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class385(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gi.o(I)V")
    public static void method3519() {
        try {
            File var0 = new File(Statics.field3968, "random.dat");
            if (var0.exists()) {
                field1553 = new class386(new class385(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field4373.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1206.length; var2++) {
                        File var3 = new File(Statics.field1206[var2] + Statics.field4373[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1553 = new class386(new class385(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1553 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1553 = new class386(new class385(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("br.g(B)[B")
    public static byte[] method1675() {
        byte[] var0 = new byte[24];
        try {
            field1553.method6080(0L);
            field1553.method6082(var0);
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
}
