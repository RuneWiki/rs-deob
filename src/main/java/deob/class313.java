package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("li")
public class class313 {

    @ObfuscatedName("li.t")
    public class247 field3912;

    @ObfuscatedName("li.r")
    public static final class285 field3915 = class285.field3724;

    @ObfuscatedName("li.m")
    public static final class285 field3916 = class285.field3734;

    @ObfuscatedName("li.h")
    public static final class285 field3917 = class285.field3735;

    @ObfuscatedName("li.o")
    public class287 field3918;

    @ObfuscatedName("li.x")
    public HashMap field3939;

    @ObfuscatedName("li.q")
    public class309[] field3920;

    @ObfuscatedName("li.v")
    public HashMap field3921;

    @ObfuscatedName("li.n")
    public class33 field3911;

    @ObfuscatedName("li.y")
    public class33 field3938;

    @ObfuscatedName("li.d")
    public class33 field3924;

    @ObfuscatedName("li.l")
    public class42 field3925;

    @ObfuscatedName("li.f")
    public class312 field3926;

    @ObfuscatedName("li.k")
    public int field3927;

    @ObfuscatedName("li.e")
    public int field3940;

    @ObfuscatedName("li.u")
    public int field3935 = -1;

    @ObfuscatedName("li.g")
    public int field3930 = -1;

    @ObfuscatedName("li.z")
    public float field3931;

    @ObfuscatedName("li.b")
    public float field3932;

    @ObfuscatedName("li.c")
    public int field3933 = -1;

    @ObfuscatedName("li.aa")
    public int field3934 = -1;

    @ObfuscatedName("li.ap")
    public int field3928 = -1;

    @ObfuscatedName("li.ao")
    public int field3936 = -1;

    @ObfuscatedName("li.ar")
    public int field3937 = 3;

    @ObfuscatedName("li.ay")
    public int field3922 = 50;

    @ObfuscatedName("li.ax")
    public boolean field3914 = false;

    @ObfuscatedName("li.ae")
    public HashSet field3953 = null;

    @ObfuscatedName("li.ah")
    public int field3941 = -1;

    @ObfuscatedName("li.ai")
    public int field3942 = -1;

    @ObfuscatedName("li.au")
    public int field3943 = -1;

    @ObfuscatedName("li.am")
    public int field3944 = -1;

    @ObfuscatedName("li.af")
    public HashSet field3945 = new HashSet();

    @ObfuscatedName("li.an")
    public HashSet field3946 = new HashSet();

    @ObfuscatedName("li.ag")
    public HashSet field3910 = new HashSet();

    @ObfuscatedName("li.av")
    public HashSet field3948 = new HashSet();

    @ObfuscatedName("li.aw")
    public boolean field3949 = false;

    @ObfuscatedName("li.ad")
    public int field3950 = 0;

    @ObfuscatedName("li.aq")
    public final int[] field3951 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("li.ac")
    public List field3952;

    @ObfuscatedName("li.ak")
    public Iterator field3954;

    @ObfuscatedName("li.az")
    public HashSet field3923 = new HashSet();

    @ObfuscatedName("li.as")
    public class224 field3955 = null;

    @ObfuscatedName("li.p(Lik;Lkz;Ljava/util/HashMap;[Lkh;B)V")
    public void method5412(class247 arg0, class287 arg1, HashMap arg2, class309[] arg3) {
        this.field3920 = arg3;
        this.field3912 = arg0;
        this.field3918 = arg1;
        this.field3939 = new HashMap();
        this.field3939.put(class25.field344, arg2.get(field3915));
        this.field3939.put(class25.field337, arg2.get(field3916));
        this.field3939.put(class25.field341, arg2.get(field3917));
        this.field3926 = new class312(arg0);
        int var5 = this.field3912.method4117(class41.field509.field510);
        int[] var6 = this.field3912.method4043(var5);
        this.field3921 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3912.method4032(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method313(var8, var6[var7]);
            this.field3921.put(var9.method268(), var9);
            if (var9.method293()) {
                this.field3911 = var9;
            }
        }
        this.method5398(this.field3911);
        this.field3924 = null;
    }

