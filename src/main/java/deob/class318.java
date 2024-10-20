package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("lh")
public class class318 {

    @ObfuscatedName("lh.p")
    public static int field4058 = 0;

    @ObfuscatedName("lh.n")
    public static class422 field4060 = new class422(4096);

    @ObfuscatedName("lh.k")
    public static int field4061 = 0;

    @ObfuscatedName("lh.w")
    public static class422 field4062 = new class422(32);

    @ObfuscatedName("lh.s")
    public static int field4063 = 0;

    @ObfuscatedName("lh.q")
    public static class335 field4064 = new class335();

    @ObfuscatedName("lh.m")
    public static class422 field4068 = new class422(4096);

    @ObfuscatedName("lh.x")
    public static int field4066 = 0;

    @ObfuscatedName("lh.j")
    public static class422 field4067 = new class422(4096);

    @ObfuscatedName("lh.v")
    public static int field4070 = 0;

    @ObfuscatedName("lh.u")
    public static class445 field4057 = new class445(8);

    @ObfuscatedName("lh.b")
    public static int field4076 = 0;

    @ObfuscatedName("lh.l")
    public static CRC32 field4071 = new CRC32();

    @ObfuscatedName("lh.g")
    public static class315[] field4072 = new class315[256];

    @ObfuscatedName("lh.y")
    public static int field4073 = -1;

    @ObfuscatedName("lh.i")
    public static int field4074 = 255;

    @ObfuscatedName("lh.r")
    public static byte field4069 = 0;

    @ObfuscatedName("lh.z")
    public static int field4065 = 0;

    @ObfuscatedName("lh.o")
    public static int field4077 = 0;

    public class318() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.c(ZI)V")
    public static void method2735(boolean arg0) {
        if (Statics.field4075 == null) {
            return;
        }
        try {
            class445 var1 = new class445(4);
            var1.method7179(arg0 ? 2 : 3);
            var1.method7258(0);
            Statics.field4075.method6356(var1.field4733, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field4075.method6345();
            } catch (Exception var4) {
            }
            field4077++;
            Statics.field4075 = null;
        }
    }

    @ObfuscatedName("gq.p(Lnl;ZI)V")
    public static void method3336(class379 arg0, boolean arg1) {
        if (Statics.field4075 != null) {
            try {
                Statics.field4075.method6345();
            } catch (Exception var10) {
            }
            Statics.field4075 = null;
        }
        Statics.field4075 = arg0;
        method2735(arg1);
        field4057.field4735 = 0;
        Statics.field1606 = null;
        Statics.field117 = null;
        field4076 = 0;
        while (true) {
            class316 var3 = (class316) field4062.method6943();
            if (var3 == null) {
                while (true) {
                    class316 var4 = (class316) field4067.method6943();
                    if (var4 == null) {
                        if (field4069 != 0) {
                            try {
                                class445 var5 = new class445(4);
                                var5.method7179(4);
                                var5.method7179(field4069);
                                var5.method7286(0);
                                Statics.field4075.method6356(var5.field4733, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field4075.method6345();
                                } catch (Exception var8) {
                                }
                                field4077++;
                                Statics.field4075 = null;
                            }
                        }
                        field4058 = 0;
                        Statics.field4059 = class271.method5624();
                        return;
                    }
                    field4064.method5633(var4);
                    field4068.method6948(var4, var4.field4504);
                    field4066++;
                    field4070--;
                }
            }
            field4060.method6948(var3, var3.field4504);
            field4061++;
            field4063--;
        }
    }

    @ObfuscatedName("jk.f(Llb;II)V")
    public static void method5081(class315 arg0, int arg1) {
        if (arg0.field4029) {
            if (arg1 <= field4073) {
                throw new RuntimeException("");
            }
            if (arg1 < field4074) {
                field4074 = arg1;
            }
        } else if (arg1 >= field4074) {
            throw new RuntimeException("");
        } else if (arg1 > field4073) {
            field4073 = arg1;
        }
        if (Statics.field1811 == null) {
            method4814((class315) null, 255, 255, 0, (byte) 0, true);
            field4072[arg1] = arg0;
        } else {
            method4660(arg0, arg1);
        }
    }

    @ObfuscatedName("ii.n(Llb;II)V")
    public static void method4660(class315 arg0, int arg1) {
        Statics.field1811.field4735 = arg1 * 8 + 5;
        if (Statics.field1811.field4735 < Statics.field1811.field4733.length) {
            int var2 = Statics.field1811.method7201();
            int var3 = Statics.field1811.method7201();
            arg0.method5373(var2, var3);
        } else if (arg0.field4029) {
            arg0.method5389();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("jm.k(Llb;IIIBZB)V")
    public static void method4814(class315 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class316 var8 = (class316) field4060.method6941(var6);
        if (var8 != null) {
            return;
        }
        class316 var9 = (class316) field4062.method6941(var6);
        if (var9 != null) {
            return;
        }
        class316 var10 = (class316) field4068.method6941(var6);
        if (var10 == null) {
            if (!arg5) {
                class316 var11 = (class316) field4067.method6941(var6);
                if (var11 != null) {
                    return;
                }
            }
            class316 var12 = new class316();
            var12.field4035 = arg0;
            var12.field4036 = arg3;
            var12.field4037 = arg4;
            if (arg5) {
                field4060.method6948(var12, var6);
                field4061++;
            } else {
                field4064.method5639(var12);
                field4068.method6948(var12, var6);
                field4066++;
            }
        } else if (arg5) {
            var10.method6653();
            field4060.method6948(var10, var6);
            field4066--;
            field4061++;
        }
    }

    @ObfuscatedName("b.w(III)I")
    public static int method211(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1606 != null && Statics.field1606.field4504 == var2 ? Statics.field117.field4735 * 99 / (Statics.field117.field4733.length - Statics.field1606.field4037) + 1 : 0;
    }

    @ObfuscatedName("fr.s(ZZB)I")
    public static int method3109(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field4063 + field4061;
        }
        if (arg1) {
            var2 += field4070 + field4066;
        }
        return var2;
    }

    @ObfuscatedName("u.q(I)V")
    public static void method190() {
        if (Statics.field4075 != null) {
            Statics.field4075.method6345();
        }
    }
}
