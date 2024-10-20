package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fr")
public class class158 {

    @ObfuscatedName("fr.x")
    public static class121 field2124 = null;

    @ObfuscatedName("fr.q")
    public static class121 field2125 = null;

    @ObfuscatedName("fr.v")
    public static class121 field2126 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gj.p(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;")
    public static File method3328(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2121 = new File(Statics.field3824, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2121.exists()) {
            try {
                class122 var7 = new class122(Statics.field2121, "rw", 10000L);
                class185 var8 = new class185((int) var7.method2309());
                while (var8.field2488 < var8.field2491.length) {
                    int var9 = var7.method2315(var8.field2491, var8.field2488, var8.field2491.length - var8.field2488);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2488 += var9;
                }
                var8.field2488 = 0;
                int var10 = var8.method3197();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3197();
                }
                if (var10 <= 2) {
                    var4 = var8.method3179();
                    if (var11 == 1) {
                        var5 = var8.method3179();
                    }
                } else {
                    var4 = var8.method3166();
                    if (var11 == 1) {
                        var5 = var8.method3166();
                    }
                }
                var7.method2312();
            } catch (IOException var39) {
                var39.printStackTrace();
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
                } catch (Exception var37) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label119: for (int var19 = 0; var19 < Statics.field491.length; var19++) {
                for (int var20 = 0; var20 < Statics.field336.length; var20++) {
                    File var21 = new File(Statics.field336[var20] + Statics.field491[var19] + File.separatorChar + arg0 + File.separatorChar);
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
                        } catch (Exception var36) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label119;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field3824 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var38) {
                var38.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method1092(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("bv.i(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1092(File arg0, File arg1) {
        try {
            class122 var2 = new class122(Statics.field2121, "rw", 10000L);
            class185 var3 = new class185(500);
            var3.method3107(3);
            var3.method3107(arg1 == null ? 0 : 1);
            var3.method3116(arg0.getPath());
            if (arg1 != null) {
                var3.method3116(arg1.getPath());
            }
            var2.method2311(var3.field2491, 0, var3.field2488);
            var2.method2312();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("eh.w(Ljava/lang/String;Ljava/lang/String;ZI)Ldc;")
    public static class122 method2819(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3770, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class122(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field546 == 33) {
            var6 = "_rc";
        } else if (Statics.field546 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3824, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class122(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class122(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
