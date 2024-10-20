package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("la")
public class class333 {

    @ObfuscatedName("la.q")
    public class234 field3978;

    @ObfuscatedName("la.m")
    public class234 field3950;

    @ObfuscatedName("la.y")
    public class234 field3951;

    @ObfuscatedName("la.i")
    public static final class292 field3952 = class292.field3649;

    @ObfuscatedName("la.c")
    public static final class292 field3953 = class292.field3654;

    @ObfuscatedName("la.b")
    public static final class292 field3954 = class292.field3651;

    @ObfuscatedName("la.o")
    public class295 field3955;

    @ObfuscatedName("la.a")
    public HashMap field3956;

    @ObfuscatedName("la.e")
    public class324[] field3957;

    @ObfuscatedName("la.w")
    public HashMap field3949;

    @ObfuscatedName("la.t")
    public class27 field3959;

    @ObfuscatedName("la.g")
    public class27 field3960;

    @ObfuscatedName("la.x")
    public class27 field3961;

    @ObfuscatedName("la.h")
    public class37 field3962;

    @ObfuscatedName("la.s")
    public class332 field3993;

    @ObfuscatedName("la.f")
    public int field3964;

    @ObfuscatedName("la.j")
    public int field3965;

    @ObfuscatedName("la.d")
    public int field3966 = -1;

    @ObfuscatedName("la.l")
    public int field3967 = -1;

    @ObfuscatedName("la.k")
    public float field3968;

    @ObfuscatedName("la.ac")
    public float field3969;

    @ObfuscatedName("la.az")
    public int field3997 = -1;

    @ObfuscatedName("la.aw")
    public int field3971 = -1;

    @ObfuscatedName("la.aa")
    public int field3972 = -1;

    @ObfuscatedName("la.ap")
    public int field3973 = -1;

    @ObfuscatedName("la.ar")
    public int field3974 = 3;

    @ObfuscatedName("la.ab")
    public int field4004 = 50;

    @ObfuscatedName("la.ax")
    public boolean field3976 = false;

    @ObfuscatedName("la.as")
    public HashSet field3977 = null;

    @ObfuscatedName("la.ao")
    public int field3982 = -1;

    @ObfuscatedName("la.al")
    public int field3998 = -1;

    @ObfuscatedName("la.ad")
    public int field3980 = -1;

    @ObfuscatedName("la.an")
    public int field3992 = -1;

    @ObfuscatedName("la.ai")
    public int field3958 = -1;

    @ObfuscatedName("la.ak")
    public int field3983 = -1;

    @ObfuscatedName("la.aq")
    public long field3984;

    @ObfuscatedName("la.am")
    public int field4000;

    @ObfuscatedName("la.ae")
    public int field3986;

    @ObfuscatedName("la.av")
    public boolean field3987 = true;

    @ObfuscatedName("la.aj")
    public HashSet field3989 = new HashSet();

    @ObfuscatedName("la.ay")
    public HashSet field3990 = new HashSet();

    @ObfuscatedName("la.au")
    public HashSet field3979 = new HashSet();

    @ObfuscatedName("la.af")
    public HashSet field3994 = new HashSet();

    @ObfuscatedName("la.at")
    public boolean field3975 = false;

    @ObfuscatedName("la.bx")
    public int field3991 = 0;

    @ObfuscatedName("la.bd")
    public final int[] field3948 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("la.bm")
    public List field3996;

    @ObfuscatedName("la.bv")
    public Iterator field3981;

    @ObfuscatedName("la.bj")
    public HashSet field3970 = new HashSet();

    @ObfuscatedName("la.bs")
    public class214 field4001 = null;

    @ObfuscatedName("la.bz")
    public boolean field3985 = false;

    @ObfuscatedName("la.bc")
    public class325 field3995;

    @ObfuscatedName("la.bk")
    public int field4002;

    @ObfuscatedName("la.ba")
    public int field4003 = -1;

    @ObfuscatedName("la.bn")
    public int field3963 = -1;

    @ObfuscatedName("la.be")
    public int field4005 = -1;

