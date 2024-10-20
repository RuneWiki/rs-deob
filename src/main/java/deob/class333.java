package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lo")
public class class333 {

    @ObfuscatedName("lo.h")
    public class234 field3948;

    @ObfuscatedName("lo.y")
    public class234 field3949;

    @ObfuscatedName("lo.w")
    public class234 field3950;

    @ObfuscatedName("lo.i")
    public static final class292 field3951 = class292.field3662;

    @ObfuscatedName("lo.k")
    public static final class292 field3973 = class292.field3663;

    @ObfuscatedName("lo.x")
    public static final class292 field3968 = class292.field3664;

    @ObfuscatedName("lo.o")
    public class295 field3969;

    @ObfuscatedName("lo.e")
    public HashMap field3955;

    @ObfuscatedName("lo.n")
    public class324[] field3984;

    @ObfuscatedName("lo.r")
    public HashMap field3957;

    @ObfuscatedName("lo.c")
    public class27 field3975;

    @ObfuscatedName("lo.a")
    public class27 field3959;

    @ObfuscatedName("lo.d")
    public class27 field3986;

    @ObfuscatedName("lo.s")
    public class37 field3961;

    @ObfuscatedName("lo.t")
    public class332 field3962;

    @ObfuscatedName("lo.m")
    public int field3963;

    @ObfuscatedName("lo.v")
    public int field3964;

    @ObfuscatedName("lo.q")
    public int field3965 = -1;

    @ObfuscatedName("lo.l")
    public int field3966 = -1;

    @ObfuscatedName("lo.j")
    public float field3994;

    @ObfuscatedName("lo.af")
    public float field3987;

    @ObfuscatedName("lo.ad")
    public int field3960 = -1;

    @ObfuscatedName("lo.am")
    public int field3972 = -1;

    @ObfuscatedName("lo.ai")
    public int field3971 = -1;

    @ObfuscatedName("lo.ag")
    public int field3989 = -1;

    @ObfuscatedName("lo.ao")
    public int field3970 = 3;

    @ObfuscatedName("lo.aw")
    public int field3974 = 50;

    @ObfuscatedName("lo.ak")
    public boolean field3952 = false;

    @ObfuscatedName("lo.aa")
    public HashSet field3976 = null;

    @ObfuscatedName("lo.ab")
    public int field3956 = -1;

    @ObfuscatedName("lo.ar")
    public int field3978 = -1;

    @ObfuscatedName("lo.av")
    public int field3998 = -1;

    @ObfuscatedName("lo.aq")
    public int field3980 = -1;

    @ObfuscatedName("lo.ac")
    public int field3967 = -1;

    @ObfuscatedName("lo.az")
    public int field3982 = -1;

    @ObfuscatedName("lo.at")
    public long field3983;

    @ObfuscatedName("lo.ae")
    public int field3981;

    @ObfuscatedName("lo.aj")
    public int field3985;

    @ObfuscatedName("lo.ap")
    public boolean field3958 = true;

    @ObfuscatedName("lo.ay")
    public HashSet field3979 = new HashSet();

    @ObfuscatedName("lo.ax")
    public HashSet field3953 = new HashSet();

    @ObfuscatedName("lo.au")
    public HashSet field3942 = new HashSet();

    @ObfuscatedName("lo.as")
    public HashSet field3990 = new HashSet();

    @ObfuscatedName("lo.ah")
    public boolean field3977 = false;

    @ObfuscatedName("lo.bi")
    public int field3992 = 0;

    @ObfuscatedName("lo.bx")
    public final int[] field3993 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lo.bu")
    public List field3954;

    @ObfuscatedName("lo.bd")
    public Iterator field3995;

    @ObfuscatedName("lo.bn")
    public HashSet field3996 = new HashSet();

    @ObfuscatedName("lo.bj")
    public class214 field3997 = null;

    @ObfuscatedName("lo.bm")
    public boolean field3988 = false;

    @ObfuscatedName("lo.bq")
    public class325 field3999;

    @ObfuscatedName("lo.bf")
    public int field4000;

    @ObfuscatedName("lo.by")
    public int field4001 = -1;

