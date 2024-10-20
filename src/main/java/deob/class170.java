package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gc")
public class class170 {

    @ObfuscatedName("gc.ao")
    public static class472 field1835 = null;

    @ObfuscatedName("gc.ax")
    public static class472 field1836 = null;

    @ObfuscatedName("gc.ai")
    public static class472 field1841 = null;

    public class170() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.af(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3136(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1832 = new File(Statics.field2000, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1832.exists()) {
            try {
                class471 var7 = new class471(Statics.field1832, "rw", 10000L);
                class489 var8 = new class489((int) var7.method8010());
                while (var8.field4989 < var8.field4991.length) {
                    int var9 = var7.method8011(var8.field4991, var8.field4989, var8.field4991.length - var8.field4989);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4989 += var9;
                }
                var8.field4989 = 0;
                int var10 = var8.method8248();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method8248();
                }
                if (var10 <= 2) {
                    var4 = var8.method8260();
                    if (var11 == 1) {
                        var5 = var8.method8260();
                    }
                } else {
                    var4 = var8.method8228();
                    if (var11 == 1) {
                        var5 = var8.method8228();
                    }
                }
                var7.method8005();
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
            label134: for (int var19 = 0; var19 < Statics.field1292.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1577.length; var20++) {
                    File var21 = new File(Statics.field1577[var20] + Statics.field1292[var19] + File.separatorChar + arg0 + File.separatorChar);
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
            var4 = Statics.field2000 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class471 var38 = new class471(Statics.field1832, "rw", 10000L);
                class489 var39 = new class489(500);
                var39.method8285(3);
                var39.method8285(var37 == null ? 0 : 1);
                var39.method8240(var36.getPath());
                if (var37 != null) {
                    var39.method8240(((File) var37).getPath());
                }
                var38.method8023(var39.field4991, 0, var39.field4989);
                var38.method8005();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("in.an(Ljava/lang/String;Ljava/lang/String;ZB)Lsy;")
    public static class471 method4098(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3832, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class471(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1838 == 33) {
            var6 = "_rc";
        } else if (Statics.field1838 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2000, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class471(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class471(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cd.aw(B)V")
    public static void method2116() {
        try {
            File var0 = new File(Statics.field2000, "random.dat");
            if (var0.exists()) {
                field1835 = new class472(new class471(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1292.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1577.length; var2++) {
                        File var3 = new File(Statics.field1577[var2] + Statics.field1292[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1835 = new class472(new class471(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1835 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1835 = new class472(new class471(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("gx.ac(Lsg;II)V")
    public static void method3321(class489 arg0, int arg1) {
        if (field1835 == null) {
            return;
        }
        try {
            field1835.method8027(0L);
            field1835.method8033(arg0.field4991, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
