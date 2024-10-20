package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("no")
public class class374 {

    @ObfuscatedName("no.z")
    public class290 field4109;

    @ObfuscatedName("no.a")
    public class290 field4131;

    @ObfuscatedName("no.u")
    public class290 field4111;

    @ObfuscatedName("no.e")
    public static final class376 field4106 = class376.field4174;

    @ObfuscatedName("no.l")
    public static final class376 field4152 = class376.field4175;

    @ObfuscatedName("no.y")
    public static final class376 field4151 = class376.field4181;

    @ObfuscatedName("no.v")
    public class315 field4148;

    @ObfuscatedName("no.f")
    public HashMap field4116;

    @ObfuscatedName("no.s")
    public class412[] field4141;

    @ObfuscatedName("no.h")
    public HashMap field4118;

    @ObfuscatedName("no.d")
    public class181 field4113;

    @ObfuscatedName("no.q")
    public class181 field4120;

    @ObfuscatedName("no.j")
    public class181 field4121;

    @ObfuscatedName("no.x")
    public class183 field4122;

    @ObfuscatedName("no.b")
    public class373 field4156;

    @ObfuscatedName("no.t")
    public int field4124;

    @ObfuscatedName("no.r")
    public int field4125;

    @ObfuscatedName("no.p")
    public int field4117 = -1;

    @ObfuscatedName("no.w")
    public int field4127 = -1;

    @ObfuscatedName("no.i")
    public float field4128;

    @ObfuscatedName("no.aq")
    public float field4158;

    @ObfuscatedName("no.ad")
    public int field4130 = -1;

    @ObfuscatedName("no.al")
    public int field4133 = -1;

    @ObfuscatedName("no.aa")
    public int field4132 = -1;

    @ObfuscatedName("no.aw")
    public int field4134 = -1;

    @ObfuscatedName("no.at")
    public int field4146 = 3;

    @ObfuscatedName("no.as")
    public int field4135 = 50;

    @ObfuscatedName("no.ae")
    public boolean field4136 = false;

    @ObfuscatedName("no.av")
    public HashSet field4137 = null;

    @ObfuscatedName("no.ak")
    public int field4159 = -1;

    @ObfuscatedName("no.an")
    public int field4139 = -1;

    @ObfuscatedName("no.ab")
    public int field4140 = -1;

    @ObfuscatedName("no.au")
    public int field4161 = -1;

    @ObfuscatedName("no.am")
    public int field4142 = -1;

    @ObfuscatedName("no.ao")
    public int field4110 = -1;

    @ObfuscatedName("no.ay")
    public long field4144;

    @ObfuscatedName("no.aj")
    public int field4119;

    @ObfuscatedName("no.ap")
    public int field4126;

    @ObfuscatedName("no.ai")
    public boolean field4123 = true;

    @ObfuscatedName("no.ar")
    public HashSet field4145 = new HashSet();

    @ObfuscatedName("no.az")
    public HashSet field4149 = new HashSet();

    @ObfuscatedName("no.ah")
    public HashSet field4129 = new HashSet();

    @ObfuscatedName("no.af")
    public HashSet field4164 = new HashSet();

    @ObfuscatedName("no.ax")
    public boolean field4150 = false;

    @ObfuscatedName("no.bd")
    public int field4153 = 0;

    @ObfuscatedName("no.bf")
    public final int[] field4154 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("no.bp")
    public List field4147;

    @ObfuscatedName("no.bl")
    public Iterator field4155;

    @ObfuscatedName("no.bc")
    public HashSet field4157 = new HashSet();

    @ObfuscatedName("no.br")
    public class258 field4143 = null;

    @ObfuscatedName("no.bw")
    public boolean field4114 = false;

    @ObfuscatedName("no.bh")
    public class413 field4160;

    @ObfuscatedName("no.bj")
    public int field4112;

    @ObfuscatedName("no.be")
    public int field4162 = -1;

    @ObfuscatedName("no.bq")
    public int field4163 = -1;

    @ObfuscatedName("no.bu")
    public int field4138 = -1;