    @ObfuscatedName("li.i(B)I")
    public int method5249() {
        return this.field3912.method4053(this.field3911.method268(), class41.field513.field510) ? 100 : this.field3912.method4056(this.field3911.method268());
    }

    @ObfuscatedName("li.w(IIZIIIII)V")
    public void method5250(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3926.method5234()) {
            return;
        }
        this.method5303();
        this.method5254();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3931));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3931));
        List var10 = this.field3925.method506(this.field3927 - var8 / 2 - 1, this.field3940 - var9 / 2 - 1, var8 / 2 + this.field3927 + 1, var9 / 2 + this.field3940 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class68 var14 = new class68();
            class48 var15 = new class48(var13.field496, var13.field501, var13.field497);
            var14.method985(new Object[] { var15, arg0, arg1 });
            if (this.field3923.contains(var13)) {
                var14.method986(class231.field2884);
            } else {
                var14.method986(class231.field2882);
            }
            class81.method1724(var14);
        }
        Iterator var16 = this.field3923.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class68 var18 = new class68();
                class48 var19 = new class48(var17.field496, var17.field501, var17.field497);
                var18.method985(new Object[] { var19, arg0, arg1 });
                var18.method986(class231.field2883);
                class81.method1724(var18);
            }
        }
        this.field3923 = var11;
    }

    @ObfuscatedName("li.s(IIZZI)V")
    public void method5251(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method5286(arg0, arg1, arg3);
        if (this.field3943 == -1) {
            this.field3943 = arg0;
        }
        if (this.field3944 == -1) {
            this.field3944 = arg1;
        }
        int var5 = arg0 - this.field3943;
        int var6 = arg1 - this.field3944;
        this.field3943 = arg0;
        this.field3944 = arg1;
        if (arg2 && !this.method5255()) {
            this.field3927 -= (int) ((float) var5 / this.field3932);
            this.field3940 += (int) ((float) var6 / this.field3932);
        }
    }

    @ObfuscatedName("li.j(IIZI)V")
    public void method5286(int arg0, int arg1, boolean arg2) {
        if (!client.method2883()) {
            return;
        }
        if (this.field3938 == null) {
            this.field3955 = null;
            return;
        }
        int var4 = (int) ((float) this.field3927 + ((float) (arg0 - this.field3928) - (float) this.method5281() * this.field3931 / 2.0F) / this.field3931);
        int var5 = (int) ((float) this.field3940 - ((float) (arg1 - this.field3936) - (float) this.method5274() * this.field3931 / 2.0F) / this.field3931);
        this.field3955 = this.field3938.method264(var4 + this.field3938.method327() * 64, var5 + this.field3938.method274() * 64);
        if (this.field3955 == null || !arg2 || !class51.field586[82] || !class51.field586[81] || !arg2) {
            return;
        }
        int var6 = this.field3955.field2697;
        int var7 = this.field3955.field2698;
        int var8 = this.field3955.field2700;
        class175 var9 = class175.method470(class172.field2376, client.field868.field1440);
        var9.field2403.method3107(var8);
        var9.field2403.method3157(var6);
        var9.field2403.method3250(var7);
        client.field868.method1879(var9);
    }

    @ObfuscatedName("li.a(B)V")
    public void method5303() {
        if (this.field3931 < this.field3932) {
            this.field3931 = Math.min(this.field3932, this.field3931 / 30.0F + this.field3931);
        }
        if (this.field3931 > this.field3932) {
            this.field3931 = Math.max(this.field3932, this.field3931 - this.field3931 / 30.0F);
        }
    }

    @ObfuscatedName("li.t(I)V")
    public void method5254() {
        if (!this.method5255()) {
            return;
        }
        int var1 = this.field3935 - this.field3927;
        int var2 = this.field3930 - this.field3940;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3927 += var1;
        this.field3940 += var2;
        if (this.field3935 == this.field3927 && this.field3940 == this.field3930) {
            this.field3935 = -1;
            this.field3930 = -1;
        }
    }

    @ObfuscatedName("li.r(I)Z")
    public boolean method5255() {
        return this.field3935 != -1 && this.field3930 != -1;
    }

    @ObfuscatedName("li.m(IIIB)Lae;")
    public class33 method5423(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3921.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method261(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("li.h(IIIZB)V")
    public void method5257(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5423(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3911;
        }
        boolean var6 = false;
        if (this.field3924 != var5 || arg3) {
            this.field3924 = var5;
            this.method5398(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5264(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("li.o(IB)V")
    public void method5258(int arg0) {
        class33 var2 = this.method5273(arg0);
        if (var2 != null) {
            this.method5398(var2);
        }
    }

    @ObfuscatedName("li.x(I)I")
    public int method5259() {
        return this.field3938 == null ? -1 : this.field3938.method266();
    }

    @ObfuscatedName("li.q(I)Lae;")
    public class33 method5260() {
        return this.field3938;
    }

    @ObfuscatedName("li.d(Lae;I)V")
    public void method5398(class33 arg0) {
        if (this.field3938 == null || this.field3938 != arg0) {
            this.method5378(arg0);
            this.method5264(-1, -1, -1);
        }
    }

    @ObfuscatedName("li.l(Lae;I)V")
    public void method5378(class33 arg0) {
        this.field3938 = arg0;
        this.field3925 = new class42(this.field3920, this.field3939);
        this.field3926.method5232(this.field3938.method268());
    }

    @ObfuscatedName("li.f(Lae;Lhn;Lhn;ZI)V")
    public void method5247(class33 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3938 == null || this.field3938 != arg0) {
            this.method5378(arg0);
        }
        if (!arg3 && this.field3938.method261(arg1.field2700, arg1.field2697, arg1.field2698)) {
            this.method5264(arg1.field2700, arg1.field2697, arg1.field2698);
        } else {
            this.method5264(arg2.field2700, arg2.field2697, arg2.field2698);
        }
    }

    @ObfuscatedName("li.k(IIII)V")
    public void method5264(int arg0, int arg1, int arg2) {
        if (this.field3938 == null) {
            return;
        }
        int[] var4 = this.field3938.method263(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3938.method263(this.field3938.method318(), this.field3938.method324(), this.field3938.method277());
        }
        this.field3927 = var4[0] - this.field3938.method327() * 64;
        this.field3940 = var4[1] - this.field3938.method274() * 64;
        this.field3935 = -1;
        this.field3930 = -1;
        this.field3931 = this.method5269(this.field3938.method271());
        this.field3932 = this.field3931;
        this.field3952 = null;
        this.field3954 = null;
        this.field3925.method535();
    }

    @ObfuscatedName("li.e(IIIIII)V")
    public void method5265(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class306.method5071(var6);
        class306.method5029(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class306.method5002(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3926.method5235();
        if (var7 < 100) {
            this.method5268(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3925.method508()) {
            this.field3925.method533(this.field3912, this.field3938.method268(), client.field902);
            if (!this.field3925.method508()) {
                return;
            }
        }
        if (this.field3953 != null) {
            this.field3942++;
            if (this.field3942 % this.field3922 == 0) {
                this.field3942 = 0;
                this.field3941++;
            }
            if (this.field3941 >= this.field3937 && !this.field3914) {
                this.field3953 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3931));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3931));
        this.field3925.method502(this.field3927 - var8 / 2, this.field3940 - var9 / 2, var8 / 2 + this.field3927, var9 / 2 + this.field3940, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3949) {
            boolean var10 = false;
            if (arg4 - this.field3950 > 100) {
                this.field3950 = arg4;
                var10 = true;
            }
            this.field3925.method503(this.field3927 - var8 / 2, this.field3940 - var9 / 2, var8 / 2 + this.field3927, var9 / 2 + this.field3940, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3948, this.field3953, this.field3942, this.field3922, var10);
        }
        if (client.method2883() && this.field3955 != null) {
            this.field3918.method4830("Coord: " + this.field3955, class306.field3856 + 10, class306.field3857 + 20, 16776960, -1);
        }
        this.field3933 = var8;
        this.field3934 = var9;
        this.field3928 = arg0;
        this.field3936 = arg1;
        class306.method4996(var6);
    }

    @ObfuscatedName("li.u(IIIII)V")
    public void method5266(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3926.method5234()) {
            return;
        }
        if (!this.field3925.method508()) {
            this.field3925.method533(this.field3912, this.field3938.method268(), client.field902);
            if (!this.field3925.method508()) {
                return;
            }
        }
        this.field3925.method505(arg0, arg1, arg2, arg3, this.field3953, this.field3942, this.field3922);
    }

    @ObfuscatedName("li.z(IB)V")
    public void method5267(int arg0) {
        this.field3932 = this.method5269(arg0);
    }

    @ObfuscatedName("li.b(IIIIIB)V")
    public void method5268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class306.method5002(arg0, arg1, arg2, arg3, -16777216);
        class306.method5009(var7 - 152, var8, 304, 34, -65536);
        class306.method5002(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3918.method4821(class237.field2970, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("li.c(IB)F")
    public float method5269(int arg0) {
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

    @ObfuscatedName("li.aa(I)I")
    public int method5270() {
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

    @ObfuscatedName("li.ap(B)V")
    public void method5271() {
        this.field3926.method5231();
    }

    @ObfuscatedName("li.ao(I)Z")
    public boolean method5424() {
        return this.field3926.method5234();
    }

    @ObfuscatedName("li.ar(II)Lae;")
    public class33 method5273(int arg0) {
        Iterator var2 = this.field3921.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method266() != arg0);
        return var3;
    }

    @ObfuscatedName("li.ay(III)V")
    public void method5372(int arg0, int arg1) {
        if (this.field3938 != null && this.field3938.method262(arg0, arg1)) {
            this.field3935 = arg0 - this.field3938.method327() * 64;
            this.field3930 = arg1 - this.field3938.method274() * 64;
        }
    }

    @ObfuscatedName("li.ax(III)V")
    public void method5407(int arg0, int arg1) {
        if (this.field3938 != null) {
            this.field3927 = arg0 - this.field3938.method327() * 64;
            this.field3940 = arg1 - this.field3938.method274() * 64;
            this.field3935 = -1;
            this.field3930 = -1;
        }
    }

    @ObfuscatedName("li.ae(IIII)V")
    public void method5276(int arg0, int arg1, int arg2) {
        if (this.field3938 != null) {
            int[] var4 = this.field3938.method263(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5372(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("li.ah(IIII)V")
    public void method5248(int arg0, int arg1, int arg2) {
        if (this.field3938 != null) {
            int[] var4 = this.field3938.method263(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5407(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("li.ai(B)I")
    public int method5427() {
        return this.field3938 == null ? -1 : this.field3927 + this.field3938.method327() * 64;
    }

    @ObfuscatedName("li.au(B)I")
    public int method5371() {
        return this.field3938 == null ? -1 : this.field3940 + this.field3938.method274() * 64;
    }

    @ObfuscatedName("li.am(B)Lhn;")
    public class224 method5280() {
        return this.field3938 == null ? null : this.field3938.method264(this.method5427(), this.method5371());
    }

    @ObfuscatedName("li.af(I)I")
    public int method5281() {
        return this.field3933;
    }

    @ObfuscatedName("li.an(B)I")
    public int method5274() {
        return this.field3934;
    }

    @ObfuscatedName("li.ag(II)V")
    public void method5283(int arg0) {
        if (arg0 >= 1) {
            this.field3937 = arg0;
        }
    }

    @ObfuscatedName("li.av(I)V")
    public void method5284() {
        this.field3937 = 3;
    }

    @ObfuscatedName("li.aw(II)V")
    public void method5393(int arg0) {
        if (arg0 >= 1) {
            this.field3922 = arg0;
        }
    }

    @ObfuscatedName("li.ad(I)V")
    public void method5292() {
        this.field3922 = 50;
    }

    @ObfuscatedName("li.ab(ZI)V")
    public void method5287(boolean arg0) {
        this.field3914 = arg0;
    }

    @ObfuscatedName("li.aq(IB)V")
    public void method5288(int arg0) {
        this.field3953 = new HashSet();
        this.field3953.add(arg0);
        this.field3941 = 0;
        this.field3942 = 0;
    }

    @ObfuscatedName("li.ac(IB)V")
    public void method5289(int arg0) {
        this.field3953 = new HashSet();
        this.field3941 = 0;
        this.field3942 = 0;
        for (int var2 = 0; var2 < Statics.field3354.length; var2++) {
            if (Statics.field3354[var2] != null && Statics.field3354[var2].field3374 == arg0) {
                this.field3953.add(Statics.field3354[var2].field3361);
            }
        }
    }

    @ObfuscatedName("li.ak(I)V")
    public void method5290() {
        this.field3953 = null;
    }

    @ObfuscatedName("li.az(ZI)V")
    public void method5366(boolean arg0) {
        this.field3949 = !arg0;
    }

    @ObfuscatedName("li.as(IZI)V")
    public void method5294(int arg0, boolean arg1) {
        if (arg1) {
            this.field3945.remove(arg0);
        } else {
            this.field3945.add(arg0);
        }
        this.method5413();
    }

    @ObfuscatedName("li.at(IZB)V")
    public void method5381(int arg0, boolean arg1) {
        if (arg1) {
            this.field3946.remove(arg0);
        } else {
            this.field3946.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3354.length; var3++) {
            if (Statics.field3354[var3] != null && Statics.field3354[var3].field3374 == arg0) {
                int var4 = Statics.field3354[var3].field3361;
                if (arg1) {
                    this.field3910.remove(var4);
                } else {
                    this.field3910.add(var4);
                }
            }
        }
        this.method5413();
    }

    @ObfuscatedName("li.aj(I)Z")
    public boolean method5318() {
        return !this.field3949;
    }

    @ObfuscatedName("li.al(II)Z")
    public boolean method5295(int arg0) {
        return !this.field3945.contains(arg0);
    }

    @ObfuscatedName("li.bw(II)Z")
    public boolean method5296(int arg0) {
        return !this.field3946.contains(arg0);
    }

    @ObfuscatedName("li.bt(S)V")
    public void method5413() {
        this.field3948.clear();
        this.field3948.addAll(this.field3945);
        this.field3948.addAll(this.field3910);
    }

    @ObfuscatedName("li.by(IIIIIII)V")
    public void method5278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3926.method5234()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3931));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3931));
        List var9 = this.field3925.method506(this.field3927 - var7 / 2 - 1, this.field3940 - var8 / 2 - 1, var7 / 2 + this.field3927 + 1, var8 / 2 + this.field3940 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class254 var12 = Statics.field3354[var11.field496];
            var13 = false;
            for (int var14 = this.field3951.length - 1; var14 >= 0; var14--) {
                if (var12.field3363[var14] != null) {
                    client.method12(var12.field3363[var14], var12.field3367, this.field3951[var14], var11.field496, var11.field501.method3877(), var11.field497.method3877());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("li.bq(ILhn;I)Lhn;")
    public class224 method5315(int arg0, class224 arg1) {
        if (!this.field3926.method5234()) {
            return null;
        } else if (!this.field3925.method508()) {
            return null;
        } else if (this.field3938.method262(arg1.field2697, arg1.field2698)) {
            HashMap var3 = this.field3925.method509();
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
                        return var5.field497;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field497.field2697 - arg1.field2697;
                    int var10 = var8.field497.field2698 - arg1.field2698;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field497;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.bf(IILhn;Lhn;I)V")
    public void method5403(int arg0, int arg1, class224 arg2, class224 arg3) {
        class68 var5 = new class68();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method985(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method986(class231.field2887);
                break;
            case 1009:
                var5.method986(class231.field2881);
                break;
            case 1010:
                var5.method986(class231.field2879);
                break;
            case 1011:
                var5.method986(class231.field2885);
                break;
            case 1012:
                var5.method986(class231.field2880);
        }
        class81.method1724(var5);
    }

    @ObfuscatedName("li.bp(B)Lag;")
    public class40 method5301() {
        if (!this.field3926.method5234()) {
            return null;
        } else if (this.field3925.method508()) {
            HashMap var1 = this.field3925.method509();
            this.field3952 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3952.addAll(var3);
            }
            this.field3954 = this.field3952.iterator();
            return this.method5302();
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.bn(I)Lag;")
    public class40 method5302() {
        if (this.field3954 == null) {
            return null;
        } else if (this.field3954.hasNext()) {
            return (class40) this.field3954.next();
        } else {
            return null;
        }
    }
}
