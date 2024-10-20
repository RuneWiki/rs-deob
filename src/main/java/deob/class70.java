package deob;

import java.net.URL;

@ObfuscatedName("cl")
public class class70 {

    @ObfuscatedName("cl.aa")
    public static int field835 = 0;

    @ObfuscatedName("cl.at")
    public static int field836 = 0;

    @ObfuscatedName("cl.ab")
    public static int[] field837 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cl.ac")
    public static int[] field838 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cl.ah")
    public int field839;

    @ObfuscatedName("cl.av")
    public int field846;

    @ObfuscatedName("cl.aq")
    public int field841;

    @ObfuscatedName("cl.ap")
    public String field842;

    @ObfuscatedName("cl.ae")
    public String field843;

    @ObfuscatedName("cl.ax")
    public int field848;

    @ObfuscatedName("cl.ay")
    public int field844;

    @ObfuscatedName("cl.au")
    public String field833;

    @ObfuscatedName("pd.ak(B)Z")
    public static boolean method6725() {
        try {
            if (Statics.field120 == null) {
                Statics.field120 = Statics.field3400.method2771(new URL(Statics.field2698));
            } else if (Statics.field120.method2797()) {
                byte[] var0 = Statics.field120.method2798();
                class546 var1 = new class546(var0);
                var1.method8801();
                field835 = var1.method8798();
                Statics.field4663 = new class70[field835];
                int var2 = 0;
                while (var2 < field835) {
                    class70 var3 = Statics.field4663[var2] = new class70();
                    var3.field839 = var1.method8798();
                    var3.field846 = var1.method8801();
                    var3.field842 = var1.method8806();
                    var3.field843 = var1.method8806();
                    var3.field848 = var1.method8796();
                    var3.field841 = var1.method8926();
                    var3.field844 = var2++;
                }
                method5036(Statics.field4663, 0, Statics.field4663.length - 1, field838, field837);
                Statics.field120 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field120 = null;
        }
        return false;
    }

    @ObfuscatedName("je.al(IIB)V")
    public static void method4430(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field838[var5] != arg0) {
                var2[var4] = field838[var5];
                var3[var4] = field837[var5];
                var4++;
            }
        }
        field838 = var2;
        field837 = var3;
        method5036(Statics.field4663, 0, Statics.field4663.length - 1, field838, field837);
    }

    @ObfuscatedName("kj.aj([Lcl;II[I[II)V")
    public static void method5036(class70[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field844;
                        var12 = var8.field844;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field841;
                        var12 = var8.field841;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1779() ? 1 : 0;
                        var12 = var8.method1779() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field839;
                        var12 = var8.field839;
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
                        var15 = arg0[var5].field844;
                        var16 = var8.field844;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field841;
                        var16 = var8.field841;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1779() ? 1 : 0;
                        var16 = var8.method1779() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field839;
                        var16 = var8.field839;
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
        method5036(arg0, arg1, var6, arg3, arg4);
        method5036(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("sd.az(IZIZI)V")
    public static void method8137(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4663 != null) {
            method3521(0, Statics.field4663.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hd.af(IIIZIZI)V")
    public static void method3521(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class70 var8 = Statics.field4663[var6];
        Statics.field4663[var6] = Statics.field4663[arg1];
        Statics.field4663[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method3231(Statics.field4663[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class70 var10 = Statics.field4663[var9];
                Statics.field4663[var9] = Statics.field4663[var7];
                Statics.field4663[var7++] = var10;
            }
        }
        Statics.field4663[arg1] = Statics.field4663[var7];
        Statics.field4663[var7] = var8;
        method3521(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3521(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("gu.aa(Lcl;Lcl;IZIZI)I")
    public static int method3231(class70 arg0, class70 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method4197(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method4197(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("jv.at(Lcl;Lcl;IZI)I")
    public static int method4197(class70 arg0, class70 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field841;
            int var5 = arg1.field841;
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
            return arg0.field848 - arg1.field848;
        } else if (arg2 == 3) {
            if (arg0.field843.equals("-")) {
                if (arg1.field843.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field843.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field843.compareTo(arg1.field843);
            }
        } else if (arg2 == 4) {
            return arg0.method1746() ? (arg1.method1746() ? 0 : 1) : (arg1.method1746() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1759() ? (arg1.method1759() ? 0 : 1) : (arg1.method1759() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1751() ? (arg1.method1751() ? 0 : 1) : (arg1.method1751() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1779() ? (arg1.method1779() ? 0 : 1) : (arg1.method1779() ? -1 : 0);
        } else {
            return arg0.field839 - arg1.field839;
        }
    }

    @ObfuscatedName("iy.ab(I)Lcl;")
    public static class70 method3768() {
        field836 = 0;
        return method2984();
    }

    @ObfuscatedName("fe.ac(I)Lcl;")
    public static class70 method2984() {
        return field836 < field835 ? Statics.field4663[++field836 - 1] : null;
    }

    @ObfuscatedName("cl.ao(B)Z")
    public boolean method1779() {
        return (class542.field5315.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.ah(B)Z")
    public boolean method1743() {
        return (class542.field5314.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.av(I)Z")
    public boolean method1759() {
        return (class542.field5298.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.aq(I)Z")
    public boolean method1751() {
        return (class542.field5300.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.ap(I)Z")
    public boolean method1746() {
        return (class542.field5304.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.ae(I)Z")
    public boolean method1747() {
        return (class542.field5327.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.ax(I)Z")
    public boolean method1748() {
        return (class542.field5323.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.ay(B)Z")
    public boolean method1793() {
        return (class542.field5328.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.au(I)Z")
    public boolean method1750() {
        return (class542.field5301.method34() & this.field846) != 0;
    }

    @ObfuscatedName("cl.as(B)Z")
    public boolean method1791() {
        return (class542.field5303.method34() & this.field846) != 0;
    }
}
