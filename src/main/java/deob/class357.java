package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mc")
public class class357 {

    @ObfuscatedName("mc.r")
    public class275 field3994;

    @ObfuscatedName("mc.b")
    public class275 field4037;

    @ObfuscatedName("mc.d")
    public class275 field4003;

    @ObfuscatedName("mc.s")
    public static final class359 field3997 = class359.field4057;

    @ObfuscatedName("mc.u")
    public static final class359 field3998 = class359.field4054;

    @ObfuscatedName("mc.l")
    public static final class359 field3999 = class359.field4058;

    @ObfuscatedName("mc.o")
    public class300 field4049;

    @ObfuscatedName("mc.c")
    public HashMap field4030;

    @ObfuscatedName("mc.e")
    public class395[] field4002;

    @ObfuscatedName("mc.g")
    public HashMap field4029;

    @ObfuscatedName("mc.a")
    public class166 field4004;

    @ObfuscatedName("mc.k")
    public class166 field4005;

    @ObfuscatedName("mc.m")
    public class166 field4006;

    @ObfuscatedName("mc.x")
    public class168 field3992;

    @ObfuscatedName("mc.z")
    public class356 field4008;

    @ObfuscatedName("mc.w")
    public int field4036;

    @ObfuscatedName("mc.t")
    public int field4010;

    @ObfuscatedName("mc.h")
    public int field4011 = -1;

    @ObfuscatedName("mc.q")
    public int field4046 = -1;

    @ObfuscatedName("mc.i")
    public float field4013;

    @ObfuscatedName("mc.ae")
    public float field4014;

    @ObfuscatedName("mc.ap")
    public int field4044 = -1;

    @ObfuscatedName("mc.ab")
    public int field4016 = -1;

    @ObfuscatedName("mc.al")
    public int field3996 = -1;

    @ObfuscatedName("mc.ad")
    public int field4018 = -1;

    @ObfuscatedName("mc.ai")
    public int field4015 = 3;

    @ObfuscatedName("mc.ar")
    public int field4020 = 50;

    @ObfuscatedName("mc.ag")
    public boolean field4021 = false;

    @ObfuscatedName("mc.ax")
    public HashSet field4022 = null;

    @ObfuscatedName("mc.as")
    public int field4017 = -1;

    @ObfuscatedName("mc.aj")
    public int field4024 = -1;

    @ObfuscatedName("mc.am")
    public int field4025 = -1;

    @ObfuscatedName("mc.az")
    public int field4026 = -1;

    @ObfuscatedName("mc.av")
    public int field4027 = -1;

    @ObfuscatedName("mc.ac")
    public int field4028 = -1;

    @ObfuscatedName("mc.at")
    public long field4035;

    @ObfuscatedName("mc.ah")
    public int field4042;

    @ObfuscatedName("mc.ao")
    public int field4023;

    @ObfuscatedName("mc.aq")
    public boolean field4000 = true;

    @ObfuscatedName("mc.ak")
    public HashSet field4033 = new HashSet();

    @ObfuscatedName("mc.ay")
    public HashSet field4031 = new HashSet();

    @ObfuscatedName("mc.aa")
    public HashSet field4019 = new HashSet();

    @ObfuscatedName("mc.au")
    public HashSet field4009 = new HashSet();

    @ObfuscatedName("mc.an")
    public boolean field4001 = false;

    @ObfuscatedName("mc.bd")
    public int field4038 = 0;

    @ObfuscatedName("mc.bq")
    public final int[] field4034 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("mc.bu")
    public List field4040;

    @ObfuscatedName("mc.bl")
    public Iterator field4041;

    @ObfuscatedName("mc.bv")
    public HashSet field4032 = new HashSet();

    @ObfuscatedName("mc.bm")
    public class243 field4043 = null;

    @ObfuscatedName("mc.bz")
    public boolean field4039 = false;

    @ObfuscatedName("mc.bh")
    public class396 field4045;

    @ObfuscatedName("mc.bs")
    public int field4012;

    @ObfuscatedName("mc.br")
    public int field4047 = -1;

    @ObfuscatedName("mc.bf")
    public int field4048 = -1;

    @ObfuscatedName("mc.ba")
    public int field4007 = -1;

