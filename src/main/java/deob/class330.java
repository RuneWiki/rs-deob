package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lg")
public class class330 {

    @ObfuscatedName("lg.b")
    public class250 field3945;

    @ObfuscatedName("lg.w")
    public static final class298 field3946 = class298.field3742;

    @ObfuscatedName("lg.n")
    public static final class298 field3947 = class298.field3743;

    @ObfuscatedName("lg.i")
    public static final class298 field3948 = class298.field3744;

    @ObfuscatedName("lg.p")
    public class301 field3985;

    @ObfuscatedName("lg.m")
    public HashMap field3950;

    @ObfuscatedName("lg.d")
    public class323[] field3951;

    @ObfuscatedName("lg.j")
    public HashMap field3983;

    @ObfuscatedName("lg.x")
    public class21 field3952;

    @ObfuscatedName("lg.v")
    public class21 field3954;

    @ObfuscatedName("lg.h")
    public class21 field3955;

    @ObfuscatedName("lg.f")
    public class31 field3956;

    @ObfuscatedName("lg.a")
    public class329 field3986;

    @ObfuscatedName("lg.t")
    public int field3969;

    @ObfuscatedName("lg.k")
    public int field3981;

    @ObfuscatedName("lg.z")
    public int field3977 = -1;

    @ObfuscatedName("lg.s")
    public int field3961 = -1;

    @ObfuscatedName("lg.y")
    public float field3943;

    @ObfuscatedName("lg.u")
    public float field3963;

    @ObfuscatedName("lg.o")
    public int field3953 = -1;

    @ObfuscatedName("lg.af")
    public int field3965 = -1;

    @ObfuscatedName("lg.an")
    public int field3999 = -1;

    @ObfuscatedName("lg.ax")
    public int field3967 = -1;

    @ObfuscatedName("lg.aw")
    public int field3968 = 3;

    @ObfuscatedName("lg.ae")
    public int field3984 = 50;

    @ObfuscatedName("lg.ac")
    public boolean field3970 = false;

    @ObfuscatedName("lg.az")
    public HashSet field3941 = null;

    @ObfuscatedName("lg.aj")
    public int field3972 = -1;

    @ObfuscatedName("lg.ag")
    public int field3973 = -1;

    @ObfuscatedName("lg.ab")
    public int field3987 = -1;

    @ObfuscatedName("lg.ar")
    public int field3975 = -1;

    @ObfuscatedName("lg.at")
    public int field3976 = -1;

    @ObfuscatedName("lg.as")
    public int field3960 = -1;

    @ObfuscatedName("lg.aa")
    public long field3978;

    @ObfuscatedName("lg.ai")
    public int field3971;

    @ObfuscatedName("lg.ad")
    public int field3980;

    @ObfuscatedName("lg.al")
    public boolean field3989 = true;

    @ObfuscatedName("lg.am")
    public HashSet field3974 = new HashSet();

    @ObfuscatedName("lg.ay")
    public HashSet field3997 = new HashSet();

    @ObfuscatedName("lg.ah")
    public HashSet field3959 = new HashSet();

    @ObfuscatedName("lg.ap")
    public HashSet field3966 = new HashSet();

    @ObfuscatedName("lg.av")
    public boolean field3988 = false;

    @ObfuscatedName("lg.au")
    public int field3996 = 0;

    @ObfuscatedName("lg.bs")
    public final int[] field3990 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lg.bz")
    public List field3991;

    @ObfuscatedName("lg.ba")
    public Iterator field3992;

    @ObfuscatedName("lg.bi")
    public HashSet field3993 = new HashSet();

    @ObfuscatedName("lg.bp")
    public class229 field3994 = null;

    @ObfuscatedName("lg.bv")
    public boolean field3995 = false;

    @ObfuscatedName("lg.bq")
    public class324 field3958;

    @ObfuscatedName("lg.bw")
    public int field3962;

    @ObfuscatedName("lg.bf")
    public int field3998 = -1;

    @ObfuscatedName("lg.bk")
    public int field3957 = -1;

    @ObfuscatedName("lg.bb")
    public int field4000 = -1;