    @ObfuscatedName("la.z(Lhp;Lhp;Lhp;Lkn;Ljava/util/HashMap;[Llp;B)V")
    public void method5804(class234 arg0, class234 arg1, class234 arg2, class295 arg3, HashMap arg4, class324[] arg5) {
        this.field3957 = arg5;
        this.field3978 = arg0;
        this.field3950 = arg1;
        this.field3951 = arg2;
        this.field3955 = arg3;
        this.field3956 = new HashMap();
        this.field3956.put(class18.field111, arg4.get(field3952));
        this.field3956.put(class18.field116, arg4.get(field3953));
        this.field3956.put(class18.field107, arg4.get(field3954));
        this.field3993 = new class332(arg0);
        int var7 = this.field3978.method3765(class36.field285.field289);
        int[] var8 = this.field3978.method3748(var7);
        this.field3949 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class300 var10 = new class300(this.field3978.method3726(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method288(var10, var8[var9]);
            this.field3949.put(var11.method297(), var11);
            if (var11.method346()) {
                this.field3959 = var11;
            }
        }
        this.method5753(this.field3959);
        this.field3961 = null;
    }

    @ObfuscatedName("la.n(B)V")
    public void method5791() {
        class30.field244.method3025(5);
    }

    @ObfuscatedName("la.v(IIZIIIII)V")
    public void method5819(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3993.method5730()) {
            return;
        }
        this.method5802();
        this.method5744();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3968));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3968));
        List var10 = this.field3962.method559(this.field3964 - var8 / 2 - 1, this.field3965 - var9 / 2 - 1, var8 / 2 + this.field3964 + 1, var9 / 2 + this.field3965 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method196(), var13.field283, var13.field282);
            var14.method1043(new Object[] { var15, arg0, arg1 });
            if (this.field3970.contains(var13)) {
                var14.method1044(17);
            } else {
                var14.method1044(15);
            }
            class77.method4064(var14);
        }
        Iterator var16 = this.field3970.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method196(), var17.field283, var17.field282);
                var18.method1043(new Object[] { var19, arg0, arg1 });
                var18.method1044(16);
                class77.method4064(var18);
            }
        }
        this.field3970 = var11;
    }

    @ObfuscatedName("la.u(IIZZI)V")
    public void method5922(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class297.method502();
        this.method5782(arg0, arg1, arg3, var5);
        if (!this.method5757() && arg3 || arg2) {
            if (arg3) {
                this.field3958 = arg0;
                this.field3983 = arg1;
                this.field3980 = this.field3964;
                this.field3992 = this.field3965;
            }
            if (this.field3980 != -1) {
                int var7 = arg0 - this.field3958;
                int var8 = arg1 - this.field3983;
                this.method5745(this.field3980 - (int) ((float) var7 / this.field3969), this.field3992 + (int) ((float) var8 / this.field3969), false);
            }
        } else {
            this.method5746();
        }
        if (arg3) {
            this.field3984 = var5;
            this.field4000 = arg0;
            this.field3986 = arg1;
        }
    }

    @ObfuscatedName("la.r(IIZJ)V")
    public void method5782(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3960 == null) {
            this.field4001 = null;
            return;
        }
        int var6 = (int) ((float) this.field3964 + ((float) (arg0 - this.field3972) - (float) this.method5877() * this.field3968 / 2.0F) / this.field3968);
        int var7 = (int) ((float) this.field3965 - ((float) (arg1 - this.field3973) - (float) this.method5835() * this.field3968 / 2.0F) / this.field3968);
        this.field4001 = this.field3960.method293(var6 + this.field3960.method301() * 64, var7 + this.field3960.method303() * 64);
        if (this.field4001 == null || !arg2) {
            return;
        }
        boolean var8 = client.field806 >= 2;
        if (var8 && class46.field370[82] && class46.field370[81]) {
            client.method4776(this.field4001.field2515, this.field4001.field2514, this.field4001.field2516, false);
            return;
        }
        boolean var9 = true;
        if (this.field3987) {
            int var10 = arg0 - this.field4000;
            int var11 = arg1 - this.field3986;
            if (arg3 - this.field3984 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class188 var12 = class188.method1039(class184.field2254, client.field668.field1293);
            var12.field2315.method4977(this.field4001.method3579());
            client.field668.method2040(var12);
            this.field3984 = 0L;
        }
    }

    @ObfuscatedName("la.p(I)V")
    public void method5802() {
        if (Statics.field3087 != null) {
            this.field3968 = this.field3969;
            return;
        }
        if (this.field3968 < this.field3969) {
            this.field3968 = Math.min(this.field3969, this.field3968 / 30.0F + this.field3968);
        }
        if (this.field3968 > this.field3969) {
            this.field3968 = Math.max(this.field3969, this.field3968 - this.field3968 / 30.0F);
        }
    }

    @ObfuscatedName("la.q(I)V")
    public void method5744() {
        if (!this.method5757()) {
            return;
        }
        int var1 = this.field3966 - this.field3964;
        int var2 = this.field3967 - this.field3965;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5745(this.field3964 + var1, this.field3965 + var2, true);
        if (this.field3966 == this.field3964 && this.field3967 == this.field3965) {
            this.field3966 = -1;
            this.field3967 = -1;
        }
    }

    @ObfuscatedName("la.m(IIZI)V")
    public final void method5745(int arg0, int arg1, boolean arg2) {
        this.field3964 = arg0;
        this.field3965 = arg1;
        class297.method502();
        if (arg2) {
            this.method5746();
        }
    }

    @ObfuscatedName("la.y(I)V")
    public final void method5746() {
        this.field3983 = -1;
        this.field3958 = -1;
        this.field3992 = -1;
        this.field3980 = -1;
    }

    @ObfuscatedName("la.i(I)Z")
    public boolean method5757() {
        return this.field3966 != -1 && this.field3967 != -1;
    }

    @ObfuscatedName("la.c(IIII)Lac;")
    public class27 method5786(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3949.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method302(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("la.b(IIIZI)V")
    public void method5749(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5786(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3959;
        }
        boolean var6 = false;
        if (this.field3961 != var5 || arg3) {
            this.field3961 = var5;
            this.method5753(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5836(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("la.o(II)V")
    public void method5750(int arg0) {
        class27 var2 = this.method5767(arg0);
        if (var2 != null) {
            this.method5753(var2);
        }
    }

    @ObfuscatedName("la.a(I)I")
    public int method5751() {
        return this.field3960 == null ? -1 : this.field3960.method295();
    }

    @ObfuscatedName("la.e(I)Lac;")
    public class27 method5752() {
        return this.field3960;
    }

    @ObfuscatedName("la.x(Lac;I)V")
    public void method5753(class27 arg0) {
        if (this.field3960 == null || this.field3960 != arg0) {
            this.method5754(arg0);
            this.method5836(-1, -1, -1);
        }
    }

    @ObfuscatedName("la.h(Lac;I)V")
    public void method5754(class27 arg0) {
        this.field3960 = arg0;
        this.field3962 = new class37(this.field3957, this.field3956, this.field3950, this.field3951);
        this.field3993.method5729(this.field3960.method297());
    }

    @ObfuscatedName("la.s(Lac;Lhb;Lhb;ZI)V")
    public void method5926(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3960 == null || this.field3960 != arg0) {
            this.method5754(arg0);
        }
        if (!arg3 && this.field3960.method302(arg1.field2516, arg1.field2515, arg1.field2514)) {
            this.method5836(arg1.field2516, arg1.field2515, arg1.field2514);
        } else {
            this.method5836(arg2.field2516, arg2.field2515, arg2.field2514);
        }
    }

    @ObfuscatedName("la.f(IIII)V")
    public void method5836(int arg0, int arg1, int arg2) {
        if (this.field3960 == null) {
            return;
        }
        int[] var4 = this.field3960.method310(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3960.method310(this.field3960.method294(), this.field3960.method333(), this.field3960.method355());
        }
        this.method5745(var4[0] - this.field3960.method301() * 64, var4[1] - this.field3960.method303() * 64, true);
        this.field3966 = -1;
        this.field3967 = -1;
        this.field3968 = this.method5763(this.field3960.method300());
        this.field3969 = this.field3968;
        this.field3996 = null;
        this.field3981 = null;
        this.field3962.method542();
    }

    @ObfuscatedName("la.j(IIIIII)V")
    public void method5781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class321.method5440(var6);
        class321.method5502(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class321.method5497(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3993.method5731();
        if (var7 < 100) {
            this.method5762(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3962.method548()) {
            this.field3962.method541(this.field3978, this.field3960.method297(), client.field638);
            if (!this.field3962.method548()) {
                return;
            }
        }
        if (this.field3977 != null) {
            this.field3998++;
            if (this.field3998 % this.field4004 == 0) {
                this.field3998 = 0;
                this.field3982++;
            }
            if (this.field3982 >= this.field3974 && !this.field3976) {
                this.field3977 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3968));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3968));
        this.field3962.method543(this.field3964 - var8 / 2, this.field3965 - var9 / 2, var8 / 2 + this.field3964, var9 / 2 + this.field3965, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3975) {
            boolean var10 = false;
            if (arg4 - this.field3991 > 100) {
                this.field3991 = arg4;
                var10 = true;
            }
            this.field3962.method547(this.field3964 - var8 / 2, this.field3965 - var9 / 2, var8 / 2 + this.field3964, var9 / 2 + this.field3965, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3994, this.field3977, this.field3998, this.field4004, var10);
        }
        this.method5759(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field806 >= 2;
        if (var11 && this.field3985 && this.field4001 != null) {
            this.field3955.method4852("Coord: " + this.field4001, class321.field3849 + 10, class321.field3848 + 20, 16776960, -1);
        }
        this.field3997 = var8;
        this.field3971 = var9;
        this.field3972 = arg0;
        this.field3973 = arg1;
        class321.method5457(var6);
    }

    @ObfuscatedName("la.d(IIIIIII)Z")
    public boolean method5813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3995 == null) {
            return true;
        } else if (this.field3995.field3870 != arg0 || this.field3995.field3871 != arg1) {
            return true;
        } else if (this.field3962.field306 != this.field4002) {
            return true;
        } else if (client.field906 != this.field4005) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("la.l(IIIIIIB)V")
    public void method5759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3087 == null) {
            return;
        }
        int var7 = 512 / (this.field3962.field306 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5772() - arg4 / 2 - var7;
        int var14 = this.method5773() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3962.field306 * (var7 + var13 - this.field4003);
        int var16 = arg1 - this.field3962.field306 * (var7 - (var14 - this.field3963));
        if (this.method5813(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3995 != null && this.field3995.field3870 == var11 && this.field3995.field3871 == var12) {
                Arrays.fill(this.field3995.field3875, 0);
            } else {
                this.field3995 = new class325(var11, var12);
            }
            this.field4003 = this.method5772() - arg4 / 2 - var7;
            this.field3963 = this.method5773() - arg5 / 2 - var7;
            this.field4002 = this.field3962.field306;
            Statics.field3087.method3903(this.field4003, this.field3963, this.field3995, (float) this.field4002 / var10);
            this.field4005 = client.field906;
            var15 = arg0 - this.field3962.field306 * (var7 + var13 - this.field4003);
            var16 = arg1 - this.field3962.field306 * (var7 - (var14 - this.field3963));
        }
        class321.method5445(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3995.method5563(var15, var16, 192);
        } else {
            this.field3995.method5566(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("la.k(IIIII)V")
    public void method5760(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3993.method5730()) {
            return;
        }
        if (!this.field3962.method548()) {
            this.field3962.method541(this.field3978, this.field3960.method297(), client.field638);
            if (!this.field3962.method548()) {
                return;
            }
        }
        this.field3962.method545(arg0, arg1, arg2, arg3, this.field3977, this.field3998, this.field4004);
    }

    @ObfuscatedName("la.ac(II)V")
    public void method5761(int arg0) {
        this.field3969 = this.method5763(arg0);
    }

    @ObfuscatedName("la.aa(IIIIII)V")
    public void method5762(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class321.method5497(arg0, arg1, arg2, arg3, -16777216);
        class321.method5450(var7 - 152, var8, 304, 34, -65536);
        class321.method5497(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3955.method4855(class225.field2811, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("la.ap(II)F")
    public float method5763(int arg0) {
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

    @ObfuscatedName("la.ar(B)I")
    public int method5764() {
        if ((double) this.field3969 == 1.0D) {
            return 25;
        } else if ((double) this.field3969 == 1.5D) {
            return 37;
        } else if ((double) this.field3969 == 2.0D) {
            return 50;
        } else if ((double) this.field3969 == 3.0D) {
            return 75;
        } else if ((double) this.field3969 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("la.ab(I)V")
    public void method5765() {
        this.field3993.method5728();
    }

    @ObfuscatedName("la.ax(I)Z")
    public boolean method5766() {
        return this.field3993.method5730();
    }

    @ObfuscatedName("la.as(II)Lac;")
    public class27 method5767(int arg0) {
        Iterator var2 = this.field3949.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method295() != arg0);
        return var3;
    }

    @ObfuscatedName("la.ao(III)V")
    public void method5868(int arg0, int arg1) {
        if (this.field3960 != null && this.field3960.method291(arg0, arg1)) {
            this.field3966 = arg0 - this.field3960.method301() * 64;
            this.field3967 = arg1 - this.field3960.method303() * 64;
        }
    }

    @ObfuscatedName("la.al(IIB)V")
    public void method5743(int arg0, int arg1) {
        if (this.field3960 != null) {
            this.method5745(arg0 - this.field3960.method301() * 64, arg1 - this.field3960.method303() * 64, true);
            this.field3966 = -1;
            this.field3967 = -1;
        }
    }

    @ObfuscatedName("la.ad(IIII)V")
    public void method5770(int arg0, int arg1, int arg2) {
        if (this.field3960 != null) {
            int[] var4 = this.field3960.method310(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5868(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("la.an(IIIB)V")
    public void method5771(int arg0, int arg1, int arg2) {
        if (this.field3960 != null) {
            int[] var4 = this.field3960.method310(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5743(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("la.ai(I)I")
    public int method5772() {
        return this.field3960 == null ? -1 : this.field3964 + this.field3960.method301() * 64;
    }

    @ObfuscatedName("la.ak(B)I")
    public int method5773() {
        return this.field3960 == null ? -1 : this.field3965 + this.field3960.method303() * 64;
    }

    @ObfuscatedName("la.aq(I)Lhb;")
    public class214 method5774() {
        return this.field3960 == null ? null : this.field3960.method293(this.method5772(), this.method5773());
    }

    @ObfuscatedName("la.am(B)I")
    public int method5877() {
        return this.field3997;
    }

    @ObfuscatedName("la.ae(I)I")
    public int method5835() {
        return this.field3971;
    }

    @ObfuscatedName("la.av(II)V")
    public void method5777(int arg0) {
        if (arg0 >= 1) {
            this.field3974 = arg0;
        }
    }

    @ObfuscatedName("la.ah(I)V")
    public void method5778() {
        this.field3974 = 3;
    }

    @ObfuscatedName("la.ag(II)V")
    public void method5789(int arg0) {
        if (arg0 >= 1) {
            this.field4004 = arg0;
        }
    }

    @ObfuscatedName("la.aj(I)V")
    public void method5780() {
        this.field4004 = 50;
    }

    @ObfuscatedName("la.ay(ZI)V")
    public void method5915(boolean arg0) {
        this.field3976 = arg0;
    }

    @ObfuscatedName("la.au(IB)V")
    public void method5776(int arg0) {
        this.field3977 = new HashSet();
        this.field3977.add(arg0);
        this.field3982 = 0;
        this.field3998 = 0;
    }

    @ObfuscatedName("la.af(IB)V")
    public void method5783(int arg0) {
        this.field3977 = new HashSet();
        this.field3982 = 0;
        this.field3998 = 0;
        for (int var2 = 0; var2 < Statics.field3202; var2++) {
            if (class242.method2284(var2) != null && class242.method2284(var2).field3194 == arg0) {
                this.field3977.add(class242.method2284(var2).field3207);
            }
        }
    }

    @ObfuscatedName("la.at(B)V")
    public void method5784() {
        this.field3977 = null;
    }

    @ObfuscatedName("la.bx(ZI)V")
    public void method5785(boolean arg0) {
        this.field3975 = !arg0;
    }

    @ObfuscatedName("la.bh(IZS)V")
    public void method5878(int arg0, boolean arg1) {
        if (arg1) {
            this.field3989.remove(arg0);
        } else {
            this.field3989.add(arg0);
        }
        this.method5747();
    }

    @ObfuscatedName("la.bd(IZI)V")
    public void method5864(int arg0, boolean arg1) {
        if (arg1) {
            this.field3990.remove(arg0);
        } else {
            this.field3990.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3202; var3++) {
            if (class242.method2284(var3) != null && class242.method2284(var3).field3194 == arg0) {
                int var4 = class242.method2284(var3).field3207;
                if (arg1) {
                    this.field3979.remove(var4);
                } else {
                    this.field3979.add(var4);
                }
            }
        }
        this.method5747();
    }

    @ObfuscatedName("la.bm(B)Z")
    public boolean method5818() {
        return !this.field3975;
    }

    @ObfuscatedName("la.bv(IS)Z")
    public boolean method5775(int arg0) {
        return !this.field3989.contains(arg0);
    }

    @ObfuscatedName("la.bj(IB)Z")
    public boolean method5790(int arg0) {
        return !this.field3990.contains(arg0);
    }

    @ObfuscatedName("la.bs(I)V")
    public void method5747() {
        this.field3994.clear();
        this.field3994.addAll(this.field3989);
        this.field3994.addAll(this.field3979);
    }

    @ObfuscatedName("la.bz(IIIIIIB)V")
    public void method5912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3993.method5730()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3968));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3968));
        List var9 = this.field3962.method559(this.field3964 - var7 / 2 - 1, this.field3965 - var8 / 2 - 1, var7 / 2 + this.field3964 + 1, var8 / 2 + this.field3965 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class242 var12 = class242.method2284(var11.method196());
            var13 = false;
            for (int var14 = this.field3948.length - 1; var14 >= 0; var14--) {
                if (var12.field3198[var14] != null) {
                    client.method602(var12.field3198[var14], var12.field3200, this.field3948[var14], var11.method196(), var11.field283.method3579(), var11.field282.method3579());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("la.bc(ILhb;I)Lhb;")
    public class214 method5793(int arg0, class214 arg1) {
        if (!this.field3993.method5730()) {
            return null;
        } else if (!this.field3962.method548()) {
            return null;
        } else if (this.field3960.method291(arg1.field2515, arg1.field2514)) {
            HashMap var3 = this.field3962.method549();
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
                        return var5.field282;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field282.field2515 - arg1.field2515;
                    int var10 = var8.field282.field2514 - arg1.field2514;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field282;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("la.bk(IILhb;Lhb;I)V")
    public void method5794(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1043(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1044(10);
                break;
            case 1009:
                var5.method1044(11);
                break;
            case 1010:
                var5.method1044(12);
                break;
            case 1011:
                var5.method1044(13);
                break;
            case 1012:
                var5.method1044(14);
        }
        class77.method4064(var5);
    }

    @ObfuscatedName("la.ba(I)Las;")
    public class35 method5795() {
        if (!this.field3993.method5730()) {
            return null;
        } else if (this.field3962.method548()) {
            HashMap var1 = this.field3962.method549();
            this.field3996 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3996.addAll(var3);
            }
            this.field3981 = this.field3996.iterator();
            return this.method5796();
        } else {
            return null;
        }
    }

    @ObfuscatedName("la.bn(I)Las;")
    public class35 method5796() {
        if (this.field3981 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3981.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3981.next();
        } while (var1.method196() == -1);
        return var1;
    }
}
