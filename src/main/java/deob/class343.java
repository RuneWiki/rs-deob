package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mx")
public class class343 {

    @ObfuscatedName("mx.x")
    public class244 field3984;

    @ObfuscatedName("mx.w")
    public class244 field3985;

    @ObfuscatedName("mx.g")
    public class244 field4013;

    @ObfuscatedName("mx.m")
    public static final class302 field3987 = class302.field3684;

    @ObfuscatedName("mx.n")
    public static final class302 field3988 = class302.field3685;

    @ObfuscatedName("mx.d")
    public static final class302 field3989 = class302.field3681;

    @ObfuscatedName("mx.h")
    public class305 field3994;

    @ObfuscatedName("mx.a")
    public HashMap field3991;

    @ObfuscatedName("mx.q")
    public class334[] field3999;

    @ObfuscatedName("mx.c")
    public HashMap field3993;

    @ObfuscatedName("mx.f")
    public class36 field4000;

    @ObfuscatedName("mx.y")
    public class36 field3995;

    @ObfuscatedName("mx.v")
    public class36 field3996;

    @ObfuscatedName("mx.j")
    public class46 field4002;

    @ObfuscatedName("mx.r")
    public class342 field3998;

    @ObfuscatedName("mx.u")
    public int field4031;

    @ObfuscatedName("mx.p")
    public int field4011;

    @ObfuscatedName("mx.b")
    public int field4001 = -1;

    @ObfuscatedName("mx.l")
    public int field4015 = -1;

    @ObfuscatedName("mx.e")
    public float field4003;

    @ObfuscatedName("mx.ab")
    public float field4004;

    @ObfuscatedName("mx.ag")
    public int field4005 = -1;

    @ObfuscatedName("mx.ao")
    public int field4021 = -1;

    @ObfuscatedName("mx.ae")
    public int field4007 = -1;

    @ObfuscatedName("mx.an")
    public int field3981 = -1;

    @ObfuscatedName("mx.am")
    public int field4009 = 3;

    @ObfuscatedName("mx.ap")
    public int field4010 = 50;

    @ObfuscatedName("mx.au")
    public boolean field3997 = false;

    @ObfuscatedName("mx.aa")
    public HashSet field4012 = null;

    @ObfuscatedName("mx.ar")
    public int field4033 = -1;

    @ObfuscatedName("mx.at")
    public int field4014 = -1;

    @ObfuscatedName("mx.aq")
    public int field4038 = -1;

    @ObfuscatedName("mx.al")
    public int field4016 = -1;

    @ObfuscatedName("mx.ah")
    public int field4035 = -1;

    @ObfuscatedName("mx.av")
    public int field4018 = -1;

    @ObfuscatedName("mx.ax")
    public long field4019;

    @ObfuscatedName("mx.as")
    public int field4029;

    @ObfuscatedName("mx.az")
    public int field4036;

    @ObfuscatedName("mx.ad")
    public boolean field4022 = true;

    @ObfuscatedName("mx.aj")
    public HashSet field4023 = new HashSet();

    @ObfuscatedName("mx.aw")
    public HashSet field4024 = new HashSet();

    @ObfuscatedName("mx.af")
    public HashSet field3986 = new HashSet();

    @ObfuscatedName("mx.ak")
    public HashSet field4026 = new HashSet();

    @ObfuscatedName("mx.ac")
    public boolean field4027 = false;

    @ObfuscatedName("mx.bl")
    public int field4028 = 0;

    @ObfuscatedName("mx.bz")
    public final int[] field4020 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("mx.bj")
    public List field4030;

    @ObfuscatedName("mx.bh")
    public Iterator field4032;

    @ObfuscatedName("mx.bi")
    public HashSet field4008 = new HashSet();

    @ObfuscatedName("mx.bg")
    public class223 field3990 = null;

    @ObfuscatedName("mx.br")
    public boolean field4034 = false;

    @ObfuscatedName("mx.bp")
    public class335 field4017;

    @ObfuscatedName("mx.bn")
    public int field3992;

    @ObfuscatedName("mx.bw")
    public int field4037 = -1;

    @ObfuscatedName("mx.be")
    public int field4006 = -1;

    @ObfuscatedName("mx.bu")
    public int field4039 = -1;

