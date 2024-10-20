package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ja")
public class class246 {

    @ObfuscatedName("ja.an")
    public static class274 field2856 = new class274(37748736, 256);

    @ObfuscatedName("ja.ao")
    public int field2857;

    @ObfuscatedName("ja.av")
    public int field2858;

    @ObfuscatedName("ja.aq")
    public class240 field2854;

    @ObfuscatedName("ja.ap")
    public LinkedList field2860;

    @ObfuscatedName("ja.ar")
    public int field2864;

    @ObfuscatedName("ja.ak")
    public int field2867;

    @ObfuscatedName("ja.ax")
    public List field2863;

    @ObfuscatedName("ja.as")
    public HashMap field2859;

    @ObfuscatedName("ja.ay")
    public final HashMap field2862;

    @ObfuscatedName("eq.aj(IIII)J")
    public static long method2757(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("jw.al(Lsn;IIII)V")
    public static void method4540(class492 arg0, int arg1, int arg2, int arg3) {
        field2856.method4894(arg0, method2757(arg1, arg2, arg3), arg0.field4997.length * 4);
    }

    @ObfuscatedName("qr.ac(I)V")
    public static void method7326() {
        field2856.method4903();
    }

    @ObfuscatedName("gu.ab(I)V")
    public static void method3086() {
        field2856.method4895(5);
    }

    public class246(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2857 = arg0;
        this.field2858 = arg1;
        this.field2860 = new LinkedList();
        this.field2863 = new LinkedList();
        this.field2859 = new HashMap();
        this.field2864 = arg2 | 0xFF000000;
        this.field2862 = arg3;
    }

    @ObfuscatedName("ja.an(IIII)V")
    public void method4544(int arg0, int arg1, int arg2) {
        int var4 = this.field2857;
        int var5 = this.field2858;
        int var6 = this.field2867;
        class492 var7 = (class492) field2856.method4891(method2757(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field2867 * 64 == arg2) {
            var7.method8323(arg0, arg1);
        } else {
            var7.method8346(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ja.ao(Ljo;Ljava/util/List;I)V")
    public void method4545(class240 arg0, List arg1) {
        this.field2859.clear();
        this.field2854 = arg0;
        this.method4570(arg1);
    }

    @ObfuscatedName("ja.av(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4546(HashSet arg0, List arg1) {
        this.field2859.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class248 var4 = (class248) var3.next();
            if (var4.method4764() == this.field2857 && var4.method4762() == this.field2858) {
                this.field2860.add(var4);
            }
        }
        this.method4570(arg1);
    }

    @ObfuscatedName("ja.aq(IIIILjs;I)V")
    public void method4547(int arg0, int arg1, int arg2, int arg3, class254 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2945; var8++) {
                    class256[] var9 = arg4.field2952[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class256[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class256 var12 = var10[var11];
                            class203 var13 = Statics.method4396(var12.field2965);
                            if (method3804(var13)) {
                                this.method4548(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ja.ap(Lhu;IIILjs;I)V")
    public void method4548(class203 arg0, int arg1, int arg2, int arg3, class254 arg4) {
        class304 var6 = new class304(arg1, this.field2857 * 64 + arg2, this.field2858 * 64 + arg3);
        Object var7 = null;
        class304 var8;
        if (this.field2854 == null) {
            class248 var9 = (class248) arg4;
            var8 = new class304(var9.field2957 + arg1, var9.field2944 * 64 + arg2 + var9.method4711() * 8, var9.field2941 * 64 + arg3 + var9.method4712() * 8);
        } else {
            var8 = new class304(this.field2854.field2957 + arg1, this.field2854.field2944 * 64 + arg2, this.field2854.field2941 * 64 + arg3);
        }
        class263 var10;
        if (arg0.field2129 == null) {
            class185 var11 = class185.method2778(arg0.field2153);
            var10 = new class251(var8, var6, var11.field1903, this.method4574(var11));
        } else {
            var10 = new class243(var8, var6, arg0.field2168, this);
        }
        class185 var12 = class185.method2778(var10.method4426());
        if (var12.field1910) {
            this.field2859.put(new class304(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("ja.ar(I)V")
    public void method4591() {
        Iterator var1 = this.field2859.values().iterator();
        while (var1.hasNext()) {
            class263 var2 = (class263) var1.next();
            if (var2 instanceof class243) {
                ((class243) var2).method4435();
            }
        }
    }

    @ObfuscatedName("ja.ak(Ljava/util/List;I)V")
    public void method4570(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class251 var3 = (class251) var2.next();
            if (class185.method2778(var3.field2912).field1910 && var3.field3013.field3429 >> 6 == this.field2857 && var3.field3013.field3431 >> 6 == this.field2858) {
                class251 var4 = new class251(var3.field3013, var3.field3013, var3.field2912, this.method4609(var3.field2912));
                this.field2863.add(var4);
            }
        }
    }

    @ObfuscatedName("ja.ax(I)V")
    public void method4551() {
        if (this.field2854 != null) {
            this.field2854.method4758();
            return;
        }
        Iterator var1 = this.field2860.iterator();
        while (var1.hasNext()) {
            class248 var2 = (class248) var1.next();
            var2.method4758();
        }
    }

    @ObfuscatedName("ja.as(Lne;I)Z")
    public boolean method4552(class340 arg0) {
        this.field2859.clear();
        if (this.field2854 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2860.iterator();
            while (var3.hasNext()) {
                class248 var4 = (class248) var3.next();
                var4.method4757(arg0);
                var2 &= var4.method4756();
            }
            if (var2) {
                Iterator var5 = this.field2860.iterator();
                while (var5.hasNext()) {
                    class248 var6 = (class248) var5.next();
                    this.method4547(var6.method4713() * 8, var6.method4721() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2854.method4757(arg0);
            if (this.field2854.method4756()) {
                this.method4547(0, 0, 64, 64, this.field2854);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ja.ay(ILkn;[Lsp;Lne;Lne;I)V")
    public void method4553(int arg0, class267 arg1, class491[] arg2, class340 arg3, class340 arg4) {
        this.field2867 = arg0;
        if (this.field2854 == null && this.field2860.isEmpty()) {
            return;
        }
        int var6 = this.field2857;
        int var7 = this.field2858;
        class492 var8 = (class492) field2856.method4891(method2757(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method4552(arg3);
        int var11;
        if (this.field2854 == null) {
            var11 = ((class254) this.field2860.getFirst()).field2949;
        } else {
            var11 = this.field2854.field2949;
        }
        boolean var12 = var10 & arg4.method5864(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method5865(var11);
        class257 var14 = class257.method4418(var13);
        class492 var15 = new class492(this.field2867 * 64, this.field2867 * 64);
        var15.method8316();
        if (this.field2854 == null) {
            this.method4557(arg1, arg2, var14);
        } else {
            this.method4556(arg1, arg2, var14);
        }
        method4540(var15, this.field2857, this.field2858, this.field2867);
        this.method4551();
    }

    @ObfuscatedName("ja.am(IIILjava/util/HashSet;I)V")
    public void method4554(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4646(arg0, arg1, arg3, arg2);
        this.method4575(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ja.az(Ljava/util/HashSet;IIB)V")
    public void method4555(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2859.values().iterator();
        while (var4.hasNext()) {
            class263 var5 = (class263) var4.next();
            if (var5.method4804()) {
                int var6 = var5.method4426();
                if (arg0.contains(var6)) {
                    class185 var7 = class185.method2778(var6);
                    this.method4566(var7, var5.field3009, var5.field3010, arg1, arg2);
                }
            }
        }
        this.method4565(arg0, arg1, arg2);
    }

    @ObfuscatedName("ja.ae(Lkn;[Lsp;Ljn;I)V")
    public void method4556(class267 arg0, class491[] arg1, class257 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4559(var4, var5, this.field2854, arg0, arg2);
                this.method4560(var4, var5, this.field2854, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4608(var6, var7, this.field2854, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ja.au(Lkn;[Lsp;Ljn;B)V")
    public void method4557(class267 arg0, class491[] arg1, class257 arg2) {
        Iterator var4 = this.field2860.iterator();
        while (var4.hasNext()) {
            class248 var5 = (class248) var4.next();
            for (int var6 = var5.method4713() * 8; var6 < var5.method4713() * 8 + 8; var6++) {
                for (int var7 = var5.method4721() * 8; var7 < var5.method4721() * 8 + 8; var7++) {
                    this.method4559(var6, var7, var5, arg0, arg2);
                    this.method4560(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2860.iterator();
        while (var8.hasNext()) {
            class248 var9 = (class248) var8.next();
            for (int var10 = var9.method4713() * 8; var10 < var9.method4713() * 8 + 8; var10++) {
                for (int var11 = var9.method4721() * 8; var11 < var9.method4721() * 8 + 8; var11++) {
                    this.method4608(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ja.ag(IILjs;Lkn;[Lsp;B)V")
    public void method4608(int arg0, int arg1, class254 arg2, class267 arg3, class491[] arg4) {
        this.method4563(arg0, arg1, arg2);
        this.method4562(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ja.at(IILjs;Lkn;Ljn;I)V")
    public void method4559(int arg0, int arg1, class254 arg2, class267 arg3, class257 arg4) {
        int var6 = arg2.field2948[0][arg0][arg1] - 1;
        int var7 = arg2.field2940[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class488.method8241(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867, this.field2867, this.field2864);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2864;
            class205 var10 = class205.method154(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field2247 >= 0) {
                int var12 = Statics.method3054(var10.field2245, var10.field2249, var10.field2240);
                int var13 = class261.method4422(var12, 96);
                var11 = class220.field2488[var13] | 0xFF000000;
            } else if (var10.field2239 >= 0) {
                int var14 = class261.method4422(Statics.field2489.method4213(var10.field2239), 96);
                var11 = class220.field2488[var14] | 0xFF000000;
            } else if (var10.field2243 == 16711935) {
                var11 = var9;
            } else {
                int var15 = Statics.method3054(var10.field2242, var10.field2238, var10.field2244);
                int var16 = class261.method4422(var15, 96);
                var11 = class220.field2488[var16] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field2950[0][arg0][arg1] == 0) {
            class488.method8241(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867, this.field2867, var8);
            return;
        }
        int var17 = this.method4673(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class488.method8241(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867, this.field2867, var17);
        } else {
            arg3.method4875(this.field2867 * arg0, this.field2867 * (63 - arg1), var17, var8, this.field2867, this.field2867, arg2.field2950[0][arg0][arg1], arg2.field2953[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ja.af(IILjs;Lkn;I)V")
    public void method4560(int arg0, int arg1, class254 arg2, class267 arg3) {
        for (int var5 = 1; var5 < arg2.field2945; var5++) {
            int var6 = arg2.field2940[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2864;
                class205 var8 = class205.method154(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field2247 >= 0) {
                    int var10 = Statics.method3054(var8.field2245, var8.field2249, var8.field2240);
                    int var11 = class261.method4422(var10, 96);
                    var9 = class220.field2488[var11] | 0xFF000000;
                } else if (var8.field2239 >= 0) {
                    int var12 = class261.method4422(Statics.field2489.method4213(var8.field2239), 96);
                    var9 = class220.field2488[var12] | 0xFF000000;
                } else if (var8.field2243 == 16711935) {
                    var9 = var7;
                } else {
                    int var13 = Statics.method3054(var8.field2242, var8.field2238, var8.field2244);
                    int var14 = class261.method4422(var13, 96);
                    var9 = class220.field2488[var14] | 0xFF000000;
                }
                if (arg2.field2950[var5][arg0][arg1] == 0) {
                    class488.method8241(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867, this.field2867, var9);
                } else {
                    arg3.method4875(this.field2867 * arg0, this.field2867 * (63 - arg1), 0, var9, this.field2867, this.field2867, arg2.field2950[var5][arg0][arg1], arg2.field2953[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ja.ai(IILjs;Ljn;S)I")
    public int method4673(int arg0, int arg1, class254 arg2, class257 arg3) {
        return arg2.field2948[0][arg0][arg1] == 0 ? this.field2864 : arg3.method4782(arg0, arg1);
    }

    @ObfuscatedName("ja.aw(IILjs;[Lsp;B)V")
    public void method4562(int arg0, int arg1, class254 arg2, class491[] arg3) {
        for (int var5 = 0; var5 < arg2.field2945; var5++) {
            class256[] var6 = arg2.field2952[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class256[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class256 var9 = var7[var8];
                    if (!class322.method4790(var9.field2968)) {
                        int var10 = var9.field2968;
                        boolean var11 = class322.field3732.field3731 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class203 var12 = Statics.method4396(var9.field2965);
                    if (var12.field2154 != -1) {
                        if (var12.field2154 == 46 || var12.field2154 == 52) {
                            arg3[var12.field2154].method8299(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867 * 2 + 1, this.field2867 * 2 + 1);
                        } else {
                            arg3[var12.field2154].method8299(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867 * 2, this.field2867 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ja.aa(IILjs;I)V")
    public void method4563(int arg0, int arg1, class254 arg2) {
        for (int var4 = 0; var4 < arg2.field2945; var4++) {
            class256[] var5 = arg2.field2952[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class256[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class256 var8 = var6[var7];
                    if (class322.method8485(var8.field2968)) {
                        class203 var9 = Statics.method4396(var8.field2965);
                        int var10 = var9.field2144 == 0 ? -3355444 : -3407872;
                        if (class322.field3722.field3731 == var8.field2968) {
                            this.method4623(arg0, arg1, var8.field2967, var10);
                        }
                        if (class322.field3712.field3731 == var8.field2968) {
                            this.method4623(arg0, arg1, var8.field2967, -3355444);
                            this.method4623(arg0, arg1, var8.field2967 + 1, var10);
                        }
                        if (class322.field3730.field3731 == var8.field2968) {
                            if (var8.field2967 == 0) {
                                class488.method8264(this.field2867 * arg0, this.field2867 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2967 == 1) {
                                class488.method8264(this.field2867 * arg0 + this.field2867 - 1, this.field2867 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2967 == 2) {
                                class488.method8264(this.field2867 * arg0 + this.field2867 - 1, this.field2867 * (63 - arg1) + this.field2867 - 1, 1, var10);
                            }
                            if (var8.field2967 == 3) {
                                class488.method8264(this.field2867 * arg0, this.field2867 * (63 - arg1) + this.field2867 - 1, 1, var10);
                            }
                        }
                        if (class322.field3714.field3731 == var8.field2968) {
                            int var11 = var8.field2967 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2867; var12++) {
                                    class488.method8264(this.field2867 * arg0 + var12, this.field2867 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2867; var13++) {
                                    class488.method8264(this.field2867 * arg0 + var13, this.field2867 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ja.ah(IILjava/util/HashSet;II)V")
    public void method4646(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2859.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class304 var9 = (class304) var8.getKey();
            int var10 = (int) ((float) var9.field3429 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3431 * var5 - var6);
            class263 var12 = (class263) var8.getValue();
            if (var12 != null && var12.method4804()) {
                var12.field3009 = var10;
                var12.field3010 = var11;
                class185 var13 = class185.method2778(var12.method4426());
                if (!arg2.contains(var13.method3253())) {
                    this.method4568(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ja.ad(Ljava/util/HashSet;III)V")
    public void method4565(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2863.iterator();
        while (var4.hasNext()) {
            class263 var5 = (class263) var4.next();
            if (var5.method4804()) {
                class185 var6 = class185.method2778(var5.method4426());
                if (var6 != null && arg0.contains(var6.method3253())) {
                    this.method4566(var6, var5.field3009, var5.field3010, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ja.bm(Lhd;IIIII)V")
    public void method4566(class185 arg0, int arg1, int arg2, int arg3, int arg4) {
        class492 var6 = arg0.method3251(false);
        if (var6 == null) {
            return;
        }
        var6.method8403(arg1 - var6.field5006 / 2, arg2 - var6.field4996 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class488.method8238(arg1, arg2, 15, 16776960, 128);
            class488.method8238(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ja.bv(Lku;IIFI)V")
    public void method4568(class263 arg0, int arg1, int arg2, float arg3) {
        class185 var5 = class185.method2778(arg0.method4426());
        this.method4599(var5, arg1, arg2);
        this.method4569(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ja.bo(Lhd;III)V")
    public void method4599(class185 arg0, int arg1, int arg2) {
        class492 var4 = arg0.method3251(false);
        if (var4 != null) {
            int var5 = this.method4662(var4, arg0.field1912);
            int var6 = this.method4597(var4, arg0.field1911);
            var4.method8403(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ja.bs(Lku;Lhd;IIFB)V")
    public void method4569(class263 arg0, class185 arg1, int arg2, int arg3, float arg4) {
        class258 var6 = arg0.method4427();
        if (var6 != null && var6.field2975.method4416(arg4)) {
            class375 var7 = (class375) this.field2862.get(var6.field2975);
            var7.method6575(var6.field2973, arg2 - var6.field2974 / 2, arg3, var6.field2974, var6.field2978, 0xFF000000 | arg1.field1900, 0, 1, 0, var7.field4389 / 2);
        }
    }

    @ObfuscatedName("ja.bg(IILjava/util/HashSet;II)V")
    public void method4575(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2863.iterator();
        while (var6.hasNext()) {
            class263 var7 = (class263) var6.next();
            if (var7.method4804()) {
                int var8 = var7.field3013.field3429 % 64;
                int var9 = var7.field3013.field3431 % 64;
                var7.field3009 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3010 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4426())) {
                    this.method4568(var7, var7.field3009, var7.field3010, var5);
                }
            }
        }
    }

    @ObfuscatedName("ja.bh(Lsn;Lho;B)I")
    public int method4662(class492 arg0, class191 arg1) {
        switch(arg1.field1981) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5006 / 2;
            default:
                return -arg0.field5006;
        }
    }

    @ObfuscatedName("ja.bl(Lsn;Lhe;B)I")
    public int method4597(class492 arg0, class194 arg1) {
        switch(arg1.field2040) {
            case 1:
                return 0;
            case 2:
                return -arg0.field4996 / 2;
            default:
                return -arg0.field4996;
        }
    }

    @ObfuscatedName("im.bk(Lhu;I)Z")
    public static boolean method3804(class203 arg0) {
        if (arg0.field2129 != null) {
            int[] var1 = arg0.field2129;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class203 var4 = Statics.method4396(var3);
                if (var4.field2153 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2153 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("ja.br(II)Ljb;")
    public class258 method4609(int arg0) {
        class185 var2 = class185.method2778(arg0);
        return this.method4574(var2);
    }

    @ObfuscatedName("ja.ba(Lhd;B)Ljb;")
    public class258 method4574(class185 arg0) {
        if (arg0.field1906 == null || this.field2862 == null || this.field2862.get(class242.field2820) == null) {
            return null;
        }
        int var2 = arg0.field1908;
        class242[] var3 = class242.method4417();
        int var4 = 0;
        class242 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class242 var5 = var3[var4];
            if (var5.field2818 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class375 var8 = (class375) this.field2862.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method6622(arg0.field1906, 1000000);
        String[] var10 = new String[var9];
        var8.method6624(arg0.field1906, (int[]) null, var10);
        int var11 = var10.length * var8.field4389 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method6551(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class258(arg0.field1906, var12, var11, var6);
    }

    @ObfuscatedName("ja.bz(IIIIII)Ljava/util/List;")
    public List method4593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2859.values().iterator();
            while (var7.hasNext()) {
                class263 var8 = (class263) var7.next();
                if (var8.method4804() && var8.method4808(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2863.iterator();
            while (var9.hasNext()) {
                class263 var10 = (class263) var9.next();
                if (var10.method4804() && var10.method4808(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ja.bq(I)Ljava/util/List;")
    public List method4576() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2863);
        var1.addAll(this.field2859.values());
        return var1;
    }

    @ObfuscatedName("ja.bc(IIIII)V")
    public void method4623(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class488.method8248(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867, arg3);
        }
        if (var5 == 1) {
            class488.method8264(this.field2867 * arg0, this.field2867 * (63 - arg1), this.field2867, arg3);
        }
        if (var5 == 2) {
            class488.method8248(this.field2867 * arg0 + this.field2867 - 1, this.field2867 * (63 - arg1), this.field2867, arg3);
        }
        if (var5 == 3) {
            class488.method8264(this.field2867 * arg0, this.field2867 * (63 - arg1) + this.field2867 - 1, this.field2867, arg3);
        }
    }
}
