package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mf")
public class class344 {

    @ObfuscatedName("mf.z")
    public class245 field4014;

    @ObfuscatedName("mf.e")
    public class245 field3991;

    @ObfuscatedName("mf.q")
    public class245 field3992;

    @ObfuscatedName("mf.l")
    public static final class303 field4003 = class303.field3701;

    @ObfuscatedName("mf.s")
    public static final class303 field4038 = class303.field3696;

    @ObfuscatedName("mf.b")
    public static final class303 field3994 = class303.field3693;

    @ObfuscatedName("mf.a")
    public class306 field4034;

    @ObfuscatedName("mf.w")
    public HashMap field4022;

    @ObfuscatedName("mf.k")
    public class335[] field3998;

    @ObfuscatedName("mf.i")
    public HashMap field3999;

    @ObfuscatedName("mf.x")
    public class36 field4000;

    @ObfuscatedName("mf.f")
    public class36 field4032;

    @ObfuscatedName("mf.g")
    public class36 field4002;

    @ObfuscatedName("mf.u")
    public class46 field3989;

    @ObfuscatedName("mf.t")
    public class343 field4004;

    @ObfuscatedName("mf.p")
    public int field4005;

    @ObfuscatedName("mf.m")
    public int field4006;

    @ObfuscatedName("mf.r")
    public int field4007 = -1;

    @ObfuscatedName("mf.o")
    public int field4008 = -1;

    @ObfuscatedName("mf.j")
    public float field4009;

    @ObfuscatedName("mf.ay")
    public float field4035;

    @ObfuscatedName("mf.am")
    public int field3988 = -1;

    @ObfuscatedName("mf.ag")
    public int field4012 = -1;

    @ObfuscatedName("mf.ae")
    public int field4013 = -1;

    @ObfuscatedName("mf.ac")
    public int field4001 = -1;

    @ObfuscatedName("mf.aq")
    public int field4010 = 3;

    @ObfuscatedName("mf.at")
    public int field3996 = 50;

    @ObfuscatedName("mf.ak")
    public boolean field3990 = false;

    @ObfuscatedName("mf.ax")
    public HashSet field4017 = null;

    @ObfuscatedName("mf.ar")
    public int field4026 = -1;

    @ObfuscatedName("mf.al")
    public int field4020 = -1;

    @ObfuscatedName("mf.aa")
    public int field3984 = -1;

    @ObfuscatedName("mf.as")
    public int field4025 = -1;

    @ObfuscatedName("mf.aw")
    public int field4023 = -1;

    @ObfuscatedName("mf.az")
    public int field4024 = -1;

    @ObfuscatedName("mf.ah")
    public long field4041;

    @ObfuscatedName("mf.ap")
    public int field4015;

    @ObfuscatedName("mf.aj")
    public int field4027;

    @ObfuscatedName("mf.an")
    public boolean field4028 = true;

    @ObfuscatedName("mf.au")
    public HashSet field4029 = new HashSet();

    @ObfuscatedName("mf.ad")
    public HashSet field4030 = new HashSet();

    @ObfuscatedName("mf.af")
    public HashSet field4031 = new HashSet();

    @ObfuscatedName("mf.av")
    public HashSet field4033 = new HashSet();

    @ObfuscatedName("mf.ao")
    public boolean field4016 = false;

    @ObfuscatedName("mf.bj")
    public int field3995 = 0;

    @ObfuscatedName("mf.bi")
    public final int[] field4019 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("mf.bp")
    public List field4036;

    @ObfuscatedName("mf.br")
    public Iterator field4037;

    @ObfuscatedName("mf.bq")
    public HashSet field3993 = new HashSet();

    @ObfuscatedName("mf.bx")
    public class223 field4039 = null;

    @ObfuscatedName("mf.bc")
    public boolean field4040 = false;

    @ObfuscatedName("mf.bw")
    public class336 field4011;

    @ObfuscatedName("mf.bv")
    public int field4042;

    @ObfuscatedName("mf.bt")
    public int field4043 = -1;

    @ObfuscatedName("mf.bl")
    public int field4044 = -1;

    @ObfuscatedName("mf.bh")
    public int field4045 = -1;

