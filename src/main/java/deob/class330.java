package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ls")
public class class330 {

    @ObfuscatedName("ls.h")
    public class250 field3927;

    @ObfuscatedName("ls.l")
    public static final class298 field3915 = class298.field3714;

    @ObfuscatedName("ls.d")
    public static final class298 field3916 = class298.field3715;

    @ObfuscatedName("ls.o")
    public static final class298 field3917 = class298.field3712;

    @ObfuscatedName("ls.s")
    public class301 field3935;

    @ObfuscatedName("ls.k")
    public HashMap field3919;

    @ObfuscatedName("ls.v")
    public class323[] field3920;

    @ObfuscatedName("ls.p")
    public HashMap field3921;

    @ObfuscatedName("ls.n")
    public class21 field3922;

    @ObfuscatedName("ls.t")
    public class21 field3955;

    @ObfuscatedName("ls.r")
    public class21 field3924;

    @ObfuscatedName("ls.x")
    public class31 field3925;

    @ObfuscatedName("ls.b")
    public class329 field3960;

    @ObfuscatedName("ls.w")
    public int field3943;

    @ObfuscatedName("ls.e")
    public int field3928;

    @ObfuscatedName("ls.a")
    public int field3929 = -1;

    @ObfuscatedName("ls.z")
    public int field3930 = -1;

    @ObfuscatedName("ls.y")
    public float field3931;

    @ObfuscatedName("ls.u")
    public float field3932;

    @ObfuscatedName("ls.f")
    public int field3926 = -1;

    @ObfuscatedName("ls.at")
    public int field3934 = -1;

    @ObfuscatedName("ls.ay")
    public int field3954 = -1;

    @ObfuscatedName("ls.ak")
    public int field3936 = -1;

    @ObfuscatedName("ls.az")
    public int field3951 = 3;

    @ObfuscatedName("ls.aj")
    public int field3938 = 50;

    @ObfuscatedName("ls.af")
    public boolean field3939 = false;

    @ObfuscatedName("ls.ah")
    public HashSet field3940 = null;

    @ObfuscatedName("ls.ab")
    public int field3941 = -1;

    @ObfuscatedName("ls.aa")
    public int field3942 = -1;

    @ObfuscatedName("ls.ac")
    public int field3947 = -1;

    @ObfuscatedName("ls.ad")
    public int field3923 = -1;

    @ObfuscatedName("ls.aq")
    public int field3945 = -1;

    @ObfuscatedName("ls.ax")
    public int field3948 = -1;

    @ObfuscatedName("ls.an")
    public long field3912;

    @ObfuscatedName("ls.ag")
    public int field3911;

    @ObfuscatedName("ls.ap")
    public int field3949;

    @ObfuscatedName("ls.aw")
    public boolean field3950 = true;

    @ObfuscatedName("ls.au")
    public HashSet field3952 = new HashSet();

    @ObfuscatedName("ls.av")
    public HashSet field3953 = new HashSet();

    @ObfuscatedName("ls.am")
    public HashSet field3957 = new HashSet();

    @ObfuscatedName("ls.ao")
    public HashSet field3937 = new HashSet();

    @ObfuscatedName("ls.ai")
    public boolean field3958 = false;

    @ObfuscatedName("ls.ae")
    public int field3933 = 0;

    @ObfuscatedName("ls.bw")
    public final int[] field3946 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ls.bg")
    public List field3959;

    @ObfuscatedName("ls.bu")
    public Iterator field3918;

    @ObfuscatedName("ls.bs")
    public HashSet field3961 = new HashSet();

    @ObfuscatedName("ls.ba")
    public class229 field3962 = null;

    @ObfuscatedName("ls.bt")
    public boolean field3963 = false;

    @ObfuscatedName("ls.br")
    public class324 field3914;

    @ObfuscatedName("ls.bq")
    public int field3965;

    @ObfuscatedName("ls.bp")
    public int field3956 = -1;

    @ObfuscatedName("ls.bb")
    public int field3967 = -1;

    @ObfuscatedName("ls.bf")
    public int field3968 = -1;

