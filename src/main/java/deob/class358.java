package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("me")
public class class358 {

    @ObfuscatedName("me.m")
    public class276 field4022;

    @ObfuscatedName("me.r")
    public class276 field3992;

    @ObfuscatedName("me.h")
    public class276 field3998;

    @ObfuscatedName("me.d")
    public static final class360 field4031 = class360.field4064;

    @ObfuscatedName("me.z")
    public static final class360 field4032 = class360.field4061;

    @ObfuscatedName("me.b")
    public static final class360 field4001 = class360.field4060;

    @ObfuscatedName("me.i")
    public class301 field4002;

    @ObfuscatedName("me.k")
    public HashMap field4003;

    @ObfuscatedName("me.g")
    public class396[] field3996;

    @ObfuscatedName("me.t")
    public HashMap field4005;

    @ObfuscatedName("me.x")
    public class167 field4046;

    @ObfuscatedName("me.u")
    public class167 field4007;

    @ObfuscatedName("me.q")
    public class167 field4008;

    @ObfuscatedName("me.s")
    public class169 field4009;

    @ObfuscatedName("me.p")
    public class357 field4010;

    @ObfuscatedName("me.c")
    public int field4006;

    @ObfuscatedName("me.n")
    public int field3999;

    @ObfuscatedName("me.l")
    public int field4013 = -1;

    @ObfuscatedName("me.w")
    public int field4014 = -1;

    @ObfuscatedName("me.a")
    public float field4015;

    @ObfuscatedName("me.aw")
    public float field4016;

    @ObfuscatedName("me.ak")
    public int field4017 = -1;

    @ObfuscatedName("me.ad")
    public int field4018 = -1;

    @ObfuscatedName("me.at")
    public int field4019 = -1;

    @ObfuscatedName("me.ah")
    public int field4020 = -1;

    @ObfuscatedName("me.az")
    public int field4021 = 3;

    @ObfuscatedName("me.ap")
    public int field4024 = 50;

    @ObfuscatedName("me.ag")
    public boolean field4051 = false;

    @ObfuscatedName("me.ab")
    public HashSet field4037 = null;

    @ObfuscatedName("me.aq")
    public int field4025 = -1;

    @ObfuscatedName("me.ae")
    public int field4004 = -1;

    @ObfuscatedName("me.ao")
    public int field4012 = -1;

    @ObfuscatedName("me.an")
    public int field4028 = -1;

    @ObfuscatedName("me.al")
    public int field4029 = -1;

    @ObfuscatedName("me.aj")
    public int field4023 = -1;

    @ObfuscatedName("me.ac")
    public long field3993;

    @ObfuscatedName("me.as")
    public int field3997;

    @ObfuscatedName("me.au")
    public int field4033;

    @ObfuscatedName("me.ay")
    public boolean field4034 = true;

    @ObfuscatedName("me.ai")
    public HashSet field4035 = new HashSet();

    @ObfuscatedName("me.av")
    public HashSet field4036 = new HashSet();

    @ObfuscatedName("me.ax")
    public HashSet field4026 = new HashSet();

    @ObfuscatedName("me.ar")
    public HashSet field4038 = new HashSet();

    @ObfuscatedName("me.af")
    public boolean field4039 = false;

    @ObfuscatedName("me.bq")
    public int field4000 = 0;

    @ObfuscatedName("me.bi")
    public final int[] field4041 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("me.bz")
    public List field4042;

    @ObfuscatedName("me.bb")
    public Iterator field4043;

    @ObfuscatedName("me.bv")
    public HashSet field4044 = new HashSet();

    @ObfuscatedName("me.bc")
    public class244 field4045 = null;

    @ObfuscatedName("me.be")
    public boolean field4040 = false;

    @ObfuscatedName("me.ba")
    public class397 field4011;

    @ObfuscatedName("me.bs")
    public int field4048;

    @ObfuscatedName("me.br")
    public int field4049 = -1;

    @ObfuscatedName("me.bw")
    public int field4050 = -1;

    @ObfuscatedName("me.by")
    public int field4027 = -1;

