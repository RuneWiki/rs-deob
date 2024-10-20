package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("oe")
public class class415 {

    @ObfuscatedName("oe.g")
    public class315 field4516;

    @ObfuscatedName("oe.w")
    public class315 field4517;

    @ObfuscatedName("oe.y")
    public class315 field4518;

    @ObfuscatedName("oe.i")
    public static final class417 field4519 = class417.field4580;

    @ObfuscatedName("oe.s")
    public static final class417 field4520 = class417.field4579;

    @ObfuscatedName("oe.t")
    public static final class417 field4521 = class417.field4586;

    @ObfuscatedName("oe.z")
    public class349 field4522;

    @ObfuscatedName("oe.r")
    public HashMap field4523;

    @ObfuscatedName("oe.u")
    public class455[] field4524;

    @ObfuscatedName("oe.k")
    public HashMap field4525;

    @ObfuscatedName("oe.h")
    public class225 field4526;

    @ObfuscatedName("oe.x")
    public class225 field4571;

    @ObfuscatedName("oe.l")
    public class225 field4551;

    @ObfuscatedName("oe.a")
    public class227 field4513;

    @ObfuscatedName("oe.p")
    public class414 field4530;

    @ObfuscatedName("oe.b")
    public int field4531;

    @ObfuscatedName("oe.n")
    public int field4563;

    @ObfuscatedName("oe.o")
    public int field4533 = -1;

    @ObfuscatedName("oe.m")
    public int field4534 = -1;

    @ObfuscatedName("oe.d")
    public float field4570;

    @ObfuscatedName("oe.ad")
    public float field4565;

    @ObfuscatedName("oe.ak")
    public int field4537 = -1;

    @ObfuscatedName("oe.al")
    public int field4550 = -1;

    @ObfuscatedName("oe.ao")
    public int field4539 = -1;

    @ObfuscatedName("oe.ab")
    public int field4564 = -1;

    @ObfuscatedName("oe.ap")
    public int field4541 = 3;

    @ObfuscatedName("oe.ac")
    public int field4538 = 50;

    @ObfuscatedName("oe.ae")
    public boolean field4527 = false;

    @ObfuscatedName("oe.aj")
    public HashSet field4544 = null;

    @ObfuscatedName("oe.am")
    public int field4529 = -1;

    @ObfuscatedName("oe.an")
    public int field4546 = -1;

    @ObfuscatedName("oe.af")
    public int field4547 = -1;

    @ObfuscatedName("oe.ax")
    public int field4548 = -1;

    @ObfuscatedName("oe.ar")
    public int field4540 = -1;

    @ObfuscatedName("oe.at")
    public int field4568 = -1;

    @ObfuscatedName("oe.ag")
    public long field4535;

    @ObfuscatedName("oe.aq")
    public int field4552;

    @ObfuscatedName("oe.ah")
    public int field4553;

    @ObfuscatedName("oe.ai")
    public boolean field4515 = true;

    @ObfuscatedName("oe.aw")
    public HashSet field4555 = new HashSet();

    @ObfuscatedName("oe.au")
    public HashSet field4556 = new HashSet();

    @ObfuscatedName("oe.aa")
    public HashSet field4557 = new HashSet();

    @ObfuscatedName("oe.ay")
    public HashSet field4562 = new HashSet();

    @ObfuscatedName("oe.as")
    public boolean field4559 = false;

    @ObfuscatedName("oe.be")
    public int field4560 = 0;

    @ObfuscatedName("oe.bp")
    public final int[] field4554 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("oe.bf")
    public List field4549;

    @ObfuscatedName("oe.bg")
    public Iterator field4558;

    @ObfuscatedName("oe.br")
    public HashSet field4532 = new HashSet();

    @ObfuscatedName("oe.bn")
    public class289 field4543 = null;

    @ObfuscatedName("oe.bq")
    public boolean field4566 = false;

    @ObfuscatedName("oe.bc")
    public class456 field4542;

    @ObfuscatedName("oe.bl")
    public int field4567;

    @ObfuscatedName("oe.bv")
    public int field4569 = -1;

    @ObfuscatedName("oe.bt")
    public int field4536 = -1;

    @ObfuscatedName("oe.bh")
    public int field4561 = -1;

