package deob;

import java.net.URL;

@ObfuscatedName("ck")
public class class69 {

    @ObfuscatedName("ck.ao")
    public static int field822 = 0;

    @ObfuscatedName("ck.ab")
    public static int field821 = 0;

    @ObfuscatedName("ck.aw")
    public static int[] field823 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ck.ad")
    public static int[] field824 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ck.as")
    public int field818;

    @ObfuscatedName("ck.ag")
    public int field826;

    @ObfuscatedName("ck.ai")
    public int field827;

    @ObfuscatedName("ck.ax")
    public String field828;

    @ObfuscatedName("ck.ar")
    public String field829;

    @ObfuscatedName("ck.aj")
    public int field830;

    @ObfuscatedName("ck.au")
    public int field831;

    @ObfuscatedName("ck.ay")
    public String field832;

    @ObfuscatedName("ag.az(B)Z")
    public static boolean method101() {
        try {
            if (Statics.field5188 == null) {
                Statics.field5188 = Statics.field1180.method2677(new URL(Statics.field1539));
            } else if (Statics.field5188.method2712()) {
                byte[] var0 = Statics.field5188.method2714();
                class535 var1 = new class535(var0);
                var1.method8682();
                field822 = var1.method8670();
                Statics.field820 = new class69[field822];
                int var2 = 0;
                while (var2 < field822) {
                    class69 var3 = Statics.field820[var2] = new class69();
                    var3.field818 = var1.method8670();
                    var3.field826 = var1.method8682();
                    var3.field828 = var1.method8473();
                    var3.field829 = var1.method8473();
                    var3.field830 = var1.method8462();
                    var3.field827 = var1.method8465();
                    var3.field831 = var2++;
                }
                method3648(Statics.field820, 0, Statics.field820.length - 1, field824, field823);
                Statics.field5188 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field5188 = null;
        }
        return false;
    }

    @ObfuscatedName("dl.ah(IIB)V")
    public static void method2108(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field824[var5] != arg0) {
                var2[var4] = field824[var5];
                var3[var4] = field823[var5];
                var4++;
            }
        }
        field824 = var2;
        field823 = var3;
        method3648(Statics.field820, 0, Statics.field820.length - 1, field824, field823);
    }

    @ObfuscatedName("iq.af([Lck;II[I[IB)V")
    public static void method3648(class69[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class69 var8 = arg0[var7];
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
                        var11 = arg0[var6].field831;
                        var12 = var8.field831;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field827;
                        var12 = var8.field827;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1703() ? 1 : 0;
                        var12 = var8.method1703() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field818;
                        var12 = var8.field818;
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
                        var15 = arg0[var5].field831;
                        var16 = var8.field831;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field827;
                        var16 = var8.field827;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1703() ? 1 : 0;
                        var16 = var8.method1703() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field818;
                        var16 = var8.field818;
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
                class69 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3648(arg0, arg1, var6, arg3, arg4);
        method3648(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("kf.at(IZIZB)V")
    public static void method4962(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field820 != null) {
            method5350(0, Statics.field820.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("lf.an(IIIZIZB)V")
    public static void method5350(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class69 var8 = Statics.field820[var6];
        Statics.field820[var6] = Statics.field820[arg1];
        Statics.field820[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class69 var10 = Statics.field820[var9];
            int var11 = method7261(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method7261(var10, var8, arg4, arg5);
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
                class69 var14 = Statics.field820[var9];
                Statics.field820[var9] = Statics.field820[var7];
                Statics.field820[var7++] = var14;
            }
        }
        Statics.field820[arg1] = Statics.field820[var7];
        Statics.field820[var7] = var8;
        method5350(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method5350(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("qg.ao(Lck;Lck;IZI)I")
    public static int method7261(class69 arg0, class69 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field827;
            int var5 = arg1.field827;
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
            return arg0.field830 - arg1.field830;
        } else if (arg2 == 3) {
            if (arg0.field829.equals("-")) {
                if (arg1.field829.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field829.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field829.compareTo(arg1.field829);
            }
        } else if (arg2 == 4) {
            return arg0.method1711() ? (arg1.method1711() ? 0 : 1) : (arg1.method1711() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1731() ? (arg1.method1731() ? 0 : 1) : (arg1.method1731() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1705() ? (arg1.method1705() ? 0 : 1) : (arg1.method1705() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1703() ? (arg1.method1703() ? 0 : 1) : (arg1.method1703() ? -1 : 0);
        } else {
            return arg0.field818 - arg1.field818;
        }
    }

    @ObfuscatedName("aa.ab(B)Lck;")
    public static class69 method273() {
        field821 = 0;
        return method2809();
    }

    @ObfuscatedName("eh.aw(S)Lck;")
    public static class69 method2809() {
        return field821 < field822 ? Statics.field820[++field821 - 1] : null;
    }

    @ObfuscatedName("ck.ad(I)Z")
    public boolean method1703() {
        return (class531.field5221.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.al(I)Z")
    public boolean method1735() {
        return (class531.field5204.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.as(I)Z")
    public boolean method1731() {
        return (class531.field5206.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.ag(I)Z")
    public boolean method1705() {
        return (class531.field5222.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.ai(B)Z")
    public boolean method1711() {
        return (class531.field5220.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.ax(I)Z")
    public boolean method1729() {
        return (class531.field5202.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.ar(B)Z")
    public boolean method1708() {
        return (class531.field5215.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.aj(I)Z")
    public boolean method1707() {
        return (class531.field5193.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.au(I)Z")
    public boolean method1712() {
        return (class531.field5198.method38() & this.field826) != 0;
    }

    @ObfuscatedName("ck.ay(I)Z")
    public boolean method1706() {
        return (class531.field5217.method38() & this.field826) != 0;
    }
}
