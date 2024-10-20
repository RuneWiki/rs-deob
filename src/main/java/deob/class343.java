package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ma")
public class class343 {

    @ObfuscatedName("ma.n")
    public class244 field3973;

    @ObfuscatedName("ma.u")
    public class244 field3974;

    @ObfuscatedName("ma.a")
    public class244 field3975;

    @ObfuscatedName("ma.z")
    public static final class302 field3970 = class302.field3688;

    @ObfuscatedName("ma.w")
    public static final class302 field3977 = class302.field3684;

    @ObfuscatedName("ma.y")
    public static final class302 field4021 = class302.field3683;

    @ObfuscatedName("ma.c")
    public class305 field4020;

    @ObfuscatedName("ma.h")
    public HashMap field3980;

    @ObfuscatedName("ma.k")
    public class334[] field3981;

    @ObfuscatedName("ma.r")
    public HashMap field3982;

    @ObfuscatedName("ma.s")
    public class36 field3983;

    @ObfuscatedName("ma.v")
    public class36 field3978;

    @ObfuscatedName("ma.d")
    public class36 field3985;

    @ObfuscatedName("ma.e")
    public class46 field3986;

    @ObfuscatedName("ma.l")
    public class342 field3987;

    @ObfuscatedName("ma.t")
    public int field4027;

    @ObfuscatedName("ma.x")
    public int field3984;

    @ObfuscatedName("ma.b")
    public int field3990 = -1;

    @ObfuscatedName("ma.i")
    public int field4011 = -1;

    @ObfuscatedName("ma.f")
    public float field3992;

    @ObfuscatedName("ma.ah")
    public float field3993;

    @ObfuscatedName("ma.ai")
    public int field3994 = -1;

    @ObfuscatedName("ma.ao")
    public int field3995 = -1;

    @ObfuscatedName("ma.ae")
    public int field3996 = -1;

    @ObfuscatedName("ma.ax")
    public int field3997 = -1;

    @ObfuscatedName("ma.ag")
    public int field3998 = 3;

    @ObfuscatedName("ma.ab")
    public int field3999 = 50;

    @ObfuscatedName("ma.am")
    public boolean field4000 = false;

    @ObfuscatedName("ma.ak")
    public HashSet field4001 = null;

    @ObfuscatedName("ma.ad")
    public int field4002 = -1;

    @ObfuscatedName("ma.as")
    public int field4012 = -1;

    @ObfuscatedName("ma.ar")
    public int field4015 = -1;

    @ObfuscatedName("ma.ap")
    public int field3976 = -1;

    @ObfuscatedName("ma.al")
    public int field4006 = -1;

    @ObfuscatedName("ma.an")
    public int field4007 = -1;

    @ObfuscatedName("ma.ac")
    public long field4008;

    @ObfuscatedName("ma.av")
    public int field4009;

    @ObfuscatedName("ma.af")
    public int field4010;

    @ObfuscatedName("ma.at")
    public boolean field4018 = true;

    @ObfuscatedName("ma.az")
    public HashSet field4024 = new HashSet();

    @ObfuscatedName("ma.aq")
    public HashSet field4013 = new HashSet();

    @ObfuscatedName("ma.ay")
    public HashSet field3971 = new HashSet();

    @ObfuscatedName("ma.au")
    public HashSet field4028 = new HashSet();

    @ObfuscatedName("ma.aj")
    public boolean field4016 = false;

    @ObfuscatedName("ma.bk")
    public int field4017 = 0;

    @ObfuscatedName("ma.bg")
    public final int[] field4005 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ma.be")
    public List field4019;

    @ObfuscatedName("ma.bf")
    public Iterator field3972;

    @ObfuscatedName("ma.ba")
    public HashSet field3979 = new HashSet();

    @ObfuscatedName("ma.bd")
    public class223 field3988 = null;

    @ObfuscatedName("ma.bb")
    public boolean field4023 = false;

    @ObfuscatedName("ma.bw")
    public class335 field3991;

    @ObfuscatedName("ma.bq")
    public int field4025;

    @ObfuscatedName("ma.bn")
    public int field4026 = -1;

    @ObfuscatedName("ma.bc")
    public int field4004 = -1;

    @ObfuscatedName("ma.bo")
    public int field3989 = -1;

