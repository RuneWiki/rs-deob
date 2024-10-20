package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("al")
public class class39 {

    @ObfuscatedName("al.i")
    public static class159 field268 = new class159(37748736, 256);

    @ObfuscatedName("al.o")
    public int field269;

    @ObfuscatedName("al.x")
    public int field270;

    @ObfuscatedName("al.w")
    public class25 field273;

    @ObfuscatedName("al.g")
    public LinkedList field272;

    @ObfuscatedName("al.m")
    public int field266;

    @ObfuscatedName("al.n")
    public int field274;

    @ObfuscatedName("al.d")
    public List field275;

    @ObfuscatedName("al.h")
    public HashMap field276;

    @ObfuscatedName("al.a")
    public final HashMap field277;

    @ObfuscatedName("cf.z(IIIB)J")
    public static long method1963(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("an.k(Llp;IIII)V")
    public static void method311(class335 arg0, int arg1, int arg2, int arg3) {
        field268.method3195(arg0, method1963(arg1, arg2, arg3), arg0.field3906.length * 4);
    }

    @ObfuscatedName("ap.s(I)V")
    public static void method322() {
        field268.method3197();
    }

    public class39(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field269 = arg0;
        this.field270 = arg1;
        this.field272 = new LinkedList();
        this.field275 = new LinkedList();
        this.field276 = new HashMap();
        this.field266 = arg2 | 0xFF000000;
        this.field277 = arg3;
    }

    @ObfuscatedName("al.t(IIII)V")
    public void method431(int arg0, int arg1, int arg2) {
        int var4 = this.field269;
        int var5 = this.field270;
        int var6 = this.field274;
        class335 var7 = (class335) field268.method3198(method1963(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field274 * 64 == arg2) {
            var7.method5770(arg0, arg1);
        } else {
            var7.method5786(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("al.i(Ll;Ljava/util/List;I)V")
    public void method427(class25 arg0, List arg1) {
        this.field276.clear();
        this.field273 = arg0;
        this.method432(arg1);
    }

    @ObfuscatedName("al.o(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method478(HashSet arg0, List arg1) {
        this.field276.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class49 var4 = (class49) var3.next();
            if (var4.method294() == this.field269 && var4.method297() == this.field270) {
                this.field272.add(var4);
            }
        }
        this.method432(arg1);
    }

    @ObfuscatedName("al.x(IIIILan;I)V")
    public void method429(int arg0, int arg1, int arg2, int arg3, class31 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field186; var8++) {
                    class35[] var9 = arg4.field193[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class35[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class264 var13;
                            boolean var18;
                            label58: {
                                class35 var12 = var10[var11];
                                var13 = class264.method3595(var12.field235);
                                if (var13.field3413 != null) {
                                    int[] var14 = var13.field3413;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class264 var17 = class264.method3595(var16);
                                        if (var17.field3400 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3400 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method430(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.w(Ljg;IIILan;I)V")
    public void method430(class264 arg0, int arg1, int arg2, int arg3, class31 arg4) {
        class223 var6 = new class223(arg1, this.field269 * 64 + arg2, this.field270 * 64 + arg3);
        Object var7 = null;
        class223 var8;
        if (this.field273 == null) {
            class49 var9 = (class49) arg4;
            var8 = new class223(var9.field188 + arg1, var9.field184 * 64 + arg2 + var9.method636() * 8, var9.field182 * 64 + arg3 + var9.method644() * 8);
        } else {
            var8 = new class223(this.field273.field188 + arg1, this.field273.field184 * 64 + arg2, this.field273.field182 * 64 + arg3);
        }
        class44 var10;
        if (arg0.field3413 == null) {
            class252 var11 = Statics.method285(arg0.field3400);
            var10 = new class28(var8, var6, var11.field3240, this.method456(var11));
        } else {
            var10 = new class33(var8, var6, arg0.field3415, this);
        }
        this.field276.put(new class223(0, arg2, arg3), var10);
    }

    @ObfuscatedName("al.g(I)V")
    public void method489() {
        Iterator var1 = this.field276.values().iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            if (var2 instanceof class33) {
                ((class33) var2).method320();
            }
        }
    }

    @ObfuscatedName("al.m(Ljava/util/List;I)V")
    public void method432(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class28 var3 = (class28) var2.next();
            if (var3.field314.field2563 >> 6 == this.field269 && var3.field314.field2565 >> 6 == this.field270) {
                class28 var4 = new class28(var3.field314, var3.field314, var3.field149, this.method455(var3.field149));
                this.field275.add(var4);
            }
        }
    }

    @ObfuscatedName("al.n(I)V")
    public void method433() {
        if (this.field273 != null) {
            this.field273.method292();
            return;
        }
        Iterator var1 = this.field272.iterator();
        while (var1.hasNext()) {
            class49 var2 = (class49) var1.next();
            var2.method292();
        }
    }

    @ObfuscatedName("al.d(Lic;B)Z")
    public boolean method434(class244 arg0) {
        this.field276.clear();
        if (this.field273 == null) {
            boolean var2 = true;
            Iterator var3 = this.field272.iterator();
            while (var3.hasNext()) {
                class49 var4 = (class49) var3.next();
                var4.method315(arg0);
                var2 &= var4.method290();
            }
            if (var2) {
                Iterator var5 = this.field272.iterator();
                while (var5.hasNext()) {
                    class49 var6 = (class49) var5.next();
                    this.method429(var6.method638() * 8, var6.method639() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field273.method315(arg0);
            if (this.field273.method290()) {
                this.method429(0, 0, 64, 64, this.field273);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("al.h(ILaf;[Lls;Lic;Lic;B)V")
    public void method435(int arg0, class50 arg1, class334[] arg2, class244 arg3, class244 arg4) {
        this.field274 = arg0;
        if (this.field273 == null && this.field272.isEmpty()) {
            return;
        }
        int var6 = this.field269;
        int var7 = this.field270;
        class335 var8 = (class335) field268.method3198(method1963(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method434(arg3);
        int var11;
        if (this.field273 == null) {
            var11 = ((class31) this.field272.getFirst()).field187;
        } else {
            var11 = this.field273.field187;
        }
        boolean var12 = var10 & arg4.method3876(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method3879(var11);
        class37 var14 = class37.method539(var13);
        class335 var15 = new class335(this.field274 * 64, this.field274 * 64);
        var15.method5775();
        if (this.field273 == null) {
            this.method428(arg1, arg2, var14);
        } else {
            this.method479(arg1, arg2, var14);
        }
        method311(var15, this.field269, this.field270, this.field274);
        this.method433();
    }

    @ObfuscatedName("al.a(IIILjava/util/HashSet;I)V")
    public void method495(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method446(arg0, arg1, arg3, arg2);
        this.method444(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("al.q(Ljava/util/HashSet;III)V")
    public void method494(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field276.values().iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method561()) {
                int var6 = var5.method250();
                if (arg0.contains(var6)) {
                    class252 var7 = Statics.method285(var6);
                    this.method448(var7, var5.field312, var5.field315, arg1, arg2);
                }
            }
        }
        this.method447(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.c(Laf;[Lls;Lat;I)V")
    public void method479(class50 arg0, class334[] arg1, class37 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method468(var4, var5, this.field273, arg0, arg2);
                this.method425(var4, var5, this.field273, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method471(var6, var7, this.field273, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("al.j(Laf;[Lls;Lat;B)V")
    public void method428(class50 arg0, class334[] arg1, class37 arg2) {
        Iterator var4 = this.field272.iterator();
        while (var4.hasNext()) {
            class49 var5 = (class49) var4.next();
            for (int var6 = var5.method638() * 8; var6 < var5.method638() * 8 + 8; var6++) {
                for (int var7 = var5.method639() * 8; var7 < var5.method639() * 8 + 8; var7++) {
                    this.method468(var6, var7, var5, arg0, arg2);
                    this.method425(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field272.iterator();
        while (var8.hasNext()) {
            class49 var9 = (class49) var8.next();
            for (int var10 = var9.method638() * 8; var10 < var9.method638() * 8 + 8; var10++) {
                for (int var11 = var9.method639() * 8; var11 < var9.method639() * 8 + 8; var11++) {
                    this.method471(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("al.r(IILan;Laf;[Lls;I)V")
    public void method471(int arg0, int arg1, class31 arg2, class50 arg3, class334[] arg4) {
        this.method445(arg0, arg1, arg2);
        this.method459(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("al.u(IILan;Laf;Lat;I)V")
    public void method468(int arg0, int arg1, class31 arg2, class50 arg3, class37 arg4) {
        int var6 = arg2.field191[0][arg0][arg1] - 1;
        int var7 = arg2.field190[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class331.method5661(this.field274 * arg0, this.field274 * (63 - arg1), this.field274, this.field274, this.field266);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field266;
            class268 var10 = class268.method2382(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3524 >= 0) {
                var11 = var10.field3524 | 0xFF000000;
            } else if (var10.field3523 >= 0) {
                int var12 = class42.method138(Statics.field1808.method2615(var10.field3523), 96);
                var11 = class140.field1807[var12] | 0xFF000000;
            } else if (var10.field3532 == 16711935) {
                var11 = var9;
            } else {
                int var13 = var10.field3530;
                int var14 = var10.field3529;
                int var15 = var10.field3527;
                if (var15 > 179) {
                    var14 /= 2;
                }
                if (var15 > 192) {
                    var14 /= 2;
                }
                if (var15 > 217) {
                    var14 /= 2;
                }
                if (var15 > 243) {
                    var14 /= 2;
                }
                int var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                int var19 = class42.method138(var16, 96);
                var11 = class140.field1807[var19] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field199[0][arg0][arg1] == 0) {
            class331.method5661(this.field274 * arg0, this.field274 * (63 - arg1), this.field274, this.field274, var8);
            return;
        }
        int var20 = this.method443(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class331.method5661(this.field274 * arg0, this.field274 * (63 - arg1), this.field274, this.field274, var20);
        } else {
            arg3.method676(this.field274 * arg0, this.field274 * (63 - arg1), var20, var8, this.field274, this.field274, arg2.field199[0][arg0][arg1], arg2.field192[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("al.p(IILan;Laf;I)V")
    public void method425(int arg0, int arg1, class31 arg2, class50 arg3) {
        for (int var5 = 1; var5 < arg2.field186; var5++) {
            int var6 = arg2.field190[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field266;
                class268 var8 = class268.method2382(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3524 >= 0) {
                    var9 = var8.field3524 | 0xFF000000;
                } else if (var8.field3523 >= 0) {
                    int var10 = class42.method138(Statics.field1808.method2615(var8.field3523), 96);
                    var9 = class140.field1807[var10] | 0xFF000000;
                } else if (var8.field3532 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field3530;
                    int var12 = var8.field3529;
                    int var13 = var8.field3527;
                    if (var13 > 179) {
                        var12 /= 2;
                    }
                    if (var13 > 192) {
                        var12 /= 2;
                    }
                    if (var13 > 217) {
                        var12 /= 2;
                    }
                    if (var13 > 243) {
                        var12 /= 2;
                    }
                    int var14 = var13 / 2 + (var11 / 4 << 10) + (var12 / 32 << 7);
                    int var17 = class42.method138(var14, 96);
                    var9 = class140.field1807[var17] | 0xFF000000;
                }
                if (arg2.field199[var5][arg0][arg1] == 0) {
                    class331.method5661(this.field274 * arg0, this.field274 * (63 - arg1), this.field274, this.field274, var9);
                } else {
                    arg3.method676(this.field274 * arg0, this.field274 * (63 - arg1), 0, var9, this.field274, this.field274, arg2.field199[var5][arg0][arg1], arg2.field192[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("al.b(IILan;Lat;I)I")
    public int method443(int arg0, int arg1, class31 arg2, class37 arg3) {
        return arg2.field191[0][arg0][arg1] == 0 ? this.field266 : arg3.method413(arg0, arg1);
    }

    @ObfuscatedName("al.l(IILan;[Lls;B)V")
    public void method459(int arg0, int arg1, class31 arg2, class334[] arg3) {
        for (int var5 = 0; var5 < arg2.field186; var5++) {
            class35[] var6 = arg2.field193[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class35[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class35 var9 = var7[var8];
                    int var10 = var9.field233;
                    boolean var11 = var10 >= class230.field2778.field2776 && var10 <= class230.field2779.field2776;
                    if (!var11) {
                        int var12 = var9.field233;
                        boolean var13 = class230.field2780.field2776 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class264 var14 = class264.method3595(var9.field235);
                    if (var14.field3409 != -1) {
                        if (var14.field3409 == 46 || var14.field3409 == 52) {
                            arg3[var14.field3409].method5736(this.field274 * arg0, this.field274 * (63 - arg1), this.field274 * 2 + 1, this.field274 * 2 + 1);
                        } else {
                            arg3[var14.field3409].method5736(this.field274 * arg0, this.field274 * (63 - arg1), this.field274 * 2, this.field274 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.e(IILan;B)V")
    public void method445(int arg0, int arg1, class31 arg2) {
        for (int var4 = 0; var4 < arg2.field186; var4++) {
            class35[] var5 = arg2.field193[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class35[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class35 var8 = var6[var7];
                    if (class230.method2634(var8.field233)) {
                        class264 var9 = class264.method3595(var8.field235);
                        int var10 = var9.field3391 == 0 ? -3355444 : -3407872;
                        if (class230.field2761.field2776 == var8.field233) {
                            this.method511(arg0, arg1, var8.field234, var10);
                        }
                        if (class230.field2764.field2776 == var8.field233) {
                            this.method511(arg0, arg1, var8.field234, -3355444);
                            this.method511(arg0, arg1, var8.field234 + 1, var10);
                        }
                        if (class230.field2758.field2776 == var8.field233) {
                            if (var8.field234 == 0) {
                                class331.method5686(this.field274 * arg0, this.field274 * (63 - arg1), 1, var10);
                            }
                            if (var8.field234 == 1) {
                                class331.method5686(this.field274 * arg0 + this.field274 - 1, this.field274 * (63 - arg1), 1, var10);
                            }
                            if (var8.field234 == 2) {
                                class331.method5686(this.field274 * arg0 + this.field274 - 1, this.field274 * (63 - arg1) + this.field274 - 1, 1, var10);
                            }
                            if (var8.field234 == 3) {
                                class331.method5686(this.field274 * arg0, this.field274 * (63 - arg1) + this.field274 - 1, 1, var10);
                            }
                        }
                        if (class230.field2762.field2776 == var8.field233) {
                            int var11 = var8.field234 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field274; var12++) {
                                    class331.method5686(this.field274 * arg0 + var12, this.field274 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field274; var13++) {
                                    class331.method5686(this.field274 * arg0 + var13, this.field274 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.ab(IILjava/util/HashSet;II)V")
    public void method446(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field276.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class223 var9 = (class223) var8.getKey();
            int var10 = (int) ((float) var9.field2563 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2565 * var5 - var6);
            class44 var12 = (class44) var8.getValue();
            if (var12 != null && var12.method561()) {
                var12.field312 = var10;
                var12.field315 = var11;
                class252 var13 = Statics.method285(var12.method250());
                if (!arg2.contains(var13.method4088())) {
                    this.method449(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("al.ag(Ljava/util/HashSet;III)V")
    public void method447(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field275.iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method561()) {
                class252 var6 = Statics.method285(var5.method250());
                if (var6 != null && arg0.contains(var6.method4088())) {
                    this.method448(var6, var5.field312, var5.field315, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("al.ao(Liv;IIIII)V")
    public void method448(class252 arg0, int arg1, int arg2, int arg3, int arg4) {
        class335 var6 = arg0.method4089(false);
        if (var6 == null) {
            return;
        }
        var6.method5765(arg1 - var6.field3905 / 2, arg2 - var6.field3907 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class331.method5659(arg1, arg2, 15, 16776960, 128);
            class331.method5659(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("al.ae(Laz;IIFI)V")
    public void method449(class44 arg0, int arg1, int arg2, float arg3) {
        class252 var5 = Statics.method285(arg0.method250());
        this.method450(var5, arg1, arg2);
        this.method493(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("al.ap(Liv;III)V")
    public void method450(class252 arg0, int arg1, int arg2) {
        class335 var4 = arg0.method4089(false);
        if (var4 != null) {
            int var5 = this.method453(var4, arg0.field3255);
            int var6 = this.method454(var4, arg0.field3253);
            var4.method5765(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("al.au(Laz;Liv;IIFB)V")
    public void method493(class44 arg0, class252 arg1, int arg2, int arg3, float arg4) {
        class38 var6 = arg0.method261();
        if (var6 != null && var6.field258.method240(arg4)) {
            class305 var7 = (class305) this.field277.get(var6.field258);
            var7.method5107(var6.field259, arg2 - var6.field261 / 2, arg3, var6.field261, var6.field260, 0xFF000000 | arg1.field3244, 0, 1, 0, var7.field3707 / 2);
        }
    }

    @ObfuscatedName("al.aa(IILjava/util/HashSet;II)V")
    public void method444(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field275.iterator();
        while (var6.hasNext()) {
            class44 var7 = (class44) var6.next();
            if (var7.method561()) {
                int var8 = var7.field314.field2563 % 64;
                int var9 = var7.field314.field2565 % 64;
                var7.field312 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field315 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method250())) {
                    this.method449(var7, var7.field312, var7.field315, var5);
                }
            }
        }
    }

    @ObfuscatedName("al.ar(Llp;Lju;I)I")
    public int method453(class335 arg0, class266 arg1) {
        switch(arg1.field3483) {
            case 0:
                return -arg0.field3905 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3905;
        }
    }

    @ObfuscatedName("al.at(Llp;Lit;I)I")
    public int method454(class335 arg0, class249 arg1) {
        switch(arg1.field3225) {
            case 0:
                return -arg0.field3907 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3907;
        }
    }

    @ObfuscatedName("al.aq(II)Laq;")
    public class38 method455(int arg0) {
        class252 var2 = Statics.method285(arg0);
        return this.method456(var2);
    }

    @ObfuscatedName("al.al(Liv;I)Laq;")
    public class38 method456(class252 arg0) {
        if (arg0.field3246 == null || this.field277 == null || this.field277.get(class27.field146) == null) {
            return null;
        }
        class27 var2 = class27.method236(arg0.field3245);
        if (var2 == null) {
            return null;
        }
        class305 var3 = (class305) this.field277.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5051(arg0.field3246, 1000000);
        String[] var5 = new String[var4];
        var3.method5049(arg0.field3246, (int[]) null, var5);
        int var6 = var5.length * var3.field3707 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5127(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class38(arg0.field3246, var7, var6, var2);
    }

    @ObfuscatedName("al.ah(IIIIII)Ljava/util/List;")
    public List method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field276.values().iterator();
            while (var7.hasNext()) {
                class44 var8 = (class44) var7.next();
                if (var8.method561() && var8.method564(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field275.iterator();
            while (var9.hasNext()) {
                class44 var10 = (class44) var9.next();
                if (var10.method561() && var10.method564(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("al.av(I)Ljava/util/List;")
    public List method458() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field275);
        var1.addAll(this.field276.values());
        return var1;
    }

    @ObfuscatedName("al.ax(IIIII)V")
    public void method511(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class331.method5669(this.field274 * arg0, this.field274 * (63 - arg1), this.field274, arg3);
        }
        if (var5 == 1) {
            class331.method5686(this.field274 * arg0, this.field274 * (63 - arg1), this.field274, arg3);
        }
        if (var5 == 2) {
            class331.method5669(this.field274 * arg0 + this.field274 - 1, this.field274 * (63 - arg1), this.field274, arg3);
        }
        if (var5 == 3) {
            class331.method5686(this.field274 * arg0, this.field274 * (63 - arg1) + this.field274 - 1, this.field274, arg3);
        }
    }
}