    @ObfuscatedName("mc.v(Ljv;Ljv;Ljv;Lkt;Ljava/util/HashMap;[Lop;I)V")
    public void method5595(class275 arg0, class275 arg1, class275 arg2, class300 arg3, HashMap arg4, class395[] arg5) {
        this.field4002 = arg5;
        this.field3994 = arg0;
        this.field4037 = arg1;
        this.field4003 = arg2;
        this.field4049 = arg3;
        this.field4030 = new HashMap();
        this.field4030.put(class163.field1928, arg4.get(field3997));
        this.field4030.put(class163.field1929, arg4.get(field3998));
        this.field4030.put(class163.field1930, arg4.get(field3999));
        this.field4008 = new class356(arg0);
        int var7 = this.field3994.method4484(class185.field2138.field2137);
        int[] var8 = this.field3994.method4477(var7);
        this.field4029 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class383 var10 = new class383(this.field3994.method4468(var7, var8[var9]));
            class166 var11 = new class166();
            var11.method3019(var10, var8[var9]);
            this.field4029.put(var11.method3028(), var11);
            if (var11.method3027()) {
                this.field4004 = var11;
            }
        }
        this.method5610(this.field4004);
        this.field4006 = null;
    }

    @ObfuscatedName("mc.n(B)V")
    public void method5534() {
        class167.field1974.method3916(5);
    }

    @ObfuscatedName("mc.f(IIZIIIII)V")
    public void method5653(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4008.method5520()) {
            return;
        }
        this.method5538();
        this.method5716();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4013));
        List var10 = this.field3992.method3220(this.field4036 - var8 / 2 - 1, this.field4010 - var9 / 2 - 1, var8 / 2 + this.field4036 + 1, var9 / 2 + this.field4010 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class184 var13 = (class184) var12.next();
            var11.add(var13);
            class96 var14 = new class96();
            class189 var15 = new class189(var13.method2989(), var13.field2129, var13.field2131);
            var14.method1894(new Object[] { var15, arg0, arg1 });
            if (this.field4032.contains(var13)) {
                var14.method1893(17);
            } else {
                var14.method1893(15);
            }
            class79.method2186(var14);
        }
        Iterator var16 = this.field4032.iterator();
        while (var16.hasNext()) {
            class184 var17 = (class184) var16.next();
            if (!var11.contains(var17)) {
                class96 var18 = new class96();
                class189 var19 = new class189(var17.method2989(), var17.field2129, var17.field2131);
                var18.method1894(new Object[] { var19, arg0, arg1 });
                var18.method1893(16);
                class79.method2186(var18);
            }
        }
        this.field4032 = var11;
    }

    @ObfuscatedName("mc.y(IIZZI)V")
    public void method5622(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class380.method2744();
        this.method5684(arg0, arg1, arg3, var5);
        if (!this.method5542() && arg3 || arg2) {
            if (arg3) {
                this.field4027 = arg0;
                this.field4028 = arg1;
                this.field4025 = this.field4036;
                this.field4026 = this.field4010;
            }
            if (this.field4025 != -1) {
                int var7 = arg0 - this.field4027;
                int var8 = arg1 - this.field4028;
                this.method5540(this.field4025 - (int) ((float) var7 / this.field4014), this.field4026 + (int) ((float) var8 / this.field4014), false);
            }
        } else {
            this.method5541();
        }
        if (arg3) {
            this.field4035 = var5;
            this.field4042 = arg0;
            this.field4023 = arg1;
        }
    }

    @ObfuscatedName("mc.p(IIZJ)V")
    public void method5684(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4005 == null) {
            this.field4043 = null;
            return;
        }
        int var6 = (int) ((float) this.field4036 + ((float) (arg0 - this.field3996) - (float) this.method5569() * this.field4013 / 2.0F) / this.field4013);
        int var7 = (int) ((float) this.field4010 - ((float) (arg1 - this.field4018) - (float) this.method5570() * this.field4013 / 2.0F) / this.field4013);
        this.field4043 = this.field4005.method3055(var6 + this.field4005.method3032() * 64, var7 + this.field4005.method3034() * 64);
        if (this.field4043 == null || !arg2) {
            return;
        }
        if (client.method5731() && class39.field286[82] && class39.field286[81]) {
            client.method41(this.field4043.field2926, this.field4043.field2925, this.field4043.field2924, false);
            return;
        }
        boolean var8 = true;
        if (this.field4000) {
            int var9 = arg0 - this.field4042;
            int var10 = arg1 - this.field4023;
            if (arg3 - this.field4035 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class227 var11 = class227.method171(class225.field2607, client.field688.field1415);
            var11.field2693.method6010(this.field4043.method4224());
            client.field688.method2167(var11);
            this.field4035 = 0L;
        }
    }

    @ObfuscatedName("mc.j(I)V")
    public void method5538() {
        if (Statics.field1445 != null) {
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

    @ObfuscatedName("mc.r(B)V")
    public void method5716() {
        if (!this.method5542()) {
            return;
        }
        int var1 = this.field4011 - this.field4036;
        int var2 = this.field4046 - this.field4010;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5540(this.field4036 + var1, this.field4010 + var2, true);
        if (this.field4036 == this.field4011 && this.field4046 == this.field4010) {
            this.field4011 = -1;
            this.field4046 = -1;
        }
    }

    @ObfuscatedName("mc.b(IIZI)V")
    public final void method5540(int arg0, int arg1, boolean arg2) {
        this.field4036 = arg0;
        this.field4010 = arg1;
        class380.method2744();
        if (arg2) {
            this.method5541();
        }
    }

    @ObfuscatedName("mc.d(B)V")
    public final void method5541() {
        this.field4028 = -1;
        this.field4027 = -1;
        this.field4026 = -1;
        this.field4025 = -1;
    }

    @ObfuscatedName("mc.s(I)Z")
    public boolean method5542() {
        return this.field4011 != -1 && this.field4046 != -1;
    }

    @ObfuscatedName("mc.u(IIII)Lfo;")
    public class166 method5543(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4029.values().iterator();
        class166 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class166) var4.next();
        } while (!var5.method3044(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("mc.l(IIIZI)V")
    public void method5544(int arg0, int arg1, int arg2, boolean arg3) {
        class166 var5 = this.method5543(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4004;
        }
        boolean var6 = false;
        if (this.field4006 != var5 || arg3) {
            this.field4006 = var5;
            this.method5610(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5551(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mc.o(II)V")
    public void method5545(int arg0) {
        class166 var2 = this.method5562(arg0);
        if (var2 != null) {
            this.method5610(var2);
        }
    }

    @ObfuscatedName("mc.c(B)I")
    public int method5546() {
        return this.field4005 == null ? -1 : this.field4005.method3026();
    }

    @ObfuscatedName("mc.e(I)Lfo;")
    public class166 method5585() {
        return this.field4005;
    }

    @ObfuscatedName("mc.g(Lfo;I)V")
    public void method5610(class166 arg0) {
        if (this.field4005 == null || this.field4005 != arg0) {
            this.method5549(arg0);
            this.method5551(-1, -1, -1);
        }
    }

    @ObfuscatedName("mc.a(Lfo;I)V")
    public void method5549(class166 arg0) {
        this.field4005 = arg0;
        this.field3992 = new class168(this.field4002, this.field4030, this.field4037, this.field4003);
        this.field4008.method5529(this.field4005.method3028());
    }

    @ObfuscatedName("mc.k(Lfo;Lii;Lii;ZI)V")
    public void method5725(class166 arg0, class243 arg1, class243 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4005 == null || this.field4005 != arg0) {
            this.method5549(arg0);
        }
        if (!arg3 && this.field4005.method3044(arg1.field2924, arg1.field2926, arg1.field2925)) {
            this.method5551(arg1.field2924, arg1.field2926, arg1.field2925);
        } else {
            this.method5551(arg2.field2924, arg2.field2926, arg2.field2925);
        }
    }

    @ObfuscatedName("mc.m(IIII)V")
    public void method5551(int arg0, int arg1, int arg2) {
        if (this.field4005 == null) {
            return;
        }
        int[] var4 = this.field4005.method3023(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4005.method3023(this.field4005.method3037(), this.field4005.method3036(), this.field4005.method3022());
        }
        this.method5540(var4[0] - this.field4005.method3032() * 64, var4[1] - this.field4005.method3034() * 64, true);
        this.field4011 = -1;
        this.field4046 = -1;
        this.field4013 = this.method5558(this.field4005.method3031());
        this.field4014 = this.field4013;
        this.field4040 = null;
        this.field4041 = null;
        this.field3992.method3215();
    }

    @ObfuscatedName("mc.x(IIIIII)V")
    public void method5552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class392.method6239(var6);
        class392.method6277(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class392.method6265(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4008.method5525();
        if (var7 < 100) {
            this.method5617(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3992.method3221()) {
            this.field3992.method3214(this.field3994, this.field4005.method3028(), client.field641);
            if (!this.field3992.method3221()) {
                return;
            }
        }
        if (this.field4022 != null) {
            this.field4024++;
            if (this.field4024 % this.field4020 == 0) {
                this.field4024 = 0;
                this.field4017++;
            }
            if (this.field4017 >= this.field4015 && !this.field4021) {
                this.field4022 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        this.field3992.method3216(this.field4036 - var8 / 2, this.field4010 - var9 / 2, var8 / 2 + this.field4036, var9 / 2 + this.field4010, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4001) {
            boolean var10 = false;
            if (arg4 - this.field4038 > 100) {
                this.field4038 = arg4;
                var10 = true;
            }
            this.field3992.method3229(this.field4036 - var8 / 2, this.field4010 - var9 / 2, var8 / 2 + this.field4036, var9 / 2 + this.field4010, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4009, this.field4022, this.field4024, this.field4020, var10);
        }
        this.method5554(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method5731() && this.field4039 && this.field4043 != null) {
            this.field4049.method4891("Coord: " + this.field4043, class392.field4226 + 10, class392.field4224 + 20, 16776960, -1);
        }
        this.field4044 = var8;
        this.field4016 = var9;
        this.field3996 = arg0;
        this.field4018 = arg1;
        class392.method6273(var6);
    }

    @ObfuscatedName("mc.z(IIIIIII)Z")
    public boolean method5553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4045 == null) {
            return true;
        } else if (this.field4045.field4253 != arg0 || this.field4045.field4245 != arg1) {
            return true;
        } else if (this.field3992.field2003 != this.field4012) {
            return true;
        } else if (client.field718 != this.field4007) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("mc.w(IIIIIII)V")
    public void method5554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1445 == null) {
            return;
        }
        int var7 = 512 / (this.field3992.field2003 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5567() - arg4 / 2 - var7;
        int var14 = this.method5681() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3992.field2003 * (var7 + var13 - this.field4047);
        int var16 = arg1 - this.field3992.field2003 * (var7 - (var14 - this.field4048));
        if (this.method5553(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4045 != null && this.field4045.field4253 == var11 && this.field4045.field4245 == var12) {
                Arrays.fill(this.field4045.field4247, 0);
            } else {
                this.field4045 = new class396(var11, var12);
            }
            this.field4047 = this.method5567() - arg4 / 2 - var7;
            this.field4048 = this.method5681() - arg5 / 2 - var7;
            this.field4012 = this.field3992.field2003;
            Statics.field1445.method4660(this.field4047, this.field4048, this.field4045, (float) this.field4012 / var10);
            this.field4007 = client.field718;
            var15 = arg0 - this.field3992.field2003 * (var7 + var13 - this.field4047);
            var16 = arg1 - this.field3992.field2003 * (var7 - (var14 - this.field4048));
        }
        class392.method6249(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4045.method6384(var15, var16, 192);
        } else {
            this.field4045.method6368(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("mc.t(IIIIB)V")
    public void method5640(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4008.method5520()) {
            return;
        }
        if (!this.field3992.method3221()) {
            this.field3992.method3214(this.field3994, this.field4005.method3028(), client.field641);
            if (!this.field3992.method3221()) {
                return;
            }
        }
        this.field3992.method3218(arg0, arg1, arg2, arg3, this.field4022, this.field4024, this.field4020);
    }

    @ObfuscatedName("mc.h(IB)V")
    public void method5556(int arg0) {
        this.field4014 = this.method5558(arg0);
    }

    @ObfuscatedName("mc.q(IIIIII)V")
    public void method5617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class392.method6265(arg0, arg1, arg2, arg3, -16777216);
        class392.method6254(var7 - 152, var8, 304, 34, -65536);
        class392.method6265(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4049.method4894(class268.field3535, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("mc.i(II)F")
    public float method5558(int arg0) {
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

    @ObfuscatedName("mc.ae(B)I")
    public int method5559() {
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

    @ObfuscatedName("mc.ap(I)V")
    public void method5628() {
        this.field4008.method5522();
    }

    @ObfuscatedName("mc.ab(I)Z")
    public boolean method5660() {
        return this.field4008.method5520();
    }

    @ObfuscatedName("mc.al(II)Lfo;")
    public class166 method5562(int arg0) {
        Iterator var2 = this.field4029.values().iterator();
        class166 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class166) var2.next();
        } while (var3.method3026() != arg0);
        return var3;
    }

    @ObfuscatedName("mc.ad(III)V")
    public void method5641(int arg0, int arg1) {
        if (this.field4005 != null && this.field4005.method3043(arg0, arg1)) {
            this.field4011 = arg0 - this.field4005.method3032() * 64;
            this.field4046 = arg1 - this.field4005.method3034() * 64;
        }
    }

    @ObfuscatedName("mc.ai(IIB)V")
    public void method5564(int arg0, int arg1) {
        if (this.field4005 != null) {
            this.method5540(arg0 - this.field4005.method3032() * 64, arg1 - this.field4005.method3034() * 64, true);
            this.field4011 = -1;
            this.field4046 = -1;
        }
    }

    @ObfuscatedName("mc.ar(IIII)V")
    public void method5658(int arg0, int arg1, int arg2) {
        if (this.field4005 != null) {
            int[] var4 = this.field4005.method3023(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5641(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mc.ag(IIII)V")
    public void method5566(int arg0, int arg1, int arg2) {
        if (this.field4005 != null) {
            int[] var4 = this.field4005.method3023(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5564(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mc.ax(I)I")
    public int method5567() {
        return this.field4005 == null ? -1 : this.field4036 + this.field4005.method3032() * 64;
    }

    @ObfuscatedName("mc.as(I)I")
    public int method5681() {
        return this.field4005 == null ? -1 : this.field4010 + this.field4005.method3034() * 64;
    }

    @ObfuscatedName("mc.aj(I)Lii;")
    public class243 method5613() {
        return this.field4005 == null ? null : this.field4005.method3055(this.method5567(), this.method5681());
    }

    @ObfuscatedName("mc.am(I)I")
    public int method5569() {
        return this.field4044;
    }

    @ObfuscatedName("mc.az(I)I")
    public int method5570() {
        return this.field4016;
    }

    @ObfuscatedName("mc.av(II)V")
    public void method5620(int arg0) {
        if (arg0 >= 1) {
            this.field4015 = arg0;
        }
    }

    @ObfuscatedName("mc.ac(I)V")
    public void method5539() {
        this.field4015 = 3;
    }

    @ObfuscatedName("mc.at(IB)V")
    public void method5573(int arg0) {
        if (arg0 >= 1) {
            this.field4020 = arg0;
        }
    }

    @ObfuscatedName("mc.ah(I)V")
    public void method5574() {
        this.field4020 = 50;
    }

    @ObfuscatedName("mc.ao(ZI)V")
    public void method5662(boolean arg0) {
        this.field4021 = arg0;
    }

    @ObfuscatedName("mc.aq(II)V")
    public void method5576(int arg0) {
        this.field4022 = new HashSet();
        this.field4022.add(arg0);
        this.field4017 = 0;
        this.field4024 = 0;
    }

    @ObfuscatedName("mc.aw(IB)V")
    public void method5637(int arg0) {
        this.field4022 = new HashSet();
        this.field4017 = 0;
        this.field4024 = 0;
        for (int var2 = 0; var2 < Statics.field3783; var2++) {
            if (class139.method52(var2) != null && class139.method52(var2).field1574 == arg0) {
                this.field4022.add(class139.method52(var2).field1560);
            }
        }
    }

    @ObfuscatedName("mc.af(I)V")
    public void method5563() {
        this.field4022 = null;
    }

    @ObfuscatedName("mc.ak(ZI)V")
    public void method5651(boolean arg0) {
        this.field4001 = !arg0;
    }

    @ObfuscatedName("mc.ay(IZI)V")
    public void method5580(int arg0, boolean arg1) {
        if (arg1) {
            this.field4033.remove(arg0);
        } else {
            this.field4033.add(arg0);
        }
        this.method5537();
    }

    @ObfuscatedName("mc.aa(IZI)V")
    public void method5669(int arg0, boolean arg1) {
        if (arg1) {
            this.field4031.remove(arg0);
        } else {
            this.field4031.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3783; var3++) {
            if (class139.method52(var3) != null && class139.method52(var3).field1574 == arg0) {
                int var4 = class139.method52(var3).field1560;
                if (arg1) {
                    this.field4019.remove(var4);
                } else {
                    this.field4019.add(var4);
                }
            }
        }
        this.method5537();
    }

    @ObfuscatedName("mc.au(B)Z")
    public boolean method5578() {
        return !this.field4001;
    }

    @ObfuscatedName("mc.an(IB)Z")
    public boolean method5583(int arg0) {
        return !this.field4033.contains(arg0);
    }

    @ObfuscatedName("mc.bd(II)Z")
    public boolean method5584(int arg0) {
        return !this.field4031.contains(arg0);
    }

    @ObfuscatedName("mc.bt(I)V")
    public void method5537() {
        this.field4009.clear();
        this.field4009.addAll(this.field4033);
        this.field4009.addAll(this.field4019);
    }

    @ObfuscatedName("mc.bq(IIIIIII)V")
    public void method5565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4008.method5520()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        List var9 = this.field3992.method3220(this.field4036 - var7 / 2 - 1, this.field4010 - var8 / 2 - 1, var7 / 2 + this.field4036 + 1, var8 / 2 + this.field4010 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class184 var11 = (class184) var10.next();
            class139 var12 = class139.method52(var11.method2989());
            var13 = false;
            for (int var14 = this.field4034.length - 1; var14 >= 0; var14--) {
                if (var12.field1563[var14] != null) {
                    client.method3750(var12.field1563[var14], var12.field1564, this.field4034[var14], var11.method2989(), var11.field2129.method4224(), var11.field2131.method4224());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("mc.bu(ILii;I)Lii;")
    public class243 method5587(int arg0, class243 arg1) {
        if (!this.field4008.method5520()) {
            return null;
        } else if (!this.field3992.method3221()) {
            return null;
        } else if (this.field4005.method3043(arg1.field2926, arg1.field2925)) {
            HashMap var3 = this.field3992.method3222();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class184 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class184 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2131;
                    }
                    var8 = (class184) var7.next();
                    int var9 = var8.field2131.field2926 - arg1.field2926;
                    int var10 = var8.field2131.field2925 - arg1.field2925;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2131;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("mc.bl(IILii;Lii;I)V")
    public void method5588(int arg0, int arg1, class243 arg2, class243 arg3) {
        class96 var5 = new class96();
        class189 var6 = new class189(arg1, arg2, arg3);
        var5.method1894(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1893(10);
                break;
            case 1009:
                var5.method1893(11);
                break;
            case 1010:
                var5.method1893(12);
                break;
            case 1011:
                var5.method1893(13);
                break;
            case 1012:
                var5.method1893(14);
        }
        class79.method2186(var5);
    }

    @ObfuscatedName("mc.bv(B)Lgq;")
    public class184 method5721() {
        if (!this.field4008.method5520()) {
            return null;
        } else if (this.field3992.method3221()) {
            HashMap var1 = this.field3992.method3222();
            this.field4040 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4040.addAll(var3);
            }
            this.field4041 = this.field4040.iterator();
            return this.method5590();
        } else {
            return null;
        }
    }

    @ObfuscatedName("mc.bm(I)Lgq;")
    public class184 method5590() {
        if (this.field4041 == null) {
            return null;
        }
        class184 var1;
        do {
            if (!this.field4041.hasNext()) {
                return null;
            }
            var1 = (class184) this.field4041.next();
        } while (var1.method2989() == -1);
        return var1;
    }
}
