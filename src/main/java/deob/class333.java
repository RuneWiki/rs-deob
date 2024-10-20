package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ln")
public class class333 {

    @ObfuscatedName("ln.j")
    public class234 field3979;

    @ObfuscatedName("ln.v")
    public class234 field3952;

    @ObfuscatedName("ln.d")
    public class234 field3953;

    @ObfuscatedName("ln.z")
    public static final class292 field3954 = class292.field3638;

    @ObfuscatedName("ln.n")
    public static final class292 field3955 = class292.field3637;

    @ObfuscatedName("ln.h")
    public static final class292 field3956 = class292.field3633;

    @ObfuscatedName("ln.f")
    public class295 field3957;

    @ObfuscatedName("ln.s")
    public HashMap field3958;

    @ObfuscatedName("ln.p")
    public class324[] field3959;

    @ObfuscatedName("ln.e")
    public HashMap field3991;

    @ObfuscatedName("ln.i")
    public class27 field4003;

    @ObfuscatedName("ln.q")
    public class27 field3962;

    @ObfuscatedName("ln.y")
    public class27 field3963;

    @ObfuscatedName("ln.r")
    public class37 field3969;

    @ObfuscatedName("ln.k")
    public class332 field3965;

    @ObfuscatedName("ln.w")
    public int field3972;

    @ObfuscatedName("ln.m")
    public int field3951;

    @ObfuscatedName("ln.o")
    public int field3968 = -1;

    @ObfuscatedName("ln.a")
    public int field4000 = -1;

    @ObfuscatedName("ln.b")
    public float field3970;

    @ObfuscatedName("ln.ag")
    public float field3971;

    @ObfuscatedName("ln.at")
    public int field3947 = -1;

    @ObfuscatedName("ln.ao")
    public int field3973 = -1;

    @ObfuscatedName("ln.av")
    public int field3966 = -1;

    @ObfuscatedName("ln.an")
    public int field3975 = -1;

    @ObfuscatedName("ln.al")
    public int field3976 = 3;

    @ObfuscatedName("ln.as")
    public int field3977 = 50;

    @ObfuscatedName("ln.ad")
    public boolean field3978 = false;

    @ObfuscatedName("ln.ap")
    public HashSet field4001 = null;

    @ObfuscatedName("ln.ax")
    public int field3980 = -1;

    @ObfuscatedName("ln.aj")
    public int field3981 = -1;

    @ObfuscatedName("ln.ab")
    public int field3982 = -1;

    @ObfuscatedName("ln.af")
    public int field3983 = -1;

    @ObfuscatedName("ln.ak")
    public int field3984 = -1;

    @ObfuscatedName("ln.ay")
    public int field3988 = -1;

    @ObfuscatedName("ln.ae")
    public long field3986;

    @ObfuscatedName("ln.ah")
    public int field3987;

    @ObfuscatedName("ln.aa")
    public int field3949;

    @ObfuscatedName("ln.aq")
    public boolean field3989 = true;

    @ObfuscatedName("ln.az")
    public HashSet field3990 = new HashSet();

    @ObfuscatedName("ln.ai")
    public HashSet field3996 = new HashSet();

    @ObfuscatedName("ln.am")
    public HashSet field3992 = new HashSet();

    @ObfuscatedName("ln.aw")
    public HashSet field3993 = new HashSet();

    @ObfuscatedName("ln.au")
    public boolean field3994 = false;

    @ObfuscatedName("ln.bg")
    public int field3995 = 0;

    @ObfuscatedName("ln.bk")
    public final int[] field3998 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ln.bp")
    public List field3997;

    @ObfuscatedName("ln.bu")
    public Iterator field3985;

    @ObfuscatedName("ln.bi")
    public HashSet field3999 = new HashSet();

    @ObfuscatedName("ln.bv")
    public class214 field3961 = null;

    @ObfuscatedName("ln.bf")
    public boolean field3946 = false;

    @ObfuscatedName("ln.bm")
    public class325 field4002;

    @ObfuscatedName("ln.bw")
    public int field3950;

    @ObfuscatedName("ln.bs")
    public int field4004 = -1;

