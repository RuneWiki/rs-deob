package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lv")
public class class330 {

    @ObfuscatedName("lv.d")
    public class250 field3936;

    @ObfuscatedName("lv.n")
    public static final class298 field3937 = class298.field3733;

    @ObfuscatedName("lv.s")
    public static final class298 field3938 = class298.field3736;

    @ObfuscatedName("lv.g")
    public static final class298 field3939 = class298.field3735;

    @ObfuscatedName("lv.a")
    public class301 field3940;

    @ObfuscatedName("lv.r")
    public HashMap field3933;

    @ObfuscatedName("lv.k")
    public class323[] field3942;

    @ObfuscatedName("lv.m")
    public HashMap field3943;

    @ObfuscatedName("lv.q")
    public class21 field3944;

    @ObfuscatedName("lv.x")
    public class21 field3945;

    @ObfuscatedName("lv.u")
    public class21 field3946;

    @ObfuscatedName("lv.o")
    public class31 field3947;

    @ObfuscatedName("lv.t")
    public class329 field3948;

    @ObfuscatedName("lv.v")
    public int field3949;

    @ObfuscatedName("lv.p")
    public int field3932;

    @ObfuscatedName("lv.z")
    public int field3959 = -1;

    @ObfuscatedName("lv.j")
    public int field3988 = -1;

    @ObfuscatedName("lv.i")
    public float field3957;

    @ObfuscatedName("lv.c")
    public float field3954;

    @ObfuscatedName("lv.y")
    public int field3955 = -1;

    @ObfuscatedName("lv.av")
    public int field3956 = -1;

    @ObfuscatedName("lv.as")
    public int field3986 = -1;

    @ObfuscatedName("lv.al")
    public int field3958 = -1;

    @ObfuscatedName("lv.ax")
    public int field3969 = 3;

    @ObfuscatedName("lv.ay")
    public int field3960 = 50;

    @ObfuscatedName("lv.aa")
    public boolean field3961 = false;

    @ObfuscatedName("lv.ag")
    public HashSet field3962 = null;

    @ObfuscatedName("lv.aj")
    public int field3963 = -1;

    @ObfuscatedName("lv.an")
    public int field3967 = -1;

    @ObfuscatedName("lv.ap")
    public int field3976 = -1;

    @ObfuscatedName("lv.am")
    public int field3966 = -1;

    @ObfuscatedName("lv.ae")
    public int field3989 = -1;

    @ObfuscatedName("lv.ac")
    public int field3968 = -1;

    @ObfuscatedName("lv.ah")
    public long field3965;

    @ObfuscatedName("lv.aq")
    public int field3983;

    @ObfuscatedName("lv.af")
    public int field3971;

    @ObfuscatedName("lv.ab")
    public boolean field3984 = true;

    @ObfuscatedName("lv.at")
    public HashSet field3973 = new HashSet();

    @ObfuscatedName("lv.ad")
    public HashSet field3985 = new HashSet();

    @ObfuscatedName("lv.ai")
    public HashSet field3975 = new HashSet();

    @ObfuscatedName("lv.ak")
    public HashSet field3953 = new HashSet();

    @ObfuscatedName("lv.au")
    public boolean field3977 = false;

    @ObfuscatedName("lv.az")
    public int field3978 = 0;

    @ObfuscatedName("lv.bv")
    public final int[] field3979 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lv.bh")
    public List field3980;

    @ObfuscatedName("lv.bq")
    public Iterator field3981;

    @ObfuscatedName("lv.bm")
    public HashSet field3982 = new HashSet();

    @ObfuscatedName("lv.bw")
    public class229 field3941 = null;

    @ObfuscatedName("lv.bi")
    public boolean field3950 = false;

    @ObfuscatedName("lv.bb")
    public class324 field3987;

    @ObfuscatedName("lv.bd")
    public int field3970;

    @ObfuscatedName("lv.bu")
    public int field3952 = -1;

    @ObfuscatedName("lv.bo")
    public int field3974 = -1;

    @ObfuscatedName("lv.bt")
    public int field3964 = -1;

