package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jj")
public final class class242 {

    @ObfuscatedName("jj.am")
    public boolean field2537 = false;

    @ObfuscatedName("jj.ap")
    public boolean field2536 = false;

    @ObfuscatedName("jj.af")
    public class261 field2539;

    @ObfuscatedName("jj.aj")
    public class545 field2545;

    @ObfuscatedName("jj.aq")
    public HashMap field2540;

    @ObfuscatedName("jj.ar")
    public class241[][] field2541;

    @ObfuscatedName("jj.ag")
    public HashMap field2538 = new HashMap();

    @ObfuscatedName("jj.ao")
    public class544[] field2543;

    @ObfuscatedName("jj.ae")
    public final class375 field2544;

    @ObfuscatedName("jj.aa")
    public final class375 field2542;

    @ObfuscatedName("jj.au")
    public final HashMap field2546;

    @ObfuscatedName("jj.an")
    public int field2547;

    @ObfuscatedName("jj.ad")
    public int field2548;

    @ObfuscatedName("jj.ax")
    public int field2549;

    @ObfuscatedName("jj.aw")
    public int field2550;

    @ObfuscatedName("jj.az")
    public int field2551 = 0;

    public class242(class544[] arg0, HashMap arg1, class375 arg2, class375 arg3) {
        this.field2543 = arg0;
        this.field2546 = arg1;
        this.field2544 = arg2;
        this.field2542 = arg3;
    }

