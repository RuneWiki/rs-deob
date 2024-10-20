package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ib")
public class class248 {

    @ObfuscatedName("ib.b")
    public static int field3194 = 0;

    @ObfuscatedName("ib.m")
    public static class329 field3192 = new class329(4096);

    @ObfuscatedName("ib.z")
    public static int field3193 = 0;

    @ObfuscatedName("ib.q")
    public static class329 field3210 = new class329(32);

    @ObfuscatedName("ib.k")
    public static int field3195 = 0;

    @ObfuscatedName("ib.c")
    public static class271 field3196 = new class271();

    @ObfuscatedName("ib.u")
    public static class329 field3197 = new class329(4096);

    @ObfuscatedName("ib.t")
    public static int field3190 = 0;

    @ObfuscatedName("ib.e")
    public static class329 field3199 = new class329(4096);

    @ObfuscatedName("ib.o")
    public static int field3200 = 0;

    @ObfuscatedName("ib.p")
    public static class311 field3203 = new class311(8);

    @ObfuscatedName("ib.y")
    public static int field3191 = 0;

    @ObfuscatedName("ib.j")
    public static CRC32 field3206 = new CRC32();

    @ObfuscatedName("ib.v")
    public static class247[] field3207 = new class247[256];

    @ObfuscatedName("ib.d")
    public static byte field3208 = 0;

    @ObfuscatedName("ib.a")
    public static int field3209 = 0;

