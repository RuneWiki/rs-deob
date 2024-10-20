package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lz")
public class class334 {

    @ObfuscatedName("lz.g")
    public class245 field3985;

    @ObfuscatedName("lz.l")
    public class245 field3984;

    @ObfuscatedName("lz.e")
    public class245 field3962;

    @ObfuscatedName("lz.x")
    public static final class299 field3986 = class299.field3735;

    @ObfuscatedName("lz.d")
    public static final class299 field3990 = class299.field3739;

    @ObfuscatedName("lz.k")
    public static final class299 field3987 = class299.field3738;

    @ObfuscatedName("lz.n")
    public class302 field3966;

    @ObfuscatedName("lz.i")
    public HashMap field3964;

    @ObfuscatedName("lz.a")
    public class327[] field3968;

    @ObfuscatedName("lz.z")
    public HashMap field3969;

    @ObfuscatedName("lz.j")
    public class27 field3956;

    @ObfuscatedName("lz.s")
    public class27 field3971;

    @ObfuscatedName("lz.t")
    public class27 field3970;

    @ObfuscatedName("lz.y")
    public class37 field3973;

    @ObfuscatedName("lz.h")
    public class333 field3974;

    @ObfuscatedName("lz.b")
    public int field3988;

    @ObfuscatedName("lz.c")
    public int field3976;

    @ObfuscatedName("lz.r")
    public int field3977 = -1;

    @ObfuscatedName("lz.p")
    public int field3978 = -1;

    @ObfuscatedName("lz.v")
    public float field3979;

    @ObfuscatedName("lz.ag")
    public float field3980;

    @ObfuscatedName("lz.aq")
    public int field3963 = -1;

    @ObfuscatedName("lz.aj")
    public int field3982 = -1;

    @ObfuscatedName("lz.av")
    public int field3981 = -1;

    @ObfuscatedName("lz.ar")
    public int field3972 = -1;

    @ObfuscatedName("lz.ac")
    public int field3998 = 3;

    @ObfuscatedName("lz.ay")
    public int field4009 = 50;

    @ObfuscatedName("lz.ah")
    public boolean field3983 = false;

    @ObfuscatedName("lz.ak")
    public HashSet field3975 = null;

    @ObfuscatedName("lz.aw")
    public int field3989 = -1;

    @ObfuscatedName("lz.al")
    public int field4008 = -1;

    @ObfuscatedName("lz.ab")
    public int field3991 = -1;

    @ObfuscatedName("lz.ae")
    public int field3997 = -1;

    @ObfuscatedName("lz.at")
    public int field3993 = -1;

    @ObfuscatedName("lz.ad")
    public int field3994 = -1;

    @ObfuscatedName("lz.ap")
    public long field3967;

    @ObfuscatedName("lz.as")
    public int field3996;

    @ObfuscatedName("lz.am")
    public int field3965;

    @ObfuscatedName("lz.an")
    public boolean field4003 = true;

    @ObfuscatedName("lz.ao")
    public HashSet field3999 = new HashSet();

    @ObfuscatedName("lz.aa")
    public HashSet field4000 = new HashSet();

    @ObfuscatedName("lz.ax")
    public HashSet field4001 = new HashSet();

    @ObfuscatedName("lz.af")
    public HashSet field4002 = new HashSet();

    @ObfuscatedName("lz.ai")
    public boolean field3995 = false;

    @ObfuscatedName("lz.ba")
    public int field4004 = 0;

    @ObfuscatedName("lz.bs")
    public final int[] field4005 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lz.bq")
    public List field4006;

    @ObfuscatedName("lz.bn")
    public Iterator field4007;

    @ObfuscatedName("lz.bk")
    public HashSet field3960 = new HashSet();

    @ObfuscatedName("lz.bd")
    public class225 field3992 = null;

    @ObfuscatedName("lz.bc")
    public boolean field4010 = false;

    @ObfuscatedName("lz.bo")
    public class328 field4011;

    @ObfuscatedName("lz.bx")
    public int field4012;

    @ObfuscatedName("lz.by")
    public int field4013 = -1;

    @ObfuscatedName("lz.bu")
    public int field4014 = -1;

