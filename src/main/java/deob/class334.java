package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("lv")
public class class334 {

    @ObfuscatedName("lv.e")
    public static int field4235 = 0;

    @ObfuscatedName("lv.x")
    public static class444 field4228 = new class444(4096);

    @ObfuscatedName("lv.m")
    public static int field4221 = 0;

    @ObfuscatedName("lv.q")
    public static class444 field4222 = new class444(32);

    @ObfuscatedName("lv.f")
    public static int field4223 = 0;

    @ObfuscatedName("lv.r")
    public static class351 field4220 = new class351();

    @ObfuscatedName("lv.u")
    public static class444 field4225 = new class444(4096);

    @ObfuscatedName("lv.b")
    public static int field4226 = 0;

    @ObfuscatedName("lv.j")
    public static class444 field4227 = new class444(4096);

    @ObfuscatedName("lv.g")
    public static int field4234 = 0;

    @ObfuscatedName("lv.n")
    public static class467 field4229 = new class467(8);

    @ObfuscatedName("lv.a")
    public static int field4217 = 0;

    @ObfuscatedName("lv.l")
    public static CRC32 field4231 = new CRC32();

    @ObfuscatedName("lv.c")
    public static class331[] field4232 = new class331[256];

    @ObfuscatedName("lv.p")
    public static int field4237 = -1;

    @ObfuscatedName("lv.d")
    public static int field4218 = 255;

    @ObfuscatedName("lv.y")
    public static byte field4233 = 0;

    @ObfuscatedName("lv.z")
    public static int field4238 = 0;

    @ObfuscatedName("lv.w")
    public static int field4224 = 0;