    @ObfuscatedName("mx.z(Lic;Lic;Lic;Lkr;Ljava/util/HashMap;[Lls;I)V")
    public void method5943(class244 arg0, class244 arg1, class244 arg2, class305 arg3, HashMap arg4, class334[] arg5) {
        this.field3999 = arg5;
        this.field3984 = arg0;
        this.field3985 = arg1;
        this.field4013 = arg2;
        this.field3994 = arg3;
        this.field3991 = new HashMap();
        this.field3991.put(class27.field146, arg4.get(field3987));
        this.field3991.put(class27.field139, arg4.get(field3988));
        this.field3991.put(class27.field145, arg4.get(field3989));
        this.field3998 = new class342(arg0);
        int var7 = this.field3984.method3909(class45.field323.field325);
        int[] var8 = this.field3984.method3952(var7);
        this.field3993 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class310 var10 = new class310(this.field3984.method3873(var7, var8[var9]));
            class36 var11 = new class36();
            var11.method339(var10, var8[var9]);
            this.field3993.put(var11.method343(), var11);
            if (var11.method377()) {
                this.field4000 = var11;
            }
        }
        this.method5958(this.field4000);
        this.field3996 = null;
    }

    @ObfuscatedName("mx.k(I)V")
    public void method5944() {
        class39.field268.method3196(5);
    }

    @ObfuscatedName("mx.s(IIZIIIII)V")
    public void method5945(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3998.method5931()) {
            return;
        }
        this.method5954();
        this.method5949();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4003));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4003));
        List var10 = this.field4002.method616(this.field4031 - var8 / 2 - 1, this.field4011 - var9 / 2 - 1, var8 / 2 + this.field4031 + 1, var9 / 2 + this.field4011 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class44 var13 = (class44) var12.next();
            var11.add(var13);
            class72 var14 = new class72();
            class51 var15 = new class51(var13.method250(), var13.field313, var13.field314);
            var14.method1086(new Object[] { var15, arg0, arg1 });
            if (this.field4008.contains(var13)) {
                var14.method1087(17);
            } else {
                var14.method1087(15);
            }
            class86.method2141(var14);
        }
        Iterator var16 = this.field4008.iterator();
        while (var16.hasNext()) {
            class44 var17 = (class44) var16.next();
            if (!var11.contains(var17)) {
                class72 var18 = new class72();
                class51 var19 = new class51(var17.method250(), var17.field313, var17.field314);
                var18.method1086(new Object[] { var19, arg0, arg1 });
                var18.method1087(16);
                class86.method2141(var18);
            }
        }
        this.field4008 = var11;
    }

    @ObfuscatedName("mx.t(IIZZB)V")
    public void method5946(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class307.method2184();
        this.method5947(arg0, arg1, arg3, var5);
        if (!this.method5952() && arg3 || arg2) {
            if (arg3) {
                this.field4035 = arg0;
                this.field4018 = arg1;
                this.field4038 = this.field4031;
                this.field4016 = this.field4011;
            }
            if (this.field4038 != -1) {
                int var7 = arg0 - this.field4035;
                int var8 = arg1 - this.field4018;
                this.method5950(this.field4038 - (int) ((float) var7 / this.field4004), this.field4016 + (int) ((float) var8 / this.field4004), false);
            }
        } else {
            this.method5955();
        }
        if (arg3) {
            this.field4019 = var5;
            this.field4029 = arg0;
            this.field4036 = arg1;
        }
    }

    @ObfuscatedName("mx.i(IIZJ)V")
    public void method5947(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3995 == null) {
            this.field3990 = null;
            return;
        }
        int var6 = (int) ((float) this.field4031 + ((float) (arg0 - this.field4007) - (float) this.method6137() * this.field4003 / 2.0F) / this.field4003);
        int var7 = (int) ((float) this.field4011 - ((float) (arg1 - this.field3981) - (float) this.method5981() * this.field4003 / 2.0F) / this.field4003);
        this.field3990 = this.field3995.method378(var6 + this.field3995.method380() * 64, var7 + this.field3995.method349() * 64);
        if (this.field3990 == null || !arg2) {
            return;
        }
        if (client.method3294() && class55.field416[82] && class55.field416[81]) {
            client.method1967(this.field3990.field2563, this.field3990.field2565, this.field3990.field2568, false);
            return;
        }
        boolean var8 = true;
        if (this.field4022) {
            int var9 = arg0 - this.field4029;
            int var10 = arg1 - this.field4036;
            if (arg3 - this.field4019 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class197 var11 = class197.method1625(class193.field2265, client.field723.field1341);
            var11.field2377.method5295(this.field3990.method3725());
            client.field723.method2159(var11);
            this.field4019 = 0L;
        }
    }

    @ObfuscatedName("mx.o(I)V")
    public void method5954() {
        if (Statics.field1902 != null) {
            this.field4003 = this.field4004;
            return;
        }
        if (this.field4003 < this.field4004) {
            this.field4003 = Math.min(this.field4004, this.field4003 / 30.0F + this.field4003);
        }
        if (this.field4003 > this.field4004) {
            this.field4003 = Math.max(this.field4004, this.field4003 - this.field4003 / 30.0F);
        }
    }

    @ObfuscatedName("mx.x(B)V")
    public void method5949() {
        if (!this.method5952()) {
            return;
        }
        int var1 = this.field4001 - this.field4031;
        int var2 = this.field4015 - this.field4011;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5950(this.field4031 + var1, this.field4011 + var2, true);
        if (this.field4031 == this.field4001 && this.field4015 == this.field4011) {
            this.field4001 = -1;
            this.field4015 = -1;
        }
    }

    @ObfuscatedName("mx.w(IIZI)V")
    public final void method5950(int arg0, int arg1, boolean arg2) {
        this.field4031 = arg0;
        this.field4011 = arg1;
        class307.method2184();
        if (arg2) {
            this.method5955();
        }
    }

    @ObfuscatedName("mx.g(B)V")
    public final void method5955() {
        this.field4018 = -1;
        this.field4035 = -1;
        this.field4016 = -1;
        this.field4038 = -1;
    }

    @ObfuscatedName("mx.m(I)Z")
    public boolean method5952() {
        return this.field4001 != -1 && this.field4015 != -1;
    }

    @ObfuscatedName("mx.n(IIIB)Lar;")
    public class36 method5953(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3993.values().iterator();
        class36 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class36) var4.next();
        } while (!var5.method336(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("mx.d(IIIZI)V")
    public void method5998(int arg0, int arg1, int arg2, boolean arg3) {
        class36 var5 = this.method5953(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4000;
        }
        boolean var6 = false;
        if (this.field3996 != var5 || arg3) {
            this.field3996 = var5;
            this.method5958(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5974(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mx.h(IB)V")
    public void method6057(int arg0) {
        class36 var2 = this.method5972(arg0);
        if (var2 != null) {
            this.method5958(var2);
        }
    }

    @ObfuscatedName("mx.a(B)I")
    public int method5956() {
        return this.field3995 == null ? -1 : this.field3995.method333();
    }

    @ObfuscatedName("mx.q(B)Lar;")
    public class36 method5960() {
        return this.field3995;
    }

    @ObfuscatedName("mx.c(Lar;I)V")
    public void method5958(class36 arg0) {
        if (this.field3995 == null || this.field3995 != arg0) {
            this.method5959(arg0);
            this.method5974(-1, -1, -1);
        }
    }

    @ObfuscatedName("mx.j(Lar;I)V")
    public void method5959(class36 arg0) {
        this.field3995 = arg0;
        this.field4002 = new class46(this.field3999, this.field3991, this.field3985, this.field4013);
        this.field3998.method5929(this.field3995.method343());
    }

    @ObfuscatedName("mx.r(Lar;Lhg;Lhg;ZB)V")
    public void method6065(class36 arg0, class223 arg1, class223 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3995 == null || this.field3995 != arg0) {
            this.method5959(arg0);
        }
        if (!arg3 && this.field3995.method336(arg1.field2568, arg1.field2563, arg1.field2565)) {
            this.method5974(arg1.field2568, arg1.field2563, arg1.field2565);
        } else {
            this.method5974(arg2.field2568, arg2.field2563, arg2.field2565);
        }
    }

    @ObfuscatedName("mx.u(IIIB)V")
    public void method5974(int arg0, int arg1, int arg2) {
        if (this.field3995 == null) {
            return;
        }
        int[] var4 = this.field3995.method338(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3995.method338(this.field3995.method352(), this.field3995.method406(), this.field3995.method410());
        }
        this.method5950(var4[0] - this.field3995.method380() * 64, var4[1] - this.field3995.method349() * 64, true);
        this.field4001 = -1;
        this.field4015 = -1;
        this.field4003 = this.method6088(this.field3995.method389());
        this.field4004 = this.field4003;
        this.field4030 = null;
        this.field4032 = null;
        this.field4002.method580();
    }

    @ObfuscatedName("mx.p(IIIIII)V")
    public void method5962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class331.method5685(var6);
        class331.method5653(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class331.method5661(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3998.method5932();
        if (var7 < 100) {
            this.method6040(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4002.method613()) {
            this.field4002.method579(this.field3984, this.field3995.method343(), client.field675);
            if (!this.field4002.method613()) {
                return;
            }
        }
        if (this.field4012 != null) {
            this.field4014++;
            if (this.field4014 % this.field4010 == 0) {
                this.field4014 = 0;
                this.field4033++;
            }
            if (this.field4033 >= this.field4009 && !this.field3997) {
                this.field4012 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4003));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4003));
        this.field4002.method581(this.field4031 - var8 / 2, this.field4011 - var9 / 2, var8 / 2 + this.field4031, var9 / 2 + this.field4011, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4027) {
            boolean var10 = false;
            if (arg4 - this.field4028 > 100) {
                this.field4028 = arg4;
                var10 = true;
            }
            this.field4002.method582(this.field4031 - var8 / 2, this.field4011 - var9 / 2, var8 / 2 + this.field4031, var9 / 2 + this.field4011, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4026, this.field4012, this.field4014, this.field4010, var10);
        }
        this.method5964(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method3294() && this.field4034 && this.field3990 != null) {
            this.field3994.method5053("Coord: " + this.field3990, class331.field3883 + 10, class331.field3881 + 20, 16776960, -1);
        }
        this.field4005 = var8;
        this.field4021 = var9;
        this.field4007 = arg0;
        this.field3981 = arg1;
        class331.method5656(var6);
    }

    @ObfuscatedName("mx.b(IIIIIII)Z")
    public boolean method5963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4017 == null) {
            return true;
        } else if (this.field4017.field3905 != arg0 || this.field4017.field3907 != arg1) {
            return true;
        } else if (this.field4002.field345 != this.field3992) {
            return true;
        } else if (client.field947 != this.field4039) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("mx.l(IIIIIII)V")
    public void method5964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1902 == null) {
            return;
        }
        int var7 = 512 / (this.field4002.field345 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6101() - arg4 / 2 - var7;
        int var14 = this.method5978() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4002.field345 * (var7 + var13 - this.field4037);
        int var16 = arg1 - this.field4002.field345 * (var7 - (var14 - this.field4006));
        if (this.method5963(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4017 != null && this.field4017.field3905 == var11 && this.field4017.field3907 == var12) {
                Arrays.fill(this.field4017.field3906, 0);
            } else {
                this.field4017 = new class335(var11, var12);
            }
            this.field4037 = this.method6101() - arg4 / 2 - var7;
            this.field4006 = this.method5978() - arg5 / 2 - var7;
            this.field3992 = this.field4002.field345;
            Statics.field1902.method4032(this.field4037, this.field4006, this.field4017, (float) this.field3992 / var10);
            this.field4039 = client.field947;
            var15 = arg0 - this.field4002.field345 * (var7 + var13 - this.field4037);
            var16 = arg1 - this.field4002.field345 * (var7 - (var14 - this.field4006));
        }
        class331.method5660(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4017.method5779(var15, var16, 192);
        } else {
            this.field4017.method5797(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("mx.e(IIIIB)V")
    public void method6133(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3998.method5931()) {
            return;
        }
        if (!this.field4002.method613()) {
            this.field4002.method579(this.field3984, this.field3995.method343(), client.field675);
            if (!this.field4002.method613()) {
                return;
            }
        }
        this.field4002.method583(arg0, arg1, arg2, arg3, this.field4012, this.field4014, this.field4010);
    }

    @ObfuscatedName("mx.ab(II)V")
    public void method5966(int arg0) {
        this.field4004 = this.method6088(arg0);
    }

    @ObfuscatedName("mx.ag(IIIIII)V")
    public void method6040(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class331.method5661(arg0, arg1, arg2, arg3, -16777216);
        class331.method5665(var7 - 152, var8, 304, 34, -65536);
        class331.method5661(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3994.method5056(class234.field3099, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("mx.ao(IB)F")
    public float method6088(int arg0) {
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

    @ObfuscatedName("mx.ae(I)I")
    public int method5969() {
        if ((double) this.field4004 == 1.0D) {
            return 25;
        } else if ((double) this.field4004 == 1.5D) {
            return 37;
        } else if ((double) this.field4004 == 2.0D) {
            return 50;
        } else if ((double) this.field4004 == 3.0D) {
            return 75;
        } else if ((double) this.field4004 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("mx.ap(I)V")
    public void method6117() {
        this.field3998.method5930();
    }

    @ObfuscatedName("mx.au(I)Z")
    public boolean method5971() {
        return this.field3998.method5931();
    }

    @ObfuscatedName("mx.aa(II)Lar;")
    public class36 method5972(int arg0) {
        Iterator var2 = this.field3993.values().iterator();
        class36 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class36) var2.next();
        } while (var3.method333() != arg0);
        return var3;
    }

    @ObfuscatedName("mx.ar(III)V")
    public void method5973(int arg0, int arg1) {
        if (this.field3995 != null && this.field3995.method337(arg0, arg1)) {
            this.field4001 = arg0 - this.field3995.method380() * 64;
            this.field4015 = arg1 - this.field3995.method349() * 64;
        }
    }

    @ObfuscatedName("mx.at(IIB)V")
    public void method6110(int arg0, int arg1) {
        if (this.field3995 != null) {
            this.method5950(arg0 - this.field3995.method380() * 64, arg1 - this.field3995.method349() * 64, true);
            this.field4001 = -1;
            this.field4015 = -1;
        }
    }

    @ObfuscatedName("mx.aq(IIII)V")
    public void method5975(int arg0, int arg1, int arg2) {
        if (this.field3995 != null) {
            int[] var4 = this.field3995.method338(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5973(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mx.al(IIII)V")
    public void method6119(int arg0, int arg1, int arg2) {
        if (this.field3995 != null) {
            int[] var4 = this.field3995.method338(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6110(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mx.ah(I)I")
    public int method6101() {
        return this.field3995 == null ? -1 : this.field4031 + this.field3995.method380() * 64;
    }

    @ObfuscatedName("mx.av(I)I")
    public int method5978() {
        return this.field3995 == null ? -1 : this.field4011 + this.field3995.method349() * 64;
    }

    @ObfuscatedName("mx.ax(I)Lhg;")
    public class223 method6074() {
        return this.field3995 == null ? null : this.field3995.method378(this.method6101(), this.method5978());
    }

    @ObfuscatedName("mx.as(I)I")
    public int method6137() {
        return this.field4005;
    }

    @ObfuscatedName("mx.az(I)I")
    public int method5981() {
        return this.field4021;
    }

    @ObfuscatedName("mx.ad(IB)V")
    public void method5982(int arg0) {
        if (arg0 >= 1) {
            this.field4009 = arg0;
        }
    }

    @ObfuscatedName("mx.ai(B)V")
    public void method6072() {
        this.field4009 = 3;
    }

    @ObfuscatedName("mx.ay(II)V")
    public void method5961(int arg0) {
        if (arg0 >= 1) {
            this.field4010 = arg0;
        }
    }

    @ObfuscatedName("mx.aj(I)V")
    public void method5985() {
        this.field4010 = 50;
    }

    @ObfuscatedName("mx.aw(ZB)V")
    public void method5986(boolean arg0) {
        this.field3997 = arg0;
    }

    @ObfuscatedName("mx.af(IB)V")
    public void method5987(int arg0) {
        this.field4012 = new HashSet();
        this.field4012.add(arg0);
        this.field4033 = 0;
        this.field4014 = 0;
    }

    @ObfuscatedName("mx.ak(IB)V")
    public void method5988(int arg0) {
        this.field4012 = new HashSet();
        this.field4033 = 0;
        this.field4014 = 0;
        for (int var2 = 0; var2 < Statics.field3238; var2++) {
            if (Statics.method285(var2) != null && Statics.method285(var2).field3257 == arg0) {
                this.field4012.add(Statics.method285(var2).field3240);
            }
        }
    }

    @ObfuscatedName("mx.ac(I)V")
    public void method5989() {
        this.field4012 = null;
    }

    @ObfuscatedName("mx.bl(ZI)V")
    public void method6058(boolean arg0) {
        this.field4027 = !arg0;
    }

    @ObfuscatedName("mx.bc(IZS)V")
    public void method5991(int arg0, boolean arg1) {
        if (arg1) {
            this.field4023.remove(arg0);
        } else {
            this.field4023.add(arg0);
        }
        this.method5996();
    }

    @ObfuscatedName("mx.bz(IZS)V")
    public void method5992(int arg0, boolean arg1) {
        if (arg1) {
            this.field4024.remove(arg0);
        } else {
            this.field4024.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3238; var3++) {
            if (Statics.method285(var3) != null && Statics.method285(var3).field3257 == arg0) {
                int var4 = Statics.method285(var3).field3240;
                if (arg1) {
                    this.field3986.remove(var4);
                } else {
                    this.field3986.add(var4);
                }
            }
        }
        this.method5996();
    }

    @ObfuscatedName("mx.bj(I)Z")
    public boolean method6075() {
        return !this.field4027;
    }

    @ObfuscatedName("mx.bh(II)Z")
    public boolean method5951(int arg0) {
        return !this.field4023.contains(arg0);
    }

    @ObfuscatedName("mx.bi(II)Z")
    public boolean method6005(int arg0) {
        return !this.field4024.contains(arg0);
    }

    @ObfuscatedName("mx.bg(I)V")
    public void method5996() {
        this.field4026.clear();
        this.field4026.addAll(this.field4023);
        this.field4026.addAll(this.field3986);
    }

    @ObfuscatedName("mx.br(IIIIIIB)V")
    public void method5997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3998.method5931()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4003));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4003));
        List var9 = this.field4002.method616(this.field4031 - var7 / 2 - 1, this.field4011 - var8 / 2 - 1, var7 / 2 + this.field4031 + 1, var8 / 2 + this.field4011 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class44 var11 = (class44) var10.next();
            class252 var12 = Statics.method285(var11.method250());
            var13 = false;
            for (int var14 = this.field4020.length - 1; var14 >= 0; var14--) {
                if (var12.field3237[var14] != null) {
                    client.method4259(var12.field3237[var14], var12.field3247, this.field4020[var14], var11.method250(), var11.field313.method3725(), var11.field314.method3725());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("mx.bp(ILhg;S)Lhg;")
    public class223 method6023(int arg0, class223 arg1) {
        if (!this.field3998.method5931()) {
            return null;
        } else if (!this.field4002.method613()) {
            return null;
        } else if (this.field3995.method337(arg1.field2563, arg1.field2565)) {
            HashMap var3 = this.field4002.method587();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class44 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class44 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field314;
                    }
                    var8 = (class44) var7.next();
                    int var9 = var8.field314.field2563 - arg1.field2563;
                    int var10 = var8.field314.field2565 - arg1.field2565;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field314;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("mx.bn(IILhg;Lhg;I)V")
    public void method6018(int arg0, int arg1, class223 arg2, class223 arg3) {
        class72 var5 = new class72();
        class51 var6 = new class51(arg1, arg2, arg3);
        var5.method1086(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1087(10);
                break;
            case 1009:
                var5.method1087(11);
                break;
            case 1010:
                var5.method1087(12);
                break;
            case 1011:
                var5.method1087(13);
                break;
            case 1012:
                var5.method1087(14);
        }
        class86.method2141(var5);
    }

    @ObfuscatedName("mx.bw(I)Laz;")
    public class44 method6017() {
        if (!this.field3998.method5931()) {
            return null;
        } else if (this.field4002.method613()) {
            HashMap var1 = this.field4002.method587();
            this.field4030 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4030.addAll(var3);
            }
            this.field4032 = this.field4030.iterator();
            return this.method6135();
        } else {
            return null;
        }
    }

    @ObfuscatedName("mx.be(S)Laz;")
    public class44 method6135() {
        if (this.field4032 == null) {
            return null;
        }
        class44 var1;
        do {
            if (!this.field4032.hasNext()) {
                return null;
            }
            var1 = (class44) this.field4032.next();
        } while (var1.method250() == -1);
        return var1;
    }
}
