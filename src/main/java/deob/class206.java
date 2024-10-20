package deob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("hx")
public class class206 extends class439 {

    @ObfuscatedName("hx.aj")
    public static boolean field2271 = false;

    @ObfuscatedName("hx.aq")
    public static class276 field2255 = new class276(64);

    @ObfuscatedName("hx.ap")
    public static class276 field2251 = new class276(100);

    @ObfuscatedName("hx.ar")
    public static class276 field2257 = new class276(100);

    @ObfuscatedName("hx.ak")
    public int field2258 = -1;

    @ObfuscatedName("hx.ax")
    public Map field2274;

    @ObfuscatedName("hx.as")
    public int field2260 = 0;

    @ObfuscatedName("hx.ay")
    public int field2261 = 0;

    @ObfuscatedName("hx.am")
    public int[] field2276;

    @ObfuscatedName("hx.az")
    public int[] field2259;

    @ObfuscatedName("hx.ae")
    public int[] field2264;

    @ObfuscatedName("hx.au")
    public int[] field2265;

    @ObfuscatedName("hx.ag")
    public int field2263 = -1;

    @ObfuscatedName("hx.at")
    public int[] field2267;

    @ObfuscatedName("hx.af")
    public boolean[] field2268;

    @ObfuscatedName("hx.ai")
    public boolean field2269 = false;

    @ObfuscatedName("hx.aw")
    public int field2270 = 5;

    @ObfuscatedName("hx.aa")
    public int field2275 = -1;

    @ObfuscatedName("hx.ah")
    public int field2272 = -1;

    @ObfuscatedName("hx.ad")
    public int field2262 = 99;

    @ObfuscatedName("hx.bm")
    public boolean field2273 = false;

    @ObfuscatedName("hx.bv")
    public int field2278 = -1;

    @ObfuscatedName("hx.bo")
    public int field2256 = -1;

    @ObfuscatedName("hx.bs")
    public int field2277 = 2;

    @ObfuscatedName("lt.aj(II)Lhx;")
    public static class206 method5217(int arg0) {
        class206 var1 = (class206) field2255.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1271.method5860(12, arg0);
        class206 var3 = new class206();
        if (var2 != null) {
            var3.method3703(new class478(var2));
        }
        var3.method3725();
        field2255.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hx.al(Lsy;B)V")
    public void method3703(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3719(arg0, var2);
        }
    }

