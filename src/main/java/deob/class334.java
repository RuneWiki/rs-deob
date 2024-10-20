package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lw")
public class class334 {

    @ObfuscatedName("lw.b")
    public class234 field4030;

    @ObfuscatedName("lw.i")
    public class234 field3977;

    @ObfuscatedName("lw.c")
    public class234 field4011;

    @ObfuscatedName("lw.f")
    public static final class293 field3979 = class293.field3680;

    @ObfuscatedName("lw.m")
    public static final class293 field3980 = class293.field3685;

    @ObfuscatedName("lw.u")
    public static final class293 field3981 = class293.field3682;

    @ObfuscatedName("lw.x")
    public class296 field3982;

    @ObfuscatedName("lw.r")
    public HashMap field4022;

    @ObfuscatedName("lw.v")
    public class325[] field3984;

    @ObfuscatedName("lw.y")
    public HashMap field3993;

    @ObfuscatedName("lw.g")
    public class27 field3986;

    @ObfuscatedName("lw.a")
    public class27 field3987;

    @ObfuscatedName("lw.j")
    public class27 field3988;

    @ObfuscatedName("lw.t")
    public class37 field4020;

    @ObfuscatedName("lw.h")
    public class333 field4029;

    @ObfuscatedName("lw.o")
    public int field3991;

    @ObfuscatedName("lw.n")
    public int field4000;

    @ObfuscatedName("lw.d")
    public int field3971 = -1;

    @ObfuscatedName("lw.s")
    public int field3994 = -1;

    @ObfuscatedName("lw.z")
    public float field3995;

    @ObfuscatedName("lw.al")
    public float field3975;

    @ObfuscatedName("lw.av")
    public int field3997 = -1;

    @ObfuscatedName("lw.as")
    public int field3998 = -1;

    @ObfuscatedName("lw.aw")
    public int field3996 = -1;

    @ObfuscatedName("lw.ad")
    public int field3976 = -1;

    @ObfuscatedName("lw.ag")
    public int field3985 = 3;

    @ObfuscatedName("lw.ar")
    public int field4024 = 50;

    @ObfuscatedName("lw.ax")
    public boolean field4003 = false;

    @ObfuscatedName("lw.az")
    public HashSet field4004 = null;

    @ObfuscatedName("lw.ae")
    public int field4023 = -1;

    @ObfuscatedName("lw.ao")
    public int field4018 = -1;

    @ObfuscatedName("lw.aj")
    public int field4007 = -1;

    @ObfuscatedName("lw.at")
    public int field4008 = -1;

    @ObfuscatedName("lw.ac")
    public int field4002 = -1;

    @ObfuscatedName("lw.ap")
    public int field3990 = -1;

    @ObfuscatedName("lw.aq")
    public long field3983;

    @ObfuscatedName("lw.aa")
    public int field4001;

    @ObfuscatedName("lw.an")
    public int field4013;

    @ObfuscatedName("lw.au")
    public boolean field4014 = true;

    @ObfuscatedName("lw.ah")
    public HashSet field4015 = new HashSet();

    @ObfuscatedName("lw.am")
    public HashSet field4016 = new HashSet();

    @ObfuscatedName("lw.ay")
    public HashSet field4017 = new HashSet();

    @ObfuscatedName("lw.af")
    public HashSet field3989 = new HashSet();

    @ObfuscatedName("lw.ab")
    public boolean field4019 = false;

    @ObfuscatedName("lw.bp")
    public int field4012 = 0;

    @ObfuscatedName("lw.bi")
    public final int[] field4021 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lw.bg")
    public List field3973;

    @ObfuscatedName("lw.bh")
    public Iterator field3992;

    @ObfuscatedName("lw.bm")
    public HashSet field4006 = new HashSet();

    @ObfuscatedName("lw.bn")
    public class214 field4025 = null;

    @ObfuscatedName("lw.bc")
    public boolean field4026 = false;

    @ObfuscatedName("lw.bx")
    public class326 field4027;

    @ObfuscatedName("lw.bo")
    public int field4028;

    @ObfuscatedName("lw.bb")
    public int field3978 = -1;

