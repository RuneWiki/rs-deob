package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("av")
public class class30 {

    @ObfuscatedName("av.l")
    public static class150 field240 = new class150(37748736, 256);

    @ObfuscatedName("av.u")
    public int field243;

    @ObfuscatedName("av.j")
    public int field242;

    @ObfuscatedName("av.v")
    public class16 field245;

    @ObfuscatedName("av.d")
    public LinkedList field247;

    @ObfuscatedName("av.z")
    public int field244;

    @ObfuscatedName("av.n")
    public int field248;

    @ObfuscatedName("av.h")
    public List field249;

    @ObfuscatedName("av.f")
    public HashMap field239;

    @ObfuscatedName("av.s")
    public final HashMap field251;

    @ObfuscatedName("bu.c(IIII)Lli;")
    public static class325 method959(int arg0, int arg1, int arg2) {
        class150 var3 = field240;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class325) var3.method3086(var4);
    }

    @ObfuscatedName("kz.x(Lli;IIIB)V")
    public static void method5341(class325 arg0, int arg1, int arg2, int arg3) {
        class150 var4 = field240;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3089(arg0, var6, arg0.field3873.length * 4);
    }

    @ObfuscatedName("bu.t(B)V")
    public static void method961() {
        field240.method3090();
    }

    @ObfuscatedName("fe.g(I)V")
    public static void method3181() {
        field240.method3097(5);
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field243 = arg0;
        this.field242 = arg1;
        this.field247 = new LinkedList();
        this.field249 = new LinkedList();
        this.field239 = new HashMap();
        this.field244 = arg2 | 0xFF000000;
        this.field251 = arg3;
    }

    @ObfuscatedName("av.l(IIII)V")
    public void method328(int arg0, int arg1, int arg2) {
        class325 var4 = method959(this.field243, this.field242, this.field248);
        if (var4 == null) {
            return;
        }
        if (this.field248 * 64 == arg2) {
            var4.method5668(arg0, arg1);
        } else {
            var4.method5690(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("av.u(Le;Ljava/util/List;I)V")
    public void method336(class16 arg0, List arg1) {
        this.field239.clear();
        this.field245 = arg0;
        this.method379(arg1);
    }

    @ObfuscatedName("av.j(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method330(HashSet arg0, List arg1) {
        this.field239.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method215() == this.field243 && var4.method216() == this.field242) {
                this.field247.add(var4);
            }
        }
        this.method379(arg1);
    }

    @ObfuscatedName("av.v(IIIILw;B)V")
    public void method340(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field166; var8++) {
                    class26[] var9 = arg4.field155[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class254 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class254.method3035(var12.field201);
                                if (var13.field3363 != null) {
                                    int[] var14 = var13.field3363;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class254 var17 = class254.method3035(var16);
                                        if (var17.field3350 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3350 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method332(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.d(Liy;IIILw;I)V")
    public void method332(class254 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field243 * 64 + arg2, this.field242 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field245 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field158 + arg1, var9.field165 * 64 + arg2 + var9.method583() * 8, var9.field159 * 64 + arg3 + var9.method585() * 8);
        } else {
            var8 = new class214(this.field245.field158 + arg1, this.field245.field165 * 64 + arg2, this.field245.field159 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3363 == null) {
            class242 var11 = class242.method481(arg0.field3350);
            var10 = new class19(var8, var6, var11.field3198, this.method358(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3371, this);
        }
        this.field239.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("av.z(I)V")
    public void method333() {
        Iterator var1 = this.field239.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method236();
            }
        }
    }

    @ObfuscatedName("av.s(Ljava/util/List;I)V")
    public void method379(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field290.field2502 >> 6 == this.field243 && var3.field290.field2503 >> 6 == this.field242) {
                class19 var4 = new class19(var3.field290, var3.field290, var3.field124, this.method457(var3.field124));
                this.field249.add(var4);
            }
        }
    }

    @ObfuscatedName("av.p(I)V")
    public void method335() {
        if (this.field245 != null) {
            this.field245.method211();
            return;
        }
        Iterator var1 = this.field247.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method211();
        }
    }

    @ObfuscatedName("av.e(Lhz;I)Z")
    public boolean method357(class234 arg0) {
        this.field239.clear();
        if (this.field245 == null) {
            boolean var2 = true;
            Iterator var3 = this.field247.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method210(arg0);
                var2 &= var4.method209();
            }
            if (var2) {
                Iterator var5 = this.field247.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method340(var6.method577() * 8, var6.method573() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field245.method210(arg0);
            if (this.field245.method209()) {
                this.method340(0, 0, 64, 64, this.field245);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("av.i(ILay;[Llt;Lhz;Lhz;B)V")
    public void method331(int arg0, class41 arg1, class324[] arg2, class234 arg3, class234 arg4) {
        this.field248 = arg0;
        if (this.field245 == null && this.field247.isEmpty() || method959(this.field243, this.field242, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method357(arg3);
        int var8;
        if (this.field245 == null) {
            var8 = ((class22) this.field247.getFirst()).field169;
        } else {
            var8 = this.field245.field169;
        }
        boolean var9 = var7 & arg4.method3874(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3832(var8);
        class28 var11;
        if (var10 == null) {
            var11 = new class28();
        } else {
            var11 = new class28(class50.method149(var10).field3873);
        }
        class325 var13 = new class325(this.field248 * 64, this.field248 * 64);
        var13.method5661();
        if (this.field245 == null) {
            this.method341(arg1, arg2, var11);
        } else {
            this.method391(arg1, arg2, var11);
        }
        method5341(var13, this.field243, this.field242, this.field248);
        this.method335();
    }

    @ObfuscatedName("av.q(IIILjava/util/HashSet;I)V")
    public void method334(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method348(arg0, arg1, arg3, arg2);
        this.method347(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("av.r(Ljava/util/HashSet;III)V")
    public void method339(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field239.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method483()) {
                int var6 = var5.method166();
                if (arg0.contains(var6)) {
                    class242 var7 = class242.method481(var6);
                    this.method343(var7, var5.field291, var5.field292, arg1, arg2);
                }
            }
        }
        this.method349(arg0, arg1, arg2);
    }

    @ObfuscatedName("av.k(Lay;[Llt;Lat;B)V")
    public void method391(class41 arg0, class324[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method421(var4, var5, this.field245, arg0, arg2);
                this.method344(var4, var5, this.field245, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method337(var6, var7, this.field245, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("av.w(Lay;[Llt;Lat;I)V")
    public void method341(class41 arg0, class324[] arg1, class28 arg2) {
        Iterator var4 = this.field247.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method577() * 8; var6 < var5.method577() * 8 + 8; var6++) {
                for (int var7 = var5.method573() * 8; var7 < var5.method573() * 8 + 8; var7++) {
                    this.method421(var6, var7, var5, arg0, arg2);
                    this.method344(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field247.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method577() * 8; var10 < var9.method577() * 8 + 8; var10++) {
                for (int var11 = var9.method573() * 8; var11 < var9.method573() * 8 + 8; var11++) {
                    this.method337(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("av.m(IILw;Lay;[Llt;I)V")
    public void method337(int arg0, int arg1, class22 arg2, class41 arg3, class324[] arg4) {
        this.method437(arg0, arg1, arg2);
        this.method346(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("av.o(IILw;Lay;Lat;I)V")
    public void method421(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field162[0][arg0][arg1] - 1;
        int var7 = arg2.field163[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class321.method5565(this.field248 * arg0, this.field248 * (63 - arg1), this.field248, this.field248, this.field244);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field244;
            class258 var10 = (class258) class258.field3484.method3061((long) var7);
            class258 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field3477.method3825(4, var7);
                class258 var13 = new class258();
                if (var12 != null) {
                    var13.method4419(new class300(var12), var7);
                }
                var13.method4418();
                class258.field3484.method3062(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field3474 >= 0) {
                var15 = var11.field3474 | 0xFF000000;
            } else if (var11.field3475 >= 0) {
                int var16 = class33.method3143(Statics.field1749.method2494(var11.field3475), 96);
                var15 = class131.field1748[var16] | 0xFF000000;
            } else if (var11.field3480 == 16711935) {
                var15 = var9;
            } else {
                int var17 = var11.field3478;
                int var18 = var11.field3479;
                int var19 = var11.field3472;
                if (var19 > 179) {
                    var18 /= 2;
                }
                if (var19 > 192) {
                    var18 /= 2;
                }
                if (var19 > 217) {
                    var18 /= 2;
                }
                if (var19 > 243) {
                    var18 /= 2;
                }
                int var20 = var19 / 2 + (var17 / 4 << 10) + (var18 / 32 << 7);
                int var23 = class33.method3143(var20, 96);
                var15 = class131.field1748[var23] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field164[0][arg0][arg1] == 0) {
            class321.method5565(this.field248 * arg0, this.field248 * (63 - arg1), this.field248, this.field248, var8);
            return;
        }
        int var24 = this.method345(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class321.method5565(this.field248 * arg0, this.field248 * (63 - arg1), this.field248, this.field248, var24);
        } else {
            arg3.method597(this.field248 * arg0, this.field248 * (63 - arg1), var24, var8, this.field248, this.field248, arg2.field164[0][arg0][arg1], arg2.field160[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("av.a(IILw;Lay;I)V")
    public void method344(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field166; var5++) {
            int var6 = arg2.field163[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field244;
                class258 var8 = (class258) class258.field3484.method3061((long) var6);
                class258 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field3477.method3825(4, var6);
                    class258 var11 = new class258();
                    if (var10 != null) {
                        var11.method4419(new class300(var10), var6);
                    }
                    var11.method4418();
                    class258.field3484.method3062(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field3474 >= 0) {
                    var13 = var9.field3474 | 0xFF000000;
                } else if (var9.field3475 >= 0) {
                    int var14 = class33.method3143(Statics.field1749.method2494(var9.field3475), 96);
                    var13 = class131.field1748[var14] | 0xFF000000;
                } else if (var9.field3480 == 16711935) {
                    var13 = var7;
                } else {
                    int var15 = var9.field3478;
                    int var16 = var9.field3479;
                    int var17 = var9.field3472;
                    if (var17 > 179) {
                        var16 /= 2;
                    }
                    if (var17 > 192) {
                        var16 /= 2;
                    }
                    if (var17 > 217) {
                        var16 /= 2;
                    }
                    if (var17 > 243) {
                        var16 /= 2;
                    }
                    int var18 = var17 / 2 + (var15 / 4 << 10) + (var16 / 32 << 7);
                    int var21 = class33.method3143(var18, 96);
                    var13 = class131.field1748[var21] | 0xFF000000;
                }
                if (arg2.field164[var5][arg0][arg1] == 0) {
                    class321.method5565(this.field248 * arg0, this.field248 * (63 - arg1), this.field248, this.field248, var13);
                } else {
                    arg3.method597(this.field248 * arg0, this.field248 * (63 - arg1), 0, var13, this.field248, this.field248, arg2.field164[var5][arg0][arg1], arg2.field160[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("av.b(IILw;Lat;I)I")
    public int method345(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field162[0][arg0][arg1] == 0 ? this.field244 : arg3.method320(arg0, arg1);
    }

    @ObfuscatedName("av.ag(IILw;[Llt;I)V")
    public void method346(int arg0, int arg1, class22 arg2, class324[] arg3) {
        for (int var5 = 0; var5 < arg2.field166; var5++) {
            class26[] var6 = arg2.field155[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    if (!class221.method3804(var9.field204)) {
                        int var10 = var9.field204;
                        boolean var11 = class221.field2717.field2708 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class254 var12 = class254.method3035(var9.field201);
                    if (var12.field3362 != -1) {
                        if (var12.field3362 == 46 || var12.field3362 == 52) {
                            arg3[var12.field3362].method5642(this.field248 * arg0, this.field248 * (63 - arg1), this.field248 * 2 + 1, this.field248 * 2 + 1);
                        } else {
                            arg3[var12.field3362].method5642(this.field248 * arg0, this.field248 * (63 - arg1), this.field248 * 2, this.field248 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.at(IILw;B)V")
    public void method437(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field166; var4++) {
            class26[] var5 = arg2.field155[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    if (class221.method4417(var8.field204)) {
                        class254 var9 = class254.method3035(var8.field201);
                        int var10 = var9.field3341 == 0 ? -3355444 : -3407872;
                        if (class221.field2705.field2708 == var8.field204) {
                            this.method342(arg0, arg1, var8.field199, var10);
                        }
                        if (class221.field2696.field2708 == var8.field204) {
                            this.method342(arg0, arg1, var8.field199, -3355444);
                            this.method342(arg0, arg1, var8.field199 + 1, var10);
                        }
                        if (class221.field2698.field2708 == var8.field204) {
                            if (var8.field199 == 0) {
                                class321.method5570(this.field248 * arg0, this.field248 * (63 - arg1), 1, var10);
                            }
                            if (var8.field199 == 1) {
                                class321.method5570(this.field248 * arg0 + this.field248 - 1, this.field248 * (63 - arg1), 1, var10);
                            }
                            if (var8.field199 == 2) {
                                class321.method5570(this.field248 * arg0 + this.field248 - 1, this.field248 * (63 - arg1) + this.field248 - 1, 1, var10);
                            }
                            if (var8.field199 == 3) {
                                class321.method5570(this.field248 * arg0, this.field248 * (63 - arg1) + this.field248 - 1, 1, var10);
                            }
                        }
                        if (class221.field2699.field2708 == var8.field204) {
                            int var11 = var8.field199 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field248; var12++) {
                                    class321.method5570(this.field248 * arg0 + var12, this.field248 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field248; var13++) {
                                    class321.method5570(this.field248 * arg0 + var13, this.field248 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.ao(IILjava/util/HashSet;II)V")
    public void method348(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field239.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2502 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2503 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method483()) {
                var12.field291 = var10;
                var12.field292 = var11;
                class242 var13 = class242.method481(var12.method166());
                if (!arg2.contains(var13.method4052())) {
                    this.method438(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("av.av(Ljava/util/HashSet;III)V")
    public void method349(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field249.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method483()) {
                class242 var6 = class242.method481(var5.method166());
                if (var6 != null && arg0.contains(var6.method4052())) {
                    this.method343(var6, var5.field291, var5.field292, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("av.an(Liu;IIIIB)V")
    public void method343(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        class325 var6 = arg0.method4033(false);
        if (var6 == null) {
            return;
        }
        var6.method5664(arg1 - var6.field3867 / 2, arg2 - var6.field3868 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class321.method5568(arg1, arg2, 15, 16776960, 128);
            class321.method5568(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("av.al(Lap;IIFI)V")
    public void method438(class35 arg0, int arg1, int arg2, float arg3) {
        class242 var5 = class242.method481(arg0.method166());
        this.method419(var5, arg1, arg2);
        this.method353(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("av.as(Liu;III)V")
    public void method419(class242 arg0, int arg1, int arg2) {
        class325 var4 = arg0.method4033(false);
        if (var4 != null) {
            int var5 = this.method355(var4, arg0.field3202);
            int var6 = this.method418(var4, arg0.field3203);
            var4.method5664(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("av.ad(Lap;Liu;IIFB)V")
    public void method353(class35 arg0, class242 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method162();
        if (var6 != null && var6.field232.method153(arg4)) {
            class295 var7 = (class295) this.field251.get(var6.field232);
            var7.method4956(var6.field237, arg2 - var6.field230 / 2, arg3, var6.field230, var6.field231, 0xFF000000 | arg1.field3196, 0, 1, 0, var7.field3665 / 2);
        }
    }

    @ObfuscatedName("av.ap(IILjava/util/HashSet;II)V")
    public void method347(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field249.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method483()) {
                int var8 = var7.field290.field2502 % 64;
                int var9 = var7.field290.field2503 % 64;
                var7.field291 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field292 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method166())) {
                    this.method438(var7, var7.field291, var7.field292, var5);
                }
            }
        }
    }

    @ObfuscatedName("av.ax(Lli;Lie;I)I")
    public int method355(class325 arg0, class256 arg1) {
        switch(arg1.field3430) {
            case 1:
                return -arg0.field3867 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3867;
        }
    }

    @ObfuscatedName("av.aj(Lli;Lii;I)I")
    public int method418(class325 arg0, class239 arg1) {
        switch(arg1.field3174) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3868 / 2;
            default:
                return -arg0.field3868;
        }
    }

    @ObfuscatedName("av.ab(II)Lao;")
    public class29 method457(int arg0) {
        class242 var2 = class242.method481(arg0);
        return this.method358(var2);
    }

    @ObfuscatedName("av.af(Liu;I)Lao;")
    public class29 method358(class242 arg0) {
        if (arg0.field3194 == null || this.field251 == null || this.field251.get(class18.field111) == null) {
            return null;
        }
        int var2 = arg0.field3193;
        class18[] var3 = new class18[] { class18.field113, class18.field112, class18.field111 };
        class18[] var4 = var3;
        int var5 = 0;
        class18 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class18 var6 = var4[var5];
            if (var6.field115 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class295 var9 = (class295) this.field251.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4955(arg0.field3194, 1000000);
        String[] var11 = new String[var10];
        var9.method4953(arg0.field3194, (int[]) null, var11);
        int var12 = var11.length * var9.field3665 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4952(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class29(arg0.field3194, var13, var12, var7);
    }

    @ObfuscatedName("av.ak(IIIIII)Ljava/util/List;")
    public List method359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field239.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method483() && var8.method486(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field249.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method483() && var10.method486(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("av.ay(I)Ljava/util/List;")
    public List method360() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field249);
        var1.addAll(this.field239.values());
        return var1;
    }

    @ObfuscatedName("av.ae(IIIII)V")
    public void method342(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class321.method5572(this.field248 * arg0, this.field248 * (63 - arg1), this.field248, arg3);
        }
        if (var5 == 1) {
            class321.method5570(this.field248 * arg0, this.field248 * (63 - arg1), this.field248, arg3);
        }
        if (var5 == 2) {
            class321.method5572(this.field248 * arg0 + this.field248 - 1, this.field248 * (63 - arg1), this.field248, arg3);
        }
        if (var5 == 3) {
            class321.method5570(this.field248 * arg0, this.field248 * (63 - arg1) + this.field248 - 1, this.field248, arg3);
        }
    }
}
