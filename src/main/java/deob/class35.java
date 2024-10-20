package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aj")
public class class35 {

    @ObfuscatedName("aj.z")
    public int field472;

    @ObfuscatedName("aj.v")
    public int field453;

    @ObfuscatedName("aj.m")
    public class23 field458;

    @ObfuscatedName("aj.b")
    public LinkedList field459;

    @ObfuscatedName("aj.t")
    public int field454;

    @ObfuscatedName("aj.p")
    public int field461;

    @ObfuscatedName("aj.r")
    public int[][] field462;

    @ObfuscatedName("aj.l")
    public class295 field463;

    @ObfuscatedName("aj.u")
    public List field456;

    @ObfuscatedName("aj.n")
    public HashMap field470;

    @ObfuscatedName("aj.c")
    public final HashMap field466;

    @ObfuscatedName("aj.y")
    public static final class220 field467 = new class220();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field472 = arg0;
        this.field453 = arg1;
        this.field459 = new LinkedList();
        this.field456 = new LinkedList();
        this.field470 = new HashMap();
        this.field454 = arg2 | 0xFF000000;
        this.field466 = arg3;
    }

    @ObfuscatedName("aj.d(IIIB)V")
    public void method335(int arg0, int arg1, int arg2) {
        if (this.field463 == null) {
            return;
        }
        if (this.field461 * 64 == arg2) {
            this.field463.method4901(arg0, arg1);
        } else {
            this.field463.method4918(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aj.x(Lo;Ljava/util/List;I)V")
    public void method330(class23 arg0, List arg1) {
        this.field470.clear();
        this.field458 = arg0;
        this.method403(0, 0, 64, 64, this.field458);
        this.method333(arg1);
    }

    @ObfuscatedName("aj.k(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method404(HashSet arg0, List arg1) {
        this.field470.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method211() == this.field472 && var4.method212() == this.field453) {
                this.field459.add(var4);
                this.method403(var4.method571() * 8, var4.method568() * 8, 8, 8, var4);
            }
        }
        this.method333(arg1);
    }

    @ObfuscatedName("aj.z(IIIILaa;B)V")
    public void method403(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class220 var8 = new class220(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field384; var9++) {
                    class32[] var10 = arg4.field389[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class250 var14 = this.method390(var13.field421);
                            if (var14 != null) {
                                class220 var15 = new class220(var9, this.field472 * 64 + var6, this.field453 * 64 + var7);
                                Object var16 = null;
                                class220 var17;
                                if (this.field458 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class220(var18.field390 + var9, var18.field392 * 64 + var6 + var18.method569() * 8, var18.field380 * 64 + var7 + var18.method570() * 8);
                                } else {
                                    var17 = new class220(this.field458.field390 + var9, this.field458.field392 * 64 + var6, this.field458.field380 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3367, var17, var15, this.method363(var14));
                                this.field470.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.v(Ljava/util/List;I)V")
    public void method333(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field350.field2691 >> 6 == this.field472 && var3.field350.field2692 >> 6 == this.field453) {
                class40 var4 = new class40(var3.field352, var3.field350, var3.field350, this.method362(var3.field352));
                this.field456.add(var4);
            }
        }
    }

    @ObfuscatedName("aj.m(ILaf;[Laj;[Lkl;B)Z")
    public boolean method334(int arg0, class47 arg1, class35[] arg2, class294[] arg3) {
        if (!this.method337(arg0)) {
            return false;
        } else if (this.field458 == null && this.field459.isEmpty()) {
            return false;
        } else {
            this.method343(arg2);
            this.field463.method4920();
            if (this.field458 == null) {
                this.method339(arg1, arg3);
            } else {
                this.method415(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("aj.b(IIILjava/util/HashSet;I)V")
    public void method439(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method351(arg0, arg1, arg3, arg2);
        this.method356(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aj.t(Ljava/util/HashSet;III)V")
    public void method336(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field470.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field514)) {
                class250 var6 = Statics.field3365[var5.field514];
                this.method416(var6, var5.field510, var5.field513, arg1, arg2);
            }
        }
        this.method352(arg0, arg1, arg2);
    }

    @ObfuscatedName("aj.p(II)Z")
    public boolean method337(int arg0) {
        if (this.field463 != null && this.field461 == arg0) {
            return false;
        } else {
            this.field461 = arg0;
            this.field463 = new class295(this.field461 * 64, this.field461 * 64);
            return true;
        }
    }

    @ObfuscatedName("aj.r(Laf;[Laj;[Lkl;I)V")
    public void method415(class47 arg0, class35[] arg1, class294[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method341(var4, var5, this.field458, arg0);
                this.method342(var4, var5, this.field458, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method340(var6, var7, this.field458, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("aj.l(Laf;[Lkl;I)V")
    public void method339(class47 arg0, class294[] arg1) {
        Iterator var3 = this.field459.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method571() * 8; var5 < var4.method571() * 8 + 8; var5++) {
                for (int var6 = var4.method568() * 8; var6 < var4.method568() * 8 + 8; var6++) {
                    this.method341(var5, var6, var4, arg0);
                    this.method342(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field459.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method571() * 8; var9 < var8.method571() * 8 + 8; var9++) {
                for (int var10 = var8.method568() * 8; var10 < var8.method568() * 8 + 8; var10++) {
                    this.method340(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aj.u(IILaa;Laf;[Lkl;I)V")
    public void method340(int arg0, int arg1, class29 arg2, class47 arg3, class294[] arg4) {
        this.method331(arg0, arg1, arg2);
        this.method349(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aj.c(IILaa;Laf;I)V")
    public void method341(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field385[0][arg0][arg1] - 1;
        int var6 = arg2.field387[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class291.method4819(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, this.field454);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method173(var6, this.field454);
        }
        if (var6 > -1 && arg2.field379[0][arg0][arg1] == 0) {
            class291.method4819(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, var7);
            return;
        }
        int var8 = this.method348(arg0, arg1, arg2);
        if (var6 == -1) {
            class291.method4819(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, var8);
        } else {
            arg3.method594(this.field461 * arg0, this.field461 * (63 - arg1), var8, var7, this.field461, this.field461, arg2.field379[0][arg0][arg1], arg2.field388[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aj.j(IILaa;Laf;I)V")
    public void method342(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field384; var5++) {
            int var6 = arg2.field387[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method173(var6, this.field454);
                if (arg2.field379[var5][arg0][arg1] == 0) {
                    class291.method4819(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, this.field461, var7);
                } else {
                    arg3.method594(this.field461 * arg0, this.field461 * (63 - arg1), 0, var7, this.field461, this.field461, arg2.field379[var5][arg0][arg1], arg2.field388[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aj.f([Laj;I)Z")
    public boolean method343(class35[] arg0) {
        if (this.field462 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field458 == null) {
            Iterator var3 = this.field459.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method346(var4.method571() * 8, var4.method568() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method346(0, 0, 64, 64, this.field458, var2);
        }
        this.method419(arg0, var2);
        this.method463(var2);
        return true;
    }

    @ObfuscatedName("aj.s(Lay;I)V")
    public void method463(class44 arg0) {
        this.field462 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field462[var2][var3] = arg0.method550(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("aj.e([Laj;Lay;B)V")
    public void method419(class35[] arg0, class44 arg1) {
        class236[] var3 = class236.method1082();
        class236[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class236 var6 = var4[var5];
            if (arg0[var6.method18()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3238) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                }
                this.method347(var11, var12, var7, var8, var9, var10, arg0[var6.method18()], arg1);
            }
        }
    }

    @ObfuscatedName("aj.q(IIIILaa;Lay;I)V")
    public void method346(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field385[0][var7][var8] - 1;
                if (var9 != -1) {
                    class254 var10 = class254.method1000(var9);
                    arg5.method549(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("aj.h(IIIIIILaj;Lay;I)V")
    public void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method367(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class254 var12 = class254.method1000(var11);
                    arg7.method549(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("aj.i(IILaa;B)I")
    public int method348(int arg0, int arg1, class29 arg2) {
        return arg2.field385[0][arg0][arg1] == 0 ? this.field454 : this.field462[arg0][arg1];
    }

    @ObfuscatedName("aj.o(IILaa;[Lkl;B)V")
    public void method349(int arg0, int arg1, class29 arg2, class294[] arg3) {
        for (int var5 = 0; var5 < arg2.field384; var5++) {
            class32[] var6 = arg2.field389[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class229.method2006(var9.field427)) {
                        int var10 = var9.field427;
                        boolean var11 = class229.field2908.field2909 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class263 var12 = class263.method10(var9.field421);
                    if (var12.field3529 != -1) {
                        if (var12.field3529 == 46 || var12.field3529 == 52) {
                            arg3[var12.field3529].method4876(this.field461 * arg0, this.field461 * (63 - arg1), this.field461 * 2 + 1, this.field461 * 2 + 1);
                        } else {
                            arg3[var12.field3529].method4876(this.field461 * arg0, this.field461 * (63 - arg1), this.field461 * 2, this.field461 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.w(IILaa;B)V")
    public void method331(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field384; var4++) {
            class32[] var5 = arg2.field389[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class229.method2024(var8.field427)) {
                        class263 var9 = class263.method10(var8.field421);
                        int var10 = var9.field3519 == 0 ? -3355444 : -3407872;
                        if (class229.field2893.field2909 == var8.field427) {
                            this.method397(arg0, arg1, var8.field419, var10);
                        }
                        if (class229.field2888.field2909 == var8.field427) {
                            this.method397(arg0, arg1, var8.field419, -3355444);
                            this.method397(arg0, arg1, var8.field419 + 1, var10);
                        }
                        if (class229.field2889.field2909 == var8.field427) {
                            if (var8.field419 == 0) {
                                class291.method4794(this.field461 * arg0, this.field461 * (63 - arg1), 1, var10);
                            }
                            if (var8.field419 == 1) {
                                class291.method4794(this.field461 * arg0 + this.field461 - 1, this.field461 * (63 - arg1), 1, var10);
                            }
                            if (var8.field419 == 2) {
                                class291.method4794(this.field461 * arg0 + this.field461 - 1, this.field461 * (63 - arg1) + this.field461 - 1, 1, var10);
                            }
                            if (var8.field419 == 3) {
                                class291.method4794(this.field461 * arg0, this.field461 * (63 - arg1) + this.field461 - 1, 1, var10);
                            }
                        }
                        if (class229.field2890.field2909 == var8.field427) {
                            int var11 = var8.field419 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field461; var12++) {
                                    class291.method4794(this.field461 * arg0 + var12, this.field461 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field461; var13++) {
                                    class291.method4794(this.field461 * arg0 + var13, this.field461 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.ah(IILjava/util/HashSet;II)V")
    public void method351(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field470.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class220 var9 = (class220) var8.getKey();
            int var10 = (int) ((float) var9.field2691 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2692 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field510 = var10;
                var12.field513 = var11;
                class250 var13 = Statics.field3365[var12.field514];
                if (!arg2.contains(var13.method4105())) {
                    this.method353(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aj.ak(Ljava/util/HashSet;III)V")
    public void method352(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field456.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class250 var6 = Statics.field3365[var5.field514];
            if (var6 != null && arg0.contains(var6.method4105())) {
                this.method416(var6, var5.field510, var5.field513, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("aj.aa(Liz;IIIII)V")
    public void method416(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        class295 var6 = arg0.method4118(false);
        if (var6 == null) {
            return;
        }
        var6.method4903(arg1 - var6.field3835 / 2, arg2 - var6.field3836 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class291.method4782(arg1, arg2, 15, 16776960, 128);
            class291.method4782(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aj.ax(Lap;IIFB)V")
    public void method353(class40 arg0, int arg1, int arg2, float arg3) {
        class250 var5 = Statics.field3365[arg0.field514];
        this.method354(var5, arg1, arg2);
        this.method355(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aj.aq(Liz;IIB)V")
    public void method354(class250 arg0, int arg1, int arg2) {
        class295 var4 = arg0.method4118(false);
        if (var4 != null) {
            int var5 = this.method359(var4, arg0.field3381);
            int var6 = this.method411(var4, arg0.field3380);
            var4.method4903(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aj.au(Lap;Liz;IIFI)V")
    public void method355(class40 arg0, class250 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field511 != null && arg0.field511.field444.method175(arg4)) {
            class271 var6 = (class271) this.field466.get(arg0.field511.field444);
            var6.method4588(arg0.field511.field443, arg2 - arg0.field511.field442 / 2, arg3, arg0.field511.field442, arg0.field511.field446, 0xFF000000 | arg1.field3371, 0, 1, 0, var6.field3719 / 2);
        }
    }

    @ObfuscatedName("aj.al(IILjava/util/HashSet;II)V")
    public void method356(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field456.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field507.field2691 % 64;
            int var9 = var7.field507.field2692 % 64;
            var7.field510 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field513 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field514)) {
                this.method353(var7, var7.field510, var7.field513, var5);
            }
        }
    }

    @ObfuscatedName("aj.ae(I)V")
    public void method357() {
        if (this.field458 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method468(var1, var2, this.field458);
                }
            }
            return;
        }
        Iterator var3 = this.field459.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method571() * 8; var5 < var4.method571() * 8 + 8; var5++) {
                for (int var6 = var4.method568() * 8; var6 < var4.method568() * 8 + 8; var6++) {
                    this.method468(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("aj.aj(IILaa;B)V")
    public void method468(int arg0, int arg1, class29 arg2) {
        field467.method3797(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field384; var4++) {
            class32[] var5 = arg2.field389[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class250 var9 = this.method390(var8.field421);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field470.get(field467);
                        if (var10 != null) {
                            if (var9.field3367 != var10.field514) {
                                class40 var11 = new class40(var9.field3367, var10.field508, var10.field507, this.method363(var9));
                                this.field470.put(new class220(field467), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field508.field2690 - var10.field507.field2690;
                            var10.field507.field2690 = var4;
                            var10.field508.field2690 = var4 + var12;
                            return;
                        }
                        class220 var13 = new class220(var4, this.field472 * 64 + arg0, this.field453 * 64 + arg1);
                        class220 var14 = null;
                        if (this.field458 == null) {
                            Iterator var15 = this.field459.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method566(arg0, arg1)) {
                                    var14 = new class220(var16.field390 + var4, var16.field392 * 64 + arg0 + var16.method569() * 8, var16.field380 * 64 + arg1 + var16.method570() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class220(this.field458.field390 + var4, this.field458.field392 * 64 + arg0, this.field458.field380 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3367, var14, var13, this.method363(var9));
                            this.field470.put(new class220(field467), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field470.remove(field467);
    }

    @ObfuscatedName("aj.as(Lky;Ljn;I)I")
    public int method359(class295 arg0, class265 arg1) {
        switch(arg1.field3610) {
            case 0:
                return -arg0.field3835 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3835;
        }
    }

    @ObfuscatedName("aj.am(Lky;Lih;I)I")
    public int method411(class295 arg0, class247 arg1) {
        switch(arg1.field3346) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3836 / 2;
            default:
                return -arg0.field3836;
        }
    }

    @ObfuscatedName("aj.ag(II)Liz;")
    public class250 method390(int arg0) {
        class263 var2 = class263.method10(arg0);
        if (var2.field3541 != null) {
            var2 = var2.method4355();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3528 == -1 ? null : Statics.field3365[var2.field3528];
    }

    @ObfuscatedName("aj.aw(IB)Lae;")
    public class34 method362(int arg0) {
        class250 var2 = Statics.field3365[arg0];
        return this.method363(var2);
    }

    @ObfuscatedName("aj.ap(Liz;I)Lae;")
    public class34 method363(class250 arg0) {
        if (arg0.field3370 == null || this.field466 == null || this.field466.get(class25.field344) == null) {
            return null;
        }
        int var2 = arg0.field3372;
        class25[] var3 = new class25[] { class25.field344, class25.field343, class25.field342 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field346 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class271 var9 = (class271) this.field466.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4582(arg0.field3370, 1000000);
        String[] var11 = new String[var10];
        var9.method4643(arg0.field3370, (int[]) null, var11);
        int var12 = var11.length * var9.field3719 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4578(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3370, var13, var12, var7);
    }

    @ObfuscatedName("aj.ad(IIIIIB)Ljava/util/List;")
    public List method364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field470.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method500(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field456.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method500(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aj.an(I)Ljava/util/List;")
    public List method365() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field456);
        var1.addAll(this.field470.values());
        return var1;
    }

    @ObfuscatedName("aj.ai(IIIII)V")
    public void method397(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class291.method4792(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, arg3);
        }
        if (var5 == 1) {
            class291.method4794(this.field461 * arg0, this.field461 * (63 - arg1), this.field461, arg3);
        }
        if (var5 == 2) {
            class291.method4792(this.field461 * arg0 + this.field461 - 1, this.field461 * (63 - arg1), this.field461, arg3);
        }
        if (var5 == 3) {
            class291.method4794(this.field461 * arg0, this.field461 * (63 - arg1) + this.field461 - 1, this.field461, arg3);
        }
    }

    @ObfuscatedName("aj.ay(III)I")
    public int method367(int arg0, int arg1) {
        if (this.field458 != null) {
            return this.field458.method221(arg0, arg1);
        }
        if (!this.field459.isEmpty()) {
            Iterator var3 = this.field459.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method566(arg0, arg1)) {
                    return var4.method221(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
