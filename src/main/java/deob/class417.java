package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("pi")
public class class417 {

    @ObfuscatedName("pi.s")
    public class317 field4573;

    @ObfuscatedName("pi.q")
    public class317 field4552;

    @ObfuscatedName("pi.m")
    public class317 field4559;

    @ObfuscatedName("pi.x")
    public static final class419 field4560 = class419.field4624;

    @ObfuscatedName("pi.j")
    public static final class419 field4561 = class419.field4616;

    @ObfuscatedName("pi.v")
    public static final class419 field4562 = class419.field4621;

    @ObfuscatedName("pi.h")
    public class351 field4597;

    @ObfuscatedName("pi.t")
    public HashMap field4564;

    @ObfuscatedName("pi.u")
    public class457[] field4565;

    @ObfuscatedName("pi.d")
    public HashMap field4566;

    @ObfuscatedName("pi.b")
    public class226 field4567;

    @ObfuscatedName("pi.a")
    public class226 field4569;

    @ObfuscatedName("pi.l")
    public class226 field4581;

    @ObfuscatedName("pi.e")
    public class228 field4570;

    @ObfuscatedName("pi.g")
    public class416 field4571;

    @ObfuscatedName("pi.y")
    public int field4588;

    @ObfuscatedName("pi.i")
    public int field4610;

    @ObfuscatedName("pi.r")
    public int field4596 = -1;

    @ObfuscatedName("pi.z")
    public int field4598 = -1;

    @ObfuscatedName("pi.o")
    public float field4576;

    @ObfuscatedName("pi.as")
    public float field4577;

    @ObfuscatedName("pi.ac")
    public int field4578 = -1;

    @ObfuscatedName("pi.ao")
    public int field4579 = -1;

    @ObfuscatedName("pi.ar")
    public int field4580 = -1;

    @ObfuscatedName("pi.aq")
    public int field4558 = -1;

    @ObfuscatedName("pi.ai")
    public int field4582 = 3;

    @ObfuscatedName("pi.an")
    public int field4583 = 50;

    @ObfuscatedName("pi.aa")
    public boolean field4609 = false;

    @ObfuscatedName("pi.ak")
    public HashSet field4585 = null;

    @ObfuscatedName("pi.am")
    public int field4586 = -1;

    @ObfuscatedName("pi.ap")
    public int field4584 = -1;

    @ObfuscatedName("pi.ab")
    public int field4574 = -1;

    @ObfuscatedName("pi.az")
    public int field4589 = -1;

    @ObfuscatedName("pi.ad")
    public int field4590 = -1;

    @ObfuscatedName("pi.af")
    public int field4591 = -1;

    @ObfuscatedName("pi.aj")
    public long field4592;

    @ObfuscatedName("pi.ax")
    public int field4593;

    @ObfuscatedName("pi.av")
    public int field4594;

    @ObfuscatedName("pi.ae")
    public boolean field4555 = true;

    @ObfuscatedName("pi.aw")
    public HashSet field4568 = new HashSet();

    @ObfuscatedName("pi.ah")
    public HashSet field4553 = new HashSet();

    @ObfuscatedName("pi.at")
    public HashSet field4572 = new HashSet();

    @ObfuscatedName("pi.al")
    public HashSet field4599 = new HashSet();

    @ObfuscatedName("pi.au")
    public boolean field4600 = false;

    @ObfuscatedName("pi.bg")
    public int field4601 = 0;

    @ObfuscatedName("pi.bc")
    public final int[] field4602 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("pi.bv")
    public List field4603;

    @ObfuscatedName("pi.bi")
    public Iterator field4604;

    @ObfuscatedName("pi.bj")
    public HashSet field4563 = new HashSet();

    @ObfuscatedName("pi.by")
    public class291 field4606 = null;

    @ObfuscatedName("pi.bz")
    public boolean field4607 = false;

    @ObfuscatedName("pi.bo")
    public class458 field4608;

    @ObfuscatedName("pi.br")
    public int field4595;

    @ObfuscatedName("pi.bp")
    public int field4587 = -1;

    @ObfuscatedName("pi.bd")
    public int field4611 = -1;

    @ObfuscatedName("pi.bl")
    public int field4612 = -1;

