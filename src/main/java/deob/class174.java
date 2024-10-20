package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gd")
public class class174 {

    @ObfuscatedName("gd.at")
    public static class497 field1839 = null;

    @ObfuscatedName("gd.ah")
    public static class497 field1834 = null;

    @ObfuscatedName("gd.ax")
    public static class497 field1837 = null;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hv.aw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3250(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field1841 = arg4;
        Statics.field4659 = arg3;
        try {
            Statics.field4618 = System.getProperty("os.name");
        } catch (Exception var66) {
            Statics.field4618 = "Unknown";
        }
        Statics.field2348 = Statics.field4618.toLowerCase();
        Statics.field4720 = null;
        try {
            Statics.field4720 = System.getProperty("jagex.userhome");
        } catch (Exception var65) {
        }
        if (Statics.field4720 == null) {
            try {
                Statics.field4720 = System.getProperty("user.home");
            } catch (Exception var64) {
            }
        }
        if (Statics.field4720 != null) {
            Statics.field4720 = Statics.field4720 + "/";
        }
        try {
            if (Statics.field2348.startsWith("win")) {
                if (Statics.field4720 == null) {
                    Statics.field4720 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field4720 == null) {
                Statics.field4720 = System.getenv("HOME");
            }
            if (Statics.field4720 != null) {
                Statics.field4720 = Statics.field4720 + "/";
            }
        } catch (Exception var63) {
        }
        if (Statics.field4720 == null) {
            Statics.field4720 = "~/";
        }
        Statics.field1746 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field4720, "/tmp/", "" };
        Statics.field4542 = new String[] { ".jagex_cache_" + Statics.field4659, ".file_store_" + Statics.field4659 };
        int var9 = 0;
        label265: while (var9 < 4) {
            String var10 = var9 == 0 ? "" : "" + var9;
            Statics.field1749 = new File(Statics.field4720, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
            String var11 = null;
            String var12 = null;
            boolean var13 = false;
            if (Statics.field1749.exists()) {
                try {
                    class496 var14 = new class496(Statics.field1749, "rw", 10000L);
                    class514 var15 = new class514((int) var14.method8022());
                    while (var15.field5072 < var15.field5070.length) {
                        int var16 = var14.method8024(var15.field5070, var15.field5072, var15.field5070.length - var15.field5072);
                        if (var16 == -1) {
                            throw new IOException();
                        }
                        var15.field5072 += var16;
                    }
                    var15.field5072 = 0;
                    int var17 = var15.method8244();
                    if (var17 < 1 || var17 > 3) {
                        throw new IOException("" + var17);
                    }
                    int var18 = 0;
                    if (var17 > 1) {
                        var18 = var15.method8244();
                    }
                    if (var17 <= 2) {
                        var11 = var15.method8256();
                        if (var18 == 1) {
                            var12 = var15.method8256();
                        }
                    } else {
                        var11 = var15.method8257();
                        if (var18 == 1) {
                            var12 = var15.method8257();
                        }
                    }
                    var14.method8020();
                } catch (IOException var68) {
                    var68.printStackTrace();
                }
                if (var11 != null) {
                    File var20 = new File(var11);
                    if (!var20.exists()) {
                        var11 = null;
                    }
                }
                if (var11 != null) {
                    File var21 = new File(var11, "test.dat");
                    boolean var24;
                    try {
                        RandomAccessFile var22 = new RandomAccessFile(var21, "rw");
                        int var23 = var22.read();
                        var22.seek(0L);
                        var22.write(var23);
                        var22.seek(0L);
                        var22.close();
                        var21.delete();
                        var24 = true;
                    } catch (Exception var62) {
                        var24 = false;
                    }
                    if (!var24) {
                        var11 = null;
                    }
                }
            }
            if (var11 == null && var9 == 0) {
                label239: for (int var26 = 0; var26 < Statics.field4542.length; var26++) {
                    for (int var27 = 0; var27 < Statics.field1746.length; var27++) {
                        File var28 = new File(Statics.field1746[var27] + Statics.field4542[var26] + File.separatorChar + arg0 + File.separatorChar);
                        if (var28.exists()) {
                            File var29 = new File(var28, "test.dat");
                            boolean var32;
                            try {
                                RandomAccessFile var30 = new RandomAccessFile(var29, "rw");
                                int var31 = var30.read();
                                var30.seek(0L);
                                var30.write(var31);
                                var30.seek(0L);
                                var30.close();
                                var29.delete();
                                var32 = true;
                            } catch (Exception var61) {
                                var32 = false;
                            }
                            if (var32) {
                                var11 = var28.toString();
                                var13 = true;
                                break label239;
                            }
                        }
                    }
                }
            }
            if (var11 == null) {
                var11 = Statics.field4720 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
                var13 = true;
            }
            if (var12 != null) {
                File var34 = new File(var12);
                File var35 = new File(var11);
                try {
                    File[] var36 = var34.listFiles();
                    File[] var37 = var36;
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        File var39 = var37[var38];
                        File var40 = new File(var35, var39.getName());
                        boolean var41 = var39.renameTo(var40);
                        if (!var41) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var67) {
                    var67.printStackTrace();
                }
                var13 = true;
            }
            if (var13) {
                File var43 = new File(var11);
                Object var44 = null;
                try {
                    class496 var45 = new class496(Statics.field1749, "rw", 10000L);
                    class514 var46 = new class514(500);
                    var46.method8227(3);
                    var46.method8227(var44 == null ? 0 : 1);
                    var46.method8236(var43.getPath());
                    if (var44 != null) {
                        var46.method8236(((File) var44).getPath());
                    }
                    var45.method8019(var46.field5070, 0, var46.field5072);
                    var45.method8020();
                } catch (IOException var60) {
                    var60.printStackTrace();
                }
            }
            File var48 = new File(var11);
            Statics.field1836 = var48;
            if (!Statics.field1836.exists()) {
                Statics.field1836.mkdirs();
            }
            File[] var49 = Statics.field1836.listFiles();
            if (var49 != null) {
                File[] var50 = var49;
                for (int var51 = 0; var51 < var50.length; var51++) {
                    File var52 = var50[var51];
                    boolean var55;
                    try {
                        RandomAccessFile var53 = new RandomAccessFile(var52, "rw");
                        int var54 = var53.read();
                        var53.seek(0L);
                        var53.write(var54);
                        var53.seek(0L);
                        var53.close();
                        var55 = true;
                    } catch (Exception var59) {
                        var55 = false;
                    }
                    if (!var55) {
                        var9++;
                        continue label265;
                    }
                }
            }
            break;
        }
        File var57 = Statics.field1836;
        Statics.field1846 = var57;
        if (!Statics.field1846.exists()) {
            throw new RuntimeException("");
        }
        class176.field1847 = true;
        method7247();
        field1834 = new class497(new class496(class176.method57("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1837 = new class497(new class496(class176.method57("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field3373 = new class497[Statics.field1841];
        for (int var58 = 0; var58 < Statics.field1841; var58++) {
            Statics.field3373[var58] = new class497(new class496(class176.method57("main_file_cache.idx" + var58), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cj.ay(Ljava/lang/String;Ljava/lang/String;ZB)Ltn;")
    public static class496 method1075(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1836, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class496(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field4659 == 33) {
            var6 = "_rc";
        } else if (Statics.field4659 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field4720, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class496(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class496(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("qe.ar(B)V")
    public static void method7247() {
        try {
            File var0 = new File(Statics.field4720, "random.dat");
            if (var0.exists()) {
                field1839 = new class497(new class496(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field4542.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1746.length; var2++) {
                        File var3 = new File(Statics.field1746[var2] + Statics.field4542[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1839 = new class497(new class496(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1839 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1839 = new class497(new class496(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ir.am(I)[B")
    public static byte[] method3862() {
        byte[] var0 = new byte[24];
        try {
            field1839.method8047(0L);
            field1839.method8055(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }
}
