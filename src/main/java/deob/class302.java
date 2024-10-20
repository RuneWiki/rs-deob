package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ka")
public class class302 {

    @ObfuscatedName("ka.t")
    public class247 field3886;

    @ObfuscatedName("ka.f")
    public static final class273 field3925 = class273.field3689;

    @ObfuscatedName("ka.g")
    public static final class273 field3888 = class273.field3698;

    @ObfuscatedName("ka.j")
    public static final class273 field3889 = class273.field3693;

    @ObfuscatedName("ka.x")
    public class275 field3927;

    @ObfuscatedName("ka.c")
    public HashMap field3883;

    @ObfuscatedName("ka.s")
    public class298[] field3892;

    @ObfuscatedName("ka.n")
    public HashMap field3899;

    @ObfuscatedName("ka.y")
    public class33 field3894;

    @ObfuscatedName("ka.o")
    public class33 field3885;

    @ObfuscatedName("ka.r")
    public class33 field3903;

    @ObfuscatedName("ka.i")
    public class42 field3900;

    @ObfuscatedName("ka.l")
    public class301 field3898;

    @ObfuscatedName("ka.m")
    public int field3922;

    @ObfuscatedName("ka.q")
    public int field3887;

    @ObfuscatedName("ka.b")
    public int field3901 = -1;

    @ObfuscatedName("ka.h")
    public int field3902 = -1;

    @ObfuscatedName("ka.d")
    public float field3913;

    @ObfuscatedName("ka.v")
    public float field3904;

    @ObfuscatedName("ka.p")
    public int field3895 = -1;

    @ObfuscatedName("ka.ab")
    public int field3906 = -1;

    @ObfuscatedName("ka.ad")
    public int field3926 = -1;

    @ObfuscatedName("ka.ag")
    public int field3908 = -1;

    @ObfuscatedName("ka.ak")
    public int field3909 = 3;

    @ObfuscatedName("ka.as")
    public int field3910 = 50;

    @ObfuscatedName("ka.aq")
    public boolean field3911 = false;

    @ObfuscatedName("ka.ax")
    public HashSet field3912 = null;

    @ObfuscatedName("ka.at")
    public int field3905 = -1;

    @ObfuscatedName("ka.ap")
    public int field3914 = -1;

    @ObfuscatedName("ka.an")
    public int field3915 = -1;

    @ObfuscatedName("ka.ac")
    public int field3916 = -1;

    @ObfuscatedName("ka.aw")
    public HashSet field3917 = new HashSet();

    @ObfuscatedName("ka.al")
    public HashSet field3918 = new HashSet();

    @ObfuscatedName("ka.ay")
    public HashSet field3919 = new HashSet();

    @ObfuscatedName("ka.ai")
    public HashSet field3920 = new HashSet();

    @ObfuscatedName("ka.af")
    public boolean field3921 = false;

    @ObfuscatedName("ka.ah")
    public int field3881 = 0;

    @ObfuscatedName("ka.av")
    public final int[] field3897 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ka.ae")
    public List field3924;

    @ObfuscatedName("ka.am")
    public Iterator field3880;

    @ObfuscatedName("ka.aa")
    public HashSet field3893 = new HashSet();

    @ObfuscatedName("ka.aj")
    public class224 field3907 = null;

    @ObfuscatedName("ka.a(Lib;Ljm;Ljava/util/HashMap;[Lkg;I)V")
    public void method4947(class247 arg0, class275 arg1, HashMap arg2, class298[] arg3) {
        this.field3892 = arg3;
        this.field3886 = arg0;
        this.field3927 = arg1;
        this.field3883 = new HashMap();
        this.field3883.put(class25.field336, arg2.get(field3925));
        this.field3883.put(class25.field334, arg2.get(field3888));
        this.field3883.put(class25.field335, arg2.get(field3889));
        this.field3898 = new class301(arg0);
        int var5 = this.field3886.method3962(class41.field511.field515);
        int[] var6 = this.field3886.method3983(var5);
        this.field3899 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3886.method3897(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method280(var8, var6[var7]);
            this.field3899.put(var9.method294(), var9);
            if (var9.method301()) {
                this.field3894 = var9;
            }
        }
        this.method4960(this.field3894);
        this.field3903 = null;
    }

