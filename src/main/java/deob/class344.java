package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ma")
public class class344 {

    @ObfuscatedName("ma.n")
    public class245 field3994;

    @ObfuscatedName("ma.p")
    public class245 field4004;

    @ObfuscatedName("ma.l")
    public class245 field3996;

    @ObfuscatedName("ma.z")
    public static final class303 field3997 = class303.field3702;

    @ObfuscatedName("ma.u")
    public static final class303 field3998 = class303.field3704;

    @ObfuscatedName("ma.e")
    public static final class303 field4045 = class303.field3699;

    @ObfuscatedName("ma.m")
    public class306 field4000;

    @ObfuscatedName("ma.c")
    public HashMap field4001;

    @ObfuscatedName("ma.i")
    public class335[] field4023;

    @ObfuscatedName("ma.f")
    public HashMap field4027;

    @ObfuscatedName("ma.a")
    public class36 field3995;

    @ObfuscatedName("ma.b")
    public class36 field4015;

    @ObfuscatedName("ma.y")
    public class36 field4006;

    @ObfuscatedName("ma.r")
    public class46 field4021;

    @ObfuscatedName("ma.q")
    public class343 field4008;

    @ObfuscatedName("ma.g")
    public int field4016;

    @ObfuscatedName("ma.s")
    public int field4010;

    @ObfuscatedName("ma.o")
    public int field4011 = -1;

    @ObfuscatedName("ma.k")
    public int field4012 = -1;

    @ObfuscatedName("ma.d")
    public float field4013;

    @ObfuscatedName("ma.an")
    public float field4014;

    @ObfuscatedName("ma.aj")
    public int field3999 = -1;

    @ObfuscatedName("ma.ax")
    public int field4020 = -1;

    @ObfuscatedName("ma.ag")
    public int field4017 = -1;

    @ObfuscatedName("ma.au")
    public int field4018 = -1;

    @ObfuscatedName("ma.as")
    public int field4019 = 3;

    @ObfuscatedName("ma.ae")
    public int field4022 = 50;

    @ObfuscatedName("ma.ac")
    public boolean field4007 = false;

    @ObfuscatedName("ma.ak")
    public HashSet field4003 = null;

    @ObfuscatedName("ma.av")
    public int field4042 = -1;

    @ObfuscatedName("ma.aq")
    public int field4024 = -1;

    @ObfuscatedName("ma.ah")
    public int field4025 = -1;

    @ObfuscatedName("ma.am")
    public int field4026 = -1;

    @ObfuscatedName("ma.aa")
    public int field3991 = -1;

    @ObfuscatedName("ma.ao")
    public int field4028 = -1;

    @ObfuscatedName("ma.ab")
    public long field4035;

    @ObfuscatedName("ma.aw")
    public int field4030;

    @ObfuscatedName("ma.ap")
    public int field4031;

    @ObfuscatedName("ma.ad")
    public boolean field4032 = true;

    @ObfuscatedName("ma.ay")
    public HashSet field4029 = new HashSet();

    @ObfuscatedName("ma.af")
    public HashSet field3989 = new HashSet();

    @ObfuscatedName("ma.ar")
    public HashSet field4033 = new HashSet();

    @ObfuscatedName("ma.az")
    public HashSet field4036 = new HashSet();

    @ObfuscatedName("ma.at")
    public boolean field4037 = false;

    @ObfuscatedName("ma.bh")
    public int field4038 = 0;

    @ObfuscatedName("ma.bs")
    public final int[] field4039 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ma.br")
    public List field4040;

    @ObfuscatedName("ma.bl")
    public Iterator field4041;

    @ObfuscatedName("ma.bx")
    public HashSet field4009 = new HashSet();

    @ObfuscatedName("ma.bf")
    public class223 field4043 = null;

    @ObfuscatedName("ma.bz")
    public boolean field4044 = false;

    @ObfuscatedName("ma.bm")
    public class336 field4034;

    @ObfuscatedName("ma.bn")
    public int field4046;

    @ObfuscatedName("ma.bd")
    public int field4047 = -1;

    @ObfuscatedName("ma.bc")
    public int field4048 = -1;

    @ObfuscatedName("ma.bi")
    public int field4049 = -1;

