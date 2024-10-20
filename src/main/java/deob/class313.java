package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lr")
public class class313 {

    @ObfuscatedName("lr.t")
    public class247 field3925;

    @ObfuscatedName("lr.d")
    public static final class285 field3926 = class285.field3751;

    @ObfuscatedName("lr.z")
    public static final class285 field3927 = class285.field3755;

    @ObfuscatedName("lr.k")
    public static final class285 field3928 = class285.field3753;

    @ObfuscatedName("lr.c")
    public class287 field3932;

    @ObfuscatedName("lr.o")
    public HashMap field3930;

    @ObfuscatedName("lr.l")
    public class309[] field3931;

    @ObfuscatedName("lr.f")
    public HashMap field3934;

    @ObfuscatedName("lr.q")
    public class33 field3933;

    @ObfuscatedName("lr.r")
    public class33 field3951;

    @ObfuscatedName("lr.x")
    public class33 field3959;

    @ObfuscatedName("lr.u")
    public class42 field3936;

    @ObfuscatedName("lr.b")
    public class312 field3937;

    @ObfuscatedName("lr.p")
    public int field3964;

    @ObfuscatedName("lr.y")
    public int field3946;

    @ObfuscatedName("lr.n")
    public int field3940 = -1;

    @ObfuscatedName("lr.j")
    public int field3941 = -1;

    @ObfuscatedName("lr.e")
    public float field3935;

    @ObfuscatedName("lr.v")
    public float field3943;

    @ObfuscatedName("lr.a")
    public int field3944 = -1;

    @ObfuscatedName("lr.ad")
    public int field3945 = -1;

    @ObfuscatedName("lr.al")
    public int field3952 = -1;

    @ObfuscatedName("lr.aq")
    public int field3947 = -1;

    @ObfuscatedName("lr.ar")
    public int field3948 = 3;

    @ObfuscatedName("lr.an")
    public int field3949 = 50;

    @ObfuscatedName("lr.af")
    public boolean field3921 = false;

    @ObfuscatedName("lr.as")
    public HashSet field3939 = null;

    @ObfuscatedName("lr.ax")
    public int field3960 = -1;

    @ObfuscatedName("lr.ak")
    public int field3953 = -1;

    @ObfuscatedName("lr.aw")
    public int field3942 = -1;

    @ObfuscatedName("lr.ai")
    public int field3955 = -1;

    @ObfuscatedName("lr.ab")
    public HashSet field3956 = new HashSet();

    @ObfuscatedName("lr.am")
    public HashSet field3961 = new HashSet();

    @ObfuscatedName("lr.ah")
    public HashSet field3958 = new HashSet();

    @ObfuscatedName("lr.ag")
    public HashSet field3950 = new HashSet();

    @ObfuscatedName("lr.az")
    public boolean field3963 = false;

    @ObfuscatedName("lr.ae")
    public int field3923 = 0;

    @ObfuscatedName("lr.av")
    public final int[] field3962 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lr.aj")
    public List field3938;

    @ObfuscatedName("lr.ap")
    public Iterator field3929;

    @ObfuscatedName("lr.au")
    public HashSet field3965 = new HashSet();

    @ObfuscatedName("lr.ay")
    public class224 field3966 = null;

    @ObfuscatedName("lr.s(Lir;Lkp;Ljava/util/HashMap;[Lkh;B)V")
    public void method5429(class247 arg0, class287 arg1, HashMap arg2, class309[] arg3) {
        this.field3931 = arg3;
        this.field3925 = arg0;
        this.field3932 = arg1;
        this.field3930 = new HashMap();
        this.field3930.put(class25.field346, arg2.get(field3926));
        this.field3930.put(class25.field345, arg2.get(field3927));
        this.field3930.put(class25.field344, arg2.get(field3928));
        this.field3937 = new class312(arg0);
        int var5 = this.field3925.method4201(class41.field522.field516);
        int[] var6 = this.field3925.method4195(var5);
        this.field3934 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3925.method4231(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method257(var8, var6[var7]);
            this.field3934.put(var9.method247(), var9);
            if (var9.method252()) {
                this.field3933 = var9;
            }
        }
        this.method5441(this.field3933);
        this.field3959 = null;
    }

