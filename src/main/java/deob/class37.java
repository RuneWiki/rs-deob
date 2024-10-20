package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ar")
public final class class37 {

    @ObfuscatedName("ar.u")
    public boolean field321 = false;

    @ObfuscatedName("ar.f")
    public boolean field313 = false;

    @ObfuscatedName("ar.b")
    public class39 field324;

    @ObfuscatedName("ar.g")
    public class325 field315;

    @ObfuscatedName("ar.z")
    public HashMap field316;

    @ObfuscatedName("ar.p")
    public class30[][] field312;

    @ObfuscatedName("ar.h")
    public HashMap field317 = new HashMap();

    @ObfuscatedName("ar.y")
    public class324[] field319;

    @ObfuscatedName("ar.w")
    public final class234 field322;

    @ObfuscatedName("ar.i")
    public final class234 field318;

    @ObfuscatedName("ar.k")
    public final HashMap field323;

    @ObfuscatedName("ar.x")
    public int field320;

    @ObfuscatedName("ar.o")
    public int field314;

    @ObfuscatedName("ar.e")
    public int field325;

    @ObfuscatedName("ar.n")
    public int field326;

    @ObfuscatedName("ar.r")
    public int field327 = 0;

    public class37(class324[] arg0, HashMap arg1, class234 arg2, class234 arg3) {
        this.field319 = arg0;
        this.field323 = arg1;
        this.field322 = arg2;
        this.field318 = arg3;
    }

