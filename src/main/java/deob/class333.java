package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lo")
public class class333 {

    @ObfuscatedName("lo.c")
    public class234 field3950;

    @ObfuscatedName("lo.o")
    public class234 field3951;

    @ObfuscatedName("lo.i")
    public class234 field3952;

    @ObfuscatedName("lo.d")
    public static final class292 field3981 = class292.field3642;

    @ObfuscatedName("lo.m")
    public static final class292 field3954 = class292.field3646;

    @ObfuscatedName("lo.p")
    public static final class292 field3955 = class292.field3647;

    @ObfuscatedName("lo.h")
    public class295 field4002;

    @ObfuscatedName("lo.k")
    public HashMap field3971;

    @ObfuscatedName("lo.x")
    public class324[] field3949;

    @ObfuscatedName("lo.j")
    public HashMap field3959;

    @ObfuscatedName("lo.r")
    public class27 field3960;

    @ObfuscatedName("lo.e")
    public class27 field3961;

    @ObfuscatedName("lo.s")
    public class27 field3962;

    @ObfuscatedName("lo.b")
    public class37 field3963;

    @ObfuscatedName("lo.z")
    public class332 field3958;

    @ObfuscatedName("lo.f")
    public int field3965;

    @ObfuscatedName("lo.g")
    public int field3957;

    @ObfuscatedName("lo.w")
    public int field3967 = -1;

    @ObfuscatedName("lo.u")
    public int field3968 = -1;

    @ObfuscatedName("lo.y")
    public float field3969;

    @ObfuscatedName("lo.aa")
    public float field3970;

    @ObfuscatedName("lo.aw")
    public int field3984 = -1;

    @ObfuscatedName("lo.ar")
    public int field3989 = -1;

    @ObfuscatedName("lo.aq")
    public int field3973 = -1;

    @ObfuscatedName("lo.ad")
    public int field3974 = -1;

    @ObfuscatedName("lo.ag")
    public int field3975 = 3;

    @ObfuscatedName("lo.ak")
    public int field3976 = 50;

    @ObfuscatedName("lo.av")
    public boolean field3972 = false;

    @ObfuscatedName("lo.am")
    public HashSet field3978 = null;

    @ObfuscatedName("lo.ab")
    public int field3946 = -1;

    @ObfuscatedName("lo.ax")
    public int field3980 = -1;

    @ObfuscatedName("lo.al")
    public int field3945 = -1;

    @ObfuscatedName("lo.ap")
    public int field3982 = -1;

    @ObfuscatedName("lo.aj")
    public int field4005 = -1;

    @ObfuscatedName("lo.ae")
    public int field3979 = -1;

    @ObfuscatedName("lo.au")
    public long field3985;

    @ObfuscatedName("lo.ah")
    public int field3983;

    @ObfuscatedName("lo.an")
    public int field3964;

    @ObfuscatedName("lo.af")
    public boolean field3988 = true;

    @ObfuscatedName("lo.ao")
    public HashSet field3990 = new HashSet();

    @ObfuscatedName("lo.ai")
    public HashSet field3991 = new HashSet();

    @ObfuscatedName("lo.ac")
    public HashSet field3986 = new HashSet();

    @ObfuscatedName("lo.at")
    public HashSet field3993 = new HashSet();

    @ObfuscatedName("lo.as")
    public boolean field3994 = false;

    @ObfuscatedName("lo.ba")
    public int field3995 = 0;

    @ObfuscatedName("lo.bc")
    public final int[] field4004 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lo.bd")
    public List field3997;

    @ObfuscatedName("lo.bx")
    public Iterator field3998;

    @ObfuscatedName("lo.bl")
    public HashSet field3999 = new HashSet();

    @ObfuscatedName("lo.bh")
    public class214 field4000 = null;

    @ObfuscatedName("lo.bu")
    public boolean field4001 = false;

    @ObfuscatedName("lo.br")
    public class325 field3992;

    @ObfuscatedName("lo.bq")
    public int field3948;

    @ObfuscatedName("lo.bi")
    public int field3953 = -1;

    @ObfuscatedName("lo.be")
    public int field4003 = -1;

