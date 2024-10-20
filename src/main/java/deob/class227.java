package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("hw")
public final class class227 {

    @ObfuscatedName("hw.s")
    public boolean field2753 = false;

    @ObfuscatedName("hw.h")
    public boolean field2739 = false;

    @ObfuscatedName("hw.w")
    public class246 field2740;

    @ObfuscatedName("hw.v")
    public class457 field2741;

    @ObfuscatedName("hw.c")
    public HashMap field2742;

    @ObfuscatedName("hw.q")
    public class226[][] field2743;

    @ObfuscatedName("hw.i")
    public HashMap field2750 = new HashMap();

    @ObfuscatedName("hw.k")
    public class456[] field2745;

    @ObfuscatedName("hw.o")
    public final class316 field2747;

    @ObfuscatedName("hw.n")
    public final class316 field2752;

    @ObfuscatedName("hw.d")
    public final HashMap field2748;

    @ObfuscatedName("hw.a")
    public int field2749;

    @ObfuscatedName("hw.m")
    public int field2746;

    @ObfuscatedName("hw.u")
    public int field2751;

    @ObfuscatedName("hw.l")
    public int field2744;

    @ObfuscatedName("hw.z")
    public int field2738 = 0;

    public class227(class456[] arg0, HashMap arg1, class316 arg2, class316 arg3) {
        this.field2745 = arg0;
        this.field2748 = arg1;
        this.field2747 = arg2;
        this.field2752 = arg3;
    }

