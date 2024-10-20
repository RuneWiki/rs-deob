package deob;

import java.net.URL;

@ObfuscatedName("ch")
public class class68 {

    @ObfuscatedName("ch.ar")
    public static int field811 = 0;

    @ObfuscatedName("ch.ag")
    public static int field809 = 0;

    @ObfuscatedName("ch.ao")
    public static int[] field813 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ch.ae")
    public static int[] field814 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ch.au")
    public int field807;

    @ObfuscatedName("ch.an")
    public int field816;

    @ObfuscatedName("ch.ad")
    public int field817;

    @ObfuscatedName("ch.ax")
    public String field818;

    @ObfuscatedName("ch.aw")
    public String field819;

    @ObfuscatedName("ch.az")
    public int field812;

    @ObfuscatedName("ch.av")
    public int field821;

    @ObfuscatedName("ch.ak")
    public String field822;

    @ObfuscatedName("kw.am(I)Z")
    public static boolean method5125() {
        try {
            if (Statics.field1313 == null) {
                Statics.field1313 = Statics.field1431.method2760(new URL(Statics.field1413));
            } else if (Statics.field1313.method2797()) {
                byte[] var0 = Statics.field1313.method2798();
                class531 var1 = new class531(var0);
                var1.method8566();
                field811 = var1.method8775();
                Statics.field820 = new class68[field811];
                int var2 = 0;
                while (var2 < field811) {
                    class68 var3 = Statics.field820[var2] = new class68();
                    var3.field807 = var1.method8775();
                    var3.field816 = var1.method8566();
                    var3.field818 = var1.method8641();
                    var3.field819 = var1.method8641();
                    var3.field812 = var1.method8561();
                    var3.field817 = var1.method8564();
                    var3.field821 = var2++;
                }
                method6652(Statics.field820, 0, Statics.field820.length - 1, field814, field813);
                Statics.field1313 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1313 = null;
        }
        return false;
    }

    @ObfuscatedName("fz.ap(IIB)V")
    public static void method3110(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field814[var5] != arg0) {
                var2[var4] = field814[var5];
                var3[var4] = field813[var5];
                var4++;
            }
        }
        field814 = var2;
        field813 = var3;
        method6652(Statics.field820, 0, Statics.field820.length - 1, field814, field813);
    }

    @ObfuscatedName("pr.af([Lch;II[I[II)V")
    public static void method6652(class68[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field821;
                        var12 = var8.field821;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field817;
                        var12 = var8.field817;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1814() ? 1 : 0;
                        var12 = var8.method1814() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field807;
                        var12 = var8.field807;
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
                        var15 = arg0[var5].field821;
                        var16 = var8.field821;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field817;
                        var16 = var8.field817;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1814() ? 1 : 0;
                        var16 = var8.method1814() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field807;
                        var16 = var8.field807;
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
        method6652(arg0, arg1, var6, arg3, arg4);
        method6652(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ab.aj(IZIZB)V")
    public static void method306(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field820 != null) {
            method3252(0, Statics.field820.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gi.aq(IIIZIZI)V")
    public static void method3252(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class68 var8 = Statics.field820[var6];
        Statics.field820[var6] = Statics.field820[arg1];
        Statics.field820[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class68 var10 = Statics.field820[var9];
            int var11 = method1779(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1779(var10, var8, arg4, arg5);
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
                class68 var14 = Statics.field820[var9];
                Statics.field820[var9] = Statics.field820[var7];
                Statics.field820[var7++] = var14;
            }
        }
        Statics.field820[arg1] = Statics.field820[var7];
        Statics.field820[var7] = var8;
        method3252(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3252(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ch.ar(Lch;Lch;IZI)I")
    public static int method1779(class68 arg0, class68 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field817;
            int var5 = arg1.field817;
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
            return arg0.field812 - arg1.field812;
        } else if (arg2 == 3) {
            if (arg0.field819.equals("-")) {
                if (arg1.field819.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field819.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field819.compareTo(arg1.field819);
            }
        } else if (arg2 == 4) {
            return arg0.method1765() ? (arg1.method1765() ? 0 : 1) : (arg1.method1765() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1761() ? (arg1.method1761() ? 0 : 1) : (arg1.method1761() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1767() ? (arg1.method1767() ? 0 : 1) : (arg1.method1767() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1814() ? (arg1.method1814() ? 0 : 1) : (arg1.method1814() ? -1 : 0);
        } else {
            return arg0.field807 - arg1.field807;
        }
    }

    @ObfuscatedName("ls.ag(S)Lch;")
    public static class68 method5410() {
        field809 = 0;
        return method616();
    }

    @ObfuscatedName("by.ao(I)Lch;")
    public static class68 method616() {
        return field809 < field811 ? Statics.field820[++field809 - 1] : null;
    }

    @ObfuscatedName("ch.ae(I)Z")
    public boolean method1814() {
        return (class527.field5150.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.aa(I)Z")
    public boolean method1786() {
        return (class527.field5161.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.au(I)Z")
    public boolean method1761() {
        return (class527.field5151.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.an(I)Z")
    public boolean method1767() {
        return (class527.field5137.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.ad(I)Z")
    public boolean method1765() {
        return (class527.field5138.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.ax(B)Z")
    public boolean method1762() {
        return (class527.field5164.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.aw(I)Z")
    public boolean method1763() {
        return (class527.field5152.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.az(I)Z")
    public boolean method1764() {
        return (class527.field5165.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.av(I)Z")
    public boolean method1813() {
        return (class527.field5143.method34() & this.field816) != 0;
    }

    @ObfuscatedName("ch.ak(I)Z")
    public boolean method1778() {
        return (class527.field5162.method34() & this.field816) != 0;
    }
}