    @ObfuscatedName("lo.bt")
    public int field4006 = -1;

    @ObfuscatedName("lo.a(Lhq;Lhq;Lhq;Lks;Ljava/util/HashMap;[Llw;I)V")
    public void method5871(class234 arg0, class234 arg1, class234 arg2, class295 arg3, HashMap arg4, class324[] arg5) {
        this.field3949 = arg5;
        this.field3950 = arg0;
        this.field3951 = arg1;
        this.field3952 = arg2;
        this.field4002 = arg3;
        this.field3971 = new HashMap();
        this.field3971.put(class18.field110, arg4.get(field3981));
        this.field3971.put(class18.field109, arg4.get(field3954));
        this.field3971.put(class18.field107, arg4.get(field3955));
        this.field3958 = new class332(arg0);
        int var7 = this.field3950.method3891(class36.field289.field294);
        int[] var8 = this.field3950.method3887(var7);
        this.field3959 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class300 var10 = new class300(this.field3950.method3873(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method344(var10, var8[var9]);
            this.field3959.put(var11.method315(), var11);
            if (var11.method320()) {
                this.field3960 = var11;
            }
        }
        this.method5886(this.field3960);
        this.field3962 = null;
    }

    @ObfuscatedName("lo.t(I)V")
    public void method5872() {
        class30.field243.method3150(5);
    }

    @ObfuscatedName("lo.n(IIZIIIII)V")
    public void method5972(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3958.method5859()) {
            return;
        }
        this.method5876();
        this.method6091();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3969));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3969));
        List var10 = this.field3963.method576(this.field3965 - var8 / 2 - 1, this.field3957 - var9 / 2 - 1, var8 / 2 + this.field3965 + 1, var9 / 2 + this.field3957 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method210(), var13.field282, var13.field283);
            var14.method1094(new Object[] { var15, arg0, arg1 });
            if (this.field3999.contains(var13)) {
                var14.method1092(17);
            } else {
                var14.method1092(15);
            }
            class77.method165(var14);
        }
        Iterator var16 = this.field3999.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method210(), var17.field282, var17.field283);
                var18.method1094(new Object[] { var19, arg0, arg1 });
                var18.method1092(16);
                class77.method165(var18);
            }
        }
        this.field3999 = var11;
    }

    @ObfuscatedName("lo.q(IIZZI)V")
    public void method5874(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class297.method3777();
        this.method5946(arg0, arg1, arg3, var5);
        if (!this.method5994() && arg3 || arg2) {
            if (arg3) {
                this.field4005 = arg0;
                this.field3979 = arg1;
                this.field3945 = this.field3965;
                this.field3982 = this.field3957;
            }
            if (this.field3945 != -1) {
                int var7 = arg0 - this.field4005;
                int var8 = arg1 - this.field3979;
                this.method5878(this.field3945 - (int) ((float) var7 / this.field3970), this.field3982 + (int) ((float) var8 / this.field3970), false);
            }
        } else {
            this.method5879();
        }
        if (arg3) {
            this.field3985 = var5;
            this.field3983 = arg0;
            this.field3964 = arg1;
        }
    }

    @ObfuscatedName("lo.v(IIZJ)V")
    public void method5946(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3961 == null) {
            this.field4000 = null;
            return;
        }
        int var6 = (int) ((float) this.field3965 + ((float) (arg0 - this.field3973) - (float) this.method6027() * this.field3969 / 2.0F) / this.field3969);
        int var7 = (int) ((float) this.field3957 - ((float) (arg1 - this.field3974) - (float) this.method5909() * this.field3969 / 2.0F) / this.field3969);
        this.field4000 = this.field3961.method380(var6 + this.field3961.method325() * 64, var7 + this.field3961.method327() * 64);
        if (this.field4000 == null || !arg2) {
            return;
        }
        if (client.method1649() && class46.field387[82] && class46.field387[81]) {
            int var8 = this.field4000.field2512;
            int var9 = this.field4000.field2510;
            int var10 = this.field4000.field2509;
            class188 var11 = class188.method2402(class184.field2229, client.field679.field1284);
            var11.field2308.method5168(0);
            var11.field2308.method5253(var10);
            var11.field2308.method5158(var9);
            var11.field2308.method5322(var8);
            client.field679.method2177(var11);
            return;
        }
        boolean var12 = true;
        if (this.field3988) {
            int var13 = arg0 - this.field3983;
            int var14 = arg1 - this.field3964;
            if (arg3 - this.field3985 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class188 var15 = class188.method2402(class184.field2240, client.field679.field1284);
            var15.field2308.method5169(this.field4000.method3731());
            client.field679.method2177(var15);
            this.field3985 = 0L;
        }
    }

    @ObfuscatedName("lo.l(B)V")
    public void method5876() {
        if (Statics.field31 != null) {
            this.field3969 = this.field3970;
            return;
        }
        if (this.field3969 < this.field3970) {
            this.field3969 = Math.min(this.field3970, this.field3969 / 30.0F + this.field3969);
        }
        if (this.field3969 > this.field3970) {
            this.field3969 = Math.max(this.field3970, this.field3969 - this.field3969 / 30.0F);
        }
    }

    @ObfuscatedName("lo.c(I)V")
    public void method6091() {
        if (!this.method5994()) {
            return;
        }
        int var1 = this.field3967 - this.field3965;
        int var2 = this.field3968 - this.field3957;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5878(this.field3965 + var1, this.field3957 + var2, true);
        if (this.field3967 == this.field3965 && this.field3968 == this.field3957) {
            this.field3967 = -1;
            this.field3968 = -1;
        }
    }

    @ObfuscatedName("lo.o(IIZI)V")
    public final void method5878(int arg0, int arg1, boolean arg2) {
        this.field3965 = arg0;
        this.field3957 = arg1;
        class297.method3777();
        if (arg2) {
            this.method5879();
        }
    }

    @ObfuscatedName("lo.i(I)V")
    public final void method5879() {
        this.field3979 = -1;
        this.field4005 = -1;
        this.field3982 = -1;
        this.field3945 = -1;
    }

    @ObfuscatedName("lo.d(I)Z")
    public boolean method5994() {
        return this.field3967 != -1 && this.field3968 != -1;
    }

    @ObfuscatedName("lo.m(IIII)Laa;")
    public class27 method5881(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3959.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method314(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lo.p(IIIZB)V")
    public void method5882(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5881(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3960;
        }
        boolean var6 = false;
        if (this.field3962 != var5 || arg3) {
            this.field3962 = var5;
            this.method5886(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5889(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lo.h(II)V")
    public void method5883(int arg0) {
        class27 var2 = this.method5900(arg0);
        if (var2 != null) {
            this.method5886(var2);
        }
    }

    @ObfuscatedName("lo.k(I)I")
    public int method5939() {
        return this.field3961 == null ? -1 : this.field3961.method354();
    }

    @ObfuscatedName("lo.x(I)Laa;")
    public class27 method5885() {
        return this.field3961;
    }

    @ObfuscatedName("lo.j(Laa;I)V")
    public void method5886(class27 arg0) {
        if (this.field3961 == null || this.field3961 != arg0) {
            this.method5887(arg0);
            this.method5889(-1, -1, -1);
        }
    }

    @ObfuscatedName("lo.r(Laa;B)V")
    public void method5887(class27 arg0) {
        this.field3961 = arg0;
        this.field3963 = new class37(this.field3949, this.field3971, this.field3951, this.field3952);
        this.field3958.method5858(this.field3961.method315());
    }

    @ObfuscatedName("lo.e(Laa;Lhf;Lhf;ZI)V")
    public void method5888(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3961 == null || this.field3961 != arg0) {
            this.method5887(arg0);
        }
        if (!arg3 && this.field3961.method314(arg1.field2509, arg1.field2512, arg1.field2510)) {
            this.method5889(arg1.field2509, arg1.field2512, arg1.field2510);
        } else {
            this.method5889(arg2.field2509, arg2.field2512, arg2.field2510);
        }
    }

    @ObfuscatedName("lo.s(IIIB)V")
    public void method5889(int arg0, int arg1, int arg2) {
        if (this.field3961 == null) {
            return;
        }
        int[] var4 = this.field3961.method316(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3961.method316(this.field3961.method330(), this.field3961.method329(), this.field3961.method359());
        }
        this.method5878(var4[0] - this.field3961.method325() * 64, var4[1] - this.field3961.method327() * 64, true);
        this.field3967 = -1;
        this.field3968 = -1;
        this.field3969 = this.method6011(this.field3961.method312());
        this.field3970 = this.field3969;
        this.field3997 = null;
        this.field3998 = null;
        this.field3963.method572();
    }

    @ObfuscatedName("lo.b(IIIIII)V")
    public void method5890(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class321.method5618(var6);
        class321.method5578(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class321.method5585(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3958.method5860();
        if (var7 < 100) {
            this.method5895(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3963.method578()) {
            this.field3963.method608(this.field3950, this.field3961.method315(), client.field636);
            if (!this.field3963.method578()) {
                return;
            }
        }
        if (this.field3978 != null) {
            this.field3980++;
            if (this.field3980 % this.field3976 == 0) {
                this.field3980 = 0;
                this.field3946++;
            }
            if (this.field3946 >= this.field3975 && !this.field3972) {
                this.field3978 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3969));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3969));
        this.field3963.method602(this.field3965 - var8 / 2, this.field3957 - var9 / 2, var8 / 2 + this.field3965, var9 / 2 + this.field3957, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3994) {
            boolean var10 = false;
            if (arg4 - this.field3995 > 100) {
                this.field3995 = arg4;
                var10 = true;
            }
            this.field3963.method574(this.field3965 - var8 / 2, this.field3957 - var9 / 2, var8 / 2 + this.field3965, var9 / 2 + this.field3957, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3993, this.field3978, this.field3980, this.field3976, var10);
        }
        this.method5892(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field755 >= 2;
        if (var11 && this.field4001 && this.field4000 != null) {
            this.field4002.method4987("Coord: " + this.field4000, class321.field3836 + 10, class321.field3839 + 20, 16776960, -1);
        }
        this.field3984 = var8;
        this.field3989 = var9;
        this.field3973 = arg0;
        this.field3974 = arg1;
        class321.method5594(var6);
    }

    @ObfuscatedName("lo.w(IIIIIIS)Z")
    public boolean method5891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3992 == null) {
            return true;
        } else if (this.field3992.field3863 != arg0 || this.field3992.field3870 != arg1) {
            return true;
        } else if (this.field3963.field308 != this.field3948) {
            return true;
        } else if (client.field901 != this.field4006) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lo.u(IIIIIIB)V")
    public void method5892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field31 == null) {
            return;
        }
        int var7 = 512 / (this.field3963.field308 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6081() - arg4 / 2 - var7;
        int var14 = this.method5997() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3963.field308 * (var7 + var13 - this.field3953);
        int var16 = arg1 - this.field3963.field308 * (var7 - (var14 - this.field4003));
        if (this.method5891(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3992 != null && this.field3992.field3863 == var11 && this.field3992.field3870 == var12) {
                Arrays.fill(this.field3992.field3866, 0);
            } else {
                this.field3992 = new class325(var11, var12);
            }
            this.field3953 = this.method6081() - arg4 / 2 - var7;
            this.field4003 = this.method5997() - arg5 / 2 - var7;
            this.field3948 = this.field3963.field308;
            Statics.field31.method4037(this.field3953, this.field4003, this.field3992, (float) this.field3948 / var10);
            this.field4006 = client.field901;
            var15 = arg0 - this.field3963.field308 * (var7 + var13 - this.field3953);
            var16 = arg1 - this.field3963.field308 * (var7 - (var14 - this.field4003));
        }
        class321.method5584(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3992.method5705(var15, var16, 192);
        } else {
            this.field3992.method5708(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lo.ad(IIIII)V")
    public void method6019(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3958.method5859()) {
            return;
        }
        if (!this.field3963.method578()) {
            this.field3963.method608(this.field3950, this.field3961.method315(), client.field636);
            if (!this.field3963.method578()) {
                return;
            }
        }
        this.field3963.method575(arg0, arg1, arg2, arg3, this.field3978, this.field3980, this.field3976);
    }

    @ObfuscatedName("lo.ag(II)V")
    public void method5894(int arg0) {
        this.field3970 = this.method6011(arg0);
    }

    @ObfuscatedName("lo.ak(IIIIIB)V")
    public void method5895(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class321.method5585(arg0, arg1, arg2, arg3, -16777216);
        class321.method5620(var7 - 152, var8, 304, 34, -65536);
        class321.method5585(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4002.method5042(class225.field3044, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lo.av(II)F")
    public float method6011(int arg0) {
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

    @ObfuscatedName("lo.am(S)I")
    public int method5920() {
        if ((double) this.field3970 == 1.0D) {
            return 25;
        } else if ((double) this.field3970 == 1.5D) {
            return 37;
        } else if ((double) this.field3970 == 2.0D) {
            return 50;
        } else if ((double) this.field3970 == 3.0D) {
            return 75;
        } else if ((double) this.field3970 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lo.ab(I)V")
    public void method6001() {
        this.field3958.method5867();
    }

    @ObfuscatedName("lo.ax(I)Z")
    public boolean method5947() {
        return this.field3958.method5859();
    }

    @ObfuscatedName("lo.al(II)Laa;")
    public class27 method5900(int arg0) {
        Iterator var2 = this.field3959.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method354() != arg0);
        return var3;
    }

    @ObfuscatedName("lo.ap(III)V")
    public void method5901(int arg0, int arg1) {
        if (this.field3961 != null && this.field3961.method326(arg0, arg1)) {
            this.field3967 = arg0 - this.field3961.method325() * 64;
            this.field3968 = arg1 - this.field3961.method327() * 64;
        }
    }

    @ObfuscatedName("lo.aj(III)V")
    public void method6025(int arg0, int arg1) {
        if (this.field3961 != null) {
            this.method5878(arg0 - this.field3961.method325() * 64, arg1 - this.field3961.method327() * 64, true);
            this.field3967 = -1;
            this.field3968 = -1;
        }
    }

    @ObfuscatedName("lo.ae(IIIB)V")
    public void method5903(int arg0, int arg1, int arg2) {
        if (this.field3961 != null) {
            int[] var4 = this.field3961.method316(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5901(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lo.au(IIII)V")
    public void method5904(int arg0, int arg1, int arg2) {
        if (this.field3961 != null) {
            int[] var4 = this.field3961.method316(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6025(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lo.ah(B)I")
    public int method6081() {
        return this.field3961 == null ? -1 : this.field3965 + this.field3961.method325() * 64;
    }

    @ObfuscatedName("lo.an(I)I")
    public int method5997() {
        return this.field3961 == null ? -1 : this.field3957 + this.field3961.method327() * 64;
    }

    @ObfuscatedName("lo.af(B)Lhf;")
    public class214 method5907() {
        return this.field3961 == null ? null : this.field3961.method380(this.method6081(), this.method5997());
    }

    @ObfuscatedName("lo.ay(S)I")
    public int method6027() {
        return this.field3984;
    }

    @ObfuscatedName("lo.az(I)I")
    public int method5909() {
        return this.field3989;
    }

    @ObfuscatedName("lo.ao(II)V")
    public void method5969(int arg0) {
        if (arg0 >= 1) {
            this.field3975 = arg0;
        }
    }

    @ObfuscatedName("lo.ai(I)V")
    public void method6034() {
        this.field3975 = 3;
    }

    @ObfuscatedName("lo.ac(IB)V")
    public void method5912(int arg0) {
        if (arg0 >= 1) {
            this.field3976 = arg0;
        }
    }

    @ObfuscatedName("lo.at(I)V")
    public void method5953() {
        this.field3976 = 50;
    }

    @ObfuscatedName("lo.as(ZI)V")
    public void method6064(boolean arg0) {
        this.field3972 = arg0;
    }

    @ObfuscatedName("lo.ba(IB)V")
    public void method5915(int arg0) {
        this.field3978 = new HashSet();
        this.field3978.add(arg0);
        this.field3946 = 0;
        this.field3980 = 0;
    }

    @ObfuscatedName("lo.bg(IB)V")
    public void method5916(int arg0) {
        this.field3978 = new HashSet();
        this.field3946 = 0;
        this.field3980 = 0;
        for (int var2 = 0; var2 < Statics.field2472; var2++) {
            if (class242.method1149(var2) != null && class242.method1149(var2).field3216 == arg0) {
                this.field3978.add(class242.method1149(var2).field3206);
            }
        }
    }

    @ObfuscatedName("lo.bc(I)V")
    public void method6057() {
        this.field3978 = null;
    }

    @ObfuscatedName("lo.bd(ZI)V")
    public void method5918(boolean arg0) {
        this.field3994 = !arg0;
    }

    @ObfuscatedName("lo.bx(IZI)V")
    public void method5919(int arg0, boolean arg1) {
        if (arg1) {
            this.field3990.remove(arg0);
        } else {
            this.field3990.add(arg0);
        }
        this.method5924();
    }

    @ObfuscatedName("lo.bl(IZI)V")
    public void method5962(int arg0, boolean arg1) {
        if (arg1) {
            this.field3991.remove(arg0);
        } else {
            this.field3991.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field2472; var3++) {
            if (class242.method1149(var3) != null && class242.method1149(var3).field3216 == arg0) {
                int var4 = class242.method1149(var3).field3206;
                if (arg1) {
                    this.field3986.remove(var4);
                } else {
                    this.field3986.add(var4);
                }
            }
        }
        this.method5924();
    }

    @ObfuscatedName("lo.bh(I)Z")
    public boolean method5921() {
        return !this.field3994;
    }

    @ObfuscatedName("lo.bu(II)Z")
    public boolean method5897(int arg0) {
        return !this.field3990.contains(arg0);
    }

    @ObfuscatedName("lo.br(II)Z")
    public boolean method5923(int arg0) {
        return !this.field3991.contains(arg0);
    }

    @ObfuscatedName("lo.bq(S)V")
    public void method5924() {
        this.field3993.clear();
        this.field3993.addAll(this.field3990);
        this.field3993.addAll(this.field3986);
    }

    @ObfuscatedName("lo.bi(IIIIIII)V")
    public void method5925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3958.method5859()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3969));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3969));
        List var9 = this.field3963.method576(this.field3965 - var7 / 2 - 1, this.field3957 - var8 / 2 - 1, var7 / 2 + this.field3965 + 1, var8 / 2 + this.field3957 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class35 var11 = (class35) var10.next();
            class242 var12 = class242.method1149(var11.method210());
            var13 = false;
            for (int var14 = this.field4004.length - 1; var14 >= 0; var14--) {
                if (var12.field3205[var14] != null) {
                    client.method3104(var12.field3205[var14], var12.field3212, this.field4004[var14], var11.method210(), var11.field282.method3731(), var11.field283.method3731());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lo.be(ILhf;I)Lhf;")
    public class214 method5926(int arg0, class214 arg1) {
        if (!this.field3958.method5859()) {
            return null;
        } else if (!this.field3963.method578()) {
            return null;
        } else if (this.field3961.method326(arg1.field2512, arg1.field2510)) {
            HashMap var3 = this.field3963.method573();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class35 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class35 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field283;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field283.field2512 - arg1.field2512;
                    int var10 = var8.field283.field2510 - arg1.field2510;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field283;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lo.bt(IILhf;Lhf;B)V")
    public void method5927(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1094(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1092(10);
                break;
            case 1009:
                var5.method1092(11);
                break;
            case 1010:
                var5.method1092(12);
                break;
            case 1011:
                var5.method1092(13);
                break;
            case 1012:
                var5.method1092(14);
        }
        class77.method165(var5);
    }

    @ObfuscatedName("lo.bs(I)Lam;")
    public class35 method6083() {
        if (!this.field3958.method5859()) {
            return null;
        } else if (this.field3963.method578()) {
            HashMap var1 = this.field3963.method573();
            this.field3997 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3997.addAll(var3);
            }
            this.field3998 = this.field3997.iterator();
            return this.method5979();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lo.bj(B)Lam;")
    public class35 method5979() {
        if (this.field3998 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3998.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3998.next();
        } while (var1.method210() == -1);
        return var1;
    }
}
