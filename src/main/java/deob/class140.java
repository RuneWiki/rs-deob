package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("el")
public class class140 {

    @ObfuscatedName("el.k")
    public static class210 field2118 = null;

    @ObfuscatedName("el.f")
    public static class210 field2119 = null;

    @ObfuscatedName("el.d")
    public static class210 field2120 = null;

    public class140() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.a(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method551(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2124 = arg3;
        Statics.field2113 = arg2;
        try {
            Statics.field638 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field638 = "Unknown";
        }
        Statics.field612 = Statics.field638.toLowerCase();
        try {
            Statics.field2074 = System.getProperty("user.home");
            if (Statics.field2074 != null) {
                Statics.field2074 = Statics.field2074 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field612.startsWith("win")) {
                if (Statics.field2074 == null) {
                    Statics.field2074 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2074 == null) {
                Statics.field2074 = System.getenv("HOME");
            }
            if (Statics.field2074 != null) {
                Statics.field2074 = Statics.field2074 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field2074 == null) {
            Statics.field2074 = "~/";
        }
        Statics.field1301 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2074, "/tmp/", "" };
        Statics.field1768 = new String[] { ".jagex_cache_" + Statics.field2113, ".file_store_" + Statics.field2113 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2123 = new File(Statics.field2074, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2123.exists()) {
                try {
                    class209 var12 = new class209(Statics.field2123, "rw", 10000L);
                    class110 var13 = new class110((int) var12.method3533());
                    while (var13.field1861 < var13.field1865.length) {
                        int var14 = var12.method3534(var13.field1865, var13.field1861, var13.field1865.length - var13.field1861);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1861 += var14;
                    }
                    var13.field1861 = 0;
                    int var15 = var13.method2199();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2199();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2140();
                        if (var16 == 1) {
                            var10 = var13.method2140();
                        }
                    } else {
                        var9 = var13.method2141();
                        if (var16 == 1) {
                            var10 = var13.method2141();
                        }
                    }
                    var12.method3530();
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
                    if (!method2061(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field1768.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1301.length; var21++) {
                        File var22 = new File(Statics.field1301[var21] + Statics.field1768[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2061(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field2074 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                method2076(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field2114 = var32;
            if (!Statics.field2114.exists()) {
                Statics.field2114.mkdirs();
            }
            File[] var33 = Statics.field2114.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method2061(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        class126.method2054(Statics.field2114);
        try {
            File var37 = new File(Statics.field2074, "random.dat");
            if (var37.exists()) {
                field2118 = new class210(new class209(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field1768.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field1301.length; var39++) {
                        File var40 = new File(Statics.field1301[var39] + Statics.field1768[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field2118 = new class210(new class209(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field2118 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field2118 = new class210(new class209(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field2119 = new class210(new class209(class126.method811("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2120 = new class210(new class209(class126.method811("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1910 = new class210[Statics.field2124];
        for (int var44 = 0; var44 < Statics.field2124; var44++) {
            Statics.field1910[var44] = new class210(new class209(class126.method811("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dd.v(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2076(File arg0, File arg1) {
        try {
            class209 var2 = new class209(Statics.field2123, "rw", 10000L);
            class110 var3 = new class110(500);
            var3.method2117(3);
            var3.method2117(arg1 == null ? 0 : 1);
            var3.method2124(arg0.getPath());
            if (arg1 != null) {
                var3.method2124(arg1.getPath());
            }
            var2.method3531(var3.field1865, 0, var3.field1861);
            var2.method3530();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("cu.i(Ljava/io/File;ZI)Z")
    public static boolean method2061(File arg0, boolean arg1) {
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

    @ObfuscatedName("ak.b(Ljava/lang/String;Ljava/lang/String;ZI)Lhd;")
    public static class209 method906(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2114, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class209(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2113 == 33) {
            var6 = "_rc";
        } else if (Statics.field2113 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2074, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class209(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class209(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("da.l(Ldi;II)V")
    public static void method2462(class110 arg0, int arg1) {
        if (field2118 == null) {
            return;
        }
        try {
            field2118.method3551(0L);
            field2118.method3558(arg0.field1865, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