    @ObfuscatedName("mf.n(Lig;Lig;Lig;Lkl;Ljava/util/HashMap;[Lly;B)V")
    public void method6042(class245 arg0, class245 arg1, class245 arg2, class306 arg3, HashMap arg4, class335[] arg5) {
        this.field3998 = arg5;
        this.field4014 = arg0;
        this.field3991 = arg1;
        this.field3992 = arg2;
        this.field4034 = arg3;
        this.field4022 = new HashMap();
        this.field4022.put(class27.field153, arg4.get(field4003));
        this.field4022.put(class27.field151, arg4.get(field4038));
        this.field4022.put(class27.field152, arg4.get(field3994));
        this.field4004 = new class343(arg0);
        int var7 = this.field4014.method4001(class45.field334.field335);
        int[] var8 = this.field4014.method3994(var7);
        this.field3999 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class311 var10 = new class311(this.field4014.method4032(var7, var8[var9]));
            class36 var11 = new class36();
            var11.method346(var10, var8[var9]);
            this.field3999.put(var11.method355(), var11);
            if (var11.method354()) {
                this.field4000 = var11;
            }
        }
        this.method6033(this.field4000);
        this.field4002 = null;
    }

    @ObfuscatedName("mf.v(I)V")
    public void method6083() {
        class39.method591();
    }

    @ObfuscatedName("mf.d(IIZIIIII)V")
    public void method6020(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4004.method6001()) {
            return;
        }
        this.method6023();
        this.method6019();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4009));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4009));
        List var10 = this.field3989.method627(this.field4005 - var8 / 2 - 1, this.field4006 - var9 / 2 - 1, var8 / 2 + this.field4005 + 1, var9 / 2 + this.field4006 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class44 var13 = (class44) var12.next();
            var11.add(var13);
            class72 var14 = new class72();
            class51 var15 = new class51(var13.method250(), var13.field320, var13.field319);
            var14.method1126(new Object[] { var15, arg0, arg1 });
            if (this.field3993.contains(var13)) {
                var14.method1127(17);
            } else {
                var14.method1127(15);
            }
            class86.method2227(var14);
        }
        Iterator var16 = this.field3993.iterator();
        while (var16.hasNext()) {
            class44 var17 = (class44) var16.next();
            if (!var11.contains(var17)) {
                class72 var18 = new class72();
                class51 var19 = new class51(var17.method250(), var17.field320, var17.field319);
                var18.method1126(new Object[] { var19, arg0, arg1 });
                var18.method1127(16);
                class86.method2227(var18);
            }
        }
        this.field3993 = var11;
    }

    @ObfuscatedName("mf.c(IIZZI)V")
    public void method6024(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class308.method1082();
        this.method6038(arg0, arg1, arg3, var5);
        if (!this.method6027() && arg3 || arg2) {
            if (arg3) {
                this.field4023 = arg0;
                this.field4024 = arg1;
                this.field3984 = this.field4005;
                this.field4025 = this.field4006;
            }
            if (this.field3984 != -1) {
                int var7 = arg0 - this.field4023;
                int var8 = arg1 - this.field4024;
                this.method6025(this.field3984 - (int) ((float) var7 / this.field4035), this.field4025 + (int) ((float) var8 / this.field4035), false);
            }
        } else {
            this.method6026();
        }
        if (arg3) {
            this.field4041 = var5;
            this.field4015 = arg0;
            this.field4027 = arg1;
        }
    }

    @ObfuscatedName("mf.y(IIZJ)V")
    public void method6038(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4032 == null) {
            this.field4039 = null;
            return;
        }
        int var6 = (int) ((float) this.field4005 + ((float) (arg0 - this.field4013) - (float) this.method6055() * this.field4009 / 2.0F) / this.field4009);
        int var7 = (int) ((float) this.field4006 - ((float) (arg1 - this.field4001) - (float) this.method6093() * this.field4009 / 2.0F) / this.field4009);
        this.field4039 = this.field4032.method369(var6 + this.field4032.method359() * 64, var7 + this.field4032.method409() * 64);
        if (this.field4039 == null || !arg2) {
            return;
        }
        if (client.method4955() && class55.field416[82] && class55.field416[81]) {
            int var8 = this.field4039.field2560;
            int var9 = this.field4039.field2558;
            int var10 = this.field4039.field2559;
            class197 var11 = class197.method434(class193.field2231, client.field751.field1333);
            var11.field2372.method5411(var9);
            var11.field2372.method5439(var10);
            var11.field2372.method5292(0);
            var11.field2372.method5246(var8);
            client.field751.method2239(var11);
            return;
        }
        boolean var12 = true;
        if (this.field4028) {
            int var13 = arg0 - this.field4015;
            int var14 = arg1 - this.field4027;
            if (arg3 - this.field4041 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class197 var15 = class197.method434(class193.field2305, client.field751.field1333);
            var15.field2372.method5292(this.field4039.method3822());
            client.field751.method2239(var15);
            this.field4041 = 0L;
        }
    }

    @ObfuscatedName("mf.h(B)V")
    public void method6023() {
        if (Statics.field1017 != null) {
            this.field4009 = this.field4035;
            return;
        }
        if (this.field4009 < this.field4035) {
            this.field4009 = Math.min(this.field4035, this.field4009 / 30.0F + this.field4009);
        }
        if (this.field4009 > this.field4035) {
            this.field4009 = Math.max(this.field4035, this.field4009 - this.field4009 / 30.0F);
        }
    }

    @ObfuscatedName("mf.z(I)V")
    public void method6019() {
        if (!this.method6027()) {
            return;
        }
        int var1 = this.field4007 - this.field4005;
        int var2 = this.field4008 - this.field4006;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6025(this.field4005 + var1, this.field4006 + var2, true);
        if (this.field4007 == this.field4005 && this.field4008 == this.field4006) {
            this.field4007 = -1;
            this.field4008 = -1;
        }
    }

    @ObfuscatedName("mf.e(IIZI)V")
    public final void method6025(int arg0, int arg1, boolean arg2) {
        this.field4005 = arg0;
        this.field4006 = arg1;
        class308.method1082();
        if (arg2) {
            this.method6026();
        }
    }

    @ObfuscatedName("mf.q(I)V")
    public final void method6026() {
        this.field4024 = -1;
        this.field4023 = -1;
        this.field4025 = -1;
        this.field3984 = -1;
    }

    @ObfuscatedName("mf.l(I)Z")
    public boolean method6027() {
        return this.field4007 != -1 && this.field4008 != -1;
    }

    @ObfuscatedName("mf.s(IIII)Lar;")
    public class36 method6028(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3999.values().iterator();
        class36 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class36) var4.next();
        } while (!var5.method348(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("mf.b(IIIZI)V")
    public void method6029(int arg0, int arg1, int arg2, boolean arg3) {
        class36 var5 = this.method6028(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4000;
        }
        boolean var6 = false;
        if (this.field4002 != var5 || arg3) {
            this.field4002 = var5;
            this.method6033(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6053(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mf.a(II)V")
    public void method6030(int arg0) {
        class36 var2 = this.method6047(arg0);
        if (var2 != null) {
            this.method6033(var2);
        }
    }

    @ObfuscatedName("mf.w(I)I")
    public int method6031() {
        return this.field4032 == null ? -1 : this.field4032.method353();
    }

    @ObfuscatedName("mf.k(B)Lar;")
    public class36 method6169() {
        return this.field4032;
    }

    @ObfuscatedName("mf.i(Lar;I)V")
    public void method6033(class36 arg0) {
        if (this.field4032 == null || this.field4032 != arg0) {
            this.method6034(arg0);
            this.method6053(-1, -1, -1);
        }
    }

    @ObfuscatedName("mf.x(Lar;I)V")
    public void method6034(class36 arg0) {
        this.field4032 = arg0;
        this.field3989 = new class46(this.field3998, this.field4022, this.field3991, this.field3992);
        this.field4004.method6002(this.field4032.method355());
    }

    @ObfuscatedName("mf.g(Lar;Lhd;Lhd;ZI)V")
    public void method6035(class36 arg0, class223 arg1, class223 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4032 == null || this.field4032 != arg0) {
            this.method6034(arg0);
        }
        if (!arg3 && this.field4032.method348(arg1.field2559, arg1.field2560, arg1.field2558)) {
            this.method6053(arg1.field2559, arg1.field2560, arg1.field2558);
        } else {
            this.method6053(arg2.field2559, arg2.field2560, arg2.field2558);
        }
    }

    @ObfuscatedName("mf.u(IIIS)V")
    public void method6053(int arg0, int arg1, int arg2) {
        if (this.field4032 == null) {
            return;
        }
        int[] var4 = this.field4032.method350(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4032.method350(this.field4032.method370(), this.field4032.method363(), this.field4032.method365());
        }
        this.method6025(var4[0] - this.field4032.method359() * 64, var4[1] - this.field4032.method409() * 64, true);
        this.field4007 = -1;
        this.field4008 = -1;
        this.field4009 = this.method6043(this.field4032.method358());
        this.field4035 = this.field4009;
        this.field4036 = null;
        this.field4037 = null;
        this.field3989.method623();
    }

    @ObfuscatedName("mf.t(IIIIII)V")
    public void method6032(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class332.method5762(var6);
        class332.method5729(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class332.method5763(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4004.method6005();
        if (var7 < 100) {
            this.method6193(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3989.method621()) {
            this.field3989.method622(this.field4014, this.field4032.method355(), client.field665);
            if (!this.field3989.method621()) {
                return;
            }
        }
        if (this.field4017 != null) {
            this.field4020++;
            if (this.field4020 % this.field3996 == 0) {
                this.field4020 = 0;
                this.field4026++;
            }
            if (this.field4026 >= this.field4010 && !this.field3990) {
                this.field4017 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4009));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4009));
        this.field3989.method653(this.field4005 - var8 / 2, this.field4006 - var9 / 2, var8 / 2 + this.field4005, var9 / 2 + this.field4006, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4016) {
            boolean var10 = false;
            if (arg4 - this.field3995 > 100) {
                this.field3995 = arg4;
                var10 = true;
            }
            this.field3989.method626(this.field4005 - var8 / 2, this.field4006 - var9 / 2, var8 / 2 + this.field4005, var9 / 2 + this.field4006, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4033, this.field4017, this.field4020, this.field3996, var10);
        }
        this.method6198(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method4955() && this.field4040 && this.field4039 != null) {
            this.field4034.method5093("Coord: " + this.field4039, class332.field3890 + 10, class332.field3888 + 20, 16776960, -1);
        }
        this.field3988 = var8;
        this.field4012 = var9;
        this.field4013 = arg0;
        this.field4001 = arg1;
        class332.method5732(var6);
    }

    @ObfuscatedName("mf.p(IIIIIIB)Z")
    public boolean method6132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4011 == null) {
            return true;
        } else if (this.field4011.field3913 != arg0 || this.field4011.field3912 != arg1) {
            return true;
        } else if (this.field3989.field357 != this.field4042) {
            return true;
        } else if (client.field675 != this.field4045) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("mf.o(IIIIIII)V")
    public void method6198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1017 == null) {
            return;
        }
        int var7 = 512 / (this.field3989.field357 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6052() - arg4 / 2 - var7;
        int var14 = this.method6079() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3989.field357 * (var7 + var13 - this.field4043);
        int var16 = arg1 - this.field3989.field357 * (var7 - (var14 - this.field4044));
        if (this.method6132(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4011 != null && this.field4011.field3913 == var11 && this.field4011.field3912 == var12) {
                Arrays.fill(this.field4011.field3915, 0);
            } else {
                this.field4011 = new class336(var11, var12);
            }
            this.field4043 = this.method6052() - arg4 / 2 - var7;
            this.field4044 = this.method6079() - arg5 / 2 - var7;
            this.field4042 = this.field3989.field357;
            Statics.field1017.method4121(this.field4043, this.field4044, this.field4011, (float) this.field4042 / var10);
            this.field4045 = client.field675;
            var15 = arg0 - this.field3989.field357 * (var7 + var13 - this.field4043);
            var16 = arg1 - this.field3989.field357 * (var7 - (var14 - this.field4044));
        }
        class332.method5797(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4011.method5928(var15, var16, 192);
        } else {
            this.field4011.method5849(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("mf.ay(IIIII)V")
    public void method6176(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4004.method6001()) {
            return;
        }
        if (!this.field3989.method621()) {
            this.field3989.method622(this.field4014, this.field4032.method355(), client.field665);
            if (!this.field3989.method621()) {
                return;
            }
        }
        this.field3989.method639(arg0, arg1, arg2, arg3, this.field4017, this.field4020, this.field3996);
    }

    @ObfuscatedName("mf.am(II)V")
    public void method6041(int arg0) {
        this.field4035 = this.method6043(arg0);
    }

    @ObfuscatedName("mf.ag(IIIIIB)V")
    public void method6193(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class332.method5763(arg0, arg1, arg2, arg3, -16777216);
        class332.method5741(var7 - 152, var8, 304, 34, -65536);
        class332.method5763(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4034.method5092(class234.field3088, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("mf.ae(II)F")
    public float method6043(int arg0) {
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

    @ObfuscatedName("mf.ac(I)I")
    public int method6044() {
        if ((double) this.field4035 == 1.0D) {
            return 25;
        } else if ((double) this.field4035 == 1.5D) {
            return 37;
        } else if ((double) this.field4035 == 2.0D) {
            return 50;
        } else if ((double) this.field4035 == 3.0D) {
            return 75;
        } else if ((double) this.field4035 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("mf.aq(S)V")
    public void method6045() {
        this.field4004.method6003();
    }

    @ObfuscatedName("mf.at(I)Z")
    public boolean method6046() {
        return this.field4004.method6001();
    }

    @ObfuscatedName("mf.ak(II)Lar;")
    public class36 method6047(int arg0) {
        Iterator var2 = this.field3999.values().iterator();
        class36 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class36) var2.next();
        } while (var3.method353() != arg0);
        return var3;
    }

    @ObfuscatedName("mf.ax(III)V")
    public void method6048(int arg0, int arg1) {
        if (this.field4032 != null && this.field4032.method345(arg0, arg1)) {
            this.field4007 = arg0 - this.field4032.method359() * 64;
            this.field4008 = arg1 - this.field4032.method409() * 64;
        }
    }

    @ObfuscatedName("mf.ar(III)V")
    public void method6049(int arg0, int arg1) {
        if (this.field4032 != null) {
            this.method6025(arg0 - this.field4032.method359() * 64, arg1 - this.field4032.method409() * 64, true);
            this.field4007 = -1;
            this.field4008 = -1;
        }
    }

    @ObfuscatedName("mf.al(IIII)V")
    public void method6050(int arg0, int arg1, int arg2) {
        if (this.field4032 != null) {
            int[] var4 = this.field4032.method350(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6048(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mf.aa(IIII)V")
    public void method6051(int arg0, int arg1, int arg2) {
        if (this.field4032 != null) {
            int[] var4 = this.field4032.method350(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6049(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mf.as(I)I")
    public int method6052() {
        return this.field4032 == null ? -1 : this.field4005 + this.field4032.method359() * 64;
    }

    @ObfuscatedName("mf.aw(I)I")
    public int method6079() {
        return this.field4032 == null ? -1 : this.field4006 + this.field4032.method409() * 64;
    }

    @ObfuscatedName("mf.az(I)Lhd;")
    public class223 method6022() {
        return this.field4032 == null ? null : this.field4032.method369(this.method6052(), this.method6079());
    }

    @ObfuscatedName("mf.ah(I)I")
    public int method6055() {
        return this.field3988;
    }

    @ObfuscatedName("mf.ap(B)I")
    public int method6093() {
        return this.field4012;
    }

    @ObfuscatedName("mf.aj(II)V")
    public void method6154(int arg0) {
        if (arg0 >= 1) {
            this.field4010 = arg0;
        }
    }

    @ObfuscatedName("mf.an(B)V")
    public void method6058() {
        this.field4010 = 3;
    }

    @ObfuscatedName("mf.ai(II)V")
    public void method6059(int arg0) {
        if (arg0 >= 1) {
            this.field3996 = arg0;
        }
    }

    @ObfuscatedName("mf.ab(I)V")
    public void method6060() {
        this.field3996 = 50;
    }

    @ObfuscatedName("mf.au(ZI)V")
    public void method6168(boolean arg0) {
        this.field3990 = arg0;
    }

    @ObfuscatedName("mf.ad(IB)V")
    public void method6062(int arg0) {
        this.field4017 = new HashSet();
        this.field4017.add(arg0);
        this.field4026 = 0;
        this.field4020 = 0;
    }

    @ObfuscatedName("mf.af(II)V")
    public void method6063(int arg0) {
        this.field4017 = new HashSet();
        this.field4026 = 0;
        this.field4020 = 0;
        for (int var2 = 0; var2 < Statics.field3247; var2++) {
            if (class253.method4155(var2) != null && class253.method4155(var2).field3268 == arg0) {
                this.field4017.add(class253.method4155(var2).field3249);
            }
        }
    }

    @ObfuscatedName("mf.av(B)V")
    public void method6084() {
        this.field4017 = null;
    }

    @ObfuscatedName("mf.ao(ZI)V")
    public void method6203(boolean arg0) {
        this.field4016 = !arg0;
    }

    @ObfuscatedName("mf.bj(IZI)V")
    public void method6065(int arg0, boolean arg1) {
        if (arg1) {
            this.field4029.remove(arg0);
        } else {
            this.field4029.add(arg0);
        }
        this.method6070();
    }

    @ObfuscatedName("mf.bn(IZI)V")
    public void method6066(int arg0, boolean arg1) {
        if (arg1) {
            this.field4030.remove(arg0);
        } else {
            this.field4030.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3247; var3++) {
            if (class253.method4155(var3) != null && class253.method4155(var3).field3268 == arg0) {
                int var4 = class253.method4155(var3).field3249;
                if (arg1) {
                    this.field4031.remove(var4);
                } else {
                    this.field4031.add(var4);
                }
            }
        }
        this.method6070();
    }

    @ObfuscatedName("mf.bi(B)Z")
    public boolean method6067() {
        return !this.field4016;
    }

    @ObfuscatedName("mf.bp(II)Z")
    public boolean method6069(int arg0) {
        return !this.field4029.contains(arg0);
    }

    @ObfuscatedName("mf.br(II)Z")
    public boolean method6124(int arg0) {
        return !this.field4030.contains(arg0);
    }

    @ObfuscatedName("mf.bq(I)V")
    public void method6070() {
        this.field4033.clear();
        this.field4033.addAll(this.field4029);
        this.field4033.addAll(this.field4031);
    }

    @ObfuscatedName("mf.bx(IIIIIII)V")
    public void method6071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4004.method6001()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4009));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4009));
        List var9 = this.field3989.method627(this.field4005 - var7 / 2 - 1, this.field4006 - var8 / 2 - 1, var7 / 2 + this.field4005 + 1, var8 / 2 + this.field4006 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class44 var11 = (class44) var10.next();
            class253 var12 = class253.method4155(var11.method250());
            var13 = false;
            for (int var14 = this.field4019.length - 1; var14 >= 0; var14--) {
                if (var12.field3257[var14] != null) {
                    client.method657(var12.field3257[var14], var12.field3258, this.field4019[var14], var11.method250(), var11.field320.method3822(), var11.field319.method3822());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("mf.bc(ILhd;I)Lhd;")
    public class223 method6142(int arg0, class223 arg1) {
        if (!this.field4004.method6001()) {
            return null;
        } else if (!this.field3989.method621()) {
            return null;
        } else if (this.field4032.method345(arg1.field2560, arg1.field2558)) {
            HashMap var3 = this.field3989.method630();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class44 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class44 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field319;
                    }
                    var8 = (class44) var7.next();
                    int var9 = var8.field319.field2560 - arg1.field2560;
                    int var10 = var8.field319.field2558 - arg1.field2558;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field319;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("mf.bw(IILhd;Lhd;I)V")
    public void method6073(int arg0, int arg1, class223 arg2, class223 arg3) {
        class72 var5 = new class72();
        class51 var6 = new class51(arg1, arg2, arg3);
        var5.method1126(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1127(10);
                break;
            case 1009:
                var5.method1127(11);
                break;
            case 1010:
                var5.method1127(12);
                break;
            case 1011:
                var5.method1127(13);
                break;
            case 1012:
                var5.method1127(14);
        }
        class86.method2227(var5);
    }

    @ObfuscatedName("mf.bv(B)Laj;")
    public class44 method6074() {
        if (!this.field4004.method6001()) {
            return null;
        } else if (this.field3989.method621()) {
            HashMap var1 = this.field3989.method630();
            this.field4036 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4036.addAll(var3);
            }
            this.field4037 = this.field4036.iterator();
            return this.method6075();
        } else {
            return null;
        }
    }

    @ObfuscatedName("mf.bt(B)Laj;")
    public class44 method6075() {
        if (this.field4037 == null) {
            return null;
        }
        class44 var1;
        do {
            if (!this.field4037.hasNext()) {
                return null;
            }
            var1 = (class44) this.field4037.next();
        } while (var1.method250() == -1);
        return var1;
    }
}
