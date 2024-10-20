package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jm")
public class class258 {

    @ObfuscatedName("jm.ac")
    public static class286 field2925 = new class286(37748736, 256);

    @ObfuscatedName("jm.ai")
    public int field2931;

    @ObfuscatedName("jm.az")
    public int field2918;

    @ObfuscatedName("jm.ap")
    public class252 field2926;

    @ObfuscatedName("jm.aa")
    public LinkedList field2921;

    @ObfuscatedName("jm.af")
    public int field2927;

    @ObfuscatedName("jm.ad")
    public int field2928;

    @ObfuscatedName("jm.aq")
    public List field2919;

    @ObfuscatedName("jm.al")
    public HashMap field2930;

    @ObfuscatedName("jm.an")
    public final HashMap field2924;

    @ObfuscatedName("fd.au(IIIB)Lui;")
    public static class529 method2917(int arg0, int arg1, int arg2) {
        class286 var3 = field2925;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class529) var3.method5146(var4);
    }

    @ObfuscatedName("ax.ae(I)V")
    public static void method285() {
        field2925.method5151(5);
    }

    public class258(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2931 = arg0;
        this.field2918 = arg1;
        this.field2921 = new LinkedList();
        this.field2919 = new LinkedList();
        this.field2930 = new HashMap();
        this.field2927 = arg2 | 0xFF000000;
        this.field2924 = arg3;
    }

    @ObfuscatedName("jm.ao(IIII)V")
    public void method4875(int arg0, int arg1, int arg2) {
        class529 var4 = method2917(this.field2931, this.field2918, this.field2928);
        if (var4 == null) {
            return;
        }
        if (this.field2928 * 64 == arg2) {
            var4.method8722(arg0, arg1);
        } else {
            var4.method8745(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jm.at(Ljx;Ljava/util/List;I)V")
    public void method4894(class252 arg0, List arg1) {
        this.field2930.clear();
        this.field2926 = arg0;
        this.method4883(arg1);
    }

    @ObfuscatedName("jm.ac(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4802(HashSet arg0, List arg1) {
        this.field2930.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class260 var4 = (class260) var3.next();
            if (var4.method5016() == this.field2931 && var4.method5026() == this.field2918) {
                this.field2921.add(var4);
            }
        }
        this.method4883(arg1);
    }

    @ObfuscatedName("jm.ai(IIIILke;I)V")
    public void method4803(int arg0, int arg1, int arg2, int arg3, class266 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label66: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field3005; var8++) {
                    class268[] var9 = arg4.field3012[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class268[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class206 var13;
                            boolean var18;
                            label57: {
                                class268 var12 = var10[var11];
                                var13 = class206.method3321(var12.field3023);
                                if (var13.field2212 != null) {
                                    int[] var14 = var13.field2212;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class206 var17 = class206.method3321(var16);
                                        if (var17.field2205 != -1) {
                                            var18 = true;
                                            break label57;
                                        }
                                    }
                                } else if (var13.field2205 != -1) {
                                    var18 = true;
                                    break label57;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4851(var13, var8, var6, var7, arg4);
                                continue label66;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jm.az(Lhv;IIILke;I)V")
    public void method4851(class206 arg0, int arg1, int arg2, int arg3, class266 arg4) {
        class323 var6 = new class323(arg1, this.field2931 * 64 + arg2, this.field2918 * 64 + arg3);
        Object var7 = null;
        class323 var8;
        if (this.field2926 == null) {
            class260 var9 = (class260) arg4;
            var8 = new class323(var9.field3004 + arg1, var9.field3009 * 64 + arg2 + var9.method4980() * 8, var9.field3007 * 64 + arg3 + var9.method4984() * 8);
        } else {
            var8 = new class323(this.field2926.field3004 + arg1, this.field2926.field3009 * 64 + arg2, this.field2926.field3007 * 64 + arg3);
        }
        class275 var10;
        if (arg0.field2212 == null) {
            class188 var11 = class188.method2945(arg0.field2205);
            var10 = new class263(var8, var6, var11.field1948, this.method4830(var11));
        } else {
            var10 = new class255(var8, var6, arg0.field2178, this);
        }
        class188 var12 = class188.method2945(var10.method4685());
        if (var12.field1950) {
            this.field2930.put(new class323(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jm.ap(I)V")
    public void method4805() {
        Iterator var1 = this.field2930.values().iterator();
        while (var1.hasNext()) {
            class275 var2 = (class275) var1.next();
            if (var2 instanceof class255) {
                ((class255) var2).method4704();
            }
        }
    }

    @ObfuscatedName("jm.aa(Ljava/util/List;B)V")
    public void method4883(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class263 var3 = (class263) var2.next();
            if (class188.method2945(var3.field2970).field1950 && var3.field3058.field3543 >> 6 == this.field2931 && var3.field3058.field3545 >> 6 == this.field2918) {
                class263 var4 = new class263(var3.field3058, var3.field3058, var3.field2970, this.method4912(var3.field2970));
                this.field2919.add(var4);
            }
        }
    }

    @ObfuscatedName("jm.af(I)V")
    public void method4807() {
        if (this.field2926 != null) {
            this.field2926.method5013();
            return;
        }
        Iterator var1 = this.field2921.iterator();
        while (var1.hasNext()) {
            class260 var2 = (class260) var1.next();
            var2.method5013();
        }
    }

    @ObfuscatedName("jm.ad(Lnu;B)Z")
    public boolean method4857(class359 arg0) {
        this.field2930.clear();
        if (this.field2926 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2921.iterator();
            while (var3.hasNext()) {
                class260 var4 = (class260) var3.next();
                var4.method5012(arg0);
                var2 &= var4.method5011();
            }
            if (var2) {
                Iterator var5 = this.field2921.iterator();
                while (var5.hasNext()) {
                    class260 var6 = (class260) var5.next();
                    this.method4803(var6.method4973() * 8, var6.method4969() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2926.method5012(arg0);
            if (this.field2926.method5011()) {
                this.method4803(0, 0, 64, 64, this.field2926);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jm.aq(ILku;[Luk;Lnu;Lnu;I)V")
    public void method4903(int arg0, class279 arg1, class528[] arg2, class359 arg3, class359 arg4) {
        this.field2928 = arg0;
        if (this.field2926 == null && this.field2921.isEmpty() || method2917(this.field2931, this.field2918, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4857(arg3);
        int var8;
        if (this.field2926 == null) {
            var8 = ((class266) this.field2921.getFirst()).field3011;
        } else {
            var8 = this.field2926.field3011;
        }
        boolean var9 = var7 & arg4.method6132(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6134(var8);
        class269 var11;
        if (var10 == null) {
            var11 = new class269();
        } else {
            var11 = new class269(class31.method4968(var10).field5216);
        }
        class529 var13 = new class529(this.field2928 * 64, this.field2928 * 64);
        var13.method8714();
        if (this.field2926 == null) {
            this.method4813(arg1, arg2, var11);
        } else {
            this.method4812(arg1, arg2, var11);
        }
        int var14 = this.field2931;
        int var15 = this.field2918;
        int var16 = this.field2928;
        class286 var17 = field2925;
        long var19 = (long) (var16 << 16 | var14 << 8 | var15);
        var17.method5150(var13, var19, var13.field5216.length * 4);
        this.method4807();
    }

    @ObfuscatedName("jm.al(IIILjava/util/HashSet;I)V")
    public void method4810(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4823(arg0, arg1, arg3, arg2);
        this.method4841(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jm.an(Ljava/util/HashSet;III)V")
    public void method4811(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2930.values().iterator();
        while (var4.hasNext()) {
            class275 var5 = (class275) var4.next();
            if (var5.method5074()) {
                int var6 = var5.method4685();
                if (arg0.contains(var6)) {
                    class188 var7 = class188.method2945(var6);
                    this.method4849(var7, var5.field3060, var5.field3061, arg1, arg2);
                }
            }
        }
        this.method4846(arg0, arg1, arg2);
    }

    @ObfuscatedName("jm.ar(Lku;[Luk;Lkd;B)V")
    public void method4812(class279 arg0, class528[] arg1, class269 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4815(var4, var5, this.field2926, arg0, arg2);
                this.method4816(var4, var5, this.field2926, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4920(var6, var7, this.field2926, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jm.ab(Lku;[Luk;Lkd;I)V")
    public void method4813(class279 arg0, class528[] arg1, class269 arg2) {
        Iterator var4 = this.field2921.iterator();
        while (var4.hasNext()) {
            class260 var5 = (class260) var4.next();
            for (int var6 = var5.method4973() * 8; var6 < var5.method4973() * 8 + 8; var6++) {
                for (int var7 = var5.method4969() * 8; var7 < var5.method4969() * 8 + 8; var7++) {
                    this.method4815(var6, var7, var5, arg0, arg2);
                    this.method4816(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2921.iterator();
        while (var8.hasNext()) {
            class260 var9 = (class260) var8.next();
            for (int var10 = var9.method4973() * 8; var10 < var9.method4973() * 8 + 8; var10++) {
                for (int var11 = var9.method4969() * 8; var11 < var9.method4969() * 8 + 8; var11++) {
                    this.method4920(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jm.ag(IILke;Lku;[Luk;B)V")
    public void method4920(int arg0, int arg1, class266 arg2, class279 arg3, class528[] arg4) {
        this.method4908(arg0, arg1, arg2);
        this.method4818(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jm.am(IILke;Lku;Lkd;I)V")
    public void method4815(int arg0, int arg1, class266 arg2, class279 arg3, class269 arg4) {
        int var6 = arg2.field3008[0][arg0][arg1] - 1;
        int var7 = arg2.field3006[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class525.method8612(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928, this.field2928, this.field2927);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2927;
            class208 var10 = (class208) class208.field2295.method5182((long) var7);
            class208 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2302.method6128(4, var7);
                class208 var13 = new class208();
                if (var12 != null) {
                    var13.method3722(new class515(var12), var7);
                }
                var13.method3721();
                class208.field2295.method5177(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2292 >= 0) {
                int var16 = class273.method3600(var11.field2297, var11.field2296, var11.field2298);
                int var17 = class273.method1167(var16, 96);
                var15 = class227.field2532[var17] | 0xFF000000;
            } else if (var11.field2288 >= 0) {
                int var18 = class273.method1167(class227.field2537.field2813.method4404(var11.field2288), 96);
                var15 = class227.field2532[var18] | 0xFF000000;
            } else if (var11.field2289 == 16711935) {
                var15 = var9;
            } else {
                int var19 = class273.method3600(var11.field2293, var11.field2294, var11.field2301);
                int var20 = class273.method1167(var19, 96);
                var15 = class227.field2532[var20] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field3015[0][arg0][arg1] == 0) {
            class525.method8612(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928, this.field2928, var8);
            return;
        }
        int var21 = this.method4817(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class525.method8612(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928, this.field2928, var21);
        } else {
            arg3.method5133(this.field2928 * arg0, this.field2928 * (63 - arg1), var21, var8, this.field2928, this.field2928, arg2.field3015[0][arg0][arg1], arg2.field3001[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jm.ax(IILke;Lku;I)V")
    public void method4816(int arg0, int arg1, class266 arg2, class279 arg3) {
        for (int var5 = 1; var5 < arg2.field3005; var5++) {
            int var6 = arg2.field3006[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2927;
                class208 var8 = (class208) class208.field2295.method5182((long) var6);
                class208 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2302.method6128(4, var6);
                    class208 var11 = new class208();
                    if (var10 != null) {
                        var11.method3722(new class515(var10), var6);
                    }
                    var11.method3721();
                    class208.field2295.method5177(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2292 >= 0) {
                    int var14 = class273.method3600(var9.field2297, var9.field2296, var9.field2298);
                    int var15 = class273.method1167(var14, 96);
                    var13 = class227.field2532[var15] | 0xFF000000;
                } else if (var9.field2288 >= 0) {
                    int var16 = class273.method1167(class227.field2537.field2813.method4404(var9.field2288), 96);
                    var13 = class227.field2532[var16] | 0xFF000000;
                } else if (var9.field2289 == 16711935) {
                    var13 = var7;
                } else {
                    int var17 = class273.method3600(var9.field2293, var9.field2294, var9.field2301);
                    int var18 = class273.method1167(var17, 96);
                    var13 = class227.field2532[var18] | 0xFF000000;
                }
                if (arg2.field3015[var5][arg0][arg1] == 0) {
                    class525.method8612(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928, this.field2928, var13);
                } else {
                    arg3.method5133(this.field2928 * arg0, this.field2928 * (63 - arg1), 0, var13, this.field2928, this.field2928, arg2.field3015[var5][arg0][arg1], arg2.field3001[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jm.ah(IILke;Lkd;I)I")
    public int method4817(int arg0, int arg1, class266 arg2, class269 arg3) {
        return arg2.field3008[0][arg0][arg1] == 0 ? this.field2927 : arg3.method5044(arg0, arg1);
    }

    @ObfuscatedName("jm.as(IILke;[Luk;I)V")
    public void method4818(int arg0, int arg1, class266 arg2, class528[] arg3) {
        for (int var5 = 0; var5 < arg2.field3005; var5++) {
            class268[] var6 = arg2.field3012[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class268[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class268 var9 = var7[var8];
                    if (!class341.method5050(var9.field3022)) {
                        int var10 = var9.field3022;
                        boolean var11 = class341.field3846.field3832 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class206 var12 = class206.method3321(var9.field3023);
                    if (var12.field2204 != -1) {
                        if (var12.field2204 == 46 || var12.field2204 == 52) {
                            arg3[var12.field2204].method8702(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928 * 2 + 1, this.field2928 * 2 + 1);
                        } else {
                            arg3[var12.field2204].method8702(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928 * 2, this.field2928 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jm.ay(IILke;I)V")
    public void method4908(int arg0, int arg1, class266 arg2) {
        for (int var4 = 0; var4 < arg2.field3005; var4++) {
            class268[] var5 = arg2.field3012[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class268[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class268 var8 = var6[var7];
                    if (class341.method2527(var8.field3022)) {
                        class206 var9 = class206.method3321(var8.field3023);
                        int var10 = var9.field2195 == 0 ? -3355444 : -3407872;
                        if (class341.field3829.field3832 == var8.field3022) {
                            this.method4833(arg0, arg1, var8.field3024, var10);
                        }
                        if (class341.field3826.field3832 == var8.field3022) {
                            this.method4833(arg0, arg1, var8.field3024, -3355444);
                            this.method4833(arg0, arg1, var8.field3024 + 1, var10);
                        }
                        if (class341.field3827.field3832 == var8.field3022) {
                            if (var8.field3024 == 0) {
                                class525.method8645(this.field2928 * arg0, this.field2928 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3024 == 1) {
                                class525.method8645(this.field2928 * arg0 + this.field2928 - 1, this.field2928 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3024 == 2) {
                                class525.method8645(this.field2928 * arg0 + this.field2928 - 1, this.field2928 * (63 - arg1) + this.field2928 - 1, 1, var10);
                            }
                            if (var8.field3024 == 3) {
                                class525.method8645(this.field2928 * arg0, this.field2928 * (63 - arg1) + this.field2928 - 1, 1, var10);
                            }
                        }
                        if (class341.field3845.field3832 == var8.field3022) {
                            int var11 = var8.field3024 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2928; var12++) {
                                    class525.method8645(this.field2928 * arg0 + var12, this.field2928 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2928; var13++) {
                                    class525.method8645(this.field2928 * arg0 + var13, this.field2928 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jm.aj(IILjava/util/HashSet;IB)V")
    public void method4823(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2930.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class323 var9 = (class323) var8.getKey();
            int var10 = (int) ((float) var9.field3543 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3545 * var5 - var6);
            class275 var12 = (class275) var8.getValue();
            if (var12 != null && var12.method5074()) {
                var12.field3060 = var10;
                var12.field3061 = var11;
                class188 var13 = class188.method2945(var12.method4685());
                if (!arg2.contains(var13.method3302())) {
                    this.method4804(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jm.av(Ljava/util/HashSet;III)V")
    public void method4846(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2919.iterator();
        while (var4.hasNext()) {
            class275 var5 = (class275) var4.next();
            if (var5.method5074()) {
                class188 var6 = class188.method2945(var5.method4685());
                if (var6 != null && arg0.contains(var6.method3302())) {
                    this.method4849(var6, var5.field3060, var5.field3061, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jm.aw(Lhd;IIIII)V")
    public void method4849(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        class529 var6 = arg0.method3300(false);
        if (var6 == null) {
            return;
        }
        var6.method8774(arg1 - var6.field5218 / 2, arg2 - var6.field5209 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class525.method8610(arg1, arg2, 15, 16776960, 128);
            class525.method8610(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jm.ak(Lkp;IIFB)V")
    public void method4804(class275 arg0, int arg1, int arg2, float arg3) {
        class188 var5 = class188.method2945(arg0.method4685());
        this.method4824(var5, arg1, arg2);
        this.method4825(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jm.bh(Lhd;III)V")
    public void method4824(class188 arg0, int arg1, int arg2) {
        class529 var4 = arg0.method3300(false);
        if (var4 != null) {
            int var5 = this.method4809(var4, arg0.field1966);
            int var6 = this.method4828(var4, arg0.field1960);
            var4.method8774(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jm.bj(Lkp;Lhd;IIFI)V")
    public void method4825(class275 arg0, class188 arg1, int arg2, int arg3, float arg4) {
        class270 var6 = arg0.method4686();
        if (var6 != null && var6.field3034.method4679(arg4)) {
            class394 var7 = (class394) this.field2924.get(var6.field3034);
            var7.method6837(var6.field3031, arg2 - var6.field3035 / 2, arg3, var6.field3035, var6.field3033, 0xFF000000 | arg1.field1954, 0, 1, 0, var7.field4484 / 2);
        }
    }

    @ObfuscatedName("jm.bk(IILjava/util/HashSet;IB)V")
    public void method4841(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2919.iterator();
        while (var6.hasNext()) {
            class275 var7 = (class275) var6.next();
            if (var7.method5074()) {
                int var8 = var7.field3058.field3543 % 64;
                int var9 = var7.field3058.field3545 % 64;
                var7.field3060 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3061 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4685())) {
                    this.method4804(var7, var7.field3060, var7.field3061, var5);
                }
            }
        }
    }

    @ObfuscatedName("jm.bv(Lui;Lhe;I)I")
    public int method4809(class529 arg0, class194 arg1) {
        switch(arg1.field2020) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5218 / 2;
            default:
                return -arg0.field5218;
        }
    }

    @ObfuscatedName("jm.bt(Lui;Lhy;I)I")
    public int method4828(class529 arg0, class197 arg1) {
        switch(arg1.field2079) {
            case 0:
                return -arg0.field5209 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field5209;
        }
    }

    @ObfuscatedName("jm.bd(IB)Lkq;")
    public class270 method4912(int arg0) {
        class188 var2 = class188.method2945(arg0);
        return this.method4830(var2);
    }

    @ObfuscatedName("jm.by(Lhd;I)Lkq;")
    public class270 method4830(class188 arg0) {
        if (arg0.field1947 == null || this.field2924 == null || this.field2924.get(class254.field2884) == null) {
            return null;
        }
        int var2 = arg0.field1949;
        class254[] var3 = new class254[] { class254.field2884, class254.field2879, class254.field2877 };
        class254[] var4 = var3;
        int var5 = 0;
        class254 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class254 var6 = var4[var5];
            if (var6.field2881 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class394 var9 = (class394) this.field2924.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method6841(arg0.field1947, 1000000);
        String[] var11 = new String[var10];
        var9.method6839(arg0.field1947, (int[]) null, var11);
        int var12 = var11.length * var9.field4484 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method6838(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class270(arg0.field1947, var13, var12, var7);
    }

    @ObfuscatedName("jm.bs(IIIIIB)Ljava/util/List;")
    public List method4831(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2930.values().iterator();
            while (var7.hasNext()) {
                class275 var8 = (class275) var7.next();
                if (var8.method5074() && var8.method5073(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2919.iterator();
            while (var9.hasNext()) {
                class275 var10 = (class275) var9.next();
                if (var10.method5074() && var10.method5073(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jm.bm(B)Ljava/util/List;")
    public List method4832() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2919);
        var1.addAll(this.field2930.values());
        return var1;
    }

    @ObfuscatedName("jm.bf(IIIIB)V")
    public void method4833(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class525.method8620(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928, arg3);
        }
        if (var5 == 1) {
            class525.method8645(this.field2928 * arg0, this.field2928 * (63 - arg1), this.field2928, arg3);
        }
        if (var5 == 2) {
            class525.method8620(this.field2928 * arg0 + this.field2928 - 1, this.field2928 * (63 - arg1), this.field2928, arg3);
        }
        if (var5 == 3) {
            class525.method8645(this.field2928 * arg0, this.field2928 * (63 - arg1) + this.field2928 - 1, this.field2928, arg3);
        }
    }
}
