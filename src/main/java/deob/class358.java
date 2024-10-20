package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("nx")
public class class358 {

    @ObfuscatedName("nx.an")
    public static int field4277 = 0;

    @ObfuscatedName("nx.as")
    public static class477 field4273 = new class477(4096);

    @ObfuscatedName("nx.ax")
    public static int field4270 = 0;

    @ObfuscatedName("nx.ap")
    public static class477 field4267 = new class477(32);

    @ObfuscatedName("nx.ab")
    public static int field4272 = 0;

    @ObfuscatedName("nx.ak")
    public static class375 field4281 = new class375();

    @ObfuscatedName("nx.ae")
    public static class477 field4269 = new class477(4096);

    @ObfuscatedName("nx.af")
    public static int field4275 = 0;

    @ObfuscatedName("nx.ao")
    public static class477 field4276 = new class477(4096);

    @ObfuscatedName("nx.aa")
    public static int field4284 = 0;

    @ObfuscatedName("nx.ac")
    public static class501 field4278 = new class501(8);

    @ObfuscatedName("nx.ar")
    public static int field4279 = 0;

    @ObfuscatedName("nx.az")
    public static CRC32 field4280 = new CRC32();

    @ObfuscatedName("nx.ai")
    public static class355[] field4274 = new class355[256];

    @ObfuscatedName("nx.aq")
    public static int field4282 = -1;

    @ObfuscatedName("nx.aw")
    public static int field4268 = 255;

    @ObfuscatedName("nx.ay")
    public static byte field4283 = 0;

    @ObfuscatedName("nx.al")
    public static int field4285 = 0;

    @ObfuscatedName("nx.am")
    public static int field4286 = 0;

    public class358() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("my.at(Lqz;ZB)V")
    public static void method5976(class427 arg0, boolean arg1) {
        if (Statics.field4271 != null) {
            try {
                Statics.field4271.method7263();
            } catch (Exception var15) {
            }
            Statics.field4271 = null;
        }
        Statics.field4271 = arg0;
        if (Statics.field4271 != null) {
            try {
                class501 var3 = new class501(4);
                var3.method8113(arg1 ? 2 : 3);
                var3.method8115(0);
                Statics.field4271.method7262(var3.field5016, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field4271.method7263();
                } catch (Exception var13) {
                }
                field4286++;
                Statics.field4271 = null;
            }
        }
        field4278.field5017 = 0;
        Statics.field499 = null;
        Statics.field4366 = null;
        field4279 = 0;
        while (true) {
            class356 var6 = (class356) field4267.method7871();
            if (var6 == null) {
                while (true) {
                    class356 var7 = (class356) field4276.method7871();
                    if (var7 == null) {
                        if (field4283 != 0) {
                            try {
                                class501 var8 = new class501(4);
                                var8.method8113(4);
                                var8.method8113(field4283);
                                var8.method8114(0);
                                Statics.field4271.method7262(var8.field5016, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field4271.method7263();
                                } catch (Exception var11) {
                                }
                                field4286++;
                                Statics.field4271 = null;
                            }
                        }
                        field4277 = 0;
                        Statics.field101 = class301.method4630();
                        return;
                    }
                    field4281.method6290(var7);
                    field4269.method7878(var7, var7.field4757);
                    field4275++;
                    field4284--;
                }
            }
            field4273.method7878(var6, var6.field4757);
            field4270++;
            field4272--;
        }
    }

    @ObfuscatedName("gs.an(Lny;IB)V")
    public static void method3234(class355 arg0, int arg1) {
        if (arg0.field4243) {
            if (arg1 <= field4282) {
                throw new RuntimeException("");
            }
            if (arg1 < field4268) {
                field4268 = arg1;
            }
        } else if (arg1 >= field4268) {
            throw new RuntimeException("");
        } else if (arg1 > field4282) {
            field4282 = arg1;
        }
        if (Statics.field4562 == null) {
            method5994((class355) null, 255, 255, 0, (byte) 0, true);
            field4274[arg1] = arg0;
        } else {
            Statics.method7827(arg0, arg1);
        }
    }

    @ObfuscatedName("nc.as(Lny;IIIBZI)V")
    public static void method5994(class355 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class356 var8 = (class356) field4273.method7872(var6);
        if (var8 != null) {
            return;
        }
        class356 var9 = (class356) field4267.method7872(var6);
        if (var9 != null) {
            return;
        }
        class356 var10 = (class356) field4269.method7872(var6);
        if (var10 == null) {
            if (!arg5) {
                class356 var11 = (class356) field4276.method7872(var6);
                if (var11 != null) {
                    return;
                }
            }
            class356 var12 = new class356();
            var12.field4247 = arg0;
            var12.field4246 = arg3;
            var12.field4248 = arg4;
            if (arg5) {
                field4273.method7878(var12, var6);
                field4270++;
            } else {
                field4281.method6289(var12);
                field4269.method7878(var12, var6);
                field4275++;
            }
        } else if (arg5) {
            var10.method7554();
            field4273.method7878(var10, var6);
            field4275--;
            field4270++;
        }
    }

    @ObfuscatedName("jp.ax(IIB)V")
    public static void method4391(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class356 var4 = (class356) field4269.method7872(var2);
        if (var4 != null) {
            field4281.method6290(var4);
        }
    }

    @ObfuscatedName("lm.ap(III)I")
    public static int method5143(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field499 != null && Statics.field499.field4757 == var2 ? Statics.field4366.field5017 * 99 / (Statics.field4366.field5016.length - Statics.field499.field4248) + 1 : 0;
    }
}