    @ObfuscatedName("ma.h(Lib;Lib;Lib;Lku;Ljava/util/HashMap;[Llo;I)V")
    public void method5878(class245 arg0, class245 arg1, class245 arg2, class306 arg3, HashMap arg4, class335[] arg5) {
        this.field4023 = arg5;
        this.field3994 = arg0;
        this.field4004 = arg1;
        this.field3996 = arg2;
        this.field4000 = arg3;
        this.field4001 = new HashMap();
        this.field4001.put(class27.field132, arg4.get(field3997));
        this.field4001.put(class27.field135, arg4.get(field3998));
        this.field4001.put(class27.field131, arg4.get(field4045));
        this.field4008 = new class343(arg0);
        int var7 = this.field3994.method3880(class45.field329.field331);
        int[] var8 = this.field3994.method3845(var7);
        this.field4027 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class311 var10 = new class311(this.field3994.method3834(var7, var8[var9]));
            class36 var11 = new class36();
            var11.method339(var10, var8[var9]);
            this.field4027.put(var11.method336(), var11);
            if (var11.method335()) {
                this.field3995 = var11;
            }
        }
        this.method5893(this.field3995);
        this.field4006 = null;
    }

    @ObfuscatedName("ma.v(I)V")
    public void method5882() {
        class39.field274.method3178(5);
    }

    @ObfuscatedName("ma.x(IIZIIIII)V")
    public void method5880(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4008.method5872()) {
            return;
        }
        this.method5956();
        this.method5884();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4013));
        List var10 = this.field4021.method619(this.field4016 - var8 / 2 - 1, this.field4010 - var9 / 2 - 1, var8 / 2 + this.field4016 + 1, var9 / 2 + this.field4010 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class44 var13 = (class44) var12.next();
            var11.add(var13);
            class72 var14 = new class72();
            class51 var15 = new class51(var13.method244(), var13.field320, var13.field322);
            var14.method1132(new Object[] { var15, arg0, arg1 });
            if (this.field4009.contains(var13)) {
                var14.method1133(17);
            } else {
                var14.method1133(15);
            }
            class86.method197(var14);
        }
        Iterator var16 = this.field4009.iterator();
        while (var16.hasNext()) {
            class44 var17 = (class44) var16.next();
            if (!var11.contains(var17)) {
                class72 var18 = new class72();
                class51 var19 = new class51(var17.method244(), var17.field320, var17.field322);
                var18.method1132(new Object[] { var19, arg0, arg1 });
                var18.method1133(16);
                class86.method197(var18);
            }
        }
        this.field4009 = var11;
    }

    @ObfuscatedName("ma.w(IIZZI)V")
    public void method5881(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class308.method4891();
        this.method5989(arg0, arg1, arg3, var5);
        if (!this.method5887() && arg3 || arg2) {
            if (arg3) {
                this.field3991 = arg0;
                this.field4028 = arg1;
                this.field4025 = this.field4016;
                this.field4026 = this.field4010;
            }
            if (this.field4025 != -1) {
                int var7 = arg0 - this.field3991;
                int var8 = arg1 - this.field4028;
                this.method5891(this.field4025 - (int) ((float) var7 / this.field4014), this.field4026 + (int) ((float) var8 / this.field4014), false);
            }
        } else {
            this.method5886();
        }
        if (arg3) {
            this.field4035 = var5;
            this.field4030 = arg0;
            this.field4031 = arg1;
        }
    }

    @ObfuscatedName("ma.t(IIZJ)V")
    public void method5989(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4015 == null) {
            this.field4043 = null;
            return;
        }
        int var6 = (int) ((float) this.field4016 + ((float) (arg0 - this.field4017) - (float) this.method5915() * this.field4013 / 2.0F) / this.field4013);
        int var7 = (int) ((float) this.field4010 - ((float) (arg1 - this.field4018) - (float) this.method5916() * this.field4013 / 2.0F) / this.field4013);
        this.field4043 = this.field4015.method326(var6 + this.field4015.method340() * 64, var7 + this.field4015.method342() * 64);
        if (this.field4043 == null || !arg2) {
            return;
        }
        boolean var8 = client.field776 >= 2;
        if (var8 && class55.field417[82] && class55.field417[81]) {
            int var9 = this.field4043.field2547;
            int var10 = this.field4043.field2548;
            int var11 = this.field4043.field2550;
            class197 var12 = class197.method1128(class193.field2270, client.field695.field1329);
            var12.field2361.method5151(var9);
            var12.field2361.method5160(0);
            var12.field2361.method5312(var10);
            var12.field2361.method5095(var11);
            client.field695.method2155(var12);
            return;
        }
        boolean var13 = true;
        if (this.field4032) {
            int var14 = arg0 - this.field4030;
            int var15 = arg1 - this.field4031;
            if (arg3 - this.field4035 > 500L || var14 < -25 || var14 > 25 || var15 < -25 || var15 > 25) {
                var13 = false;
            }
        }
        if (var13) {
            class197 var16 = class197.method1128(class193.field2329, client.field695.field1329);
            var16.field2361.method5160(this.field4043.method3675());
            client.field695.method2155(var16);
            this.field4035 = 0L;
        }
    }

    @ObfuscatedName("ma.j(B)V")
    public void method5956() {
        if (Statics.field149 != null) {
            this.field4013 = this.field4014;
            return;
        }
        if (this.field4013 < this.field4014) {
            this.field4013 = Math.min(this.field4014, this.field4013 / 30.0F + this.field4013);
        }
        if (this.field4013 > this.field4014) {
            this.field4013 = Math.max(this.field4014, this.field4013 - this.field4013 / 30.0F);
        }
    }

    @ObfuscatedName("ma.n(B)V")
    public void method5884() {
        if (!this.method5887()) {
            return;
        }
        int var1 = this.field4011 - this.field4016;
        int var2 = this.field4012 - this.field4010;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5891(this.field4016 + var1, this.field4010 + var2, true);
        if (this.field4016 == this.field4011 && this.field4012 == this.field4010) {
            this.field4011 = -1;
            this.field4012 = -1;
        }
    }

    @ObfuscatedName("ma.p(IIZB)V")
    public final void method5891(int arg0, int arg1, boolean arg2) {
        this.field4016 = arg0;
        this.field4010 = arg1;
        class308.method4891();
        if (arg2) {
            this.method5886();
        }
    }

    @ObfuscatedName("ma.l(I)V")
    public final void method5886() {
        this.field4028 = -1;
        this.field3991 = -1;
        this.field4026 = -1;
        this.field4025 = -1;
    }

    @ObfuscatedName("ma.z(B)Z")
    public boolean method5887() {
        return this.field4011 != -1 && this.field4012 != -1;
    }

    @ObfuscatedName("ma.u(IIII)Lav;")
    public class36 method6064(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4027.values().iterator();
        class36 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class36) var4.next();
        } while (!var5.method329(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ma.e(IIIZB)V")
    public void method5889(int arg0, int arg1, int arg2, boolean arg3) {
        class36 var5 = this.method6064(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3995;
        }
        boolean var6 = false;
        if (this.field4006 != var5 || arg3) {
            this.field4006 = var5;
            this.method5893(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5896(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ma.m(II)V")
    public void method5986(int arg0) {
        class36 var2 = this.method5907(arg0);
        if (var2 != null) {
            this.method5893(var2);
        }
    }

    @ObfuscatedName("ma.c(B)I")
    public int method5981() {
        return this.field4015 == null ? -1 : this.field4015.method334();
    }

    @ObfuscatedName("ma.i(I)Lav;")
    public class36 method5892() {
        return this.field4015;
    }

    @ObfuscatedName("ma.f(Lav;I)V")
    public void method5893(class36 arg0) {
        if (this.field4015 == null || this.field4015 != arg0) {
            this.method5894(arg0);
            this.method5896(-1, -1, -1);
        }
    }

    @ObfuscatedName("ma.y(Lav;B)V")
    public void method5894(class36 arg0) {
        this.field4015 = arg0;
        this.field4021 = new class46(this.field4023, this.field4001, this.field4004, this.field3996);
        this.field4008.method5864(this.field4015.method336());
    }

    @ObfuscatedName("ma.r(Lav;Lhs;Lhs;ZI)V")
    public void method6004(class36 arg0, class223 arg1, class223 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4015 == null || this.field4015 != arg0) {
            this.method5894(arg0);
        }
        if (!arg3 && this.field4015.method329(arg1.field2550, arg1.field2547, arg1.field2548)) {
            this.method5896(arg1.field2550, arg1.field2547, arg1.field2548);
        } else {
            this.method5896(arg2.field2550, arg2.field2547, arg2.field2548);
        }
    }

    @ObfuscatedName("ma.q(IIII)V")
    public void method5896(int arg0, int arg1, int arg2) {
        if (this.field4015 == null) {
            return;
        }
        int[] var4 = this.field4015.method331(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4015.method331(this.field4015.method345(), this.field4015.method344(), this.field4015.method346());
        }
        this.method5891(var4[0] - this.field4015.method340() * 64, var4[1] - this.field4015.method342() * 64, true);
        this.field4011 = -1;
        this.field4012 = -1;
        this.field4013 = this.method5908(this.field4015.method399());
        this.field4014 = this.field4013;
        this.field4040 = null;
        this.field4041 = null;
        this.field4021.method579();
    }

    @ObfuscatedName("ma.g(IIIIII)V")
    public void method5897(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class332.method5575(var6);
        class332.method5573(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class332.method5581(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4008.method5867();
        if (var7 < 100) {
            this.method5932(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4021.method585()) {
            this.field4021.method606(this.field3994, this.field4015.method336(), client.field660);
            if (!this.field4021.method585()) {
                return;
            }
        }
        if (this.field4003 != null) {
            this.field4024++;
            if (this.field4024 % this.field4022 == 0) {
                this.field4024 = 0;
                this.field4042++;
            }
            if (this.field4042 >= this.field4019 && !this.field4007) {
                this.field4003 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        this.field4021.method595(this.field4016 - var8 / 2, this.field4010 - var9 / 2, var8 / 2 + this.field4016, var9 / 2 + this.field4010, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4037) {
            boolean var10 = false;
            if (arg4 - this.field4038 > 100) {
                this.field4038 = arg4;
                var10 = true;
            }
            this.field4021.method581(this.field4016 - var8 / 2, this.field4010 - var9 / 2, var8 / 2 + this.field4016, var9 / 2 + this.field4010, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4036, this.field4003, this.field4024, this.field4022, var10);
        }
        this.method6053(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field776 >= 2;
        if (var11 && this.field4044 && this.field4043 != null) {
            this.field4000.method4956("Coord: " + this.field4043, class332.field3891 + 10, class332.field3888 + 20, 16776960, -1);
        }
        this.field3999 = var8;
        this.field4020 = var9;
        this.field4017 = arg0;
        this.field4018 = arg1;
        class332.method5589(var6);
    }

    @ObfuscatedName("ma.o(IIIIIIB)Z")
    public boolean method6034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4034 == null) {
            return true;
        } else if (this.field4034.field3914 != arg0 || this.field4034.field3912 != arg1) {
            return true;
        } else if (this.field4021.field348 != this.field4046) {
            return true;
        } else if (client.field916 != this.field4049) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ma.an(IIIIIII)V")
    public void method6053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field149 == null) {
            return;
        }
        int var7 = 512 / (this.field4021.field348 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5912() - arg4 / 2 - var7;
        int var14 = this.method5913() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4021.field348 * (var7 + var13 - this.field4047);
        int var16 = arg1 - this.field4021.field348 * (var7 - (var14 - this.field4048));
        if (this.method6034(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4034 != null && this.field4034.field3914 == var11 && this.field4034.field3912 == var12) {
                Arrays.fill(this.field4034.field3918, 0);
            } else {
                this.field4034 = new class336(var11, var12);
            }
            this.field4047 = this.method5912() - arg4 / 2 - var7;
            this.field4048 = this.method5913() - arg5 / 2 - var7;
            this.field4046 = this.field4021.field348;
            Statics.field149.method3980(this.field4047, this.field4048, this.field4034, (float) this.field4046 / var10);
            this.field4049 = client.field916;
            var15 = arg0 - this.field4021.field348 * (var7 + var13 - this.field4047);
            var16 = arg1 - this.field4021.field348 * (var7 - (var14 - this.field4048));
        }
        class332.method5580(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4034.method5703(var15, var16, 192);
        } else {
            this.field4034.method5706(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ma.aj(IIIII)V")
    public void method5900(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4008.method5872()) {
            return;
        }
        if (!this.field4021.method585()) {
            this.field4021.method606(this.field3994, this.field4015.method336(), client.field660);
            if (!this.field4021.method585()) {
                return;
            }
        }
        this.field4021.method582(arg0, arg1, arg2, arg3, this.field4003, this.field4024, this.field4022);
    }

    @ObfuscatedName("ma.ax(II)V")
    public void method5901(int arg0) {
        this.field4014 = this.method5908(arg0);
    }

    @ObfuscatedName("ma.ag(IIIIII)V")
    public void method5932(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class332.method5581(arg0, arg1, arg2, arg3, -16777216);
        class332.method5585(var7 - 152, var8, 304, 34, -65536);
        class332.method5581(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4000.method5049(class234.field3085, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ma.au(II)F")
    public float method5908(int arg0) {
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

    @ObfuscatedName("ma.as(B)I")
    public int method6041() {
        if ((double) this.field4014 == 1.0D) {
            return 25;
        } else if ((double) this.field4014 == 1.5D) {
            return 37;
        } else if ((double) this.field4014 == 2.0D) {
            return 50;
        } else if ((double) this.field4014 == 3.0D) {
            return 75;
        } else if ((double) this.field4014 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ma.ae(I)V")
    public void method6035() {
        this.field4008.method5865();
    }

    @ObfuscatedName("ma.ac(B)Z")
    public boolean method5935() {
        return this.field4008.method5872();
    }

    @ObfuscatedName("ma.ak(IS)Lav;")
    public class36 method5907(int arg0) {
        Iterator var2 = this.field4027.values().iterator();
        class36 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class36) var2.next();
        } while (var3.method334() != arg0);
        return var3;
    }

    @ObfuscatedName("ma.av(IIS)V")
    public void method5974(int arg0, int arg1) {
        if (this.field4015 != null && this.field4015.method330(arg0, arg1)) {
            this.field4011 = arg0 - this.field4015.method340() * 64;
            this.field4012 = arg1 - this.field4015.method342() * 64;
        }
    }

    @ObfuscatedName("ma.aq(IIB)V")
    public void method5909(int arg0, int arg1) {
        if (this.field4015 != null) {
            this.method5891(arg0 - this.field4015.method340() * 64, arg1 - this.field4015.method342() * 64, true);
            this.field4011 = -1;
            this.field4012 = -1;
        }
    }

    @ObfuscatedName("ma.ah(IIII)V")
    public void method5910(int arg0, int arg1, int arg2) {
        if (this.field4015 != null) {
            int[] var4 = this.field4015.method331(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5974(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ma.am(IIII)V")
    public void method5911(int arg0, int arg1, int arg2) {
        if (this.field4015 != null) {
            int[] var4 = this.field4015.method331(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5909(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ma.aa(I)I")
    public int method5912() {
        return this.field4015 == null ? -1 : this.field4016 + this.field4015.method340() * 64;
    }

    @ObfuscatedName("ma.ao(I)I")
    public int method5913() {
        return this.field4015 == null ? -1 : this.field4010 + this.field4015.method342() * 64;
    }

    @ObfuscatedName("ma.ab(I)Lhs;")
    public class223 method5914() {
        return this.field4015 == null ? null : this.field4015.method326(this.method5912(), this.method5913());
    }

    @ObfuscatedName("ma.aw(I)I")
    public int method5915() {
        return this.field3999;
    }

    @ObfuscatedName("ma.ap(B)I")
    public int method5916() {
        return this.field4020;
    }

    @ObfuscatedName("ma.ad(IB)V")
    public void method5917(int arg0) {
        if (arg0 >= 1) {
            this.field4019 = arg0;
        }
    }

    @ObfuscatedName("ma.ai(I)V")
    public void method5918() {
        this.field4019 = 3;
    }

    @ObfuscatedName("ma.al(II)V")
    public void method5955(int arg0) {
        if (arg0 >= 1) {
            this.field4022 = arg0;
        }
    }

    @ObfuscatedName("ma.ay(B)V")
    public void method5920() {
        this.field4022 = 50;
    }

    @ObfuscatedName("ma.af(ZB)V")
    public void method5921(boolean arg0) {
        this.field4007 = arg0;
    }

    @ObfuscatedName("ma.ar(II)V")
    public void method5898(int arg0) {
        this.field4003 = new HashSet();
        this.field4003.add(arg0);
        this.field4042 = 0;
        this.field4024 = 0;
    }

    @ObfuscatedName("ma.az(II)V")
    public void method5923(int arg0) {
        this.field4003 = new HashSet();
        this.field4042 = 0;
        this.field4024 = 0;
        for (int var2 = 0; var2 < Statics.field3263; var2++) {
            if (class253.method3211(var2) != null && class253.method3211(var2).field3253 == arg0) {
                this.field4003.add(class253.method3211(var2).field3249);
            }
        }
    }

    @ObfuscatedName("ma.at(I)V")
    public void method5924() {
        this.field4003 = null;
    }

    @ObfuscatedName("ma.bh(ZI)V")
    public void method5926(boolean arg0) {
        this.field4037 = !arg0;
    }

    @ObfuscatedName("ma.by(IZB)V")
    public void method5962(int arg0, boolean arg1) {
        if (arg1) {
            this.field4029.remove(arg0);
        } else {
            this.field4029.add(arg0);
        }
        this.method5931();
    }

    @ObfuscatedName("ma.bs(IZB)V")
    public void method5927(int arg0, boolean arg1) {
        if (arg1) {
            this.field3989.remove(arg0);
        } else {
            this.field3989.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3263; var3++) {
            if (class253.method3211(var3) != null && class253.method3211(var3).field3253 == arg0) {
                int var4 = class253.method3211(var3).field3249;
                if (arg1) {
                    this.field4033.remove(var4);
                } else {
                    this.field4033.add(var4);
                }
            }
        }
        this.method5931();
    }

    @ObfuscatedName("ma.br(I)Z")
    public boolean method5950() {
        return !this.field4037;
    }

    @ObfuscatedName("ma.bl(II)Z")
    public boolean method5919(int arg0) {
        return !this.field4029.contains(arg0);
    }

    @ObfuscatedName("ma.bx(II)Z")
    public boolean method5937(int arg0) {
        return !this.field3989.contains(arg0);
    }

    @ObfuscatedName("ma.bf(I)V")
    public void method5931() {
        this.field4036.clear();
        this.field4036.addAll(this.field4029);
        this.field4036.addAll(this.field4033);
    }

    @ObfuscatedName("ma.bz(IIIIIII)V")
    public void method6065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4008.method5872()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        List var9 = this.field4021.method619(this.field4016 - var7 / 2 - 1, this.field4010 - var8 / 2 - 1, var7 / 2 + this.field4016 + 1, var8 / 2 + this.field4010 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class253 var12 = class253.method3211(var11.method244());
            var13 = false;
            for (int var14 = this.field4039.length - 1; var14 >= 0; var14--) {
                if (var12.field3245[var14] != null) {
                    client.method506(var12.field3245[var14], var12.field3254, this.field4039[var14], var11.method244(), var11.field320.method3675(), var11.field322.method3675());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ma.bm(ILhs;I)Lhs;")
    public class223 method5933(int arg0, class223 arg1) {
        if (!this.field4008.method5872()) {
            return null;
        } else if (!this.field4021.method585()) {
            return null;
        } else if (this.field4015.method330(arg1.field2547, arg1.field2548)) {
            HashMap var3 = this.field4021.method586();
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
                        return var5.field322;
                    }
                    var8 = (class44) var7.next();
                    int var9 = var8.field322.field2547 - arg1.field2547;
                    int var10 = var8.field322.field2548 - arg1.field2548;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field322;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ma.bn(IILhs;Lhs;B)V")
    public void method5934(int arg0, int arg1, class223 arg2, class223 arg3) {
        class72 var5 = new class72();
        class51 var6 = new class51(arg1, arg2, arg3);
        var5.method1132(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1133(10);
                break;
            case 1009:
                var5.method1133(11);
                break;
            case 1010:
                var5.method1133(12);
                break;
            case 1011:
                var5.method1133(13);
                break;
            case 1012:
                var5.method1133(14);
        }
        class86.method197(var5);
    }

    @ObfuscatedName("ma.bd(I)Lap;")
    public class44 method6017() {
        if (!this.field4008.method5872()) {
            return null;
        } else if (this.field4021.method585()) {
            HashMap var1 = this.field4021.method586();
            this.field4040 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4040.addAll(var3);
            }
            this.field4041 = this.field4040.iterator();
            return this.method5936();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ma.bc(B)Lap;")
    public class44 method5936() {
        if (this.field4041 == null) {
            return null;
        }
        class44 var1;
        do {
            if (!this.field4041.hasNext()) {
                return null;
            }
            var1 = (class44) this.field4041.next();
        } while (var1.method244() == -1);
        return var1;
    }
}
