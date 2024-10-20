package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lo")
public class class335 {

    @ObfuscatedName("lo.e")
    public class262 field4012;

    @ObfuscatedName("lo.x")
    public static final class310 field4013 = class310.field3879;

    @ObfuscatedName("lo.p")
    public static final class310 field4014 = class310.field3878;

    @ObfuscatedName("lo.g")
    public static final class310 field4015 = class310.field3881;

    @ObfuscatedName("lo.n")
    public class312 field4031;

    @ObfuscatedName("lo.o")
    public HashMap field4046;

    @ObfuscatedName("lo.c")
    public class331[] field4055;

    @ObfuscatedName("lo.v")
    public HashMap field4017;

    @ObfuscatedName("lo.u")
    public class33 field4020;

    @ObfuscatedName("lo.j")
    public class33 field4021;

    @ObfuscatedName("lo.k")
    public class33 field4022;

    @ObfuscatedName("lo.z")
    public class43 field4023;

    @ObfuscatedName("lo.w")
    public class334 field4024;

    @ObfuscatedName("lo.s")
    public int field4025;

    @ObfuscatedName("lo.d")
    public int field4026;

    @ObfuscatedName("lo.f")
    public int field4059 = -1;

    @ObfuscatedName("lo.r")
    public int field4039 = -1;

    @ObfuscatedName("lo.y")
    public float field4029;

    @ObfuscatedName("lo.h")
    public float field4058;

    @ObfuscatedName("lo.m")
    public int field4035 = -1;

    @ObfuscatedName("lo.ay")
    public int field4032 = -1;

    @ObfuscatedName("lo.ao")
    public int field4064 = -1;

    @ObfuscatedName("lo.av")
    public int field4034 = -1;

    @ObfuscatedName("lo.aj")
    public int field4066 = 3;

    @ObfuscatedName("lo.ae")
    public int field4036 = 50;

    @ObfuscatedName("lo.am")
    public boolean field4037 = false;

    @ObfuscatedName("lo.az")
    public HashSet field4027 = null;

    @ObfuscatedName("lo.ap")
    public int field4042 = -1;

    @ObfuscatedName("lo.ah")
    public int field4008 = -1;

    @ObfuscatedName("lo.au")
    public int field4019 = -1;

    @ObfuscatedName("lo.ax")
    public int field4033 = -1;

    @ObfuscatedName("lo.ar")
    public int field4043 = -1;

    @ObfuscatedName("lo.an")
    public int field4018 = -1;

    @ObfuscatedName("lo.ai")
    public long field4041;

    @ObfuscatedName("lo.al")
    public int field4040;

    @ObfuscatedName("lo.at")
    public int field4047;

    @ObfuscatedName("lo.ag")
    public boolean field4028 = true;

    @ObfuscatedName("lo.aq")
    public HashSet field4048 = new HashSet();

    @ObfuscatedName("lo.aa")
    public HashSet field4052 = new HashSet();

    @ObfuscatedName("lo.af")
    public HashSet field4053 = new HashSet();

    @ObfuscatedName("lo.ak")
    public HashSet field4054 = new HashSet();

    @ObfuscatedName("lo.ab")
    public boolean field4016 = false;

    @ObfuscatedName("lo.ac")
    public int field4051 = 0;

    @ObfuscatedName("lo.bg")
    public final int[] field4057 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lo.br")
    public List field4056;

    @ObfuscatedName("lo.ba")
    public Iterator field4044;

    @ObfuscatedName("lo.bk")
    public HashSet field4030 = new HashSet();

    @ObfuscatedName("lo.be")
    public class239 field4061 = null;

    @ObfuscatedName("lo.bc")
    public boolean field4062 = false;

    @ObfuscatedName("lo.bm")
    public class332 field4063;

    @ObfuscatedName("lo.bh")
    public int field4038;

    @ObfuscatedName("lo.bs")
    public int field4065 = -1;

    @ObfuscatedName("lo.bj")
    public int field4045 = -1;

    @ObfuscatedName("lo.bt")
    public int field4067 = -1;

