package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("li")
public class class335 {

    @ObfuscatedName("li.z")
    public class262 field4023;

    @ObfuscatedName("li.p")
    public static final class310 field4022 = class310.field3873;

    @ObfuscatedName("li.w")
    public static final class310 field4009 = class310.field3874;

    @ObfuscatedName("li.r")
    public static final class310 field4010 = class310.field3881;

    @ObfuscatedName("li.d")
    public class312 field4011;

    @ObfuscatedName("li.a")
    public HashMap field4012;

    @ObfuscatedName("li.e")
    public class331[] field4013;

    @ObfuscatedName("li.f")
    public HashMap field4047;

    @ObfuscatedName("li.l")
    public class33 field4015;

    @ObfuscatedName("li.m")
    public class33 field4016;

    @ObfuscatedName("li.b")
    public class33 field4014;

    @ObfuscatedName("li.h")
    public class43 field4024;

    @ObfuscatedName("li.t")
    public class334 field4019;

    @ObfuscatedName("li.v")
    public int field4020;

    @ObfuscatedName("li.n")
    public int field4021;

    @ObfuscatedName("li.u")
    public int field4059 = -1;

    @ObfuscatedName("li.q")
    public int field4008 = -1;

    @ObfuscatedName("li.g")
    public float field4003;

    @ObfuscatedName("li.y")
    public float field4025;

    @ObfuscatedName("li.s")
    public int field4026 = -1;

    @ObfuscatedName("li.ac")
    public int field4018 = -1;

    @ObfuscatedName("li.ap")
    public int field4028 = -1;

    @ObfuscatedName("li.al")
    public int field4029 = -1;

    @ObfuscatedName("li.ai")
    public int field4036 = 3;

    @ObfuscatedName("li.ab")
    public int field4031 = 50;

    @ObfuscatedName("li.ak")
    public boolean field4032 = false;

    @ObfuscatedName("li.as")
    public HashSet field4033 = null;

    @ObfuscatedName("li.aa")
    public int field4034 = -1;

    @ObfuscatedName("li.ah")
    public int field4035 = -1;

    @ObfuscatedName("li.ao")
    public int field4017 = -1;

    @ObfuscatedName("li.am")
    public int field4037 = -1;

    @ObfuscatedName("li.aq")
    public int field4038 = -1;

    @ObfuscatedName("li.ae")
    public int field4039 = -1;

    @ObfuscatedName("li.af")
    public long field4007;

    @ObfuscatedName("li.aw")
    public int field4027;

    @ObfuscatedName("li.ax")
    public int field4042;

    @ObfuscatedName("li.ag")
    public boolean field4043 = true;

    @ObfuscatedName("li.at")
    public HashSet field4044 = new HashSet();

    @ObfuscatedName("li.av")
    public HashSet field4045 = new HashSet();

    @ObfuscatedName("li.az")
    public HashSet field4046 = new HashSet();

    @ObfuscatedName("li.aj")
    public HashSet field4030 = new HashSet();

    @ObfuscatedName("li.ar")
    public boolean field4048 = false;

    @ObfuscatedName("li.au")
    public int field4049 = 0;

    @ObfuscatedName("li.bv")
    public final int[] field4050 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("li.bw")
    public List field4051;

    @ObfuscatedName("li.bj")
    public Iterator field4052;

    @ObfuscatedName("li.ba")
    public HashSet field4053 = new HashSet();

    @ObfuscatedName("li.bl")
    public class239 field4041 = null;

    @ObfuscatedName("li.br")
    public boolean field4055 = false;

    @ObfuscatedName("li.bh")
    public class332 field4056;

    @ObfuscatedName("li.bf")
    public int field4057;

    @ObfuscatedName("li.bu")
    public int field4058 = -1;

    @ObfuscatedName("li.bp")
    public int field4040 = -1;

    @ObfuscatedName("li.bc")
    public int field4060 = -1;

