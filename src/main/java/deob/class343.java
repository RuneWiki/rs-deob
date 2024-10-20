package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ml")
public class class343 {

    @ObfuscatedName("ml.q")
    public class244 field3973;

    @ObfuscatedName("ml.z")
    public class244 field3969;

    @ObfuscatedName("ml.t")
    public class244 field3975;

    @ObfuscatedName("ml.e")
    public static final class302 field3972 = class302.field3658;

    @ObfuscatedName("ml.s")
    public static final class302 field3977 = class302.field3659;

    @ObfuscatedName("ml.p")
    public static final class302 field3978 = class302.field3664;

    @ObfuscatedName("ml.n")
    public class305 field3979;

    @ObfuscatedName("ml.u")
    public HashMap field3997;

    @ObfuscatedName("ml.h")
    public class334[] field3981;

    @ObfuscatedName("ml.g")
    public HashMap field3982;

    @ObfuscatedName("ml.i")
    public class36 field3983;

    @ObfuscatedName("ml.a")
    public class36 field3984;

    @ObfuscatedName("ml.b")
    public class36 field3985;

    @ObfuscatedName("ml.l")
    public class46 field3986;

    @ObfuscatedName("ml.r")
    public class342 field3987;

    @ObfuscatedName("ml.o")
    public int field4025;

    @ObfuscatedName("ml.c")
    public int field3989;

    @ObfuscatedName("ml.j")
    public int field3990 = -1;

    @ObfuscatedName("ml.y")
    public int field3991 = -1;

    @ObfuscatedName("ml.f")
    public float field3992;

    @ObfuscatedName("ml.ae")
    public float field4007;

    @ObfuscatedName("ml.an")
    public int field4011 = -1;

    @ObfuscatedName("ml.ai")
    public int field3995 = -1;

    @ObfuscatedName("ml.ap")
    public int field3996 = -1;

    @ObfuscatedName("ml.ab")
    public int field3993 = -1;

    @ObfuscatedName("ml.ar")
    public int field4021 = 3;

    @ObfuscatedName("ml.af")
    public int field3999 = 50;

    @ObfuscatedName("ml.at")
    public boolean field4006 = false;

    @ObfuscatedName("ml.al")
    public HashSet field4001 = null;

    @ObfuscatedName("ml.as")
    public int field4002 = -1;

    @ObfuscatedName("ml.am")
    public int field4003 = -1;

    @ObfuscatedName("ml.au")
    public int field4004 = -1;

    @ObfuscatedName("ml.ao")
    public int field4005 = -1;

    @ObfuscatedName("ml.aq")
    public int field3971 = -1;

    @ObfuscatedName("ml.av")
    public int field4023 = -1;

    @ObfuscatedName("ml.ak")
    public long field4008;

    @ObfuscatedName("ml.aa")
    public int field4009;

    @ObfuscatedName("ml.ax")
    public int field4024;

    @ObfuscatedName("ml.az")
    public boolean field3994 = true;

    @ObfuscatedName("ml.ad")
    public HashSet field3976 = new HashSet();

    @ObfuscatedName("ml.ac")
    public HashSet field4013 = new HashSet();

    @ObfuscatedName("ml.ah")
    public HashSet field4028 = new HashSet();

    @ObfuscatedName("ml.ag")
    public HashSet field3998 = new HashSet();

    @ObfuscatedName("ml.aw")
    public boolean field4016 = false;

    @ObfuscatedName("ml.bf")
    public int field4017 = 0;

    @ObfuscatedName("ml.bo")
    public final int[] field4018 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ml.bd")
    public List field4019;

    @ObfuscatedName("ml.bk")
    public Iterator field4012;

    @ObfuscatedName("ml.bu")
    public HashSet field4020 = new HashSet();

    @ObfuscatedName("ml.be")
    public class223 field4022 = null;

    @ObfuscatedName("ml.bg")
    public boolean field4014 = false;

    @ObfuscatedName("ml.bt")
    public class335 field4010;

    @ObfuscatedName("ml.bh")
    public int field4015;

    @ObfuscatedName("ml.br")
    public int field4026 = -1;

    @ObfuscatedName("ml.bq")
    public int field4027 = -1;

    @ObfuscatedName("ml.ba")
    public int field4000 = -1;