    @ObfuscatedName("lg.g(Liu;Lkz;Ljava/util/HashMap;[Lli;I)V")
    public void method5838(class250 arg0, class301 arg1, HashMap arg2, class323[] arg3) {
        this.field3951 = arg3;
        this.field3945 = arg0;
        this.field3985 = arg1;
        this.field3950 = new HashMap();
        this.field3950.put(class13.field93, arg2.get(field3946));
        this.field3950.put(class13.field94, arg2.get(field3947));
        this.field3950.put(class13.field95, arg2.get(field3948));
        this.field3986 = new class329(arg0);
        int var5 = this.field3945.method4432(class30.field292.field299);
        int[] var6 = this.field3945.method4446(var5);
        this.field3983 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3945.method4438(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method243(var8, var6[var7]);
            this.field3983.put(var9.method245(), var9);
            if (var9.method235()) {
                this.field3952 = var9;
            }
        }
        this.method5854(this.field3952);
        this.field3955 = null;
    }

    @ObfuscatedName("lg.r(B)I")
    public int method5842() {
        return this.field3945.method4460(this.field3952.method245(), class30.field291.field299) ? 100 : this.field3945.method4452(this.field3952.method245());
    }

    @ObfuscatedName("lg.e(I)V")
    public void method5873() {
        class24.method3430();
    }