    @ObfuscatedName("lo.t(Ljc;Lkm;Ljava/util/HashMap;[Llk;I)V")
    public void method5544(class262 arg0, class312 arg1, HashMap arg2, class331[] arg3) {
        this.field4055 = arg3;
        this.field4012 = arg0;
        this.field4031 = arg1;
        this.field4046 = new HashMap();
        this.field4046.put(class25.field344, arg2.get(field4013));
        this.field4046.put(class25.field336, arg2.get(field4014));
        this.field4046.put(class25.field335, arg2.get(field4015));
        this.field4024 = new class334(arg0);
        int var5 = this.field4012.method4210(class42.field526.field527);
        int[] var6 = this.field4012.method4203(var5);
        this.field4017 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class195 var8 = new class195(this.field4012.method4265(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method252(var8, var6[var7]);
            this.field4017.put(var9.method261(), var9);
            if (var9.method312()) {
                this.field4020 = var9;
            }
        }
        this.method5560(this.field4020);
        this.field4022 = null;
    }

    @ObfuscatedName("lo.q(I)I")
    public int method5567() {
        return this.field4012.method4214(this.field4020.method261(), class42.field525.field527) ? 100 : this.field4012.method4271(this.field4020.method261());
    }

    @ObfuscatedName("lo.i(I)V")
    public void method5546() {
        class36.method2880();
    }

    @ObfuscatedName("lo.a(IIZIIIIB)V")
    public void method5547(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4024.method5529()) {
            return;
        }
        this.method5571();
        this.method5551();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4029));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4029));
        List var10 = this.field4023.method552(this.field4025 - var8 / 2 - 1, this.field4026 - var9 / 2 - 1, var8 / 2 + this.field4025 + 1, var9 / 2 + this.field4026 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class41 var13 = (class41) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class49 var15 = new class49(var13.field515, var13.field512, var13.field511);
            var14.method1042(new Object[] { var15, arg0, arg1 });
            if (this.field4030.contains(var13)) {
                var14.method1041(class246.field2963);
            } else {
                var14.method1041(class246.field2961);
            }
            class82.method187(var14, 500000);
        }
        Iterator var16 = this.field4030.iterator();
        while (var16.hasNext()) {
            class41 var17 = (class41) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class49 var19 = new class49(var17.field515, var17.field512, var17.field511);
                var18.method1042(new Object[] { var19, arg0, arg1 });
                var18.method1041(class246.field2957);
                class82.method187(var18, 500000);
            }
        }
        this.field4030 = var11;
    }

    @ObfuscatedName("lo.l(IIZZI)V")
    public void method5678(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = Statics.method426();
        this.method5549(arg0, arg1, arg3, var5);
        if (!this.method5554() && arg3 || arg2) {
            if (arg3) {
                this.field4043 = arg0;
                this.field4018 = arg1;
                this.field4019 = this.field4025;
                this.field4033 = this.field4026;
            }
            if (this.field4019 != -1) {
                int var7 = arg0 - this.field4043;
                int var8 = arg1 - this.field4018;
                this.method5552(this.field4019 - (int) ((float) var7 / this.field4058), this.field4033 + (int) ((float) var8 / this.field4058), false);
            }
        } else {
            this.method5553();
        }
        if (arg3) {
            this.field4041 = var5;
            this.field4040 = arg0;
            this.field4047 = arg1;
        }
    }

    @ObfuscatedName("lo.b(IIZJ)V")
    public void method5549(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4021 == null) {
            this.field4061 = null;
            return;
        }
        int var6 = (int) ((float) this.field4025 + ((float) (arg0 - this.field4064) - (float) this.method5581() * this.field4029 / 2.0F) / this.field4029);
        int var7 = (int) ((float) this.field4026 - ((float) (arg1 - this.field4034) - (float) this.method5582() * this.field4029 / 2.0F) / this.field4029);
        this.field4061 = this.field4021.method257(var6 + this.field4021.method264() * 64, var7 + this.field4021.method266() * 64);
        if (this.field4061 == null || !arg2) {
            return;
        }
        boolean var8 = client.field936 >= 2;
        if (var8 && class52.field615[82] && class52.field615[81]) {
            client.method2322(this.field4061.field2777, this.field4061.field2776, this.field4061.field2778, false);
            return;
        }
        boolean var9 = true;
        if (this.field4028) {
            int var10 = arg0 - this.field4040;
            int var11 = arg1 - this.field4047;
            if (arg3 - this.field4041 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class185 var12 = class185.method343(class182.field2419, client.field1073.field1457);
            var12.field2478.method3412(this.field4061.method4038());
            client.field1073.method1916(var12);
            this.field4041 = 0L;
        }
    }

    @ObfuscatedName("lo.e(I)V")
    public void method5571() {
        if (Statics.field1468 != null) {
            this.field4029 = this.field4058;
            return;
        }
        if (this.field4029 < this.field4058) {
            this.field4029 = Math.min(this.field4058, this.field4029 / 30.0F + this.field4029);
        }
        if (this.field4029 > this.field4058) {
            this.field4029 = Math.max(this.field4058, this.field4029 - this.field4029 / 30.0F);
        }
    }

    @ObfuscatedName("lo.x(I)V")
    public void method5551() {
        if (!this.method5554()) {
            return;
        }
        int var1 = this.field4059 - this.field4025;
        int var2 = this.field4039 - this.field4026;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5552(this.field4025 + var1, this.field4026 + var2, true);
        if (this.field4059 == this.field4025 && this.field4039 == this.field4026) {
            this.field4059 = -1;
            this.field4039 = -1;
        }
    }

    @ObfuscatedName("lo.p(IIZI)V")
    public final void method5552(int arg0, int arg1, boolean arg2) {
        this.field4025 = arg0;
        this.field4026 = arg1;
        Statics.method426();
        if (arg2) {
            this.method5553();
        }
    }

    @ObfuscatedName("lo.o(B)V")
    public final void method5553() {
        this.field4018 = -1;
        this.field4043 = -1;
        this.field4033 = -1;
        this.field4019 = -1;
    }

    @ObfuscatedName("lo.c(I)Z")
    public boolean method5554() {
        return this.field4059 != -1 && this.field4039 != -1;
    }

    @ObfuscatedName("lo.u(IIIB)Laz;")
    public class33 method5555(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4017.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method254(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lo.k(IIIZB)V")
    public void method5628(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5555(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4020;
        }
        boolean var6 = false;
        if (this.field4022 != var5 || arg3) {
            this.field4022 = var5;
            this.method5560(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5698(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lo.z(II)V")
    public void method5716(int arg0) {
        class33 var2 = this.method5573(arg0);
        if (var2 != null) {
            this.method5560(var2);
        }
    }

    @ObfuscatedName("lo.w(B)I")
    public int method5558() {
        return this.field4021 == null ? -1 : this.field4021.method305();
    }

    @ObfuscatedName("lo.s(B)Laz;")
    public class33 method5663() {
        return this.field4021;
    }

    @ObfuscatedName("lo.d(Laz;B)V")
    public void method5560(class33 arg0) {
        if (this.field4021 == null || this.field4021 != arg0) {
            this.method5707(arg0);
            this.method5698(-1, -1, -1);
        }
    }

    @ObfuscatedName("lo.f(Laz;I)V")
    public void method5707(class33 arg0) {
        this.field4021 = arg0;
        this.field4023 = new class43(this.field4055, this.field4046);
        this.field4024.method5530(this.field4021.method261());
    }

    @ObfuscatedName("lo.r(Laz;Lik;Lik;ZI)V")
    public void method5562(class33 arg0, class239 arg1, class239 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4021 == null || this.field4021 != arg0) {
            this.method5707(arg0);
        }
        if (!arg3 && this.field4021.method254(arg1.field2778, arg1.field2777, arg1.field2776)) {
            this.method5698(arg1.field2778, arg1.field2777, arg1.field2776);
        } else {
            this.method5698(arg2.field2778, arg2.field2777, arg2.field2776);
        }
    }

    @ObfuscatedName("lo.y(IIII)V")
    public void method5698(int arg0, int arg1, int arg2) {
        if (this.field4021 == null) {
            return;
        }
        int[] var4 = this.field4021.method260(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4021.method260(this.field4021.method269(), this.field4021.method268(), this.field4021.method270());
        }
        this.method5552(var4[0] - this.field4021.method264() * 64, var4[1] - this.field4021.method266() * 64, true);
        this.field4059 = -1;
        this.field4039 = -1;
        this.field4029 = this.method5570(this.field4021.method328());
        this.field4058 = this.field4029;
        this.field4056 = null;
        this.field4044 = null;
        this.field4023.method567();
    }

    @ObfuscatedName("lo.h(IIIIII)V")
    public void method5684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class328.method5269(var6);
        class328.method5320(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class328.method5275(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4024.method5533();
        if (var7 < 100) {
            this.method5683(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4023.method541()) {
            this.field4023.method533(this.field4012, this.field4021.method261(), client.field854);
            if (!this.field4023.method541()) {
                return;
            }
        }
        if (this.field4027 != null) {
            this.field4008++;
            if (this.field4008 % this.field4036 == 0) {
                this.field4008 = 0;
                this.field4042++;
            }
            if (this.field4042 >= this.field4066 && !this.field4037) {
                this.field4027 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4029));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4029));
        this.field4023.method535(this.field4025 - var8 / 2, this.field4026 - var9 / 2, var8 / 2 + this.field4025, var9 / 2 + this.field4026, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4016) {
            boolean var10 = false;
            if (arg4 - this.field4051 > 100) {
                this.field4051 = arg4;
                var10 = true;
            }
            this.field4023.method536(this.field4025 - var8 / 2, this.field4026 - var9 / 2, var8 / 2 + this.field4025, var9 / 2 + this.field4026, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4054, this.field4027, this.field4008, this.field4036, var10);
        }
        this.method5566(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field936 >= 2;
        if (var11 && this.field4062 && this.field4061 != null) {
            this.field4031.method5073("Coord: " + this.field4061, class328.field3960 + 10, class328.field3961 + 20, 16776960, -1);
        }
        this.field4035 = var8;
        this.field4032 = var9;
        this.field4064 = arg0;
        this.field4034 = arg1;
        class328.method5264(var6);
    }

    @ObfuscatedName("lo.av(IIIIIII)Z")
    public boolean method5720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4063 == null) {
            return true;
        } else if (this.field4063.field3984 != arg0 || this.field4063.field3985 != arg1) {
            return true;
        } else if (this.field4023.field532 != this.field4038) {
            return true;
        } else if (client.field1115 != this.field4067) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lo.aj(IIIIIIB)V")
    public void method5566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1468 == null) {
            return;
        }
        int var7 = 512 / (this.field4023.field532 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5688() - arg4 / 2 - var7;
        int var14 = this.method5579() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4023.field532 * (var7 + var13 - this.field4065);
        int var16 = arg1 - this.field4023.field532 * (var7 - (var14 - this.field4045));
        if (this.method5720(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4063 != null && this.field4063.field3984 == var11 && this.field4063.field3985 == var12) {
                Arrays.fill(this.field4063.field3986, 0);
            } else {
                this.field4063 = new class332(var11, var12);
            }
            this.field4065 = this.method5688() - arg4 / 2 - var7;
            this.field4045 = this.method5579() - arg5 / 2 - var7;
            this.field4038 = this.field4023.field532;
            Statics.field1468.method4343(this.field4065, this.field4045, this.field4063, (float) this.field4038 / var10);
            this.field4067 = client.field1115;
            var15 = arg0 - this.field4023.field532 * (var7 + var13 - this.field4065);
            var16 = arg1 - this.field4023.field532 * (var7 - (var14 - this.field4045));
        }
        class328.method5318(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4063.method5408(var15, var16, 192);
        } else {
            this.field4063.method5393(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lo.ae(IIIII)V")
    public void method5694(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4024.method5529()) {
            return;
        }
        if (!this.field4023.method541()) {
            this.field4023.method533(this.field4012, this.field4021.method261(), client.field854);
            if (!this.field4023.method541()) {
                return;
            }
        }
        this.field4023.method554(arg0, arg1, arg2, arg3, this.field4027, this.field4008, this.field4036);
    }

    @ObfuscatedName("lo.am(II)V")
    public void method5568(int arg0) {
        this.field4058 = this.method5570(arg0);
    }

    @ObfuscatedName("lo.az(IIIIII)V")
    public void method5683(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class328.method5275(arg0, arg1, arg2, arg3, -16777216);
        class328.method5282(var7 - 152, var8, 304, 34, -65536);
        class328.method5275(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4031.method5076(class252.field3304, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lo.ap(IB)F")
    public float method5570(int arg0) {
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

    @ObfuscatedName("lo.ah(I)I")
    public int method5561() {
        if ((double) this.field4058 == 1.0D) {
            return 25;
        } else if ((double) this.field4058 == 1.5D) {
            return 37;
        } else if ((double) this.field4058 == 2.0D) {
            return 50;
        } else if ((double) this.field4058 == 3.0D) {
            return 75;
        } else if ((double) this.field4058 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lo.au(I)V")
    public void method5588() {
        this.field4024.method5537();
    }

    @ObfuscatedName("lo.ax(I)Z")
    public boolean method5606() {
        return this.field4024.method5529();
    }

    @ObfuscatedName("lo.ar(II)Laz;")
    public class33 method5573(int arg0) {
        Iterator var2 = this.field4017.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method305() != arg0);
        return var3;
    }

    @ObfuscatedName("lo.an(III)V")
    public void method5603(int arg0, int arg1) {
        if (this.field4021 != null && this.field4021.method255(arg0, arg1)) {
            this.field4059 = arg0 - this.field4021.method264() * 64;
            this.field4039 = arg1 - this.field4021.method266() * 64;
        }
    }

    @ObfuscatedName("lo.ai(III)V")
    public void method5575(int arg0, int arg1) {
        if (this.field4021 != null) {
            this.method5552(arg0 - this.field4021.method264() * 64, arg1 - this.field4021.method266() * 64, true);
            this.field4059 = -1;
            this.field4039 = -1;
        }
    }

    @ObfuscatedName("lo.al(IIII)V")
    public void method5576(int arg0, int arg1, int arg2) {
        if (this.field4021 != null) {
            int[] var4 = this.field4021.method260(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5603(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lo.at(IIIB)V")
    public void method5577(int arg0, int arg1, int arg2) {
        if (this.field4021 != null) {
            int[] var4 = this.field4021.method260(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5575(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lo.ag(I)I")
    public int method5688() {
        return this.field4021 == null ? -1 : this.field4025 + this.field4021.method264() * 64;
    }

    @ObfuscatedName("lo.as(B)I")
    public int method5579() {
        return this.field4021 == null ? -1 : this.field4026 + this.field4021.method266() * 64;
    }

    @ObfuscatedName("lo.aw(I)Lik;")
    public class239 method5580() {
        return this.field4021 == null ? null : this.field4021.method257(this.method5688(), this.method5579());
    }

    @ObfuscatedName("lo.aq(I)I")
    public int method5581() {
        return this.field4035;
    }

    @ObfuscatedName("lo.aa(I)I")
    public int method5582() {
        return this.field4032;
    }

    @ObfuscatedName("lo.af(II)V")
    public void method5583(int arg0) {
        if (arg0 >= 1) {
            this.field4066 = arg0;
        }
    }

    @ObfuscatedName("lo.ak(B)V")
    public void method5584() {
        this.field4066 = 3;
    }

    @ObfuscatedName("lo.ab(II)V")
    public void method5586(int arg0) {
        if (arg0 >= 1) {
            this.field4036 = arg0;
        }
    }

    @ObfuscatedName("lo.ac(B)V")
    public void method5679() {
        this.field4036 = 50;
    }

    @ObfuscatedName("lo.ad(ZB)V")
    public void method5587(boolean arg0) {
        this.field4037 = arg0;
    }

    @ObfuscatedName("lo.bg(II)V")
    public void method5627(int arg0) {
        this.field4027 = new HashSet();
        this.field4027.add(arg0);
        this.field4042 = 0;
        this.field4008 = 0;
    }

    @ObfuscatedName("lo.br(IB)V")
    public void method5676(int arg0) {
        this.field4027 = new HashSet();
        this.field4042 = 0;
        this.field4008 = 0;
        for (int var2 = 0; var2 < Statics.field3455.length; var2++) {
            if (Statics.field3455[var2] != null && Statics.field3455[var2].field3475 == arg0) {
                this.field4027.add(Statics.field3455[var2].field3458);
            }
        }
    }

    @ObfuscatedName("lo.ba(I)V")
    public void method5590() {
        this.field4027 = null;
    }

    @ObfuscatedName("lo.bk(ZI)V")
    public void method5705(boolean arg0) {
        this.field4016 = !arg0;
    }

    @ObfuscatedName("lo.be(IZI)V")
    public void method5592(int arg0, boolean arg1) {
        if (arg1) {
            this.field4048.remove(arg0);
        } else {
            this.field4048.add(arg0);
        }
        this.method5607();
    }

    @ObfuscatedName("lo.bc(IZI)V")
    public void method5593(int arg0, boolean arg1) {
        if (arg1) {
            this.field4052.remove(arg0);
        } else {
            this.field4052.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3455.length; var3++) {
            if (Statics.field3455[var3] != null && Statics.field3455[var3].field3475 == arg0) {
                int var4 = Statics.field3455[var3].field3458;
                if (arg1) {
                    this.field4053.remove(var4);
                } else {
                    this.field4053.add(var4);
                }
            }
        }
        this.method5607();
    }

    @ObfuscatedName("lo.bm(B)Z")
    public boolean method5594() {
        return !this.field4016;
    }

    @ObfuscatedName("lo.bh(IB)Z")
    public boolean method5649(int arg0) {
        return !this.field4048.contains(arg0);
    }

    @ObfuscatedName("lo.bs(IB)Z")
    public boolean method5629(int arg0) {
        return !this.field4052.contains(arg0);
    }

    @ObfuscatedName("lo.bj(B)V")
    public void method5607() {
        this.field4054.clear();
        this.field4054.addAll(this.field4048);
        this.field4054.addAll(this.field4053);
    }

    @ObfuscatedName("lo.bt(IIIIIII)V")
    public void method5636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4024.method5529()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4029));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4029));
        List var9 = this.field4023.method552(this.field4025 - var7 / 2 - 1, this.field4026 - var8 / 2 - 1, var7 / 2 + this.field4025 + 1, var8 / 2 + this.field4026 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class270 var12 = Statics.field3455[var11.field515];
            var13 = false;
            for (int var14 = this.field4057.length - 1; var14 >= 0; var14--) {
                if (var12.field3466[var14] != null) {
                    client.method3034(var12.field3466[var14], var12.field3477, this.field4057[var14], var11.field515, var11.field512.method4038(), var11.field511.method4038());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lo.by(ILik;B)Lik;")
    public class239 method5599(int arg0, class239 arg1) {
        if (!this.field4024.method5529()) {
            return null;
        } else if (!this.field4023.method541()) {
            return null;
        } else if (this.field4021.method255(arg1.field2777, arg1.field2776)) {
            HashMap var3 = this.field4023.method534();
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
                        return var5.field511;
                    }
                    var8 = (class41) var7.next();
                    int var9 = var8.field511.field2777 - arg1.field2777;
                    int var10 = var8.field511.field2776 - arg1.field2776;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field511;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lo.bn(IILik;Lik;I)V")
    public void method5600(int arg0, int arg1, class239 arg2, class239 arg3) {
        class69 var5 = new class69();
        class49 var6 = new class49(arg1, arg2, arg3);
        var5.method1042(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1041(class246.field2966);
                break;
            case 1009:
                var5.method1041(class246.field2965);
                break;
            case 1010:
                var5.method1041(class246.field2958);
                break;
            case 1011:
                var5.method1041(class246.field2959);
                break;
            case 1012:
                var5.method1041(class246.field2956);
        }
        class82.method187(var5, 500000);
    }

    @ObfuscatedName("lo.bb(I)Lal;")
    public class41 method5563() {
        if (!this.field4024.method5529()) {
            return null;
        } else if (this.field4023.method541()) {
            HashMap var1 = this.field4023.method534();
            this.field4056 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4056.addAll(var3);
            }
            this.field4044 = this.field4056.iterator();
            return this.method5602();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lo.bq(I)Lal;")
    public class41 method5602() {
        if (this.field4044 == null) {
            return null;
        } else if (this.field4044.hasNext()) {
            return (class41) this.field4044.next();
        } else {
            return null;
        }
    }
}
