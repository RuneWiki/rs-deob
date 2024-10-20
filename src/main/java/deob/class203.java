package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gq")
public final class class203 {

    @ObfuscatedName("gq.v")
    public boolean field2266 = false;

    @ObfuscatedName("gq.c")
    public boolean field2267 = false;

    @ObfuscatedName("gq.i")
    public class222 field2279;

    @ObfuscatedName("gq.f")
    public class451 field2269;

    @ObfuscatedName("gq.b")
    public HashMap field2270;

    @ObfuscatedName("gq.n")
    public class202[][] field2271;

    @ObfuscatedName("gq.s")
    public HashMap field2268 = new HashMap();

    @ObfuscatedName("gq.l")
    public class450[] field2273;

    @ObfuscatedName("gq.q")
    public final class316 field2274;

    @ObfuscatedName("gq.o")
    public final class316 field2275;

    @ObfuscatedName("gq.r")
    public final HashMap field2280;

    @ObfuscatedName("gq.p")
    public int field2277;

    @ObfuscatedName("gq.w")
    public int field2278;

    @ObfuscatedName("gq.k")
    public int field2272;

    @ObfuscatedName("gq.d")
    public int field2276;

    @ObfuscatedName("gq.m")
    public int field2281 = 0;

    public class203(class450[] arg0, HashMap arg1, class316 arg2, class316 arg3) {
        this.field2273 = arg0;
        this.field2280 = arg1;
        this.field2274 = arg2;
        this.field2275 = arg3;
    }

