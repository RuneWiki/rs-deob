package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("li")
public class class335 {

    @ObfuscatedName("li.s")
    public class262 field4013;

    @ObfuscatedName("li.y")
    public static final class310 field4014 = class310.field3886;

    @ObfuscatedName("li.c")
    public static final class310 field4010 = class310.field3887;

    @ObfuscatedName("li.h")
    public static final class310 field4016 = class310.field3883;

    @ObfuscatedName("li.i")
    public class312 field4056;

    @ObfuscatedName("li.o")
    public HashMap field4054;

    @ObfuscatedName("li.d")
    public class331[] field4026;

    @ObfuscatedName("li.r")
    public HashMap field4019;

    @ObfuscatedName("li.p")
    public class33 field4021;

    @ObfuscatedName("li.q")
    public class33 field4022;

    @ObfuscatedName("li.f")
    public class33 field4023;

    @ObfuscatedName("li.j")
    public class43 field4024;

    @ObfuscatedName("li.v")
    public class334 field4025;

    @ObfuscatedName("li.u")
    public int field4029;

    @ObfuscatedName("li.k")
    public int field4027;

    @ObfuscatedName("li.w")
    public int field4028 = -1;

    @ObfuscatedName("li.m")
    public int field4063 = -1;

    @ObfuscatedName("li.a")
    public float field4032;

    @ObfuscatedName("li.x")
    public float field4041;

    @ObfuscatedName("li.t")
    public int field4030 = -1;

    @ObfuscatedName("li.ax")
    public int field4033 = -1;

    @ObfuscatedName("li.ai")
    public int field4034 = -1;

    @ObfuscatedName("li.aj")
    public int field4011 = -1;

    @ObfuscatedName("li.ac")
    public int field4036 = 3;

    @ObfuscatedName("li.ag")
    public int field4037 = 50;

    @ObfuscatedName("li.ay")
    public boolean field4038 = false;

    @ObfuscatedName("li.as")
    public HashSet field4039 = null;

    @ObfuscatedName("li.av")
    public int field4040 = -1;

    @ObfuscatedName("li.ao")
    public int field4061 = -1;

    @ObfuscatedName("li.ak")
    public int field4042 = -1;

    @ObfuscatedName("li.ad")
    public int field4031 = -1;

    @ObfuscatedName("li.az")
    public int field4035 = -1;

    @ObfuscatedName("li.aa")
    public int field4043 = -1;

    @ObfuscatedName("li.ab")
    public long field4020;

    @ObfuscatedName("li.al")
    public int field4015;

    @ObfuscatedName("li.af")
    public int field4048;

    @ObfuscatedName("li.ah")
    public boolean field4049 = true;

    @ObfuscatedName("li.at")
    public HashSet field4050 = new HashSet();

    @ObfuscatedName("li.am")
    public HashSet field4051 = new HashSet();

    @ObfuscatedName("li.an")
    public HashSet field4052 = new HashSet();

    @ObfuscatedName("li.ae")
    public HashSet field4053 = new HashSet();

    @ObfuscatedName("li.aw")
    public boolean field4066 = false;

    @ObfuscatedName("li.ar")
    public int field4055 = 0;

    @ObfuscatedName("li.bq")
    public final int[] field4046 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("li.bi")
    public List field4057;

    @ObfuscatedName("li.bo")
    public Iterator field4058;

    @ObfuscatedName("li.bj")
    public HashSet field4059 = new HashSet();

    @ObfuscatedName("li.bw")
    public class239 field4060 = null;

    @ObfuscatedName("li.bp")
    public boolean field4012 = false;

    @ObfuscatedName("li.bh")
    public class332 field4062;

    @ObfuscatedName("li.bz")
    public int field4047;

    @ObfuscatedName("li.bl")
    public int field4064 = -1;

    @ObfuscatedName("li.bb")
    public int field4065 = -1;

    @ObfuscatedName("li.ba")
    public int field4045 = -1;