    @ObfuscatedName("lg.q(IIZIIIII)V")
    public void method5840(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3986.method5827()) {
            return;
        }
        this.method5936();
        this.method5924();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3943));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3943));
        List var10 = this.field3956.method502(this.field3969 - var8 / 2 - 1, this.field3981 - var9 / 2 - 1, var8 / 2 + this.field3969 + 1, var9 / 2 + this.field3981 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class58 var14 = new class58();
            class37 var15 = new class37(var13.field286, var13.field280, var13.field278);
            var14.method1035(new Object[] { var15, arg0, arg1 });
            if (this.field3993.contains(var13)) {
                var14.method1037(17);
            } else {
                var14.method1037(15);
            }
            class71.method997(var14);
        }
        Iterator var16 = this.field3993.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class58 var18 = new class58();
                class37 var19 = new class37(var17.field286, var17.field280, var17.field278);
                var18.method1035(new Object[] { var19, arg0, arg1 });
                var18.method1037(16);
                class71.method997(var18);
            }
        }
        this.field3993 = var11;
    }

    @ObfuscatedName("lg.c(IIZZB)V")
    public void method6000(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class187.method2664();
        this.method5843(arg0, arg1, arg3, var5);
        if (!this.method5998() && arg3 || arg2) {
            if (arg3) {
                this.field3976 = arg0;
                this.field3960 = arg1;
                this.field3987 = this.field3969;
                this.field3975 = this.field3981;
            }
            if (this.field3987 != -1) {
                int var7 = arg0 - this.field3976;
                int var8 = arg1 - this.field3960;
                this.method5846(this.field3987 - (int) ((float) var7 / this.field3963), this.field3975 + (int) ((float) var8 / this.field3963), false);
            }
        } else {
            this.method5852();
        }
        if (arg3) {
            this.field3978 = var5;
            this.field3971 = arg0;
            this.field3980 = arg1;
        }
    }

    @ObfuscatedName("lg.i(IIZJ)V")
    public void method5843(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3954 == null) {
            this.field3994 = null;
            return;
        }
        int var6 = (int) ((float) this.field3969 + ((float) (arg0 - this.field3999) - (float) this.method5876() * this.field3943 / 2.0F) / this.field3943);
        int var7 = (int) ((float) this.field3981 - ((float) (arg1 - this.field3967) - (float) this.method5877() * this.field3943 / 2.0F) / this.field3943);
        this.field3994 = this.field3954.method260(var6 + this.field3954.method261() * 64, var7 + this.field3954.method232() * 64);
        if (this.field3994 == null || !arg2) {
            return;
        }
        if (client.method993() && class40.field381[82] && class40.field381[81]) {
            client.method944(this.field3994.field2633, this.field3994.field2634, this.field3994.field2635, false);
            return;
        }
        boolean var8 = true;
        if (this.field3989) {
            int var9 = arg0 - this.field3971;
            int var10 = arg1 - this.field3980;
            if (arg3 - this.field3978 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class175 var11 = class175.method3035(class172.field2230, client.field691.field1283);
            var11.field2333.method3589(this.field3994.method4277());
            client.field691.method2060(var11);
            this.field3978 = 0L;
        }
    }

    @ObfuscatedName("lg.p(B)V")
    public void method5936() {
        if (Statics.field1934 != null) {
            this.field3943 = this.field3963;
            return;
        }
        if (this.field3943 < this.field3963) {
            this.field3943 = Math.min(this.field3963, this.field3943 / 30.0F + this.field3943);
        }
        if (this.field3943 > this.field3963) {
            this.field3943 = Math.max(this.field3963, this.field3943 - this.field3943 / 30.0F);
        }
    }

    @ObfuscatedName("lg.m(B)V")
    public void method5924() {
        if (!this.method5998()) {
            return;
        }
        int var1 = this.field3977 - this.field3969;
        int var2 = this.field3961 - this.field3981;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5846(this.field3969 + var1, this.field3981 + var2, true);
        if (this.field3977 == this.field3969 && this.field3981 == this.field3961) {
            this.field3977 = -1;
            this.field3961 = -1;
        }
    }

    @ObfuscatedName("lg.d(IIZB)V")
    public final void method5846(int arg0, int arg1, boolean arg2) {
        this.field3969 = arg0;
        this.field3981 = arg1;
        class187.method2664();
        if (arg2) {
            this.method5852();
        }
    }

    @ObfuscatedName("lg.j(S)V")
    public final void method5852() {
        this.field3960 = -1;
        this.field3976 = -1;
        this.field3975 = -1;
        this.field3987 = -1;
    }

    @ObfuscatedName("lg.x(I)Z")
    public boolean method5998() {
        return this.field3977 != -1 && this.field3961 != -1;
    }

    @ObfuscatedName("lg.v(IIIB)Lk;")
    public class21 method5849(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3983.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method229(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lg.h(IIIZB)V")
    public void method5850(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5849(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3952;
        }
        boolean var6 = false;
        if (this.field3955 != var5 || arg3) {
            this.field3955 = var5;
            this.method5854(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5855(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lg.f(II)V")
    public void method5851(int arg0) {
        class21 var2 = this.method5868(arg0);
        if (var2 != null) {
            this.method5854(var2);
        }
    }

    @ObfuscatedName("lg.a(I)I")
    public int method5857() {
        return this.field3954 == null ? -1 : this.field3954.method234();
    }

    @ObfuscatedName("lg.t(I)Lk;")
    public class21 method5853() {
        return this.field3954;
    }

    @ObfuscatedName("lg.k(Lk;I)V")
    public void method5854(class21 arg0) {
        if (this.field3954 == null || this.field3954 != arg0) {
            this.method5906(arg0);
            this.method5855(-1, -1, -1);
        }
    }

    @ObfuscatedName("lg.s(Lk;I)V")
    public void method5906(class21 arg0) {
        this.field3954 = arg0;
        this.field3956 = new class31(this.field3951, this.field3950);
        this.field3986.method5825(this.field3954.method245());
    }

    @ObfuscatedName("lg.y(Lk;Lhz;Lhz;ZB)V")
    public void method5856(class21 arg0, class229 arg1, class229 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3954 == null || this.field3954 != arg0) {
            this.method5906(arg0);
        }
        if (!arg3 && this.field3954.method229(arg1.field2635, arg1.field2633, arg1.field2634)) {
            this.method5855(arg1.field2635, arg1.field2633, arg1.field2634);
        } else {
            this.method5855(arg2.field2635, arg2.field2633, arg2.field2634);
        }
    }

    @ObfuscatedName("lg.u(IIIB)V")
    public void method5855(int arg0, int arg1, int arg2) {
        if (this.field3954 == null) {
            return;
        }
        int[] var4 = this.field3954.method231(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3954.method231(this.field3954.method237(), this.field3954.method284(), this.field3954.method246());
        }
        this.method5846(var4[0] - this.field3954.method261() * 64, var4[1] - this.field3954.method232() * 64, true);
        this.field3977 = -1;
        this.field3961 = -1;
        this.field3943 = this.method5864(this.field3954.method239());
        this.field3963 = this.field3943;
        this.field3991 = null;
        this.field3992 = null;
        this.field3956.method508();
    }

    @ObfuscatedName("lg.o(IIIIII)V")
    public void method5858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class320.method5646(var6);
        class320.method5603(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class320.method5583(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3986.method5836();
        if (var7 < 100) {
            this.method5863(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3956.method504()) {
            this.field3956.method496(this.field3945, this.field3954.method245(), client.field648);
            if (!this.field3956.method504()) {
                return;
            }
        }
        if (this.field3941 != null) {
            this.field3973++;
            if (this.field3973 % this.field3984 == 0) {
                this.field3973 = 0;
                this.field3972++;
            }
            if (this.field3972 >= this.field3968 && !this.field3970) {
                this.field3941 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3943));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3943));
        this.field3956.method498(this.field3969 - var8 / 2, this.field3981 - var9 / 2, var8 / 2 + this.field3969, var9 / 2 + this.field3981, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3988) {
            boolean var10 = false;
            if (arg4 - this.field3996 > 100) {
                this.field3996 = arg4;
                var10 = true;
            }
            this.field3956.method510(this.field3969 - var8 / 2, this.field3981 - var9 / 2, var8 / 2 + this.field3969, var9 / 2 + this.field3981, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3966, this.field3941, this.field3973, this.field3984, var10);
        }
        this.method5890(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method993() && this.field3995 && this.field3994 != null) {
            this.field3985.method5390("Coord: " + this.field3994, class320.field3854 + 10, class320.field3859 + 20, 16776960, -1);
        }
        this.field3953 = var8;
        this.field3965 = var9;
        this.field3999 = arg0;
        this.field3967 = arg1;
        class320.method5586(var6);
    }

    @ObfuscatedName("lg.af(IIIIIII)Z")
    public boolean method5859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3958 == null) {
            return true;
        } else if (this.field3958.field3880 != arg0 || this.field3958.field3888 != arg1) {
            return true;
        } else if (this.field3956.field313 != this.field3962) {
            return true;
        } else if (client.field915 != this.field4000) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lg.an(IIIIIII)V")
    public void method5890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1934 == null) {
            return;
        }
        int var7 = 512 / (this.field3956.field313 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5888() - arg4 / 2 - var7;
        int var14 = this.method5874() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3956.field313 * (var7 + var13 - this.field3998);
        int var16 = arg1 - this.field3956.field313 * (var7 - (var14 - this.field3957));
        if (this.method5859(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3958 != null && this.field3958.field3880 == var11 && this.field3958.field3888 == var12) {
                Arrays.fill(this.field3958.field3890, 0);
            } else {
                this.field3958 = new class324(var11, var12);
            }
            this.field3998 = this.method5888() - arg4 / 2 - var7;
            this.field3957 = this.method5874() - arg5 / 2 - var7;
            this.field3962 = this.field3956.field313;
            Statics.field1934.method4582(this.field3998, this.field3957, this.field3958, (float) this.field3962 / var10);
            this.field4000 = client.field915;
            var15 = arg0 - this.field3956.field313 * (var7 + var13 - this.field3998);
            var16 = arg1 - this.field3956.field313 * (var7 - (var14 - this.field3957));
        }
        class320.method5582(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3958.method5711(var15, var16, 192);
        } else {
            this.field3958.method5770(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lg.ax(IIIIB)V")
    public void method6011(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3986.method5827()) {
            return;
        }
        if (!this.field3956.method504()) {
            this.field3956.method496(this.field3945, this.field3954.method245(), client.field648);
            if (!this.field3956.method504()) {
                return;
            }
        }
        this.field3956.method501(arg0, arg1, arg2, arg3, this.field3941, this.field3973, this.field3984);
    }

    @ObfuscatedName("lg.aw(II)V")
    public void method5845(int arg0) {
        this.field3963 = this.method5864(arg0);
    }

    @ObfuscatedName("lg.ae(IIIIII)V")
    public void method5863(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class320.method5583(arg0, arg1, arg2, arg3, -16777216);
        class320.method5652(var7 - 152, var8, 304, 34, -65536);
        class320.method5583(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3985.method5422(class240.field3149, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lg.ac(II)F")
    public float method5864(int arg0) {
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

    @ObfuscatedName("lg.az(I)I")
    public int method5910() {
        if ((double) this.field3963 == 1.0D) {
            return 25;
        } else if ((double) this.field3963 == 1.5D) {
            return 37;
        } else if ((double) this.field3963 == 2.0D) {
            return 50;
        } else if ((double) this.field3963 == 3.0D) {
            return 75;
        } else if ((double) this.field3963 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lg.aj(I)V")
    public void method5866() {
        this.field3986.method5826();
    }

    @ObfuscatedName("lg.ag(I)Z")
    public boolean method5847() {
        return this.field3986.method5827();
    }

    @ObfuscatedName("lg.ab(II)Lk;")
    public class21 method5868(int arg0) {
        Iterator var2 = this.field3983.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method234() != arg0);
        return var3;
    }

    @ObfuscatedName("lg.ar(IIB)V")
    public void method6007(int arg0, int arg1) {
        if (this.field3954 != null && this.field3954.method230(arg0, arg1)) {
            this.field3977 = arg0 - this.field3954.method261() * 64;
            this.field3961 = arg1 - this.field3954.method232() * 64;
        }
    }

    @ObfuscatedName("lg.at(III)V")
    public void method5958(int arg0, int arg1) {
        if (this.field3954 != null) {
            this.method5846(arg0 - this.field3954.method261() * 64, arg1 - this.field3954.method232() * 64, true);
            this.field3977 = -1;
            this.field3961 = -1;
        }
    }

    @ObfuscatedName("lg.as(IIII)V")
    public void method5871(int arg0, int arg1, int arg2) {
        if (this.field3954 != null) {
            int[] var4 = this.field3954.method231(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6007(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lg.aa(IIIB)V")
    public void method5872(int arg0, int arg1, int arg2) {
        if (this.field3954 != null) {
            int[] var4 = this.field3954.method231(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5958(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lg.ai(B)I")
    public int method5888() {
        return this.field3954 == null ? -1 : this.field3969 + this.field3954.method261() * 64;
    }

    @ObfuscatedName("lg.ad(I)I")
    public int method5874() {
        return this.field3954 == null ? -1 : this.field3981 + this.field3954.method232() * 64;
    }

    @ObfuscatedName("lg.al(I)Lhz;")
    public class229 method5875() {
        return this.field3954 == null ? null : this.field3954.method260(this.method5888(), this.method5874());
    }

    @ObfuscatedName("lg.ak(I)I")
    public int method5876() {
        return this.field3953;
    }

    @ObfuscatedName("lg.ao(I)I")
    public int method5877() {
        return this.field3965;
    }

    @ObfuscatedName("lg.am(IB)V")
    public void method5878(int arg0) {
        if (arg0 >= 1) {
            this.field3968 = arg0;
        }
    }

    @ObfuscatedName("lg.ay(B)V")
    public void method5879() {
        this.field3968 = 3;
    }

    @ObfuscatedName("lg.ah(II)V")
    public void method5880(int arg0) {
        if (arg0 >= 1) {
            this.field3984 = arg0;
        }
    }

    @ObfuscatedName("lg.ap(I)V")
    public void method5881() {
        this.field3984 = 50;
    }

    @ObfuscatedName("lg.av(ZI)V")
    public void method5935(boolean arg0) {
        this.field3970 = arg0;
    }

    @ObfuscatedName("lg.au(IB)V")
    public void method5896(int arg0) {
        this.field3941 = new HashSet();
        this.field3941.add(arg0);
        this.field3972 = 0;
        this.field3973 = 0;
    }

    @ObfuscatedName("lg.aq(II)V")
    public void method5884(int arg0) {
        this.field3941 = new HashSet();
        this.field3972 = 0;
        this.field3973 = 0;
        for (int var2 = 0; var2 < Statics.field3332; var2++) {
            if (class258.method3265(var2) != null && class258.method3265(var2).field3318 == arg0) {
                this.field3941.add(class258.method3265(var2).field3314);
            }
        }
    }

    @ObfuscatedName("lg.bs(I)V")
    public void method5885() {
        this.field3941 = null;
    }

    @ObfuscatedName("lg.bz(ZB)V")
    public void method6013(boolean arg0) {
        this.field3988 = !arg0;
    }

    @ObfuscatedName("lg.ba(IZB)V")
    public void method5844(int arg0, boolean arg1) {
        if (arg1) {
            this.field3974.remove(arg0);
        } else {
            this.field3974.add(arg0);
        }
        this.method5892();
    }

    @ObfuscatedName("lg.bi(IZB)V")
    public void method5841(int arg0, boolean arg1) {
        if (arg1) {
            this.field3997.remove(arg0);
        } else {
            this.field3997.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3332; var3++) {
            if (class258.method3265(var3) != null && class258.method3265(var3).field3318 == arg0) {
                int var4 = class258.method3265(var3).field3314;
                if (arg1) {
                    this.field3959.remove(var4);
                } else {
                    this.field3959.add(var4);
                }
            }
        }
        this.method5892();
    }

    @ObfuscatedName("lg.bp(I)Z")
    public boolean method5889() {
        return !this.field3988;
    }

    @ObfuscatedName("lg.bv(II)Z")
    public boolean method5891(int arg0) {
        return !this.field3974.contains(arg0);
    }

    @ObfuscatedName("lg.bq(IB)Z")
    public boolean method5893(int arg0) {
        return !this.field3997.contains(arg0);
    }

    @ObfuscatedName("lg.bw(B)V")
    public void method5892() {
        this.field3966.clear();
        this.field3966.addAll(this.field3974);
        this.field3966.addAll(this.field3959);
    }

    @ObfuscatedName("lg.bf(IIIIIII)V")
    public void method5939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3986.method5827()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3943));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3943));
        List var9 = this.field3956.method502(this.field3969 - var7 / 2 - 1, this.field3981 - var8 / 2 - 1, var7 / 2 + this.field3969 + 1, var8 / 2 + this.field3981 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class258 var12 = class258.method3265(var11.field286);
            var13 = false;
            for (int var14 = this.field3990.length - 1; var14 >= 0; var14--) {
                if (var12.field3321[var14] != null) {
                    client.method1915(var12.field3321[var14], var12.field3322, this.field3990[var14], var11.field286, var11.field280.method4277(), var11.field278.method4277());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lg.bk(ILhz;I)Lhz;")
    public class229 method5894(int arg0, class229 arg1) {
        if (!this.field3986.method5827()) {
            return null;
        } else if (!this.field3956.method504()) {
            return null;
        } else if (this.field3954.method230(arg1.field2633, arg1.field2634)) {
            HashMap var3 = this.field3956.method505();
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
                        return var5.field278;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field278.field2633 - arg1.field2633;
                    int var10 = var8.field278.field2634 - arg1.field2634;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field278;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lg.bb(IILhz;Lhz;I)V")
    public void method5895(int arg0, int arg1, class229 arg2, class229 arg3) {
        class58 var5 = new class58();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method1035(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1037(10);
                break;
            case 1009:
                var5.method1037(11);
                break;
            case 1010:
                var5.method1037(12);
                break;
            case 1011:
                var5.method1037(13);
                break;
            case 1012:
                var5.method1037(14);
        }
        class71.method997(var5);
    }

    @ObfuscatedName("lg.bl(I)Lax;")
    public class29 method6027() {
        if (!this.field3986.method5827()) {
            return null;
        } else if (this.field3956.method504()) {
            HashMap var1 = this.field3956.method505();
            this.field3991 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3991.addAll(var3);
            }
            this.field3992 = this.field3991.iterator();
            return this.method5897();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lg.bc(I)Lax;")
    public class29 method5897() {
        if (this.field3992 == null) {
            return null;
        } else if (this.field3992.hasNext()) {
            return (class29) this.field3992.next();
        } else {
            return null;
        }
    }
}
