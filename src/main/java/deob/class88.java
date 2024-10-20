package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("cb")
public class class88 {

    @ObfuscatedName("cb.l")
    public static int field1190 = 0;

    @ObfuscatedName("cb.o")
    public static class104 field1192 = new class104(4096);

    @ObfuscatedName("cb.c")
    public static int field1204 = 0;

    @ObfuscatedName("cb.h")
    public static class104 field1193 = new class104(32);

    @ObfuscatedName("cb.r")
    public static int field1194 = 0;

    @ObfuscatedName("cb.d")
    public static class102 field1195 = new class102();

    @ObfuscatedName("cb.k")
    public static class104 field1196 = new class104(4096);

    @ObfuscatedName("cb.u")
    public static int field1197 = 0;

    @ObfuscatedName("cb.v")
    public static class104 field1198 = new class104(4096);

    @ObfuscatedName("cb.f")
    public static int field1207 = 0;

    @ObfuscatedName("cb.e")
    public static class136 field1201 = new class136(8);

    @ObfuscatedName("cb.y")
    public static int field1200 = 0;

    @ObfuscatedName("cb.w")
    public static CRC32 field1202 = new CRC32();

    @ObfuscatedName("cb.p")
    public static class121[] field1205 = new class121[256];

    @ObfuscatedName("cb.z")
    public static byte field1206 = 0;

    @ObfuscatedName("cb.n")
    public static int field1191 = 0;

