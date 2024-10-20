package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("or")
public class class397 {

    @ObfuscatedName("or.i")
    public class307 field4357;

    @ObfuscatedName("or.w")
    public class307 field4411;

    @ObfuscatedName("or.v")
    public class307 field4359;

    @ObfuscatedName("or.a")
    public static final class399 field4351 = class399.field4421;

    @ObfuscatedName("or.y")
    public static final class399 field4361 = class399.field4418;

    @ObfuscatedName("or.u")
    public static final class399 field4358 = class399.field4422;

    @ObfuscatedName("or.h")
    public class332 field4388;

    @ObfuscatedName("or.q")
    public HashMap field4364;

    @ObfuscatedName("or.x")
    public class433[] field4360;

    @ObfuscatedName("or.p")
    public HashMap field4369;

    @ObfuscatedName("or.n")
    public class218 field4367;

    @ObfuscatedName("or.m")
    public class218 field4381;

    @ObfuscatedName("or.d")
    public class218 field4371;

    @ObfuscatedName("or.j")
    public class220 field4370;

    @ObfuscatedName("or.f")
    public class396 field4383;

    @ObfuscatedName("or.g")
    public int field4372;

    @ObfuscatedName("or.t")
    public int field4402;

    @ObfuscatedName("or.k")
    public int field4378 = -1;

    @ObfuscatedName("or.b")
    public int field4375 = -1;

    @ObfuscatedName("or.z")
    public float field4362;

    @ObfuscatedName("or.ap")
    public float field4377;

    @ObfuscatedName("or.af")
    public int field4353 = -1;

    @ObfuscatedName("or.ak")
    public int field4363 = -1;

    @ObfuscatedName("or.av")
    public int field4376 = -1;

    @ObfuscatedName("or.ar")
    public int field4374 = -1;

    @ObfuscatedName("or.al")
    public int field4382 = 3;

    @ObfuscatedName("or.aa")
    public int field4401 = 50;

    @ObfuscatedName("or.ao")
    public boolean field4384 = false;

    @ObfuscatedName("or.aq")
    public HashSet field4385 = null;

    @ObfuscatedName("or.ay")
    public int field4386 = -1;

    @ObfuscatedName("or.ac")
    public int field4387 = -1;

    @ObfuscatedName("or.ab")
    public int field4373 = -1;

    @ObfuscatedName("or.as")
    public int field4389 = -1;

    @ObfuscatedName("or.ag")
    public int field4390 = -1;

    @ObfuscatedName("or.az")
    public int field4391 = -1;

    @ObfuscatedName("or.ad")
    public long field4392;

    @ObfuscatedName("or.au")
    public int field4393;

    @ObfuscatedName("or.at")
    public int field4394;

    @ObfuscatedName("or.ae")
    public boolean field4368 = true;

    @ObfuscatedName("or.aj")
    public HashSet field4396 = new HashSet();

    @ObfuscatedName("or.ax")
    public HashSet field4379 = new HashSet();

    @ObfuscatedName("or.ah")
    public HashSet field4398 = new HashSet();

    @ObfuscatedName("or.ai")
    public HashSet field4399 = new HashSet();

    @ObfuscatedName("or.am")
    public boolean field4400 = false;

    @ObfuscatedName("or.be")
    public int field4397 = 0;

    @ObfuscatedName("or.bn")
    public final int[] field4365 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("or.bz")
    public List field4403;

    @ObfuscatedName("or.bx")
    public Iterator field4404;

    @ObfuscatedName("or.bd")
    public HashSet field4405 = new HashSet();

    @ObfuscatedName("or.bg")
    public class282 field4406 = null;

    @ObfuscatedName("or.bm")
    public boolean field4407 = false;

    @ObfuscatedName("or.bi")
    public class434 field4408;

    @ObfuscatedName("or.bw")
    public int field4409;

    @ObfuscatedName("or.bu")
    public int field4410 = -1;

    @ObfuscatedName("or.bs")
    public int field4380 = -1;

    @ObfuscatedName("or.bb")
    public int field4412 = -1;

