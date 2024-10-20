package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jt")
public final class class247 {

    @ObfuscatedName("jt.aj")
    public boolean field2870 = false;

    @ObfuscatedName("jt.al")
    public boolean field2869 = false;

    @ObfuscatedName("jt.ac")
    public class266 field2883;

    @ObfuscatedName("jt.ab")
    public class492 field2881;

    @ObfuscatedName("jt.an")
    public HashMap field2872;

    @ObfuscatedName("jt.ao")
    public class246[][] field2873;

    @ObfuscatedName("jt.av")
    public HashMap field2874 = new HashMap();

    @ObfuscatedName("jt.aq")
    public class491[] field2875;

    @ObfuscatedName("jt.ap")
    public final class340 field2876;

    @ObfuscatedName("jt.ar")
    public final class340 field2877;

    @ObfuscatedName("jt.ak")
    public final HashMap field2878;

    @ObfuscatedName("jt.ax")
    public int field2879;

    @ObfuscatedName("jt.as")
    public int field2871;

    @ObfuscatedName("jt.ay")
    public int field2880;

    @ObfuscatedName("jt.am")
    public int field2882;

    @ObfuscatedName("jt.az")
    public int field2868 = 0;

    public class247(class491[] arg0, HashMap arg1, class340 arg2, class340 arg3) {
        this.field2875 = arg0;
        this.field2878 = arg1;
        this.field2876 = arg2;
        this.field2877 = arg3;
    }

