package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("id")
public class class243 {

    @ObfuscatedName("id.z")
    public static class271 field2866 = new class271(37748736, 256);

    @ObfuscatedName("id.j")
    public int field2861;

    @ObfuscatedName("id.i")
    public int field2867;

    @ObfuscatedName("id.n")
    public class237 field2868;

    @ObfuscatedName("id.l")
    public LinkedList field2864;

    @ObfuscatedName("id.k")
    public int field2870;

    @ObfuscatedName("id.c")
    public int field2869;

    @ObfuscatedName("id.r")
    public List field2872;

    @ObfuscatedName("id.b")
    public HashMap field2865;

    @ObfuscatedName("id.m")
    public final HashMap field2873;

    @ObfuscatedName("gy.f(IIII)J")
    public static long method3539(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("by.w(IIII)Lrs;")
    public static class488 method1998(int arg0, int arg1, int arg2) {
        return (class488) field2866.method4996(method3539(arg0, arg1, arg2));
    }

    @ObfuscatedName("n.v(Lrs;IIIB)V")
    public static void method60(class488 arg0, int arg1, int arg2, int arg3) {
        field2866.method5017(arg0, method3539(arg1, arg2, arg3), arg0.field5041.length * 4);
    }

    @ObfuscatedName("ht.s(I)V")
    public static void method4492() {
        field2866.method5000();
    }

    @ObfuscatedName("bw.z(I)V")
    public static void method1740() {
        field2866.method4997(5);
    }

    public class243(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2861 = arg0;
        this.field2867 = arg1;
        this.field2864 = new LinkedList();
        this.field2872 = new LinkedList();
        this.field2865 = new HashMap();
        this.field2870 = arg2 | 0xFF000000;
        this.field2873 = arg3;
    }

    @ObfuscatedName("id.j(IIII)V")
    public void method4776(int arg0, int arg1, int arg2) {
        class488 var4 = method1998(this.field2861, this.field2867, this.field2869);
        if (var4 == null) {
            return;
        }
        if (this.field2869 * 64 == arg2) {
            var4.method8444(arg0, arg1);
        } else {
            var4.method8400(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("id.i(Lih;Ljava/util/List;I)V")
    public void method4648(class237 arg0, List arg1) {
        this.field2865.clear();
        this.field2868 = arg0;
        this.method4695(arg1);
    }

    @ObfuscatedName("id.n(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4649(HashSet arg0, List arg1) {
        this.field2865.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class245 var4 = (class245) var3.next();
            if (var4.method4878() == this.field2861 && var4.method4887() == this.field2867) {
                this.field2864.add(var4);
            }
        }
        this.method4695(arg1);
    }

    @ObfuscatedName("id.l(IIIILia;B)V")
    public void method4743(int arg0, int arg1, int arg2, int arg3, class251 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2949; var8++) {
                    class253[] var9 = arg4.field2956[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class253[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class253 var12 = var10[var11];
                            class200 var13 = class200.method7839(var12.field2968);
                            if (method106(var13)) {
                                this.method4651(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("id.k(Lgp;IIILia;I)V")
    public void method4651(class200 arg0, int arg1, int arg2, int arg3, class251 arg4) {
        class301 var6 = new class301(arg1, this.field2861 * 64 + arg2, this.field2867 * 64 + arg3);
        Object var7 = null;
        class301 var8;
        if (this.field2868 == null) {
            class245 var9 = (class245) arg4;
            var8 = new class301(var9.field2948 + arg1, var9.field2955 * 64 + arg2 + var9.method4835() * 8, var9.field2945 * 64 + arg3 + var9.method4841() * 8);
        } else {
            var8 = new class301(this.field2868.field2948 + arg1, this.field2868.field2955 * 64 + arg2, this.field2868.field2945 * 64 + arg3);
        }
        class260 var10;
        if (arg0.field2180 == null) {
            class183 var11 = class183.method18(arg0.field2170);
            var10 = new class248(var8, var6, var11.field1937, this.method4677(var11));
        } else {
            var10 = new class240(var8, var6, arg0.field2195, this);
        }
        class183 var12 = class183.method18(var10.method4535());
        if (var12.field1943) {
            this.field2865.put(new class301(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("id.c(I)V")
    public void method4652() {
        Iterator var1 = this.field2865.values().iterator();
        while (var1.hasNext()) {
            class260 var2 = (class260) var1.next();
            if (var2 instanceof class240) {
                ((class240) var2).method4529();
            }
        }
    }

    @ObfuscatedName("id.r(Ljava/util/List;I)V")
    public void method4695(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class248 var3 = (class248) var2.next();
            if (class183.method18(var3.field2916).field1943 && var3.field3009.field3463 >> 6 == this.field2861 && var3.field3009.field3462 >> 6 == this.field2867) {
                class248 var4 = new class248(var3.field3009, var3.field3009, var3.field2916, this.method4762(var3.field2916));
                this.field2872.add(var4);
            }
        }
    }

    @ObfuscatedName("id.b(B)V")
    public void method4654() {
        if (this.field2868 != null) {
            this.field2868.method4875();
            return;
        }
        Iterator var1 = this.field2864.iterator();
        while (var1.hasNext()) {
            class245 var2 = (class245) var1.next();
            var2.method4875();
        }
    }

    @ObfuscatedName("id.m(Lln;I)Z")
    public boolean method4745(class337 arg0) {
        this.field2865.clear();
        if (this.field2868 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2864.iterator();
            while (var3.hasNext()) {
                class245 var4 = (class245) var3.next();
                var4.method4885(arg0);
                var2 &= var4.method4873();
            }
            if (var2) {
                Iterator var5 = this.field2864.iterator();
                while (var5.hasNext()) {
                    class245 var6 = (class245) var5.next();
                    this.method4743(var6.method4837() * 8, var6.method4838() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2868.method4885(arg0);
            if (this.field2868.method4873()) {
                this.method4743(0, 0, 64, 64, this.field2868);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("id.t(ILjl;[Lrg;Lln;Lln;B)V")
    public void method4756(int arg0, class264 arg1, class487[] arg2, class337 arg3, class337 arg4) {
        this.field2869 = arg0;
        if (this.field2868 == null && this.field2864.isEmpty() || method1998(this.field2861, this.field2867, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4745(arg3);
        int var8;
        if (this.field2868 == null) {
            var8 = ((class251) this.field2864.getFirst()).field2950;
        } else {
            var8 = this.field2868.field2950;
        }
        boolean var9 = var7 & arg4.method5976(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method5978(var8);
        class254 var11 = class254.method2247(var10);
        class488 var12 = new class488(this.field2869 * 64, this.field2869 * 64);
        var12.method8394();
        if (this.field2868 == null) {
            this.method4660(arg1, arg2, var11);
        } else {
            this.method4650(arg1, arg2, var11);
        }
        method60(var12, this.field2861, this.field2867, this.field2869);
        this.method4654();
    }

    @ObfuscatedName("id.h(IIILjava/util/HashSet;I)V")
    public void method4657(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4737(arg0, arg1, arg3, arg2);
        this.method4731(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("id.p(Ljava/util/HashSet;III)V")
    public void method4659(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2865.values().iterator();
        while (var4.hasNext()) {
            class260 var5 = (class260) var4.next();
            if (var5.method4926()) {
                int var6 = var5.method4535();
                if (arg0.contains(var6)) {
                    class183 var7 = class183.method18(var6);
                    this.method4669(var7, var5.field3007, var5.field3010, arg1, arg2);
                }
            }
        }
        this.method4772(arg0, arg1, arg2);
    }

    @ObfuscatedName("id.o(Ljl;[Lrg;Liy;I)V")
    public void method4650(class264 arg0, class487[] arg1, class254 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4662(var4, var5, this.field2868, arg0, arg2);
                this.method4673(var4, var5, this.field2868, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4661(var6, var7, this.field2868, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("id.u(Ljl;[Lrg;Liy;B)V")
    public void method4660(class264 arg0, class487[] arg1, class254 arg2) {
        Iterator var4 = this.field2864.iterator();
        while (var4.hasNext()) {
            class245 var5 = (class245) var4.next();
            for (int var6 = var5.method4837() * 8; var6 < var5.method4837() * 8 + 8; var6++) {
                for (int var7 = var5.method4838() * 8; var7 < var5.method4838() * 8 + 8; var7++) {
                    this.method4662(var6, var7, var5, arg0, arg2);
                    this.method4673(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2864.iterator();
        while (var8.hasNext()) {
            class245 var9 = (class245) var8.next();
            for (int var10 = var9.method4837() * 8; var10 < var9.method4837() * 8 + 8; var10++) {
                for (int var11 = var9.method4838() * 8; var11 < var9.method4838() * 8 + 8; var11++) {
                    this.method4661(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("id.x(IILia;Ljl;[Lrg;B)V")
    public void method4661(int arg0, int arg1, class251 arg2, class264 arg3, class487[] arg4) {
        this.method4666(arg0, arg1, arg2);
        this.method4694(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("id.a(IILia;Ljl;Liy;I)V")
    public void method4662(int arg0, int arg1, class251 arg2, class264 arg3, class254 arg4) {
        int var6 = arg2.field2944[0][arg0][arg1] - 1;
        int var7 = arg2.field2954[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class484.method8296(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869, this.field2869, this.field2870);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class258.method3098(var7, this.field2870);
        }
        if (var7 > -1 && arg2.field2961[0][arg0][arg1] == 0) {
            class484.method8296(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869, this.field2869, var8);
            return;
        }
        int var9 = this.method4664(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class484.method8296(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869, this.field2869, var9);
        } else {
            arg3.method4948(this.field2869 * arg0, this.field2869 * (63 - arg1), var9, var8, this.field2869, this.field2869, arg2.field2961[0][arg0][arg1], arg2.field2957[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("id.q(IILia;Ljl;I)V")
    public void method4673(int arg0, int arg1, class251 arg2, class264 arg3) {
        for (int var5 = 1; var5 < arg2.field2949; var5++) {
            int var6 = arg2.field2954[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class258.method3098(var6, this.field2870);
                if (arg2.field2961[var5][arg0][arg1] == 0) {
                    class484.method8296(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869, this.field2869, var7);
                } else {
                    arg3.method4948(this.field2869 * arg0, this.field2869 * (63 - arg1), 0, var7, this.field2869, this.field2869, arg2.field2961[var5][arg0][arg1], arg2.field2957[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("id.d(IILia;Liy;B)I")
    public int method4664(int arg0, int arg1, class251 arg2, class254 arg3) {
        return arg2.field2944[0][arg0][arg1] == 0 ? this.field2870 : arg3.method4904(arg0, arg1);
    }

    @ObfuscatedName("id.e(IILia;[Lrg;B)V")
    public void method4694(int arg0, int arg1, class251 arg2, class487[] arg3) {
        for (int var5 = 0; var5 < arg2.field2949; var5++) {
            class253[] var6 = arg2.field2956[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class253[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class253 var9 = var7[var8];
                    if (class319.method5902(var9.field2969) || class319.method2493(var9.field2969)) {
                        class200 var10 = class200.method7839(var9.field2968);
                        if (var10.field2184 != -1) {
                            if (var10.field2184 == 46 || var10.field2184 == 52) {
                                arg3[var10.field2184].method8373(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869 * 2 + 1, this.field2869 * 2 + 1);
                            } else {
                                arg3[var10.field2184].method8373(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869 * 2, this.field2869 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("id.g(IILia;B)V")
    public void method4666(int arg0, int arg1, class251 arg2) {
        for (int var4 = 0; var4 < arg2.field2949; var4++) {
            class253[] var5 = arg2.field2956[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class253[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class253 var8 = var6[var7];
                    if (class319.method4496(var8.field2969)) {
                        class200 var9 = class200.method7839(var8.field2968);
                        int var10 = var9.field2173 == 0 ? -3355444 : -3407872;
                        if (class319.field3753.field3767 == var8.field2969) {
                            this.method4717(arg0, arg1, var8.field2970, var10);
                        }
                        if (class319.field3746.field3767 == var8.field2969) {
                            this.method4717(arg0, arg1, var8.field2970, -3355444);
                            this.method4717(arg0, arg1, var8.field2970 + 1, var10);
                        }
                        if (class319.field3747.field3767 == var8.field2969) {
                            if (var8.field2970 == 0) {
                                class484.method8328(this.field2869 * arg0, this.field2869 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2970 == 1) {
                                class484.method8328(this.field2869 * arg0 + this.field2869 - 1, this.field2869 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2970 == 2) {
                                class484.method8328(this.field2869 * arg0 + this.field2869 - 1, this.field2869 * (63 - arg1) + this.field2869 - 1, 1, var10);
                            }
                            if (var8.field2970 == 3) {
                                class484.method8328(this.field2869 * arg0, this.field2869 * (63 - arg1) + this.field2869 - 1, 1, var10);
                            }
                        }
                        if (class319.field3752.field3767 == var8.field2969) {
                            int var11 = var8.field2970 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2869; var12++) {
                                    class484.method8328(this.field2869 * arg0 + var12, this.field2869 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2869; var13++) {
                                    class484.method8328(this.field2869 * arg0 + var13, this.field2869 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("id.y(IILjava/util/HashSet;II)V")
    public void method4737(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2865.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class301 var9 = (class301) var8.getKey();
            int var10 = (int) ((float) var9.field3463 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3462 * var5 - var6);
            class260 var12 = (class260) var8.getValue();
            if (var12 != null && var12.method4926()) {
                var12.field3007 = var10;
                var12.field3010 = var11;
                class183 var13 = class183.method18(var12.method4535());
                if (!arg2.contains(var13.method3308())) {
                    this.method4686(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("id.af(Ljava/util/HashSet;III)V")
    public void method4772(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2872.iterator();
        while (var4.hasNext()) {
            class260 var5 = (class260) var4.next();
            if (var5.method4926()) {
                class183 var6 = class183.method18(var5.method4535());
                if (var6 != null && arg0.contains(var6.method3308())) {
                    this.method4669(var6, var5.field3007, var5.field3010, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("id.aa(Lgk;IIIII)V")
    public void method4669(class183 arg0, int arg1, int arg2, int arg3, int arg4) {
        class488 var6 = arg0.method3318(false);
        if (var6 == null) {
            return;
        }
        var6.method8402(arg1 - var6.field5034 / 2, arg2 - var6.field5032 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class484.method8358(arg1, arg2, 15, 16776960, 128);
            class484.method8358(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("id.ai(Lio;IIFI)V")
    public void method4686(class260 arg0, int arg1, int arg2, float arg3) {
        class183 var5 = class183.method18(arg0.method4535());
        this.method4723(var5, arg1, arg2);
        this.method4672(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("id.ag(Lgk;III)V")
    public void method4723(class183 arg0, int arg1, int arg2) {
        class488 var4 = arg0.method3318(false);
        if (var4 != null) {
            int var5 = this.method4674(var4, arg0.field1952);
            int var6 = this.method4675(var4, arg0.field1953);
            var4.method8402(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("id.aw(Lio;Lgk;IIFI)V")
    public void method4672(class260 arg0, class183 arg1, int arg2, int arg3, float arg4) {
        class255 var6 = arg0.method4528();
        if (var6 != null && var6.field2986.method4518(arg4)) {
            class372 var7 = (class372) this.field2873.get(var6.field2986);
            var7.method6682(var6.field2983, arg2 - var6.field2982 / 2, arg3, var6.field2982, var6.field2980, 0xFF000000 | arg1.field1941, 0, 1, 0, var7.field4419 / 2);
        }
    }

    @ObfuscatedName("id.ar(IILjava/util/HashSet;II)V")
    public void method4731(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2872.iterator();
        while (var6.hasNext()) {
            class260 var7 = (class260) var6.next();
            if (var7.method4926()) {
                int var8 = var7.field3009.field3463 % 64;
                int var9 = var7.field3009.field3462 % 64;
                var7.field3007 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3010 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4535())) {
                    this.method4686(var7, var7.field3007, var7.field3010, var5);
                }
            }
        }
    }

    @ObfuscatedName("id.al(Lrs;Lgw;B)I")
    public int method4674(class488 arg0, class189 arg1) {
        switch(arg1.field2014) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5034 / 2;
            default:
                return -arg0.field5034;
        }
    }

    @ObfuscatedName("id.at(Lrs;Lgd;B)I")
    public int method4675(class488 arg0, class192 arg1) {
        switch(arg1.field2074) {
            case 1:
                return 0;
            case 2:
                return -arg0.field5032 / 2;
            default:
                return -arg0.field5032;
        }
    }

    @ObfuscatedName("c.aj(Lgp;I)Z")
    public static boolean method106(class200 arg0) {
        if (arg0.field2180 != null) {
            int[] var1 = arg0.field2180;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class200 var4 = class200.method7839(var3);
                if (var4.field2170 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2170 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("id.ax(II)Lil;")
    public class255 method4762(int arg0) {
        class183 var2 = class183.method18(arg0);
        return this.method4677(var2);
    }

    @ObfuscatedName("id.az(Lgk;S)Lil;")
    public class255 method4677(class183 arg0) {
        if (arg0.field1935 == null || this.field2873 == null || this.field2873.get(class239.field2817) == null) {
            return null;
        }
        int var2 = arg0.field1942;
        class239[] var3 = new class239[] { class239.field2817, class239.field2820, class239.field2818 };
        class239[] var4 = var3;
        int var5 = 0;
        class239 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class239 var6 = var4[var5];
            if (var6.field2824 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class372 var9 = (class372) this.field2873.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method6645(arg0.field1935, 1000000);
        String[] var11 = new String[var10];
        var9.method6630(arg0.field1935, (int[]) null, var11);
        int var12 = var11.length * var9.field4419 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method6629(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class255(arg0.field1935, var13, var12, var7);
    }

    @ObfuscatedName("id.ap(IIIIII)Ljava/util/List;")
    public List method4678(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2865.values().iterator();
            while (var7.hasNext()) {
                class260 var8 = (class260) var7.next();
                if (var8.method4926() && var8.method4924(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2872.iterator();
            while (var9.hasNext()) {
                class260 var10 = (class260) var9.next();
                if (var10.method4926() && var10.method4924(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("id.ay(S)Ljava/util/List;")
    public List method4679() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2872);
        var1.addAll(this.field2865.values());
        return var1;
    }

    @ObfuscatedName("id.ac(IIIIB)V")
    public void method4717(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class484.method8304(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869, arg3);
        }
        if (var5 == 1) {
            class484.method8328(this.field2869 * arg0, this.field2869 * (63 - arg1), this.field2869, arg3);
        }
        if (var5 == 2) {
            class484.method8304(this.field2869 * arg0 + this.field2869 - 1, this.field2869 * (63 - arg1), this.field2869, arg3);
        }
        if (var5 == 3) {
            class484.method8328(this.field2869 * arg0, this.field2869 * (63 - arg1) + this.field2869 - 1, this.field2869, arg3);
        }
    }
}