    @ObfuscatedName("hx.ac(Lsy;II)V")
    public void method3719(class478 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7905();
            this.field2264 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2264[var4] = arg0.method7905();
            }
            this.field2276 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2276[var5] = arg0.method7905();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2276[var6] += arg0.method7905() << 16;
            }
        } else if (arg1 == 2) {
            this.field2263 = arg0.method7905();
        } else if (arg1 == 3) {
            int var7 = arg0.method7909();
            this.field2267 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2267[var8] = arg0.method7909();
            }
            this.field2267[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2269 = true;
        } else if (arg1 == 5) {
            this.field2270 = arg0.method7909();
        } else if (arg1 == 6) {
            this.field2275 = arg0.method7905();
        } else if (arg1 == 7) {
            this.field2272 = arg0.method7905();
        } else if (arg1 == 8) {
            this.field2262 = arg0.method7909();
            this.field2273 = true;
        } else if (arg1 == 9) {
            this.field2278 = arg0.method7909();
        } else if (arg1 == 10) {
            this.field2256 = arg0.method7909();
        } else if (arg1 == 11) {
            this.field2277 = arg0.method7909();
        } else if (arg1 == 12) {
            int var9 = arg0.method7909();
            this.field2259 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2259[var10] = arg0.method7905();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2259[var11] += arg0.method7905() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method7909();
            this.field2265 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2265[var13] = arg0.method7907();
            }
        } else if (arg1 == 14) {
            this.field2258 = arg0.method7908();
        } else if (arg1 == 15) {
            int var14 = arg0.method7905();
            this.field2274 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7905();
                int var17 = arg0.method7907();
                this.field2274.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2260 = arg0.method7905();
            this.field2261 = arg0.method7905();
        } else if (arg1 == 17) {
            this.field2268 = new boolean[256];
            for (int var18 = 0; var18 < this.field2268.length; var18++) {
                this.field2268[var18] = false;
            }
            int var19 = arg0.method7909();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2268[arg0.method7909()] = true;
            }
        }
    }

    @ObfuscatedName("hx.ab(B)V")
    public void method3725() {
        if (this.field2278 == -1) {
            if (this.field2267 == null && this.field2268 == null) {
                this.field2278 = 0;
            } else {
                this.field2278 = 2;
            }
        }
        if (this.field2256 != -1) {
            return;
        }
        if (this.field2267 == null && this.field2268 == null) {
            this.field2256 = 0;
        } else {
            this.field2256 = 2;
        }
    }

    @ObfuscatedName("hx.an(Lix;II)Lix;")
    public class231 method3710(class231 arg0, int arg1) {
        if (this.method3694()) {
            class135 var7 = method3179(this.field2258);
            if (var7 == null) {
                return arg0.method4239(true);
            } else {
                class231 var8 = arg0.method4239(!var7.method2900());
                var8.method4247(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2276[arg1];
            class227 var4 = method3434(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4239(true);
            } else {
                class231 var6 = arg0.method4239(!var4.method4200(var5));
                var6.method4246(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hx.ao(Lix;IIB)Lix;")
    public class231 method3689(class231 arg0, int arg1, int arg2) {
        if (this.method3694()) {
            class135 var9 = method3179(this.field2258);
            if (var9 == null) {
                return arg0.method4239(true);
            }
            class231 var10 = arg0.method4239(!var9.method2900());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4256();
            } else if (var11 == 2) {
                var10.method4349();
            } else if (var11 == 3) {
                var10.method4254();
            }
            var10.method4247(var9, arg1);
            if (var11 == 1) {
                var10.method4254();
            } else if (var11 == 2) {
                var10.method4349();
            } else if (var11 == 3) {
                var10.method4256();
            }
            return var10;
        }
        int var4 = this.field2276[arg1];
        class227 var5 = method3434(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4239(true);
        }
        class231 var7 = arg0.method4239(!var5.method4200(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4256();
        } else if (var8 == 2) {
            var7.method4349();
        } else if (var8 == 3) {
            var7.method4254();
        }
        var7.method4246(var5, var6);
        if (var8 == 1) {
            var7.method4254();
        } else if (var8 == 2) {
            var7.method4349();
        } else if (var8 == 3) {
            var7.method4256();
        }
        return var7;
    }

    @ObfuscatedName("hx.av(Lix;II)Lix;")
    public class231 method3690(class231 arg0, int arg1) {
        if (this.method3694()) {
            class135 var7 = method3179(this.field2258);
            if (var7 == null) {
                return arg0.method4299(true);
            } else {
                class231 var8 = arg0.method4299(!var7.method2900());
                var8.method4247(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2276[arg1];
            class227 var4 = method3434(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4299(true);
            } else {
                class231 var6 = arg0.method4299(!var4.method4200(var5));
                var6.method4246(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hx.aq(Lix;ILhx;IS)Lix;")
    public class231 method3691(class231 arg0, int arg1, class206 arg2, int arg3) {
        if (field2271 && !this.method3694() && !arg2.method3694()) {
            return this.method3686(arg0, arg1, arg2, arg3);
        }
        class231 var5 = arg0.method4239(false);
        boolean var6 = false;
        class227 var7 = null;
        class222 var8 = null;
        if (this.method3694()) {
            class135 var9 = this.method3696();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3694() && this.field2268 == null) {
                var5.method4247(var9, arg1);
                return var5;
            }
            var8 = var9.field1571;
            var5.method4281(var8, var9, arg1, this.field2268, false, !arg2.method3694());
        } else {
            int var10 = this.field2276[arg1];
            var7 = method3434(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3710(arg0, arg3);
            }
            if (!arg2.method3694() && (this.field2267 == null || arg3 == -1)) {
                var5.method4246(var7, arg1);
                return var5;
            }
            if (this.field2267 == null || arg3 == -1) {
                var5.method4246(var7, arg1);
                return var5;
            }
            var6 = arg2.method3694();
            if (!var6) {
                var5.method4261(var7, arg1, this.field2267, false);
            }
        }
        if (arg2.method3694()) {
            class135 var11 = arg2.method3696();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1571;
            }
            var5.method4281(var8, var11, arg3, this.field2268, true, true);
        } else {
            int var12 = arg2.field2276[arg3];
            class227 var13 = method3434(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3710(arg0, arg1);
            }
            var5.method4261(var13, var14, this.field2267, true);
        }
        if (var6 && var7 != null) {
            var5.method4261(var7, arg1, this.field2267, false);
        }
        var5.method4245();
        return var5;
    }

    @ObfuscatedName("hx.ap(Lix;ILhx;II)Lix;")
    public class231 method3686(class231 arg0, int arg1, class206 arg2, int arg3) {
        int var5 = this.field2276[arg1];
        class227 var6 = method3434(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3710(arg0, arg3);
        }
        int var8 = arg2.field2276[arg3];
        class227 var9 = method3434(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class231 var11 = arg0.method4239(!var6.method4200(var7));
            var11.method4246(var6, var7);
            return var11;
        } else {
            class231 var12 = arg0.method4239(!var6.method4200(var7) & !var9.method4200(var10));
            var12.method4250(var6, var7, var9, var10, this.field2267);
            return var12;
        }
    }

    @ObfuscatedName("hx.ar(Lix;II)Lix;")
    public class231 method3707(class231 arg0, int arg1) {
        if (this.method3694()) {
            return this.method3710(arg0, arg1);
        }
        int var3 = this.field2276[arg1];
        class227 var4 = method3434(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4239(true);
        }
        class227 var6 = null;
        int var7 = 0;
        if (this.field2259 != null && arg1 < this.field2259.length) {
            int var8 = this.field2259[arg1];
            var6 = method3434(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class231 var10 = arg0.method4239(!var4.method4200(var5));
            var10.method4246(var4, var5);
            return var10;
        } else {
            class231 var9 = arg0.method4239(!var4.method4200(var5) & !var6.method4200(var7));
            var9.method4246(var4, var5);
            var9.method4246(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("hx.ak(I)Z")
    public boolean method3694() {
        return this.field2258 >= 0;
    }

    @ObfuscatedName("hx.ax(I)I")
    public int method3695() {
        return this.field2261 - this.field2260;
    }

    @ObfuscatedName("hq.as(II)Liw;")
    public static class227 method3434(int arg0) {
        class227 var1 = (class227) field2251.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class227 var2 = class227.method2822(Statics.field2253, Statics.field2250, arg0, false);
        if (var2 != null) {
            field2251.method4923(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("hx.ay(I)Lfl;")
    public class135 method3696() {
        return this.method3694() ? method3179(this.field2258) : null;
    }

    @ObfuscatedName("ge.am(II)Lfl;")
    public static class135 method3179(int arg0) {
        class135 var1 = (class135) field2257.method4921((long) arg0);
        class135 var2;
        if (var1 == null) {
            class340 var3 = Statics.field2253;
            class340 var4 = Statics.field2250;
            boolean var5 = true;
            byte[] var6 = var3.method5866(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
            class135 var8;
            if (var6 == null) {
                boolean var7 = false;
                var8 = null;
            } else {
                int var9 = (var6[1] & 0xFF) << 8 | var6[2] & 0xFF;
                byte[] var10 = var4.method5866(var9, 0);
                if (var10 == null) {
                    var5 = false;
                }
                if (var5) {
                    if (Statics.field1414 == null) {
                        Statics.field1574 = Runtime.getRuntime().availableProcessors();
                        Statics.field1414 = new ThreadPoolExecutor(0, Statics.field1574, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1574 * 100 + 100), new class182());
                    }
                    try {
                        var8 = new class135(var3, var4, arg0, false);
                    } catch (Exception var28) {
                        var8 = null;
                    }
                } else {
                    var8 = null;
                }
            }
            if (var8 != null) {
                field2257.method4923(var8, (long) arg0);
            }
            var2 = var8;
        } else {
            var2 = var1;
        }
        int var14;
        if (var2 == null) {
            var14 = 2;
        } else {
            var14 = var2.method2901() ? 0 : 1;
        }
        if (var14 != 0) {
            return null;
        }
        class135 var15 = (class135) field2257.method4921((long) arg0);
        class135 var16;
        if (var15 == null) {
            class340 var17 = Statics.field2253;
            class340 var18 = Statics.field2250;
            boolean var19 = true;
            byte[] var20 = var17.method5866(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
            class135 var22;
            if (var20 == null) {
                boolean var21 = false;
                var22 = null;
            } else {
                int var23 = (var20[1] & 0xFF) << 8 | var20[2] & 0xFF;
                byte[] var24 = var18.method5866(var23, 0);
                if (var24 == null) {
                    var19 = false;
                }
                if (var19) {
                    if (Statics.field1414 == null) {
                        Statics.field1574 = Runtime.getRuntime().availableProcessors();
                        Statics.field1414 = new ThreadPoolExecutor(0, Statics.field1574, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1574 * 100 + 100), new class200());
                    }
                    try {
                        var22 = new class135(var17, var18, arg0, false);
                    } catch (Exception var27) {
                        var22 = null;
                    }
                } else {
                    var22 = null;
                }
            }
            if (var22 != null) {
                field2257.method4923(var22, (long) arg0);
            }
            var16 = var22;
        } else {
            var16 = var15;
        }
        return var16;
    }
}