    @ObfuscatedName("ls.c(Lih;Lkh;Ljava/util/HashMap;[Llp;B)V")
    public void method5654(class250 arg0, class301 arg1, HashMap arg2, class323[] arg3) {
        this.field3920 = arg3;
        this.field3927 = arg0;
        this.field3935 = arg1;
        this.field3919 = new HashMap();
        this.field3919.put(class13.field103, arg2.get(field3915));
        this.field3919.put(class13.field96, arg2.get(field3916));
        this.field3919.put(class13.field104, arg2.get(field3917));
        this.field3960 = new class329(arg0);
        int var5 = this.field3927.method4228(class30.field275.field278);
        int[] var6 = this.field3927.method4221(var5);
        this.field3921 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3927.method4210(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method204(var8, var6[var7]);
            this.field3921.put(var9.method275(), var9);
            if (var9.method229()) {
                this.field3922 = var9;
            }
        }
        this.method5670(this.field3922);
        this.field3924 = null;
    }

    @ObfuscatedName("ls.q(I)I")
    public int method5655() {
        return this.field3927.method4298(this.field3922.method275(), class30.field273.field278) ? 100 : this.field3927.method4235(this.field3922.method275());
    }

    @ObfuscatedName("ls.m(I)V")
    public void method5761() {
        class24.field213.method3674(5);
        class24.field219.method3674(5);
    }

