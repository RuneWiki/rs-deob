package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ep")
public class class140 {

    @ObfuscatedName("ep.o")
    public static class210 field2101 = null;

    @ObfuscatedName("ep.c")
    public static class210 field2104 = null;

    @ObfuscatedName("ep.r")
    public static class210 field2098 = null;

    public class140() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.v(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method317(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2100 = new File(Statics.field2858, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2100.exists()) {
            try {
                class209 var7 = new class209(Statics.field2100, "rw", 10000L);
                class110 var8 = new class110((int) var7.method3587());
                while (var8.field1847 < var8.field1853.length) {
                    int var9 = var7.method3583(var8.field1853, var8.field1847, var8.field1853.length - var8.field1847);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1847 += var9;
                }
                var8.field1847 = 0;
                int var10 = var8.method2257();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2257();
                }
                if (var10 <= 2) {
                    var4 = var8.method2170();
                    if (var11 == 1) {
                        var5 = var8.method2170();
                    }
                } else {
                    var4 = var8.method2171();
                    if (var11 == 1) {
                        var5 = var8.method2171();
                    }
                }
                var7.method3579();
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
            label134: for (int var19 = 0; var19 < Statics.field2954.length; var19++) {
                for (int var20 = 0; var20 < Statics.field512.length; var20++) {
                    File var21 = new File(Statics.field512[var20] + Statics.field2954[var19] + File.separatorChar + arg0 + File.separatorChar);
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
            var4 = Statics.field2858 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class209 var38 = new class209(Statics.field2100, "rw", 10000L);
                class110 var39 = new class110(500);
                var39.method2263(3);
                var39.method2263(var37 == null ? 0 : 1);
                var39.method2150(var36.getPath());
                if (var37 != null) {
                    var39.method2150(((File) var37).getPath());
                }
                var38.method3591(var39.field1853, 0, var39.field1847);
                var38.method3579();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("dv.t(Ljava/lang/String;Ljava/lang/String;ZI)Lhs;")
    public static class209 method2484(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3044, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class209(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2096 == 33) {
            var6 = "_rc";
        } else if (Statics.field2096 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2858, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("aj.f(Ldp;I)V")
    public static void method607(class110 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2101.method3598(0L);
            field2101.method3612(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var5) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2248(var1, 0, 24);
    }

    @ObfuscatedName("i.j(Ldp;IS)V")
    public static void method497(class110 arg0, int arg1) {
        if (field2101 == null) {
            return;
        }
        try {
            field2101.method3598(0L);
            field2101.method3602(arg0.field1853, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
