package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fh")
public class class168 {

    @ObfuscatedName("fh.b")
    public static class342 field2028 = null;

    @ObfuscatedName("fh.o")
    public static class342 field2027 = null;

    @ObfuscatedName("fh.a")
    public static class342 field2020 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.z(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method496(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2023 = new File(Statics.field2029, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2023.exists()) {
            try {
                class343 var7 = new class343(Statics.field2023, "rw", 10000L);
                class300 var8 = new class300((int) var7.method5982());
                while (var8.field3702 < var8.field3699.length) {
                    int var9 = var7.method5983(var8.field3699, var8.field3702, var8.field3699.length - var8.field3702);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field3702 += var9;
                }
                var8.field3702 = 0;
                int var10 = var8.method4990();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method4990();
                }
                if (var10 <= 2) {
                    var4 = var8.method5050();
                    if (var11 == 1) {
                        var5 = var8.method5050();
                    }
                } else {
                    var4 = var8.method4972();
                    if (var11 == 1) {
                        var5 = var8.method4972();
                    }
                }
                var7.method5997();
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
            label134: for (int var19 = 0; var19 < Statics.field3538.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1949.length; var20++) {
                    File var21 = new File(Statics.field1949[var20] + Statics.field3538[var19] + File.separatorChar + arg0 + File.separatorChar);
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
            var4 = Statics.field2029 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class343 var38 = new class343(Statics.field2023, "rw", 10000L);
                class300 var39 = new class300(500);
                var39.method5065(3);
                var39.method5065(var37 == null ? 0 : 1);
                var39.method4991(var36.getPath());
                if (var37 != null) {
                    var39.method4991(((File) var37).getPath());
                }
                var38.method5993(var39.field3699, 0, var39.field3702);
                var38.method5997();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("gw.n(Ljava/lang/String;Ljava/lang/String;ZS)Lmh;")
    public static class343 method3269(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field632, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class343(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3762 == 33) {
            var6 = "_rc";
        } else if (Statics.field3762 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2029, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class343(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class343(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dn.v(Lkl;II)V")
    public static void method2242(class300 arg0, int arg1) {
        if (field2028 == null) {
            return;
        }
        try {
            field2028.method5953(0L);
            field2028.method5960(arg0.field3699, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("es.u(B)V")
    public static void method2963() {
        try {
            field2027.method5954();
            for (int var0 = 0; var0 < Statics.field2024; var0++) {
                Statics.field2329[var0].method5954();
            }
            field2020.method5954();
            field2028.method5954();
        } catch (Exception var2) {
        }
    }
}
