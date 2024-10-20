package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ov")
public class class392 {

    @ObfuscatedName("ov.j")
    public class302 field4310;

    @ObfuscatedName("ov.w")
    public class302 field4311;

    @ObfuscatedName("ov.n")
    public class302 field4320;

    @ObfuscatedName("ov.r")
    public static final class394 field4313 = class394.field4373;

    @ObfuscatedName("ov.o")
    public static final class394 field4314 = class394.field4374;

    @ObfuscatedName("ov.v")
    public static final class394 field4330 = class394.field4370;

    @ObfuscatedName("ov.d")
    public class327 field4332;

    @ObfuscatedName("ov.h")
    public HashMap field4317;

    @ObfuscatedName("ov.g")
    public class431[] field4353;

    @ObfuscatedName("ov.e")
    public HashMap field4356;

    @ObfuscatedName("ov.a")
    public class218 field4349;

    @ObfuscatedName("ov.u")
    public class218 field4350;

    @ObfuscatedName("ov.k")
    public class218 field4322;

    @ObfuscatedName("ov.f")
    public class220 field4323;

    @ObfuscatedName("ov.l")
    public class391 field4324;

    @ObfuscatedName("ov.q")
    public int field4315;

    @ObfuscatedName("ov.x")
    public int field4326;

    @ObfuscatedName("ov.z")
    public int field4327 = -1;

    @ObfuscatedName("ov.i")
    public int field4328 = -1;

    @ObfuscatedName("ov.y")
    public float field4329;

    @ObfuscatedName("ov.ah")
    public float field4364;

    @ObfuscatedName("ov.ao")
    public int field4331 = -1;

    @ObfuscatedName("ov.ab")
    public int field4340 = -1;

    @ObfuscatedName("ov.an")
    public int field4333 = -1;

    @ObfuscatedName("ov.ax")
    public int field4334 = -1;

    @ObfuscatedName("ov.am")
    public int field4319 = 3;

    @ObfuscatedName("ov.az")
    public int field4316 = 50;

    @ObfuscatedName("ov.au")
    public boolean field4337 = false;

    @ObfuscatedName("ov.av")
    public HashSet field4338 = null;

    @ObfuscatedName("ov.ap")
    public int field4339 = -1;

    @ObfuscatedName("ov.ac")
    public int field4358 = -1;

    @ObfuscatedName("ov.aj")
    public int field4341 = -1;

    @ObfuscatedName("ov.af")
    public int field4336 = -1;

    @ObfuscatedName("ov.ar")
    public int field4343 = -1;

    @ObfuscatedName("ov.ag")
    public int field4344 = -1;

    @ObfuscatedName("ov.al")
    public long field4312;

    @ObfuscatedName("ov.aa")
    public int field4346;

    @ObfuscatedName("ov.as")
    public int field4347;

    @ObfuscatedName("ov.at")
    public boolean field4335 = true;

    @ObfuscatedName("ov.aw")
    public HashSet field4365 = new HashSet();

    @ObfuscatedName("ov.ay")
    public HashSet field4342 = new HashSet();

    @ObfuscatedName("ov.ae")
    public HashSet field4351 = new HashSet();

    @ObfuscatedName("ov.ak")
    public HashSet field4352 = new HashSet();

    @ObfuscatedName("ov.ad")
    public boolean field4348 = false;

    @ObfuscatedName("ov.bp")
    public int field4354 = 0;

    @ObfuscatedName("ov.ba")
    public final int[] field4345 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ov.bq")
    public List field4357;

    @ObfuscatedName("ov.bg")
    public Iterator field4321;

    @ObfuscatedName("ov.br")
    public HashSet field4359 = new HashSet();

    @ObfuscatedName("ov.bi")
    public class277 field4360 = null;

    @ObfuscatedName("ov.bm")
    public boolean field4361 = false;

    @ObfuscatedName("ov.bw")
    public class432 field4362;

    @ObfuscatedName("ov.bl")
    public int field4363;

    @ObfuscatedName("ov.bz")
    public int field4318 = -1;

    @ObfuscatedName("ov.bu")
    public int field4307 = -1;

    @ObfuscatedName("ov.bs")
    public int field4366 = -1;

