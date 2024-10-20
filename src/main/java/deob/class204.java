package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ha")
public class class204 extends class444 {

    @ObfuscatedName("ha.af")
    public static boolean field2298 = false;

    @ObfuscatedName("ha.al")
    public static class280 field2287 = new class280(64);

    @ObfuscatedName("ha.at")
    public static class280 field2302 = new class280(100);

    @ObfuscatedName("ha.aa")
    public static class280 field2295 = new class280(100);

    @ObfuscatedName("ha.ay")
    public int field2296 = -1;

    @ObfuscatedName("ha.ao")
    public Map field2312;

    @ObfuscatedName("ha.ax")
    public int field2286 = 0;

    @ObfuscatedName("ha.ai")
    public int field2299 = 0;

    @ObfuscatedName("ha.ag")
    public int[] field2300;

    @ObfuscatedName("ha.ah")
    public int[] field2297;

    @ObfuscatedName("ha.av")
    public int[] field2304;

    @ObfuscatedName("ha.ar")
    public int[] field2303;

    @ObfuscatedName("ha.am")
    public int field2301 = -1;

    @ObfuscatedName("ha.as")
    public int[] field2305;

    @ObfuscatedName("ha.aj")
    public boolean[] field2290;

    @ObfuscatedName("ha.ak")
    public boolean field2307 = false;

    @ObfuscatedName("ha.az")
    public int field2294 = 5;

    @ObfuscatedName("ha.ad")
    public int field2309 = -1;

    @ObfuscatedName("ha.ae")
    public int field2310 = -1;

    @ObfuscatedName("ha.ap")
    public int field2288 = 99;

    @ObfuscatedName("ha.by")
    public boolean field2308 = false;

    @ObfuscatedName("ha.bb")
    public int field2313 = -1;

    @ObfuscatedName("ha.bi")
    public int field2314 = -1;

    @ObfuscatedName("ha.be")
    public int field2315 = 2;

    @ObfuscatedName("fk.af(Lnm;Lnm;Lnm;I)V")
    public static void method3140(class344 arg0, class344 arg1, class344 arg2) {
        Statics.field2311 = arg0;
        Statics.field2291 = arg1;
        Statics.field2292 = arg2;
    }

