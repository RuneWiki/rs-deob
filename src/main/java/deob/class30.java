package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aa")
public class class30 {

    @ObfuscatedName("aa.h")
    public static class209 field256 = new class209(37748736, 256);

    @ObfuscatedName("aa.f")
    public int field257;

    @ObfuscatedName("aa.p")
    public int field258;

    @ObfuscatedName("aa.m")
    public class16 field259;

    @ObfuscatedName("aa.q")
    public LinkedList field260;

    @ObfuscatedName("aa.b")
    public int field254;

    @ObfuscatedName("aa.n")
    public int field261;

    @ObfuscatedName("aa.e")
    public List field265;

    @ObfuscatedName("aa.r")
    public HashMap field264;

    @ObfuscatedName("aa.t")
    public final HashMap field262;

    @ObfuscatedName("g.a(IIII)Lld;")
    public static class328 method27(int arg0, int arg1, int arg2) {
        class209 var3 = field256;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class328) var3.method3901(var4);
    }

    @ObfuscatedName("cd.s(I)V")
    public static void method1989() {
        field256.method3893(5);
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field257 = arg0;
        this.field258 = arg1;
        this.field260 = new LinkedList();
        this.field265 = new LinkedList();
        this.field264 = new HashMap();
        this.field254 = arg2 | 0xFF000000;
        this.field262 = arg3;
    }

    @ObfuscatedName("aa.g(IIIB)V")
    public void method383(int arg0, int arg1, int arg2) {
        class328 var4 = method27(this.field257, this.field258, this.field261);
        if (var4 == null) {
            return;
        }
        if (this.field261 * 64 == arg2) {
            var4.method5688(arg0, arg1);
        } else {
            var4.method5659(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aa.x(Lo;Ljava/util/List;I)V")
    public void method419(class16 arg0, List arg1) {
        this.field264.clear();
        this.field259 = arg0;
        this.method389(arg1);
    }

    @ObfuscatedName("aa.h(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method385(HashSet arg0, List arg1) {
        this.field264.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method253() == this.field257 && var4.method254() == this.field258) {
                this.field260.add(var4);
            }
        }
        this.method389(arg1);
    }

    @ObfuscatedName("aa.f(IIIILw;I)V")
    public void method386(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        this.field264.clear();
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field169; var8++) {
                    class26[] var9 = arg4.field181[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class26 var12 = var10[var11];
                            class275 var13 = class275.method117(var12.field219);
                            if (method4259(var13)) {
                                this.method445(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.p(Ljy;IIILw;I)V")
    public void method445(class275 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class235 var6 = new class235(arg1, this.field257 * 64 + arg2, this.field258 * 64 + arg3);
        Object var7 = null;
        class235 var8;
        if (this.field259 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class235(var9.field173 + arg1, var9.field174 * 64 + arg2 + var9.method599() * 8, var9.field170 * 64 + arg3 + var9.method600() * 8);
        } else {
            var8 = new class235(this.field259.field173 + arg1, this.field259.field174 * 64 + arg2, this.field259.field170 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3494 == null) {
            class263 var11 = class263.method379(arg0.field3481);
            var10 = new class19(var8, var6, var11.field3325, this.method413(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3477, this);
        }
        this.field264.put(new class235(0, arg2, arg3), var10);
    }

    @ObfuscatedName("aa.m(I)V")
    public void method388() {
        Iterator var1 = this.field264.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method282();
            }
        }
    }

    @ObfuscatedName("aa.q(Ljava/util/List;I)V")
    public void method389(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field298.field2650 >> 6 == this.field257 && var3.field298.field2649 >> 6 == this.field258) {
                class19 var4 = new class19(var3.field298, var3.field298, var3.field135, this.method412(var3.field135));
                this.field265.add(var4);
            }
        }
    }

    @ObfuscatedName("aa.b(I)V")
    public void method470() {
        if (this.field259 != null) {
            this.field259.method249();
            return;
        }
        Iterator var1 = this.field260.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method249();
        }
    }

    @ObfuscatedName("aa.n(Liz;B)Z")
    public boolean method452(class255 arg0) {
        if (this.field259 == null) {
            boolean var2 = true;
            Iterator var3 = this.field260.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method246(arg0);
                var2 &= var4.method247();
            }
            if (var2) {
                Iterator var5 = this.field260.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method386(var6.method601() * 8, var6.method602() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field259.method246(arg0);
            if (this.field259.method247()) {
                this.method386(0, 0, 64, 64, this.field259);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("aa.e(ILar;[Llv;Liz;Liz;I)V")
    public void method392(int arg0, class41 arg1, class327[] arg2, class255 arg3, class255 arg4) {
        this.field261 = arg0;
        if (this.field259 == null && this.field260.isEmpty() || method27(this.field257, this.field258, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method452(arg3);
        int var8;
        if (this.field259 == null) {
            var8 = ((class22) this.field260.getFirst()).field175;
        } else {
            var8 = this.field259.field175;
        }
        boolean var9 = var7 & arg4.method4466(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method4429(var8);
        class28 var11 = class28.method1890(var10);
        class328 var12 = new class328(this.field261 * 64, this.field261 * 64);
        var12.method5747();
        if (this.field259 == null) {
            this.method396(arg1, arg2, var11);
        } else {
            this.method395(arg1, arg2, var11);
        }
        int var13 = this.field257;
        int var14 = this.field258;
        int var15 = this.field261;
        class209 var16 = field256;
        long var18 = (long) (var15 << 16 | var13 << 8 | var14);
        var16.method3904(var12, var18, var12.field3895.length * 4);
        this.method470();
    }

    @ObfuscatedName("aa.r(IIILjava/util/HashSet;I)V")
    public void method393(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method403(arg0, arg1, arg3, arg2);
        this.method409(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aa.t(Ljava/util/HashSet;IIB)V")
    public void method414(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field264.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method528()) {
                int var6 = var5.method201();
                if (arg0.contains(var6)) {
                    class263 var7 = class263.method379(var6);
                    this.method405(var7, var5.field297, var5.field300, arg1, arg2);
                }
            }
        }
        this.method481(arg0, arg1, arg2);
    }

    @ObfuscatedName("aa.l(Lar;[Llv;Laf;I)V")
    public void method395(class41 arg0, class327[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method398(var4, var5, this.field259, arg0, arg2);
                this.method399(var4, var5, this.field259, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method467(var6, var7, this.field259, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("aa.o(Lar;[Llv;Laf;I)V")
    public void method396(class41 arg0, class327[] arg1, class28 arg2) {
        Iterator var4 = this.field260.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method601() * 8; var6 < var5.method601() * 8 + 8; var6++) {
                for (int var7 = var5.method602() * 8; var7 < var5.method602() * 8 + 8; var7++) {
                    this.method398(var6, var7, var5, arg0, arg2);
                    this.method399(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field260.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method601() * 8; var10 < var9.method601() * 8 + 8; var10++) {
                for (int var11 = var9.method602() * 8; var11 < var9.method602() * 8 + 8; var11++) {
                    this.method467(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aa.u(IILw;Lar;[Llv;I)V")
    public void method467(int arg0, int arg1, class22 arg2, class41 arg3, class327[] arg4) {
        this.method402(arg0, arg1, arg2);
        this.method401(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aa.y(IILw;Lar;Laf;I)V")
    public void method398(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field189[0][arg0][arg1] - 1;
        int var7 = arg2.field186[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class324.method5551(this.field261 * arg0, this.field261 * (63 - arg1), this.field261, this.field261, this.field254);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field254;
            class279 var10 = (class279) class279.field3604.method3885((long) var7);
            class279 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field3607.method4422(4, var7);
                class279 var13 = new class279();
                if (var12 != null) {
                    var13.method4993(new class190(var12), var7);
                }
                var13.method4999();
                class279.field3604.method3878(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field3608 >= 0) {
                var15 = var11.field3608 | 0xFF000000;
            } else if (var11.field3605 >= 0) {
                int var16 = Statics.field1756.method2564(var11.field3605);
                byte var17 = 96;
                int var18;
                if (var16 == -2) {
                    var18 = 12345678;
                } else if (var16 == -1) {
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 127) {
                        var17 = 127;
                    }
                    int var19 = 127 - var17;
                    var18 = var19;
                } else {
                    int var20 = (var16 & 0x7F) * var17 / 128;
                    if (var20 < 2) {
                        var20 = 2;
                    } else if (var20 > 126) {
                        var20 = 126;
                    }
                    var18 = (var16 & 0xFF80) + var20;
                }
                var15 = class130.field1775[var18] | 0xFF000000;
            } else if (var11.field3609 == 16711935) {
                var15 = var9;
            } else {
                int var22 = var11.field3614;
                int var23 = var11.field3610;
                int var24 = var11.field3611;
                if (var24 > 179) {
                    var23 /= 2;
                }
                if (var24 > 192) {
                    var23 /= 2;
                }
                if (var24 > 217) {
                    var23 /= 2;
                }
                if (var24 > 243) {
                    var23 /= 2;
                }
                int var25 = var24 / 2 + (var22 / 4 << 10) + (var23 / 32 << 7);
                byte var28 = 96;
                int var29;
                if (var25 == -2) {
                    var29 = 12345678;
                } else if (var25 == -1) {
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 > 127) {
                        var28 = 127;
                    }
                    int var30 = 127 - var28;
                    var29 = var30;
                } else {
                    int var31 = (var25 & 0x7F) * var28 / 128;
                    if (var31 < 2) {
                        var31 = 2;
                    } else if (var31 > 126) {
                        var31 = 126;
                    }
                    var29 = (var25 & 0xFF80) + var31;
                }
                var15 = class130.field1775[var29] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field179[0][arg0][arg1] == 0) {
            class324.method5551(this.field261 * arg0, this.field261 * (63 - arg1), this.field261, this.field261, var8);
            return;
        }
        int var33 = this.method400(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class324.method5551(this.field261 * arg0, this.field261 * (63 - arg1), this.field261, this.field261, var33);
        } else {
            arg3.method627(this.field261 * arg0, this.field261 * (63 - arg1), var33, var8, this.field261, this.field261, arg2.field179[0][arg0][arg1], arg2.field180[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aa.k(IILw;Lar;I)V")
    public void method399(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field169; var5++) {
            int var6 = arg2.field186[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field254;
                class279 var8 = (class279) class279.field3604.method3885((long) var6);
                class279 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field3607.method4422(4, var6);
                    class279 var11 = new class279();
                    if (var10 != null) {
                        var11.method4993(new class190(var10), var6);
                    }
                    var11.method4999();
                    class279.field3604.method3878(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field3608 >= 0) {
                    var13 = var9.field3608 | 0xFF000000;
                } else if (var9.field3605 >= 0) {
                    int var14 = Statics.field1756.method2564(var9.field3605);
                    byte var15 = 96;
                    int var16;
                    if (var14 == -2) {
                        var16 = 12345678;
                    } else if (var14 == -1) {
                        if (var15 < 0) {
                            var15 = 0;
                        } else if (var15 > 127) {
                            var15 = 127;
                        }
                        int var17 = 127 - var15;
                        var16 = var17;
                    } else {
                        int var18 = (var14 & 0x7F) * var15 / 128;
                        if (var18 < 2) {
                            var18 = 2;
                        } else if (var18 > 126) {
                            var18 = 126;
                        }
                        var16 = (var14 & 0xFF80) + var18;
                    }
                    var13 = class130.field1775[var16] | 0xFF000000;
                } else if (var9.field3609 == 16711935) {
                    var13 = var7;
                } else {
                    int var20 = var9.field3614;
                    int var21 = var9.field3610;
                    int var22 = var9.field3611;
                    if (var22 > 179) {
                        var21 /= 2;
                    }
                    if (var22 > 192) {
                        var21 /= 2;
                    }
                    if (var22 > 217) {
                        var21 /= 2;
                    }
                    if (var22 > 243) {
                        var21 /= 2;
                    }
                    int var23 = var22 / 2 + (var20 / 4 << 10) + (var21 / 32 << 7);
                    byte var26 = 96;
                    int var27;
                    if (var23 == -2) {
                        var27 = 12345678;
                    } else if (var23 == -1) {
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 127) {
                            var26 = 127;
                        }
                        int var28 = 127 - var26;
                        var27 = var28;
                    } else {
                        int var29 = (var23 & 0x7F) * var26 / 128;
                        if (var29 < 2) {
                            var29 = 2;
                        } else if (var29 > 126) {
                            var29 = 126;
                        }
                        var27 = (var23 & 0xFF80) + var29;
                    }
                    var13 = class130.field1775[var27] | 0xFF000000;
                }
                if (arg2.field179[var5][arg0][arg1] == 0) {
                    class324.method5551(this.field261 * arg0, this.field261 * (63 - arg1), this.field261, this.field261, var13);
                } else {
                    arg3.method627(this.field261 * arg0, this.field261 * (63 - arg1), 0, var13, this.field261, this.field261, arg2.field179[var5][arg0][arg1], arg2.field180[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aa.v(IILw;Laf;I)I")
    public int method400(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field189[0][arg0][arg1] == 0 ? this.field254 : arg3.method370(arg0, arg1);
    }

    @ObfuscatedName("aa.c(IILw;[Llv;I)V")
    public void method401(int arg0, int arg1, class22 arg2, class327[] arg3) {
        for (int var5 = 0; var5 < arg2.field169; var5++) {
            class26[] var6 = arg2.field181[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field220;
                    boolean var11 = var10 >= class242.field2843.field2863 && var10 <= class242.field2861.field2863;
                    if (!var11) {
                        int var12 = var9.field220;
                        boolean var13 = class242.field2840.field2863 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class275 var14 = class275.method117(var9.field219);
                    if (var14.field3482 != -1) {
                        if (var14.field3482 == 46 || var14.field3482 == 52) {
                            arg3[var14.field3482].method5644(this.field261 * arg0, this.field261 * (63 - arg1), this.field261 * 2 + 1, this.field261 * 2 + 1);
                        } else {
                            arg3[var14.field3482].method5644(this.field261 * arg0, this.field261 * (63 - arg1), this.field261 * 2, this.field261 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.aa(IILw;I)V")
    public void method402(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field169; var4++) {
            class26[] var5 = arg2.field181[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    int var9 = var8.field220;
                    boolean var10 = var9 >= class242.field2857.field2863 && var9 <= class242.field2851.field2863 || class242.field2860.field2863 == var9;
                    if (var10) {
                        class275 var11 = class275.method117(var8.field219);
                        int var12 = var11.field3472 == 0 ? -3355444 : -3407872;
                        if (class242.field2857.field2863 == var8.field220) {
                            this.method475(arg0, arg1, var8.field221, var12);
                        }
                        if (class242.field2842.field2863 == var8.field220) {
                            this.method475(arg0, arg1, var8.field221, -3355444);
                            this.method475(arg0, arg1, var8.field221 + 1, var12);
                        }
                        if (class242.field2851.field2863 == var8.field220) {
                            if (var8.field221 == 0) {
                                class324.method5557(this.field261 * arg0, this.field261 * (63 - arg1), 1, var12);
                            }
                            if (var8.field221 == 1) {
                                class324.method5557(this.field261 * arg0 + this.field261 - 1, this.field261 * (63 - arg1), 1, var12);
                            }
                            if (var8.field221 == 2) {
                                class324.method5557(this.field261 * arg0 + this.field261 - 1, this.field261 * (63 - arg1) + this.field261 - 1, 1, var12);
                            }
                            if (var8.field221 == 3) {
                                class324.method5557(this.field261 * arg0, this.field261 * (63 - arg1) + this.field261 - 1, 1, var12);
                            }
                        }
                        if (class242.field2860.field2863 == var8.field220) {
                            int var13 = var8.field221 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field261; var14++) {
                                    class324.method5557(this.field261 * arg0 + var14, this.field261 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field261; var15++) {
                                    class324.method5557(this.field261 * arg0 + var15, this.field261 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.ab(IILjava/util/HashSet;IB)V")
    public void method403(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field264.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class235 var9 = (class235) var8.getKey();
            int var10 = (int) ((float) var9.field2650 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2649 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method528()) {
                var12.field297 = var10;
                var12.field300 = var11;
                class263 var13 = class263.method379(var12.method201());
                if (!arg2.contains(var13.method4627())) {
                    this.method406(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aa.ah(Ljava/util/HashSet;IIB)V")
    public void method481(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field265.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method528()) {
                class263 var6 = class263.method379(var5.method201());
                if (var6 != null && arg0.contains(var6.method4627())) {
                    this.method405(var6, var5.field297, var5.field300, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("aa.aw(Ljd;IIIIB)V")
    public void method405(class263 arg0, int arg1, int arg2, int arg3, int arg4) {
        class328 var6 = arg0.method4611(false);
        if (var6 == null) {
            return;
        }
        var6.method5668(arg1 - var6.field3899 / 2, arg2 - var6.field3890 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class324.method5549(arg1, arg2, 15, 16776960, 128);
            class324.method5549(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aa.an(Lat;IIFI)V")
    public void method406(class35 arg0, int arg1, int arg2, float arg3) {
        class263 var5 = class263.method379(arg0.method201());
        this.method418(var5, arg1, arg2);
        this.method408(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aa.at(Ljd;IIB)V")
    public void method418(class263 arg0, int arg1, int arg2) {
        class328 var4 = arg0.method4611(false);
        if (var4 != null) {
            int var5 = this.method382(var4, arg0.field3339);
            int var6 = this.method411(var4, arg0.field3340);
            var4.method5668(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aa.ae(Lat;Ljd;IIFB)V")
    public void method408(class35 arg0, class263 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method202();
        if (var6 != null && var6.field250.method188(arg4)) {
            class305 var7 = (class305) this.field262.get(var6.field250);
            var7.method5358(var6.field251, arg2 - var6.field248 / 2, arg3, var6.field248, var6.field249, 0xFF000000 | arg1.field3329, 0, 1, 0, var7.field3780 / 2);
        }
    }

    @ObfuscatedName("aa.av(IILjava/util/HashSet;IB)V")
    public void method409(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field265.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method528()) {
                int var8 = var7.field298.field2650 % 64;
                int var9 = var7.field298.field2649 % 64;
                var7.field297 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field300 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method201())) {
                    this.method406(var7, var7.field297, var7.field300, var5);
                }
            }
        }
    }

    @ObfuscatedName("aa.au(Lld;Lji;I)I")
    public int method382(class328 arg0, class277 arg1) {
        switch(arg1.field3563) {
            case 0:
                return -arg0.field3899 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3899;
        }
    }

    @ObfuscatedName("aa.aj(Lld;Lip;I)I")
    public int method411(class328 arg0, class260 arg1) {
        switch(arg1.field3306) {
            case 0:
                return -arg0.field3890 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3890;
        }
    }

    @ObfuscatedName("hk.as(Ljy;B)Z")
    public static boolean method4259(class275 arg0) {
        if (arg0.field3494 != null) {
            int[] var1 = arg0.field3494;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class275 var4 = class275.method117(var3);
                if (var4.field3481 != -1) {
                    return true;
                }
            }
        } else if (arg0.field3481 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("aa.ar(IB)Lay;")
    public class29 method412(int arg0) {
        class263 var2 = class263.method379(arg0);
        return this.method413(var2);
    }

    @ObfuscatedName("aa.ai(Ljd;I)Lay;")
    public class29 method413(class263 arg0) {
        if (arg0.field3328 == null || this.field262 == null || this.field262.get(class18.field124) == null) {
            return null;
        }
        class18 var2 = class18.method189(arg0.field3330);
        if (var2 == null) {
            return null;
        }
        class305 var3 = (class305) this.field262.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5317(arg0.field3328, 1000000);
        String[] var5 = new String[var4];
        var3.method5390(arg0.field3328, (int[]) null, var5);
        int var6 = var5.length * var3.field3780 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5314(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class29(arg0.field3328, var7, var6, var2);
    }

    @ObfuscatedName("aa.aq(IIIIII)Ljava/util/List;")
    public List method432(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field264.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method528() && var8.method527(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field265.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method528() && var10.method527(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aa.al(B)Ljava/util/List;")
    public List method415() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field265);
        var1.addAll(this.field264.values());
        return var1;
    }

    @ObfuscatedName("aa.az(IIIIB)V")
    public void method475(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class324.method5616(this.field261 * arg0, this.field261 * (63 - arg1), this.field261, arg3);
        }
        if (var5 == 1) {
            class324.method5557(this.field261 * arg0, this.field261 * (63 - arg1), this.field261, arg3);
        }
        if (var5 == 2) {
            class324.method5616(this.field261 * arg0 + this.field261 - 1, this.field261 * (63 - arg1), this.field261, arg3);
        }
        if (var5 == 3) {
            class324.method5557(this.field261 * arg0, this.field261 * (63 - arg1) + this.field261 - 1, this.field261, arg3);
        }
    }
}