    @ObfuscatedName("gq.v(Lln;Ljava/lang/String;ZI)V")
    public void method3821(class316 arg0, String arg1, boolean arg2) {
        if (this.field2267) {
            return;
        }
        this.field2266 = false;
        this.field2267 = true;
        System.nanoTime();
        int var4 = arg0.method5293(class220.field2414.field2416);
        int var5 = arg0.method5312(var4, arg1);
        class438 var6 = new class438(arg0.method5314(class220.field2414.field2416, arg1));
        class438 var7 = new class438(arg0.method5314(class220.field2415.field2416, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2279 = new class222();
        try {
            this.field2279.method3976(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2279.method3690();
        this.field2279.method3625();
        this.field2279.method3635();
        this.field2277 = this.field2279.method3629() * 64;
        this.field2278 = this.field2279.method3631() * 64;
        this.field2272 = (this.field2279.method3630() - this.field2279.method3629() + 1) * 64;
        this.field2276 = (this.field2279.method3671() - this.field2279.method3631() + 1) * 64;
        int var9 = this.field2279.method3630() - this.field2279.method3629() + 1;
        int var10 = this.field2279.method3671() - this.field2279.method3631() + 1;
        System.nanoTime();
        System.nanoTime();
        class202.method3974();
        this.field2271 = new class202[var9][var10];
        Iterator var11 = this.field2279.field2427.iterator();
        while (var11.hasNext()) {
            class196 var12 = (class196) var11.next();
            int var13 = var12.field2336;
            int var14 = var12.field2337;
            int var15 = var13 - this.field2279.method3629();
            int var16 = var14 - this.field2279.method3631();
            this.field2271[var15][var16] = new class202(var13, var14, this.field2279.method3685(), this.field2280);
            this.field2271[var15][var16].method3695(var12, this.field2279.field2426);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2271[var17][var18] == null) {
                    this.field2271[var17][var18] = new class202(this.field2279.method3629() + var17, this.field2279.method3631() + var18, this.field2279.method3685(), this.field2280);
                    this.field2271[var17][var18].method3696(this.field2279.field2428, this.field2279.field2426);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5313(class220.field2419.field2416, arg1)) {
            byte[] var19 = arg0.method5314(class220.field2419.field2416, arg1);
            this.field2269 = class29.method1805(var19);
        }
        System.nanoTime();
        arg0.method5376();
        arg0.method5297();
        this.field2266 = true;
    }

    @ObfuscatedName("gq.c(B)V")
    public final void method3853() {
        this.field2270 = null;
    }

    @ObfuscatedName("gq.i(IIIIIIIII)V")
    public final void method3823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4686;
        int var10 = Statics.field4689;
        int var11 = Statics.field4687;
        int[] var12 = new int[4];
        class447.method7313(var12);
        class211 var13 = this.method3842(arg0, arg1, arg2, arg3);
        float var14 = this.method3831(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2281 = var15;
        if (!this.field2268.containsKey(var15)) {
            class223 var16 = new class223(var15);
            var16.method3985();
            this.field2268.put(var15, var16);
        }
        int var17 = var13.field2361 + var13.field2353 - 1;
        int var18 = var13.field2356 + var13.field2352 - 1;
        for (int var19 = var13.field2353; var19 <= var17; var19++) {
            for (int var20 = var13.field2356; var20 <= var18; var20++) {
                this.field2271[var19][var20].method3738(var15, (class223) this.field2268.get(var15), this.field2273, this.field2274, this.field2275);
            }
        }
        class447.method7248(var9, var10, var11);
        class447.method7253(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2277 + arg0;
        int var23 = this.field2278 + arg1;
        for (int var24 = var13.field2353; var24 < var13.field2361 + var13.field2353; var24++) {
            for (int var25 = var13.field2356; var25 < var13.field2356 + var13.field2352; var25++) {
                this.field2271[var24][var25].method3694((this.field2271[var24][var25].field2255 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2271[var24][var25].field2252 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("gq.f(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method3820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class211 var14 = this.method3842(arg0, arg1, arg2, arg3);
        float var15 = this.method3831(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2277 + arg0;
        int var18 = this.field2278 + arg1;
        for (int var19 = var14.field2353; var19 < var14.field2361 + var14.field2353; var19++) {
            for (int var20 = var14.field2356; var20 < var14.field2356 + var14.field2352; var20++) {
                if (arg12) {
                    this.field2271[var19][var20].method3699();
                }
                this.field2271[var19][var20].method3752((this.field2271[var19][var20].field2255 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2271[var19][var20].field2252 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2353; var21 < var14.field2361 + var14.field2353; var21++) {
            for (int var22 = var14.field2356; var22 < var14.field2356 + var14.field2352; var22++) {
                this.field2271[var21][var22].method3800(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("gq.b(IIIILjava/util/HashSet;IIB)V")
    public void method3825(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2269 == null) {
            return;
        }
        this.field2269.method7403(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2270 == null) {
            this.method3827();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2270.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class219 var12 = (class219) var11.next();
                int var13 = (var12.field2413.field3287 - this.field2277) * arg2 / this.field2272;
                int var14 = arg3 - (var12.field2413.field3286 - this.field2278) * arg3 / this.field2276;
                class447.method7256(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("gq.n(IIIIIIIIIIB)Ljava/util/List;")
    public List method3841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2266) {
            return var11;
        }
        class211 var12 = this.method3842(arg0, arg1, arg2, arg3);
        float var13 = this.method3831(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2277 + arg0;
        int var16 = this.field2278 + arg1;
        for (int var17 = var12.field2353; var17 < var12.field2361 + var12.field2353; var17++) {
            for (int var18 = var12.field2356; var18 < var12.field2356 + var12.field2352; var18++) {
                List var19 = this.field2271[var17][var18].method3724((this.field2271[var17][var18].field2255 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2271[var17][var18].field2252 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("gq.s(IIIII)Lhj;")
    public class211 method3842(int arg0, int arg1, int arg2, int arg3) {
        class211 var5 = new class211(this);
        int var6 = this.field2277 + arg0;
        int var7 = this.field2278 + arg1;
        int var8 = this.field2277 + arg2;
        int var9 = this.field2278 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2361 = var12 - var10 + 1;
        var5.field2352 = var13 - var11 + 1;
        var5.field2353 = var10 - this.field2279.method3629();
        var5.field2356 = var11 - this.field2279.method3631();
        if (var5.field2353 < 0) {
            var5.field2361 += var5.field2353;
            var5.field2353 = 0;
        }
        if (var5.field2353 > this.field2271.length - var5.field2361) {
            var5.field2361 = this.field2271.length - var5.field2353;
        }
        if (var5.field2356 < 0) {
            var5.field2352 += var5.field2356;
            var5.field2356 = 0;
        }
        if (var5.field2356 > this.field2271[0].length - var5.field2352) {
            var5.field2352 = this.field2271[0].length - var5.field2356;
        }
        var5.field2361 = Math.min(var5.field2361, this.field2271.length);
        var5.field2352 = Math.min(var5.field2352, this.field2271[0].length);
        return var5;
    }

    @ObfuscatedName("gq.l(I)Z")
    public boolean method3828() {
        return this.field2266;
    }

    @ObfuscatedName("gq.q(B)Ljava/util/HashMap;")
    public HashMap method3829() {
        this.method3827();
        return this.field2270;
    }

    @ObfuscatedName("gq.o(I)V")
    public void method3827() {
        if (this.field2270 == null) {
            this.field2270 = new HashMap();
        }
        this.field2270.clear();
        for (int var1 = 0; var1 < this.field2271.length; var1++) {
            for (int var2 = 0; var2 < this.field2271[var1].length; var2++) {
                List var3 = this.field2271[var1][var2].method3725();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class219 var5 = (class219) var4.next();
                    if (var5.method3960()) {
                        int var6 = var5.method3567();
                        if (this.field2270.containsKey(var6)) {
                            List var8 = (List) this.field2270.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2270.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gq.r(III)F")
    public float method3831(int arg0, int arg1) {
        float var3 = (float) arg0 / (float) arg1;
        if (var3 > 8.0F) {
            return 8.0F;
        } else if (var3 < 1.0F) {
            return 1.0F;
        } else {
            int var4 = Math.round(var3);
            return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
        }
    }
}
