package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mr")
public class class356 {

    @ObfuscatedName("mr.k")
    public class253 field3996;

    @ObfuscatedName("mr.g")
    public class253 field3997;

    @ObfuscatedName("mr.h")
    public class253 field3998;

    @ObfuscatedName("mr.n")
    public static final class358 field3999 = class358.field4059;

    @ObfuscatedName("mr.l")
    public static final class358 field4020 = class358.field4056;

    @ObfuscatedName("mr.m")
    public static final class358 field4012 = class358.field4061;

    @ObfuscatedName("mr.d")
    public class299 field4002;

    @ObfuscatedName("mr.c")
    public HashMap field4003;

    @ObfuscatedName("mr.j")
    public class394[] field4004;

    @ObfuscatedName("mr.r")
    public HashMap field4005;

    @ObfuscatedName("mr.q")
    public class144 field4051;

    @ObfuscatedName("mr.t")
    public class144 field4007;

    @ObfuscatedName("mr.v")
    public class144 field4008;

    @ObfuscatedName("mr.x")
    public class146 field4009;

    @ObfuscatedName("mr.z")
    public class355 field4016;

    @ObfuscatedName("mr.i")
    public int field4042;

    @ObfuscatedName("mr.a")
    public int field4038;

    @ObfuscatedName("mr.w")
    public int field4001 = -1;

    @ObfuscatedName("mr.s")
    public int field4026 = -1;

    @ObfuscatedName("mr.y")
    public float field4015;

    @ObfuscatedName("mr.ac")
    public float field4018;

    @ObfuscatedName("mr.ay")
    public int field4011 = -1;

    @ObfuscatedName("mr.am")
    public int field4000 = -1;

    @ObfuscatedName("mr.ag")
    public int field4019 = -1;

    @ObfuscatedName("mr.aq")
    public int field4050 = -1;

    @ObfuscatedName("mr.at")
    public int field4021 = 3;

    @ObfuscatedName("mr.aj")
    public int field4017 = 50;

    @ObfuscatedName("mr.aw")
    public boolean field4044 = false;

    @ObfuscatedName("mr.ap")
    public HashSet field4024 = null;

    @ObfuscatedName("mr.ax")
    public int field3992 = -1;

    @ObfuscatedName("mr.as")
    public int field3994 = -1;

    @ObfuscatedName("mr.ad")
    public int field4027 = -1;

    @ObfuscatedName("mr.af")
    public int field4013 = -1;

    @ObfuscatedName("mr.ao")
    public int field4029 = -1;

    @ObfuscatedName("mr.ai")
    public int field4030 = -1;

    @ObfuscatedName("mr.av")
    public long field4031;

    @ObfuscatedName("mr.az")
    public int field4032;

    @ObfuscatedName("mr.au")
    public int field4033;

    @ObfuscatedName("mr.ab")
    public boolean field4034 = true;

    @ObfuscatedName("mr.ar")
    public HashSet field4035 = new HashSet();

    @ObfuscatedName("mr.ak")
    public HashSet field4036 = new HashSet();

    @ObfuscatedName("mr.an")
    public HashSet field4010 = new HashSet();

    @ObfuscatedName("mr.ah")
    public HashSet field4006 = new HashSet();

    @ObfuscatedName("mr.ae")
    public boolean field4039 = false;

    @ObfuscatedName("mr.bh")
    public int field4022 = 0;

    @ObfuscatedName("mr.bn")
    public final int[] field4041 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("mr.bi")
    public List field4048;

    @ObfuscatedName("mr.bb")
    public Iterator field4043;

    @ObfuscatedName("mr.bk")
    public HashSet field4028 = new HashSet();

    @ObfuscatedName("mr.bt")
    public class221 field4045 = null;

    @ObfuscatedName("mr.ba")
    public boolean field4046 = false;

    @ObfuscatedName("mr.be")
    public class395 field4047;

    @ObfuscatedName("mr.bo")
    public int field4049;

    @ObfuscatedName("mr.bp")
    public int field4014 = -1;

    @ObfuscatedName("mr.bj")
    public int field4023 = -1;

    @ObfuscatedName("mr.bw")
    public int field4040 = -1;

