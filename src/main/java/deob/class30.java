package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("as")
public class class30 {

    @ObfuscatedName("as.p")
    public static class159 field234 = new class159(37748736, 256);

    @ObfuscatedName("as.b")
    public int field235;

    @ObfuscatedName("as.e")
    public int field236;

    @ObfuscatedName("as.x")
    public class16 field237;

    @ObfuscatedName("as.a")
    public LinkedList field241;

    @ObfuscatedName("as.d")
    public int field244;

    @ObfuscatedName("as.c")
    public int field240;

    @ObfuscatedName("as.o")
    public List field231;

    @ObfuscatedName("as.v")
    public HashMap field242;

    @ObfuscatedName("as.k")
    public final HashMap field243;

    @ObfuscatedName("aa.f(IIII)Lls;")
    public static class325 method318(int arg0, int arg1, int arg2) {
        class159 var3 = field234;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class325) var3.method3134(var4);
    }

    @ObfuscatedName("l.i(Lls;IIII)V")
    public static void method149(class325 arg0, int arg1, int arg2, int arg3) {
        class159 var4 = field234;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3122(arg0, var6, arg0.field3873.length * 4);
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field235 = arg0;
        this.field236 = arg1;
        this.field241 = new LinkedList();
        this.field231 = new LinkedList();
        this.field242 = new HashMap();
        this.field244 = arg2 | 0xFF000000;
        this.field243 = arg3;
    }

    @ObfuscatedName("as.y(IIIB)V")
    public void method354(int arg0, int arg1, int arg2) {
        class325 var4 = method318(this.field235, this.field236, this.field240);
        if (var4 == null) {
            return;
        }
        if (this.field240 * 64 == arg2) {
            var4.method5662(arg0, arg1);
        } else {
            var4.method5672(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("as.w(Ll;Ljava/util/List;B)V")
    public void method355(class16 arg0, List arg1) {
        this.field242.clear();
        this.field237 = arg0;
        this.method360(arg1);
    }

    @ObfuscatedName("as.p(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method356(HashSet arg0, List arg1) {
        this.field242.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method224() == this.field235 && var4.method218() == this.field236) {
                this.field241.add(var4);
            }
        }
        this.method360(arg1);
    }

    @ObfuscatedName("as.b(IIIILh;I)V")
    public void method401(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field146; var8++) {
                    class26[] var9 = arg4.field153[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class26 var12 = var10[var11];
                            class254 var13 = class254.method3616(var12.field198);
                            if (method4949(var13)) {
                                this.method358(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.e(Lig;IIILh;I)V")
    public void method358(class254 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field235 * 64 + arg2, this.field236 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field237 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field145 + arg1, var9.field143 * 64 + arg2 + var9.method582() * 8, var9.field142 * 64 + arg3 + var9.method583() * 8);
        } else {
            var8 = new class214(this.field237.field145 + arg1, this.field237.field143 * 64 + arg2, this.field237.field142 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3321 == null) {
            class242 var11 = class242.method103(arg0.field3343);
            var10 = new class19(var8, var6, var11.field3183, this.method437(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3324, this);
        }
        this.field242.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("as.x(I)V")
    public void method359() {
        Iterator var1 = this.field242.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method251();
            }
        }
    }

    @ObfuscatedName("as.a(Ljava/util/List;I)V")
    public void method360(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field277.field2516 >> 6 == this.field235 && var3.field277.field2518 >> 6 == this.field236) {
                class19 var4 = new class19(var3.field277, var3.field277, var3.field117, this.method382(var3.field117));
                this.field231.add(var4);
            }
        }
    }

    @ObfuscatedName("as.d(S)V")
    public void method361() {
        if (this.field237 != null) {
            this.field237.method239();
            return;
        }
        Iterator var1 = this.field241.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method239();
        }
    }

    @ObfuscatedName("as.c(Lhz;B)Z")
    public boolean method362(class234 arg0) {
        this.field242.clear();
        if (this.field237 == null) {
            boolean var2 = true;
            Iterator var3 = this.field241.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method220(arg0);
                var2 &= var4.method231();
            }
            if (var2) {
                Iterator var5 = this.field241.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method401(var6.method584() * 8, var6.method600() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field237.method220(arg0);
            if (this.field237.method231()) {
                this.method401(0, 0, 64, 64, this.field237);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("as.o(ILac;[Lli;Lhz;Lhz;I)V")
    public void method458(int arg0, class41 arg1, class324[] arg2, class234 arg3, class234 arg4) {
        this.field240 = arg0;
        if (this.field237 == null && this.field241.isEmpty() || method318(this.field235, this.field236, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method362(arg3);
        int var8;
        if (this.field237 == null) {
            var8 = ((class22) this.field241.getFirst()).field157;
        } else {
            var8 = this.field237.field157;
        }
        boolean var9 = var7 & arg4.method3756(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3759(var8);
        class28 var11 = class28.method262(var10);
        class325 var12 = new class325(this.field240 * 64, this.field240 * 64);
        var12.method5749();
        if (this.field237 == null) {
            this.method367(arg1, arg2, var11);
        } else {
            this.method412(arg1, arg2, var11);
        }
        method149(var12, this.field235, this.field236, this.field240);
        this.method361();
    }

    @ObfuscatedName("as.l(IIILjava/util/HashSet;B)V")
    public void method364(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method409(arg0, arg1, arg3, arg2);
        this.method379(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("as.t(Ljava/util/HashSet;III)V")
    public void method419(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field242.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method503()) {
                int var6 = var5.method183();
                if (arg0.contains(var6)) {
                    class242 var7 = class242.method103(var6);
                    this.method375(var7, var5.field279, var5.field282, arg1, arg2);
                }
            }
        }
        this.method373(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.j(Lac;[Lli;Lav;B)V")
    public void method412(class41 arg0, class324[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method410(var4, var5, this.field237, arg0, arg2);
                this.method372(var4, var5, this.field237, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method394(var6, var7, this.field237, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("as.n(Lac;[Lli;Lav;I)V")
    public void method367(class41 arg0, class324[] arg1, class28 arg2) {
        Iterator var4 = this.field241.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method584() * 8; var6 < var5.method584() * 8 + 8; var6++) {
                for (int var7 = var5.method600() * 8; var7 < var5.method600() * 8 + 8; var7++) {
                    this.method410(var6, var7, var5, arg0, arg2);
                    this.method372(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field241.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method584() * 8; var10 < var9.method584() * 8 + 8; var10++) {
                for (int var11 = var9.method600() * 8; var11 < var9.method600() * 8 + 8; var11++) {
                    this.method394(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("as.u(IILh;Lac;[Lli;I)V")
    public void method394(int arg0, int arg1, class22 arg2, class41 arg3, class324[] arg4) {
        this.method388(arg0, arg1, arg2);
        this.method371(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("as.z(IILh;Lac;Lav;I)V")
    public void method410(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field149[0][arg0][arg1] - 1;
        int var7 = arg2.field159[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class321.method5589(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, this.field244);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class33.method3322(var7, this.field244);
        }
        if (var7 > -1 && arg2.field151[0][arg0][arg1] == 0) {
            class321.method5589(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, var8);
            return;
        }
        int var9 = this.method370(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class321.method5589(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, var9);
        } else {
            arg3.method615(this.field240 * arg0, this.field240 * (63 - arg1), var9, var8, this.field240, this.field240, arg2.field151[0][arg0][arg1], arg2.field150[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("as.h(IILh;Lac;I)V")
    public void method372(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field146; var5++) {
            int var6 = arg2.field159[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class33.method3322(var6, this.field244);
                if (arg2.field151[var5][arg0][arg1] == 0) {
                    class321.method5589(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, var7);
                } else {
                    arg3.method615(this.field240 * arg0, this.field240 * (63 - arg1), 0, var7, this.field240, this.field240, arg2.field151[var5][arg0][arg1], arg2.field150[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("as.m(IILh;Lav;I)I")
    public int method370(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field149[0][arg0][arg1] == 0 ? this.field244 : arg3.method344(arg0, arg1);
    }

    @ObfuscatedName("as.aa(IILh;[Lli;I)V")
    public void method371(int arg0, int arg1, class22 arg2, class324[] arg3) {
        for (int var5 = 0; var5 < arg2.field146; var5++) {
            class26[] var6 = arg2.field153[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field193;
                    boolean var11 = var10 >= class221.field2726.field2729 && var10 <= class221.field2727.field2729;
                    if (!var11) {
                        int var12 = var9.field193;
                        boolean var13 = class221.field2728.field2729 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class254 var14 = class254.method3616(var9.field198);
                    if (var14.field3344 != -1) {
                        if (var14.field3344 == 46 || var14.field3344 == 52) {
                            arg3[var14.field3344].method5626(this.field240 * arg0, this.field240 * (63 - arg1), this.field240 * 2 + 1, this.field240 * 2 + 1);
                        } else {
                            arg3[var14.field3344].method5626(this.field240 * arg0, this.field240 * (63 - arg1), this.field240 * 2, this.field240 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.av(IILh;I)V")
    public void method388(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field146; var4++) {
            class26[] var5 = arg2.field153[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    if (class221.method2053(var8.field193)) {
                        class254 var9 = class254.method3616(var8.field198);
                        int var10 = var9.field3334 == 0 ? -3355444 : -3407872;
                        if (class221.field2720.field2729 == var8.field193) {
                            this.method386(arg0, arg1, var8.field197, var10);
                        }
                        if (class221.field2711.field2729 == var8.field193) {
                            this.method386(arg0, arg1, var8.field197, -3355444);
                            this.method386(arg0, arg1, var8.field197 + 1, var10);
                        }
                        if (class221.field2709.field2729 == var8.field193) {
                            if (var8.field197 == 0) {
                                class321.method5554(this.field240 * arg0, this.field240 * (63 - arg1), 1, var10);
                            }
                            if (var8.field197 == 1) {
                                class321.method5554(this.field240 * arg0 + this.field240 - 1, this.field240 * (63 - arg1), 1, var10);
                            }
                            if (var8.field197 == 2) {
                                class321.method5554(this.field240 * arg0 + this.field240 - 1, this.field240 * (63 - arg1) + this.field240 - 1, 1, var10);
                            }
                            if (var8.field197 == 3) {
                                class321.method5554(this.field240 * arg0, this.field240 * (63 - arg1) + this.field240 - 1, 1, var10);
                            }
                        }
                        if (class221.field2708.field2729 == var8.field193) {
                            int var11 = var8.field197 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field240; var12++) {
                                    class321.method5554(this.field240 * arg0 + var12, this.field240 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field240; var13++) {
                                    class321.method5554(this.field240 * arg0 + var13, this.field240 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.aw(IILjava/util/HashSet;II)V")
    public void method409(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field242.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2516 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2518 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method503()) {
                var12.field279 = var10;
                var12.field282 = var11;
                class242 var13 = class242.method103(var12.method183());
                if (!arg2.contains(var13.method3975())) {
                    this.method376(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("as.as(Ljava/util/HashSet;III)V")
    public void method373(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field231.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method503()) {
                class242 var6 = class242.method103(var5.method183());
                if (var6 != null && arg0.contains(var6.method3975())) {
                    this.method375(var6, var5.field279, var5.field282, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("as.ak(Lit;IIIII)V")
    public void method375(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        class325 var6 = arg0.method3987(false);
        if (var6 == null) {
            return;
        }
        var6.method5712(arg1 - var6.field3875 / 2, arg2 - var6.field3865 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class321.method5550(arg1, arg2, 15, 16776960, 128);
            class321.method5550(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("as.au(Lao;IIFB)V")
    public void method376(class35 arg0, int arg1, int arg2, float arg3) {
        class242 var5 = class242.method103(arg0.method183());
        this.method377(var5, arg1, arg2);
        this.method444(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("as.ah(Lit;III)V")
    public void method377(class242 arg0, int arg1, int arg2) {
        class325 var4 = arg0.method3987(false);
        if (var4 != null) {
            int var5 = this.method380(var4, arg0.field3190);
            int var6 = this.method381(var4, arg0.field3200);
            var4.method5712(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("as.aq(Lao;Lit;IIFB)V")
    public void method444(class35 arg0, class242 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method169();
        if (var6 != null && var6.field225.method163(arg4)) {
            class294 var7 = (class294) this.field243.get(var6.field225);
            var7.method4970(var6.field223, arg2 - var6.field230 / 2, arg3, var6.field230, var6.field226, 0xFF000000 | arg1.field3196, 0, 1, 0, var7.field3666 / 2);
        }
    }

    @ObfuscatedName("as.ao(IILjava/util/HashSet;II)V")
    public void method379(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field231.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method503()) {
                int var8 = var7.field277.field2516 % 64;
                int var9 = var7.field277.field2518 % 64;
                var7.field279 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field282 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method183())) {
                    this.method376(var7, var7.field279, var7.field282, var5);
                }
            }
        }
    }

    @ObfuscatedName("as.an(Lls;Liz;B)I")
    public int method380(class325 arg0, class256 arg1) {
        switch(arg1.field3427) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3875 / 2;
            default:
                return -arg0.field3875;
        }
    }

    @ObfuscatedName("as.ar(Lls;Lia;I)I")
    public int method381(class325 arg0, class239 arg1) {
        switch(arg1.field3173) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3865 / 2;
            default:
                return -arg0.field3865;
        }
    }

    @ObfuscatedName("kk.az(Lig;B)Z")
    public static boolean method4949(class254 arg0) {
        if (arg0.field3321 != null) {
            int[] var1 = arg0.field3321;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class254 var4 = class254.method3616(var3);
                if (var4.field3343 != -1) {
                    return true;
                }
            }
        } else if (arg0.field3343 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("as.ay(II)Law;")
    public class29 method382(int arg0) {
        class242 var2 = class242.method103(arg0);
        return this.method437(var2);
    }

    @ObfuscatedName("as.ag(Lit;B)Law;")
    public class29 method437(class242 arg0) {
        if (arg0.field3189 == null || this.field243 == null || this.field243.get(class18.field107) == null) {
            return null;
        }
        class18 var2 = Statics.method162(arg0.field3187);
        if (var2 == null) {
            return null;
        }
        class294 var3 = (class294) this.field243.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5043(arg0.field3189, 1000000);
        String[] var5 = new String[var4];
        var3.method4963(arg0.field3189, (int[]) null, var5);
        int var6 = var5.length * var3.field3666 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4962(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class29(arg0.field3189, var7, var6, var2);
    }

    @ObfuscatedName("as.ac(IIIIII)Ljava/util/List;")
    public List method435(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field242.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method503() && var8.method502(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field231.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method503() && var10.method502(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("as.al(I)Ljava/util/List;")
    public List method452() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field231);
        var1.addAll(this.field242.values());
        return var1;
    }

    @ObfuscatedName("as.ae(IIIII)V")
    public void method386(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class321.method5566(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, arg3);
        }
        if (var5 == 1) {
            class321.method5554(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, arg3);
        }
        if (var5 == 2) {
            class321.method5566(this.field240 * arg0 + this.field240 - 1, this.field240 * (63 - arg1), this.field240, arg3);
        }
        if (var5 == 3) {
            class321.method5554(this.field240 * arg0, this.field240 * (63 - arg1) + this.field240 - 1, this.field240, arg3);
        }
    }
}
