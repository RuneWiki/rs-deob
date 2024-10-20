package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("av")
public class class35 {

    @ObfuscatedName("av.r")
    public int field456;

    @ObfuscatedName("av.h")
    public int field454;

    @ObfuscatedName("av.d")
    public class23 field458;

    @ObfuscatedName("av.s")
    public LinkedList field459;

    @ObfuscatedName("av.b")
    public int field460;

    @ObfuscatedName("av.e")
    public int field461;

    @ObfuscatedName("av.f")
    public int[][] field469;

    @ObfuscatedName("av.z")
    public class299 field462;

    @ObfuscatedName("av.u")
    public List field468;

    @ObfuscatedName("av.p")
    public HashMap field457;

    @ObfuscatedName("av.w")
    public final HashMap field463;

    @ObfuscatedName("av.t")
    public static final class224 field467 = new class224();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field456 = arg0;
        this.field454 = arg1;
        this.field459 = new LinkedList();
        this.field468 = new LinkedList();
        this.field457 = new HashMap();
        this.field460 = arg2 | 0xFF000000;
        this.field463 = arg3;
    }

    @ObfuscatedName("av.n(IIII)V")
    public void method422(int arg0, int arg1, int arg2) {
        if (this.field462 == null) {
            return;
        }
        if (this.field461 * 64 == arg2) {
            this.field462.method4864(arg0, arg1);
        } else {
            this.field462.method4874(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("av.v(Lg;Ljava/util/List;I)V")
    public void method318(class23 arg0, List arg1) {
        this.field457.clear();
        this.field458 = arg0;
        this.method320(0, 0, 64, 64, this.field458);
        this.method321(arg1);
    }

    @ObfuscatedName("av.y(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method319(HashSet arg0, List arg1) {
        this.field457.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method222() == this.field456 && var4.method205() == this.field454) {
                this.field459.add(var4);
                this.method320(var4.method555() * 8, var4.method565() * 8, 8, 8, var4);
            }
        }
        this.method321(arg1);
    }

    @ObfuscatedName("av.r(IIIILat;I)V")
    public void method320(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class224 var8 = new class224(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field394; var9++) {
                    class32[] var10 = arg4.field399[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class254 var14 = this.method356(var13.field423);
                            if (var14 != null) {
                                class224 var15 = new class224(var9, this.field456 * 64 + var6, this.field454 * 64 + var7);
                                Object var16 = null;
                                class224 var17;
                                if (this.field458 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class224(var18.field390 + var9, var18.field391 * 64 + var6 + var18.method569() * 8, var18.field389 * 64 + var7 + var18.method556() * 8);
                                } else {
                                    var17 = new class224(this.field458.field390 + var9, this.field458.field391 * 64 + var6, this.field458.field389 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3385, var17, var15, this.method352(var14));
                                this.field457.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.h(Ljava/util/List;I)V")
    public void method321(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field359.field2730 >> 6 == this.field456 && var3.field359.field2731 >> 6 == this.field454) {
                class40 var4 = new class40(var3.field357, var3.field359, var3.field359, this.method415(var3.field357));
                this.field468.add(var4);
            }
        }
    }

    @ObfuscatedName("av.d(ILas;[Lav;[Lkm;I)Z")
    public boolean method322(int arg0, class47 arg1, class35[] arg2, class298[] arg3) {
        if (!this.method411(arg0)) {
            return false;
        } else if (this.field458 == null && this.field459.isEmpty()) {
            return false;
        } else {
            this.method331(arg2);
            this.field462.method4850();
            if (this.field458 == null) {
                this.method438(arg1, arg3);
            } else {
                this.method361(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("av.s(IIILjava/util/HashSet;B)V")
    public void method338(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method317(arg0, arg1, arg3, arg2);
        this.method345(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("av.b(Ljava/util/HashSet;III)V")
    public void method324(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field457.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field513)) {
                class254 var6 = Statics.field3384[var5.field513];
                this.method341(var6, var5.field509, var5.field511, arg1, arg2);
            }
        }
        this.method386(arg0, arg1, arg2);
    }

    @ObfuscatedName("av.e(II)Z")
    public boolean method411(int arg0) {
        if (this.field462 != null && this.field461 == arg0) {
            return false;
        } else {
            this.field461 = arg0;
            this.field462 = new class299(this.field461 * 64, this.field461 * 64);
            return true;
        }
    }

    @ObfuscatedName("av.f(Las;[Lav;[Lkm;I)V")
    public void method361(class47 arg0, class35[] arg1, class298[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method370(var4, var5, this.field458, arg0);
                this.method394(var4, var5, this.field458, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method350(var6, var7, this.field458, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("av.u(Las;[Lkm;I)V")
    public void method438(class47 arg0, class298[] arg1) {
        Iterator var3 = this.field459.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method555() * 8; var5 < var4.method555() * 8 + 8; var5++) {
                for (int var6 = var4.method565() * 8; var6 < var4.method565() * 8 + 8; var6++) {
                    this.method370(var5, var6, var4, arg0);
                    this.method394(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field459.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method555() * 8; var9 < var8.method555() * 8 + 8; var9++) {
                for (int var10 = var8.method565() * 8; var10 < var8.method565() * 8 + 8; var10++) {
                    this.method350(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("av.t(IILat;Las;[Lkm;I)V")
    public void method350(int arg0, int arg1, class29 arg2, class47 arg3, class298[] arg4) {
        this.method348(arg0, arg1, arg2);
        this.method337(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("av.o(IILat;Las;B)V")
    public void method370(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field395[0][arg0][arg1] - 1;
        int var6 = arg2.field396[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class295.method4752(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, this.field460);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method147(var6, this.field460);
        }
        if (var6 > -1 && arg2.field397[0][arg0][arg1] == 0) {
            class295.method4752(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, var7);
            return;
        }
        int var8 = this.method336(arg0, arg1, arg2);
        if (var6 == -1) {
            class295.method4752(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, var8);
        } else {
            arg3.method582(this.field461 * arg0, this.field461 * (63 - arg1), var8, var7, this.field461, this.field461, arg2.field397[0][arg0][arg1], arg2.field398[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("av.a(IILat;Las;I)V")
    public void method394(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field394; var5++) {
            int var6 = arg2.field396[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method147(var6, this.field460);
                if (arg2.field397[var5][arg0][arg1] == 0) {
                    class295.method4752(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, var7);
                } else {
                    arg3.method582(this.field461 * arg0, this.field461 * (63 - arg1), 0, var7, this.field461, this.field461, arg2.field397[var5][arg0][arg1], arg2.field398[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("av.i([Lav;B)Z")
    public boolean method331(class35[] arg0) {
        if (this.field469 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field458 == null) {
            Iterator var3 = this.field459.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method404(var4.method555() * 8, var4.method565() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method404(0, 0, 64, 64, this.field458, var2);
        }
        this.method333(arg0, var2);
        this.method346(var2);
        return true;
    }

    @ObfuscatedName("av.m(Lay;I)V")
    public void method346(class44 arg0) {
        this.field469 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field469[var2][var3] = arg0.method529(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("av.x([Lav;Lay;I)V")
    public void method333(class35[] arg0, class44 arg1) {
        class240[] var3 = class240.method2960();
        class240[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class240 var6 = var4[var5];
            if (arg0[var6.method6()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3255) {
                    case 0:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 2:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 4:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                }
                this.method335(var11, var12, var7, var8, var9, var10, arg0[var6.method6()], arg1);
            }
        }
    }

    @ObfuscatedName("av.j(IIIILat;Lay;S)V")
    public void method404(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field395[0][var7][var8] - 1;
                if (var9 != -1) {
                    class258 var10 = class258.method1036(var9);
                    arg5.method535(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("av.g(IIIIIILav;Lay;I)V")
    public void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method387(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class258 var12 = class258.method1036(var11);
                    arg7.method535(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("av.c(IILat;I)I")
    public int method336(int arg0, int arg1, class29 arg2) {
        return arg2.field395[0][arg0][arg1] == 0 ? this.field460 : this.field469[arg0][arg1];
    }

    @ObfuscatedName("av.k(IILat;[Lkm;I)V")
    public void method337(int arg0, int arg1, class29 arg2, class298[] arg3) {
        for (int var5 = 0; var5 < arg2.field394; var5++) {
            class32[] var6 = arg2.field399[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class233.method2932(var9.field421)) {
                        int var10 = var9.field421;
                        boolean var11 = class233.field2943.field2944 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class267 var12 = class267.method1587(var9.field423);
                    if (var12.field3522 != -1) {
                        if (var12.field3522 == 46 || var12.field3522 == 52) {
                            arg3[var12.field3522].method4832(this.field461 * arg0, this.field461 * (63 - arg1), this.field461 * 2 + 1, this.field461 * 2 + 1);
                        } else {
                            arg3[var12.field3522].method4832(this.field461 * arg0, this.field461 * (63 - arg1), this.field461 * 2, this.field461 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.q(IILat;I)V")
    public void method348(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field394; var4++) {
            class32[] var5 = arg2.field399[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class233.method4134(var8.field421)) {
                        class267 var9 = class267.method1587(var8.field423);
                        int var10 = var9.field3524 == 0 ? -3355444 : -3407872;
                        if (class233.field2946.field2944 == var8.field421) {
                            this.method355(arg0, arg1, var8.field422, var10);
                        }
                        if (class233.field2930.field2944 == var8.field421) {
                            this.method355(arg0, arg1, var8.field422, -3355444);
                            this.method355(arg0, arg1, var8.field422 + 1, var10);
                        }
                        if (class233.field2939.field2944 == var8.field421) {
                            if (var8.field422 == 0) {
                                class295.method4775(this.field461 * arg0, this.field461 * (63 - arg1), 1, var10);
                            }
                            if (var8.field422 == 1) {
                                class295.method4775(this.field461 * arg0 + this.field461 - 1, this.field461 * (63 - arg1), 1, var10);
                            }
                            if (var8.field422 == 2) {
                                class295.method4775(this.field461 * arg0 + this.field461 - 1, this.field461 * (63 - arg1) + this.field461 - 1, 1, var10);
                            }
                            if (var8.field422 == 3) {
                                class295.method4775(this.field461 * arg0, this.field461 * (63 - arg1) + this.field461 - 1, 1, var10);
                            }
                        }
                        if (class233.field2937.field2944 == var8.field421) {
                            int var11 = var8.field422 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field461; var12++) {
                                    class295.method4775(this.field461 * arg0 + var12, this.field461 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field461; var13++) {
                                    class295.method4775(this.field461 * arg0 + var13, this.field461 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.ac(IILjava/util/HashSet;IB)V")
    public void method317(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field457.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class224 var9 = (class224) var8.getKey();
            int var10 = (int) ((float) var9.field2730 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2731 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field509 = var10;
                var12.field511 = var11;
                class254 var13 = Statics.field3384[var12.field513];
                if (!arg2.contains(var13.method4094())) {
                    this.method342(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("av.aw(Ljava/util/HashSet;III)V")
    public void method386(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field468.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class254 var6 = Statics.field3384[var5.field513];
            if (var6 != null && arg0.contains(var6.method4094())) {
                this.method341(var6, var5.field509, var5.field511, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("av.at(Lie;IIIII)V")
    public void method341(class254 arg0, int arg1, int arg2, int arg3, int arg4) {
        class299 var6 = arg0.method4092(false);
        if (var6 == null) {
            return;
        }
        var6.method4859(arg1 - var6.field3861 / 2, arg2 - var6.field3858 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class295.method4747(arg1, arg2, 15, 16776960, 128);
            class295.method4747(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("av.ag(Laj;IIFB)V")
    public void method342(class40 arg0, int arg1, int arg2, float arg3) {
        class254 var5 = Statics.field3384[arg0.field513];
        this.method430(var5, arg1, arg2);
        this.method344(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("av.ad(Lie;III)V")
    public void method430(class254 arg0, int arg1, int arg2) {
        class299 var4 = arg0.method4092(false);
        if (var4 != null) {
            int var5 = this.method354(var4, arg0.field3398);
            int var6 = this.method349(var4, arg0.field3381);
            var4.method4859(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("av.af(Laj;Lie;IIFS)V")
    public void method344(class40 arg0, class254 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field514 != null && arg0.field514.field450.method164(arg4)) {
            class275 var6 = (class275) this.field463.get(arg0.field514.field450);
            var6.method4550(arg0.field514.field447, arg2 - arg0.field514.field448 / 2, arg3, arg0.field514.field448, arg0.field514.field451, 0xFF000000 | arg1.field3395, 0, 1, 0, var6.field3722 / 2);
        }
    }

    @ObfuscatedName("av.az(IILjava/util/HashSet;IS)V")
    public void method345(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field468.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field515.field2730 % 64;
            int var9 = var7.field515.field2731 % 64;
            var7.field509 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field511 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field513)) {
                this.method342(var7, var7.field509, var7.field511, var5);
            }
        }
    }

    @ObfuscatedName("av.ae(I)V")
    public void method378() {
        if (this.field458 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method347(var1, var2, this.field458);
                }
            }
            return;
        }
        Iterator var3 = this.field459.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method555() * 8; var5 < var4.method555() * 8 + 8; var5++) {
                for (int var6 = var4.method565() * 8; var6 < var4.method565() * 8 + 8; var6++) {
                    this.method347(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("av.av(IILat;I)V")
    public void method347(int arg0, int arg1, class29 arg2) {
        field467.method3772(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field394; var4++) {
            class32[] var5 = arg2.field399[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class254 var9 = this.method356(var8.field423);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field457.get(field467);
                        if (var10 != null) {
                            if (var9.field3385 != var10.field513) {
                                class40 var11 = new class40(var9.field3385, var10.field510, var10.field515, this.method352(var9));
                                this.field457.put(new class224(field467), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field510.field2729 - var10.field515.field2729;
                            var10.field515.field2729 = var4;
                            var10.field510.field2729 = var4 + var12;
                            return;
                        }
                        class224 var13 = new class224(var4, this.field456 * 64 + arg0, this.field454 * 64 + arg1);
                        class224 var14 = null;
                        if (this.field458 == null) {
                            Iterator var15 = this.field459.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method554(arg0, arg1)) {
                                    var14 = new class224(var16.field390 + var4, var16.field391 * 64 + arg0 + var16.method569() * 8, var16.field389 * 64 + arg1 + var16.method556() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class224(this.field458.field390 + var4, this.field458.field391 * 64 + arg0, this.field458.field389 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3385, var14, var13, this.method352(var9));
                            this.field457.put(new class224(field467), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field457.remove(field467);
    }

    @ObfuscatedName("av.am(Lkg;Ljt;B)I")
    public int method354(class299 arg0, class269 arg1) {
        switch(arg1.field3628) {
            case 0:
                return -arg0.field3861 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3861;
        }
    }

    @ObfuscatedName("av.ax(Lkg;Liv;I)I")
    public int method349(class299 arg0, class251 arg1) {
        switch(arg1.field3369) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3858 / 2;
            default:
                return -arg0.field3858;
        }
    }

    @ObfuscatedName("av.ah(IB)Lie;")
    public class254 method356(int arg0) {
        class267 var2 = class267.method1587(arg0);
        if (var2.field3549 != null) {
            var2 = var2.method4334();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3556 == -1 ? null : Statics.field3384[var2.field3556];
    }

    @ObfuscatedName("av.ab(II)Lae;")
    public class34 method415(int arg0) {
        class254 var2 = Statics.field3384[arg0];
        return this.method352(var2);
    }

    @ObfuscatedName("av.aj(Lie;B)Lae;")
    public class34 method352(class254 arg0) {
        if (arg0.field3391 == null || this.field463 == null || this.field463.get(class25.field352) == null) {
            return null;
        }
        int var2 = arg0.field3390;
        class25[] var3 = new class25[] { class25.field350, class25.field352, class25.field349 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field353 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class275 var9 = (class275) this.field463.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4627(arg0.field3391, 1000000);
        String[] var11 = new String[var10];
        var9.method4542(arg0.field3391, (int[]) null, var11);
        int var12 = var11.length * var9.field3722 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4541(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3391, var13, var12, var7);
    }

    @ObfuscatedName("av.aa(IIIIII)Ljava/util/List;")
    public List method353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field457.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method479(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field468.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method479(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("av.ao(B)Ljava/util/List;")
    public List method343() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field468);
        var1.addAll(this.field457.values());
        return var1;
    }

    @ObfuscatedName("av.al(IIIIB)V")
    public void method355(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class295.method4757(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, arg3);
        }
        if (var5 == 1) {
            class295.method4775(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, arg3);
        }
        if (var5 == 2) {
            class295.method4757(this.field461 * arg0 + this.field461 - 1, this.field461 * (63 - arg1), this.field461, arg3);
        }
        if (var5 == 3) {
            class295.method4775(this.field461 * arg0, this.field461 * (63 - arg1) + this.field461 - 1, this.field461, arg3);
        }
    }

    @ObfuscatedName("av.ay(IIB)I")
    public int method387(int arg0, int arg1) {
        if (this.field458 != null) {
            return this.field458.method209(arg0, arg1);
        }
        if (!this.field459.isEmpty()) {
            Iterator var3 = this.field459.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method554(arg0, arg1)) {
                    return var4.method209(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