    @ObfuscatedName("pi.c(Llv;Llv;Llv;Lmv;Ljava/util/HashMap;[Lqu;S)V")
    public void method6870(class317 arg0, class317 arg1, class317 arg2, class351 arg3, HashMap arg4, class457[] arg5) {
        this.field4565 = arg5;
        this.field4573 = arg0;
        this.field4552 = arg1;
        this.field4559 = arg2;
        this.field4597 = arg3;
        this.field4564 = new HashMap();
        this.field4564.put(class223.field2702, arg4.get(field4560));
        this.field4564.put(class223.field2707, arg4.get(field4561));
        this.field4564.put(class223.field2708, arg4.get(field4562));
        this.field4571 = new class416(arg0);
        int var7 = this.field4573.method5482(class245.field2897.field2898);
        int[] var8 = this.field4573.method5424(var7);
        this.field4566 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class445 var10 = new class445(this.field4573.method5499(var7, var8[var9]));
            class226 var11 = new class226();
            var11.method4338(var10, var8[var9]);
            this.field4566.put(var11.method4347(), var11);
            if (var11.method4346()) {
                this.field4567 = var11;
            }
        }
        this.method6714(this.field4567);
        this.field4581 = null;
    }

    @ObfuscatedName("pi.p(I)V")
    public void method6708() {
        class227.field2753.method4751(5);
    }

    @ObfuscatedName("pi.f(IIZIIIIB)V")
    public void method6701(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4571.method6683()) {
            return;
        }
        this.method6704();
        this.method6705();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4576));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4576));
        List var10 = this.field4570.method4546(this.field4588 - var8 / 2 - 1, this.field4610 - var9 / 2 - 1, var8 / 2 + this.field4588 + 1, var9 / 2 + this.field4610 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class244 var13 = (class244) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class249 var15 = new class249(var13.method4295(), var13.field2893, var13.field2888);
            var14.method2145(new Object[] { var15, arg0, arg1 });
            if (this.field4563.contains(var13)) {
                var14.method2146(17);
            } else {
                var14.method2146(15);
            }
            class64.method5903(var14);
        }
        Iterator var16 = this.field4563.iterator();
        while (var16.hasNext()) {
            class244 var17 = (class244) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class249 var19 = new class249(var17.method4295(), var17.field2893, var17.field2888);
                var18.method2145(new Object[] { var19, arg0, arg1 });
                var18.method2146(16);
                class64.method5903(var18);
            }
        }
        this.field4563 = var11;
    }

    @ObfuscatedName("pi.n(IIZZI)V")
    public void method6702(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class271.method5624();
        this.method6892(arg0, arg1, arg3, var5);
        if (this.method6744() || !(arg3 || arg2) || client.method3445()) {
            this.method6707();
        } else {
            if (arg3) {
                this.field4590 = arg0;
                this.field4591 = arg1;
                this.field4574 = this.field4588;
                this.field4589 = this.field4610;
            }
            if (this.field4574 != -1) {
                int var7 = arg0 - this.field4590;
                int var8 = arg1 - this.field4591;
                this.method6706(this.field4574 - (int) ((float) var7 / this.field4577), this.field4589 + (int) ((float) var8 / this.field4577), false);
            }
        }
        if (arg3) {
            this.field4592 = var5;
            this.field4593 = arg0;
            this.field4594 = arg1;
        }
    }

    @ObfuscatedName("pi.k(IIZJ)V")
    public void method6892(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4569 == null) {
            this.field4606 = null;
            return;
        }
        int var6 = (int) ((float) this.field4588 + ((float) (arg0 - this.field4580) - (float) this.method6736() * this.field4576 / 2.0F) / this.field4576);
        int var7 = (int) ((float) this.field4610 - ((float) (arg1 - this.field4558) - (float) this.method6833() * this.field4576 / 2.0F) / this.field4576);
        this.field4606 = this.field4569.method4337(var6 + this.field4569.method4351() * 64, var7 + this.field4569.method4353() * 64);
        if (this.field4606 == null || !arg2) {
            return;
        }
        if (client.method1024() && class24.field123[82] && class24.field123[81]) {
            client.method4644(this.field4606.field3349, this.field4606.field3350, this.field4606.field3351, false);
            return;
        }
        boolean var8 = true;
        if (this.field4555) {
            int var9 = arg0 - this.field4593;
            int var10 = arg1 - this.field4594;
            if (arg3 - this.field4592 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class266 var11 = Statics.method2786(class264.field2992, client.field552.field1342);
            var11.field3064.method7189(this.field4606.method5123());
            client.field552.method2534(var11);
            this.field4592 = 0L;
        }
    }

    @ObfuscatedName("pi.w(I)V")
    public void method6704() {
        if (Statics.field1324 != null) {
            this.field4576 = this.field4577;
            return;
        }
        if (this.field4576 < this.field4577) {
            this.field4576 = Math.min(this.field4577, this.field4576 / 30.0F + this.field4576);
        }
        if (this.field4576 > this.field4577) {
            this.field4576 = Math.max(this.field4577, this.field4576 - this.field4576 / 30.0F);
        }
    }

    @ObfuscatedName("pi.s(B)V")
    public void method6705() {
        if (!this.method6744()) {
            return;
        }
        int var1 = this.field4596 - this.field4588;
        int var2 = this.field4598 - this.field4610;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6706(this.field4588 + var1, this.field4610 + var2, true);
        if (this.field4596 == this.field4588 && this.field4610 == this.field4598) {
            this.field4596 = -1;
            this.field4598 = -1;
        }
    }

    @ObfuscatedName("pi.q(IIZI)V")
    public final void method6706(int arg0, int arg1, boolean arg2) {
        this.field4588 = arg0;
        this.field4610 = arg1;
        class271.method5624();
        if (arg2) {
            this.method6707();
        }
    }

    @ObfuscatedName("pi.m(S)V")
    public final void method6707() {
        this.field4591 = -1;
        this.field4590 = -1;
        this.field4589 = -1;
        this.field4574 = -1;
    }

    @ObfuscatedName("pi.x(I)Z")
    public boolean method6744() {
        return this.field4596 != -1 && this.field4598 != -1;
    }

    @ObfuscatedName("pi.j(IIIB)Lht;")
    public class226 method6859(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4566.values().iterator();
        class226 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class226) var4.next();
        } while (!var5.method4340(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("pi.v(IIIZB)V")
    public void method6819(int arg0, int arg1, int arg2, boolean arg3) {
        class226 var5 = this.method6859(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4567;
        }
        boolean var6 = false;
        if (this.field4581 != var5 || arg3) {
            this.field4581 = var5;
            this.method6714(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6717(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pi.h(II)V")
    public void method6711(int arg0) {
        class226 var2 = this.method6728(arg0);
        if (var2 != null) {
            this.method6714(var2);
        }
    }

    @ObfuscatedName("pi.t(I)I")
    public int method6723() {
        return this.field4569 == null ? -1 : this.field4569.method4345();
    }

    @ObfuscatedName("pi.u(B)Lht;")
    public class226 method6842() {
        return this.field4569;
    }

    @ObfuscatedName("pi.d(Lht;I)V")
    public void method6714(class226 arg0) {
        if (this.field4569 == null || this.field4569 != arg0) {
            this.method6894(arg0);
            this.method6717(-1, -1, -1);
        }
    }

    @ObfuscatedName("pi.b(Lht;I)V")
    public void method6894(class226 arg0) {
        this.field4569 = arg0;
        this.field4570 = new class228(this.field4565, this.field4564, this.field4552, this.field4559);
        this.field4571.method6681(this.field4569.method4347());
    }

    @ObfuscatedName("pi.a(Lht;Lkz;Lkz;ZI)V")
    public void method6741(class226 arg0, class291 arg1, class291 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4569 == null || this.field4569 != arg0) {
            this.method6894(arg0);
        }
        if (!arg3 && this.field4569.method4340(arg1.field3351, arg1.field3349, arg1.field3350)) {
            this.method6717(arg1.field3351, arg1.field3349, arg1.field3350);
        } else {
            this.method6717(arg2.field3351, arg2.field3349, arg2.field3350);
        }
    }

    @ObfuscatedName("pi.l(IIII)V")
    public void method6717(int arg0, int arg1, int arg2) {
        if (this.field4569 == null) {
            return;
        }
        int[] var4 = this.field4569.method4414(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4569.method4414(this.field4569.method4362(), this.field4569.method4355(), this.field4569.method4376());
        }
        this.method6706(var4[0] - this.field4569.method4351() * 64, var4[1] - this.field4569.method4353() * 64, true);
        this.field4596 = -1;
        this.field4598 = -1;
        this.field4576 = this.method6724(this.field4569.method4350());
        this.field4577 = this.field4576;
        this.field4603 = null;
        this.field4604 = null;
        this.field4570.method4542();
    }

    @ObfuscatedName("pi.e(IIIIII)V")
    public void method6718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class454.method7485(var6);
        class454.method7487(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class454.method7518(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4571.method6685();
        if (var7 < 100) {
            this.method6756(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4570.method4548()) {
            this.field4570.method4540(this.field4573, this.field4569.method4347(), client.field685);
            if (!this.field4570.method4548()) {
                return;
            }
        }
        if (this.field4585 != null) {
            this.field4584++;
            if (this.field4584 % this.field4583 == 0) {
                this.field4584 = 0;
                this.field4586++;
            }
            if (this.field4586 >= this.field4582 && !this.field4609) {
                this.field4585 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4576));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4576));
        this.field4570.method4556(this.field4588 - var8 / 2, this.field4610 - var9 / 2, var8 / 2 + this.field4588, var9 / 2 + this.field4610, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4600) {
            boolean var10 = false;
            if (arg4 - this.field4601 > 100) {
                this.field4601 = arg4;
                var10 = true;
            }
            this.field4570.method4544(this.field4588 - var8 / 2, this.field4610 - var9 / 2, var8 / 2 + this.field4588, var9 / 2 + this.field4610, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4599, this.field4585, this.field4584, this.field4583, var10);
        }
        this.method6720(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field675 >= 2;
        if (var11 && this.field4607 && this.field4606 != null) {
            this.field4597.method5953("Coord: " + this.field4606, class454.field4799 + 10, class454.field4802 + 20, 16776960, -1);
        }
        this.field4578 = var8;
        this.field4579 = var9;
        this.field4580 = arg0;
        this.field4558 = arg1;
        class454.method7529(var6);
    }

    @ObfuscatedName("pi.g(IIIIIII)Z")
    public boolean method6727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4608 == null) {
            return true;
        } else if (this.field4608.field4825 != arg0 || this.field4608.field4829 != arg1) {
            return true;
        } else if (this.field4570.field2777 != this.field4595) {
            return true;
        } else if (client.field783 != this.field4612) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("pi.y(IIIIIIB)V")
    public void method6720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1324 == null) {
            return;
        }
        int var7 = 512 / (this.field4570.field2777 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6825() - arg4 / 2 - var7;
        int var14 = this.method6862() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4570.field2777 * (var7 + var13 - this.field4587);
        int var16 = arg1 - this.field4570.field2777 * (var7 - (var14 - this.field4611));
        if (this.method6727(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4608 != null && this.field4608.field4825 == var11 && this.field4608.field4829 == var12) {
                Arrays.fill(this.field4608.field4826, 0);
            } else {
                this.field4608 = new class458(var11, var12);
            }
            this.field4587 = this.method6825() - arg4 / 2 - var7;
            this.field4611 = this.method6862() - arg5 / 2 - var7;
            this.field4595 = this.field4570.field2777;
            Statics.field1324.method5600(this.field4587, this.field4611, this.field4608, (float) this.field4595 / var10);
            this.field4612 = client.field783;
            var15 = arg0 - this.field4570.field2777 * (var7 + var13 - this.field4587);
            var16 = arg1 - this.field4570.field2777 * (var7 - (var14 - this.field4611));
        }
        class454.method7494(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4608.method7614(var15, var16, 192);
        } else {
            this.field4608.method7617(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("pi.i(IIIII)V")
    public void method6721(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4571.method6683()) {
            return;
        }
        if (!this.field4570.method4548()) {
            this.field4570.method4540(this.field4573, this.field4569.method4347(), client.field685);
            if (!this.field4570.method4548()) {
                return;
            }
        }
        this.field4570.method4568(arg0, arg1, arg2, arg3, this.field4585, this.field4584, this.field4583);
    }

    @ObfuscatedName("pi.r(II)V")
    public void method6722(int arg0) {
        this.field4577 = this.method6724(arg0);
    }

    @ObfuscatedName("pi.z(IIIIIB)V")
    public void method6756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class454.method7518(arg0, arg1, arg2, arg3, -16777216);
        class454.method7499(var7 - 152, var8, 304, 34, -65536);
        class454.method7518(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4597.method5955(class310.field3971, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("pi.o(II)F")
    public float method6724(int arg0) {
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

    @ObfuscatedName("pi.as(I)I")
    public int method6895() {
        if ((double) this.field4577 == 1.0D) {
            return 25;
        } else if ((double) this.field4577 == 1.5D) {
            return 37;
        } else if ((double) this.field4577 == 2.0D) {
            return 50;
        } else if ((double) this.field4577 == 3.0D) {
            return 75;
        } else if ((double) this.field4577 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("pi.ac(B)V")
    public void method6726() {
        this.field4571.method6682();
    }

    @ObfuscatedName("pi.ao(B)Z")
    public boolean method6888() {
        return this.field4571.method6683();
    }

    @ObfuscatedName("pi.ar(II)Lht;")
    public class226 method6728(int arg0) {
        Iterator var2 = this.field4566.values().iterator();
        class226 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class226) var2.next();
        } while (var3.method4345() != arg0);
        return var3;
    }

    @ObfuscatedName("pi.aq(III)V")
    public void method6699(int arg0, int arg1) {
        if (this.field4569 != null && this.field4569.method4383(arg0, arg1)) {
            this.field4596 = arg0 - this.field4569.method4351() * 64;
            this.field4598 = arg1 - this.field4569.method4353() * 64;
        }
    }

    @ObfuscatedName("pi.ai(III)V")
    public void method6734(int arg0, int arg1) {
        if (this.field4569 != null) {
            this.method6706(arg0 - this.field4569.method4351() * 64, arg1 - this.field4569.method4353() * 64, true);
            this.field4596 = -1;
            this.field4598 = -1;
        }
    }

    @ObfuscatedName("pi.an(IIII)V")
    public void method6731(int arg0, int arg1, int arg2) {
        if (this.field4569 != null) {
            int[] var4 = this.field4569.method4414(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6699(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("pi.aa(IIII)V")
    public void method6732(int arg0, int arg1, int arg2) {
        if (this.field4569 != null) {
            int[] var4 = this.field4569.method4414(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6734(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("pi.ak(I)I")
    public int method6825() {
        return this.field4569 == null ? -1 : this.field4588 + this.field4569.method4351() * 64;
    }

    @ObfuscatedName("pi.am(I)I")
    public int method6862() {
        return this.field4569 == null ? -1 : this.field4610 + this.field4569.method4353() * 64;
    }

    @ObfuscatedName("pi.ap(I)Lkz;")
    public class291 method6735() {
        return this.field4569 == null ? null : this.field4569.method4337(this.method6825(), this.method6862());
    }

    @ObfuscatedName("pi.ab(I)I")
    public int method6736() {
        return this.field4578;
    }

    @ObfuscatedName("pi.az(B)I")
    public int method6833() {
        return this.field4579;
    }

    @ObfuscatedName("pi.ad(IB)V")
    public void method6712(int arg0) {
        if (arg0 >= 1) {
            this.field4582 = arg0;
        }
    }

    @ObfuscatedName("pi.af(B)V")
    public void method6791() {
        this.field4582 = 3;
    }

    @ObfuscatedName("pi.aj(II)V")
    public void method6740(int arg0) {
        if (arg0 >= 1) {
            this.field4583 = arg0;
        }
    }

    @ObfuscatedName("pi.ax(I)V")
    public void method6823() {
        this.field4583 = 50;
    }

    @ObfuscatedName("pi.av(ZI)V")
    public void method6742(boolean arg0) {
        this.field4609 = arg0;
    }

    @ObfuscatedName("pi.ae(II)V")
    public void method6743(int arg0) {
        this.field4585 = new HashSet();
        this.field4585.add(arg0);
        this.field4586 = 0;
        this.field4584 = 0;
    }

    @ObfuscatedName("pi.ay(II)V")
    public void method6739(int arg0) {
        this.field4585 = new HashSet();
        this.field4586 = 0;
        this.field4584 = 0;
        for (int var2 = 0; var2 < Statics.field1848; var2++) {
            if (class172.method2879(var2) != null && class172.method2879(var2).field1847 == arg0) {
                this.field4585.add(class172.method2879(var2).field1854);
            }
        }
    }

    @ObfuscatedName("pi.ag(B)V")
    public void method6745() {
        this.field4585 = null;
    }

    @ObfuscatedName("pi.aw(ZI)V")
    public void method6746(boolean arg0) {
        this.field4600 = !arg0;
    }

    @ObfuscatedName("pi.ah(IZI)V")
    public void method6855(int arg0, boolean arg1) {
        if (arg1) {
            this.field4568.remove(arg0);
        } else {
            this.field4568.add(arg0);
        }
        this.method6698();
    }

    @ObfuscatedName("pi.at(IZB)V")
    public void method6748(int arg0, boolean arg1) {
        if (arg1) {
            this.field4553.remove(arg0);
        } else {
            this.field4553.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1848; var3++) {
            if (class172.method2879(var3) != null && class172.method2879(var3).field1847 == arg0) {
                int var4 = class172.method2879(var3).field1854;
                if (arg1) {
                    this.field4572.remove(var4);
                } else {
                    this.field4572.add(var4);
                }
            }
        }
        this.method6698();
    }

    @ObfuscatedName("pi.al(S)Z")
    public boolean method6749() {
        return !this.field4600;
    }

    @ObfuscatedName("pi.au(IB)Z")
    public boolean method6750(int arg0) {
        return !this.field4568.contains(arg0);
    }

    @ObfuscatedName("pi.bg(II)Z")
    public boolean method6751(int arg0) {
        return !this.field4553.contains(arg0);
    }

    @ObfuscatedName("pi.bi(I)V")
    public void method6698() {
        this.field4599.clear();
        this.field4599.addAll(this.field4568);
        this.field4599.addAll(this.field4572);
    }

    @ObfuscatedName("pi.bj(IIIIIII)V")
    public void method6753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4571.method6683()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4576));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4576));
        List var9 = this.field4570.method4546(this.field4588 - var7 / 2 - 1, this.field4610 - var8 / 2 - 1, var7 / 2 + this.field4588 + 1, var8 / 2 + this.field4610 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class172 var12 = class172.method2879(var11.method4295());
            var13 = false;
            for (int var14 = this.field4602.length - 1; var14 >= 0; var14--) {
                if (var12.field1850[var14] != null) {
                    client.method2869(var12.field1850[var14], var12.field1859, this.field4602[var14], var11.method4295(), var11.field2893.method5123(), var11.field2888.method5123());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("pi.by(ILkz;B)Lkz;")
    public class291 method6754(int arg0, class291 arg1) {
        if (!this.field4571.method6683()) {
            return null;
        } else if (!this.field4570.method4548()) {
            return null;
        } else if (this.field4569.method4383(arg1.field3349, arg1.field3350)) {
            HashMap var3 = this.field4570.method4549();
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
                        return var5.field2888;
                    }
                    var8 = (class244) var7.next();
                    int var9 = var8.field2888.field3349 - arg1.field3349;
                    int var10 = var8.field2888.field3350 - arg1.field3350;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2888;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("pi.bz(IILkz;Lkz;B)V")
    public void method6755(int arg0, int arg1, class291 arg2, class291 arg3) {
        class81 var5 = new class81();
        class249 var6 = new class249(arg1, arg2, arg3);
        var5.method2145(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2146(10);
                break;
            case 1009:
                var5.method2146(11);
                break;
            case 1010:
                var5.method2146(12);
                break;
            case 1011:
                var5.method2146(13);
                break;
            case 1012:
                var5.method2146(14);
        }
        class64.method5903(var5);
    }

    @ObfuscatedName("pi.bo(I)Lib;")
    public class244 method6821() {
        if (!this.field4571.method6683()) {
            return null;
        } else if (this.field4570.method4548()) {
            HashMap var1 = this.field4570.method4549();
            this.field4603 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4603.addAll(var3);
            }
            this.field4604 = this.field4603.iterator();
            return this.method6757();
        } else {
            return null;
        }
    }

    @ObfuscatedName("pi.br(I)Lib;")
    public class244 method6757() {
        if (this.field4604 == null) {
            return null;
        }
        class244 var1;
        do {
            if (!this.field4604.hasNext()) {
                return null;
            }
            var1 = (class244) this.field4604.next();
        } while (var1.method4295() == -1);
        return var1;
    }
}
