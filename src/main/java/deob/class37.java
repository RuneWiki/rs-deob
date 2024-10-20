package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public final class class37 {

    @ObfuscatedName("aj.c")
    public boolean field318 = false;

    @ObfuscatedName("aj.x")
    public boolean field319 = false;

    @ObfuscatedName("aj.t")
    public class39 field305;

    @ObfuscatedName("aj.g")
    public class325 field306;

    @ObfuscatedName("aj.l")
    public HashMap field314;

    @ObfuscatedName("aj.u")
    public class30[][] field321;

    @ObfuscatedName("aj.j")
    public HashMap field317 = new HashMap();

    @ObfuscatedName("aj.v")
    public class324[] field310;

    @ObfuscatedName("aj.d")
    public final class234 field311;

    @ObfuscatedName("aj.z")
    public final class234 field312;

    @ObfuscatedName("aj.n")
    public final HashMap field313;

    @ObfuscatedName("aj.h")
    public int field309;

    @ObfuscatedName("aj.f")
    public int field315;

    @ObfuscatedName("aj.s")
    public int field304;

    @ObfuscatedName("aj.p")
    public int field308;

    @ObfuscatedName("aj.e")
    public int field307 = 0;

    public class37(class324[] arg0, HashMap arg1, class234 arg2, class234 arg3) {
        this.field310 = arg0;
        this.field313 = arg1;
        this.field311 = arg2;
        this.field312 = arg3;
    }

    @ObfuscatedName("aj.c(Lhz;Ljava/lang/String;ZI)V")
    public void method515(class234 arg0, String arg1, boolean arg2) {
        if (this.field319) {
            return;
        }
        this.field318 = false;
        this.field319 = true;
        System.nanoTime();
        int var4 = arg0.method3843(class36.field295.field300);
        int var5 = arg0.method3865(var4, arg1);
        class300 var6 = new class300(arg0.method3895(class36.field295.field300, arg1));
        class300 var7 = new class300(arg0.method3895(class36.field296.field300, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field305 = new class39();
        try {
            this.field305.method558(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field305.method317();
        this.field305.method266();
        this.field305.method267();
        this.field309 = this.field305.method262() * 64;
        this.field315 = this.field305.method304() * 64;
        this.field304 = (this.field305.method263() - this.field305.method262() + 1) * 64;
        this.field308 = (this.field305.method289() - this.field305.method304() + 1) * 64;
        int var9 = this.field305.method263() - this.field305.method262() + 1;
        int var10 = this.field305.method289() - this.field305.method304() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.method961();
        this.field321 = new class30[var9][var10];
        Iterator var11 = this.field305.field325.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field156;
            int var14 = var12.field157;
            int var15 = var13 - this.field305.method262();
            int var16 = var14 - this.field305.method304();
            this.field321[var15][var16] = new class30(var13, var14, this.field305.method260(), this.field313);
            this.field321[var15][var16].method336(var12, this.field305.field324);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field321[var17][var18] == null) {
                    this.field321[var17][var18] = new class30(this.field305.method262() + var17, this.field305.method304() + var18, this.field305.method260(), this.field313);
                    this.field321[var17][var18].method330(this.field305.field326, this.field305.field324);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3845(class36.field297.field300, arg1)) {
            byte[] var19 = arg0.method3895(class36.field297.field300, arg1);
            this.field306 = class50.method149(var19);
        }
        System.nanoTime();
        arg0.method3880();
        arg0.method3841();
        this.field318 = true;
    }

    @ObfuscatedName("aj.x(B)V")
    public final void method508() {
        this.field314 = null;
    }

    @ObfuscatedName("aj.t(IIIIIIIII)V")
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3847;
        int var10 = Statics.field3842;
        int var11 = Statics.field3844;
        int[] var12 = new int[4];
        class321.method5560(var12);
        class23 var13 = this.method513(arg0, arg1, arg2, arg3);
        float var14 = this.method546(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field307 = var15;
        if (!this.field317.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method596();
            this.field317.put(var15, var16);
        }
        int var17 = var13.field172 + var13.field170 - 1;
        int var18 = var13.field174 + var13.field171 - 1;
        for (int var19 = var13.field172; var19 <= var17; var19++) {
            for (int var20 = var13.field174; var20 <= var18; var20++) {
                this.field321[var19][var20].method331(var15, (class41) this.field317.get(var15), this.field310, this.field311, this.field312);
            }
        }
        class321.method5556(var9, var10, var11);
        class321.method5561(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field309 + arg0;
        int var23 = this.field315 + arg1;
        for (int var24 = var13.field172; var24 < var13.field172 + var13.field170; var24++) {
            for (int var25 = var13.field174; var25 < var13.field174 + var13.field171; var25++) {
                this.field321[var24][var25].method328((this.field321[var24][var25].field243 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field321[var24][var25].field242 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("aj.g(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method513(arg0, arg1, arg2, arg3);
        float var15 = this.method546(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field309 + arg0;
        int var18 = this.field315 + arg1;
        for (int var19 = var14.field172; var19 < var14.field172 + var14.field170; var19++) {
            for (int var20 = var14.field174; var20 < var14.field174 + var14.field171; var20++) {
                if (arg12) {
                    this.field321[var19][var20].method333();
                }
                this.field321[var19][var20].method334((this.field321[var19][var20].field243 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field321[var19][var20].field242 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field172; var21 < var14.field172 + var14.field170; var21++) {
            for (int var22 = var14.field174; var22 < var14.field174 + var14.field171; var22++) {
                this.field321[var21][var22].method339(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aj.l(IIIILjava/util/HashSet;IIB)V")
    public void method544(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field306 == null) {
            return;
        }
        this.field306.method5672(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field314 == null) {
            this.method541();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field314.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field290.field2502 - this.field309) * arg2 / this.field304;
                int var14 = arg3 - (var12.field290.field2503 - this.field315) * arg3 / this.field308;
                class321.method5568(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aj.u(IIIIIIIIIII)Ljava/util/List;")
    public List method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field318) {
            return var11;
        }
        class23 var12 = this.method513(arg0, arg1, arg2, arg3);
        float var13 = this.method546(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field309 + arg0;
        int var16 = this.field315 + arg1;
        for (int var17 = var12.field172; var17 < var12.field172 + var12.field170; var17++) {
            for (int var18 = var12.field174; var18 < var12.field174 + var12.field171; var18++) {
                List var19 = this.field321[var17][var18].method359((this.field321[var17][var18].field243 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field321[var17][var18].field242 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aj.j(IIIIB)Lm;")
    public class23 method513(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field309 + arg0;
        int var7 = this.field315 + arg1;
        int var8 = this.field309 + arg2;
        int var9 = this.field315 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field170 = var12 - var10 + 1;
        var5.field171 = var13 - var11 + 1;
        var5.field172 = var10 - this.field305.method262();
        var5.field174 = var11 - this.field305.method304();
        if (var5.field172 < 0) {
            var5.field170 += var5.field172;
            var5.field172 = 0;
        }
        if (var5.field172 > this.field321.length - var5.field170) {
            var5.field170 = this.field321.length - var5.field172;
        }
        if (var5.field174 < 0) {
            var5.field171 += var5.field174;
            var5.field174 = 0;
        }
        if (var5.field174 > this.field321[0].length - var5.field171) {
            var5.field171 = this.field321[0].length - var5.field174;
        }
        var5.field170 = Math.min(var5.field170, this.field321.length);
        var5.field171 = Math.min(var5.field171, this.field321[0].length);
        return var5;
    }

    @ObfuscatedName("aj.v(I)Z")
    public boolean method520() {
        return this.field318;
    }

    @ObfuscatedName("aj.d(I)Ljava/util/HashMap;")
    public HashMap method514() {
        this.method541();
        return this.field314;
    }

    @ObfuscatedName("aj.z(I)V")
    public void method541() {
        if (this.field314 == null) {
            this.field314 = new HashMap();
        }
        this.field314.clear();
        for (int var1 = 0; var1 < this.field321.length; var1++) {
            for (int var2 = 0; var2 < this.field321[var1].length; var2++) {
                List var3 = this.field321[var1][var2].method360();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method483()) {
                        int var6 = var5.method166();
                        if (this.field314.containsKey(var6)) {
                            List var8 = (List) this.field314.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field314.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.s(III)F")
    public float method546(int arg0, int arg1) {
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
