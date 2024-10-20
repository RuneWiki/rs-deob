package deob;

import java.net.URL;

@ObfuscatedName("cr")
public class class68 {

    @ObfuscatedName("cr.aj")
    public static int field829 = 0;

    @ObfuscatedName("cr.ag")
    public static int field827 = 0;

    @ObfuscatedName("cr.az")
    public static int[] field838 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cr.av")
    public static int[] field826 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cr.aq")
    public int field825;

    @ObfuscatedName("cr.at")
    public int field828;

    @ObfuscatedName("cr.ah")
    public int field822;

    @ObfuscatedName("cr.ax")
    public String field831;

    @ObfuscatedName("cr.aa")
    public String field832;

    @ObfuscatedName("cr.au")
    public int field833;

    @ObfuscatedName("cr.ae")
    public int field834;

    @ObfuscatedName("cr.ab")
    public String field824;

    @ObfuscatedName("dq.aw(I)Z")
    public static boolean method2080() {
        try {
            if (Statics.field823 == null) {
                Statics.field823 = Statics.field3013.method2686(new URL(Statics.field3085));
            } else if (Statics.field823.method2711()) {
                byte[] var0 = Statics.field823.method2710();
                class514 var1 = new class514(var0);
                var1.method8496();
                field829 = var1.method8246();
                Statics.field4440 = new class68[field829];
                int var2 = 0;
                while (var2 < field829) {
                    class68 var3 = Statics.field4440[var2] = new class68();
                    var3.field825 = var1.method8246();
                    var3.field828 = var1.method8496();
                    var3.field831 = var1.method8369();
                    var3.field832 = var1.method8369();
                    var3.field833 = var1.method8244();
                    var3.field822 = var1.method8497();
                    var3.field834 = var2++;
                }
                method3493(Statics.field4440, 0, Statics.field4440.length - 1, field826, field838);
                Statics.field823 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field823 = null;
        }
        return false;
    }

    @ObfuscatedName("ln.ay(III)V")
    public static void method5181(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field826[var5] != arg0) {
                var2[var4] = field826[var5];
                var3[var4] = field838[var5];
                var4++;
            }
        }
        field826 = var2;
        field838 = var3;
        method3493(Statics.field4440, 0, Statics.field4440.length - 1, field826, field838);
    }

    @ObfuscatedName("hn.ar([Lcr;II[I[II)V")
    public static void method3493(class68[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class68 var8 = arg0[var7];
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
                        var11 = arg0[var6].field822;
                        var12 = var8.field822;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1760() ? 1 : 0;
                        var12 = var8.method1760() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field825;
                        var12 = var8.field825;
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
                        var15 = arg0[var5].field822;
                        var16 = var8.field822;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1760() ? 1 : 0;
                        var16 = var8.method1760() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field825;
                        var16 = var8.field825;
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
                class68 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3493(arg0, arg1, var6, arg3, arg4);
        method3493(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ki.am(IZIZB)V")
    public static void method5102(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4440 != null) {
            method2991(0, Statics.field4440.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fk.as(IIIZIZS)V")
    public static void method2991(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class68 var8 = Statics.field4440[var6];
        Statics.field4440[var6] = Statics.field4440[arg1];
        Statics.field4440[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class68 var10 = Statics.field4440[var9];
            int var11 = method3064(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method3064(var10, var8, arg4, arg5);
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
                class68 var14 = Statics.field4440[var9];
                Statics.field4440[var9] = Statics.field4440[var7];
                Statics.field4440[var7++] = var14;
            }
        }
        Statics.field4440[arg1] = Statics.field4440[var7];
        Statics.field4440[var7] = var8;
        method2991(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2991(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("fx.aj(Lcr;Lcr;IZI)I")
    public static int method3064(class68 arg0, class68 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field822;
            int var5 = arg1.field822;
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
            return arg0.method1721() ? (arg1.method1721() ? 0 : 1) : (arg1.method1721() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1719() ? (arg1.method1719() ? 0 : 1) : (arg1.method1719() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1745() ? (arg1.method1745() ? 0 : 1) : (arg1.method1745() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1760() ? (arg1.method1760() ? 0 : 1) : (arg1.method1760() ? -1 : 0);
        } else {
            return arg0.field825 - arg1.field825;
        }
    }

    @ObfuscatedName("bk.ag(B)Lcr;")
    public static class68 method777() {
        field827 = 0;
        return Statics.method7053();
    }

    @ObfuscatedName("cr.av(S)Z")
    public boolean method1760() {
        return (0x1 & this.field828) != 0;
    }

    @ObfuscatedName("cr.ap(I)Z")
    public boolean method1718() {
        return (0x10000 & this.field828) != 0;
    }

    @ObfuscatedName("cr.aq(B)Z")
    public boolean method1719() {
        return (0x2 & this.field828) != 0;
    }

    @ObfuscatedName("cr.at(I)Z")
    public boolean method1745() {
        return (0x4 & this.field828) != 0;
    }

    @ObfuscatedName("cr.ah(B)Z")
    public boolean method1721() {
        return (0x8 & this.field828) != 0;
    }

    @ObfuscatedName("cr.ax(I)Z")
    public boolean method1755() {
        return (0x20000000 & this.field828) != 0;
    }

    @ObfuscatedName("cr.aa(I)Z")
    public boolean method1723() {
        return (0x2000000 & this.field828) != 0;
    }

    @ObfuscatedName("cr.au(I)Z")
    public boolean method1724() {
        return (0x40000000 & this.field828) != 0;
    }

    @ObfuscatedName("cr.ae(B)Z")
    public boolean method1725() {
        return (0x100 & this.field828) != 0;
    }

    @ObfuscatedName("cr.ab(I)Z")
    public boolean method1726() {
        return (0x8000000 & this.field828) != 0;
    }
}
