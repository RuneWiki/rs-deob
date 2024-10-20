package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("os")
public class class416 {

    @ObfuscatedName("os.i")
    public class316 field4533;

    @ObfuscatedName("os.k")
    public class316 field4521;

    @ObfuscatedName("os.o")
    public class316 field4522;

    @ObfuscatedName("os.n")
    public static final class418 field4549 = class418.field4583;

    @ObfuscatedName("os.d")
    public static final class418 field4543 = class418.field4586;

    @ObfuscatedName("os.a")
    public static final class418 field4525 = class418.field4580;

    @ObfuscatedName("os.m")
    public class350 field4526;

    @ObfuscatedName("os.u")
    public HashMap field4527;

    @ObfuscatedName("os.l")
    public class456[] field4573;

    @ObfuscatedName("os.z")
    public HashMap field4539;

    @ObfuscatedName("os.r")
    public class225 field4542;

    @ObfuscatedName("os.y")
    public class225 field4575;

    @ObfuscatedName("os.p")
    public class225 field4532;

    @ObfuscatedName("os.e")
    public class227 field4529;

    @ObfuscatedName("os.b")
    public class415 field4523;

    @ObfuscatedName("os.x")
    public int field4535;

    @ObfuscatedName("os.f")
    public int field4536;

    @ObfuscatedName("os.t")
    public int field4537 = -1;

    @ObfuscatedName("os.j")
    public int field4524 = -1;

    @ObfuscatedName("os.g")
    public float field4531;

    @ObfuscatedName("os.ar")
    public float field4540;

    @ObfuscatedName("os.aq")
    public int field4541 = -1;

    @ObfuscatedName("os.av")
    public int field4569 = -1;

    @ObfuscatedName("os.aj")
    public int field4551 = -1;

    @ObfuscatedName("os.ax")
    public int field4544 = -1;

    @ObfuscatedName("os.ab")
    public int field4545 = 3;

    @ObfuscatedName("os.ak")
    public int field4519 = 50;

    @ObfuscatedName("os.au")
    public boolean field4547 = false;

    @ObfuscatedName("os.ae")
    public HashSet field4518 = null;

    @ObfuscatedName("os.as")
    public int field4557 = -1;

    @ObfuscatedName("os.ay")
    public int field4550 = -1;

    @ObfuscatedName("os.ag")
    public int field4530 = -1;

    @ObfuscatedName("os.ad")
    public int field4552 = -1;

    @ObfuscatedName("os.af")
    public int field4553 = -1;

    @ObfuscatedName("os.aw")
    public int field4554 = -1;

    @ObfuscatedName("os.ai")
    public long field4566;

    @ObfuscatedName("os.ap")
    public int field4556;

    @ObfuscatedName("os.az")
    public int field4520;

    @ObfuscatedName("os.an")
    public boolean field4558 = true;

    @ObfuscatedName("os.am")
    public HashSet field4559 = new HashSet();

    @ObfuscatedName("os.ao")
    public HashSet field4560 = new HashSet();

    @ObfuscatedName("os.at")
    public HashSet field4561 = new HashSet();

    @ObfuscatedName("os.al")
    public HashSet field4562 = new HashSet();

    @ObfuscatedName("os.ac")
    public boolean field4563 = false;

    @ObfuscatedName("os.bq")
    public int field4564 = 0;

    @ObfuscatedName("os.bl")
    public final int[] field4555 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("os.bv")
    public List field4565;

    @ObfuscatedName("os.bu")
    public Iterator field4567;

    @ObfuscatedName("os.bb")
    public HashSet field4568 = new HashSet();

    @ObfuscatedName("os.bt")
    public class290 field4548 = null;

    @ObfuscatedName("os.bw")
    public boolean field4570 = false;

    @ObfuscatedName("os.bd")
    public class457 field4571;

    @ObfuscatedName("os.bg")
    public int field4572;

    @ObfuscatedName("os.by")
    public int field4538 = -1;

    @ObfuscatedName("os.bs")
    public int field4574 = -1;

    @ObfuscatedName("os.br")
    public int field4534 = -1;