    @ObfuscatedName("jj.am(Low;Ljava/lang/String;ZI)V")
    public void method4466(class375 arg0, String arg1, boolean arg2) {
        if (this.field2536) {
            return;
        }
        this.field2537 = false;
        this.field2536 = true;
        System.nanoTime();
        int var4 = arg0.method6412(class259.field2670.field2676);
        int var5 = arg0.method6413(var4, arg1);
        class531 var6 = new class531(arg0.method6415(class259.field2670.field2676, arg1));
        class531 var7 = new class531(arg0.method6415(class259.field2672.field2676, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2539 = new class261();
        try {
            this.field2539.method4609(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2539.method4268();
        this.field2539.method4284();
        this.field2539.method4285();
        this.field2547 = this.field2539.method4279() * 64;
        this.field2548 = this.field2539.method4281() * 64;
        this.field2549 = (this.field2539.method4280() - this.field2539.method4279() + 1) * 64;
        this.field2550 = (this.field2539.method4282() - this.field2539.method4281() + 1) * 64;
        int var9 = this.field2539.method4280() - this.field2539.method4279() + 1;
        int var10 = this.field2539.method4282() - this.field2539.method4281() + 1;
        System.nanoTime();
        System.nanoTime();
        class241.method3939();
        this.field2541 = new class241[var9][var10];
        Iterator var11 = this.field2539.field2680.iterator();
        while (var11.hasNext()) {
            class235 var12 = (class235) var11.next();
            int var13 = var12.field2608;
            int var14 = var12.field2609;
            int var15 = var13 - this.field2539.method4279();
            int var16 = var14 - this.field2539.method4281();
            this.field2541[var15][var16] = new class241(var13, var14, this.field2539.method4276(), this.field2546);
            this.field2541[var15][var16].method4378(var12, this.field2539.field2679);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2541[var17][var18] == null) {
                    this.field2541[var17][var18] = new class241(this.field2539.method4279() + var17, this.field2539.method4281() + var18, this.field2539.method4276(), this.field2546);
                    this.field2541[var17][var18].method4345(this.field2539.field2678, this.field2539.field2679);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6414(class259.field2671.field2676, arg1)) {
            byte[] var19 = arg0.method6415(class259.field2671.field2676, arg1);
            this.field2545 = class31.method3375(var19);
        }
        System.nanoTime();
        arg0.method6408();
        arg0.method6410();
        this.field2537 = true;
    }

    @ObfuscatedName("jj.ap(I)V")
    public final void method4497() {
        this.field2540 = null;
    }

    @ObfuscatedName("jj.af(IIIIIIIII)V")
    public final void method4469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5250;
        int var10 = Statics.field5249;
        int var11 = Statics.field5252;
        float[] var12 = Statics.field5254;
        int[] var13 = new int[4];
        class541.method8937(var13);
        class250 var14 = this.method4472(arg0, arg1, arg2, arg3);
        float var15 = this.method4478(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2551 = var16;
        if (!this.field2538.containsKey(var16)) {
            class262 var17 = new class262(var16);
            var17.method4610();
            this.field2538.put(var16, var17);
        }
        int var18 = var14.field2626 + var14.field2624 - 1;
        int var19 = var14.field2622 + var14.field2621 - 1;
        for (int var20 = var14.field2626; var20 <= var18; var20++) {
            for (int var21 = var14.field2621; var21 <= var19; var21++) {
                this.field2541[var20][var21].method4389(var16, (class262) this.field2538.get(var16), this.field2543, this.field2544, this.field2542);
            }
        }
        class270.method4806(var9, var10, var11, var12);
        class541.method8879(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2547 + arg0;
        int var24 = this.field2548 + arg1;
        for (int var25 = var14.field2626; var25 < var14.field2626 + var14.field2624; var25++) {
            for (int var26 = var14.field2621; var26 < var14.field2622 + var14.field2621; var26++) {
                this.field2541[var25][var26].method4343((this.field2541[var25][var26].field2526 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2541[var25][var26].field2525 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("jj.aj(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class250 var14 = this.method4472(arg0, arg1, arg2, arg3);
        float var15 = this.method4478(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2547 + arg0;
        int var18 = this.field2548 + arg1;
        for (int var19 = var14.field2626; var19 < var14.field2626 + var14.field2624; var19++) {
            for (int var20 = var14.field2621; var20 < var14.field2622 + var14.field2621; var20++) {
                if (arg12) {
                    this.field2541[var19][var20].method4348();
                }
                this.field2541[var19][var20].method4423((this.field2541[var19][var20].field2526 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2541[var19][var20].field2525 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2626; var21 < var14.field2626 + var14.field2624; var21++) {
            for (int var22 = var14.field2621; var22 < var14.field2622 + var14.field2621; var22++) {
                this.field2541[var21][var22].method4354(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jj.aq(IIIILjava/util/HashSet;IIB)V")
    public void method4494(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2545 == null) {
            return;
        }
        this.field2545.method9071(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2540 == null) {
            this.method4476();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2540.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class258 var12 = (class258) var11.next();
                int var13 = (var12.field2664.field3604 - this.field2547) * arg2 / this.field2549;
                int var14 = arg3 - (var12.field2664.field3603 - this.field2548) * arg3 / this.field2550;
                class541.method8882(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jj.ar(IIIIIIIIIII)Ljava/util/List;")
    public List method4471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2537) {
            return var11;
        }
        class250 var12 = this.method4472(arg0, arg1, arg2, arg3);
        float var13 = this.method4478(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2547 + arg0;
        int var16 = this.field2548 + arg1;
        for (int var17 = var12.field2626; var17 < var12.field2626 + var12.field2624; var17++) {
            for (int var18 = var12.field2621; var18 < var12.field2622 + var12.field2621; var18++) {
                List var19 = this.field2541[var17][var18].method4373((this.field2541[var17][var18].field2526 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2541[var17][var18].field2525 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jj.ag(IIIIB)Lje;")
    public class250 method4472(int arg0, int arg1, int arg2, int arg3) {
        class250 var5 = new class250(this);
        int var6 = this.field2547 + arg0;
        int var7 = this.field2548 + arg1;
        int var8 = this.field2547 + arg2;
        int var9 = this.field2548 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2624 = var12 - var10 + 1;
        var5.field2622 = var13 - var11 + 1;
        var5.field2626 = var10 - this.field2539.method4279();
        var5.field2621 = var11 - this.field2539.method4281();
        if (var5.field2626 < 0) {
            var5.field2624 += var5.field2626;
            var5.field2626 = 0;
        }
        if (var5.field2626 > this.field2541.length - var5.field2624) {
            var5.field2624 = this.field2541.length - var5.field2626;
        }
        if (var5.field2621 < 0) {
            var5.field2622 += var5.field2621;
            var5.field2621 = 0;
        }
        if (var5.field2621 > this.field2541[0].length - var5.field2622) {
            var5.field2622 = this.field2541[0].length - var5.field2621;
        }
        var5.field2624 = Math.min(var5.field2624, this.field2541.length);
        var5.field2622 = Math.min(var5.field2622, this.field2541[0].length);
        return var5;
    }

    @ObfuscatedName("jj.ao(I)Z")
    public boolean method4467() {
        return this.field2537;
    }

    @ObfuscatedName("jj.ae(I)I")
    public int method4474() {
        return this.field2539.method4303();
    }

    @ObfuscatedName("jj.aa(I)Ljava/util/HashMap;")
    public HashMap method4475() {
        this.method4476();
        return this.field2540;
    }

    @ObfuscatedName("jj.au(B)V")
    public void method4476() {
        if (this.field2540 == null) {
            this.field2540 = new HashMap();
        }
        this.field2540.clear();
        for (int var1 = 0; var1 < this.field2541.length; var1++) {
            for (int var2 = 0; var2 < this.field2541[var1].length; var2++) {
                List var3 = this.field2541[var1][var2].method4374();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class258 var5 = (class258) var4.next();
                    if (var5.method4592()) {
                        int var6 = var5.method4226();
                        if (this.field2540.containsKey(var6)) {
                            List var8 = (List) this.field2540.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2540.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jj.an(IIB)F")
    public float method4478(int arg0, int arg1) {
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
