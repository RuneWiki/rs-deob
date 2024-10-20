package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ak")
public final class class31 {

    @ObfuscatedName("ak.z")
    public boolean field273 = false;

    @ObfuscatedName("ak.w")
    public boolean field265 = false;

    @ObfuscatedName("ak.s")
    public class34 field266;

    @ObfuscatedName("ak.l")
    public class319 field267;

    @ObfuscatedName("ak.u")
    public HashMap field268;

    @ObfuscatedName("ak.q")
    public class24[][] field269;

    @ObfuscatedName("ak.k")
    public HashMap field270 = new HashMap();

    @ObfuscatedName("ak.i")
    public class318[] field280;

    @ObfuscatedName("ak.x")
    public final HashMap field272;

    @ObfuscatedName("ak.e")
    public int field274;

    @ObfuscatedName("ak.p")
    public int field279;

    @ObfuscatedName("ak.b")
    public int field275;

    @ObfuscatedName("ak.n")
    public int field271;

    @ObfuscatedName("ak.f")
    public int field277 = 0;

    public class31(class318[] arg0, HashMap arg1) {
        this.field280 = arg0;
        this.field272 = arg1;
    }

    @ObfuscatedName("ak.z(Lir;Ljava/lang/String;ZB)V")
    public void method451(class248 arg0, String arg1, boolean arg2) {
        if (this.field265) {
            return;
        }
        this.field273 = false;
        this.field265 = true;
        System.nanoTime();
        int var4 = arg0.method4264(class30.field253.field256);
        int var5 = arg0.method4265(var4, arg1);
        class183 var6 = new class183(arg0.method4306(class30.field253.field256, arg1));
        class183 var7 = new class183(arg0.method4306(class30.field252.field256, arg1));
        class183 var8 = new class183(arg0.method4306(arg1, class30.field263.field256));
        System.nanoTime();
        System.nanoTime();
        this.field266 = new class34();
        try {
            this.field266.method491(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field266.method198();
        this.field266.method199();
        this.field266.method200();
        this.field274 = this.field266.method239() * 64;
        this.field279 = this.field266.method228() * 64;
        this.field275 = (this.field266.method195() - this.field266.method239() + 1) * 64;
        this.field271 = (this.field266.method230() - this.field266.method228() + 1) * 64;
        int var10 = this.field266.method195() - this.field266.method239() + 1;
        int var11 = this.field266.method230() - this.field266.method228() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.field189.method3698();
        class24.field190.method3698();
        this.field269 = new class24[var10][var11];
        Iterator var12 = this.field266.field293.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field128;
            int var15 = var13.field118;
            int var16 = var14 - this.field266.method239();
            int var17 = var15 - this.field266.method228();
            this.field269[var16][var17] = new class24(var14, var15, this.field266.method192(), this.field272);
            this.field269[var16][var17].method381(var13, this.field266.field291);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field269[var18][var19] == null) {
                    this.field269[var18][var19] = new class24(this.field266.method239() + var18, this.field266.method228() + var19, this.field266.method192(), this.field272);
                    this.field269[var18][var19].method268(this.field266.field292, this.field266.field291);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4266(class30.field258.field256, arg1)) {
            byte[] var20 = arg0.method4306(class30.field258.field256, arg1);
            this.field267 = Statics.method4930(var20);
        }
        System.nanoTime();
        arg0.method4324();
        arg0.method4262();
        this.field273 = true;
    }

    @ObfuscatedName("ak.w(B)V")
    public final void method443() {
        this.field268 = null;
    }

    @ObfuscatedName("ak.s(IIIIIIIIB)V")
    public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3767;
        int var10 = Statics.field3762;
        int var11 = Statics.field3763;
        int[] var12 = new int[4];
        class315.method5290(var12);
        class18 var13 = this.method479(arg0, arg1, arg2, arg3);
        float var14 = this.method453(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field277 = var15;
        if (!this.field270.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method533();
            this.field270.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field133; var18 < var13.field133 + var13.field132; var18++) {
            for (int var19 = var13.field135; var19 < var13.field135 + var13.field134; var19++) {
                this.method446(var18, var19, var17);
                this.field269[var18][var19].method271(var15, (class36) this.field270.get(var15), var17, this.field280);
            }
        }
        class315.method5286(var9, var10, var11);
        class315.method5291(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field274 + arg0;
        int var22 = this.field279 + arg1;
        for (int var23 = var13.field133; var23 < var13.field133 + var13.field132; var23++) {
            for (int var24 = var13.field135; var24 < var13.field135 + var13.field134; var24++) {
                this.field269[var23][var24].method295((this.field269[var23][var24].field192 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field269[var23][var24].field193 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ak.l(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method479(arg0, arg1, arg2, arg3);
        float var15 = this.method453(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field274 + arg0;
        int var18 = this.field279 + arg1;
        for (int var19 = var14.field133; var19 < var14.field133 + var14.field132; var19++) {
            for (int var20 = var14.field135; var20 < var14.field135 + var14.field134; var20++) {
                if (arg12) {
                    this.field269[var19][var20].method321();
                }
                this.field269[var19][var20].method363((this.field269[var19][var20].field192 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field269[var19][var20].field193 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field133; var21 < var14.field133 + var14.field132; var21++) {
            for (int var22 = var14.field135; var22 < var14.field135 + var14.field134; var22++) {
                this.field269[var21][var22].method292(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ak.u(II[Lh;I)V")
    public void method446(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field269.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field269[0].length - 1;
        if (var7) {
            arg2[class241.field3102.method142()] = null;
        } else {
            arg2[class241.field3102.method142()] = this.field269[arg0][arg1 + 1];
        }
        arg2[class241.field3108.method142()] = var7 || var5 ? null : this.field269[arg0 + 1][arg1 + 1];
        arg2[class241.field3104.method142()] = var7 || var4 ? null : this.field269[arg0 - 1][arg1 + 1];
        arg2[class241.field3098.method142()] = var5 ? null : this.field269[arg0 + 1][arg1];
        arg2[class241.field3103.method142()] = var4 ? null : this.field269[arg0 - 1][arg1];
        arg2[class241.field3101.method142()] = var6 ? null : this.field269[arg0][arg1 - 1];
        arg2[class241.field3100.method142()] = var6 || var5 ? null : this.field269[arg0 + 1][arg1 - 1];
        arg2[class241.field3099.method142()] = var6 || var4 ? null : this.field269[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ak.q(IIIILjava/util/HashSet;III)V")
    public void method447(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field267 == null) {
            return;
        }
        this.field267.method5413(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field268 == null) {
            this.method466();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field268.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field237.field2565 - this.field274) * arg2 / this.field275;
                int var14 = arg3 - (var12.field237.field2566 - this.field279) * arg3 / this.field271;
                class315.method5352(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ak.i(IIIIIIIIIII)Ljava/util/List;")
    public List method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field273) {
            return var11;
        }
        class18 var12 = this.method479(arg0, arg1, arg2, arg3);
        float var13 = this.method453(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field274 + arg0;
        int var16 = this.field279 + arg1;
        for (int var17 = var12.field133; var17 < var12.field133 + var12.field132; var17++) {
            for (int var18 = var12.field135; var18 < var12.field135 + var12.field134; var18++) {
                List var19 = this.field269[var17][var18].method300((this.field269[var17][var18].field192 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field269[var17][var18].field193 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ak.x(IIIIS)Lt;")
    public class18 method479(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field274 + arg0;
        int var7 = this.field279 + arg1;
        int var8 = this.field274 + arg2;
        int var9 = this.field279 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field132 = var12 - var10 + 1;
        var5.field134 = var13 - var11 + 1;
        var5.field133 = var10 - this.field266.method239();
        var5.field135 = var11 - this.field266.method228();
        if (var5.field133 < 0) {
            var5.field132 += var5.field133;
            var5.field133 = 0;
        }
        if (var5.field133 > this.field269.length - var5.field132) {
            var5.field132 = this.field269.length - var5.field133;
        }
        if (var5.field135 < 0) {
            var5.field134 += var5.field135;
            var5.field135 = 0;
        }
        if (var5.field135 > this.field269[0].length - var5.field134) {
            var5.field134 = this.field269[0].length - var5.field135;
        }
        var5.field132 = Math.min(var5.field132, this.field269.length);
        var5.field134 = Math.min(var5.field134, this.field269[0].length);
        return var5;
    }

    @ObfuscatedName("ak.e(I)Z")
    public boolean method474() {
        return this.field273;
    }

    @ObfuscatedName("ak.p(B)Ljava/util/HashMap;")
    public HashMap method450() {
        this.method466();
        return this.field268;
    }

    @ObfuscatedName("ak.b(B)V")
    public void method466() {
        if (this.field268 == null) {
            this.field268 = new HashMap();
        }
        this.field268.clear();
        for (int var1 = 0; var1 < this.field269.length; var1++) {
            for (int var2 = 0; var2 < this.field269[var1].length; var2++) {
                List var3 = this.field269[var1][var2].method337();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field268.containsKey(var5.field241)) {
                        List var7 = (List) this.field268.get(var5.field241);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field268.put(var5.field241, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.n(III)F")
    public float method453(int arg0, int arg1) {
        float var3 = (float) arg0 / (float) arg1;
        if (var3 > 8.0F) {
            return 8.0F;
        } else if (var3 < 1.0F) {
            return 1.0F;
        } else {
            int var4 = Math.round(var3);
            return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
        }
    }
}