    @ObfuscatedName("or.c(Lkq;Lkq;Lkq;Llv;Ljava/util/HashMap;[Lpg;B)V")
    public void method6214(class307 arg0, class307 arg1, class307 arg2, class332 arg3, HashMap arg4, class433[] arg5) {
        this.field4360 = arg5;
        this.field4357 = arg0;
        this.field4411 = arg1;
        this.field4359 = arg2;
        this.field4388 = arg3;
        this.field4364 = new HashMap();
        this.field4364.put(class215.field2601, arg4.get(field4351));
        this.field4364.put(class215.field2602, arg4.get(field4361));
        this.field4364.put(class215.field2605, arg4.get(field4358));
        this.field4383 = new class396(arg0);
        int var7 = this.field4357.method5046(class237.field2794.field2795);
        int[] var8 = this.field4357.method5084(var7);
        this.field4369 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class421 var10 = new class421(this.field4357.method5066(var7, var8[var9]));
            class218 var11 = new class218();
            var11.method4027(var10, var8[var9]);
            this.field4369.put(var11.method4037(), var11);
            if (var11.method4088()) {
                this.field4367 = var11;
            }
        }
        this.method6229(this.field4367);
        this.field4371 = null;
    }

    @ObfuscatedName("or.l(I)V")
    public void method6215() {
        class219.method3941();
    }

    @ObfuscatedName("or.s(IIZIIIIB)V")
    public void method6216(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4383.method6198()) {
            return;
        }
        this.method6219();
        this.method6220();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4362));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4362));
        List var10 = this.field4370.method4238(this.field4372 - var8 / 2 - 1, this.field4402 - var9 / 2 - 1, var8 / 2 + this.field4372 + 1, var9 / 2 + this.field4402 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class236 var13 = (class236) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class241 var15 = new class241(var13.method3980(), var13.field2786, var13.field2788);
            var14.method1988(new Object[] { var15, arg0, arg1 });
            if (this.field4405.contains(var13)) {
                var14.method1994(17);
            } else {
                var14.method1994(15);
            }
            class64.method2170(var14);
        }
        Iterator var16 = this.field4405.iterator();
        while (var16.hasNext()) {
            class236 var17 = (class236) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class241 var19 = new class241(var17.method3980(), var17.field2786, var17.field2788);
                var18.method1988(new Object[] { var19, arg0, arg1 });
                var18.method1994(16);
                class64.method2170(var18);
            }
        }
        this.field4405 = var11;
    }

    @ObfuscatedName("or.e(IIZZI)V")
    public void method6217(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class262.method4787();
        this.method6366(arg0, arg1, arg3, var5);
        if (!this.method6260() && arg3 || arg2) {
            if (arg3) {
                this.field4390 = arg0;
                this.field4391 = arg1;
                this.field4373 = this.field4372;
                this.field4389 = this.field4402;
            }
            if (this.field4373 != -1) {
                int var7 = arg0 - this.field4390;
                int var8 = arg1 - this.field4391;
                this.method6221(this.field4373 - (int) ((float) var7 / this.field4377), this.field4389 + (int) ((float) var8 / this.field4377), false);
            }
        } else {
            this.method6374();
        }
        if (arg3) {
            this.field4392 = var5;
            this.field4393 = arg0;
            this.field4394 = arg1;
        }
    }

    @ObfuscatedName("or.r(IIZJ)V")
    public void method6366(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4381 == null) {
            this.field4406 = null;
            return;
        }
        int var6 = (int) ((float) this.field4372 + ((float) (arg0 - this.field4376) - (float) this.method6251() * this.field4362 / 2.0F) / this.field4362);
        int var7 = (int) ((float) this.field4402 - ((float) (arg1 - this.field4374) - (float) this.method6308() * this.field4362 / 2.0F) / this.field4362);
        this.field4406 = this.field4381.method4032(var6 + this.field4381.method4040() * 64, var7 + this.field4381.method4071() * 64);
        if (this.field4406 == null || !arg2) {
            return;
        }
        if (client.method2624() && class24.field131[82] && class24.field131[81]) {
            client.method357(this.field4406.field3228, this.field4406.field3229, this.field4406.field3227, false);
            return;
        }
        boolean var8 = true;
        if (this.field4368) {
            int var9 = arg0 - this.field4393;
            int var10 = arg1 - this.field4394;
            if (arg3 - this.field4392 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class257 var11 = class257.method2630(class255.field2847, client.field551.field1319);
            var11.field2960.method6747(this.field4406.method4817());
            client.field551.method2268(var11);
            this.field4392 = 0L;
        }
    }

    @ObfuscatedName("or.o(S)V")
    public void method6219() {
        if (Statics.field59 != null) {
            this.field4362 = this.field4377;
            return;
        }
        if (this.field4362 < this.field4377) {
            this.field4362 = Math.min(this.field4377, this.field4362 / 30.0F + this.field4362);
        }
        if (this.field4362 > this.field4377) {
            this.field4362 = Math.max(this.field4377, this.field4362 - this.field4362 / 30.0F);
        }
    }

    @ObfuscatedName("or.i(I)V")
    public void method6220() {
        if (!this.method6260()) {
            return;
        }
        int var1 = this.field4378 - this.field4372;
        int var2 = this.field4375 - this.field4402;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6221(this.field4372 + var1, this.field4402 + var2, true);
        if (this.field4378 == this.field4372 && this.field4402 == this.field4375) {
            this.field4378 = -1;
            this.field4375 = -1;
        }
    }

    @ObfuscatedName("or.w(IIZI)V")
    public final void method6221(int arg0, int arg1, boolean arg2) {
        this.field4372 = arg0;
        this.field4402 = arg1;
        class262.method4787();
        if (arg2) {
            this.method6374();
        }
    }

    @ObfuscatedName("or.v(I)V")
    public final void method6374() {
        this.field4391 = -1;
        this.field4390 = -1;
        this.field4389 = -1;
        this.field4373 = -1;
    }

    @ObfuscatedName("or.a(I)Z")
    public boolean method6260() {
        return this.field4378 != -1 && this.field4375 != -1;
    }

    @ObfuscatedName("or.y(IIII)Lhm;")
    public class218 method6224(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4369.values().iterator();
        class218 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class218) var4.next();
        } while (!var5.method4026(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("or.u(IIIZI)V")
    public void method6225(int arg0, int arg1, int arg2, boolean arg3) {
        class218 var5 = this.method6224(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4367;
        }
        boolean var6 = false;
        if (this.field4371 != var5 || arg3) {
            this.field4371 = var5;
            this.method6229(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6232(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("or.h(II)V")
    public void method6355(int arg0) {
        class218 var2 = this.method6243(arg0);
        if (var2 != null) {
            this.method6229(var2);
        }
    }

    @ObfuscatedName("or.q(I)I")
    public int method6227() {
        return this.field4381 == null ? -1 : this.field4381.method4034();
    }

    @ObfuscatedName("or.x(B)Lhm;")
    public class218 method6364() {
        return this.field4381;
    }

    @ObfuscatedName("or.p(Lhm;I)V")
    public void method6229(class218 arg0) {
        if (this.field4381 == null || this.field4381 != arg0) {
            this.method6350(arg0);
            this.method6232(-1, -1, -1);
        }
    }

    @ObfuscatedName("or.n(Lhm;I)V")
    public void method6350(class218 arg0) {
        this.field4381 = arg0;
        this.field4370 = new class220(this.field4360, this.field4364, this.field4411, this.field4359);
        this.field4383.method6196(this.field4381.method4037());
    }

    @ObfuscatedName("or.m(Lhm;Ljd;Ljd;ZB)V")
    public void method6337(class218 arg0, class282 arg1, class282 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4381 == null || this.field4381 != arg0) {
            this.method6350(arg0);
        }
        if (!arg3 && this.field4381.method4026(arg1.field3227, arg1.field3228, arg1.field3229)) {
            this.method6232(arg1.field3227, arg1.field3228, arg1.field3229);
        } else {
            this.method6232(arg2.field3227, arg2.field3228, arg2.field3229);
        }
    }

    @ObfuscatedName("or.d(IIII)V")
    public void method6232(int arg0, int arg1, int arg2) {
        if (this.field4381 == null) {
            return;
        }
        int[] var4 = this.field4381.method4073(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4381.method4073(this.field4381.method4045(), this.field4381.method4044(), this.field4381.method4046());
        }
        this.method6221(var4[0] - this.field4381.method4040() * 64, var4[1] - this.field4381.method4071() * 64, true);
        this.field4378 = -1;
        this.field4375 = -1;
        this.field4362 = this.method6239(this.field4381.method4039());
        this.field4377 = this.field4362;
        this.field4403 = null;
        this.field4404 = null;
        this.field4370.method4234();
    }

    @ObfuscatedName("or.j(IIIIII)V")
    public void method6233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class430.method6990(var6);
        class430.method6950(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class430.method6958(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4383.method6199();
        if (var7 < 100) {
            this.method6238(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4370.method4244()) {
            this.field4370.method4233(this.field4357, this.field4381.method4037(), client.field669);
            if (!this.field4370.method4244()) {
                return;
            }
        }
        if (this.field4385 != null) {
            this.field4387++;
            if (this.field4387 % this.field4401 == 0) {
                this.field4387 = 0;
                this.field4386++;
            }
            if (this.field4386 >= this.field4382 && !this.field4384) {
                this.field4385 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4362));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4362));
        this.field4370.method4240(this.field4372 - var8 / 2, this.field4402 - var9 / 2, var8 / 2 + this.field4372, var9 / 2 + this.field4402, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4400) {
            boolean var10 = false;
            if (arg4 - this.field4397 > 100) {
                this.field4397 = arg4;
                var10 = true;
            }
            this.field4370.method4236(this.field4372 - var8 / 2, this.field4402 - var9 / 2, var8 / 2 + this.field4372, var9 / 2 + this.field4402, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4399, this.field4385, this.field4387, this.field4401, var10);
        }
        this.method6314(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method2624() && this.field4407 && this.field4406 != null) {
            this.field4388.method5446("Coord: " + this.field4406, class430.field4583 + 10, class430.field4581 + 20, 16776960, -1);
        }
        this.field4353 = var8;
        this.field4363 = var9;
        this.field4376 = arg0;
        this.field4374 = arg1;
        class430.method6957(var6);
    }

    @ObfuscatedName("or.f(IIIIIII)Z")
    public boolean method6234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4408 == null) {
            return true;
        } else if (this.field4408.field4602 != arg0 || this.field4408.field4603 != arg1) {
            return true;
        } else if (this.field4370.field2670 != this.field4409) {
            return true;
        } else if (client.field778 != this.field4412) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("or.g(IIIIIII)V")
    public void method6314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field59 == null) {
            return;
        }
        int var7 = 512 / (this.field4370.field2670 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6248() - arg4 / 2 - var7;
        int var14 = this.method6394() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4370.field2670 * (var7 + var13 - this.field4410);
        int var16 = arg1 - this.field4370.field2670 * (var7 - (var14 - this.field4380));
        if (this.method6234(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4408 != null && this.field4408.field4602 == var11 && this.field4408.field4603 == var12) {
                Arrays.fill(this.field4408.field4606, 0);
            } else {
                this.field4408 = new class434(var11, var12);
            }
            this.field4410 = this.method6248() - arg4 / 2 - var7;
            this.field4380 = this.method6394() - arg5 / 2 - var7;
            this.field4409 = this.field4370.field2670;
            Statics.field59.method5208(this.field4410, this.field4380, this.field4408, (float) this.field4409 / var10);
            this.field4412 = client.field778;
            var15 = arg0 - this.field4370.field2670 * (var7 + var13 - this.field4410);
            var16 = arg1 - this.field4370.field2670 * (var7 - (var14 - this.field4380));
        }
        class430.method6997(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4408.method7054(var15, var16, 192);
        } else {
            this.field4408.method7079(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("or.t(IIIIB)V")
    public void method6236(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4383.method6198()) {
            return;
        }
        if (!this.field4370.method4244()) {
            this.field4370.method4233(this.field4357, this.field4381.method4037(), client.field669);
            if (!this.field4370.method4244()) {
                return;
            }
        }
        this.field4370.method4237(arg0, arg1, arg2, arg3, this.field4385, this.field4387, this.field4401);
    }

    @ObfuscatedName("or.k(IS)V")
    public void method6237(int arg0) {
        this.field4377 = this.method6239(arg0);
    }

    @ObfuscatedName("or.b(IIIIII)V")
    public void method6238(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class430.method6958(arg0, arg1, arg2, arg3, -16777216);
        class430.method6959(var7 - 152, var8, 304, 34, -65536);
        class430.method6958(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4388.method5449(class300.field3662, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("or.z(II)F")
    public float method6239(int arg0) {
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

    @ObfuscatedName("or.ap(B)I")
    public int method6240() {
        if ((double) this.field4377 == 1.0D) {
            return 25;
        } else if ((double) this.field4377 == 1.5D) {
            return 37;
        } else if ((double) this.field4377 == 2.0D) {
            return 50;
        } else if ((double) this.field4377 == 3.0D) {
            return 75;
        } else if ((double) this.field4377 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("or.af(B)V")
    public void method6241() {
        this.field4383.method6200();
    }

    @ObfuscatedName("or.ak(I)Z")
    public boolean method6271() {
        return this.field4383.method6198();
    }

    @ObfuscatedName("or.av(IB)Lhm;")
    public class218 method6243(int arg0) {
        Iterator var2 = this.field4369.values().iterator();
        class218 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class218) var2.next();
        } while (var3.method4034() != arg0);
        return var3;
    }

    @ObfuscatedName("or.ar(IIB)V")
    public void method6244(int arg0, int arg1) {
        if (this.field4381 != null && this.field4381.method4074(arg0, arg1)) {
            this.field4378 = arg0 - this.field4381.method4040() * 64;
            this.field4375 = arg1 - this.field4381.method4071() * 64;
        }
    }

    @ObfuscatedName("or.al(III)V")
    public void method6257(int arg0, int arg1) {
        if (this.field4381 != null) {
            this.method6221(arg0 - this.field4381.method4040() * 64, arg1 - this.field4381.method4071() * 64, true);
            this.field4378 = -1;
            this.field4375 = -1;
        }
    }

    @ObfuscatedName("or.aa(IIIB)V")
    public void method6267(int arg0, int arg1, int arg2) {
        if (this.field4381 != null) {
            int[] var4 = this.field4381.method4073(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6244(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("or.ao(IIIB)V")
    public void method6305(int arg0, int arg1, int arg2) {
        if (this.field4381 != null) {
            int[] var4 = this.field4381.method4073(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6257(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("or.aq(B)I")
    public int method6248() {
        return this.field4381 == null ? -1 : this.field4372 + this.field4381.method4040() * 64;
    }

    @ObfuscatedName("or.ay(B)I")
    public int method6394() {
        return this.field4381 == null ? -1 : this.field4402 + this.field4381.method4071() * 64;
    }

    @ObfuscatedName("or.ac(I)Ljd;")
    public class282 method6354() {
        return this.field4381 == null ? null : this.field4381.method4032(this.method6248(), this.method6394());
    }

    @ObfuscatedName("or.ab(I)I")
    public int method6251() {
        return this.field4353;
    }

    @ObfuscatedName("or.as(I)I")
    public int method6308() {
        return this.field4363;
    }

    @ObfuscatedName("or.ag(II)V")
    public void method6253(int arg0) {
        if (arg0 >= 1) {
            this.field4382 = arg0;
        }
    }

    @ObfuscatedName("or.az(I)V")
    public void method6254() {
        this.field4382 = 3;
    }

    @ObfuscatedName("or.ad(II)V")
    public void method6336(int arg0) {
        if (arg0 >= 1) {
            this.field4401 = arg0;
        }
    }

    @ObfuscatedName("or.au(B)V")
    public void method6256() {
        this.field4401 = 50;
    }

    @ObfuscatedName("or.at(ZB)V")
    public void method6223(boolean arg0) {
        this.field4384 = arg0;
    }

    @ObfuscatedName("or.ae(II)V")
    public void method6351(int arg0) {
        this.field4385 = new HashSet();
        this.field4385.add(arg0);
        this.field4386 = 0;
        this.field4387 = 0;
    }

    @ObfuscatedName("or.an(II)V")
    public void method6259(int arg0) {
        this.field4385 = new HashSet();
        this.field4386 = 0;
        this.field4387 = 0;
        for (int var2 = 0; var2 < Statics.field1762; var2++) {
            if (class164.method2597(var2) != null && class164.method2597(var2).field1783 == arg0) {
                this.field4385.add(class164.method2597(var2).field1764);
            }
        }
    }

    @ObfuscatedName("or.aw(B)V")
    public void method6222() {
        this.field4385 = null;
    }

    @ObfuscatedName("or.aj(ZB)V")
    public void method6262(boolean arg0) {
        this.field4400 = !arg0;
    }

    @ObfuscatedName("or.ax(IZI)V")
    public void method6250(int arg0, boolean arg1) {
        if (arg1) {
            this.field4396.remove(arg0);
        } else {
            this.field4396.add(arg0);
        }
        this.method6294();
    }

    @ObfuscatedName("or.ah(IZB)V")
    public void method6263(int arg0, boolean arg1) {
        if (arg1) {
            this.field4379.remove(arg0);
        } else {
            this.field4379.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1762; var3++) {
            if (class164.method2597(var3) != null && class164.method2597(var3).field1783 == arg0) {
                int var4 = class164.method2597(var3).field1764;
                if (arg1) {
                    this.field4398.remove(var4);
                } else {
                    this.field4398.add(var4);
                }
            }
        }
        this.method6294();
    }

    @ObfuscatedName("or.ai(B)Z")
    public boolean method6384() {
        return !this.field4400;
    }

    @ObfuscatedName("or.am(II)Z")
    public boolean method6265(int arg0) {
        return !this.field4396.contains(arg0);
    }

    @ObfuscatedName("or.bt(II)Z")
    public boolean method6266(int arg0) {
        return !this.field4379.contains(arg0);
    }

    @ObfuscatedName("or.bn(I)V")
    public void method6294() {
        this.field4399.clear();
        this.field4399.addAll(this.field4396);
        this.field4399.addAll(this.field4398);
    }

    @ObfuscatedName("or.bz(IIIIIII)V")
    public void method6268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4383.method6198()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4362));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4362));
        List var9 = this.field4370.method4238(this.field4372 - var7 / 2 - 1, this.field4402 - var8 / 2 - 1, var7 / 2 + this.field4372 + 1, var8 / 2 + this.field4402 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class164 var12 = class164.method2597(var11.method3980());
            var13 = false;
            for (int var14 = this.field4365.length - 1; var14 >= 0; var14--) {
                if (var12.field1772[var14] != null) {
                    client.method105(var12.field1772[var14], var12.field1773, this.field4365[var14], var11.method3980(), var11.field2786.method4817(), var11.field2788.method4817());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("or.bx(ILjd;I)Ljd;")
    public class282 method6228(int arg0, class282 arg1) {
        if (!this.field4383.method6198()) {
            return null;
        } else if (!this.field4370.method4244()) {
            return null;
        } else if (this.field4381.method4074(arg1.field3228, arg1.field3229)) {
            HashMap var3 = this.field4370.method4241();
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
                        return var5.field2788;
                    }
                    var8 = (class236) var7.next();
                    int var9 = var8.field2788.field3228 - arg1.field3228;
                    int var10 = var8.field2788.field3229 - arg1.field3229;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2788;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("or.bd(IILjd;Ljd;I)V")
    public void method6270(int arg0, int arg1, class282 arg2, class282 arg3) {
        class81 var5 = new class81();
        class241 var6 = new class241(arg1, arg2, arg3);
        var5.method1988(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1994(10);
                break;
            case 1009:
                var5.method1994(11);
                break;
            case 1010:
                var5.method1994(12);
                break;
            case 1011:
                var5.method1994(13);
                break;
            case 1012:
                var5.method1994(14);
        }
        class64.method2170(var5);
    }

    @ObfuscatedName("or.bg(I)Lix;")
    public class236 method6246() {
        if (!this.field4383.method6198()) {
            return null;
        } else if (this.field4370.method4244()) {
            HashMap var1 = this.field4370.method4241();
            this.field4403 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4403.addAll(var3);
            }
            this.field4404 = this.field4403.iterator();
            return this.method6401();
        } else {
            return null;
        }
    }

    @ObfuscatedName("or.bm(B)Lix;")
    public class236 method6401() {
        if (this.field4404 == null) {
            return null;
        }
        class236 var1;
        do {
            if (!this.field4404.hasNext()) {
                return null;
            }
            var1 = (class236) this.field4404.next();
        } while (var1.method3980() == -1);
        return var1;
    }
}
