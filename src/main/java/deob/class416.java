package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("op")
public class class416 {

    @ObfuscatedName("op.p")
    public class316 field4520;

    @ObfuscatedName("op.s")
    public class316 field4521;

    @ObfuscatedName("op.r")
    public class316 field4547;

    @ObfuscatedName("op.v")
    public static final class418 field4529 = class418.field4586;

    @ObfuscatedName("op.y")
    public static final class418 field4524 = class418.field4583;

    @ObfuscatedName("op.c")
    public static final class418 field4525 = class418.field4587;

    @ObfuscatedName("op.w")
    public class350 field4526;

    @ObfuscatedName("op.b")
    public HashMap field4527;

    @ObfuscatedName("op.t")
    public class452[] field4528;

    @ObfuscatedName("op.g")
    public HashMap field4536;

    @ObfuscatedName("op.x")
    public class226 field4515;

    @ObfuscatedName("op.n")
    public class226 field4531;

    @ObfuscatedName("op.e")
    public class226 field4571;

    @ObfuscatedName("op.h")
    public class228 field4533;

    @ObfuscatedName("op.f")
    public class415 field4534;

    @ObfuscatedName("op.d")
    public int field4548;

    @ObfuscatedName("op.j")
    public int field4522;

    @ObfuscatedName("op.z")
    public int field4545 = -1;

    @ObfuscatedName("op.i")
    public int field4538 = -1;

    @ObfuscatedName("op.u")
    public float field4546;

    @ObfuscatedName("op.ag")
    public float field4540;

    @ObfuscatedName("op.ar")
    public int field4569 = -1;

    @ObfuscatedName("op.am")
    public int field4562 = -1;

    @ObfuscatedName("op.ac")
    public int field4543 = -1;

    @ObfuscatedName("op.ab")
    public int field4544 = -1;

    @ObfuscatedName("op.aj")
    public int field4551 = 3;

    @ObfuscatedName("op.ae")
    public int field4537 = 50;

    @ObfuscatedName("op.az")
    public boolean field4563 = false;

    @ObfuscatedName("op.ap")
    public HashSet field4539 = null;

    @ObfuscatedName("op.as")
    public int field4549 = -1;

    @ObfuscatedName("op.au")
    public int field4553 = -1;

    @ObfuscatedName("op.ak")
    public int field4542 = -1;

    @ObfuscatedName("op.af")
    public int field4552 = -1;

    @ObfuscatedName("op.al")
    public int field4530 = -1;

    @ObfuscatedName("op.aq")
    public int field4554 = -1;

    @ObfuscatedName("op.ad")
    public long field4555;

    @ObfuscatedName("op.an")
    public int field4556;

    @ObfuscatedName("op.aw")
    public int field4550;

    @ObfuscatedName("op.ah")
    public boolean field4558 = true;

    @ObfuscatedName("op.ai")
    public HashSet field4560 = new HashSet();

    @ObfuscatedName("op.ay")
    public HashSet field4561 = new HashSet();

    @ObfuscatedName("op.aa")
    public HashSet field4518 = new HashSet();

    @ObfuscatedName("op.ax")
    public HashSet field4535 = new HashSet();

    @ObfuscatedName("op.at")
    public boolean field4564 = false;

    @ObfuscatedName("op.br")
    public int field4565 = 0;

    @ObfuscatedName("op.bk")
    public final int[] field4566 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("op.bi")
    public List field4567;

    @ObfuscatedName("op.bc")
    public Iterator field4568;

    @ObfuscatedName("op.bo")
    public HashSet field4523 = new HashSet();

    @ObfuscatedName("op.bl")
    public class290 field4570 = null;

    @ObfuscatedName("op.bs")
    public boolean field4557 = false;

    @ObfuscatedName("op.bx")
    public class453 field4572;

    @ObfuscatedName("op.bd")
    public int field4573;

    @ObfuscatedName("op.bj")
    public int field4574 = -1;

    @ObfuscatedName("op.be")
    public int field4575 = -1;

    @ObfuscatedName("op.bf")
    public int field4576 = -1;

