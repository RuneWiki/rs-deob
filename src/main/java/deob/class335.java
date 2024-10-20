package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lp")
public class class335 {

    @ObfuscatedName("lp.k")
    public class262 field4059;

    @ObfuscatedName("lp.s")
    public static final class310 field4009 = class310.field3869;

    @ObfuscatedName("lp.p")
    public static final class310 field4010 = class310.field3871;

    @ObfuscatedName("lp.x")
    public static final class310 field4011 = class310.field3868;

    @ObfuscatedName("lp.m")
    public class312 field4012;

    @ObfuscatedName("lp.h")
    public HashMap field4046;

    @ObfuscatedName("lp.t")
    public class331[] field4014;

    @ObfuscatedName("lp.i")
    public HashMap field4015;

    @ObfuscatedName("lp.u")
    public class33 field4021;

    @ObfuscatedName("lp.q")
    public class33 field4017;

    @ObfuscatedName("lp.v")
    public class33 field4018;

    @ObfuscatedName("lp.f")
    public class43 field4019;

    @ObfuscatedName("lp.b")
    public class334 field4020;

    @ObfuscatedName("lp.c")
    public int field4035;

    @ObfuscatedName("lp.j")
    public int field4022;

    @ObfuscatedName("lp.l")
    public int field4023 = -1;

    @ObfuscatedName("lp.g")
    public int field4024 = -1;

    @ObfuscatedName("lp.w")
    public float field4013;

    @ObfuscatedName("lp.o")
    public float field4026;

    @ObfuscatedName("lp.a")
    public int field4027 = -1;

    @ObfuscatedName("lp.ak")
    public int field4028 = -1;

    @ObfuscatedName("lp.ap")
    public int field4029 = -1;

    @ObfuscatedName("lp.ac")
    public int field4005 = -1;

    @ObfuscatedName("lp.aw")
    public int field4016 = 3;

    @ObfuscatedName("lp.as")
    public int field4044 = 50;

    @ObfuscatedName("lp.au")
    public boolean field4031 = false;

    @ObfuscatedName("lp.al")
    public HashSet field4034 = null;

    @ObfuscatedName("lp.af")
    public int field4042 = -1;

    @ObfuscatedName("lp.ai")
    public int field4036 = -1;

    @ObfuscatedName("lp.az")
    public int field4060 = -1;

    @ObfuscatedName("lp.aq")
    public int field4038 = -1;

    @ObfuscatedName("lp.ae")
    public int field4039 = -1;

    @ObfuscatedName("lp.ad")
    public int field4040 = -1;

    @ObfuscatedName("lp.ar")
    public long field4041;

    @ObfuscatedName("lp.ao")
    public int field4052;

    @ObfuscatedName("lp.at")
    public int field4043;

    @ObfuscatedName("lp.ag")
    public boolean field4056 = true;

    @ObfuscatedName("lp.ah")
    public HashSet field4062 = new HashSet();

    @ObfuscatedName("lp.ab")
    public HashSet field4047 = new HashSet();

    @ObfuscatedName("lp.am")
    public HashSet field4048 = new HashSet();

    @ObfuscatedName("lp.ay")
    public HashSet field4008 = new HashSet();

    @ObfuscatedName("lp.aj")
    public boolean field4050 = false;

    @ObfuscatedName("lp.aa")
    public int field4051 = 0;

    @ObfuscatedName("lp.bc")
    public final int[] field4032 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lp.br")
    public List field4053;

    @ObfuscatedName("lp.by")
    public Iterator field4055;

    @ObfuscatedName("lp.bl")
    public HashSet field4037 = new HashSet();

    @ObfuscatedName("lp.bs")
    public class239 field4033 = null;

    @ObfuscatedName("lp.bu")
    public boolean field4057 = false;

    @ObfuscatedName("lp.bz")
    public class332 field4061;

    @ObfuscatedName("lp.bt")
    public int field4049;

    @ObfuscatedName("lp.bm")
    public int field4030 = -1;

    @ObfuscatedName("lp.bf")
    public int field4054 = -1;

    @ObfuscatedName("lp.bj")
    public int field4006 = -1;