    @ObfuscatedName("ov.c(Lku;Lku;Lku;Llx;Ljava/util/HashMap;[Lpa;I)V")
    public void method6261(class302 arg0, class302 arg1, class302 arg2, class327 arg3, HashMap arg4, class431[] arg5) {
        this.field4353 = arg5;
        this.field4310 = arg0;
        this.field4311 = arg1;
        this.field4320 = arg2;
        this.field4332 = arg3;
        this.field4317 = new HashMap();
        this.field4317.put(class215.field2578, arg4.get(field4313));
        this.field4317.put(class215.field2576, arg4.get(field4314));
        this.field4317.put(class215.field2577, arg4.get(field4330));
        this.field4324 = new class391(arg0);
        int var7 = this.field4310.method5118(class237.field2769.field2770);
        int[] var8 = this.field4310.method5063(var7);
        this.field4356 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class419 var10 = new class419(this.field4310.method5053(var7, var8[var9]));
            class218 var11 = new class218();
            var11.method4078(var10, var8[var9]);
            this.field4356.put(var11.method4132(), var11);
            if (var11.method4081()) {
                this.field4349 = var11;
            }
        }
        this.method6219(this.field4349);
        this.field4322 = null;
    }

    @ObfuscatedName("ov.b(I)V")
    public void method6247() {
        class219.field2621.method4493(5);
    }

    @ObfuscatedName("ov.p(IIZIIIII)V")
    public void method6383(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4324.method6194()) {
            return;
        }
        this.method6213();
        this.method6268();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4329));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4329));
        List var10 = this.field4323.method4275(this.field4315 - var8 / 2 - 1, this.field4326 - var9 / 2 - 1, var8 / 2 + this.field4315 + 1, var9 / 2 + this.field4326 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class236 var13 = (class236) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class241 var15 = new class241(var13.method4040(), var13.field2759, var13.field2760);
            var14.method2051(new Object[] { var15, arg0, arg1 });
            if (this.field4359.contains(var13)) {
                var14.method2052(17);
            } else {
                var14.method2052(15);
            }
            class64.method4965(var14);
        }
        Iterator var16 = this.field4359.iterator();
        while (var16.hasNext()) {
            class236 var17 = (class236) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class241 var19 = new class241(var17.method4040(), var17.field2759, var17.field2760);
                var18.method2051(new Object[] { var19, arg0, arg1 });
                var18.method2052(16);
                class64.method4965(var18);
            }
        }
        this.field4359 = var11;
    }

    @ObfuscatedName("ov.m(IIZZI)V")
    public void method6407(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class416.method5860();
        this.method6231(arg0, arg1, arg3, var5);
        if (!this.method6211() && arg3 || arg2) {
            if (arg3) {
                this.field4343 = arg0;
                this.field4344 = arg1;
                this.field4341 = this.field4315;
                this.field4336 = this.field4326;
            }
            if (this.field4341 != -1) {
                int var7 = arg0 - this.field4343;
                int var8 = arg1 - this.field4344;
                this.method6402(this.field4341 - (int) ((float) var7 / this.field4364), this.field4336 + (int) ((float) var8 / this.field4364), false);
            }
        } else {
            this.method6395();
        }
        if (arg3) {
            this.field4312 = var5;
            this.field4346 = arg0;
            this.field4347 = arg1;
        }
    }

    @ObfuscatedName("ov.t(IIZJ)V")
    public void method6231(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4350 == null) {
            this.field4360 = null;
            return;
        }
        int var6 = (int) ((float) this.field4315 + ((float) (arg0 - this.field4333) - (float) this.method6340() * this.field4329 / 2.0F) / this.field4329);
        int var7 = (int) ((float) this.field4326 - ((float) (arg1 - this.field4334) - (float) this.method6241() * this.field4329 / 2.0F) / this.field4329);
        this.field4360 = this.field4350.method4085(var6 + this.field4350.method4091() * 64, var7 + this.field4350.method4138() * 64);
        if (this.field4360 == null || !arg2) {
            return;
        }
        boolean var8 = client.field547 >= 2;
        if (var8 && class24.field156[82] && class24.field156[81]) {
            client.method2424(this.field4360.field3188, this.field4360.field3189, this.field4360.field3193, false);
            return;
        }
        boolean var9 = true;
        if (this.field4335) {
            int var10 = arg0 - this.field4346;
            int var11 = arg1 - this.field4347;
            if (arg3 - this.field4312 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class255 var12 = Statics.method3174(class253.field2826, client.field690.field1286);
            var12.field2930.method6717(this.field4360.method4833());
            client.field690.method2328(var12);
            this.field4312 = 0L;
        }
    }

    @ObfuscatedName("ov.s(I)V")
    public void method6213() {
        if (Statics.field1274 != null) {
            this.field4329 = this.field4364;
            return;
        }
        if (this.field4329 < this.field4364) {
            this.field4329 = Math.min(this.field4364, this.field4329 / 30.0F + this.field4329);
        }
        if (this.field4329 > this.field4364) {
            this.field4329 = Math.max(this.field4364, this.field4329 - this.field4329 / 30.0F);
        }
    }

    @ObfuscatedName("ov.j(I)V")
    public void method6268() {
        if (!this.method6211()) {
            return;
        }
        int var1 = this.field4327 - this.field4315;
        int var2 = this.field4328 - this.field4326;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6402(this.field4315 + var1, this.field4326 + var2, true);
        if (this.field4327 == this.field4315 && this.field4328 == this.field4326) {
            this.field4327 = -1;
            this.field4328 = -1;
        }
    }

    @ObfuscatedName("ov.w(IIZI)V")
    public final void method6402(int arg0, int arg1, boolean arg2) {
        this.field4315 = arg0;
        this.field4326 = arg1;
        class416.method5860();
        if (arg2) {
            this.method6395();
        }
    }

    @ObfuscatedName("ov.n(B)V")
    public final void method6395() {
        this.field4344 = -1;
        this.field4343 = -1;
        this.field4336 = -1;
        this.field4341 = -1;
    }

    @ObfuscatedName("ov.r(I)Z")
    public boolean method6211() {
        return this.field4327 != -1 && this.field4328 != -1;
    }

    @ObfuscatedName("ov.o(IIII)Lhr;")
    public class218 method6204(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4356.values().iterator();
        class218 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class218) var4.next();
        } while (!var5.method4104(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ov.v(IIIZB)V")
    public void method6215(int arg0, int arg1, int arg2, boolean arg3) {
        class218 var5 = this.method6204(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4349;
        }
        boolean var6 = false;
        if (this.field4322 != var5 || arg3) {
            this.field4322 = var5;
            this.method6219(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6222(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ov.d(IB)V")
    public void method6311(int arg0) {
        class218 var2 = this.method6232(arg0);
        if (var2 != null) {
            this.method6219(var2);
        }
    }

    @ObfuscatedName("ov.h(B)I")
    public int method6217() {
        return this.field4350 == null ? -1 : this.field4350.method4087();
    }

    @ObfuscatedName("ov.g(I)Lhr;")
    public class218 method6218() {
        return this.field4350;
    }

    @ObfuscatedName("ov.e(Lhr;B)V")
    public void method6219(class218 arg0) {
        if (this.field4350 == null || this.field4350 != arg0) {
            this.method6266(arg0);
            this.method6222(-1, -1, -1);
        }
    }

    @ObfuscatedName("ov.a(Lhr;B)V")
    public void method6266(class218 arg0) {
        this.field4350 = arg0;
        this.field4323 = new class220(this.field4353, this.field4317, this.field4311, this.field4320);
        this.field4324.method6197(this.field4350.method4132());
    }

    @ObfuscatedName("ov.u(Lhr;Lju;Lju;ZI)V")
    public void method6221(class218 arg0, class277 arg1, class277 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4350 == null || this.field4350 != arg0) {
            this.method6266(arg0);
        }
        if (!arg3 && this.field4350.method4104(arg1.field3193, arg1.field3188, arg1.field3189)) {
            this.method6222(arg1.field3193, arg1.field3188, arg1.field3189);
        } else {
            this.method6222(arg2.field3193, arg2.field3188, arg2.field3189);
        }
    }

    @ObfuscatedName("ov.k(IIII)V")
    public void method6222(int arg0, int arg1, int arg2) {
        if (this.field4350 == null) {
            return;
        }
        int[] var4 = this.field4350.method4086(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4350.method4086(this.field4350.method4096(), this.field4350.method4095(), this.field4350.method4105());
        }
        this.method6402(var4[0] - this.field4350.method4091() * 64, var4[1] - this.field4350.method4138() * 64, true);
        this.field4327 = -1;
        this.field4328 = -1;
        this.field4329 = this.method6372(this.field4350.method4127());
        this.field4364 = this.field4329;
        this.field4357 = null;
        this.field4321 = null;
        this.field4323.method4300();
    }

    @ObfuscatedName("ov.f(IIIIIB)V")
    public void method6293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class428.method6937(var6);
        class428.method6935(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class428.method6943(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4324.method6195();
        if (var7 < 100) {
            this.method6228(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4323.method4298()) {
            this.field4323.method4270(this.field4310, this.field4350.method4132(), client.field601);
            if (!this.field4323.method4298()) {
                return;
            }
        }
        if (this.field4338 != null) {
            this.field4358++;
            if (this.field4358 % this.field4316 == 0) {
                this.field4358 = 0;
                this.field4339++;
            }
            if (this.field4339 >= this.field4319 && !this.field4337) {
                this.field4338 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4329));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4329));
        this.field4323.method4276(this.field4315 - var8 / 2, this.field4326 - var9 / 2, var8 / 2 + this.field4315, var9 / 2 + this.field4326, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4348) {
            boolean var10 = false;
            if (arg4 - this.field4354 > 100) {
                this.field4354 = arg4;
                var10 = true;
            }
            this.field4323.method4277(this.field4315 - var8 / 2, this.field4326 - var9 / 2, var8 / 2 + this.field4315, var9 / 2 + this.field4326, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4352, this.field4338, this.field4358, this.field4316, var10);
        }
        this.method6351(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field547 >= 2;
        if (var11 && this.field4361 && this.field4360 != null) {
            this.field4332.method5462("Coord: " + this.field4360, class428.field4545 + 10, class428.field4541 + 20, 16776960, -1);
        }
        this.field4331 = var8;
        this.field4340 = var9;
        this.field4333 = arg0;
        this.field4334 = arg1;
        class428.method6938(var6);
    }

    @ObfuscatedName("ov.l(IIIIIIB)Z")
    public boolean method6224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4362 == null) {
            return true;
        } else if (this.field4362.field4566 != arg0 || this.field4362.field4567 != arg1) {
            return true;
        } else if (this.field4323.field2645 != this.field4363) {
            return true;
        } else if (client.field560 != this.field4366) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ov.q(IIIIIII)V")
    public void method6351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1274 == null) {
            return;
        }
        int var7 = 512 / (this.field4323.field2645 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6237() - arg4 / 2 - var7;
        int var14 = this.method6388() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4323.field2645 * (var7 + var13 - this.field4318);
        int var16 = arg1 - this.field4323.field2645 * (var7 - (var14 - this.field4307));
        if (this.method6224(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4362 != null && this.field4362.field4566 == var11 && this.field4362.field4567 == var12) {
                Arrays.fill(this.field4362.field4571, 0);
            } else {
                this.field4362 = new class432(var11, var12);
            }
            this.field4318 = this.method6237() - arg4 / 2 - var7;
            this.field4307 = this.method6388() - arg5 / 2 - var7;
            this.field4363 = this.field4323.field2645;
            Statics.field1274.method5252(this.field4318, this.field4307, this.field4362, (float) this.field4363 / var10);
            this.field4366 = client.field560;
            var15 = arg0 - this.field4323.field2645 * (var7 + var13 - this.field4318);
            var16 = arg1 - this.field4323.field2645 * (var7 - (var14 - this.field4307));
        }
        class428.method6942(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4362.method7097(var15, var16, 192);
        } else {
            this.field4362.method7064(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ov.x(IIIII)V")
    public void method6226(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4324.method6194()) {
            return;
        }
        if (!this.field4323.method4298()) {
            this.field4323.method4270(this.field4310, this.field4350.method4132(), client.field601);
            if (!this.field4323.method4298()) {
                return;
            }
        }
        this.field4323.method4274(arg0, arg1, arg2, arg3, this.field4338, this.field4358, this.field4316);
    }

    @ObfuscatedName("ov.z(II)V")
    public void method6227(int arg0) {
        this.field4364 = this.method6372(arg0);
    }

    @ObfuscatedName("ov.i(IIIIIS)V")
    public void method6228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class428.method6943(arg0, arg1, arg2, arg3, -16777216);
        class428.method6994(var7 - 152, var8, 304, 34, -65536);
        class428.method6943(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4332.method5454(class295.field3787, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ov.y(II)F")
    public float method6372(int arg0) {
        if (arg0 == 25) {
            return 1.0F;
        } else if (arg0 == 37) {
            return 1.5F;
        } else if (arg0 == 50) {
            return 2.0F;
        } else if (arg0 == 75) {
            return 3.0F;
        } else if (arg0 == 100) {
            return 4.0F;
        } else {
            return 8.0F;
        }
    }

    @ObfuscatedName("ov.ah(I)I")
    public int method6230() {
        if ((double) this.field4364 == 1.0D) {
            return 25;
        } else if ((double) this.field4364 == 1.5D) {
            return 37;
        } else if ((double) this.field4364 == 2.0D) {
            return 50;
        } else if ((double) this.field4364 == 3.0D) {
            return 75;
        } else if ((double) this.field4364 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ov.ao(B)V")
    public void method6203() {
        this.field4324.method6193();
    }

    @ObfuscatedName("ov.ab(I)Z")
    public boolean method6327() {
        return this.field4324.method6194();
    }

    @ObfuscatedName("ov.an(II)Lhr;")
    public class218 method6232(int arg0) {
        Iterator var2 = this.field4356.values().iterator();
        class218 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class218) var2.next();
        } while (var3.method4087() != arg0);
        return var3;
    }

    @ObfuscatedName("ov.ax(III)V")
    public void method6233(int arg0, int arg1) {
        if (this.field4350 != null && this.field4350.method4080(arg0, arg1)) {
            this.field4327 = arg0 - this.field4350.method4091() * 64;
            this.field4328 = arg1 - this.field4350.method4138() * 64;
        }
    }

    @ObfuscatedName("ov.am(IIB)V")
    public void method6234(int arg0, int arg1) {
        if (this.field4350 != null) {
            this.method6402(arg0 - this.field4350.method4091() * 64, arg1 - this.field4350.method4138() * 64, true);
            this.field4327 = -1;
            this.field4328 = -1;
        }
    }

    @ObfuscatedName("ov.az(IIIB)V")
    public void method6235(int arg0, int arg1, int arg2) {
        if (this.field4350 != null) {
            int[] var4 = this.field4350.method4086(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6233(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ov.au(IIIB)V")
    public void method6236(int arg0, int arg1, int arg2) {
        if (this.field4350 != null) {
            int[] var4 = this.field4350.method4086(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6234(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ov.av(I)I")
    public int method6237() {
        return this.field4350 == null ? -1 : this.field4315 + this.field4350.method4091() * 64;
    }

    @ObfuscatedName("ov.ap(I)I")
    public int method6388() {
        return this.field4350 == null ? -1 : this.field4326 + this.field4350.method4138() * 64;
    }

    @ObfuscatedName("ov.ac(I)Lju;")
    public class277 method6209() {
        return this.field4350 == null ? null : this.field4350.method4085(this.method6237(), this.method6388());
    }

    @ObfuscatedName("ov.aj(I)I")
    public int method6340() {
        return this.field4331;
    }

    @ObfuscatedName("ov.af(B)I")
    public int method6241() {
        return this.field4340;
    }

    @ObfuscatedName("ov.ar(IB)V")
    public void method6242(int arg0) {
        if (arg0 >= 1) {
            this.field4319 = arg0;
        }
    }

    @ObfuscatedName("ov.ag(I)V")
    public void method6243() {
        this.field4319 = 3;
    }

    @ObfuscatedName("ov.al(II)V")
    public void method6244(int arg0) {
        if (arg0 >= 1) {
            this.field4316 = arg0;
        }
    }

    @ObfuscatedName("ov.aa(I)V")
    public void method6208() {
        this.field4316 = 50;
    }

    @ObfuscatedName("ov.as(ZI)V")
    public void method6281(boolean arg0) {
        this.field4337 = arg0;
    }

    @ObfuscatedName("ov.at(II)V")
    public void method6394(int arg0) {
        this.field4338 = new HashSet();
        this.field4338.add(arg0);
        this.field4339 = 0;
        this.field4358 = 0;
    }

    @ObfuscatedName("ov.ai(II)V")
    public void method6216(int arg0) {
        this.field4338 = new HashSet();
        this.field4339 = 0;
        this.field4358 = 0;
        for (int var2 = 0; var2 < Statics.field4441; var2++) {
            if (class164.method2044(var2) != null && class164.method2044(var2).field1772 == arg0) {
                this.field4338.add(class164.method2044(var2).field1753);
            }
        }
    }

    @ObfuscatedName("ov.aq(B)V")
    public void method6248() {
        this.field4338 = null;
    }

    @ObfuscatedName("ov.aw(ZB)V")
    public void method6249(boolean arg0) {
        this.field4348 = !arg0;
    }

    @ObfuscatedName("ov.ay(IZI)V")
    public void method6250(int arg0, boolean arg1) {
        if (arg1) {
            this.field4365.remove(arg0);
        } else {
            this.field4365.add(arg0);
        }
        this.method6255();
    }

    @ObfuscatedName("ov.ae(IZB)V")
    public void method6400(int arg0, boolean arg1) {
        if (arg1) {
            this.field4342.remove(arg0);
        } else {
            this.field4342.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field4441; var3++) {
            if (class164.method2044(var3) != null && class164.method2044(var3).field1772 == arg0) {
                int var4 = class164.method2044(var3).field1753;
                if (arg1) {
                    this.field4351.remove(var4);
                } else {
                    this.field4351.add(var4);
                }
            }
        }
        this.method6255();
    }

    @ObfuscatedName("ov.ak(S)Z")
    public boolean method6252() {
        return !this.field4348;
    }

    @ObfuscatedName("ov.ad(IB)Z")
    public boolean method6253(int arg0) {
        return !this.field4365.contains(arg0);
    }

    @ObfuscatedName("ov.bp(II)Z")
    public boolean method6254(int arg0) {
        return !this.field4342.contains(arg0);
    }

    @ObfuscatedName("ov.bd(I)V")
    public void method6255() {
        this.field4352.clear();
        this.field4352.addAll(this.field4365);
        this.field4352.addAll(this.field4351);
    }

    @ObfuscatedName("ov.ba(IIIIIIB)V")
    public void method6207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4324.method6194()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4329));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4329));
        List var9 = this.field4323.method4275(this.field4315 - var7 / 2 - 1, this.field4326 - var8 / 2 - 1, var7 / 2 + this.field4315 + 1, var8 / 2 + this.field4326 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class236 var11 = (class236) var10.next();
            class164 var12 = class164.method2044(var11.method4040());
            var13 = false;
            for (int var14 = this.field4345.length - 1; var14 >= 0; var14--) {
                if (var12.field1758[var14] != null) {
                    client.method118(var12.field1758[var14], var12.field1773, this.field4345[var14], var11.method4040(), var11.field2759.method4833(), var11.field2760.method4833());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ov.bq(ILju;I)Lju;")
    public class277 method6333(int arg0, class277 arg1) {
        if (!this.field4324.method6194()) {
            return null;
        } else if (!this.field4323.method4298()) {
            return null;
        } else if (this.field4350.method4080(arg1.field3188, arg1.field3189)) {
            HashMap var3 = this.field4323.method4278();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class236 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class236 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2760;
                    }
                    var8 = (class236) var7.next();
                    int var9 = var8.field2760.field3188 - arg1.field3188;
                    int var10 = var8.field2760.field3189 - arg1.field3189;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2760;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ov.bg(IILju;Lju;I)V")
    public void method6258(int arg0, int arg1, class277 arg2, class277 arg3) {
        class81 var5 = new class81();
        class241 var6 = new class241(arg1, arg2, arg3);
        var5.method2051(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2052(10);
                break;
            case 1009:
                var5.method2052(11);
                break;
            case 1010:
                var5.method2052(12);
                break;
            case 1011:
                var5.method2052(13);
                break;
            case 1012:
                var5.method2052(14);
        }
        class64.method4965(var5);
    }

    @ObfuscatedName("ov.br(I)Lij;")
    public class236 method6280() {
        if (!this.field4324.method6194()) {
            return null;
        } else if (this.field4323.method4298()) {
            HashMap var1 = this.field4323.method4278();
            this.field4357 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4357.addAll(var3);
            }
            this.field4321 = this.field4357.iterator();
            return this.method6260();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ov.bi(I)Lij;")
    public class236 method6260() {
        if (this.field4321 == null) {
            return null;
        }
        class236 var1;
        do {
            if (!this.field4321.hasNext()) {
                return null;
            }
            var1 = (class236) this.field4321.next();
        } while (var1.method4040() == -1);
        return var1;
    }
}
