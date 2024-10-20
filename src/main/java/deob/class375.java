package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ng")
public class class375 {

    @ObfuscatedName("ng.e")
    public class290 field4133;

    @ObfuscatedName("ng.p")
    public class290 field4134;

    @ObfuscatedName("ng.j")
    public class290 field4135;

    @ObfuscatedName("ng.b")
    public static final class377 field4169 = class377.field4196;

    @ObfuscatedName("ng.x")
    public static final class377 field4177 = class377.field4197;

    @ObfuscatedName("ng.y")
    public static final class377 field4138 = class377.field4199;

    @ObfuscatedName("ng.k")
    public class315 field4131;

    @ObfuscatedName("ng.t")
    public HashMap field4140;

    @ObfuscatedName("ng.l")
    public class413[] field4141;

    @ObfuscatedName("ng.u")
    public HashMap field4142;

    @ObfuscatedName("ng.n")
    public class181 field4162;

    @ObfuscatedName("ng.z")
    public class181 field4130;

    @ObfuscatedName("ng.q")
    public class181 field4146;

    @ObfuscatedName("ng.d")
    public class183 field4144;

    @ObfuscatedName("ng.r")
    public class374 field4154;

    @ObfuscatedName("ng.m")
    public int field4173;

    @ObfuscatedName("ng.c")
    public int field4147;

    @ObfuscatedName("ng.f")
    public int field4127 = -1;

    @ObfuscatedName("ng.h")
    public int field4139 = -1;

    @ObfuscatedName("ng.v")
    public float field4152;

    @ObfuscatedName("ng.ag")
    public float field4153;

    @ObfuscatedName("ng.ae")
    public int field4145 = -1;

    @ObfuscatedName("ng.aq")
    public int field4155 = -1;

    @ObfuscatedName("ng.al")
    public int field4156 = -1;

    @ObfuscatedName("ng.am")
    public int field4157 = -1;

    @ObfuscatedName("ng.ai")
    public int field4158 = 3;

    @ObfuscatedName("ng.ah")
    public int field4159 = 50;

    @ObfuscatedName("ng.as")
    public boolean field4160 = false;

    @ObfuscatedName("ng.at")
    public HashSet field4151 = null;

    @ObfuscatedName("ng.az")
    public int field4167 = -1;

    @ObfuscatedName("ng.ac")
    public int field4163 = -1;

    @ObfuscatedName("ng.ak")
    public int field4164 = -1;

    @ObfuscatedName("ng.ab")
    public int field4165 = -1;

    @ObfuscatedName("ng.ar")
    public int field4166 = -1;

    @ObfuscatedName("ng.ad")
    public int field4161 = -1;

    @ObfuscatedName("ng.an")
    public long field4168;

    @ObfuscatedName("ng.ax")
    public int field4170;

    @ObfuscatedName("ng.av")
    public int field4149;

    @ObfuscatedName("ng.ap")
    public boolean field4171 = true;

    @ObfuscatedName("ng.af")
    public HashSet field4172 = new HashSet();

    @ObfuscatedName("ng.aw")
    public HashSet field4187 = new HashSet();

    @ObfuscatedName("ng.ao")
    public HashSet field4174 = new HashSet();

    @ObfuscatedName("ng.aa")
    public HashSet field4175 = new HashSet();

    @ObfuscatedName("ng.ay")
    public boolean field4182 = false;

    @ObfuscatedName("ng.bg")
    public int field4136 = 0;

    @ObfuscatedName("ng.bx")
    public final int[] field4178 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ng.bd")
    public List field4179;

    @ObfuscatedName("ng.bt")
    public Iterator field4180;

    @ObfuscatedName("ng.bf")
    public HashSet field4181 = new HashSet();

    @ObfuscatedName("ng.bs")
    public class258 field4148 = null;

    @ObfuscatedName("ng.bh")
    public boolean field4183 = false;

    @ObfuscatedName("ng.bw")
    public class414 field4184;

    @ObfuscatedName("ng.bm")
    public int field4185;

    @ObfuscatedName("ng.br")
    public int field4186 = -1;

    @ObfuscatedName("ng.bj")
    public int field4137 = -1;

    @ObfuscatedName("ng.bo")
    public int field4188 = -1;