    @ObfuscatedName("hw.s(Lls;Ljava/lang/String;ZI)V")
    public void method4353(class316 arg0, String arg1, boolean arg2) {
        if (this.field2739) {
            return;
        }
        this.field2753 = false;
        this.field2739 = true;
        System.nanoTime();
        int var4 = arg0.method5269(class244.field2873.field2874);
        int var5 = arg0.method5196(var4, arg1);
        class444 var6 = new class444(arg0.method5198(class244.field2873.field2874, arg1));
        class444 var7 = new class444(arg0.method5198(class244.field2870.field2874, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2740 = new class246();
        try {
            this.field2740.method4506(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2740.method4204();
        this.field2740.method4169();
        this.field2740.method4170();
        this.field2749 = this.field2740.method4164() * 64;
        this.field2746 = this.field2740.method4166() * 64;
        this.field2751 = (this.field2740.method4165() - this.field2740.method4164() + 1) * 64;
        this.field2744 = (this.field2740.method4190() - this.field2740.method4166() + 1) * 64;
        int var9 = this.field2740.method4165() - this.field2740.method4164() + 1;
        int var10 = this.field2740.method4190() - this.field2740.method4166() + 1;
        System.nanoTime();
        System.nanoTime();
        class226.field2727.method4584();
        this.field2743 = new class226[var9][var10];
        Iterator var11 = this.field2740.field2881.iterator();
        while (var11.hasNext()) {
            class220 var12 = (class220) var11.next();
            int var13 = var12.field2807;
            int var14 = var12.field2808;
            int var15 = var13 - this.field2740.method4164();
            int var16 = var14 - this.field2740.method4166();
            this.field2743[var15][var16] = new class226(var13, var14, this.field2740.method4162(), this.field2748);
            this.field2743[var15][var16].method4225(var12, this.field2740.field2878);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2743[var17][var18] == null) {
                    this.field2743[var17][var18] = new class226(this.field2740.method4164() + var17, this.field2740.method4166() + var18, this.field2740.method4162(), this.field2748);
                    this.field2743[var17][var18].method4339(this.field2740.field2877, this.field2740.field2878);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5232(class244.field2875.field2874, arg1)) {
            byte[] var19 = arg0.method5198(class244.field2875.field2874, arg1);
            this.field2741 = class29.method2872(var19);
        }
        System.nanoTime();
        arg0.method5191();
        arg0.method5193();
        this.field2753 = true;
    }

    @ObfuscatedName("hw.h(I)V")
    public final void method4373() {
        this.field2742 = null;
    }

    @ObfuscatedName("hw.w(IIIIIIIIB)V")
    public final void method4376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4775;
        int var10 = Statics.field4772;
        int var11 = Statics.field4771;
        int[] var12 = new int[4];
        class453.method7240(var12);
        class235 var13 = this.method4359(arg0, arg1, arg2, arg3);
        float var14 = this.method4391(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2738 = var15;
        if (!this.field2750.containsKey(var15)) {
            class247 var16 = new class247(var15);
            var16.method4516();
            this.field2750.put(var15, var16);
        }
        int var17 = var13.field2825 + var13.field2822 - 1;
        int var18 = var13.field2824 + var13.field2821 - 1;
        for (int var19 = var13.field2825; var19 <= var17; var19++) {
            for (int var20 = var13.field2824; var20 <= var18; var20++) {
                this.field2743[var19][var20].method4233(var15, (class247) this.field2750.get(var15), this.field2745, this.field2747, this.field2752);
            }
        }
        class453.method7236(var9, var10, var11);
        class453.method7250(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2749 + arg0;
        int var23 = this.field2746 + arg1;
        for (int var24 = var13.field2825; var24 < var13.field2825 + var13.field2822; var24++) {
            for (int var25 = var13.field2824; var25 < var13.field2824 + var13.field2821; var25++) {
                this.field2743[var24][var25].method4224((this.field2743[var24][var25].field2729 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2743[var24][var25].field2735 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("hw.v(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class235 var14 = this.method4359(arg0, arg1, arg2, arg3);
        float var15 = this.method4391(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2749 + arg0;
        int var18 = this.field2746 + arg1;
        for (int var19 = var14.field2825; var19 < var14.field2825 + var14.field2822; var19++) {
            for (int var20 = var14.field2824; var20 < var14.field2824 + var14.field2821; var20++) {
                if (arg12) {
                    this.field2743[var19][var20].method4229();
                }
                this.field2743[var19][var20].method4234((this.field2743[var19][var20].field2729 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2743[var19][var20].field2735 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2825; var21 < var14.field2825 + var14.field2822; var21++) {
            for (int var22 = var14.field2824; var22 < var14.field2824 + var14.field2821; var22++) {
                this.field2743[var21][var22].method4299(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("hw.c(IIIILjava/util/HashSet;IIB)V")
    public void method4357(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2741 == null) {
            return;
        }
        this.field2741.method7354(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2742 == null) {
            this.method4362();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2742.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class243 var12 = (class243) var11.next();
                int var13 = (var12.field2864.field3320 - this.field2749) * arg2 / this.field2751;
                int var14 = arg3 - (var12.field2864.field3317 - this.field2746) * arg3 / this.field2744;
                class453.method7263(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("hw.q(IIIIIIIIIII)Ljava/util/List;")
    public List method4358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2753) {
            return var11;
        }
        class235 var12 = this.method4359(arg0, arg1, arg2, arg3);
        float var13 = this.method4391(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2749 + arg0;
        int var16 = this.field2746 + arg1;
        for (int var17 = var12.field2825; var17 < var12.field2825 + var12.field2822; var17++) {
            for (int var18 = var12.field2824; var18 < var12.field2824 + var12.field2821; var18++) {
                List var19 = this.field2743[var17][var18].method4255((this.field2743[var17][var18].field2729 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2743[var17][var18].field2735 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("hw.i(IIIII)Liv;")
    public class235 method4359(int arg0, int arg1, int arg2, int arg3) {
        class235 var5 = new class235(this);
        int var6 = this.field2749 + arg0;
        int var7 = this.field2746 + arg1;
        int var8 = this.field2749 + arg2;
        int var9 = this.field2746 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2822 = var12 - var10 + 1;
        var5.field2821 = var13 - var11 + 1;
        var5.field2825 = var10 - this.field2740.method4164();
        var5.field2824 = var11 - this.field2740.method4166();
        if (var5.field2825 < 0) {
            var5.field2822 += var5.field2825;
            var5.field2825 = 0;
        }
        if (var5.field2825 > this.field2743.length - var5.field2822) {
            var5.field2822 = this.field2743.length - var5.field2825;
        }
        if (var5.field2824 < 0) {
            var5.field2821 += var5.field2824;
            var5.field2824 = 0;
        }
        if (var5.field2824 > this.field2743[0].length - var5.field2821) {
            var5.field2821 = this.field2743[0].length - var5.field2824;
        }
        var5.field2822 = Math.min(var5.field2822, this.field2743.length);
        var5.field2821 = Math.min(var5.field2821, this.field2743[0].length);
        return var5;
    }

    @ObfuscatedName("hw.k(I)Z")
    public boolean method4379() {
        return this.field2753;
    }

    @ObfuscatedName("hw.o(I)Ljava/util/HashMap;")
    public HashMap method4361() {
        this.method4362();
        return this.field2742;
    }

    @ObfuscatedName("hw.n(S)V")
    public void method4362() {
        if (this.field2742 == null) {
            this.field2742 = new HashMap();
        }
        this.field2742.clear();
        for (int var1 = 0; var1 < this.field2743.length; var1++) {
            for (int var2 = 0; var2 < this.field2743[var1].length; var2++) {
                List var3 = this.field2743[var1][var2].method4256();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class243 var5 = (class243) var4.next();
                    if (var5.method4493()) {
                        int var6 = var5.method4097();
                        if (this.field2742.containsKey(var6)) {
                            List var8 = (List) this.field2742.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2742.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hw.d(III)F")
    public float method4391(int arg0, int arg1) {
        float var3 = (float) arg0 / (float) arg1;
        if (var3 > 8.0F) {
            return 8.0F;
        } else if (var3 < 1.0F) {
            return 1.0F;
        } else {
            int var4 = Math.round(var3);
            return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
        }
    }
}
