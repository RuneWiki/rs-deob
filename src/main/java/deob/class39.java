package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("as")
public class class39 {

    @ObfuscatedName("as.y")
    public static class159 field273 = new class159(37748736, 256);

    @ObfuscatedName("as.h")
    public int field274;

    @ObfuscatedName("as.z")
    public int field275;

    @ObfuscatedName("as.e")
    public class25 field270;

    @ObfuscatedName("as.q")
    public LinkedList field280;

    @ObfuscatedName("as.l")
    public int field278;

    @ObfuscatedName("as.s")
    public int field272;

    @ObfuscatedName("as.b")
    public List field277;

    @ObfuscatedName("as.a")
    public HashMap field281;

    @ObfuscatedName("as.w")
    public final HashMap field276;

    @ObfuscatedName("ci.n(IIII)J")
    public static long method2029(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("gv.v(IIII)Llm;")
    public static class336 method3501(int arg0, int arg1, int arg2) {
        return (class336) field273.method3247(method2029(arg0, arg1, arg2));
    }

    @ObfuscatedName("t.d(Llm;IIII)V")
    public static void method188(class336 arg0, int arg1, int arg2, int arg3) {
        field273.method3262(arg0, method2029(arg1, arg2, arg3), arg0.field3915.length * 4);
    }

    @ObfuscatedName("ch.c(I)V")
    public static void method2194() {
        field273.method3248();
    }

    @ObfuscatedName("ap.y(B)V")
    public static void method591() {
        field273.method3250(5);
    }

    public class39(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field274 = arg0;
        this.field275 = arg1;
        this.field280 = new LinkedList();
        this.field277 = new LinkedList();
        this.field281 = new HashMap();
        this.field278 = arg2 | 0xFF000000;
        this.field276 = arg3;
    }

    @ObfuscatedName("as.h(IIIB)V")
    public void method443(int arg0, int arg1, int arg2) {
        class336 var4 = method3501(this.field274, this.field275, this.field272);
        if (var4 == null) {
            return;
        }
        if (this.field272 * 64 == arg2) {
            var4.method5834(arg0, arg1);
        } else {
            var4.method5932(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("as.z(Lo;Ljava/util/List;I)V")
    public void method444(class25 arg0, List arg1) {
        this.field281.clear();
        this.field270 = arg0;
        this.method449(arg1);
    }

    @ObfuscatedName("as.e(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method459(HashSet arg0, List arg1) {
        this.field281.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class49 var4 = (class49) var3.next();
            if (var4.method301() == this.field274 && var4.method307() == this.field275) {
                this.field280.add(var4);
            }
        }
        this.method449(arg1);
    }

    @ObfuscatedName("as.q(IIIILac;I)V")
    public void method460(int arg0, int arg1, int arg2, int arg3, class31 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field199; var8++) {
                    class35[] var9 = arg4.field206[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class35[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class35 var12 = var10[var11];
                            class265 var13 = class265.method668(var12.field235);
                            if (method3686(var13)) {
                                this.method447(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.l(Ljg;IIILac;S)V")
    public void method447(class265 arg0, int arg1, int arg2, int arg3, class31 arg4) {
        class223 var6 = new class223(arg1, this.field274 * 64 + arg2, this.field275 * 64 + arg3);
        Object var7 = null;
        class223 var8;
        if (this.field270 == null) {
            class49 var9 = (class49) arg4;
            var8 = new class223(var9.field198 + arg1, var9.field200 * 64 + arg2 + var9.method675() * 8, var9.field195 * 64 + arg3 + var9.method676() * 8);
        } else {
            var8 = new class223(this.field270.field198 + arg1, this.field270.field200 * 64 + arg2, this.field270.field195 * 64 + arg3);
        }
        class44 var10;
        if (arg0.field3422 == null) {
            class253 var11 = class253.method4155(arg0.field3384);
            var10 = new class28(var8, var6, var11.field3249, this.method463(var11));
        } else {
            var10 = new class33(var8, var6, arg0.field3407, this);
        }
        class253 var12 = class253.method4155(var10.method250());
        if (var12.field3251) {
            this.field281.put(new class223(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("as.s(I)V")
    public void method448() {
        Iterator var1 = this.field281.values().iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            if (var2 instanceof class33) {
                ((class33) var2).method328();
            }
        }
    }

    @ObfuscatedName("as.b(Ljava/util/List;I)V")
    public void method449(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class28 var3 = (class28) var2.next();
            if (class253.method4155(var3.field160).field3251 && var3.field319.field2560 >> 6 == this.field274 && var3.field319.field2558 >> 6 == this.field275) {
                class28 var4 = new class28(var3.field319, var3.field319, var3.field160, this.method472(var3.field160));
                this.field277.add(var4);
            }
        }
    }

    @ObfuscatedName("as.a(I)V")
    public void method450() {
        if (this.field270 != null) {
            this.field270.method297();
            return;
        }
        Iterator var1 = this.field280.iterator();
        while (var1.hasNext()) {
            class49 var2 = (class49) var1.next();
            var2.method297();
        }
    }

    @ObfuscatedName("as.w(Lig;I)Z")
    public boolean method451(class245 arg0) {
        this.field281.clear();
        if (this.field270 == null) {
            boolean var2 = true;
            Iterator var3 = this.field280.iterator();
            while (var3.hasNext()) {
                class49 var4 = (class49) var3.next();
                var4.method296(arg0);
                var2 &= var4.method295();
            }
            if (var2) {
                Iterator var5 = this.field280.iterator();
                while (var5.hasNext()) {
                    class49 var6 = (class49) var5.next();
                    this.method460(var6.method674() * 8, var6.method670() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field270.method296(arg0);
            if (this.field270.method295()) {
                this.method460(0, 0, 64, 64, this.field270);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("as.k(ILaf;[Lly;Lig;Lig;I)V")
    public void method452(int arg0, class50 arg1, class335[] arg2, class245 arg3, class245 arg4) {
        this.field272 = arg0;
        if (this.field270 == null && this.field280.isEmpty() || method3501(this.field274, this.field275, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method451(arg3);
        int var8;
        if (this.field270 == null) {
            var8 = ((class31) this.field280.getFirst()).field197;
        } else {
            var8 = this.field270.field197;
        }
        boolean var9 = var7 & arg4.method4026(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3990(var8);
        class37 var11;
        if (var10 == null) {
            var11 = new class37();
        } else {
            var11 = new class37(class59.method326(var10).field3915);
        }
        class336 var13 = new class336(this.field272 * 64, this.field272 * 64);
        var13.method5827();
        if (this.field270 == null) {
            this.method456(arg1, arg2, var11);
        } else {
            this.method554(arg1, arg2, var11);
        }
        method188(var13, this.field274, this.field275, this.field272);
        this.method450();
    }

    @ObfuscatedName("as.i(IIILjava/util/HashSet;B)V")
    public void method453(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method478(arg0, arg1, arg3, arg2);
        this.method534(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("as.x(Ljava/util/HashSet;IIB)V")
    public void method454(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field281.values().iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method611()) {
                int var6 = var5.method250();
                if (arg0.contains(var6)) {
                    class253 var7 = class253.method4155(var6);
                    this.method465(var7, var5.field318, var5.field321, arg1, arg2);
                }
            }
        }
        this.method464(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.g(Laf;[Lly;Lal;B)V")
    public void method554(class50 arg0, class335[] arg1, class37 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method458(var4, var5, this.field270, arg0, arg2);
                this.method548(var4, var5, this.field270, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method527(var6, var7, this.field270, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("as.u(Laf;[Lly;Lal;I)V")
    public void method456(class50 arg0, class335[] arg1, class37 arg2) {
        Iterator var4 = this.field280.iterator();
        while (var4.hasNext()) {
            class49 var5 = (class49) var4.next();
            for (int var6 = var5.method674() * 8; var6 < var5.method674() * 8 + 8; var6++) {
                for (int var7 = var5.method670() * 8; var7 < var5.method670() * 8 + 8; var7++) {
                    this.method458(var6, var7, var5, arg0, arg2);
                    this.method548(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field280.iterator();
        while (var8.hasNext()) {
            class49 var9 = (class49) var8.next();
            for (int var10 = var9.method674() * 8; var10 < var9.method674() * 8 + 8; var10++) {
                for (int var11 = var9.method670() * 8; var11 < var9.method670() * 8 + 8; var11++) {
                    this.method527(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("as.t(IILac;Laf;[Lly;I)V")
    public void method527(int arg0, int arg1, class31 arg2, class50 arg3, class335[] arg4) {
        this.method568(arg0, arg1, arg2);
        this.method492(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("as.p(IILac;Laf;Lal;I)V")
    public void method458(int arg0, int arg1, class31 arg2, class50 arg3, class37 arg4) {
        int var6 = arg2.field202[0][arg0][arg1] - 1;
        int var7 = arg2.field203[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class332.method5763(this.field272 * arg0, this.field272 * (63 - arg1), this.field272, this.field272, this.field278);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field278;
            class269 var10 = class269.method3187(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3538 >= 0) {
                var11 = var10.field3538 | 0xFF000000;
            } else if (var10.field3539 >= 0) {
                int var12 = Statics.field1777.method2677(var10.field3539);
                byte var13 = 96;
                int var14;
                if (var12 == -2) {
                    var14 = 12345678;
                } else if (var12 == -1) {
                    if (var13 < 0) {
                        var13 = 0;
                    } else if (var13 > 127) {
                        var13 = 127;
                    }
                    int var15 = 127 - var13;
                    var14 = var15;
                } else {
                    int var16 = (var12 & 0x7F) * var13 / 128;
                    if (var16 < 2) {
                        var16 = 2;
                    } else if (var16 > 126) {
                        var16 = 126;
                    }
                    var14 = (var12 & 0xFF80) + var16;
                }
                var11 = class140.field1796[var14] | 0xFF000000;
            } else if (var10.field3536 == 16711935) {
                var11 = var9;
            } else {
                int var18 = var10.field3542;
                int var19 = var10.field3543;
                int var20 = var10.field3537;
                if (var20 > 179) {
                    var19 /= 2;
                }
                if (var20 > 192) {
                    var19 /= 2;
                }
                if (var20 > 217) {
                    var19 /= 2;
                }
                if (var20 > 243) {
                    var19 /= 2;
                }
                int var21 = var20 / 2 + (var18 / 4 << 10) + (var19 / 32 << 7);
                byte var24 = 96;
                int var25;
                if (var21 == -2) {
                    var25 = 12345678;
                } else if (var21 == -1) {
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > 127) {
                        var24 = 127;
                    }
                    int var26 = 127 - var24;
                    var25 = var26;
                } else {
                    int var27 = (var21 & 0x7F) * var24 / 128;
                    if (var27 < 2) {
                        var27 = 2;
                    } else if (var27 > 126) {
                        var27 = 126;
                    }
                    var25 = (var21 & 0xFF80) + var27;
                }
                var11 = class140.field1796[var25] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field194[0][arg0][arg1] == 0) {
            class332.method5763(this.field272 * arg0, this.field272 * (63 - arg1), this.field272, this.field272, var8);
            return;
        }
        int var29 = this.method462(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class332.method5763(this.field272 * arg0, this.field272 * (63 - arg1), this.field272, this.field272, var29);
        } else {
            arg3.method695(this.field272 * arg0, this.field272 * (63 - arg1), var29, var8, this.field272, this.field272, arg2.field194[0][arg0][arg1], arg2.field205[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("as.o(IILac;Laf;I)V")
    public void method548(int arg0, int arg1, class31 arg2, class50 arg3) {
        for (int var5 = 1; var5 < arg2.field199; var5++) {
            int var6 = arg2.field203[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field278;
                class269 var8 = class269.method3187(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3538 >= 0) {
                    var9 = var8.field3538 | 0xFF000000;
                } else if (var8.field3539 >= 0) {
                    int var10 = Statics.field1777.method2677(var8.field3539);
                    byte var11 = 96;
                    int var12;
                    if (var10 == -2) {
                        var12 = 12345678;
                    } else if (var10 == -1) {
                        if (var11 < 0) {
                            var11 = 0;
                        } else if (var11 > 127) {
                            var11 = 127;
                        }
                        int var13 = 127 - var11;
                        var12 = var13;
                    } else {
                        int var14 = (var10 & 0x7F) * var11 / 128;
                        if (var14 < 2) {
                            var14 = 2;
                        } else if (var14 > 126) {
                            var14 = 126;
                        }
                        var12 = (var10 & 0xFF80) + var14;
                    }
                    var9 = class140.field1796[var12] | 0xFF000000;
                } else if (var8.field3536 == 16711935) {
                    var9 = var7;
                } else {
                    int var16 = var8.field3542;
                    int var17 = var8.field3543;
                    int var18 = var8.field3537;
                    if (var18 > 179) {
                        var17 /= 2;
                    }
                    if (var18 > 192) {
                        var17 /= 2;
                    }
                    if (var18 > 217) {
                        var17 /= 2;
                    }
                    if (var18 > 243) {
                        var17 /= 2;
                    }
                    int var19 = var18 / 2 + (var16 / 4 << 10) + (var17 / 32 << 7);
                    byte var22 = 96;
                    int var23;
                    if (var19 == -2) {
                        var23 = 12345678;
                    } else if (var19 == -1) {
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 > 127) {
                            var22 = 127;
                        }
                        int var24 = 127 - var22;
                        var23 = var24;
                    } else {
                        int var25 = (var19 & 0x7F) * var22 / 128;
                        if (var25 < 2) {
                            var25 = 2;
                        } else if (var25 > 126) {
                            var25 = 126;
                        }
                        var23 = (var19 & 0xFF80) + var25;
                    }
                    var9 = class140.field1796[var23] | 0xFF000000;
                }
                if (arg2.field194[var5][arg0][arg1] == 0) {
                    class332.method5763(this.field272 * arg0, this.field272 * (63 - arg1), this.field272, this.field272, var9);
                } else {
                    arg3.method695(this.field272 * arg0, this.field272 * (63 - arg1), 0, var9, this.field272, this.field272, arg2.field194[var5][arg0][arg1], arg2.field205[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("as.ay(IILac;Lal;I)I")
    public int method462(int arg0, int arg1, class31 arg2, class37 arg3) {
        return arg2.field202[0][arg0][arg1] == 0 ? this.field278 : arg3.method428(arg0, arg1);
    }

    @ObfuscatedName("as.am(IILac;[Lly;B)V")
    public void method492(int arg0, int arg1, class31 arg2, class335[] arg3) {
        for (int var5 = 0; var5 < arg2.field199; var5++) {
            class35[] var6 = arg2.field206[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class35[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class35 var9 = var7[var8];
                    int var10 = var9.field239;
                    boolean var11 = var10 >= class230.field2748.field2771 && var10 <= class230.field2754.field2771;
                    if (!var11) {
                        int var12 = var9.field239;
                        boolean var13 = class230.field2760.field2771 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class265 var14 = class265.method668(var9.field235);
                    if (var14.field3410 != -1) {
                        if (var14.field3410 == 46 || var14.field3410 == 52) {
                            arg3[var14.field3410].method5804(this.field272 * arg0, this.field272 * (63 - arg1), this.field272 * 2 + 1, this.field272 * 2 + 1);
                        } else {
                            arg3[var14.field3410].method5804(this.field272 * arg0, this.field272 * (63 - arg1), this.field272 * 2, this.field272 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.ag(IILac;B)V")
    public void method568(int arg0, int arg1, class31 arg2) {
        for (int var4 = 0; var4 < arg2.field199; var4++) {
            class35[] var5 = arg2.field206[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class35[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class35 var8 = var6[var7];
                    if (class230.method1989(var8.field239)) {
                        class265 var9 = class265.method668(var8.field235);
                        int var10 = var9.field3400 == 0 ? -3355444 : -3407872;
                        if (class230.field2766.field2771 == var8.field239) {
                            this.method476(arg0, arg1, var8.field237, var10);
                        }
                        if (class230.field2750.field2771 == var8.field239) {
                            this.method476(arg0, arg1, var8.field237, -3355444);
                            this.method476(arg0, arg1, var8.field237 + 1, var10);
                        }
                        if (class230.field2751.field2771 == var8.field239) {
                            if (var8.field237 == 0) {
                                class332.method5736(this.field272 * arg0, this.field272 * (63 - arg1), 1, var10);
                            }
                            if (var8.field237 == 1) {
                                class332.method5736(this.field272 * arg0 + this.field272 - 1, this.field272 * (63 - arg1), 1, var10);
                            }
                            if (var8.field237 == 2) {
                                class332.method5736(this.field272 * arg0 + this.field272 - 1, this.field272 * (63 - arg1) + this.field272 - 1, 1, var10);
                            }
                            if (var8.field237 == 3) {
                                class332.method5736(this.field272 * arg0, this.field272 * (63 - arg1) + this.field272 - 1, 1, var10);
                            }
                        }
                        if (class230.field2761.field2771 == var8.field239) {
                            int var11 = var8.field237 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field272; var12++) {
                                    class332.method5736(this.field272 * arg0 + var12, this.field272 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field272; var13++) {
                                    class332.method5736(this.field272 * arg0 + var13, this.field272 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.ae(IILjava/util/HashSet;IB)V")
    public void method478(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field281.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class223 var9 = (class223) var8.getKey();
            int var10 = (int) ((float) var9.field2560 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2558 * var5 - var6);
            class44 var12 = (class44) var8.getValue();
            if (var12 != null && var12.method611()) {
                var12.field318 = var10;
                var12.field321 = var11;
                class253 var13 = class253.method4155(var12.method250());
                if (!arg2.contains(var13.method4180())) {
                    this.method457(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("as.ac(Ljava/util/HashSet;IIB)V")
    public void method464(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field277.iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method611()) {
                class253 var6 = class253.method4155(var5.method250());
                if (var6 != null && arg0.contains(var6.method4180())) {
                    this.method465(var6, var5.field318, var5.field321, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("as.aq(Lic;IIIII)V")
    public void method465(class253 arg0, int arg1, int arg2, int arg3, int arg4) {
        class336 var6 = arg0.method4178(false);
        if (var6 == null) {
            return;
        }
        var6.method5836(arg1 - var6.field3913 / 2, arg2 - var6.field3912 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class332.method5776(arg1, arg2, 15, 16776960, 128);
            class332.method5776(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("as.at(Laj;IIFI)V")
    public void method457(class44 arg0, int arg1, int arg2, float arg3) {
        class253 var5 = class253.method4155(arg0.method250());
        this.method467(var5, arg1, arg2);
        this.method538(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("as.ak(Lic;IIS)V")
    public void method467(class253 arg0, int arg1, int arg2) {
        class336 var4 = arg0.method4178(false);
        if (var4 != null) {
            int var5 = this.method514(var4, arg0.field3264);
            int var6 = this.method471(var4, arg0.field3265);
            var4.method5836(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("as.ax(Laj;Lic;IIFI)V")
    public void method538(class44 arg0, class253 arg1, int arg2, int arg3, float arg4) {
        class38 var6 = arg0.method251();
        if (var6 != null && var6.field266.method232(arg4)) {
            class306 var7 = (class306) this.field276.get(var6.field266);
            var7.method5160(var6.field267, arg2 - var6.field265 / 2, arg3, var6.field265, var6.field264, 0xFF000000 | arg1.field3246, 0, 1, 0, var7.field3712 / 2);
        }
    }

    @ObfuscatedName("as.ar(IILjava/util/HashSet;II)V")
    public void method534(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field277.iterator();
        while (var6.hasNext()) {
            class44 var7 = (class44) var6.next();
            if (var7.method611()) {
                int var8 = var7.field319.field2560 % 64;
                int var9 = var7.field319.field2558 % 64;
                var7.field318 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field321 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method250())) {
                    this.method457(var7, var7.field318, var7.field321, var5);
                }
            }
        }
    }

    @ObfuscatedName("as.al(Llm;Lje;I)I")
    public int method514(class336 arg0, class267 arg1) {
        switch(arg1.field3492) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3913 / 2;
            default:
                return -arg0.field3913;
        }
    }

    @ObfuscatedName("as.aa(Llm;Lie;I)I")
    public int method471(class336 arg0, class250 arg1) {
        switch(arg1.field3234) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3912 / 2;
            default:
                return -arg0.field3912;
        }
    }

    @ObfuscatedName("gg.as(Ljg;I)Z")
    public static boolean method3686(class265 arg0) {
        if (arg0.field3422 != null) {
            int[] var1 = arg0.field3422;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class265 var4 = class265.method668(var3);
                if (var4.field3384 != -1) {
                    return true;
                }
            }
        } else if (arg0.field3384 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("as.aw(II)Laa;")
    public class38 method472(int arg0) {
        class253 var2 = class253.method4155(arg0);
        return this.method463(var2);
    }

    @ObfuscatedName("as.az(Lic;B)Laa;")
    public class38 method463(class253 arg0) {
        if (arg0.field3255 == null || this.field276 == null || this.field276.get(class27.field153) == null) {
            return null;
        }
        class27 var2 = class27.method243(arg0.field3245);
        if (var2 == null) {
            return null;
        }
        class306 var3 = (class306) this.field276.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5083(arg0.field3255, 1000000);
        String[] var5 = new String[var4];
        var3.method5117(arg0.field3255, (int[]) null, var5);
        int var6 = var5.length * var3.field3712 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5084(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class38(arg0.field3255, var7, var6, var2);
    }

    @ObfuscatedName("as.ah(IIIIIB)Ljava/util/List;")
    public List method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field281.values().iterator();
            while (var7.hasNext()) {
                class44 var8 = (class44) var7.next();
                if (var8.method611() && var8.method598(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field277.iterator();
            while (var9.hasNext()) {
                class44 var10 = (class44) var9.next();
                if (var10.method611() && var10.method598(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("as.ap(I)Ljava/util/List;")
    public List method496() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field277);
        var1.addAll(this.field281.values());
        return var1;
    }

    @ObfuscatedName("as.aj(IIIIB)V")
    public void method476(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class332.method5745(this.field272 * arg0, this.field272 * (63 - arg1), this.field272, arg3);
        }
        if (var5 == 1) {
            class332.method5736(this.field272 * arg0, this.field272 * (63 - arg1), this.field272, arg3);
        }
        if (var5 == 2) {
            class332.method5745(this.field272 * arg0 + this.field272 - 1, this.field272 * (63 - arg1), this.field272, arg3);
        }
        if (var5 == 3) {
            class332.method5736(this.field272 * arg0, this.field272 * (63 - arg1) + this.field272 - 1, this.field272, arg3);
        }
    }
}