    public class334() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hb.h(I)Z")
    public static boolean method4422() {
        long var0 = Statics.method1118();
        int var2 = (int) (var0 - Statics.field4219);
        Statics.field4219 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field4235 += var2;
        if (field4234 == 0 && field4223 == 0 && field4226 == 0 && field4221 == 0) {
            return true;
        } else if (Statics.field4236 == null) {
            return false;
        } else {
            try {
                if (field4235 > 30000) {
                    throw new IOException();
                }
                while (field4223 < 200 && field4221 > 0) {
                    class332 var3 = (class332) field4228.method7530();
                    class467 var4 = new class467(4);
                    var4.method7789(1);
                    var4.method7982((int) var3.field4686);
                    Statics.field4236.method6944(var4.field4917, 0, 4);
                    field4222.method7528(var3, var3.field4686);
                    field4221--;
                    field4223++;
                }
                while (field4234 < 200 && field4226 > 0) {
                    class332 var5 = (class332) field4220.method6070();
                    class467 var6 = new class467(4);
                    var6.method7789(0);
                    var6.method7982((int) var5.field4686);
                    Statics.field4236.method6944(var6.field4917, 0, 4);
                    var5.method7225();
                    field4227.method7528(var5, var5.field4686);
                    field4226--;
                    field4234++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field4236.method6945();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field4235 = 0;
                    byte var9 = 0;
                    if (Statics.field2020 == null) {
                        var9 = 8;
                    } else if (field4217 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field4229.field4915;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field4236.method6943(field4229.field4917, field4229.field4915, var10);
                        if (field4233 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field4229.field4917[field4229.field4915 + var11] ^= field4233;
                            }
                        }
                        field4229.field4915 += var10;
                        if (field4229.field4915 < var9) {
                            break;
                        }
                        if (Statics.field2020 == null) {
                            field4229.field4915 = 0;
                            int var12 = field4229.method7792();
                            int var13 = field4229.method7794();
                            int var14 = field4229.method7792();
                            int var15 = field4229.method7946();
                            long var16 = (long) ((var12 << 16) + var13);
                            class332 var18 = (class332) field4222.method7535(var16);
                            Statics.field1805 = true;
                            if (var18 == null) {
                                var18 = (class332) field4227.method7535(var16);
                                Statics.field1805 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2020 = var18;
                            Statics.field4313 = new class467(var15 + var19 + Statics.field2020.field4197);
                            Statics.field4313.method7789(var14);
                            Statics.field4313.method7778(var15);
                            field4217 = 8;
                            field4229.field4915 = 0;
                        } else if (field4217 == 0) {
                            if (field4229.field4917[0] == -1) {
                                field4217 = 1;
                                field4229.field4915 = 0;
                            } else {
                                Statics.field2020 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field4313.field4917.length - Statics.field2020.field4197;
                        int var21 = 512 - field4217;
                        if (var21 > var20 - Statics.field4313.field4915) {
                            var21 = var20 - Statics.field4313.field4915;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field4236.method6943(Statics.field4313.field4917, Statics.field4313.field4915, var21);
                        if (field4233 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field4313.field4917[Statics.field4313.field4915 + var22] ^= field4233;
                            }
                        }
                        Statics.field4313.field4915 += var21;
                        field4217 += var21;
                        if (Statics.field4313.field4915 == var20) {
                            if (Statics.field2020.field4686 == 16711935L) {
                                Statics.field1879 = Statics.field4313;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class331 var24 = field4232[var23];
                                    if (var24 != null) {
                                        Statics.field1879.field4915 = var23 * 8 + 5;
                                        if (Statics.field1879.field4915 >= Statics.field1879.field4917.length) {
                                            if (!var24.field4192) {
                                                throw new RuntimeException("");
                                            }
                                            var24.method5805();
                                        } else {
                                            int var25 = Statics.field1879.method7946();
                                            int var26 = Statics.field1879.method7946();
                                            var24.method5842(var25, var26);
                                        }
                                    }
                                }
                            } else {
                                field4231.reset();
                                field4231.update(Statics.field4313.field4917, 0, var20);
                                int var27 = (int) field4231.getValue();
                                if (Statics.field2020.field4195 != var27) {
                                    try {
                                        Statics.field4236.method6948();
                                    } catch (Exception var32) {
                                    }
                                    field4238++;
                                    Statics.field4236 = null;
                                    field4233 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field4238 = 0;
                                field4224 = 0;
                                Statics.field2020.field4194.method5835((int) (Statics.field2020.field4686 & 0xFFFFL), Statics.field4313.field4917, (Statics.field2020.field4686 & 0xFF0000L) == 16711680L, Statics.field1805);
                            }
                            Statics.field2020.method7230();
                            if (Statics.field1805) {
                                field4223--;
                            } else {
                                field4234--;
                            }
                            field4217 = 0;
                            Statics.field2020 = null;
                            Statics.field4313 = null;
                        } else {
                            if (field4217 != 512) {
                                break;
                            }
                            field4217 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field4236.method6948();
                } catch (Exception var31) {
                }
                field4224++;
                Statics.field4236 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ku.e(Lln;II)V")
    public static void method5259(class331 arg0, int arg1) {
        if (arg0.field4192) {
            if (arg1 <= field4237) {
                throw new RuntimeException("");
            }
            if (arg1 < field4218) {
                field4218 = arg1;
            }
        } else if (arg1 >= field4218) {
            throw new RuntimeException("");
        } else if (arg1 > field4237) {
            field4237 = arg1;
        }
        if (Statics.field1879 == null) {
            method3196((class331) null, 255, 255, 0, (byte) 0, true);
            field4232[arg1] = arg0;
            return;
        }
        Statics.field1879.field4915 = arg1 * 8 + 5;
        if (Statics.field1879.field4915 >= Statics.field1879.field4917.length) {
            if (!arg0.field4192) {
                throw new RuntimeException("");
            }
            arg0.method5805();
        } else {
            int var2 = Statics.field1879.method7946();
            int var3 = Statics.field1879.method7946();
            arg0.method5842(var2, var3);
        }
    }

    @ObfuscatedName("fi.v(Lln;IIIBZB)V")
    public static void method3196(class331 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class332 var8 = (class332) field4228.method7535(var6);
        if (var8 != null) {
            return;
        }
        class332 var9 = (class332) field4222.method7535(var6);
        if (var9 != null) {
            return;
        }
        class332 var10 = (class332) field4225.method7535(var6);
        if (var10 == null) {
            if (!arg5) {
                class332 var11 = (class332) field4227.method7535(var6);
                if (var11 != null) {
                    return;
                }
            }
            class332 var12 = new class332();
            var12.field4194 = arg0;
            var12.field4195 = arg3;
            var12.field4197 = arg4;
            if (arg5) {
                field4228.method7528(var12, var6);
                field4221++;
            } else {
                field4220.method6068(var12);
                field4225.method7528(var12, var6);
                field4226++;
            }
        } else if (arg5) {
            var10.method7225();
            field4228.method7528(var10, var6);
            field4226--;
            field4221++;
        }
    }

    @ObfuscatedName("id.x(B)V")
    public static void method4750() {
        if (Statics.field4236 != null) {
            Statics.field4236.method6948();
        }
    }
}