    @ObfuscatedName("lo.br")
    public int field4002 = -1;

    @ObfuscatedName("lo.ba")
    public int field4003 = -1;

    @ObfuscatedName("lo.u(Lhf;Lhf;Lhf;Lky;Ljava/util/HashMap;[Llm;B)V")
    public void method5901(class234 arg0, class234 arg1, class234 arg2, class295 arg3, HashMap arg4, class324[] arg5) {
        this.field3984 = arg5;
        this.field3948 = arg0;
        this.field3949 = arg1;
        this.field3950 = arg2;
        this.field3969 = arg3;
        this.field3955 = new HashMap();
        this.field3955.put(class18.field114, arg4.get(field3951));
        this.field3955.put(class18.field118, arg4.get(field3973));
        this.field3955.put(class18.field113, arg4.get(field3968));
        this.field3962 = new class332(arg0);
        int var7 = this.field3948.method3917(class36.field305.field303);
        int[] var8 = this.field3948.method3854(var7);
        this.field3957 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class300 var10 = new class300(this.field3948.method3928(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method336(var10, var8[var9]);
            this.field3957.put(var11.method340(), var11);
            if (var11.method359()) {
                this.field3975 = var11;
            }
        }
        this.method5870(this.field3975);
        this.field3986 = null;
    }

    @ObfuscatedName("lo.f(I)V")
    public void method5856() {
        class30.field242.method3100(5);
    }

    @ObfuscatedName("lo.b(IIZIIIII)V")
    public void method5857(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3962.method5842()) {
            return;
        }
        this.method5860();
        this.method5864();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3994));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3994));
        List var10 = this.field3961.method545(this.field3963 - var8 / 2 - 1, this.field3964 - var9 / 2 - 1, var8 / 2 + this.field3963 + 1, var9 / 2 + this.field3964 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method191(), var13.field298, var13.field294);
            var14.method1048(new Object[] { var15, arg0, arg1 });
            if (this.field3996.contains(var13)) {
                var14.method1053(17);
            } else {
                var14.method1053(15);
            }
            class77.method371(var14);
        }
        Iterator var16 = this.field3996.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method191(), var17.field298, var17.field294);
                var18.method1048(new Object[] { var19, arg0, arg1 });
                var18.method1053(16);
                class77.method371(var18);
            }
        }
        this.field3996 = var11;
    }

    @ObfuscatedName("lo.g(IIZZI)V")
    public void method5858(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class297.method3217();
        this.method5859(arg0, arg1, arg3, var5);
        if (!this.method6005() && arg3 || arg2) {
            if (arg3) {
                this.field3967 = arg0;
                this.field3982 = arg1;
                this.field3998 = this.field3963;
                this.field3980 = this.field3964;
            }
            if (this.field3998 != -1) {
                int var7 = arg0 - this.field3967;
                int var8 = arg1 - this.field3982;
                this.method5862(this.field3998 - (int) ((float) var7 / this.field3987), this.field3980 + (int) ((float) var8 / this.field3987), false);
            }
        } else {
            this.method5863();
        }
        if (arg3) {
            this.field3983 = var5;
            this.field3981 = arg0;
            this.field3985 = arg1;
        }
    }

    @ObfuscatedName("lo.z(IIZJ)V")
    public void method5859(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3959 == null) {
            this.field3997 = null;
            return;
        }
        int var6 = (int) ((float) this.field3963 + ((float) (arg0 - this.field3971) - (float) this.method5892() * this.field3994 / 2.0F) / this.field3994);
        int var7 = (int) ((float) this.field3964 - ((float) (arg1 - this.field3989) - (float) this.method5893() * this.field3994 / 2.0F) / this.field3994);
        this.field3997 = this.field3959.method298(var6 + this.field3959.method306() * 64, var7 + this.field3959.method308() * 64);
        if (this.field3997 == null || !arg2) {
            return;
        }
        if (client.method234() && class46.field405[82] && class46.field405[81]) {
            client.method3239(this.field3997.field2536, this.field3997.field2535, this.field3997.field2540, false);
            return;
        }
        boolean var8 = true;
        if (this.field3958) {
            int var9 = arg0 - this.field3981;
            int var10 = arg1 - this.field3985;
            if (arg3 - this.field3983 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class188 var11 = class188.method3035(class184.field2292, client.field690.field1311);
            var11.field2347.method5184(this.field3997.method3677());
            client.field690.method2071(var11);
            this.field3983 = 0L;
        }
    }

    @ObfuscatedName("lo.p(B)V")
    public void method5860() {
        if (Statics.field3211 != null) {
            this.field3994 = this.field3987;
            return;
        }
        if (this.field3994 < this.field3987) {
            this.field3994 = Math.min(this.field3987, this.field3994 / 30.0F + this.field3994);
        }
        if (this.field3994 > this.field3987) {
            this.field3994 = Math.max(this.field3987, this.field3994 - this.field3994 / 30.0F);
        }
    }

    @ObfuscatedName("lo.h(I)V")
    public void method5864() {
        if (!this.method6005()) {
            return;
        }
        int var1 = this.field3965 - this.field3963;
        int var2 = this.field3966 - this.field3964;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5862(this.field3963 + var1, this.field3964 + var2, true);
        if (this.field3965 == this.field3963 && this.field3966 == this.field3964) {
            this.field3965 = -1;
            this.field3966 = -1;
        }
    }

    @ObfuscatedName("lo.y(IIZB)V")
    public final void method5862(int arg0, int arg1, boolean arg2) {
        this.field3963 = arg0;
        this.field3964 = arg1;
        class297.method3217();
        if (arg2) {
            this.method5863();
        }
    }

    @ObfuscatedName("lo.w(B)V")
    public final void method5863() {
        this.field3982 = -1;
        this.field3967 = -1;
        this.field3980 = -1;
        this.field3998 = -1;
    }

    @ObfuscatedName("lo.i(I)Z")
    public boolean method6005() {
        return this.field3965 != -1 && this.field3966 != -1;
    }

    @ObfuscatedName("lo.k(IIII)Laf;")
    public class27 method5865(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3957.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method295(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lo.x(IIIZB)V")
    public void method5861(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5865(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3975;
        }
        boolean var6 = false;
        if (this.field3986 != var5 || arg3) {
            this.field3986 = var5;
            this.method5870(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5947(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lo.o(II)V")
    public void method5867(int arg0) {
        class27 var2 = this.method5906(arg0);
        if (var2 != null) {
            this.method5870(var2);
        }
    }

    @ObfuscatedName("lo.e(I)I")
    public int method5868() {
        return this.field3959 == null ? -1 : this.field3959.method300();
    }

    @ObfuscatedName("lo.n(I)Laf;")
    public class27 method5972() {
        return this.field3959;
    }

    @ObfuscatedName("lo.c(Laf;I)V")
    public void method5870(class27 arg0) {
        if (this.field3959 == null || this.field3959 != arg0) {
            this.method5871(arg0);
            this.method5947(-1, -1, -1);
        }
    }

    @ObfuscatedName("lo.s(Laf;I)V")
    public void method5871(class27 arg0) {
        this.field3959 = arg0;
        this.field3961 = new class37(this.field3984, this.field3955, this.field3949, this.field3950);
        this.field3962.method5840(this.field3959.method340());
    }

    @ObfuscatedName("lo.t(Laf;Lhx;Lhx;ZI)V")
    public void method5933(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3959 == null || this.field3959 != arg0) {
            this.method5871(arg0);
        }
        if (!arg3 && this.field3959.method295(arg1.field2540, arg1.field2536, arg1.field2535)) {
            this.method5947(arg1.field2540, arg1.field2536, arg1.field2535);
        } else {
            this.method5947(arg2.field2540, arg2.field2536, arg2.field2535);
        }
    }

    @ObfuscatedName("lo.m(IIII)V")
    public void method5947(int arg0, int arg1, int arg2) {
        if (this.field3959 == null) {
            return;
        }
        int[] var4 = this.field3959.method297(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3959.method297(this.field3959.method311(), this.field3959.method310(), this.field3959.method293());
        }
        this.method5862(var4[0] - this.field3959.method306() * 64, var4[1] - this.field3959.method308() * 64, true);
        this.field3965 = -1;
        this.field3966 = -1;
        this.field3994 = this.method5880(this.field3959.method305());
        this.field3987 = this.field3994;
        this.field3954 = null;
        this.field3995 = null;
        this.field3961.method541();
    }

    @ObfuscatedName("lo.v(IIIIII)V")
    public void method5907(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class321.method5632(var6);
        class321.method5588(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class321.method5595(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3962.method5841();
        if (var7 < 100) {
            this.method5969(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3961.method573()) {
            this.field3961.method540(this.field3948, this.field3959.method340(), client.field859);
            if (!this.field3961.method573()) {
                return;
            }
        }
        if (this.field3976 != null) {
            this.field3978++;
            if (this.field3978 % this.field3974 == 0) {
                this.field3978 = 0;
                this.field3956++;
            }
            if (this.field3956 >= this.field3970 && !this.field3952) {
                this.field3976 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3994));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3994));
        this.field3961.method577(this.field3963 - var8 / 2, this.field3964 - var9 / 2, var8 / 2 + this.field3963, var9 / 2 + this.field3964, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3977) {
            boolean var10 = false;
            if (arg4 - this.field3992 > 100) {
                this.field3992 = arg4;
                var10 = true;
            }
            this.field3961.method543(this.field3963 - var8 / 2, this.field3964 - var9 / 2, var8 / 2 + this.field3963, var9 / 2 + this.field3964, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3990, this.field3976, this.field3978, this.field3974, var10);
        }
        this.method5876(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method234() && this.field3988 && this.field3997 != null) {
            this.field3969.method4993("Coord: " + this.field3997, class321.field3844 + 10, class321.field3847 + 20, 16776960, -1);
        }
        this.field3960 = var8;
        this.field3972 = var9;
        this.field3971 = arg0;
        this.field3989 = arg1;
        class321.method5591(var6);
    }

    @ObfuscatedName("lo.q(IIIIIII)Z")
    public boolean method5997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3999 == null) {
            return true;
        } else if (this.field3999.field3869 != arg0 || this.field3999.field3872 != arg1) {
            return true;
        } else if (this.field3961.field327 != this.field4000) {
            return true;
        } else if (client.field864 != this.field4003) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lo.l(IIIIIIB)V")
    public void method5876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3211 == null) {
            return;
        }
        int var7 = 512 / (this.field3961.field327 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5889() - arg4 / 2 - var7;
        int var14 = this.method5890() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3961.field327 * (var7 + var13 - this.field4001);
        int var16 = arg1 - this.field3961.field327 * (var7 - (var14 - this.field4002));
        if (this.method5997(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3999 != null && this.field3999.field3869 == var11 && this.field3999.field3872 == var12) {
                Arrays.fill(this.field3999.field3877, 0);
            } else {
                this.field3999 = new class325(var11, var12);
            }
            this.field4001 = this.method5889() - arg4 / 2 - var7;
            this.field4002 = this.method5890() - arg5 / 2 - var7;
            this.field4000 = this.field3961.field327;
            Statics.field3211.method4008(this.field4001, this.field4002, this.field3999, (float) this.field4000 / var10);
            this.field4003 = client.field864;
            var15 = arg0 - this.field3961.field327 * (var7 + var13 - this.field4001);
            var16 = arg1 - this.field3961.field327 * (var7 - (var14 - this.field4002));
        }
        class321.method5594(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3999.method5701(var15, var16, 192);
        } else {
            this.field3999.method5704(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lo.j(IIIII)V")
    public void method5877(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3962.method5842()) {
            return;
        }
        if (!this.field3961.method573()) {
            this.field3961.method540(this.field3948, this.field3959.method340(), client.field859);
            if (!this.field3961.method573()) {
                return;
            }
        }
        this.field3961.method574(arg0, arg1, arg2, arg3, this.field3976, this.field3978, this.field3974);
    }

    @ObfuscatedName("lo.ad(II)V")
    public void method5878(int arg0) {
        this.field3987 = this.method5880(arg0);
    }

    @ObfuscatedName("lo.am(IIIIII)V")
    public void method5969(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class321.method5595(arg0, arg1, arg2, arg3, -16777216);
        class321.method5596(var7 - 152, var8, 304, 34, -65536);
        class321.method5595(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3969.method4996(class225.field3070, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lo.ai(II)F")
    public float method5880(int arg0) {
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

    @ObfuscatedName("lo.ag(I)I")
    public int method5866() {
        if ((double) this.field3987 == 1.0D) {
            return 25;
        } else if ((double) this.field3987 == 1.5D) {
            return 37;
        } else if ((double) this.field3987 == 2.0D) {
            return 50;
        } else if ((double) this.field3987 == 3.0D) {
            return 75;
        } else if ((double) this.field3987 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lo.ao(I)V")
    public void method5882() {
        this.field3962.method5847();
    }

    @ObfuscatedName("lo.aw(I)Z")
    public boolean method5883() {
        return this.field3962.method5842();
    }

    @ObfuscatedName("lo.ak(IB)Laf;")
    public class27 method5906(int arg0) {
        Iterator var2 = this.field3957.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method300() != arg0);
        return var3;
    }

    @ObfuscatedName("lo.aa(IIB)V")
    public void method5885(int arg0, int arg1) {
        if (this.field3959 != null && this.field3959.method296(arg0, arg1)) {
            this.field3965 = arg0 - this.field3959.method306() * 64;
            this.field3966 = arg1 - this.field3959.method308() * 64;
        }
    }

    @ObfuscatedName("lo.ab(III)V")
    public void method5977(int arg0, int arg1) {
        if (this.field3959 != null) {
            this.method5862(arg0 - this.field3959.method306() * 64, arg1 - this.field3959.method308() * 64, true);
            this.field3965 = -1;
            this.field3966 = -1;
        }
    }

    @ObfuscatedName("lo.ar(IIIB)V")
    public void method5912(int arg0, int arg1, int arg2) {
        if (this.field3959 != null) {
            int[] var4 = this.field3959.method297(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5885(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lo.av(IIII)V")
    public void method5888(int arg0, int arg1, int arg2) {
        if (this.field3959 != null) {
            int[] var4 = this.field3959.method297(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5977(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lo.aq(B)I")
    public int method5889() {
        return this.field3959 == null ? -1 : this.field3963 + this.field3959.method306() * 64;
    }

    @ObfuscatedName("lo.ac(B)I")
    public int method5890() {
        return this.field3959 == null ? -1 : this.field3964 + this.field3959.method308() * 64;
    }

    @ObfuscatedName("lo.az(B)Lhx;")
    public class214 method5954() {
        return this.field3959 == null ? null : this.field3959.method298(this.method5889(), this.method5890());
    }

    @ObfuscatedName("lo.at(I)I")
    public int method5892() {
        return this.field3960;
    }

    @ObfuscatedName("lo.ae(B)I")
    public int method5893() {
        return this.field3972;
    }

    @ObfuscatedName("lo.aj(II)V")
    public void method5894(int arg0) {
        if (arg0 >= 1) {
            this.field3970 = arg0;
        }
    }

    @ObfuscatedName("lo.ap(I)V")
    public void method5895() {
        this.field3970 = 3;
    }

    @ObfuscatedName("lo.an(II)V")
    public void method5896(int arg0) {
        if (arg0 >= 1) {
            this.field3974 = arg0;
        }
    }

    @ObfuscatedName("lo.al(B)V")
    public void method5897() {
        this.field3974 = 50;
    }

    @ObfuscatedName("lo.ay(ZI)V")
    public void method5898(boolean arg0) {
        this.field3952 = arg0;
    }

    @ObfuscatedName("lo.ax(II)V")
    public void method5900(int arg0) {
        this.field3976 = new HashSet();
        this.field3976.add(arg0);
        this.field3956 = 0;
        this.field3978 = 0;
    }

    @ObfuscatedName("lo.au(IB)V")
    public void method5981(int arg0) {
        this.field3976 = new HashSet();
        this.field3956 = 0;
        this.field3978 = 0;
        for (int var2 = 0; var2 < Statics.field3222; var2++) {
            if (class242.method2014(var2) != null && class242.method2014(var2).field3238 == arg0) {
                this.field3976.add(class242.method2014(var2).field3221);
            }
        }
    }

    @ObfuscatedName("lo.as(I)V")
    public void method5999() {
        this.field3976 = null;
    }

    @ObfuscatedName("lo.ah(ZI)V")
    public void method5902(boolean arg0) {
        this.field3977 = !arg0;
    }

    @ObfuscatedName("lo.bi(IZI)V")
    public void method5903(int arg0, boolean arg1) {
        if (arg1) {
            this.field3979.remove(arg0);
        } else {
            this.field3979.add(arg0);
        }
        this.method5908();
    }

    @ObfuscatedName("lo.bo(IZI)V")
    public void method5904(int arg0, boolean arg1) {
        if (arg1) {
            this.field3953.remove(arg0);
        } else {
            this.field3953.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3222; var3++) {
            if (class242.method2014(var3) != null && class242.method2014(var3).field3238 == arg0) {
                int var4 = class242.method2014(var3).field3221;
                if (arg1) {
                    this.field3942.remove(var4);
                } else {
                    this.field3942.add(var4);
                }
            }
        }
        this.method5908();
    }

    @ObfuscatedName("lo.bx(B)Z")
    public boolean method5905() {
        return !this.field3977;
    }

    @ObfuscatedName("lo.bu(II)Z")
    public boolean method5886(int arg0) {
        return !this.field3979.contains(arg0);
    }

    @ObfuscatedName("lo.bd(IB)Z")
    public boolean method5918(int arg0) {
        return !this.field3953.contains(arg0);
    }

    @ObfuscatedName("lo.bn(B)V")
    public void method5908() {
        this.field3990.clear();
        this.field3990.addAll(this.field3979);
        this.field3990.addAll(this.field3942);
    }

    @ObfuscatedName("lo.bj(IIIIIII)V")
    public void method5992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3962.method5842()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3994));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3994));
        List var9 = this.field3961.method545(this.field3963 - var7 / 2 - 1, this.field3964 - var8 / 2 - 1, var7 / 2 + this.field3963 + 1, var8 / 2 + this.field3964 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class242 var12 = class242.method2014(var11.method191());
            var13 = false;
            for (int var14 = this.field3993.length - 1; var14 >= 0; var14--) {
                if (var12.field3219[var14] != null) {
                    client.method367(var12.field3219[var14], var12.field3232, this.field3993[var14], var11.method191(), var11.field298.method3677(), var11.field294.method3677());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lo.bm(ILhx;B)Lhx;")
    public class214 method5910(int arg0, class214 arg1) {
        if (!this.field3962.method5842()) {
            return null;
        } else if (!this.field3961.method573()) {
            return null;
        } else if (this.field3959.method296(arg1.field2536, arg1.field2535)) {
            HashMap var3 = this.field3961.method570();
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
                        return var5.field294;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field294.field2536 - arg1.field2536;
                    int var10 = var8.field294.field2535 - arg1.field2535;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field294;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lo.bq(IILhx;Lhx;I)V")
    public void method5911(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1048(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1053(10);
                break;
            case 1009:
                var5.method1053(11);
                break;
            case 1010:
                var5.method1053(12);
                break;
            case 1011:
                var5.method1053(13);
                break;
            case 1012:
                var5.method1053(14);
        }
        class77.method371(var5);
    }

    @ObfuscatedName("lo.bf(I)Laa;")
    public class35 method5952() {
        if (!this.field3962.method5842()) {
            return null;
        } else if (this.field3961.method573()) {
            HashMap var1 = this.field3961.method570();
            this.field3954 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3954.addAll(var3);
            }
            this.field3995 = this.field3954.iterator();
            return this.method5913();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lo.by(I)Laa;")
    public class35 method5913() {
        if (this.field3995 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3995.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3995.next();
        } while (var1.method191() == -1);
        return var1;
    }
}
