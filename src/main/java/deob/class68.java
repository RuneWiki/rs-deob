package deob;

import java.net.URL;

@ObfuscatedName("ch")
public class class68 {

    @ObfuscatedName("ch.ai")
    public static int field842 = 0;

    @ObfuscatedName("ch.az")
    public static int field838 = 0;

    @ObfuscatedName("ch.ap")
    public static int[] field839 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ch.aa")
    public static int[] field840 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ch.ad")
    public int field841;

    @ObfuscatedName("ch.aq")
    public int field837;

    @ObfuscatedName("ch.al")
    public int field843;

    @ObfuscatedName("ch.an")
    public String field844;

    @ObfuscatedName("ch.ar")
    public String field845;

    @ObfuscatedName("ch.ab")
    public int field846;

    @ObfuscatedName("ch.ag")
    public int field847;

    @ObfuscatedName("ch.am")
    public String field848;

    @ObfuscatedName("eg.au(I)Z")
    public static boolean method2802() {
        try {
            if (Statics.field2886 == null) {
                Statics.field2886 = Statics.field4644.method2691(new URL(Statics.field2122));
            } else if (Statics.field2886.method2722()) {
                byte[] var0 = Statics.field2886.method2728();
                class515 var1 = new class515(var0);
                var1.method8306();
                field842 = var1.method8448();
                Statics.field1879 = new class68[field842];
                int var2 = 0;
                while (var2 < field842) {
                    class68 var3 = Statics.field1879[var2] = new class68();
                    var3.field841 = var1.method8448();
                    var3.field837 = var1.method8306();
                    var3.field844 = var1.method8311();
                    var3.field845 = var1.method8311();
                    var3.field846 = var1.method8300();
                    var3.field843 = var1.method8303();
                    var3.field847 = var2++;
                }
                method656(Statics.field1879, 0, Statics.field1879.length - 1, field840, field839);
                Statics.field2886 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2886 = null;
        }
        return false;
    }

    @ObfuscatedName("fw.ae(III)V")
    public static void method2984(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field840[var5] != arg0) {
                var2[var4] = field840[var5];
                var3[var4] = field839[var5];
                var4++;
            }
        }
        field840 = var2;
        field839 = var3;
        method656(Statics.field1879, 0, Statics.field1879.length - 1, field840, field839);
    }

    @ObfuscatedName("bm.ao([Lch;II[I[II)V")
    public static void method656(class68[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field847;
                        var12 = var8.field847;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field843;
                        var12 = var8.field843;
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
                        var11 = arg0[var6].field841;
                        var12 = var8.field841;
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
                        var15 = arg0[var5].field847;
                        var16 = var8.field847;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field843;
                        var16 = var8.field843;
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
                        var15 = arg0[var5].field841;
                        var16 = var8.field841;
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
        method656(arg0, arg1, var6, arg3, arg4);
        method656(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ft.at(IZIZI)V")
    public static void method2902(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1879 != null) {
            method4399(0, Statics.field1879.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("jn.ac(IIIZIZI)V")
    public static void method4399(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class68 var8 = Statics.field1879[var6];
        Statics.field1879[var6] = Statics.field1879[arg1];
        Statics.field1879[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2306(Statics.field1879[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class68 var10 = Statics.field1879[var9];
                Statics.field1879[var9] = Statics.field1879[var7];
                Statics.field1879[var7++] = var10;
            }
        }
        Statics.field1879[arg1] = Statics.field1879[var7];
        Statics.field1879[var7] = var8;
        method4399(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4399(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("do.ai(Lch;Lch;IZIZI)I")
    public static int method2306(class68 arg0, class68 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2948(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2948(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fr.az(Lch;Lch;IZI)I")
    public static int method2948(class68 arg0, class68 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field843;
            int var5 = arg1.field843;
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
            return arg0.field846 - arg1.field846;
        } else if (arg2 == 3) {
            if (arg0.field845.equals("-")) {
                if (arg1.field845.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field845.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field845.compareTo(arg1.field845);
            }
        } else if (arg2 == 4) {
            return arg0.method1732() ? (arg1.method1732() ? 0 : 1) : (arg1.method1732() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1720() ? (arg1.method1720() ? 0 : 1) : (arg1.method1720() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1768() ? (arg1.method1768() ? 0 : 1) : (arg1.method1768() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1718() ? (arg1.method1718() ? 0 : 1) : (arg1.method1718() ? -1 : 0);
        } else {
            return arg0.field841 - arg1.field841;
        }
    }

    @ObfuscatedName("ax.ap(S)Lch;")
    public static class68 method283() {
        field838 = 0;
        return method3330();
    }

    @ObfuscatedName("hk.aa(I)Lch;")
    public static class68 method3330() {
        return field838 < field842 ? Statics.field1879[++field838 - 1] : null;
    }

    @ObfuscatedName("ch.af(B)Z")
    public boolean method1718() {
        return (class511.field5088.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.ad(I)Z")
    public boolean method1719() {
        return (class511.field5078.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.aq(I)Z")
    public boolean method1720() {
        return (class511.field5063.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.al(B)Z")
    public boolean method1768() {
        return (class511.field5072.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.an(I)Z")
    public boolean method1732() {
        return (class511.field5076.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.ar(I)Z")
    public boolean method1723() {
        return (class511.field5091.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.ab(I)Z")
    public boolean method1727() {
        return (class511.field5087.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.ag(B)Z")
    public boolean method1724() {
        return (class511.field5092.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.am(B)Z")
    public boolean method1758() {
        return (class511.field5070.method30() & this.field837) != 0;
    }

    @ObfuscatedName("ch.ax(B)Z")
    public boolean method1726() {
        return (class511.field5089.method30() & this.field837) != 0;
    }
}
