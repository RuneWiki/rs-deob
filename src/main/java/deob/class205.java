package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("hx")
public class class205 extends class481 {

    @ObfuscatedName("hx.at")
    public static boolean field2207 = false;

    @ObfuscatedName("hx.ac")
    public static class299 field2209 = new class299(64);

    @ObfuscatedName("hx.al")
    public static class299 field2210 = new class299(100);

    @ObfuscatedName("hx.az")
    public static class299 field2223 = new class299(100);

    @ObfuscatedName("hx.ap")
    public int field2230 = -1;

    @ObfuscatedName("hx.av")
    public Map field2213;

    @ObfuscatedName("hx.ax")
    public int field2214 = 0;

    @ObfuscatedName("hx.as")
    public int field2220 = 0;

    @ObfuscatedName("hx.ay")
    public int[] field2216;

    @ObfuscatedName("hx.ak")
    public int[] field2217;

    @ObfuscatedName("hx.aj")
    public int[] field2218;

    @ObfuscatedName("hx.am")
    public int[] field2204;

    @ObfuscatedName("hx.aq")
    public int field2228 = -1;

    @ObfuscatedName("hx.ai")
    public int[] field2221;

    @ObfuscatedName("hx.aw")
    public boolean[] field2222;

    @ObfuscatedName("hx.ae")
    public boolean field2225 = false;

    @ObfuscatedName("hx.an")
    public int field2224 = 5;

    @ObfuscatedName("hx.ag")
    public int field2215 = -1;

    @ObfuscatedName("hx.ad")
    public int field2226 = -1;

    @ObfuscatedName("hx.af")
    public int field2212 = 99;

    @ObfuscatedName("hx.be")
    public boolean field2211 = false;

    @ObfuscatedName("hx.bd")
    public int field2219 = -1;

    @ObfuscatedName("hx.bl")
    public int field2206 = -1;

    @ObfuscatedName("hx.bi")
    public int field2231 = 2;

    @ObfuscatedName("di.at(II)Lhx;")
    public static class205 method2129(int arg0) {
        class205 var1 = (class205) field2209.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4294.method6284(12, arg0);
        class205 var3 = new class205();
        if (var2 != null) {
            var3.method3724(new class527(var2));
        }
        var3.method3775();
        field2209.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hx.ah(Luj;I)V")
    public void method3724(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3725(arg0, var2);
        }
    }

