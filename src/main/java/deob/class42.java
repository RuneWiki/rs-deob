package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("am")
public final class class42 {

    @ObfuscatedName("am.j")
    public boolean field573 = false;

    @ObfuscatedName("am.h")
    public boolean field562 = false;

    @ObfuscatedName("am.f")
    public class45 field563;

    @ObfuscatedName("am.p")
    public class287 field574;

    @ObfuscatedName("am.x")
    public HashMap field565;

    @ObfuscatedName("am.g")
    public class35[][] field566;

    @ObfuscatedName("am.c")
    public HashMap field567 = new HashMap();

    @ObfuscatedName("am.l")
    public class286[] field568;

    @ObfuscatedName("am.w")
    public final HashMap field569;

    @ObfuscatedName("am.b")
    public int field570;

    @ObfuscatedName("am.o")
    public int field571;

    @ObfuscatedName("am.m")
    public int field561;

    @ObfuscatedName("am.i")
    public int field572;

    public class42(class286[] arg0, HashMap arg1) {
        this.field568 = arg0;
        this.field569 = arg1;
    }

    @ObfuscatedName("am.j(Lia;Ljava/lang/String;ZI)V")
    public void method516(class237 arg0, String arg1, boolean arg2) {
        if (this.field562) {
            return;
        }
        this.field573 = false;
        this.field562 = true;
        System.nanoTime();
        int var4 = arg0.method3789(class41.field560.field552);
        int var5 = arg0.method3826(var4, arg1);
        class175 var6 = new class175(arg0.method3866(class41.field560.field552, arg1));
        class175 var7 = new class175(arg0.method3866(class41.field551.field552, arg1));
        class175 var8 = new class175(arg0.method3866(arg1, class41.field553.field552));
        System.nanoTime();
        System.nanoTime();
        this.field563 = new class45();
        try {
            this.field563.method572(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field563.method286();
        this.field563.method276();
        this.field563.method277();
        this.field570 = this.field563.method271() * 64;
        this.field571 = this.field563.method288() * 64;
        this.field561 = (this.field563.method315() - this.field563.method271() + 1) * 64;
        this.field572 = (this.field563.method317() - this.field563.method288() + 1) * 64;
        int var10 = this.field563.method315() - this.field563.method271() + 1;
        int var11 = this.field563.method317() - this.field563.method288() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field566 = new class35[var10][var11];
        Iterator var12 = this.field563.field589.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field417;
            int var15 = var13.field412;
            int var16 = var14 - this.field563.method271();
            int var17 = var15 - this.field563.method288();
            this.field566[var16][var17] = new class35(var14, var15, this.field563.method269(), this.field569);
            this.field566[var16][var17].method339(var13, this.field563.field586);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field566[var18][var19] == null) {
                    this.field566[var18][var19] = new class35(this.field563.method271() + var18, this.field563.method288() + var19, this.field563.method269(), this.field569);
                    this.field566[var18][var19].method340(this.field563.field588, this.field563.field586);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3851(class41.field555.field552, arg1)) {
            byte[] var20 = arg0.method3866(class41.field555.field552, arg1);
            this.field574 = class55.method1696(var20);
        }
        System.nanoTime();
        this.field573 = true;
    }

    @ObfuscatedName("am.h(I)V")
    public final void method540() {
        this.field565 = null;
    }

    @ObfuscatedName("am.f(IIIIIIIII)V")
    public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3749;
        int var10 = Statics.field3744;
        int var11 = Statics.field3745;
        int[] var12 = new int[4];
        class283.method4595(var12);
        class30 var13 = this.method513(arg0, arg1, arg2, arg3);
        float var14 = this.method532(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field567.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method619();
            this.field567.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field429; var18 < var13.field429 + var13.field428; var18++) {
            for (int var19 = var13.field433; var19 < var13.field434 + var13.field433; var19++) {
                this.method510(var18, var19, var17);
                this.field566[var18][var19].method343(var15, (class47) this.field567.get(var15), var17, this.field568);
            }
        }
        class283.method4591(var9, var10, var11);
        class283.method4596(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field570 + arg0;
        int var22 = this.field571 + arg1;
        for (int var23 = var13.field429; var23 < var13.field429 + var13.field428; var23++) {
            for (int var24 = var13.field433; var24 < var13.field434 + var13.field433; var24++) {
                this.field566[var23][var24].method338((this.field566[var23][var24].field501 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field566[var23][var24].field487 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("am.p(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method513(arg0, arg1, arg2, arg3);
        float var15 = this.method532(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field570 + arg0;
        int var18 = this.field571 + arg1;
        for (int var19 = var14.field429; var19 < var14.field429 + var14.field428; var19++) {
            for (int var20 = var14.field433; var20 < var14.field434 + var14.field433; var20++) {
                if (arg12) {
                    this.field566[var19][var20].method367();
                }
                this.field566[var19][var20].method425((this.field566[var19][var20].field501 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field566[var19][var20].field487 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field429; var21 < var14.field429 + var14.field428; var21++) {
            for (int var22 = var14.field433; var22 < var14.field434 + var14.field433; var22++) {
                this.field566[var21][var22].method345(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("am.x(II[Lae;I)V")
    public void method510(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field566.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field566[0].length - 1;
        if (var7) {
            arg2[class230.field3151.method9()] = null;
        } else {
            arg2[class230.field3151.method9()] = this.field566[arg0][arg1 + 1];
        }
        arg2[class230.field3144.method9()] = var7 || var5 ? null : this.field566[arg0 + 1][arg1 + 1];
        arg2[class230.field3149.method9()] = var7 || var4 ? null : this.field566[arg0 - 1][arg1 + 1];
        arg2[class230.field3145.method9()] = var5 ? null : this.field566[arg0 + 1][arg1];
        arg2[class230.field3154.method9()] = var4 ? null : this.field566[arg0 - 1][arg1];
        arg2[class230.field3147.method9()] = var6 ? null : this.field566[arg0][arg1 - 1];
        arg2[class230.field3146.method9()] = var6 || var5 ? null : this.field566[arg0 + 1][arg1 - 1];
        arg2[class230.field3148.method9()] = var6 || var4 ? null : this.field566[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("am.g(IIIILjava/util/HashSet;IIB)V")
    public void method511(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field574 == null) {
            return;
        }
        this.field574.method4742(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field565 == null) {
            this.method535();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field565.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field543.field2609 - this.field570) * arg2 / this.field561;
                int var14 = arg3 - (var12.field543.field2611 - this.field571) * arg3 / this.field572;
                class283.method4599(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("am.c(IIIIIIIIIIB)Ljava/util/List;")
    public List method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field573) {
            return var11;
        }
        class30 var12 = this.method513(arg0, arg1, arg2, arg3);
        float var13 = this.method532(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field570 + arg0;
        int var16 = this.field571 + arg1;
        for (int var17 = var12.field429; var17 < var12.field429 + var12.field428; var17++) {
            for (int var18 = var12.field433; var18 < var12.field434 + var12.field433; var18++) {
                List var19 = this.field566[var17][var18].method374((this.field566[var17][var18].field501 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field566[var17][var18].field487 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("am.l(IIIIB)Lar;")
    public class30 method513(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field570 + arg0;
        int var7 = this.field571 + arg1;
        int var8 = this.field570 + arg2;
        int var9 = this.field571 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field428 = var12 - var10 + 1;
        var5.field434 = var13 - var11 + 1;
        var5.field429 = var10 - this.field563.method271();
        var5.field433 = var11 - this.field563.method288();
        if (var5.field429 < 0) {
            var5.field428 += var5.field429;
            var5.field429 = 0;
        }
        if (var5.field429 > this.field566.length - var5.field428) {
            var5.field428 = this.field566.length - var5.field429;
        }
        if (var5.field433 < 0) {
            var5.field434 += var5.field433;
            var5.field433 = 0;
        }
        if (var5.field433 > this.field566[0].length - var5.field434) {
            var5.field434 = this.field566[0].length - var5.field433;
        }
        var5.field428 = Math.min(var5.field428, this.field566.length);
        var5.field434 = Math.min(var5.field434, this.field566[0].length);
        return var5;
    }

    @ObfuscatedName("am.w(B)Z")
    public boolean method514() {
        return this.field573;
    }

    @ObfuscatedName("am.b(I)Ljava/util/HashMap;")
    public HashMap method515() {
        this.method535();
        return this.field565;
    }

    @ObfuscatedName("am.o(B)V")
    public void method535() {
        if (this.field565 == null) {
            this.field565 = new HashMap();
        }
        this.field565.clear();
        for (int var1 = 0; var1 < this.field566.length; var1++) {
            for (int var2 = 0; var2 < this.field566[var1].length; var2++) {
                List var3 = this.field566[var1][var2].method375();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field565.containsKey(var5.field545)) {
                        List var7 = (List) this.field565.get(var5.field545);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field565.put(var5.field545, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.m(III)F")
    public float method532(int arg0, int arg1) {
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
