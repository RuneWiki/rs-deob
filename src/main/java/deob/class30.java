package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ai")
public class class30 {

    @ObfuscatedName("ai.z")
    public static class150 field242 = new class150(37748736, 256);

    @ObfuscatedName("ai.p")
    public int field243;

    @ObfuscatedName("ai.h")
    public int field248;

    @ObfuscatedName("ai.y")
    public class16 field245;

    @ObfuscatedName("ai.w")
    public LinkedList field246;

    @ObfuscatedName("ai.i")
    public int field250;

    @ObfuscatedName("ai.k")
    public int field239;

    @ObfuscatedName("ai.x")
    public List field249;

    @ObfuscatedName("ai.o")
    public HashMap field247;

    @ObfuscatedName("ai.e")
    public final HashMap field251;

    @ObfuscatedName("aj.u(Lln;IIIB)V")
    public static void method671(class325 arg0, int arg1, int arg2, int arg3) {
        class150 var4 = field242;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3104(arg0, var6, arg0.field3877.length * 4);
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field243 = arg0;
        this.field248 = arg1;
        this.field246 = new LinkedList();
        this.field249 = new LinkedList();
        this.field247 = new HashMap();
        this.field250 = arg2 | 0xFF000000;
        this.field251 = arg3;
    }

    @ObfuscatedName("ai.b(IIII)V")
    public void method396(int arg0, int arg1, int arg2) {
        int var4 = this.field243;
        int var5 = this.field248;
        int var6 = this.field239;
        class150 var7 = field242;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class325 var10 = (class325) var7.method3101(var8);
        if (var10 == null) {
            return;
        }
        if (this.field239 * 64 == arg2) {
            var10.method5689(arg0, arg1);
        } else {
            var10.method5712(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ai.g(Lr;Ljava/util/List;I)V")
    public void method423(class16 arg0, List arg1) {
        this.field247.clear();
        this.field245 = arg0;
        this.method392(arg1);
    }

    @ObfuscatedName("ai.z(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method375(HashSet arg0, List arg1) {
        this.field247.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method259() == this.field243 && var4.method269() == this.field248) {
                this.field246.add(var4);
            }
        }
        this.method392(arg1);
    }

    @ObfuscatedName("ai.p(IIIILm;I)V")
    public void method376(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field173; var8++) {
                    class26[] var9 = arg4.field169[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class254 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class254.method3048(var12.field208);
                                if (var13.field3395 != null) {
                                    int[] var14 = var13.field3395;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class254 var17 = class254.method3048(var16);
                                        if (var17.field3382 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3382 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method483(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.h(Lil;IIILm;I)V")
    public void method483(class254 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field243 * 64 + arg2, this.field248 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field245 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field172 + arg1, var9.field158 * 64 + arg2 + var9.method588() * 8, var9.field171 * 64 + arg3 + var9.method607() * 8);
        } else {
            var8 = new class214(this.field245.field172 + arg1, this.field245.field158 * 64 + arg2, this.field245.field171 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3395 == null) {
            class242 var11 = class242.method2014(arg0.field3382);
            var10 = new class19(var8, var6, var11.field3221, this.method402(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3355, this);
        }
        this.field247.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("ai.y(I)V")
    public void method378() {
        Iterator var1 = this.field247.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method277();
            }
        }
    }

    @ObfuscatedName("ai.w(Ljava/util/List;I)V")
    public void method392(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field294.field2536 >> 6 == this.field243 && var3.field294.field2535 >> 6 == this.field248) {
                class19 var4 = new class19(var3.field294, var3.field294, var3.field127, this.method401(var3.field127));
                this.field249.add(var4);
            }
        }
    }

    @ObfuscatedName("ai.i(B)V")
    public void method379() {
        if (this.field245 != null) {
            this.field245.method249();
            return;
        }
        Iterator var1 = this.field246.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method249();
        }
    }

    @ObfuscatedName("ai.k(Lhf;I)Z")
    public boolean method380(class234 arg0) {
        this.field247.clear();
        if (this.field245 == null) {
            boolean var2 = true;
            Iterator var3 = this.field246.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method261(arg0);
                var2 &= var4.method248();
            }
            if (var2) {
                Iterator var5 = this.field246.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method376(var6.method589() * 8, var6.method593() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field245.method261(arg0);
            if (this.field245.method248()) {
                this.method376(0, 0, 64, 64, this.field245);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ai.x(ILaz;[Llm;Lhf;Lhf;S)V")
    public void method381(int arg0, class41 arg1, class324[] arg2, class234 arg3, class234 arg4) {
        this.field239 = arg0;
        if (this.field245 == null && this.field246.isEmpty()) {
            return;
        }
        int var6 = this.field243;
        int var7 = this.field248;
        class150 var8 = field242;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class325 var11 = (class325) var8.method3101(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method380(arg3);
        int var14;
        if (this.field245 == null) {
            var14 = ((class22) this.field246.getFirst()).field163;
        } else {
            var14 = this.field245.field163;
        }
        boolean var15 = var13 & arg4.method3889(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method3850(var14);
        class28 var17;
        if (var16 == null) {
            var17 = new class28();
        } else {
            var17 = new class28(class50.method963(var16).field3877);
        }
        class325 var19 = new class325(this.field239 * 64, this.field239 * 64);
        var19.method5682();
        if (this.field245 == null) {
            this.method385(arg1, arg2, var17);
        } else {
            this.method390(arg1, arg2, var17);
        }
        method671(var19, this.field243, this.field248, this.field239);
        this.method379();
    }

    @ObfuscatedName("ai.o(IIILjava/util/HashSet;I)V")
    public void method382(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method377(arg0, arg1, arg3, arg2);
        this.method398(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ai.e(Ljava/util/HashSet;IIB)V")
    public void method463(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field247.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method523()) {
                int var6 = var5.method191();
                if (arg0.contains(var6)) {
                    class242 var7 = class242.method2014(var6);
                    this.method394(var7, var5.field295, var5.field296, arg1, arg2);
                }
            }
        }
        this.method393(arg0, arg1, arg2);
    }

    @ObfuscatedName("ai.n(Laz;[Llm;Lad;I)V")
    public void method390(class41 arg0, class324[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method387(var4, var5, this.field245, arg0, arg2);
                this.method446(var4, var5, this.field245, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method493(var6, var7, this.field245, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ai.c(Laz;[Llm;Lad;I)V")
    public void method385(class41 arg0, class324[] arg1, class28 arg2) {
        Iterator var4 = this.field246.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method589() * 8; var6 < var5.method589() * 8 + 8; var6++) {
                for (int var7 = var5.method593() * 8; var7 < var5.method593() * 8 + 8; var7++) {
                    this.method387(var6, var7, var5, arg0, arg2);
                    this.method446(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field246.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method589() * 8; var10 < var9.method589() * 8 + 8; var10++) {
                for (int var11 = var9.method593() * 8; var11 < var9.method593() * 8 + 8; var11++) {
                    this.method493(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ai.s(IILm;Laz;[Llm;S)V")
    public void method493(int arg0, int arg1, class22 arg2, class41 arg3, class324[] arg4) {
        this.method391(arg0, arg1, arg2);
        this.method386(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ai.t(IILm;Laz;Lad;I)V")
    public void method387(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field165[0][arg0][arg1] - 1;
        int var7 = arg2.field166[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class321.method5595(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, this.field250);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class33.method4927(var7, this.field250);
        }
        if (var7 > -1 && arg2.field167[0][arg0][arg1] == 0) {
            class321.method5595(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, var8);
            return;
        }
        int var9 = this.method389(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class321.method5595(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, var9);
        } else {
            arg3.method613(this.field239 * arg0, this.field239 * (63 - arg1), var9, var8, this.field239, this.field239, arg2.field167[0][arg0][arg1], arg2.field161[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ai.m(IILm;Laz;I)V")
    public void method446(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field173; var5++) {
            int var6 = arg2.field166[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class33.method4927(var6, this.field250);
                if (arg2.field167[var5][arg0][arg1] == 0) {
                    class321.method5595(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, var7);
                } else {
                    arg3.method613(this.field239 * arg0, this.field239 * (63 - arg1), 0, var7, this.field239, this.field239, arg2.field167[var5][arg0][arg1], arg2.field161[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ai.v(IILm;Lad;B)I")
    public int method389(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field165[0][arg0][arg1] == 0 ? this.field250 : arg3.method365(arg0, arg1);
    }

    @ObfuscatedName("ai.q(IILm;[Llm;I)V")
    public void method386(int arg0, int arg1, class22 arg2, class324[] arg3) {
        for (int var5 = 0; var5 < arg2.field173; var5++) {
            class26[] var6 = arg2.field169[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field205;
                    boolean var11 = var10 >= class221.field2748.field2746 && var10 <= class221.field2729.field2746;
                    if (var11 || class221.method3404(var9.field205)) {
                        class254 var12 = class254.method3048(var9.field208);
                        if (var12.field3358 != -1) {
                            if (var12.field3358 == 46 || var12.field3358 == 52) {
                                arg3[var12.field3358].method5666(this.field239 * arg0, this.field239 * (63 - arg1), this.field239 * 2 + 1, this.field239 * 2 + 1);
                            } else {
                                arg3[var12.field3358].method5666(this.field239 * arg0, this.field239 * (63 - arg1), this.field239 * 2, this.field239 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.l(IILm;B)V")
    public void method391(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field173; var4++) {
            class26[] var5 = arg2.field169[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    if (class221.method1896(var8.field205)) {
                        class254 var9 = class254.method3048(var8.field208);
                        int var10 = var9.field3388 == 0 ? -3355444 : -3407872;
                        if (class221.field2749.field2746 == var8.field205) {
                            this.method405(arg0, arg1, var8.field204, var10);
                        }
                        if (class221.field2728.field2746 == var8.field205) {
                            this.method405(arg0, arg1, var8.field204, -3355444);
                            this.method405(arg0, arg1, var8.field204 + 1, var10);
                        }
                        if (class221.field2731.field2746 == var8.field205) {
                            if (var8.field204 == 0) {
                                class321.method5601(this.field239 * arg0, this.field239 * (63 - arg1), 1, var10);
                            }
                            if (var8.field204 == 1) {
                                class321.method5601(this.field239 * arg0 + this.field239 - 1, this.field239 * (63 - arg1), 1, var10);
                            }
                            if (var8.field204 == 2) {
                                class321.method5601(this.field239 * arg0 + this.field239 - 1, this.field239 * (63 - arg1) + this.field239 - 1, 1, var10);
                            }
                            if (var8.field204 == 3) {
                                class321.method5601(this.field239 * arg0, this.field239 * (63 - arg1) + this.field239 - 1, 1, var10);
                            }
                        }
                        if (class221.field2732.field2746 == var8.field205) {
                            int var11 = var8.field204 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field239; var12++) {
                                    class321.method5601(this.field239 * arg0 + var12, this.field239 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field239; var13++) {
                                    class321.method5601(this.field239 * arg0 + var13, this.field239 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.j(IILjava/util/HashSet;II)V")
    public void method377(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field247.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2536 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2535 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method523()) {
                var12.field295 = var10;
                var12.field296 = var11;
                class242 var13 = class242.method2014(var12.method191());
                if (!arg2.contains(var13.method4058())) {
                    this.method395(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ai.ad(Ljava/util/HashSet;III)V")
    public void method393(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field249.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method523()) {
                class242 var6 = class242.method2014(var5.method191());
                if (var6 != null && arg0.contains(var6.method4058())) {
                    this.method394(var6, var5.field295, var5.field296, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ai.am(Lis;IIIIB)V")
    public void method394(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        class325 var6 = arg0.method4057(false);
        if (var6 == null) {
            return;
        }
        var6.method5691(arg1 - var6.field3869 / 2, arg2 - var6.field3872 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class321.method5633(arg1, arg2, 15, 16776960, 128);
            class321.method5633(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ai.ai(Laa;IIFI)V")
    public void method395(class35 arg0, int arg1, int arg2, float arg3) {
        class242 var5 = class242.method2014(arg0.method191());
        this.method471(var5, arg1, arg2);
        this.method397(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ai.ag(Lis;III)V")
    public void method471(class242 arg0, int arg1, int arg2) {
        class325 var4 = arg0.method4057(false);
        if (var4 != null) {
            int var5 = this.method399(var4, arg0.field3234);
            int var6 = this.method400(var4, arg0.field3225);
            var4.method5691(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ai.ao(Laa;Lis;IIFI)V")
    public void method397(class35 arg0, class242 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method192();
        if (var6 != null && var6.field237.method179(arg4)) {
            class295 var7 = (class295) this.field251.get(var6.field237);
            var7.method4997(var6.field236, arg2 - var6.field230 / 2, arg3, var6.field230, var6.field229, 0xFF000000 | arg1.field3228, 0, 1, 0, var7.field3691 / 2);
        }
    }

    @ObfuscatedName("ai.aw(IILjava/util/HashSet;II)V")
    public void method398(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field249.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method523()) {
                int var8 = var7.field294.field2536 % 64;
                int var9 = var7.field294.field2535 % 64;
                var7.field295 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field296 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method191())) {
                    this.method395(var7, var7.field295, var7.field296, var5);
                }
            }
        }
    }

    @ObfuscatedName("ai.ak(Lln;Lip;B)I")
    public int method399(class325 arg0, class256 arg1) {
        switch(arg1.field3464) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3869 / 2;
            default:
                return -arg0.field3869;
        }
    }

    @ObfuscatedName("ai.aa(Lln;Lik;B)I")
    public int method400(class325 arg0, class239 arg1) {
        switch(arg1.field3205) {
            case 1:
                return -arg0.field3872 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3872;
        }
    }

    @ObfuscatedName("ai.ab(II)Lam;")
    public class29 method401(int arg0) {
        class242 var2 = class242.method2014(arg0);
        return this.method402(var2);
    }

    @ObfuscatedName("ai.ar(Lis;I)Lam;")
    public class29 method402(class242 arg0) {
        if (arg0.field3224 == null || this.field251 == null || this.field251.get(class18.field114) == null) {
            return null;
        }
        class18 var2 = class18.method189(arg0.field3226);
        if (var2 == null) {
            return null;
        }
        class295 var3 = (class295) this.field251.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4991(arg0.field3224, 1000000);
        String[] var5 = new String[var4];
        var3.method4989(arg0.field3224, (int[]) null, var5);
        int var6 = var5.length * var3.field3691 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5040(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class29(arg0.field3224, var7, var6, var2);
    }

    @ObfuscatedName("ai.av(IIIIII)Ljava/util/List;")
    public List method403(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field247.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method523() && var8.method522(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field249.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method523() && var10.method522(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ai.aq(I)Ljava/util/List;")
    public List method404() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field249);
        var1.addAll(this.field247.values());
        return var1;
    }

    @ObfuscatedName("ai.ac(IIIII)V")
    public void method405(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class321.method5603(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, arg3);
        }
        if (var5 == 1) {
            class321.method5601(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, arg3);
        }
        if (var5 == 2) {
            class321.method5603(this.field239 * arg0 + this.field239 - 1, this.field239 * (63 - arg1), this.field239, arg3);
        }
        if (var5 == 3) {
            class321.method5601(this.field239 * arg0, this.field239 * (63 - arg1) + this.field239 - 1, this.field239, arg3);
        }
    }
}