    @ObfuscatedName("lr.g(I)I")
    public int method5430() {
        return this.field3925.method4205(this.field3933.method247(), class41.field519.field516) ? 100 : this.field3925.method4208(this.field3933.method247());
    }

    @ObfuscatedName("lr.m(IIZIIIII)V")
    public void method5540(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3937.method5415()) {
            return;
        }
        this.method5578();
        this.method5515();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3935));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3935));
        List var10 = this.field3936.method488(this.field3964 - var8 / 2 - 1, this.field3946 - var9 / 2 - 1, var8 / 2 + this.field3964 + 1, var9 / 2 + this.field3946 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class68 var14 = new class68();
            class48 var15 = new class48(var13.field515, var13.field505, var13.field510);
            var14.method974(new Object[] { var15, arg0, arg1 });
            if (this.field3965.contains(var13)) {
                var14.method975(class231.field2903);
            } else {
                var14.method975(class231.field2898);
            }
            class81.method1742(var14);
        }
        Iterator var16 = this.field3965.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class68 var18 = new class68();
                class48 var19 = new class48(var17.field515, var17.field505, var17.field510);
                var18.method974(new Object[] { var19, arg0, arg1 });
                var18.method975(class231.field2899);
                class81.method1742(var18);
            }
        }
        this.field3965 = var11;
    }

    @ObfuscatedName("lr.h(IIZZI)V")
    public void method5432(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method5433(arg0, arg1, arg3);
        if (this.field3942 == -1) {
            this.field3942 = arg0;
        }
        if (this.field3955 == -1) {
            this.field3955 = arg1;
        }
        int var5 = arg0 - this.field3942;
        int var6 = arg1 - this.field3955;
        this.field3942 = arg0;
        this.field3955 = arg1;
        if (arg2 && !this.method5436()) {
            this.field3964 -= (int) ((float) var5 / this.field3943);
            this.field3946 += (int) ((float) var6 / this.field3943);
        }
    }

    @ObfuscatedName("lr.i(IIZB)V")
    public void method5433(int arg0, int arg1, boolean arg2) {
        if (!client.method43()) {
            return;
        }
        if (this.field3951 == null) {
            this.field3966 = null;
            return;
        }
        int var4 = (int) ((float) this.field3964 + ((float) (arg0 - this.field3952) - (float) this.method5461() * this.field3935 / 2.0F) / this.field3935);
        int var5 = (int) ((float) this.field3946 - ((float) (arg1 - this.field3947) - (float) this.method5551() * this.field3935 / 2.0F) / this.field3935);
        this.field3966 = this.field3951.method258(var4 + this.field3951.method256() * 64, var5 + this.field3951.method277() * 64);
        if (this.field3966 == null || !arg2 || !class51.field618[82] || !class51.field618[81] || !arg2) {
            return;
        }
        int var6 = this.field3966.field2718;
        int var7 = this.field3966.field2716;
        int var8 = this.field3966.field2717;
        class175 var9 = class175.method1891(class172.field2384, client.field938.field1455);
        var9.field2440.method3247(var7);
        var9.field2440.method3265(var8);
        var9.field2440.method3257(var6);
        client.field938.method1907(var9);
    }

    @ObfuscatedName("lr.w(I)V")
    public void method5578() {
        if (this.field3935 < this.field3943) {
            this.field3935 = Math.min(this.field3943, this.field3935 / 30.0F + this.field3935);
        }
        if (this.field3935 > this.field3943) {
            this.field3935 = Math.max(this.field3943, this.field3935 - this.field3935 / 30.0F);
        }
    }

    @ObfuscatedName("lr.t(I)V")
    public void method5515() {
        if (!this.method5436()) {
            return;
        }
        int var1 = this.field3940 - this.field3964;
        int var2 = this.field3941 - this.field3946;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3964 += var1;
        this.field3946 += var2;
        if (this.field3964 == this.field3940 && this.field3946 == this.field3941) {
            this.field3940 = -1;
            this.field3941 = -1;
        }
    }

    @ObfuscatedName("lr.d(I)Z")
    public boolean method5436() {
        return this.field3940 != -1 && this.field3941 != -1;
    }

    @ObfuscatedName("lr.z(IIII)Las;")
    public class33 method5437(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3934.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method306(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lr.k(IIIZB)V")
    public void method5435(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5437(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3933;
        }
        boolean var6 = false;
        if (this.field3959 != var5 || arg3) {
            this.field3959 = var5;
            this.method5441(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5444(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lr.c(IB)V")
    public void method5465(int arg0) {
        class33 var2 = this.method5453(arg0);
        if (var2 != null) {
            this.method5441(var2);
        }
    }

    @ObfuscatedName("lr.o(S)I")
    public int method5439() {
        return this.field3951 == null ? -1 : this.field3951.method251();
    }

    @ObfuscatedName("lr.l(I)Las;")
    public class33 method5440() {
        return this.field3951;
    }

    @ObfuscatedName("lr.f(Las;I)V")
    public void method5441(class33 arg0) {
        if (this.field3951 == null || this.field3951 != arg0) {
            this.method5428(arg0);
            this.method5444(-1, -1, -1);
        }
    }

    @ObfuscatedName("lr.q(Las;I)V")
    public void method5428(class33 arg0) {
        this.field3951 = arg0;
        this.field3936 = new class42(this.field3931, this.field3930);
        this.field3937.method5413(this.field3951.method247());
    }

    @ObfuscatedName("lr.r(Las;Lhv;Lhv;ZI)V")
    public void method5602(class33 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3951 == null || this.field3951 != arg0) {
            this.method5428(arg0);
        }
        if (!arg3 && this.field3951.method306(arg1.field2717, arg1.field2718, arg1.field2716)) {
            this.method5444(arg1.field2717, arg1.field2718, arg1.field2716);
        } else {
            this.method5444(arg2.field2717, arg2.field2718, arg2.field2716);
        }
    }

    @ObfuscatedName("lr.x(IIIB)V")
    public void method5444(int arg0, int arg1, int arg2) {
        if (this.field3951 == null) {
            return;
        }
        int[] var4 = this.field3951.method303(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3951.method303(this.field3951.method248(), this.field3951.method280(), this.field3951.method287());
        }
        this.field3964 = var4[0] - this.field3951.method256() * 64;
        this.field3946 = var4[1] - this.field3951.method277() * 64;
        this.field3940 = -1;
        this.field3941 = -1;
        this.field3935 = this.method5449(this.field3951.method283());
        this.field3943 = this.field3935;
        this.field3938 = null;
        this.field3929 = null;
        this.field3936.method483();
    }

    @ObfuscatedName("lr.u(IIIIII)V")
    public void method5445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class306.method5180(var6);
        class306.method5181(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class306.method5225(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3937.method5423();
        if (var7 < 100) {
            this.method5448(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3936.method490()) {
            this.field3936.method482(this.field3925, this.field3951.method247(), client.field958);
            if (!this.field3936.method490()) {
                return;
            }
        }
        if (this.field3939 != null) {
            this.field3953++;
            if (this.field3953 % this.field3949 == 0) {
                this.field3953 = 0;
                this.field3960++;
            }
            if (this.field3960 >= this.field3948 && !this.field3921) {
                this.field3939 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3935));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3935));
        this.field3936.method484(this.field3964 - var8 / 2, this.field3946 - var9 / 2, var8 / 2 + this.field3964, var9 / 2 + this.field3946, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3963) {
            boolean var10 = false;
            if (arg4 - this.field3923 > 100) {
                this.field3923 = arg4;
                var10 = true;
            }
            this.field3936.method485(this.field3964 - var8 / 2, this.field3946 - var9 / 2, var8 / 2 + this.field3964, var9 / 2 + this.field3946, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3950, this.field3939, this.field3953, this.field3949, var10);
        }
        if (client.method43() && this.field3966 != null) {
            this.field3932.method5015("Coord: " + this.field3966, class306.field3877 + 10, class306.field3874 + 20, 16776960, -1);
        }
        this.field3944 = var8;
        this.field3945 = var9;
        this.field3952 = arg0;
        this.field3947 = arg1;
        class306.method5184(var6);
    }

    @ObfuscatedName("lr.a(IIIII)V")
    public void method5544(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3937.method5415()) {
            return;
        }
        if (!this.field3936.method490()) {
            this.field3936.method482(this.field3925, this.field3951.method247(), client.field958);
            if (!this.field3936.method490()) {
                return;
            }
        }
        this.field3936.method487(arg0, arg1, arg2, arg3, this.field3939, this.field3953, this.field3949);
    }

    @ObfuscatedName("lr.ad(IS)V")
    public void method5447(int arg0) {
        this.field3943 = this.method5449(arg0);
    }

    @ObfuscatedName("lr.al(IIIIII)V")
    public void method5448(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class306.method5225(arg0, arg1, arg2, arg3, -16777216);
        class306.method5196(var7 - 152, var8, 304, 34, -65536);
        class306.method5225(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3932.method5042(class237.field3042, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lr.aq(II)F")
    public float method5449(int arg0) {
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

    @ObfuscatedName("lr.ar(I)I")
    public int method5450() {
        if ((double) this.field3943 == 1.0D) {
            return 25;
        } else if ((double) this.field3943 == 1.5D) {
            return 37;
        } else if ((double) this.field3943 == 2.0D) {
            return 50;
        } else if ((double) this.field3943 == 3.0D) {
            return 75;
        } else if ((double) this.field3943 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lr.an(I)V")
    public void method5451() {
        this.field3937.method5414();
    }

    @ObfuscatedName("lr.af(I)Z")
    public boolean method5452() {
        return this.field3937.method5415();
    }

    @ObfuscatedName("lr.as(II)Las;")
    public class33 method5453(int arg0) {
        Iterator var2 = this.field3934.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method251() != arg0);
        return var3;
    }

    @ObfuscatedName("lr.ax(III)V")
    public void method5548(int arg0, int arg1) {
        if (this.field3951 != null && this.field3951.method307(arg0, arg1)) {
            this.field3940 = arg0 - this.field3951.method256() * 64;
            this.field3941 = arg1 - this.field3951.method277() * 64;
        }
    }

    @ObfuscatedName("lr.ak(IIB)V")
    public void method5505(int arg0, int arg1) {
        if (this.field3951 != null) {
            this.field3964 = arg0 - this.field3951.method256() * 64;
            this.field3946 = arg1 - this.field3951.method277() * 64;
            this.field3940 = -1;
            this.field3941 = -1;
        }
    }

    @ObfuscatedName("lr.aw(IIII)V")
    public void method5456(int arg0, int arg1, int arg2) {
        if (this.field3951 != null) {
            int[] var4 = this.field3951.method303(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5548(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lr.ai(IIIB)V")
    public void method5457(int arg0, int arg1, int arg2) {
        if (this.field3951 != null) {
            int[] var4 = this.field3951.method303(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5505(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lr.ab(S)I")
    public int method5458() {
        return this.field3951 == null ? -1 : this.field3964 + this.field3951.method256() * 64;
    }

    @ObfuscatedName("lr.am(B)I")
    public int method5488() {
        return this.field3951 == null ? -1 : this.field3946 + this.field3951.method277() * 64;
    }

    @ObfuscatedName("lr.ah(I)Lhv;")
    public class224 method5431() {
        return this.field3951 == null ? null : this.field3951.method258(this.method5458(), this.method5488());
    }

    @ObfuscatedName("lr.ag(I)I")
    public int method5461() {
        return this.field3944;
    }

    @ObfuscatedName("lr.az(B)I")
    public int method5551() {
        return this.field3945;
    }

    @ObfuscatedName("lr.ae(IB)V")
    public void method5463(int arg0) {
        if (arg0 >= 1) {
            this.field3948 = arg0;
        }
    }

    @ObfuscatedName("lr.ao(I)V")
    public void method5464() {
        this.field3948 = 3;
    }

    @ObfuscatedName("lr.av(IB)V")
    public void method5493(int arg0) {
        if (arg0 >= 1) {
            this.field3949 = arg0;
        }
    }

    @ObfuscatedName("lr.aj(B)V")
    public void method5466() {
        this.field3949 = 50;
    }

    @ObfuscatedName("lr.ap(ZB)V")
    public void method5467(boolean arg0) {
        this.field3921 = arg0;
    }

    @ObfuscatedName("lr.au(II)V")
    public void method5468(int arg0) {
        this.field3939 = new HashSet();
        this.field3939.add(arg0);
        this.field3960 = 0;
        this.field3953 = 0;
    }

    @ObfuscatedName("lr.ay(IB)V")
    public void method5580(int arg0) {
        this.field3939 = new HashSet();
        this.field3960 = 0;
        this.field3953 = 0;
        for (int var2 = 0; var2 < Statics.field3378.length; var2++) {
            if (Statics.field3378[var2] != null && Statics.field3378[var2].field3397 == arg0) {
                this.field3939.add(Statics.field3378[var2].field3380);
            }
        }
    }

    @ObfuscatedName("lr.aa(I)V")
    public void method5470() {
        this.field3939 = null;
    }

    @ObfuscatedName("lr.at(ZI)V")
    public void method5483(boolean arg0) {
        this.field3963 = !arg0;
    }

    @ObfuscatedName("lr.ac(IZI)V")
    public void method5472(int arg0, boolean arg1) {
        if (arg1) {
            this.field3956.remove(arg0);
        } else {
            this.field3956.add(arg0);
        }
        this.method5477();
    }

    @ObfuscatedName("lr.bj(IZI)V")
    public void method5566(int arg0, boolean arg1) {
        if (arg1) {
            this.field3961.remove(arg0);
        } else {
            this.field3961.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3378.length; var3++) {
            if (Statics.field3378[var3] != null && Statics.field3378[var3].field3397 == arg0) {
                int var4 = Statics.field3378[var3].field3380;
                if (arg1) {
                    this.field3958.remove(var4);
                } else {
                    this.field3958.add(var4);
                }
            }
        }
        this.method5477();
    }

    @ObfuscatedName("lr.bo(I)Z")
    public boolean method5474() {
        return !this.field3963;
    }

    @ObfuscatedName("lr.br(II)Z")
    public boolean method5525(int arg0) {
        return !this.field3956.contains(arg0);
    }

    @ObfuscatedName("lr.bm(II)Z")
    public boolean method5476(int arg0) {
        return !this.field3961.contains(arg0);
    }

    @ObfuscatedName("lr.bf(I)V")
    public void method5477() {
        this.field3950.clear();
        this.field3950.addAll(this.field3956);
        this.field3950.addAll(this.field3958);
    }

    @ObfuscatedName("lr.bh(IIIIIII)V")
    public void method5478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3937.method5415()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3935));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3935));
        List var9 = this.field3936.method488(this.field3964 - var7 / 2 - 1, this.field3946 - var8 / 2 - 1, var7 / 2 + this.field3964 + 1, var8 / 2 + this.field3946 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class254 var12 = Statics.field3378[var11.field515];
            var13 = false;
            for (int var14 = this.field3962.length - 1; var14 >= 0; var14--) {
                if (var12.field3398[var14] != null) {
                    client.method4711(var12.field3398[var14], var12.field3388, this.field3962[var14], var11.field515, var11.field505.method4048(), var11.field510.method4048());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lr.bt(ILhv;I)Lhv;")
    public class224 method5479(int arg0, class224 arg1) {
        if (!this.field3937.method5415()) {
            return null;
        } else if (!this.field3936.method490()) {
            return null;
        } else if (this.field3951.method307(arg1.field2718, arg1.field2716)) {
            HashMap var3 = this.field3936.method491();
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
                        return var5.field510;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field510.field2718 - arg1.field2718;
                    int var10 = var8.field510.field2716 - arg1.field2716;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field510;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lr.bi(IILhv;Lhv;B)V")
    public void method5595(int arg0, int arg1, class224 arg2, class224 arg3) {
        class68 var5 = new class68();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method974(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method975(class231.field2893);
                break;
            case 1009:
                var5.method975(class231.field2894);
                break;
            case 1010:
                var5.method975(class231.field2895);
                break;
            case 1011:
                var5.method975(class231.field2896);
                break;
            case 1012:
                var5.method975(class231.field2897);
        }
        class81.method1742(var5);
    }

    @ObfuscatedName("lr.bq(B)Lah;")
    public class40 method5571() {
        if (!this.field3937.method5415()) {
            return null;
        } else if (this.field3936.method490()) {
            HashMap var1 = this.field3936.method491();
            this.field3938 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3938.addAll(var3);
            }
            this.field3929 = this.field3938.iterator();
            return this.method5547();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lr.bn(I)Lah;")
    public class40 method5547() {
        if (this.field3929 == null) {
            return null;
        } else if (this.field3929.hasNext()) {
            return (class40) this.field3929.next();
        } else {
            return null;
        }
    }
}