    @ObfuscatedName("op.o(Llp;Llp;Llp;Lmx;Ljava/util/HashMap;[Lqd;I)V")
    public void method6436(class316 arg0, class316 arg1, class316 arg2, class350 arg3, HashMap arg4, class452[] arg5) {
        this.field4528 = arg5;
        this.field4520 = arg0;
        this.field4521 = arg1;
        this.field4547 = arg2;
        this.field4526 = arg3;
        this.field4527 = new HashMap();
        this.field4527.put(class223.field2714, arg4.get(field4529));
        this.field4527.put(class223.field2710, arg4.get(field4524));
        this.field4527.put(class223.field2711, arg4.get(field4525));
        this.field4534 = new class415(arg0);
        int var7 = this.field4520.method5206(class245.field2911.field2916);
        int[] var8 = this.field4520.method5252(var7);
        this.field4536 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class440 var10 = new class440(this.field4520.method5249(var7, var8[var9]));
            class226 var11 = new class226();
            var11.method4127(var10, var8[var9]);
            this.field4536.put(var11.method4180(), var11);
            if (var11.method4135()) {
                this.field4515 = var11;
            }
        }
        this.method6472(this.field4515);
        this.field4571 = null;
    }

    @ObfuscatedName("op.q(I)V")
    public void method6437() {
        class227.method3091();
    }

    @ObfuscatedName("op.l(IIZIIIII)V")
    public void method6635(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4534.method6430()) {
            return;
        }
        this.method6615();
        this.method6455();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4546));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4546));
        List var10 = this.field4533.method4322(this.field4548 - var8 / 2 - 1, this.field4522 - var9 / 2 - 1, var8 / 2 + this.field4548 + 1, var9 / 2 + this.field4522 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class244 var13 = (class244) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class249 var15 = new class249(var13.method4095(), var13.field2901, var13.field2900);
            var14.method1974(new Object[] { var15, arg0, arg1 });
            if (this.field4523.contains(var13)) {
                var14.method1970(17);
            } else {
                var14.method1970(15);
            }
            class64.method2749(var14);
        }
        Iterator var16 = this.field4523.iterator();
        while (var16.hasNext()) {
            class244 var17 = (class244) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class249 var19 = new class249(var17.method4095(), var17.field2901, var17.field2900);
                var18.method1974(new Object[] { var19, arg0, arg1 });
                var18.method1970(16);
                class64.method2749(var18);
            }
        }
        this.field4523 = var11;
    }

    @ObfuscatedName("op.k(IIZZI)V")
    public void method6439(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class270.method2485();
        this.method6440(arg0, arg1, arg3, var5);
        if (!this.method6445() && arg3 || arg2) {
            if (arg3) {
                this.field4530 = arg0;
                this.field4554 = arg1;
                this.field4542 = this.field4548;
                this.field4552 = this.field4522;
            }
            if (this.field4542 != -1) {
                int var7 = arg0 - this.field4530;
                int var8 = arg1 - this.field4554;
                this.method6443(this.field4542 - (int) ((float) var7 / this.field4540), this.field4552 + (int) ((float) var8 / this.field4540), false);
            }
        } else {
            this.method6444();
        }
        if (arg3) {
            this.field4555 = var5;
            this.field4556 = arg0;
            this.field4550 = arg1;
        }
    }

    @ObfuscatedName("op.a(IIZJ)V")
    public void method6440(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4531 == null) {
            this.field4570 = null;
            return;
        }
        int var6 = (int) ((float) this.field4548 + ((float) (arg0 - this.field4543) - (float) this.method6571() * this.field4546 / 2.0F) / this.field4546);
        int var7 = (int) ((float) this.field4522 - ((float) (arg1 - this.field4544) - (float) this.method6473() * this.field4546 / 2.0F) / this.field4546);
        this.field4570 = this.field4531.method4132(var6 + this.field4531.method4169() * 64, var7 + this.field4531.method4142() * 64);
        if (this.field4570 == null || !arg2) {
            return;
        }
        boolean var8 = client.field664 >= 2;
        if (var8 && class24.field131[82] && class24.field131[81]) {
            client.method2633(this.field4570.field3351, this.field4570.field3354, this.field4570.field3350, false);
            return;
        }
        boolean var9 = true;
        if (this.field4558) {
            int var10 = arg0 - this.field4556;
            int var11 = arg1 - this.field4550;
            if (arg3 - this.field4555 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class265 var12 = class265.method4070(class263.field2975, client.field734.field1344);
            var12.field3075.method6942(this.field4570.method4908());
            client.field734.method2362(var12);
            this.field4555 = 0L;
        }
    }

    @ObfuscatedName("op.m(B)V")
    public void method6615() {
        if (Statics.field1571 != null) {
            this.field4546 = this.field4540;
            return;
        }
        if (this.field4546 < this.field4540) {
            this.field4546 = Math.min(this.field4540, this.field4546 / 30.0F + this.field4546);
        }
        if (this.field4546 > this.field4540) {
            this.field4546 = Math.max(this.field4540, this.field4546 - this.field4546 / 30.0F);
        }
    }

    @ObfuscatedName("op.p(B)V")
    public void method6455() {
        if (!this.method6445()) {
            return;
        }
        int var1 = this.field4545 - this.field4548;
        int var2 = this.field4538 - this.field4522;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6443(this.field4548 + var1, this.field4522 + var2, true);
        if (this.field4548 == this.field4545 && this.field4538 == this.field4522) {
            this.field4545 = -1;
            this.field4538 = -1;
        }
    }

    @ObfuscatedName("op.s(IIZI)V")
    public final void method6443(int arg0, int arg1, boolean arg2) {
        this.field4548 = arg0;
        this.field4522 = arg1;
        class270.method2485();
        if (arg2) {
            this.method6444();
        }
    }

    @ObfuscatedName("op.r(S)V")
    public final void method6444() {
        this.field4554 = -1;
        this.field4530 = -1;
        this.field4552 = -1;
        this.field4542 = -1;
    }

    @ObfuscatedName("op.v(I)Z")
    public boolean method6445() {
        return this.field4545 != -1 && this.field4538 != -1;
    }

    @ObfuscatedName("op.y(IIIB)Lhm;")
    public class226 method6446(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4536.values().iterator();
        class226 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class226) var4.next();
        } while (!var5.method4184(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("op.c(IIIZI)V")
    public void method6447(int arg0, int arg1, int arg2, boolean arg3) {
        class226 var5 = this.method6446(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4515;
        }
        boolean var6 = false;
        if (this.field4571 != var5 || arg3) {
            this.field4571 = var5;
            this.method6472(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6507(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("op.w(II)V")
    public void method6448(int arg0) {
        class226 var2 = this.method6464(arg0);
        if (var2 != null) {
            this.method6472(var2);
        }
    }

    @ObfuscatedName("op.b(B)I")
    public int method6449() {
        return this.field4531 == null ? -1 : this.field4531.method4139();
    }

    @ObfuscatedName("op.t(B)Lhm;")
    public class226 method6450() {
        return this.field4531;
    }

    @ObfuscatedName("op.g(Lhm;I)V")
    public void method6472(class226 arg0) {
        if (this.field4531 == null || this.field4531 != arg0) {
            this.method6556(arg0);
            this.method6507(-1, -1, -1);
        }
    }

    @ObfuscatedName("op.x(Lhm;I)V")
    public void method6556(class226 arg0) {
        this.field4531 = arg0;
        this.field4533 = new class228(this.field4528, this.field4527, this.field4521, this.field4547);
        this.field4534.method6424(this.field4531.method4180());
    }

    @ObfuscatedName("op.n(Lhm;Lkd;Lkd;ZS)V")
    public void method6453(class226 arg0, class290 arg1, class290 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4531 == null || this.field4531 != arg0) {
            this.method6556(arg0);
        }
        if (!arg3 && this.field4531.method4184(arg1.field3350, arg1.field3351, arg1.field3354)) {
            this.method6507(arg1.field3350, arg1.field3351, arg1.field3354);
        } else {
            this.method6507(arg2.field3350, arg2.field3351, arg2.field3354);
        }
    }

    @ObfuscatedName("op.e(IIII)V")
    public void method6507(int arg0, int arg1, int arg2) {
        if (this.field4531 == null) {
            return;
        }
        int[] var4 = this.field4531.method4131(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4531.method4131(this.field4531.method4156(), this.field4531.method4144(), this.field4531.method4146());
        }
        this.method6443(var4[0] - this.field4531.method4169() * 64, var4[1] - this.field4531.method4142() * 64, true);
        this.field4545 = -1;
        this.field4538 = -1;
        this.field4546 = this.method6452(this.field4531.method4141());
        this.field4540 = this.field4546;
        this.field4567 = null;
        this.field4568 = null;
        this.field4533.method4316();
    }

    @ObfuscatedName("op.h(IIIIII)V")
    public void method6603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class449.method7198(var6);
        class449.method7259(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class449.method7204(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4534.method6425();
        if (var7 < 100) {
            this.method6538(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4533.method4324()) {
            this.field4533.method4317(this.field4520, this.field4531.method4180(), client.field482);
            if (!this.field4533.method4324()) {
                return;
            }
        }
        if (this.field4539 != null) {
            this.field4553++;
            if (this.field4553 % this.field4537 == 0) {
                this.field4553 = 0;
                this.field4549++;
            }
            if (this.field4549 >= this.field4551 && !this.field4563) {
                this.field4539 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4546));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4546));
        this.field4533.method4335(this.field4548 - var8 / 2, this.field4522 - var9 / 2, var8 / 2 + this.field4548, var9 / 2 + this.field4522, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4564) {
            boolean var10 = false;
            if (arg4 - this.field4565 > 100) {
                this.field4565 = arg4;
                var10 = true;
            }
            this.field4533.method4355(this.field4548 - var8 / 2, this.field4522 - var9 / 2, var8 / 2 + this.field4548, var9 / 2 + this.field4522, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4535, this.field4539, this.field4553, this.field4537, var10);
        }
        this.method6457(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field664 >= 2;
        if (var11 && this.field4557 && this.field4570 != null) {
            this.field4526.method5729("Coord: " + this.field4570, class449.field4748 + 10, class449.field4749 + 20, 16776960, -1);
        }
        this.field4569 = var8;
        this.field4562 = var9;
        this.field4543 = arg0;
        this.field4544 = arg1;
        class449.method7253(var6);
    }

    @ObfuscatedName("op.f(IIIIIII)Z")
    public boolean method6542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4572 == null) {
            return true;
        } else if (this.field4572.field4768 != arg0 || this.field4572.field4770 != arg1) {
            return true;
        } else if (this.field4533.field2773 != this.field4573) {
            return true;
        } else if (client.field768 != this.field4576) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("op.d(IIIIIII)V")
    public void method6457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1571 == null) {
            return;
        }
        int var7 = 512 / (this.field4533.field2773 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6469() - arg4 / 2 - var7;
        int var14 = this.method6483() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4533.field2773 * (var7 + var13 - this.field4574);
        int var16 = arg1 - this.field4533.field2773 * (var7 - (var14 - this.field4575));
        if (this.method6542(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4572 != null && this.field4572.field4768 == var11 && this.field4572.field4770 == var12) {
                Arrays.fill(this.field4572.field4767, 0);
            } else {
                this.field4572 = new class453(var11, var12);
            }
            this.field4574 = this.method6469() - arg4 / 2 - var7;
            this.field4575 = this.method6483() - arg5 / 2 - var7;
            this.field4573 = this.field4533.field2773;
            Statics.field1571.method5370(this.field4574, this.field4575, this.field4572, (float) this.field4573 / var10);
            this.field4576 = client.field768;
            var15 = arg0 - this.field4533.field2773 * (var7 + var13 - this.field4574);
            var16 = arg1 - this.field4533.field2773 * (var7 - (var14 - this.field4575));
        }
        class449.method7203(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4572.method7332(var15, var16, 192);
        } else {
            this.field4572.method7392(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("op.j(IIIIB)V")
    public void method6582(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4534.method6430()) {
            return;
        }
        if (!this.field4533.method4324()) {
            this.field4533.method4317(this.field4520, this.field4531.method4180(), client.field482);
            if (!this.field4533.method4324()) {
                return;
            }
        }
        this.field4533.method4343(arg0, arg1, arg2, arg3, this.field4539, this.field4553, this.field4537);
    }

    @ObfuscatedName("op.z(IB)V")
    public void method6513(int arg0) {
        this.field4540 = this.method6452(arg0);
    }

    @ObfuscatedName("op.i(IIIIII)V")
    public void method6538(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class449.method7204(arg0, arg1, arg2, arg3, -16777216);
        class449.method7208(var7 - 152, var8, 304, 34, -65536);
        class449.method7204(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4526.method5731(class309.field3732, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("op.u(IB)F")
    public float method6452(int arg0) {
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

    @ObfuscatedName("op.ag(I)I")
    public int method6461() {
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

    @ObfuscatedName("op.ar(I)V")
    public void method6456() {
        this.field4534.method6422();
    }

    @ObfuscatedName("op.am(B)Z")
    public boolean method6463() {
        return this.field4534.method6430();
    }

    @ObfuscatedName("op.ac(II)Lhm;")
    public class226 method6464(int arg0) {
        Iterator var2 = this.field4536.values().iterator();
        class226 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class226) var2.next();
        } while (var3.method4139() != arg0);
        return var3;
    }

    @ObfuscatedName("op.ab(III)V")
    public void method6546(int arg0, int arg1) {
        if (this.field4531 != null && this.field4531.method4130(arg0, arg1)) {
            this.field4545 = arg0 - this.field4531.method4169() * 64;
            this.field4538 = arg1 - this.field4531.method4142() * 64;
        }
    }

    @ObfuscatedName("op.aj(III)V")
    public void method6466(int arg0, int arg1) {
        if (this.field4531 != null) {
            this.method6443(arg0 - this.field4531.method4169() * 64, arg1 - this.field4531.method4142() * 64, true);
            this.field4545 = -1;
            this.field4538 = -1;
        }
    }

    @ObfuscatedName("op.ae(IIII)V")
    public void method6467(int arg0, int arg1, int arg2) {
        if (this.field4531 != null) {
            int[] var4 = this.field4531.method4131(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6546(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("op.az(IIIB)V")
    public void method6468(int arg0, int arg1, int arg2) {
        if (this.field4531 != null) {
            int[] var4 = this.field4531.method4131(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6466(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("op.ap(I)I")
    public int method6469() {
        return this.field4531 == null ? -1 : this.field4548 + this.field4531.method4169() * 64;
    }

    @ObfuscatedName("op.as(I)I")
    public int method6483() {
        return this.field4531 == null ? -1 : this.field4522 + this.field4531.method4142() * 64;
    }

    @ObfuscatedName("op.au(B)Lkd;")
    public class290 method6471() {
        return this.field4531 == null ? null : this.field4531.method4132(this.method6469(), this.method6483());
    }

    @ObfuscatedName("op.ak(I)I")
    public int method6571() {
        return this.field4569;
    }

    @ObfuscatedName("op.af(I)I")
    public int method6473() {
        return this.field4562;
    }

    @ObfuscatedName("op.al(IB)V")
    public void method6474(int arg0) {
        if (arg0 >= 1) {
            this.field4551 = arg0;
        }
    }

    @ObfuscatedName("op.aq(B)V")
    public void method6548() {
        this.field4551 = 3;
    }

    @ObfuscatedName("op.ad(II)V")
    public void method6476(int arg0) {
        if (arg0 >= 1) {
            this.field4537 = arg0;
        }
    }

    @ObfuscatedName("op.an(I)V")
    public void method6477() {
        this.field4537 = 50;
    }

    @ObfuscatedName("op.aw(ZB)V")
    public void method6478(boolean arg0) {
        this.field4563 = arg0;
    }

    @ObfuscatedName("op.ah(II)V")
    public void method6624(int arg0) {
        this.field4539 = new HashSet();
        this.field4539.add(arg0);
        this.field4549 = 0;
        this.field4553 = 0;
    }

    @ObfuscatedName("op.ao(II)V")
    public void method6563(int arg0) {
        this.field4539 = new HashSet();
        this.field4549 = 0;
        this.field4553 = 0;
        for (int var2 = 0; var2 < Statics.field1873; var2++) {
            if (class172.method2598(var2) != null && class172.method2598(var2).field1887 == arg0) {
                this.field4539.add(class172.method2598(var2).field1868);
            }
        }
    }

    @ObfuscatedName("op.av(B)V")
    public void method6523() {
        this.field4539 = null;
    }

    @ObfuscatedName("op.ai(ZI)V")
    public void method6475(boolean arg0) {
        this.field4564 = !arg0;
    }

    @ObfuscatedName("op.ay(IZI)V")
    public void method6441(int arg0, boolean arg1) {
        if (arg1) {
            this.field4560.remove(arg0);
        } else {
            this.field4560.add(arg0);
        }
        this.method6488();
    }

    @ObfuscatedName("op.aa(IZB)V")
    public void method6498(int arg0, boolean arg1) {
        if (arg1) {
            this.field4561.remove(arg0);
        } else {
            this.field4561.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1873; var3++) {
            if (class172.method2598(var3) != null && class172.method2598(var3).field1887 == arg0) {
                int var4 = class172.method2598(var3).field1868;
                if (arg1) {
                    this.field4518.remove(var4);
                } else {
                    this.field4518.add(var4);
                }
            }
        }
        this.method6488();
    }

    @ObfuscatedName("op.ax(I)Z")
    public boolean method6485() {
        return !this.field4564;
    }

    @ObfuscatedName("op.at(IB)Z")
    public boolean method6486(int arg0) {
        return !this.field4560.contains(arg0);
    }

    @ObfuscatedName("op.br(IS)Z")
    public boolean method6620(int arg0) {
        return !this.field4561.contains(arg0);
    }

    @ObfuscatedName("op.bc(I)V")
    public void method6488() {
        this.field4535.clear();
        this.field4535.addAll(this.field4560);
        this.field4535.addAll(this.field4518);
    }

    @ObfuscatedName("op.bo(IIIIIII)V")
    public void method6489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4534.method6430()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4546));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4546));
        List var9 = this.field4533.method4322(this.field4548 - var7 / 2 - 1, this.field4522 - var8 / 2 - 1, var7 / 2 + this.field4548 + 1, var8 / 2 + this.field4522 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class244 var11 = (class244) var10.next();
            class172 var12 = class172.method2598(var11.method4095());
            var13 = false;
            for (int var14 = this.field4566.length - 1; var14 >= 0; var14--) {
                if (var12.field1876[var14] != null) {
                    client.method1834(var12.field1876[var14], var12.field1881, this.field4566[var14], var11.method4095(), var11.field2901.method4908(), var11.field2900.method4908());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("op.bl(ILkd;I)Lkd;")
    public class290 method6490(int arg0, class290 arg1) {
        if (!this.field4534.method6430()) {
            return null;
        } else if (!this.field4533.method4324()) {
            return null;
        } else if (this.field4531.method4130(arg1.field3351, arg1.field3354)) {
            HashMap var3 = this.field4533.method4325();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class244 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class244 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2900;
                    }
                    var8 = (class244) var7.next();
                    int var9 = var8.field2900.field3351 - arg1.field3351;
                    int var10 = var8.field2900.field3354 - arg1.field3354;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2900;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("op.bs(IILkd;Lkd;I)V")
    public void method6465(int arg0, int arg1, class290 arg2, class290 arg3) {
        class81 var5 = new class81();
        class249 var6 = new class249(arg1, arg2, arg3);
        var5.method1974(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1970(10);
                break;
            case 1009:
                var5.method1970(11);
                break;
            case 1010:
                var5.method1970(12);
                break;
            case 1011:
                var5.method1970(13);
                break;
            case 1012:
                var5.method1970(14);
        }
        class64.method2749(var5);
    }

    @ObfuscatedName("op.bx(I)Liw;")
    public class244 method6492() {
        if (!this.field4534.method6430()) {
            return null;
        } else if (this.field4533.method4324()) {
            HashMap var1 = this.field4533.method4325();
            this.field4567 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4567.addAll(var3);
            }
            this.field4568 = this.field4567.iterator();
            return this.method6493();
        } else {
            return null;
        }
    }

    @ObfuscatedName("op.bd(B)Liw;")
    public class244 method6493() {
        if (this.field4568 == null) {
            return null;
        }
        class244 var1;
        do {
            if (!this.field4568.hasNext()) {
                return null;
            }
            var1 = (class244) this.field4568.next();
        } while (var1.method4095() == -1);
        return var1;
    }
}
