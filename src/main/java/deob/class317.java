package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("lr")
public class class317 {

    @ObfuscatedName("lr.s")
    public static int field4017 = 0;

    @ObfuscatedName("lr.v")
    public static class421 field4019 = new class421(4096);

    @ObfuscatedName("lr.c")
    public static int field4025 = 0;

    @ObfuscatedName("lr.q")
    public static class421 field4021 = new class421(32);

    @ObfuscatedName("lr.i")
    public static int field4022 = 0;

    @ObfuscatedName("lr.k")
    public static class334 field4023 = new class334();

    @ObfuscatedName("lr.o")
    public static class421 field4024 = new class421(4096);

    @ObfuscatedName("lr.n")
    public static int field4033 = 0;

    @ObfuscatedName("lr.d")
    public static class421 field4026 = new class421(4096);

    @ObfuscatedName("lr.a")
    public static int field4038 = 0;

    @ObfuscatedName("lr.l")
    public static class444 field4028 = new class444(8);

    @ObfuscatedName("lr.r")
    public static int field4029 = 0;

    @ObfuscatedName("lr.p")
    public static CRC32 field4020 = new CRC32();

    @ObfuscatedName("lr.b")
    public static class314[] field4031 = new class314[256];

    @ObfuscatedName("lr.x")
    public static int field4032 = -1;

    @ObfuscatedName("lr.f")
    public static int field4016 = 255;

    @ObfuscatedName("lr.t")
    public static byte field4030 = 0;

    @ObfuscatedName("lr.j")
    public static int field4035 = 0;