    @ObfuscatedName("dc.an(IB)Lha;")
    public static class204 method2139(int arg0) {
        class204 var1 = (class204) field2287.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2311.method6090(12, arg0);
        class204 var3 = new class204();
        if (var2 != null) {
            var3.method3807(new class489(var2));
        }
        var3.method3809();
        field2287.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ha.aw(Lsg;I)V")
    public void method3807(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3845(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ac(Lsg;IB)V")
    public void method3845(class489 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8250();
            this.field2304 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2304[var4] = arg0.method8250();
            }
            this.field2300 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2300[var5] = arg0.method8250();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2300[var6] += arg0.method8250() << 16;
            }
        } else if (arg1 == 2) {
            this.field2301 = arg0.method8250();
        } else if (arg1 == 3) {
            int var7 = arg0.method8248();
            this.field2305 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2305[var8] = arg0.method8248();
            }
            this.field2305[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2307 = true;
        } else if (arg1 == 5) {
            this.field2294 = arg0.method8248();
        } else if (arg1 == 6) {
            this.field2309 = arg0.method8250();
        } else if (arg1 == 7) {
            this.field2310 = arg0.method8250();
        } else if (arg1 == 8) {
            this.field2288 = arg0.method8248();
            this.field2308 = true;
        } else if (arg1 == 9) {
            this.field2313 = arg0.method8248();
        } else if (arg1 == 10) {
            this.field2314 = arg0.method8248();
        } else if (arg1 == 11) {
            this.field2315 = arg0.method8248();
        } else if (arg1 == 12) {
            int var9 = arg0.method8248();
            this.field2297 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2297[var10] = arg0.method8250();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2297[var11] += arg0.method8250() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8248();
            this.field2303 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2303[var13] = arg0.method8252();
            }
        } else if (arg1 == 14) {
            this.field2296 = arg0.method8254();
        } else if (arg1 == 15) {
            int var14 = arg0.method8250();
            this.field2312 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8250();
                int var17 = arg0.method8252();
                this.field2312.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2286 = arg0.method8250();
            this.field2299 = arg0.method8250();
        } else if (arg1 == 17) {
            this.field2290 = new boolean[256];
            for (int var18 = 0; var18 < this.field2290.length; var18++) {
                this.field2290[var18] = false;
            }
            int var19 = arg0.method8248();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2290[arg0.method8248()] = true;
            }
        }
    }

    @ObfuscatedName("ha.au(I)V")
    public void method3809() {
        if (this.field2313 == -1) {
            if (this.field2305 == null && this.field2290 == null) {
                this.field2313 = 0;
            } else {
                this.field2313 = 2;
            }
        }
        if (this.field2314 != -1) {
            return;
        }
        if (this.field2305 == null && this.field2290 == null) {
            this.field2314 = 0;
        } else {
            this.field2314 = 2;
        }
    }

    @ObfuscatedName("ha.ab(Lit;IB)Lit;")
    public class232 method3810(class232 arg0, int arg1) {
        if (this.method3816()) {
            class134 var7 = method2536(this.field2296);
            if (var7 == null) {
                return arg0.method4390(true);
            } else {
                class232 var8 = arg0.method4390(!var7.method2976());
                var8.method4404(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2300[arg1];
            class227 var4 = method4997(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4390(true);
            } else {
                class232 var6 = arg0.method4390(!var4.method4349(var5));
                var6.method4439(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ha.aq(Lit;III)Lit;")
    public class232 method3840(class232 arg0, int arg1, int arg2) {
        if (this.method3816()) {
            class134 var9 = method2536(this.field2296);
            if (var9 == null) {
                return arg0.method4390(true);
            }
            class232 var10 = arg0.method4390(!var9.method2976());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4399();
            } else if (var11 == 2) {
                var10.method4412();
            } else if (var11 == 3) {
                var10.method4481();
            }
            var10.method4404(var9, arg1);
            if (var11 == 1) {
                var10.method4481();
            } else if (var11 == 2) {
                var10.method4412();
            } else if (var11 == 3) {
                var10.method4399();
            }
            return var10;
        }
        int var4 = this.field2300[arg1];
        class227 var5 = method4997(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4390(true);
        }
        class232 var7 = arg0.method4390(!var5.method4349(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4399();
        } else if (var8 == 2) {
            var7.method4412();
        } else if (var8 == 3) {
            var7.method4481();
        }
        var7.method4439(var5, var6);
        if (var8 == 1) {
            var7.method4481();
        } else if (var8 == 2) {
            var7.method4412();
        } else if (var8 == 3) {
            var7.method4399();
        }
        return var7;
    }

    @ObfuscatedName("ha.al(Lit;II)Lit;")
    public class232 method3832(class232 arg0, int arg1) {
        if (this.method3816()) {
            class134 var7 = method2536(this.field2296);
            if (var7 == null) {
                return arg0.method4396(true);
            } else {
                class232 var8 = arg0.method4396(!var7.method2976());
                var8.method4404(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2300[arg1];
            class227 var4 = method4997(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4396(true);
            } else {
                class232 var6 = arg0.method4396(!var4.method4349(var5));
                var6.method4439(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ha.at(Lit;ILha;II)Lit;")
    public class232 method3857(class232 arg0, int arg1, class204 arg2, int arg3) {
        if (field2298 && !this.method3816() && !arg2.method3816()) {
            return this.method3814(arg0, arg1, arg2, arg3);
        }
        class232 var5 = arg0.method4390(false);
        boolean var6 = false;
        class227 var7 = null;
        class222 var8 = null;
        if (this.method3816()) {
            class134 var9 = this.method3836();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3816() && this.field2290 == null) {
                var5.method4404(var9, arg1);
                return var5;
            }
            var8 = var9.field1591;
            var5.method4444(var8, var9, arg1, this.field2290, false, !arg2.method3816());
        } else {
            int var10 = this.field2300[arg1];
            var7 = method4997(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3810(arg0, arg3);
            }
            if (!arg2.method3816() && (this.field2305 == null || arg3 == -1)) {
                var5.method4439(var7, arg1);
                return var5;
            }
            if (this.field2305 == null || arg3 == -1) {
                var5.method4439(var7, arg1);
                return var5;
            }
            var6 = arg2.method3816();
            if (!var6) {
                var5.method4409(var7, arg1, this.field2305, false);
            }
        }
        if (arg2.method3816()) {
            class134 var11 = arg2.method3836();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1591;
            }
            var5.method4444(var8, var11, arg3, this.field2290, true, true);
        } else {
            int var12 = arg2.field2300[arg3];
            class227 var13 = method4997(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3810(arg0, arg1);
            }
            var5.method4409(var13, var14, this.field2305, true);
        }
        if (var6 && var7 != null) {
            var5.method4409(var7, arg1, this.field2305, false);
        }
        var5.method4402();
        return var5;
    }

    @ObfuscatedName("ha.aa(Lit;ILha;IB)Lit;")
    public class232 method3814(class232 arg0, int arg1, class204 arg2, int arg3) {
        int var5 = this.field2300[arg1];
        class227 var6 = method4997(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3810(arg0, arg3);
        }
        int var8 = arg2.field2300[arg3];
        class227 var9 = method4997(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class232 var11 = arg0.method4390(!var6.method4349(var7));
            var11.method4439(var6, var7);
            return var11;
        } else {
            class232 var12 = arg0.method4390(!var6.method4349(var7) & !var9.method4349(var10));
            var12.method4407(var6, var7, var9, var10, this.field2305);
            return var12;
        }
    }

    @ObfuscatedName("ha.ay(Lit;IB)Lit;")
    public class232 method3811(class232 arg0, int arg1) {
        if (this.method3816()) {
            return this.method3810(arg0, arg1);
        }
        int var3 = this.field2300[arg1];
        class227 var4 = method4997(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4390(true);
        }
        class227 var6 = null;
        int var7 = 0;
        if (this.field2297 != null && arg1 < this.field2297.length) {
            int var8 = this.field2297[arg1];
            var6 = method4997(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class232 var10 = arg0.method4390(!var4.method4349(var5));
            var10.method4439(var4, var5);
            return var10;
        } else {
            class232 var9 = arg0.method4390(!var4.method4349(var5) & !var6.method4349(var7));
            var9.method4439(var4, var5);
            var9.method4439(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ha.ao(I)Z")
    public boolean method3816() {
        return this.field2296 >= 0;
    }

    @ObfuscatedName("ha.ax(I)I")
    public int method3817() {
        return this.field2299 - this.field2286;
    }

    @ObfuscatedName("kb.ai(II)Lio;")
    public static class227 method4997(int arg0) {
        class227 var1 = (class227) field2302.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class227 var2 = class227.method2241(Statics.field2291, Statics.field2292, arg0, false);
        if (var2 != null) {
            field2302.method5121(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("aj.ag(II)I")
    public static int method297(int arg0) {
        class134 var1 = (class134) field2295.method5119((long) arg0);
        class134 var2;
        if (var1 == null) {
            class134 var3 = class134.method3949(Statics.field2291, Statics.field2292, arg0, false);
            if (var3 != null) {
                field2295.method5121(var3, (long) arg0);
            }
            var2 = var3;
        } else {
            var2 = var1;
        }
        if (var2 == null) {
            return 2;
        } else if (var2.method2996()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("ha.ah(B)Lfh;")
    public class134 method3836() {
        return this.method3816() ? method2536(this.field2296) : null;
    }

    @ObfuscatedName("dx.av(II)Lfh;")
    public static class134 method2536(int arg0) {
        if (method297(arg0) != 0) {
            return null;
        }
        class134 var1 = (class134) field2295.method5119((long) arg0);
        class134 var2;
        if (var1 == null) {
            class134 var3 = class134.method3949(Statics.field2291, Statics.field2292, arg0, false);
            if (var3 != null) {
                field2295.method5121(var3, (long) arg0);
            }
            var2 = var3;
        } else {
            var2 = var1;
        }
        return var2;
    }
}
