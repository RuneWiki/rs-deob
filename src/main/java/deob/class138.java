package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ez")
public class class138 {

    @ObfuscatedName("ez.j")
    public static class208 field2103 = null;

    @ObfuscatedName("ez.p")
    public static class208 field2095 = null;

    @ObfuscatedName("ez.n")
    public static class208 field2096 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.e(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2705(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2092 = new File(Statics.field2090, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2092.exists()) {
            try {
                class207 var7 = new class207(Statics.field2092, "rw", 10000L);
                class108 var8 = new class108((int) var7.method3516());
                while (var8.field1841 < var8.field1842.length) {
                    int var9 = var7.method3517(var8.field1842, var8.field1841, var8.field1842.length - var8.field1841);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1841 += var9;
                }
                var8.field1841 = 0;
                int var10 = var8.method2122();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2122();
                }
                if (var10 <= 2) {
                    var4 = var8.method2131();
                    if (var11 == 1) {
                        var5 = var8.method2131();
                    }
                } else {
                    var4 = var8.method2132();
                    if (var11 == 1) {
                        var5 = var8.method2132();
                    }
                }
                var7.method3515();
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
                if (!method1771(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2028.length; var15++) {
                for (int var16 = 0; var16 < Statics.field714.length; var16++) {
                    File var17 = new File(Statics.field714[var16] + Statics.field2028[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1771(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2090 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class207 var29 = new class207(Statics.field2092, "rw", 10000L);
                class108 var30 = new class108(500);
                var30.method2123(3);
                var30.method2123(var28 == null ? 0 : 1);
                var30.method2115(var27.getPath());
                if (var28 != null) {
                    var30.method2115(((File) var28).getPath());
                }
                var29.method3530(var30.field1842, 0, var30.field1841);
                var29.method3515();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("cc.v(Ljava/io/File;ZI)Z")
    public static boolean method1771(File arg0, boolean arg1) {
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

    @ObfuscatedName("ez.k(Ljava/lang/String;Ljava/lang/String;ZI)Lgi;")
    public static class207 method2688(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1365, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class207(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field622 == 33) {
            var6 = "_rc";
        } else if (Statics.field622 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2090, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class207(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class207(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
