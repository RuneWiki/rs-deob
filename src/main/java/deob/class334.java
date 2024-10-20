package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ly")
public class class334 {

    @ObfuscatedName("ly.d")
    public class235 field3981;

    @ObfuscatedName("ly.l")
    public class235 field3948;

    @ObfuscatedName("ly.j")
    public class235 field3945;

    @ObfuscatedName("ly.m")
    public static final class293 field3977 = class293.field3653;

    @ObfuscatedName("ly.p")
    public static final class293 field3953 = class293.field3654;

    @ObfuscatedName("ly.h")
    public static final class293 field3954 = class293.field3663;

    @ObfuscatedName("ly.v")
    public class296 field3955;

    @ObfuscatedName("ly.n")
    public HashMap field3956;

    @ObfuscatedName("ly.x")
    public class325[] field3957;

    @ObfuscatedName("ly.w")
    public HashMap field3958;

    @ObfuscatedName("ly.k")
    public class27 field3959;

    @ObfuscatedName("ly.q")
    public class27 field3986;

    @ObfuscatedName("ly.z")
    public class27 field3961;

    @ObfuscatedName("ly.y")
    public class37 field3962;

    @ObfuscatedName("ly.f")
    public class333 field3963;

    @ObfuscatedName("ly.b")
    public int field3964;

    @ObfuscatedName("ly.r")
    public int field3950;

    @ObfuscatedName("ly.s")
    public int field3966 = -1;

    @ObfuscatedName("ly.a")
    public int field3967 = -1;

    @ObfuscatedName("ly.u")
    public float field3951;

    @ObfuscatedName("ly.ae")
    public float field3969;

    @ObfuscatedName("ly.af")
    public int field3949 = -1;

    @ObfuscatedName("ly.az")
    public int field3989 = -1;

    @ObfuscatedName("ly.ax")
    public int field3971 = -1;

    @ObfuscatedName("ly.aj")
    public int field3973 = -1;

    @ObfuscatedName("ly.au")
    public int field3974 = 3;

    @ObfuscatedName("ly.ay")
    public int field3975 = 50;

    @ObfuscatedName("ly.aa")
    public boolean field3976 = false;

    @ObfuscatedName("ly.aq")
    public HashSet field4002 = null;

    @ObfuscatedName("ly.as")
    public int field3999 = -1;

    @ObfuscatedName("ly.ak")
    public int field3979 = -1;

    @ObfuscatedName("ly.ac")
    public int field3980 = -1;

    @ObfuscatedName("ly.aw")
    public int field3983 = -1;

    @ObfuscatedName("ly.ar")
    public int field3978 = -1;

    @ObfuscatedName("ly.av")
    public int field3952 = -1;

    @ObfuscatedName("ly.al")
    public long field3968;

    @ObfuscatedName("ly.ad")
    public int field3985;

    @ObfuscatedName("ly.am")
    public int field3970;

    @ObfuscatedName("ly.ao")
    public boolean field3987 = true;

    @ObfuscatedName("ly.ag")
    public HashSet field3984 = new HashSet();

    @ObfuscatedName("ly.ai")
    public HashSet field3990 = new HashSet();

    @ObfuscatedName("ly.ab")
    public HashSet field3991 = new HashSet();

    @ObfuscatedName("ly.ap")
    public HashSet field3992 = new HashSet();

    @ObfuscatedName("ly.ah")
    public boolean field3993 = false;

    @ObfuscatedName("ly.bq")
    public int field3982 = 0;

    @ObfuscatedName("ly.bc")
    public final int[] field3995 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ly.bk")
    public List field3996;

    @ObfuscatedName("ly.bb")
    public Iterator field3997;

    @ObfuscatedName("ly.bi")
    public HashSet field3998 = new HashSet();

    @ObfuscatedName("ly.bp")
    public class214 field3994 = null;

    @ObfuscatedName("ly.bl")
    public boolean field4000 = false;

    @ObfuscatedName("ly.by")
    public class326 field4001;

    @ObfuscatedName("ly.be")
    public int field4005;

