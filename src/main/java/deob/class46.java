package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public final class class46 {

    @ObfuscatedName("aj.x")
    public boolean field364 = false;

    @ObfuscatedName("aj.m")
    public boolean field351 = false;

    @ObfuscatedName("aj.k")
    public class48 field353;

    @ObfuscatedName("aj.d")
    public class335 field366;

    @ObfuscatedName("aj.w")
    public HashMap field355;

    @ObfuscatedName("aj.v")
    public class39[][] field356;

    @ObfuscatedName("aj.q")
    public HashMap field360 = new HashMap();

    @ObfuscatedName("aj.z")
    public class334[] field358;

    @ObfuscatedName("aj.t")
    public final class244 field359;

    @ObfuscatedName("aj.e")
    public final class244 field352;

    @ObfuscatedName("aj.s")
    public final HashMap field361;

    @ObfuscatedName("aj.p")
    public int field362;

    @ObfuscatedName("aj.n")
    public int field363;

    @ObfuscatedName("aj.u")
    public int field354;

    @ObfuscatedName("aj.h")
    public int field365;

    @ObfuscatedName("aj.g")
    public int field357 = 0;

    public class46(class334[] arg0, HashMap arg1, class244 arg2, class244 arg3) {
        this.field358 = arg0;
        this.field361 = arg1;
        this.field359 = arg2;
        this.field352 = arg3;
    }

    @ObfuscatedName("aj.x(Liy;Ljava/lang/String;ZI)V")
    public void method617(class244 arg0, String arg1, boolean arg2) {
        if (this.field351) {
            return;
        }
        this.field364 = false;
        this.field351 = true;
        System.nanoTime();
        int var4 = arg0.method3885(class45.field340.field345);
        int var5 = arg0.method3878(var4, arg1);
        class310 var6 = new class310(arg0.method3868(class45.field340.field345, arg1));
        class310 var7 = new class310(arg0.method3868(class45.field341.field345, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field353 = new class48();
        try {
            this.field353.method644(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field353.method385();
        this.field353.method424();
        this.field353.method375();
        this.field362 = this.field353.method381() * 64;
        this.field363 = this.field353.method367() * 64;
        this.field354 = (this.field353.method382() - this.field353.method381() + 1) * 64;
        this.field365 = (this.field353.method370() - this.field353.method367() + 1) * 64;
        int var9 = this.field353.method382() - this.field353.method381() + 1;
        int var10 = this.field353.method370() - this.field353.method367() + 1;
        System.nanoTime();
        System.nanoTime();
        class39.method1661();
        this.field356 = new class39[var9][var10];
        Iterator var11 = this.field353.field373.iterator();
        while (var11.hasNext()) {
            class25 var12 = (class25) var11.next();
            int var13 = var12.field198;
            int var14 = var12.field199;
            int var15 = var13 - this.field353.method381();
            int var16 = var14 - this.field353.method367();
            this.field356[var15][var16] = new class39(var13, var14, this.field353.method379(), this.field361);
            this.field356[var15][var16].method448(var12, this.field353.field372);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field356[var17][var18] == null) {
                    this.field356[var17][var18] = new class39(this.field353.method381() + var17, this.field353.method367() + var18, this.field353.method379(), this.field361);
                    this.field356[var17][var18].method489(this.field353.field371, this.field353.field372);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3944(class45.field342.field345, arg1)) {
            byte[] var19 = arg0.method3868(class45.field342.field345, arg1);
            this.field366 = class59.method3428(var19);
        }
        System.nanoTime();
        arg0.method3881();
        arg0.method3918();
        this.field364 = true;
    }

    @ObfuscatedName("aj.m(I)V")
    public final void method625() {
        this.field355 = null;
    }

    @ObfuscatedName("aj.k(IIIIIIIIB)V")
    public final void method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3865;
        int var10 = Statics.field3866;
        int var11 = Statics.field3864;
        int[] var12 = new int[4];
        class331.method5601(var12);
        class32 var13 = this.method615(arg0, arg1, arg2, arg3);
        float var14 = this.method619(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field357 = var15;
        if (!this.field360.containsKey(var15)) {
            class50 var16 = new class50(var15);
            var16.method688();
            this.field360.put(var15, var16);
        }
        int var17 = var13.field219 + var13.field216 - 1;
        int var18 = var13.field224 + var13.field220 - 1;
        for (int var19 = var13.field219; var19 <= var17; var19++) {
            for (int var20 = var13.field220; var20 <= var18; var20++) {
                this.field356[var19][var20].method456(var15, (class50) this.field360.get(var15), this.field358, this.field359, this.field352);
            }
        }
        class331.method5597(var9, var10, var11);
        class331.method5602(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field362 + arg0;
        int var23 = this.field363 + arg1;
        for (int var24 = var13.field219; var24 < var13.field219 + var13.field216; var24++) {
            for (int var25 = var13.field220; var25 < var13.field224 + var13.field220; var25++) {
                this.field356[var24][var25].method447((this.field356[var24][var25].field284 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field356[var24][var25].field285 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("aj.d(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class32 var14 = this.method615(arg0, arg1, arg2, arg3);
        float var15 = this.method619(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field362 + arg0;
        int var18 = this.field363 + arg1;
        for (int var19 = var14.field219; var19 < var14.field219 + var14.field216; var19++) {
            for (int var20 = var14.field220; var20 < var14.field224 + var14.field220; var20++) {
                if (arg12) {
                    this.field356[var19][var20].method509();
                }
                this.field356[var19][var20].method457((this.field356[var19][var20].field284 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field356[var19][var20].field285 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field219; var21 < var14.field219 + var14.field216; var21++) {
            for (int var22 = var14.field220; var22 < var14.field224 + var14.field220; var22++) {
                this.field356[var21][var22].method546(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aj.w(IIIILjava/util/HashSet;IIB)V")
    public void method621(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field366 == null) {
            return;
        }
        this.field366.method5733(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field355 == null) {
            this.method616();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field355.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class44 var12 = (class44) var11.next();
                int var13 = (var12.field327.field2533 - this.field362) * arg2 / this.field354;
                int var14 = arg3 - (var12.field327.field2530 - this.field363) * arg3 / this.field365;
                class331.method5664(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aj.v(IIIIIIIIIII)Ljava/util/List;")
    public List method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field364) {
            return var11;
        }
        class32 var12 = this.method615(arg0, arg1, arg2, arg3);
        float var13 = this.method619(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field362 + arg0;
        int var16 = this.field363 + arg1;
        for (int var17 = var12.field219; var17 < var12.field219 + var12.field216; var17++) {
            for (int var18 = var12.field220; var18 < var12.field224 + var12.field220; var18++) {
                List var19 = this.field356[var17][var18].method534((this.field356[var17][var18].field284 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field356[var17][var18].field285 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aj.q(IIIII)Lar;")
    public class32 method615(int arg0, int arg1, int arg2, int arg3) {
        class32 var5 = new class32(this);
        int var6 = this.field362 + arg0;
        int var7 = this.field363 + arg1;
        int var8 = this.field362 + arg2;
        int var9 = this.field363 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field216 = var12 - var10 + 1;
        var5.field224 = var13 - var11 + 1;
        var5.field219 = var10 - this.field353.method381();
        var5.field220 = var11 - this.field353.method367();
        if (var5.field219 < 0) {
            var5.field216 += var5.field219;
            var5.field219 = 0;
        }
        if (var5.field219 > this.field356.length - var5.field216) {
            var5.field216 = this.field356.length - var5.field219;
        }
        if (var5.field220 < 0) {
            var5.field224 += var5.field220;
            var5.field220 = 0;
        }
        if (var5.field220 > this.field356[0].length - var5.field224) {
            var5.field224 = this.field356[0].length - var5.field220;
        }
        var5.field216 = Math.min(var5.field216, this.field356.length);
        var5.field224 = Math.min(var5.field224, this.field356[0].length);
        return var5;
    }

    @ObfuscatedName("aj.z(B)Z")
    public boolean method635() {
        return this.field364;
    }

    @ObfuscatedName("aj.t(B)Ljava/util/HashMap;")
    public HashMap method611() {
        this.method616();
        return this.field355;
    }

    @ObfuscatedName("aj.e(I)V")
    public void method616() {
        if (this.field355 == null) {
            this.field355 = new HashMap();
        }
        this.field355.clear();
        for (int var1 = 0; var1 < this.field356.length; var1++) {
            for (int var2 = 0; var2 < this.field356[var1].length; var2++) {
                List var3 = this.field356[var1][var2].method479();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class44 var5 = (class44) var4.next();
                    if (var5.method590()) {
                        int var6 = var5.method264();
                        if (this.field355.containsKey(var6)) {
                            List var8 = (List) this.field355.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field355.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.s(III)F")
    public float method619(int arg0, int arg1) {
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
