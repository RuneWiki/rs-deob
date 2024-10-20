package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("nl")
public class class345 {

    @ObfuscatedName("nl.an")
    public static int field4251 = 0;

    @ObfuscatedName("nl.ac")
    public static class465 field4242 = new class465(4096);

    @ObfuscatedName("nl.au")
    public static int field4243 = 0;

    @ObfuscatedName("nl.ab")
    public static class465 field4244 = new class465(32);

    @ObfuscatedName("nl.aq")
    public static int field4245 = 0;

    @ObfuscatedName("nl.al")
    public static class362 field4246 = new class362();

    @ObfuscatedName("nl.at")
    public static class465 field4247 = new class465(4096);

    @ObfuscatedName("nl.aa")
    public static int field4257 = 0;

    @ObfuscatedName("nl.ay")
    public static class465 field4249 = new class465(4096);

    @ObfuscatedName("nl.ao")
    public static int field4250 = 0;

    @ObfuscatedName("nl.ag")
    public static class489 field4252 = new class489(8);

    @ObfuscatedName("nl.av")
    public static int field4254 = 0;

    @ObfuscatedName("nl.am")
    public static CRC32 field4255 = new CRC32();

    @ObfuscatedName("nl.aj")
    public static class342[] field4240 = new class342[256];

    @ObfuscatedName("nl.ak")
    public static int field4239 = -1;

    @ObfuscatedName("nl.az")
    public static int field4258 = 255;

    @ObfuscatedName("nl.ad")
    public static byte field4256 = 0;

    @ObfuscatedName("nl.ae")
    public static int field4262 = 0;

    @ObfuscatedName("nl.ap")
    public static int field4261 = 0;

