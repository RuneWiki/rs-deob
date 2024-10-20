package deob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("if")
public class class223 extends class484 {

    @ObfuscatedName("if.ac")
    public static boolean field2325 = false;

    @ObfuscatedName("if.ab")
    public static class302 field2319 = new class302(64);

    @ObfuscatedName("if.am")
    public static class302 field2333 = new class302(100);

    @ObfuscatedName("if.av")
    public static class302 field2321 = new class302(100);

    @ObfuscatedName("if.ag")
    public int field2322 = -1;

    @ObfuscatedName("if.aa")
    public Map field2323;

    @ObfuscatedName("if.ap")
    public int field2324 = 0;

    @ObfuscatedName("if.ay")
    public int field2336 = 0;

    @ObfuscatedName("if.as")
    public int[] field2326;

    @ObfuscatedName("if.aj")
    public int[] field2327;

    @ObfuscatedName("if.an")
    public int[] field2313;

    @ObfuscatedName("if.au")
    public int[] field2329;

    @ObfuscatedName("if.ai")
    public int field2330 = -1;

    @ObfuscatedName("if.ae")
    public int[] field2331;

    @ObfuscatedName("if.aw")
    public boolean[] field2332;

    @ObfuscatedName("if.aq")
    public boolean field2339 = false;

    @ObfuscatedName("if.az")
    public int field2334 = 5;

    @ObfuscatedName("if.at")
    public int field2335 = -1;

    @ObfuscatedName("if.af")
    public int field2337 = -1;

    @ObfuscatedName("if.ad")
    public int field2342 = 99;

    @ObfuscatedName("if.bn")
    public boolean field2320 = false;

    @ObfuscatedName("if.bk")
    public int field2328 = -1;

    @ObfuscatedName("if.by")
    public int field2340 = -1;

    @ObfuscatedName("if.bd")
    public int field2341 = 2;

    @ObfuscatedName("fi.ac(Lom;Lom;Lom;I)V")
    public static void method2926(class374 arg0, class374 arg1, class374 arg2) {
        Statics.field3108 = arg0;
        Statics.field2316 = arg1;
        Statics.field2318 = arg2;
    }

    @ObfuscatedName("bp.al(II)Lif;")
    public static class223 method687(int arg0) {
        class223 var1 = (class223) field2319.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3108.method6342(12, arg0);
        class223 var3 = new class223();
        if (var2 != null) {
            var3.method3842(new class530(var2));
        }
        var3.method3889();
        field2319.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.ak(Lul;B)V")
    public void method3842(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3843(arg0, var2);
        }
    }

