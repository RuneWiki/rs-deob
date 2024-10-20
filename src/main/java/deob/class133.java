package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ef")
public class class133 {

    @ObfuscatedName("ef.g")
    public static class186 field2077 = null;

    @ObfuscatedName("ef.d")
    public static class186 field2078 = null;

    @ObfuscatedName("ef.b")
    public static class186 field2079 = null;

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.z(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2438(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2073 = new File(Statics.field767, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2073.exists()) {
            try {
                class185 var7 = new class185(Statics.field2073, "rw", 10000L);
                class104 var8 = new class104((int) var7.method3398());
                while (var8.field1815 < var8.field1819.length) {
                    int var9 = var7.method3401(var8.field1819, var8.field1815, var8.field1819.length - var8.field1815);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1815 += var9;
                }
                var8.field1815 = 0;
                int var10 = var8.method2257();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2257();
                }
                if (var10 <= 2) {
                    var4 = var8.method2112();
                    if (var11 == 1) {
                        var5 = var8.method2112();
                    }
                } else {
                    var4 = var8.method2181();
                    if (var11 == 1) {
                        var5 = var8.method2181();
                    }
                }
                var7.method3397();
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
            label134: for (int var19 = 0; var19 < Statics.field1553.length; var19++) {
                for (int var20 = 0; var20 < Statics.field183.length; var20++) {
                    File var21 = new File(Statics.field183[var20] + Statics.field1553[var19] + File.separatorChar + arg0 + File.separatorChar);
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
            var4 = Statics.field767 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class185 var38 = new class185(Statics.field2073, "rw", 10000L);
                class104 var39 = new class104(500);
                var39.method2113(3);
                var39.method2113(var37 == null ? 0 : 1);
                var39.method2120(var36.getPath());
                if (var37 != null) {
                    var39.method2120(((File) var37).getPath());
                }
                var38.method3396(var39.field1819, 0, var39.field1815);
                var38.method3397();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("cc.n(Ljava/lang/String;Ljava/lang/String;ZB)Lgc;")
    public static class185 method1891(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2905, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class185(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1837 == 33) {
            var6 = "_rc";
        } else if (Statics.field1837 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field767, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class185(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class185(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("v.u(I)V")
    public static void method121() {
        try {
            File var0 = new File(Statics.field767, "random.dat");
            if (var0.exists()) {
                field2077 = new class186(new class185(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1553.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field183.length; var2++) {
                        File var3 = new File(Statics.field183[var2] + Statics.field1553[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2077 = new class186(new class185(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2077 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2077 = new class186(new class185(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("e.t(Lcj;I)V")
    public static void method39(class104 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2077.method3428(0L);
            field2077.method3419(var1);
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
        arg0.method2276(var1, 0, 24);
    }

    @ObfuscatedName("c.e(Lcj;II)V")
    public static void method524(class104 arg0, int arg1) {
        if (field2077 == null) {
            return;
        }
        try {
            field2077.method3428(0L);
            field2077.method3435(arg0.field1819, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("da.a(I)V")
    public static void method2619() {
        try {
            field2078.method3416();
            for (int var0 = 0; var0 < Statics.field2070; var0++) {
                Statics.field1256[var0].method3416();
            }
            field2079.method3416();
            field2077.method3416();
        } catch (Exception var2) {
        }
    }
}