    @ObfuscatedName("ib.g")
    public static int field3205 = 0;

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.f(B)Z")
    public static boolean method3127() {
        long var0 = class308.method4786();
        int var2 = (int) (var0 - Statics.field2082);
        Statics.field2082 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3194 += var2;
        if (field3200 == 0 && field3195 == 0 && field3190 == 0 && field3193 == 0) {
            return true;
        } else if (Statics.field3198 == null) {
            return false;
        } else {
            try {
                if (field3194 > 30000) {
                    throw new IOException();
                }
                while (field3195 < 200 && field3193 > 0) {
                    class244 var3 = (class244) field3192.method5601();
                    class311 var4 = new class311(4);
                    var4.method5203(1);
                    var4.method5165((int) var3.field2140);
                    Statics.field3198.method3341(var4.field3742, 0, 4);
                    field3210.method5596(var3, var3.field2140);
                    field3193--;
                    field3195++;
                }
                while (field3200 < 200 && field3190 > 0) {
                    class244 var5 = (class244) field3196.method4564();
                    class311 var6 = new class311(4);
                    var6.method5203(0);
                    var6.method5165((int) var5.field2140);
                    Statics.field3198.method3341(var6.field3742, 0, 4);
                    var5.method3400();
                    field3199.method5596(var5, var5.field2140);
                    field3190--;
                    field3200++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3198.method3337();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3194 = 0;
                    byte var9 = 0;
                    if (Statics.field3202 == null) {
                        var9 = 8;
                    } else if (field3191 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3203.field3741;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3198.method3339(field3203.field3742, field3203.field3741, var10);
                        if (field3208 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3203.field3742[field3203.field3741 + var11] ^= field3208;
                            }
                        }
                        field3203.field3741 += var10;
                        if (field3203.field3741 < var9) {
                            break;
                        }
                        if (Statics.field3202 == null) {
                            field3203.field3741 = 0;
                            int var12 = field3203.method5276();
                            int var13 = field3203.method5163();
                            int var14 = field3203.method5276();
                            int var15 = field3203.method5330();
                            long var16 = (long) ((var12 << 16) + var13);
                            class244 var18 = (class244) field3210.method5597(var16);
                            Statics.field3201 = true;
                            if (var18 == null) {
                                var18 = (class244) field3199.method5597(var16);
                                Statics.field3201 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3202 = var18;
                            Statics.field3204 = new class311(var15 + var19 + Statics.field3202.field3154);
                            Statics.field3204.method5203(var14);
                            Statics.field3204.method5166(var15);
                            field3191 = 8;
                            field3203.field3741 = 0;
                        } else if (field3191 == 0) {
                            if (field3203.field3742[0] == -1) {
                                field3191 = 1;
                                field3203.field3741 = 0;
                            } else {
                                Statics.field3202 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3204.field3742.length - Statics.field3202.field3154;
                        int var21 = 512 - field3191;
                        if (var21 > var20 - Statics.field3204.field3741) {
                            var21 = var20 - Statics.field3204.field3741;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3198.method3339(Statics.field3204.field3742, Statics.field3204.field3741, var21);
                        if (field3208 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3204.field3742[Statics.field3204.field3741 + var22] ^= field3208;
                            }
                        }
                        Statics.field3204.field3741 += var21;
                        field3191 += var21;
                        if (Statics.field3204.field3741 == var20) {
                            if (Statics.field3202.field2140 == 16711935L) {
                                Statics.field1179 = Statics.field3204;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class247 var24 = field3207[var23];
                                    if (var24 != null) {
                                        Statics.field1179.field3741 = var23 * 8 + 5;
                                        int var25 = Statics.field1179.method5330();
                                        int var26 = Statics.field1179.method5330();
                                        var24.method4014(var25, var26);
                                    }
                                }
                            } else {
                                field3206.reset();
                                field3206.update(Statics.field3204.field3742, 0, var20);
                                int var27 = (int) field3206.getValue();
                                if (Statics.field3202.field3156 != var27) {
                                    try {
                                        Statics.field3198.method3334();
                                    } catch (Exception var32) {
                                    }
                                    field3209++;
                                    Statics.field3198 = null;
                                    field3208 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3209 = 0;
                                field3205 = 0;
                                Statics.field3202.field3153.method4035((int) (Statics.field3202.field2140 & 0xFFFFL), Statics.field3204.field3742, (Statics.field3202.field2140 & 0xFF0000L) == 16711680L, Statics.field3201);
                            }
                            Statics.field3202.method3407();
                            if (Statics.field3201) {
                                field3195--;
                            } else {
                                field3200--;
                            }
                            field3191 = 0;
                            Statics.field3202 = null;
                            Statics.field3204 = null;
                        } else {
                            if (field3191 != 512) {
                                break;
                            }
                            field3191 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3198.method3334();
                } catch (Exception var31) {
                }
                field3205++;
                Statics.field3198 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ao.b(ZI)V")
    public static void method291(boolean arg0) {
        if (Statics.field3198 == null) {
            return;
        }
        try {
            class311 var1 = new class311(4);
            var1.method5203(arg0 ? 2 : 3);
            var1.method5165(0);
            Statics.field3198.method3341(var1.field3742, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3198.method3334();
            } catch (Exception var4) {
            }
            field3205++;
            Statics.field3198 = null;
        }
    }

    @ObfuscatedName("ip.l(Lid;II)V")
    public static void method3880(class247 arg0, int arg1) {
        if (Statics.field1179 == null) {
            method4154((class247) null, 255, 255, 0, (byte) 0, true);
            field3207[arg1] = arg0;
        } else {
            Statics.field1179.field3741 = arg1 * 8 + 5;
            int var2 = Statics.field1179.method5330();
            int var3 = Statics.field1179.method5330();
            arg0.method4014(var2, var3);
        }
    }

    @ObfuscatedName("if.m(Lid;IIIBZI)V")
    public static void method4154(class247 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class244 var8 = (class244) field3192.method5597(var6);
        if (var8 != null) {
            return;
        }
        class244 var9 = (class244) field3210.method5597(var6);
        if (var9 != null) {
            return;
        }
        class244 var10 = (class244) field3197.method5597(var6);
        if (var10 == null) {
            if (!arg5) {
                class244 var11 = (class244) field3199.method5597(var6);
                if (var11 != null) {
                    return;
                }
            }
            class244 var12 = new class244();
            var12.field3153 = arg0;
            var12.field3156 = arg3;
            var12.field3154 = arg4;
            if (arg5) {
                field3192.method5596(var12, var6);
                field3193++;
            } else {
                field3196.method4557(var12);
                field3197.method5596(var12, var6);
                field3190++;
            }
        } else if (arg5) {
            var10.method3400();
            field3192.method5596(var10, var6);
            field3190--;
            field3193++;
        }
    }

    @ObfuscatedName("ad.z(III)V")
    public static void method730(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class244 var4 = (class244) field3197.method5597(var2);
        if (var4 != null) {
            field3196.method4555(var4);
        }
    }
}
