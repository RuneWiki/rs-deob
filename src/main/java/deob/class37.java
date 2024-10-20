package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("av")
public final class class37 {

    @ObfuscatedName("av.a")
    public boolean field325 = false;

    @ObfuscatedName("av.s")
    public boolean field329 = false;

    @ObfuscatedName("av.g")
    public class39 field314;

    @ObfuscatedName("av.x")
    public class328 field315;

    @ObfuscatedName("av.h")
    public HashMap field316;

    @ObfuscatedName("av.f")
    public class30[][] field317;

    @ObfuscatedName("av.p")
    public HashMap field318 = new HashMap();

    @ObfuscatedName("av.m")
    public class327[] field312;

    @ObfuscatedName("av.q")
    public final class255 field320;

    @ObfuscatedName("av.b")
    public final class255 field321;

    @ObfuscatedName("av.n")
    public final HashMap field322;

    @ObfuscatedName("av.e")
    public int field323;

    @ObfuscatedName("av.r")
    public int field313;

    @ObfuscatedName("av.t")
    public int field324;

    @ObfuscatedName("av.l")
    public int field326;

    @ObfuscatedName("av.o")
    public int field327 = 0;

    public class37(class327[] arg0, HashMap arg1, class255 arg2, class255 arg3) {
        this.field312 = arg0;
        this.field322 = arg1;
        this.field320 = arg2;
        this.field321 = arg3;
    }

