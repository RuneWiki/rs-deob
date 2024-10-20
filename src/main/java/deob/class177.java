package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fu")
public class class177 {

    @ObfuscatedName("fu.e")
    public static class353 field2066 = null;

    @ObfuscatedName("fu.m")
    public static class353 field2067 = null;

    @ObfuscatedName("fu.c")
    public static class353 field2059 = null;

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.h(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method796(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2062 = new File(Statics.field1560, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2062.exists()) {
            try {
                class354 var7 = new class354(Statics.field2062, "rw", 10000L);
                class311 var8 = new class311((int) var7.method6134());
                while (var8.field3752 < var8.field3753.length) {
                    int var9 = var7.method6133(var8.field3753, var8.field3752, var8.field3753.length - var8.field3752);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field3752 += var9;
                }
                var8.field3752 = 0;
                int var10 = var8.method5274();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5274();
                }
                if (var10 <= 2) {
                    var4 = var8.method5347();
                    if (var11 == 1) {
                        var5 = var8.method5347();
                    }
                } else {
                    var4 = var8.method5219();
                    if (var11 == 1) {
                        var5 = var8.method5219();
                    }
                }
                var7.method6135();
            } catch (IOException var45) {
                var45.printStackTrace();
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
                } catch (Exception var43) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label134: for (int var19 = 0; var19 < Statics.field1319.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1118.length; var20++) {
                    File var21 = new File(Statics.field1118[var20] + Statics.field1319[var19] + File.separatorChar + arg0 + File.separatorChar);
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
                        } catch (Exception var42) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label134;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1560 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var44) {
                var44.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var36 = new File(var4);
            Object var37 = null;
            try {
                class354 var38 = new class354(Statics.field2062, "rw", 10000L);
                class311 var39 = new class311(500);
                var39.method5095(3);
                var39.method5095(var37 == null ? 0 : 1);
                var39.method5107(var36.getPath());
                if (var37 != null) {
                    var39.method5107(((File) var37).getPath());
                }
                var38.method6131(var39.field3753, 0, var39.field3752);
                var38.method6135();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("k.x(I)V")
    public static void method215() {
        try {
            File var0 = new File(Statics.field1560, "random.dat");
            if (var0.exists()) {
                field2066 = new class353(new class354(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1319.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1118.length; var2++) {
                        File var3 = new File(Statics.field1118[var2] + Statics.field1319[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2066 = new class353(new class354(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2066 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2066 = new class353(new class354(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