    @ObfuscatedName("if.ax(Lul;II)V")
    public void method3843(class530 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8598();
            this.field2313 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2313[var4] = arg0.method8598();
            }
            this.field2326 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2326[var5] = arg0.method8598();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2326[var6] += arg0.method8598() << 16;
            }
        } else if (arg1 == 2) {
            this.field2330 = arg0.method8598();
        } else if (arg1 == 3) {
            int var7 = arg0.method8365();
            this.field2331 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2331[var8] = arg0.method8365();
            }
            this.field2331[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2339 = true;
        } else if (arg1 == 5) {
            this.field2334 = arg0.method8365();
        } else if (arg1 == 6) {
            this.field2335 = arg0.method8598();
        } else if (arg1 == 7) {
            this.field2337 = arg0.method8598();
        } else if (arg1 == 8) {
            this.field2342 = arg0.method8365();
            this.field2320 = true;
        } else if (arg1 == 9) {
            this.field2328 = arg0.method8365();
        } else if (arg1 == 10) {
            this.field2340 = arg0.method8365();
        } else if (arg1 == 11) {
            this.field2341 = arg0.method8365();
        } else if (arg1 == 12) {
            int var9 = arg0.method8365();
            this.field2327 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2327[var10] = arg0.method8598();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2327[var11] += arg0.method8598() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8365();
            this.field2329 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2329[var13] = arg0.method8445();
            }
        } else if (arg1 == 14) {
            this.field2322 = arg0.method8371();
        } else if (arg1 == 15) {
            int var14 = arg0.method8598();
            this.field2323 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8598();
                int var17 = arg0.method8445();
                this.field2323.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2324 = arg0.method8598();
            this.field2336 = arg0.method8598();
        } else if (arg1 == 17) {
            this.field2332 = new boolean[256];
            for (int var18 = 0; var18 < this.field2332.length; var18++) {
                this.field2332[var18] = false;
            }
            int var19 = arg0.method8365();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2332[arg0.method8365()] = true;
            }
        }
    }

    @ObfuscatedName("if.ao(S)V")
    public void method3889() {
        if (this.field2328 == -1) {
            if (this.field2331 == null && this.field2332 == null) {
                this.field2328 = 0;
            } else {
                this.field2328 = 2;
            }
        }
        if (this.field2340 != -1) {
            return;
        }
        if (this.field2331 == null && this.field2332 == null) {
            this.field2340 = 0;
        } else {
            this.field2340 = 2;
        }
    }

    @ObfuscatedName("if.ah(Ljn;II)Ljn;")
    public class254 method3845(class254 arg0, int arg1) {
        if (this.method3851()) {
            class140 var7 = method3593(this.field2322);
            if (var7 == null) {
                return arg0.method4534(true);
            } else {
                class254 var8 = arg0.method4534(!var7.method2935());
                var8.method4548(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2326[arg1];
            class249 var4 = method173(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4534(true);
            } else {
                class254 var6 = arg0.method4534(!var4.method4480(var5));
                var6.method4604(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("if.ar(Ljn;III)Ljn;")
    public class254 method3846(class254 arg0, int arg1, int arg2) {
        if (this.method3851()) {
            class140 var9 = method3593(this.field2322);
            if (var9 == null) {
                return arg0.method4534(true);
            }
            class254 var10 = arg0.method4534(!var9.method2935());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4573();
            } else if (var11 == 2) {
                var10.method4555();
            } else if (var11 == 3) {
                var10.method4636();
            }
            var10.method4548(var9, arg1);
            if (var11 == 1) {
                var10.method4636();
            } else if (var11 == 2) {
                var10.method4555();
            } else if (var11 == 3) {
                var10.method4573();
            }
            return var10;
        }
        int var4 = this.field2326[arg1];
        class249 var5 = method173(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4534(true);
        }
        class254 var7 = arg0.method4534(!var5.method4480(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4573();
        } else if (var8 == 2) {
            var7.method4555();
        } else if (var8 == 3) {
            var7.method4636();
        }
        var7.method4604(var5, var6);
        if (var8 == 1) {
            var7.method4636();
        } else if (var8 == 2) {
            var7.method4555();
        } else if (var8 == 3) {
            var7.method4573();
        }
        return var7;
    }

    @ObfuscatedName("if.ab(Ljn;IB)Ljn;")
    public class254 method3847(class254 arg0, int arg1) {
        if (this.method3851()) {
            class140 var7 = method3593(this.field2322);
            if (var7 == null) {
                return arg0.method4540(true);
            } else {
                class254 var8 = arg0.method4540(!var7.method2935());
                var8.method4548(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2326[arg1];
            class249 var4 = method173(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4540(true);
            } else {
                class254 var6 = arg0.method4540(!var4.method4480(var5));
                var6.method4604(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("if.am(Ljn;ILif;II)Ljn;")
    public class254 method3841(class254 arg0, int arg1, class223 arg2, int arg3) {
        if (field2325 && !this.method3851() && !arg2.method3851()) {
            return this.method3890(arg0, arg1, arg2, arg3);
        }
        class254 var5 = arg0.method4534(false);
        boolean var6 = false;
        class249 var7 = null;
        class244 var8 = null;
        if (this.method3851()) {
            class140 var9 = this.method3853();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3851() && this.field2332 == null) {
                var5.method4548(var9, arg1);
                return var5;
            }
            var8 = var9.field1607;
            var5.method4551(var8, var9, arg1, this.field2332, false, !arg2.method3851());
        } else {
            int var10 = this.field2326[arg1];
            var7 = method173(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3845(arg0, arg3);
            }
            if (!arg2.method3851() && (this.field2331 == null || arg3 == -1)) {
                var5.method4604(var7, arg1);
                return var5;
            }
            if (this.field2331 == null || arg3 == -1) {
                var5.method4604(var7, arg1);
                return var5;
            }
            var6 = arg2.method3851();
            if (!var6) {
                var5.method4552(var7, arg1, this.field2331, false);
            }
        }
        if (arg2.method3851()) {
            class140 var11 = arg2.method3853();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1607;
            }
            var5.method4551(var8, var11, arg3, this.field2332, true, true);
        } else {
            int var12 = arg2.field2326[arg3];
            class249 var13 = method173(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3845(arg0, arg1);
            }
            var5.method4552(var13, var14, this.field2331, true);
        }
        if (var6 && var7 != null) {
            var5.method4552(var7, arg1, this.field2331, false);
        }
        var5.method4546();
        return var5;
    }

    @ObfuscatedName("if.av(Ljn;ILif;II)Ljn;")
    public class254 method3890(class254 arg0, int arg1, class223 arg2, int arg3) {
        int var5 = this.field2326[arg1];
        class249 var6 = method173(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3845(arg0, arg3);
        }
        int var8 = arg2.field2326[arg3];
        class249 var9 = method173(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class254 var11 = arg0.method4534(!var6.method4480(var7));
            var11.method4604(var6, var7);
            return var11;
        } else {
            class254 var12 = arg0.method4534(!var6.method4480(var7) & !var9.method4480(var10));
            var12.method4547(var6, var7, var9, var10, this.field2331);
            return var12;
        }
    }

    @ObfuscatedName("if.ag(Ljn;IS)Ljn;")
    public class254 method3850(class254 arg0, int arg1) {
        if (this.method3851()) {
            return this.method3845(arg0, arg1);
        }
        int var3 = this.field2326[arg1];
        class249 var4 = method173(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4534(true);
        }
        class249 var6 = null;
        int var7 = 0;
        if (this.field2327 != null && arg1 < this.field2327.length) {
            int var8 = this.field2327[arg1];
            var6 = method173(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class254 var10 = arg0.method4534(!var4.method4480(var5));
            var10.method4604(var4, var5);
            return var10;
        } else {
            class254 var9 = arg0.method4534(!var4.method4480(var5) & !var6.method4480(var7));
            var9.method4604(var4, var5);
            var9.method4604(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("if.aa(I)Z")
    public boolean method3851() {
        return this.field2322 >= 0;
    }

    @ObfuscatedName("if.ap(I)I")
    public int method3860() {
        return this.field2336 - this.field2324;
    }

    @ObfuscatedName("as.ay(II)Lja;")
    public static class249 method173(int arg0) {
        class249 var1 = (class249) field2333.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class249 var2 = class249.method3108(Statics.field2316, Statics.field2318, arg0, false);
        if (var2 != null) {
            field2333.method5289(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("if.as(I)Lfk;")
    public class140 method3853() {
        return this.method3851() ? method3593(this.field2322) : null;
    }

    @ObfuscatedName("im.aj(IB)Lfk;")
    public static class140 method3593(int arg0) {
        class140 var1 = (class140) field2321.method5286((long) arg0);
        class140 var2;
        if (var1 == null) {
            class374 var3 = Statics.field2316;
            class374 var4 = Statics.field2318;
            boolean var5 = true;
            byte[] var6 = var3.method6312(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
            class140 var8;
            if (var6 == null) {
                boolean var7 = false;
                var8 = null;
            } else {
                int var9 = (var6[1] & 0xFF) << 8 | var6[2] & 0xFF;
                byte[] var10 = var4.method6312(var9, 0);
                if (var10 == null) {
                    var5 = false;
                }
                if (var5) {
                    if (Statics.field334 == null) {
                        Statics.field3511 = Runtime.getRuntime().availableProcessors();
                        Statics.field334 = new ThreadPoolExecutor(0, Statics.field3511, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field3511 * 100 + 100), new class187());
                    }
                    try {
                        var8 = new class140(var3, var4, arg0, false);
                    } catch (Exception var28) {
                        var8 = null;
                    }
                } else {
                    var8 = null;
                }
            }
            if (var8 != null) {
                field2321.method5289(var8, (long) arg0);
            }
            var2 = var8;
        } else {
            var2 = var1;
        }
        int var14;
        if (var2 == null) {
            var14 = 2;
        } else {
            var14 = var2.method2938() ? 0 : 1;
        }
        if (var14 != 0) {
            return null;
        }
        class140 var15 = (class140) field2321.method5286((long) arg0);
        class140 var16;
        if (var15 == null) {
            class374 var17 = Statics.field2316;
            class374 var18 = Statics.field2318;
            boolean var19 = true;
            byte[] var20 = var17.method6312(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
            class140 var22;
            if (var20 == null) {
                boolean var21 = false;
                var22 = null;
            } else {
                int var23 = (var20[1] & 0xFF) << 8 | var20[2] & 0xFF;
                byte[] var24 = var18.method6312(var23, 0);
                if (var24 == null) {
                    var19 = false;
                }
                if (var19) {
                    if (Statics.field334 == null) {
                        Statics.field3511 = Runtime.getRuntime().availableProcessors();
                        Statics.field334 = new ThreadPoolExecutor(0, Statics.field3511, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field3511 * 100 + 100), new class217());
                    }
                    try {
                        var22 = new class140(var17, var18, arg0, false);
                    } catch (Exception var27) {
                        var22 = null;
                    }
                } else {
                    var22 = null;
                }
            }
            if (var22 != null) {
                field2321.method5289(var22, (long) arg0);
            }
            var16 = var22;
        } else {
            var16 = var15;
        }
        return var16;
    }
}
