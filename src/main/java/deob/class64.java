package deob;

@ObfuscatedName("cl")
public class class64 {

    @ObfuscatedName("cl.ab")
    public static int field792 = 0;

    @ObfuscatedName("cl.aq")
    public static int field806 = 0;

    @ObfuscatedName("cl.al")
    public static int[] field793 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cl.at")
    public static int[] field794 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cl.ay")
    public int field802;

    @ObfuscatedName("cl.ao")
    public int field797;

    @ObfuscatedName("cl.ax")
    public int field798;

    @ObfuscatedName("cl.ai")
    public String field799;

    @ObfuscatedName("cl.ag")
    public String field800;

    @ObfuscatedName("cl.ah")
    public int field801;

    @ObfuscatedName("cl.av")
    public int field805;

    @ObfuscatedName("ta.an(III)V")
    public static void method8647(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field794[var5] != arg0) {
                var2[var4] = field794[var5];
                var3[var4] = field793[var5];
                var4++;
            }
        }
        field794 = var2;
        field793 = var3;
        method2901(Statics.field179, 0, Statics.field179.length - 1, field794, field793);
    }

    @ObfuscatedName("ex.aw([Lcl;II[I[II)V")
    public static void method2901(class64[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class64 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field805;
                        var12 = var8.field805;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field798;
                        var12 = var8.field798;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1677() ? 1 : 0;
                        var12 = var8.method1677() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field802;
                        var12 = var8.field802;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field805;
                        var16 = var8.field805;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field798;
                        var16 = var8.field798;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1677() ? 1 : 0;
                        var16 = var8.method1677() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field802;
                        var16 = var8.field802;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class64 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2901(arg0, arg1, var6, arg3, arg4);
        method2901(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ec.ac(IZIZB)V")
    public static void method2958(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field179 != null) {
            method166(0, Statics.field179.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ai.au(IIIZIZI)V")
    public static void method166(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class64 var8 = Statics.field179[var6];
        Statics.field179[var6] = Statics.field179[arg1];
        Statics.field179[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class64 var10 = Statics.field179[var9];
            int var11 = method5197(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method5197(var10, var8, arg4, arg5);
                    if (arg5) {
                        var12 = -var13;
                    } else {
                        var12 = var13;
                    }
                }
            } else if (arg3) {
                var12 = -var11;
            } else {
                var12 = var11;
            }
            if (var12 <= 0) {
                class64 var14 = Statics.field179[var9];
                Statics.field179[var9] = Statics.field179[var7];
                Statics.field179[var7++] = var14;
            }
        }
        Statics.field179[arg1] = Statics.field179[var7];
        Statics.field179[var7] = var8;
        method166(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method166(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ly.ab(Lcl;Lcl;IZB)I")
    public static int method5197(class64 arg0, class64 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field798;
            int var5 = arg1.field798;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field801 - arg1.field801;
        } else if (arg2 == 3) {
            if (arg0.field800.equals("-")) {
                if (arg1.field800.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field800.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field800.compareTo(arg1.field800);
            }
        } else if (arg2 == 4) {
            return arg0.method1681() ? (arg1.method1681() ? 0 : 1) : (arg1.method1681() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1728() ? (arg1.method1728() ? 0 : 1) : (arg1.method1728() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1680() ? (arg1.method1680() ? 0 : 1) : (arg1.method1680() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1677() ? (arg1.method1677() ? 0 : 1) : (arg1.method1677() ? -1 : 0);
        } else {
            return arg0.field802 - arg1.field802;
        }
    }

    @ObfuscatedName("ir.aq(I)Lcl;")
    public static class64 method4345() {
        field806 = 0;
        return method1918();
    }

    @ObfuscatedName("cy.al(I)Lcl;")
    public static class64 method1918() {
        return field806 < field792 ? Statics.field179[++field806 - 1] : null;
    }

    @ObfuscatedName("cl.at(I)Z")
    public boolean method1677() {
        return (0x1 & this.field797) != 0;
    }

    @ObfuscatedName("cl.aa(I)Z")
    public boolean method1678() {
        return (0x10000 & this.field797) != 0;
    }

    @ObfuscatedName("cl.ay(I)Z")
    public boolean method1728() {
        return (0x2 & this.field797) != 0;
    }

    @ObfuscatedName("cl.ao(I)Z")
    public boolean method1680() {
        return (0x4 & this.field797) != 0;
    }

    @ObfuscatedName("cl.ax(B)Z")
    public boolean method1681() {
        return (0x8 & this.field797) != 0;
    }

    @ObfuscatedName("cl.ai(B)Z")
    public boolean method1710() {
        return (0x20000000 & this.field797) != 0;
    }

    @ObfuscatedName("cl.ag(I)Z")
    public boolean method1683() {
        return (0x2000000 & this.field797) != 0;
    }

    @ObfuscatedName("cl.ah(B)Z")
    public boolean method1684() {
        return (0x40000000 & this.field797) != 0;
    }

    @ObfuscatedName("cl.av(I)Z")
    public boolean method1685() {
        return (0x100 & this.field797) != 0;
    }

    @ObfuscatedName("cl.ar(B)Z")
    public boolean method1686() {
        return (0x8000000 & this.field797) != 0;
    }
}