    @ObfuscatedName("lv.f(Lie;Lka;Ljava/util/HashMap;[Llk;B)V")
    public void method5628(class250 arg0, class301 arg1, HashMap arg2, class323[] arg3) {
        this.field3942 = arg3;
        this.field3936 = arg0;
        this.field3940 = arg1;
        this.field3933 = new HashMap();
        this.field3933.put(class13.field80, arg2.get(field3937));
        this.field3933.put(class13.field81, arg2.get(field3938));
        this.field3933.put(class13.field87, arg2.get(field3939));
        this.field3948 = new class329(arg0);
        int var5 = this.field3936.method4285(class30.field254.field257);
        int[] var6 = this.field3936.method4278(var5);
        this.field3943 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3936.method4267(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method270(var8, var6[var7]);
            this.field3943.put(var9.method285(), var9);
            if (var9.method245()) {
                this.field3944 = var9;
            }
        }
        this.method5644(this.field3944);
        this.field3946 = null;
    }

    @ObfuscatedName("lv.h(I)I")
    public int method5629() {
        return this.field3936.method4289(this.field3944.method285(), class30.field255.field257) ? 100 : this.field3936.method4292(this.field3944.method285());
    }

    @ObfuscatedName("lv.e(I)V")
    public void method5740() {
        class24.field196.method3758(5);
        class24.field197.method3758(5);
    }