    public class345() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("is.af(B)Z")
    public static boolean method4060() {
        long var0 = class294.method2504();
        int var2 = (int) (var0 - Statics.field4260);
        Statics.field4260 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field4251 += var2;
        if (field4250 == 0 && field4245 == 0 && field4257 == 0 && field4243 == 0) {
            return true;
        } else if (Statics.field4241 == null) {
            return false;
        } else {
            try {
                if (field4251 > 30000) {
                    throw new IOException();
                }
                while (field4245 < 200 && field4243 > 0) {
                    class343 var3 = (class343) field4242.method7972();
                    class489 var4 = new class489(4);
                    var4.method8285(1);
                    var4.method8292((int) var3.field4745);
                    Statics.field4241.method7286(var4.field4991, 0, 4);
                    field4244.method7967(var3, var3.field4745);
                    field4243--;
                    field4245++;
                }
                while (field4250 < 200 && field4257 > 0) {
                    class343 var5 = (class343) field4246.method6315();
                    class489 var6 = new class489(4);
                    var6.method8285(0);
                    var6.method8292((int) var5.field4745);
                    Statics.field4241.method7286(var6.field4991, 0, 4);
                    var5.method7640();
                    field4249.method7967(var5, var5.field4745);
                    field4257--;
                    field4250++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field4241.method7283();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field4251 = 0;
                    byte var9 = 0;
                    if (Statics.field973 == null) {
                        var9 = 8;
                    } else if (field4254 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field4252.field4989;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field4241.method7289(field4252.field4991, field4252.field4989, var10);
                        if (field4256 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field4252.field4991[field4252.field4989 + var11] ^= field4256;
                            }
                        }
                        field4252.field4989 += var10;
                        if (field4252.field4989 < var9) {
                            break;
                        }
                        if (Statics.field973 == null) {
                            field4252.field4989 = 0;
                            int var12 = field4252.method8248();
                            int var13 = field4252.method8250();
                            int var14 = field4252.method8248();
                            int var15 = field4252.method8254();
                            long var16 = (long) ((var12 << 16) + var13);
                            class343 var18 = (class343) field4244.method7966(var16);
                            Statics.field4248 = true;
                            if (var18 == null) {
                                var18 = (class343) field4249.method7966(var16);
                                Statics.field4248 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field973 = var18;
                            Statics.field4253 = new class489(var15 + var19 + Statics.field973.field4218);
                            Statics.field4253.method8285(var14);
                            Statics.field4253.method8234(var15);
                            field4254 = 8;
                            field4252.field4989 = 0;
                        } else if (field4254 == 0) {
                            if (field4252.field4991[0] == -1) {
                                field4254 = 1;
                                field4252.field4989 = 0;
                            } else {
                                Statics.field973 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field4253.field4991.length - Statics.field973.field4218;
                        int var21 = 512 - field4254;
                        if (var21 > var20 - Statics.field4253.field4989) {
                            var21 = var20 - Statics.field4253.field4989;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field4241.method7289(Statics.field4253.field4991, Statics.field4253.field4989, var21);
                        if (field4256 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field4253.field4991[Statics.field4253.field4989 + var22] ^= field4256;
                            }
                        }
                        Statics.field4253.field4989 += var21;
                        field4254 += var21;
                        if (Statics.field4253.field4989 == var20) {
                            if (Statics.field973.field4745 == 16711935L) {
                                Statics.field929 = Statics.field4253;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class342 var24 = field4240[var23];
                                    if (var24 != null) {
                                        Statics.field929.field4989 = var23 * 8 + 5;
                                        if (Statics.field929.field4989 >= Statics.field929.field4991.length) {
                                            if (!var24.field4212) {
                                                throw new RuntimeException("");
                                            }
                                            var24.method6042();
                                        } else {
                                            int var25 = Statics.field929.method8254();
                                            int var26 = Statics.field929.method8254();
                                            var24.method6021(var25, var26);
                                        }
                                    }
                                }
                            } else {
                                field4255.reset();
                                field4255.update(Statics.field4253.field4991, 0, var20);
                                int var27 = (int) field4255.getValue();
                                if (Statics.field973.field4216 != var27) {
                                    try {
                                        Statics.field4241.method7287();
                                    } catch (Exception var32) {
                                    }
                                    field4262++;
                                    Statics.field4241 = null;
                                    field4256 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field4262 = 0;
                                field4261 = 0;
                                Statics.field973.field4220.method6022((int) (Statics.field973.field4745 & 0xFFFFL), Statics.field4253.field4991, (Statics.field973.field4745 & 0xFF0000L) == 16711680L, Statics.field4248);
                            }
                            Statics.field973.method7651();
                            if (Statics.field4248) {
                                field4245--;
                            } else {
                                field4250--;
                            }
                            field4254 = 0;
                            Statics.field973 = null;
                            Statics.field4253 = null;
                        } else {
                            if (field4254 != 512) {
                                break;
                            }
                            field4254 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field4241.method7287();
                } catch (Exception var31) {
                }
                field4261++;
                Statics.field4241 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("gn.an(ZI)V")
    public static void method3314(boolean arg0) {
        if (Statics.field4241 == null) {
            return;
        }
        try {
            class489 var1 = new class489(4);
            var1.method8285(arg0 ? 2 : 3);
            var1.method8292(0);
            Statics.field4241.method7286(var1.field4991, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field4241.method7287();
            } catch (Exception var4) {
            }
            field4261++;
            Statics.field4241 = null;
        }
    }

    @ObfuscatedName("cq.aw(Lnd;IIIBZB)V")
    public static void method1131(class342 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class343 var8 = (class343) field4242.method7966(var6);
        if (var8 != null) {
            return;
        }
        class343 var9 = (class343) field4244.method7966(var6);
        if (var9 != null) {
            return;
        }
        class343 var10 = (class343) field4247.method7966(var6);
        if (var10 == null) {
            if (!arg5) {
                class343 var11 = (class343) field4249.method7966(var6);
                if (var11 != null) {
                    return;
                }
            }
            class343 var12 = new class343();
            var12.field4220 = arg0;
            var12.field4216 = arg3;
            var12.field4218 = arg4;
            if (arg5) {
                field4242.method7967(var12, var6);
                field4243++;
            } else {
                field4246.method6313(var12);
                field4247.method7967(var12, var6);
                field4257++;
            }
        } else if (arg5) {
            var10.method7640();
            field4242.method7967(var10, var6);
            field4257--;
            field4243++;
        }
    }

    @ObfuscatedName("aj.ac(III)I")
    public static int method298(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field973 != null && Statics.field973.field4745 == var2 ? Statics.field4253.field4989 * 99 / (Statics.field4253.field4991.length - Statics.field973.field4218) + 1 : 0;
    }

    @ObfuscatedName("hd.au(ZZB)I")
    public static int method3449(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field4245 + field4243;
        }
        if (arg1) {
            var2 += field4257 + field4250;
        }
        return var2;
    }

    @ObfuscatedName("la.ab(B)V")
    public static void method5193() {
        if (Statics.field4241 != null) {
            Statics.field4241.method7287();
        }
    }
}