    @ObfuscatedName("lr.g")
    public static int field4036 = 0;

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.s(B)Z")
    public static boolean method960() {
        long var0 = class270.method3146();
        int var2 = (int) (var0 - Statics.field4018);
        Statics.field4018 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field4017 += var2;
        if (field4038 == 0 && field4022 == 0 && field4033 == 0 && field4025 == 0) {
            return true;
        } else if (Statics.field4034 == null) {
            return false;
        } else {
            try {
                if (field4017 > 30000) {
                    throw new IOException();
                }
                while (field4022 < 200 && field4025 > 0) {
                    class315 var3 = (class315) field4019.method6694();
                    class444 var4 = new class444(4);
                    var4.method6912(1);
                    var4.method6914((int) var3.field4468);
                    Statics.field4034.method6112(var4.field4707, 0, 4);
                    field4021.method6683(var3, var3.field4468);
                    field4025--;
                    field4022++;
                }
                while (field4038 < 200 && field4033 > 0) {
                    class315 var5 = (class315) field4023.method5417();
                    class444 var6 = new class444(4);
                    var6.method6912(0);
                    var6.method6914((int) var5.field4468);
                    Statics.field4034.method6112(var6.field4707, 0, 4);
                    var5.method6406();
                    field4026.method6683(var5, var5.field4468);
                    field4033--;
                    field4038++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field4034.method6109();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field4017 = 0;
                    byte var9 = 0;
                    if (Statics.field863 == null) {
                        var9 = 8;
                    } else if (field4029 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field4028.field4708;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field4034.method6122(field4028.field4707, field4028.field4708, var10);
                        if (field4030 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field4028.field4707[field4028.field4708 + var11] ^= field4030;
                            }
                        }
                        field4028.field4708 += var10;
                        if (field4028.field4708 < var9) {
                            break;
                        }
                        if (Statics.field863 == null) {
                            field4028.field4708 = 0;
                            int var12 = field4028.method6929();
                            int var13 = field4028.method7120();
                            int var14 = field4028.method6929();
                            int var15 = field4028.method6934();
                            long var16 = (long) ((var12 << 16) + var13);
                            class315 var18 = (class315) field4021.method6695(var16);
                            Statics.field1547 = true;
                            if (var18 == null) {
                                var18 = (class315) field4026.method6695(var16);
                                Statics.field1547 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field863 = var18;
                            Statics.field1235 = new class444(var15 + var19 + Statics.field863.field3993);
                            Statics.field1235.method6912(var14);
                            Statics.field1235.method6915(var15);
                            field4029 = 8;
                            field4028.field4708 = 0;
                        } else if (field4029 == 0) {
                            if (field4028.field4707[0] == -1) {
                                field4029 = 1;
                                field4028.field4708 = 0;
                            } else {
                                Statics.field863 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1235.field4707.length - Statics.field863.field3993;
                        int var21 = 512 - field4029;
                        if (var21 > var20 - Statics.field1235.field4708) {
                            var21 = var20 - Statics.field1235.field4708;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field4034.method6122(Statics.field1235.field4707, Statics.field1235.field4708, var21);
                        if (field4030 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1235.field4707[Statics.field1235.field4708 + var22] ^= field4030;
                            }
                        }
                        Statics.field1235.field4708 += var21;
                        field4029 += var21;
                        if (Statics.field1235.field4708 == var20) {
                            if (Statics.field863.field4468 == 16711935L) {
                                Statics.field1386 = Statics.field1235;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class314 var24 = field4031[var23];
                                    if (var24 != null) {
                                        Statics.field1386.field4708 = var23 * 8 + 5;
                                        if (Statics.field1386.field4708 >= Statics.field1386.field4707.length) {
                                            if (!var24.field3989) {
                                                throw new RuntimeException("");
                                            }
                                            var24.method5154();
                                        } else {
                                            int var25 = Statics.field1386.method6934();
                                            int var26 = Statics.field1386.method6934();
                                            var24.method5139(var25, var26);
                                        }
                                    }
                                }
                            } else {
                                field4020.reset();
                                field4020.update(Statics.field1235.field4707, 0, var20);
                                int var27 = (int) field4020.getValue();
                                if (Statics.field863.field3996 != var27) {
                                    try {
                                        Statics.field4034.method6121();
                                    } catch (Exception var32) {
                                    }
                                    field4035++;
                                    Statics.field4034 = null;
                                    field4030 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field4035 = 0;
                                field4036 = 0;
                                Statics.field863.field3992.method5140((int) (Statics.field863.field4468 & 0xFFFFL), Statics.field1235.field4707, (Statics.field863.field4468 & 0xFF0000L) == 16711680L, Statics.field1547);
                            }
                            Statics.field863.method6409();
                            if (Statics.field1547) {
                                field4022--;
                            } else {
                                field4038--;
                            }
                            field4029 = 0;
                            Statics.field863 = null;
                            Statics.field1235 = null;
                        } else {
                            if (field4029 != 512) {
                                break;
                            }
                            field4029 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field4034.method6121();
                } catch (Exception var31) {
                }
                field4036++;
                Statics.field4034 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("kp.h(Lln;IIIBZI)V")
    public static void method5104(class314 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class315 var8 = (class315) field4019.method6695(var6);
        if (var8 != null) {
            return;
        }
        class315 var9 = (class315) field4021.method6695(var6);
        if (var9 != null) {
            return;
        }
        class315 var10 = (class315) field4024.method6695(var6);
        if (var10 == null) {
            if (!arg5) {
                class315 var11 = (class315) field4026.method6695(var6);
                if (var11 != null) {
                    return;
                }
            }
            class315 var12 = new class315();
            var12.field3992 = arg0;
            var12.field3996 = arg3;
            var12.field3993 = arg4;
            if (arg5) {
                field4019.method6683(var12, var6);
                field4025++;
            } else {
                field4023.method5419(var12);
                field4024.method6683(var12, var6);
                field4033++;
            }
        } else if (arg5) {
            var10.method6406();
            field4019.method6683(var10, var6);
            field4033--;
            field4025++;
        }
    }

    @ObfuscatedName("kk.w(IIS)I")
    public static int method4968(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field863 != null && Statics.field863.field4468 == var2 ? Statics.field1235.field4708 * 99 / (Statics.field1235.field4707.length - Statics.field863.field3993) + 1 : 0;
    }

    @ObfuscatedName("h.v(B)V")
    public static void method8() {
        if (Statics.field4034 != null) {
            Statics.field4034.method6121();
        }
    }
}
