package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fg")
public class class165 {

    @ObfuscatedName("fg.s")
    public static class447 field1790 = null;

    @ObfuscatedName("fg.p")
    public static class447 field1795 = null;

    @ObfuscatedName("fg.b")
    public static class447 field1801 = null;

    public class165() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.a(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;")
    public static File method47(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1793 = new File(Statics.field257, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1793.exists()) {
            try {
                class446 var7 = new class446(Statics.field1793, "rw", 10000L);
                class464 var8 = new class464((int) var7.method7501());
                while (var8.field4864 < var8.field4867.length) {
                    int var9 = var7.method7497(var8.field4867, var8.field4864, var8.field4867.length - var8.field4864);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4864 += var9;
                }
                var8.field4864 = 0;
                int var10 = var8.method7735();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method7735();
                }
                if (var10 <= 2) {
                    var4 = var8.method7726();
                    if (var11 == 1) {
                        var5 = var8.method7726();
                    }
                } else {
                    var4 = var8.method7727();
                    if (var11 == 1) {
                        var5 = var8.method7727();
                    }
                }
                var7.method7502();
            } catch (IOException var40) {
                var40.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method459(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label126: for (int var15 = 0; var15 < Statics.field2941.length; var15++) {
                for (int var16 = 0; var16 < Statics.field4222.length; var16++) {
                    File var17 = new File(Statics.field4222[var16] + Statics.field2941[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists()) {
                        File var18 = new File(var17, "test.dat");
                        boolean var21;
                        try {
                            RandomAccessFile var19 = new RandomAccessFile(var18, "rw");
                            int var20 = var19.read();
                            var19.seek(0L);
                            var19.write(var20);
                            var19.seek(0L);
                            var19.close();
                            var18.delete();
                            var21 = true;
                        } catch (Exception var38) {
                            var21 = false;
                        }
                        if (var21) {
                            var4 = var17.toString();
                            var6 = true;
                            break label126;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field257 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var23 = new File(var5);
            File var24 = new File(var4);
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
            } catch (Exception var39) {
                var39.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var32 = new File(var4);
            Object var33 = null;
            try {
                class446 var34 = new class446(Statics.field1793, "rw", 10000L);
                class464 var35 = new class464(500);
                var35.method7698(3);
                var35.method7698(var33 == null ? 0 : 1);
                var35.method7793(var32.getPath());
                if (var33 != null) {
                    var35.method7793(((File) var33).getPath());
                }
                var34.method7498(var35.field4867, 0, var35.field4864);
                var34.method7502();
            } catch (IOException var37) {
                var37.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("af.f(Ljava/io/File;ZI)Z")
    public static boolean method459(File arg0, boolean arg1) {
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

    @ObfuscatedName("fe.c(Ljava/lang/String;Ljava/lang/String;ZB)Lqv;")
    public static class446 method2975(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3639, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class446(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1803 == 33) {
            var6 = "_rc";
        } else if (Statics.field1803 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field257, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class446(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class446(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gq.x(Lqr;II)V")
    public static void method3554(class464 arg0, int arg1) {
        if (field1790 == null) {
            return;
        }
        try {
            field1790.method7518(0L);
            field1790.method7523(arg0.field4867, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