    @ObfuscatedName("ka.w(I)I")
    public int method5028() {
        return this.field3886.method3920(this.field3894.method294(), class41.field512.field515) ? 100 : this.field3886.method3919(this.field3894.method294());
    }

    @ObfuscatedName("ka.e(IIZIIIII)V")
    public void method4949(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3898.method4944()) {
            return;
        }
        this.method4952();
        this.method5122();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3913));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3913));
        List var10 = this.field3900.method500(this.field3922 - var8 / 2 - 1, this.field3887 - var9 / 2 - 1, var8 / 2 + this.field3922 + 1, var9 / 2 + this.field3887 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class48 var15 = new class48(var13.field500, var13.field505, var13.field499);
            var14.method951(new Object[] { var15, arg0, arg1 });
            if (this.field3893.contains(var13)) {
                var14.method952(class231.field2897);
            } else {
                var14.method952(class231.field2902);
            }
            class83.method2139(var14);
        }
        Iterator var16 = this.field3893.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class48 var19 = new class48(var17.field500, var17.field505, var17.field499);
                var18.method951(new Object[] { var19, arg0, arg1 });
                var18.method952(class231.field2903);
                class83.method2139(var18);
            }
        }
        this.field3893 = var11;
    }

    @ObfuscatedName("ka.k(IIZZI)V")
    public void method4950(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method4979(arg0, arg1, arg3);
        if (this.field3915 == -1) {
            this.field3915 = arg0;
        }
        if (this.field3916 == -1) {
            this.field3916 = arg1;
        }
        int var5 = arg0 - this.field3915;
        int var6 = arg1 - this.field3916;
        this.field3915 = arg0;
        this.field3916 = arg1;
        if (arg2 && !this.method4954()) {
            this.field3922 -= (int) ((float) var5 / this.field3904);
            this.field3887 += (int) ((float) var6 / this.field3904);
        }
    }

    @ObfuscatedName("ka.u(IIZI)V")
    public void method4979(int arg0, int arg1, boolean arg2) {
        if (!client.method942()) {
            return;
        }
        if (this.field3885 == null) {
            this.field3907 = null;
            return;
        }
        int var4 = (int) ((float) this.field3922 + ((float) (arg0 - this.field3926) - (float) this.method4980() * this.field3913 / 2.0F) / this.field3913);
        int var5 = (int) ((float) this.field3887 - ((float) (arg1 - this.field3908) - (float) this.method4981() * this.field3913 / 2.0F) / this.field3913);
        this.field3907 = this.field3885.method253(var4 + this.field3885.method304() * 64, var5 + this.field3885.method250() * 64);
        if (this.field3907 != null && arg2 && class51.field594[82] && class51.field594[81] && arg2) {
            client.method4496(this.field3907.field2725, this.field3907.field2726, this.field3907.field2728);
        }
    }

    @ObfuscatedName("ka.z(I)V")
    public void method4952() {
        if (this.field3913 < this.field3904) {
            this.field3913 = Math.min(this.field3904, this.field3913 / 30.0F + this.field3913);
        }
        if (this.field3913 > this.field3904) {
            this.field3913 = Math.max(this.field3904, this.field3913 - this.field3913 / 30.0F);
        }
    }

    @ObfuscatedName("ka.t(I)V")
    public void method5122() {
        if (!this.method4954()) {
            return;
        }
        int var1 = this.field3901 - this.field3922;
        int var2 = this.field3902 - this.field3887;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3922 += var1;
        this.field3887 += var2;
        if (this.field3922 == this.field3901 && this.field3902 == this.field3887) {
            this.field3901 = -1;
            this.field3902 = -1;
        }
    }

    @ObfuscatedName("ka.f(I)Z")
    public boolean method4954() {
        return this.field3901 != -1 && this.field3902 != -1;
    }

    @ObfuscatedName("ka.g(IIII)Lax;")
    public class33 method4955(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3899.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method237(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ka.x(IIIZB)V")
    public void method4956(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4955(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3894;
        }
        boolean var6 = false;
        if (this.field3903 != var5 || arg3) {
            this.field3903 = var5;
            this.method4960(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4963(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ka.c(IB)V")
    public void method4957(int arg0) {
        class33 var2 = this.method4972(arg0);
        if (var2 != null) {
            this.method4960(var2);
        }
    }

    @ObfuscatedName("ka.n(I)I")
    public int method4958() {
        return this.field3885 == null ? -1 : this.field3885.method246();
    }

    @ObfuscatedName("ka.y(I)Lax;")
    public class33 method5127() {
        return this.field3885;
    }

    @ObfuscatedName("ka.o(Lax;I)V")
    public void method4960(class33 arg0) {
        if (this.field3885 == null || this.field3885 != arg0) {
            this.method5078(arg0);
            this.method4963(-1, -1, -1);
        }
    }

    @ObfuscatedName("ka.r(Lax;B)V")
    public void method5078(class33 arg0) {
        this.field3885 = arg0;
        this.field3900 = new class42(this.field3892, this.field3883);
        this.field3898.method4939(this.field3885.method294());
    }

    @ObfuscatedName("ka.i(Lax;Lhc;Lhc;ZB)V")
    public void method4962(class33 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3885 == null || this.field3885 != arg0) {
            this.method5078(arg0);
        }
        if (!arg3 && this.field3885.method237(arg1.field2728, arg1.field2725, arg1.field2726)) {
            this.method4963(arg1.field2728, arg1.field2725, arg1.field2726);
        } else {
            this.method4963(arg2.field2728, arg2.field2725, arg2.field2726);
        }
    }

    @ObfuscatedName("ka.q(IIII)V")
    public void method4963(int arg0, int arg1, int arg2) {
        if (this.field3885 == null) {
            return;
        }
        int[] var4 = this.field3885.method239(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3885.method239(this.field3885.method299(), this.field3885.method252(), this.field3885.method258());
        }
        this.field3922 = var4[0] - this.field3885.method304() * 64;
        this.field3887 = var4[1] - this.field3885.method250() * 64;
        this.field3901 = -1;
        this.field3902 = -1;
        this.field3913 = this.method4968(this.field3885.method247());
        this.field3904 = this.field3913;
        this.field3924 = null;
        this.field3880 = null;
        this.field3900.method495();
    }

    @ObfuscatedName("ka.b(IIIIII)V")
    public void method5062(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class295.method4701(var6);
        class295.method4699(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class295.method4707(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3898.method4936();
        if (var7 < 100) {
            this.method5072(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3900.method514()) {
            this.field3900.method494(this.field3886, this.field3885.method294(), client.field850);
            if (!this.field3900.method514()) {
                return;
            }
        }
        if (this.field3912 != null) {
            this.field3914++;
            if (this.field3914 % this.field3910 == 0) {
                this.field3914 = 0;
                this.field3905++;
            }
            if (this.field3905 >= this.field3909 && !this.field3911) {
                this.field3912 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3913));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3913));
        this.field3900.method496(this.field3922 - var8 / 2, this.field3887 - var9 / 2, var8 / 2 + this.field3922, var9 / 2 + this.field3887, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3921) {
            boolean var10 = false;
            if (arg4 - this.field3881 > 100) {
                this.field3881 = arg4;
                var10 = true;
            }
            this.field3900.method497(this.field3922 - var8 / 2, this.field3887 - var9 / 2, var8 / 2 + this.field3922, var9 / 2 + this.field3887, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3920, this.field3912, this.field3914, this.field3910, var10);
        }
        if (client.method942() && this.field3907 != null) {
            this.field3927.method4514("Coord: " + this.field3907, class295.field3832 + 10, class295.field3830 + 20, 16776960, -1);
        }
        this.field3895 = var8;
        this.field3906 = var9;
        this.field3926 = arg0;
        this.field3908 = arg1;
        class295.method4702(var6);
    }

    @ObfuscatedName("ka.h(IIIIS)V")
    public void method4965(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3898.method4944()) {
            return;
        }
        if (!this.field3900.method514()) {
            this.field3900.method494(this.field3886, this.field3885.method294(), client.field850);
            if (!this.field3900.method514()) {
                return;
            }
        }
        this.field3900.method499(arg0, arg1, arg2, arg3, this.field3912, this.field3914, this.field3910);
    }

    @ObfuscatedName("ka.d(II)V")
    public void method4966(int arg0) {
        this.field3904 = this.method4968(arg0);
    }

    @ObfuscatedName("ka.v(IIIIII)V")
    public void method5072(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class295.method4707(arg0, arg1, arg2, arg3, -16777216);
        class295.method4706(var7 - 152, var8, 304, 34, -65536);
        class295.method4707(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3927.method4507(class237.field3203, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ka.p(IB)F")
    public float method4968(int arg0) {
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

    @ObfuscatedName("ka.ab(I)I")
    public int method4969() {
        if ((double) this.field3904 == 1.0D) {
            return 25;
        } else if ((double) this.field3904 == 1.5D) {
            return 37;
        } else if ((double) this.field3904 == 2.0D) {
            return 50;
        } else if ((double) this.field3904 == 3.0D) {
            return 75;
        } else if ((double) this.field3904 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ka.ad(S)V")
    public void method4953() {
        this.field3898.method4935();
    }

    @ObfuscatedName("ka.ag(I)Z")
    public boolean method4971() {
        return this.field3898.method4944();
    }

    @ObfuscatedName("ka.ak(IB)Lax;")
    public class33 method4972(int arg0) {
        Iterator var2 = this.field3899.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method246() != arg0);
        return var3;
    }

    @ObfuscatedName("ka.as(III)V")
    public void method4973(int arg0, int arg1) {
        if (this.field3885 != null && this.field3885.method238(arg0, arg1)) {
            this.field3901 = arg0 - this.field3885.method304() * 64;
            this.field3902 = arg1 - this.field3885.method250() * 64;
        }
    }

    @ObfuscatedName("ka.aq(III)V")
    public void method4974(int arg0, int arg1) {
        if (this.field3885 != null) {
            this.field3922 = arg0 - this.field3885.method304() * 64;
            this.field3887 = arg1 - this.field3885.method250() * 64;
            this.field3901 = -1;
            this.field3902 = -1;
        }
    }

    @ObfuscatedName("ka.ax(IIII)V")
    public void method4975(int arg0, int arg1, int arg2) {
        if (this.field3885 != null) {
            int[] var4 = this.field3885.method239(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4973(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ka.at(IIII)V")
    public void method4976(int arg0, int arg1, int arg2) {
        if (this.field3885 != null) {
            int[] var4 = this.field3885.method239(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4974(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ka.ap(B)I")
    public int method4977() {
        return this.field3885 == null ? -1 : this.field3922 + this.field3885.method304() * 64;
    }

    @ObfuscatedName("ka.an(I)I")
    public int method4978() {
        return this.field3885 == null ? -1 : this.field3887 + this.field3885.method250() * 64;
    }

    @ObfuscatedName("ka.ac(I)Lhc;")
    public class224 method5038() {
        return this.field3885 == null ? null : this.field3885.method253(this.method4977(), this.method4978());
    }

    @ObfuscatedName("ka.aw(S)I")
    public int method4980() {
        return this.field3895;
    }

    @ObfuscatedName("ka.al(B)I")
    public int method4981() {
        return this.field3906;
    }

    @ObfuscatedName("ka.ay(IB)V")
    public void method5085(int arg0) {
        if (arg0 >= 1) {
            this.field3909 = arg0;
        }
    }

    @ObfuscatedName("ka.ai(I)V")
    public void method4982() {
        this.field3909 = 3;
    }

    @ObfuscatedName("ka.af(II)V")
    public void method5131(int arg0) {
        if (arg0 >= 1) {
            this.field3910 = arg0;
        }
    }

    @ObfuscatedName("ka.ah(I)V")
    public void method4964() {
        this.field3910 = 50;
    }

    @ObfuscatedName("ka.az(ZB)V")
    public void method4986(boolean arg0) {
        this.field3911 = arg0;
    }

    @ObfuscatedName("ka.av(II)V")
    public void method4987(int arg0) {
        this.field3912 = new HashSet();
        this.field3912.add(arg0);
        this.field3905 = 0;
        this.field3914 = 0;
    }

    @ObfuscatedName("ka.ae(IB)V")
    public void method5110(int arg0) {
        this.field3912 = new HashSet();
        this.field3905 = 0;
        this.field3914 = 0;
        for (int var2 = 0; var2 < Statics.field3379.length; var2++) {
            if (Statics.field3379[var2] != null && Statics.field3379[var2].field3399 == arg0) {
                this.field3912.add(Statics.field3379[var2].field3396);
            }
        }
    }

    @ObfuscatedName("ka.am(B)V")
    public void method4985() {
        this.field3912 = null;
    }

    @ObfuscatedName("ka.aa(ZI)V")
    public void method4990(boolean arg0) {
        this.field3921 = !arg0;
    }

    @ObfuscatedName("ka.aj(IZI)V")
    public void method4991(int arg0, boolean arg1) {
        if (arg1) {
            this.field3917.remove(arg0);
        } else {
            this.field3917.add(arg0);
        }
        this.method4996();
    }

    @ObfuscatedName("ka.ao(IZI)V")
    public void method4959(int arg0, boolean arg1) {
        if (arg1) {
            this.field3918.remove(arg0);
        } else {
            this.field3918.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3379.length; var3++) {
            if (Statics.field3379[var3] != null && Statics.field3379[var3].field3399 == arg0) {
                int var4 = Statics.field3379[var3].field3396;
                if (arg1) {
                    this.field3919.remove(var4);
                } else {
                    this.field3919.add(var4);
                }
            }
        }
        this.method4996();
    }

    @ObfuscatedName("ka.ar(I)Z")
    public boolean method4993() {
        return !this.field3921;
    }

    @ObfuscatedName("ka.au(IB)Z")
    public boolean method4988(int arg0) {
        return !this.field3917.contains(arg0);
    }

    @ObfuscatedName("ka.bb(II)Z")
    public boolean method4995(int arg0) {
        return !this.field3918.contains(arg0);
    }

    @ObfuscatedName("ka.bc(I)V")
    public void method4996() {
        this.field3920.clear();
        this.field3920.addAll(this.field3917);
        this.field3920.addAll(this.field3919);
    }

    @ObfuscatedName("ka.bp(IIIIIII)V")
    public void method5049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3898.method4944()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3913));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3913));
        List var9 = this.field3900.method500(this.field3922 - var7 / 2 - 1, this.field3887 - var8 / 2 - 1, var7 / 2 + this.field3922 + 1, var8 / 2 + this.field3887 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class40 var11 = (class40) var10.next();
            class254 var12 = Statics.field3379[var11.field500];
            var13 = false;
            for (int var14 = this.field3897.length - 1; var14 >= 0; var14--) {
                if (var12.field3388[var14] != null) {
                    client.method466(var12.field3388[var14], var12.field3391, this.field3897[var14], var11.field500, var11.field505.method3742(), var11.field499.method3742());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ka.bn(ILhc;I)Lhc;")
    public class224 method4989(int arg0, class224 arg1) {
        if (!this.field3898.method4944()) {
            return null;
        } else if (!this.field3900.method514()) {
            return null;
        } else if (this.field3885.method238(arg1.field2725, arg1.field2726)) {
            HashMap var3 = this.field3900.method503();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class40 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class40 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field499;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field499.field2725 - arg1.field2725;
                    int var10 = var8.field499.field2726 - arg1.field2726;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field499;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ka.bg(IILhc;Lhc;I)V")
    public void method4999(int arg0, int arg1, class224 arg2, class224 arg3) {
        class69 var5 = new class69();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method951(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method952(class231.field2901);
                break;
            case 1009:
                var5.method952(class231.field2898);
                break;
            case 1010:
                var5.method952(class231.field2907);
                break;
            case 1011:
                var5.method952(class231.field2900);
                break;
            case 1012:
                var5.method952(class231.field2904);
        }
        class83.method2139(var5);
    }

    @ObfuscatedName("ka.bq(I)Lay;")
    public class40 method5000() {
        if (!this.field3898.method4944()) {
            return null;
        } else if (this.field3900.method514()) {
            HashMap var1 = this.field3900.method503();
            this.field3924 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3924.addAll(var3);
            }
            this.field3880 = this.field3924.iterator();
            return this.method5001();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ka.be(I)Lay;")
    public class40 method5001() {
        if (this.field3880 == null) {
            return null;
        } else if (this.field3880.hasNext()) {
            return (class40) this.field3880.next();
        } else {
            return null;
        }
    }
}