    @ObfuscatedName("jt.aj(Lne;Ljava/lang/String;ZB)V")
    public void method4676(class340 arg0, String arg1, boolean arg2) {
        if (this.field2869) {
            return;
        }
        this.field2870 = false;
        this.field2869 = true;
        System.nanoTime();
        int var4 = arg0.method5875(class264.field3020.field3019);
        int var5 = arg0.method5876(var4, arg1);
        class478 var6 = new class478(arg0.method5878(class264.field3020.field3019, arg1));
        class478 var7 = new class478(arg0.method5878(class264.field3015.field3019, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2883 = new class266();
        try {
            this.field2883.method4824(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2883.method4487();
        this.field2883.method4488();
        this.field2883.method4489();
        this.field2879 = this.field2883.method4533() * 64;
        this.field2871 = this.field2883.method4500() * 64;
        this.field2880 = (this.field2883.method4484() - this.field2883.method4533() + 1) * 64;
        this.field2882 = (this.field2883.method4495() - this.field2883.method4500() + 1) * 64;
        int var9 = this.field2883.method4484() - this.field2883.method4533() + 1;
        int var10 = this.field2883.method4495() - this.field2883.method4500() + 1;
        System.nanoTime();
        System.nanoTime();
        class246.method7326();
        this.field2873 = new class246[var9][var10];
        Iterator var11 = this.field2883.field3023.iterator();
        while (var11.hasNext()) {
            class240 var12 = (class240) var11.next();
            int var13 = var12.field2942;
            int var14 = var12.field2943;
            int var15 = var13 - this.field2883.method4533();
            int var16 = var14 - this.field2883.method4500();
            this.field2873[var15][var16] = new class246(var13, var14, this.field2883.method4513(), this.field2878);
            this.field2873[var15][var16].method4545(var12, this.field2883.field3021);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2873[var17][var18] == null) {
                    this.field2873[var17][var18] = new class246(this.field2883.method4533() + var17, this.field2883.method4500() + var18, this.field2883.method4513(), this.field2878);
                    this.field2873[var17][var18].method4546(this.field2883.field3022, this.field2883.field3021);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5907(class264.field3017.field3019, arg1)) {
            byte[] var19 = arg0.method5878(class264.field3017.field3019, arg1);
            this.field2881 = class31.method2942(var19);
        }
        System.nanoTime();
        arg0.method5893();
        arg0.method5873();
        this.field2870 = true;
    }

    @ObfuscatedName("jt.al(I)V")
    public final void method4697() {
        this.field2872 = null;
    }

    @ObfuscatedName("jt.ac(IIIIIIIII)V")
    public final void method4698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4975;
        int var10 = Statics.field4970;
        int var11 = Statics.field4973;
        int[] var12 = new int[4];
        class488.method8235(var12);
        class255 var13 = this.method4704(arg0, arg1, arg2, arg3);
        float var14 = this.method4686(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2868 = var15;
        if (!this.field2874.containsKey(var15)) {
            class267 var16 = new class267(var15);
            var16.method4834();
            this.field2874.put(var15, var16);
        }
        int var17 = var13.field2962 + var13.field2959 - 1;
        int var18 = var13.field2961 + var13.field2960 - 1;
        for (int var19 = var13.field2962; var19 <= var17; var19++) {
            for (int var20 = var13.field2961; var20 <= var18; var20++) {
                this.field2873[var19][var20].method4553(var15, (class267) this.field2874.get(var15), this.field2875, this.field2876, this.field2877);
            }
        }
        class488.method8231(var9, var10, var11);
        class488.method8236(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2879 + arg0;
        int var23 = this.field2871 + arg1;
        for (int var24 = var13.field2962; var24 < var13.field2962 + var13.field2959; var24++) {
            for (int var25 = var13.field2961; var25 < var13.field2961 + var13.field2960; var25++) {
                this.field2873[var24][var25].method4544((this.field2873[var24][var25].field2857 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2873[var24][var25].field2858 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("jt.ab(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class255 var14 = this.method4704(arg0, arg1, arg2, arg3);
        float var15 = this.method4686(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2879 + arg0;
        int var18 = this.field2871 + arg1;
        for (int var19 = var14.field2962; var19 < var14.field2962 + var14.field2959; var19++) {
            for (int var20 = var14.field2961; var20 < var14.field2961 + var14.field2960; var20++) {
                if (arg12) {
                    this.field2873[var19][var20].method4591();
                }
                this.field2873[var19][var20].method4554((this.field2873[var19][var20].field2857 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2873[var19][var20].field2858 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2962; var21 < var14.field2962 + var14.field2959; var21++) {
            for (int var22 = var14.field2961; var22 < var14.field2961 + var14.field2960; var22++) {
                this.field2873[var21][var22].method4555(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jt.an(IIIILjava/util/HashSet;III)V")
    public void method4680(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2881 == null) {
            return;
        }
        this.field2881.method8342(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2872 == null) {
            this.method4685();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2872.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class263 var12 = (class263) var11.next();
                int var13 = (var12.field3013.field3429 - this.field2879) * arg2 / this.field2880;
                int var14 = arg3 - (var12.field3013.field3431 - this.field2871) * arg3 / this.field2882;
                class488.method8238(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jt.ao(IIIIIIIIIIB)Ljava/util/List;")
    public List method4681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2870) {
            return var11;
        }
        class255 var12 = this.method4704(arg0, arg1, arg2, arg3);
        float var13 = this.method4686(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2879 + arg0;
        int var16 = this.field2871 + arg1;
        for (int var17 = var12.field2962; var17 < var12.field2962 + var12.field2959; var17++) {
            for (int var18 = var12.field2961; var18 < var12.field2961 + var12.field2960; var18++) {
                List var19 = this.field2873[var17][var18].method4593((this.field2873[var17][var18].field2857 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2873[var17][var18].field2858 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jt.av(IIIII)Ljl;")
    public class255 method4704(int arg0, int arg1, int arg2, int arg3) {
        class255 var5 = new class255(this);
        int var6 = this.field2879 + arg0;
        int var7 = this.field2871 + arg1;
        int var8 = this.field2879 + arg2;
        int var9 = this.field2871 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2959 = var12 - var10 + 1;
        var5.field2960 = var13 - var11 + 1;
        var5.field2962 = var10 - this.field2883.method4533();
        var5.field2961 = var11 - this.field2883.method4500();
        if (var5.field2962 < 0) {
            var5.field2959 += var5.field2962;
            var5.field2962 = 0;
        }
        if (var5.field2962 > this.field2873.length - var5.field2959) {
            var5.field2959 = this.field2873.length - var5.field2962;
        }
        if (var5.field2961 < 0) {
            var5.field2960 += var5.field2961;
            var5.field2961 = 0;
        }
        if (var5.field2961 > this.field2873[0].length - var5.field2960) {
            var5.field2960 = this.field2873[0].length - var5.field2961;
        }
        var5.field2959 = Math.min(var5.field2959, this.field2873.length);
        var5.field2960 = Math.min(var5.field2960, this.field2873[0].length);
        return var5;
    }

    @ObfuscatedName("jt.aq(B)Z")
    public boolean method4683() {
        return this.field2870;
    }

    @ObfuscatedName("jt.ap(I)Ljava/util/HashMap;")
    public HashMap method4684() {
        this.method4685();
        return this.field2872;
    }

    @ObfuscatedName("jt.ar(I)V")
    public void method4685() {
        if (this.field2872 == null) {
            this.field2872 = new HashMap();
        }
        this.field2872.clear();
        for (int var1 = 0; var1 < this.field2873.length; var1++) {
            for (int var2 = 0; var2 < this.field2873[var1].length; var2++) {
                List var3 = this.field2873[var1][var2].method4576();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class263 var5 = (class263) var4.next();
                    if (var5.method4804()) {
                        int var6 = var5.method4426();
                        if (this.field2872.containsKey(var6)) {
                            List var8 = (List) this.field2872.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2872.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.ak(III)F")
    public float method4686(int arg0, int arg1) {
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