    @ObfuscatedName("lv.b(IIZIIIIB)V")
    public void method5690(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3948.method5616()) {
            return;
        }
        this.method5634();
        this.method5635();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3957));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3957));
        List var10 = this.field3947.method481(this.field3949 - var8 / 2 - 1, this.field3932 - var9 / 2 - 1, var8 / 2 + this.field3949 + 1, var9 / 2 + this.field3932 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class58 var14 = new class58();
            class37 var15 = new class37(var13.field241, var13.field242, var13.field250);
            var14.method960(new Object[] { var15, arg0, arg1 });
            if (this.field3982.contains(var13)) {
                var14.method961(17);
            } else {
                var14.method961(15);
            }
            class71.method1800(var14);
        }
        Iterator var16 = this.field3982.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class58 var18 = new class58();
                class37 var19 = new class37(var17.field241, var17.field242, var17.field250);
                var18.method960(new Object[] { var19, arg0, arg1 });
                var18.method961(16);
                class71.method1800(var18);
            }
        }
        this.field3982 = var11;
    }

    @ObfuscatedName("lv.l(IIZZB)V")
    public void method5632(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class187.method2864();
        this.method5633(arg0, arg1, arg3, var5);
        if (!this.method5638() && arg3 || arg2) {
            if (arg3) {
                this.field3989 = arg0;
                this.field3968 = arg1;
                this.field3976 = this.field3949;
                this.field3966 = this.field3932;
            }
            if (this.field3976 != -1) {
                int var7 = arg0 - this.field3989;
                int var8 = arg1 - this.field3968;
                this.method5636(this.field3976 - (int) ((float) var7 / this.field3954), this.field3966 + (int) ((float) var8 / this.field3954), false);
            }
        } else {
            this.method5743();
        }
        if (arg3) {
            this.field3965 = var5;
            this.field3983 = arg0;
            this.field3971 = arg1;
        }
    }

    @ObfuscatedName("lv.w(IIZJ)V")
    public void method5633(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3945 == null) {
            this.field3941 = null;
            return;
        }
        int var6 = (int) ((float) this.field3949 + ((float) (arg0 - this.field3986) - (float) this.method5659() * this.field3957 / 2.0F) / this.field3957);
        int var7 = (int) ((float) this.field3932 - ((float) (arg1 - this.field3958) - (float) this.method5667() * this.field3957 / 2.0F) / this.field3957);
        this.field3941 = this.field3945.method289(var6 + this.field3945.method236() * 64, var7 + this.field3945.method241() * 64);
        if (this.field3941 == null || !arg2) {
            return;
        }
        boolean var8 = client.field780 >= 2;
        if (var8 && class40.field328[82] && class40.field328[81]) {
            Statics.method439(this.field3941.field2620, this.field3941.field2621, this.field3941.field2623, false);
            return;
        }
        boolean var9 = true;
        if (this.field3984) {
            int var10 = arg0 - this.field3983;
            int var11 = arg1 - this.field3971;
            if (arg3 - this.field3965 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class175 var12 = class175.method3561(class172.field2223, client.field798.field1265);
            var12.field2323.method3369(this.field3941.method4129());
            client.field798.method1884(var12);
            this.field3965 = 0L;
        }
    }

    @ObfuscatedName("lv.d(I)V")
    public void method5634() {
        if (Statics.field3774 != null) {
            this.field3957 = this.field3954;
            return;
        }
        if (this.field3957 < this.field3954) {
            this.field3957 = Math.min(this.field3954, this.field3957 / 30.0F + this.field3957);
        }
        if (this.field3957 > this.field3954) {
            this.field3957 = Math.max(this.field3954, this.field3957 - this.field3957 / 30.0F);
        }
    }

    @ObfuscatedName("lv.n(I)V")
    public void method5635() {
        if (!this.method5638()) {
            return;
        }
        int var1 = this.field3959 - this.field3949;
        int var2 = this.field3988 - this.field3932;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5636(this.field3949 + var1, this.field3932 + var2, true);
        if (this.field3959 == this.field3949 && this.field3988 == this.field3932) {
            this.field3959 = -1;
            this.field3988 = -1;
        }
    }

    @ObfuscatedName("lv.s(IIZI)V")
    public final void method5636(int arg0, int arg1, boolean arg2) {
        this.field3949 = arg0;
        this.field3932 = arg1;
        class187.method2864();
        if (arg2) {
            this.method5743();
        }
    }

    @ObfuscatedName("lv.g(I)V")
    public final void method5743() {
        this.field3968 = -1;
        this.field3989 = -1;
        this.field3966 = -1;
        this.field3976 = -1;
    }

    @ObfuscatedName("lv.k(I)Z")
    public boolean method5638() {
        return this.field3959 != -1 && this.field3988 != -1;
    }

    @ObfuscatedName("lv.m(IIIB)Lp;")
    public class21 method5639(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3943.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method225(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lv.q(IIIZS)V")
    public void method5640(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5639(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3944;
        }
        boolean var6 = false;
        if (this.field3946 != var5 || arg3) {
            this.field3946 = var5;
            this.method5644(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5647(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lv.x(II)V")
    public void method5641(int arg0) {
        class21 var2 = this.method5658(arg0);
        if (var2 != null) {
            this.method5644(var2);
        }
    }

    @ObfuscatedName("lv.u(I)I")
    public int method5642() {
        return this.field3945 == null ? -1 : this.field3945.method230();
    }

    @ObfuscatedName("lv.o(I)Lp;")
    public class21 method5643() {
        return this.field3945;
    }

    @ObfuscatedName("lv.t(Lp;I)V")
    public void method5644(class21 arg0) {
        if (this.field3945 == null || this.field3945 != arg0) {
            this.method5645(arg0);
            this.method5647(-1, -1, -1);
        }
    }

    @ObfuscatedName("lv.v(Lp;B)V")
    public void method5645(class21 arg0) {
        this.field3945 = arg0;
        this.field3947 = new class31(this.field3942, this.field3933);
        this.field3948.method5623(this.field3945.method285());
    }

    @ObfuscatedName("lv.p(Lp;Lhc;Lhc;ZI)V")
    public void method5689(class21 arg0, class229 arg1, class229 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3945 == null || this.field3945 != arg0) {
            this.method5645(arg0);
        }
        if (!arg3 && this.field3945.method225(arg1.field2623, arg1.field2620, arg1.field2621)) {
            this.method5647(arg1.field2623, arg1.field2620, arg1.field2621);
        } else {
            this.method5647(arg2.field2623, arg2.field2620, arg2.field2621);
        }
    }

    @ObfuscatedName("lv.z(IIII)V")
    public void method5647(int arg0, int arg1, int arg2) {
        if (this.field3945 == null) {
            return;
        }
        int[] var4 = this.field3945.method232(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3945.method232(this.field3945.method243(), this.field3945.method246(), this.field3945.method242());
        }
        this.method5636(var4[0] - this.field3945.method236() * 64, var4[1] - this.field3945.method241() * 64, true);
        this.field3959 = -1;
        this.field3988 = -1;
        this.field3957 = this.method5654(this.field3945.method227());
        this.field3954 = this.field3957;
        this.field3980 = null;
        this.field3981 = null;
        this.field3947.method516();
    }

    @ObfuscatedName("lv.j(IIIIII)V")
    public void method5648(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class320.method5342(var6);
        class320.method5408(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class320.method5348(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3948.method5617();
        if (var7 < 100) {
            this.method5710(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3947.method515()) {
            this.field3947.method475(this.field3936, this.field3945.method285(), client.field751);
            if (!this.field3947.method515()) {
                return;
            }
        }
        if (this.field3962 != null) {
            this.field3967++;
            if (this.field3967 % this.field3960 == 0) {
                this.field3967 = 0;
                this.field3963++;
            }
            if (this.field3963 >= this.field3969 && !this.field3961) {
                this.field3962 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3957));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3957));
        this.field3947.method482(this.field3949 - var8 / 2, this.field3932 - var9 / 2, var8 / 2 + this.field3949, var9 / 2 + this.field3932, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3977) {
            boolean var10 = false;
            if (arg4 - this.field3978 > 100) {
                this.field3978 = arg4;
                var10 = true;
            }
            this.field3947.method483(this.field3949 - var8 / 2, this.field3932 - var9 / 2, var8 / 2 + this.field3949, var9 / 2 + this.field3932, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3953, this.field3962, this.field3967, this.field3960, var10);
        }
        this.method5650(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field780 >= 2;
        if (var11 && this.field3950 && this.field3941 != null) {
            this.field3940.method5134("Coord: " + this.field3941, class320.field3850 + 10, class320.field3845 + 20, 16776960, -1);
        }
        this.field3955 = var8;
        this.field3956 = var9;
        this.field3986 = arg0;
        this.field3958 = arg1;
        class320.method5343(var6);
    }

    @ObfuscatedName("lv.c(IIIIIII)Z")
    public boolean method5700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3987 == null) {
            return true;
        } else if (this.field3987.field3870 != arg0 || this.field3987.field3878 != arg1) {
            return true;
        } else if (this.field3947.field276 != this.field3970) {
            return true;
        } else if (client.field682 != this.field3964) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lv.av(IIIIIII)V")
    public void method5650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3774 == null) {
            return;
        }
        int var7 = 512 / (this.field3947.field276 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5663() - arg4 / 2 - var7;
        int var14 = this.method5649() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3947.field276 * (var7 + var13 - this.field3952);
        int var16 = arg1 - this.field3947.field276 * (var7 - (var14 - this.field3974));
        if (this.method5700(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3987 != null && this.field3987.field3870 == var11 && this.field3987.field3878 == var12) {
                Arrays.fill(this.field3987.field3873, 0);
            } else {
                this.field3987 = new class324(var11, var12);
            }
            this.field3952 = this.method5663() - arg4 / 2 - var7;
            this.field3974 = this.method5649() - arg5 / 2 - var7;
            this.field3970 = this.field3947.field276;
            Statics.field3774.method4415(this.field3952, this.field3974, this.field3987, (float) this.field3970 / var10);
            this.field3964 = client.field682;
            var15 = arg0 - this.field3947.field276 * (var7 + var13 - this.field3952);
            var16 = arg1 - this.field3947.field276 * (var7 - (var14 - this.field3974));
        }
        class320.method5339(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3987.method5555(var15, var16, 192);
        } else {
            this.field3987.method5497(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lv.as(IIIIB)V")
    public void method5671(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3948.method5616()) {
            return;
        }
        if (!this.field3947.method515()) {
            this.field3947.method475(this.field3936, this.field3945.method285(), client.field751);
            if (!this.field3947.method515()) {
                return;
            }
        }
        this.field3947.method480(arg0, arg1, arg2, arg3, this.field3962, this.field3967, this.field3960);
    }

    @ObfuscatedName("lv.al(II)V")
    public void method5652(int arg0) {
        this.field3954 = this.method5654(arg0);
    }

    @ObfuscatedName("lv.ax(IIIIII)V")
    public void method5710(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class320.method5348(arg0, arg1, arg2, arg3, -16777216);
        class320.method5352(var7 - 152, var8, 304, 34, -65536);
        class320.method5348(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3940.method5130(class240.field3136, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lv.ay(II)F")
    public float method5654(int arg0) {
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

    @ObfuscatedName("lv.aa(I)I")
    public int method5771() {
        if ((double) this.field3954 == 1.0D) {
            return 25;
        } else if ((double) this.field3954 == 1.5D) {
            return 37;
        } else if ((double) this.field3954 == 2.0D) {
            return 50;
        } else if ((double) this.field3954 == 3.0D) {
            return 75;
        } else if ((double) this.field3954 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lv.ag(I)V")
    public void method5656() {
        this.field3948.method5622();
    }

    @ObfuscatedName("lv.aj(I)Z")
    public boolean method5657() {
        return this.field3948.method5616();
    }

    @ObfuscatedName("lv.an(II)Lp;")
    public class21 method5658(int arg0) {
        Iterator var2 = this.field3943.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method230() != arg0);
        return var3;
    }

    @ObfuscatedName("lv.ap(III)V")
    public void method5695(int arg0, int arg1) {
        if (this.field3945 != null && this.field3945.method231(arg0, arg1)) {
            this.field3959 = arg0 - this.field3945.method236() * 64;
            this.field3988 = arg1 - this.field3945.method241() * 64;
        }
    }

    @ObfuscatedName("lv.am(III)V")
    public void method5660(int arg0, int arg1) {
        if (this.field3945 != null) {
            this.method5636(arg0 - this.field3945.method236() * 64, arg1 - this.field3945.method241() * 64, true);
            this.field3959 = -1;
            this.field3988 = -1;
        }
    }

    @ObfuscatedName("lv.ae(IIII)V")
    public void method5661(int arg0, int arg1, int arg2) {
        if (this.field3945 != null) {
            int[] var4 = this.field3945.method232(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5695(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lv.ac(IIIB)V")
    public void method5662(int arg0, int arg1, int arg2) {
        if (this.field3945 != null) {
            int[] var4 = this.field3945.method232(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5660(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lv.ah(I)I")
    public int method5663() {
        return this.field3945 == null ? -1 : this.field3949 + this.field3945.method236() * 64;
    }

    @ObfuscatedName("lv.aq(I)I")
    public int method5649() {
        return this.field3945 == null ? -1 : this.field3932 + this.field3945.method241() * 64;
    }

    @ObfuscatedName("lv.af(S)Lhc;")
    public class229 method5665() {
        return this.field3945 == null ? null : this.field3945.method289(this.method5663(), this.method5649());
    }

    @ObfuscatedName("lv.ab(I)I")
    public int method5659() {
        return this.field3955;
    }

    @ObfuscatedName("lv.ar(I)I")
    public int method5667() {
        return this.field3956;
    }

    @ObfuscatedName("lv.ao(II)V")
    public void method5668(int arg0) {
        if (arg0 >= 1) {
            this.field3969 = arg0;
        }
    }

    @ObfuscatedName("lv.at(I)V")
    public void method5679() {
        this.field3969 = 3;
    }

    @ObfuscatedName("lv.ad(II)V")
    public void method5670(int arg0) {
        if (arg0 >= 1) {
            this.field3960 = arg0;
        }
    }

    @ObfuscatedName("lv.ai(I)V")
    public void method5774() {
        this.field3960 = 50;
    }

    @ObfuscatedName("lv.ak(ZB)V")
    public void method5672(boolean arg0) {
        this.field3961 = arg0;
    }

    @ObfuscatedName("lv.au(IS)V")
    public void method5673(int arg0) {
        this.field3962 = new HashSet();
        this.field3962.add(arg0);
        this.field3963 = 0;
        this.field3967 = 0;
    }

    @ObfuscatedName("lv.az(II)V")
    public void method5786(int arg0) {
        this.field3962 = new HashSet();
        this.field3963 = 0;
        this.field3967 = 0;
        for (int var2 = 0; var2 < Statics.field3291; var2++) {
            if (class258.method3226(var2) != null && class258.method3226(var2).field3308 == arg0) {
                this.field3962.add(class258.method3226(var2).field3311);
            }
        }
    }

    @ObfuscatedName("lv.aw(I)V")
    public void method5805() {
        this.field3962 = null;
    }

    @ObfuscatedName("lv.bv(ZI)V")
    public void method5676(boolean arg0) {
        this.field3977 = !arg0;
    }

    @ObfuscatedName("lv.bh(IZI)V")
    public void method5677(int arg0, boolean arg1) {
        if (arg1) {
            this.field3973.remove(arg0);
        } else {
            this.field3973.add(arg0);
        }
        this.method5789();
    }

    @ObfuscatedName("lv.bq(IZB)V")
    public void method5678(int arg0, boolean arg1) {
        if (arg1) {
            this.field3985.remove(arg0);
        } else {
            this.field3985.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3291; var3++) {
            if (class258.method3226(var3) != null && class258.method3226(var3).field3308 == arg0) {
                int var4 = class258.method3226(var3).field3311;
                if (arg1) {
                    this.field3975.remove(var4);
                } else {
                    this.field3975.add(var4);
                }
            }
        }
        this.method5789();
    }

    @ObfuscatedName("lv.bm(B)Z")
    public boolean method5775() {
        return !this.field3977;
    }

    @ObfuscatedName("lv.bw(II)Z")
    public boolean method5680(int arg0) {
        return !this.field3973.contains(arg0);
    }

    @ObfuscatedName("lv.bi(II)Z")
    public boolean method5681(int arg0) {
        return !this.field3985.contains(arg0);
    }

    @ObfuscatedName("lv.bb(S)V")
    public void method5789() {
        this.field3953.clear();
        this.field3953.addAll(this.field3973);
        this.field3953.addAll(this.field3975);
    }

    @ObfuscatedName("lv.bd(IIIIIIB)V")
    public void method5683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3948.method5616()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3957));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3957));
        List var9 = this.field3947.method481(this.field3949 - var7 / 2 - 1, this.field3932 - var8 / 2 - 1, var7 / 2 + this.field3949 + 1, var8 / 2 + this.field3932 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class29 var11 = (class29) var10.next();
            class258 var12 = class258.method3226(var11.field241);
            var13 = false;
            for (int var14 = this.field3979.length - 1; var14 >= 0; var14--) {
                if (var12.field3293[var14] != null) {
                    client.method603(var12.field3293[var14], var12.field3309, this.field3979[var14], var11.field241, var11.field242.method4129(), var11.field250.method4129());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lv.bu(ILhc;I)Lhc;")
    public class229 method5684(int arg0, class229 arg1) {
        if (!this.field3948.method5616()) {
            return null;
        } else if (!this.field3947.method515()) {
            return null;
        } else if (this.field3945.method231(arg1.field2620, arg1.field2621)) {
            HashMap var3 = this.field3947.method484();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class29 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class29 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field250;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field250.field2620 - arg1.field2620;
                    int var10 = var8.field250.field2621 - arg1.field2621;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field250;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lv.bo(IILhc;Lhc;I)V")
    public void method5685(int arg0, int arg1, class229 arg2, class229 arg3) {
        class58 var5 = new class58();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method960(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method961(10);
                break;
            case 1009:
                var5.method961(11);
                break;
            case 1010:
                var5.method961(12);
                break;
            case 1011:
                var5.method961(13);
                break;
            case 1012:
                var5.method961(14);
        }
        class71.method1800(var5);
    }

    @ObfuscatedName("lv.bt(I)Lal;")
    public class29 method5686() {
        if (!this.field3948.method5616()) {
            return null;
        } else if (this.field3947.method515()) {
            HashMap var1 = this.field3947.method484();
            this.field3980 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3980.addAll(var3);
            }
            this.field3981 = this.field3980.iterator();
            return this.method5822();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lv.by(B)Lal;")
    public class29 method5822() {
        if (this.field3981 == null) {
            return null;
        } else if (this.field3981.hasNext()) {
            return (class29) this.field3981.next();
        } else {
            return null;
        }
    }
}
