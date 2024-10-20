package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ak")
public class class35 {

    @ObfuscatedName("ak.j")
    public int field453;

    @ObfuscatedName("ak.v")
    public int field452;

    @ObfuscatedName("ak.x")
    public class23 field456;

    @ObfuscatedName("ak.e")
    public LinkedList field457;

    @ObfuscatedName("ak.l")
    public int field458;

    @ObfuscatedName("ak.b")
    public int field459;

    @ObfuscatedName("ak.n")
    public int[][] field460;

    @ObfuscatedName("ak.c")
    public class295 field455;

    @ObfuscatedName("ak.a")
    public List field462;

    @ObfuscatedName("ak.y")
    public HashMap field463;

    @ObfuscatedName("ak.w")
    public final HashMap field464;

    @ObfuscatedName("ak.k")
    public static final class220 field465 = new class220();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field453 = arg0;
        this.field452 = arg1;
        this.field457 = new LinkedList();
        this.field462 = new LinkedList();
        this.field463 = new HashMap();
        this.field458 = arg2 | 0xFF000000;
        this.field464 = arg3;
    }

    @ObfuscatedName("ak.m(IIII)V")
    public void method445(int arg0, int arg1, int arg2) {
        if (this.field455 == null) {
            return;
        }
        if (this.field459 * 64 == arg2) {
            this.field455.method4890(arg0, arg1);
        } else {
            this.field455.method4907(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ak.p(Ld;Ljava/util/List;I)V")
    public void method359(class23 arg0, List arg1) {
        this.field463.clear();
        this.field456 = arg0;
        this.method361(0, 0, 64, 64, this.field456);
        this.method362(arg1);
    }

    @ObfuscatedName("ak.i(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method393(HashSet arg0, List arg1) {
        this.field463.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method250() == this.field453 && var4.method234() == this.field452) {
                this.field457.add(var4);
                this.method361(var4.method606() * 8, var4.method607() * 8, 8, 8, var4);
            }
        }
        this.method362(arg1);
    }

    @ObfuscatedName("ak.j(IIIILaq;I)V")
    public void method361(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class220 var8 = new class220(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field392; var9++) {
                    class32[] var10 = arg4.field402[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class250 var14 = this.method406(var13.field430);
                            if (var14 != null) {
                                class220 var15 = new class220(var9, this.field453 * 64 + var6, this.field452 * 64 + var7);
                                Object var16 = null;
                                class220 var17;
                                if (this.field456 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class220(var18.field396 + var9, var18.field400 * 64 + var6 + var18.method609() * 8, var18.field393 * 64 + var7 + var18.method605() * 8);
                                } else {
                                    var17 = new class220(this.field456.field396 + var9, this.field456.field400 * 64 + var6, this.field456.field393 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3353, var17, var15, this.method378(var14));
                                this.field463.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.v(Ljava/util/List;I)V")
    public void method362(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field360.field2692 >> 6 == this.field453 && var3.field360.field2691 >> 6 == this.field452) {
                class40 var4 = new class40(var3.field358, var3.field360, var3.field360, this.method392(var3.field358));
                this.field462.add(var4);
            }
        }
    }

    @ObfuscatedName("ak.x(ILaf;[Lak;[Lko;I)Z")
    public boolean method363(int arg0, class47 arg1, class35[] arg2, class294[] arg3) {
        if (!this.method366(arg0)) {
            return false;
        } else if (this.field456 == null && this.field457.isEmpty()) {
            return false;
        } else {
            this.method443(arg2);
            this.field455.method4883();
            if (this.field456 == null) {
                this.method368(arg1, arg3);
            } else {
                this.method481(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ak.e(IIILjava/util/HashSet;I)V")
    public void method364(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method380(arg0, arg1, arg3, arg2);
        this.method386(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ak.l(Ljava/util/HashSet;IIB)V")
    public void method391(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field463.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field509)) {
                class250 var6 = Statics.field3359[var5.field509];
                this.method382(var6, var5.field505, var5.field506, arg1, arg2);
            }
        }
        this.method381(arg0, arg1, arg2);
    }

    @ObfuscatedName("ak.b(IB)Z")
    public boolean method366(int arg0) {
        if (this.field455 != null && this.field459 == arg0) {
            return false;
        } else {
            this.field459 = arg0;
            this.field455 = new class295(this.field459 * 64, this.field459 * 64);
            return true;
        }
    }

    @ObfuscatedName("ak.n(Laf;[Lak;[Lko;I)V")
    public void method481(class47 arg0, class35[] arg1, class294[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method370(var4, var5, this.field456, arg0);
                this.method371(var4, var5, this.field456, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method369(var6, var7, this.field456, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ak.c(Laf;[Lko;I)V")
    public void method368(class47 arg0, class294[] arg1) {
        Iterator var3 = this.field457.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method606() * 8; var5 < var4.method606() * 8 + 8; var5++) {
                for (int var6 = var4.method607() * 8; var6 < var4.method607() * 8 + 8; var6++) {
                    this.method370(var5, var6, var4, arg0);
                    this.method371(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field457.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method606() * 8; var9 < var8.method606() * 8 + 8; var9++) {
                for (int var10 = var8.method607() * 8; var10 < var8.method607() * 8 + 8; var10++) {
                    this.method369(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ak.a(IILaq;Laf;[Lko;I)V")
    public void method369(int arg0, int arg1, class29 arg2, class47 arg3, class294[] arg4) {
        this.method358(arg0, arg1, arg2);
        this.method468(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ak.y(IILaq;Laf;I)V")
    public void method370(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field397[0][arg0][arg1] - 1;
        int var6 = arg2.field398[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class291.method4776(this.field459 * arg0, this.field459 * (63 - arg1), this.field459, this.field459, this.field458);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method1060(var6, this.field458);
        }
        if (var6 > -1 && arg2.field399[0][arg0][arg1] == 0) {
            class291.method4776(this.field459 * arg0, this.field459 * (63 - arg1), this.field459, this.field459, var7);
            return;
        }
        int var8 = this.method377(arg0, arg1, arg2);
        if (var6 == -1) {
            class291.method4776(this.field459 * arg0, this.field459 * (63 - arg1), this.field459, this.field459, var8);
        } else {
            arg3.method631(this.field459 * arg0, this.field459 * (63 - arg1), var8, var7, this.field459, this.field459, arg2.field399[0][arg0][arg1], arg2.field401[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ak.w(IILaq;Laf;B)V")
    public void method371(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field392; var5++) {
            int var6 = arg2.field398[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method1060(var6, this.field458);
                if (arg2.field399[var5][arg0][arg1] == 0) {
                    class291.method4776(this.field459 * arg0, this.field459 * (63 - arg1), this.field459, this.field459, var7);
                } else {
                    arg3.method631(this.field459 * arg0, this.field459 * (63 - arg1), 0, var7, this.field459, this.field459, arg2.field399[var5][arg0][arg1], arg2.field401[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ak.k([Lak;I)Z")
    public boolean method443(class35[] arg0) {
        if (this.field460 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field456 == null) {
            Iterator var3 = this.field457.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method375(var4.method606() * 8, var4.method607() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method375(0, 0, 64, 64, this.field456, var2);
        }
        this.method374(arg0, var2);
        this.method373(var2);
        return true;
    }

    @ObfuscatedName("ak.t(Lac;I)V")
    public void method373(class44 arg0) {
        this.field460 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field460[var2][var3] = arg0.method579(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ak.h([Lak;Lac;I)V")
    public void method374(class35[] arg0, class44 arg1) {
        class236[] var3 = class236.method2379();
        class236[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class236 var6 = var4[var5];
            if (arg0[var6.method9()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3227) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 2:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 4:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                }
                this.method376(var11, var12, var7, var8, var9, var10, arg0[var6.method9()], arg1);
            }
        }
    }

    @ObfuscatedName("ak.u(IIIILaq;Lac;B)V")
    public void method375(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field397[0][var7][var8] - 1;
                if (var9 != -1) {
                    class254 var10 = class254.method5(var9);
                    arg5.method584(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ak.r(IIIIIILak;Lac;B)V")
    public void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method397(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class254 var12 = class254.method5(var11);
                    arg7.method584(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ak.o(IILaq;I)I")
    public int method377(int arg0, int arg1, class29 arg2) {
        return arg2.field397[0][arg0][arg1] == 0 ? this.field458 : this.field460[arg0][arg1];
    }

    @ObfuscatedName("ak.q(IILaq;[Lko;I)V")
    public void method468(int arg0, int arg1, class29 arg2, class294[] arg3) {
        for (int var5 = 0; var5 < arg2.field392; var5++) {
            class32[] var6 = arg2.field402[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field424;
                    boolean var11 = var10 >= class229.field2901.field2888 && var10 <= class229.field2902.field2888;
                    if (var11 || class229.method2762(var9.field424)) {
                        class263 var12 = class263.method190(var9.field430);
                        if (var12.field3517 != -1) {
                            if (var12.field3517 == 46 || var12.field3517 == 52) {
                                arg3[var12.field3517].method4866(this.field459 * arg0, this.field459 * (63 - arg1), this.field459 * 2 + 1, this.field459 * 2 + 1);
                            } else {
                                arg3[var12.field3517].method4866(this.field459 * arg0, this.field459 * (63 - arg1), this.field459 * 2, this.field459 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.al(IILaq;I)V")
    public void method358(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field392; var4++) {
            class32[] var5 = arg2.field402[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class229.method1977(var8.field424)) {
                        class263 var9 = class263.method190(var8.field430);
                        int var10 = var9.field3507 == 0 ? -3355444 : -3407872;
                        if (class229.field2889.field2888 == var8.field424) {
                            this.method396(arg0, arg1, var8.field425, var10);
                        }
                        if (class229.field2883.field2888 == var8.field424) {
                            this.method396(arg0, arg1, var8.field425, -3355444);
                            this.method396(arg0, arg1, var8.field425 + 1, var10);
                        }
                        if (class229.field2884.field2888 == var8.field424) {
                            if (var8.field425 == 0) {
                                class291.method4855(this.field459 * arg0, this.field459 * (63 - arg1), 1, var10);
                            }
                            if (var8.field425 == 1) {
                                class291.method4855(this.field459 * arg0 + this.field459 - 1, this.field459 * (63 - arg1), 1, var10);
                            }
                            if (var8.field425 == 2) {
                                class291.method4855(this.field459 * arg0 + this.field459 - 1, this.field459 * (63 - arg1) + this.field459 - 1, 1, var10);
                            }
                            if (var8.field425 == 3) {
                                class291.method4855(this.field459 * arg0, this.field459 * (63 - arg1) + this.field459 - 1, 1, var10);
                            }
                        }
                        if (class229.field2885.field2888 == var8.field424) {
                            int var11 = var8.field425 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field459; var12++) {
                                    class291.method4855(this.field459 * arg0 + var12, this.field459 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field459; var13++) {
                                    class291.method4855(this.field459 * arg0 + var13, this.field459 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ao(IILjava/util/HashSet;II)V")
    public void method380(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field463.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class220 var9 = (class220) var8.getKey();
            int var10 = (int) ((float) var9.field2692 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2691 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field505 = var10;
                var12.field506 = var11;
                class250 var13 = Statics.field3359[var12.field509];
                if (!arg2.contains(var13.method4116())) {
                    this.method484(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ak.aq(Ljava/util/HashSet;III)V")
    public void method381(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field462.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class250 var6 = Statics.field3359[var5.field509];
            if (var6 != null && arg0.contains(var6.method4116())) {
                this.method382(var6, var5.field505, var5.field506, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ak.ab(Lif;IIIII)V")
    public void method382(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        class295 var6 = arg0.method4119(false);
        if (var6 == null) {
            return;
        }
        var6.method4892(arg1 - var6.field3840 / 2, arg2 - var6.field3839 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class291.method4774(arg1, arg2, 15, 16776960, 128);
            class291.method4774(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ak.as(Lay;IIFI)V")
    public void method484(class40 arg0, int arg1, int arg2, float arg3) {
        class250 var5 = Statics.field3359[arg0.field509];
        this.method384(var5, arg1, arg2);
        this.method385(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.ag(Lif;III)V")
    public void method384(class250 arg0, int arg1, int arg2) {
        class295 var4 = arg0.method4119(false);
        if (var4 != null) {
            int var5 = this.method389(var4, arg0.field3349);
            int var6 = this.method390(var4, arg0.field3350);
            var4.method4892(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ak.ap(Lay;Lif;IIFI)V")
    public void method385(class40 arg0, class250 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field504 != null && arg0.field504.field447.method183(arg4)) {
            class271 var6 = (class271) this.field464.get(arg0.field504.field447);
            var6.method4564(arg0.field504.field448, arg2 - arg0.field504.field449 / 2, arg3, arg0.field504.field449, arg0.field504.field446, 0xFF000000 | arg1.field3367, 0, 1, 0, var6.field3698 / 2);
        }
    }

    @ObfuscatedName("ak.av(IILjava/util/HashSet;IB)V")
    public void method386(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field462.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field500.field2692 % 64;
            int var9 = var7.field500.field2691 % 64;
            var7.field505 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field506 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field509)) {
                this.method484(var7, var7.field505, var7.field506, var5);
            }
        }
    }

    @ObfuscatedName("ak.ak(I)V")
    public void method491() {
        if (this.field456 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method367(var1, var2, this.field456);
                }
            }
            return;
        }
        Iterator var3 = this.field457.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method606() * 8; var5 < var4.method606() * 8 + 8; var5++) {
                for (int var6 = var4.method607() * 8; var6 < var4.method607() * 8 + 8; var6++) {
                    this.method367(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ak.at(IILaq;I)V")
    public void method367(int arg0, int arg1, class29 arg2) {
        field465.method3768(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field392; var4++) {
            class32[] var5 = arg2.field402[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class250 var9 = this.method406(var8.field430);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field463.get(field465);
                        if (var10 != null) {
                            if (var9.field3353 != var10.field509) {
                                class40 var11 = new class40(var9.field3353, var10.field499, var10.field500, this.method378(var9));
                                this.field463.put(new class220(field465), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field499.field2695 - var10.field500.field2695;
                            var10.field500.field2695 = var4;
                            var10.field499.field2695 = var4 + var12;
                            return;
                        }
                        class220 var13 = new class220(var4, this.field453 * 64 + arg0, this.field452 * 64 + arg1);
                        class220 var14 = null;
                        if (this.field456 == null) {
                            Iterator var15 = this.field457.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method602(arg0, arg1)) {
                                    var14 = new class220(var16.field396 + var4, var16.field400 * 64 + arg0 + var16.method609() * 8, var16.field393 * 64 + arg1 + var16.method605() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class220(this.field456.field396 + var4, this.field456.field400 * 64 + arg0, this.field456.field393 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3353, var14, var13, this.method378(var9));
                            this.field463.put(new class220(field465), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field463.remove(field465);
    }

    @ObfuscatedName("ak.an(Lkd;Lju;B)I")
    public int method389(class295 arg0, class265 arg1) {
        switch(arg1.field3599) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3840 / 2;
            default:
                return -arg0.field3840;
        }
    }

    @ObfuscatedName("ak.ah(Lkd;Lic;B)I")
    public int method390(class295 arg0, class247 arg1) {
        switch(arg1.field3339) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3839 / 2;
            default:
                return -arg0.field3839;
        }
    }

    @ObfuscatedName("ak.am(IS)Lif;")
    public class250 method406(int arg0) {
        class263 var2 = class263.method190(arg0);
        if (var2.field3519 != null) {
            var2 = var2.method4337();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3493 == -1 ? null : Statics.field3359[var2.field3493];
    }

    @ObfuscatedName("ak.ay(IB)Lav;")
    public class34 method392(int arg0) {
        class250 var2 = Statics.field3359[arg0];
        return this.method378(var2);
    }

    @ObfuscatedName("ak.az(Lif;I)Lav;")
    public class34 method378(class250 arg0) {
        if (arg0.field3358 == null || this.field464 == null || this.field464.get(class25.field357) == null) {
            return null;
        }
        class25 var2 = class25.method185(arg0.field3355);
        if (var2 == null) {
            return null;
        }
        class271 var3 = (class271) this.field464.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4558(arg0.field3358, 1000000);
        String[] var5 = new String[var4];
        var3.method4556(arg0.field3358, (int[]) null, var5);
        int var6 = var5.length * var3.field3698 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4555(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3358, var7, var6, var2);
    }

    @ObfuscatedName("ak.aw(IIIIII)Ljava/util/List;")
    public List method394(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field463.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method516(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field462.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method516(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ak.au(I)Ljava/util/List;")
    public List method425() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field462);
        var1.addAll(this.field463.values());
        return var1;
    }

    @ObfuscatedName("ak.ac(IIIII)V")
    public void method396(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class291.method4807(this.field459 * arg0, this.field459 * (63 - arg1), this.field459, arg3);
        }
        if (var5 == 1) {
            class291.method4855(this.field459 * arg0, this.field459 * (63 - arg1), this.field459, arg3);
        }
        if (var5 == 2) {
            class291.method4807(this.field459 * arg0 + this.field459 - 1, this.field459 * (63 - arg1), this.field459, arg3);
        }
        if (var5 == 3) {
            class291.method4855(this.field459 * arg0, this.field459 * (63 - arg1) + this.field459 - 1, this.field459, arg3);
        }
    }

    @ObfuscatedName("ak.ai(III)I")
    public int method397(int arg0, int arg1) {
        if (this.field456 != null) {
            return this.field456.method232(arg0, arg1);
        }
        if (!this.field457.isEmpty()) {
            Iterator var3 = this.field457.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method602(arg0, arg1)) {
                    return var4.method232(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
