package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("na")
public class class375 {

    @ObfuscatedName("na.t")
    public class290 field4131;

    @ObfuscatedName("na.a")
    public class290 field4130;

    @ObfuscatedName("na.e")
    public class290 field4154;

    @ObfuscatedName("na.i")
    public static final class377 field4132 = class377.field4198;

    @ObfuscatedName("na.y")
    public static final class377 field4135 = class377.field4195;

    @ObfuscatedName("na.w")
    public static final class377 field4136 = class377.field4196;

    @ObfuscatedName("na.g")
    public class315 field4137;

    @ObfuscatedName("na.v")
    public HashMap field4176;

    @ObfuscatedName("na.s")
    public class413[] field4139;

    @ObfuscatedName("na.c")
    public HashMap field4140;

    @ObfuscatedName("na.b")
    public class181 field4141;

    @ObfuscatedName("na.x")
    public class181 field4149;

    @ObfuscatedName("na.p")
    public class181 field4143;

    @ObfuscatedName("na.z")
    public class183 field4144;

    @ObfuscatedName("na.h")
    public class374 field4145;

    @ObfuscatedName("na.o")
    public int field4152;

    @ObfuscatedName("na.r")
    public int field4147;

    @ObfuscatedName("na.n")
    public int field4148 = -1;

    @ObfuscatedName("na.u")
    public int field4180 = -1;

    @ObfuscatedName("na.d")
    public float field4150;

    @ObfuscatedName("na.ab")
    public float field4167;

    @ObfuscatedName("na.ad")
    public int field4164 = -1;

    @ObfuscatedName("na.as")
    public int field4142 = -1;

    @ObfuscatedName("na.ak")
    public int field4153 = -1;

    @ObfuscatedName("na.ah")
    public int field4155 = -1;

    @ObfuscatedName("na.ay")
    public int field4156 = 3;

    @ObfuscatedName("na.al")
    public int field4169 = 50;

    @ObfuscatedName("na.ao")
    public boolean field4158 = false;

    @ObfuscatedName("na.au")
    public HashSet field4177 = null;

    @ObfuscatedName("na.aa")
    public int field4160 = -1;

    @ObfuscatedName("na.ag")
    public int field4161 = -1;

    @ObfuscatedName("na.aq")
    public int field4162 = -1;

    @ObfuscatedName("na.ar")
    public int field4163 = -1;

    @ObfuscatedName("na.ac")
    public int field4157 = -1;

    @ObfuscatedName("na.at")
    public int field4179 = -1;

    @ObfuscatedName("na.ax")
    public long field4166;

    @ObfuscatedName("na.an")
    public int field4159;

    @ObfuscatedName("na.av")
    public int field4168;

    @ObfuscatedName("na.ap")
    public boolean field4175 = true;

    @ObfuscatedName("na.aw")
    public HashSet field4170 = new HashSet();

    @ObfuscatedName("na.az")
    public HashSet field4171 = new HashSet();

    @ObfuscatedName("na.ae")
    public HashSet field4172 = new HashSet();

    @ObfuscatedName("na.ai")
    public HashSet field4173 = new HashSet();

    @ObfuscatedName("na.af")
    public boolean field4174 = false;

    @ObfuscatedName("na.bz")
    public int field4146 = 0;

    @ObfuscatedName("na.bg")
    public final int[] field4128 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("na.bf")
    public List field4138;

    @ObfuscatedName("na.bj")
    public Iterator field4178;

    @ObfuscatedName("na.bo")
    public HashSet field4134 = new HashSet();

    @ObfuscatedName("na.bx")
    public class258 field4165 = null;

    @ObfuscatedName("na.bu")
    public boolean field4181 = false;

    @ObfuscatedName("na.bc")
    public class414 field4182;

    @ObfuscatedName("na.ba")
    public int field4183;

    @ObfuscatedName("na.bm")
    public int field4184 = -1;

    @ObfuscatedName("na.bv")
    public int field4185 = -1;

    @ObfuscatedName("na.bs")
    public int field4186 = -1;