    @ObfuscatedName("lz.bm")
    public int field4015 = -1;

    @ObfuscatedName("lz.m(Lir;Lir;Lir;Lkk;Ljava/util/HashMap;[Llq;I)V")
    public void method5731(class245 arg0, class245 arg1, class245 arg2, class302 arg3, HashMap arg4, class327[] arg5) {
        this.field3968 = arg5;
        this.field3985 = arg0;
        this.field3984 = arg1;
        this.field3962 = arg2;
        this.field3966 = arg3;
        this.field3964 = new HashMap();
        this.field3964.put(class18.field100, arg4.get(field3986));
        this.field3964.put(class18.field105, arg4.get(field3990));
        this.field3964.put(class18.field94, arg4.get(field3987));
        this.field3974 = new class333(arg0);
        int var7 = this.field3985.method4174(class36.field290.field293);
        int[] var8 = this.field3985.method4167(var7);
        this.field3969 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class202 var10 = new class202(this.field3985.method4156(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method324(var10, var8[var9]);
            this.field3969.put(var11.method304(), var11);
            if (var11.method303()) {
                this.field3956 = var11;
            }
        }
        this.method5871(this.field3956);
        this.field3970 = null;
    }

    @ObfuscatedName("lz.f(I)V")
    public void method5732() {
        class30.field243.method3029(5);
    }

    @ObfuscatedName("lz.q(IIZIIIIB)V")
    public void method5733(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3974.method5718()) {
            return;
        }
        this.method5803();
        this.method5737();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3979));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3979));
        List var10 = this.field3973.method551(this.field3988 - var8 / 2 - 1, this.field3976 - var9 / 2 - 1, var8 / 2 + this.field3988 + 1, var9 / 2 + this.field3976 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method192(), var13.field283, var13.field287);
            var14.method1046(new Object[] { var15, arg0, arg1 });
            if (this.field3960.contains(var13)) {
                var14.method1039(17);
            } else {
                var14.method1039(15);
            }
            class77.method4251(var14);
        }
        Iterator var16 = this.field3960.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method192(), var17.field283, var17.field287);
                var18.method1046(new Object[] { var19, arg0, arg1 });
                var18.method1039(16);
                class77.method4251(var18);
            }
        }
        this.field3960 = var11;
    }

    @ObfuscatedName("lz.w(IIZZS)V")
    public void method5804(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class204.method3658();
        this.method5735(arg0, arg1, arg3, var5);
        if (!this.method5740() && arg3 || arg2) {
            if (arg3) {
                this.field3993 = arg0;
                this.field3994 = arg1;
                this.field3991 = this.field3988;
                this.field3997 = this.field3976;
            }
            if (this.field3991 != -1) {
                int var7 = arg0 - this.field3993;
                int var8 = arg1 - this.field3994;
                this.method5738(this.field3991 - (int) ((float) var7 / this.field3980), this.field3997 + (int) ((float) var8 / this.field3980), false);
            }
        } else {
            this.method5739();
        }
        if (arg3) {
            this.field3967 = var5;
            this.field3996 = arg0;
            this.field3965 = arg1;
        }
    }

    @ObfuscatedName("lz.o(IIZJ)V")
    public void method5735(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3971 == null) {
            this.field3992 = null;
            return;
        }
        int var6 = (int) ((float) this.field3988 + ((float) (arg0 - this.field3981) - (float) this.method5768() * this.field3979 / 2.0F) / this.field3979);
        int var7 = (int) ((float) this.field3976 - ((float) (arg1 - this.field3972) - (float) this.method5769() * this.field3979 / 2.0F) / this.field3979);
        this.field3992 = this.field3971.method300(var6 + this.field3971.method308() * 64, var7 + this.field3971.method310() * 64);
        if (this.field3992 == null || !arg2) {
            return;
        }
        if (client.method1703() && class45.field365[82] && class45.field365[81]) {
            int var8 = this.field3992.field2605;
            int var9 = this.field3992.field2606;
            int var10 = this.field3992.field2608;
            class192 var11 = class192.method1750(class189.field2264, client.field669.field1284);
            var11.field2356.method3508(0);
            var11.field2356.method3452(var9);
            var11.field2356.method3444(var10);
            var11.field2356.method3402(var8);
            client.field669.method2056(var11);
            return;
        }
        boolean var12 = true;
        if (this.field4003) {
            int var13 = arg0 - this.field3996;
            int var14 = arg1 - this.field3965;
            if (arg3 - this.field3967 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class192 var15 = class192.method1750(class189.field2275, client.field669.field1284);
            var15.field2356.method3508(this.field3992.method4009());
            client.field669.method2056(var15);
            this.field3967 = 0L;
        }
    }

    @ObfuscatedName("lz.u(I)V")
    public void method5803() {
        if (Statics.field3646 != null) {
            this.field3979 = this.field3980;
            return;
        }
        if (this.field3979 < this.field3980) {
            this.field3979 = Math.min(this.field3980, this.field3979 / 30.0F + this.field3979);
        }
        if (this.field3979 > this.field3980) {
            this.field3979 = Math.max(this.field3980, this.field3979 - this.field3979 / 30.0F);
        }
    }

    @ObfuscatedName("lz.g(I)V")
    public void method5737() {
        if (!this.method5740()) {
            return;
        }
        int var1 = this.field3977 - this.field3988;
        int var2 = this.field3978 - this.field3976;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5738(this.field3988 + var1, this.field3976 + var2, true);
        if (this.field3988 == this.field3977 && this.field3978 == this.field3976) {
            this.field3977 = -1;
            this.field3978 = -1;
        }
    }

    @ObfuscatedName("lz.l(IIZI)V")
    public final void method5738(int arg0, int arg1, boolean arg2) {
        this.field3988 = arg0;
        this.field3976 = arg1;
        class204.method3658();
        if (arg2) {
            this.method5739();
        }
    }

    @ObfuscatedName("lz.e(B)V")
    public final void method5739() {
        this.field3994 = -1;
        this.field3993 = -1;
        this.field3997 = -1;
        this.field3991 = -1;
    }

    @ObfuscatedName("lz.x(I)Z")
    public boolean method5740() {
        return this.field3977 != -1 && this.field3978 != -1;
    }

    @ObfuscatedName("lz.d(IIII)Lag;")
    public class27 method5741(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3969.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method297(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lz.a(IIIZI)V")
    public void method5742(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5741(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3956;
        }
        boolean var6 = false;
        if (this.field3970 != var5 || arg3) {
            this.field3970 = var5;
            this.method5871(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5749(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lz.z(II)V")
    public void method5743(int arg0) {
        class27 var2 = this.method5760(arg0);
        if (var2 != null) {
            this.method5871(var2);
        }
    }

    @ObfuscatedName("lz.j(I)I")
    public int method5744() {
        return this.field3971 == null ? -1 : this.field3971.method337();
    }

    @ObfuscatedName("lz.s(I)Lag;")
    public class27 method5745() {
        return this.field3971;
    }

    @ObfuscatedName("lz.t(Lag;B)V")
    public void method5871(class27 arg0) {
        if (this.field3971 == null || this.field3971 != arg0) {
            this.method5849(arg0);
            this.method5749(-1, -1, -1);
        }
    }

    @ObfuscatedName("lz.y(Lag;I)V")
    public void method5849(class27 arg0) {
        this.field3971 = arg0;
        this.field3973 = new class37(this.field3968, this.field3964, this.field3984, this.field3962);
        this.field3974.method5716(this.field3971.method304());
    }

    @ObfuscatedName("lz.h(Lag;Lhu;Lhu;ZI)V")
    public void method5748(class27 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3971 == null || this.field3971 != arg0) {
            this.method5849(arg0);
        }
        if (!arg3 && this.field3971.method297(arg1.field2608, arg1.field2605, arg1.field2606)) {
            this.method5749(arg1.field2608, arg1.field2605, arg1.field2606);
        } else {
            this.method5749(arg2.field2608, arg2.field2605, arg2.field2606);
        }
    }

    @ObfuscatedName("lz.b(IIII)V")
    public void method5749(int arg0, int arg1, int arg2) {
        if (this.field3971 == null) {
            return;
        }
        int[] var4 = this.field3971.method299(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3971.method299(this.field3971.method313(), this.field3971.method309(), this.field3971.method314());
        }
        this.method5738(var4[0] - this.field3971.method308() * 64, var4[1] - this.field3971.method310() * 64, true);
        this.field3977 = -1;
        this.field3978 = -1;
        this.field3979 = this.method5783(this.field3971.method307());
        this.field3980 = this.field3979;
        this.field4006 = null;
        this.field4007 = null;
        this.field3973.method576();
    }

    @ObfuscatedName("lz.c(IIIIII)V")
    public void method5750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class324.method5476(var6);
        class324.method5506(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class324.method5468(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3974.method5719();
        if (var7 < 100) {
            this.method5755(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3973.method553()) {
            this.field3973.method563(this.field3985, this.field3971.method304(), client.field625);
            if (!this.field3973.method553()) {
                return;
            }
        }
        if (this.field3975 != null) {
            this.field4008++;
            if (this.field4008 % this.field4009 == 0) {
                this.field4008 = 0;
                this.field3989++;
            }
            if (this.field3989 >= this.field3998 && !this.field3983) {
                this.field3975 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3979));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3979));
        this.field3973.method548(this.field3988 - var8 / 2, this.field3976 - var9 / 2, var8 / 2 + this.field3988, var9 / 2 + this.field3976, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3995) {
            boolean var10 = false;
            if (arg4 - this.field4004 > 100) {
                this.field4004 = arg4;
                var10 = true;
            }
            this.field3973.method549(this.field3988 - var8 / 2, this.field3976 - var9 / 2, var8 / 2 + this.field3988, var9 / 2 + this.field3976, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4002, this.field3975, this.field4008, this.field4009, var10);
        }
        this.method5752(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method1703() && this.field4010 && this.field3992 != null) {
            this.field3966.method5207("Coord: " + this.field3992, class324.field3876 + 10, class324.field3872 + 20, 16776960, -1);
        }
        this.field3963 = var8;
        this.field3982 = var9;
        this.field3981 = arg0;
        this.field3972 = arg1;
        class324.method5463(var6);
    }

    @ObfuscatedName("lz.p(IIIIIII)Z")
    public boolean method5751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4011 == null) {
            return true;
        } else if (this.field4011.field3897 != arg0 || this.field4011.field3904 != arg1) {
            return true;
        } else if (this.field3973.field311 != this.field4012) {
            return true;
        } else if (client.field848 != this.field4015) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lz.v(IIIIIII)V")
    public void method5752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3646 == null) {
            return;
        }
        int var7 = 512 / (this.field3973.field311 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5765() - arg4 / 2 - var7;
        int var14 = this.method5864() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3973.field311 * (var7 + var13 - this.field4013);
        int var16 = arg1 - this.field3973.field311 * (var7 - (var14 - this.field4014));
        if (this.method5751(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4011 != null && this.field4011.field3897 == var11 && this.field4011.field3904 == var12) {
                Arrays.fill(this.field4011.field3900, 0);
            } else {
                this.field4011 = new class328(var11, var12);
            }
            this.field4013 = this.method5765() - arg4 / 2 - var7;
            this.field4014 = this.method5864() - arg5 / 2 - var7;
            this.field4012 = this.field3973.field311;
            Statics.field3646.method4309(this.field4013, this.field4014, this.field4011, (float) this.field4012 / var10);
            this.field4015 = client.field848;
            var15 = arg0 - this.field3973.field311 * (var7 + var13 - this.field4013);
            var16 = arg1 - this.field3973.field311 * (var7 - (var14 - this.field4014));
        }
        class324.method5471(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4011.method5593(var15, var16, 192);
        } else {
            this.field4011.method5615(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lz.ag(IIIIB)V")
    public void method5780(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3974.method5718()) {
            return;
        }
        if (!this.field3973.method553()) {
            this.field3973.method563(this.field3985, this.field3971.method304(), client.field625);
            if (!this.field3973.method553()) {
                return;
            }
        }
        this.field3973.method546(arg0, arg1, arg2, arg3, this.field3975, this.field4008, this.field4009);
    }

    @ObfuscatedName("lz.aq(II)V")
    public void method5853(int arg0) {
        this.field3980 = this.method5783(arg0);
    }

    @ObfuscatedName("lz.aj(IIIIIB)V")
    public void method5755(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class324.method5468(arg0, arg1, arg2, arg3, -16777216);
        class324.method5466(var7 - 152, var8, 304, 34, -65536);
        class324.method5468(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3966.method5210(class236.field3029, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lz.av(IB)F")
    public float method5783(int arg0) {
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

    @ObfuscatedName("lz.ar(B)I")
    public int method5757() {
        if ((double) this.field3980 == 1.0D) {
            return 25;
        } else if ((double) this.field3980 == 1.5D) {
            return 37;
        } else if ((double) this.field3980 == 2.0D) {
            return 50;
        } else if ((double) this.field3980 == 3.0D) {
            return 75;
        } else if ((double) this.field3980 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lz.ac(B)V")
    public void method5758() {
        this.field3974.method5717();
    }

    @ObfuscatedName("lz.ay(S)Z")
    public boolean method5759() {
        return this.field3974.method5718();
    }

    @ObfuscatedName("lz.ah(II)Lag;")
    public class27 method5760(int arg0) {
        Iterator var2 = this.field3969.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method337() != arg0);
        return var3;
    }

    @ObfuscatedName("lz.ak(III)V")
    public void method5906(int arg0, int arg1) {
        if (this.field3971 != null && this.field3971.method298(arg0, arg1)) {
            this.field3977 = arg0 - this.field3971.method308() * 64;
            this.field3978 = arg1 - this.field3971.method310() * 64;
        }
    }

    @ObfuscatedName("lz.aw(III)V")
    public void method5762(int arg0, int arg1) {
        if (this.field3971 != null) {
            this.method5738(arg0 - this.field3971.method308() * 64, arg1 - this.field3971.method310() * 64, true);
            this.field3977 = -1;
            this.field3978 = -1;
        }
    }

    @ObfuscatedName("lz.al(IIIB)V")
    public void method5753(int arg0, int arg1, int arg2) {
        if (this.field3971 != null) {
            int[] var4 = this.field3971.method299(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5906(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lz.ab(IIII)V")
    public void method5764(int arg0, int arg1, int arg2) {
        if (this.field3971 != null) {
            int[] var4 = this.field3971.method299(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5762(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lz.ae(I)I")
    public int method5765() {
        return this.field3971 == null ? -1 : this.field3988 + this.field3971.method308() * 64;
    }

    @ObfuscatedName("lz.at(I)I")
    public int method5864() {
        return this.field3971 == null ? -1 : this.field3976 + this.field3971.method310() * 64;
    }

    @ObfuscatedName("lz.ad(I)Lhu;")
    public class225 method5767() {
        return this.field3971 == null ? null : this.field3971.method300(this.method5765(), this.method5864());
    }

    @ObfuscatedName("lz.ap(I)I")
    public int method5768() {
        return this.field3963;
    }

    @ObfuscatedName("lz.as(I)I")
    public int method5769() {
        return this.field3982;
    }

    @ObfuscatedName("lz.am(II)V")
    public void method5770(int arg0) {
        if (arg0 >= 1) {
            this.field3998 = arg0;
        }
    }

    @ObfuscatedName("lz.an(I)V")
    public void method5771() {
        this.field3998 = 3;
    }

    @ObfuscatedName("lz.az(II)V")
    public void method5772(int arg0) {
        if (arg0 >= 1) {
            this.field4009 = arg0;
        }
    }

    @ObfuscatedName("lz.au(I)V")
    public void method5773() {
        this.field4009 = 50;
    }

    @ObfuscatedName("lz.ao(ZI)V")
    public void method5774(boolean arg0) {
        this.field3983 = arg0;
    }

    @ObfuscatedName("lz.aa(II)V")
    public void method5775(int arg0) {
        this.field3975 = new HashSet();
        this.field3975.add(arg0);
        this.field3989 = 0;
        this.field4008 = 0;
    }

    @ObfuscatedName("lz.ax(IB)V")
    public void method5826(int arg0) {
        this.field3975 = new HashSet();
        this.field3989 = 0;
        this.field4008 = 0;
        for (int var2 = 0; var2 < Statics.field1947; var2++) {
            if (class253.method2731(var2) != null && class253.method2731(var2).field3305 == arg0) {
                this.field3975.add(class253.method2731(var2).field3297);
            }
        }
    }

    @ObfuscatedName("lz.af(I)V")
    public void method5777() {
        this.field3975 = null;
    }

    @ObfuscatedName("lz.ai(ZI)V")
    public void method5776(boolean arg0) {
        this.field3995 = !arg0;
    }

    @ObfuscatedName("lz.ba(IZI)V")
    public void method5779(int arg0, boolean arg1) {
        if (arg1) {
            this.field3999.remove(arg0);
        } else {
            this.field3999.add(arg0);
        }
        this.method5903();
    }

    @ObfuscatedName("lz.bb(IZI)V")
    public void method5901(int arg0, boolean arg1) {
        if (arg1) {
            this.field4000.remove(arg0);
        } else {
            this.field4000.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1947; var3++) {
            if (class253.method2731(var3) != null && class253.method2731(var3).field3305 == arg0) {
                int var4 = class253.method2731(var3).field3297;
                if (arg1) {
                    this.field4001.remove(var4);
                } else {
                    this.field4001.add(var4);
                }
            }
        }
        this.method5903();
    }

    @ObfuscatedName("lz.bs(B)Z")
    public boolean method5781() {
        return !this.field3995;
    }

    @ObfuscatedName("lz.bq(IB)Z")
    public boolean method5782(int arg0) {
        return !this.field3999.contains(arg0);
    }

    @ObfuscatedName("lz.bn(II)Z")
    public boolean method5859(int arg0) {
        return !this.field4000.contains(arg0);
    }

    @ObfuscatedName("lz.bk(I)V")
    public void method5903() {
        this.field4002.clear();
        this.field4002.addAll(this.field3999);
        this.field4002.addAll(this.field4001);
    }

    @ObfuscatedName("lz.bd(IIIIIIB)V")
    public void method5785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3974.method5718()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3979));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3979));
        List var9 = this.field3973.method551(this.field3988 - var7 / 2 - 1, this.field3976 - var8 / 2 - 1, var7 / 2 + this.field3988 + 1, var8 / 2 + this.field3976 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class253 var12 = class253.method2731(var11.method192());
            var13 = false;
            for (int var14 = this.field4005.length - 1; var14 >= 0; var14--) {
                if (var12.field3294[var14] != null) {
                    client.method968(var12.field3294[var14], var12.field3295, this.field4005[var14], var11.method192(), var11.field283.method4009(), var11.field287.method4009());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lz.bc(ILhu;I)Lhu;")
    public class225 method5786(int arg0, class225 arg1) {
        if (!this.field3974.method5718()) {
            return null;
        } else if (!this.field3973.method553()) {
            return null;
        } else if (this.field3971.method298(arg1.field2605, arg1.field2606)) {
            HashMap var3 = this.field3973.method556();
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
                        return var5.field287;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field287.field2605 - arg1.field2605;
                    int var10 = var8.field287.field2606 - arg1.field2606;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field287;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lz.bo(IILhu;Lhu;B)V")
    public void method5818(int arg0, int arg1, class225 arg2, class225 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1046(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1039(10);
                break;
            case 1009:
                var5.method1039(11);
                break;
            case 1010:
                var5.method1039(12);
                break;
            case 1011:
                var5.method1039(13);
                break;
            case 1012:
                var5.method1039(14);
        }
        class77.method4251(var5);
    }

    @ObfuscatedName("lz.bx(I)Lak;")
    public class35 method5788() {
        if (!this.field3974.method5718()) {
            return null;
        } else if (this.field3973.method553()) {
            HashMap var1 = this.field3973.method556();
            this.field4006 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4006.addAll(var3);
            }
            this.field4007 = this.field4006.iterator();
            return this.method5789();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lz.by(B)Lak;")
    public class35 method5789() {
        if (this.field4007 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field4007.hasNext()) {
                return null;
            }
            var1 = (class35) this.field4007.next();
        } while (var1.method192() == -1);
        return var1;
    }
}