    @ObfuscatedName("li.c(Ljm;Lkw;Ljava/util/HashMap;[Llq;I)V")
    public void method5622(class262 arg0, class312 arg1, HashMap arg2, class331[] arg3) {
        this.field4013 = arg3;
        this.field4023 = arg0;
        this.field4011 = arg1;
        this.field4012 = new HashMap();
        this.field4012.put(class25.field348, arg2.get(field4022));
        this.field4012.put(class25.field347, arg2.get(field4009));
        this.field4012.put(class25.field345, arg2.get(field4010));
        this.field4019 = new class334(arg0);
        int var5 = this.field4023.method4245(class42.field516.field514);
        int[] var6 = this.field4023.method4201(var5);
        this.field4047 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class195 var8 = new class195(this.field4023.method4190(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method269(var8, var6[var7]);
            this.field4047.put(var9.method319(), var9);
            if (var9.method338()) {
                this.field4015 = var9;
            }
        }
        this.method5612(this.field4015);
        this.field4014 = null;
    }

    @ObfuscatedName("li.i(B)I")
    public int method5583() {
        return this.field4023.method4276(this.field4015.method319(), class42.field517.field514) ? 100 : this.field4023.method4215(this.field4015.method319());
    }

    @ObfuscatedName("li.o(B)V")
    public void method5584() {
        class36.field471.method3640(5);
        class36.field459.method3640(5);
    }

    @ObfuscatedName("li.j(IIZIIIII)V")
    public void method5739(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4019.method5572()) {
            return;
        }
        this.method5726();
        this.method5589();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4003));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4003));
        List var10 = this.field4024.method527(this.field4020 - var8 / 2 - 1, this.field4021 - var9 / 2 - 1, var8 / 2 + this.field4020 + 1, var9 / 2 + this.field4021 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class41 var13 = (class41) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class49 var15 = new class49(var13.field511, var13.field507, var13.field513);
            var14.method997(new Object[] { var15, arg0, arg1 });
            if (this.field4053.contains(var13)) {
                var14.method994(class246.field2957);
            } else {
                var14.method994(class246.field2953);
            }
            class82.method3463(var14);
        }
        Iterator var16 = this.field4053.iterator();
        while (var16.hasNext()) {
            class41 var17 = (class41) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class49 var19 = new class49(var17.field511, var17.field507, var17.field513);
                var18.method997(new Object[] { var19, arg0, arg1 });
                var18.method994(class246.field2956);
                class82.method3463(var18);
            }
        }
        this.field4053 = var11;
    }

    @ObfuscatedName("li.k(IIZZI)V")
    public void method5586(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class197.method26();
        this.method5587(arg0, arg1, arg3, var5);
        if (!this.method5592() && arg3 || arg2) {
            if (arg3) {
                this.field4038 = arg0;
                this.field4039 = arg1;
                this.field4017 = this.field4020;
                this.field4037 = this.field4021;
            }
            if (this.field4017 != -1) {
                int var7 = arg0 - this.field4038;
                int var8 = arg1 - this.field4039;
                this.method5590(this.field4017 - (int) ((float) var7 / this.field4025), this.field4037 + (int) ((float) var8 / this.field4025), false);
            }
        } else {
            this.method5591();
        }
        if (arg3) {
            this.field4007 = var5;
            this.field4027 = arg0;
            this.field4042 = arg1;
        }
    }

    @ObfuscatedName("li.x(IIZJ)V")
    public void method5587(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4016 == null) {
            this.field4041 = null;
            return;
        }
        int var6 = (int) ((float) this.field4020 + ((float) (arg0 - this.field4028) - (float) this.method5746() * this.field4003 / 2.0F) / this.field4003);
        int var7 = (int) ((float) this.field4021 - ((float) (arg1 - this.field4029) - (float) this.method5657() * this.field4003 / 2.0F) / this.field4003);
        this.field4041 = this.field4016.method318(var6 + this.field4016.method282() * 64, var7 + this.field4016.method337() * 64);
        if (this.field4041 == null || !arg2) {
            return;
        }
        if (client.method4031() && class52.field608[82] && class52.field608[81]) {
            client.method115(this.field4041.field2775, this.field4041.field2777, this.field4041.field2780, false);
            return;
        }
        boolean var8 = true;
        if (this.field4043) {
            int var9 = arg0 - this.field4027;
            int var10 = arg1 - this.field4042;
            if (arg3 - this.field4007 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class185 var11 = class185.method2860(class182.field2458, client.field903.field1476);
            var11.field2501.method3383(this.field4041.method4036());
            client.field903.method1884(var11);
            this.field4007 = 0L;
        }
    }

    @ObfuscatedName("li.z(I)V")
    public void method5726() {
        if (Statics.field1133 != null) {
            this.field4003 = this.field4025;
            return;
        }
        if (this.field4003 < this.field4025) {
            this.field4003 = Math.min(this.field4025, this.field4003 / 30.0F + this.field4003);
        }
        if (this.field4003 > this.field4025) {
            this.field4003 = Math.max(this.field4025, this.field4003 - this.field4003 / 30.0F);
        }
    }

    @ObfuscatedName("li.p(I)V")
    public void method5589() {
        if (!this.method5592()) {
            return;
        }
        int var1 = this.field4059 - this.field4020;
        int var2 = this.field4008 - this.field4021;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5590(this.field4020 + var1, this.field4021 + var2, true);
        if (this.field4059 == this.field4020 && this.field4021 == this.field4008) {
            this.field4059 = -1;
            this.field4008 = -1;
        }
    }

    @ObfuscatedName("li.w(IIZI)V")
    public final void method5590(int arg0, int arg1, boolean arg2) {
        this.field4020 = arg0;
        this.field4021 = arg1;
        class197.method26();
        if (arg2) {
            this.method5591();
        }
    }

    @ObfuscatedName("li.r(B)V")
    public final void method5591() {
        this.field4039 = -1;
        this.field4038 = -1;
        this.field4037 = -1;
        this.field4017 = -1;
    }

    @ObfuscatedName("li.d(I)Z")
    public boolean method5592() {
        return this.field4059 != -1 && this.field4008 != -1;
    }

    @ObfuscatedName("li.a(IIIB)Las;")
    public class33 method5593(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4047.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method271(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("li.b(IIIZI)V")
    public void method5594(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5593(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4015;
        }
        boolean var6 = false;
        if (this.field4014 != var5 || arg3) {
            this.field4014 = var5;
            this.method5612(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5717(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("li.h(II)V")
    public void method5599(int arg0) {
        class33 var2 = this.method5596(arg0);
        if (var2 != null) {
            this.method5612(var2);
        }
    }

    @ObfuscatedName("li.n(I)I")
    public int method5704() {
        return this.field4016 == null ? -1 : this.field4016.method285();
    }

    @ObfuscatedName("li.u(I)Las;")
    public class33 method5597() {
        return this.field4016;
    }

    @ObfuscatedName("li.q(Las;I)V")
    public void method5612(class33 arg0) {
        if (this.field4016 == null || this.field4016 != arg0) {
            this.method5747(arg0);
            this.method5717(-1, -1, -1);
        }
    }

    @ObfuscatedName("li.g(Las;I)V")
    public void method5747(class33 arg0) {
        this.field4016 = arg0;
        this.field4024 = new class43(this.field4013, this.field4012);
        this.field4019.method5567(this.field4016.method319());
    }

    @ObfuscatedName("li.y(Las;Lim;Lim;ZB)V")
    public void method5775(class33 arg0, class239 arg1, class239 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4016 == null || this.field4016 != arg0) {
            this.method5747(arg0);
        }
        if (!arg3 && this.field4016.method271(arg1.field2780, arg1.field2775, arg1.field2777)) {
            this.method5717(arg1.field2780, arg1.field2775, arg1.field2777);
        } else {
            this.method5717(arg2.field2780, arg2.field2775, arg2.field2777);
        }
    }

    @ObfuscatedName("li.s(IIIB)V")
    public void method5717(int arg0, int arg1, int arg2) {
        if (this.field4016 == null) {
            return;
        }
        int[] var4 = this.field4016.method273(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4016.method273(this.field4016.method287(), this.field4016.method286(), this.field4016.method288());
        }
        this.method5590(var4[0] - this.field4016.method282() * 64, var4[1] - this.field4016.method337() * 64, true);
        this.field4059 = -1;
        this.field4008 = -1;
        this.field4003 = this.method5608(this.field4016.method316());
        this.field4025 = this.field4003;
        this.field4051 = null;
        this.field4052 = null;
        this.field4024.method560();
    }

    @ObfuscatedName("li.ac(IIIIII)V")
    public void method5588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class328.method5353(var6);
        class328.method5315(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class328.method5392(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4019.method5570();
        if (var7 < 100) {
            this.method5607(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4024.method529()) {
            this.field4024.method521(this.field4023, this.field4016.method319(), client.field856);
            if (!this.field4024.method529()) {
                return;
            }
        }
        if (this.field4033 != null) {
            this.field4035++;
            if (this.field4035 % this.field4031 == 0) {
                this.field4035 = 0;
                this.field4034++;
            }
            if (this.field4034 >= this.field4036 && !this.field4032) {
                this.field4033 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4003));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4003));
        this.field4024.method523(this.field4020 - var8 / 2, this.field4021 - var9 / 2, var8 / 2 + this.field4020, var9 / 2 + this.field4021, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4048) {
            boolean var10 = false;
            if (arg4 - this.field4049 > 100) {
                this.field4049 = arg4;
                var10 = true;
            }
            this.field4024.method524(this.field4020 - var8 / 2, this.field4021 - var9 / 2, var8 / 2 + this.field4020, var9 / 2 + this.field4021, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4030, this.field4033, this.field4035, this.field4031, var10);
        }
        this.method5604(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method4031() && this.field4055 && this.field4041 != null) {
            this.field4011.method5111("Coord: " + this.field4041, class328.field3953 + 10, class328.field3956 + 20, 16776960, -1);
        }
        this.field4026 = var8;
        this.field4018 = var9;
        this.field4028 = arg0;
        this.field4029 = arg1;
        class328.method5318(var6);
    }

    @ObfuscatedName("li.ap(IIIIIII)Z")
    public boolean method5602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4056 == null) {
            return true;
        } else if (this.field4056.field3979 != arg0 || this.field4056.field3980 != arg1) {
            return true;
        } else if (this.field4024.field536 != this.field4057) {
            return true;
        } else if (client.field973 != this.field4060) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("li.al(IIIIIIB)V")
    public void method5604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1133 == null) {
            return;
        }
        int var7 = 512 / (this.field4024.field536 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5754() - arg4 / 2 - var7;
        int var14 = this.method5654() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4024.field536 * (var7 + var13 - this.field4058);
        int var16 = arg1 - this.field4024.field536 * (var7 - (var14 - this.field4040));
        if (this.method5602(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4056 != null && this.field4056.field3979 == var11 && this.field4056.field3980 == var12) {
                Arrays.fill(this.field4056.field3987, 0);
            } else {
                this.field4056 = new class332(var11, var12);
            }
            this.field4058 = this.method5754() - arg4 / 2 - var7;
            this.field4040 = this.method5654() - arg5 / 2 - var7;
            this.field4057 = this.field4024.field536;
            Statics.field1133.method4341(this.field4058, this.field4040, this.field4056, (float) this.field4057 / var10);
            this.field4060 = client.field973;
            var15 = arg0 - this.field4024.field536 * (var7 + var13 - this.field4058);
            var16 = arg1 - this.field4024.field536 * (var7 - (var14 - this.field4040));
        }
        class328.method5322(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4056.method5452(var15, var16, 192);
        } else {
            this.field4056.method5512(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("li.ai(IIIII)V")
    public void method5605(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4019.method5572()) {
            return;
        }
        if (!this.field4024.method529()) {
            this.field4024.method521(this.field4023, this.field4016.method319(), client.field856);
            if (!this.field4024.method529()) {
                return;
            }
        }
        this.field4024.method561(arg0, arg1, arg2, arg3, this.field4033, this.field4035, this.field4031);
    }

    @ObfuscatedName("li.ab(IB)V")
    public void method5706(int arg0) {
        this.field4025 = this.method5608(arg0);
    }

    @ObfuscatedName("li.ak(IIIIII)V")
    public void method5607(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class328.method5392(arg0, arg1, arg2, arg3, -16777216);
        class328.method5330(var7 - 152, var8, 304, 34, -65536);
        class328.method5392(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4011.method5113(class252.field3295, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("li.as(II)F")
    public float method5608(int arg0) {
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

    @ObfuscatedName("li.aa(I)I")
    public int method5609() {
        if ((double) this.field4025 == 1.0D) {
            return 25;
        } else if ((double) this.field4025 == 1.5D) {
            return 37;
        } else if ((double) this.field4025 == 2.0D) {
            return 50;
        } else if ((double) this.field4025 == 3.0D) {
            return 75;
        } else if ((double) this.field4025 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("li.ah(S)V")
    public void method5681() {
        this.field4019.method5568();
    }

    @ObfuscatedName("li.ao(B)Z")
    public boolean method5611() {
        return this.field4019.method5572();
    }

    @ObfuscatedName("li.am(IB)Las;")
    public class33 method5596(int arg0) {
        Iterator var2 = this.field4047.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method285() != arg0);
        return var3;
    }

    @ObfuscatedName("li.aq(III)V")
    public void method5670(int arg0, int arg1) {
        if (this.field4016 != null && this.field4016.method272(arg0, arg1)) {
            this.field4059 = arg0 - this.field4016.method282() * 64;
            this.field4008 = arg1 - this.field4016.method337() * 64;
        }
    }

    @ObfuscatedName("li.ae(III)V")
    public void method5716(int arg0, int arg1) {
        if (this.field4016 != null) {
            this.method5590(arg0 - this.field4016.method282() * 64, arg1 - this.field4016.method337() * 64, true);
            this.field4059 = -1;
            this.field4008 = -1;
        }
    }

    @ObfuscatedName("li.af(IIII)V")
    public void method5615(int arg0, int arg1, int arg2) {
        if (this.field4016 != null) {
            int[] var4 = this.field4016.method273(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5670(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("li.aw(IIII)V")
    public void method5769(int arg0, int arg1, int arg2) {
        if (this.field4016 != null) {
            int[] var4 = this.field4016.method273(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5716(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("li.ax(I)I")
    public int method5754() {
        return this.field4016 == null ? -1 : this.field4020 + this.field4016.method282() * 64;
    }

    @ObfuscatedName("li.ag(B)I")
    public int method5654() {
        return this.field4016 == null ? -1 : this.field4021 + this.field4016.method337() * 64;
    }

    @ObfuscatedName("li.ay(I)Lim;")
    public class239 method5626() {
        return this.field4016 == null ? null : this.field4016.method318(this.method5754(), this.method5654());
    }

    @ObfuscatedName("li.ad(I)I")
    public int method5746() {
        return this.field4026;
    }

    @ObfuscatedName("li.at(I)I")
    public int method5657() {
        return this.field4018;
    }

    @ObfuscatedName("li.av(II)V")
    public void method5603(int arg0) {
        if (arg0 >= 1) {
            this.field4036 = arg0;
        }
    }

    @ObfuscatedName("li.az(B)V")
    public void method5623() {
        this.field4036 = 3;
    }

    @ObfuscatedName("li.aj(II)V")
    public void method5624(int arg0) {
        if (arg0 >= 1) {
            this.field4031 = arg0;
        }
    }

    @ObfuscatedName("li.ar(B)V")
    public void method5625() {
        this.field4031 = 50;
    }

    @ObfuscatedName("li.au(ZI)V")
    public void method5639(boolean arg0) {
        this.field4032 = arg0;
    }

    @ObfuscatedName("li.an(II)V")
    public void method5627(int arg0) {
        this.field4033 = new HashSet();
        this.field4033.add(arg0);
        this.field4034 = 0;
        this.field4035 = 0;
    }

    @ObfuscatedName("li.bv(II)V")
    public void method5648(int arg0) {
        this.field4033 = new HashSet();
        this.field4034 = 0;
        this.field4035 = 0;
        for (int var2 = 0; var2 < Statics.field3472.length; var2++) {
            if (Statics.field3472[var2] != null && Statics.field3472[var2].field3464 == arg0) {
                this.field4033.add(Statics.field3472[var2].field3453);
            }
        }
    }

    @ObfuscatedName("li.bw(I)V")
    public void method5629() {
        this.field4033 = null;
    }

    @ObfuscatedName("li.bj(ZI)V")
    public void method5630(boolean arg0) {
        this.field4048 = !arg0;
    }

    @ObfuscatedName("li.ba(IZB)V")
    public void method5631(int arg0, boolean arg1) {
        if (arg1) {
            this.field4044.remove(arg0);
        } else {
            this.field4044.add(arg0);
        }
        this.method5636();
    }

    @ObfuscatedName("li.bl(IZI)V")
    public void method5632(int arg0, boolean arg1) {
        if (arg1) {
            this.field4045.remove(arg0);
        } else {
            this.field4045.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3472.length; var3++) {
            if (Statics.field3472[var3] != null && Statics.field3472[var3].field3464 == arg0) {
                int var4 = Statics.field3472[var3].field3453;
                if (arg1) {
                    this.field4046.remove(var4);
                } else {
                    this.field4046.add(var4);
                }
            }
        }
        this.method5636();
    }

    @ObfuscatedName("li.br(I)Z")
    public boolean method5633() {
        return !this.field4048;
    }

    @ObfuscatedName("li.bh(II)Z")
    public boolean method5634(int arg0) {
        return !this.field4044.contains(arg0);
    }

    @ObfuscatedName("li.bf(II)Z")
    public boolean method5635(int arg0) {
        return !this.field4045.contains(arg0);
    }

    @ObfuscatedName("li.bu(I)V")
    public void method5636() {
        this.field4030.clear();
        this.field4030.addAll(this.field4044);
        this.field4030.addAll(this.field4046);
    }

    @ObfuscatedName("li.bp(IIIIIII)V")
    public void method5637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4019.method5572()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4003));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4003));
        List var9 = this.field4024.method527(this.field4020 - var7 / 2 - 1, this.field4021 - var8 / 2 - 1, var7 / 2 + this.field4020 + 1, var8 / 2 + this.field4021 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class270 var12 = Statics.field3472[var11.field511];
            var13 = false;
            for (int var14 = this.field4050.length - 1; var14 >= 0; var14--) {
                if (var12.field3462[var14] != null) {
                    client.method2987(var12.field3462[var14], var12.field3461, this.field4050[var14], var11.field511, var11.field507.method4036(), var11.field513.method4036());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("li.bc(ILim;I)Lim;")
    public class239 method5638(int arg0, class239 arg1) {
        if (!this.field4019.method5572()) {
            return null;
        } else if (!this.field4024.method529()) {
            return null;
        } else if (this.field4016.method272(arg1.field2775, arg1.field2777)) {
            HashMap var3 = this.field4024.method530();
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
                        return var5.field513;
                    }
                    var8 = (class41) var7.next();
                    int var9 = var8.field513.field2775 - arg1.field2775;
                    int var10 = var8.field513.field2777 - arg1.field2777;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field513;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.bb(IILim;Lim;S)V")
    public void method5616(int arg0, int arg1, class239 arg2, class239 arg3) {
        class69 var5 = new class69();
        class49 var6 = new class49(arg1, arg2, arg3);
        var5.method997(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method994(class246.field2951);
                break;
            case 1009:
                var5.method994(class246.field2952);
                break;
            case 1010:
                var5.method994(class246.field2960);
                break;
            case 1011:
                var5.method994(class246.field2950);
                break;
            case 1012:
                var5.method994(class246.field2954);
        }
        class82.method3463(var5);
    }

    @ObfuscatedName("li.bt(I)Law;")
    public class41 method5653() {
        if (!this.field4019.method5572()) {
            return null;
        } else if (this.field4024.method529()) {
            HashMap var1 = this.field4024.method530();
            this.field4051 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4051.addAll(var3);
            }
            this.field4052 = this.field4051.iterator();
            return this.method5641();
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.by(I)Law;")
    public class41 method5641() {
        if (this.field4052 == null) {
            return null;
        } else if (this.field4052.hasNext()) {
            return (class41) this.field4052.next();
        } else {
            return null;
        }
    }
}