    @ObfuscatedName("os.s(Lls;Lls;Lls;Lmg;Ljava/util/HashMap;[Lqe;B)V")
    public void method6449(class316 arg0, class316 arg1, class316 arg2, class350 arg3, HashMap arg4, class456[] arg5) {
        this.field4573 = arg5;
        this.field4533 = arg0;
        this.field4521 = arg1;
        this.field4522 = arg2;
        this.field4526 = arg3;
        this.field4527 = new HashMap();
        this.field4527.put(class222.field2684, arg4.get(field4549));
        this.field4527.put(class222.field2678, arg4.get(field4543));
        this.field4527.put(class222.field2682, arg4.get(field4525));
        this.field4523 = new class415(arg0);
        int var7 = this.field4533.method5269(class244.field2873.field2874);
        int[] var8 = this.field4533.method5245(var7);
        this.field4539 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class444 var10 = new class444(this.field4533.method5179(var7, var8[var9]));
            class225 var11 = new class225();
            var11.method4151(var10, var8[var9]);
            this.field4539.put(var11.method4160(), var11);
            if (var11.method4159()) {
                this.field4542 = var11;
            }
        }
        this.method6463(this.field4542);
        this.field4532 = null;
    }

    @ObfuscatedName("os.h(I)V")
    public void method6547() {
        class226.method2665();
    }

    @ObfuscatedName("os.w(IIZIIIIB)V")
    public void method6451(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4523.method6446()) {
            return;
        }
        this.method6476();
        this.method6617();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4531));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4531));
        List var10 = this.field4529.method4358(this.field4535 - var8 / 2 - 1, this.field4536 - var9 / 2 - 1, var8 / 2 + this.field4535 + 1, var9 / 2 + this.field4536 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class243 var13 = (class243) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class248 var15 = new class248(var13.method4097(), var13.field2863, var13.field2864);
            var14.method1955(new Object[] { var15, arg0, arg1 });
            if (this.field4568.contains(var13)) {
                var14.method1954(17);
            } else {
                var14.method1954(15);
            }
            class64.method4069(var14);
        }
        Iterator var16 = this.field4568.iterator();
        while (var16.hasNext()) {
            class243 var17 = (class243) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class248 var19 = new class248(var17.method4097(), var17.field2863, var17.field2864);
                var18.method1955(new Object[] { var19, arg0, arg1 });
                var18.method1954(16);
                class64.method4069(var18);
            }
        }
        this.field4568 = var11;
    }

    @ObfuscatedName("os.v(IIZZB)V")
    public void method6612(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class270.method3146();
            this.method6473(arg0, arg1, arg3, var5);
            if (!this.method6548() && (arg3 || arg2)) {
                boolean var7 = client.field587 != null;
                if (!var7) {
                    if (arg3) {
                        this.field4553 = arg0;
                        this.field4554 = arg1;
                        this.field4530 = this.field4535;
                        this.field4552 = this.field4536;
                    }
                    if (this.field4530 != -1) {
                        int var8 = arg0 - this.field4553;
                        int var9 = arg1 - this.field4554;
                        this.method6491(this.field4530 - (int) ((float) var8 / this.field4540), this.field4552 + (int) ((float) var9 / this.field4540), false);
                    }
                    break label33;
                }
            }
            this.method6456();
        }
        if (arg3) {
            this.field4566 = var5;
            this.field4556 = arg0;
            this.field4520 = arg1;
        }
    }

    @ObfuscatedName("os.c(IIZJ)V")
    public void method6473(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4575 == null) {
            this.field4548 = null;
            return;
        }
        int var6 = (int) ((float) this.field4535 + ((float) (arg0 - this.field4551) - (float) this.method6599() * this.field4531 / 2.0F) / this.field4531);
        int var7 = (int) ((float) this.field4536 - ((float) (arg1 - this.field4544) - (float) this.method6583() * this.field4531 / 2.0F) / this.field4531);
        this.field4548 = this.field4575.method4200(var6 + this.field4575.method4164() * 64, var7 + this.field4575.method4166() * 64);
        if (this.field4548 == null || !arg2) {
            return;
        }
        if (client.method2390() && class24.field135[82] && class24.field135[81]) {
            client.method74(this.field4548.field3320, this.field4548.field3317, this.field4548.field3318, false);
            return;
        }
        boolean var8 = true;
        if (this.field4558) {
            int var9 = arg0 - this.field4556;
            int var10 = arg1 - this.field4520;
            if (arg3 - this.field4566 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class265 var11 = class265.method349(class263.field2945, client.field536.field1339);
            var11.field3039.method6980(this.field4548.method4907());
            client.field536.method2330(var11);
            this.field4566 = 0L;
        }
    }

    @ObfuscatedName("os.q(B)V")
    public void method6476() {
        if (Statics.field4165 != null) {
            this.field4531 = this.field4540;
            return;
        }
        if (this.field4531 < this.field4540) {
            this.field4531 = Math.min(this.field4540, this.field4531 / 30.0F + this.field4531);
        }
        if (this.field4531 > this.field4540) {
            this.field4531 = Math.max(this.field4540, this.field4531 - this.field4531 / 30.0F);
        }
    }

    @ObfuscatedName("os.i(I)V")
    public void method6617() {
        if (!this.method6548()) {
            return;
        }
        int var1 = this.field4537 - this.field4535;
        int var2 = this.field4524 - this.field4536;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6491(this.field4535 + var1, this.field4536 + var2, true);
        if (this.field4537 == this.field4535 && this.field4536 == this.field4524) {
            this.field4537 = -1;
            this.field4524 = -1;
        }
    }

    @ObfuscatedName("os.k(IIZB)V")
    public final void method6491(int arg0, int arg1, boolean arg2) {
        this.field4535 = arg0;
        this.field4536 = arg1;
        class270.method3146();
        if (arg2) {
            this.method6456();
        }
    }

    @ObfuscatedName("os.o(I)V")
    public final void method6456() {
        this.field4554 = -1;
        this.field4553 = -1;
        this.field4552 = -1;
        this.field4530 = -1;
    }

    @ObfuscatedName("os.n(B)Z")
    public boolean method6548() {
        return this.field4537 != -1 && this.field4524 != -1;
    }

    @ObfuscatedName("os.d(IIIB)Lht;")
    public class225 method6458(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4539.values().iterator();
        class225 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class225) var4.next();
        } while (!var5.method4153(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("os.a(IIIZI)V")
    public void method6459(int arg0, int arg1, int arg2, boolean arg3) {
        class225 var5 = this.method6458(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4542;
        }
        boolean var6 = false;
        if (this.field4532 != var5 || arg3) {
            this.field4532 = var5;
            this.method6463(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6480(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("os.m(II)V")
    public void method6460(int arg0) {
        class225 var2 = this.method6477(arg0);
        if (var2 != null) {
            this.method6463(var2);
        }
    }

    @ObfuscatedName("os.u(B)I")
    public int method6481() {
        return this.field4575 == null ? -1 : this.field4575.method4158();
    }

    @ObfuscatedName("os.l(I)Lht;")
    public class225 method6462() {
        return this.field4575;
    }

    @ObfuscatedName("os.z(Lht;B)V")
    public void method6463(class225 arg0) {
        if (this.field4575 == null || this.field4575 != arg0) {
            this.method6464(arg0);
            this.method6480(-1, -1, -1);
        }
    }

    @ObfuscatedName("os.r(Lht;I)V")
    public void method6464(class225 arg0) {
        this.field4575 = arg0;
        this.field4529 = new class227(this.field4573, this.field4527, this.field4521, this.field4522);
        this.field4523.method6437(this.field4575.method4160());
    }

    @ObfuscatedName("os.y(Lht;Lku;Lku;ZB)V")
    public void method6608(class225 arg0, class290 arg1, class290 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4575 == null || this.field4575 != arg0) {
            this.method6464(arg0);
        }
        if (!arg3 && this.field4575.method4153(arg1.field3318, arg1.field3320, arg1.field3317)) {
            this.method6480(arg1.field3318, arg1.field3320, arg1.field3317);
        } else {
            this.method6480(arg2.field3318, arg2.field3320, arg2.field3317);
        }
    }

    @ObfuscatedName("os.p(IIII)V")
    public void method6480(int arg0, int arg1, int arg2) {
        if (this.field4575 == null) {
            return;
        }
        int[] var4 = this.field4575.method4187(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4575.method4187(this.field4575.method4169(), this.field4575.method4204(), this.field4575.method4170());
        }
        this.method6491(var4[0] - this.field4575.method4164() * 64, var4[1] - this.field4575.method4166() * 64, true);
        this.field4537 = -1;
        this.field4524 = -1;
        this.field4531 = this.method6516(this.field4575.method4163());
        this.field4540 = this.field4531;
        this.field4565 = null;
        this.field4567 = null;
        this.field4529.method4373();
    }

    @ObfuscatedName("os.e(IIIIII)V")
    public void method6467(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class453.method7240(var6);
        class453.method7238(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class453.method7245(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4523.method6440();
        if (var7 < 100) {
            this.method6466(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4529.method4379()) {
            this.field4529.method4353(this.field4533, this.field4575.method4160(), client.field479);
            if (!this.field4529.method4379()) {
                return;
            }
        }
        if (this.field4518 != null) {
            this.field4550++;
            if (this.field4550 % this.field4519 == 0) {
                this.field4550 = 0;
                this.field4557++;
            }
            if (this.field4557 >= this.field4545 && !this.field4547) {
                this.field4518 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4531));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4531));
        this.field4529.method4376(this.field4535 - var8 / 2, this.field4536 - var9 / 2, var8 / 2 + this.field4535, var9 / 2 + this.field4536, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4563) {
            boolean var10 = false;
            if (arg4 - this.field4564 > 100) {
                this.field4564 = arg4;
                var10 = true;
            }
            this.field4529.method4393(this.field4535 - var8 / 2, this.field4536 - var9 / 2, var8 / 2 + this.field4535, var9 / 2 + this.field4536, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4562, this.field4518, this.field4550, this.field4519, var10);
        }
        this.method6453(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method2390() && this.field4570 && this.field4548 != null) {
            this.field4526.method5725("Coord: " + this.field4548, class453.field4776 + 10, class453.field4774 + 20, 16776960, -1);
        }
        this.field4541 = var8;
        this.field4569 = var9;
        this.field4551 = arg0;
        this.field4544 = arg1;
        class453.method7250(var6);
    }

    @ObfuscatedName("os.b(IIIIIII)Z")
    public boolean method6569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4571 == null) {
            return true;
        } else if (this.field4571.field4799 != arg0 || this.field4571.field4797 != arg1) {
            return true;
        } else if (this.field4529.field2738 != this.field4572) {
            return true;
        } else if (client.field766 != this.field4534) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("os.x(IIIIIII)V")
    public void method6453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field4165 == null) {
            return;
        }
        int var7 = 512 / (this.field4529.field2738 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6482() - arg4 / 2 - var7;
        int var14 = this.method6483() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4529.field2738 * (var7 + var13 - this.field4538);
        int var16 = arg1 - this.field4529.field2738 * (var7 - (var14 - this.field4574));
        if (this.method6569(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4571 != null && this.field4571.field4799 == var11 && this.field4571.field4797 == var12) {
                Arrays.fill(this.field4571.field4803, 0);
            } else {
                this.field4571 = new class457(var11, var12);
            }
            this.field4538 = this.method6482() - arg4 / 2 - var7;
            this.field4574 = this.method6483() - arg5 / 2 - var7;
            this.field4572 = this.field4529.field2738;
            Statics.field4165.method5381(this.field4538, this.field4574, this.field4571, (float) this.field4572 / var10);
            this.field4534 = client.field766;
            var15 = arg0 - this.field4529.field2738 * (var7 + var13 - this.field4538);
            var16 = arg1 - this.field4529.field2738 * (var7 - (var14 - this.field4574));
        }
        class453.method7312(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4571.method7362(var15, var16, 192);
        } else {
            this.field4571.method7365(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("os.f(IIIIB)V")
    public void method6628(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4523.method6446()) {
            return;
        }
        if (!this.field4529.method4379()) {
            this.field4529.method4353(this.field4533, this.field4575.method4160(), client.field479);
            if (!this.field4529.method4379()) {
                return;
            }
        }
        this.field4529.method4357(arg0, arg1, arg2, arg3, this.field4518, this.field4550, this.field4519);
    }

    @ObfuscatedName("os.t(IB)V")
    public void method6471(int arg0) {
        this.field4540 = this.method6516(arg0);
    }

    @ObfuscatedName("os.j(IIIIII)V")
    public void method6466(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class453.method7245(arg0, arg1, arg2, arg3, -16777216);
        class453.method7261(var7 - 152, var8, 304, 34, -65536);
        class453.method7245(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4526.method5719(class309.field3859, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("os.g(II)F")
    public float method6516(int arg0) {
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

    @ObfuscatedName("os.ar(I)I")
    public int method6474() {
        if ((double) this.field4540 == 1.0D) {
            return 25;
        } else if ((double) this.field4540 == 1.5D) {
            return 37;
        } else if ((double) this.field4540 == 2.0D) {
            return 50;
        } else if ((double) this.field4540 == 3.0D) {
            return 75;
        } else if ((double) this.field4540 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("os.aq(I)V")
    public void method6475() {
        this.field4523.method6438();
    }

    @ObfuscatedName("os.av(B)Z")
    public boolean method6450() {
        return this.field4523.method6446();
    }

    @ObfuscatedName("os.aj(II)Lht;")
    public class225 method6477(int arg0) {
        Iterator var2 = this.field4539.values().iterator();
        class225 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class225) var2.next();
        } while (var3.method4158() != arg0);
        return var3;
    }

    @ObfuscatedName("os.ax(III)V")
    public void method6478(int arg0, int arg1) {
        if (this.field4575 != null && this.field4575.method4154(arg0, arg1)) {
            this.field4537 = arg0 - this.field4575.method4164() * 64;
            this.field4524 = arg1 - this.field4575.method4166() * 64;
        }
    }

    @ObfuscatedName("os.ab(IIB)V")
    public void method6561(int arg0, int arg1) {
        if (this.field4575 != null) {
            this.method6491(arg0 - this.field4575.method4164() * 64, arg1 - this.field4575.method4166() * 64, true);
            this.field4537 = -1;
            this.field4524 = -1;
        }
    }

    @ObfuscatedName("os.ak(IIII)V")
    public void method6510(int arg0, int arg1, int arg2) {
        if (this.field4575 != null) {
            int[] var4 = this.field4575.method4187(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6478(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("os.au(IIIB)V")
    public void method6557(int arg0, int arg1, int arg2) {
        if (this.field4575 != null) {
            int[] var4 = this.field4575.method4187(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6561(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("os.ae(I)I")
    public int method6482() {
        return this.field4575 == null ? -1 : this.field4535 + this.field4575.method4164() * 64;
    }

    @ObfuscatedName("os.as(I)I")
    public int method6483() {
        return this.field4575 == null ? -1 : this.field4536 + this.field4575.method4166() * 64;
    }

    @ObfuscatedName("os.ay(I)Lku;")
    public class290 method6484() {
        return this.field4575 == null ? null : this.field4575.method4200(this.method6482(), this.method6483());
    }

    @ObfuscatedName("os.ag(I)I")
    public int method6599() {
        return this.field4541;
    }

    @ObfuscatedName("os.ad(I)I")
    public int method6583() {
        return this.field4569;
    }

    @ObfuscatedName("os.af(II)V")
    public void method6487(int arg0) {
        if (arg0 >= 1) {
            this.field4545 = arg0;
        }
    }

    @ObfuscatedName("os.aw(I)V")
    public void method6488() {
        this.field4545 = 3;
    }

    @ObfuscatedName("os.ai(II)V")
    public void method6489(int arg0) {
        if (arg0 >= 1) {
            this.field4519 = arg0;
        }
    }

    @ObfuscatedName("os.ap(I)V")
    public void method6494() {
        this.field4519 = 50;
    }

    @ObfuscatedName("os.az(ZI)V")
    public void method6448(boolean arg0) {
        this.field4547 = arg0;
    }

    @ObfuscatedName("os.an(IB)V")
    public void method6537(int arg0) {
        this.field4518 = new HashSet();
        this.field4518.add(arg0);
        this.field4557 = 0;
        this.field4550 = 0;
    }

    @ObfuscatedName("os.ah(IB)V")
    public void method6493(int arg0) {
        this.field4518 = new HashSet();
        this.field4557 = 0;
        this.field4550 = 0;
        for (int var2 = 0; var2 < Statics.field1812; var2++) {
            if (class171.method3061(var2) != null && class171.method3061(var2).field1834 == arg0) {
                this.field4518.add(class171.method3061(var2).field1814);
            }
        }
    }

    @ObfuscatedName("os.aa(I)V")
    public void method6563() {
        this.field4518 = null;
    }

    @ObfuscatedName("os.at(ZB)V")
    public void method6495(boolean arg0) {
        this.field4563 = !arg0;
    }

    @ObfuscatedName("os.bq(IZI)V")
    public void method6577(int arg0, boolean arg1) {
        if (arg1) {
            this.field4559.remove(arg0);
        } else {
            this.field4559.add(arg0);
        }
        this.method6501();
    }

    @ObfuscatedName("os.bn(IZB)V")
    public void method6497(int arg0, boolean arg1) {
        if (arg1) {
            this.field4560.remove(arg0);
        } else {
            this.field4560.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1812; var3++) {
            if (class171.method3061(var3) != null && class171.method3061(var3).field1834 == arg0) {
                int var4 = class171.method3061(var3).field1814;
                if (arg1) {
                    this.field4561.remove(var4);
                } else {
                    this.field4561.add(var4);
                }
            }
        }
        this.method6501();
    }

    @ObfuscatedName("os.bl(B)Z")
    public boolean method6498() {
        return !this.field4563;
    }

    @ObfuscatedName("os.bv(II)Z")
    public boolean method6499(int arg0) {
        return !this.field4559.contains(arg0);
    }

    @ObfuscatedName("os.bu(II)Z")
    public boolean method6500(int arg0) {
        return !this.field4560.contains(arg0);
    }

    @ObfuscatedName("os.bb(I)V")
    public void method6501() {
        this.field4562.clear();
        this.field4562.addAll(this.field4559);
        this.field4562.addAll(this.field4561);
    }

    @ObfuscatedName("os.bt(IIIIIIB)V")
    public void method6490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4523.method6446()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4531));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4531));
        List var9 = this.field4529.method4358(this.field4535 - var7 / 2 - 1, this.field4536 - var8 / 2 - 1, var7 / 2 + this.field4535 + 1, var8 / 2 + this.field4536 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class243 var11 = (class243) var10.next();
            class171 var12 = class171.method3061(var11.method4097());
            var13 = false;
            for (int var14 = this.field4555.length - 1; var14 >= 0; var14--) {
                if (var12.field1813[var14] != null) {
                    Statics.method1859(var12.field1813[var14], var12.field1824, this.field4555[var14], var11.method4097(), var11.field2863.method4907(), var11.field2864.method4907());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("os.bw(ILku;B)Lku;")
    public class290 method6503(int arg0, class290 arg1) {
        if (!this.field4523.method6446()) {
            return null;
        } else if (!this.field4529.method4379()) {
            return null;
        } else if (this.field4575.method4154(arg1.field3320, arg1.field3317)) {
            HashMap var3 = this.field4529.method4361();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class243 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class243 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2864;
                    }
                    var8 = (class243) var7.next();
                    int var9 = var8.field2864.field3320 - arg1.field3320;
                    int var10 = var8.field2864.field3317 - arg1.field3317;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2864;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("os.bd(IILku;Lku;I)V")
    public void method6610(int arg0, int arg1, class290 arg2, class290 arg3) {
        class81 var5 = new class81();
        class248 var6 = new class248(arg1, arg2, arg3);
        var5.method1955(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1954(10);
                break;
            case 1009:
                var5.method1954(11);
                break;
            case 1010:
                var5.method1954(12);
                break;
            case 1011:
                var5.method1954(13);
                break;
            case 1012:
                var5.method1954(14);
        }
        class64.method4069(var5);
    }

    @ObfuscatedName("os.bg(I)Lil;")
    public class243 method6505() {
        if (!this.field4523.method6446()) {
            return null;
        } else if (this.field4529.method4379()) {
            HashMap var1 = this.field4529.method4361();
            this.field4565 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4565.addAll(var3);
            }
            this.field4567 = this.field4565.iterator();
            return this.method6506();
        } else {
            return null;
        }
    }

    @ObfuscatedName("os.by(I)Lil;")
    public class243 method6506() {
        if (this.field4567 == null) {
            return null;
        }
        class243 var1;
        do {
            if (!this.field4567.hasNext()) {
                return null;
            }
            var1 = (class243) this.field4567.next();
        } while (var1.method4097() == -1);
        return var1;
    }
}
