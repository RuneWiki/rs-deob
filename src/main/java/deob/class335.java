package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lp")
public class class335 {

    @ObfuscatedName("lp.z")
    public class262 field4056;

    @ObfuscatedName("lp.i")
    public static final class310 field4041 = class310.field3882;

    @ObfuscatedName("lp.u")
    public static final class310 field4013 = class310.field3883;

    @ObfuscatedName("lp.x")
    public static final class310 field4021 = class310.field3887;

    @ObfuscatedName("lp.y")
    public class312 field4009;

    @ObfuscatedName("lp.a")
    public HashMap field4016;

    @ObfuscatedName("lp.w")
    public class331[] field4064;

    @ObfuscatedName("lp.n")
    public HashMap field4018;

    @ObfuscatedName("lp.l")
    public class33 field4019;

    @ObfuscatedName("lp.s")
    public class33 field4054;

    @ObfuscatedName("lp.v")
    public class33 field4033;

    @ObfuscatedName("lp.q")
    public class43 field4022;

    @ObfuscatedName("lp.r")
    public class334 field4044;

    @ObfuscatedName("lp.j")
    public int field4024;

    @ObfuscatedName("lp.b")
    public int field4025;

    @ObfuscatedName("lp.g")
    public int field4026 = -1;

    @ObfuscatedName("lp.f")
    public int field4027 = -1;

    @ObfuscatedName("lp.p")
    public float field4028;

    @ObfuscatedName("lp.e")
    public float field4029;

    @ObfuscatedName("lp.c")
    public int field4014 = -1;

    @ObfuscatedName("lp.ab")
    public int field4031 = -1;

    @ObfuscatedName("lp.ap")
    public int field4032 = -1;

    @ObfuscatedName("lp.ag")
    public int field4059 = -1;

    @ObfuscatedName("lp.at")
    public int field4034 = 3;

    @ObfuscatedName("lp.ac")
    public int field4035 = 50;

    @ObfuscatedName("lp.al")
    public boolean field4036 = false;

    @ObfuscatedName("lp.ah")
    public HashSet field4037 = null;

    @ObfuscatedName("lp.af")
    public int field4038 = -1;

    @ObfuscatedName("lp.aq")
    public int field4039 = -1;

    @ObfuscatedName("lp.ai")
    public int field4011 = -1;

    @ObfuscatedName("lp.az")
    public int field4023 = -1;

    @ObfuscatedName("lp.aa")
    public int field4042 = -1;

    @ObfuscatedName("lp.av")
    public int field4043 = -1;

    @ObfuscatedName("lp.am")
    public long field4020;

    @ObfuscatedName("lp.ao")
    public int field4045;

    @ObfuscatedName("lp.ax")
    public int field4046;

    @ObfuscatedName("lp.ad")
    public boolean field4053 = true;

    @ObfuscatedName("lp.an")
    public HashSet field4008 = new HashSet();

    @ObfuscatedName("lp.ae")
    public HashSet field4049 = new HashSet();

    @ObfuscatedName("lp.aw")
    public HashSet field4050 = new HashSet();

    @ObfuscatedName("lp.ak")
    public HashSet field4051 = new HashSet();

    @ObfuscatedName("lp.as")
    public boolean field4052 = false;

    @ObfuscatedName("lp.aj")
    public int field4063 = 0;

    @ObfuscatedName("lp.bm")
    public final int[] field4062 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lp.bx")
    public List field4055;

    @ObfuscatedName("lp.bl")
    public Iterator field4007;

    @ObfuscatedName("lp.bf")
    public HashSet field4057 = new HashSet();

    @ObfuscatedName("lp.bp")
    public class239 field4058 = null;

    @ObfuscatedName("lp.bs")
    public boolean field4017 = false;

    @ObfuscatedName("lp.bu")
    public class332 field4048;

    @ObfuscatedName("lp.br")
    public int field4061;

    @ObfuscatedName("lp.bk")
    public int field4040 = -1;

    @ObfuscatedName("lp.bn")
    public int field4015 = -1;

    @ObfuscatedName("lp.bj")
    public int field4030 = -1;

