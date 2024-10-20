package deob;

@ObfuscatedName("ae")
public class class33 {

    @ObfuscatedName("ae.p")
    public static byte[] field753 = new byte[2048];

    @ObfuscatedName("ae.x")
    public static byte[] field754 = new byte[2048];

    @ObfuscatedName("ae.d")
    public static class120[] field769 = new class120[2048];

    @ObfuscatedName("ae.u")
    public static int field756 = 0;

    @ObfuscatedName("ae.o")
    public static int[] field757 = new int[2048];

    @ObfuscatedName("ae.b")
    public static int field758 = 0;

    @ObfuscatedName("ae.k")
    public static int[] field752 = new int[2048];

    @ObfuscatedName("ae.c")
    public static int[] field760 = new int[2048];

    @ObfuscatedName("ae.l")
    public static int[] field761 = new int[2048];

    @ObfuscatedName("ae.t")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("ae.i")
    public static int field763 = 0;

    @ObfuscatedName("ae.r")
    public static int[] field765 = new int[2048];

    @ObfuscatedName("ae.m")
    public static class120 field759 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.s(Ldi;S)V")
    public static final void method887(class123 arg0) {
        arg0.method2585();
        int var1 = client.field292;
        class3 var2 = Statics.field1882 = client.field492[var1] = new class3();
        var2.field43 = var1;
        int var3 = arg0.method2596(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field867[0] = var5 - Statics.field595;
        var2.field824 = (var2.field867[0] << 7) + (var2.method21() << 6);
        var2.field864[0] = var6 - Statics.field1982;
        var2.field814 = (var2.field864[0] << 7) + (var2.method21() << 6);
        Statics.field582 = var2.field56 = var4;
        if (field769[var1] != null) {
            var2.method12(field769[var1]);
        }
        field756 = 0;
        field757[++field756 - 1] = var1;
        field753[var1] = 0;
        field758 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2596(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field760[var7] = (var9 << 28) + (var10 << 14) + var11;
                field761[var7] = 0;
                field762[var7] = -1;
                field752[++field758 - 1] = var7;
                field753[var7] = 0;
            }
        }
        arg0.method2586();
    }

    @ObfuscatedName("e.j(Ldi;II)V")
    public static final void method189(class123 arg0, int arg1) {
        int var2 = arg0.field2006;
        field763 = 0;
        method1048(arg0);
        for (int var3 = 0; var3 < field763; var3++) {
            int var4 = field765[var3];
            class3 var5 = client.field492[var4];
            int var6 = arg0.method2338();
            if ((var6 & 0x1) != 0) {
                var6 += arg0.method2338() << 8;
            }
            Statics.method37(arg0, var4, var5, var6);
        }
        if (arg0.field2006 - var2 != arg1) {
            throw new RuntimeException(arg0.field2006 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bd.p(Ldi;I)V")
    public static final void method1048(class123 arg0) {
        int var1 = 0;
        arg0.method2585();
        for (int var2 = 0; var2 < field756; var2++) {
            int var3 = field757[var2];
            if ((field753[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field753[var3] = (byte) (field753[var3] | 0x2);
                } else {
                    int var4 = arg0.method2596(1);
                    if (var4 == 0) {
                        var1 = method1545(arg0);
                        field753[var3] = (byte) (field753[var3] | 0x2);
                    } else {
                        Statics.method8(arg0, var3);
                    }
                }
            }
        }
        arg0.method2586();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2585();
        for (int var5 = 0; var5 < field756; var5++) {
            int var6 = field757[var5];
            if ((field753[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field753[var6] = (byte) (field753[var6] | 0x2);
                } else {
                    int var7 = arg0.method2596(1);
                    if (var7 == 0) {
                        var1 = method1545(arg0);
                        field753[var6] = (byte) (field753[var6] | 0x2);
                    } else {
                        Statics.method8(arg0, var6);
                    }
                }
            }
        }
        arg0.method2586();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2585();
        for (int var8 = 0; var8 < field758; var8++) {
            int var9 = field752[var8];
            if ((field753[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field753[var9] = (byte) (field753[var9] | 0x2);
                } else {
                    int var10 = arg0.method2596(1);
                    if (var10 == 0) {
                        var1 = method1545(arg0);
                        field753[var9] = (byte) (field753[var9] | 0x2);
                    } else if (method2484(arg0, var9)) {
                        field753[var9] = (byte) (field753[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2586();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2585();
        for (int var11 = 0; var11 < field758; var11++) {
            int var12 = field752[var11];
            if ((field753[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field753[var12] = (byte) (field753[var12] | 0x2);
                } else {
                    int var13 = arg0.method2596(1);
                    if (var13 == 0) {
                        var1 = method1545(arg0);
                        field753[var12] = (byte) (field753[var12] | 0x2);
                    } else if (method2484(arg0, var12)) {
                        field753[var12] = (byte) (field753[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2586();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field756 = 0;
        field758 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field753[var14] = (byte) (field753[var14] >> 1);
            class3 var15 = client.field492[var14];
            if (var15 == null) {
                field752[++field758 - 1] = var14;
            } else {
                field757[++field756 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bm.x(Ldi;I)I")
    public static int method1545(class123 arg0) {
        int var1 = arg0.method2596(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2596(5);
        } else if (var1 == 2) {
            var2 = arg0.method2596(8);
        } else {
            var2 = arg0.method2596(11);
        }
        return var2;
    }

    @ObfuscatedName("ds.u(Ldi;II)Z")
    public static boolean method2484(class123 arg0, int arg1) {
        int var2 = arg0.method2596(2);
        if (var2 == 0) {
            if (arg0.method2596(1) != 0) {
                method2484(arg0, arg1);
            }
            int var3 = arg0.method2596(6);
            int var4 = arg0.method2596(6);
            boolean var5 = arg0.method2596(1) == 1;
            if (var5) {
                field765[++field763 - 1] = arg1;
            }
            if (client.field492[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field492[arg1] = new class3();
            var6.field43 = arg1;
            if (field769[arg1] != null) {
                var6.method12(field769[arg1]);
            }
            var6.field863 = field761[arg1];
            var6.field838 = field762[arg1];
            int var7 = field760[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field869[0] = field754[arg1];
            var6.field56 = (byte) var8;
            var6.method16((var9 << 6) + var3 - Statics.field595, (var10 << 6) + var4 - Statics.field1982);
            var6.field37 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2596(2);
            int var12 = field760[arg1];
            field760[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2596(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field760[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field760[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2596(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field760[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field760[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ab.b(S)V")
    public static void method611() {
        field756 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field769[var0] = null;
            field754[var0] = 1;
        }
    }
}