    @ObfuscatedName("ar.u(Lhf;Ljava/lang/String;ZB)V")
    public void method540(class234 arg0, String arg1, boolean arg2) {
        if (this.field313) {
            return;
        }
        this.field321 = false;
        this.field313 = true;
        System.nanoTime();
        int var4 = arg0.method3917(class36.field305.field303);
        int var5 = arg0.method3901(var4, arg1);
        class300 var6 = new class300(arg0.method3864(class36.field305.field303, arg1));
        class300 var7 = new class300(arg0.method3864(class36.field304.field303, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field324 = new class39();
        try {
            this.field324.method578(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field324.method310();
        this.field324.method311();
        this.field324.method293();
        this.field320 = this.field324.method306() * 64;
        this.field314 = this.field324.method308() * 64;
        this.field325 = (this.field324.method307() - this.field324.method306() + 1) * 64;
        this.field326 = (this.field324.method309() - this.field324.method308() + 1) * 64;
        int var9 = this.field324.method307() - this.field324.method306() + 1;
        int var10 = this.field324.method309() - this.field324.method308() + 1;
        System.nanoTime();
        System.nanoTime();
        Statics.method146();
        this.field312 = new class30[var9][var10];
        Iterator var11 = this.field324.field333.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field159;
            int var14 = var12.field157;
            int var15 = var13 - this.field324.method306();
            int var16 = var14 - this.field324.method308();
            this.field312[var15][var16] = new class30(var13, var14, this.field324.method356(), this.field323);
            this.field312[var15][var16].method423(var12, this.field324.field332);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field312[var17][var18] == null) {
                    this.field312[var17][var18] = new class30(this.field324.method306() + var17, this.field324.method308() + var18, this.field324.method356(), this.field323);
                    this.field312[var17][var18].method375(this.field324.field330, this.field324.field332);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3863(class36.field308.field303, arg1)) {
            byte[] var19 = arg0.method3864(class36.field308.field303, arg1);
            this.field315 = class50.method963(var19);
        }
        System.nanoTime();
        arg0.method3857();
        arg0.method3859();
        this.field321 = true;
    }

    @ObfuscatedName("ar.f(B)V")
    public final void method541() {
        this.field316 = null;
    }

    @ObfuscatedName("ar.b(IIIIIIIII)V")
    public final void method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3845;
        int var10 = Statics.field3848;
        int var11 = Statics.field3846;
        int[] var12 = new int[4];
        class321.method5632(var12);
        class23 var13 = this.method546(arg0, arg1, arg2, arg3);
        float var14 = this.method549(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field327 = var15;
        if (!this.field317.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method634();
            this.field317.put(var15, var16);
        }
        int var17 = var13.field178 + var13.field176 - 1;
        int var18 = var13.field179 + var13.field175 - 1;
        for (int var19 = var13.field176; var19 <= var17; var19++) {
            for (int var20 = var13.field179; var20 <= var18; var20++) {
                this.field312[var19][var20].method381(var15, (class41) this.field317.get(var15), this.field319, this.field322, this.field318);
            }
        }
        class321.method5634(var9, var10, var11);
        class321.method5591(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field320 + arg0;
        int var23 = this.field314 + arg1;
        for (int var24 = var13.field176; var24 < var13.field178 + var13.field176; var24++) {
            for (int var25 = var13.field179; var25 < var13.field179 + var13.field175; var25++) {
                this.field312[var24][var25].method396((this.field312[var24][var25].field243 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field312[var24][var25].field248 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ar.g(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method546(arg0, arg1, arg2, arg3);
        float var15 = this.method549(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field320 + arg0;
        int var18 = this.field314 + arg1;
        for (int var19 = var14.field176; var19 < var14.field178 + var14.field176; var19++) {
            for (int var20 = var14.field179; var20 < var14.field179 + var14.field175; var20++) {
                if (arg12) {
                    this.field312[var19][var20].method378();
                }
                this.field312[var19][var20].method382((this.field312[var19][var20].field243 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field312[var19][var20].field248 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field176; var21 < var14.field178 + var14.field176; var21++) {
            for (int var22 = var14.field179; var22 < var14.field179 + var14.field175; var22++) {
                this.field312[var21][var22].method463(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ar.z(IIIILjava/util/HashSet;IIB)V")
    public void method574(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field315 == null) {
            return;
        }
        this.field315.method5693(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field316 == null) {
            this.method575();
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
                int var13 = (var12.field294.field2536 - this.field320) * arg2 / this.field325;
                int var14 = arg3 - (var12.field294.field2535 - this.field314) * arg3 / this.field326;
                class321.method5633(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ar.p(IIIIIIIIIIB)Ljava/util/List;")
    public List method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field321) {
            return var11;
        }
        class23 var12 = this.method546(arg0, arg1, arg2, arg3);
        float var13 = this.method549(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field320 + arg0;
        int var16 = this.field314 + arg1;
        for (int var17 = var12.field176; var17 < var12.field178 + var12.field176; var17++) {
            for (int var18 = var12.field179; var18 < var12.field179 + var12.field175; var18++) {
                List var19 = this.field312[var17][var18].method403((this.field312[var17][var18].field243 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field312[var17][var18].field248 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ar.h(IIIII)Lv;")
    public class23 method546(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field320 + arg0;
        int var7 = this.field314 + arg1;
        int var8 = this.field320 + arg2;
        int var9 = this.field314 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field178 = var12 - var10 + 1;
        var5.field175 = var13 - var11 + 1;
        var5.field176 = var10 - this.field324.method306();
        var5.field179 = var11 - this.field324.method308();
        if (var5.field176 < 0) {
            var5.field178 += var5.field176;
            var5.field176 = 0;
        }
        if (var5.field176 > this.field312.length - var5.field178) {
            var5.field178 = this.field312.length - var5.field176;
        }
        if (var5.field179 < 0) {
            var5.field175 += var5.field179;
            var5.field179 = 0;
        }
        if (var5.field179 > this.field312[0].length - var5.field175) {
            var5.field175 = this.field312[0].length - var5.field179;
        }
        var5.field178 = Math.min(var5.field178, this.field312.length);
        var5.field175 = Math.min(var5.field175, this.field312[0].length);
        return var5;
    }

    @ObfuscatedName("ar.y(I)Z")
    public boolean method573() {
        return this.field321;
    }

    @ObfuscatedName("ar.w(B)Ljava/util/HashMap;")
    public HashMap method570() {
        this.method575();
        return this.field316;
    }

    @ObfuscatedName("ar.i(I)V")
    public void method575() {
        if (this.field316 == null) {
            this.field316 = new HashMap();
        }
        this.field316.clear();
        for (int var1 = 0; var1 < this.field312.length; var1++) {
            for (int var2 = 0; var2 < this.field312[var1].length; var2++) {
                List var3 = this.field312[var1][var2].method404();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method523()) {
                        int var6 = var5.method191();
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

    @ObfuscatedName("ar.k(III)F")
    public float method549(int arg0, int arg1) {
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
