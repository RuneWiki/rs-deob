package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mi")
public class class344 {

    @ObfuscatedName("mi.k")
    public class245 field3994;

    @ObfuscatedName("mi.c")
    public class245 field3995;

    @ObfuscatedName("mi.u")
    public class245 field4000;

    @ObfuscatedName("mi.t")
    public static final class303 field4048 = class303.field3692;

    @ObfuscatedName("mi.e")
    public static final class303 field3998 = class303.field3693;

    @ObfuscatedName("mi.o")
    public static final class303 field3999 = class303.field3694;

    @ObfuscatedName("mi.n")
    public class306 field3997;

    @ObfuscatedName("mi.x")
    public HashMap field4001;

    @ObfuscatedName("mi.p")
    public class335[] field4012;

    @ObfuscatedName("mi.r")
    public HashMap field4031;

    @ObfuscatedName("mi.y")
    public class36 field4033;

    @ObfuscatedName("mi.s")
    public class36 field4005;

    @ObfuscatedName("mi.j")
    public class36 field3996;

    @ObfuscatedName("mi.w")
    public class46 field3992;

    @ObfuscatedName("mi.v")
    public class343 field4008;

    @ObfuscatedName("mi.d")
    public int field4009;

    @ObfuscatedName("mi.a")
    public int field4010;

    @ObfuscatedName("mi.g")
    public int field4007 = -1;

    @ObfuscatedName("mi.h")
    public int field4002 = -1;

    @ObfuscatedName("mi.i")
    public float field4013;

    @ObfuscatedName("mi.ab")
    public float field4006;

    @ObfuscatedName("mi.ac")
    public int field4015 = -1;

    @ObfuscatedName("mi.ao")
    public int field4016 = -1;

    @ObfuscatedName("mi.af")
    public int field4017 = -1;

    @ObfuscatedName("mi.av")
    public int field4020 = -1;

    @ObfuscatedName("mi.ar")
    public int field4019 = 3;

    @ObfuscatedName("mi.ay")
    public int field4018 = 50;

    @ObfuscatedName("mi.ah")
    public boolean field4021 = false;

    @ObfuscatedName("mi.az")
    public HashSet field4022 = null;

    @ObfuscatedName("mi.ak")
    public int field4045 = -1;

    @ObfuscatedName("mi.au")
    public int field4024 = -1;

    @ObfuscatedName("mi.ai")
    public int field4025 = -1;

    @ObfuscatedName("mi.ax")
    public int field4026 = -1;

    @ObfuscatedName("mi.ag")
    public int field4027 = -1;

    @ObfuscatedName("mi.aq")
    public int field4028 = -1;

    @ObfuscatedName("mi.aw")
    public long field3989;

    @ObfuscatedName("mi.an")
    public int field4030;

    @ObfuscatedName("mi.am")
    public int field4034;

    @ObfuscatedName("mi.aa")
    public boolean field4032 = true;

    @ObfuscatedName("mi.aj")
    public HashSet field3990 = new HashSet();

    @ObfuscatedName("mi.ae")
    public HashSet field4040 = new HashSet();

    @ObfuscatedName("mi.al")
    public HashSet field4035 = new HashSet();

    @ObfuscatedName("mi.ap")
    public HashSet field4011 = new HashSet();

    @ObfuscatedName("mi.ad")
    public boolean field4037 = false;

    @ObfuscatedName("mi.bb")
    public int field4038 = 0;

    @ObfuscatedName("mi.bp")
    public final int[] field4039 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("mi.bg")
    public List field4004;

    @ObfuscatedName("mi.bc")
    public Iterator field4041;

    @ObfuscatedName("mi.bj")
    public HashSet field4042 = new HashSet();

    @ObfuscatedName("mi.bl")
    public class223 field4043 = null;

    @ObfuscatedName("mi.bn")
    public boolean field4023 = false;

    @ObfuscatedName("mi.bo")
    public class336 field4046;

    @ObfuscatedName("mi.be")
    public int field4029;

    @ObfuscatedName("mi.ba")
    public int field4047 = -1;

    @ObfuscatedName("mi.bt")
    public int field4036 = -1;

    @ObfuscatedName("mi.bw")
    public int field4049 = -1;

