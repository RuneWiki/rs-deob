package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mr")
public class class359 {

    @ObfuscatedName("mr.w")
    public class277 field4044;

    @ObfuscatedName("mr.f")
    public class277 field4032;

    @ObfuscatedName("mr.o")
    public class277 field4027;

    @ObfuscatedName("mr.x")
    public static final class361 field4054 = class361.field4087;

    @ObfuscatedName("mr.r")
    public static final class361 field4029 = class361.field4088;

    @ObfuscatedName("mr.p")
    public static final class361 field4076 = class361.field4096;

    @ObfuscatedName("mr.h")
    public class302 field4075;

    @ObfuscatedName("mr.k")
    public HashMap field4058;

    @ObfuscatedName("mr.a")
    public class397[] field4033;

    @ObfuscatedName("mr.q")
    public HashMap field4043;

    @ObfuscatedName("mr.u")
    public class168 field4035;

    @ObfuscatedName("mr.e")
    public class168 field4067;

    @ObfuscatedName("mr.c")
    public class168 field4037;

    @ObfuscatedName("mr.i")
    public class170 field4038;

    @ObfuscatedName("mr.m")
    public class358 field4039;

    @ObfuscatedName("mr.b")
    public int field4030;

    @ObfuscatedName("mr.z")
    public int field4025;

    @ObfuscatedName("mr.d")
    public int field4042 = -1;

    @ObfuscatedName("mr.y")
    public int field4070 = -1;

    @ObfuscatedName("mr.g")
    public float field4022;

    @ObfuscatedName("mr.ae")
    public float field4045;

    @ObfuscatedName("mr.an")
    public int field4046 = -1;

    @ObfuscatedName("mr.am")
    public int field4047 = -1;

    @ObfuscatedName("mr.al")
    public int field4060 = -1;

    @ObfuscatedName("mr.aq")
    public int field4049 = -1;

    @ObfuscatedName("mr.aa")
    public int field4050 = 3;

    @ObfuscatedName("mr.ab")
    public int field4051 = 50;

    @ObfuscatedName("mr.ax")
    public boolean field4052 = false;

    @ObfuscatedName("mr.au")
    public HashSet field4053 = null;

    @ObfuscatedName("mr.av")
    public int field4077 = -1;

    @ObfuscatedName("mr.as")
    public int field4055 = -1;

    @ObfuscatedName("mr.ao")
    public int field4056 = -1;

    @ObfuscatedName("mr.az")
    public int field4057 = -1;

    @ObfuscatedName("mr.ak")
    public int field4079 = -1;

    @ObfuscatedName("mr.aj")
    public int field4059 = -1;

    @ObfuscatedName("mr.at")
    public long field4072;

    @ObfuscatedName("mr.af")
    public int field4061;

    @ObfuscatedName("mr.ar")
    public int field4062;

    @ObfuscatedName("mr.ay")
    public boolean field4063 = true;

    @ObfuscatedName("mr.ag")
    public HashSet field4064 = new HashSet();

    @ObfuscatedName("mr.ai")
    public HashSet field4065 = new HashSet();

    @ObfuscatedName("mr.ad")
    public HashSet field4048 = new HashSet();

    @ObfuscatedName("mr.ac")
    public HashSet field4023 = new HashSet();

    @ObfuscatedName("mr.aw")
    public boolean field4068 = false;

    @ObfuscatedName("mr.bt")
    public int field4069 = 0;

    @ObfuscatedName("mr.br")
    public final int[] field4021 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("mr.by")
    public List field4071;

    @ObfuscatedName("mr.bv")
    public Iterator field4031;

    @ObfuscatedName("mr.bf")
    public HashSet field4073 = new HashSet();

    @ObfuscatedName("mr.bd")
    public class245 field4074 = null;

    @ObfuscatedName("mr.bg")
    public boolean field4026 = false;

    @ObfuscatedName("mr.bw")
    public class398 field4066;

    @ObfuscatedName("mr.bo")
    public int field4040;

    @ObfuscatedName("mr.bm")
    public int field4078 = -1;

    @ObfuscatedName("mr.ba")
    public int field4028 = -1;

    @ObfuscatedName("mr.bu")
    public int field4080 = -1;