    @ObfuscatedName("li.g(Ljr;Lkh;Ljava/util/HashMap;[Llh;I)V")
    public void method5610(class262 arg0, class312 arg1, HashMap arg2, class331[] arg3) {
        this.field4026 = arg3;
        this.field4013 = arg0;
        this.field4056 = arg1;
        this.field4054 = new HashMap();
        this.field4054.put(class25.field366, arg2.get(field4014));
        this.field4054.put(class25.field360, arg2.get(field4010));
        this.field4054.put(class25.field361, arg2.get(field4016));
        this.field4025 = new class334(arg0);
        int var5 = this.field4013.method4306(class42.field536.field540);
        int[] var6 = this.field4013.method4278(var5);
        this.field4019 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class195 var8 = new class195(this.field4013.method4294(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method245(var8, var6[var7]);
            this.field4019.put(var9.method254(), var9);
            if (var9.method323()) {
                this.field4021 = var9;
            }
        }
        this.method5626(this.field4021);
        this.field4023 = null;
    }

    @ObfuscatedName("li.e(I)I")
    public int method5661() {
        return this.field4013.method4337(this.field4021.method254(), class42.field544.field540) ? 100 : this.field4013.method4277(this.field4021.method254());
    }

    @ObfuscatedName("li.b(B)V")
    public void method5669() {
        class36.method1865();
    }

    @ObfuscatedName("li.z(IIZIIIIB)V")
    public void method5613(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4025.method5598()) {
            return;
        }
        this.method5616();
        this.method5617();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4032));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4032));
        List var10 = this.field4024.method546(this.field4029 - var8 / 2 - 1, this.field4027 - var9 / 2 - 1, var8 / 2 + this.field4029 + 1, var9 / 2 + this.field4027 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class41 var13 = (class41) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class49 var15 = new class49(var13.field530, var13.field529, var13.field523);
            var14.method1060(new Object[] { var15, arg0, arg1 });
            if (this.field4059.contains(var13)) {
                var14.method1059(class246.field2967);
            } else {
                var14.method1059(class246.field2965);
            }
            class82.method1108(var14);
        }
        Iterator var16 = this.field4059.iterator();
        while (var16.hasNext()) {
            class41 var17 = (class41) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class49 var19 = new class49(var17.field530, var17.field529, var17.field523);
                var18.method1060(new Object[] { var19, arg0, arg1 });
                var18.method1059(class246.field2966);
                class82.method1108(var18);
            }
        }
        this.field4059 = var11;
    }

    @ObfuscatedName("li.n(IIZZI)V")
    public void method5745(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class197.method4873();
        this.method5615(arg0, arg1, arg3, var5);
        if (!this.method5776() && arg3 || arg2) {
            if (arg3) {
                this.field4035 = arg0;
                this.field4043 = arg1;
                this.field4042 = this.field4029;
                this.field4031 = this.field4027;
            }
            if (this.field4042 != -1) {
                int var7 = arg0 - this.field4035;
                int var8 = arg1 - this.field4043;
                this.method5611(this.field4042 - (int) ((float) var7 / this.field4041), this.field4031 + (int) ((float) var8 / this.field4041), false);
            }
        } else {
            this.method5619();
        }
        if (arg3) {
            this.field4020 = var5;
            this.field4015 = arg0;
            this.field4048 = arg1;
        }
    }

    @ObfuscatedName("li.l(IIZJ)V")
    public void method5615(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4022 == null) {
            this.field4060 = null;
            return;
        }
        int var6 = (int) ((float) this.field4029 + ((float) (arg0 - this.field4034) - (float) this.method5725() * this.field4032 / 2.0F) / this.field4032);
        int var7 = (int) ((float) this.field4027 - ((float) (arg1 - this.field4011) - (float) this.method5662() * this.field4032 / 2.0F) / this.field4032);
        this.field4060 = this.field4022.method250(var6 + this.field4022.method258() * 64, var7 + this.field4022.method260() * 64);
        if (this.field4060 == null || !arg2) {
            return;
        }
        boolean var8 = client.field997 >= 2;
        if (var8 && class52.field620[82] && class52.field620[81]) {
            client.method541(this.field4060.field2791, this.field4060.field2790, this.field4060.field2793, false);
            return;
        }
        boolean var9 = true;
        if (this.field4049) {
            int var10 = arg0 - this.field4015;
            int var11 = arg1 - this.field4048;
            if (arg3 - this.field4020 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class185 var12 = class185.method2191(class182.field2436, client.field912.field1461);
            var12.field2489.method3319(this.field4060.method4126());
            client.field912.method1999(var12);
            this.field4020 = 0L;
        }
    }

    @ObfuscatedName("li.s(B)V")
    public void method5616() {
        if (Statics.field327 != null) {
            this.field4032 = this.field4041;
            return;
        }
        if (this.field4032 < this.field4041) {
            this.field4032 = Math.min(this.field4041, this.field4032 / 30.0F + this.field4032);
        }
        if (this.field4032 > this.field4041) {
            this.field4032 = Math.max(this.field4041, this.field4032 - this.field4032 / 30.0F);
        }
    }

    @ObfuscatedName("li.y(B)V")
    public void method5617() {
        if (!this.method5776()) {
            return;
        }
        int var1 = this.field4028 - this.field4029;
        int var2 = this.field4063 - this.field4027;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5611(this.field4029 + var1, this.field4027 + var2, true);
        if (this.field4029 == this.field4028 && this.field4063 == this.field4027) {
            this.field4028 = -1;
            this.field4063 = -1;
        }
    }

    @ObfuscatedName("li.c(IIZI)V")
    public final void method5611(int arg0, int arg1, boolean arg2) {
        this.field4029 = arg0;
        this.field4027 = arg1;
        class197.method4873();
        if (arg2) {
            this.method5619();
        }
    }

    @ObfuscatedName("li.o(I)V")
    public final void method5619() {
        this.field4043 = -1;
        this.field4035 = -1;
        this.field4031 = -1;
        this.field4042 = -1;
    }

    @ObfuscatedName("li.d(I)Z")
    public boolean method5776() {
        return this.field4028 != -1 && this.field4063 != -1;
    }

    @ObfuscatedName("li.r(IIIB)Las;")
    public class33 method5621(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4019.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method247(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("li.p(IIIZI)V")
    public void method5622(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5621(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4021;
        }
        boolean var6 = false;
        if (this.field4023 != var5 || arg3) {
            this.field4023 = var5;
            this.method5626(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5810(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("li.q(II)V")
    public void method5623(int arg0) {
        class33 var2 = this.method5765(arg0);
        if (var2 != null) {
            this.method5626(var2);
        }
    }

    @ObfuscatedName("li.f(B)I")
    public int method5624() {
        return this.field4022 == null ? -1 : this.field4022.method252();
    }

    @ObfuscatedName("li.j(B)Las;")
    public class33 method5625() {
        return this.field4022;
    }

    @ObfuscatedName("li.v(Las;B)V")
    public void method5626(class33 arg0) {
        if (this.field4022 == null || this.field4022 != arg0) {
            this.method5627(arg0);
            this.method5810(-1, -1, -1);
        }
    }

    @ObfuscatedName("li.u(Las;I)V")
    public void method5627(class33 arg0) {
        this.field4022 = arg0;
        this.field4024 = new class43(this.field4026, this.field4054);
        this.field4025.method5605(this.field4022.method254());
    }

    @ObfuscatedName("li.k(Las;Lio;Lio;ZB)V")
    public void method5648(class33 arg0, class239 arg1, class239 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4022 == null || this.field4022 != arg0) {
            this.method5627(arg0);
        }
        if (!arg3 && this.field4022.method247(arg1.field2793, arg1.field2791, arg1.field2790)) {
            this.method5810(arg1.field2793, arg1.field2791, arg1.field2790);
        } else {
            this.method5810(arg2.field2793, arg2.field2791, arg2.field2790);
        }
    }

    @ObfuscatedName("li.w(IIII)V")
    public void method5810(int arg0, int arg1, int arg2) {
        if (this.field4022 == null) {
            return;
        }
        int[] var4 = this.field4022.method319(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4022.method319(this.field4022.method263(), this.field4022.method262(), this.field4022.method264());
        }
        this.method5611(var4[0] - this.field4022.method258() * 64, var4[1] - this.field4022.method260() * 64, true);
        this.field4028 = -1;
        this.field4063 = -1;
        this.field4032 = this.method5636(this.field4022.method283());
        this.field4041 = this.field4032;
        this.field4057 = null;
        this.field4058 = null;
        this.field4024.method548();
    }

    @ObfuscatedName("li.x(IIIIIS)V")
    public void method5630(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class328.method5356(var6);
        class328.method5354(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class328.method5362(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4025.method5596();
        if (var7 < 100) {
            this.method5635(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4024.method572()) {
            this.field4024.method555(this.field4013, this.field4022.method254(), client.field856);
            if (!this.field4024.method572()) {
                return;
            }
        }
        if (this.field4039 != null) {
            this.field4061++;
            if (this.field4061 % this.field4037 == 0) {
                this.field4061 = 0;
                this.field4040++;
            }
            if (this.field4040 >= this.field4036 && !this.field4038) {
                this.field4039 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4032));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4032));
        this.field4024.method554(this.field4029 - var8 / 2, this.field4027 - var9 / 2, var8 / 2 + this.field4029, var9 / 2 + this.field4027, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4066) {
            boolean var10 = false;
            if (arg4 - this.field4055 > 100) {
                this.field4055 = arg4;
                var10 = true;
            }
            this.field4024.method550(this.field4029 - var8 / 2, this.field4027 - var9 / 2, var8 / 2 + this.field4029, var9 / 2 + this.field4027, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4053, this.field4039, this.field4061, this.field4037, var10);
        }
        this.method5632(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field997 >= 2;
        if (var11 && this.field4012 && this.field4060 != null) {
            this.field4056.method5186("Coord: " + this.field4060, class328.field3965 + 10, class328.field3963 + 20, 16776960, -1);
        }
        this.field4030 = var8;
        this.field4033 = var9;
        this.field4034 = arg0;
        this.field4011 = arg1;
        class328.method5392(var6);
    }

    @ObfuscatedName("li.t(IIIIIIB)Z")
    public boolean method5805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4062 == null) {
            return true;
        } else if (this.field4062.field3991 != arg0 || this.field4062.field3988 != arg1) {
            return true;
        } else if (this.field4024.field558 != this.field4047) {
            return true;
        } else if (client.field1054 != this.field4045) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("li.ax(IIIIIII)V")
    public void method5632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field327 == null) {
            return;
        }
        int var7 = 512 / (this.field4024.field558 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5644() - arg4 / 2 - var7;
        int var14 = this.method5700() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4024.field558 * (var7 + var13 - this.field4064);
        int var16 = arg1 - this.field4024.field558 * (var7 - (var14 - this.field4065));
        if (this.method5805(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4062 != null && this.field4062.field3991 == var11 && this.field4062.field3988 == var12) {
                Arrays.fill(this.field4062.field3986, 0);
            } else {
                this.field4062 = new class332(var11, var12);
            }
            this.field4064 = this.method5644() - arg4 / 2 - var7;
            this.field4065 = this.method5700() - arg5 / 2 - var7;
            this.field4047 = this.field4024.field558;
            Statics.field327.method4436(this.field4064, this.field4065, this.field4062, (float) this.field4047 / var10);
            this.field4045 = client.field1054;
            var15 = arg0 - this.field4024.field558 * (var7 + var13 - this.field4064);
            var16 = arg1 - this.field4024.field558 * (var7 - (var14 - this.field4065));
        }
        class328.method5361(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4062.method5470(var15, var16, 192);
        } else {
            this.field4062.method5473(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("li.ai(IIIIB)V")
    public void method5674(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4025.method5598()) {
            return;
        }
        if (!this.field4024.method572()) {
            this.field4024.method555(this.field4013, this.field4022.method254(), client.field856);
            if (!this.field4024.method572()) {
                return;
            }
        }
        this.field4024.method552(arg0, arg1, arg2, arg3, this.field4039, this.field4061, this.field4037);
    }

    @ObfuscatedName("li.aj(II)V")
    public void method5634(int arg0) {
        this.field4041 = this.method5636(arg0);
    }

    @ObfuscatedName("li.ac(IIIIII)V")
    public void method5635(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class328.method5362(arg0, arg1, arg2, arg3, -16777216);
        class328.method5368(var7 - 152, var8, 304, 34, -65536);
        class328.method5362(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4056.method5137(class252.field3303, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("li.ag(II)F")
    public float method5636(int arg0) {
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

    @ObfuscatedName("li.ay(B)I")
    public int method5726() {
        if ((double) this.field4041 == 1.0D) {
            return 25;
        } else if ((double) this.field4041 == 1.5D) {
            return 37;
        } else if ((double) this.field4041 == 2.0D) {
            return 50;
        } else if ((double) this.field4041 == 3.0D) {
            return 75;
        } else if ((double) this.field4041 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("li.as(I)V")
    public void method5722() {
        this.field4025.method5601();
    }

    @ObfuscatedName("li.av(S)Z")
    public boolean method5784() {
        return this.field4025.method5598();
    }

    @ObfuscatedName("li.ao(II)Las;")
    public class33 method5765(int arg0) {
        Iterator var2 = this.field4019.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method252() != arg0);
        return var3;
    }

    @ObfuscatedName("li.ak(III)V")
    public void method5655(int arg0, int arg1) {
        if (this.field4022 != null && this.field4022.method248(arg0, arg1)) {
            this.field4028 = arg0 - this.field4022.method258() * 64;
            this.field4063 = arg1 - this.field4022.method260() * 64;
        }
    }

    @ObfuscatedName("li.ad(IIB)V")
    public void method5641(int arg0, int arg1) {
        if (this.field4022 != null) {
            this.method5611(arg0 - this.field4022.method258() * 64, arg1 - this.field4022.method260() * 64, true);
            this.field4028 = -1;
            this.field4063 = -1;
        }
    }

    @ObfuscatedName("li.az(IIIB)V")
    public void method5785(int arg0, int arg1, int arg2) {
        if (this.field4022 != null) {
            int[] var4 = this.field4022.method319(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5655(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("li.aa(IIII)V")
    public void method5643(int arg0, int arg1, int arg2) {
        if (this.field4022 != null) {
            int[] var4 = this.field4022.method319(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5641(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("li.ab(I)I")
    public int method5644() {
        return this.field4022 == null ? -1 : this.field4029 + this.field4022.method258() * 64;
    }

    @ObfuscatedName("li.al(B)I")
    public int method5700() {
        return this.field4022 == null ? -1 : this.field4027 + this.field4022.method260() * 64;
    }

    @ObfuscatedName("li.af(I)Lio;")
    public class239 method5646() {
        return this.field4022 == null ? null : this.field4022.method250(this.method5644(), this.method5700());
    }

    @ObfuscatedName("li.ah(I)I")
    public int method5725() {
        return this.field4030;
    }

    @ObfuscatedName("li.au(I)I")
    public int method5662() {
        return this.field4033;
    }

    @ObfuscatedName("li.ap(IB)V")
    public void method5649(int arg0) {
        if (arg0 >= 1) {
            this.field4036 = arg0;
        }
    }

    @ObfuscatedName("li.at(I)V")
    public void method5751() {
        this.field4036 = 3;
    }

    @ObfuscatedName("li.am(II)V")
    public void method5651(int arg0) {
        if (arg0 >= 1) {
            this.field4037 = arg0;
        }
    }

    @ObfuscatedName("li.an(I)V")
    public void method5652() {
        this.field4037 = 50;
    }

    @ObfuscatedName("li.ae(ZB)V")
    public void method5653(boolean arg0) {
        this.field4038 = arg0;
    }

    @ObfuscatedName("li.aw(IB)V")
    public void method5633(int arg0) {
        this.field4039 = new HashSet();
        this.field4039.add(arg0);
        this.field4040 = 0;
        this.field4061 = 0;
    }

    @ObfuscatedName("li.ar(IB)V")
    public void method5791(int arg0) {
        this.field4039 = new HashSet();
        this.field4040 = 0;
        this.field4061 = 0;
        for (int var2 = 0; var2 < Statics.field2517.length; var2++) {
            if (Statics.field2517[var2] != null && Statics.field2517[var2].field3464 == arg0) {
                this.field4039.add(Statics.field2517[var2].field3453);
            }
        }
    }

    @ObfuscatedName("li.aq(I)V")
    public void method5656() {
        this.field4039 = null;
    }

    @ObfuscatedName("li.bq(ZI)V")
    public void method5657(boolean arg0) {
        this.field4066 = !arg0;
    }

    @ObfuscatedName("li.bi(IZI)V")
    public void method5698(int arg0, boolean arg1) {
        if (arg1) {
            this.field4050.remove(arg0);
        } else {
            this.field4050.add(arg0);
        }
        this.method5663();
    }

    @ObfuscatedName("li.bo(IZB)V")
    public void method5659(int arg0, boolean arg1) {
        if (arg1) {
            this.field4051.remove(arg0);
        } else {
            this.field4051.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field2517.length; var3++) {
            if (Statics.field2517[var3] != null && Statics.field2517[var3].field3464 == arg0) {
                int var4 = Statics.field2517[var3].field3453;
                if (arg1) {
                    this.field4052.remove(var4);
                } else {
                    this.field4052.add(var4);
                }
            }
        }
        this.method5663();
    }

    @ObfuscatedName("li.bj(I)Z")
    public boolean method5660() {
        return !this.field4066;
    }

    @ObfuscatedName("li.bw(IB)Z")
    public boolean method5612(int arg0) {
        return !this.field4050.contains(arg0);
    }

    @ObfuscatedName("li.bp(II)Z")
    public boolean method5717(int arg0) {
        return !this.field4051.contains(arg0);
    }

    @ObfuscatedName("li.bh(I)V")
    public void method5663() {
        this.field4053.clear();
        this.field4053.addAll(this.field4050);
        this.field4053.addAll(this.field4052);
    }

    @ObfuscatedName("li.bz(IIIIIIB)V")
    public void method5664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4025.method5598()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4032));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4032));
        List var9 = this.field4024.method546(this.field4029 - var7 / 2 - 1, this.field4027 - var8 / 2 - 1, var7 / 2 + this.field4029 + 1, var8 / 2 + this.field4027 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class270 var12 = Statics.field2517[var11.field530];
            var13 = false;
            for (int var14 = this.field4046.length - 1; var14 >= 0; var14--) {
                if (var12.field3471[var14] != null) {
                    client.method2971(var12.field3471[var14], var12.field3460, this.field4046[var14], var11.field530, var11.field529.method4126(), var11.field523.method4126());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("li.bl(ILio;B)Lio;")
    public class239 method5665(int arg0, class239 arg1) {
        if (!this.field4025.method5598()) {
            return null;
        } else if (!this.field4024.method572()) {
            return null;
        } else if (this.field4022.method248(arg1.field2791, arg1.field2790)) {
            HashMap var3 = this.field4024.method575();
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
                        return var5.field523;
                    }
                    var8 = (class41) var7.next();
                    int var9 = var8.field523.field2791 - arg1.field2791;
                    int var10 = var8.field523.field2790 - arg1.field2790;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field523;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.bb(IILio;Lio;B)V")
    public void method5618(int arg0, int arg1, class239 arg2, class239 arg3) {
        class69 var5 = new class69();
        class49 var6 = new class49(arg1, arg2, arg3);
        var5.method1060(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1059(class246.field2961);
                break;
            case 1009:
                var5.method1059(class246.field2962);
                break;
            case 1010:
                var5.method1059(class246.field2963);
                break;
            case 1011:
                var5.method1059(class246.field2970);
                break;
            case 1012:
                var5.method1059(class246.field2964);
        }
        class82.method1108(var5);
    }

    @ObfuscatedName("li.ba(B)Lal;")
    public class41 method5667() {
        if (!this.field4025.method5598()) {
            return null;
        } else if (this.field4024.method572()) {
            HashMap var1 = this.field4024.method575();
            this.field4057 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4057.addAll(var3);
            }
            this.field4058 = this.field4057.iterator();
            return this.method5668();
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.bk(S)Lal;")
    public class41 method5668() {
        if (this.field4058 == null) {
            return null;
        } else if (this.field4058.hasNext()) {
            return (class41) this.field4058.next();
        } else {
            return null;
        }
    }
}