    @ObfuscatedName("ls.j(IIZIIIII)V")
    public void method5657(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3960.method5645()) {
            return;
        }
        this.method5660();
        this.method5661();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3931));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3931));
        List var10 = this.field3925.method494(this.field3943 - var8 / 2 - 1, this.field3928 - var9 / 2 - 1, var8 / 2 + this.field3943 + 1, var9 / 2 + this.field3928 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class58 var14 = new class58();
            class37 var15 = new class37(var13.field263, var13.field261, var13.field260);
            var14.method979(new Object[] { var15, arg0, arg1 });
            if (this.field3961.contains(var13)) {
                var14.method980(17);
            } else {
                var14.method980(15);
            }
            class71.method3130(var14);
        }
        Iterator var16 = this.field3961.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class58 var18 = new class58();
                class37 var19 = new class37(var17.field263, var17.field261, var17.field260);
                var18.method979(new Object[] { var19, arg0, arg1 });
                var18.method980(16);
                class71.method3130(var18);
            }
        }
        this.field3961 = var11;
    }

    @ObfuscatedName("ls.g(IIZZI)V")
    public void method5658(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class187.method918();
        this.method5677(arg0, arg1, arg3, var5);
        if (!this.method5779() && arg3 || arg2) {
            if (arg3) {
                this.field3945 = arg0;
                this.field3948 = arg1;
                this.field3947 = this.field3943;
                this.field3923 = this.field3928;
            }
            if (this.field3947 != -1) {
                int var7 = arg0 - this.field3945;
                int var8 = arg1 - this.field3948;
                this.method5764(this.field3947 - (int) ((float) var7 / this.field3932), this.field3923 + (int) ((float) var8 / this.field3932), false);
            }
        } else {
            this.method5663();
        }
        if (arg3) {
            this.field3912 = var5;
            this.field3911 = arg0;
            this.field3949 = arg1;
        }
    }

    @ObfuscatedName("ls.i(IIZJ)V")
    public void method5677(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3955 == null) {
            this.field3962 = null;
            return;
        }
        int var6 = (int) ((float) this.field3943 + ((float) (arg0 - this.field3954) - (float) this.method5691() * this.field3931 / 2.0F) / this.field3931);
        int var7 = (int) ((float) this.field3928 - ((float) (arg1 - this.field3936) - (float) this.method5692() * this.field3931 / 2.0F) / this.field3931);
        this.field3962 = this.field3955.method208(var6 + this.field3955.method278() * 64, var7 + this.field3955.method218() * 64);
        if (this.field3962 == null || !arg2) {
            return;
        }
        if (client.method485() && class40.field363[82] && class40.field363[81]) {
            client.method2398(this.field3962.field2600, this.field3962.field2602, this.field3962.field2601, false);
            return;
        }
        boolean var8 = true;
        if (this.field3950) {
            int var9 = arg0 - this.field3911;
            int var10 = arg1 - this.field3949;
            if (arg3 - this.field3912 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class175 var11 = class175.method948(class172.field2265, client.field689.field1278);
            var11.field2308.method3288(this.field3962.method4038());
            client.field689.method1848(var11);
            this.field3912 = 0L;
        }
    }

    @ObfuscatedName("ls.h(I)V")
    public void method5660() {
        if (Statics.field309 != null) {
            this.field3931 = this.field3932;
            return;
        }
        if (this.field3931 < this.field3932) {
            this.field3931 = Math.min(this.field3932, this.field3931 / 30.0F + this.field3931);
        }
        if (this.field3931 > this.field3932) {
            this.field3931 = Math.max(this.field3932, this.field3931 - this.field3931 / 30.0F);
        }
    }

    @ObfuscatedName("ls.l(I)V")
    public void method5661() {
        if (!this.method5779()) {
            return;
        }
        int var1 = this.field3929 - this.field3943;
        int var2 = this.field3930 - this.field3928;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5764(this.field3943 + var1, this.field3928 + var2, true);
        if (this.field3943 == this.field3929 && this.field3930 == this.field3928) {
            this.field3929 = -1;
            this.field3930 = -1;
        }
    }

    @ObfuscatedName("ls.o(IIZI)V")
    public final void method5764(int arg0, int arg1, boolean arg2) {
        this.field3943 = arg0;
        this.field3928 = arg1;
        class187.method918();
        if (arg2) {
            this.method5663();
        }
    }

    @ObfuscatedName("ls.k(I)V")
    public final void method5663() {
        this.field3948 = -1;
        this.field3945 = -1;
        this.field3923 = -1;
        this.field3947 = -1;
    }

    @ObfuscatedName("ls.v(B)Z")
    public boolean method5779() {
        return this.field3929 != -1 && this.field3930 != -1;
    }

    @ObfuscatedName("ls.p(IIIB)Le;")
    public class21 method5665(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3921.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method227(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ls.n(IIIZI)V")
    public void method5666(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5665(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3922;
        }
        boolean var6 = false;
        if (this.field3924 != var5 || arg3) {
            this.field3924 = var5;
            this.method5670(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5801(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ls.t(IB)V")
    public void method5667(int arg0) {
        class21 var2 = this.method5683(arg0);
        if (var2 != null) {
            this.method5670(var2);
        }
    }

    @ObfuscatedName("ls.r(B)I")
    public int method5840() {
        return this.field3955 == null ? -1 : this.field3955.method221();
    }

    @ObfuscatedName("ls.x(B)Le;")
    public class21 method5669() {
        return this.field3955;
    }

    @ObfuscatedName("ls.b(Le;I)V")
    public void method5670(class21 arg0) {
        if (this.field3955 == null || this.field3955 != arg0) {
            this.method5671(arg0);
            this.method5801(-1, -1, -1);
        }
    }

    @ObfuscatedName("ls.w(Le;B)V")
    public void method5671(class21 arg0) {
        this.field3955 = arg0;
        this.field3925 = new class31(this.field3920, this.field3919);
        this.field3960.method5643(this.field3955.method275());
    }

    @ObfuscatedName("ls.a(Le;Lhr;Lhr;ZB)V")
    public void method5672(class21 arg0, class229 arg1, class229 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3955 == null || this.field3955 != arg0) {
            this.method5671(arg0);
        }
        if (!arg3 && this.field3955.method227(arg1.field2601, arg1.field2600, arg1.field2602)) {
            this.method5801(arg1.field2601, arg1.field2600, arg1.field2602);
        } else {
            this.method5801(arg2.field2601, arg2.field2600, arg2.field2602);
        }
    }

    @ObfuscatedName("ls.z(IIII)V")
    public void method5801(int arg0, int arg1, int arg2) {
        if (this.field3955 == null) {
            return;
        }
        int[] var4 = this.field3955.method207(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3955.method207(this.field3955.method258(), this.field3955.method220(), this.field3955.method222());
        }
        this.method5764(var4[0] - this.field3955.method278() * 64, var4[1] - this.field3955.method218() * 64, true);
        this.field3929 = -1;
        this.field3930 = -1;
        this.field3931 = this.method5679(this.field3955.method215());
        this.field3932 = this.field3931;
        this.field3959 = null;
        this.field3918 = null;
        this.field3925.method488();
    }

    @ObfuscatedName("ls.y(IIIIII)V")
    public void method5674(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class320.method5373(var6);
        class320.method5371(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class320.method5379(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3960.method5642();
        if (var7 < 100) {
            this.method5748(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3925.method495()) {
            this.field3925.method487(this.field3927, this.field3955.method275(), client.field647);
            if (!this.field3925.method495()) {
                return;
            }
        }
        if (this.field3940 != null) {
            this.field3942++;
            if (this.field3942 % this.field3938 == 0) {
                this.field3942 = 0;
                this.field3941++;
            }
            if (this.field3941 >= this.field3951 && !this.field3939) {
                this.field3940 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3931));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3931));
        this.field3925.method489(this.field3943 - var8 / 2, this.field3928 - var9 / 2, var8 / 2 + this.field3943, var9 / 2 + this.field3928, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3958) {
            boolean var10 = false;
            if (arg4 - this.field3933 > 100) {
                this.field3933 = arg4;
                var10 = true;
            }
            this.field3925.method496(this.field3943 - var8 / 2, this.field3928 - var9 / 2, var8 / 2 + this.field3943, var9 / 2 + this.field3928, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3937, this.field3940, this.field3942, this.field3938, var10);
        }
        this.method5676(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method485() && this.field3963 && this.field3962 != null) {
            this.field3935.method5217("Coord: " + this.field3962, class320.field3829 + 10, class320.field3826 + 20, 16776960, -1);
        }
        this.field3926 = var8;
        this.field3934 = var9;
        this.field3954 = arg0;
        this.field3936 = arg1;
        class320.method5374(var6);
    }

    @ObfuscatedName("ls.u(IIIIIIB)Z")
    public boolean method5828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3914 == null) {
            return true;
        } else if (this.field3914.field3852 != arg0 || this.field3914.field3862 != arg1) {
            return true;
        } else if (this.field3925.field283 != this.field3965) {
            return true;
        } else if (client.field675 != this.field3968) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ls.f(IIIIIIB)V")
    public void method5676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field309 == null) {
            return;
        }
        int var7 = 512 / (this.field3925.field283 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5688() - arg4 / 2 - var7;
        int var14 = this.method5740() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3925.field283 * (var7 + var13 - this.field3956);
        int var16 = arg1 - this.field3925.field283 * (var7 - (var14 - this.field3967));
        if (this.method5828(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3914 != null && this.field3914.field3852 == var11 && this.field3914.field3862 == var12) {
                Arrays.fill(this.field3914.field3853, 0);
            } else {
                this.field3914 = new class324(var11, var12);
            }
            this.field3956 = this.method5688() - arg4 / 2 - var7;
            this.field3967 = this.method5740() - arg5 / 2 - var7;
            this.field3965 = this.field3925.field283;
            Statics.field309.method4372(this.field3956, this.field3967, this.field3914, (float) this.field3965 / var10);
            this.field3968 = client.field675;
            var15 = arg0 - this.field3925.field283 * (var7 + var13 - this.field3956);
            var16 = arg1 - this.field3925.field283 * (var7 - (var14 - this.field3967));
        }
        class320.method5384(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3914.method5501(var15, var16, 192);
        } else {
            this.field3914.method5585(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ls.at(IIIIB)V")
    public void method5712(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3960.method5645()) {
            return;
        }
        if (!this.field3925.method495()) {
            this.field3925.method487(this.field3927, this.field3955.method275(), client.field647);
            if (!this.field3925.method495()) {
                return;
            }
        }
        this.field3925.method492(arg0, arg1, arg2, arg3, this.field3940, this.field3942, this.field3938);
    }

    @ObfuscatedName("ls.ay(IB)V")
    public void method5678(int arg0) {
        this.field3932 = this.method5679(arg0);
    }

    @ObfuscatedName("ls.ak(IIIIIB)V")
    public void method5748(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class320.method5379(arg0, arg1, arg2, arg3, -16777216);
        class320.method5383(var7 - 152, var8, 304, 34, -65536);
        class320.method5379(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3935.method5151(class240.field3117, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ls.az(II)F")
    public float method5679(int arg0) {
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

    @ObfuscatedName("ls.aj(I)I")
    public int method5680() {
        if ((double) this.field3932 == 1.0D) {
            return 25;
        } else if ((double) this.field3932 == 1.5D) {
            return 37;
        } else if ((double) this.field3932 == 2.0D) {
            return 50;
        } else if ((double) this.field3932 == 3.0D) {
            return 75;
        } else if ((double) this.field3932 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ls.af(I)V")
    public void method5681() {
        this.field3960.method5644();
    }

    @ObfuscatedName("ls.ah(B)Z")
    public boolean method5858() {
        return this.field3960.method5645();
    }

    @ObfuscatedName("ls.ab(II)Le;")
    public class21 method5683(int arg0) {
        Iterator var2 = this.field3921.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method221() != arg0);
        return var3;
    }

    @ObfuscatedName("ls.aa(IIB)V")
    public void method5684(int arg0, int arg1) {
        if (this.field3955 != null && this.field3955.method274(arg0, arg1)) {
            this.field3929 = arg0 - this.field3955.method278() * 64;
            this.field3930 = arg1 - this.field3955.method218() * 64;
        }
    }

    @ObfuscatedName("ls.ac(III)V")
    public void method5685(int arg0, int arg1) {
        if (this.field3955 != null) {
            this.method5764(arg0 - this.field3955.method278() * 64, arg1 - this.field3955.method218() * 64, true);
            this.field3929 = -1;
            this.field3930 = -1;
        }
    }

    @ObfuscatedName("ls.ad(IIII)V")
    public void method5702(int arg0, int arg1, int arg2) {
        if (this.field3955 != null) {
            int[] var4 = this.field3955.method207(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5684(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ls.aq(IIII)V")
    public void method5687(int arg0, int arg1, int arg2) {
        if (this.field3955 != null) {
            int[] var4 = this.field3955.method207(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5685(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ls.ax(B)I")
    public int method5688() {
        return this.field3955 == null ? -1 : this.field3943 + this.field3955.method278() * 64;
    }

    @ObfuscatedName("ls.an(I)I")
    public int method5740() {
        return this.field3955 == null ? -1 : this.field3928 + this.field3955.method218() * 64;
    }

    @ObfuscatedName("ls.ag(B)Lhr;")
    public class229 method5690() {
        return this.field3955 == null ? null : this.field3955.method208(this.method5688(), this.method5740());
    }

    @ObfuscatedName("ls.ap(I)I")
    public int method5691() {
        return this.field3926;
    }

    @ObfuscatedName("ls.aw(I)I")
    public int method5692() {
        return this.field3934;
    }

    @ObfuscatedName("ls.al(IB)V")
    public void method5693(int arg0) {
        if (arg0 >= 1) {
            this.field3951 = arg0;
        }
    }

    @ObfuscatedName("ls.ar(B)V")
    public void method5694() {
        this.field3951 = 3;
    }

    @ObfuscatedName("ls.au(IB)V")
    public void method5695(int arg0) {
        if (arg0 >= 1) {
            this.field3938 = arg0;
        }
    }

    @ObfuscatedName("ls.av(I)V")
    public void method5821() {
        this.field3938 = 50;
    }

    @ObfuscatedName("ls.am(ZS)V")
    public void method5697(boolean arg0) {
        this.field3939 = arg0;
    }

    @ObfuscatedName("ls.ao(IB)V")
    public void method5698(int arg0) {
        this.field3940 = new HashSet();
        this.field3940.add(arg0);
        this.field3941 = 0;
        this.field3942 = 0;
    }

    @ObfuscatedName("ls.ai(II)V")
    public void method5817(int arg0) {
        this.field3940 = new HashSet();
        this.field3941 = 0;
        this.field3942 = 0;
        for (int var2 = 0; var2 < Statics.field2341; var2++) {
            if (class258.method2830(var2) != null && class258.method2830(var2).field3292 == arg0) {
                this.field3940.add(class258.method2830(var2).field3273);
            }
        }
    }

    @ObfuscatedName("ls.ae(I)V")
    public void method5720() {
        this.field3940 = null;
    }

    @ObfuscatedName("ls.as(ZB)V")
    public void method5765(boolean arg0) {
        this.field3958 = !arg0;
    }

    @ObfuscatedName("ls.bw(IZI)V")
    public void method5795(int arg0, boolean arg1) {
        if (arg1) {
            this.field3952.remove(arg0);
        } else {
            this.field3952.add(arg0);
        }
        this.method5707();
    }

    @ObfuscatedName("ls.bg(IZB)V")
    public void method5673(int arg0, boolean arg1) {
        if (arg1) {
            this.field3953.remove(arg0);
        } else {
            this.field3953.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field2341; var3++) {
            if (class258.method2830(var3) != null && class258.method2830(var3).field3292 == arg0) {
                int var4 = class258.method2830(var3).field3273;
                if (arg1) {
                    this.field3957.remove(var4);
                } else {
                    this.field3957.add(var4);
                }
            }
        }
        this.method5707();
    }

    @ObfuscatedName("ls.bu(I)Z")
    public boolean method5662() {
        return !this.field3958;
    }

    @ObfuscatedName("ls.bs(II)Z")
    public boolean method5758(int arg0) {
        return !this.field3952.contains(arg0);
    }

    @ObfuscatedName("ls.ba(IB)Z")
    public boolean method5706(int arg0) {
        return !this.field3953.contains(arg0);
    }

    @ObfuscatedName("ls.bt(S)V")
    public void method5707() {
        this.field3937.clear();
        this.field3937.addAll(this.field3952);
        this.field3937.addAll(this.field3957);
    }

    @ObfuscatedName("ls.br(IIIIIII)V")
    public void method5708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3960.method5645()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3931));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3931));
        List var9 = this.field3925.method494(this.field3943 - var7 / 2 - 1, this.field3928 - var8 / 2 - 1, var7 / 2 + this.field3943 + 1, var8 / 2 + this.field3928 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class29 var11 = (class29) var10.next();
            class258 var12 = class258.method2830(var11.field263);
            var13 = false;
            for (int var14 = this.field3946.length - 1; var14 >= 0; var14--) {
                if (var12.field3280[var14] != null) {
                    client.method456(var12.field3280[var14], var12.field3290, this.field3946[var14], var11.field263, var11.field261.method4038(), var11.field260.method4038());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ls.bq(ILhr;B)Lhr;")
    public class229 method5675(int arg0, class229 arg1) {
        if (!this.field3960.method5645()) {
            return null;
        } else if (!this.field3925.method495()) {
            return null;
        } else if (this.field3955.method274(arg1.field2600, arg1.field2602)) {
            HashMap var3 = this.field3925.method512();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class29 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class29 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field260;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field260.field2600 - arg1.field2600;
                    int var10 = var8.field260.field2602 - arg1.field2602;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field260;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ls.bp(IILhr;Lhr;I)V")
    public void method5710(int arg0, int arg1, class229 arg2, class229 arg3) {
        class58 var5 = new class58();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method979(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method980(10);
                break;
            case 1009:
                var5.method980(11);
                break;
            case 1010:
                var5.method980(12);
                break;
            case 1011:
                var5.method980(13);
                break;
            case 1012:
                var5.method980(14);
        }
        class71.method3130(var5);
    }

    @ObfuscatedName("ls.bb(B)Lak;")
    public class29 method5833() {
        if (!this.field3960.method5645()) {
            return null;
        } else if (this.field3925.method495()) {
            HashMap var1 = this.field3925.method512();
            this.field3959 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3959.addAll(var3);
            }
            this.field3918 = this.field3959.iterator();
            return this.method5818();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ls.bf(I)Lak;")
    public class29 method5818() {
        if (this.field3918 == null) {
            return null;
        } else if (this.field3918.hasNext()) {
            return (class29) this.field3918.next();
        } else {
            return null;
        }
    }
}
