package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ak")
public class class35 {

    @ObfuscatedName("ak.u")
    public int field465;

    @ObfuscatedName("ak.g")
    public int field466;

    @ObfuscatedName("ak.m")
    public class23 field467;

    @ObfuscatedName("ak.s")
    public LinkedList field468;

    @ObfuscatedName("ak.x")
    public int field473;

    @ObfuscatedName("ak.p")
    public int field475;

    @ObfuscatedName("ak.k")
    public int[][] field471;

    @ObfuscatedName("ak.r")
    public class286 field472;

    @ObfuscatedName("ak.w")
    public List field464;

    @ObfuscatedName("ak.v")
    public HashMap field474;

    @ObfuscatedName("ak.h")
    public final HashMap field462;

    @ObfuscatedName("ak.t")
    public static final class213 field476 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field465 = arg0;
        this.field466 = arg1;
        this.field468 = new LinkedList();
        this.field464 = new LinkedList();
        this.field474 = new HashMap();
        this.field473 = arg2 | 0xFF000000;
        this.field462 = arg3;
    }

    @ObfuscatedName("ak.c(IIII)V")
    public void method386(int arg0, int arg1, int arg2) {
        if (this.field472 == null) {
            return;
        }
        if (this.field475 * 64 == arg2) {
            this.field472.method4629(arg0, arg1);
        } else {
            this.field472.method4646(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ak.o(Ln;Ljava/util/List;I)V")
    public void method319(class23 arg0, List arg1) {
        this.field474.clear();
        this.field467 = arg0;
        this.method403(0, 0, 64, 64, this.field467);
        this.method322(arg1);
    }

    @ObfuscatedName("ak.i(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method345(HashSet arg0, List arg1) {
        this.field474.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method225() == this.field465 && var4.method211() == this.field466) {
                this.field468.add(var4);
                this.method403(var4.method540() * 8, var4.method538() * 8, 8, 8, var4);
            }
        }
        this.method322(arg1);
    }

    @ObfuscatedName("ak.u(IIIILam;B)V")
    public void method403(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field406; var9++) {
                    class32[] var10 = arg4.field398[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method351(var13.field434);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field465 * 64 + var6, this.field466 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field467 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field397 + var9, var18.field404 * 64 + var6 + var18.method554() * 8, var18.field394 * 64 + var7 + var18.method535() * 8);
                                } else {
                                    var17 = new class213(this.field467.field397 + var9, this.field467.field404 * 64 + var6, this.field467.field394 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3276, var17, var15, this.method375(var14));
                                this.field474.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.g(Ljava/util/List;I)V")
    public void method322(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field353.field2579 >> 6 == this.field465 && var3.field353.field2578 >> 6 == this.field466) {
                class40 var4 = new class40(var3.field357, var3.field353, var3.field353, this.method342(var3.field357));
                this.field464.add(var4);
            }
        }
    }

    @ObfuscatedName("ak.m(ILaq;[Lak;[Ljx;B)Z")
    public boolean method323(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method326(arg0)) {
            return false;
        } else if (this.field467 == null && this.field468.isEmpty()) {
            return false;
        } else {
            this.method318(arg2);
            this.field472.method4622();
            if (this.field467 == null) {
                this.method332(arg1, arg3);
            } else {
                this.method400(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ak.s(IIILjava/util/HashSet;I)V")
    public void method324(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method357(arg0, arg1, arg3, arg2);
        this.method346(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ak.x(Ljava/util/HashSet;III)V")
    public void method372(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field474.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field532)) {
                class243 var6 = Statics.field3266[var5.field532];
                this.method447(var6, var5.field527, var5.field536, arg1, arg2);
            }
        }
        this.method341(arg0, arg1, arg2);
    }

    @ObfuscatedName("ak.p(II)Z")
    public boolean method326(int arg0) {
        if (this.field472 != null && this.field475 == arg0) {
            return false;
        } else {
            this.field475 = arg0;
            this.field472 = new class286(this.field475 * 64, this.field475 * 64);
            return true;
        }
    }

    @ObfuscatedName("ak.k(Laq;[Lak;[Ljx;B)V")
    public void method400(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method330(var4, var5, this.field467, arg0);
                this.method384(var4, var5, this.field467, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method329(var6, var7, this.field467, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ak.r(Laq;[Ljx;I)V")
    public void method332(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field468.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method540() * 8; var5 < var4.method540() * 8 + 8; var5++) {
                for (int var6 = var4.method538() * 8; var6 < var4.method538() * 8 + 8; var6++) {
                    this.method330(var5, var6, var4, arg0);
                    this.method384(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field468.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method540() * 8; var9 < var8.method540() * 8 + 8; var9++) {
                for (int var10 = var8.method538() * 8; var10 < var8.method538() * 8 + 8; var10++) {
                    this.method329(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ak.w(IILam;Laq;[Ljx;I)V")
    public void method329(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method374(arg0, arg1, arg2);
        this.method361(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ak.v(IILam;Laq;B)V")
    public void method330(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field399[0][arg0][arg1] - 1;
        int var6 = arg2.field400[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4510(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, this.field473);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method2329(var6, this.field473);
        }
        if (var6 > -1 && arg2.field401[0][arg0][arg1] == 0) {
            class282.method4510(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, var7);
            return;
        }
        int var8 = this.method337(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4510(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, var8);
        } else {
            arg3.method557(this.field475 * arg0, this.field475 * (63 - arg1), var8, var7, this.field475, this.field475, arg2.field401[0][arg0][arg1], arg2.field402[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ak.h(IILam;Laq;I)V")
    public void method384(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field406; var5++) {
            int var6 = arg2.field400[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method2329(var6, this.field473);
                if (arg2.field401[var5][arg0][arg1] == 0) {
                    class282.method4510(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, var7);
                } else {
                    arg3.method557(this.field475 * arg0, this.field475 * (63 - arg1), 0, var7, this.field475, this.field475, arg2.field401[var5][arg0][arg1], arg2.field402[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ak.t([Lak;I)Z")
    public boolean method318(class35[] arg0) {
        if (this.field471 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field467 == null) {
            Iterator var3 = this.field468.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method335(var4.method540() * 8, var4.method538() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method335(0, 0, 64, 64, this.field467, var2);
        }
        this.method334(arg0, var2);
        this.method333(var2);
        return true;
    }

    @ObfuscatedName("ak.l(Lax;B)V")
    public void method333(class44 arg0) {
        this.field471 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field471[var2][var3] = arg0.method516(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ak.q([Lak;Lax;B)V")
    public void method334(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3132, class229.field3122, class229.field3129, class229.field3123, class229.field3125, class229.field3121, class229.field3126, class229.field3127 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method13()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3128) {
                    case 0:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 5:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 6:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                }
                this.method336(var12, var13, var8, var9, var10, var11, arg0[var7.method13()], arg1);
            }
        }
    }

    @ObfuscatedName("ak.f(IIIILam;Lax;I)V")
    public void method335(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field399[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method2764(var9);
                    arg5.method521(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ak.j(IIIIIILak;Lax;B)V")
    public void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method339(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method2764(var11);
                    arg7.method521(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ak.n(IILam;I)I")
    public int method337(int arg0, int arg1, class29 arg2) {
        return arg2.field399[0][arg0][arg1] == 0 ? this.field473 : this.field471[arg0][arg1];
    }

    @ObfuscatedName("ak.z(IILam;[Ljx;I)V")
    public void method361(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field406; var5++) {
            class32[] var6 = arg2.field398[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class222.method881(var9.field433)) {
                        int var10 = var9.field433;
                        boolean var11 = class222.field2810.field2804 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class256 var12 = class256.method2825(var9.field434);
                    if (var12.field3421 != -1) {
                        if (var12.field3421 == 46 || var12.field3421 == 52) {
                            arg3[var12.field3421].method4600(this.field475 * arg0, this.field475 * (63 - arg1), this.field475 * 2 + 1, this.field475 * 2 + 1);
                        } else {
                            arg3[var12.field3421].method4600(this.field475 * arg0, this.field475 * (63 - arg1), this.field475 * 2, this.field475 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ap(IILam;I)V")
    public void method374(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field406; var4++) {
            class32[] var5 = arg2.field398[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class222.method2420(var8.field433)) {
                        class256 var9 = class256.method2825(var8.field434);
                        int var10 = var9.field3430 == 0 ? -3355444 : -3407872;
                        if (class222.field2790.field2804 == var8.field433) {
                            this.method356(arg0, arg1, var8.field427, var10);
                        }
                        if (class222.field2789.field2804 == var8.field433) {
                            this.method356(arg0, arg1, var8.field427, -3355444);
                            this.method356(arg0, arg1, var8.field427 + 1, var10);
                        }
                        if (class222.field2791.field2804 == var8.field433) {
                            if (var8.field427 == 0) {
                                class282.method4519(this.field475 * arg0, this.field475 * (63 - arg1), 1, var10);
                            }
                            if (var8.field427 == 1) {
                                class282.method4519(this.field475 * arg0 + this.field475 - 1, this.field475 * (63 - arg1), 1, var10);
                            }
                            if (var8.field427 == 2) {
                                class282.method4519(this.field475 * arg0 + this.field475 - 1, this.field475 * (63 - arg1) + this.field475 - 1, 1, var10);
                            }
                            if (var8.field427 == 3) {
                                class282.method4519(this.field475 * arg0, this.field475 * (63 - arg1) + this.field475 - 1, 1, var10);
                            }
                        }
                        if (class222.field2799.field2804 == var8.field433) {
                            int var11 = var8.field427 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field475; var12++) {
                                    class282.method4519(this.field475 * arg0 + var12, this.field475 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field475; var13++) {
                                    class282.method4519(this.field475 * arg0 + var13, this.field475 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.aj(IILjava/util/HashSet;II)V")
    public void method357(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field474.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2579 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2578 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field527 = var10;
                var12.field536 = var11;
                class243 var13 = Statics.field3266[var12.field532];
                if (!arg2.contains(var13.method3881())) {
                    this.method391(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ak.am(Ljava/util/HashSet;III)V")
    public void method341(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field464.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field3266[var5.field532];
            if (var6 != null && arg0.contains(var6.method3881())) {
                this.method447(var6, var5.field527, var5.field536, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ak.ag(Lis;IIIII)V")
    public void method447(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method3875(false);
        if (var6 == null) {
            return;
        }
        var6.method4631(arg1 - var6.field3778 / 2, arg2 - var6.field3768 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4508(arg1, arg2, 15, 16776960, 128);
            class282.method4508(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ak.av(Lad;IIFI)V")
    public void method391(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field3266[arg0.field532];
        this.method344(var5, arg1, arg2);
        this.method354(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.al(Lis;IIB)V")
    public void method344(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method3875(false);
        if (var4 != null) {
            int var5 = this.method349(var4, arg0.field3281);
            int var6 = this.method350(var4, arg0.field3277);
            var4.method4631(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ak.ab(Lad;Lis;IIFB)V")
    public void method354(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field534 != null && arg0.field534.field455.method164(arg4)) {
            class264 var6 = (class264) this.field462.get(arg0.field534.field455);
            var6.method4335(arg0.field534.field458, arg2 - arg0.field534.field453 / 2, arg3, arg0.field534.field453, arg0.field534.field454, 0xFF000000 | arg1.field3269, 0, 1, 0, var6.field3626 / 2);
        }
    }

    @ObfuscatedName("ak.af(IILjava/util/HashSet;II)V")
    public void method346(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field464.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field538.field2579 % 64;
            int var9 = var7.field538.field2578 % 64;
            var7.field527 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field536 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field532)) {
                this.method391(var7, var7.field527, var7.field536, var5);
            }
        }
    }

    @ObfuscatedName("ak.ak(B)V")
    public void method347() {
        if (this.field467 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method348(var1, var2, this.field467);
                }
            }
            return;
        }
        Iterator var3 = this.field468.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method540() * 8; var5 < var4.method540() * 8 + 8; var5++) {
                for (int var6 = var4.method538() * 8; var6 < var4.method538() * 8 + 8; var6++) {
                    this.method348(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ak.ar(IILam;I)V")
    public void method348(int arg0, int arg1, class29 arg2) {
        field476.method3595(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field406; var4++) {
            class32[] var5 = arg2.field398[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method351(var8.field434);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field474.get(field476);
                        if (var10 != null) {
                            if (var9.field3276 != var10.field532) {
                                class40 var11 = new class40(var9.field3276, var10.field533, var10.field538, this.method375(var9));
                                this.field474.put(new class213(field476), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field533.field2580 - var10.field538.field2580;
                            var10.field538.field2580 = var4;
                            var10.field533.field2580 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field465 * 64 + arg0, this.field466 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field467 == null) {
                            Iterator var15 = this.field468.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method537(arg0, arg1)) {
                                    var14 = new class213(var16.field397 + var4, var16.field404 * 64 + arg0 + var16.method554() * 8, var16.field394 * 64 + arg1 + var16.method535() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field467.field397 + var4, this.field467.field404 * 64 + arg0, this.field467.field394 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3276, var14, var13, this.method375(var9));
                            this.field474.put(new class213(field476), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field474.remove(field476);
    }

    @ObfuscatedName("ak.an(Ljj;Lil;B)I")
    public int method349(class286 arg0, class258 arg1) {
        switch(arg1.field3525) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3778 / 2;
            default:
                return -arg0.field3778;
        }
    }

    @ObfuscatedName("ak.at(Ljj;Lir;B)I")
    public int method350(class286 arg0, class240 arg1) {
        switch(arg1.field3248) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3768 / 2;
            default:
                return -arg0.field3768;
        }
    }

    @ObfuscatedName("ak.aw(II)Lis;")
    public class243 method351(int arg0) {
        class256 var2 = class256.method2825(arg0);
        if (var2.field3452 != null) {
            var2 = var2.method4115();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3439 == -1 ? null : Statics.field3266[var2.field3439];
    }

    @ObfuscatedName("ak.ad(II)Laf;")
    public class34 method342(int arg0) {
        class243 var2 = Statics.field3266[arg0];
        return this.method375(var2);
    }

    @ObfuscatedName("ak.ac(Lis;B)Laf;")
    public class34 method375(class243 arg0) {
        if (arg0.field3268 == null || this.field462 == null || this.field462.get(class25.field352) == null) {
            return null;
        }
        int var2 = arg0.field3270;
        class25[] var3 = class25.method163();
        int var4 = 0;
        class25 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class25 var5 = var3[var4];
            if (var5.field346 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class264 var8 = (class264) this.field462.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4329(arg0.field3268, 1000000);
        String[] var10 = new String[var9];
        var8.method4327(arg0.field3268, (int[]) null, var10);
        int var11 = var10.length * var8.field3626 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4326(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class34(arg0.field3268, var12, var11, var6);
    }

    @ObfuscatedName("ak.ae(IIIIIB)Ljava/util/List;")
    public List method406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field474.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method470(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field464.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method470(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ak.ah(I)Ljava/util/List;")
    public List method355() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field464);
        var1.addAll(this.field474.values());
        return var1;
    }

    @ObfuscatedName("ak.ax(IIIII)V")
    public void method356(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4546(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, arg3);
        }
        if (var5 == 1) {
            class282.method4519(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, arg3);
        }
        if (var5 == 2) {
            class282.method4546(this.field475 * arg0 + this.field475 - 1, this.field475 * (63 - arg1), this.field475, arg3);
        }
        if (var5 == 3) {
            class282.method4519(this.field475 * arg0, this.field475 * (63 - arg1) + this.field475 - 1, this.field475, arg3);
        }
    }

    @ObfuscatedName("ak.ai(III)I")
    public int method339(int arg0, int arg1) {
        if (this.field467 != null) {
            return this.field467.method209(arg0, arg1);
        }
        if (!this.field468.isEmpty()) {
            Iterator var3 = this.field468.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method537(arg0, arg1)) {
                    return var4.method209(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
