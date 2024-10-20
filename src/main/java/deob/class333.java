package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lv")
public class class333 {

    @ObfuscatedName("lv.t")
    public class234 field3975;

    @ObfuscatedName("lv.q")
    public class234 field3983;

    @ObfuscatedName("lv.x")
    public class234 field3954;

    @ObfuscatedName("lv.d")
    public static final class292 field3952 = class292.field3641;

    @ObfuscatedName("lv.f")
    public static final class292 field3956 = class292.field3639;

    @ObfuscatedName("lv.c")
    public static final class292 field3968 = class292.field3640;

    @ObfuscatedName("lv.r")
    public class295 field3966;

    @ObfuscatedName("lv.y")
    public HashMap field3959;

    @ObfuscatedName("lv.p")
    public class324[] field3960;

    @ObfuscatedName("lv.b")
    public HashMap field3961;

    @ObfuscatedName("lv.g")
    public class27 field3962;

    @ObfuscatedName("lv.e")
    public class27 field3963;

    @ObfuscatedName("lv.z")
    public class27 field3949;

    @ObfuscatedName("lv.a")
    public class37 field3965;

    @ObfuscatedName("lv.w")
    public class332 field3984;

    @ObfuscatedName("lv.l")
    public int field3967;

    @ObfuscatedName("lv.h")
    public int field3973;

    @ObfuscatedName("lv.v")
    public int field3969 = -1;

    @ObfuscatedName("lv.m")
    public int field3970 = -1;

    @ObfuscatedName("lv.o")
    public float field4004;

    @ObfuscatedName("lv.av")
    public float field3972;

    @ObfuscatedName("lv.am")
    public int field4006 = -1;

    @ObfuscatedName("lv.ai")
    public int field3974 = -1;

    @ObfuscatedName("lv.af")
    public int field3992 = -1;

    @ObfuscatedName("lv.az")
    public int field3997 = -1;

    @ObfuscatedName("lv.aj")
    public int field3977 = 3;

    @ObfuscatedName("lv.an")
    public int field3978 = 50;

    @ObfuscatedName("lv.at")
    public boolean field3979 = false;

    @ObfuscatedName("lv.as")
    public HashSet field3980 = null;

    @ObfuscatedName("lv.ak")
    public int field4000 = -1;

    @ObfuscatedName("lv.ao")
    public int field3982 = -1;

    @ObfuscatedName("lv.ac")
    public int field3948 = -1;

    @ObfuscatedName("lv.ar")
    public int field3971 = -1;

    @ObfuscatedName("lv.au")
    public int field3985 = -1;

    @ObfuscatedName("lv.ax")
    public int field3986 = -1;

    @ObfuscatedName("lv.ag")
    public long field3987;

    @ObfuscatedName("lv.aa")
    public int field3988;

    @ObfuscatedName("lv.ap")
    public int field3989;

    @ObfuscatedName("lv.aq")
    public boolean field3990 = true;

    @ObfuscatedName("lv.al")
    public HashSet field3991 = new HashSet();

    @ObfuscatedName("lv.ah")
    public HashSet field3958 = new HashSet();

    @ObfuscatedName("lv.ab")
    public HashSet field3993 = new HashSet();

    @ObfuscatedName("lv.aw")
    public HashSet field3994 = new HashSet();

    @ObfuscatedName("lv.ae")
    public boolean field3995 = false;

    @ObfuscatedName("lv.bk")
    public int field3996 = 0;

    @ObfuscatedName("lv.bo")
    public final int[] field3964 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lv.bn")
    public List field3981;

    @ObfuscatedName("lv.bp")
    public Iterator field3999;

    @ObfuscatedName("lv.bz")
    public HashSet field4002 = new HashSet();

    @ObfuscatedName("lv.bh")
    public class214 field4001 = null;

    @ObfuscatedName("lv.bv")
    public boolean field3957 = false;

    @ObfuscatedName("lv.bj")
    public class325 field4003;

    @ObfuscatedName("lv.bq")
    public int field3976;

    @ObfuscatedName("lv.by")
    public int field4005 = -1;