    @ObfuscatedName("na.l(Lkl;Lkl;Lkl;Llt;Ljava/util/HashMap;[Loz;B)V")
    public void method5824(class290 arg0, class290 arg1, class290 arg2, class315 arg3, HashMap arg4, class413[] arg5) {
        this.field4139 = arg5;
        this.field4131 = arg0;
        this.field4130 = arg1;
        this.field4154 = arg2;
        this.field4137 = arg3;
        this.field4176 = new HashMap();
        this.field4176.put(class178.field2014, arg4.get(field4132));
        this.field4176.put(class178.field2017, arg4.get(field4135));
        this.field4176.put(class178.field2012, arg4.get(field4136));
        this.field4145 = new class374(arg0);
        int var7 = this.field4131.method4771(class200.field2221.field2220);
        int[] var8 = this.field4131.method4765(var7);
        this.field4140 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class401 var10 = new class401(this.field4131.method4756(var7, var8[var9]));
            class181 var11 = new class181();
            var11.method3234(var10, var8[var9]);
            this.field4140.put(var11.method3243(), var11);
            if (var11.method3278()) {
                this.field4141 = var11;
            }
        }
        this.method5903(this.field4141);
        this.field4143 = null;
    }

    @ObfuscatedName("na.q(I)V")
    public void method5829() {
        class182.field2059.method4195(5);
    }

    @ObfuscatedName("na.f(IIZIIIII)V")
    public void method5826(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4145.method5807()) {
            return;
        }
        this.method5956();
        this.method5830();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4150));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4150));
        List var10 = this.field4144.method3441(this.field4152 - var8 / 2 - 1, this.field4147 - var9 / 2 - 1, var8 / 2 + this.field4152 + 1, var9 / 2 + this.field4147 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class199 var13 = (class199) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class204 var15 = new class204(var13.method3195(), var13.field2213, var13.field2209);
            var14.method1974(new Object[] { var15, arg0, arg1 });
            if (this.field4134.contains(var13)) {
                var14.method1973(17);
            } else {
                var14.method1973(15);
            }
            class64.method4138(var14);
        }
        Iterator var16 = this.field4134.iterator();
        while (var16.hasNext()) {
            class199 var17 = (class199) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class204 var19 = new class204(var17.method3195(), var17.field2213, var17.field2209);
                var18.method1974(new Object[] { var19, arg0, arg1 });
                var18.method1973(16);
                class64.method4138(var18);
            }
        }
        this.field4134 = var11;
    }

    @ObfuscatedName("na.j(IIZZI)V")
    public void method6015(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class398.method2299();
        this.method5828(arg0, arg1, arg3, var5);
        if (!this.method5925() && arg3 || arg2) {
            if (arg3) {
                this.field4157 = arg0;
                this.field4179 = arg1;
                this.field4162 = this.field4152;
                this.field4163 = this.field4147;
            }
            if (this.field4162 != -1) {
                int var7 = arg0 - this.field4157;
                int var8 = arg1 - this.field4179;
                this.method5831(this.field4162 - (int) ((float) var7 / this.field4167), this.field4163 + (int) ((float) var8 / this.field4167), false);
            }
        } else {
            this.method5832();
        }
        if (arg3) {
            this.field4166 = var5;
            this.field4159 = arg0;
            this.field4168 = arg1;
        }
    }

    @ObfuscatedName("na.m(IIZJ)V")
    public void method5828(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4149 == null) {
            this.field4165 = null;
            return;
        }
        int var6 = (int) ((float) this.field4152 + ((float) (arg0 - this.field4153) - (float) this.method5861() * this.field4150 / 2.0F) / this.field4150);
        int var7 = (int) ((float) this.field4147 - ((float) (arg1 - this.field4155) - (float) this.method5887() * this.field4150 / 2.0F) / this.field4150);
        this.field4165 = this.field4149.method3254(var6 + this.field4149.method3247() * 64, var7 + this.field4149.method3249() * 64);
        if (this.field4165 == null || !arg2) {
            return;
        }
        boolean var8 = client.field660 >= 2;
        if (var8 && class24.field118[82] && class24.field118[81]) {
            client.method2279(this.field4165.field3012, this.field4165.field3013, this.field4165.field3015, false);
            return;
        }
        boolean var9 = true;
        if (this.field4175) {
            int var10 = arg0 - this.field4159;
            int var11 = arg1 - this.field4168;
            if (arg3 - this.field4166 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class242 var12 = class242.method2075(class240.field2738, client.field639.field1287);
            var12.field2780.method6318(this.field4165.method4493());
            client.field639.method2246(var12);
            this.field4166 = 0L;
        }
    }

    @ObfuscatedName("na.k(B)V")
    public void method5956() {
        if (Statics.field3166 != null) {
            this.field4150 = this.field4167;
            return;
        }
        if (this.field4150 < this.field4167) {
            this.field4150 = Math.min(this.field4167, this.field4150 / 30.0F + this.field4150);
        }
        if (this.field4150 > this.field4167) {
            this.field4150 = Math.max(this.field4167, this.field4150 - this.field4150 / 30.0F);
        }
    }

    @ObfuscatedName("na.t(I)V")
    public void method5830() {
        if (!this.method5925()) {
            return;
        }
        int var1 = this.field4148 - this.field4152;
        int var2 = this.field4180 - this.field4147;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5831(this.field4152 + var1, this.field4147 + var2, true);
        if (this.field4152 == this.field4148 && this.field4180 == this.field4147) {
            this.field4148 = -1;
            this.field4180 = -1;
        }
    }

    @ObfuscatedName("na.a(IIZI)V")
    public final void method5831(int arg0, int arg1, boolean arg2) {
        this.field4152 = arg0;
        this.field4147 = arg1;
        class398.method2299();
        if (arg2) {
            this.method5832();
        }
    }

    @ObfuscatedName("na.e(B)V")
    public final void method5832() {
        this.field4179 = -1;
        this.field4157 = -1;
        this.field4163 = -1;
        this.field4162 = -1;
    }

    @ObfuscatedName("na.i(B)Z")
    public boolean method5925() {
        return this.field4148 != -1 && this.field4180 != -1;
    }

    @ObfuscatedName("na.y(IIII)Lfr;")
    public class181 method5872(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4140.values().iterator();
        class181 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class181) var4.next();
        } while (!var5.method3236(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("na.w(IIIZB)V")
    public void method5916(int arg0, int arg1, int arg2, boolean arg3) {
        class181 var5 = this.method5872(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4141;
        }
        boolean var6 = false;
        if (this.field4143 != var5 || arg3) {
            this.field4143 = var5;
            this.method5903(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5842(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("na.g(II)V")
    public void method5836(int arg0) {
        class181 var2 = this.method5873(arg0);
        if (var2 != null) {
            this.method5903(var2);
        }
    }

    @ObfuscatedName("na.v(S)I")
    public int method5837() {
        return this.field4149 == null ? -1 : this.field4149.method3241();
    }

    @ObfuscatedName("na.s(B)Lfr;")
    public class181 method5838() {
        return this.field4149;
    }

    @ObfuscatedName("na.c(Lfr;I)V")
    public void method5903(class181 arg0) {
        if (this.field4149 == null || this.field4149 != arg0) {
            this.method5840(arg0);
            this.method5842(-1, -1, -1);
        }
    }

    @ObfuscatedName("na.b(Lfr;I)V")
    public void method5840(class181 arg0) {
        this.field4149 = arg0;
        this.field4144 = new class183(this.field4139, this.field4176, this.field4130, this.field4154);
        this.field4145.method5805(this.field4149.method3243());
    }

    @ObfuscatedName("na.x(Lfr;Lic;Lic;ZB)V")
    public void method5949(class181 arg0, class258 arg1, class258 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4149 == null || this.field4149 != arg0) {
            this.method5840(arg0);
        }
        if (!arg3 && this.field4149.method3236(arg1.field3015, arg1.field3012, arg1.field3013)) {
            this.method5842(arg1.field3015, arg1.field3012, arg1.field3013);
        } else {
            this.method5842(arg2.field3015, arg2.field3012, arg2.field3013);
        }
    }

    @ObfuscatedName("na.p(IIIB)V")
    public void method5842(int arg0, int arg1, int arg2) {
        if (this.field4149 == null) {
            return;
        }
        int[] var4 = this.field4149.method3238(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4149.method3238(this.field4149.method3252(), this.field4149.method3268(), this.field4149.method3242());
        }
        this.method5831(var4[0] - this.field4149.method3247() * 64, var4[1] - this.field4149.method3249() * 64, true);
        this.field4148 = -1;
        this.field4180 = -1;
        this.field4150 = this.method5959(this.field4149.method3246());
        this.field4167 = this.field4150;
        this.field4138 = null;
        this.field4178 = null;
        this.field4144.method3449();
    }

    @ObfuscatedName("na.z(IIIIIB)V")
    public void method5843(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class410.method6556(var6);
        class410.method6573(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class410.method6595(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4145.method5816();
        if (var7 < 100) {
            this.method5848(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4144.method3444()) {
            this.field4144.method3465(this.field4131, this.field4149.method3243(), client.field486);
            if (!this.field4144.method3444()) {
                return;
            }
        }
        if (this.field4177 != null) {
            this.field4161++;
            if (this.field4161 % this.field4169 == 0) {
                this.field4161 = 0;
                this.field4160++;
            }
            if (this.field4160 >= this.field4156 && !this.field4158) {
                this.field4177 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4150));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4150));
        this.field4144.method3438(this.field4152 - var8 / 2, this.field4147 - var9 / 2, var8 / 2 + this.field4152, var9 / 2 + this.field4147, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4174) {
            boolean var10 = false;
            if (arg4 - this.field4146 > 100) {
                this.field4146 = arg4;
                var10 = true;
            }
            this.field4144.method3463(this.field4152 - var8 / 2, this.field4147 - var9 / 2, var8 / 2 + this.field4152, var9 / 2 + this.field4147, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4173, this.field4177, this.field4161, this.field4169, var10);
        }
        this.method5845(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field660 >= 2;
        if (var11 && this.field4181 && this.field4165 != null) {
            this.field4137.method5207("Coord: " + this.field4165, class410.field4362 + 10, class410.field4360 + 20, 16776960, -1);
        }
        this.field4164 = var8;
        this.field4142 = var9;
        this.field4153 = arg0;
        this.field4155 = arg1;
        class410.method6557(var6);
    }

    @ObfuscatedName("na.h(IIIIIII)Z")
    public boolean method5947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4182 == null) {
            return true;
        } else if (this.field4182.field4390 != arg0 || this.field4182.field4383 != arg1) {
            return true;
        } else if (this.field4144.field2085 != this.field4183) {
            return true;
        } else if (client.field764 != this.field4186) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("na.o(IIIIIII)V")
    public void method5845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3166 == null) {
            return;
        }
        int var7 = 512 / (this.field4144.field2085 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5835() - arg4 / 2 - var7;
        int var14 = this.method5859() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4144.field2085 * (var7 + var13 - this.field4184);
        int var16 = arg1 - this.field4144.field2085 * (var7 - (var14 - this.field4185));
        if (this.method5947(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4182 != null && this.field4182.field4390 == var11 && this.field4182.field4383 == var12) {
                Arrays.fill(this.field4182.field4385, 0);
            } else {
                this.field4182 = new class414(var11, var12);
            }
            this.field4184 = this.method5835() - arg4 / 2 - var7;
            this.field4185 = this.method5859() - arg5 / 2 - var7;
            this.field4183 = this.field4144.field2085;
            Statics.field3166.method4982(this.field4184, this.field4185, this.field4182, (float) this.field4183 / var10);
            this.field4186 = client.field764;
            var15 = arg0 - this.field4144.field2085 * (var7 + var13 - this.field4184);
            var16 = arg1 - this.field4144.field2085 * (var7 - (var14 - this.field4185));
        }
        class410.method6616(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4182.method6748(var15, var16, 192);
        } else {
            this.field4182.method6696(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("na.r(IIIIB)V")
    public void method5846(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4145.method5807()) {
            return;
        }
        if (!this.field4144.method3444()) {
            this.field4144.method3465(this.field4131, this.field4149.method3243(), client.field486);
            if (!this.field4144.method3444()) {
                return;
            }
        }
        this.field4144.method3440(arg0, arg1, arg2, arg3, this.field4177, this.field4161, this.field4169);
    }

    @ObfuscatedName("na.n(IB)V")
    public void method5847(int arg0) {
        this.field4167 = this.method5959(arg0);
    }

    @ObfuscatedName("na.u(IIIIII)V")
    public void method5848(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class410.method6595(arg0, arg1, arg2, arg3, -16777216);
        class410.method6566(var7 - 152, var8, 304, 34, -65536);
        class410.method6595(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4137.method5210(class283.field3644, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("na.d(II)F")
    public float method5959(int arg0) {
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

    @ObfuscatedName("na.ab(I)I")
    public int method5850() {
        if ((double) this.field4167 == 1.0D) {
            return 25;
        } else if ((double) this.field4167 == 1.5D) {
            return 37;
        } else if ((double) this.field4167 == 2.0D) {
            return 50;
        } else if ((double) this.field4167 == 3.0D) {
            return 75;
        } else if ((double) this.field4167 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("na.ad(I)V")
    public void method5851() {
        this.field4145.method5817();
    }

    @ObfuscatedName("na.as(I)Z")
    public boolean method5898() {
        return this.field4145.method5807();
    }

    @ObfuscatedName("na.ak(II)Lfr;")
    public class181 method5873(int arg0) {
        Iterator var2 = this.field4140.values().iterator();
        class181 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class181) var2.next();
        } while (var3.method3241() != arg0);
        return var3;
    }

    @ObfuscatedName("na.ah(III)V")
    public void method5854(int arg0, int arg1) {
        if (this.field4149 != null && this.field4149.method3253(arg0, arg1)) {
            this.field4148 = arg0 - this.field4149.method3247() * 64;
            this.field4180 = arg1 - this.field4149.method3249() * 64;
        }
    }

    @ObfuscatedName("na.ay(IIB)V")
    public void method5917(int arg0, int arg1) {
        if (this.field4149 != null) {
            this.method5831(arg0 - this.field4149.method3247() * 64, arg1 - this.field4149.method3249() * 64, true);
            this.field4148 = -1;
            this.field4180 = -1;
        }
    }

    @ObfuscatedName("na.al(IIII)V")
    public void method5856(int arg0, int arg1, int arg2) {
        if (this.field4149 != null) {
            int[] var4 = this.field4149.method3238(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5854(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("na.ao(IIII)V")
    public void method5857(int arg0, int arg1, int arg2) {
        if (this.field4149 != null) {
            int[] var4 = this.field4149.method3238(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5917(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("na.au(B)I")
    public int method5835() {
        return this.field4149 == null ? -1 : this.field4152 + this.field4149.method3247() * 64;
    }

    @ObfuscatedName("na.aa(S)I")
    public int method5859() {
        return this.field4149 == null ? -1 : this.field4147 + this.field4149.method3249() * 64;
    }

    @ObfuscatedName("na.ag(I)Lic;")
    public class258 method5860() {
        return this.field4149 == null ? null : this.field4149.method3254(this.method5835(), this.method5859());
    }

    @ObfuscatedName("na.aq(I)I")
    public int method5861() {
        return this.field4164;
    }

    @ObfuscatedName("na.ar(B)I")
    public int method5887() {
        return this.field4142;
    }

    @ObfuscatedName("na.ac(II)V")
    public void method5863(int arg0) {
        if (arg0 >= 1) {
            this.field4156 = arg0;
        }
    }

    @ObfuscatedName("na.at(I)V")
    public void method5900() {
        this.field4156 = 3;
    }

    @ObfuscatedName("na.ax(II)V")
    public void method5940(int arg0) {
        if (arg0 >= 1) {
            this.field4169 = arg0;
        }
    }

    @ObfuscatedName("na.an(B)V")
    public void method6007() {
        this.field4169 = 50;
    }

    @ObfuscatedName("na.av(ZB)V")
    public void method5867(boolean arg0) {
        this.field4158 = arg0;
    }

    @ObfuscatedName("na.ap(IB)V")
    public void method5868(int arg0) {
        this.field4177 = new HashSet();
        this.field4177.add(arg0);
        this.field4160 = 0;
        this.field4161 = 0;
    }

    @ObfuscatedName("na.aj(IB)V")
    public void method5869(int arg0) {
        this.field4177 = new HashSet();
        this.field4160 = 0;
        this.field4161 = 0;
        for (int var2 = 0; var2 < Statics.field1625; var2++) {
            if (class154.method156(var2) != null && class154.method156(var2).field1638 == arg0) {
                this.field4177.add(class154.method156(var2).field1627);
            }
        }
    }

    @ObfuscatedName("na.am(B)V")
    public void method5971() {
        this.field4177 = null;
    }

    @ObfuscatedName("na.aw(ZB)V")
    public void method5950(boolean arg0) {
        this.field4174 = !arg0;
    }

    @ObfuscatedName("na.az(IZB)V")
    public void method5875(int arg0, boolean arg1) {
        if (arg1) {
            this.field4170.remove(arg0);
        } else {
            this.field4170.add(arg0);
        }
        this.method5862();
    }

    @ObfuscatedName("na.ae(IZB)V")
    public void method5951(int arg0, boolean arg1) {
        if (arg1) {
            this.field4171.remove(arg0);
        } else {
            this.field4171.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1625; var3++) {
            if (class154.method156(var3) != null && class154.method156(var3).field1638 == arg0) {
                int var4 = class154.method156(var3).field1627;
                if (arg1) {
                    this.field4172.remove(var4);
                } else {
                    this.field4172.add(var4);
                }
            }
        }
        this.method5862();
    }

    @ObfuscatedName("na.ai(I)Z")
    public boolean method5874() {
        return !this.field4174;
    }

    @ObfuscatedName("na.bg(II)Z")
    public boolean method6022(int arg0) {
        return !this.field4170.contains(arg0);
    }

    @ObfuscatedName("na.bf(IB)Z")
    public boolean method5876(int arg0) {
        return !this.field4171.contains(arg0);
    }

    @ObfuscatedName("na.bj(B)V")
    public void method5862() {
        this.field4173.clear();
        this.field4173.addAll(this.field4170);
        this.field4173.addAll(this.field4172);
    }

    @ObfuscatedName("na.bo(IIIIIII)V")
    public void method5878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4145.method5807()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4150));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4150));
        List var9 = this.field4144.method3441(this.field4152 - var7 / 2 - 1, this.field4147 - var8 / 2 - 1, var7 / 2 + this.field4152 + 1, var8 / 2 + this.field4147 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class154 var12 = class154.method156(var11.method3195());
            var13 = false;
            for (int var14 = this.field4128.length - 1; var14 >= 0; var14--) {
                if (var12.field1636[var14] != null) {
                    client.method4676(var12.field1636[var14], var12.field1628, this.field4128[var14], var11.method3195(), var11.field2213.method4493(), var11.field2209.method4493());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("na.bx(ILic;I)Lic;")
    public class258 method5879(int arg0, class258 arg1) {
        if (!this.field4145.method5807()) {
            return null;
        } else if (!this.field4144.method3444()) {
            return null;
        } else if (this.field4149.method3253(arg1.field3012, arg1.field3013)) {
            HashMap var3 = this.field4144.method3443();
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
                        return var5.field2209;
                    }
                    var8 = (class199) var7.next();
                    int var9 = var8.field2209.field3012 - arg1.field3012;
                    int var10 = var8.field2209.field3013 - arg1.field3013;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2209;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("na.bu(IILic;Lic;B)V")
    public void method5984(int arg0, int arg1, class258 arg2, class258 arg3) {
        class81 var5 = new class81();
        class204 var6 = new class204(arg1, arg2, arg3);
        var5.method1974(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1973(10);
                break;
            case 1009:
                var5.method1973(11);
                break;
            case 1010:
                var5.method1973(12);
                break;
            case 1011:
                var5.method1973(13);
                break;
            case 1012:
                var5.method1973(14);
        }
        class64.method4138(var5);
    }

    @ObfuscatedName("na.bc(I)Lgz;")
    public class199 method5912() {
        if (!this.field4145.method5807()) {
            return null;
        } else if (this.field4144.method3444()) {
            HashMap var1 = this.field4144.method3443();
            this.field4138 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4138.addAll(var3);
            }
            this.field4178 = this.field4138.iterator();
            return this.method5882();
        } else {
            return null;
        }
    }

    @ObfuscatedName("na.ba(I)Lgz;")
    public class199 method5882() {
        if (this.field4178 == null) {
            return null;
        }
        class199 var1;
        do {
            if (!this.field4178.hasNext()) {
                return null;
            }
            var1 = (class199) this.field4178.next();
        } while (var1.method3195() == -1);
        return var1;
    }
}
