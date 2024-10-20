package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ag")
public final class class43 {

    @ObfuscatedName("ag.d")
    public boolean field557 = false;

    @ObfuscatedName("ag.z")
    public boolean field550 = false;

    @ObfuscatedName("ag.n")
    public class46 field551;

    @ObfuscatedName("ag.r")
    public class332 field553;

    @ObfuscatedName("ag.e")
    public HashMap field554;

    @ObfuscatedName("ag.y")
    public class36[][] field555;

    @ObfuscatedName("ag.k")
    public HashMap field552 = new HashMap();

    @ObfuscatedName("ag.s")
    public class331[] field565;

    @ObfuscatedName("ag.p")
    public final HashMap field558;

    @ObfuscatedName("ag.x")
    public int field563;

    @ObfuscatedName("ag.m")
    public int field560;

    @ObfuscatedName("ag.h")
    public int field556;

    @ObfuscatedName("ag.t")
    public int field562;

    @ObfuscatedName("ag.i")
    public int field559 = 0;

    public class43(class331[] arg0, HashMap arg1) {
        this.field565 = arg0;
        this.field558 = arg1;
    }

    @ObfuscatedName("ag.d(Ljk;Ljava/lang/String;ZI)V")
    public void method506(class262 arg0, String arg1, boolean arg2) {
        if (this.field550) {
            return;
        }
        this.field557 = false;
        this.field550 = true;
        System.nanoTime();
        int var4 = arg0.method4290(class42.field547.field543);
        int var5 = arg0.method4292(var4, arg1);
        class195 var6 = new class195(arg0.method4294(class42.field547.field543, arg1));
        class195 var7 = new class195(arg0.method4294(class42.field542.field543, arg1));
        class195 var8 = new class195(arg0.method4294(arg1, class42.field545.field543));
        System.nanoTime();
        System.nanoTime();
        this.field551 = new class46();
        try {
            this.field551.method552(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field551.method270();
        this.field551.method271();
        this.field551.method272();
        this.field563 = this.field551.method278() * 64;
        this.field560 = this.field551.method268() * 64;
        this.field556 = (this.field551.method266() - this.field551.method278() + 1) * 64;
        this.field562 = (this.field551.method314() - this.field551.method268() + 1) * 64;
        int var10 = this.field551.method266() - this.field551.method278() + 1;
        int var11 = this.field551.method314() - this.field551.method268() + 1;
        System.nanoTime();
        System.nanoTime();
        class36.field486.method3715();
        class36.field485.method3715();
        this.field555 = new class36[var10][var11];
        Iterator var12 = this.field551.field575.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field412;
            int var15 = var13.field421;
            int var16 = var14 - this.field551.method278();
            int var17 = var15 - this.field551.method268();
            this.field555[var16][var17] = new class36(var14, var15, this.field551.method264(), this.field558);
            this.field555[var16][var17].method338(var13, this.field551.field577);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field555[var18][var19] == null) {
                    this.field555[var18][var19] = new class36(this.field551.method278() + var18, this.field551.method268() + var19, this.field551.method264(), this.field558);
                    this.field555[var18][var19].method339(this.field551.field576, this.field551.field577);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4293(class42.field549.field543, arg1)) {
            byte[] var20 = arg0.method4294(class42.field549.field543, arg1);
            this.field553 = class56.method671(var20);
        }
        System.nanoTime();
        arg0.method4287();
        arg0.method4296();
        this.field557 = true;
    }

    @ObfuscatedName("ag.z(I)V")
    public final void method541() {
        this.field554 = null;
    }

    @ObfuscatedName("ag.n(IIIIIIIIB)V")
    public final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3958;
        int var10 = Statics.field3953;
        int var11 = Statics.field3954;
        int[] var12 = new int[4];
        class328.method5414(var12);
        class30 var13 = this.method531(arg0, arg1, arg2, arg3);
        float var14 = this.method511(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field559 = var15;
        if (!this.field552.containsKey(var15)) {
            class48 var16 = new class48(var15);
            var16.method591();
            this.field552.put(var15, var16);
        }
        class36[] var17 = new class36[8];
        for (int var18 = var13.field430; var18 < var13.field433 + var13.field430; var18++) {
            for (int var19 = var13.field427; var19 < var13.field428 + var13.field427; var19++) {
                this.method510(var18, var19, var17);
                this.field555[var18][var19].method429(var15, (class48) this.field552.get(var15), var17, this.field565);
            }
        }
        class328.method5374(var9, var10, var11);
        class328.method5343(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field563 + arg0;
        int var22 = this.field560 + arg1;
        for (int var23 = var13.field430; var23 < var13.field433 + var13.field430; var23++) {
            for (int var24 = var13.field427; var24 < var13.field428 + var13.field427; var24++) {
                this.field555[var23][var24].method337((this.field555[var23][var24].field495 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field555[var23][var24].field489 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ag.r(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method531(arg0, arg1, arg2, arg3);
        float var15 = this.method511(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field563 + arg0;
        int var18 = this.field560 + arg1;
        for (int var19 = var14.field430; var19 < var14.field433 + var14.field430; var19++) {
            for (int var20 = var14.field427; var20 < var14.field428 + var14.field427; var20++) {
                if (arg12) {
                    this.field555[var19][var20].method365();
                }
                this.field555[var19][var20].method343((this.field555[var19][var20].field495 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field555[var19][var20].field489 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field430; var21 < var14.field433 + var14.field430; var21++) {
            for (int var22 = var14.field427; var22 < var14.field428 + var14.field427; var22++) {
                this.field555[var21][var22].method344(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ag.e(II[Laz;I)V")
    public void method510(int arg0, int arg1, class36[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field555.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field555[0].length - 1;
        if (var7) {
            arg2[class255.field3325.method12()] = null;
        } else {
            arg2[class255.field3325.method12()] = this.field555[arg0][arg1 + 1];
        }
        arg2[class255.field3316.method12()] = var7 || var5 ? null : this.field555[arg0 + 1][arg1 + 1];
        arg2[class255.field3322.method12()] = var7 || var4 ? null : this.field555[arg0 - 1][arg1 + 1];
        arg2[class255.field3317.method12()] = var5 ? null : this.field555[arg0 + 1][arg1];
        arg2[class255.field3321.method12()] = var4 ? null : this.field555[arg0 - 1][arg1];
        arg2[class255.field3319.method12()] = var6 ? null : this.field555[arg0][arg1 - 1];
        arg2[class255.field3318.method12()] = var6 || var5 ? null : this.field555[arg0 + 1][arg1 - 1];
        arg2[class255.field3320.method12()] = var6 || var4 ? null : this.field555[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ag.y(IIIILjava/util/HashSet;III)V")
    public void method529(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field553 == null) {
            return;
        }
        this.field553.method5524(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field554 == null) {
            this.method517();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field554.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class41 var12 = (class41) var11.next();
                int var13 = (var12.field532.field2791 - this.field563) * arg2 / this.field556;
                int var14 = arg3 - (var12.field532.field2789 - this.field560) * arg3 / this.field562;
                class328.method5346(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ag.k(IIIIIIIIIII)Ljava/util/List;")
    public List method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field557) {
            return var11;
        }
        class30 var12 = this.method531(arg0, arg1, arg2, arg3);
        float var13 = this.method511(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field563 + arg0;
        int var16 = this.field560 + arg1;
        for (int var17 = var12.field430; var17 < var12.field433 + var12.field430; var17++) {
            for (int var18 = var12.field427; var18 < var12.field428 + var12.field427; var18++) {
                List var19 = this.field555[var17][var18].method379((this.field555[var17][var18].field495 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field555[var17][var18].field489 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ag.s(IIIIB)Law;")
    public class30 method531(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field563 + arg0;
        int var7 = this.field560 + arg1;
        int var8 = this.field563 + arg2;
        int var9 = this.field560 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field433 = var12 - var10 + 1;
        var5.field428 = var13 - var11 + 1;
        var5.field430 = var10 - this.field551.method278();
        var5.field427 = var11 - this.field551.method268();
        if (var5.field430 < 0) {
            var5.field433 += var5.field430;
            var5.field430 = 0;
        }
        if (var5.field430 > this.field555.length - var5.field433) {
            var5.field433 = this.field555.length - var5.field430;
        }
        if (var5.field427 < 0) {
            var5.field428 += var5.field427;
            var5.field427 = 0;
        }
        if (var5.field427 > this.field555[0].length - var5.field428) {
            var5.field428 = this.field555[0].length - var5.field427;
        }
        var5.field433 = Math.min(var5.field433, this.field555.length);
        var5.field428 = Math.min(var5.field428, this.field555[0].length);
        return var5;
    }

    @ObfuscatedName("ag.x(I)Z")
    public boolean method514() {
        return this.field557;
    }

    @ObfuscatedName("ag.h(I)Ljava/util/HashMap;")
    public HashMap method515() {
        this.method517();
        return this.field554;
    }

    @ObfuscatedName("ag.t(B)V")
    public void method517() {
        if (this.field554 == null) {
            this.field554 = new HashMap();
        }
        this.field554.clear();
        for (int var1 = 0; var1 < this.field555.length; var1++) {
            for (int var2 = 0; var2 < this.field555[var1].length; var2++) {
                List var3 = this.field555[var1][var2].method373();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class41 var5 = (class41) var4.next();
                    if (this.field554.containsKey(var5.field536)) {
                        List var7 = (List) this.field554.get(var5.field536);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field554.put(var5.field536, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.i(III)F")
    public float method511(int arg0, int arg1) {
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