    @ObfuscatedName("hx.ar(Luj;II)V")
    public void method3725(class527 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8412();
            this.field2218 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2218[var4] = arg0.method8412();
            }
            this.field2216 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2216[var5] = arg0.method8412();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2216[var6] += arg0.method8412() << 16;
            }
        } else if (arg1 == 2) {
            this.field2228 = arg0.method8412();
        } else if (arg1 == 3) {
            int var7 = arg0.method8410();
            this.field2221 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2221[var8] = arg0.method8410();
            }
            this.field2221[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2225 = true;
        } else if (arg1 == 5) {
            this.field2224 = arg0.method8410();
        } else if (arg1 == 6) {
            this.field2215 = arg0.method8412();
        } else if (arg1 == 7) {
            this.field2226 = arg0.method8412();
        } else if (arg1 == 8) {
            this.field2212 = arg0.method8410();
            this.field2211 = true;
        } else if (arg1 == 9) {
            this.field2219 = arg0.method8410();
        } else if (arg1 == 10) {
            this.field2206 = arg0.method8410();
        } else if (arg1 == 11) {
            this.field2231 = arg0.method8410();
        } else if (arg1 == 12) {
            int var9 = arg0.method8410();
            this.field2217 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2217[var10] = arg0.method8412();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2217[var11] += arg0.method8412() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8410();
            this.field2204 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2204[var13] = arg0.method8414();
            }
        } else if (arg1 == 14) {
            this.field2230 = arg0.method8416();
        } else if (arg1 == 15) {
            int var14 = arg0.method8412();
            this.field2213 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8412();
                int var17 = arg0.method8414();
                this.field2213.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2214 = arg0.method8412();
            this.field2220 = arg0.method8412();
        } else if (arg1 == 17) {
            this.field2222 = new boolean[256];
            for (int var18 = 0; var18 < this.field2222.length; var18++) {
                this.field2222[var18] = false;
            }
            int var19 = arg0.method8410();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2222[arg0.method8410()] = true;
            }
        }
    }

    @ObfuscatedName("hx.ao(B)V")
    public void method3775() {
        if (this.field2219 == -1) {
            if (this.field2221 == null && this.field2222 == null) {
                this.field2219 = 0;
            } else {
                this.field2219 = 2;
            }
        }
        if (this.field2206 != -1) {
            return;
        }
        if (this.field2221 == null && this.field2222 == null) {
            this.field2206 = 0;
        } else {
            this.field2206 = 2;
        }
    }

    @ObfuscatedName("hx.ab(Lka;IB)Lka;")
    public class280 method3727(class280 arg0, int arg1) {
        if (this.method3733()) {
            class140 var7 = method3077(this.field2230);
            if (var7 == null) {
                return arg0.method5029(true);
            } else {
                class280 var8 = arg0.method5029(!var7.method3028());
                var8.method5038(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2216[arg1];
            class275 var4 = method2610(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5029(true);
            } else {
                class280 var6 = arg0.method5029(!var4.method4979(var5));
                var6.method5037(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hx.au(Lka;III)Lka;")
    public class280 method3729(class280 arg0, int arg1, int arg2) {
        if (this.method3733()) {
            class140 var9 = method3077(this.field2230);
            if (var9 == null) {
                return arg0.method5029(true);
            }
            class280 var10 = arg0.method5029(!var9.method3028());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method5047();
            } else if (var11 == 2) {
                var10.method5048();
            } else if (var11 == 3) {
                var10.method5068();
            }
            var10.method5038(var9, arg1);
            if (var11 == 1) {
                var10.method5068();
            } else if (var11 == 2) {
                var10.method5048();
            } else if (var11 == 3) {
                var10.method5047();
            }
            return var10;
        }
        int var4 = this.field2216[arg1];
        class275 var5 = method2610(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method5029(true);
        }
        class280 var7 = arg0.method5029(!var5.method4979(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method5047();
        } else if (var8 == 2) {
            var7.method5048();
        } else if (var8 == 3) {
            var7.method5068();
        }
        var7.method5037(var5, var6);
        if (var8 == 1) {
            var7.method5068();
        } else if (var8 == 2) {
            var7.method5048();
        } else if (var8 == 3) {
            var7.method5047();
        }
        return var7;
    }

    @ObfuscatedName("hx.aa(Lka;IB)Lka;")
    public class280 method3734(class280 arg0, int arg1) {
        if (this.method3733()) {
            class140 var7 = method3077(this.field2230);
            if (var7 == null) {
                return arg0.method5101(true);
            } else {
                class280 var8 = arg0.method5101(!var7.method3028());
                var8.method5038(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2216[arg1];
            class275 var4 = method2610(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5101(true);
            } else {
                class280 var6 = arg0.method5101(!var4.method4979(var5));
                var6.method5037(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hx.ac(Lka;ILhx;IB)Lka;")
    public class280 method3730(class280 arg0, int arg1, class205 arg2, int arg3) {
        if (field2207 && !this.method3733() && !arg2.method3733()) {
            return this.method3759(arg0, arg1, arg2, arg3);
        }
        class280 var5 = arg0.method5029(false);
        boolean var6 = false;
        class275 var7 = null;
        class270 var8 = null;
        if (this.method3733()) {
            class140 var9 = this.method3746();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3733() && this.field2222 == null) {
                var5.method5038(var9, arg1);
                return var5;
            }
            var8 = var9.field1601;
            var5.method5042(var8, var9, arg1, this.field2222, false, !arg2.method3733());
        } else {
            int var10 = this.field2216[arg1];
            var7 = method2610(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3727(arg0, arg3);
            }
            if (!arg2.method3733() && (this.field2221 == null || arg3 == -1)) {
                var5.method5037(var7, arg1);
                return var5;
            }
            if (this.field2221 == null || arg3 == -1) {
                var5.method5037(var7, arg1);
                return var5;
            }
            var6 = arg2.method3733();
            if (!var6) {
                var5.method5043(var7, arg1, this.field2221, false);
            }
        }
        if (arg2.method3733()) {
            class140 var11 = arg2.method3746();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1601;
            }
            var5.method5042(var8, var11, arg3, this.field2222, true, true);
        } else {
            int var12 = arg2.field2216[arg3];
            class275 var13 = method2610(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3727(arg0, arg1);
            }
            var5.method5043(var13, var14, this.field2221, true);
        }
        if (var6 && var7 != null) {
            var5.method5043(var7, arg1, this.field2221, false);
        }
        var5.method5036();
        return var5;
    }

    @ObfuscatedName("hx.al(Lka;ILhx;II)Lka;")
    public class280 method3759(class280 arg0, int arg1, class205 arg2, int arg3) {
        int var5 = this.field2216[arg1];
        class275 var6 = method2610(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3727(arg0, arg3);
        }
        int var8 = arg2.field2216[arg3];
        class275 var9 = method2610(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class280 var11 = arg0.method5029(!var6.method4979(var7));
            var11.method5037(var6, var7);
            return var11;
        } else {
            class280 var12 = arg0.method5029(!var6.method4979(var7) & !var9.method4979(var10));
            var12.method5094(var6, var7, var9, var10, this.field2221);
            return var12;
        }
    }

    @ObfuscatedName("hx.az(Lka;II)Lka;")
    public class280 method3726(class280 arg0, int arg1) {
        if (this.method3733()) {
            return this.method3727(arg0, arg1);
        }
        int var3 = this.field2216[arg1];
        class275 var4 = method2610(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method5029(true);
        }
        class275 var6 = null;
        int var7 = 0;
        if (this.field2217 != null && arg1 < this.field2217.length) {
            int var8 = this.field2217[arg1];
            var6 = method2610(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class280 var10 = arg0.method5029(!var4.method4979(var5));
            var10.method5037(var4, var5);
            return var10;
        } else {
            class280 var9 = arg0.method5029(!var4.method4979(var5) & !var6.method4979(var7));
            var9.method5037(var4, var5);
            var9.method5037(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("hx.ap(I)Z")
    public boolean method3733() {
        return this.field2230 >= 0;
    }

    @ObfuscatedName("hx.av(I)I")
    public int method3749() {
        return this.field2220 - this.field2214;
    }

    @ObfuscatedName("dj.ax(II)Lko;")
    public static class275 method2610(int arg0) {
        class275 var1 = (class275) field2210.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class275 var2 = class275.method2992(Statics.field2227, Statics.field2208, arg0, false);
        if (var2 != null) {
            field2210.method5303(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("db.as(IB)I")
    public static int method2256(int arg0) {
        class140 var1 = (class140) field2223.method5289((long) arg0);
        class140 var2;
        if (var1 == null) {
            class140 var3 = class140.method2091(Statics.field2227, Statics.field2208, arg0, false);
            if (var3 != null) {
                field2223.method5303(var3, (long) arg0);
            }
            var2 = var3;
        } else {
            var2 = var1;
        }
        if (var2 == null) {
            return 2;
        } else if (var2.method3005()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("hx.ay(B)Lfo;")
    public class140 method3746() {
        return this.method3733() ? method3077(this.field2230) : null;
    }

    @ObfuscatedName("fx.ak(II)Lfo;")
    public static class140 method3077(int arg0) {
        if (method2256(arg0) != 0) {
            return null;
        }
        class140 var1 = (class140) field2223.method5289((long) arg0);
        class140 var2;
        if (var1 == null) {
            class140 var3 = class140.method2091(Statics.field2227, Statics.field2208, arg0, false);
            if (var3 != null) {
                field2223.method5303(var3, (long) arg0);
            }
            var2 = var3;
        } else {
            var2 = var1;
        }
        return var2;
    }
}
