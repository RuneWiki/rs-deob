package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fm")
public class class168 {

    @ObfuscatedName("fm.h")
    public static class343 field2040 = null;

    @ObfuscatedName("fm.v")
    public static class343 field2046 = null;

    @ObfuscatedName("fm.n")
    public static class343 field2047 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.c(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1164(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2037 = new File(Statics.field1960, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2037.exists()) {
            try {
                class344 var7 = new class344(Statics.field2037, "rw", 10000L);
                class301 var8 = new class301((int) var7.method6131());
                while (var8.field3707 < var8.field3708.length) {
                    int var9 = var7.method6132(var8.field3708, var8.field3707, var8.field3708.length - var8.field3707);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field3707 += var9;
                }
                var8.field3707 = 0;
                int var10 = var8.method5129();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5129();
                }
                if (var10 <= 2) {
                    var4 = var8.method5338();
                    if (var11 == 1) {
                        var5 = var8.method5338();
                    }
                } else {
                    var4 = var8.method5140();
                    if (var11 == 1) {
                        var5 = var8.method5140();
                    }
                }
                var7.method6129();
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
            label134: for (int var19 = 0; var19 < Statics.field374.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1292.length; var20++) {
                    File var21 = new File(Statics.field1292[var20] + Statics.field374[var19] + File.separatorChar + arg0 + File.separatorChar);
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
            var4 = Statics.field1960 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class344 var38 = new class344(Statics.field2037, "rw", 10000L);
                class301 var39 = new class301(500);
                var39.method5272(3);
                var39.method5272(var37 == null ? 0 : 1);
                var39.method5122(var36.getPath());
                if (var37 != null) {
                    var39.method5122(((File) var37).getPath());
                }
                var38.method6128(var39.field3708, 0, var39.field3707);
                var38.method6129();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("r.t(Ljava/lang/String;Ljava/lang/String;ZI)Lmx;")
    public static class344 method264(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2041, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class344(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field644 == 33) {
            var6 = "_rc";
        } else if (Statics.field644 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1960, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class344(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class344(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("e.o(B)V")
    public static void method39() {
        try {
            File var0 = new File(Statics.field1960, "random.dat");
            if (var0.exists()) {
                field2040 = new class343(new class344(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field374.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1292.length; var2++) {
                        File var3 = new File(Statics.field1292[var2] + Statics.field374[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2040 = new class343(new class344(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2040 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2040 = new class343(new class344(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("af.e(Lkp;IS)V")
    public static void method365(class301 arg0, int arg1) {
        if (field2040 == null) {
            return;
        }
        try {
            field2040.method6114(0L);
            field2040.method6100(arg0.field3708, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