    @ObfuscatedName("ml.x(Liy;Liy;Liy;Lkx;Ljava/util/HashMap;[Lle;I)V")
    public void method5921(class244 arg0, class244 arg1, class244 arg2, class305 arg3, HashMap arg4, class334[] arg5) {
        this.field3981 = arg5;
        this.field3973 = arg0;
        this.field3969 = arg1;
        this.field3975 = arg2;
        this.field3979 = arg3;
        this.field3997 = new HashMap();
        this.field3997.put(class27.field160, arg4.get(field3972));
        this.field3997.put(class27.field152, arg4.get(field3977));
        this.field3997.put(class27.field162, arg4.get(field3978));
        this.field3987 = new class342(arg0);
        int var7 = this.field3973.method3885(class45.field340.field345);
        int[] var8 = this.field3973.method3879(var7);
        this.field3982 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class310 var10 = new class310(this.field3973.method3869(var7, var8[var9]));
            class36 var11 = new class36();
            var11.method399(var10, var8[var9]);
            this.field3982.put(var11.method377(), var11);
            if (var11.method386()) {
                this.field3983 = var11;
            }
        }
        this.method5932(this.field3983);
        this.field3985 = null;
    }

    @ObfuscatedName("ml.m(I)V")
    public void method6013() {
        class39.field290.method3168(5);
    }

    @ObfuscatedName("ml.k(IIZIIIII)V")
    public void method5923(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3987.method5908()) {
            return;
        }
        this.method5926();
        this.method5927();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3992));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3992));
        List var10 = this.field3986.method614(this.field4025 - var8 / 2 - 1, this.field3989 - var9 / 2 - 1, var8 / 2 + this.field4025 + 1, var9 / 2 + this.field3989 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class44 var13 = (class44) var12.next();
            var11.add(var13);
            class72 var14 = new class72();
            class51 var15 = new class51(var13.method264(), var13.field328, var13.field327);
            var14.method1128(new Object[] { var15, arg0, arg1 });
            if (this.field4020.contains(var13)) {
                var14.method1126(17);
            } else {
                var14.method1126(15);
            }
            class86.method1239(var14);
        }
        Iterator var16 = this.field4020.iterator();
        while (var16.hasNext()) {
            class44 var17 = (class44) var16.next();
            if (!var11.contains(var17)) {
                class72 var18 = new class72();
                class51 var19 = new class51(var17.method264(), var17.field328, var17.field327);
                var18.method1128(new Object[] { var19, arg0, arg1 });
                var18.method1126(16);
                class86.method1239(var18);
            }
        }
        this.field4020 = var11;
    }

    @ObfuscatedName("ml.d(IIZZI)V")
    public void method5924(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = Statics.method3668();
        this.method5991(arg0, arg1, arg3, var5);
        if (!this.method6108() && arg3 || arg2) {
            if (arg3) {
                this.field3971 = arg0;
                this.field4023 = arg1;
                this.field4004 = this.field4025;
                this.field4005 = this.field3989;
            }
            if (this.field4004 != -1) {
                int var7 = arg0 - this.field3971;
                int var8 = arg1 - this.field4023;
                this.method5928(this.field4004 - (int) ((float) var7 / this.field4007), this.field4005 + (int) ((float) var8 / this.field4007), false);
            }
        } else {
            this.method5929();
        }
        if (arg3) {
            this.field4008 = var5;
            this.field4009 = arg0;
            this.field4024 = arg1;
        }
    }

    @ObfuscatedName("ml.w(IIZJ)V")
    public void method5991(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3984 == null) {
            this.field4022 = null;
            return;
        }
        int var6 = (int) ((float) this.field4025 + ((float) (arg0 - this.field3996) - (float) this.method5956() * this.field3992 / 2.0F) / this.field3992);
        int var7 = (int) ((float) this.field3989 - ((float) (arg1 - this.field3993) - (float) this.method5957() * this.field3992 / 2.0F) / this.field3992);
        this.field4022 = this.field3984.method384(var6 + this.field3984.method381() * 64, var7 + this.field3984.method367() * 64);
        if (this.field4022 == null || !arg2) {
            return;
        }
        if (client.method3107() && class55.field427[82] && class55.field427[81]) {
            Statics.method118(this.field4022.field2533, this.field4022.field2530, this.field4022.field2529, false);
            return;
        }
        boolean var8 = true;
        if (this.field3994) {
            int var9 = arg0 - this.field4009;
            int var10 = arg1 - this.field4024;
            if (arg3 - this.field4008 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class197 var11 = class197.method3105(class193.field2261, client.field762.field1341);
            var11.field2339.method5279(this.field4022.method3697());
            client.field762.method2171(var11);
            this.field4008 = 0L;
        }
    }

    @ObfuscatedName("ml.v(B)V")
    public void method5926() {
        if (Statics.field223 != null) {
            this.field3992 = this.field4007;
            return;
        }
        if (this.field3992 < this.field4007) {
            this.field3992 = Math.min(this.field4007, this.field3992 / 30.0F + this.field3992);
        }
        if (this.field3992 > this.field4007) {
            this.field3992 = Math.max(this.field4007, this.field3992 - this.field3992 / 30.0F);
        }
    }

    @ObfuscatedName("ml.q(I)V")
    public void method5927() {
        if (!this.method6108()) {
            return;
        }
        int var1 = this.field3990 - this.field4025;
        int var2 = this.field3991 - this.field3989;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5928(this.field4025 + var1, this.field3989 + var2, true);
        if (this.field4025 == this.field3990 && this.field3991 == this.field3989) {
            this.field3990 = -1;
            this.field3991 = -1;
        }
    }

    @ObfuscatedName("ml.z(IIZI)V")
    public final void method5928(int arg0, int arg1, boolean arg2) {
        this.field4025 = arg0;
        this.field3989 = arg1;
        Statics.method3668();
        if (arg2) {
            this.method5929();
        }
    }

    @ObfuscatedName("ml.t(B)V")
    public final void method5929() {
        this.field4023 = -1;
        this.field3971 = -1;
        this.field4005 = -1;
        this.field4004 = -1;
    }

    @ObfuscatedName("ml.e(I)Z")
    public boolean method6108() {
        return this.field3990 != -1 && this.field3991 != -1;
    }

    @ObfuscatedName("ml.s(IIII)Las;")
    public class36 method5931(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3982.values().iterator();
        class36 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class36) var4.next();
        } while (!var5.method396(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ml.p(IIIZI)V")
    public void method6028(int arg0, int arg1, int arg2, boolean arg3) {
        class36 var5 = this.method5931(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3983;
        }
        boolean var6 = false;
        if (this.field3985 != var5 || arg3) {
            this.field3985 = var5;
            this.method5932(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method6094(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ml.n(II)V")
    public void method6006(int arg0) {
        class36 var2 = this.method5975(arg0);
        if (var2 != null) {
            this.method5932(var2);
        }
    }

    @ObfuscatedName("ml.u(I)I")
    public int method5934() {
        return this.field3984 == null ? -1 : this.field3984.method369();
    }

    @ObfuscatedName("ml.h(I)Las;")
    public class36 method6071() {
        return this.field3984;
    }

    @ObfuscatedName("ml.g(Las;B)V")
    public void method5932(class36 arg0) {
        if (this.field3984 == null || this.field3984 != arg0) {
            this.method5985(arg0);
            this.method6094(-1, -1, -1);
        }
    }

    @ObfuscatedName("ml.i(Las;I)V")
    public void method5985(class36 arg0) {
        this.field3984 = arg0;
        this.field3986 = new class46(this.field3981, this.field3997, this.field3969, this.field3975);
        this.field3987.method5907(this.field3984.method377());
    }

    @ObfuscatedName("ml.a(Las;Lhj;Lhj;ZI)V")
    public void method6092(class36 arg0, class223 arg1, class223 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3984 == null || this.field3984 != arg0) {
            this.method5985(arg0);
        }
        if (!arg3 && this.field3984.method396(arg1.field2529, arg1.field2533, arg1.field2530)) {
            this.method6094(arg1.field2529, arg1.field2533, arg1.field2530);
        } else {
            this.method6094(arg2.field2529, arg2.field2533, arg2.field2530);
        }
    }

    @ObfuscatedName("ml.o(IIIB)V")
    public void method6094(int arg0, int arg1, int arg2) {
        if (this.field3984 == null) {
            return;
        }
        int[] var4 = this.field3984.method372(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3984.method372(this.field3984.method424(), this.field3984.method385(), this.field3984.method375());
        }
        this.method5928(var4[0] - this.field3984.method381() * 64, var4[1] - this.field3984.method367() * 64, true);
        this.field3990 = -1;
        this.field3991 = -1;
        this.field3992 = this.method5945(this.field3984.method380());
        this.field4007 = this.field3992;
        this.field4019 = null;
        this.field4012 = null;
        this.field3986.method625();
    }

    @ObfuscatedName("ml.c(IIIIIB)V")
    public void method5973(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class331.method5601(var6);
        class331.method5599(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class331.method5606(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3987.method5910();
        if (var7 < 100) {
            this.method5944(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3986.method635()) {
            this.field3986.method617(this.field3973, this.field3984.method377(), client.field684);
            if (!this.field3986.method635()) {
                return;
            }
        }
        if (this.field4001 != null) {
            this.field4003++;
            if (this.field4003 % this.field3999 == 0) {
                this.field4003 = 0;
                this.field4002++;
            }
            if (this.field4002 >= this.field4021 && !this.field4006) {
                this.field4001 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3992));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3992));
        this.field3986.method612(this.field4025 - var8 / 2, this.field3989 - var9 / 2, var8 / 2 + this.field4025, var9 / 2 + this.field3989, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4016) {
            boolean var10 = false;
            if (arg4 - this.field4017 > 100) {
                this.field4017 = arg4;
                var10 = true;
            }
            this.field3986.method613(this.field4025 - var8 / 2, this.field3989 - var9 / 2, var8 / 2 + this.field4025, var9 / 2 + this.field3989, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3998, this.field4001, this.field4003, this.field3999, var10);
        }
        this.method5930(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method3107() && this.field4014 && this.field4022 != null) {
            this.field3979.method4987("Coord: " + this.field4022, class331.field3868 + 10, class331.field3863 + 20, 16776960, -1);
        }
        this.field4011 = var8;
        this.field3995 = var9;
        this.field3996 = arg0;
        this.field3993 = arg1;
        class331.method5602(var6);
    }

    @ObfuscatedName("ml.f(IIIIIII)Z")
    public boolean method5941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4010 == null) {
            return true;
        } else if (this.field4010.field3890 != arg0 || this.field4010.field3900 != arg1) {
            return true;
        } else if (this.field3986.field357 != this.field4015) {
            return true;
        } else if (client.field892 != this.field4000) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ml.ae(IIIIIIB)V")
    public void method5930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field223 == null) {
            return;
        }
        int var7 = 512 / (this.field3986.field357 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5953() - arg4 / 2 - var7;
        int var14 = this.method5949() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3986.field357 * (var7 + var13 - this.field4026);
        int var16 = arg1 - this.field3986.field357 * (var7 - (var14 - this.field4027));
        if (this.method5941(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4010 != null && this.field4010.field3890 == var11 && this.field4010.field3900 == var12) {
                Arrays.fill(this.field4010.field3897, 0);
            } else {
                this.field4010 = new class335(var11, var12);
            }
            this.field4026 = this.method5953() - arg4 / 2 - var7;
            this.field4027 = this.method5949() - arg5 / 2 - var7;
            this.field4015 = this.field3986.field357;
            Statics.field223.method4019(this.field4026, this.field4027, this.field4010, (float) this.field4015 / var10);
            this.field4000 = client.field892;
            var15 = arg0 - this.field3986.field357 * (var7 + var13 - this.field4026);
            var16 = arg1 - this.field3986.field357 * (var7 - (var14 - this.field4027));
        }
        class331.method5605(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4010.method5741(var15, var16, 192);
        } else {
            this.field4010.method5775(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ml.an(IIIIB)V")
    public void method5942(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3987.method5908()) {
            return;
        }
        if (!this.field3986.method635()) {
            this.field3986.method617(this.field3973, this.field3984.method377(), client.field684);
            if (!this.field3986.method635()) {
                return;
            }
        }
        this.field3986.method621(arg0, arg1, arg2, arg3, this.field4001, this.field4003, this.field3999);
    }

    @ObfuscatedName("ml.ai(II)V")
    public void method5943(int arg0) {
        this.field4007 = this.method5945(arg0);
    }

    @ObfuscatedName("ml.ap(IIIIII)V")
    public void method5944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class331.method5606(arg0, arg1, arg2, arg3, -16777216);
        class331.method5691(var7 - 152, var8, 304, 34, -65536);
        class331.method5606(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3979.method4990(class234.field2860, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ml.ab(II)F")
    public float method5945(int arg0) {
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

    @ObfuscatedName("ml.ar(I)I")
    public int method5946() {
        if ((double) this.field4007 == 1.0D) {
            return 25;
        } else if ((double) this.field4007 == 1.5D) {
            return 37;
        } else if ((double) this.field4007 == 2.0D) {
            return 50;
        } else if ((double) this.field4007 == 3.0D) {
            return 75;
        } else if ((double) this.field4007 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ml.af(I)V")
    public void method5947() {
        this.field3987.method5911();
    }

    @ObfuscatedName("ml.at(I)Z")
    public boolean method5948() {
        return this.field3987.method5908();
    }

    @ObfuscatedName("ml.as(II)Las;")
    public class36 method5975(int arg0) {
        Iterator var2 = this.field3982.values().iterator();
        class36 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class36) var2.next();
        } while (var3.method369() != arg0);
        return var3;
    }

    @ObfuscatedName("ml.am(III)V")
    public void method5978(int arg0, int arg1) {
        if (this.field3984 != null && this.field3984.method371(arg0, arg1)) {
            this.field3990 = arg0 - this.field3984.method381() * 64;
            this.field3991 = arg1 - this.field3984.method367() * 64;
        }
    }

    @ObfuscatedName("ml.au(IIB)V")
    public void method5999(int arg0, int arg1) {
        if (this.field3984 != null) {
            this.method5928(arg0 - this.field3984.method381() * 64, arg1 - this.field3984.method367() * 64, true);
            this.field3990 = -1;
            this.field3991 = -1;
        }
    }

    @ObfuscatedName("ml.ao(IIII)V")
    public void method5951(int arg0, int arg1, int arg2) {
        if (this.field3984 != null) {
            int[] var4 = this.field3984.method372(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5978(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ml.aq(IIIB)V")
    public void method5952(int arg0, int arg1, int arg2) {
        if (this.field3984 != null) {
            int[] var4 = this.field3984.method372(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5999(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ml.av(B)I")
    public int method5953() {
        return this.field3984 == null ? -1 : this.field4025 + this.field3984.method381() * 64;
    }

    @ObfuscatedName("ml.ak(I)I")
    public int method5949() {
        return this.field3984 == null ? -1 : this.field3989 + this.field3984.method367() * 64;
    }

    @ObfuscatedName("ml.aa(B)Lhj;")
    public class223 method5955() {
        return this.field3984 == null ? null : this.field3984.method384(this.method5953(), this.method5949());
    }

    @ObfuscatedName("ml.ax(B)I")
    public int method5956() {
        return this.field4011;
    }

    @ObfuscatedName("ml.az(I)I")
    public int method5957() {
        return this.field3995;
    }

    @ObfuscatedName("ml.aj(IB)V")
    public void method5958(int arg0) {
        if (arg0 >= 1) {
            this.field4021 = arg0;
        }
    }

    @ObfuscatedName("ml.ay(I)V")
    public void method5939() {
        this.field4021 = 3;
    }

    @ObfuscatedName("ml.ad(II)V")
    public void method6123(int arg0) {
        if (arg0 >= 1) {
            this.field3999 = arg0;
        }
    }

    @ObfuscatedName("ml.ac(I)V")
    public void method5961() {
        this.field3999 = 50;
    }

    @ObfuscatedName("ml.ah(ZI)V")
    public void method5962(boolean arg0) {
        this.field4006 = arg0;
    }

    @ObfuscatedName("ml.ag(II)V")
    public void method5963(int arg0) {
        this.field4001 = new HashSet();
        this.field4001.add(arg0);
        this.field4002 = 0;
        this.field4003 = 0;
    }

    @ObfuscatedName("ml.aw(II)V")
    public void method5964(int arg0) {
        this.field4001 = new HashSet();
        this.field4002 = 0;
        this.field4003 = 0;
        for (int var2 = 0; var2 < Statics.field3553; var2++) {
            if (class252.method249(var2) != null && class252.method249(var2).field3214 == arg0) {
                this.field4001.add(class252.method249(var2).field3213);
            }
        }
    }

    @ObfuscatedName("ml.bf(I)V")
    public void method5959() {
        this.field4001 = null;
    }

    @ObfuscatedName("ml.bc(ZI)V")
    public void method5936(boolean arg0) {
        this.field4016 = !arg0;
    }

    @ObfuscatedName("ml.bo(IZI)V")
    public void method6032(int arg0, boolean arg1) {
        if (arg1) {
            this.field3976.remove(arg0);
        } else {
            this.field3976.add(arg0);
        }
        this.method6015();
    }

    @ObfuscatedName("ml.bd(IZI)V")
    public void method5965(int arg0, boolean arg1) {
        if (arg1) {
            this.field4013.remove(arg0);
        } else {
            this.field4013.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3553; var3++) {
            if (class252.method249(var3) != null && class252.method249(var3).field3214 == arg0) {
                int var4 = class252.method249(var3).field3213;
                if (arg1) {
                    this.field4028.remove(var4);
                } else {
                    this.field4028.add(var4);
                }
            }
        }
        this.method6015();
    }

    @ObfuscatedName("ml.bk(I)Z")
    public boolean method6004() {
        return !this.field4016;
    }

    @ObfuscatedName("ml.bu(II)Z")
    public boolean method5970(int arg0) {
        return !this.field3976.contains(arg0);
    }

    @ObfuscatedName("ml.be(IS)Z")
    public boolean method5971(int arg0) {
        return !this.field4013.contains(arg0);
    }

    @ObfuscatedName("ml.bg(I)V")
    public void method6015() {
        this.field3998.clear();
        this.field3998.addAll(this.field3976);
        this.field3998.addAll(this.field4028);
    }

    @ObfuscatedName("ml.bt(IIIIIIB)V")
    public void method5967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3987.method5908()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3992));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3992));
        List var9 = this.field3986.method614(this.field4025 - var7 / 2 - 1, this.field3989 - var8 / 2 - 1, var7 / 2 + this.field4025 + 1, var8 / 2 + this.field3989 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class252 var12 = class252.method249(var11.method264());
            var13 = false;
            for (int var14 = this.field4018.length - 1; var14 >= 0; var14--) {
                if (var12.field3210[var14] != null) {
                    client.method4739(var12.field3210[var14], var12.field3228, this.field4018[var14], var11.method264(), var11.field328.method3697(), var11.field327.method3697());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ml.bh(ILhj;B)Lhj;")
    public class223 method5974(int arg0, class223 arg1) {
        if (!this.field3987.method5908()) {
            return null;
        } else if (!this.field3986.method635()) {
            return null;
        } else if (this.field3984.method371(arg1.field2533, arg1.field2530)) {
            HashMap var3 = this.field3986.method611();
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
                        return var5.field327;
                    }
                    var8 = (class44) var7.next();
                    int var9 = var8.field327.field2533 - arg1.field2533;
                    int var10 = var8.field327.field2530 - arg1.field2530;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field327;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ml.br(IILhj;Lhj;B)V")
    public void method6009(int arg0, int arg1, class223 arg2, class223 arg3) {
        class72 var5 = new class72();
        class51 var6 = new class51(arg1, arg2, arg3);
        var5.method1128(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1126(10);
                break;
            case 1009:
                var5.method1126(11);
                break;
            case 1010:
                var5.method1126(12);
                break;
            case 1011:
                var5.method1126(13);
                break;
            case 1012:
                var5.method1126(14);
        }
        class86.method1239(var5);
    }

    @ObfuscatedName("ml.bq(I)Lax;")
    public class44 method5976() {
        if (!this.field3987.method5908()) {
            return null;
        } else if (this.field3986.method635()) {
            HashMap var1 = this.field3986.method611();
            this.field4019 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4019.addAll(var3);
            }
            this.field4012 = this.field4019.iterator();
            return this.method5977();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ml.ba(I)Lax;")
    public class44 method5977() {
        if (this.field4012 == null) {
            return null;
        }
        class44 var1;
        do {
            if (!this.field4012.hasNext()) {
                return null;
            }
            var1 = (class44) this.field4012.next();
        } while (var1.method264() == -1);
        return var1;
    }
}
