package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("am")
public class class35 {

    @ObfuscatedName("am.t")
    public int field484;

    @ObfuscatedName("am.w")
    public int field488;

    @ObfuscatedName("am.z")
    public class23 field489;

    @ObfuscatedName("am.j")
    public LinkedList field487;

    @ObfuscatedName("am.i")
    public int field491;

    @ObfuscatedName("am.f")
    public int field499;

    @ObfuscatedName("am.c")
    public int[][] field485;

    @ObfuscatedName("am.o")
    public class286 field494;

    @ObfuscatedName("am.q")
    public List field495;

    @ObfuscatedName("am.n")
    public HashMap field492;

    @ObfuscatedName("am.a")
    public final HashMap field497;

    @ObfuscatedName("am.g")
    public static final class213 field498 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field484 = arg0;
        this.field488 = arg1;
        this.field487 = new LinkedList();
        this.field495 = new LinkedList();
        this.field492 = new HashMap();
        this.field491 = arg2 | 0xFF000000;
        this.field497 = arg3;
    }

    @ObfuscatedName("am.p(IIII)V")
    public void method327(int arg0, int arg1, int arg2) {
        if (this.field494 == null) {
            return;
        }
        if (this.field499 * 64 == arg2) {
            this.field494.method4620(arg0, arg1);
        } else {
            this.field494.method4643(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("am.m(Lx;Ljava/util/List;I)V")
    public void method409(class23 arg0, List arg1) {
        this.field492.clear();
        this.field489 = arg0;
        this.method330(0, 0, 64, 64, this.field489);
        this.method331(arg1);
    }

    @ObfuscatedName("am.e(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method350(HashSet arg0, List arg1) {
        this.field492.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method221() == this.field484 && var4.method222() == this.field488) {
                this.field487.add(var4);
                this.method330(var4.method560() * 8, var4.method558() * 8, 8, 8, var4);
            }
        }
        this.method331(arg1);
    }

    @ObfuscatedName("am.t(IIIILaf;B)V")
    public void method330(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field431; var9++) {
                    class32[] var10 = arg4.field430[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method359(var13.field456);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field484 * 64 + var6, this.field488 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field489 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field424 + var9, var18.field425 * 64 + var6 + var18.method556() * 8, var18.field421 * 64 + var7 + var18.method557() * 8);
                                } else {
                                    var17 = new class213(this.field489.field424 + var9, this.field489.field425 * 64 + var6, this.field489.field421 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3302, var17, var15, this.method351(var14));
                                this.field492.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.w(Ljava/util/List;I)V")
    public void method331(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field386.field2619 >> 6 == this.field484 && var3.field386.field2622 >> 6 == this.field488) {
                class40 var4 = new class40(var3.field385, var3.field386, var3.field386, this.method360(var3.field385));
                this.field495.add(var4);
            }
        }
    }

    @ObfuscatedName("am.z(ILai;[Lam;[Ljg;I)Z")
    public boolean method332(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method385(arg0)) {
            return false;
        } else if (this.field489 == null && this.field487.isEmpty()) {
            return false;
        } else {
            this.method341(arg2);
            this.field494.method4603();
            if (this.field489 == null) {
                this.method439(arg1, arg3);
            } else {
                this.method336(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("am.j(IIILjava/util/HashSet;I)V")
    public void method333(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method349(arg0, arg1, arg3, arg2);
        this.method445(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("am.c(Ljava/util/HashSet;III)V")
    public void method334(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field492.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field542)) {
                class243 var6 = Statics.field3305[var5.field542];
                this.method362(var6, var5.field540, var5.field545, arg1, arg2);
            }
        }
        this.method337(arg0, arg1, arg2);
    }

    @ObfuscatedName("am.o(II)Z")
    public boolean method385(int arg0) {
        if (this.field494 != null && this.field499 == arg0) {
            return false;
        } else {
            this.field499 = arg0;
            this.field494 = new class286(this.field499 * 64, this.field499 * 64);
            return true;
        }
    }

    @ObfuscatedName("am.q(Lai;[Lam;[Ljg;I)V")
    public void method336(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method440(var4, var5, this.field489, arg0);
                this.method340(var4, var5, this.field489, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method407(var6, var7, this.field489, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("am.n(Lai;[Ljg;I)V")
    public void method439(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field487.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method560() * 8; var5 < var4.method560() * 8 + 8; var5++) {
                for (int var6 = var4.method558() * 8; var6 < var4.method558() * 8 + 8; var6++) {
                    this.method440(var5, var6, var4, arg0);
                    this.method340(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field487.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method560() * 8; var9 < var8.method560() * 8 + 8; var9++) {
                for (int var10 = var8.method558() * 8; var10 < var8.method558() * 8 + 8; var10++) {
                    this.method407(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("am.a(IILaf;Lai;[Ljg;B)V")
    public void method407(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method348(arg0, arg1, arg2);
        this.method335(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("am.g(IILaf;Lai;I)V")
    public void method440(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field426[0][arg0][arg1] - 1;
        int var6 = arg2.field420[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4510(this.field499 * arg0, this.field499 * (63 - arg1), this.field499, this.field499, this.field491);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method122(var6, this.field491);
        }
        if (var6 > -1 && arg2.field428[0][arg0][arg1] == 0) {
            class282.method4510(this.field499 * arg0, this.field499 * (63 - arg1), this.field499, this.field499, var7);
            return;
        }
        int var8 = this.method346(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4510(this.field499 * arg0, this.field499 * (63 - arg1), this.field499, this.field499, var8);
        } else {
            arg3.method579(this.field499 * arg0, this.field499 * (63 - arg1), var8, var7, this.field499, this.field499, arg2.field428[0][arg0][arg1], arg2.field429[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("am.v(IILaf;Lai;I)V")
    public void method340(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field431; var5++) {
            int var6 = arg2.field420[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method122(var6, this.field491);
                if (arg2.field428[var5][arg0][arg1] == 0) {
                    class282.method4510(this.field499 * arg0, this.field499 * (63 - arg1), this.field499, this.field499, var7);
                } else {
                    arg3.method579(this.field499 * arg0, this.field499 * (63 - arg1), 0, var7, this.field499, this.field499, arg2.field428[var5][arg0][arg1], arg2.field429[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("am.s([Lam;I)Z")
    public boolean method341(class35[] arg0) {
        if (this.field485 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field489 == null) {
            Iterator var3 = this.field487.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method344(var4.method560() * 8, var4.method558() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method344(0, 0, 64, 64, this.field489, var2);
        }
        this.method343(arg0, var2);
        this.method347(var2);
        return true;
    }

    @ObfuscatedName("am.k(Las;I)V")
    public void method347(class44 arg0) {
        this.field485 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field485[var2][var3] = arg0.method536(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("am.r([Lam;Las;I)V")
    public void method343(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3157, class229.field3156, class229.field3166, class229.field3161, class229.field3163, class229.field3158, class229.field3162, class229.field3160 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method12()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3164) {
                    case 0:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 2:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                }
                this.method396(var12, var13, var8, var9, var10, var11, arg0[var7.method12()], arg1);
            }
        }
    }

    @ObfuscatedName("am.l(IIIILaf;Las;I)V")
    public void method344(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field426[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method1418(var9);
                    arg5.method534(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("am.d(IIIIIILam;Las;I)V")
    public void method396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method365(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method1418(var11);
                    arg7.method534(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("am.x(IILaf;B)I")
    public int method346(int arg0, int arg1, class29 arg2) {
        return arg2.field426[0][arg0][arg1] == 0 ? this.field491 : this.field485[arg0][arg1];
    }

    @ObfuscatedName("am.b(IILaf;[Ljg;I)V")
    public void method335(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field431; var5++) {
            class32[] var6 = arg2.field430[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field454;
                    boolean var11 = var10 >= class222.field2840.field2835 && var10 <= class222.field2841.field2835;
                    if (!var11) {
                        int var12 = var9.field454;
                        boolean var13 = class222.field2823.field2835 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class256 var14 = class256.method239(var9.field456);
                    if (var14.field3472 != -1) {
                        if (var14.field3472 == 46 || var14.field3472 == 52) {
                            arg3[var14.field3472].method4587(this.field499 * arg0, this.field499 * (63 - arg1), this.field499 * 2 + 1, this.field499 * 2 + 1);
                        } else {
                            arg3[var14.field3472].method4587(this.field499 * arg0, this.field499 * (63 - arg1), this.field499 * 2, this.field499 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.y(IILaf;I)V")
    public void method348(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field431; var4++) {
            class32[] var5 = arg2.field430[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class222.method3085(var8.field454)) {
                        class256 var9 = class256.method239(var8.field456);
                        int var10 = var9.field3446 == 0 ? -3355444 : -3407872;
                        if (class222.field2826.field2835 == var8.field454) {
                            this.method369(arg0, arg1, var8.field455, var10);
                        }
                        if (class222.field2820.field2835 == var8.field454) {
                            this.method369(arg0, arg1, var8.field455, -3355444);
                            this.method369(arg0, arg1, var8.field455 + 1, var10);
                        }
                        if (class222.field2842.field2835 == var8.field454) {
                            if (var8.field455 == 0) {
                                class282.method4518(this.field499 * arg0, this.field499 * (63 - arg1), 1, var10);
                            }
                            if (var8.field455 == 1) {
                                class282.method4518(this.field499 * arg0 + this.field499 - 1, this.field499 * (63 - arg1), 1, var10);
                            }
                            if (var8.field455 == 2) {
                                class282.method4518(this.field499 * arg0 + this.field499 - 1, this.field499 * (63 - arg1) + this.field499 - 1, 1, var10);
                            }
                            if (var8.field455 == 3) {
                                class282.method4518(this.field499 * arg0, this.field499 * (63 - arg1) + this.field499 - 1, 1, var10);
                            }
                        }
                        if (class222.field2824.field2835 == var8.field454) {
                            int var11 = var8.field455 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field499; var12++) {
                                    class282.method4518(this.field499 * arg0 + var12, this.field499 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field499; var13++) {
                                    class282.method4518(this.field499 * arg0 + var13, this.field499 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.u(IILjava/util/HashSet;II)V")
    public void method349(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field492.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2619 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2622 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field540 = var10;
                var12.field545 = var11;
                class243 var13 = Statics.field3305[var12.field542];
                if (!arg2.contains(var13.method3872())) {
                    this.method352(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("am.av(Ljava/util/HashSet;III)V")
    public void method337(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field495.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field3305[var5.field542];
            if (var6 != null && arg0.contains(var6.method3872())) {
                this.method362(var6, var5.field540, var5.field545, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("am.ax(Lip;IIIIS)V")
    public void method362(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method3886(false);
        if (var6 == null) {
            return;
        }
        var6.method4621(arg1 - var6.field3781 / 2, arg2 - var6.field3782 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4508(arg1, arg2, 15, 16776960, 128);
            class282.method4508(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("am.af(Lay;IIFI)V")
    public void method352(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field3305[arg0.field542];
        this.method431(var5, arg1, arg2);
        this.method414(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.ae(Lip;III)V")
    public void method431(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method3886(false);
        if (var4 != null) {
            int var5 = this.method357(var4, arg0.field3315);
            int var6 = this.method358(var4, arg0.field3311);
            var4.method4621(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("am.ap(Lay;Lip;IIFI)V")
    public void method414(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field543 != null && arg0.field543.field480.method182(arg4)) {
            class264 var6 = (class264) this.field497.get(arg0.field543.field480);
            var6.method4328(arg0.field543.field474, arg2 - arg0.field543.field475 / 2, arg3, arg0.field543.field475, arg0.field543.field476, 0xFF000000 | arg1.field3306, 0, 1, 0, var6.field3644 / 2);
        }
    }

    @ObfuscatedName("am.ak(IILjava/util/HashSet;IB)V")
    public void method445(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field495.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field539.field2619 % 64;
            int var9 = var7.field539.field2622 % 64;
            var7.field540 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field545 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field542)) {
                this.method352(var7, var7.field540, var7.field545, var5);
            }
        }
    }

    @ObfuscatedName("am.al(I)V")
    public void method433() {
        if (this.field489 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method382(var1, var2, this.field489);
                }
            }
            return;
        }
        Iterator var3 = this.field487.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method560() * 8; var5 < var4.method560() * 8 + 8; var5++) {
                for (int var6 = var4.method558() * 8; var6 < var4.method558() * 8 + 8; var6++) {
                    this.method382(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("am.ab(IILaf;B)V")
    public void method382(int arg0, int arg1, class29 arg2) {
        field498.method3553(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field431; var4++) {
            class32[] var5 = arg2.field430[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method359(var8.field456);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field492.get(field498);
                        if (var10 != null) {
                            if (var9.field3302 != var10.field542) {
                                class40 var11 = new class40(var9.field3302, var10.field546, var10.field539, this.method351(var9));
                                this.field492.put(new class213(field498), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field546.field2620 - var10.field539.field2620;
                            var10.field539.field2620 = var4;
                            var10.field546.field2620 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field484 * 64 + arg0, this.field488 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field489 == null) {
                            Iterator var15 = this.field487.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method555(arg0, arg1)) {
                                    var14 = new class213(var16.field424 + var4, var16.field425 * 64 + arg0 + var16.method556() * 8, var16.field421 * 64 + arg1 + var16.method557() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field489.field424 + var4, this.field489.field425 * 64 + arg0, this.field489.field421 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3302, var14, var13, this.method351(var9));
                            this.field492.put(new class213(field498), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field492.remove(field498);
    }

    @ObfuscatedName("am.am(Ljy;Lii;I)I")
    public int method357(class286 arg0, class258 arg1) {
        switch(arg1.field3552) {
            case 0:
                return -arg0.field3781 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3781;
        }
    }

    @ObfuscatedName("am.ar(Ljy;Lif;B)I")
    public int method358(class286 arg0, class240 arg1) {
        switch(arg1.field3283) {
            case 0:
                return -arg0.field3782 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3782;
        }
    }

    @ObfuscatedName("am.ao(IB)Lip;")
    public class243 method359(int arg0) {
        class256 var2 = class256.method239(arg0);
        if (var2.field3484 != null) {
            var2 = var2.method4121();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3471 == -1 ? null : Statics.field3305[var2.field3471];
    }

    @ObfuscatedName("am.ac(II)Lab;")
    public class34 method360(int arg0) {
        class243 var2 = Statics.field3305[arg0];
        return this.method351(var2);
    }

    @ObfuscatedName("am.aa(Lip;I)Lab;")
    public class34 method351(class243 arg0) {
        if (arg0.field3299 == null || this.field497 == null || this.field497.get(class25.field382) == null) {
            return null;
        }
        class25 var2 = class25.method184(arg0.field3316);
        if (var2 == null) {
            return null;
        }
        class264 var3 = (class264) this.field497.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4322(arg0.field3299, 1000000);
        String[] var5 = new String[var4];
        var3.method4320(arg0.field3299, (int[]) null, var5);
        int var6 = var5.length * var3.field3644 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4381(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3299, var7, var6, var2);
    }

    @ObfuscatedName("am.ay(IIIIII)Ljava/util/List;")
    public List method364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field492.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method475(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field495.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method475(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("am.aj(I)Ljava/util/List;")
    public List method363() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field495);
        var1.addAll(this.field492.values());
        return var1;
    }

    @ObfuscatedName("am.ag(IIIII)V")
    public void method369(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4520(this.field499 * arg0, this.field499 * (63 - arg1), this.field499, arg3);
        }
        if (var5 == 1) {
            class282.method4518(this.field499 * arg0, this.field499 * (63 - arg1), this.field499, arg3);
        }
        if (var5 == 2) {
            class282.method4520(this.field499 * arg0 + this.field499 - 1, this.field499 * (63 - arg1), this.field499, arg3);
        }
        if (var5 == 3) {
            class282.method4518(this.field499 * arg0, this.field499 * (63 - arg1) + this.field499 - 1, this.field499, arg3);
        }
    }

    @ObfuscatedName("am.aq(IIB)I")
    public int method365(int arg0, int arg1) {
        if (this.field489 != null) {
            return this.field489.method220(arg0, arg1);
        }
        if (!this.field487.isEmpty()) {
            Iterator var3 = this.field487.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method555(arg0, arg1)) {
                    return var4.method220(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
