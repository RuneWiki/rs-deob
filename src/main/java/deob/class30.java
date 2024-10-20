package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ax")
public class class30 {

    @ObfuscatedName("ax.i")
    public static class150 field261 = new class150(37748736, 256);

    @ObfuscatedName("ax.g")
    public int field256;

    @ObfuscatedName("ax.d")
    public int field257;

    @ObfuscatedName("ax.l")
    public class16 field263;

    @ObfuscatedName("ax.j")
    public LinkedList field259;

    @ObfuscatedName("ax.m")
    public int field260;

    @ObfuscatedName("ax.p")
    public int field253;

    @ObfuscatedName("ax.h")
    public List field262;

    @ObfuscatedName("ax.v")
    public HashMap field265;

    @ObfuscatedName("ax.n")
    public final HashMap field264;

    @ObfuscatedName("by.c(IIIB)Llt;")
    public static class326 method1040(int arg0, int arg1, int arg2) {
        class150 var3 = field261;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class326) var3.method3140(var4);
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field256 = arg0;
        this.field257 = arg1;
        this.field259 = new LinkedList();
        this.field262 = new LinkedList();
        this.field265 = new HashMap();
        this.field260 = arg2 | 0xFF000000;
        this.field264 = arg3;
    }

    @ObfuscatedName("ax.t(IIII)V")
    public void method380(int arg0, int arg1, int arg2) {
        class326 var4 = method1040(this.field256, this.field257, this.field253);
        if (var4 == null) {
            return;
        }
        if (this.field253 * 64 == arg2) {
            var4.method5692(arg0, arg1);
        } else {
            var4.method5715(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ax.o(Lw;Ljava/util/List;B)V")
    public void method384(class16 arg0, List arg1) {
        this.field265.clear();
        this.field263 = arg0;
        this.method386(arg1);
    }

    @ObfuscatedName("ax.e(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method382(HashSet arg0, List arg1) {
        this.field265.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method249() == this.field256 && var4.method236() == this.field257) {
                this.field259.add(var4);
            }
        }
        this.method386(arg1);
    }

    @ObfuscatedName("ax.i(IIIILb;I)V")
    public void method433(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field180; var8++) {
                    class26[] var9 = arg4.field187[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class26 var12 = var10[var11];
                            class255 var13 = class255.method3070(var12.field226);
                            if (method2343(var13)) {
                                this.method444(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.g(Lir;IIILb;S)V")
    public void method444(class255 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field256 * 64 + arg2, this.field257 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field263 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field188 + arg1, var9.field183 * 64 + arg2 + var9.method594() * 8, var9.field179 * 64 + arg3 + var9.method588() * 8);
        } else {
            var8 = new class214(this.field263.field188 + arg1, this.field263.field183 * 64 + arg2, this.field263.field179 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3386 == null) {
            class243 var11 = class243.method3377(arg0.field3373);
            var10 = new class19(var8, var6, var11.field3214, this.method500(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3369, this);
        }
        this.field265.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("ax.d(I)V")
    public void method385() {
        Iterator var1 = this.field265.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method266();
            }
        }
    }

    @ObfuscatedName("ax.l(Ljava/util/List;I)V")
    public void method386(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field306.field2539 >> 6 == this.field256 && var3.field306.field2537 >> 6 == this.field257) {
                class19 var4 = new class19(var3.field306, var3.field306, var3.field144, this.method465(var3.field144));
                this.field262.add(var4);
            }
        }
    }

    @ObfuscatedName("ax.j(I)V")
    public void method413() {
        if (this.field263 != null) {
            this.field263.method232();
            return;
        }
        Iterator var1 = this.field259.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method232();
        }
    }

    @ObfuscatedName("ax.m(Lii;B)Z")
    public boolean method488(class235 arg0) {
        this.field265.clear();
        if (this.field263 == null) {
            boolean var2 = true;
            Iterator var3 = this.field259.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method231(arg0);
                var2 &= var4.method230();
            }
            if (var2) {
                Iterator var5 = this.field259.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method433(var6.method592() * 8, var6.method590() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field263.method231(arg0);
            if (this.field263.method230()) {
                this.method433(0, 0, 64, 64, this.field263);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ax.p(ILav;[Lli;Lii;Lii;I)V")
    public void method389(int arg0, class41 arg1, class325[] arg2, class235 arg3, class235 arg4) {
        this.field253 = arg0;
        if (this.field263 == null && this.field259.isEmpty() || method1040(this.field256, this.field257, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method488(arg3);
        int var8;
        if (this.field263 == null) {
            var8 = ((class22) this.field259.getFirst()).field185;
        } else {
            var8 = this.field263.field185;
        }
        boolean var9 = var7 & arg4.method3836(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3898(var8);
        class28 var11 = class28.method3822(var10);
        class326 var12 = new class326(this.field253 * 64, this.field253 * 64);
        var12.method5685();
        if (this.field263 == null) {
            this.method393(arg1, arg2, var11);
        } else {
            this.method392(arg1, arg2, var11);
        }
        int var13 = this.field256;
        int var14 = this.field257;
        int var15 = this.field253;
        class150 var16 = field261;
        long var18 = (long) (var15 << 16 | var13 << 8 | var14);
        var16.method3121(var12, var18, var12.field3875.length * 4);
        this.method413();
    }

    @ObfuscatedName("ax.h(IIILjava/util/HashSet;B)V")
    public void method390(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method379(arg0, arg1, arg3, arg2);
        this.method437(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ax.v(Ljava/util/HashSet;IIB)V")
    public void method391(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field265.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method521()) {
                int var6 = var5.method180();
                if (arg0.contains(var6)) {
                    class243 var7 = class243.method3377(var6);
                    this.method408(var7, var5.field302, var5.field304, arg1, arg2);
                }
            }
        }
        this.method400(arg0, arg1, arg2);
    }

    @ObfuscatedName("ax.n(Lav;[Lli;Laf;S)V")
    public void method392(class41 arg0, class325[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method395(var4, var5, this.field263, arg0, arg2);
                this.method396(var4, var5, this.field263, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method394(var6, var7, this.field263, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ax.x(Lav;[Lli;Laf;I)V")
    public void method393(class41 arg0, class325[] arg1, class28 arg2) {
        Iterator var4 = this.field259.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method592() * 8; var6 < var5.method592() * 8 + 8; var6++) {
                for (int var7 = var5.method590() * 8; var7 < var5.method590() * 8 + 8; var7++) {
                    this.method395(var6, var7, var5, arg0, arg2);
                    this.method396(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field259.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method592() * 8; var10 < var9.method592() * 8 + 8; var10++) {
                for (int var11 = var9.method590() * 8; var11 < var9.method590() * 8 + 8; var11++) {
                    this.method394(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ax.w(IILb;Lav;[Lli;I)V")
    public void method394(int arg0, int arg1, class22 arg2, class41 arg3, class325[] arg4) {
        this.method399(arg0, arg1, arg2);
        this.method480(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ax.q(IILb;Lav;Laf;B)V")
    public void method395(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field181[0][arg0][arg1] - 1;
        int var7 = arg2.field184[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class322.method5590(this.field253 * arg0, this.field253 * (63 - arg1), this.field253, this.field253, this.field260);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class33.method4717(var7, this.field260);
        }
        if (var7 > -1 && arg2.field189[0][arg0][arg1] == 0) {
            class322.method5590(this.field253 * arg0, this.field253 * (63 - arg1), this.field253, this.field253, var8);
            return;
        }
        int var9 = this.method397(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class322.method5590(this.field253 * arg0, this.field253 * (63 - arg1), this.field253, this.field253, var9);
        } else {
            arg3.method612(this.field253 * arg0, this.field253 * (63 - arg1), var9, var8, this.field253, this.field253, arg2.field189[0][arg0][arg1], arg2.field176[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ax.z(IILb;Lav;B)V")
    public void method396(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field180; var5++) {
            int var6 = arg2.field184[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class33.method4717(var6, this.field260);
                if (arg2.field189[var5][arg0][arg1] == 0) {
                    class322.method5590(this.field253 * arg0, this.field253 * (63 - arg1), this.field253, this.field253, var7);
                } else {
                    arg3.method612(this.field253 * arg0, this.field253 * (63 - arg1), 0, var7, this.field253, this.field253, arg2.field189[var5][arg0][arg1], arg2.field176[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ax.y(IILb;Laf;I)I")
    public int method397(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field181[0][arg0][arg1] == 0 ? this.field260 : arg3.method373(arg0, arg1);
    }

    @ObfuscatedName("ax.f(IILb;[Lli;I)V")
    public void method480(int arg0, int arg1, class22 arg2, class325[] arg3) {
        for (int var5 = 0; var5 < arg2.field180; var5++) {
            class26[] var6 = arg2.field187[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field222;
                    boolean var11 = var10 >= class221.field2748.field2736 && var10 <= class221.field2749.field2736;
                    if (!var11) {
                        int var12 = var9.field222;
                        boolean var13 = class221.field2752.field2736 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class255 var14 = class255.method3070(var9.field226);
                    if (var14.field3359 != -1) {
                        if (var14.field3359 == 46 || var14.field3359 == 52) {
                            arg3[var14.field3359].method5665(this.field253 * arg0, this.field253 * (63 - arg1), this.field253 * 2 + 1, this.field253 * 2 + 1);
                        } else {
                            arg3[var14.field3359].method5665(this.field253 * arg0, this.field253 * (63 - arg1), this.field253 * 2, this.field253 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.a(IILb;B)V")
    public void method399(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field180; var4++) {
            class26[] var5 = arg2.field187[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    if (class221.method3722(var8.field222)) {
                        class255 var9 = class255.method3070(var8.field226);
                        int var10 = var9.field3364 == 0 ? -3355444 : -3407872;
                        if (class221.field2746.field2736 == var8.field222) {
                            this.method412(arg0, arg1, var8.field224, var10);
                        }
                        if (class221.field2730.field2736 == var8.field222) {
                            this.method412(arg0, arg1, var8.field224, -3355444);
                            this.method412(arg0, arg1, var8.field224 + 1, var10);
                        }
                        if (class221.field2744.field2736 == var8.field222) {
                            if (var8.field224 == 0) {
                                class322.method5597(this.field253 * arg0, this.field253 * (63 - arg1), 1, var10);
                            }
                            if (var8.field224 == 1) {
                                class322.method5597(this.field253 * arg0 + this.field253 - 1, this.field253 * (63 - arg1), 1, var10);
                            }
                            if (var8.field224 == 2) {
                                class322.method5597(this.field253 * arg0 + this.field253 - 1, this.field253 * (63 - arg1) + this.field253 - 1, 1, var10);
                            }
                            if (var8.field224 == 3) {
                                class322.method5597(this.field253 * arg0, this.field253 * (63 - arg1) + this.field253 - 1, 1, var10);
                            }
                        }
                        if (class221.field2732.field2736 == var8.field222) {
                            int var11 = var8.field224 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field253; var12++) {
                                    class322.method5597(this.field253 * arg0 + var12, this.field253 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field253; var13++) {
                                    class322.method5597(this.field253 * arg0 + var13, this.field253 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.u(IILjava/util/HashSet;IB)V")
    public void method379(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field265.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2539 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2537 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method521()) {
                var12.field302 = var10;
                var12.field304 = var11;
                class243 var13 = class243.method3377(var12.method180());
                if (!arg2.contains(var13.method4054())) {
                    this.method402(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ax.ae(Ljava/util/HashSet;III)V")
    public void method400(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field262.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method521()) {
                class243 var6 = class243.method3377(var5.method180());
                if (var6 != null && arg0.contains(var6.method4054())) {
                    this.method408(var6, var5.field302, var5.field304, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ax.af(Lim;IIIII)V")
    public void method408(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class326 var6 = arg0.method4052(false);
        if (var6 == null) {
            return;
        }
        var6.method5785(arg1 - var6.field3870 / 2, arg2 - var6.field3872 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class322.method5584(arg1, arg2, 15, 16776960, 128);
            class322.method5584(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ax.az(Laq;IIFI)V")
    public void method402(class35 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = class243.method3377(arg0.method180());
        this.method403(var5, arg1, arg2);
        this.method398(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ax.ax(Lim;IIB)V")
    public void method403(class243 arg0, int arg1, int arg2) {
        class326 var4 = arg0.method4052(false);
        if (var4 != null) {
            int var5 = this.method462(var4, arg0.field3230);
            int var6 = this.method407(var4, arg0.field3227);
            var4.method5785(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ax.aj(Laq;Lim;IIFI)V")
    public void method398(class35 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method181();
        if (var6 != null && var6.field250.method172(arg4)) {
            class296 var7 = (class296) this.field264.get(var6.field250);
            var7.method4986(var6.field252, arg2 - var6.field247 / 2, arg3, var6.field247, var6.field249, 0xFF000000 | arg1.field3216, 0, 1, 0, var7.field3680 / 2);
        }
    }

    @ObfuscatedName("ax.au(IILjava/util/HashSet;IB)V")
    public void method437(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field262.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method521()) {
                int var8 = var7.field306.field2539 % 64;
                int var9 = var7.field306.field2537 % 64;
                var7.field302 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field304 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method180())) {
                    this.method402(var7, var7.field302, var7.field304, var5);
                }
            }
        }
    }

    @ObfuscatedName("ax.ay(Llt;Lih;B)I")
    public int method462(class326 arg0, class257 arg1) {
        switch(arg1.field3454) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3870 / 2;
            default:
                return -arg0.field3870;
        }
    }

    @ObfuscatedName("ax.aa(Llt;Lic;I)I")
    public int method407(class326 arg0, class240 arg1) {
        switch(arg1.field3194) {
            case 0:
                return -arg0.field3872 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3872;
        }
    }

    @ObfuscatedName("dl.aq(Lir;I)Z")
    public static boolean method2343(class255 arg0) {
        if (arg0.field3386 != null) {
            int[] var1 = arg0.field3386;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class255 var4 = class255.method3070(var3);
                if (var4.field3373 != -1) {
                    return true;
                }
            }
        } else if (arg0.field3373 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("ax.as(II)Laz;")
    public class29 method465(int arg0) {
        class243 var2 = class243.method3377(arg0);
        return this.method500(var2);
    }

    @ObfuscatedName("ax.ak(Lim;I)Laz;")
    public class29 method500(class243 arg0) {
        if (arg0.field3213 == null || this.field264 == null || this.field264.get(class18.field131) == null) {
            return null;
        }
        int var2 = arg0.field3217;
        class18[] var3 = new class18[] { class18.field138, class18.field131, class18.field130 };
        class18[] var4 = var3;
        int var5 = 0;
        class18 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class18 var6 = var4[var5];
            if (var6.field133 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class296 var9 = (class296) this.field264.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5022(arg0.field3213, 1000000);
        String[] var11 = new String[var10];
        var9.method5033(arg0.field3213, (int[]) null, var11);
        int var12 = var11.length * var9.field3680 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4977(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class29(arg0.field3213, var13, var12, var7);
    }

    @ObfuscatedName("ax.ac(IIIIIB)Ljava/util/List;")
    public List method410(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field265.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method521() && var8.method519(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field262.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method521() && var10.method519(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ax.aw(B)Ljava/util/List;")
    public List method411() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field262);
        var1.addAll(this.field265.values());
        return var1;
    }

    @ObfuscatedName("ax.ar(IIIIS)V")
    public void method412(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class322.method5598(this.field253 * arg0, this.field253 * (63 - arg1), this.field253, arg3);
        }
        if (var5 == 1) {
            class322.method5597(this.field253 * arg0, this.field253 * (63 - arg1), this.field253, arg3);
        }
        if (var5 == 2) {
            class322.method5598(this.field253 * arg0 + this.field253 - 1, this.field253 * (63 - arg1), this.field253, arg3);
        }
        if (var5 == 3) {
            class322.method5597(this.field253 * arg0, this.field253 * (63 - arg1) + this.field253 - 1, this.field253, arg3);
        }
    }
}