    @ObfuscatedName("cb.x")
    public static int field1208 = 0;

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.q(I)Z")
    public static boolean method904() {
        long var0 = class64.method535();
        int var2 = (int) (var0 - Statics.field1189);
        Statics.field1189 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field1190 += var2;
        if (field1207 == 0 && field1194 == 0 && field1197 == 0 && field1204 == 0) {
            return true;
        } else if (Statics.field263 == null) {
            return false;
        } else {
            try {
                if (field1190 > 30000) {
                    throw new IOException();
                }
                while (field1194 < 20 && field1204 > 0) {
                    class168 var3 = (class168) field1192.method1280();
                    class136 var4 = new class136(4);
                    var4.method1612(1);
                    var4.method1591((int) var3.field1513);
                    Statics.field263.method371(var4.field1725, 0, 4);
                    field1193.method1279(var3, var3.field1513);
                    field1204--;
                    field1194++;
                }
                while (field1207 < 20 && field1197 > 0) {
                    class168 var5 = (class168) field1195.method1251();
                    class136 var6 = new class136(4);
                    var6.method1612(0);
                    var6.method1591((int) var5.field1513);
                    Statics.field263.method371(var6.field1725, 0, 4);
                    var5.method1831();
                    field1198.method1279(var5, var5.field1513);
                    field1197--;
                    field1207++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field263.method369();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field1190 = 0;
                    byte var9 = 0;
                    if (Statics.field1199 == null) {
                        var9 = 8;
                    } else if (field1200 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field1201.field1722;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field263.method370(field1201.field1725, field1201.field1722, var10);
                        if (field1206 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field1201.field1725[field1201.field1722 + var11] ^= field1206;
                            }
                        }
                        field1201.field1722 += var10;
                        if (field1201.field1722 < var9) {
                            break;
                        }
                        if (Statics.field1199 == null) {
                            field1201.field1722 = 0;
                            int var12 = field1201.method1602();
                            int var13 = field1201.method1712();
                            int var14 = field1201.method1602();
                            int var15 = field1201.method1607();
                            long var16 = (long) ((var12 << 16) + var13);
                            class168 var18 = (class168) field1193.method1290(var16);
                            Statics.field10 = true;
                            if (var18 == null) {
                                var18 = (class168) field1198.method1290(var16);
                                Statics.field10 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1199 = var18;
                            Statics.field316 = new class136(var15 + var19 + Statics.field1199.field2493);
                            Statics.field316.method1612(var14);
                            Statics.field316.method1592(var15);
                            field1200 = 8;
                            field1201.field1722 = 0;
                        } else if (field1200 == 0) {
                            if (field1201.field1725[0] == -1) {
                                field1200 = 1;
                                field1201.field1722 = 0;
                            } else {
                                Statics.field1199 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field316.field1725.length - Statics.field1199.field2493;
                        int var21 = 512 - field1200;
                        if (var21 > var20 - Statics.field316.field1722) {
                            var21 = var20 - Statics.field316.field1722;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field263.method370(Statics.field316.field1725, Statics.field316.field1722, var21);
                        if (field1206 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field316.field1725[Statics.field316.field1722 + var22] ^= field1206;
                            }
                        }
                        Statics.field316.field1722 += var21;
                        field1200 += var21;
                        if (Statics.field316.field1722 == var20) {
                            if (Statics.field1199.field1513 == 16711935L) {
                                Statics.field219 = Statics.field316;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class121 var24 = field1205[var23];
                                    if (var24 != null) {
                                        Statics.field219.field1722 = var23 * 8 + 5;
                                        int var25 = Statics.field219.method1607();
                                        int var26 = Statics.field219.method1607();
                                        var24.method1456(var25, var26);
                                    }
                                }
                            } else {
                                field1202.reset();
                                field1202.update(Statics.field316.field1725, 0, var20);
                                int var27 = (int) field1202.getValue();
                                if (Statics.field1199.field2492 != var27) {
                                    try {
                                        Statics.field263.method366();
                                    } catch (Exception var32) {
                                    }
                                    field1191++;
                                    Statics.field263 = null;
                                    field1206 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field1191 = 0;
                                field1208 = 0;
                                Statics.field1199.field2491.method1459((int) (Statics.field1199.field1513 & 0xFFFFL), Statics.field316.field1725, (Statics.field1199.field1513 & 0xFF0000L) == 16711680L, Statics.field10);
                            }
                            Statics.field1199.method1328();
                            if (Statics.field10) {
                                field1194--;
                            } else {
                                field1207--;
                            }
                            field1200 = 0;
                            Statics.field1199 = null;
                            Statics.field316 = null;
                        } else {
                            if (field1200 != 512) {
                                break;
                            }
                            field1200 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field263.method366();
                } catch (Exception var31) {
                }
                field1208++;
                Statics.field263 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("bf.l(ZI)V")
    public static void method751(boolean arg0) {
        if (Statics.field263 == null) {
            return;
        }
        try {
            class136 var1 = new class136(4);
            var1.method1612(arg0 ? 2 : 3);
            var1.method1591(0);
            Statics.field263.method371(var1.field1725, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field263.method366();
            } catch (Exception var4) {
            }
            field1208++;
            Statics.field263 = null;
        }
    }

    @ObfuscatedName("ba.a(Laj;ZI)V")
    public static void method903(class32 arg0, boolean arg1) {
        if (Statics.field263 != null) {
            try {
                Statics.field263.method366();
            } catch (Exception var10) {
            }
            Statics.field263 = null;
        }
        Statics.field263 = arg0;
        method751(arg1);
        field1201.field1722 = 0;
        Statics.field1199 = null;
        Statics.field316 = null;
        field1200 = 0;
        while (true) {
            class168 var3 = (class168) field1193.method1280();
            if (var3 == null) {
                while (true) {
                    class168 var4 = (class168) field1198.method1280();
                    if (var4 == null) {
                        if (field1206 != 0) {
                            try {
                                class136 var5 = new class136(4);
                                var5.method1612(4);
                                var5.method1612(field1206);
                                var5.method1680(0);
                                Statics.field263.method371(var5.field1725, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field263.method366();
                                } catch (Exception var8) {
                                }
                                field1208++;
                                Statics.field263 = null;
                            }
                        }
                        field1190 = 0;
                        Statics.field1189 = class64.method535();
                        return;
                    }
                    field1195.method1262(var4);
                    field1196.method1279(var4, var4.field1513);
                    field1197++;
                    field1207--;
                }
            }
            field1192.method1279(var3, var3.field1513);
            field1204++;
            field1194--;
        }
    }

    @ObfuscatedName("g.o(Ldc;IIIBZB)V")
    public static void method242(class121 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class168 var8 = (class168) field1192.method1290(var6);
        if (var8 != null) {
            return;
        }
        class168 var9 = (class168) field1193.method1290(var6);
        if (var9 != null) {
            return;
        }
        class168 var10 = (class168) field1196.method1290(var6);
        if (var10 == null) {
            if (!arg5) {
                class168 var11 = (class168) field1198.method1290(var6);
                if (var11 != null) {
                    return;
                }
            }
            class168 var12 = new class168();
            var12.field2491 = arg0;
            var12.field2492 = arg3;
            var12.field2493 = arg4;
            if (arg5) {
                field1192.method1279(var12, var6);
                field1204++;
            } else {
                field1195.method1247(var12);
                field1196.method1279(var12, var6);
                field1197++;
            }
        } else if (arg5) {
            var10.method1831();
            field1192.method1279(var10, var6);
            field1197--;
            field1204++;
        }
    }

    @ObfuscatedName("ch.h(B)V")
    public static void method917() {
        if (Statics.field263 != null) {
            Statics.field263.method366();
        }
    }
}