    @ObfuscatedName("no.n(Lkk;Lkk;Lkk;Llu;Ljava/util/HashMap;[Loi;I)V")
    public void method5786(class290 arg0, class290 arg1, class290 arg2, class315 arg3, HashMap arg4, class412[] arg5) {
        this.field4141 = arg5;
        this.field4109 = arg0;
        this.field4131 = arg1;
        this.field4111 = arg2;
        this.field4148 = arg3;
        this.field4116 = new HashMap();
        this.field4116.put(class178.field2004, arg4.get(field4106));
        this.field4116.put(class178.field2003, arg4.get(field4152));
        this.field4116.put(class178.field2005, arg4.get(field4151));
        this.field4156 = new class373(arg0);
        int var7 = this.field4109.method4725(class200.field2200.field2205);
        int[] var8 = this.field4109.method4719(var7);
        this.field4118 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class400 var10 = new class400(this.field4109.method4710(var7, var8[var9]));
            class181 var11 = new class181();
            var11.method3183(var10, var8[var9]);
            this.field4118.put(var11.method3192(), var11);
            if (var11.method3191()) {
                this.field4113 = var11;
            }
        }
        this.method5832(this.field4113);
        this.field4121 = null;
    }

    @ObfuscatedName("no.c(I)V")
    public void method5787() {
        class182.method3985();
    }

    @ObfuscatedName("no.m(IIZIIIIB)V")
    public void method5788(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4156.method5776()) {
            return;
        }
        this.method5843();
        this.method5849();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4128));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4128));
        List var10 = this.field4122.method3399(this.field4124 - var8 / 2 - 1, this.field4125 - var9 / 2 - 1, var8 / 2 + this.field4124 + 1, var9 / 2 + this.field4125 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class199 var13 = (class199) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class204 var15 = new class204(var13.method3144(), var13.field2195, var13.field2194);
            var14.method1944(new Object[] { var15, arg0, arg1 });
            if (this.field4157.contains(var13)) {
                var14.method1948(17);
            } else {
                var14.method1948(15);
            }
            Statics.method2499(var14);
        }
        Iterator var16 = this.field4157.iterator();
        while (var16.hasNext()) {
            class199 var17 = (class199) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class204 var19 = new class204(var17.method3144(), var17.field2195, var17.field2194);
                var18.method1944(new Object[] { var19, arg0, arg1 });
                var18.method1948(16);
                Statics.method2499(var18);
            }
        }
        this.field4157 = var11;
    }

    @ObfuscatedName("no.k(IIZZI)V")
    public void method5801(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class397.method3986();
        this.method5790(arg0, arg1, arg3, var5);
        if (!this.method5795() && arg3 || arg2) {
            if (arg3) {
                this.field4142 = arg0;
                this.field4110 = arg1;
                this.field4140 = this.field4124;
                this.field4161 = this.field4125;
            }
            if (this.field4140 != -1) {
                int var7 = arg0 - this.field4142;
                int var8 = arg1 - this.field4110;
                this.method5793(this.field4140 - (int) ((float) var7 / this.field4158), this.field4161 + (int) ((float) var8 / this.field4158), false);
            }
        } else {
            this.method5959();
        }
        if (arg3) {
            this.field4144 = var5;
            this.field4119 = arg0;
            this.field4126 = arg1;
        }
    }

    @ObfuscatedName("no.o(IIZJ)V")
    public void method5790(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4120 == null) {
            this.field4143 = null;
            return;
        }
        int var6 = (int) ((float) this.field4124 + ((float) (arg0 - this.field4132) - (float) this.method5823() * this.field4128 / 2.0F) / this.field4128);
        int var7 = (int) ((float) this.field4125 - ((float) (arg1 - this.field4134) - (float) this.method5824() * this.field4128 / 2.0F) / this.field4128);
        this.field4143 = this.field4120.method3188(var6 + this.field4120.method3196() * 64, var7 + this.field4120.method3198() * 64);
        if (this.field4143 == null || !arg2) {
            return;
        }
        if (client.method1987() && class24.field123[82] && class24.field123[81]) {
            int var8 = this.field4143.field3007;
            int var9 = this.field4143.field3008;
            int var10 = this.field4143.field3006;
            class242 var11 = Statics.method1576(class240.field2708, client.field535.field1282);
            var11.field2767.method6311(var9);
            var11.field2767.method6263(0);
            var11.field2767.method6243(var10);
            var11.field2767.method6253(var8);
            client.field535.method2211(var11);
            return;
        }
        boolean var12 = true;
        if (this.field4123) {
            int var13 = arg0 - this.field4119;
            int var14 = arg1 - this.field4126;
            if (arg3 - this.field4144 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class242 var15 = Statics.method1576(class240.field2701, client.field535.field1282);
            var15.field2767.method6264(this.field4143.method4467());
            client.field535.method2211(var15);
            this.field4144 = 0L;
        }
    }

    @ObfuscatedName("no.g(I)V")
    public void method5843() {
        if (Statics.field83 != null) {
            this.field4128 = this.field4158;
            return;
        }
        if (this.field4128 < this.field4158) {
            this.field4128 = Math.min(this.field4158, this.field4128 / 30.0F + this.field4128);
        }
        if (this.field4128 > this.field4158) {
            this.field4128 = Math.max(this.field4158, this.field4128 - this.field4128 / 30.0F);
        }
    }

    @ObfuscatedName("no.z(I)V")
    public void method5849() {
        if (!this.method5795()) {
            return;
        }
        int var1 = this.field4117 - this.field4124;
        int var2 = this.field4127 - this.field4125;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5793(this.field4124 + var1, this.field4125 + var2, true);
        if (this.field4124 == this.field4117 && this.field4127 == this.field4125) {
            this.field4117 = -1;
            this.field4127 = -1;
        }
    }

    @ObfuscatedName("no.a(IIZB)V")
    public final void method5793(int arg0, int arg1, boolean arg2) {
        this.field4124 = arg0;
        this.field4125 = arg1;
        class397.method3986();
        if (arg2) {
            this.method5959();
        }
    }

    @ObfuscatedName("no.u(I)V")
    public final void method5959() {
        this.field4110 = -1;
        this.field4142 = -1;
        this.field4161 = -1;
        this.field4140 = -1;
    }

    @ObfuscatedName("no.e(I)Z")
    public boolean method5795() {
        return this.field4117 != -1 && this.field4127 != -1;
    }

    @ObfuscatedName("no.l(IIII)Lfr;")
    public class181 method5796(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4118.values().iterator();
        class181 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class181) var4.next();
        } while (!var5.method3185(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("no.y(IIIZI)V")
    public void method5797(int arg0, int arg1, int arg2, boolean arg3) {
        class181 var5 = this.method5796(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4113;
        }
        boolean var6 = false;
        if (this.field4121 != var5 || arg3) {
            this.field4121 = var5;
            this.method5832(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5804(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("no.v(IB)V")
    public void method5791(int arg0) {
        class181 var2 = this.method5815(arg0);
        if (var2 != null) {
            this.method5832(var2);
        }
    }

    @ObfuscatedName("no.f(I)I")
    public int method5799() {
        return this.field4120 == null ? -1 : this.field4120.method3187();
    }

    @ObfuscatedName("no.s(B)Lfr;")
    public class181 method5885() {
        return this.field4120;
    }

    @ObfuscatedName("no.h(Lfr;B)V")
    public void method5832(class181 arg0) {
        if (this.field4120 == null || this.field4120 != arg0) {
            this.method5802(arg0);
            this.method5804(-1, -1, -1);
        }
    }

    @ObfuscatedName("no.d(Lfr;I)V")
    public void method5802(class181 arg0) {
        this.field4120 = arg0;
        this.field4122 = new class183(this.field4141, this.field4116, this.field4131, this.field4111);
        this.field4156.method5770(this.field4120.method3192());
    }

    @ObfuscatedName("no.q(Lfr;Liy;Liy;ZB)V")
    public void method5803(class181 arg0, class258 arg1, class258 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4120 == null || this.field4120 != arg0) {
            this.method5802(arg0);
        }
        if (!arg3 && this.field4120.method3185(arg1.field3006, arg1.field3007, arg1.field3008)) {
            this.method5804(arg1.field3006, arg1.field3007, arg1.field3008);
        } else {
            this.method5804(arg2.field3006, arg2.field3007, arg2.field3008);
        }
    }

    @ObfuscatedName("no.j(IIII)V")
    public void method5804(int arg0, int arg1, int arg2) {
        if (this.field4120 == null) {
            return;
        }
        int[] var4 = this.field4120.method3263(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4120.method3263(this.field4120.method3218(), this.field4120.method3200(), this.field4120.method3202());
        }
        this.method5793(var4[0] - this.field4120.method3196() * 64, var4[1] - this.field4120.method3198() * 64, true);
        this.field4117 = -1;
        this.field4127 = -1;
        this.field4128 = this.method5811(this.field4120.method3195());
        this.field4158 = this.field4128;
        this.field4147 = null;
        this.field4155 = null;
        this.field4122.method3413();
    }

    @ObfuscatedName("no.x(IIIIII)V")
    public void method5889(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class409.method6521(var6);
        class409.method6519(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class409.method6556(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4156.method5783();
        if (var7 < 100) {
            this.method5810(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4122.method3431()) {
            this.field4122.method3395(this.field4109, this.field4120.method3192(), client.field682);
            if (!this.field4122.method3431()) {
                return;
            }
        }
        if (this.field4137 != null) {
            this.field4139++;
            if (this.field4139 % this.field4135 == 0) {
                this.field4139 = 0;
                this.field4159++;
            }
            if (this.field4159 >= this.field4146 && !this.field4136) {
                this.field4137 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4128));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4128));
        this.field4122.method3397(this.field4124 - var8 / 2, this.field4125 - var9 / 2, var8 / 2 + this.field4124, var9 / 2 + this.field4125, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4150) {
            boolean var10 = false;
            if (arg4 - this.field4153 > 100) {
                this.field4153 = arg4;
                var10 = true;
            }
            this.field4122.method3410(this.field4124 - var8 / 2, this.field4125 - var9 / 2, var8 / 2 + this.field4124, var9 / 2 + this.field4125, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4164, this.field4137, this.field4139, this.field4135, var10);
        }
        this.method5807(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method1987() && this.field4114 && this.field4143 != null) {
            this.field4148.method5174("Coord: " + this.field4143, class409.field4348 + 10, class409.field4344 + 20, 16776960, -1);
        }
        this.field4130 = var8;
        this.field4133 = var9;
        this.field4132 = arg0;
        this.field4134 = arg1;
        class409.method6522(var6);
    }

    @ObfuscatedName("no.b(IIIIIII)Z")
    public boolean method5806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4160 == null) {
            return true;
        } else if (this.field4160.field4375 != arg0 || this.field4160.field4378 != arg1) {
            return true;
        } else if (this.field4122.field2079 != this.field4112) {
            return true;
        } else if (client.field761 != this.field4138) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("no.t(IIIIIIB)V")
    public void method5807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field83 == null) {
            return;
        }
        int var7 = 512 / (this.field4122.field2079 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5820() - arg4 / 2 - var7;
        int var14 = this.method5821() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4122.field2079 * (var7 + var13 - this.field4162);
        int var16 = arg1 - this.field4122.field2079 * (var7 - (var14 - this.field4163));
        if (this.method5806(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4160 != null && this.field4160.field4375 == var11 && this.field4160.field4378 == var12) {
                Arrays.fill(this.field4160.field4369, 0);
            } else {
                this.field4160 = new class413(var11, var12);
            }
            this.field4162 = this.method5820() - arg4 / 2 - var7;
            this.field4163 = this.method5821() - arg5 / 2 - var7;
            this.field4112 = this.field4122.field2079;
            Statics.field83.method4912(this.field4162, this.field4163, this.field4160, (float) this.field4112 / var10);
            this.field4138 = client.field761;
            var15 = arg0 - this.field4122.field2079 * (var7 + var13 - this.field4162);
            var16 = arg1 - this.field4122.field2079 * (var7 - (var14 - this.field4163));
        }
        class409.method6563(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4160.method6637(var15, var16, 192);
        } else {
            this.field4160.method6734(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("no.r(IIIII)V")
    public void method5817(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4156.method5776()) {
            return;
        }
        if (!this.field4122.method3431()) {
            this.field4122.method3395(this.field4109, this.field4120.method3192(), client.field682);
            if (!this.field4122.method3431()) {
                return;
            }
        }
        this.field4122.method3414(arg0, arg1, arg2, arg3, this.field4137, this.field4139, this.field4135);
    }

    @ObfuscatedName("no.p(IB)V")
    public void method5809(int arg0) {
        this.field4158 = this.method5811(arg0);
    }

    @ObfuscatedName("no.w(IIIIII)V")
    public void method5810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class409.method6556(arg0, arg1, arg2, arg3, -16777216);
        class409.method6531(var7 - 152, var8, 304, 34, -65536);
        class409.method6556(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4148.method5137(class283.field3649, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("no.i(IB)F")
    public float method5811(int arg0) {
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

    @ObfuscatedName("no.aq(B)I")
    public int method5956() {
        if ((double) this.field4158 == 1.0D) {
            return 25;
        } else if ((double) this.field4158 == 1.5D) {
            return 37;
        } else if ((double) this.field4158 == 2.0D) {
            return 50;
        } else if ((double) this.field4158 == 3.0D) {
            return 75;
        } else if ((double) this.field4158 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("no.ad(B)V")
    public void method5813() {
        this.field4156.method5771();
    }

    @ObfuscatedName("no.al(I)Z")
    public boolean method5814() {
        return this.field4156.method5776();
    }

    @ObfuscatedName("no.aa(II)Lfr;")
    public class181 method5815(int arg0) {
        Iterator var2 = this.field4118.values().iterator();
        class181 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class181) var2.next();
        } while (var3.method3187() != arg0);
        return var3;
    }

    @ObfuscatedName("no.aw(III)V")
    public void method5943(int arg0, int arg1) {
        if (this.field4120 != null && this.field4120.method3217(arg0, arg1)) {
            this.field4117 = arg0 - this.field4120.method3196() * 64;
            this.field4127 = arg1 - this.field4120.method3198() * 64;
        }
    }

    @ObfuscatedName("no.at(IIB)V")
    public void method5922(int arg0, int arg1) {
        if (this.field4120 != null) {
            this.method5793(arg0 - this.field4120.method3196() * 64, arg1 - this.field4120.method3198() * 64, true);
            this.field4117 = -1;
            this.field4127 = -1;
        }
    }

    @ObfuscatedName("no.as(IIII)V")
    public void method5818(int arg0, int arg1, int arg2) {
        if (this.field4120 != null) {
            int[] var4 = this.field4120.method3263(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5943(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("no.ae(IIIB)V")
    public void method5819(int arg0, int arg1, int arg2) {
        if (this.field4120 != null) {
            int[] var4 = this.field4120.method3263(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5922(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("no.av(I)I")
    public int method5820() {
        return this.field4120 == null ? -1 : this.field4124 + this.field4120.method3196() * 64;
    }

    @ObfuscatedName("no.ak(I)I")
    public int method5821() {
        return this.field4120 == null ? -1 : this.field4125 + this.field4120.method3198() * 64;
    }

    @ObfuscatedName("no.an(I)Liy;")
    public class258 method5848() {
        return this.field4120 == null ? null : this.field4120.method3188(this.method5820(), this.method5821());
    }

    @ObfuscatedName("no.ab(B)I")
    public int method5823() {
        return this.field4130;
    }

    @ObfuscatedName("no.au(B)I")
    public int method5824() {
        return this.field4133;
    }

    @ObfuscatedName("no.am(II)V")
    public void method5789(int arg0) {
        if (arg0 >= 1) {
            this.field4146 = arg0;
        }
    }

    @ObfuscatedName("no.ao(B)V")
    public void method5808() {
        this.field4146 = 3;
    }

    @ObfuscatedName("no.ay(II)V")
    public void method5827(int arg0) {
        if (arg0 >= 1) {
            this.field4135 = arg0;
        }
    }

    @ObfuscatedName("no.aj(B)V")
    public void method5870() {
        this.field4135 = 50;
    }

    @ObfuscatedName("no.ap(ZB)V")
    public void method5831(boolean arg0) {
        this.field4136 = arg0;
    }

    @ObfuscatedName("no.ai(IB)V")
    public void method5946(int arg0) {
        this.field4137 = new HashSet();
        this.field4137.add(arg0);
        this.field4159 = 0;
        this.field4139 = 0;
    }

    @ObfuscatedName("no.ac(II)V")
    public void method5845(int arg0) {
        this.field4137 = new HashSet();
        this.field4159 = 0;
        this.field4139 = 0;
        for (int var2 = 0; var2 < Statics.field4408; var2++) {
            if (class154.method1007(var2) != null && class154.method1007(var2).field1642 == arg0) {
                this.field4137.add(class154.method1007(var2).field1623);
            }
        }
    }

    @ObfuscatedName("no.ag(I)V")
    public void method5812() {
        this.field4137 = null;
    }

    @ObfuscatedName("no.ar(ZB)V")
    public void method5833(boolean arg0) {
        this.field4150 = !arg0;
    }

    @ObfuscatedName("no.az(IZB)V")
    public void method5834(int arg0, boolean arg1) {
        if (arg1) {
            this.field4145.remove(arg0);
        } else {
            this.field4145.add(arg0);
        }
        this.method5839();
    }

    @ObfuscatedName("no.bd(IZI)V")
    public void method5835(int arg0, boolean arg1) {
        if (arg1) {
            this.field4149.remove(arg0);
        } else {
            this.field4149.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field4408; var3++) {
            if (class154.method1007(var3) != null && class154.method1007(var3).field1642 == arg0) {
                int var4 = class154.method1007(var3).field1623;
                if (arg1) {
                    this.field4129.remove(var4);
                } else {
                    this.field4129.add(var4);
                }
            }
        }
        this.method5839();
    }

    @ObfuscatedName("no.bt(B)Z")
    public boolean method5838() {
        return !this.field4150;
    }

    @ObfuscatedName("no.bf(II)Z")
    public boolean method5929(int arg0) {
        return !this.field4145.contains(arg0);
    }

    @ObfuscatedName("no.bp(II)Z")
    public boolean method5944(int arg0) {
        return !this.field4149.contains(arg0);
    }

    @ObfuscatedName("no.bl(I)V")
    public void method5839() {
        this.field4164.clear();
        this.field4164.addAll(this.field4145);
        this.field4164.addAll(this.field4129);
    }

    @ObfuscatedName("no.bc(IIIIIII)V")
    public void method5840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4156.method5776()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4128));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4128));
        List var9 = this.field4122.method3399(this.field4124 - var7 / 2 - 1, this.field4125 - var8 / 2 - 1, var7 / 2 + this.field4124 + 1, var8 / 2 + this.field4125 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class199 var11 = (class199) var10.next();
            class154 var12 = class154.method1007(var11.method3144());
            var13 = false;
            for (int var14 = this.field4154.length - 1; var14 >= 0; var14--) {
                if (var12.field1631[var14] != null) {
                    client.method4128(var12.field1631[var14], var12.field1620, this.field4154[var14], var11.method3144(), var11.field2195.method4467(), var11.field2194.method4467());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("no.br(ILiy;I)Liy;")
    public class258 method5841(int arg0, class258 arg1) {
        if (!this.field4156.method5776()) {
            return null;
        } else if (!this.field4122.method3431()) {
            return null;
        } else if (this.field4120.method3217(arg1.field3007, arg1.field3008)) {
            HashMap var3 = this.field4122.method3403();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class199 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class199 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2194;
                    }
                    var8 = (class199) var7.next();
                    int var9 = var8.field2194.field3007 - arg1.field3007;
                    int var10 = var8.field2194.field3008 - arg1.field3008;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2194;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("no.bw(IILiy;Liy;B)V")
    public void method5963(int arg0, int arg1, class258 arg2, class258 arg3) {
        class81 var5 = new class81();
        class204 var6 = new class204(arg1, arg2, arg3);
        var5.method1944(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1948(10);
                break;
            case 1009:
                var5.method1948(11);
                break;
            case 1010:
                var5.method1948(12);
                break;
            case 1011:
                var5.method1948(13);
                break;
            case 1012:
                var5.method1948(14);
        }
        Statics.method2499(var5);
    }

    @ObfuscatedName("no.bh(I)Lgm;")
    public class199 method5816() {
        if (!this.field4156.method5776()) {
            return null;
        } else if (this.field4122.method3431()) {
            HashMap var1 = this.field4122.method3403();
            this.field4147 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4147.addAll(var3);
            }
            this.field4155 = this.field4147.iterator();
            return this.method5844();
        } else {
            return null;
        }
    }

    @ObfuscatedName("no.bj(I)Lgm;")
    public class199 method5844() {
        if (this.field4155 == null) {
            return null;
        }
        class199 var1;
        do {
            if (!this.field4155.hasNext()) {
                return null;
            }
            var1 = (class199) this.field4155.next();
        } while (var1.method3144() == -1);
        return var1;
    }
}