    @ObfuscatedName("oe.c(Llh;Llh;Llh;Lmt;Ljava/util/HashMap;[Lqu;B)V")
    public void method6722(class315 arg0, class315 arg1, class315 arg2, class349 arg3, HashMap arg4, class455[] arg5) {
        this.field4524 = arg5;
        this.field4516 = arg0;
        this.field4517 = arg1;
        this.field4518 = arg2;
        this.field4522 = arg3;
        this.field4523 = new HashMap();
        this.field4523.put(class222.field2675, arg4.get(field4519));
        this.field4523.put(class222.field2670, arg4.get(field4520));
        this.field4523.put(class222.field2671, arg4.get(field4521));
        this.field4530 = new class414(arg0);
        int var7 = this.field4516.method5349(class244.field2868.field2865);
        int[] var8 = this.field4516.method5309(var7);
        this.field4525 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class443 var10 = new class443(this.field4516.method5305(var7, var8[var9]));
            class225 var11 = new class225();
            var11.method4272(var10, var8[var9]);
            this.field4525.put(var11.method4338(), var11);
            if (var11.method4280()) {
                this.field4526 = var11;
            }
        }
        this.method6546(this.field4526);
        this.field4551 = null;
    }

    @ObfuscatedName("oe.v(I)V")
    public void method6532() {
        class226.field2716.method4665(5);
    }

    @ObfuscatedName("oe.q(IIZIIIII)V")
    public void method6533(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4530.method6521()) {
            return;
        }
        this.method6648();
        this.method6560();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4570));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4570));
        List var10 = this.field4513.method4469(this.field4531 - var8 / 2 - 1, this.field4563 - var9 / 2 - 1, var8 / 2 + this.field4531 + 1, var9 / 2 + this.field4563 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class243 var13 = (class243) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class248 var15 = new class248(var13.method4228(), var13.field2860, var13.field2861);
            var14.method2004(new Object[] { var15, arg0, arg1 });
            if (this.field4532.contains(var13)) {
                var14.method2005(17);
            } else {
                var14.method2005(15);
            }
            class64.method4199(var14);
        }
        Iterator var16 = this.field4532.iterator();
        while (var16.hasNext()) {
            class243 var17 = (class243) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class248 var19 = new class248(var17.method4228(), var17.field2860, var17.field2861);
                var18.method2004(new Object[] { var19, arg0, arg1 });
                var18.method2005(16);
                class64.method4199(var18);
            }
        }
        this.field4532 = var11;
    }

    @ObfuscatedName("oe.f(IIZZS)V")
    public void method6657(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class269.method2567();
            this.method6567(arg0, arg1, arg3, var5);
            if (!this.method6719() && (arg3 || arg2)) {
                boolean var7 = client.field484 != null;
                if (!var7) {
                    if (arg3) {
                        this.field4540 = arg0;
                        this.field4568 = arg1;
                        this.field4547 = this.field4531;
                        this.field4548 = this.field4563;
                    }
                    if (this.field4547 != -1) {
                        int var8 = arg0 - this.field4540;
                        int var9 = arg1 - this.field4568;
                        this.method6538(this.field4547 - (int) ((float) var8 / this.field4565), this.field4548 + (int) ((float) var9 / this.field4565), false);
                    }
                    break label33;
                }
            }
            this.method6539();
        }
        if (arg3) {
            this.field4535 = var5;
            this.field4552 = arg0;
            this.field4553 = arg1;
        }
    }

    @ObfuscatedName("oe.j(IIZJ)V")
    public void method6567(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4571 == null) {
            this.field4543 = null;
            return;
        }
        int var6 = (int) ((float) this.field4531 + ((float) (arg0 - this.field4539) - (float) this.method6568() * this.field4570 / 2.0F) / this.field4570);
        int var7 = (int) ((float) this.field4563 - ((float) (arg1 - this.field4564) - (float) this.method6569() * this.field4570 / 2.0F) / this.field4570);
        this.field4543 = this.field4571.method4277(var6 + this.field4571.method4283() * 64, var7 + this.field4571.method4287() * 64);
        if (this.field4543 == null || !arg2) {
            return;
        }
        boolean var8 = client.field664 >= 2;
        if (var8 && class24.field136[82] && class24.field136[81]) {
            int var9 = this.field4543.field3328;
            int var10 = this.field4543.field3330;
            int var11 = this.field4543.field3329;
            class264 var12 = class264.method3158(class262.field2967, client.field541.field1344);
            var12.field3031.method7077(var11);
            var12.field3031.method7085(var10);
            var12.field3031.method7074(0);
            var12.field3031.method7085(var9);
            client.field541.method2378(var12);
            return;
        }
        boolean var13 = true;
        if (this.field4515) {
            int var14 = arg0 - this.field4552;
            int var15 = arg1 - this.field4553;
            if (arg3 - this.field4535 > 500L || var14 < -25 || var14 > 25 || var15 < -25 || var15 > 25) {
                var13 = false;
            }
        }
        if (var13) {
            class264 var16 = class264.method3158(class262.field2991, client.field541.field1344);
            var16.field3031.method7097(this.field4543.method5002());
            client.field541.method2378(var16);
            this.field4535 = 0L;
        }
    }

    @ObfuscatedName("oe.e(I)V")
    public void method6648() {
        if (Statics.field1363 != null) {
            this.field4570 = this.field4565;
            return;
        }
        if (this.field4570 < this.field4565) {
            this.field4570 = Math.min(this.field4565, this.field4570 / 30.0F + this.field4570);
        }
        if (this.field4570 > this.field4565) {
            this.field4570 = Math.max(this.field4565, this.field4570 - this.field4570 / 30.0F);
        }
    }

    @ObfuscatedName("oe.g(I)V")
    public void method6560() {
        if (!this.method6719()) {
            return;
        }
        int var1 = this.field4533 - this.field4531;
        int var2 = this.field4534 - this.field4563;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6538(this.field4531 + var1, this.field4563 + var2, true);
        if (this.field4533 == this.field4531 && this.field4563 == this.field4534) {
            this.field4533 = -1;
            this.field4534 = -1;
        }
    }

    @ObfuscatedName("oe.w(IIZI)V")
    public final void method6538(int arg0, int arg1, boolean arg2) {
        this.field4531 = arg0;
        this.field4563 = arg1;
        class269.method2567();
        if (arg2) {
            this.method6539();
        }
    }

    @ObfuscatedName("oe.y(I)V")
    public final void method6539() {
        this.field4568 = -1;
        this.field4540 = -1;
        this.field4548 = -1;
        this.field4547 = -1;
    }

    @ObfuscatedName("oe.i(I)Z")
    public boolean method6719() {
        return this.field4533 != -1 && this.field4534 != -1;
    }

    @ObfuscatedName("oe.s(IIIB)Lhg;")
    public class225 method6541(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4525.values().iterator();
        class225 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class225) var4.next();
        } while (!var5.method4274(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("oe.t(IIIZI)V")
    public void method6542(int arg0, int arg1, int arg2, boolean arg3) {
        class225 var5 = this.method6541(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4526;
        }
        boolean var6 = false;
        if (this.field4551 != var5 || arg3) {
            this.field4551 = var5;
            this.method6546(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6686(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("oe.z(II)V")
    public void method6543(int arg0) {
        class225 var2 = this.method6587(arg0);
        if (var2 != null) {
            this.method6546(var2);
        }
    }

    @ObfuscatedName("oe.r(B)I")
    public int method6544() {
        return this.field4571 == null ? -1 : this.field4571.method4279();
    }

    @ObfuscatedName("oe.u(I)Lhg;")
    public class225 method6545() {
        return this.field4571;
    }

    @ObfuscatedName("oe.k(Lhg;I)V")
    public void method6546(class225 arg0) {
        if (this.field4571 == null || this.field4571 != arg0) {
            this.method6547(arg0);
            this.method6686(-1, -1, -1);
        }
    }

    @ObfuscatedName("oe.h(Lhg;I)V")
    public void method6547(class225 arg0) {
        this.field4571 = arg0;
        this.field4513 = new class227(this.field4524, this.field4523, this.field4517, this.field4518);
        this.field4530.method6519(this.field4571.method4338());
    }

    @ObfuscatedName("oe.x(Lhg;Lkd;Lkd;ZI)V")
    public void method6642(class225 arg0, class289 arg1, class289 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4571 == null || this.field4571 != arg0) {
            this.method6547(arg0);
        }
        if (!arg3 && this.field4571.method4274(arg1.field3329, arg1.field3328, arg1.field3330)) {
            this.method6686(arg1.field3329, arg1.field3328, arg1.field3330);
        } else {
            this.method6686(arg2.field3329, arg2.field3328, arg2.field3330);
        }
    }

    @ObfuscatedName("oe.l(IIII)V")
    public void method6686(int arg0, int arg1, int arg2) {
        if (this.field4571 == null) {
            return;
        }
        int[] var4 = this.field4571.method4276(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4571.method4276(this.field4571.method4290(), this.field4571.method4289(), this.field4571.method4299());
        }
        this.method6538(var4[0] - this.field4571.method4283() * 64, var4[1] - this.field4571.method4287() * 64, true);
        this.field4533 = -1;
        this.field4534 = -1;
        this.field4570 = this.method6556(this.field4571.method4284());
        this.field4565 = this.field4570;
        this.field4549 = null;
        this.field4558 = null;
        this.field4513.method4465();
    }

    @ObfuscatedName("oe.a(IIIIIB)V")
    public void method6629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class452.method7407(var6);
        class452.method7402(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class452.method7400(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4530.method6527();
        if (var7 < 100) {
            this.method6555(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4513.method4485()) {
            this.field4513.method4481(this.field4516, this.field4571.method4338(), client.field480);
            if (!this.field4513.method4485()) {
                return;
            }
        }
        if (this.field4544 != null) {
            this.field4546++;
            if (this.field4546 % this.field4538 == 0) {
                this.field4546 = 0;
                this.field4529++;
            }
            if (this.field4529 >= this.field4541 && !this.field4527) {
                this.field4544 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4570));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4570));
        this.field4513.method4486(this.field4531 - var8 / 2, this.field4563 - var9 / 2, var8 / 2 + this.field4531, var9 / 2 + this.field4563, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4559) {
            boolean var10 = false;
            if (arg4 - this.field4560 > 100) {
                this.field4560 = arg4;
                var10 = true;
            }
            this.field4513.method4492(this.field4531 - var8 / 2, this.field4563 - var9 / 2, var8 / 2 + this.field4531, var9 / 2 + this.field4563, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4562, this.field4544, this.field4546, this.field4538, var10);
        }
        this.method6552(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field664 >= 2;
        if (var11 && this.field4566 && this.field4543 != null) {
            this.field4522.method5806("Coord: " + this.field4543, class452.field4768 + 10, class452.field4771 + 20, 16776960, -1);
        }
        this.field4537 = var8;
        this.field4550 = var9;
        this.field4539 = arg0;
        this.field4564 = arg1;
        class452.method7340(var6);
    }

    @ObfuscatedName("oe.p(IIIIIIB)Z")
    public boolean method6551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4542 == null) {
            return true;
        } else if (this.field4542.field4796 != arg0 || this.field4542.field4795 != arg1) {
            return true;
        } else if (this.field4513.field2743 != this.field4567) {
            return true;
        } else if (client.field771 != this.field4561) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("oe.b(IIIIIII)V")
    public void method6552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1363 == null) {
            return;
        }
        int var7 = 512 / (this.field4513.field2743 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6694() - arg4 / 2 - var7;
        int var14 = this.method6570() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4513.field2743 * (var7 + var13 - this.field4569);
        int var16 = arg1 - this.field4513.field2743 * (var7 - (var14 - this.field4536));
        if (this.method6551(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4542 != null && this.field4542.field4796 == var11 && this.field4542.field4795 == var12) {
                Arrays.fill(this.field4542.field4804, 0);
            } else {
                this.field4542 = new class456(var11, var12);
            }
            this.field4569 = this.method6694() - arg4 / 2 - var7;
            this.field4536 = this.method6570() - arg5 / 2 - var7;
            this.field4567 = this.field4513.field2743;
            Statics.field1363.method5489(this.field4569, this.field4536, this.field4542, (float) this.field4567 / var10);
            this.field4561 = client.field771;
            var15 = arg0 - this.field4513.field2743 * (var7 + var13 - this.field4569);
            var16 = arg1 - this.field4513.field2743 * (var7 - (var14 - this.field4536));
        }
        class452.method7350(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4542.method7469(var15, var16, 192);
        } else {
            this.field4542.method7453(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("oe.n(IIIIB)V")
    public void method6553(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4530.method6521()) {
            return;
        }
        if (!this.field4513.method4485()) {
            this.field4513.method4481(this.field4516, this.field4571.method4338(), client.field480);
            if (!this.field4513.method4485()) {
                return;
            }
        }
        this.field4513.method4482(arg0, arg1, arg2, arg3, this.field4544, this.field4546, this.field4538);
    }

    @ObfuscatedName("oe.o(II)V")
    public void method6554(int arg0) {
        this.field4565 = this.method6556(arg0);
    }

    @ObfuscatedName("oe.m(IIIIII)V")
    public void method6555(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class452.method7400(arg0, arg1, arg2, arg3, -16777216);
        class452.method7355(var7 - 152, var8, 304, 34, -65536);
        class452.method7400(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4522.method5867(class308.field3937, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("oe.d(II)F")
    public float method6556(int arg0) {
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

    @ObfuscatedName("oe.ad(I)I")
    public int method6557() {
        if ((double) this.field4565 == 1.0D) {
            return 25;
        } else if ((double) this.field4565 == 1.5D) {
            return 37;
        } else if ((double) this.field4565 == 2.0D) {
            return 50;
        } else if ((double) this.field4565 == 3.0D) {
            return 75;
        } else if ((double) this.field4565 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("oe.ak(B)V")
    public void method6558() {
        this.field4530.method6520();
    }

    @ObfuscatedName("oe.al(I)Z")
    public boolean method6559() {
        return this.field4530.method6521();
    }

    @ObfuscatedName("oe.ao(II)Lhg;")
    public class225 method6587(int arg0) {
        Iterator var2 = this.field4525.values().iterator();
        class225 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class225) var2.next();
        } while (var3.method4279() != arg0);
        return var3;
    }

    @ObfuscatedName("oe.ab(III)V")
    public void method6571(int arg0, int arg1) {
        if (this.field4571 != null && this.field4571.method4275(arg0, arg1)) {
            this.field4533 = arg0 - this.field4571.method4283() * 64;
            this.field4534 = arg1 - this.field4571.method4287() * 64;
        }
    }

    @ObfuscatedName("oe.ap(III)V")
    public void method6695(int arg0, int arg1) {
        if (this.field4571 != null) {
            this.method6538(arg0 - this.field4571.method4283() * 64, arg1 - this.field4571.method4287() * 64, true);
            this.field4533 = -1;
            this.field4534 = -1;
        }
    }

    @ObfuscatedName("oe.ac(IIIB)V")
    public void method6534(int arg0, int arg1, int arg2) {
        if (this.field4571 != null) {
            int[] var4 = this.field4571.method4276(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6571(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("oe.ae(IIIB)V")
    public void method6564(int arg0, int arg1, int arg2) {
        if (this.field4571 != null) {
            int[] var4 = this.field4571.method4276(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6695(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("oe.aj(I)I")
    public int method6694() {
        return this.field4571 == null ? -1 : this.field4531 + this.field4571.method4283() * 64;
    }

    @ObfuscatedName("oe.am(I)I")
    public int method6570() {
        return this.field4571 == null ? -1 : this.field4563 + this.field4571.method4287() * 64;
    }

    @ObfuscatedName("oe.an(B)Lkd;")
    public class289 method6562() {
        return this.field4571 == null ? null : this.field4571.method4277(this.method6694(), this.method6570());
    }

    @ObfuscatedName("oe.af(I)I")
    public int method6568() {
        return this.field4537;
    }

    @ObfuscatedName("oe.ax(I)I")
    public int method6569() {
        return this.field4550;
    }

    @ObfuscatedName("oe.ar(IB)V")
    public void method6703(int arg0) {
        if (arg0 >= 1) {
            this.field4541 = arg0;
        }
    }

    @ObfuscatedName("oe.at(I)V")
    public void method6609() {
        this.field4541 = 3;
    }

    @ObfuscatedName("oe.ag(II)V")
    public void method6572(int arg0) {
        if (arg0 >= 1) {
            this.field4538 = arg0;
        }
    }

    @ObfuscatedName("oe.aq(I)V")
    public void method6573() {
        this.field4538 = 50;
    }

    @ObfuscatedName("oe.ah(ZI)V")
    public void method6574(boolean arg0) {
        this.field4527 = arg0;
    }

    @ObfuscatedName("oe.ai(II)V")
    public void method6639(int arg0) {
        this.field4544 = new HashSet();
        this.field4544.add(arg0);
        this.field4529 = 0;
        this.field4546 = 0;
    }

    @ObfuscatedName("oe.az(II)V")
    public void method6625(int arg0) {
        this.field4544 = new HashSet();
        this.field4529 = 0;
        this.field4546 = 0;
        for (int var2 = 0; var2 < Statics.field1836; var2++) {
            if (class171.method6889(var2) != null && class171.method6889(var2).field1850 == arg0) {
                this.field4544.add(class171.method6889(var2).field1849);
            }
        }
    }

    @ObfuscatedName("oe.av(I)V")
    public void method6576() {
        this.field4544 = null;
    }

    @ObfuscatedName("oe.aw(ZS)V")
    public void method6577(boolean arg0) {
        this.field4559 = !arg0;
    }

    @ObfuscatedName("oe.au(IZI)V")
    public void method6578(int arg0, boolean arg1) {
        if (arg1) {
            this.field4555.remove(arg0);
        } else {
            this.field4555.add(arg0);
        }
        this.method6583();
    }

    @ObfuscatedName("oe.ay(IZI)V")
    public void method6579(int arg0, boolean arg1) {
        if (arg1) {
            this.field4556.remove(arg0);
        } else {
            this.field4556.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1836; var3++) {
            if (class171.method6889(var3) != null && class171.method6889(var3).field1850 == arg0) {
                int var4 = class171.method6889(var3).field1849;
                if (arg1) {
                    this.field4557.remove(var4);
                } else {
                    this.field4557.add(var4);
                }
            }
        }
        this.method6583();
    }

    @ObfuscatedName("oe.as(B)Z")
    public boolean method6580() {
        return !this.field4559;
    }

    @ObfuscatedName("oe.be(IB)Z")
    public boolean method6581(int arg0) {
        return !this.field4555.contains(arg0);
    }

    @ObfuscatedName("oe.bz(IB)Z")
    public boolean method6530(int arg0) {
        return !this.field4556.contains(arg0);
    }

    @ObfuscatedName("oe.bp(I)V")
    public void method6583() {
        this.field4562.clear();
        this.field4562.addAll(this.field4555);
        this.field4562.addAll(this.field4557);
    }

    @ObfuscatedName("oe.bf(IIIIIII)V")
    public void method6584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4530.method6521()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4570));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4570));
        List var9 = this.field4513.method4469(this.field4531 - var7 / 2 - 1, this.field4563 - var8 / 2 - 1, var7 / 2 + this.field4531 + 1, var8 / 2 + this.field4563 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class171 var12 = class171.method6889(var11.method4228());
            var13 = false;
            for (int var14 = this.field4554.length - 1; var14 >= 0; var14--) {
                if (var12.field1837[var14] != null) {
                    client.method11(var12.field1837[var14], var12.field1840, this.field4554[var14], var11.method4228(), var11.field2860.method5002(), var11.field2861.method5002());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("oe.bg(ILkd;S)Lkd;")
    public class289 method6585(int arg0, class289 arg1) {
        if (!this.field4530.method6521()) {
            return null;
        } else if (!this.field4513.method4485()) {
            return null;
        } else if (this.field4571.method4275(arg1.field3328, arg1.field3330)) {
            HashMap var3 = this.field4513.method4472();
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
                        return var5.field2861;
                    }
                    var8 = (class243) var7.next();
                    int var9 = var8.field2861.field3328 - arg1.field3328;
                    int var10 = var8.field2861.field3330 - arg1.field3330;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2861;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("oe.br(IILkd;Lkd;I)V")
    public void method6636(int arg0, int arg1, class289 arg2, class289 arg3) {
        class81 var5 = new class81();
        class248 var6 = new class248(arg1, arg2, arg3);
        var5.method2004(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2005(10);
                break;
            case 1009:
                var5.method2005(11);
                break;
            case 1010:
                var5.method2005(12);
                break;
            case 1011:
                var5.method2005(13);
                break;
            case 1012:
                var5.method2005(14);
        }
        class64.method4199(var5);
    }

    @ObfuscatedName("oe.bn(I)Lim;")
    public class243 method6540() {
        if (!this.field4530.method6521()) {
            return null;
        } else if (this.field4513.method4485()) {
            HashMap var1 = this.field4513.method4472();
            this.field4549 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4549.addAll(var3);
            }
            this.field4558 = this.field4549.iterator();
            return this.method6670();
        } else {
            return null;
        }
    }

    @ObfuscatedName("oe.bq(B)Lim;")
    public class243 method6670() {
        if (this.field4558 == null) {
            return null;
        }
        class243 var1;
        do {
            if (!this.field4558.hasNext()) {
                return null;
            }
            var1 = (class243) this.field4558.next();
        } while (var1.method4228() == -1);
        return var1;
    }
}