    @ObfuscatedName("ln.bt")
    public int field4005 = -1;

    @ObfuscatedName("ln.bj")
    public int field4006 = -1;

    @ObfuscatedName("ln.c(Lhz;Lhz;Lhz;Lkf;Ljava/util/HashMap;[Llt;B)V")
    public void method5843(class234 arg0, class234 arg1, class234 arg2, class295 arg3, HashMap arg4, class324[] arg5) {
        this.field3959 = arg5;
        this.field3979 = arg0;
        this.field3952 = arg1;
        this.field3953 = arg2;
        this.field3957 = arg3;
        this.field3958 = new HashMap();
        this.field3958.put(class18.field111, arg4.get(field3954));
        this.field3958.put(class18.field112, arg4.get(field3955));
        this.field3958.put(class18.field113, arg4.get(field3956));
        this.field3965 = new class332(arg0);
        int var7 = this.field3979.method3843(class36.field295.field300);
        int[] var8 = this.field3979.method3836(var7);
        this.field3991 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class300 var10 = new class300(this.field3979.method3825(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method283(var10, var8[var9]);
            this.field3991.put(var11.method258(), var11);
            if (var11.method257()) {
                this.field4003 = var11;
            }
        }
        this.method6018(this.field4003);
        this.field3963 = null;
    }

    @ObfuscatedName("ln.x(I)V")
    public void method5870() {
        class30.method3181();
    }

    @ObfuscatedName("ln.t(IIZIIIIB)V")
    public void method5845(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3965.method5825()) {
            return;
        }
        this.method6038();
        this.method5849();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3970));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3970));
        List var10 = this.field3969.method512(this.field3972 - var8 / 2 - 1, this.field3951 - var9 / 2 - 1, var8 / 2 + this.field3972 + 1, var9 / 2 + this.field3951 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method166(), var13.field289, var13.field290);
            var14.method1008(new Object[] { var15, arg0, arg1 });
            if (this.field3999.contains(var13)) {
                var14.method1000(17);
            } else {
                var14.method1000(15);
            }
            class77.method1954(var14);
        }
        Iterator var16 = this.field3999.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method166(), var17.field289, var17.field290);
                var18.method1008(new Object[] { var19, arg0, arg1 });
                var18.method1000(16);
                class77.method1954(var18);
            }
        }
        this.field3999 = var11;
    }

    @ObfuscatedName("ln.g(IIZZB)V")
    public void method5863(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = Statics.method2303();
        this.method5895(arg0, arg1, arg3, var5);
        if (!this.method5852() && arg3 || arg2) {
            if (arg3) {
                this.field3984 = arg0;
                this.field3988 = arg1;
                this.field3982 = this.field3972;
                this.field3983 = this.field3951;
            }
            if (this.field3982 != -1) {
                int var7 = arg0 - this.field3984;
                int var8 = arg1 - this.field3988;
                this.method6041(this.field3982 - (int) ((float) var7 / this.field3971), this.field3983 + (int) ((float) var8 / this.field3971), false);
            }
        } else {
            this.method5851();
        }
        if (arg3) {
            this.field3986 = var5;
            this.field3987 = arg0;
            this.field3949 = arg1;
        }
    }

    @ObfuscatedName("ln.l(IIZJ)V")
    public void method5895(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3962 == null) {
            this.field3961 = null;
            return;
        }
        int var6 = (int) ((float) this.field3972 + ((float) (arg0 - this.field3966) - (float) this.method5905() * this.field3970 / 2.0F) / this.field3970);
        int var7 = (int) ((float) this.field3951 - ((float) (arg1 - this.field3975) - (float) this.method5881() * this.field3970 / 2.0F) / this.field3970);
        this.field3961 = this.field3962.method254(var6 + this.field3962.method262() * 64, var7 + this.field3962.method304() * 64);
        if (this.field3961 == null || !arg2) {
            return;
        }
        if (client.method966() && class46.field374[82] && class46.field374[81]) {
            int var8 = this.field3961.field2502;
            int var9 = this.field3961.field2503;
            int var10 = this.field3961.field2501;
            class188 var11 = class188.method1894(class184.field2188, client.field669.field1279);
            var11.field2313.method5138(var8);
            var11.field2313.method5145(var9);
            var11.field2313.method5129(var10);
            var11.field2313.method5149(0);
            client.field669.method2075(var11);
            return;
        }
        boolean var12 = true;
        if (this.field3989) {
            int var13 = arg0 - this.field3987;
            int var14 = arg1 - this.field3949;
            if (arg3 - this.field3986 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class188 var15 = class188.method1894(class184.field2224, client.field669.field1279);
            var15.field2313.method5150(this.field3961.method3669());
            client.field669.method2075(var15);
            this.field3986 = 0L;
        }
    }

    @ObfuscatedName("ln.u(I)V")
    public void method6038() {
        if (Statics.field1134 != null) {
            this.field3970 = this.field3971;
            return;
        }
        if (this.field3970 < this.field3971) {
            this.field3970 = Math.min(this.field3971, this.field3970 / 30.0F + this.field3970);
        }
        if (this.field3970 > this.field3971) {
            this.field3970 = Math.max(this.field3971, this.field3970 - this.field3970 / 30.0F);
        }
    }

    @ObfuscatedName("ln.j(I)V")
    public void method5849() {
        if (!this.method5852()) {
            return;
        }
        int var1 = this.field3968 - this.field3972;
        int var2 = this.field4000 - this.field3951;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6041(this.field3972 + var1, this.field3951 + var2, true);
        if (this.field3972 == this.field3968 && this.field4000 == this.field3951) {
            this.field3968 = -1;
            this.field4000 = -1;
        }
    }

    @ObfuscatedName("ln.v(IIZB)V")
    public final void method6041(int arg0, int arg1, boolean arg2) {
        this.field3972 = arg0;
        this.field3951 = arg1;
        Statics.method2303();
        if (arg2) {
            this.method5851();
        }
    }

    @ObfuscatedName("ln.d(I)V")
    public final void method5851() {
        this.field3988 = -1;
        this.field3984 = -1;
        this.field3983 = -1;
        this.field3982 = -1;
    }

    @ObfuscatedName("ln.z(I)Z")
    public boolean method5852() {
        return this.field3968 != -1 && this.field4000 != -1;
    }

    @ObfuscatedName("ln.s(IIIB)Lag;")
    public class27 method5853(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3991.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method251(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ln.p(IIIZI)V")
    public void method5854(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5853(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4003;
        }
        boolean var6 = false;
        if (this.field3963 != var5 || arg3) {
            this.field3963 = var5;
            this.method6018(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5861(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ln.e(II)V")
    public void method5855(int arg0) {
        class27 var2 = this.method5872(arg0);
        if (var2 != null) {
            this.method6018(var2);
        }
    }

    @ObfuscatedName("ln.i(I)I")
    public int method5874() {
        return this.field3962 == null ? -1 : this.field3962.method315();
    }

    @ObfuscatedName("ln.q(B)Lag;")
    public class27 method5857() {
        return this.field3962;
    }

    @ObfuscatedName("ln.r(Lag;B)V")
    public void method6018(class27 arg0) {
        if (this.field3962 == null || this.field3962 != arg0) {
            this.method5880(arg0);
            this.method5861(-1, -1, -1);
        }
    }

    @ObfuscatedName("ln.k(Lag;B)V")
    public void method5880(class27 arg0) {
        this.field3962 = arg0;
        this.field3969 = new class37(this.field3959, this.field3958, this.field3952, this.field3953);
        this.field3965.method5823(this.field3962.method258());
    }

    @ObfuscatedName("ln.w(Lag;Lhj;Lhj;ZB)V")
    public void method6010(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3962 == null || this.field3962 != arg0) {
            this.method5880(arg0);
        }
        if (!arg3 && this.field3962.method251(arg1.field2501, arg1.field2502, arg1.field2503)) {
            this.method5861(arg1.field2501, arg1.field2502, arg1.field2503);
        } else {
            this.method5861(arg2.field2501, arg2.field2502, arg2.field2503);
        }
    }

    @ObfuscatedName("ln.m(IIIB)V")
    public void method5861(int arg0, int arg1, int arg2) {
        if (this.field3962 == null) {
            return;
        }
        int[] var4 = this.field3962.method253(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3962.method253(this.field3962.method266(), this.field3962.method317(), this.field3962.method267());
        }
        this.method6041(var4[0] - this.field3962.method262() * 64, var4[1] - this.field3962.method304() * 64, true);
        this.field3968 = -1;
        this.field4000 = -1;
        this.field3970 = this.method5868(this.field3962.method261());
        this.field3971 = this.field3970;
        this.field3997 = null;
        this.field3985 = null;
        this.field3969.method508();
    }

    @ObfuscatedName("ln.o(IIIIIB)V")
    public void method5862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class321.method5560(var6);
        class321.method5558(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class321.method5565(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3965.method5834();
        if (var7 < 100) {
            this.method5864(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3969.method520()) {
            this.field3969.method515(this.field3979, this.field3962.method258(), client.field627);
            if (!this.field3969.method520()) {
                return;
            }
        }
        if (this.field4001 != null) {
            this.field3981++;
            if (this.field3981 % this.field3977 == 0) {
                this.field3981 = 0;
                this.field3980++;
            }
            if (this.field3980 >= this.field3976 && !this.field3978) {
                this.field4001 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3970));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3970));
        this.field3969.method539(this.field3972 - var8 / 2, this.field3951 - var9 / 2, var8 / 2 + this.field3972, var9 / 2 + this.field3951, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3994) {
            boolean var10 = false;
            if (arg4 - this.field3995 > 100) {
                this.field3995 = arg4;
                var10 = true;
            }
            this.field3969.method510(this.field3972 - var8 / 2, this.field3951 - var9 / 2, var8 / 2 + this.field3972, var9 / 2 + this.field3951, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3993, this.field4001, this.field3981, this.field3977, var10);
        }
        this.method5920(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method966() && this.field3946 && this.field3961 != null) {
            this.field3957.method4957("Coord: " + this.field3961, class321.field3846 + 10, class321.field3843 + 20, 16776960, -1);
        }
        this.field3947 = var8;
        this.field3973 = var9;
        this.field3966 = arg0;
        this.field3975 = arg1;
        class321.method5561(var6);
    }

    @ObfuscatedName("ln.a(IIIIIII)Z")
    public boolean method5998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4002 == null) {
            return true;
        } else if (this.field4002.field3867 != arg0 || this.field4002.field3868 != arg1) {
            return true;
        } else if (this.field3969.field307 != this.field3950) {
            return true;
        } else if (client.field893 != this.field4006) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ln.b(IIIIIIB)V")
    public void method5920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1134 == null) {
            return;
        }
        int var7 = 512 / (this.field3969.field307 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5877() - arg4 / 2 - var7;
        int var14 = this.method5878() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3969.field307 * (var7 + var13 - this.field4004);
        int var16 = arg1 - this.field3969.field307 * (var7 - (var14 - this.field4005));
        if (this.method5998(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4002 != null && this.field4002.field3867 == var11 && this.field4002.field3868 == var12) {
                Arrays.fill(this.field4002.field3873, 0);
            } else {
                this.field4002 = new class325(var11, var12);
            }
            this.field4004 = this.method5877() - arg4 / 2 - var7;
            this.field4005 = this.method5878() - arg5 / 2 - var7;
            this.field3950 = this.field3969.field307;
            Statics.field1134.method3971(this.field4004, this.field4005, this.field4002, (float) this.field3950 / var10);
            this.field4006 = client.field893;
            var15 = arg0 - this.field3969.field307 * (var7 + var13 - this.field4004);
            var16 = arg1 - this.field3969.field307 * (var7 - (var14 - this.field4005));
        }
        class321.method5564(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4002.method5679(var15, var16, 192);
        } else {
            this.field4002.method5682(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ln.ag(IIIII)V")
    public void method5842(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3965.method5825()) {
            return;
        }
        if (!this.field3969.method520()) {
            this.field3969.method515(this.field3979, this.field3962.method258(), client.field627);
            if (!this.field3969.method520()) {
                return;
            }
        }
        this.field3969.method544(arg0, arg1, arg2, arg3, this.field4001, this.field3981, this.field3977);
    }

    @ObfuscatedName("ln.at(IB)V")
    public void method5980(int arg0) {
        this.field3971 = this.method5868(arg0);
    }

    @ObfuscatedName("ln.ao(IIIIII)V")
    public void method5864(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class321.method5565(arg0, arg1, arg2, arg3, -16777216);
        class321.method5569(var7 - 152, var8, 304, 34, -65536);
        class321.method5565(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3957.method4960(class225.field3040, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ln.av(II)F")
    public float method5868(int arg0) {
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

    @ObfuscatedName("ln.an(B)I")
    public int method5869() {
        if ((double) this.field3971 == 1.0D) {
            return 25;
        } else if ((double) this.field3971 == 1.5D) {
            return 37;
        } else if ((double) this.field3971 == 2.0D) {
            return 50;
        } else if ((double) this.field3971 == 3.0D) {
            return 75;
        } else if ((double) this.field3971 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ln.al(I)V")
    public void method5919() {
        this.field3965.method5824();
    }

    @ObfuscatedName("ln.as(I)Z")
    public boolean method5847() {
        return this.field3965.method5825();
    }

    @ObfuscatedName("ln.ad(II)Lag;")
    public class27 method5872(int arg0) {
        Iterator var2 = this.field3991.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method315() != arg0);
        return var3;
    }

    @ObfuscatedName("ln.ap(III)V")
    public void method5873(int arg0, int arg1) {
        if (this.field3962 != null && this.field3962.method249(arg0, arg1)) {
            this.field3968 = arg0 - this.field3962.method262() * 64;
            this.field4000 = arg1 - this.field3962.method304() * 64;
        }
    }

    @ObfuscatedName("ln.ax(III)V")
    public void method5846(int arg0, int arg1) {
        if (this.field3962 != null) {
            this.method6041(arg0 - this.field3962.method262() * 64, arg1 - this.field3962.method304() * 64, true);
            this.field3968 = -1;
            this.field4000 = -1;
        }
    }

    @ObfuscatedName("ln.aj(IIII)V")
    public void method5875(int arg0, int arg1, int arg2) {
        if (this.field3962 != null) {
            int[] var4 = this.field3962.method253(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5873(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ln.ab(IIII)V")
    public void method5876(int arg0, int arg1, int arg2) {
        if (this.field3962 != null) {
            int[] var4 = this.field3962.method253(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5846(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ln.af(I)I")
    public int method5877() {
        return this.field3962 == null ? -1 : this.field3972 + this.field3962.method262() * 64;
    }

    @ObfuscatedName("ln.ak(S)I")
    public int method5878() {
        return this.field3962 == null ? -1 : this.field3951 + this.field3962.method304() * 64;
    }

    @ObfuscatedName("ln.ay(I)Lhj;")
    public class214 method5879() {
        return this.field3962 == null ? null : this.field3962.method254(this.method5877(), this.method5878());
    }

    @ObfuscatedName("ln.ae(S)I")
    public int method5905() {
        return this.field3947;
    }

    @ObfuscatedName("ln.ah(I)I")
    public int method5881() {
        return this.field3973;
    }

    @ObfuscatedName("ln.aa(II)V")
    public void method5882(int arg0) {
        if (arg0 >= 1) {
            this.field3976 = arg0;
        }
    }

    @ObfuscatedName("ln.aq(I)V")
    public void method5940() {
        this.field3976 = 3;
    }

    @ObfuscatedName("ln.ar(II)V")
    public void method5974(int arg0) {
        if (arg0 >= 1) {
            this.field3977 = arg0;
        }
    }

    @ObfuscatedName("ln.ac(I)V")
    public void method5889() {
        this.field3977 = 50;
    }

    @ObfuscatedName("ln.az(ZB)V")
    public void method5886(boolean arg0) {
        this.field3978 = arg0;
    }

    @ObfuscatedName("ln.ai(IB)V")
    public void method5887(int arg0) {
        this.field4001 = new HashSet();
        this.field4001.add(arg0);
        this.field3980 = 0;
        this.field3981 = 0;
    }

    @ObfuscatedName("ln.am(II)V")
    public void method5888(int arg0) {
        this.field4001 = new HashSet();
        this.field3980 = 0;
        this.field3981 = 0;
        for (int var2 = 0; var2 < Statics.field3186; var2++) {
            if (class242.method481(var2) != null && class242.method481(var2).field3188 == arg0) {
                this.field4001.add(class242.method481(var2).field3198);
            }
        }
    }

    @ObfuscatedName("ln.aw(I)V")
    public void method5931() {
        this.field4001 = null;
    }

    @ObfuscatedName("ln.au(ZI)V")
    public void method5890(boolean arg0) {
        this.field3994 = !arg0;
    }

    @ObfuscatedName("ln.bg(IZI)V")
    public void method5891(int arg0, boolean arg1) {
        if (arg1) {
            this.field3990.remove(arg0);
        } else {
            this.field3990.add(arg0);
        }
        this.method5896();
    }

    @ObfuscatedName("ln.bn(IZB)V")
    public void method5948(int arg0, boolean arg1) {
        if (arg1) {
            this.field3996.remove(arg0);
        } else {
            this.field3996.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3186; var3++) {
            if (class242.method481(var3) != null && class242.method481(var3).field3188 == arg0) {
                int var4 = class242.method481(var3).field3198;
                if (arg1) {
                    this.field3992.remove(var4);
                } else {
                    this.field3992.add(var4);
                }
            }
        }
        this.method5896();
    }

    @ObfuscatedName("ln.bk(B)Z")
    public boolean method5844() {
        return !this.field3994;
    }

    @ObfuscatedName("ln.bp(II)Z")
    public boolean method5894(int arg0) {
        return !this.field3990.contains(arg0);
    }

    @ObfuscatedName("ln.bu(II)Z")
    public boolean method5982(int arg0) {
        return !this.field3996.contains(arg0);
    }

    @ObfuscatedName("ln.bi(B)V")
    public void method5896() {
        this.field3993.clear();
        this.field3993.addAll(this.field3990);
        this.field3993.addAll(this.field3992);
    }

    @ObfuscatedName("ln.bv(IIIIIII)V")
    public void method5871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3965.method5825()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3970));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3970));
        List var9 = this.field3969.method512(this.field3972 - var7 / 2 - 1, this.field3951 - var8 / 2 - 1, var7 / 2 + this.field3972 + 1, var8 / 2 + this.field3951 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class242 var12 = class242.method481(var11.method166());
            var13 = false;
            for (int var14 = this.field3998.length - 1; var14 >= 0; var14--) {
                if (var12.field3197[var14] != null) {
                    client.method4934(var12.field3197[var14], var12.field3185, this.field3998[var14], var11.method166(), var11.field289.method3669(), var11.field290.method3669());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ln.bf(ILhj;B)Lhj;")
    public class214 method5898(int arg0, class214 arg1) {
        if (!this.field3965.method5825()) {
            return null;
        } else if (!this.field3969.method520()) {
            return null;
        } else if (this.field3962.method249(arg1.field2502, arg1.field2503)) {
            HashMap var3 = this.field3969.method514();
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
                        return var5.field290;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field290.field2502 - arg1.field2502;
                    int var10 = var8.field290.field2503 - arg1.field2503;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field290;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ln.bm(IILhj;Lhj;I)V")
    public void method5899(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1008(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1000(10);
                break;
            case 1009:
                var5.method1000(11);
                break;
            case 1010:
                var5.method1000(12);
                break;
            case 1011:
                var5.method1000(13);
                break;
            case 1012:
                var5.method1000(14);
        }
        class77.method1954(var5);
    }

    @ObfuscatedName("ln.bw(I)Lap;")
    public class35 method5900() {
        if (!this.field3965.method5825()) {
            return null;
        } else if (this.field3969.method520()) {
            HashMap var1 = this.field3969.method514();
            this.field3997 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3997.addAll(var3);
            }
            this.field3985 = this.field3997.iterator();
            return this.method5901();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ln.bs(I)Lap;")
    public class35 method5901() {
        if (this.field3985 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3985.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3985.next();
        } while (var1.method166() == -1);
        return var1;
    }
}