    @ObfuscatedName("lw.bs")
    public int field3999 = -1;

    @ObfuscatedName("lw.bj")
    public int field4031 = -1;

    @ObfuscatedName("lw.q(Lhp;Lhp;Lhp;Lke;Ljava/util/HashMap;[Llx;I)V")
    public void method5814(class234 arg0, class234 arg1, class234 arg2, class296 arg3, HashMap arg4, class325[] arg5) {
        this.field3984 = arg5;
        this.field4030 = arg0;
        this.field3977 = arg1;
        this.field4011 = arg2;
        this.field3982 = arg3;
        this.field4022 = new HashMap();
        this.field4022.put(class18.field114, arg4.get(field3979));
        this.field4022.put(class18.field119, arg4.get(field3980));
        this.field4022.put(class18.field117, arg4.get(field3981));
        this.field4029 = new class333(arg0);
        int var7 = this.field4030.method3791(class36.field309.field307);
        int[] var8 = this.field4030.method3784(var7);
        this.field3993 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class301 var10 = new class301(this.field4030.method3775(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method288(var10, var8[var9]);
            this.field3993.put(var11.method313(), var11);
            if (var11.method278()) {
                this.field3986 = var11;
            }
        }
        this.method5829(this.field3986);
        this.field3988 = null;
    }

    @ObfuscatedName("lw.w(I)V")
    public void method5815() {
        class30.field245.method3065(5);
    }

    @ObfuscatedName("lw.e(IIZIIIII)V")
    public void method5851(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4029.method5811()) {
            return;
        }
        this.method5966();
        this.method5820();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3995));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3995));
        List var10 = this.field4020.method515(this.field3991 - var8 / 2 - 1, this.field4000 - var9 / 2 - 1, var8 / 2 + this.field3991 + 1, var9 / 2 + this.field4000 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method176(), var13.field299, var13.field298);
            var14.method993(new Object[] { var15, arg0, arg1 });
            if (this.field4006.contains(var13)) {
                var14.method985(17);
            } else {
                var14.method985(15);
            }
            class77.method3292(var14);
        }
        Iterator var16 = this.field4006.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method176(), var17.field299, var17.field298);
                var18.method993(new Object[] { var19, arg0, arg1 });
                var18.method985(16);
                class77.method3292(var18);
            }
        }
        this.field4006 = var11;
    }

    @ObfuscatedName("lw.p(IIZZB)V")
    public void method5817(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class298.method3576();
        this.method5818(arg0, arg1, arg3, var5);
        if (!this.method5823() && arg3 || arg2) {
            if (arg3) {
                this.field4002 = arg0;
                this.field3990 = arg1;
                this.field4007 = this.field3991;
                this.field4008 = this.field4000;
            }
            if (this.field4007 != -1) {
                int var7 = arg0 - this.field4002;
                int var8 = arg1 - this.field3990;
                this.method5821(this.field4007 - (int) ((float) var7 / this.field3975), this.field4008 + (int) ((float) var8 / this.field3975), false);
            }
        } else {
            this.method5822();
        }
        if (arg3) {
            this.field3983 = var5;
            this.field4001 = arg0;
            this.field4013 = arg1;
        }
    }

    @ObfuscatedName("lw.k(IIZJ)V")
    public void method5818(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3987 == null) {
            this.field4025 = null;
            return;
        }
        int var6 = (int) ((float) this.field3991 + ((float) (arg0 - this.field3996) - (float) this.method5928() * this.field3995 / 2.0F) / this.field3995);
        int var7 = (int) ((float) this.field4000 - ((float) (arg1 - this.field3976) - (float) this.method5977() * this.field3995 / 2.0F) / this.field3995);
        this.field4025 = this.field3987.method275(var6 + this.field3987.method282() * 64, var7 + this.field3987.method284() * 64);
        if (this.field4025 == null || !arg2) {
            return;
        }
        boolean var8 = client.field891 >= 2;
        if (var8 && class46.field396[82] && class46.field396[81]) {
            client.method362(this.field4025.field2531, this.field4025.field2529, this.field4025.field2532, false);
            return;
        }
        boolean var9 = true;
        if (this.field4014) {
            int var10 = arg0 - this.field4001;
            int var11 = arg1 - this.field4013;
            if (arg3 - this.field3983 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class188 var12 = class188.method3894(class184.field2249, client.field881.field1314);
            var12.field2334.method5112(this.field4025.method3608());
            client.field881.method2023(var12);
            this.field3983 = 0L;
        }
    }

    @ObfuscatedName("lw.l(B)V")
    public void method5966() {
        if (Statics.field945 != null) {
            this.field3995 = this.field3975;
            return;
        }
        if (this.field3995 < this.field3975) {
            this.field3995 = Math.min(this.field3975, this.field3995 / 30.0F + this.field3995);
        }
        if (this.field3995 > this.field3975) {
            this.field3995 = Math.max(this.field3975, this.field3995 - this.field3995 / 30.0F);
        }
    }

    @ObfuscatedName("lw.b(I)V")
    public void method5820() {
        if (!this.method5823()) {
            return;
        }
        int var1 = this.field3971 - this.field3991;
        int var2 = this.field3994 - this.field4000;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5821(this.field3991 + var1, this.field4000 + var2, true);
        if (this.field3991 == this.field3971 && this.field4000 == this.field3994) {
            this.field3971 = -1;
            this.field3994 = -1;
        }
    }

    @ObfuscatedName("lw.i(IIZI)V")
    public final void method5821(int arg0, int arg1, boolean arg2) {
        this.field3991 = arg0;
        this.field4000 = arg1;
        class298.method3576();
        if (arg2) {
            this.method5822();
        }
    }

    @ObfuscatedName("lw.c(B)V")
    public final void method5822() {
        this.field3990 = -1;
        this.field4002 = -1;
        this.field4008 = -1;
        this.field4007 = -1;
    }

    @ObfuscatedName("lw.u(I)Z")
    public boolean method5823() {
        return this.field3971 != -1 && this.field3994 != -1;
    }

    @ObfuscatedName("lw.x(IIIB)Lal;")
    public class27 method5824(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3993.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method317(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lw.r(IIIZB)V")
    public void method5825(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5824(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3986;
        }
        boolean var6 = false;
        if (this.field3988 != var5 || arg3) {
            this.field3988 = var5;
            this.method5829(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5830(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lw.v(II)V")
    public void method5826(int arg0) {
        class27 var2 = this.method5843(arg0);
        if (var2 != null) {
            this.method5829(var2);
        }
    }

    @ObfuscatedName("lw.y(B)I")
    public int method5827() {
        return this.field3987 == null ? -1 : this.field3987.method291();
    }

    @ObfuscatedName("lw.g(B)Lal;")
    public class27 method5828() {
        return this.field3987;
    }

    @ObfuscatedName("lw.a(Lal;I)V")
    public void method5829(class27 arg0) {
        if (this.field3987 == null || this.field3987 != arg0) {
            this.method5965(arg0);
            this.method5830(-1, -1, -1);
        }
    }

    @ObfuscatedName("lw.j(Lal;I)V")
    public void method5965(class27 arg0) {
        this.field3987 = arg0;
        this.field4020 = new class37(this.field3984, this.field4022, this.field3977, this.field4011);
        this.field4029.method5801(this.field3987.method313());
    }

    @ObfuscatedName("lw.o(Lal;Lhv;Lhv;ZI)V")
    public void method5831(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3987 == null || this.field3987 != arg0) {
            this.method5965(arg0);
        }
        if (!arg3 && this.field3987.method317(arg1.field2532, arg1.field2531, arg1.field2529)) {
            this.method5830(arg1.field2532, arg1.field2531, arg1.field2529);
        } else {
            this.method5830(arg2.field2532, arg2.field2531, arg2.field2529);
        }
    }

    @ObfuscatedName("lw.d(IIII)V")
    public void method5830(int arg0, int arg1, int arg2) {
        if (this.field3987 == null) {
            return;
        }
        int[] var4 = this.field3987.method274(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3987.method274(this.field3987.method287(), this.field3987.method286(), this.field3987.method349());
        }
        this.method5821(var4[0] - this.field3987.method282() * 64, var4[1] - this.field3987.method284() * 64, true);
        this.field3971 = -1;
        this.field3994 = -1;
        this.field3995 = this.method5839(this.field3987.method281());
        this.field3975 = this.field3995;
        this.field3973 = null;
        this.field3992 = null;
        this.field4020.method547();
    }

    @ObfuscatedName("lw.s(IIIIII)V")
    public void method5833(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class322.method5526(var6);
        class322.method5524(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class322.method5539(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4029.method5800();
        if (var7 < 100) {
            this.method5838(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4020.method517()) {
            this.field4020.method510(this.field4030, this.field3987.method313(), client.field656);
            if (!this.field4020.method517()) {
                return;
            }
        }
        if (this.field4004 != null) {
            this.field4018++;
            if (this.field4018 % this.field4024 == 0) {
                this.field4018 = 0;
                this.field4023++;
            }
            if (this.field4023 >= this.field3985 && !this.field4003) {
                this.field4004 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3995));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3995));
        this.field4020.method512(this.field3991 - var8 / 2, this.field4000 - var9 / 2, var8 / 2 + this.field3991, var9 / 2 + this.field4000, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4019) {
            boolean var10 = false;
            if (arg4 - this.field4012 > 100) {
                this.field4012 = arg4;
                var10 = true;
            }
            this.field4020.method513(this.field3991 - var8 / 2, this.field4000 - var9 / 2, var8 / 2 + this.field3991, var9 / 2 + this.field4000, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3989, this.field4004, this.field4018, this.field4024, var10);
        }
        this.method5835(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field891 >= 2;
        if (var11 && this.field4026 && this.field4025 != null) {
            this.field3982.method4927("Coord: " + this.field4025, class322.field3875 + 10, class322.field3871 + 20, 16776960, -1);
        }
        this.field3997 = var8;
        this.field3998 = var9;
        this.field3996 = arg0;
        this.field3976 = arg1;
        class322.method5540(var6);
    }

    @ObfuscatedName("lw.z(IIIIIII)Z")
    public boolean method5834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4027 == null) {
            return true;
        } else if (this.field4027.field3900 != arg0 || this.field4027.field3901 != arg1) {
            return true;
        } else if (this.field4020.field311 != this.field4028) {
            return true;
        } else if (client.field925 != this.field4031) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lw.al(IIIIIIB)V")
    public void method5835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field945 == null) {
            return;
        }
        int var7 = 512 / (this.field4020.field311 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5848() - arg4 / 2 - var7;
        int var14 = this.method5849() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4020.field311 * (var7 + var13 - this.field3978);
        int var16 = arg1 - this.field4020.field311 * (var7 - (var14 - this.field3999));
        if (this.method5834(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4027 != null && this.field4027.field3900 == var11 && this.field4027.field3901 == var12) {
                Arrays.fill(this.field4027.field3909, 0);
            } else {
                this.field4027 = new class326(var11, var12);
            }
            this.field3978 = this.method5848() - arg4 / 2 - var7;
            this.field3999 = this.method5849() - arg5 / 2 - var7;
            this.field4028 = this.field4020.field311;
            Statics.field945.method3940(this.field3978, this.field3999, this.field4027, (float) this.field4028 / var10);
            this.field4031 = client.field925;
            var15 = arg0 - this.field4020.field311 * (var7 + var13 - this.field3978);
            var16 = arg1 - this.field4020.field311 * (var7 - (var14 - this.field3999));
        }
        class322.method5531(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4027.method5655(var15, var16, 192);
        } else {
            this.field4027.method5737(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lw.av(IIIII)V")
    public void method5836(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4029.method5811()) {
            return;
        }
        if (!this.field4020.method517()) {
            this.field4020.method510(this.field4030, this.field3987.method313(), client.field656);
            if (!this.field4020.method517()) {
                return;
            }
        }
        this.field4020.method514(arg0, arg1, arg2, arg3, this.field4004, this.field4018, this.field4024);
    }

    @ObfuscatedName("lw.as(II)V")
    public void method6001(int arg0) {
        this.field3975 = this.method5839(arg0);
    }

    @ObfuscatedName("lw.aw(IIIIII)V")
    public void method5838(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class322.method5539(arg0, arg1, arg2, arg3, -16777216);
        class322.method5535(var7 - 152, var8, 304, 34, -65536);
        class322.method5539(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3982.method4922(class225.field3058, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lw.ad(II)F")
    public float method5839(int arg0) {
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

    @ObfuscatedName("lw.ag(B)I")
    public int method5967() {
        if ((double) this.field3975 == 1.0D) {
            return 25;
        } else if ((double) this.field3975 == 1.5D) {
            return 37;
        } else if ((double) this.field3975 == 2.0D) {
            return 50;
        } else if ((double) this.field3975 == 3.0D) {
            return 75;
        } else if ((double) this.field3975 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lw.ar(I)V")
    public void method5987() {
        this.field4029.method5802();
    }

    @ObfuscatedName("lw.ax(I)Z")
    public boolean method5842() {
        return this.field4029.method5811();
    }

    @ObfuscatedName("lw.az(II)Lal;")
    public class27 method5843(int arg0) {
        Iterator var2 = this.field3993.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method291() != arg0);
        return var3;
    }

    @ObfuscatedName("lw.ae(III)V")
    public void method5885(int arg0, int arg1) {
        if (this.field3987 != null && this.field3987.method273(arg0, arg1)) {
            this.field3971 = arg0 - this.field3987.method282() * 64;
            this.field3994 = arg1 - this.field3987.method284() * 64;
        }
    }

    @ObfuscatedName("lw.ao(III)V")
    public void method5896(int arg0, int arg1) {
        if (this.field3987 != null) {
            this.method5821(arg0 - this.field3987.method282() * 64, arg1 - this.field3987.method284() * 64, true);
            this.field3971 = -1;
            this.field3994 = -1;
        }
    }

    @ObfuscatedName("lw.aj(IIII)V")
    public void method5846(int arg0, int arg1, int arg2) {
        if (this.field3987 != null) {
            int[] var4 = this.field3987.method274(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5885(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lw.at(IIII)V")
    public void method5905(int arg0, int arg1, int arg2) {
        if (this.field3987 != null) {
            int[] var4 = this.field3987.method274(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5896(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lw.ac(I)I")
    public int method5848() {
        return this.field3987 == null ? -1 : this.field3991 + this.field3987.method282() * 64;
    }

    @ObfuscatedName("lw.ap(I)I")
    public int method5849() {
        return this.field3987 == null ? -1 : this.field4000 + this.field3987.method284() * 64;
    }

    @ObfuscatedName("lw.aq(B)Lhv;")
    public class214 method5931() {
        return this.field3987 == null ? null : this.field3987.method275(this.method5848(), this.method5849());
    }

    @ObfuscatedName("lw.aa(I)I")
    public int method5928() {
        return this.field3997;
    }

    @ObfuscatedName("lw.an(B)I")
    public int method5977() {
        return this.field3998;
    }

    @ObfuscatedName("lw.au(II)V")
    public void method5853(int arg0) {
        if (arg0 >= 1) {
            this.field3985 = arg0;
        }
    }

    @ObfuscatedName("lw.ai(B)V")
    public void method5854() {
        this.field3985 = 3;
    }

    @ObfuscatedName("lw.ak(II)V")
    public void method5855(int arg0) {
        if (arg0 >= 1) {
            this.field4024 = arg0;
        }
    }

    @ObfuscatedName("lw.ah(I)V")
    public void method5856() {
        this.field4024 = 50;
    }

    @ObfuscatedName("lw.am(ZI)V")
    public void method6008(boolean arg0) {
        this.field4003 = arg0;
    }

    @ObfuscatedName("lw.ay(II)V")
    public void method5857(int arg0) {
        this.field4004 = new HashSet();
        this.field4004.add(arg0);
        this.field4023 = 0;
        this.field4018 = 0;
    }

    @ObfuscatedName("lw.af(II)V")
    public void method5858(int arg0) {
        this.field4004 = new HashSet();
        this.field4023 = 0;
        this.field4018 = 0;
        for (int var2 = 0; var2 < Statics.field3847; var2++) {
            if (class242.method3753(var2) != null && class242.method3753(var2).field3231 == arg0) {
                this.field4004.add(class242.method3753(var2).field3214);
            }
        }
    }

    @ObfuscatedName("lw.ab(I)V")
    public void method5859() {
        this.field4004 = null;
    }

    @ObfuscatedName("lw.bp(ZB)V")
    public void method5919(boolean arg0) {
        this.field4019 = !arg0;
    }

    @ObfuscatedName("lw.bz(IZB)V")
    public void method5861(int arg0, boolean arg1) {
        if (arg1) {
            this.field4015.remove(arg0);
        } else {
            this.field4015.add(arg0);
        }
        this.method5866();
    }

    @ObfuscatedName("lw.bi(IZI)V")
    public void method5992(int arg0, boolean arg1) {
        if (arg1) {
            this.field4016.remove(arg0);
        } else {
            this.field4016.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3847; var3++) {
            if (class242.method3753(var3) != null && class242.method3753(var3).field3231 == arg0) {
                int var4 = class242.method3753(var3).field3214;
                if (arg1) {
                    this.field4017.remove(var4);
                } else {
                    this.field4017.add(var4);
                }
            }
        }
        this.method5866();
    }

    @ObfuscatedName("lw.bg(S)Z")
    public boolean method5863() {
        return !this.field4019;
    }

    @ObfuscatedName("lw.bh(IB)Z")
    public boolean method5864(int arg0) {
        return !this.field4015.contains(arg0);
    }

    @ObfuscatedName("lw.bm(II)Z")
    public boolean method5865(int arg0) {
        return !this.field4016.contains(arg0);
    }

    @ObfuscatedName("lw.bn(B)V")
    public void method5866() {
        this.field3989.clear();
        this.field3989.addAll(this.field4015);
        this.field3989.addAll(this.field4017);
    }

    @ObfuscatedName("lw.bc(IIIIIII)V")
    public void method5998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4029.method5811()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3995));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3995));
        List var9 = this.field4020.method515(this.field3991 - var7 / 2 - 1, this.field4000 - var8 / 2 - 1, var7 / 2 + this.field3991 + 1, var8 / 2 + this.field4000 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class242 var12 = class242.method3753(var11.method176());
            var13 = false;
            for (int var14 = this.field4021.length - 1; var14 >= 0; var14--) {
                if (var12.field3211[var14] != null) {
                    client.method3323(var12.field3211[var14], var12.field3212, this.field4021[var14], var11.method176(), var11.field299.method3608(), var11.field298.method3608());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lw.bx(ILhv;I)Lhv;")
    public class214 method5868(int arg0, class214 arg1) {
        if (!this.field4029.method5811()) {
            return null;
        } else if (!this.field4020.method517()) {
            return null;
        } else if (this.field3987.method273(arg1.field2531, arg1.field2529)) {
            HashMap var3 = this.field4020.method518();
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
                        return var5.field298;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field298.field2531 - arg1.field2531;
                    int var10 = var8.field298.field2529 - arg1.field2529;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field298;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lw.bo(IILhv;Lhv;B)V")
    public void method5986(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method993(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method985(10);
                break;
            case 1009:
                var5.method985(11);
                break;
            case 1010:
                var5.method985(12);
                break;
            case 1011:
                var5.method985(13);
                break;
            case 1012:
                var5.method985(14);
        }
        class77.method3292(var5);
    }

    @ObfuscatedName("lw.bb(I)Laz;")
    public class35 method5862() {
        if (!this.field4029.method5811()) {
            return null;
        } else if (this.field4020.method517()) {
            HashMap var1 = this.field4020.method518();
            this.field3973 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3973.addAll(var3);
            }
            this.field3992 = this.field3973.iterator();
            return this.method5871();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lw.bs(B)Laz;")
    public class35 method5871() {
        if (this.field3992 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3992.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3992.next();
        } while (var1.method176() == -1);
        return var1;
    }
}