    @ObfuscatedName("ly.bw")
    public int field4003 = -1;

    @ObfuscatedName("ly.bt")
    public int field4004 = -1;

    @ObfuscatedName("ly.bn")
    public int field3960 = -1;

    @ObfuscatedName("ly.c(Lii;Lii;Lii;Lko;Ljava/util/HashMap;[Lli;B)V")
    public void method5964(class235 arg0, class235 arg1, class235 arg2, class296 arg3, HashMap arg4, class325[] arg5) {
        this.field3957 = arg5;
        this.field3981 = arg0;
        this.field3948 = arg1;
        this.field3945 = arg2;
        this.field3955 = arg3;
        this.field3956 = new HashMap();
        this.field3956.put(class18.field131, arg4.get(field3977));
        this.field3956.put(class18.field138, arg4.get(field3953));
        this.field3956.put(class18.field130, arg4.get(field3954));
        this.field3963 = new class333(arg0);
        int var7 = this.field3981.method3854(class36.field314.field309);
        int[] var8 = this.field3981.method3847(var7);
        this.field3958 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class301 var10 = new class301(this.field3981.method3845(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method288(var10, var8[var9]);
            this.field3958.put(var11.method312(), var11);
            if (var11.method296()) {
                this.field3959 = var11;
            }
        }
        this.method5874(this.field3959);
        this.field3961 = null;
    }

    @ObfuscatedName("ly.t(I)V")
    public void method5998() {
        class30.field261.method3125(5);
    }

    @ObfuscatedName("ly.o(IIZIIIIB)V")
    public void method5861(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3963.method5857()) {
            return;
        }
        this.method5967();
        this.method5865();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3951));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3951));
        List var10 = this.field3962.method545(this.field3964 - var8 / 2 - 1, this.field3950 - var9 / 2 - 1, var8 / 2 + this.field3964 + 1, var9 / 2 + this.field3950 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method180(), var13.field300, var13.field306);
            var14.method1047(new Object[] { var15, arg0, arg1 });
            if (this.field3998.contains(var13)) {
                var14.method1048(17);
            } else {
                var14.method1048(15);
            }
            class77.method46(var14);
        }
        Iterator var16 = this.field3998.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method180(), var17.field300, var17.field306);
                var18.method1047(new Object[] { var19, arg0, arg1 });
                var18.method1048(16);
                class77.method46(var18);
            }
        }
        this.field3998 = var11;
    }

    @ObfuscatedName("ly.e(IIZZB)V")
    public void method5862(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = Statics.method184();
        this.method5953(arg0, arg1, arg3, var5);
        if (!this.method6069() && arg3 || arg2) {
            if (arg3) {
                this.field3978 = arg0;
                this.field3952 = arg1;
                this.field3980 = this.field3964;
                this.field3983 = this.field3950;
            }
            if (this.field3980 != -1) {
                int var7 = arg0 - this.field3978;
                int var8 = arg1 - this.field3952;
                this.method5934(this.field3980 - (int) ((float) var7 / this.field3969), this.field3983 + (int) ((float) var8 / this.field3969), false);
            }
        } else {
            this.method5867();
        }
        if (arg3) {
            this.field3968 = var5;
            this.field3985 = arg0;
            this.field3970 = arg1;
        }
    }

    @ObfuscatedName("ly.i(IIZJ)V")
    public void method5953(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3986 == null) {
            this.field3994 = null;
            return;
        }
        int var6 = (int) ((float) this.field3964 + ((float) (arg0 - this.field3971) - (float) this.method5896() * this.field3951 / 2.0F) / this.field3951);
        int var7 = (int) ((float) this.field3950 - ((float) (arg1 - this.field3973) - (float) this.method5897() * this.field3951 / 2.0F) / this.field3951);
        this.field3994 = this.field3986.method358(var6 + this.field3986.method301() * 64, var7 + this.field3986.method303() * 64);
        if (this.field3994 == null || !arg2) {
            return;
        }
        if (client.method4433() && class46.field399[82] && class46.field399[81]) {
            client.method501(this.field3994.field2539, this.field3994.field2537, this.field3994.field2538, false);
            return;
        }
        boolean var8 = true;
        if (this.field3987) {
            int var9 = arg0 - this.field3985;
            int var10 = arg1 - this.field3970;
            if (arg3 - this.field3968 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class188 var11 = class188.method2887(class184.field2279, client.field693.field1298);
            var11.field2335.method5306(this.field3994.method3676());
            client.field693.method2109(var11);
            this.field3968 = 0L;
        }
    }

    @ObfuscatedName("ly.g(I)V")
    public void method5967() {
        if (Statics.field2717 != null) {
            this.field3951 = this.field3969;
            return;
        }
        if (this.field3951 < this.field3969) {
            this.field3951 = Math.min(this.field3969, this.field3951 / 30.0F + this.field3951);
        }
        if (this.field3951 > this.field3969) {
            this.field3951 = Math.max(this.field3969, this.field3951 - this.field3951 / 30.0F);
        }
    }

    @ObfuscatedName("ly.d(B)V")
    public void method5865() {
        if (!this.method6069()) {
            return;
        }
        int var1 = this.field3966 - this.field3964;
        int var2 = this.field3967 - this.field3950;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5934(this.field3964 + var1, this.field3950 + var2, true);
        if (this.field3966 == this.field3964 && this.field3967 == this.field3950) {
            this.field3966 = -1;
            this.field3967 = -1;
        }
    }

    @ObfuscatedName("ly.l(IIZI)V")
    public final void method5934(int arg0, int arg1, boolean arg2) {
        this.field3964 = arg0;
        this.field3950 = arg1;
        Statics.method184();
        if (arg2) {
            this.method5867();
        }
    }

    @ObfuscatedName("ly.j(I)V")
    public final void method5867() {
        this.field3952 = -1;
        this.field3978 = -1;
        this.field3983 = -1;
        this.field3980 = -1;
    }

    @ObfuscatedName("ly.m(I)Z")
    public boolean method6069() {
        return this.field3966 != -1 && this.field3967 != -1;
    }

    @ObfuscatedName("ly.p(IIII)Lae;")
    public class27 method5968(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3958.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method290(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ly.h(IIIZI)V")
    public void method5870(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5968(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3959;
        }
        boolean var6 = false;
        if (this.field3961 != var5 || arg3) {
            this.field3961 = var5;
            this.method5874(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5906(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ly.v(II)V")
    public void method5871(int arg0) {
        class27 var2 = this.method5888(arg0);
        if (var2 != null) {
            this.method5874(var2);
        }
    }

    @ObfuscatedName("ly.n(B)I")
    public int method5882() {
        return this.field3986 == null ? -1 : this.field3986.method338();
    }

    @ObfuscatedName("ly.x(I)Lae;")
    public class27 method5873() {
        return this.field3986;
    }

    @ObfuscatedName("ly.w(Lae;I)V")
    public void method5874(class27 arg0) {
        if (this.field3986 == null || this.field3986 != arg0) {
            this.method5875(arg0);
            this.method5906(-1, -1, -1);
        }
    }

    @ObfuscatedName("ly.q(Lae;I)V")
    public void method5875(class27 arg0) {
        this.field3986 = arg0;
        this.field3962 = new class37(this.field3957, this.field3956, this.field3948, this.field3945);
        this.field3963.method5844(this.field3986.method312());
    }

    @ObfuscatedName("ly.z(Lae;Lhj;Lhj;ZS)V")
    public void method5876(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3986 == null || this.field3986 != arg0) {
            this.method5875(arg0);
        }
        if (!arg3 && this.field3986.method290(arg1.field2538, arg1.field2539, arg1.field2537)) {
            this.method5906(arg1.field2538, arg1.field2539, arg1.field2537);
        } else {
            this.method5906(arg2.field2538, arg2.field2539, arg2.field2537);
        }
    }

    @ObfuscatedName("ly.y(IIIB)V")
    public void method5906(int arg0, int arg1, int arg2) {
        if (this.field3986 == null) {
            return;
        }
        int[] var4 = this.field3986.method292(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3986.method292(this.field3986.method323(), this.field3986.method305(), this.field3986.method334());
        }
        this.method5934(var4[0] - this.field3986.method301() * 64, var4[1] - this.field3986.method303() * 64, true);
        this.field3966 = -1;
        this.field3967 = -1;
        this.field3951 = this.method6000(this.field3986.method300());
        this.field3969 = this.field3951;
        this.field3996 = null;
        this.field3997 = null;
        this.field3962.method541();
    }

    @ObfuscatedName("ly.f(IIIIII)V")
    public void method5878(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class322.method5646(var6);
        class322.method5582(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class322.method5590(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3963.method5847();
        if (var7 < 100) {
            this.method5883(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3962.method547()) {
            this.field3962.method562(this.field3981, this.field3986.method312(), client.field695);
            if (!this.field3962.method547()) {
                return;
            }
        }
        if (this.field4002 != null) {
            this.field3979++;
            if (this.field3979 % this.field3975 == 0) {
                this.field3979 = 0;
                this.field3999++;
            }
            if (this.field3999 >= this.field3974 && !this.field3976) {
                this.field4002 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3951));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3951));
        this.field3962.method542(this.field3964 - var8 / 2, this.field3950 - var9 / 2, var8 / 2 + this.field3964, var9 / 2 + this.field3950, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3993) {
            boolean var10 = false;
            if (arg4 - this.field3982 > 100) {
                this.field3982 = arg4;
                var10 = true;
            }
            this.field3962.method546(this.field3964 - var8 / 2, this.field3950 - var9 / 2, var8 / 2 + this.field3964, var9 / 2 + this.field3950, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3992, this.field4002, this.field3979, this.field3975, var10);
        }
        this.method5880(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method4433() && this.field4000 && this.field3994 != null) {
            this.field3955.method5026("Coord: " + this.field3994, class322.field3844 + 10, class322.field3847 + 20, 16776960, -1);
        }
        this.field3949 = var8;
        this.field3989 = var9;
        this.field3971 = arg0;
        this.field3973 = arg1;
        class322.method5585(var6);
    }

    @ObfuscatedName("ly.a(IIIIIII)Z")
    public boolean method5879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4001 == null) {
            return true;
        } else if (this.field4001.field3870 != arg0 || this.field4001.field3872 != arg1) {
            return true;
        } else if (this.field3962.field334 != this.field4005) {
            return true;
        } else if (client.field889 != this.field3960) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ly.u(IIIIIII)V")
    public void method5880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field2717 == null) {
            return;
        }
        int var7 = 512 / (this.field3962.field334 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5893() - arg4 / 2 - var7;
        int var14 = this.method5894() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3962.field334 * (var7 + var13 - this.field4003);
        int var16 = arg1 - this.field3962.field334 * (var7 - (var14 - this.field4004));
        if (this.method5879(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4001 != null && this.field4001.field3870 == var11 && this.field4001.field3872 == var12) {
                Arrays.fill(this.field4001.field3875, 0);
            } else {
                this.field4001 = new class326(var11, var12);
            }
            this.field4003 = this.method5893() - arg4 / 2 - var7;
            this.field4004 = this.method5894() - arg5 / 2 - var7;
            this.field4005 = this.field3962.field334;
            Statics.field2717.method4008(this.field4003, this.field4004, this.field4001, (float) this.field4005 / var10);
            this.field3960 = client.field889;
            var15 = arg0 - this.field3962.field334 * (var7 + var13 - this.field4003);
            var16 = arg1 - this.field3962.field334 * (var7 - (var14 - this.field4004));
        }
        class322.method5589(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4001.method5704(var15, var16, 192);
        } else {
            this.field4001.method5783(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ly.ae(IIIII)V")
    public void method5941(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3963.method5857()) {
            return;
        }
        if (!this.field3962.method547()) {
            this.field3962.method562(this.field3981, this.field3986.method312(), client.field695);
            if (!this.field3962.method547()) {
                return;
            }
        }
        this.field3962.method544(arg0, arg1, arg2, arg3, this.field4002, this.field3979, this.field3975);
    }

    @ObfuscatedName("ly.af(IB)V")
    public void method5914(int arg0) {
        this.field3969 = this.method6000(arg0);
    }

    @ObfuscatedName("ly.az(IIIIII)V")
    public void method5883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class322.method5590(arg0, arg1, arg2, arg3, -16777216);
        class322.method5626(var7 - 152, var8, 304, 34, -65536);
        class322.method5590(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3955.method5006(class225.field3068, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ly.ax(IB)F")
    public float method6000(int arg0) {
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

    @ObfuscatedName("ly.aj(I)I")
    public int method5858() {
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

    @ObfuscatedName("ly.au(B)V")
    public void method6041() {
        this.field3963.method5845();
    }

    @ObfuscatedName("ly.ay(B)Z")
    public boolean method5981() {
        return this.field3963.method5857();
    }

    @ObfuscatedName("ly.aa(II)Lae;")
    public class27 method5888(int arg0) {
        Iterator var2 = this.field3958.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method338() != arg0);
        return var3;
    }

    @ObfuscatedName("ly.aq(III)V")
    public void method5889(int arg0, int arg1) {
        if (this.field3986 != null && this.field3986.method289(arg0, arg1)) {
            this.field3966 = arg0 - this.field3986.method301() * 64;
            this.field3967 = arg1 - this.field3986.method303() * 64;
        }
    }

    @ObfuscatedName("ly.as(III)V")
    public void method5890(int arg0, int arg1) {
        if (this.field3986 != null) {
            this.method5934(arg0 - this.field3986.method301() * 64, arg1 - this.field3986.method303() * 64, true);
            this.field3966 = -1;
            this.field3967 = -1;
        }
    }

    @ObfuscatedName("ly.ak(IIII)V")
    public void method5891(int arg0, int arg1, int arg2) {
        if (this.field3986 != null) {
            int[] var4 = this.field3986.method292(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5889(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ly.ac(IIIB)V")
    public void method5892(int arg0, int arg1, int arg2) {
        if (this.field3986 != null) {
            int[] var4 = this.field3986.method292(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5890(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ly.aw(I)I")
    public int method5893() {
        return this.field3986 == null ? -1 : this.field3964 + this.field3986.method301() * 64;
    }

    @ObfuscatedName("ly.ar(I)I")
    public int method5894() {
        return this.field3986 == null ? -1 : this.field3950 + this.field3986.method303() * 64;
    }

    @ObfuscatedName("ly.av(I)Lhj;")
    public class214 method5895() {
        return this.field3986 == null ? null : this.field3986.method358(this.method5893(), this.method5894());
    }

    @ObfuscatedName("ly.al(I)I")
    public int method5896() {
        return this.field3949;
    }

    @ObfuscatedName("ly.ad(B)I")
    public int method5897() {
        return this.field3989;
    }

    @ObfuscatedName("ly.am(IB)V")
    public void method5898(int arg0) {
        if (arg0 >= 1) {
            this.field3974 = arg0;
        }
    }

    @ObfuscatedName("ly.ao(I)V")
    public void method5899() {
        this.field3974 = 3;
    }

    @ObfuscatedName("ly.at(IB)V")
    public void method5900(int arg0) {
        if (arg0 >= 1) {
            this.field3975 = arg0;
        }
    }

    @ObfuscatedName("ly.an(I)V")
    public void method5901() {
        this.field3975 = 50;
    }

    @ObfuscatedName("ly.ag(ZB)V")
    public void method5902(boolean arg0) {
        this.field3976 = arg0;
    }

    @ObfuscatedName("ly.ai(II)V")
    public void method5903(int arg0) {
        this.field4002 = new HashSet();
        this.field4002.add(arg0);
        this.field3999 = 0;
        this.field3979 = 0;
    }

    @ObfuscatedName("ly.ab(II)V")
    public void method5884(int arg0) {
        this.field4002 = new HashSet();
        this.field3999 = 0;
        this.field3979 = 0;
        for (int var2 = 0; var2 < Statics.field2720; var2++) {
            if (class243.method3377(var2) != null && class243.method3377(var2).field3215 == arg0) {
                this.field4002.add(class243.method3377(var2).field3214);
            }
        }
    }

    @ObfuscatedName("ly.ap(I)V")
    public void method5881() {
        this.field4002 = null;
    }

    @ObfuscatedName("ly.ah(ZB)V")
    public void method5936(boolean arg0) {
        this.field3993 = !arg0;
    }

    @ObfuscatedName("ly.bq(IZI)V")
    public void method5907(int arg0, boolean arg1) {
        if (arg1) {
            this.field3984.remove(arg0);
        } else {
            this.field3984.add(arg0);
        }
        this.method5912();
    }

    @ObfuscatedName("ly.bf(IZI)V")
    public void method5885(int arg0, boolean arg1) {
        if (arg1) {
            this.field3990.remove(arg0);
        } else {
            this.field3990.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field2720; var3++) {
            if (class243.method3377(var3) != null && class243.method3377(var3).field3215 == arg0) {
                int var4 = class243.method3377(var3).field3214;
                if (arg1) {
                    this.field3991.remove(var4);
                } else {
                    this.field3991.add(var4);
                }
            }
        }
        this.method5912();
    }

    @ObfuscatedName("ly.bc(B)Z")
    public boolean method5866() {
        return !this.field3993;
    }

    @ObfuscatedName("ly.bk(II)Z")
    public boolean method5872(int arg0) {
        return !this.field3984.contains(arg0);
    }

    @ObfuscatedName("ly.bb(IB)Z")
    public boolean method5911(int arg0) {
        return !this.field3990.contains(arg0);
    }

    @ObfuscatedName("ly.bi(B)V")
    public void method5912() {
        this.field3992.clear();
        this.field3992.addAll(this.field3984);
        this.field3992.addAll(this.field3991);
    }

    @ObfuscatedName("ly.bp(IIIIIII)V")
    public void method5913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3963.method5857()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3951));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3951));
        List var9 = this.field3962.method545(this.field3964 - var7 / 2 - 1, this.field3950 - var8 / 2 - 1, var7 / 2 + this.field3964 + 1, var8 / 2 + this.field3950 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class243 var12 = class243.method3377(var11.method180());
            var13 = false;
            for (int var14 = this.field3995.length - 1; var14 >= 0; var14--) {
                if (var12.field3219[var14] != null) {
                    client.method1888(var12.field3219[var14], var12.field3220, this.field3995[var14], var11.method180(), var11.field300.method3676(), var11.field306.method3676());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ly.bl(ILhj;B)Lhj;")
    public class214 method5910(int arg0, class214 arg1) {
        if (!this.field3963.method5857()) {
            return null;
        } else if (!this.field3962.method547()) {
            return null;
        } else if (this.field3986.method289(arg1.field2539, arg1.field2537)) {
            HashMap var3 = this.field3962.method548();
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
                        return var5.field306;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field306.field2539 - arg1.field2539;
                    int var10 = var8.field306.field2537 - arg1.field2537;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field306;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ly.by(IILhj;Lhj;B)V")
    public void method5915(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1047(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1048(10);
                break;
            case 1009:
                var5.method1048(11);
                break;
            case 1010:
                var5.method1048(12);
                break;
            case 1011:
                var5.method1048(13);
                break;
            case 1012:
                var5.method1048(14);
        }
        class77.method46(var5);
    }

    @ObfuscatedName("ly.be(I)Laq;")
    public class35 method5916() {
        if (!this.field3963.method5857()) {
            return null;
        } else if (this.field3962.method547()) {
            HashMap var1 = this.field3962.method548();
            this.field3996 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3996.addAll(var3);
            }
            this.field3997 = this.field3996.iterator();
            return this.method5864();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ly.bw(I)Laq;")
    public class35 method5864() {
        if (this.field3997 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3997.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3997.next();
        } while (var1.method180() == -1);
        return var1;
    }
}
