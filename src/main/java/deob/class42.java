package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aw")
public final class class42 {

    @ObfuscatedName("aw.m")
    public boolean field532 = false;

    @ObfuscatedName("aw.p")
    public boolean field520 = false;

    @ObfuscatedName("aw.i")
    public class45 field521;

    @ObfuscatedName("aw.j")
    public class295 field522;

    @ObfuscatedName("aw.v")
    public HashMap field530;

    @ObfuscatedName("aw.x")
    public class35[][] field524;

    @ObfuscatedName("aw.e")
    public HashMap field538 = new HashMap();

    @ObfuscatedName("aw.l")
    public class294[] field526;

    @ObfuscatedName("aw.b")
    public final HashMap field531;

    @ObfuscatedName("aw.n")
    public int field528;

    @ObfuscatedName("aw.c")
    public int field519;

    @ObfuscatedName("aw.a")
    public int field527;

    @ObfuscatedName("aw.y")
    public int field533;

    public class42(class294[] arg0, HashMap arg1) {
        this.field526 = arg0;
        this.field531 = arg1;
    }

    @ObfuscatedName("aw.m(Lik;Ljava/lang/String;ZI)V")
    public void method537(class243 arg0, String arg1, boolean arg2) {
        if (this.field520) {
            return;
        }
        this.field532 = false;
        this.field520 = true;
        System.nanoTime();
        int var4 = arg0.method3985(class41.field515.field513);
        int var5 = arg0.method3947(var4, arg1);
        class181 var6 = new class181(arg0.method3959(class41.field515.field513, arg1));
        class181 var7 = new class181(arg0.method3959(class41.field511.field513, arg1));
        class181 var8 = new class181(arg0.method3959(arg1, class41.field516.field513));
        System.nanoTime();
        System.nanoTime();
        this.field521 = new class45();
        try {
            this.field521.method587(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field521.method287();
        this.field521.method276();
        this.field521.method288();
        this.field528 = this.field521.method282() * 64;
        this.field519 = this.field521.method284() * 64;
        this.field527 = (this.field521.method283() - this.field521.method282() + 1) * 64;
        this.field533 = (this.field521.method285() - this.field521.method284() + 1) * 64;
        int var10 = this.field521.method283() - this.field521.method282() + 1;
        int var11 = this.field521.method285() - this.field521.method284() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field524 = new class35[var10][var11];
        Iterator var12 = this.field521.field555.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field400;
            int var15 = var13.field393;
            int var16 = var14 - this.field521.method282();
            int var17 = var15 - this.field521.method284();
            this.field524[var16][var17] = new class35(var14, var15, this.field521.method280(), this.field531);
            this.field524[var16][var17].method359(var13, this.field521.field557);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field524[var18][var19] == null) {
                    this.field524[var18][var19] = new class35(this.field521.method282() + var18, this.field521.method284() + var19, this.field521.method280(), this.field531);
                    this.field524[var18][var19].method393(this.field521.field559, this.field521.field557);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3948(class41.field510.field513, arg1)) {
            byte[] var20 = arg0.method3959(class41.field510.field513, arg1);
            this.field522 = class55.method3905(var20);
        }
        System.nanoTime();
        this.field532 = true;
    }

    @ObfuscatedName("aw.p(I)V")
    public final void method533() {
        this.field530 = null;
    }

    @ObfuscatedName("aw.i(IIIIIIIII)V")
    public final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3819;
        int var10 = Statics.field3814;
        int var11 = Statics.field3817;
        int[] var12 = new int[4];
        class291.method4766(var12);
        class30 var13 = this.method539(arg0, arg1, arg2, arg3);
        float var14 = this.method543(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field538.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method646();
            this.field538.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field406; var18 < var13.field406 + var13.field405; var18++) {
            for (int var19 = var13.field407; var19 < var13.field408 + var13.field407; var19++) {
                this.method562(var18, var19, var17);
                this.field524[var18][var19].method363(var15, (class47) this.field538.get(var15), var17, this.field526);
            }
        }
        class291.method4767(var9, var10, var11);
        class291.method4791(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field528 + arg0;
        int var22 = this.field519 + arg1;
        for (int var23 = var13.field406; var23 < var13.field406 + var13.field405; var23++) {
            for (int var24 = var13.field407; var24 < var13.field408 + var13.field407; var24++) {
                this.field524[var23][var24].method445((this.field524[var23][var24].field453 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field524[var23][var24].field452 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("aw.j(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method539(arg0, arg1, arg2, arg3);
        float var15 = this.method543(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field528 + arg0;
        int var18 = this.field519 + arg1;
        for (int var19 = var14.field406; var19 < var14.field406 + var14.field405; var19++) {
            for (int var20 = var14.field407; var20 < var14.field408 + var14.field407; var20++) {
                if (arg12) {
                    this.field524[var19][var20].method491();
                }
                this.field524[var19][var20].method364((this.field524[var19][var20].field453 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field524[var19][var20].field452 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field406; var21 < var14.field406 + var14.field405; var21++) {
            for (int var22 = var14.field407; var22 < var14.field408 + var14.field407; var22++) {
                this.field524[var21][var22].method391(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aw.v(II[Lak;B)V")
    public void method562(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field524.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field524[0].length - 1;
        if (var7) {
            arg2[class236.field3218.method9()] = null;
        } else {
            arg2[class236.field3218.method9()] = this.field524[arg0][arg1 + 1];
        }
        arg2[class236.field3220.method9()] = var7 || var5 ? null : this.field524[arg0 + 1][arg1 + 1];
        arg2[class236.field3225.method9()] = var7 || var4 ? null : this.field524[arg0 - 1][arg1 + 1];
        arg2[class236.field3226.method9()] = var5 ? null : this.field524[arg0 + 1][arg1];
        arg2[class236.field3224.method9()] = var4 ? null : this.field524[arg0 - 1][arg1];
        arg2[class236.field3222.method9()] = var6 ? null : this.field524[arg0][arg1 - 1];
        arg2[class236.field3221.method9()] = var6 || var5 ? null : this.field524[arg0 + 1][arg1 - 1];
        arg2[class236.field3223.method9()] = var6 || var4 ? null : this.field524[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("aw.x(IIIILjava/util/HashSet;III)V")
    public void method577(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field522 == null) {
            return;
        }
        this.field522.method4909(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field530 == null) {
            this.method542();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field530.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field500.field2692 - this.field528) * arg2 / this.field527;
                int var14 = arg3 - (var12.field500.field2691 - this.field519) * arg3 / this.field533;
                class291.method4774(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aw.e(IIIIIIIIIIB)Ljava/util/List;")
    public List method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field532) {
            return var11;
        }
        class30 var12 = this.method539(arg0, arg1, arg2, arg3);
        float var13 = this.method543(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field528 + arg0;
        int var16 = this.field519 + arg1;
        for (int var17 = var12.field406; var17 < var12.field406 + var12.field405; var17++) {
            for (int var18 = var12.field407; var18 < var12.field408 + var12.field407; var18++) {
                List var19 = this.field524[var17][var18].method394((this.field524[var17][var18].field453 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field524[var17][var18].field452 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aw.l(IIIII)Lab;")
    public class30 method539(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field528 + arg0;
        int var7 = this.field519 + arg1;
        int var8 = this.field528 + arg2;
        int var9 = this.field519 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field405 = var12 - var10 + 1;
        var5.field408 = var13 - var11 + 1;
        var5.field406 = var10 - this.field521.method282();
        var5.field407 = var11 - this.field521.method284();
        if (var5.field406 < 0) {
            var5.field405 += var5.field406;
            var5.field406 = 0;
        }
        if (var5.field406 > this.field524.length - var5.field405) {
            var5.field405 = this.field524.length - var5.field406;
        }
        if (var5.field407 < 0) {
            var5.field408 += var5.field407;
            var5.field407 = 0;
        }
        if (var5.field407 > this.field524[0].length - var5.field408) {
            var5.field408 = this.field524[0].length - var5.field407;
        }
        var5.field405 = Math.min(var5.field405, this.field524.length);
        var5.field408 = Math.min(var5.field408, this.field524[0].length);
        return var5;
    }

    @ObfuscatedName("aw.b(I)Z")
    public boolean method540() {
        return this.field532;
    }

    @ObfuscatedName("aw.n(I)Ljava/util/HashMap;")
    public HashMap method541() {
        this.method542();
        return this.field530;
    }

    @ObfuscatedName("aw.c(I)V")
    public void method542() {
        if (this.field530 == null) {
            this.field530 = new HashMap();
        }
        this.field530.clear();
        for (int var1 = 0; var1 < this.field524.length; var1++) {
            for (int var2 = 0; var2 < this.field524[var1].length; var2++) {
                List var3 = this.field524[var1][var2].method425();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field530.containsKey(var5.field509)) {
                        List var7 = (List) this.field530.get(var5.field509);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field530.put(var5.field509, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.a(III)F")
    public float method543(int arg0, int arg1) {
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