    @ObfuscatedName("mr.f(Lir;Lir;Lir;Lkq;Ljava/util/HashMap;[Low;I)V")
    public void method5399(class253 arg0, class253 arg1, class253 arg2, class299 arg3, HashMap arg4, class394[] arg5) {
        this.field4004 = arg5;
        this.field3996 = arg0;
        this.field3997 = arg1;
        this.field3998 = arg2;
        this.field4002 = arg3;
        this.field4003 = new HashMap();
        this.field4003.put(class141.field1567, arg4.get(field3999));
        this.field4003.put(class141.field1564, arg4.get(field4020));
        this.field4003.put(class141.field1566, arg4.get(field4012));
        this.field4016 = new class355(arg0);
        int var7 = this.field3996.method3950(class163.field1769.field1767);
        int[] var8 = this.field3996.method3943(var7);
        this.field4005 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class382 var10 = new class382(this.field3996.method3933(var7, var8[var9]));
            class144 var11 = new class144();
            var11.method2487(var10, var8[var9]);
            this.field4005.put(var11.method2423(), var11);
            if (var11.method2422()) {
                this.field4051 = var11;
            }
        }
        this.method5553(this.field4051);
        this.field4008 = null;
    }

    @ObfuscatedName("mr.o(I)V")
    public void method5471() {
        class145.field1619.method3358(5);
    }

    @ObfuscatedName("mr.u(IIZIIIII)V")
    public void method5401(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4016.method5385()) {
            return;
        }
        this.method5404();
        this.method5551();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4015));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4015));
        List var10 = this.field4009.method2622(this.field4042 - var8 / 2 - 1, this.field4038 - var9 / 2 - 1, var8 / 2 + this.field4042 + 1, var9 / 2 + this.field4038 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class162 var13 = (class162) var12.next();
            var11.add(var13);
            class96 var14 = new class96();
            class167 var15 = new class167(var13.method2372(), var13.field1758, var13.field1759);
            var14.method1833(new Object[] { var15, arg0, arg1 });
            if (this.field4028.contains(var13)) {
                var14.method1834(17);
            } else {
                var14.method1834(15);
            }
            class79.method179(var14);
        }
        Iterator var16 = this.field4028.iterator();
        while (var16.hasNext()) {
            class162 var17 = (class162) var16.next();
            if (!var11.contains(var17)) {
                class96 var18 = new class96();
                class167 var19 = new class167(var17.method2372(), var17.field1758, var17.field1759);
                var18.method1833(new Object[] { var19, arg0, arg1 });
                var18.method1834(16);
                class79.method179(var18);
            }
        }
        this.field4028 = var11;
    }

    @ObfuscatedName("mr.p(IIZZB)V")
    public void method5520(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class379.method1540();
        this.method5403(arg0, arg1, arg3, var5);
        if (!this.method5407() && arg3 || arg2) {
            if (arg3) {
                this.field4029 = arg0;
                this.field4030 = arg1;
                this.field4027 = this.field4042;
                this.field4013 = this.field4038;
            }
            if (this.field4027 != -1) {
                int var7 = arg0 - this.field4029;
                int var8 = arg1 - this.field4030;
                this.method5497(this.field4027 - (int) ((float) var7 / this.field4018), this.field4013 + (int) ((float) var8 / this.field4018), false);
            }
        } else {
            this.method5502();
        }
        if (arg3) {
            this.field4031 = var5;
            this.field4032 = arg0;
            this.field4033 = arg1;
        }
    }

    @ObfuscatedName("mr.b(IIZJ)V")
    public void method5403(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4007 == null) {
            this.field4045 = null;
            return;
        }
        int var6 = (int) ((float) this.field4042 + ((float) (arg0 - this.field4019) - (float) this.method5435() * this.field4015 / 2.0F) / this.field4015);
        int var7 = (int) ((float) this.field4038 - ((float) (arg1 - this.field4050) - (float) this.method5436() * this.field4015 / 2.0F) / this.field4015);
        this.field4045 = this.field4007.method2419(var6 + this.field4007.method2464() * 64, var7 + this.field4007.method2429() * 64);
        if (this.field4045 == null || !arg2) {
            return;
        }
        boolean var8 = client.field797 >= 2;
        if (var8 && class39.field247[82] && class39.field247[81]) {
            client.method79(this.field4045.field2586, this.field4045.field2588, this.field4045.field2591, false);
            return;
        }
        boolean var9 = true;
        if (this.field4034) {
            int var10 = arg0 - this.field4032;
            int var11 = arg1 - this.field4033;
            if (arg3 - this.field4031 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class205 var12 = class205.method4631(class203.field2285, client.field649.field1385);
            var12.field2342.method5901(this.field4045.method3676());
            client.field649.method2099(var12);
            this.field4031 = 0L;
        }
    }

    @ObfuscatedName("mr.e(I)V")
    public void method5404() {
        if (Statics.field1332 != null) {
            this.field4015 = this.field4018;
            return;
        }
        if (this.field4015 < this.field4018) {
            this.field4015 = Math.min(this.field4018, this.field4015 / 30.0F + this.field4015);
        }
        if (this.field4015 > this.field4018) {
            this.field4015 = Math.max(this.field4018, this.field4015 - this.field4015 / 30.0F);
        }
    }

    @ObfuscatedName("mr.k(I)V")
    public void method5551() {
        if (!this.method5407()) {
            return;
        }
        int var1 = this.field4001 - this.field4042;
        int var2 = this.field4026 - this.field4038;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5497(this.field4042 + var1, this.field4038 + var2, true);
        if (this.field4042 == this.field4001 && this.field4038 == this.field4026) {
            this.field4001 = -1;
            this.field4026 = -1;
        }
    }

    @ObfuscatedName("mr.g(IIZI)V")
    public final void method5497(int arg0, int arg1, boolean arg2) {
        this.field4042 = arg0;
        this.field4038 = arg1;
        class379.method1540();
        if (arg2) {
            this.method5502();
        }
    }

    @ObfuscatedName("mr.h(I)V")
    public final void method5502() {
        this.field4030 = -1;
        this.field4029 = -1;
        this.field4013 = -1;
        this.field4027 = -1;
    }

    @ObfuscatedName("mr.n(I)Z")
    public boolean method5407() {
        return this.field4001 != -1 && this.field4026 != -1;
    }

    @ObfuscatedName("mr.l(IIII)Leq;")
    public class144 method5408(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4005.values().iterator();
        class144 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class144) var4.next();
        } while (!var5.method2416(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("mr.m(IIIZB)V")
    public void method5439(int arg0, int arg1, int arg2, boolean arg3) {
        class144 var5 = this.method5408(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4051;
        }
        boolean var6 = false;
        if (this.field4008 != var5 || arg3) {
            this.field4008 = var5;
            this.method5553(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5477(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mr.d(II)V")
    public void method5561(int arg0) {
        class144 var2 = this.method5427(arg0);
        if (var2 != null) {
            this.method5553(var2);
        }
    }

    @ObfuscatedName("mr.c(I)I")
    public int method5411() {
        return this.field4007 == null ? -1 : this.field4007.method2441();
    }

    @ObfuscatedName("mr.j(B)Leq;")
    public class144 method5412() {
        return this.field4007;
    }

    @ObfuscatedName("mr.r(Leq;S)V")
    public void method5553(class144 arg0) {
        if (this.field4007 == null || this.field4007 != arg0) {
            this.method5577(arg0);
            this.method5477(-1, -1, -1);
        }
    }

    @ObfuscatedName("mr.q(Leq;B)V")
    public void method5577(class144 arg0) {
        this.field4007 = arg0;
        this.field4009 = new class146(this.field4004, this.field4003, this.field3997, this.field3998);
        this.field4016.method5383(this.field4007.method2423());
    }

    @ObfuscatedName("mr.t(Leq;Lhk;Lhk;ZI)V")
    public void method5587(class144 arg0, class221 arg1, class221 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4007 == null || this.field4007 != arg0) {
            this.method5577(arg0);
        }
        if (!arg3 && this.field4007.method2416(arg1.field2591, arg1.field2586, arg1.field2588)) {
            this.method5477(arg1.field2591, arg1.field2586, arg1.field2588);
        } else {
            this.method5477(arg2.field2591, arg2.field2586, arg2.field2588);
        }
    }

    @ObfuscatedName("mr.v(IIII)V")
    public void method5477(int arg0, int arg1, int arg2) {
        if (this.field4007 == null) {
            return;
        }
        int[] var4 = this.field4007.method2418(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4007.method2418(this.field4007.method2432(), this.field4007.method2431(), this.field4007.method2439());
        }
        this.method5497(var4[0] - this.field4007.method2464() * 64, var4[1] - this.field4007.method2429() * 64, true);
        this.field4001 = -1;
        this.field4026 = -1;
        this.field4015 = this.method5562(this.field4007.method2458());
        this.field4018 = this.field4015;
        this.field4048 = null;
        this.field4043 = null;
        this.field4009.method2618();
    }

    @ObfuscatedName("mr.x(IIIIII)V")
    public void method5433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class391.method6136(var6);
        class391.method6119(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class391.method6191(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4016.method5386();
        if (var7 < 100) {
            this.method5417(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4009.method2651()) {
            this.field4009.method2617(this.field3996, this.field4007.method2423(), client.field599);
            if (!this.field4009.method2651()) {
                return;
            }
        }
        if (this.field4024 != null) {
            this.field3994++;
            if (this.field3994 % this.field4017 == 0) {
                this.field3994 = 0;
                this.field3992++;
            }
            if (this.field3992 >= this.field4021 && !this.field4044) {
                this.field4024 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4015));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4015));
        this.field4009.method2636(this.field4042 - var8 / 2, this.field4038 - var9 / 2, var8 / 2 + this.field4042, var9 / 2 + this.field4038, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4039) {
            boolean var10 = false;
            if (arg4 - this.field4022 > 100) {
                this.field4022 = arg4;
                var10 = true;
            }
            this.field4009.method2648(this.field4042 - var8 / 2, this.field4038 - var9 / 2, var8 / 2 + this.field4042, var9 / 2 + this.field4038, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4006, this.field4024, this.field3994, this.field4017, var10);
        }
        this.method5419(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field797 >= 2;
        if (var11 && this.field4046 && this.field4045 != null) {
            this.field4002.method4785("Coord: " + this.field4045, class391.field4221 + 10, class391.field4222 + 20, 16776960, -1);
        }
        this.field4011 = var8;
        this.field4000 = var9;
        this.field4019 = arg0;
        this.field4050 = arg1;
        class391.method6122(var6);
    }

    @ObfuscatedName("mr.z(IIIIIII)Z")
    public boolean method5418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4047 == null) {
            return true;
        } else if (this.field4047.field4245 != arg0 || this.field4047.field4244 != arg1) {
            return true;
        } else if (this.field4009.field1638 != this.field4049) {
            return true;
        } else if (client.field624 != this.field4040) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("mr.i(IIIIIII)V")
    public void method5419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1332 == null) {
            return;
        }
        int var7 = 512 / (this.field4009.field1638 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5432() - arg4 / 2 - var7;
        int var14 = this.method5398() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4009.field1638 * (var7 + var13 - this.field4014);
        int var16 = arg1 - this.field4009.field1638 * (var7 - (var14 - this.field4023));
        if (this.method5418(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4047 != null && this.field4047.field4245 == var11 && this.field4047.field4244 == var12) {
                Arrays.fill(this.field4047.field4247, 0);
            } else {
                this.field4047 = new class395(var11, var12);
            }
            this.field4014 = this.method5432() - arg4 / 2 - var7;
            this.field4023 = this.method5398() - arg5 / 2 - var7;
            this.field4049 = this.field4009.field1638;
            Statics.field1332.method4105(this.field4014, this.field4023, this.field4047, (float) this.field4049 / var10);
            this.field4040 = client.field624;
            var15 = arg0 - this.field4009.field1638 * (var7 + var13 - this.field4014);
            var16 = arg1 - this.field4009.field1638 * (var7 - (var14 - this.field4023));
        }
        class391.method6126(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4047.method6249(var15, var16, 192);
        } else {
            this.field4047.method6268(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("mr.a(IIIII)V")
    public void method5420(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4016.method5385()) {
            return;
        }
        if (!this.field4009.method2651()) {
            this.field4009.method2617(this.field3996, this.field4007.method2423(), client.field599);
            if (!this.field4009.method2651()) {
                return;
            }
        }
        this.field4009.method2621(arg0, arg1, arg2, arg3, this.field4024, this.field3994, this.field4017);
    }

    @ObfuscatedName("mr.w(II)V")
    public void method5421(int arg0) {
        this.field4018 = this.method5562(arg0);
    }

    @ObfuscatedName("mr.s(IIIIIB)V")
    public void method5417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class391.method6191(arg0, arg1, arg2, arg3, -16777216);
        class391.method6131(var7 - 152, var8, 304, 34, -65536);
        class391.method6191(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4002.method4788(class246.field3213, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("mr.y(II)F")
    public float method5562(int arg0) {
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

    @ObfuscatedName("mr.ac(B)I")
    public int method5424() {
        if ((double) this.field4018 == 1.0D) {
            return 25;
        } else if ((double) this.field4018 == 1.5D) {
            return 37;
        } else if ((double) this.field4018 == 2.0D) {
            return 50;
        } else if ((double) this.field4018 == 3.0D) {
            return 75;
        } else if ((double) this.field4018 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("mr.ay(S)V")
    public void method5486() {
        this.field4016.method5384();
    }

    @ObfuscatedName("mr.am(B)Z")
    public boolean method5426() {
        return this.field4016.method5385();
    }

    @ObfuscatedName("mr.ag(II)Leq;")
    public class144 method5427(int arg0) {
        Iterator var2 = this.field4005.values().iterator();
        class144 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class144) var2.next();
        } while (var3.method2441() != arg0);
        return var3;
    }

    @ObfuscatedName("mr.aq(IIB)V")
    public void method5428(int arg0, int arg1) {
        if (this.field4007 != null && this.field4007.method2417(arg0, arg1)) {
            this.field4001 = arg0 - this.field4007.method2464() * 64;
            this.field4026 = arg1 - this.field4007.method2429() * 64;
        }
    }

    @ObfuscatedName("mr.at(III)V")
    public void method5429(int arg0, int arg1) {
        if (this.field4007 != null) {
            this.method5497(arg0 - this.field4007.method2464() * 64, arg1 - this.field4007.method2429() * 64, true);
            this.field4001 = -1;
            this.field4026 = -1;
        }
    }

    @ObfuscatedName("mr.aj(IIII)V")
    public void method5576(int arg0, int arg1, int arg2) {
        if (this.field4007 != null) {
            int[] var4 = this.field4007.method2418(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5428(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mr.aw(IIIB)V")
    public void method5461(int arg0, int arg1, int arg2) {
        if (this.field4007 != null) {
            int[] var4 = this.field4007.method2418(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5429(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mr.ap(I)I")
    public int method5432() {
        return this.field4007 == null ? -1 : this.field4042 + this.field4007.method2464() * 64;
    }

    @ObfuscatedName("mr.ax(I)I")
    public int method5398() {
        return this.field4007 == null ? -1 : this.field4038 + this.field4007.method2429() * 64;
    }

    @ObfuscatedName("mr.as(I)Lhk;")
    public class221 method5434() {
        return this.field4007 == null ? null : this.field4007.method2419(this.method5432(), this.method5398());
    }

    @ObfuscatedName("mr.ad(I)I")
    public int method5435() {
        return this.field4011;
    }

    @ObfuscatedName("mr.af(I)I")
    public int method5436() {
        return this.field4000;
    }

    @ObfuscatedName("mr.ao(II)V")
    public void method5437(int arg0) {
        if (arg0 >= 1) {
            this.field4021 = arg0;
        }
    }

    @ObfuscatedName("mr.ai(I)V")
    public void method5438() {
        this.field4021 = 3;
    }

    @ObfuscatedName("mr.av(II)V")
    public void method5413(int arg0) {
        if (arg0 >= 1) {
            this.field4017 = arg0;
        }
    }

    @ObfuscatedName("mr.az(I)V")
    public void method5440() {
        this.field4017 = 50;
    }

    @ObfuscatedName("mr.au(ZI)V")
    public void method5441(boolean arg0) {
        this.field4044 = arg0;
    }

    @ObfuscatedName("mr.ab(II)V")
    public void method5468(int arg0) {
        this.field4024 = new HashSet();
        this.field4024.add(arg0);
        this.field3992 = 0;
        this.field3994 = 0;
    }

    @ObfuscatedName("mr.aa(II)V")
    public void method5547(int arg0) {
        this.field4024 = new HashSet();
        this.field3992 = 0;
        this.field3994 = 0;
        for (int var2 = 0; var2 < Statics.field4124; var2++) {
            if (class280.method4995(var2) != null && class280.method4995(var2).field3409 == arg0) {
                this.field4024.add(class280.method4995(var2).field3405);
            }
        }
    }

    @ObfuscatedName("mr.al(I)V")
    public void method5444() {
        this.field4024 = null;
    }

    @ObfuscatedName("mr.ar(ZI)V")
    public void method5445(boolean arg0) {
        this.field4039 = !arg0;
    }

    @ObfuscatedName("mr.ak(IZI)V")
    public void method5446(int arg0, boolean arg1) {
        if (arg1) {
            this.field4035.remove(arg0);
        } else {
            this.field4035.add(arg0);
        }
        this.method5451();
    }

    @ObfuscatedName("mr.an(IZB)V")
    public void method5414(int arg0, boolean arg1) {
        if (arg1) {
            this.field4036.remove(arg0);
        } else {
            this.field4036.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field4124; var3++) {
            if (class280.method4995(var3) != null && class280.method4995(var3).field3409 == arg0) {
                int var4 = class280.method4995(var3).field3405;
                if (arg1) {
                    this.field4010.remove(var4);
                } else {
                    this.field4010.add(var4);
                }
            }
        }
        this.method5451();
    }

    @ObfuscatedName("mr.ah(I)Z")
    public boolean method5448() {
        return !this.field4039;
    }

    @ObfuscatedName("mr.ae(II)Z")
    public boolean method5449(int arg0) {
        return !this.field4035.contains(arg0);
    }

    @ObfuscatedName("mr.bh(II)Z")
    public boolean method5572(int arg0) {
        return !this.field4036.contains(arg0);
    }

    @ObfuscatedName("mr.br(I)V")
    public void method5451() {
        this.field4006.clear();
        this.field4006.addAll(this.field4035);
        this.field4006.addAll(this.field4010);
    }

    @ObfuscatedName("mr.bn(IIIIIII)V")
    public void method5442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4016.method5385()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4015));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4015));
        List var9 = this.field4009.method2622(this.field4042 - var7 / 2 - 1, this.field4038 - var8 / 2 - 1, var7 / 2 + this.field4042 + 1, var8 / 2 + this.field4038 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class162 var11 = (class162) var10.next();
            class280 var12 = class280.method4995(var11.method2372());
            var13 = false;
            for (int var14 = this.field4041.length - 1; var14 >= 0; var14--) {
                if (var12.field3406[var14] != null) {
                    client.method3660(var12.field3406[var14], var12.field3415, this.field4041[var14], var11.method2372(), var11.field1758.method3676(), var11.field1759.method3676());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("mr.bi(ILhk;B)Lhk;")
    public class221 method5453(int arg0, class221 arg1) {
        if (!this.field4016.method5385()) {
            return null;
        } else if (!this.field4009.method2651()) {
            return null;
        } else if (this.field4007.method2417(arg1.field2586, arg1.field2588)) {
            HashMap var3 = this.field4009.method2625();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class162 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class162 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field1759;
                    }
                    var8 = (class162) var7.next();
                    int var9 = var8.field1759.field2586 - arg1.field2586;
                    int var10 = var8.field1759.field2588 - arg1.field2588;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field1759;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("mr.bb(IILhk;Lhk;I)V")
    public void method5454(int arg0, int arg1, class221 arg2, class221 arg3) {
        class96 var5 = new class96();
        class167 var6 = new class167(arg1, arg2, arg3);
        var5.method1833(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1834(10);
                break;
            case 1009:
                var5.method1834(11);
                break;
            case 1010:
                var5.method1834(12);
                break;
            case 1011:
                var5.method1834(13);
                break;
            case 1012:
                var5.method1834(14);
        }
        class79.method179(var5);
    }

    @ObfuscatedName("mr.bk(I)Lfg;")
    public class162 method5455() {
        if (!this.field4016.method5385()) {
            return null;
        } else if (this.field4009.method2651()) {
            HashMap var1 = this.field4009.method2625();
            this.field4048 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4048.addAll(var3);
            }
            this.field4043 = this.field4048.iterator();
            return this.method5456();
        } else {
            return null;
        }
    }

    @ObfuscatedName("mr.bt(B)Lfg;")
    public class162 method5456() {
        if (this.field4043 == null) {
            return null;
        }
        class162 var1;
        do {
            if (!this.field4043.hasNext()) {
                return null;
            }
            var1 = (class162) this.field4043.next();
        } while (var1.method2372() == -1);
        return var1;
    }
}
