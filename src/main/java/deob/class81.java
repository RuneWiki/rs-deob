package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cq")
public class class81 {

    @ObfuscatedName("cq.u")
    public static class29 field1433 = null;

    @ObfuscatedName("cq.z")
    public static class29 field1434 = null;

    @ObfuscatedName("cq.e")
    public static class29 field1435 = null;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.j(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2996(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1439 = new File(Statics.field2777, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1439.exists()) {
            try {
                class28 var7 = new class28(Statics.field1439, "rw", 10000L);
                class126 var8 = new class126((int) var7.method521());
                while (var8.field2043 < var8.field2047.length) {
                    int var9 = var7.method510(var8.field2047, var8.field2043, var8.field2047.length - var8.field2043);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2043 += var9;
                }
                var8.field2043 = 0;
                int var10 = var8.method2544();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2544();
                }
                if (var10 <= 2) {
                    var4 = var8.method2443();
                    if (var11 == 1) {
                        var5 = var8.method2443();
                    }
                } else {
                    var4 = var8.method2385();
                    if (var11 == 1) {
                        var5 = var8.method2385();
                    }
                }
                var7.method509();
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
            label119: for (int var19 = 0; var19 < Statics.field2356.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1528.length; var20++) {
                    File var21 = new File(Statics.field1528[var20] + Statics.field2356[var19] + File.separatorChar + arg0 + File.separatorChar);
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
            var4 = Statics.field2777 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method245(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("client.w(Ljava/io/File;Ljava/io/File;B)V")
    public static void method245(File arg0, File arg1) {
        try {
            class28 var2 = new class28(Statics.field1439, "rw", 10000L);
            class126 var3 = new class126(500);
            var3.method2362(3);
            var3.method2362(arg1 == null ? 0 : 1);
            var3.method2368(arg0.getPath());
            if (arg1 != null) {
                var3.method2368(arg1.getPath());
            }
            var2.method508(var3.field2047, 0, var3.field2043);
            var2.method509();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("dg.h(Ldv;IB)V")
    public static void method2617(class126 arg0, int arg1) {
        if (field1433 == null) {
            return;
        }
        try {
            field1433.method532(0L);
            field1433.method533(arg0.field2047, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("j.v(B)V")
    public static void method16() {
        try {
            field1434.method536();
            for (int var0 = 0; var0 < Statics.field2057; var0++) {
                Statics.field1432[var0].method536();
            }
            field1435.method536();
            field1433.method536();
        } catch (Exception var2) {
        }
    }
}
