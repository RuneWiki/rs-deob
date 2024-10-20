package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ay")
public final class class31 {

    @ObfuscatedName("ay.w")
    public boolean field281 = false;

    @ObfuscatedName("ay.m")
    public boolean field265 = false;

    @ObfuscatedName("ay.q")
    public class34 field267;

    @ObfuscatedName("ay.b")
    public class319 field268;

    @ObfuscatedName("ay.f")
    public HashMap field278;

    @ObfuscatedName("ay.n")
    public class24[][] field273;

    @ObfuscatedName("ay.h")
    public HashMap field271 = new HashMap();

    @ObfuscatedName("ay.x")
    public class318[] field272;

    @ObfuscatedName("ay.j")
    public final HashMap field280;

    @ObfuscatedName("ay.a")
    public int field274;

    @ObfuscatedName("ay.l")
    public int field275;

    @ObfuscatedName("ay.d")
    public int field276;

    @ObfuscatedName("ay.s")
    public int field277;

    @ObfuscatedName("ay.p")
    public int field270 = 0;

    public class31(class318[] arg0, HashMap arg1) {
        this.field272 = arg0;
        this.field280 = arg1;
    }

    @ObfuscatedName("ay.w(Liv;Ljava/lang/String;ZI)V")
    public void method475(class248 arg0, String arg1, boolean arg2) {
        if (this.field265) {
            return;
        }
        this.field281 = false;
        this.field265 = true;
        System.nanoTime();
        int var4 = arg0.method4268(class30.field258.field263);
        int var5 = arg0.method4317(var4, arg1);
        class183 var6 = new class183(arg0.method4271(class30.field258.field263, arg1));
        class183 var7 = new class183(arg0.method4271(class30.field262.field263, arg1));
        class183 var8 = new class183(arg0.method4271(arg1, class30.field261.field263));
        System.nanoTime();
        System.nanoTime();
        this.field267 = new class34();
        try {
            this.field267.method535(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field267.method219();
        this.field267.method220();
        this.field267.method221();
        this.field274 = this.field267.method201() * 64;
        this.field275 = this.field267.method270() * 64;
        this.field276 = (this.field267.method216() - this.field267.method201() + 1) * 64;
        this.field277 = (this.field267.method248() - this.field267.method270() + 1) * 64;
        int var10 = this.field267.method216() - this.field267.method201() + 1;
        int var11 = this.field267.method248() - this.field267.method270() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.field204.method3723();
        class24.field205.method3723();
        this.field273 = new class24[var10][var11];
        Iterator var12 = this.field267.field293.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field132;
            int var15 = var13.field136;
            int var16 = var14 - this.field267.method201();
            int var17 = var15 - this.field267.method270();
            this.field273[var16][var17] = new class24(var14, var15, this.field267.method213(), this.field280);
            this.field273[var16][var17].method288(var13, this.field267.field292);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field273[var18][var19] == null) {
                    this.field273[var18][var19] = new class24(this.field267.method201() + var18, this.field267.method270() + var19, this.field267.method213(), this.field280);
                    this.field273[var18][var19].method356(this.field267.field294, this.field267.field292);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4313(class30.field260.field263, arg1)) {
            byte[] var20 = arg0.method4271(class30.field260.field263, arg1);
            this.field268 = class44.method4467(var20);
        }
        System.nanoTime();
        arg0.method4286();
        arg0.method4266();
        this.field281 = true;
    }

    @ObfuscatedName("ay.m(I)V")
    public final void method516() {
        this.field278 = null;
    }

    @ObfuscatedName("ay.q(IIIIIIIIB)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3773;
        int var10 = Statics.field3771;
        int var11 = Statics.field3767;
        int[] var12 = new int[4];
        class315.method5341(var12);
        class18 var13 = this.method482(arg0, arg1, arg2, arg3);
        float var14 = this.method477(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field270 = var15;
        if (!this.field271.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method572();
            this.field271.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field144; var18 < var13.field148 + var13.field144; var18++) {
            for (int var19 = var13.field146; var19 < var13.field146 + var13.field145; var19++) {
                this.method479(var18, var19, var17);
                this.field273[var18][var19].method292(var15, (class36) this.field271.get(var15), var17, this.field272);
            }
        }
        class315.method5326(var9, var10, var11);
        class315.method5331(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field274 + arg0;
        int var22 = this.field275 + arg1;
        for (int var23 = var13.field144; var23 < var13.field148 + var13.field144; var23++) {
            for (int var24 = var13.field146; var24 < var13.field146 + var13.field145; var24++) {
                this.field273[var23][var24].method396((this.field273[var23][var24].field206 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field273[var23][var24].field207 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ay.x(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method482(arg0, arg1, arg2, arg3);
        float var15 = this.method477(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field274 + arg0;
        int var18 = this.field275 + arg1;
        for (int var19 = var14.field144; var19 < var14.field148 + var14.field144; var19++) {
            for (int var20 = var14.field146; var20 < var14.field146 + var14.field145; var20++) {
                if (arg12) {
                    this.field273[var19][var20].method315();
                }
                this.field273[var19][var20].method293((this.field273[var19][var20].field206 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field273[var19][var20].field207 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field144; var21 < var14.field148 + var14.field144; var21++) {
            for (int var22 = var14.field146; var22 < var14.field146 + var14.field145; var22++) {
                this.field273[var21][var22].method294(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ay.j(II[Lr;S)V")
    public void method479(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field273.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field273[0].length - 1;
        if (var7) {
            arg2[class241.field3129.method159()] = null;
        } else {
            arg2[class241.field3129.method159()] = this.field273[arg0][arg1 + 1];
        }
        arg2[class241.field3122.method159()] = var7 || var5 ? null : this.field273[arg0 + 1][arg1 + 1];
        arg2[class241.field3121.method159()] = var7 || var4 ? null : this.field273[arg0 - 1][arg1 + 1];
        arg2[class241.field3126.method159()] = var5 ? null : this.field273[arg0 + 1][arg1];
        arg2[class241.field3128.method159()] = var4 ? null : this.field273[arg0 - 1][arg1];
        arg2[class241.field3125.method159()] = var6 ? null : this.field273[arg0][arg1 - 1];
        arg2[class241.field3124.method159()] = var6 || var5 ? null : this.field273[arg0 + 1][arg1 - 1];
        arg2[class241.field3123.method159()] = var6 || var4 ? null : this.field273[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ay.a(IIIILjava/util/HashSet;III)V")
    public void method480(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field268 == null) {
            return;
        }
        this.field268.method5454(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field278 == null) {
            this.method484();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field278.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field248.field2582 - this.field274) * arg2 / this.field276;
                int var14 = arg3 - (var12.field248.field2584 - this.field275) * arg3 / this.field277;
                class315.method5383(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ay.l(IIIIIIIIIIB)Ljava/util/List;")
    public List method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field281) {
            return var11;
        }
        class18 var12 = this.method482(arg0, arg1, arg2, arg3);
        float var13 = this.method477(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field274 + arg0;
        int var16 = this.field275 + arg1;
        for (int var17 = var12.field144; var17 < var12.field148 + var12.field144; var17++) {
            for (int var18 = var12.field146; var18 < var12.field146 + var12.field145; var18++) {
                List var19 = this.field273[var17][var18].method322((this.field273[var17][var18].field206 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field273[var17][var18].field207 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ay.d(IIIIB)Le;")
    public class18 method482(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field274 + arg0;
        int var7 = this.field275 + arg1;
        int var8 = this.field274 + arg2;
        int var9 = this.field275 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field148 = var12 - var10 + 1;
        var5.field145 = var13 - var11 + 1;
        var5.field144 = var10 - this.field267.method201();
        var5.field146 = var11 - this.field267.method270();
        if (var5.field144 < 0) {
            var5.field148 += var5.field144;
            var5.field144 = 0;
        }
        if (var5.field144 > this.field273.length - var5.field148) {
            var5.field148 = this.field273.length - var5.field144;
        }
        if (var5.field146 < 0) {
            var5.field145 += var5.field146;
            var5.field146 = 0;
        }
        if (var5.field146 > this.field273[0].length - var5.field145) {
            var5.field145 = this.field273[0].length - var5.field146;
        }
        var5.field148 = Math.min(var5.field148, this.field273.length);
        var5.field145 = Math.min(var5.field145, this.field273[0].length);
        return var5;
    }

    @ObfuscatedName("ay.s(B)Z")
    public boolean method509() {
        return this.field281;
    }

    @ObfuscatedName("ay.p(I)Ljava/util/HashMap;")
    public HashMap method501() {
        this.method484();
        return this.field278;
    }

    @ObfuscatedName("ay.g(I)V")
    public void method484() {
        if (this.field278 == null) {
            this.field278 = new HashMap();
        }
        this.field278.clear();
        for (int var1 = 0; var1 < this.field273.length; var1++) {
            for (int var2 = 0; var2 < this.field273[var1].length; var2++) {
                List var3 = this.field273[var1][var2].method427();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field278.containsKey(var5.field252)) {
                        List var7 = (List) this.field278.get(var5.field252);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field278.put(var5.field252, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.y(III)F")
    public float method477(int arg0, int arg1) {
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