    @ObfuscatedName("lp.o(Ljf;Lki;Ljava/util/HashMap;[Lll;I)V")
    public void method5567(class262 arg0, class312 arg1, HashMap arg2, class331[] arg3) {
        this.field4064 = arg3;
        this.field4056 = arg0;
        this.field4009 = arg1;
        this.field4016 = new HashMap();
        this.field4016.put(class25.field372, arg2.get(field4041));
        this.field4016.put(class25.field364, arg2.get(field4013));
        this.field4016.put(class25.field369, arg2.get(field4021));
        this.field4044 = new class334(arg0);
        int var5 = this.field4056.method4175(class42.field536.field539);
        int[] var6 = this.field4056.method4168(var5);
        this.field4018 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class195 var8 = new class195(this.field4056.method4241(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method279(var8, var6[var7]);
            this.field4018.put(var9.method288(), var9);
            if (var9.method287()) {
                this.field4019 = var9;
            }
        }
        this.method5583(this.field4019);
        this.field4033 = null;
    }

    @ObfuscatedName("lp.k(I)I")
    public int method5618() {
        return this.field4056.method4179(this.field4019.method288(), class42.field534.field539) ? 100 : this.field4056.method4182(this.field4019.method288());
    }

    @ObfuscatedName("lp.t(B)V")
    public void method5569() {
        class36.field480.method3618(5);
        class36.field481.method3618(5);
    }

    @ObfuscatedName("lp.d(IIZIIIIB)V")
    public void method5570(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4044.method5558()) {
            return;
        }
        this.method5573();
        this.method5574();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4028));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4028));
        List var10 = this.field4022.method533(this.field4024 - var8 / 2 - 1, this.field4025 - var9 / 2 - 1, var8 / 2 + this.field4024 + 1, var9 / 2 + this.field4025 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class41 var13 = (class41) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class49 var15 = new class49(var13.field524, var13.field525, var13.field533);
            var14.method1024(new Object[] { var15, arg0, arg1 });
            if (this.field4057.contains(var13)) {
                var14.method1025(class246.field2967);
            } else {
                var14.method1025(class246.field2969);
            }
            class82.method2061(var14);
        }
        Iterator var16 = this.field4057.iterator();
        while (var16.hasNext()) {
            class41 var17 = (class41) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class49 var19 = new class49(var17.field524, var17.field525, var17.field533);
                var18.method1024(new Object[] { var19, arg0, arg1 });
                var18.method1025(class246.field2972);
                class82.method2061(var18);
            }
        }
        this.field4057 = var11;
    }

    @ObfuscatedName("lp.h(IIZZI)V")
    public void method5571(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class197.method1005();
        this.method5572(arg0, arg1, arg3, var5);
        if (!this.method5578() && arg3 || arg2) {
            if (arg3) {
                this.field4042 = arg0;
                this.field4043 = arg1;
                this.field4011 = this.field4024;
                this.field4023 = this.field4025;
            }
            if (this.field4011 != -1) {
                int var7 = arg0 - this.field4042;
                int var8 = arg1 - this.field4043;
                this.method5575(this.field4011 - (int) ((float) var7 / this.field4029), this.field4023 + (int) ((float) var8 / this.field4029), false);
            }
        } else {
            this.method5631();
        }
        if (arg3) {
            this.field4020 = var5;
            this.field4045 = arg0;
            this.field4046 = arg1;
        }
    }

    @ObfuscatedName("lp.m(IIZJ)V")
    public void method5572(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4054 == null) {
            this.field4058 = null;
            return;
        }
        int var6 = (int) ((float) this.field4024 + ((float) (arg0 - this.field4032) - (float) this.method5605() * this.field4028 / 2.0F) / this.field4028);
        int var7 = (int) ((float) this.field4025 - ((float) (arg1 - this.field4059) - (float) this.method5606() * this.field4028 / 2.0F) / this.field4028);
        this.field4058 = this.field4054.method284(var6 + this.field4054.method350() * 64, var7 + this.field4054.method294() * 64);
        if (this.field4058 == null || !arg2) {
            return;
        }
        boolean var8 = client.field1102 >= 2;
        if (var8 && class52.field625[82] && class52.field625[81]) {
            client.method155(this.field4058.field2787, this.field4058.field2785, this.field4058.field2784, false);
            return;
        }
        boolean var9 = true;
        if (this.field4053) {
            int var10 = arg0 - this.field4045;
            int var11 = arg1 - this.field4046;
            if (arg3 - this.field4020 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class185 var12 = class185.method267(class182.field2410, client.field958.field1485);
            var12.field2505.method3247(this.field4058.method3997());
            client.field958.method1882(var12);
            this.field4020 = 0L;
        }
    }

    @ObfuscatedName("lp.z(B)V")
    public void method5573() {
        if (Statics.field26 != null) {
            this.field4028 = this.field4029;
            return;
        }
        if (this.field4028 < this.field4029) {
            this.field4028 = Math.min(this.field4029, this.field4028 / 30.0F + this.field4028);
        }
        if (this.field4028 > this.field4029) {
            this.field4028 = Math.max(this.field4029, this.field4028 - this.field4028 / 30.0F);
        }
    }

    @ObfuscatedName("lp.i(I)V")
    public void method5574() {
        if (!this.method5578()) {
            return;
        }
        int var1 = this.field4026 - this.field4024;
        int var2 = this.field4027 - this.field4025;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5575(this.field4024 + var1, this.field4025 + var2, true);
        if (this.field4026 == this.field4024 && this.field4027 == this.field4025) {
            this.field4026 = -1;
            this.field4027 = -1;
        }
    }

    @ObfuscatedName("lp.u(IIZI)V")
    public final void method5575(int arg0, int arg1, boolean arg2) {
        this.field4024 = arg0;
        this.field4025 = arg1;
        class197.method1005();
        if (arg2) {
            this.method5631();
        }
    }

    @ObfuscatedName("lp.x(S)V")
    public final void method5631() {
        this.field4043 = -1;
        this.field4042 = -1;
        this.field4023 = -1;
        this.field4011 = -1;
    }

    @ObfuscatedName("lp.y(I)Z")
    public boolean method5578() {
        return this.field4026 != -1 && this.field4027 != -1;
    }

    @ObfuscatedName("lp.a(IIII)Lah;")
    public class33 method5622(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4018.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method281(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lp.v(IIIZI)V")
    public void method5579(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5622(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4019;
        }
        boolean var6 = false;
        if (this.field4033 != var5 || arg3) {
            this.field4033 = var5;
            this.method5583(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5734(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lp.q(IB)V")
    public void method5580(int arg0) {
        class33 var2 = this.method5597(arg0);
        if (var2 != null) {
            this.method5583(var2);
        }
    }

    @ObfuscatedName("lp.r(I)I")
    public int method5581() {
        return this.field4054 == null ? -1 : this.field4054.method286();
    }

    @ObfuscatedName("lp.j(I)Lah;")
    public class33 method5582() {
        return this.field4054;
    }

    @ObfuscatedName("lp.b(Lah;B)V")
    public void method5583(class33 arg0) {
        if (this.field4054 == null || this.field4054 != arg0) {
            this.method5584(arg0);
            this.method5734(-1, -1, -1);
        }
    }

    @ObfuscatedName("lp.g(Lah;I)V")
    public void method5584(class33 arg0) {
        this.field4054 = arg0;
        this.field4022 = new class43(this.field4064, this.field4016);
        this.field4044.method5556(this.field4054.method288());
    }

    @ObfuscatedName("lp.f(Lah;Lix;Lix;ZI)V")
    public void method5585(class33 arg0, class239 arg1, class239 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4054 == null || this.field4054 != arg0) {
            this.method5584(arg0);
        }
        if (!arg3 && this.field4054.method281(arg1.field2784, arg1.field2787, arg1.field2785)) {
            this.method5734(arg1.field2784, arg1.field2787, arg1.field2785);
        } else {
            this.method5734(arg2.field2784, arg2.field2787, arg2.field2785);
        }
    }

    @ObfuscatedName("lp.p(IIIS)V")
    public void method5734(int arg0, int arg1, int arg2) {
        if (this.field4054 == null) {
            return;
        }
        int[] var4 = this.field4054.method283(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4054.method283(this.field4054.method348(), this.field4054.method296(), this.field4054.method298());
        }
        this.method5575(var4[0] - this.field4054.method350() * 64, var4[1] - this.field4054.method294() * 64, true);
        this.field4026 = -1;
        this.field4027 = -1;
        this.field4028 = this.method5566(this.field4054.method300());
        this.field4029 = this.field4028;
        this.field4055 = null;
        this.field4007 = null;
        this.field4022.method528();
    }

    @ObfuscatedName("lp.e(IIIIII)V")
    public void method5692(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class328.method5289(var6);
        class328.method5287(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class328.method5295(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4044.method5559();
        if (var7 < 100) {
            this.method5658(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4022.method535()) {
            this.field4022.method527(this.field4056, this.field4054.method288(), client.field874);
            if (!this.field4022.method535()) {
                return;
            }
        }
        if (this.field4037 != null) {
            this.field4039++;
            if (this.field4039 % this.field4035 == 0) {
                this.field4039 = 0;
                this.field4038++;
            }
            if (this.field4038 >= this.field4034 && !this.field4036) {
                this.field4037 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4028));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4028));
        this.field4022.method556(this.field4024 - var8 / 2, this.field4025 - var9 / 2, var8 / 2 + this.field4024, var9 / 2 + this.field4025, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4052) {
            boolean var10 = false;
            if (arg4 - this.field4063 > 100) {
                this.field4063 = arg4;
                var10 = true;
            }
            this.field4022.method560(this.field4024 - var8 / 2, this.field4025 - var9 / 2, var8 / 2 + this.field4024, var9 / 2 + this.field4025, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4051, this.field4037, this.field4039, this.field4035, var10);
        }
        this.method5589(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field1102 >= 2;
        if (var11 && this.field4017 && this.field4058 != null) {
            this.field4009.method5088("Coord: " + this.field4058, class328.field3961 + 10, class328.field3957 + 20, 16776960, -1);
        }
        this.field4014 = var8;
        this.field4031 = var9;
        this.field4032 = arg0;
        this.field4059 = arg1;
        class328.method5290(var6);
    }

    @ObfuscatedName("lp.c(IIIIIIB)Z")
    public boolean method5588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4048 == null) {
            return true;
        } else if (this.field4048.field3983 != arg0 || this.field4048.field3988 != arg1) {
            return true;
        } else if (this.field4022.field549 != this.field4061) {
            return true;
        } else if (client.field1136 != this.field4030) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lp.ag(IIIIIIB)V")
    public void method5589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field26 == null) {
            return;
        }
        int var7 = 512 / (this.field4022.field549 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5608() - arg4 / 2 - var7;
        int var14 = this.method5603() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4022.field549 * (var7 + var13 - this.field4040);
        int var16 = arg1 - this.field4022.field549 * (var7 - (var14 - this.field4015));
        if (this.method5588(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4048 != null && this.field4048.field3983 == var11 && this.field4048.field3988 == var12) {
                Arrays.fill(this.field4048.field3984, 0);
            } else {
                this.field4048 = new class332(var11, var12);
            }
            this.field4040 = this.method5608() - arg4 / 2 - var7;
            this.field4015 = this.method5603() - arg5 / 2 - var7;
            this.field4061 = this.field4022.field549;
            Statics.field26.method4305(this.field4040, this.field4015, this.field4048, (float) this.field4061 / var10);
            this.field4030 = client.field1136;
            var15 = arg0 - this.field4022.field549 * (var7 + var13 - this.field4040);
            var16 = arg1 - this.field4022.field549 * (var7 - (var14 - this.field4015));
        }
        class328.method5294(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4048.method5429(var15, var16, 192);
        } else {
            this.field4048.method5495(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lp.at(IIIIS)V")
    public void method5613(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4044.method5558()) {
            return;
        }
        if (!this.field4022.method535()) {
            this.field4022.method527(this.field4056, this.field4054.method288(), client.field874);
            if (!this.field4022.method535()) {
                return;
            }
        }
        this.field4022.method532(arg0, arg1, arg2, arg3, this.field4037, this.field4039, this.field4035);
    }

    @ObfuscatedName("lp.ac(II)V")
    public void method5591(int arg0) {
        this.field4029 = this.method5566(arg0);
    }

    @ObfuscatedName("lp.al(IIIIII)V")
    public void method5658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class328.method5295(arg0, arg1, arg2, arg3, -16777216);
        class328.method5302(var7 - 152, var8, 304, 34, -65536);
        class328.method5295(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4009.method5091(class252.field3307, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lp.ah(II)F")
    public float method5566(int arg0) {
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

    @ObfuscatedName("lp.af(I)I")
    public int method5594() {
        if ((double) this.field4029 == 1.0D) {
            return 25;
        } else if ((double) this.field4029 == 1.5D) {
            return 37;
        } else if ((double) this.field4029 == 2.0D) {
            return 50;
        } else if ((double) this.field4029 == 3.0D) {
            return 75;
        } else if ((double) this.field4029 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lp.aq(B)V")
    public void method5595() {
        this.field4044.method5557();
    }

    @ObfuscatedName("lp.ai(B)Z")
    public boolean method5596() {
        return this.field4044.method5558();
    }

    @ObfuscatedName("lp.az(II)Lah;")
    public class33 method5597(int arg0) {
        Iterator var2 = this.field4018.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method286() != arg0);
        return var3;
    }

    @ObfuscatedName("lp.aa(III)V")
    public void method5598(int arg0, int arg1) {
        if (this.field4054 != null && this.field4054.method297(arg0, arg1)) {
            this.field4026 = arg0 - this.field4054.method350() * 64;
            this.field4027 = arg1 - this.field4054.method294() * 64;
        }
    }

    @ObfuscatedName("lp.av(III)V")
    public void method5599(int arg0, int arg1) {
        if (this.field4054 != null) {
            this.method5575(arg0 - this.field4054.method350() * 64, arg1 - this.field4054.method294() * 64, true);
            this.field4026 = -1;
            this.field4027 = -1;
        }
    }

    @ObfuscatedName("lp.am(IIIB)V")
    public void method5590(int arg0, int arg1, int arg2) {
        if (this.field4054 != null) {
            int[] var4 = this.field4054.method283(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5598(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lp.ao(IIII)V")
    public void method5601(int arg0, int arg1, int arg2) {
        if (this.field4054 != null) {
            int[] var4 = this.field4054.method283(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5599(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lp.ax(B)I")
    public int method5608() {
        return this.field4054 == null ? -1 : this.field4024 + this.field4054.method350() * 64;
    }

    @ObfuscatedName("lp.ad(B)I")
    public int method5603() {
        return this.field4054 == null ? -1 : this.field4025 + this.field4054.method294() * 64;
    }

    @ObfuscatedName("lp.au(I)Lix;")
    public class239 method5604() {
        return this.field4054 == null ? null : this.field4054.method284(this.method5608(), this.method5603());
    }

    @ObfuscatedName("lp.ar(I)I")
    public int method5605() {
        return this.field4014;
    }

    @ObfuscatedName("lp.an(I)I")
    public int method5606() {
        return this.field4031;
    }

    @ObfuscatedName("lp.ae(II)V")
    public void method5679(int arg0) {
        if (arg0 >= 1) {
            this.field4034 = arg0;
        }
    }

    @ObfuscatedName("lp.aw(I)V")
    public void method5718() {
        this.field4034 = 3;
    }

    @ObfuscatedName("lp.ak(IB)V")
    public void method5609(int arg0) {
        if (arg0 >= 1) {
            this.field4035 = arg0;
        }
    }

    @ObfuscatedName("lp.as(B)V")
    public void method5702() {
        this.field4035 = 50;
    }

    @ObfuscatedName("lp.aj(ZI)V")
    public void method5667(boolean arg0) {
        this.field4036 = arg0;
    }

    @ObfuscatedName("lp.ay(IB)V")
    public void method5612(int arg0) {
        this.field4037 = new HashSet();
        this.field4037.add(arg0);
        this.field4038 = 0;
        this.field4039 = 0;
    }

    @ObfuscatedName("lp.bm(II)V")
    public void method5695(int arg0) {
        this.field4037 = new HashSet();
        this.field4038 = 0;
        this.field4039 = 0;
        for (int var2 = 0; var2 < Statics.field3455.length; var2++) {
            if (Statics.field3455[var2] != null && Statics.field3455[var2].field3474 == arg0) {
                this.field4037.add(Statics.field3455[var2].field3464);
            }
        }
    }

    @ObfuscatedName("lp.bx(I)V")
    public void method5721() {
        this.field4037 = null;
    }

    @ObfuscatedName("lp.bl(ZI)V")
    public void method5615(boolean arg0) {
        this.field4052 = !arg0;
    }

    @ObfuscatedName("lp.bf(IZB)V")
    public void method5616(int arg0, boolean arg1) {
        if (arg1) {
            this.field4008.remove(arg0);
        } else {
            this.field4008.add(arg0);
        }
        this.method5621();
    }

    @ObfuscatedName("lp.bp(IZB)V")
    public void method5617(int arg0, boolean arg1) {
        if (arg1) {
            this.field4049.remove(arg0);
        } else {
            this.field4049.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3455.length; var3++) {
            if (Statics.field3455[var3] != null && Statics.field3455[var3].field3474 == arg0) {
                int var4 = Statics.field3455[var3].field3464;
                if (arg1) {
                    this.field4050.remove(var4);
                } else {
                    this.field4050.add(var4);
                }
            }
        }
        this.method5621();
    }

    @ObfuscatedName("lp.bs(B)Z")
    public boolean method5635() {
        return !this.field4052;
    }

    @ObfuscatedName("lp.bu(II)Z")
    public boolean method5619(int arg0) {
        return !this.field4008.contains(arg0);
    }

    @ObfuscatedName("lp.br(IB)Z")
    public boolean method5620(int arg0) {
        return !this.field4049.contains(arg0);
    }

    @ObfuscatedName("lp.bk(I)V")
    public void method5621() {
        this.field4051.clear();
        this.field4051.addAll(this.field4008);
        this.field4051.addAll(this.field4050);
    }

    @ObfuscatedName("lp.bn(IIIIIII)V")
    public void method5638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4044.method5558()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4028));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4028));
        List var9 = this.field4022.method533(this.field4024 - var7 / 2 - 1, this.field4025 - var8 / 2 - 1, var7 / 2 + this.field4024 + 1, var8 / 2 + this.field4025 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class41 var11 = (class41) var10.next();
            class270 var12 = Statics.field3455[var11.field524];
            var13 = false;
            for (int var14 = this.field4062.length - 1; var14 >= 0; var14--) {
                if (var12.field3463[var14] != null) {
                    client.method2372(var12.field3463[var14], var12.field3471, this.field4062[var14], var11.field524, var11.field525.method3997(), var11.field533.method3997());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lp.bj(ILix;I)Lix;")
    public class239 method5623(int arg0, class239 arg1) {
        if (!this.field4044.method5558()) {
            return null;
        } else if (!this.field4022.method535()) {
            return null;
        } else if (this.field4054.method297(arg1.field2787, arg1.field2785)) {
            HashMap var3 = this.field4022.method549();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class41 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class41 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field533;
                    }
                    var8 = (class41) var7.next();
                    int var9 = var8.field533.field2787 - arg1.field2787;
                    int var10 = var8.field533.field2785 - arg1.field2785;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field533;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lp.bo(IILix;Lix;I)V")
    public void method5671(int arg0, int arg1, class239 arg2, class239 arg3) {
        class69 var5 = new class69();
        class49 var6 = new class49(arg1, arg2, arg3);
        var5.method1024(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1025(class246.field2977);
                break;
            case 1009:
                var5.method1025(class246.field2970);
                break;
            case 1010:
                var5.method1025(class246.field2966);
                break;
            case 1011:
                var5.method1025(class246.field2971);
                break;
            case 1012:
                var5.method1025(class246.field2968);
        }
        class82.method2061(var5);
    }

    @ObfuscatedName("lp.be(I)Lao;")
    public class41 method5625() {
        if (!this.field4044.method5558()) {
            return null;
        } else if (this.field4022.method535()) {
            HashMap var1 = this.field4022.method549();
            this.field4055 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4055.addAll(var3);
            }
            this.field4007 = this.field4055.iterator();
            return this.method5626();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lp.bq(I)Lao;")
    public class41 method5626() {
        if (this.field4007 == null) {
            return null;
        } else if (this.field4007.hasNext()) {
            return (class41) this.field4007.next();
        } else {
            return null;
        }
    }
}
