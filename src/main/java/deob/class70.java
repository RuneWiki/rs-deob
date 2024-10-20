package deob;

import java.net.URL;

@ObfuscatedName("cr")
public class class70 {

    @ObfuscatedName("cr.aq")
    public static int field824 = 0;

    @ObfuscatedName("cr.af")
    public static int field820 = 0;

    @ObfuscatedName("cr.at")
    public static int[] field836 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cr.au")
    public static int[] field826 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cr.al")
    public int field828;

    @ObfuscatedName("cr.ad")
    public int field829;

    @ObfuscatedName("cr.ah")
    public int field830;

    @ObfuscatedName("cr.ap")
    public String field831;

    @ObfuscatedName("cr.ab")
    public String field832;

    @ObfuscatedName("cr.az")
    public int field833;

    @ObfuscatedName("cr.aa")
    public int field834;

    @ObfuscatedName("cr.ai")
    public String field835;

    @ObfuscatedName("gz.ac(I)Z")
    public static boolean method3386() {
        try {
            if (Statics.field2118 == null) {
                Statics.field2118 = Statics.field71.method2971(new URL(Statics.field3071));
            } else if (Statics.field2118.method2996()) {
                byte[] var0 = Statics.field2118.method2997();
                class551 var1 = new class551(var0);
                var1.method9110();
                field824 = var1.method9119();
                Statics.field293 = new class70[field824];
                int var2 = 0;
                while (var2 < field824) {
                    class70 var3 = Statics.field293[var2] = new class70();
                    var3.field828 = var1.method9119();
                    var3.field829 = var1.method9110();
                    var3.field831 = var1.method9166();
                    var3.field832 = var1.method9166();
                    var3.field833 = var1.method8955();
                    var3.field830 = var1.method8977();
                    var3.field834 = var2++;
                }
                method1501(Statics.field293, 0, Statics.field293.length - 1, field826, field836);
                Statics.field2118 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2118 = null;
        }
        return false;
    }

    @ObfuscatedName("fm.ae(III)V")
    public static void method3268(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field826[var5] != arg0) {
                var2[var4] = field826[var5];
                var3[var4] = field836[var5];
                var4++;
            }
        }
        field826 = var2;
        field836 = var3;
        method1501(Statics.field293, 0, Statics.field293.length - 1, field826, field836);
    }

    @ObfuscatedName("client.ag([Lcr;II[I[II)V")
    public static void method1501(class70[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class70 var8 = arg0[var7];
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
                        var11 = arg0[var6].field834;
                        var12 = var8.field834;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field830;
                        var12 = var8.field830;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1824() ? 1 : 0;
                        var12 = var8.method1824() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field828;
                        var12 = var8.field828;
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
                        var15 = arg0[var5].field834;
                        var16 = var8.field834;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field830;
                        var16 = var8.field830;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1824() ? 1 : 0;
                        var16 = var8.method1824() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field828;
                        var16 = var8.field828;
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
                class70 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1501(arg0, arg1, var6, arg3, arg4);
        method1501(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("dv.am(IZIZI)V")
    public static void method2265(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field293 != null) {
            method5801(0, Statics.field293.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("mw.ax(IIIZIZI)V")
    public static void method5801(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class70 var8 = Statics.field293[var6];
        Statics.field293[var6] = Statics.field293[arg1];
        Statics.field293[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method4046(Statics.field293[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class70 var10 = Statics.field293[var9];
                Statics.field293[var9] = Statics.field293[var7];
                Statics.field293[var7++] = var10;
            }
        }
        Statics.field293[arg1] = Statics.field293[var7];
        Statics.field293[var7] = var8;
        method5801(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method5801(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ip.aq(Lcr;Lcr;IZIZB)I")
    public static int method4046(class70 arg0, class70 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method4213(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method4213(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("iy.af(Lcr;Lcr;IZB)I")
    public static int method4213(class70 arg0, class70 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field830;
            int var5 = arg1.field830;
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
            return arg0.field833 - arg1.field833;
        } else if (arg2 == 3) {
            if (arg0.field832.equals("-")) {
                if (arg1.field832.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field832.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field832.compareTo(arg1.field832);
            }
        } else if (arg2 == 4) {
            return arg0.method1828() ? (arg1.method1828() ? 0 : 1) : (arg1.method1828() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1831() ? (arg1.method1831() ? 0 : 1) : (arg1.method1831() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1827() ? (arg1.method1827() ? 0 : 1) : (arg1.method1827() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1824() ? (arg1.method1824() ? 0 : 1) : (arg1.method1824() ? -1 : 0);
        } else {
            return arg0.field828 - arg1.field828;
        }
    }

    @ObfuscatedName("hk.at(I)Lcr;")
    public static class70 method3553() {
        field820 = 0;
        return method867();
    }

    @ObfuscatedName("bt.au(I)Lcr;")
    public static class70 method867() {
        return field820 < field824 ? Statics.field293[++field820 - 1] : null;
    }

    @ObfuscatedName("cr.ar(B)Z")
    public boolean method1824() {
        return (class546.field5376.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.al(B)Z")
    public boolean method1836() {
        return (class546.field5381.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.ad(S)Z")
    public boolean method1831() {
        return (class546.field5371.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.ah(I)Z")
    public boolean method1827() {
        return (class546.field5367.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.ap(I)Z")
    public boolean method1828() {
        return (class546.field5369.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.ab(I)Z")
    public boolean method1829() {
        return (class546.field5394.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.az(I)Z")
    public boolean method1830() {
        return (class546.field5390.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.aa(I)Z")
    public boolean method1848() {
        return (class546.field5377.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.ai(I)Z")
    public boolean method1832() {
        return (class546.field5373.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cr.ao(B)Z")
    public boolean method1833() {
        return (class546.field5392.method32() & this.field829) != 0;
    }
}