    @ObfuscatedName("ng.i(Lko;Lko;Lko;Lle;Ljava/util/HashMap;[Loe;B)V")
    public void method5795(class290 arg0, class290 arg1, class290 arg2, class315 arg3, HashMap arg4, class413[] arg5) {
        this.field4141 = arg5;
        this.field4133 = arg0;
        this.field4134 = arg1;
        this.field4135 = arg2;
        this.field4131 = arg3;
        this.field4140 = new HashMap();
        this.field4140.put(class178.field2014, arg4.get(field4169));
        this.field4140.put(class178.field2016, arg4.get(field4177));
        this.field4140.put(class178.field2013, arg4.get(field4138));
        this.field4154 = new class374(arg0);
        int var7 = this.field4133.method4759(class200.field2211.field2213);
        int[] var8 = this.field4133.method4752(var7);
        this.field4142 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class401 var10 = new class401(this.field4133.method4743(var7, var8[var9]));
            class181 var11 = new class181();
            var11.method3266(var10, var8[var9]);
            this.field4142.put(var11.method3303(), var11);
            if (var11.method3265()) {
                this.field4162 = var11;
            }
        }
        this.method5810(this.field4162);
        this.field4146 = null;
    }

    @ObfuscatedName("ng.w(I)V")
    public void method5796() {
        class182.method4645();
    }

    @ObfuscatedName("ng.s(IIZIIIII)V")
    public void method5942(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4154.method5780()) {
            return;
        }
        this.method5800();
        this.method5814();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4152));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4152));
        List var10 = this.field4144.method3487(this.field4173 - var8 / 2 - 1, this.field4147 - var9 / 2 - 1, var8 / 2 + this.field4173 + 1, var9 / 2 + this.field4147 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class199 var13 = (class199) var12.next();
            var11.add(var13);
            class81 var14 = new class81();
            class204 var15 = new class204(var13.method3225(), var13.field2206, var13.field2205);
            var14.method1976(new Object[] { var15, arg0, arg1 });
            if (this.field4181.contains(var13)) {
                var14.method1977(17);
            } else {
                var14.method1977(15);
            }
            class64.method3748(var14);
        }
        Iterator var16 = this.field4181.iterator();
        while (var16.hasNext()) {
            class199 var17 = (class199) var16.next();
            if (!var11.contains(var17)) {
                class81 var18 = new class81();
                class204 var19 = new class204(var17.method3225(), var17.field2206, var17.field2205);
                var18.method1976(new Object[] { var19, arg0, arg1 });
                var18.method1977(16);
                class64.method3748(var18);
            }
        }
        this.field4181 = var11;
    }

    @ObfuscatedName("ng.a(IIZZI)V")
    public void method5934(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class398.method2381();
        this.method5799(arg0, arg1, arg3, var5);
        if (!this.method5954() && arg3 || arg2) {
            if (arg3) {
                this.field4166 = arg0;
                this.field4161 = arg1;
                this.field4164 = this.field4173;
                this.field4165 = this.field4147;
            }
            if (this.field4164 != -1) {
                int var7 = arg0 - this.field4166;
                int var8 = arg1 - this.field4161;
                this.method5859(this.field4164 - (int) ((float) var7 / this.field4153), this.field4165 + (int) ((float) var8 / this.field4153), false);
            }
        } else {
            this.method5933();
        }
        if (arg3) {
            this.field4168 = var5;
            this.field4170 = arg0;
            this.field4149 = arg1;
        }
    }

    @ObfuscatedName("ng.o(IIZJ)V")
    public void method5799(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4130 == null) {
            this.field4148 = null;
            return;
        }
        int var6 = (int) ((float) this.field4173 + ((float) (arg0 - this.field4156) - (float) this.method5832() * this.field4152 / 2.0F) / this.field4152);
        int var7 = (int) ((float) this.field4147 - ((float) (arg1 - this.field4157) - (float) this.method5833() * this.field4152 / 2.0F) / this.field4152);
        this.field4148 = this.field4130.method3271(var6 + this.field4130.method3279() * 64, var7 + this.field4130.method3281() * 64);
        if (this.field4148 == null || !arg2) {
            return;
        }
        boolean var8 = client.field640 >= 2;
        if (var8 && class24.field118[82] && class24.field118[81]) {
            client.method2676(this.field4148.field3017, this.field4148.field3016, this.field4148.field3018, false);
            return;
        }
        boolean var9 = true;
        if (this.field4171) {
            int var10 = arg0 - this.field4170;
            int var11 = arg1 - this.field4149;
            if (arg3 - this.field4168 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class242 var12 = class242.method3564(class240.field2721, client.field562.field1277);
            var12.field2792.method6292(this.field4148.method4479());
            client.field562.method2269(var12);
            this.field4168 = 0L;
        }
    }

    @ObfuscatedName("ng.g(I)V")
    public void method5800() {
        if (Statics.field1441 != null) {
            this.field4152 = this.field4153;
            return;
        }
        if (this.field4152 < this.field4153) {
            this.field4152 = Math.min(this.field4153, this.field4152 / 30.0F + this.field4152);
        }
        if (this.field4152 > this.field4153) {
            this.field4152 = Math.max(this.field4153, this.field4152 - this.field4152 / 30.0F);
        }
    }

    @ObfuscatedName("ng.e(I)V")
    public void method5814() {
        if (!this.method5954()) {
            return;
        }
        int var1 = this.field4127 - this.field4173;
        int var2 = this.field4139 - this.field4147;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5859(this.field4173 + var1, this.field4147 + var2, true);
        if (this.field4173 == this.field4127 && this.field4147 == this.field4139) {
            this.field4127 = -1;
            this.field4139 = -1;
        }
    }

    @ObfuscatedName("ng.p(IIZI)V")
    public final void method5859(int arg0, int arg1, boolean arg2) {
        this.field4173 = arg0;
        this.field4147 = arg1;
        class398.method2381();
        if (arg2) {
            this.method5933();
        }
    }

    @ObfuscatedName("ng.j(I)V")
    public final void method5933() {
        this.field4161 = -1;
        this.field4166 = -1;
        this.field4165 = -1;
        this.field4164 = -1;
    }

    @ObfuscatedName("ng.b(S)Z")
    public boolean method5954() {
        return this.field4127 != -1 && this.field4139 != -1;
    }

    @ObfuscatedName("ng.x(IIII)Lfb;")
    public class181 method5963(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4142.values().iterator();
        class181 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class181) var4.next();
        } while (!var5.method3268(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ng.y(IIIZI)V")
    public void method5806(int arg0, int arg1, int arg2, boolean arg3) {
        class181 var5 = this.method5963(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4162;
        }
        boolean var6 = false;
        if (this.field4146 != var5 || arg3) {
            this.field4146 = var5;
            this.method5810(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5825(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ng.k(II)V")
    public void method5807(int arg0) {
        class181 var2 = this.method5826(arg0);
        if (var2 != null) {
            this.method5810(var2);
        }
    }

    @ObfuscatedName("ng.t(S)I")
    public int method5808() {
        return this.field4130 == null ? -1 : this.field4130.method3277();
    }

    @ObfuscatedName("ng.l(I)Lfb;")
    public class181 method5809() {
        return this.field4130;
    }

    @ObfuscatedName("ng.u(Lfb;I)V")
    public void method5810(class181 arg0) {
        if (this.field4130 == null || this.field4130 != arg0) {
            this.method5844(arg0);
            this.method5825(-1, -1, -1);
        }
    }

    @ObfuscatedName("ng.n(Lfb;B)V")
    public void method5844(class181 arg0) {
        this.field4130 = arg0;
        this.field4144 = new class183(this.field4141, this.field4140, this.field4134, this.field4135);
        this.field4154.method5790(this.field4130.method3303());
    }

    @ObfuscatedName("ng.z(Lfb;Lie;Lie;ZI)V")
    public void method5944(class181 arg0, class258 arg1, class258 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4130 == null || this.field4130 != arg0) {
            this.method5844(arg0);
        }
        if (!arg3 && this.field4130.method3268(arg1.field3018, arg1.field3017, arg1.field3016)) {
            this.method5825(arg1.field3018, arg1.field3017, arg1.field3016);
        } else {
            this.method5825(arg2.field3018, arg2.field3017, arg2.field3016);
        }
    }

    @ObfuscatedName("ng.q(IIIB)V")
    public void method5825(int arg0, int arg1, int arg2) {
        if (this.field4130 == null) {
            return;
        }
        int[] var4 = this.field4130.method3270(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4130.method3270(this.field4130.method3284(), this.field4130.method3283(), this.field4130.method3295());
        }
        this.method5859(var4[0] - this.field4130.method3279() * 64, var4[1] - this.field4130.method3281() * 64, true);
        this.field4127 = -1;
        this.field4139 = -1;
        this.field4152 = this.method5943(this.field4130.method3278());
        this.field4153 = this.field4152;
        this.field4179 = null;
        this.field4180 = null;
        this.field4144.method3463();
    }

    @ObfuscatedName("ng.d(IIIIII)V")
    public void method5976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class410.method6557(var6);
        class410.method6519(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class410.method6580(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4154.method5781();
        if (var7 < 100) {
            this.method5819(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4144.method3469()) {
            this.field4144.method3462(this.field4133, this.field4130.method3303(), client.field623);
            if (!this.field4144.method3469()) {
                return;
            }
        }
        if (this.field4151 != null) {
            this.field4163++;
            if (this.field4163 % this.field4159 == 0) {
                this.field4163 = 0;
                this.field4167++;
            }
            if (this.field4167 >= this.field4158 && !this.field4160) {
                this.field4151 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4152));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4152));
        this.field4144.method3464(this.field4173 - var8 / 2, this.field4147 - var9 / 2, var8 / 2 + this.field4173, var9 / 2 + this.field4147, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4182) {
            boolean var10 = false;
            if (arg4 - this.field4136 > 100) {
                this.field4136 = arg4;
                var10 = true;
            }
            this.field4144.method3490(this.field4173 - var8 / 2, this.field4147 - var9 / 2, var8 / 2 + this.field4173, var9 / 2 + this.field4147, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4175, this.field4151, this.field4163, this.field4159, var10);
        }
        this.method5816(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field640 >= 2;
        if (var11 && this.field4183 && this.field4148 != null) {
            this.field4131.method5165("Coord: " + this.field4148, class410.field4371 + 10, class410.field4370 + 20, 16776960, -1);
        }
        this.field4145 = var8;
        this.field4155 = var9;
        this.field4156 = arg0;
        this.field4157 = arg1;
        class410.method6522(var6);
    }

    @ObfuscatedName("ng.r(IIIIIII)Z")
    public boolean method5815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4184 == null) {
            return true;
        } else if (this.field4184.field4394 != arg0 || this.field4184.field4395 != arg1) {
            return true;
        } else if (this.field4144.field2083 != this.field4185) {
            return true;
        } else if (client.field743 != this.field4188) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ng.m(IIIIIII)V")
    public void method5816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1441 == null) {
            return;
        }
        int var7 = 512 / (this.field4144.field2083 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5829() - arg4 / 2 - var7;
        int var14 = this.method5928() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4144.field2083 * (var7 + var13 - this.field4186);
        int var16 = arg1 - this.field4144.field2083 * (var7 - (var14 - this.field4137));
        if (this.method5815(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4184 != null && this.field4184.field4394 == var11 && this.field4184.field4395 == var12) {
                Arrays.fill(this.field4184.field4396, 0);
            } else {
                this.field4184 = new class414(var11, var12);
            }
            this.field4186 = this.method5829() - arg4 / 2 - var7;
            this.field4137 = this.method5928() - arg5 / 2 - var7;
            this.field4185 = this.field4144.field2083;
            Statics.field1441.method4922(this.field4186, this.field4137, this.field4184, (float) this.field4185 / var10);
            this.field4188 = client.field743;
            var15 = arg0 - this.field4144.field2083 * (var7 + var13 - this.field4186);
            var16 = arg1 - this.field4144.field2083 * (var7 - (var14 - this.field4137));
        }
        class410.method6526(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4184.method6676(var15, var16, 192);
        } else {
            this.field4184.method6658(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ng.c(IIIII)V")
    public void method5821(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4154.method5780()) {
            return;
        }
        if (!this.field4144.method3469()) {
            this.field4144.method3462(this.field4133, this.field4130.method3303(), client.field623);
            if (!this.field4144.method3469()) {
                return;
            }
        }
        this.field4144.method3466(arg0, arg1, arg2, arg3, this.field4151, this.field4163, this.field4159);
    }

    @ObfuscatedName("ng.f(II)V")
    public void method5818(int arg0) {
        this.field4153 = this.method5943(arg0);
    }

    @ObfuscatedName("ng.h(IIIIII)V")
    public void method5819(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class410.method6580(arg0, arg1, arg2, arg3, -16777216);
        class410.method6530(var7 - 152, var8, 304, 34, -65536);
        class410.method6580(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4131.method5168(class283.field3535, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ng.v(IB)F")
    public float method5943(int arg0) {
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

    @ObfuscatedName("ng.ag(I)I")
    public int method5820() {
        if ((double) this.field4153 == 1.0D) {
            return 25;
        } else if ((double) this.field4153 == 1.5D) {
            return 37;
        } else if ((double) this.field4153 == 2.0D) {
            return 50;
        } else if ((double) this.field4153 == 3.0D) {
            return 75;
        } else if ((double) this.field4153 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ng.ae(B)V")
    public void method5822() {
        this.field4154.method5779();
    }

    @ObfuscatedName("ng.aq(S)Z")
    public boolean method5823() {
        return this.field4154.method5780();
    }

    @ObfuscatedName("ng.al(IB)Lfb;")
    public class181 method5826(int arg0) {
        Iterator var2 = this.field4142.values().iterator();
        class181 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class181) var2.next();
        } while (var3.method3277() != arg0);
        return var3;
    }

    @ObfuscatedName("ng.am(III)V")
    public void method5805(int arg0, int arg1) {
        if (this.field4130 != null && this.field4130.method3320(arg0, arg1)) {
            this.field4127 = arg0 - this.field4130.method3279() * 64;
            this.field4139 = arg1 - this.field4130.method3281() * 64;
        }
    }

    @ObfuscatedName("ng.ai(III)V")
    public void method5956(int arg0, int arg1) {
        if (this.field4130 != null) {
            this.method5859(arg0 - this.field4130.method3279() * 64, arg1 - this.field4130.method3281() * 64, true);
            this.field4127 = -1;
            this.field4139 = -1;
        }
    }

    @ObfuscatedName("ng.ah(IIII)V")
    public void method5924(int arg0, int arg1, int arg2) {
        if (this.field4130 != null) {
            int[] var4 = this.field4130.method3270(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5805(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ng.as(IIII)V")
    public void method5828(int arg0, int arg1, int arg2) {
        if (this.field4130 != null) {
            int[] var4 = this.field4130.method3270(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5956(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ng.at(I)I")
    public int method5829() {
        return this.field4130 == null ? -1 : this.field4173 + this.field4130.method3279() * 64;
    }

    @ObfuscatedName("ng.az(I)I")
    public int method5928() {
        return this.field4130 == null ? -1 : this.field4147 + this.field4130.method3281() * 64;
    }

    @ObfuscatedName("ng.ac(I)Lie;")
    public class258 method5798() {
        return this.field4130 == null ? null : this.field4130.method3271(this.method5829(), this.method5928());
    }

    @ObfuscatedName("ng.ak(B)I")
    public int method5832() {
        return this.field4145;
    }

    @ObfuscatedName("ng.ab(I)I")
    public int method5833() {
        return this.field4155;
    }

    @ObfuscatedName("ng.ar(IB)V")
    public void method5834(int arg0) {
        if (arg0 >= 1) {
            this.field4158 = arg0;
        }
    }

    @ObfuscatedName("ng.ad(B)V")
    public void method5972() {
        this.field4158 = 3;
    }

    @ObfuscatedName("ng.an(II)V")
    public void method5836(int arg0) {
        if (arg0 >= 1) {
            this.field4159 = arg0;
        }
    }

    @ObfuscatedName("ng.ax(I)V")
    public void method5813() {
        this.field4159 = 50;
    }

    @ObfuscatedName("ng.av(ZB)V")
    public void method5838(boolean arg0) {
        this.field4160 = arg0;
    }

    @ObfuscatedName("ng.ap(II)V")
    public void method5839(int arg0) {
        this.field4151 = new HashSet();
        this.field4151.add(arg0);
        this.field4167 = 0;
        this.field4163 = 0;
    }

    @ObfuscatedName("ng.au(IB)V")
    public void method5840(int arg0) {
        this.field4151 = new HashSet();
        this.field4167 = 0;
        this.field4163 = 0;
        for (int var2 = 0; var2 < Statics.field1621; var2++) {
            if (class154.method3068(var2) != null && class154.method3068(var2).field1641 == arg0) {
                this.field4151.add(class154.method3068(var2).field1623);
            }
        }
    }

    @ObfuscatedName("ng.aj(I)V")
    public void method5841() {
        this.field4151 = null;
    }

    @ObfuscatedName("ng.af(ZI)V")
    public void method5842(boolean arg0) {
        this.field4182 = !arg0;
    }

    @ObfuscatedName("ng.aw(IZB)V")
    public void method5922(int arg0, boolean arg1) {
        if (arg1) {
            this.field4172.remove(arg0);
        } else {
            this.field4172.add(arg0);
        }
        this.method5910();
    }

    @ObfuscatedName("ng.ao(IZB)V")
    public void method5875(int arg0, boolean arg1) {
        if (arg1) {
            this.field4187.remove(arg0);
        } else {
            this.field4187.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1621; var3++) {
            if (class154.method3068(var3) != null && class154.method3068(var3).field1641 == arg0) {
                int var4 = class154.method3068(var3).field1623;
                if (arg1) {
                    this.field4174.remove(var4);
                } else {
                    this.field4174.add(var4);
                }
            }
        }
        this.method5910();
    }

    @ObfuscatedName("ng.aa(I)Z")
    public boolean method5845() {
        return !this.field4182;
    }

    @ObfuscatedName("ng.ay(II)Z")
    public boolean method5846(int arg0) {
        return !this.field4172.contains(arg0);
    }

    @ObfuscatedName("ng.bg(IB)Z")
    public boolean method5881(int arg0) {
        return !this.field4187.contains(arg0);
    }

    @ObfuscatedName("ng.bl(B)V")
    public void method5910() {
        this.field4175.clear();
        this.field4175.addAll(this.field4172);
        this.field4175.addAll(this.field4174);
    }

    @ObfuscatedName("ng.bx(IIIIIIB)V")
    public void method5849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4154.method5780()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4152));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4152));
        List var9 = this.field4144.method3487(this.field4173 - var7 / 2 - 1, this.field4147 - var8 / 2 - 1, var7 / 2 + this.field4173 + 1, var8 / 2 + this.field4147 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class154 var12 = class154.method3068(var11.method3225());
            var13 = false;
            for (int var14 = this.field4178.length - 1; var14 >= 0; var14--) {
                if (var12.field1631[var14] != null) {
                    client.method2776(var12.field1631[var14], var12.field1640, this.field4178[var14], var11.method3225(), var11.field2206.method4479(), var11.field2205.method4479());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ng.bd(ILie;I)Lie;")
    public class258 method5975(int arg0, class258 arg1) {
        if (!this.field4154.method5780()) {
            return null;
        } else if (!this.field4144.method3469()) {
            return null;
        } else if (this.field4130.method3320(arg1.field3017, arg1.field3016)) {
            HashMap var3 = this.field4144.method3477();
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
                        return var5.field2205;
                    }
                    var8 = (class199) var7.next();
                    int var9 = var8.field2205.field3017 - arg1.field3017;
                    int var10 = var8.field2205.field3016 - arg1.field3016;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2205;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ng.bt(IILie;Lie;B)V")
    public void method5851(int arg0, int arg1, class258 arg2, class258 arg3) {
        class81 var5 = new class81();
        class204 var6 = new class204(arg1, arg2, arg3);
        var5.method1976(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1977(10);
                break;
            case 1009:
                var5.method1977(11);
                break;
            case 1010:
                var5.method1977(12);
                break;
            case 1011:
                var5.method1977(13);
                break;
            case 1012:
                var5.method1977(14);
        }
        class64.method3748(var5);
    }

    @ObfuscatedName("ng.bf(I)Lgm;")
    public class199 method5852() {
        if (!this.field4154.method5780()) {
            return null;
        } else if (this.field4144.method3469()) {
            HashMap var1 = this.field4144.method3477();
            this.field4179 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4179.addAll(var3);
            }
            this.field4180 = this.field4179.iterator();
            return this.method5853();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ng.bw(I)Lgm;")
    public class199 method5853() {
        if (this.field4180 == null) {
            return null;
        }
        class199 var1;
        do {
            if (!this.field4180.hasNext()) {
                return null;
            }
            var1 = (class199) this.field4180.next();
        } while (var1.method3225() == -1);
        return var1;
    }
}
