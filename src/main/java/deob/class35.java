package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ao")
public class class35 {

    @ObfuscatedName("ao.g")
    public int field443;

    @ObfuscatedName("ao.x")
    public int field444;

    @ObfuscatedName("ao.f")
    public class23 field445;

    @ObfuscatedName("ao.u")
    public LinkedList field441;

    @ObfuscatedName("ao.t")
    public int field447;

    @ObfuscatedName("ao.k")
    public int field442;

    @ObfuscatedName("ao.n")
    public int[][] field449;

    @ObfuscatedName("ao.d")
    public class295 field450;

    @ObfuscatedName("ao.o")
    public List field448;

    @ObfuscatedName("ao.a")
    public HashMap field446;

    @ObfuscatedName("ao.q")
    public final HashMap field453;

    @ObfuscatedName("ao.j")
    public static final class220 field454 = new class220();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field443 = arg0;
        this.field444 = arg1;
        this.field441 = new LinkedList();
        this.field448 = new LinkedList();
        this.field446 = new HashMap();
        this.field447 = arg2 | 0xFF000000;
        this.field453 = arg3;
    }

    @ObfuscatedName("ao.b(IIIS)V")
    public void method412(int arg0, int arg1, int arg2) {
        if (this.field450 == null) {
            return;
        }
        if (this.field442 * 64 == arg2) {
            this.field450.method4819(arg0, arg1);
        } else {
            this.field450.method4809(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ao.s(Lz;Ljava/util/List;I)V")
    public void method298(class23 arg0, List arg1) {
        this.field446.clear();
        this.field445 = arg0;
        this.method352(0, 0, 64, 64, this.field445);
        this.method334(arg1);
    }

    @ObfuscatedName("ao.r(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method307(HashSet arg0, List arg1) {
        this.field446.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method201() == this.field443 && var4.method203() == this.field444) {
                this.field441.add(var4);
                this.method352(var4.method542() * 8, var4.method543() * 8, 8, 8, var4);
            }
        }
        this.method334(arg1);
    }

    @ObfuscatedName("ao.g(IIIILae;I)V")
    public void method352(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class220 var8 = new class220(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field381; var9++) {
                    class32[] var10 = arg4.field385[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class250 var14 = this.method330(var13.field410);
                            if (var14 != null) {
                                class220 var15 = new class220(var9, this.field443 * 64 + var6, this.field444 * 64 + var7);
                                Object var16 = null;
                                class220 var17;
                                if (this.field445 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class220(var18.field389 + var9, var18.field387 * 64 + var6 + var18.method536() * 8, var18.field377 * 64 + var7 + var18.method541() * 8);
                                } else {
                                    var17 = new class220(this.field445.field389 + var9, this.field445.field387 * 64 + var6, this.field445.field377 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3349, var17, var15, this.method351(var14));
                                this.field446.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.x(Ljava/util/List;I)V")
    public void method334(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field338.field2683 >> 6 == this.field443 && var3.field338.field2684 >> 6 == this.field444) {
                class40 var4 = new class40(var3.field339, var3.field338, var3.field338, this.method365(var3.field339));
                this.field448.add(var4);
            }
        }
    }

    @ObfuscatedName("ao.f(ILab;[Lao;[Lks;I)Z")
    public boolean method302(int arg0, class47 arg1, class35[] arg2, class294[] arg3) {
        if (!this.method305(arg0)) {
            return false;
        } else if (this.field445 == null && this.field441.isEmpty()) {
            return false;
        } else {
            this.method311(arg2);
            this.field450.method4849();
            if (this.field445 == null) {
                this.method405(arg1, arg3);
            } else {
                this.method306(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ao.u(IIILjava/util/HashSet;I)V")
    public void method303(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method319(arg0, arg1, arg3, arg2);
        this.method325(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ao.t(Ljava/util/HashSet;III)V")
    public void method304(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field446.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field499)) {
                class250 var6 = Statics.field3346[var5.field499];
                this.method402(var6, var5.field496, var5.field491, arg1, arg2);
            }
        }
        this.method320(arg0, arg1, arg2);
    }

    @ObfuscatedName("ao.k(II)Z")
    public boolean method305(int arg0) {
        if (this.field450 != null && this.field442 == arg0) {
            return false;
        } else {
            this.field442 = arg0;
            this.field450 = new class295(this.field442 * 64, this.field442 * 64);
            return true;
        }
    }

    @ObfuscatedName("ao.n(Lab;[Lao;[Lks;I)V")
    public void method306(class47 arg0, class35[] arg1, class294[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method309(var4, var5, this.field445, arg0);
                this.method310(var4, var5, this.field445, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method438(var6, var7, this.field445, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ao.d(Lab;[Lks;I)V")
    public void method405(class47 arg0, class294[] arg1) {
        Iterator var3 = this.field441.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method542() * 8; var5 < var4.method542() * 8 + 8; var5++) {
                for (int var6 = var4.method543() * 8; var6 < var4.method543() * 8 + 8; var6++) {
                    this.method309(var5, var6, var4, arg0);
                    this.method310(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field441.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method542() * 8; var9 < var8.method542() * 8 + 8; var9++) {
                for (int var10 = var8.method543() * 8; var10 < var8.method543() * 8 + 8; var10++) {
                    this.method438(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ao.o(IILae;Lab;[Lks;I)V")
    public void method438(int arg0, int arg1, class29 arg2, class47 arg3, class294[] arg4) {
        this.method318(arg0, arg1, arg2);
        this.method317(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ao.a(IILae;Lab;I)V")
    public void method309(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field378[0][arg0][arg1] - 1;
        int var6 = arg2.field383[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class291.method4671(this.field442 * arg0, this.field442 * (63 - arg1), this.field442, this.field442, this.field447);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method636(var6, this.field447);
        }
        if (var6 > -1 && arg2.field384[0][arg0][arg1] == 0) {
            class291.method4671(this.field442 * arg0, this.field442 * (63 - arg1), this.field442, this.field442, var7);
            return;
        }
        int var8 = this.method316(arg0, arg1, arg2);
        if (var6 == -1) {
            class291.method4671(this.field442 * arg0, this.field442 * (63 - arg1), this.field442, this.field442, var8);
        } else {
            arg3.method560(this.field442 * arg0, this.field442 * (63 - arg1), var8, var7, this.field442, this.field442, arg2.field384[0][arg0][arg1], arg2.field380[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ao.q(IILae;Lab;B)V")
    public void method310(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field381; var5++) {
            int var6 = arg2.field383[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method636(var6, this.field447);
                if (arg2.field384[var5][arg0][arg1] == 0) {
                    class291.method4671(this.field442 * arg0, this.field442 * (63 - arg1), this.field442, this.field442, var7);
                } else {
                    arg3.method560(this.field442 * arg0, this.field442 * (63 - arg1), 0, var7, this.field442, this.field442, arg2.field384[var5][arg0][arg1], arg2.field380[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ao.j([Lao;I)Z")
    public boolean method311(class35[] arg0) {
        if (this.field449 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field445 == null) {
            Iterator var3 = this.field441.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method314(var4.method542() * 8, var4.method543() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method314(0, 0, 64, 64, this.field445, var2);
        }
        this.method331(arg0, var2);
        this.method312(var2);
        return true;
    }

    @ObfuscatedName("ao.c(Lag;I)V")
    public void method312(class44 arg0) {
        this.field449 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field449[var2][var3] = arg0.method516(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ao.i([Lao;Lag;S)V")
    public void method331(class35[] arg0, class44 arg1) {
        class236[] var3 = Statics.method133();
        class236[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class236 var6 = var4[var5];
            if (arg0[var6.method8()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3221) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                }
                this.method359(var11, var12, var7, var8, var9, var10, arg0[var6.method8()], arg1);
            }
        }
    }

    @ObfuscatedName("ao.l(IIIILae;Lag;I)V")
    public void method314(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field378[0][var7][var8] - 1;
                if (var9 != -1) {
                    class254 var10 = class254.method3676(var9);
                    arg5.method515(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ao.z(IIIIIILao;Lag;B)V")
    public void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method384(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class254 var12 = class254.method3676(var11);
                    arg7.method515(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ao.e(IILae;I)I")
    public int method316(int arg0, int arg1, class29 arg2) {
        return arg2.field378[0][arg0][arg1] == 0 ? this.field447 : this.field449[arg0][arg1];
    }

    @ObfuscatedName("ao.v(IILae;[Lks;I)V")
    public void method317(int arg0, int arg1, class29 arg2, class294[] arg3) {
        for (int var5 = 0; var5 < arg2.field381; var5++) {
            class32[] var6 = arg2.field385[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class229.method460(var9.field413)) {
                        int var10 = var9.field413;
                        boolean var11 = class229.field2895.field2889 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class263 var12 = class263.method2851(var9.field410);
                    if (var12.field3535 != -1) {
                        if (var12.field3535 == 46 || var12.field3535 == 52) {
                            arg3[var12.field3535].method4766(this.field442 * arg0, this.field442 * (63 - arg1), this.field442 * 2 + 1, this.field442 * 2 + 1);
                        } else {
                            arg3[var12.field3535].method4766(this.field442 * arg0, this.field442 * (63 - arg1), this.field442 * 2, this.field442 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.w(IILae;I)V")
    public void method318(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field381; var4++) {
            class32[] var5 = arg2.field385[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field413;
                    boolean var10 = var9 >= class229.field2878.field2889 && var9 <= class229.field2876.field2889 || class229.field2873.field2889 == var9;
                    if (var10) {
                        class263 var11 = class263.method2851(var8.field410);
                        int var12 = var11.field3487 == 0 ? -3355444 : -3407872;
                        if (class229.field2878.field2889 == var8.field413) {
                            this.method404(arg0, arg1, var8.field411, var12);
                        }
                        if (class229.field2875.field2889 == var8.field413) {
                            this.method404(arg0, arg1, var8.field411, -3355444);
                            this.method404(arg0, arg1, var8.field411 + 1, var12);
                        }
                        if (class229.field2876.field2889 == var8.field413) {
                            if (var8.field411 == 0) {
                                class291.method4680(this.field442 * arg0, this.field442 * (63 - arg1), 1, var12);
                            }
                            if (var8.field411 == 1) {
                                class291.method4680(this.field442 * arg0 + this.field442 - 1, this.field442 * (63 - arg1), 1, var12);
                            }
                            if (var8.field411 == 2) {
                                class291.method4680(this.field442 * arg0 + this.field442 - 1, this.field442 * (63 - arg1) + this.field442 - 1, 1, var12);
                            }
                            if (var8.field411 == 3) {
                                class291.method4680(this.field442 * arg0, this.field442 * (63 - arg1) + this.field442 - 1, 1, var12);
                            }
                        }
                        if (class229.field2873.field2889 == var8.field413) {
                            int var13 = var8.field411 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field442; var14++) {
                                    class291.method4680(this.field442 * arg0 + var14, this.field442 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field442; var15++) {
                                    class291.method4680(this.field442 * arg0 + var15, this.field442 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.av(IILjava/util/HashSet;II)V")
    public void method319(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field446.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class220 var9 = (class220) var8.getKey();
            int var10 = (int) ((float) var9.field2683 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2684 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field496 = var10;
                var12.field491 = var11;
                class250 var13 = Statics.field3346[var12.field499];
                if (!arg2.contains(var13.method3970())) {
                    this.method389(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ao.au(Ljava/util/HashSet;IIS)V")
    public void method320(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field448.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class250 var6 = Statics.field3346[var5.field499];
            if (var6 != null && arg0.contains(var6.method3970())) {
                this.method402(var6, var5.field496, var5.field491, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ao.ae(Lib;IIIII)V")
    public void method402(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        class295 var6 = arg0.method3972(false);
        if (var6 == null) {
            return;
        }
        var6.method4793(arg1 - var6.field3845 / 2, arg2 - var6.field3836 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class291.method4669(arg1, arg2, 15, 16776960, 128);
            class291.method4669(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ao.ak(Law;IIFI)V")
    public void method389(class40 arg0, int arg1, int arg2, float arg3) {
        class250 var5 = Statics.field3346[arg0.field499];
        this.method323(var5, arg1, arg2);
        this.method324(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ao.aq(Lib;IIB)V")
    public void method323(class250 arg0, int arg1, int arg2) {
        class295 var4 = arg0.method3972(false);
        if (var4 != null) {
            int var5 = this.method328(var4, arg0.field3362);
            int var6 = this.method329(var4, arg0.field3345);
            var4.method4793(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ao.an(Law;Lib;IIFI)V")
    public void method324(class40 arg0, class250 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field495 != null && arg0.field495.field436.method162(arg4)) {
            class271 var6 = (class271) this.field453.get(arg0.field495.field436);
            var6.method4468(arg0.field495.field439, arg2 - arg0.field495.field433 / 2, arg3, arg0.field495.field433, arg0.field495.field438, 0xFF000000 | arg1.field3353, 0, 1, 0, var6.field3692 / 2);
        }
    }

    @ObfuscatedName("ao.am(IILjava/util/HashSet;IS)V")
    public void method325(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field448.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field493.field2683 % 64;
            int var9 = var7.field493.field2684 % 64;
            var7.field496 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field491 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field499)) {
                this.method389(var7, var7.field496, var7.field491, var5);
            }
        }
    }

    @ObfuscatedName("ao.ar(I)V")
    public void method326() {
        if (this.field445 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method327(var1, var2, this.field445);
                }
            }
            return;
        }
        Iterator var3 = this.field441.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method542() * 8; var5 < var4.method542() * 8 + 8; var5++) {
                for (int var6 = var4.method543() * 8; var6 < var4.method543() * 8 + 8; var6++) {
                    this.method327(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ao.ao(IILae;I)V")
    public void method327(int arg0, int arg1, class29 arg2) {
        field454.method3694(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field381; var4++) {
            class32[] var5 = arg2.field385[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class250 var9 = this.method330(var8.field410);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field446.get(field454);
                        if (var10 != null) {
                            if (var9.field3349 != var10.field499) {
                                class40 var11 = new class40(var9.field3349, var10.field492, var10.field493, this.method351(var9));
                                this.field446.put(new class220(field454), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field492.field2682 - var10.field493.field2682;
                            var10.field493.field2682 = var4;
                            var10.field492.field2682 = var4 + var12;
                            return;
                        }
                        class220 var13 = new class220(var4, this.field443 * 64 + arg0, this.field444 * 64 + arg1);
                        class220 var14 = null;
                        if (this.field445 == null) {
                            Iterator var15 = this.field441.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method538(arg0, arg1)) {
                                    var14 = new class220(var16.field389 + var4, var16.field387 * 64 + arg0 + var16.method536() * 8, var16.field377 * 64 + arg1 + var16.method541() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class220(this.field445.field389 + var4, this.field445.field387 * 64 + arg0, this.field445.field377 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3349, var14, var13, this.method351(var9));
                            this.field446.put(new class220(field454), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field446.remove(field454);
    }

    @ObfuscatedName("ao.at(Lkb;Ljp;I)I")
    public int method328(class295 arg0, class265 arg1) {
        switch(arg1.field3598) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3845 / 2;
            default:
                return -arg0.field3845;
        }
    }

    @ObfuscatedName("ao.ac(Lkb;Lit;B)I")
    public int method329(class295 arg0, class247 arg1) {
        switch(arg1.field3328) {
            case 0:
                return -arg0.field3836 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3836;
        }
    }

    @ObfuscatedName("ao.as(II)Lib;")
    public class250 method330(int arg0) {
        class263 var2 = class263.method2851(arg0);
        if (var2.field3528 != null) {
            var2 = var2.method4228();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3511 == -1 ? null : Statics.field3346[var2.field3511];
    }

    @ObfuscatedName("ao.ah(II)Lar;")
    public class34 method365(int arg0) {
        class250 var2 = Statics.field3346[arg0];
        return this.method351(var2);
    }

    @ObfuscatedName("ao.aw(Lib;I)Lar;")
    public class34 method351(class250 arg0) {
        if (arg0.field3359 == null || this.field453 == null || this.field453.get(class25.field336) == null) {
            return null;
        }
        int var2 = arg0.field3360;
        class25[] var3 = new class25[] { class25.field331, class25.field330, class25.field336 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field335 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class271 var9 = (class271) this.field453.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4462(arg0.field3359, 1000000);
        String[] var11 = new String[var10];
        var9.method4487(arg0.field3359, (int[]) null, var11);
        int var12 = var11.length * var9.field3692 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4482(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3359, var13, var12, var7);
    }

    @ObfuscatedName("ao.al(IIIIII)Ljava/util/List;")
    public List method315(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field446.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method463(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field448.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method463(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ao.aj(I)Ljava/util/List;")
    public List method441() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field448);
        var1.addAll(this.field446.values());
        return var1;
    }

    @ObfuscatedName("ao.ap(IIIII)V")
    public void method404(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class291.method4709(this.field442 * arg0, this.field442 * (63 - arg1), this.field442, arg3);
        }
        if (var5 == 1) {
            class291.method4680(this.field442 * arg0, this.field442 * (63 - arg1), this.field442, arg3);
        }
        if (var5 == 2) {
            class291.method4709(this.field442 * arg0 + this.field442 - 1, this.field442 * (63 - arg1), this.field442, arg3);
        }
        if (var5 == 3) {
            class291.method4680(this.field442 * arg0, this.field442 * (63 - arg1) + this.field442 - 1, this.field442, arg3);
        }
    }

    @ObfuscatedName("ao.ag(III)I")
    public int method384(int arg0, int arg1) {
        if (this.field445 != null) {
            return this.field445.method200(arg0, arg1);
        }
        if (!this.field441.isEmpty()) {
            Iterator var3 = this.field441.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method538(arg0, arg1)) {
                    return var4.method200(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
