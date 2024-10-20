package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ay")
public final class class42 {

    @ObfuscatedName("ay.d")
    public boolean field530 = false;

    @ObfuscatedName("ay.q")
    public boolean field521 = false;

    @ObfuscatedName("ay.x")
    public class45 field522;

    @ObfuscatedName("ay.y")
    public class286 field523;

    @ObfuscatedName("ay.e")
    public HashMap field525;

    @ObfuscatedName("ay.f")
    public class35[][] field524;

    @ObfuscatedName("ay.v")
    public HashMap field526 = new HashMap();

    @ObfuscatedName("ay.t")
    public class285[] field527;

    @ObfuscatedName("ay.i")
    public final HashMap field536;

    @ObfuscatedName("ay.r")
    public int field529;

    @ObfuscatedName("ay.g")
    public int field528;

    @ObfuscatedName("ay.s")
    public int field532;

    @ObfuscatedName("ay.o")
    public int field531;

    public class42(class285[] arg0, HashMap arg1) {
        this.field527 = arg0;
        this.field536 = arg1;
    }

    @ObfuscatedName("ay.d(Lim;Ljava/lang/String;ZI)V")
    public void method512(class236 arg0, String arg1, boolean arg2) {
        if (this.field521) {
            return;
        }
        this.field530 = false;
        this.field521 = true;
        System.nanoTime();
        int var4 = arg0.method3766(class41.field516.field511);
        int var5 = arg0.method3767(var4, arg1);
        class174 var6 = new class174(arg0.method3769(class41.field516.field511, arg1));
        class174 var7 = new class174(arg0.method3769(class41.field517.field511, arg1));
        class174 var8 = new class174(arg0.method3769(arg1, class41.field513.field511));
        System.nanoTime();
        System.nanoTime();
        this.field522 = new class45();
        try {
            this.field522.method548(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field522.method255();
        this.field522.method259();
        this.field522.method257();
        this.field529 = this.field522.method252() * 64;
        this.field528 = this.field522.method282() * 64;
        this.field532 = (this.field522.method253() - this.field522.method252() + 1) * 64;
        this.field531 = (this.field522.method239() - this.field522.method282() + 1) * 64;
        int var10 = this.field522.method253() - this.field522.method252() + 1;
        int var11 = this.field522.method239() - this.field522.method282() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field524 = new class35[var10][var11];
        Iterator var12 = this.field522.field547.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field385;
            int var15 = var13.field381;
            int var16 = var14 - this.field522.method252();
            int var17 = var15 - this.field522.method282();
            this.field524[var16][var17] = new class35(var14, var15, this.field522.method250(), this.field536);
            this.field524[var16][var17].method322(var13, this.field522.field551);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field524[var18][var19] == null) {
                    this.field524[var18][var19] = new class35(this.field522.method252() + var18, this.field522.method282() + var19, this.field522.method250(), this.field536);
                    this.field524[var18][var19].method384(this.field522.field548, this.field522.field551);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3787(class41.field512.field511, arg1)) {
            byte[] var20 = arg0.method3769(class41.field512.field511, arg1);
            this.field523 = Statics.method988(var20);
        }
        System.nanoTime();
        this.field530 = true;
    }

    @ObfuscatedName("ay.q(I)V")
    public final void method498() {
        this.field525 = null;
    }

    @ObfuscatedName("ay.x(IIIIIIIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3744;
        int var10 = Statics.field3739;
        int var11 = Statics.field3738;
        int[] var12 = new int[4];
        class282.method4605(var12);
        class30 var13 = this.method497(arg0, arg1, arg2, arg3);
        float var14 = this.method534(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field526.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method601();
            this.field526.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field397; var18 < var13.field397 + var13.field396; var18++) {
            for (int var19 = var13.field395; var19 < var13.field399 + var13.field395; var19++) {
                this.method501(var18, var19, var17);
                this.field524[var18][var19].method396(var15, (class47) this.field526.get(var15), var17, this.field527);
            }
        }
        class282.method4611(var9, var10, var11);
        class282.method4578(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field529 + arg0;
        int var22 = this.field528 + arg1;
        for (int var23 = var13.field397; var23 < var13.field397 + var13.field396; var23++) {
            for (int var24 = var13.field395; var24 < var13.field399 + var13.field395; var24++) {
                this.field524[var23][var24].method321((this.field524[var23][var24].field456 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field524[var23][var24].field466 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ay.y(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method497(arg0, arg1, arg2, arg3);
        float var15 = this.method534(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field529 + arg0;
        int var18 = this.field528 + arg1;
        for (int var19 = var14.field397; var19 < var14.field397 + var14.field396; var19++) {
            for (int var20 = var14.field395; var20 < var14.field399 + var14.field395; var20++) {
                if (arg12) {
                    this.field524[var19][var20].method408();
                }
                this.field524[var19][var20].method327((this.field524[var19][var20].field456 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field524[var19][var20].field466 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field397; var21 < var14.field397 + var14.field396; var21++) {
            for (int var22 = var14.field395; var22 < var14.field399 + var14.field395; var22++) {
                this.field524[var21][var22].method328(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ay.e(II[Lau;I)V")
    public void method501(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field524.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field524[0].length - 1;
        if (var7) {
            arg2[class229.field3138.method8()] = null;
        } else {
            arg2[class229.field3138.method8()] = this.field524[arg0][arg1 + 1];
        }
        arg2[class229.field3129.method8()] = var7 || var5 ? null : this.field524[arg0 + 1][arg1 + 1];
        arg2[class229.field3133.method8()] = var7 || var4 ? null : this.field524[arg0 - 1][arg1 + 1];
        arg2[class229.field3135.method8()] = var5 ? null : this.field524[arg0 + 1][arg1];
        arg2[class229.field3134.method8()] = var4 ? null : this.field524[arg0 - 1][arg1];
        arg2[class229.field3132.method8()] = var6 ? null : this.field524[arg0][arg1 - 1];
        arg2[class229.field3131.method8()] = var6 || var5 ? null : this.field524[arg0 + 1][arg1 - 1];
        arg2[class229.field3140.method8()] = var6 || var4 ? null : this.field524[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ay.f(IIIILjava/util/HashSet;III)V")
    public void method516(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field523 == null) {
            return;
        }
        this.field523.method4673(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field525 == null) {
            this.method507();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field525.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field505.field2592 - this.field529) * arg2 / this.field532;
                int var14 = arg3 - (var12.field505.field2593 - this.field528) * arg3 / this.field531;
                class282.method4549(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ay.v(IIIIIIIIIII)Ljava/util/List;")
    public List method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field530) {
            return var11;
        }
        class30 var12 = this.method497(arg0, arg1, arg2, arg3);
        float var13 = this.method534(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field529 + arg0;
        int var16 = this.field528 + arg1;
        for (int var17 = var12.field397; var17 < var12.field397 + var12.field396; var17++) {
            for (int var18 = var12.field395; var18 < var12.field399 + var12.field395; var18++) {
                List var19 = this.field524[var17][var18].method357((this.field524[var17][var18].field456 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field524[var17][var18].field466 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ay.t(IIIII)Lat;")
    public class30 method497(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field529 + arg0;
        int var7 = this.field528 + arg1;
        int var8 = this.field529 + arg2;
        int var9 = this.field528 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field396 = var12 - var10 + 1;
        var5.field399 = var13 - var11 + 1;
        var5.field397 = var10 - this.field522.method252();
        var5.field395 = var11 - this.field522.method282();
        if (var5.field397 < 0) {
            var5.field396 += var5.field397;
            var5.field397 = 0;
        }
        if (var5.field397 > this.field524.length - var5.field396) {
            var5.field396 = this.field524.length - var5.field397;
        }
        if (var5.field395 < 0) {
            var5.field399 += var5.field395;
            var5.field395 = 0;
        }
        if (var5.field395 > this.field524[0].length - var5.field399) {
            var5.field399 = this.field524[0].length - var5.field395;
        }
        var5.field396 = Math.min(var5.field396, this.field524.length);
        var5.field399 = Math.min(var5.field399, this.field524[0].length);
        return var5;
    }

    @ObfuscatedName("ay.i(I)Z")
    public boolean method505() {
        return this.field530;
    }

    @ObfuscatedName("ay.r(I)Ljava/util/HashMap;")
    public HashMap method506() {
        this.method507();
        return this.field525;
    }

    @ObfuscatedName("ay.g(I)V")
    public void method507() {
        if (this.field525 == null) {
            this.field525 = new HashMap();
        }
        this.field525.clear();
        for (int var1 = 0; var1 < this.field524.length; var1++) {
            for (int var2 = 0; var2 < this.field524[var1].length; var2++) {
                List var3 = this.field524[var1][var2].method358();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field525.containsKey(var5.field506)) {
                        List var7 = (List) this.field525.get(var5.field506);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field525.put(var5.field506, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.s(IIB)F")
    public float method534(int arg0, int arg1) {
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