    @ObfuscatedName("av.a(Liz;Ljava/lang/String;ZI)V")
    public void method545(class255 arg0, String arg1, boolean arg2) {
        if (this.field329) {
            return;
        }
        this.field325 = false;
        this.field329 = true;
        System.nanoTime();
        int var4 = arg0.method4439(class36.field310.field308);
        int var5 = arg0.method4444(var4, arg1);
        class190 var6 = new class190(arg0.method4442(class36.field310.field308, arg1));
        class190 var7 = new class190(arg0.method4442(class36.field304.field308, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field314 = new class39();
        try {
            this.field314.method586(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field314.method311();
        this.field314.method312();
        this.field314.method304();
        this.field323 = this.field314.method339() * 64;
        this.field313 = this.field314.method309() * 64;
        this.field324 = (this.field314.method308() - this.field314.method339() + 1) * 64;
        this.field326 = (this.field314.method344() - this.field314.method309() + 1) * 64;
        int var9 = this.field314.method308() - this.field314.method339() + 1;
        int var10 = this.field314.method344() - this.field314.method309() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.field256.method3894();
        this.field317 = new class30[var9][var10];
        Iterator var11 = this.field314.field332.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field174;
            int var14 = var12.field170;
            int var15 = var13 - this.field314.method339();
            int var16 = var14 - this.field314.method309();
            this.field317[var15][var16] = new class30(var13, var14, this.field314.method305(), this.field322);
            this.field317[var15][var16].method419(var12, this.field314.field333);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field317[var17][var18] == null) {
                    this.field317[var17][var18] = new class30(this.field314.method339() + var17, this.field314.method309() + var18, this.field314.method305(), this.field322);
                    this.field317[var17][var18].method385(this.field314.field336, this.field314.field333);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4441(class36.field305.field308, arg1)) {
            byte[] var19 = arg0.method4442(class36.field305.field308, arg1);
            this.field315 = class49.method3425(var19);
        }
        System.nanoTime();
        arg0.method4505();
        arg0.method4437();
        this.field325 = true;
    }

    @ObfuscatedName("av.s(I)V")
    public final void method569() {
        this.field316 = null;
    }

    @ObfuscatedName("av.g(IIIIIIIII)V")
    public final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3863;
        int var10 = Statics.field3864;
        int var11 = Statics.field3862;
        int[] var12 = new int[4];
        class324.method5545(var12);
        class23 var13 = this.method551(arg0, arg1, arg2, arg3);
        float var14 = this.method554(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field327 = var15;
        if (!this.field318.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method632();
            this.field318.put(var15, var16);
        }
        int var17 = var13.field194 + var13.field192 - 1;
        int var18 = var13.field193 + var13.field190 - 1;
        for (int var19 = var13.field192; var19 <= var17; var19++) {
            for (int var20 = var13.field190; var20 <= var18; var20++) {
                this.field317[var19][var20].method392(var15, (class41) this.field318.get(var15), this.field312, this.field320, this.field321);
            }
        }
        class324.method5560(var9, var10, var11);
        class324.method5546(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field323 + arg0;
        int var23 = this.field313 + arg1;
        for (int var24 = var13.field192; var24 < var13.field194 + var13.field192; var24++) {
            for (int var25 = var13.field190; var25 < var13.field193 + var13.field190; var25++) {
                this.field317[var24][var25].method383((this.field317[var24][var25].field257 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field317[var24][var25].field258 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("av.x(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method551(arg0, arg1, arg2, arg3);
        float var15 = this.method554(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field323 + arg0;
        int var18 = this.field313 + arg1;
        for (int var19 = var14.field192; var19 < var14.field194 + var14.field192; var19++) {
            for (int var20 = var14.field190; var20 < var14.field193 + var14.field190; var20++) {
                if (arg12) {
                    this.field317[var19][var20].method388();
                }
                this.field317[var19][var20].method393((this.field317[var19][var20].field257 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field317[var19][var20].field258 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field192; var21 < var14.field194 + var14.field192; var21++) {
            for (int var22 = var14.field190; var22 < var14.field193 + var14.field190; var22++) {
                this.field317[var21][var22].method414(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("av.h(IIIILjava/util/HashSet;III)V")
    public void method549(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field315 == null) {
            return;
        }
        this.field315.method5670(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field316 == null) {
            this.method546();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field316.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field298.field2650 - this.field323) * arg2 / this.field324;
                int var14 = arg3 - (var12.field298.field2649 - this.field313) * arg3 / this.field326;
                class324.method5549(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("av.f(IIIIIIIIIII)Ljava/util/List;")
    public List method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field325) {
            return var11;
        }
        class23 var12 = this.method551(arg0, arg1, arg2, arg3);
        float var13 = this.method554(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field323 + arg0;
        int var16 = this.field313 + arg1;
        for (int var17 = var12.field192; var17 < var12.field194 + var12.field192; var17++) {
            for (int var18 = var12.field190; var18 < var12.field193 + var12.field190; var18++) {
                List var19 = this.field317[var17][var18].method432((this.field317[var17][var18].field257 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field317[var17][var18].field258 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("av.p(IIIII)Li;")
    public class23 method551(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field323 + arg0;
        int var7 = this.field313 + arg1;
        int var8 = this.field323 + arg2;
        int var9 = this.field313 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field194 = var12 - var10 + 1;
        var5.field193 = var13 - var11 + 1;
        var5.field192 = var10 - this.field314.method339();
        var5.field190 = var11 - this.field314.method309();
        if (var5.field192 < 0) {
            var5.field194 += var5.field192;
            var5.field192 = 0;
        }
        if (var5.field192 > this.field317.length - var5.field194) {
            var5.field194 = this.field317.length - var5.field192;
        }
        if (var5.field190 < 0) {
            var5.field193 += var5.field190;
            var5.field190 = 0;
        }
        if (var5.field190 > this.field317[0].length - var5.field193) {
            var5.field193 = this.field317[0].length - var5.field190;
        }
        var5.field194 = Math.min(var5.field194, this.field317.length);
        var5.field193 = Math.min(var5.field193, this.field317[0].length);
        return var5;
    }

    @ObfuscatedName("av.m(B)Z")
    public boolean method552() {
        return this.field325;
    }

    @ObfuscatedName("av.q(B)Ljava/util/HashMap;")
    public HashMap method553() {
        this.method546();
        return this.field316;
    }

    @ObfuscatedName("av.b(I)V")
    public void method546() {
        if (this.field316 == null) {
            this.field316 = new HashMap();
        }
        this.field316.clear();
        for (int var1 = 0; var1 < this.field317.length; var1++) {
            for (int var2 = 0; var2 < this.field317[var1].length; var2++) {
                List var3 = this.field317[var1][var2].method415();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method528()) {
                        int var6 = var5.method201();
                        if (this.field316.containsKey(var6)) {
                            List var8 = (List) this.field316.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field316.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.n(III)F")
    public float method554(int arg0, int arg1) {
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