    @ObfuscatedName("lp.d(Ljk;Lkw;Ljava/util/HashMap;[Llv;I)V")
    public void method5691(class262 arg0, class312 arg1, HashMap arg2, class331[] arg3) {
        this.field4014 = arg3;
        this.field4059 = arg0;
        this.field4012 = arg1;
        this.field4046 = new HashMap();
        this.field4046.put(class25.field363, arg2.get(field4009));
        this.field4046.put(class25.field369, arg2.get(field4010));
        this.field4046.put(class25.field365, arg2.get(field4011));
        this.field4020 = new class334(arg0);
        int var5 = this.field4059.method4290(class42.field547.field543);
        int[] var6 = this.field4059.method4364(var5);
        this.field4015 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class195 var8 = new class195(this.field4059.method4273(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method265(var8, var6[var7]);
            this.field4015.put(var9.method262(), var9);
            if (var9.method279()) {
                this.field4021 = var9;
            }
        }
        this.method5617(this.field4021);
        this.field4018 = null;
    }

    @ObfuscatedName("lp.z(I)I")
    public int method5621() {
        return this.field4059.method4335(this.field4021.method262(), class42.field545.field543) ? 100 : this.field4059.method4298(this.field4021.method262());
    }

    @ObfuscatedName("lp.n(I)V")
    public void method5603() {
        class36.method4232();
    }

    @ObfuscatedName("lp.r(IIZIIIII)V")
    public void method5628(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4020.method5590()) {
            return;
        }
        this.method5746();
        this.method5641();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4013));
        List var10 = this.field4019.method512(this.field4035 - var8 / 2 - 1, this.field4022 - var9 / 2 - 1, var8 / 2 + this.field4035 + 1, var9 / 2 + this.field4022 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class41 var13 = (class41) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class49 var15 = new class49(var13.field536, var13.field533, var13.field532);
            var14.method981(new Object[] { var15, arg0, arg1 });
            if (this.field4037.contains(var13)) {
                var14.method982(class246.field2970);
            } else {
                var14.method982(class246.field2968);
            }
            class82.method697(var14);
        }
        Iterator var16 = this.field4037.iterator();
        while (var16.hasNext()) {
            class41 var17 = (class41) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class49 var19 = new class49(var17.field536, var17.field533, var17.field532);
                var18.method981(new Object[] { var19, arg0, arg1 });
                var18.method982(class246.field2966);
                class82.method697(var18);
            }
        }
        this.field4037 = var11;
    }

    @ObfuscatedName("lp.e(IIZZI)V")
    public void method5643(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class197.method1501();
        this.method5606(arg0, arg1, arg3, var5);
        if (!this.method5611() && arg3 || arg2) {
            if (arg3) {
                this.field4039 = arg0;
                this.field4040 = arg1;
                this.field4060 = this.field4035;
                this.field4038 = this.field4022;
            }
            if (this.field4060 != -1) {
                int var7 = arg0 - this.field4039;
                int var8 = arg1 - this.field4040;
                this.method5671(this.field4060 - (int) ((float) var7 / this.field4026), this.field4038 + (int) ((float) var8 / this.field4026), false);
            }
        } else {
            this.method5652();
        }
        if (arg3) {
            this.field4041 = var5;
            this.field4052 = arg0;
            this.field4043 = arg1;
        }
    }

    @ObfuscatedName("lp.y(IIZJ)V")
    public void method5606(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4017 == null) {
            this.field4033 = null;
            return;
        }
        int var6 = (int) ((float) this.field4035 + ((float) (arg0 - this.field4029) - (float) this.method5638() * this.field4013 / 2.0F) / this.field4013);
        int var7 = (int) ((float) this.field4022 - ((float) (arg1 - this.field4005) - (float) this.method5639() * this.field4013 / 2.0F) / this.field4013);
        this.field4033 = this.field4017.method258(var6 + this.field4017.method278() * 64, var7 + this.field4017.method268() * 64);
        if (this.field4033 == null || !arg2) {
            return;
        }
        boolean var8 = client.field1018 >= 2;
        if (var8 && class52.field637[82] && class52.field637[81]) {
            client.method9(this.field4033.field2791, this.field4033.field2789, this.field4033.field2790, false);
            return;
        }
        boolean var9 = true;
        if (this.field4056) {
            int var10 = arg0 - this.field4052;
            int var11 = arg1 - this.field4043;
            if (arg3 - this.field4041 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class185 var12 = class185.method251(class182.field2387, client.field900.field1471);
            var12.field2497.method3326(this.field4033.method4124());
            client.field900.method1921(var12);
            this.field4041 = 0L;
        }
    }

    @ObfuscatedName("lp.k(B)V")
    public void method5746() {
        if (Statics.field853 != null) {
            this.field4013 = this.field4026;
            return;
        }
        if (this.field4013 < this.field4026) {
            this.field4013 = Math.min(this.field4026, this.field4013 / 30.0F + this.field4013);
        }
        if (this.field4013 > this.field4026) {
            this.field4013 = Math.max(this.field4026, this.field4013 - this.field4013 / 30.0F);
        }
    }

    @ObfuscatedName("lp.s(B)V")
    public void method5641() {
        if (!this.method5611()) {
            return;
        }
        int var1 = this.field4023 - this.field4035;
        int var2 = this.field4024 - this.field4022;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5671(this.field4035 + var1, this.field4022 + var2, true);
        if (this.field4035 == this.field4023 && this.field4024 == this.field4022) {
            this.field4023 = -1;
            this.field4024 = -1;
        }
    }

    @ObfuscatedName("lp.x(IIZI)V")
    public final void method5671(int arg0, int arg1, boolean arg2) {
        this.field4035 = arg0;
        this.field4022 = arg1;
        class197.method1501();
        if (arg2) {
            this.method5652();
        }
    }

    @ObfuscatedName("lp.h(I)V")
    public final void method5652() {
        this.field4040 = -1;
        this.field4039 = -1;
        this.field4038 = -1;
        this.field4060 = -1;
    }

    @ObfuscatedName("lp.t(I)Z")
    public boolean method5611() {
        return this.field4023 != -1 && this.field4024 != -1;
    }

    @ObfuscatedName("lp.i(IIII)Lal;")
    public class33 method5612(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4015.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method256(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lp.u(IIIZB)V")
    public void method5705(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5612(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4021;
        }
        boolean var6 = false;
        if (this.field4018 != var5 || arg3) {
            this.field4018 = var5;
            this.method5617(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5620(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lp.q(IS)V")
    public void method5614(int arg0) {
        class33 var2 = this.method5710(arg0);
        if (var2 != null) {
            this.method5617(var2);
        }
    }

    @ObfuscatedName("lp.v(I)I")
    public int method5615() {
        return this.field4017 == null ? -1 : this.field4017.method260();
    }

    @ObfuscatedName("lp.f(I)Lal;")
    public class33 method5616() {
        return this.field4017;
    }

    @ObfuscatedName("lp.b(Lal;I)V")
    public void method5617(class33 arg0) {
        if (this.field4017 == null || this.field4017 != arg0) {
            this.method5658(arg0);
            this.method5620(-1, -1, -1);
        }
    }

    @ObfuscatedName("lp.c(Lal;B)V")
    public void method5658(class33 arg0) {
        this.field4017 = arg0;
        this.field4019 = new class43(this.field4014, this.field4046);
        this.field4020.method5588(this.field4017.method262());
    }

    @ObfuscatedName("lp.w(Lal;Lic;Lic;ZB)V")
    public void method5619(class33 arg0, class239 arg1, class239 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4017 == null || this.field4017 != arg0) {
            this.method5658(arg0);
        }
        if (!arg3 && this.field4017.method256(arg1.field2790, arg1.field2791, arg1.field2789)) {
            this.method5620(arg1.field2790, arg1.field2791, arg1.field2789);
        } else {
            this.method5620(arg2.field2790, arg2.field2791, arg2.field2789);
        }
    }

    @ObfuscatedName("lp.o(IIIB)V")
    public void method5620(int arg0, int arg1, int arg2) {
        if (this.field4017 == null) {
            return;
        }
        int[] var4 = this.field4017.method257(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4017.method257(this.field4017.method271(), this.field4017.method270(), this.field4017.method272());
        }
        this.method5671(var4[0] - this.field4017.method278() * 64, var4[1] - this.field4017.method268() * 64, true);
        this.field4023 = -1;
        this.field4024 = -1;
        this.field4013 = this.method5626(this.field4017.method295());
        this.field4026 = this.field4013;
        this.field4053 = null;
        this.field4055 = null;
        this.field4019.method541();
    }

    @ObfuscatedName("lp.a(IIIIII)V")
    public void method5632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class328.method5414(var6);
        class328.method5340(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class328.method5381(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4020.method5591();
        if (var7 < 100) {
            this.method5625(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4019.method514()) {
            this.field4019.method506(this.field4059, this.field4017.method262(), client.field1031);
            if (!this.field4019.method514()) {
                return;
            }
        }
        if (this.field4034 != null) {
            this.field4036++;
            if (this.field4036 % this.field4044 == 0) {
                this.field4036 = 0;
                this.field4042++;
            }
            if (this.field4042 >= this.field4016 && !this.field4031) {
                this.field4034 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        this.field4019.method540(this.field4035 - var8 / 2, this.field4022 - var9 / 2, var8 / 2 + this.field4035, var9 / 2 + this.field4022, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4050) {
            boolean var10 = false;
            if (arg4 - this.field4051 > 100) {
                this.field4051 = arg4;
                var10 = true;
            }
            this.field4019.method509(this.field4035 - var8 / 2, this.field4022 - var9 / 2, var8 / 2 + this.field4035, var9 / 2 + this.field4022, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4008, this.field4034, this.field4036, this.field4044, var10);
        }
        this.method5622(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field1018 >= 2;
        if (var11 && this.field4057 && this.field4033 != null) {
            this.field4012.method5232("Coord: " + this.field4033, class328.field3957 + 10, class328.field3952 + 20, 16776960, -1);
        }
        this.field4027 = var8;
        this.field4028 = var9;
        this.field4029 = arg0;
        this.field4005 = arg1;
        class328.method5343(var6);
    }

    @ObfuscatedName("lp.ak(IIIIIII)Z")
    public boolean method5738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4061 == null) {
            return true;
        } else if (this.field4061.field3981 != arg0 || this.field4061.field3988 != arg1) {
            return true;
        } else if (this.field4019.field559 != this.field4049) {
            return true;
        } else if (client.field1117 != this.field4006) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lp.ap(IIIIIII)V")
    public void method5622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field853 == null) {
            return;
        }
        int var7 = 512 / (this.field4019.field559 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5725() - arg4 / 2 - var7;
        int var14 = this.method5636() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4019.field559 * (var7 + var13 - this.field4030);
        int var16 = arg1 - this.field4019.field559 * (var7 - (var14 - this.field4054));
        if (this.method5738(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4061 != null && this.field4061.field3981 == var11 && this.field4061.field3988 == var12) {
                Arrays.fill(this.field4061.field3983, 0);
            } else {
                this.field4061 = new class332(var11, var12);
            }
            this.field4030 = this.method5725() - arg4 / 2 - var7;
            this.field4054 = this.method5636() - arg5 / 2 - var7;
            this.field4049 = this.field4019.field559;
            Statics.field853.method4436(this.field4030, this.field4054, this.field4061, (float) this.field4049 / var10);
            this.field4006 = client.field1117;
            var15 = arg0 - this.field4019.field559 * (var7 + var13 - this.field4030);
            var16 = arg1 - this.field4019.field559 * (var7 - (var14 - this.field4054));
        }
        class328.method5347(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4061.method5466(var15, var16, 192);
        } else {
            this.field4061.method5493(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lp.ac(IIIII)V")
    public void method5623(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4020.method5590()) {
            return;
        }
        if (!this.field4019.method514()) {
            this.field4019.method506(this.field4059, this.field4017.method262(), client.field1031);
            if (!this.field4019.method514()) {
                return;
            }
        }
        this.field4019.method529(arg0, arg1, arg2, arg3, this.field4034, this.field4036, this.field4044);
    }

    @ObfuscatedName("lp.aw(II)V")
    public void method5624(int arg0) {
        this.field4026 = this.method5626(arg0);
    }

    @ObfuscatedName("lp.as(IIIIII)V")
    public void method5625(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class328.method5381(arg0, arg1, arg2, arg3, -16777216);
        class328.method5394(var7 - 152, var8, 304, 34, -65536);
        class328.method5381(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4012.method5222(class252.field3150, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lp.au(II)F")
    public float method5626(int arg0) {
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

    @ObfuscatedName("lp.al(B)I")
    public int method5627() {
        if ((double) this.field4026 == 1.0D) {
            return 25;
        } else if ((double) this.field4026 == 1.5D) {
            return 37;
        } else if ((double) this.field4026 == 2.0D) {
            return 50;
        } else if ((double) this.field4026 == 3.0D) {
            return 75;
        } else if ((double) this.field4026 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lp.af(I)V")
    public void method5630() {
        this.field4020.method5589();
    }

    @ObfuscatedName("lp.ai(B)Z")
    public boolean method5649() {
        return this.field4020.method5590();
    }

    @ObfuscatedName("lp.az(II)Lal;")
    public class33 method5710(int arg0) {
        Iterator var2 = this.field4015.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method260() != arg0);
        return var3;
    }

    @ObfuscatedName("lp.aq(IIB)V")
    public void method5631(int arg0, int arg1) {
        if (this.field4017 != null && this.field4017.method304(arg0, arg1)) {
            this.field4023 = arg0 - this.field4017.method278() * 64;
            this.field4024 = arg1 - this.field4017.method268() * 64;
        }
    }

    @ObfuscatedName("lp.ae(III)V")
    public void method5608(int arg0, int arg1) {
        if (this.field4017 != null) {
            this.method5671(arg0 - this.field4017.method278() * 64, arg1 - this.field4017.method268() * 64, true);
            this.field4023 = -1;
            this.field4024 = -1;
        }
    }

    @ObfuscatedName("lp.ad(IIII)V")
    public void method5696(int arg0, int arg1, int arg2) {
        if (this.field4017 != null) {
            int[] var4 = this.field4017.method257(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5631(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lp.ar(IIII)V")
    public void method5634(int arg0, int arg1, int arg2) {
        if (this.field4017 != null) {
            int[] var4 = this.field4017.method257(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5608(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lp.ao(I)I")
    public int method5725() {
        return this.field4017 == null ? -1 : this.field4035 + this.field4017.method278() * 64;
    }

    @ObfuscatedName("lp.at(I)I")
    public int method5636() {
        return this.field4017 == null ? -1 : this.field4022 + this.field4017.method268() * 64;
    }

    @ObfuscatedName("lp.ag(I)Lic;")
    public class239 method5637() {
        return this.field4017 == null ? null : this.field4017.method258(this.method5725(), this.method5636());
    }

    @ObfuscatedName("lp.an(I)I")
    public int method5638() {
        return this.field4027;
    }

    @ObfuscatedName("lp.ax(B)I")
    public int method5639() {
        return this.field4028;
    }

    @ObfuscatedName("lp.ah(II)V")
    public void method5640(int arg0) {
        if (arg0 >= 1) {
            this.field4016 = arg0;
        }
    }

    @ObfuscatedName("lp.ab(I)V")
    public void method5732() {
        this.field4016 = 3;
    }

    @ObfuscatedName("lp.am(IB)V")
    public void method5684(int arg0) {
        if (arg0 >= 1) {
            this.field4044 = arg0;
        }
    }

    @ObfuscatedName("lp.ay(B)V")
    public void method5766() {
        this.field4044 = 50;
    }

    @ObfuscatedName("lp.aj(ZB)V")
    public void method5662(boolean arg0) {
        this.field4031 = arg0;
    }

    @ObfuscatedName("lp.aa(II)V")
    public void method5759(int arg0) {
        this.field4034 = new HashSet();
        this.field4034.add(arg0);
        this.field4042 = 0;
        this.field4036 = 0;
    }

    @ObfuscatedName("lp.av(II)V")
    public void method5609(int arg0) {
        this.field4034 = new HashSet();
        this.field4042 = 0;
        this.field4036 = 0;
        for (int var2 = 0; var2 < Statics.field3450.length; var2++) {
            if (Statics.field3450[var2] != null && Statics.field3450[var2].field3452 == arg0) {
                this.field4034.add(Statics.field3450[var2].field3456);
            }
        }
    }

    @ObfuscatedName("lp.bc(I)V")
    public void method5647() {
        this.field4034 = null;
    }

    @ObfuscatedName("lp.br(ZI)V")
    public void method5648(boolean arg0) {
        this.field4050 = !arg0;
    }

    @ObfuscatedName("lp.by(IZI)V")
    public void method5642(int arg0, boolean arg1) {
        if (arg1) {
            this.field4062.remove(arg0);
        } else {
            this.field4062.add(arg0);
        }
        this.method5654();
    }

    @ObfuscatedName("lp.bl(IZB)V")
    public void method5650(int arg0, boolean arg1) {
        if (arg1) {
            this.field4047.remove(arg0);
        } else {
            this.field4047.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3450.length; var3++) {
            if (Statics.field3450[var3] != null && Statics.field3450[var3].field3452 == arg0) {
                int var4 = Statics.field3450[var3].field3456;
                if (arg1) {
                    this.field4048.remove(var4);
                } else {
                    this.field4048.add(var4);
                }
            }
        }
        this.method5654();
    }

    @ObfuscatedName("lp.bs(I)Z")
    public boolean method5701() {
        return !this.field4050;
    }

    @ObfuscatedName("lp.bu(IB)Z")
    public boolean method5618(int arg0) {
        return !this.field4062.contains(arg0);
    }

    @ObfuscatedName("lp.bz(IB)Z")
    public boolean method5653(int arg0) {
        return !this.field4047.contains(arg0);
    }

    @ObfuscatedName("lp.bt(I)V")
    public void method5654() {
        this.field4008.clear();
        this.field4008.addAll(this.field4062);
        this.field4008.addAll(this.field4048);
    }

    @ObfuscatedName("lp.bm(IIIIIIB)V")
    public void method5655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4020.method5590()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        List var9 = this.field4019.method512(this.field4035 - var7 / 2 - 1, this.field4022 - var8 / 2 - 1, var7 / 2 + this.field4035 + 1, var8 / 2 + this.field4022 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class270 var12 = Statics.field3450[var11.field536];
            var13 = false;
            for (int var14 = this.field4032.length - 1; var14 >= 0; var14--) {
                if (var12.field3468[var14] != null) {
                    client.method2423(var12.field3468[var14], var12.field3463, this.field4032[var14], var11.field536, var11.field533.method4124(), var11.field532.method4124());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lp.bf(ILic;I)Lic;")
    public class239 method5656(int arg0, class239 arg1) {
        if (!this.field4020.method5590()) {
            return null;
        } else if (!this.field4019.method514()) {
            return null;
        } else if (this.field4017.method304(arg1.field2791, arg1.field2789)) {
            HashMap var3 = this.field4019.method515();
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
                        return var5.field532;
                    }
                    var8 = (class41) var7.next();
                    int var9 = var8.field532.field2791 - arg1.field2791;
                    int var10 = var8.field532.field2789 - arg1.field2789;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field532;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lp.bj(IILic;Lic;I)V")
    public void method5657(int arg0, int arg1, class239 arg2, class239 arg3) {
        class69 var5 = new class69();
        class49 var6 = new class49(arg1, arg2, arg3);
        var5.method981(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method982(class246.field2969);
                break;
            case 1009:
                var5.method982(class246.field2964);
                break;
            case 1010:
                var5.method982(class246.field2963);
                break;
            case 1011:
                var5.method982(class246.field2973);
                break;
            case 1012:
                var5.method982(class246.field2965);
        }
        class82.method697(var5);
    }

    @ObfuscatedName("lp.bx(B)Lao;")
    public class41 method5644() {
        if (!this.field4020.method5590()) {
            return null;
        } else if (this.field4019.method514()) {
            HashMap var1 = this.field4019.method515();
            this.field4053 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4053.addAll(var3);
            }
            this.field4055 = this.field4053.iterator();
            return this.method5659();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lp.be(I)Lao;")
    public class41 method5659() {
        if (this.field4055 == null) {
            return null;
        } else if (this.field4055.hasNext()) {
            return (class41) this.field4055.next();
        } else {
            return null;
        }
    }
}
