package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.u")
    public static class150 field238 = new class150(37748736, 256);

    @ObfuscatedName("af.n")
    public int field239;

    @ObfuscatedName("af.t")
    public int field240;

    @ObfuscatedName("af.q")
    public class16 field246;

    @ObfuscatedName("af.x")
    public LinkedList field242;

    @ObfuscatedName("af.d")
    public int field243;

    @ObfuscatedName("af.f")
    public int field236;

    @ObfuscatedName("af.c")
    public List field241;

    @ObfuscatedName("af.r")
    public HashMap field245;

    @ObfuscatedName("af.y")
    public final HashMap field247;

    @ObfuscatedName("gv.s(IIIB)J")
    public static long method3318(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("g.j(Lls;IIII)V")
    public static void method158(class325 arg0, int arg1, int arg2, int arg3) {
        field238.method3092(arg0, method3318(arg1, arg2, arg3), arg0.field3874.length * 4);
    }

    @ObfuscatedName("it.i(I)V")
    public static void method4079() {
        field238.method3108();
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field239 = arg0;
        this.field240 = arg1;
        this.field242 = new LinkedList();
        this.field241 = new LinkedList();
        this.field245 = new HashMap();
        this.field243 = arg2 | 0xFF000000;
        this.field247 = arg3;
    }

    @ObfuscatedName("af.k(IIII)V")
    public void method418(int arg0, int arg1, int arg2) {
        int var4 = this.field239;
        int var5 = this.field240;
        int var6 = this.field236;
        class325 var7 = (class325) field238.method3089(method3318(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field236 * 64 == arg2) {
            var7.method5596(arg0, arg1);
        } else {
            var7.method5618(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("af.u(Lb;Ljava/util/List;I)V")
    public void method352(class16 arg0, List arg1) {
        this.field245.clear();
        this.field246 = arg0;
        this.method356(arg1);
    }

    @ObfuscatedName("af.n(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method465(HashSet arg0, List arg1) {
        this.field245.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method222() == this.field239 && var4.method225() == this.field240) {
                this.field242.add(var4);
            }
        }
        this.method356(arg1);
    }

    @ObfuscatedName("af.t(IIIILl;I)V")
    public void method378(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field153; var8++) {
                    class26[] var9 = arg4.field158[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class254 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class254.method3676(var12.field198);
                                if (var13.field3354 != null) {
                                    int[] var14 = var13.field3354;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class254 var17 = class254.method3676(var16);
                                        if (var17.field3359 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3359 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method354(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.q(Lik;IIILl;I)V")
    public void method354(class254 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field239 * 64 + arg2, this.field240 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field246 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field150 + arg1, var9.field155 * 64 + arg2 + var9.method559() * 8, var9.field147 * 64 + arg3 + var9.method560() * 8);
        } else {
            var8 = new class214(this.field246.field150 + arg1, this.field246.field155 * 64 + arg2, this.field246.field147 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3354 == null) {
            class242 var11 = class242.method156(arg0.field3359);
            var10 = new class19(var8, var6, var11.field3204, this.method380(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3338, this);
        }
        this.field245.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("af.x(B)V")
    public void method463() {
        Iterator var1 = this.field245.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method253();
            }
        }
    }

    @ObfuscatedName("af.d(Ljava/util/List;I)V")
    public void method356(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field289.field2513 >> 6 == this.field239 && var3.field289.field2511 >> 6 == this.field240) {
                class19 var4 = new class19(var3.field289, var3.field289, var3.field115, this.method379(var3.field115));
                this.field241.add(var4);
            }
        }
    }

    @ObfuscatedName("af.f(B)V")
    public void method357() {
        if (this.field246 != null) {
            this.field246.method218();
            return;
        }
        Iterator var1 = this.field242.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method218();
        }
    }

    @ObfuscatedName("af.c(Lhz;I)Z")
    public boolean method358(class234 arg0) {
        this.field245.clear();
        if (this.field246 == null) {
            boolean var2 = true;
            Iterator var3 = this.field242.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method217(arg0);
                var2 &= var4.method240();
            }
            if (var2) {
                Iterator var5 = this.field242.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method378(var6.method561() * 8, var6.method562() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field246.method217(arg0);
            if (this.field246.method240()) {
                this.method378(0, 0, 64, 64, this.field246);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("af.r(ILax;[Llq;Lhz;Lhz;I)V")
    public void method359(int arg0, class41 arg1, class324[] arg2, class234 arg3, class234 arg4) {
        this.field236 = arg0;
        if (this.field246 == null && this.field242.isEmpty()) {
            return;
        }
        int var6 = this.field239;
        int var7 = this.field240;
        class325 var8 = (class325) field238.method3089(method3318(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method358(arg3);
        int var11;
        if (this.field246 == null) {
            var11 = ((class22) this.field242.getFirst()).field152;
        } else {
            var11 = this.field246.field152;
        }
        boolean var12 = var10 & arg4.method3769(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method3831(var11);
        class28 var14;
        if (var13 == null) {
            var14 = new class28();
        } else {
            var14 = new class28(class50.method179(var13).field3874);
        }
        class325 var16 = new class325(this.field236 * 64, this.field236 * 64);
        var16.method5592();
        if (this.field246 == null) {
            this.method363(arg1, arg2, var14);
        } else {
            this.method362(arg1, arg2, var14);
        }
        method158(var16, this.field239, this.field240, this.field236);
        this.method357();
    }

    @ObfuscatedName("af.y(IIILjava/util/HashSet;I)V")
    public void method350(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method414(arg0, arg1, arg3, arg2);
        this.method430(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("af.p(Ljava/util/HashSet;III)V")
    public void method351(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field245.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method492()) {
                int var6 = var5.method169();
                if (arg0.contains(var6)) {
                    class242 var7 = class242.method156(var6);
                    this.method372(var7, var5.field287, var5.field288, arg1, arg2);
                }
            }
        }
        this.method457(arg0, arg1, arg2);
    }

    @ObfuscatedName("af.g(Lax;[Llq;Lam;I)V")
    public void method362(class41 arg0, class324[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method365(var4, var5, this.field246, arg0, arg2);
                this.method389(var4, var5, this.field246, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method364(var6, var7, this.field246, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("af.e(Lax;[Llq;Lam;I)V")
    public void method363(class41 arg0, class324[] arg1, class28 arg2) {
        Iterator var4 = this.field242.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method561() * 8; var6 < var5.method561() * 8 + 8; var6++) {
                for (int var7 = var5.method562() * 8; var7 < var5.method562() * 8 + 8; var7++) {
                    this.method365(var6, var7, var5, arg0, arg2);
                    this.method389(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field242.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method561() * 8; var10 < var9.method561() * 8 + 8; var10++) {
                for (int var11 = var9.method562() * 8; var11 < var9.method562() * 8 + 8; var11++) {
                    this.method364(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("af.z(IILl;Lax;[Llq;I)V")
    public void method364(int arg0, int arg1, class22 arg2, class41 arg3, class324[] arg4) {
        this.method369(arg0, arg1, arg2);
        this.method355(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("af.w(IILl;Lax;Lam;I)V")
    public void method365(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field154[0][arg0][arg1] - 1;
        int var7 = arg2.field151[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class321.method5485(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, this.field243);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class33.method937(var7, this.field243);
        }
        if (var7 > -1 && arg2.field146[0][arg0][arg1] == 0) {
            class321.method5485(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, var8);
            return;
        }
        int var9 = this.method367(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class321.method5485(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, var9);
        } else {
            arg3.method592(this.field236 * arg0, this.field236 * (63 - arg1), var9, var8, this.field236, this.field236, arg2.field146[0][arg0][arg1], arg2.field157[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("af.l(IILl;Lax;B)V")
    public void method389(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field153; var5++) {
            int var6 = arg2.field151[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class33.method937(var6, this.field243);
                if (arg2.field146[var5][arg0][arg1] == 0) {
                    class321.method5485(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, var7);
                } else {
                    arg3.method592(this.field236 * arg0, this.field236 * (63 - arg1), 0, var7, this.field236, this.field236, arg2.field146[var5][arg0][arg1], arg2.field157[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("af.h(IILl;Lam;I)I")
    public int method367(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field154[0][arg0][arg1] == 0 ? this.field243 : arg3.method345(arg0, arg1);
    }

    @ObfuscatedName("af.v(IILl;[Llq;S)V")
    public void method355(int arg0, int arg1, class22 arg2, class324[] arg3) {
        for (int var5 = 0; var5 < arg2.field153; var5++) {
            class26[] var6 = arg2.field158[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field201;
                    boolean var11 = var10 >= class221.field2712.field2724 && var10 <= class221.field2706.field2724;
                    if (var11 || class221.method1838(var9.field201)) {
                        class254 var12 = class254.method3676(var9.field198);
                        if (var12.field3373 != -1) {
                            if (var12.field3373 == 46 || var12.field3373 == 52) {
                                arg3[var12.field3373].method5572(this.field236 * arg0, this.field236 * (63 - arg1), this.field236 * 2 + 1, this.field236 * 2 + 1);
                            } else {
                                arg3[var12.field3373].method5572(this.field236 * arg0, this.field236 * (63 - arg1), this.field236 * 2, this.field236 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.m(IILl;B)V")
    public void method369(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field153; var4++) {
            class26[] var5 = arg2.field158[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    int var9 = var8.field201;
                    boolean var10 = var9 >= class221.field2702.field2724 && var9 <= class221.field2705.field2724 || class221.field2722.field2724 == var9;
                    if (var10) {
                        class254 var11 = class254.method3676(var8.field198);
                        int var12 = var11.field3350 == 0 ? -3355444 : -3407872;
                        if (class221.field2702.field2724 == var8.field201) {
                            this.method383(arg0, arg1, var8.field197, var12);
                        }
                        if (class221.field2703.field2724 == var8.field201) {
                            this.method383(arg0, arg1, var8.field197, -3355444);
                            this.method383(arg0, arg1, var8.field197 + 1, var12);
                        }
                        if (class221.field2705.field2724 == var8.field201) {
                            if (var8.field197 == 0) {
                                class321.method5491(this.field236 * arg0, this.field236 * (63 - arg1), 1, var12);
                            }
                            if (var8.field197 == 1) {
                                class321.method5491(this.field236 * arg0 + this.field236 - 1, this.field236 * (63 - arg1), 1, var12);
                            }
                            if (var8.field197 == 2) {
                                class321.method5491(this.field236 * arg0 + this.field236 - 1, this.field236 * (63 - arg1) + this.field236 - 1, 1, var12);
                            }
                            if (var8.field197 == 3) {
                                class321.method5491(this.field236 * arg0, this.field236 * (63 - arg1) + this.field236 - 1, 1, var12);
                            }
                        }
                        if (class221.field2722.field2724 == var8.field201) {
                            int var13 = var8.field197 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field236; var14++) {
                                    class321.method5491(this.field236 * arg0 + var14, this.field236 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field236; var15++) {
                                    class321.method5491(this.field236 * arg0 + var15, this.field236 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.o(IILjava/util/HashSet;II)V")
    public void method414(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field245.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2513 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2511 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method492()) {
                var12.field287 = var10;
                var12.field288 = var11;
                class242 var13 = class242.method156(var12.method169());
                if (!arg2.contains(var13.method3981())) {
                    this.method387(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("af.av(Ljava/util/HashSet;III)V")
    public void method457(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field241.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method492()) {
                class242 var6 = class242.method156(var5.method169());
                if (var6 != null && arg0.contains(var6.method3981())) {
                    this.method372(var6, var5.field287, var5.field288, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("af.am(Liq;IIIIB)V")
    public void method372(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        class325 var6 = arg0.method3979(false);
        if (var6 == null) {
            return;
        }
        var6.method5602(arg1 - var6.field3878 / 2, arg2 - var6.field3875 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class321.method5484(arg1, arg2, 15, 16776960, 128);
            class321.method5484(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("af.ai(Las;IIFI)V")
    public void method387(class35 arg0, int arg1, int arg2, float arg3) {
        class242 var5 = class242.method156(arg0.method169());
        this.method374(var5, arg1, arg2);
        this.method375(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("af.af(Liq;III)V")
    public void method374(class242 arg0, int arg1, int arg2) {
        class325 var4 = arg0.method3979(false);
        if (var4 != null) {
            int var5 = this.method377(var4, arg0.field3210);
            int var6 = this.method419(var4, arg0.field3206);
            var4.method5602(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("af.az(Las;Liq;IIFI)V")
    public void method375(class35 arg0, class242 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method170();
        if (var6 != null && var6.field227.method162(arg4)) {
            class295 var7 = (class295) this.field247.get(var6.field227);
            var7.method4918(var6.field230, arg2 - var6.field228 / 2, arg3, var6.field228, var6.field229, 0xFF000000 | arg1.field3201, 0, 1, 0, var7.field3688 / 2);
        }
    }

    @ObfuscatedName("af.aj(IILjava/util/HashSet;II)V")
    public void method430(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field241.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method492()) {
                int var8 = var7.field289.field2513 % 64;
                int var9 = var7.field289.field2511 % 64;
                var7.field287 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field288 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method169())) {
                    this.method387(var7, var7.field287, var7.field288, var5);
                }
            }
        }
    }

    @ObfuscatedName("af.an(Lls;Lib;B)I")
    public int method377(class325 arg0, class256 arg1) {
        switch(arg1.field3438) {
            case 1:
                return -arg0.field3878 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3878;
        }
    }

    @ObfuscatedName("af.at(Lls;Lia;I)I")
    public int method419(class325 arg0, class239 arg1) {
        switch(arg1.field3179) {
            case 0:
                return -arg0.field3875 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3875;
        }
    }

    @ObfuscatedName("af.as(II)Lai;")
    public class29 method379(int arg0) {
        class242 var2 = class242.method156(arg0);
        return this.method380(var2);
    }

    @ObfuscatedName("af.ak(Liq;B)Lai;")
    public class29 method380(class242 arg0) {
        if (arg0.field3200 == null || this.field247 == null || this.field247.get(class18.field110) == null) {
            return null;
        }
        int var2 = arg0.field3197;
        class18[] var3 = class18.method167();
        int var4 = 0;
        class18 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class18 var5 = var3[var4];
            if (var5.field106 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class295 var8 = (class295) this.field247.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4946(arg0.field3200, 1000000);
        String[] var10 = new String[var9];
        var8.method4977(arg0.field3200, (int[]) null, var10);
        int var11 = var10.length * var8.field3688 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4909(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class29(arg0.field3200, var12, var11, var6);
    }

    @ObfuscatedName("af.ao(IIIIII)Ljava/util/List;")
    public List method381(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field245.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method492() && var8.method491(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field241.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method492() && var10.method491(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("af.ac(I)Ljava/util/List;")
    public List method409() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field241);
        var1.addAll(this.field245.values());
        return var1;
    }

    @ObfuscatedName("af.ar(IIIII)V")
    public void method383(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class321.method5493(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, arg3);
        }
        if (var5 == 1) {
            class321.method5491(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, arg3);
        }
        if (var5 == 2) {
            class321.method5493(this.field236 * arg0 + this.field236 - 1, this.field236 * (63 - arg1), this.field236, arg3);
        }
        if (var5 == 3) {
            class321.method5491(this.field236 * arg0, this.field236 * (63 - arg1) + this.field236 - 1, this.field236, arg3);
        }
    }
}
