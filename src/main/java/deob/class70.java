package deob;

import java.net.URL;

@ObfuscatedName("cw")
public class class70 {

    @ObfuscatedName("cw.an")
    public static int field815 = 0;

    @ObfuscatedName("cw.aj")
    public static int field826 = 0;

    @ObfuscatedName("cw.av")
    public static int[] field817 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cw.ab")
    public static int[] field818 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cw.ae")
    public int field819;

    @ObfuscatedName("cw.au")
    public int field829;

    @ObfuscatedName("cw.ah")
    public int field821;

    @ObfuscatedName("cw.az")
    public String field822;

    @ObfuscatedName("cw.ax")
    public String field823;

    @ObfuscatedName("cw.ac")
    public int field824;

    @ObfuscatedName("cw.al")
    public int field825;

    @ObfuscatedName("cw.ay")
    public String field820;

    @ObfuscatedName("oc.aq(I)Z")
    public static boolean method6455() {
        try {
            if (Statics.field1844 == null) {
                Statics.field1844 = Statics.field4837.method2797(new URL(Statics.field4494));
            } else if (Statics.field1844.method2822()) {
                byte[] var0 = Statics.field1844.method2823();
                class547 var1 = new class547(var0);
                var1.method8734();
                field815 = var1.method8899();
                Statics.field3820 = new class70[field815];
                int var2 = 0;
                while (var2 < field815) {
                    class70 var3 = Statics.field3820[var2] = new class70();
                    var3.field819 = var1.method8899();
                    var3.field829 = var1.method8734();
                    var3.field822 = var1.method8739();
                    var3.field823 = var1.method8739();
                    var3.field824 = var1.method8804();
                    var3.field821 = var1.method8731();
                    var3.field825 = var2++;
                }
                method4565(Statics.field3820, 0, Statics.field3820.length - 1, field818, field817);
                Statics.field1844 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1844 = null;
        }
        return false;
    }

    @ObfuscatedName("dl.ad(III)V")
    public static void method2565(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field818[var5] != arg0) {
                var2[var4] = field818[var5];
                var3[var4] = field817[var5];
                var4++;
            }
        }
        field818 = var2;
        field817 = var3;
        method4565(Statics.field3820, 0, Statics.field3820.length - 1, field818, field817);
    }

    @ObfuscatedName("jk.ag([Lcw;II[I[II)V")
    public static void method4565(class70[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field825;
                        var12 = var8.field825;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field821;
                        var12 = var8.field821;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1748() ? 1 : 0;
                        var12 = var8.method1748() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field819;
                        var12 = var8.field819;
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
                        var15 = arg0[var5].field825;
                        var16 = var8.field825;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field821;
                        var16 = var8.field821;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1748() ? 1 : 0;
                        var16 = var8.method1748() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field819;
                        var16 = var8.field819;
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
        method4565(arg0, arg1, var6, arg3, arg4);
        method4565(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("gf.ak(IZIZI)V")
    public static void method3238(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field3820 != null) {
            method8158(0, Statics.field3820.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("tr.ap(IIIZIZS)V")
    public static void method8158(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class70 var8 = Statics.field3820[var6];
        Statics.field3820[var6] = Statics.field3820[arg1];
        Statics.field3820[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2065(Statics.field3820[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class70 var10 = Statics.field3820[var9];
                Statics.field3820[var9] = Statics.field3820[var7];
                Statics.field3820[var7++] = var10;
            }
        }
        Statics.field3820[arg1] = Statics.field3820[var7];
        Statics.field3820[var7] = var8;
        method8158(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method8158(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cx.an(Lcw;Lcw;IZIZI)I")
    public static int method2065(class70 arg0, class70 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method5457(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method5457(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("lb.aj(Lcw;Lcw;IZI)I")
    public static int method5457(class70 arg0, class70 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field821;
            int var5 = arg1.field821;
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
            return arg0.field824 - arg1.field824;
        } else if (arg2 == 3) {
            if (arg0.field823.equals("-")) {
                if (arg1.field823.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field823.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field823.compareTo(arg1.field823);
            }
        } else if (arg2 == 4) {
            return arg0.method1778() ? (arg1.method1778() ? 0 : 1) : (arg1.method1778() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1750() ? (arg1.method1750() ? 0 : 1) : (arg1.method1750() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1751() ? (arg1.method1751() ? 0 : 1) : (arg1.method1751() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1748() ? (arg1.method1748() ? 0 : 1) : (arg1.method1748() ? -1 : 0);
        } else {
            return arg0.field819 - arg1.field819;
        }
    }

    @ObfuscatedName("li.av(B)Lcw;")
    public static class70 method5216() {
        field826 = 0;
        return method1811();
    }

    @ObfuscatedName("cw.ab(I)Lcw;")
    public static class70 method1811() {
        return field826 < field815 ? Statics.field3820[++field826 - 1] : null;
    }

    @ObfuscatedName("cw.ai(I)Z")
    public boolean method1748() {
        return (class543.field5345.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.ae(S)Z")
    public boolean method1779() {
        return (class543.field5332.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.au(I)Z")
    public boolean method1750() {
        return (class543.field5319.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.ah(I)Z")
    public boolean method1751() {
        return (class543.field5320.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.az(I)Z")
    public boolean method1778() {
        return (class543.field5341.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.ax(I)Z")
    public boolean method1753() {
        return (class543.field5321.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.ac(I)Z")
    public boolean method1803() {
        return (class543.field5343.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.al(B)Z")
    public boolean method1755() {
        return (class543.field5348.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.ay(I)Z")
    public boolean method1784() {
        return (class543.field5326.method32() & this.field829) != 0;
    }

    @ObfuscatedName("cw.ao(B)Z")
    public boolean method1757() {
        return (class543.field5329.method32() & this.field829) != 0;
    }
}