    @ObfuscatedName("me.f(Ljp;Ljp;Ljp;Lkj;Ljava/util/HashMap;[Lof;I)V")
    public void method5447(class276 arg0, class276 arg1, class276 arg2, class301 arg3, HashMap arg4, class396[] arg5) {
        this.field3996 = arg5;
        this.field4022 = arg0;
        this.field3992 = arg1;
        this.field3998 = arg2;
        this.field4002 = arg3;
        this.field4003 = new HashMap();
        this.field4003.put(class164.field1942, arg4.get(field4031));
        this.field4003.put(class164.field1948, arg4.get(field4032));
        this.field4003.put(class164.field1943, arg4.get(field4001));
        this.field4010 = new class357(arg0);
        int var7 = this.field4022.method4582(class186.field2132.field2134);
        int[] var8 = this.field4022.method4513(var7);
        this.field4005 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class384 var10 = new class384(this.field4022.method4504(var7, var8[var9]));
            class167 var11 = new class167();
            var11.method3064(var10, var8[var9]);
            this.field4005.put(var11.method3042(), var11);
            if (var11.method3027()) {
                this.field4046 = var11;
            }
        }
        this.method5493(this.field4046);
        this.field4008 = null;
    }

    @ObfuscatedName("me.e(B)V")
    public void method5556() {
        class168.field1982.method3964(5);
    }

    @ObfuscatedName("me.v(IIZIIIIB)V")
    public void method5449(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4010.method5444()) {
            return;
        }
        this.method5527();
        this.method5453();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4015));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4015));
        List var10 = this.field4009.method3209(this.field4006 - var8 / 2 - 1, this.field3999 - var9 / 2 - 1, var8 / 2 + this.field4006 + 1, var9 / 2 + this.field3999 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class185 var13 = (class185) var12.next();
            var11.add(var13);
            class96 var14 = new class96();
            class190 var15 = new class190(var13.method2967(), var13.field2125, var13.field2122);
            var14.method1928(new Object[] { var15, arg0, arg1 });
            if (this.field4044.contains(var13)) {
                var14.method1931(17);
            } else {
                var14.method1931(15);
            }
            Statics.method3331(var14);
        }
        Iterator var16 = this.field4044.iterator();
        while (var16.hasNext()) {
            class185 var17 = (class185) var16.next();
            if (!var11.contains(var17)) {
                class96 var18 = new class96();
                class190 var19 = new class190(var17.method2967(), var17.field2125, var17.field2122);
                var18.method1928(new Object[] { var19, arg0, arg1 });
                var18.method1931(16);
                Statics.method3331(var18);
            }
        }
        this.field4044 = var11;
    }

    @ObfuscatedName("me.y(IIZZI)V")
    public void method5450(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class381.method4000();
        this.method5477(arg0, arg1, arg3, var5);
        if (!this.method5448() && arg3 || arg2) {
            if (arg3) {
                this.field4029 = arg0;
                this.field4023 = arg1;
                this.field4012 = this.field4006;
                this.field4028 = this.field3999;
            }
            if (this.field4012 != -1) {
                int var7 = arg0 - this.field4029;
                int var8 = arg1 - this.field4023;
                this.method5454(this.field4012 - (int) ((float) var7 / this.field4016), this.field4028 + (int) ((float) var8 / this.field4016), false);
            }
        } else {
            this.method5455();
        }
        if (arg3) {
            this.field3993 = var5;
            this.field3997 = arg0;
            this.field4033 = arg1;
        }
    }

    @ObfuscatedName("me.j(IIZJ)V")
    public void method5477(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4007 == null) {
            this.field4045 = null;
            return;
        }
        int var6 = (int) ((float) this.field4006 + ((float) (arg0 - this.field4019) - (float) this.method5484() * this.field4015 / 2.0F) / this.field4015);
        int var7 = (int) ((float) this.field3999 - ((float) (arg1 - this.field4020) - (float) this.method5485() * this.field4015 / 2.0F) / this.field4015);
        this.field4045 = this.field4007.method3024(var6 + this.field4007.method3032() * 64, var7 + this.field4007.method3034() * 64);
        if (this.field4045 == null || !arg2) {
            return;
        }
        boolean var8 = client.field792 >= 2;
        if (var8 && class39.field259[82] && class39.field259[81]) {
            int var9 = this.field4045.field2927;
            int var10 = this.field4045.field2928;
            int var11 = this.field4045.field2929;
            class228 var12 = class228.method1927(class226.field2597, client.field669.field1410);
            var12.field2700.method5881(var9);
            var12.field2700.method5943(0);
            var12.field2700.method5924(var11);
            var12.field2700.method5932(var10);
            client.field669.method2200(var12);
            return;
        }
        boolean var13 = true;
        if (this.field4034) {
            int var14 = arg0 - this.field3997;
            int var15 = arg1 - this.field4033;
            if (arg3 - this.field3993 > 500L || var14 < -25 || var14 > 25 || var15 < -25 || var15 > 25) {
                var13 = false;
            }
        }
        if (var13) {
            class228 var16 = class228.method1927(class226.field2576, client.field669.field1410);
            var16.field2700.method5941(this.field4045.method4256());
            client.field669.method2200(var16);
            this.field3993 = 0L;
        }
    }

    @ObfuscatedName("me.o(I)V")
    public void method5527() {
        if (Statics.field2801 != null) {
            this.field4015 = this.field4016;
            return;
        }
        if (this.field4015 < this.field4016) {
            this.field4015 = Math.min(this.field4016, this.field4015 / 30.0F + this.field4015);
        }
        if (this.field4015 > this.field4016) {
            this.field4015 = Math.max(this.field4016, this.field4015 - this.field4015 / 30.0F);
        }
    }

    @ObfuscatedName("me.m(I)V")
    public void method5453() {
        if (!this.method5448()) {
            return;
        }
        int var1 = this.field4013 - this.field4006;
        int var2 = this.field4014 - this.field3999;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5454(this.field4006 + var1, this.field3999 + var2, true);
        if (this.field4013 == this.field4006 && this.field4014 == this.field3999) {
            this.field4013 = -1;
            this.field4014 = -1;
        }
    }

    @ObfuscatedName("me.r(IIZI)V")
    public final void method5454(int arg0, int arg1, boolean arg2) {
        this.field4006 = arg0;
        this.field3999 = arg1;
        class381.method4000();
        if (arg2) {
            this.method5455();
        }
    }

    @ObfuscatedName("me.h(I)V")
    public final void method5455() {
        this.field4023 = -1;
        this.field4029 = -1;
        this.field4028 = -1;
        this.field4012 = -1;
    }

    @ObfuscatedName("me.d(B)Z")
    public boolean method5448() {
        return this.field4013 != -1 && this.field4014 != -1;
    }

    @ObfuscatedName("me.z(IIIB)Lfa;")
    public class167 method5457(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4005.values().iterator();
        class167 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class167) var4.next();
        } while (!var5.method3021(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("me.b(IIIZI)V")
    public void method5604(int arg0, int arg1, int arg2, boolean arg3) {
        class167 var5 = this.method5457(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4046;
        }
        boolean var6 = false;
        if (this.field4008 != var5 || arg3) {
            this.field4008 = var5;
            this.method5493(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5465(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("me.i(IB)V")
    public void method5513(int arg0) {
        class167 var2 = this.method5495(arg0);
        if (var2 != null) {
            this.method5493(var2);
        }
    }

    @ObfuscatedName("me.k(I)I")
    public int method5460() {
        return this.field4007 == null ? -1 : this.field4007.method3026();
    }

    @ObfuscatedName("me.g(B)Lfa;")
    public class167 method5461() {
        return this.field4007;
    }

    @ObfuscatedName("me.t(Lfa;I)V")
    public void method5493(class167 arg0) {
        if (this.field4007 == null || this.field4007 != arg0) {
            this.method5463(arg0);
            this.method5465(-1, -1, -1);
        }
    }

    @ObfuscatedName("me.x(Lfa;I)V")
    public void method5463(class167 arg0) {
        this.field4007 = arg0;
        this.field4009 = new class169(this.field3996, this.field4003, this.field3992, this.field3998);
        this.field4010.method5436(this.field4007.method3042());
    }

    @ObfuscatedName("me.u(Lfa;Liw;Liw;ZI)V")
    public void method5464(class167 arg0, class244 arg1, class244 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4007 == null || this.field4007 != arg0) {
            this.method5463(arg0);
        }
        if (!arg3 && this.field4007.method3021(arg1.field2929, arg1.field2927, arg1.field2928)) {
            this.method5465(arg1.field2929, arg1.field2927, arg1.field2928);
        } else {
            this.method5465(arg2.field2929, arg2.field2927, arg2.field2928);
        }
    }

    @ObfuscatedName("me.q(IIII)V")
    public void method5465(int arg0, int arg1, int arg2) {
        if (this.field4007 == null) {
            return;
        }
        int[] var4 = this.field4007.method3023(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4007.method3023(this.field4007.method3037(), this.field4007.method3036(), this.field4007.method3038());
        }
        this.method5454(var4[0] - this.field4007.method3032() * 64, var4[1] - this.field4007.method3034() * 64, true);
        this.field4013 = -1;
        this.field4014 = -1;
        this.field4015 = this.method5545(this.field4007.method3082());
        this.field4016 = this.field4015;
        this.field4042 = null;
        this.field4043 = null;
        this.field4009.method3205();
    }

    @ObfuscatedName("me.s(IIIIII)V")
    public void method5508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class393.method6175(var6);
        class393.method6217(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class393.method6184(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4010.method5439();
        if (var7 < 100) {
            this.method5456(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4009.method3203()) {
            this.field4009.method3204(this.field4022, this.field4007.method3042(), client.field623);
            if (!this.field4009.method3203()) {
                return;
            }
        }
        if (this.field4037 != null) {
            this.field4004++;
            if (this.field4004 % this.field4024 == 0) {
                this.field4004 = 0;
                this.field4025++;
            }
            if (this.field4025 >= this.field4021 && !this.field4051) {
                this.field4037 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4015));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4015));
        this.field4009.method3227(this.field4006 - var8 / 2, this.field3999 - var9 / 2, var8 / 2 + this.field4006, var9 / 2 + this.field3999, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4039) {
            boolean var10 = false;
            if (arg4 - this.field4000 > 100) {
                this.field4000 = arg4;
                var10 = true;
            }
            this.field4009.method3207(this.field4006 - var8 / 2, this.field3999 - var9 / 2, var8 / 2 + this.field4006, var9 / 2 + this.field3999, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4038, this.field4037, this.field4004, this.field4024, var10);
        }
        this.method5468(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field792 >= 2;
        if (var11 && this.field4040 && this.field4045 != null) {
            this.field4002.method4924("Coord: " + this.field4045, class393.field4234 + 10, class393.field4229 + 20, 16776960, -1);
        }
        this.field4017 = var8;
        this.field4018 = var9;
        this.field4019 = arg0;
        this.field4020 = arg1;
        class393.method6179(var6);
    }

    @ObfuscatedName("me.p(IIIIIII)Z")
    public boolean method5459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4011 == null) {
            return true;
        } else if (this.field4011.field4262 != arg0 || this.field4011.field4254 != arg1) {
            return true;
        } else if (this.field4009.field2007 != this.field4048) {
            return true;
        } else if (client.field799 != this.field4027) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("me.c(IIIIIII)V")
    public void method5468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field2801 == null) {
            return;
        }
        int var7 = 512 / (this.field4009.field2007 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5622() - arg4 / 2 - var7;
        int var14 = this.method5482() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4009.field2007 * (var7 + var13 - this.field4049);
        int var16 = arg1 - this.field4009.field2007 * (var7 - (var14 - this.field4050));
        if (this.method5459(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4011 != null && this.field4011.field4262 == var11 && this.field4011.field4254 == var12) {
                Arrays.fill(this.field4011.field4263, 0);
            } else {
                this.field4011 = new class397(var11, var12);
            }
            this.field4049 = this.method5622() - arg4 / 2 - var7;
            this.field4050 = this.method5482() - arg5 / 2 - var7;
            this.field4048 = this.field4009.field2007;
            Statics.field2801.method4673(this.field4049, this.field4050, this.field4011, (float) this.field4048 / var10);
            this.field4027 = client.field799;
            var15 = arg0 - this.field4009.field2007 * (var7 + var13 - this.field4049);
            var16 = arg1 - this.field4009.field2007 * (var7 - (var14 - this.field4050));
        }
        class393.method6183(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4011.method6296(var15, var16, 192);
        } else {
            this.field4011.method6299(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("me.n(IIIII)V")
    public void method5469(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4010.method5444()) {
            return;
        }
        if (!this.field4009.method3203()) {
            this.field4009.method3204(this.field4022, this.field4007.method3042(), client.field623);
            if (!this.field4009.method3203()) {
                return;
            }
        }
        this.field4009.method3208(arg0, arg1, arg2, arg3, this.field4037, this.field4004, this.field4024);
    }

    @ObfuscatedName("me.l(II)V")
    public void method5470(int arg0) {
        this.field4016 = this.method5545(arg0);
    }

    @ObfuscatedName("me.w(IIIIII)V")
    public void method5456(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class393.method6184(arg0, arg1, arg2, arg3, -16777216);
        class393.method6192(var7 - 152, var8, 304, 34, -65536);
        class393.method6184(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4002.method4884(class269.field3531, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("me.a(IB)F")
    public float method5545(int arg0) {
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

    @ObfuscatedName("me.aw(I)I")
    public int method5473() {
        if ((double) this.field4016 == 1.0D) {
            return 25;
        } else if ((double) this.field4016 == 1.5D) {
            return 37;
        } else if ((double) this.field4016 == 2.0D) {
            return 50;
        } else if ((double) this.field4016 == 3.0D) {
            return 75;
        } else if ((double) this.field4016 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("me.ak(I)V")
    public void method5474() {
        this.field4010.method5437();
    }

    @ObfuscatedName("me.ad(B)Z")
    public boolean method5492() {
        return this.field4010.method5444();
    }

    @ObfuscatedName("me.at(II)Lfa;")
    public class167 method5495(int arg0) {
        Iterator var2 = this.field4005.values().iterator();
        class167 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class167) var2.next();
        } while (var3.method3026() != arg0);
        return var3;
    }

    @ObfuscatedName("me.ah(III)V")
    public void method5497(int arg0, int arg1) {
        if (this.field4007 != null && this.field4007.method3022(arg0, arg1)) {
            this.field4013 = arg0 - this.field4007.method3032() * 64;
            this.field4014 = arg1 - this.field4007.method3034() * 64;
        }
    }

    @ObfuscatedName("me.az(III)V")
    public void method5510(int arg0, int arg1) {
        if (this.field4007 != null) {
            this.method5454(arg0 - this.field4007.method3032() * 64, arg1 - this.field4007.method3034() * 64, true);
            this.field4013 = -1;
            this.field4014 = -1;
        }
    }

    @ObfuscatedName("me.ap(IIII)V")
    public void method5589(int arg0, int arg1, int arg2) {
        if (this.field4007 != null) {
            int[] var4 = this.field4007.method3023(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5497(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("me.ag(IIII)V")
    public void method5480(int arg0, int arg1, int arg2) {
        if (this.field4007 != null) {
            int[] var4 = this.field4007.method3023(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5510(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("me.ab(I)I")
    public int method5622() {
        return this.field4007 == null ? -1 : this.field4006 + this.field4007.method3032() * 64;
    }

    @ObfuscatedName("me.aq(I)I")
    public int method5482() {
        return this.field4007 == null ? -1 : this.field3999 + this.field4007.method3034() * 64;
    }

    @ObfuscatedName("me.ae(I)Liw;")
    public class244 method5483() {
        return this.field4007 == null ? null : this.field4007.method3024(this.method5622(), this.method5482());
    }

    @ObfuscatedName("me.ao(S)I")
    public int method5484() {
        return this.field4017;
    }

    @ObfuscatedName("me.an(B)I")
    public int method5485() {
        return this.field4018;
    }

    @ObfuscatedName("me.al(IB)V")
    public void method5452(int arg0) {
        if (arg0 >= 1) {
            this.field4021 = arg0;
        }
    }

    @ObfuscatedName("me.aj(I)V")
    public void method5486() {
        this.field4021 = 3;
    }

    @ObfuscatedName("me.ac(II)V")
    public void method5487(int arg0) {
        if (arg0 >= 1) {
            this.field4024 = arg0;
        }
    }

    @ObfuscatedName("me.as(B)V")
    public void method5488() {
        this.field4024 = 50;
    }

    @ObfuscatedName("me.au(ZI)V")
    public void method5489(boolean arg0) {
        this.field4051 = arg0;
    }

    @ObfuscatedName("me.ay(II)V")
    public void method5490(int arg0) {
        this.field4037 = new HashSet();
        this.field4037.add(arg0);
        this.field4025 = 0;
        this.field4004 = 0;
    }

    @ObfuscatedName("me.am(II)V")
    public void method5541(int arg0) {
        this.field4037 = new HashSet();
        this.field4025 = 0;
        this.field4004 = 0;
        for (int var2 = 0; var2 < Statics.field1558; var2++) {
            if (class140.method4496(var2) != null && class140.method4496(var2).field1580 == arg0) {
                this.field4037.add(class140.method4496(var2).field1575);
            }
        }
    }

    @ObfuscatedName("me.aa(I)V")
    public void method5631() {
        this.field4037 = null;
    }

    @ObfuscatedName("me.ai(ZI)V")
    public void method5479(boolean arg0) {
        this.field4039 = !arg0;
    }

    @ObfuscatedName("me.av(IZI)V")
    public void method5494(int arg0, boolean arg1) {
        if (arg1) {
            this.field4035.remove(arg0);
        } else {
            this.field4035.add(arg0);
        }
        this.method5499();
    }

    @ObfuscatedName("me.ax(IZI)V")
    public void method5605(int arg0, boolean arg1) {
        if (arg1) {
            this.field4036.remove(arg0);
        } else {
            this.field4036.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1558; var3++) {
            if (class140.method4496(var3) != null && class140.method4496(var3).field1580 == arg0) {
                int var4 = class140.method4496(var3).field1575;
                if (arg1) {
                    this.field4026.remove(var4);
                } else {
                    this.field4026.add(var4);
                }
            }
        }
        this.method5499();
    }

    @ObfuscatedName("me.ar(I)Z")
    public boolean method5569() {
        return !this.field4039;
    }

    @ObfuscatedName("me.af(IB)Z")
    public boolean method5458(int arg0) {
        return !this.field4035.contains(arg0);
    }

    @ObfuscatedName("me.bq(II)Z")
    public boolean method5498(int arg0) {
        return !this.field4036.contains(arg0);
    }

    @ObfuscatedName("me.bx(I)V")
    public void method5499() {
        this.field4038.clear();
        this.field4038.addAll(this.field4035);
        this.field4038.addAll(this.field4026);
    }

    @ObfuscatedName("me.bi(IIIIIII)V")
    public void method5500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4010.method5444()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4015));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4015));
        List var9 = this.field4009.method3209(this.field4006 - var7 / 2 - 1, this.field3999 - var8 / 2 - 1, var7 / 2 + this.field4006 + 1, var8 / 2 + this.field3999 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class185 var11 = (class185) var10.next();
            class140 var12 = class140.method4496(var11.method2967());
            var13 = false;
            for (int var14 = this.field4041.length - 1; var14 >= 0; var14--) {
                if (var12.field1569[var14] != null) {
                    client.method186(var12.field1569[var14], var12.field1561, this.field4041[var14], var11.method2967(), var11.field2125.method4256(), var11.field2122.method4256());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("me.bz(ILiw;I)Liw;")
    public class244 method5501(int arg0, class244 arg1) {
        if (!this.field4010.method5444()) {
            return null;
        } else if (!this.field4009.method3203()) {
            return null;
        } else if (this.field4007.method3022(arg1.field2927, arg1.field2928)) {
            HashMap var3 = this.field4009.method3212();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class185 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class185 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2122;
                    }
                    var8 = (class185) var7.next();
                    int var9 = var8.field2122.field2927 - arg1.field2927;
                    int var10 = var8.field2122.field2928 - arg1.field2928;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2122;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("me.bb(IILiw;Liw;B)V")
    public void method5502(int arg0, int arg1, class244 arg2, class244 arg3) {
        class96 var5 = new class96();
        class190 var6 = new class190(arg1, arg2, arg3);
        var5.method1928(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1931(10);
                break;
            case 1009:
                var5.method1931(11);
                break;
            case 1010:
                var5.method1931(12);
                break;
            case 1011:
                var5.method1931(13);
                break;
            case 1012:
                var5.method1931(14);
        }
        Statics.method3331(var5);
    }

    @ObfuscatedName("me.bv(I)Lgh;")
    public class185 method5503() {
        if (!this.field4010.method5444()) {
            return null;
        } else if (this.field4009.method3203()) {
            HashMap var1 = this.field4009.method3212();
            this.field4042 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4042.addAll(var3);
            }
            this.field4043 = this.field4042.iterator();
            return this.method5504();
        } else {
            return null;
        }
    }

    @ObfuscatedName("me.bc(I)Lgh;")
    public class185 method5504() {
        if (this.field4043 == null) {
            return null;
        }
        class185 var1;
        do {
            if (!this.field4043.hasNext()) {
                return null;
            }
            var1 = (class185) this.field4043.next();
        } while (var1.method2967() == -1);
        return var1;
    }
}