    @ObfuscatedName("mi.f(Liw;Liw;Liw;Lkq;Ljava/util/HashMap;[Lle;I)V")
    public void method5927(class245 arg0, class245 arg1, class245 arg2, class306 arg3, HashMap arg4, class335[] arg5) {
        this.field4012 = arg5;
        this.field3994 = arg0;
        this.field3995 = arg1;
        this.field4000 = arg2;
        this.field3997 = arg3;
        this.field4001 = new HashMap();
        this.field4001.put(class27.field147, arg4.get(field4048));
        this.field4001.put(class27.field144, arg4.get(field3998));
        this.field4001.put(class27.field146, arg4.get(field3999));
        this.field4008 = new class343(arg0);
        int var7 = this.field3994.method3923(class45.field321.field325);
        int[] var8 = this.field3994.method3962(var7);
        this.field4031 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class311 var10 = new class311(this.field3994.method3905(var7, var8[var9]));
            class36 var11 = new class36();
            var11.method355(var10, var8[var9]);
            this.field4031.put(var11.method364(), var11);
            if (var11.method363()) {
                this.field4033 = var11;
            }
        }
        this.method5942(this.field4033);
        this.field3996 = null;
    }

    @ObfuscatedName("mi.b(B)V")
    public void method5928() {
        class39.field271.method3195(5);
    }

    @ObfuscatedName("mi.l(IIZIIIII)V")
    public void method5929(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4008.method5922()) {
            return;
        }
        this.method6109();
        this.method5933();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4013));
        List var10 = this.field3992.method628(this.field4009 - var8 / 2 - 1, this.field4010 - var9 / 2 - 1, var8 / 2 + this.field4009 + 1, var9 / 2 + this.field4010 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class44 var13 = (class44) var12.next();
            var11.add(var13);
            class72 var14 = new class72();
            class51 var15 = new class51(var13.method251(), var13.field311, var13.field317);
            var14.method1114(new Object[] { var15, arg0, arg1 });
            if (this.field4042.contains(var13)) {
                var14.method1116(17);
            } else {
                var14.method1116(15);
            }
            class86.method3119(var14);
        }
        Iterator var16 = this.field4042.iterator();
        while (var16.hasNext()) {
            class44 var17 = (class44) var16.next();
            if (!var11.contains(var17)) {
                class72 var18 = new class72();
                class51 var19 = new class51(var17.method251(), var17.field311, var17.field317);
                var18.method1114(new Object[] { var19, arg0, arg1 });
                var18.method1116(16);
                class86.method3119(var18);
            }
        }
        this.field4042 = var11;
    }

    @ObfuscatedName("mi.m(IIZZB)V")
    public void method5930(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class308.method4786();
        this.method5931(arg0, arg1, arg3, var5);
        if (!this.method5936() && arg3 || arg2) {
            if (arg3) {
                this.field4027 = arg0;
                this.field4028 = arg1;
                this.field4025 = this.field4009;
                this.field4026 = this.field4010;
            }
            if (this.field4025 != -1) {
                int var7 = arg0 - this.field4027;
                int var8 = arg1 - this.field4028;
                this.method6103(this.field4025 - (int) ((float) var7 / this.field4006), this.field4026 + (int) ((float) var8 / this.field4006), false);
            }
        } else {
            this.method5935();
        }
        if (arg3) {
            this.field3989 = var5;
            this.field4030 = arg0;
            this.field4034 = arg1;
        }
    }

    @ObfuscatedName("mi.z(IIZJ)V")
    public void method5931(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4005 == null) {
            this.field4043 = null;
            return;
        }
        int var6 = (int) ((float) this.field4009 + ((float) (arg0 - this.field4017) - (float) this.method5964() * this.field4013 / 2.0F) / this.field4013);
        int var7 = (int) ((float) this.field4010 - ((float) (arg1 - this.field4020) - (float) this.method5956() * this.field4013 / 2.0F) / this.field4013);
        this.field4043 = this.field4005.method360(var6 + this.field4005.method368() * 64, var7 + this.field4005.method370() * 64);
        if (this.field4043 == null || !arg2) {
            return;
        }
        if (client.method3282() && class55.field421[82] && class55.field421[81]) {
            client.method27(this.field4043.field2557, this.field4043.field2554, this.field4043.field2555, false);
            return;
        }
        boolean var8 = true;
        if (this.field4032) {
            int var9 = arg0 - this.field4030;
            int var10 = arg1 - this.field4034;
            if (arg3 - this.field3989 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class197 var11 = class197.method57(class193.field2293, client.field729.field1347);
            var11.field2371.method5225(this.field4043.method3753());
            client.field729.method2178(var11);
            this.field3989 = 0L;
        }
    }

    @ObfuscatedName("mi.q(B)V")
    public void method6109() {
        if (Statics.field1896 != null) {
            this.field4013 = this.field4006;
            return;
        }
        if (this.field4013 < this.field4006) {
            this.field4013 = Math.min(this.field4006, this.field4013 / 30.0F + this.field4013);
        }
        if (this.field4013 > this.field4006) {
            this.field4013 = Math.max(this.field4006, this.field4013 - this.field4013 / 30.0F);
        }
    }

    @ObfuscatedName("mi.k(I)V")
    public void method5933() {
        if (!this.method5936()) {
            return;
        }
        int var1 = this.field4007 - this.field4009;
        int var2 = this.field4002 - this.field4010;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6103(this.field4009 + var1, this.field4010 + var2, true);
        if (this.field4009 == this.field4007 && this.field4010 == this.field4002) {
            this.field4007 = -1;
            this.field4002 = -1;
        }
    }

    @ObfuscatedName("mi.c(IIZI)V")
    public final void method6103(int arg0, int arg1, boolean arg2) {
        this.field4009 = arg0;
        this.field4010 = arg1;
        class308.method4786();
        if (arg2) {
            this.method5935();
        }
    }

    @ObfuscatedName("mi.u(I)V")
    public final void method5935() {
        this.field4028 = -1;
        this.field4027 = -1;
        this.field4026 = -1;
        this.field4025 = -1;
    }

    @ObfuscatedName("mi.t(I)Z")
    public boolean method5936() {
        return this.field4007 != -1 && this.field4002 != -1;
    }

    @ObfuscatedName("mi.e(IIII)Lak;")
    public class36 method6080(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4031.values().iterator();
        class36 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class36) var4.next();
        } while (!var5.method357(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("mi.o(IIIZI)V")
    public void method5938(int arg0, int arg1, int arg2, boolean arg3) {
        class36 var5 = this.method6080(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4033;
        }
        boolean var6 = false;
        if (this.field3996 != var5 || arg3) {
            this.field3996 = var5;
            this.method5942(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5945(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mi.n(II)V")
    public void method5939(int arg0) {
        class36 var2 = this.method5961(arg0);
        if (var2 != null) {
            this.method5942(var2);
        }
    }

    @ObfuscatedName("mi.x(B)I")
    public int method5940() {
        return this.field4005 == null ? -1 : this.field4005.method362();
    }

    @ObfuscatedName("mi.p(I)Lak;")
    public class36 method5941() {
        return this.field4005;
    }

    @ObfuscatedName("mi.r(Lak;I)V")
    public void method5942(class36 arg0) {
        if (this.field4005 == null || this.field4005 != arg0) {
            this.method6121(arg0);
            this.method5945(-1, -1, -1);
        }
    }

    @ObfuscatedName("mi.y(Lak;I)V")
    public void method6121(class36 arg0) {
        this.field4005 = arg0;
        this.field3992 = new class46(this.field4012, this.field4001, this.field3995, this.field4000);
        this.field4008.method5919(this.field4005.method364());
    }

    @ObfuscatedName("mi.s(Lak;Lhw;Lhw;ZB)V")
    public void method5944(class36 arg0, class223 arg1, class223 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4005 == null || this.field4005 != arg0) {
            this.method6121(arg0);
        }
        if (!arg3 && this.field4005.method357(arg1.field2555, arg1.field2557, arg1.field2554)) {
            this.method5945(arg1.field2555, arg1.field2557, arg1.field2554);
        } else {
            this.method5945(arg2.field2555, arg2.field2557, arg2.field2554);
        }
    }

    @ObfuscatedName("mi.j(IIIB)V")
    public void method5945(int arg0, int arg1, int arg2) {
        if (this.field4005 == null) {
            return;
        }
        int[] var4 = this.field4005.method359(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4005.method359(this.field4005.method373(), this.field4005.method372(), this.field4005.method404());
        }
        this.method6103(var4[0] - this.field4005.method368() * 64, var4[1] - this.field4005.method370() * 64, true);
        this.field4007 = -1;
        this.field4002 = -1;
        this.field4013 = this.method6094(this.field4005.method367());
        this.field4006 = this.field4013;
        this.field4004 = null;
        this.field4041 = null;
        this.field3992.method622();
    }

    @ObfuscatedName("mi.d(IIIIII)V")
    public void method6112(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class332.method5646(var6);
        class332.method5644(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class332.method5652(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4008.method5920();
        if (var7 < 100) {
            this.method5951(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3992.method624()) {
            this.field3992.method634(this.field3994, this.field4005.method364(), client.field684);
            if (!this.field3992.method624()) {
                return;
            }
        }
        if (this.field4022 != null) {
            this.field4024++;
            if (this.field4024 % this.field4018 == 0) {
                this.field4024 = 0;
                this.field4045++;
            }
            if (this.field4045 >= this.field4019 && !this.field4021) {
                this.field4022 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        this.field3992.method619(this.field4009 - var8 / 2, this.field4010 - var9 / 2, var8 / 2 + this.field4009, var9 / 2 + this.field4010, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4037) {
            boolean var10 = false;
            if (arg4 - this.field4038 > 100) {
                this.field4038 = arg4;
                var10 = true;
            }
            this.field3992.method620(this.field4009 - var8 / 2, this.field4010 - var9 / 2, var8 / 2 + this.field4009, var9 / 2 + this.field4010, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4011, this.field4022, this.field4024, this.field4018, var10);
        }
        this.method5948(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method3282() && this.field4023 && this.field4043 != null) {
            this.field3997.method5060("Coord: " + this.field4043, class332.field3885 + 10, class332.field3887 + 20, 16776960, -1);
        }
        this.field4015 = var8;
        this.field4016 = var9;
        this.field4017 = arg0;
        this.field4020 = arg1;
        class332.method5647(var6);
    }

    @ObfuscatedName("mi.a(IIIIIII)Z")
    public boolean method5947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4046 == null) {
            return true;
        } else if (this.field4046.field3909 != arg0 || this.field4046.field3915 != arg1) {
            return true;
        } else if (this.field3992.field337 != this.field4029) {
            return true;
        } else if (client.field951 != this.field4049) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("mi.g(IIIIIII)V")
    public void method5948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1896 == null) {
            return;
        }
        int var7 = 512 / (this.field3992.field337 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method6087() - arg4 / 2 - var7;
        int var14 = this.method5962() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3992.field337 * (var7 + var13 - this.field4047);
        int var16 = arg1 - this.field3992.field337 * (var7 - (var14 - this.field4036));
        if (this.method5947(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4046 != null && this.field4046.field3909 == var11 && this.field4046.field3915 == var12) {
                Arrays.fill(this.field4046.field3910, 0);
            } else {
                this.field4046 = new class336(var11, var12);
            }
            this.field4047 = this.method6087() - arg4 / 2 - var7;
            this.field4036 = this.method5962() - arg5 / 2 - var7;
            this.field4029 = this.field3992.field337;
            Statics.field1896.method4071(this.field4047, this.field4036, this.field4046, (float) this.field4029 / var10);
            this.field4049 = client.field951;
            var15 = arg0 - this.field3992.field337 * (var7 + var13 - this.field4047);
            var16 = arg1 - this.field3992.field337 * (var7 - (var14 - this.field4036));
        }
        class332.method5691(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4046.method5768(var15, var16, 192);
        } else {
            this.field4046.method5771(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("mi.h(IIIII)V")
    public void method5949(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4008.method5922()) {
            return;
        }
        if (!this.field3992.method624()) {
            this.field3992.method634(this.field3994, this.field4005.method364(), client.field684);
            if (!this.field3992.method624()) {
                return;
            }
        }
        this.field3992.method621(arg0, arg1, arg2, arg3, this.field4022, this.field4024, this.field4018);
    }

    @ObfuscatedName("mi.ab(II)V")
    public void method5952(int arg0) {
        this.field4006 = this.method6094(arg0);
    }

    @ObfuscatedName("mi.ac(IIIIIB)V")
    public void method5951(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class332.method5652(arg0, arg1, arg2, arg3, -16777216);
        class332.method5656(var7 - 152, var8, 304, 34, -65536);
        class332.method5652(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3997.method5036(class234.field3086, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("mi.ao(II)F")
    public float method6094(int arg0) {
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

    @ObfuscatedName("mi.af(I)I")
    public int method5953() {
        if ((double) this.field4006 == 1.0D) {
            return 25;
        } else if ((double) this.field4006 == 1.5D) {
            return 37;
        } else if ((double) this.field4006 == 2.0D) {
            return 50;
        } else if ((double) this.field4006 == 3.0D) {
            return 75;
        } else if ((double) this.field4006 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("mi.av(I)V")
    public void method5954() {
        this.field4008.method5921();
    }

    @ObfuscatedName("mi.ar(B)Z")
    public boolean method6037() {
        return this.field4008.method5922();
    }

    @ObfuscatedName("mi.ay(II)Lak;")
    public class36 method5961(int arg0) {
        Iterator var2 = this.field4031.values().iterator();
        class36 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class36) var2.next();
        } while (var3.method362() != arg0);
        return var3;
    }

    @ObfuscatedName("mi.ah(III)V")
    public void method5968(int arg0, int arg1) {
        if (this.field4005 != null && this.field4005.method431(arg0, arg1)) {
            this.field4007 = arg0 - this.field4005.method368() * 64;
            this.field4002 = arg1 - this.field4005.method370() * 64;
        }
    }

    @ObfuscatedName("mi.az(III)V")
    public void method5958(int arg0, int arg1) {
        if (this.field4005 != null) {
            this.method6103(arg0 - this.field4005.method368() * 64, arg1 - this.field4005.method370() * 64, true);
            this.field4007 = -1;
            this.field4002 = -1;
        }
    }

    @ObfuscatedName("mi.ak(IIII)V")
    public void method6113(int arg0, int arg1, int arg2) {
        if (this.field4005 != null) {
            int[] var4 = this.field4005.method359(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5968(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mi.au(IIII)V")
    public void method6104(int arg0, int arg1, int arg2) {
        if (this.field4005 != null) {
            int[] var4 = this.field4005.method359(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5958(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("mi.ai(I)I")
    public int method6087() {
        return this.field4005 == null ? -1 : this.field4009 + this.field4005.method368() * 64;
    }

    @ObfuscatedName("mi.ax(I)I")
    public int method5962() {
        return this.field4005 == null ? -1 : this.field4010 + this.field4005.method370() * 64;
    }

    @ObfuscatedName("mi.ag(I)Lhw;")
    public class223 method5963() {
        return this.field4005 == null ? null : this.field4005.method360(this.method6087(), this.method5962());
    }

    @ObfuscatedName("mi.aq(I)I")
    public int method5964() {
        return this.field4015;
    }

    @ObfuscatedName("mi.aw(B)I")
    public int method5956() {
        return this.field4016;
    }

    @ObfuscatedName("mi.an(II)V")
    public void method5966(int arg0) {
        if (arg0 >= 1) {
            this.field4019 = arg0;
        }
    }

    @ObfuscatedName("mi.am(I)V")
    public void method6089() {
        this.field4019 = 3;
    }

    @ObfuscatedName("mi.aa(II)V")
    public void method6045(int arg0) {
        if (arg0 >= 1) {
            this.field4018 = arg0;
        }
    }

    @ObfuscatedName("mi.at(B)V")
    public void method5969() {
        this.field4018 = 50;
    }

    @ObfuscatedName("mi.as(ZI)V")
    public void method5970(boolean arg0) {
        this.field4021 = arg0;
    }

    @ObfuscatedName("mi.aj(IB)V")
    public void method5971(int arg0) {
        this.field4022 = new HashSet();
        this.field4022.add(arg0);
        this.field4045 = 0;
        this.field4024 = 0;
    }

    @ObfuscatedName("mi.ae(II)V")
    public void method5972(int arg0) {
        this.field4022 = new HashSet();
        this.field4045 = 0;
        this.field4024 = 0;
        for (int var2 = 0; var2 < Statics.field1159; var2++) {
            if (class253.method3431(var2) != null && class253.method3431(var2).field3261 == arg0) {
                this.field4022.add(class253.method3431(var2).field3242);
            }
        }
    }

    @ObfuscatedName("mi.al(I)V")
    public void method5973() {
        this.field4022 = null;
    }

    @ObfuscatedName("mi.ap(ZS)V")
    public void method5959(boolean arg0) {
        this.field4037 = !arg0;
    }

    @ObfuscatedName("mi.ad(IZB)V")
    public void method5975(int arg0, boolean arg1) {
        if (arg1) {
            this.field3990.remove(arg0);
        } else {
            this.field3990.add(arg0);
        }
        this.method5980();
    }

    @ObfuscatedName("mi.bb(IZI)V")
    public void method5976(int arg0, boolean arg1) {
        if (arg1) {
            this.field4040.remove(arg0);
        } else {
            this.field4040.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1159; var3++) {
            if (class253.method3431(var3) != null && class253.method3431(var3).field3261 == arg0) {
                int var4 = class253.method3431(var3).field3242;
                if (arg1) {
                    this.field4035.remove(var4);
                } else {
                    this.field4035.add(var4);
                }
            }
        }
        this.method5980();
    }

    @ObfuscatedName("mi.bf(S)Z")
    public boolean method5977() {
        return !this.field4037;
    }

    @ObfuscatedName("mi.bp(IB)Z")
    public boolean method5982(int arg0) {
        return !this.field3990.contains(arg0);
    }

    @ObfuscatedName("mi.bg(IB)Z")
    public boolean method5979(int arg0) {
        return !this.field4040.contains(arg0);
    }

    @ObfuscatedName("mi.bc(B)V")
    public void method5980() {
        this.field4011.clear();
        this.field4011.addAll(this.field3990);
        this.field4011.addAll(this.field4035);
    }

    @ObfuscatedName("mi.bj(IIIIIII)V")
    public void method5981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4008.method5922()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4013));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4013));
        List var9 = this.field3992.method628(this.field4009 - var7 / 2 - 1, this.field4010 - var8 / 2 - 1, var7 / 2 + this.field4009 + 1, var8 / 2 + this.field4010 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class253 var12 = class253.method3431(var11.method251());
            var13 = false;
            for (int var14 = this.field4039.length - 1; var14 >= 0; var14--) {
                if (var12.field3239[var14] != null) {
                    client.method3117(var12.field3239[var14], var12.field3251, this.field4039[var14], var11.method251(), var11.field311.method3753(), var11.field317.method3753());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("mi.bl(ILhw;I)Lhw;")
    public class223 method5955(int arg0, class223 arg1) {
        if (!this.field4008.method5922()) {
            return null;
        } else if (!this.field3992.method624()) {
            return null;
        } else if (this.field4005.method431(arg1.field2557, arg1.field2554)) {
            HashMap var3 = this.field3992.method639();
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
                        return var5.field317;
                    }
                    var8 = (class44) var7.next();
                    int var9 = var8.field317.field2557 - arg1.field2557;
                    int var10 = var8.field317.field2554 - arg1.field2554;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field317;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("mi.bn(IILhw;Lhw;B)V")
    public void method6096(int arg0, int arg1, class223 arg2, class223 arg3) {
        class72 var5 = new class72();
        class51 var6 = new class51(arg1, arg2, arg3);
        var5.method1114(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1116(10);
                break;
            case 1009:
                var5.method1116(11);
                break;
            case 1010:
                var5.method1116(12);
                break;
            case 1011:
                var5.method1116(13);
                break;
            case 1012:
                var5.method1116(14);
        }
        class86.method3119(var5);
    }

    @ObfuscatedName("mi.bo(I)Lam;")
    public class44 method5984() {
        if (!this.field4008.method5922()) {
            return null;
        } else if (this.field3992.method624()) {
            HashMap var1 = this.field3992.method639();
            this.field4004 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4004.addAll(var3);
            }
            this.field4041 = this.field4004.iterator();
            return this.method5932();
        } else {
            return null;
        }
    }

    @ObfuscatedName("mi.be(S)Lam;")
    public class44 method5932() {
        if (this.field4041 == null) {
            return null;
        }
        class44 var1;
        do {
            if (!this.field4041.hasNext()) {
                return null;
            }
            var1 = (class44) this.field4041.next();
        } while (var1.method251() == -1);
        return var1;
    }
}