    @ObfuscatedName("mr.s(Ljy;Ljy;Ljy;Lkt;Ljava/util/HashMap;[Lof;I)V")
    public void method5554(class277 arg0, class277 arg1, class277 arg2, class302 arg3, HashMap arg4, class397[] arg5) {
        this.field4033 = arg5;
        this.field4044 = arg0;
        this.field4032 = arg1;
        this.field4027 = arg2;
        this.field4075 = arg3;
        this.field4058 = new HashMap();
        this.field4058.put(class165.field1917, arg4.get(field4054));
        this.field4058.put(class165.field1922, arg4.get(field4029));
        this.field4058.put(class165.field1918, arg4.get(field4076));
        this.field4039 = new class358(arg0);
        int var7 = this.field4044.method4474(class187.field2118.field2114);
        int[] var8 = this.field4044.method4521(var7);
        this.field4043 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class385 var10 = new class385(this.field4044.method4459(var7, var8[var9]));
            class168 var11 = new class168();
            var11.method2970(var10, var8[var9]);
            this.field4043.put(var11.method2979(), var11);
            if (var11.method2969()) {
                this.field4035 = var11;
            }
        }
        this.method5507(this.field4035);
        this.field4037 = null;
    }

    @ObfuscatedName("mr.t(I)V")
    public void method5660() {
        class169.field1962.method3901(5);
    }

    @ObfuscatedName("mr.v(IIZIIIII)V")
    public void method5494(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4039.method5480()) {
            return;
        }
        this.method5497();
        this.method5492();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4022));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4022));
        List var10 = this.field4038.method3159(this.field4030 - var8 / 2 - 1, this.field4025 - var9 / 2 - 1, var8 / 2 + this.field4030 + 1, var9 / 2 + this.field4025 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class186 var13 = (class186) var12.next();
            var11.add(var13);
            class68 var14 = new class68();
            class191 var15 = new class191(var13.method2921(), var13.field2111, var13.field2110);
            var14.method1707(new Object[] { var15, arg0, arg1 });
            if (this.field4073.contains(var13)) {
                var14.method1708(17);
            } else {
                var14.method1708(15);
            }
            class51.method2079(var14);
        }
        Iterator var16 = this.field4073.iterator();
        while (var16.hasNext()) {
            class186 var17 = (class186) var16.next();
            if (!var11.contains(var17)) {
                class68 var18 = new class68();
                class191 var19 = new class191(var17.method2921(), var17.field2111, var17.field2110);
                var18.method1707(new Object[] { var19, arg0, arg1 });
                var18.method1708(16);
                class51.method2079(var18);
            }
        }
        this.field4073 = var11;
    }

    @ObfuscatedName("mr.j(IIZZB)V")
    public void method5495(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class382.method2013();
        this.method5496(arg0, arg1, arg3, var5);
        if (!this.method5527() && arg3 || arg2) {
            if (arg3) {
                this.field4079 = arg0;
                this.field4059 = arg1;
                this.field4056 = this.field4030;
                this.field4057 = this.field4025;
            }
            if (this.field4056 != -1) {
                int var7 = arg0 - this.field4079;
                int var8 = arg1 - this.field4059;
                this.method5499(this.field4056 - (int) ((float) var7 / this.field4045), this.field4057 + (int) ((float) var8 / this.field4045), false);
            }
        } else {
            this.method5500();
        }
        if (arg3) {
            this.field4072 = var5;
            this.field4061 = arg0;
            this.field4062 = arg1;
        }
    }

    @ObfuscatedName("mr.l(IIZJ)V")
    public void method5496(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4067 == null) {
            this.field4074 = null;
            return;
        }
        int var6 = (int) ((float) this.field4030 + ((float) (arg0 - this.field4060) - (float) this.method5529() * this.field4022 / 2.0F) / this.field4022);
        int var7 = (int) ((float) this.field4025 - ((float) (arg1 - this.field4049) - (float) this.method5530() * this.field4022 / 2.0F) / this.field4022);
        this.field4074 = this.field4067.method2975(var6 + this.field4067.method3029() * 64, var7 + this.field4067.method2985() * 64);
        if (this.field4074 == null || !arg2) {
            return;
        }
        if (client.method2470() && class11.field46[82] && class11.field46[81]) {
            client.method5429(this.field4074.field2920, this.field4074.field2922, this.field4074.field2921, false);
            return;
        }
        boolean var8 = true;
        if (this.field4063) {
            int var9 = arg0 - this.field4061;
            int var10 = arg1 - this.field4062;
            if (arg3 - this.field4072 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class229 var11 = class229.method2538(class227.field2667, client.field453.field1205);
            var11.field2691.method6002(this.field4074.method4200());
            client.field453.method1987(var11);
            this.field4072 = 0L;
        }
    }

    @ObfuscatedName("mr.n(I)V")
    public void method5497() {
        if (Statics.field4128 != null) {
            this.field4022 = this.field4045;
            return;
        }
        if (this.field4022 < this.field4045) {
            this.field4022 = Math.min(this.field4045, this.field4022 / 30.0F + this.field4022);
        }
        if (this.field4022 > this.field4045) {
            this.field4022 = Math.max(this.field4045, this.field4022 - this.field4022 / 30.0F);
        }
    }

    @ObfuscatedName("mr.w(I)V")
    public void method5492() {
        if (!this.method5527()) {
            return;
        }
        int var1 = this.field4042 - this.field4030;
        int var2 = this.field4070 - this.field4025;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5499(this.field4030 + var1, this.field4025 + var2, true);
        if (this.field4042 == this.field4030 && this.field4070 == this.field4025) {
            this.field4042 = -1;
            this.field4070 = -1;
        }
    }

    @ObfuscatedName("mr.f(IIZI)V")
    public final void method5499(int arg0, int arg1, boolean arg2) {
        this.field4030 = arg0;
        this.field4025 = arg1;
        class382.method2013();
        if (arg2) {
            this.method5500();
        }
    }

    @ObfuscatedName("mr.o(I)V")
    public final void method5500() {
        this.field4059 = -1;
        this.field4079 = -1;
        this.field4057 = -1;
        this.field4056 = -1;
    }

    @ObfuscatedName("mr.x(I)Z")
    public boolean method5527() {
        return this.field4042 != -1 && this.field4070 != -1;
    }

    @ObfuscatedName("mr.r(IIII)Lfa;")
    public class168 method5502(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4043.values().iterator();
        class168 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class168) var4.next();
        } while (!var5.method2972(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("mr.p(IIIZI)V")
    public void method5498(int arg0, int arg1, int arg2, boolean arg3) {
        class168 var5 = this.method5502(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4035;
        }
        boolean var6 = false;
        if (this.field4037 != var5 || arg3) {
            this.field4037 = var5;
            this.method5507(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5619(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mr.h(IB)V")
    public void method5504(int arg0) {
        class168 var2 = this.method5521(arg0);
        if (var2 != null) {
            this.method5507(var2);
        }
    }

    @ObfuscatedName("mr.k(B)I")
    public int method5505() {
        return this.field4067 == null ? -1 : this.field4067.method2977();
    }

    @ObfuscatedName("mr.a(I)Lfa;")
    public class168 method5561() {
        return this.field4067;
    }

    @ObfuscatedName("mr.q(Lfa;I)V")
    public void method5507(class168 arg0) {
        if (this.field4067 == null || this.field4067 != arg0) {
            this.method5650(arg0);
            this.method5619(-1, -1, -1);
        }
    }

    @ObfuscatedName("mr.u(Lfa;I)V")
    public void method5650(class168 arg0) {
        this.field4067 = arg0;
        this.field4038 = new class170(this.field4033, this.field4058, this.field4032, this.field4027);
        this.field4039.method5478(this.field4067.method2979());
    }

    @ObfuscatedName("mr.e(Lfa;Lij;Lij;ZB)V")
    public void method5509(class168 arg0, class245 arg1, class245 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4067 == null || this.field4067 != arg0) {
            this.method5650(arg0);
        }
        if (!arg3 && this.field4067.method2972(arg1.field2921, arg1.field2920, arg1.field2922)) {
            this.method5619(arg1.field2921, arg1.field2920, arg1.field2922);
        } else {
            this.method5619(arg2.field2921, arg2.field2920, arg2.field2922);
        }
    }

    @ObfuscatedName("mr.c(IIII)V")
    public void method5619(int arg0, int arg1, int arg2) {
        if (this.field4067 == null) {
            return;
        }
        int[] var4 = this.field4067.method3008(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4067.method3008(this.field4067.method2988(), this.field4067.method2998(), this.field4067.method2989());
        }
        this.method5499(var4[0] - this.field4067.method3029() * 64, var4[1] - this.field4067.method2985() * 64, true);
        this.field4042 = -1;
        this.field4070 = -1;
        this.field4022 = this.method5548(this.field4067.method3005());
        this.field4045 = this.field4022;
        this.field4071 = null;
        this.field4031 = null;
        this.field4038.method3153();
    }

    @ObfuscatedName("mr.i(IIIIII)V")
    public void method5511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class394.method6266(var6);
        class394.method6286(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class394.method6272(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4039.method5484();
        if (var7 < 100) {
            this.method5658(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4038.method3177()) {
            this.field4038.method3152(this.field4044, this.field4067.method2979(), client.field562);
            if (!this.field4038.method3177()) {
                return;
            }
        }
        if (this.field4053 != null) {
            this.field4055++;
            if (this.field4055 % this.field4051 == 0) {
                this.field4055 = 0;
                this.field4077++;
            }
            if (this.field4077 >= this.field4050 && !this.field4052) {
                this.field4053 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4022));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4022));
        this.field4038.method3154(this.field4030 - var8 / 2, this.field4025 - var9 / 2, var8 / 2 + this.field4030, var9 / 2 + this.field4025, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4068) {
            boolean var10 = false;
            if (arg4 - this.field4069 > 100) {
                this.field4069 = arg4;
                var10 = true;
            }
            this.field4038.method3186(this.field4030 - var8 / 2, this.field4025 - var9 / 2, var8 / 2 + this.field4030, var9 / 2 + this.field4025, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4023, this.field4053, this.field4055, this.field4051, var10);
        }
        this.method5513(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method2470() && this.field4026 && this.field4074 != null) {
            this.field4075.method4891("Coord: " + this.field4074, class394.field4249 + 10, class394.field4247 + 20, 16776960, -1);
        }
        this.field4046 = var8;
        this.field4047 = var9;
        this.field4060 = arg0;
        this.field4049 = arg1;
        class394.method6267(var6);
    }

    @ObfuscatedName("mr.m(IIIIIII)Z")
    public boolean method5512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4066 == null) {
            return true;
        } else if (this.field4066.field4270 != arg0 || this.field4066.field4271 != arg1) {
            return true;
        } else if (this.field4038.field1989 != this.field4040) {
            return true;
        } else if (client.field680 != this.field4080) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("mr.b(IIIIIII)V")
    public void method5513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field4128 == null) {
            return;
        }
        int var7 = 512 / (this.field4038.field1989 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5526() - arg4 / 2 - var7;
        int var14 = this.method5571() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4038.field1989 * (var7 + var13 - this.field4078);
        int var16 = arg1 - this.field4038.field1989 * (var7 - (var14 - this.field4028));
        if (this.method5512(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4066 != null && this.field4066.field4270 == var11 && this.field4066.field4271 == var12) {
                Arrays.fill(this.field4066.field4280, 0);
            } else {
                this.field4066 = new class398(var11, var12);
            }
            this.field4078 = this.method5526() - arg4 / 2 - var7;
            this.field4028 = this.method5571() - arg5 / 2 - var7;
            this.field4040 = this.field4038.field1989;
            Statics.field4128.method4637(this.field4078, this.field4028, this.field4066, (float) this.field4040 / var10);
            this.field4080 = client.field680;
            var15 = arg0 - this.field4038.field1989 * (var7 + var13 - this.field4078);
            var16 = arg1 - this.field4038.field1989 * (var7 - (var14 - this.field4028));
        }
        class394.method6271(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4066.method6388(var15, var16, 192);
        } else {
            this.field4066.method6391(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("mr.z(IIIII)V")
    public void method5514(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4039.method5480()) {
            return;
        }
        if (!this.field4038.method3177()) {
            this.field4038.method3152(this.field4044, this.field4067.method2979(), client.field562);
            if (!this.field4038.method3177()) {
                return;
            }
        }
        this.field4038.method3176(arg0, arg1, arg2, arg3, this.field4053, this.field4055, this.field4051);
    }

    @ObfuscatedName("mr.d(II)V")
    public void method5622(int arg0) {
        this.field4045 = this.method5548(arg0);
    }

    @ObfuscatedName("mr.y(IIIIII)V")
    public void method5658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class394.method6272(arg0, arg1, arg2, arg3, -16777216);
        class394.method6299(var7 - 152, var8, 304, 34, -65536);
        class394.method6272(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4075.method4955(class270.field3527, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("mr.g(II)F")
    public float method5548(int arg0) {
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

    @ObfuscatedName("mr.ae(B)I")
    public int method5518() {
        if ((double) this.field4045 == 1.0D) {
            return 25;
        } else if ((double) this.field4045 == 1.5D) {
            return 37;
        } else if ((double) this.field4045 == 2.0D) {
            return 50;
        } else if ((double) this.field4045 == 3.0D) {
            return 75;
        } else if ((double) this.field4045 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("mr.an(I)V")
    public void method5519() {
        this.field4039.method5479();
    }

    @ObfuscatedName("mr.am(I)Z")
    public boolean method5520() {
        return this.field4039.method5480();
    }

    @ObfuscatedName("mr.al(IB)Lfa;")
    public class168 method5521(int arg0) {
        Iterator var2 = this.field4043.values().iterator();
        class168 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class168) var2.next();
        } while (var3.method2977() != arg0);
        return var3;
    }

    @ObfuscatedName("mr.aq(III)V")
    public void method5522(int arg0, int arg1) {
        if (this.field4067 != null && this.field4067.method2973(arg0, arg1)) {
            this.field4042 = arg0 - this.field4067.method3029() * 64;
            this.field4070 = arg1 - this.field4067.method2985() * 64;
        }
    }

    @ObfuscatedName("mr.aa(III)V")
    public void method5523(int arg0, int arg1) {
        if (this.field4067 != null) {
            this.method5499(arg0 - this.field4067.method3029() * 64, arg1 - this.field4067.method2985() * 64, true);
            this.field4042 = -1;
            this.field4070 = -1;
        }
    }

    @ObfuscatedName("mr.ab(IIII)V")
    public void method5524(int arg0, int arg1, int arg2) {
        if (this.field4067 != null) {
            int[] var4 = this.field4067.method3008(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5522(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mr.ax(IIII)V")
    public void method5550(int arg0, int arg1, int arg2) {
        if (this.field4067 != null) {
            int[] var4 = this.field4067.method3008(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5523(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mr.au(I)I")
    public int method5526() {
        return this.field4067 == null ? -1 : this.field4030 + this.field4067.method3029() * 64;
    }

    @ObfuscatedName("mr.av(I)I")
    public int method5571() {
        return this.field4067 == null ? -1 : this.field4025 + this.field4067.method2985() * 64;
    }

    @ObfuscatedName("mr.as(I)Lij;")
    public class245 method5528() {
        return this.field4067 == null ? null : this.field4067.method2975(this.method5526(), this.method5571());
    }

    @ObfuscatedName("mr.ao(I)I")
    public int method5529() {
        return this.field4046;
    }

    @ObfuscatedName("mr.az(I)I")
    public int method5530() {
        return this.field4047;
    }

    @ObfuscatedName("mr.ak(II)V")
    public void method5531(int arg0) {
        if (arg0 >= 1) {
            this.field4050 = arg0;
        }
    }

    @ObfuscatedName("mr.aj(I)V")
    public void method5579() {
        this.field4050 = 3;
    }

    @ObfuscatedName("mr.at(IB)V")
    public void method5532(int arg0) {
        if (arg0 >= 1) {
            this.field4051 = arg0;
        }
    }

    @ObfuscatedName("mr.af(I)V")
    public void method5533() {
        this.field4051 = 50;
    }

    @ObfuscatedName("mr.ar(ZI)V")
    public void method5534(boolean arg0) {
        this.field4052 = arg0;
    }

    @ObfuscatedName("mr.ay(II)V")
    public void method5535(int arg0) {
        this.field4053 = new HashSet();
        this.field4053.add(arg0);
        this.field4077 = 0;
        this.field4055 = 0;
    }

    @ObfuscatedName("mr.ap(II)V")
    public void method5536(int arg0) {
        this.field4053 = new HashSet();
        this.field4077 = 0;
        this.field4055 = 0;
        for (int var2 = 0; var2 < Statics.field1532; var2++) {
            if (class141.method1794(var2) != null && class141.method1794(var2).field1553 == arg0) {
                this.field4053.add(class141.method1794(var2).field1534);
            }
        }
    }

    @ObfuscatedName("mr.ah(I)V")
    public void method5681() {
        this.field4053 = null;
    }

    @ObfuscatedName("mr.ag(ZB)V")
    public void method5538(boolean arg0) {
        this.field4068 = !arg0;
    }

    @ObfuscatedName("mr.ai(IZB)V")
    public void method5651(int arg0, boolean arg1) {
        if (arg1) {
            this.field4064.remove(arg0);
        } else {
            this.field4064.add(arg0);
        }
        this.method5544();
    }

    @ObfuscatedName("mr.ad(IZB)V")
    public void method5540(int arg0, boolean arg1) {
        if (arg1) {
            this.field4065.remove(arg0);
        } else {
            this.field4065.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1532; var3++) {
            if (class141.method1794(var3) != null && class141.method1794(var3).field1553 == arg0) {
                int var4 = class141.method1794(var3).field1534;
                if (arg1) {
                    this.field4048.remove(var4);
                } else {
                    this.field4048.add(var4);
                }
            }
        }
        this.method5544();
    }

    @ObfuscatedName("mr.ac(I)Z")
    public boolean method5516() {
        return !this.field4068;
    }

    @ObfuscatedName("mr.aw(II)Z")
    public boolean method5542(int arg0) {
        return !this.field4064.contains(arg0);
    }

    @ObfuscatedName("mr.bt(IB)Z")
    public boolean method5618(int arg0) {
        return !this.field4065.contains(arg0);
    }

    @ObfuscatedName("mr.bk(I)V")
    public void method5544() {
        this.field4023.clear();
        this.field4023.addAll(this.field4064);
        this.field4023.addAll(this.field4048);
    }

    @ObfuscatedName("mr.br(IIIIIII)V")
    public void method5506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4039.method5480()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4022));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4022));
        List var9 = this.field4038.method3159(this.field4030 - var7 / 2 - 1, this.field4025 - var8 / 2 - 1, var7 / 2 + this.field4030 + 1, var8 / 2 + this.field4025 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class186 var11 = (class186) var10.next();
            class141 var12 = class141.method1794(var11.method2921());
            var13 = false;
            for (int var14 = this.field4021.length - 1; var14 >= 0; var14--) {
                if (var12.field1533[var14] != null) {
                    client.method43(var12.field1533[var14], var12.field1543, this.field4021[var14], var11.method2921(), var11.field2111.method4200(), var11.field2110.method4200());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("mr.by(ILij;I)Lij;")
    public class245 method5546(int arg0, class245 arg1) {
        if (!this.field4039.method5480()) {
            return null;
        } else if (!this.field4038.method3177()) {
            return null;
        } else if (this.field4067.method2973(arg1.field2920, arg1.field2922)) {
            HashMap var3 = this.field4038.method3175();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class186 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class186 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2110;
                    }
                    var8 = (class186) var7.next();
                    int var9 = var8.field2110.field2920 - arg1.field2920;
                    int var10 = var8.field2110.field2922 - arg1.field2922;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2110;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("mr.bv(IILij;Lij;B)V")
    public void method5547(int arg0, int arg1, class245 arg2, class245 arg3) {
        class68 var5 = new class68();
        class191 var6 = new class191(arg1, arg2, arg3);
        var5.method1707(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1708(10);
                break;
            case 1009:
                var5.method1708(11);
                break;
            case 1010:
                var5.method1708(12);
                break;
            case 1011:
                var5.method1708(13);
                break;
            case 1012:
                var5.method1708(14);
        }
        class51.method2079(var5);
    }

    @ObfuscatedName("mr.bf(I)Lgr;")
    public class186 method5629() {
        if (!this.field4039.method5480()) {
            return null;
        } else if (this.field4038.method3177()) {
            HashMap var1 = this.field4038.method3175();
            this.field4071 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4071.addAll(var3);
            }
            this.field4031 = this.field4071.iterator();
            return this.method5549();
        } else {
            return null;
        }
    }

    @ObfuscatedName("mr.bd(I)Lgr;")
    public class186 method5549() {
        if (this.field4031 == null) {
            return null;
        }
        class186 var1;
        do {
            if (!this.field4031.hasNext()) {
                return null;
            }
            var1 = (class186) this.field4031.next();
        } while (var1.method2921() == -1);
        return var1;
    }
}