    @ObfuscatedName("lv.bs")
    public int field3998 = -1;

    @ObfuscatedName("lv.bi")
    public int field4007 = -1;

    @ObfuscatedName("lv.s(Lhz;Lhz;Lhz;Lkb;Ljava/util/HashMap;[Llq;I)V")
    public void method5771(class234 arg0, class234 arg1, class234 arg2, class295 arg3, HashMap arg4, class324[] arg5) {
        this.field3960 = arg5;
        this.field3975 = arg0;
        this.field3983 = arg1;
        this.field3954 = arg2;
        this.field3966 = arg3;
        this.field3959 = new HashMap();
        this.field3959.put(class18.field110, arg4.get(field3952));
        this.field3959.put(class18.field107, arg4.get(field3956));
        this.field3959.put(class18.field108, arg4.get(field3968));
        this.field3984 = new class332(arg0);
        int var7 = this.field3975.method3775(class36.field296.field295);
        int[] var8 = this.field3975.method3770(var7);
        this.field3961 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class300 var10 = new class300(this.field3975.method3790(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method271(var10, var8[var9]);
            this.field3961.put(var11.method279(), var11);
            if (var11.method278()) {
                this.field3962 = var11;
            }
        }
        this.method5786(this.field3962);
        this.field3949 = null;
    }

    @ObfuscatedName("lv.j(I)V")
    public void method5776() {
        class30.field238.method3088(5);
    }

    @ObfuscatedName("lv.i(IIZIIIIB)V")
    public void method5972(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3984.method5767()) {
            return;
        }
        this.method5795();
        this.method5777();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4004));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4004));
        List var10 = this.field3965.method543(this.field3967 - var8 / 2 - 1, this.field3973 - var9 / 2 - 1, var8 / 2 + this.field3967 + 1, var9 / 2 + this.field3973 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method169(), var13.field285, var13.field289);
            var14.method1007(new Object[] { var15, arg0, arg1 });
            if (this.field4002.contains(var13)) {
                var14.method1006(17);
            } else {
                var14.method1006(15);
            }
            class77.method1875(var14);
        }
        Iterator var16 = this.field4002.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method169(), var17.field285, var17.field289);
                var18.method1007(new Object[] { var19, arg0, arg1 });
                var18.method1006(16);
                class77.method1875(var18);
            }
        }
        this.field4002 = var11;
    }

    @ObfuscatedName("lv.k(IIZZI)V")
    public void method5774(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class297.method4369();
        this.method5775(arg0, arg1, arg3, var5);
        if (!this.method5780() && arg3 || arg2) {
            if (arg3) {
                this.field3985 = arg0;
                this.field3986 = arg1;
                this.field3948 = this.field3967;
                this.field3971 = this.field3973;
            }
            if (this.field3948 != -1) {
                int var7 = arg0 - this.field3985;
                int var8 = arg1 - this.field3986;
                this.method5778(this.field3948 - (int) ((float) var7 / this.field3972), this.field3971 + (int) ((float) var8 / this.field3972), false);
            }
        } else {
            this.method5919();
        }
        if (arg3) {
            this.field3987 = var5;
            this.field3988 = arg0;
            this.field3989 = arg1;
        }
    }

    @ObfuscatedName("lv.u(IIZJ)V")
    public void method5775(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3963 == null) {
            this.field4001 = null;
            return;
        }
        int var6 = (int) ((float) this.field3967 + ((float) (arg0 - this.field3992) - (float) this.method5887() * this.field4004 / 2.0F) / this.field4004);
        int var7 = (int) ((float) this.field3973 - ((float) (arg1 - this.field3997) - (float) this.method5809() * this.field4004 / 2.0F) / this.field4004);
        this.field4001 = this.field3963.method275(var6 + this.field3963.method283() * 64, var7 + this.field3963.method290() * 64);
        if (this.field4001 == null || !arg2) {
            return;
        }
        boolean var8 = client.field793 >= 2;
        if (var8 && class46.field374[82] && class46.field374[81]) {
            client.method3027(this.field4001.field2513, this.field4001.field2511, this.field4001.field2515, false);
            return;
        }
        boolean var9 = true;
        if (this.field3990) {
            int var10 = arg0 - this.field3988;
            int var11 = arg1 - this.field3989;
            if (arg3 - this.field3987 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class188 var12 = class188.method1879(class184.field2231, client.field828.field1300);
            var12.field2321.method5096(this.field4001.method3630());
            client.field828.method2049(var12);
            this.field3987 = 0L;
        }
    }

    @ObfuscatedName("lv.n(B)V")
    public void method5795() {
        if (Statics.field1922 != null) {
            this.field4004 = this.field3972;
            return;
        }
        if (this.field4004 < this.field3972) {
            this.field4004 = Math.min(this.field3972, this.field4004 / 30.0F + this.field4004);
        }
        if (this.field4004 > this.field3972) {
            this.field4004 = Math.max(this.field3972, this.field4004 - this.field4004 / 30.0F);
        }
    }

    @ObfuscatedName("lv.t(I)V")
    public void method5777() {
        if (!this.method5780()) {
            return;
        }
        int var1 = this.field3969 - this.field3967;
        int var2 = this.field3970 - this.field3973;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5778(this.field3967 + var1, this.field3973 + var2, true);
        if (this.field3969 == this.field3967 && this.field3973 == this.field3970) {
            this.field3969 = -1;
            this.field3970 = -1;
        }
    }

    @ObfuscatedName("lv.q(IIZI)V")
    public final void method5778(int arg0, int arg1, boolean arg2) {
        this.field3967 = arg0;
        this.field3973 = arg1;
        class297.method4369();
        if (arg2) {
            this.method5919();
        }
    }

    @ObfuscatedName("lv.x(I)V")
    public final void method5919() {
        this.field3986 = -1;
        this.field3985 = -1;
        this.field3971 = -1;
        this.field3948 = -1;
    }

    @ObfuscatedName("lv.d(B)Z")
    public boolean method5780() {
        return this.field3969 != -1 && this.field3970 != -1;
    }

    @ObfuscatedName("lv.f(IIIB)Lav;")
    public class27 method5781(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3961.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method272(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lv.c(IIIZI)V")
    public void method5782(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5781(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3962;
        }
        boolean var6 = false;
        if (this.field3949 != var5 || arg3) {
            this.field3949 = var5;
            this.method5786(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5789(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lv.r(II)V")
    public void method5783(int arg0) {
        class27 var2 = this.method5800(arg0);
        if (var2 != null) {
            this.method5786(var2);
        }
    }

    @ObfuscatedName("lv.y(B)I")
    public int method5902() {
        return this.field3963 == null ? -1 : this.field3963.method338();
    }

    @ObfuscatedName("lv.p(I)Lav;")
    public class27 method5803() {
        return this.field3963;
    }

    @ObfuscatedName("lv.g(Lav;I)V")
    public void method5786(class27 arg0) {
        if (this.field3963 == null || this.field3963 != arg0) {
            this.method5787(arg0);
            this.method5789(-1, -1, -1);
        }
    }

    @ObfuscatedName("lv.e(Lav;B)V")
    public void method5787(class27 arg0) {
        this.field3963 = arg0;
        this.field3965 = new class37(this.field3960, this.field3959, this.field3983, this.field3954);
        this.field3984.method5758(this.field3963.method279());
    }

    @ObfuscatedName("lv.z(Lav;Lhd;Lhd;ZB)V")
    public void method5788(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3963 == null || this.field3963 != arg0) {
            this.method5787(arg0);
        }
        if (!arg3 && this.field3963.method272(arg1.field2515, arg1.field2513, arg1.field2511)) {
            this.method5789(arg1.field2515, arg1.field2513, arg1.field2511);
        } else {
            this.method5789(arg2.field2515, arg2.field2513, arg2.field2511);
        }
    }

    @ObfuscatedName("lv.w(IIII)V")
    public void method5789(int arg0, int arg1, int arg2) {
        if (this.field3963 == null) {
            return;
        }
        int[] var4 = this.field3963.method274(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3963.method274(this.field3963.method288(), this.field3963.method287(), this.field3963.method289());
        }
        this.method5778(var4[0] - this.field3963.method283() * 64, var4[1] - this.field3963.method290() * 64, true);
        this.field3969 = -1;
        this.field3970 = -1;
        this.field4004 = this.method5796(this.field3963.method282());
        this.field3972 = this.field4004;
        this.field3981 = null;
        this.field3999 = null;
        this.field3965.method510();
    }

    @ObfuscatedName("lv.l(IIIIII)V")
    public void method5790(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class321.method5481(var6);
        class321.method5483(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class321.method5485(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3984.method5760();
        if (var7 < 100) {
            this.method5870(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3965.method516()) {
            this.field3965.method535(this.field3975, this.field3963.method279(), client.field637);
            if (!this.field3965.method516()) {
                return;
            }
        }
        if (this.field3980 != null) {
            this.field3982++;
            if (this.field3982 % this.field3978 == 0) {
                this.field3982 = 0;
                this.field4000++;
            }
            if (this.field4000 >= this.field3977 && !this.field3979) {
                this.field3980 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4004));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4004));
        this.field3965.method511(this.field3967 - var8 / 2, this.field3973 - var9 / 2, var8 / 2 + this.field3967, var9 / 2 + this.field3973, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3995) {
            boolean var10 = false;
            if (arg4 - this.field3996 > 100) {
                this.field3996 = arg4;
                var10 = true;
            }
            this.field3965.method526(this.field3967 - var8 / 2, this.field3973 - var9 / 2, var8 / 2 + this.field3967, var9 / 2 + this.field3973, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3994, this.field3980, this.field3982, this.field3978, var10);
        }
        this.method5792(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field793 >= 2;
        if (var11 && this.field3957 && this.field4001 != null) {
            this.field3966.method4982("Coord: " + this.field4001, class321.field3853 + 10, class321.field3851 + 20, 16776960, -1);
        }
        this.field4006 = var8;
        this.field3974 = var9;
        this.field3992 = arg0;
        this.field3997 = arg1;
        class321.method5511(var6);
    }

    @ObfuscatedName("lv.h(IIIIIII)Z")
    public boolean method5885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4003 == null) {
            return true;
        } else if (this.field4003.field3878 != arg0 || this.field4003.field3875 != arg1) {
            return true;
        } else if (this.field3965.field313 != this.field3976) {
            return true;
        } else if (client.field893 != this.field4007) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lv.v(IIIIIIS)V")
    public void method5792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1922 == null) {
            return;
        }
        int var7 = 512 / (this.field3965.field313 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5828() - arg4 / 2 - var7;
        int var14 = this.method5806() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3965.field313 * (var7 + var13 - this.field4005);
        int var16 = arg1 - this.field3965.field313 * (var7 - (var14 - this.field3998));
        if (this.method5885(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4003 != null && this.field4003.field3878 == var11 && this.field4003.field3875 == var12) {
                Arrays.fill(this.field4003.field3874, 0);
            } else {
                this.field4003 = new class325(var11, var12);
            }
            this.field4005 = this.method5828() - arg4 / 2 - var7;
            this.field3998 = this.method5806() - arg5 / 2 - var7;
            this.field3976 = this.field3965.field313;
            Statics.field1922.method3933(this.field4005, this.field3998, this.field4003, (float) this.field3976 / var10);
            this.field4007 = client.field893;
            var15 = arg0 - this.field3965.field313 * (var7 + var13 - this.field4005);
            var16 = arg1 - this.field3965.field313 * (var7 - (var14 - this.field3998));
        }
        class321.method5494(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4003.method5607(var15, var16, 192);
        } else {
            this.field4003.method5610(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lv.m(IIIIB)V")
    public void method5891(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3984.method5767()) {
            return;
        }
        if (!this.field3965.method516()) {
            this.field3965.method535(this.field3975, this.field3963.method279(), client.field637);
            if (!this.field3965.method516()) {
                return;
            }
        }
        this.field3965.method513(arg0, arg1, arg2, arg3, this.field3980, this.field3982, this.field3978);
    }

    @ObfuscatedName("lv.o(II)V")
    public void method5794(int arg0) {
        this.field3972 = this.method5796(arg0);
    }

    @ObfuscatedName("lv.av(IIIIIS)V")
    public void method5870(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class321.method5485(arg0, arg1, arg2, arg3, -16777216);
        class321.method5489(var7 - 152, var8, 304, 34, -65536);
        class321.method5485(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3966.method4965(class225.field3039, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lv.am(IB)F")
    public float method5796(int arg0) {
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

    @ObfuscatedName("lv.ai(I)I")
    public int method5797() {
        if ((double) this.field3972 == 1.0D) {
            return 25;
        } else if ((double) this.field3972 == 1.5D) {
            return 37;
        } else if ((double) this.field3972 == 2.0D) {
            return 50;
        } else if ((double) this.field3972 == 3.0D) {
            return 75;
        } else if ((double) this.field3972 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lv.af(I)V")
    public void method5926() {
        this.field3984.method5759();
    }

    @ObfuscatedName("lv.az(B)Z")
    public boolean method5799() {
        return this.field3984.method5767();
    }

    @ObfuscatedName("lv.aj(IB)Lav;")
    public class27 method5800(int arg0) {
        Iterator var2 = this.field3961.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method338() != arg0);
        return var3;
    }

    @ObfuscatedName("lv.an(III)V")
    public void method5851(int arg0, int arg1) {
        if (this.field3963 != null && this.field3963.method273(arg0, arg1)) {
            this.field3969 = arg0 - this.field3963.method283() * 64;
            this.field3970 = arg1 - this.field3963.method290() * 64;
        }
    }

    @ObfuscatedName("lv.at(IIB)V")
    public void method5955(int arg0, int arg1) {
        if (this.field3963 != null) {
            this.method5778(arg0 - this.field3963.method283() * 64, arg1 - this.field3963.method290() * 64, true);
            this.field3969 = -1;
            this.field3970 = -1;
        }
    }

    @ObfuscatedName("lv.as(IIIB)V")
    public void method5853(int arg0, int arg1, int arg2) {
        if (this.field3963 != null) {
            int[] var4 = this.field3963.method274(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5851(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lv.ak(IIII)V")
    public void method5822(int arg0, int arg1, int arg2) {
        if (this.field3963 != null) {
            int[] var4 = this.field3963.method274(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5955(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lv.ao(I)I")
    public int method5828() {
        return this.field3963 == null ? -1 : this.field3967 + this.field3963.method283() * 64;
    }

    @ObfuscatedName("lv.ac(B)I")
    public int method5806() {
        return this.field3963 == null ? -1 : this.field3973 + this.field3963.method290() * 64;
    }

    @ObfuscatedName("lv.ar(B)Lhd;")
    public class214 method5804() {
        return this.field3963 == null ? null : this.field3963.method275(this.method5828(), this.method5806());
    }

    @ObfuscatedName("lv.au(I)I")
    public int method5887() {
        return this.field4006;
    }

    @ObfuscatedName("lv.ax(I)I")
    public int method5809() {
        return this.field3974;
    }

    @ObfuscatedName("lv.ag(IB)V")
    public void method5810(int arg0) {
        if (arg0 >= 1) {
            this.field3977 = arg0;
        }
    }

    @ObfuscatedName("lv.aa(I)V")
    public void method5848() {
        this.field3977 = 3;
    }

    @ObfuscatedName("lv.ap(II)V")
    public void method5812(int arg0) {
        if (arg0 >= 1) {
            this.field3978 = arg0;
        }
    }

    @ObfuscatedName("lv.aq(I)V")
    public void method5813() {
        this.field3978 = 50;
    }

    @ObfuscatedName("lv.ay(ZB)V")
    public void method5814(boolean arg0) {
        this.field3979 = arg0;
    }

    @ObfuscatedName("lv.ad(IB)V")
    public void method5815(int arg0) {
        this.field3980 = new HashSet();
        this.field3980.add(arg0);
        this.field4000 = 0;
        this.field3982 = 0;
    }

    @ObfuscatedName("lv.al(II)V")
    public void method5816(int arg0) {
        this.field3980 = new HashSet();
        this.field4000 = 0;
        this.field3982 = 0;
        for (int var2 = 0; var2 < Statics.field3195; var2++) {
            if (class242.method156(var2) != null && class242.method156(var2).field3214 == arg0) {
                this.field3980.add(class242.method156(var2).field3204);
            }
        }
    }

    @ObfuscatedName("lv.ah(I)V")
    public void method5817() {
        this.field3980 = null;
    }

    @ObfuscatedName("lv.ab(ZS)V")
    public void method5818(boolean arg0) {
        this.field3995 = !arg0;
    }

    @ObfuscatedName("lv.aw(IZS)V")
    public void method5855(int arg0, boolean arg1) {
        if (arg1) {
            this.field3991.remove(arg0);
        } else {
            this.field3991.add(arg0);
        }
        this.method5824();
    }

    @ObfuscatedName("lv.ae(IZB)V")
    public void method5820(int arg0, boolean arg1) {
        if (arg1) {
            this.field3958.remove(arg0);
        } else {
            this.field3958.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3195; var3++) {
            if (class242.method156(var3) != null && class242.method156(var3).field3214 == arg0) {
                int var4 = class242.method156(var3).field3204;
                if (arg1) {
                    this.field3993.remove(var4);
                } else {
                    this.field3993.add(var4);
                }
            }
        }
        this.method5824();
    }

    @ObfuscatedName("lv.bk(I)Z")
    public boolean method5844() {
        return !this.field3995;
    }

    @ObfuscatedName("lv.bw(II)Z")
    public boolean method5843(int arg0) {
        return !this.field3991.contains(arg0);
    }

    @ObfuscatedName("lv.bo(II)Z")
    public boolean method5823(int arg0) {
        return !this.field3958.contains(arg0);
    }

    @ObfuscatedName("lv.bn(I)V")
    public void method5824() {
        this.field3994.clear();
        this.field3994.addAll(this.field3991);
        this.field3994.addAll(this.field3993);
    }

    @ObfuscatedName("lv.bp(IIIIIII)V")
    public void method5825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3984.method5767()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4004));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4004));
        List var9 = this.field3965.method543(this.field3967 - var7 / 2 - 1, this.field3973 - var8 / 2 - 1, var7 / 2 + this.field3967 + 1, var8 / 2 + this.field3973 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class242 var12 = class242.method156(var11.method169());
            var13 = false;
            for (int var14 = this.field3964.length - 1; var14 >= 0; var14--) {
                if (var12.field3211[var14] != null) {
                    client.method152(var12.field3211[var14], var12.field3203, this.field3964[var14], var11.method169(), var11.field285.method3630(), var11.field289.method3630());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lv.bz(ILhd;I)Lhd;")
    public class214 method5826(int arg0, class214 arg1) {
        if (!this.field3984.method5767()) {
            return null;
        } else if (!this.field3965.method516()) {
            return null;
        } else if (this.field3963.method273(arg1.field2513, arg1.field2511)) {
            HashMap var3 = this.field3965.method517();
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
                        return var5.field289;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field289.field2513 - arg1.field2513;
                    int var10 = var8.field289.field2511 - arg1.field2511;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field289;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lv.bh(IILhd;Lhd;B)V")
    public void method5830(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1007(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1006(10);
                break;
            case 1009:
                var5.method1006(11);
                break;
            case 1010:
                var5.method1006(12);
                break;
            case 1011:
                var5.method1006(13);
                break;
            case 1012:
                var5.method1006(14);
        }
        class77.method1875(var5);
    }

    @ObfuscatedName("lv.bv(I)Las;")
    public class35 method5911() {
        if (!this.field3984.method5767()) {
            return null;
        } else if (this.field3965.method516()) {
            HashMap var1 = this.field3965.method517();
            this.field3981 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3981.addAll(var3);
            }
            this.field3999 = this.field3981.iterator();
            return this.method5829();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lv.bj(I)Las;")
    public class35 method5829() {
        if (this.field3999 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3999.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3999.next();
        } while (var1.method169() == -1);
        return var1;
    }
}
