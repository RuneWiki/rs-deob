package deob;

import java.net.URL;

@ObfuscatedName("cj")
public class class69 {

    @ObfuscatedName("cj.as")
    public static int field840 = 0;

    @ObfuscatedName("cj.aa")
    public static int field841 = 0;

    @ObfuscatedName("cj.az")
    public static int[] field842 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cj.ao")
    public static int[] field843 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cj.ak")
    public int field837;

    @ObfuscatedName("cj.ah")
    public int field852;

    @ObfuscatedName("cj.aj")
    public int field846;

    @ObfuscatedName("cj.af")
    public String field850;

    @ObfuscatedName("cj.ax")
    public String field839;

    @ObfuscatedName("cj.an")
    public int field849;

    @ObfuscatedName("cj.ag")
    public int field848;

    @ObfuscatedName("cj.am")
    public String field851;

    @ObfuscatedName("iv.aq(I)Z")
    public static boolean method3898() {
        try {
            if (Statics.field3296 == null) {
                Statics.field3296 = Statics.field1838.method2761(new URL(Statics.field1923));
            } else if (Statics.field3296.method2778()) {
                byte[] var0 = Statics.field3296.method2780();
                class534 var1 = new class534(var0);
                var1.method8597();
                field840 = var1.method8593();
                Statics.field2661 = new class69[field840];
                int var2 = 0;
                while (var2 < field840) {
                    class69 var3 = Statics.field2661[var2] = new class69();
                    var3.field837 = var1.method8593();
                    var3.field852 = var1.method8597();
                    var3.field850 = var1.method8741();
                    var3.field839 = var1.method8741();
                    var3.field849 = var1.method8591();
                    var3.field846 = var1.method8594();
                    var3.field848 = var2++;
                }
                method3358(Statics.field2661, 0, Statics.field2661.length - 1, field843, field842);
                Statics.field3296 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3296 = null;
        }
        return false;
    }

    @ObfuscatedName("mq.aw(IIB)V")
    public static void method5708(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field843[var5] != arg0) {
                var2[var4] = field843[var5];
                var3[var4] = field842[var5];
                var4++;
            }
        }
        field843 = var2;
        field842 = var3;
        method3358(Statics.field2661, 0, Statics.field2661.length - 1, field843, field842);
    }

    @ObfuscatedName("hu.al([Lcj;II[I[II)V")
    public static void method3358(class69[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field848;
                        var12 = var8.field848;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field846;
                        var12 = var8.field846;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1718() ? 1 : 0;
                        var12 = var8.method1718() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field837;
                        var12 = var8.field837;
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
                        var15 = arg0[var5].field848;
                        var16 = var8.field848;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field846;
                        var16 = var8.field846;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1718() ? 1 : 0;
                        var16 = var8.method1718() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field837;
                        var16 = var8.field837;
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
        method3358(arg0, arg1, var6, arg3, arg4);
        method3358(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("aw.ai(IZIZB)V")
    public static void method14(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2661 != null) {
            method4528(0, Statics.field2661.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("jf.ar(IIIZIZB)V")
    public static void method4528(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class69 var8 = Statics.field2661[var6];
        Statics.field2661[var6] = Statics.field2661[arg1];
        Statics.field2661[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2725(Statics.field2661[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class69 var10 = Statics.field2661[var9];
                Statics.field2661[var9] = Statics.field2661[var7];
                Statics.field2661[var7++] = var10;
            }
        }
        Statics.field2661[arg1] = Statics.field2661[var7];
        Statics.field2661[var7] = var8;
        method4528(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4528(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ec.as(Lcj;Lcj;IZIZB)I")
    public static int method2725(class69 arg0, class69 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method7383(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method7383(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("qp.aa(Lcj;Lcj;IZB)I")
    public static int method7383(class69 arg0, class69 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field846;
            int var5 = arg1.field846;
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
            return arg0.field849 - arg1.field849;
        } else if (arg2 == 3) {
            if (arg0.field839.equals("-")) {
                if (arg1.field839.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field839.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field839.compareTo(arg1.field839);
            }
        } else if (arg2 == 4) {
            return arg0.method1722() ? (arg1.method1722() ? 0 : 1) : (arg1.method1722() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1720() ? (arg1.method1720() ? 0 : 1) : (arg1.method1720() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1721() ? (arg1.method1721() ? 0 : 1) : (arg1.method1721() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1718() ? (arg1.method1718() ? 0 : 1) : (arg1.method1718() ? -1 : 0);
        } else {
            return arg0.field837 - arg1.field837;
        }
    }

    @ObfuscatedName("fh.az(I)Lcj;")
    public static class69 method2927() {
        field841 = 0;
        return method2812();
    }

    @ObfuscatedName("eh.ao(B)Lcj;")
    public static class69 method2812() {
        return field841 < field840 ? Statics.field2661[++field841 - 1] : null;
    }

    @ObfuscatedName("cj.au(B)Z")
    public boolean method1718() {
        return (class530.field5187.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.ak(B)Z")
    public boolean method1719() {
        return (class530.field5175.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.ah(B)Z")
    public boolean method1720() {
        return (class530.field5178.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.aj(I)Z")
    public boolean method1721() {
        return (class530.field5161.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.af(I)Z")
    public boolean method1722() {
        return (class530.field5189.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.ax(I)Z")
    public boolean method1735() {
        return (class530.field5188.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.an(I)Z")
    public boolean method1737() {
        return (class530.field5184.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.ag(B)Z")
    public boolean method1725() {
        return (class530.field5159.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.am(I)Z")
    public boolean method1726() {
        return (class530.field5170.method35() & this.field852) != 0;
    }

    @ObfuscatedName("cj.ad(S)Z")
    public boolean method1744() {
        return (class530.field5186.method35() & this.field852) != 0;
    }
}