    @ObfuscatedName("ma.m(Lic;Lic;Lic;Lko;Ljava/util/HashMap;[Llh;I)V")
    public void method5987(class244 arg0, class244 arg1, class244 arg2, class305 arg3, HashMap arg4, class334[] arg5) {
        this.field3981 = arg5;
        this.field3973 = arg0;
        this.field3974 = arg1;
        this.field3975 = arg2;
        this.field4020 = arg3;
        this.field3980 = new HashMap();
        this.field3980.put(class27.field132, arg4.get(field3970));
        this.field3980.put(class27.field129, arg4.get(field3977));
        this.field3980.put(class27.field137, arg4.get(field4021));
        this.field3987 = new class342(arg0);
        int var7 = this.field3973.method3909(class45.field323.field328);
        int[] var8 = this.field3973.method3902(var7);
        this.field3982 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class310 var10 = new class310(this.field3973.method3891(var7, var8[var9]));
            class36 var11 = new class36();
            var11.method327(var10, var8[var9]);
            this.field3982.put(var11.method336(), var11);
            if (var11.method385()) {
                this.field3983 = var11;
            }
        }
        this.method5983(this.field3983);
        this.field3985 = null;
    }

    @ObfuscatedName("ma.o(B)V")
    public void method6143() {
        class39.method2052();
    }

    @ObfuscatedName("ma.q(IIZIIIII)V")
    public void method5970(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3987.method5962()) {
            return;
        }
        this.method5999();
        this.method6033();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3992));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3992));
        List var10 = this.field3986.method578(this.field4027 - var8 / 2 - 1, this.field3984 - var9 / 2 - 1, var8 / 2 + this.field4027 + 1, var9 / 2 + this.field3984 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class44 var13 = (class44) var12.next();
            var11.add(var13);
            class72 var14 = new class72();
            class51 var15 = new class51(var13.method224(), var13.field318, var13.field321);
            var14.method1077(new Object[] { var15, arg0, arg1 });
            if (this.field3979.contains(var13)) {
                var14.method1068(17);
            } else {
                var14.method1068(15);
            }
            class86.method1066(var14);
        }
        Iterator var16 = this.field3979.iterator();
        while (var16.hasNext()) {
            class44 var17 = (class44) var16.next();
            if (!var11.contains(var17)) {
                class72 var18 = new class72();
                class51 var19 = new class51(var17.method224(), var17.field318, var17.field321);
                var18.method1077(new Object[] { var19, arg0, arg1 });
                var18.method1068(16);
                class86.method1066(var18);
            }
        }
        this.field3979 = var11;
    }

    @ObfuscatedName("ma.j(IIZZB)V")
    public void method6140(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class307.method3253();
        this.method5972(arg0, arg1, arg3, var5);
        if (!this.method5977() && arg3 || arg2) {
            if (arg3) {
                this.field4006 = arg0;
                this.field4007 = arg1;
                this.field4015 = this.field4027;
                this.field3976 = this.field3984;
            }
            if (this.field4015 != -1) {
                int var7 = arg0 - this.field4006;
                int var8 = arg1 - this.field4007;
                this.method5975(this.field4015 - (int) ((float) var7 / this.field3993), this.field3976 + (int) ((float) var8 / this.field3993), false);
            }
        } else {
            this.method5976();
        }
        if (arg3) {
            this.field4008 = var5;
            this.field4009 = arg0;
            this.field4010 = arg1;
        }
    }

    @ObfuscatedName("ma.p(IIZJ)V")
    public void method5972(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3978 == null) {
            this.field3988 = null;
            return;
        }
        int var6 = (int) ((float) this.field4027 + ((float) (arg0 - this.field3996) - (float) this.method6062() * this.field3992 / 2.0F) / this.field3992);
        int var7 = (int) ((float) this.field3984 - ((float) (arg1 - this.field3997) - (float) this.method6003() * this.field3992 / 2.0F) / this.field3992);
        this.field3988 = this.field3978.method386(var6 + this.field3978.method340() * 64, var7 + this.field3978.method357() * 64);
        if (this.field3988 == null || !arg2) {
            return;
        }
        boolean var8 = client.field843 >= 2;
        if (var8 && class55.field409[82] && class55.field409[81]) {
            client.method162(this.field3988.field2566, this.field3988.field2565, this.field3988.field2567, false);
            return;
        }
        boolean var9 = true;
        if (this.field4018) {
            int var10 = arg0 - this.field4009;
            int var11 = arg1 - this.field4010;
            if (arg3 - this.field4008 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class197 var12 = class197.method3184(class193.field2334, client.field721.field1340);
            var12.field2375.method5274(this.field3988.method3718());
            client.field721.method2161(var12);
            this.field4008 = 0L;
        }
    }

    @ObfuscatedName("ma.g(I)V")
    public void method5999() {
        if (Statics.field3586 != null) {
            this.field3992 = this.field3993;
            return;
        }
        if (this.field3992 < this.field3993) {
            this.field3992 = Math.min(this.field3993, this.field3992 / 30.0F + this.field3992);
        }
        if (this.field3992 > this.field3993) {
            this.field3992 = Math.max(this.field3993, this.field3992 - this.field3992 / 30.0F);
        }
    }

    @ObfuscatedName("ma.n(I)V")
    public void method6033() {
        if (!this.method5977()) {
            return;
        }
        int var1 = this.field3990 - this.field4027;
        int var2 = this.field4011 - this.field3984;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5975(this.field4027 + var1, this.field3984 + var2, true);
        if (this.field4027 == this.field3990 && this.field4011 == this.field3984) {
            this.field3990 = -1;
            this.field4011 = -1;
        }
    }

    @ObfuscatedName("ma.u(IIZB)V")
    public final void method5975(int arg0, int arg1, boolean arg2) {
        this.field4027 = arg0;
        this.field3984 = arg1;
        class307.method3253();
        if (arg2) {
            this.method5976();
        }
    }

    @ObfuscatedName("ma.a(I)V")
    public final void method5976() {
        this.field4007 = -1;
        this.field4006 = -1;
        this.field3976 = -1;
        this.field4015 = -1;
    }

    @ObfuscatedName("ma.z(I)Z")
    public boolean method5977() {
        return this.field3990 != -1 && this.field4011 != -1;
    }

    @ObfuscatedName("ma.w(IIII)Lad;")
    public class36 method5978(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3982.values().iterator();
        class36 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class36) var4.next();
        } while (!var5.method342(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ma.y(IIIZI)V")
    public void method5979(int arg0, int arg1, int arg2, boolean arg3) {
        class36 var5 = this.method5978(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3983;
        }
        boolean var6 = false;
        if (this.field3985 != var5 || arg3) {
            this.field3985 = var5;
            this.method5983(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5986(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ma.c(II)V")
    public void method5980(int arg0) {
        class36 var2 = this.method5996(arg0);
        if (var2 != null) {
            this.method5983(var2);
        }
    }

    @ObfuscatedName("ma.h(B)I")
    public int method5981() {
        return this.field3978 == null ? -1 : this.field3978.method334();
    }

    @ObfuscatedName("ma.k(I)Lad;")
    public class36 method5982() {
        return this.field3978;
    }

    @ObfuscatedName("ma.r(Lad;I)V")
    public void method5983(class36 arg0) {
        if (this.field3978 == null || this.field3978 != arg0) {
            this.method5984(arg0);
            this.method5986(-1, -1, -1);
        }
    }

    @ObfuscatedName("ma.d(Lad;I)V")
    public void method5984(class36 arg0) {
        this.field3978 = arg0;
        this.field3986 = new class46(this.field3981, this.field3980, this.field3974, this.field3975);
        this.field3987.method5963(this.field3978.method336());
    }

    @ObfuscatedName("ma.e(Lad;Lhg;Lhg;ZB)V")
    public void method5985(class36 arg0, class223 arg1, class223 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3978 == null || this.field3978 != arg0) {
            this.method5984(arg0);
        }
        if (!arg3 && this.field3978.method342(arg1.field2567, arg1.field2566, arg1.field2565)) {
            this.method5986(arg1.field2567, arg1.field2566, arg1.field2565);
        } else {
            this.method5986(arg2.field2567, arg2.field2566, arg2.field2565);
        }
    }

    @ObfuscatedName("ma.l(IIII)V")
    public void method5986(int arg0, int arg1, int arg2) {
        if (this.field3978 == null) {
            return;
        }
        int[] var4 = this.field3978.method355(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3978.method355(this.field3978.method345(), this.field3978.method344(), this.field3978.method346());
        }
        this.method5975(var4[0] - this.field3978.method340() * 64, var4[1] - this.field3978.method357() * 64, true);
        this.field3990 = -1;
        this.field4011 = -1;
        this.field3992 = this.method5992(this.field3978.method339());
        this.field3993 = this.field3992;
        this.field4019 = null;
        this.field3972 = null;
        this.field3986.method575();
    }

    @ObfuscatedName("ma.t(IIIIIB)V")
    public void method6000(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class331.method5680(var6);
        class331.method5691(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class331.method5686(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3987.method5957();
        if (var7 < 100) {
            this.method6044(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3986.method580()) {
            this.field3986.method609(this.field3973, this.field3978.method336(), client.field896);
            if (!this.field3986.method580()) {
                return;
            }
        }
        if (this.field4001 != null) {
            this.field4012++;
            if (this.field4012 % this.field3999 == 0) {
                this.field4012 = 0;
                this.field4002++;
            }
            if (this.field4002 >= this.field3998 && !this.field4000) {
                this.field4001 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3992));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3992));
        this.field3986.method576(this.field4027 - var8 / 2, this.field3984 - var9 / 2, var8 / 2 + this.field4027, var9 / 2 + this.field3984, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4016) {
            boolean var10 = false;
            if (arg4 - this.field4017 > 100) {
                this.field4017 = arg4;
                var10 = true;
            }
            this.field3986.method608(this.field4027 - var8 / 2, this.field3984 - var9 / 2, var8 / 2 + this.field4027, var9 / 2 + this.field3984, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4028, this.field4001, this.field4012, this.field3999, var10);
        }
        this.method6050(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field843 >= 2;
        if (var11 && this.field4023 && this.field3988 != null) {
            this.field4020.method5070("Coord: " + this.field3988, class331.field3875 + 10, class331.field3873 + 20, 16776960, -1);
        }
        this.field3994 = var8;
        this.field3995 = var9;
        this.field3996 = arg0;
        this.field3997 = arg1;
        class331.method5681(var6);
    }

    @ObfuscatedName("ma.x(IIIIIII)Z")
    public boolean method6012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3991 == null) {
            return true;
        } else if (this.field3991.field3897 != arg0 || this.field3991.field3895 != arg1) {
            return true;
        } else if (this.field3986.field347 != this.field4025) {
            return true;
        } else if (client.field943 != this.field3989) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ma.ah(IIIIIIB)V")
    public void method6050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3586 == null) {
            return;
        }
        int var7 = 512 / (this.field3986.field347 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6001() - arg4 / 2 - var7;
        int var14 = this.method6018() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3986.field347 * (var7 + var13 - this.field4026);
        int var16 = arg1 - this.field3986.field347 * (var7 - (var14 - this.field4004));
        if (this.method6012(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3991 != null && this.field3991.field3897 == var11 && this.field3991.field3895 == var12) {
                Arrays.fill(this.field3991.field3896, 0);
            } else {
                this.field3991 = new class335(var11, var12);
            }
            this.field4026 = this.method6001() - arg4 / 2 - var7;
            this.field4004 = this.method6018() - arg5 / 2 - var7;
            this.field4025 = this.field3986.field347;
            Statics.field3586.method4064(this.field4026, this.field4004, this.field3991, (float) this.field4025 / var10);
            this.field3989 = client.field943;
            var15 = arg0 - this.field3986.field347 * (var7 + var13 - this.field4026);
            var16 = arg1 - this.field3986.field347 * (var7 - (var14 - this.field4004));
        }
        class331.method5685(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3991.method5788(var15, var16, 192);
        } else {
            this.field3991.method5817(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ma.ai(IIIII)V")
    public void method5989(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3987.method5962()) {
            return;
        }
        if (!this.field3986.method580()) {
            this.field3986.method609(this.field3973, this.field3978.method336(), client.field896);
            if (!this.field3986.method580()) {
                return;
            }
        }
        this.field3986.method577(arg0, arg1, arg2, arg3, this.field4001, this.field4012, this.field3999);
    }

    @ObfuscatedName("ma.ao(II)V")
    public void method6167(int arg0) {
        this.field3993 = this.method5992(arg0);
    }

    @ObfuscatedName("ma.ae(IIIIII)V")
    public void method6044(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class331.method5686(arg0, arg1, arg2, arg3, -16777216);
        class331.method5690(var7 - 152, var8, 304, 34, -65536);
        class331.method5686(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4020.method5073(class234.field3092, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ma.ax(II)F")
    public float method5992(int arg0) {
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

    @ObfuscatedName("ma.ag(I)I")
    public int method5993() {
        if ((double) this.field3993 == 1.0D) {
            return 25;
        } else if ((double) this.field3993 == 1.5D) {
            return 37;
        } else if ((double) this.field3993 == 2.0D) {
            return 50;
        } else if ((double) this.field3993 == 3.0D) {
            return 75;
        } else if ((double) this.field3993 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ma.ab(I)V")
    public void method6092() {
        this.field3987.method5958();
    }

    @ObfuscatedName("ma.am(I)Z")
    public boolean method5988() {
        return this.field3987.method5962();
    }

    @ObfuscatedName("ma.ak(II)Lad;")
    public class36 method5996(int arg0) {
        Iterator var2 = this.field3982.values().iterator();
        class36 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class36) var2.next();
        } while (var3.method334() != arg0);
        return var3;
    }

    @ObfuscatedName("ma.ad(III)V")
    public void method6036(int arg0, int arg1) {
        if (this.field3978 != null && this.field3978.method330(arg0, arg1)) {
            this.field3990 = arg0 - this.field3978.method340() * 64;
            this.field4011 = arg1 - this.field3978.method357() * 64;
        }
    }

    @ObfuscatedName("ma.as(III)V")
    public void method5998(int arg0, int arg1) {
        if (this.field3978 != null) {
            this.method5975(arg0 - this.field3978.method340() * 64, arg1 - this.field3978.method357() * 64, true);
            this.field3990 = -1;
            this.field4011 = -1;
        }
    }

    @ObfuscatedName("ma.ar(IIIB)V")
    public void method5973(int arg0, int arg1, int arg2) {
        if (this.field3978 != null) {
            int[] var4 = this.field3978.method355(arg0, arg1, arg2);
            if (var4 != null) {
                this.method6036(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ma.ap(IIII)V")
    public void method6096(int arg0, int arg1, int arg2) {
        if (this.field3978 != null) {
            int[] var4 = this.field3978.method355(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5998(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ma.al(I)I")
    public int method6001() {
        return this.field3978 == null ? -1 : this.field4027 + this.field3978.method340() * 64;
    }

    @ObfuscatedName("ma.an(I)I")
    public int method6018() {
        return this.field3978 == null ? -1 : this.field3984 + this.field3978.method357() * 64;
    }

    @ObfuscatedName("ma.ac(I)Lhg;")
    public class223 method6016() {
        return this.field3978 == null ? null : this.field3978.method386(this.method6001(), this.method6018());
    }

    @ObfuscatedName("ma.av(I)I")
    public int method6062() {
        return this.field3994;
    }

    @ObfuscatedName("ma.af(I)I")
    public int method6003() {
        return this.field3995;
    }

    @ObfuscatedName("ma.at(II)V")
    public void method6006(int arg0) {
        if (arg0 >= 1) {
            this.field3998 = arg0;
        }
    }

    @ObfuscatedName("ma.aa(I)V")
    public void method6007() {
        this.field3998 = 3;
    }

    @ObfuscatedName("ma.aw(IB)V")
    public void method6117(int arg0) {
        if (arg0 >= 1) {
            this.field3999 = arg0;
        }
    }

    @ObfuscatedName("ma.az(I)V")
    public void method6009() {
        this.field3999 = 50;
    }

    @ObfuscatedName("ma.aq(ZI)V")
    public void method6010(boolean arg0) {
        this.field4000 = arg0;
    }

    @ObfuscatedName("ma.ay(IB)V")
    public void method6011(int arg0) {
        this.field4001 = new HashSet();
        this.field4001.add(arg0);
        this.field4002 = 0;
        this.field4012 = 0;
    }

    @ObfuscatedName("ma.au(II)V")
    public void method6032(int arg0) {
        this.field4001 = new HashSet();
        this.field4002 = 0;
        this.field4012 = 0;
        for (int var2 = 0; var2 < Statics.field3242; var2++) {
            if (class252.method1412(var2) != null && class252.method1412(var2).field3261 == arg0) {
                this.field4001.add(class252.method1412(var2).field3245);
            }
        }
    }

    @ObfuscatedName("ma.aj(I)V")
    public void method6157() {
        this.field4001 = null;
    }

    @ObfuscatedName("ma.bk(ZI)V")
    public void method6014(boolean arg0) {
        this.field4016 = !arg0;
    }

    @ObfuscatedName("ma.bh(IZI)V")
    public void method6015(int arg0, boolean arg1) {
        if (arg1) {
            this.field4024.remove(arg0);
        } else {
            this.field4024.add(arg0);
        }
        this.method6020();
    }

    @ObfuscatedName("ma.bg(IZI)V")
    public void method6130(int arg0, boolean arg1) {
        if (arg1) {
            this.field4013.remove(arg0);
        } else {
            this.field4013.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3242; var3++) {
            if (class252.method1412(var3) != null && class252.method1412(var3).field3261 == arg0) {
                int var4 = class252.method1412(var3).field3245;
                if (arg1) {
                    this.field3971.remove(var4);
                } else {
                    this.field3971.add(var4);
                }
            }
        }
        this.method6020();
    }

    @ObfuscatedName("ma.be(B)Z")
    public boolean method6005() {
        return !this.field4016;
    }

    @ObfuscatedName("ma.bf(IS)Z")
    public boolean method6165(int arg0) {
        return !this.field4024.contains(arg0);
    }

    @ObfuscatedName("ma.ba(IS)Z")
    public boolean method6019(int arg0) {
        return !this.field4013.contains(arg0);
    }

    @ObfuscatedName("ma.bd(B)V")
    public void method6020() {
        this.field4028.clear();
        this.field4028.addAll(this.field4024);
        this.field4028.addAll(this.field3971);
    }

    @ObfuscatedName("ma.bb(IIIIIIB)V")
    public void method6139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3987.method5962()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3992));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3992));
        List var9 = this.field3986.method578(this.field4027 - var7 / 2 - 1, this.field3984 - var8 / 2 - 1, var7 / 2 + this.field4027 + 1, var8 / 2 + this.field3984 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class252 var12 = class252.method1412(var11.method224());
            var13 = false;
            for (int var14 = this.field4005.length - 1; var14 >= 0; var14--) {
                if (var12.field3250[var14] != null) {
                    Statics.method1069(var12.field3250[var14], var12.field3251, this.field4005[var14], var11.method224(), var11.field318.method3718(), var11.field321.method3718());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ma.bw(ILhg;I)Lhg;")
    public class223 method6022(int arg0, class223 arg1) {
        if (!this.field3987.method5962()) {
            return null;
        } else if (!this.field3986.method580()) {
            return null;
        } else if (this.field3978.method330(arg1.field2566, arg1.field2565)) {
            HashMap var3 = this.field3986.method581();
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
                        return var5.field321;
                    }
                    var8 = (class44) var7.next();
                    int var9 = var8.field321.field2566 - arg1.field2566;
                    int var10 = var8.field321.field2565 - arg1.field2565;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field321;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ma.bq(IILhg;Lhg;I)V")
    public void method6112(int arg0, int arg1, class223 arg2, class223 arg3) {
        class72 var5 = new class72();
        class51 var6 = new class51(arg1, arg2, arg3);
        var5.method1077(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1068(10);
                break;
            case 1009:
                var5.method1068(11);
                break;
            case 1010:
                var5.method1068(12);
                break;
            case 1011:
                var5.method1068(13);
                break;
            case 1012:
                var5.method1068(14);
        }
        class86.method1066(var5);
    }

    @ObfuscatedName("ma.bn(I)Laf;")
    public class44 method6024() {
        if (!this.field3987.method5962()) {
            return null;
        } else if (this.field3986.method580()) {
            HashMap var1 = this.field3986.method581();
            this.field4019 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4019.addAll(var3);
            }
            this.field3972 = this.field4019.iterator();
            return this.method6017();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ma.bc(B)Laf;")
    public class44 method6017() {
        if (this.field3972 == null) {
            return null;
        }
        class44 var1;
        do {
            if (!this.field3972.hasNext()) {
                return null;
            }
            var1 = (class44) this.field3972.next();
        } while (var1.method224() == -1);
        return var1;
    }
}
