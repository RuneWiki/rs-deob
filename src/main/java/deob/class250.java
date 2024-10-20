package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jq")
public final class class250 {

    @ObfuscatedName("jq.aq")
    public boolean field2612 = false;

    @ObfuscatedName("jq.ad")
    public boolean field2608 = false;

    @ObfuscatedName("jq.ag")
    public class269 field2607;

    @ObfuscatedName("jq.ak")
    public class561 field2604;

    @ObfuscatedName("jq.ap")
    public HashMap field2605;

    @ObfuscatedName("jq.an")
    public class249[][] field2602;

    @ObfuscatedName("jq.aj")
    public HashMap field2613 = new HashMap();

    @ObfuscatedName("jq.av")
    public class560[] field2611;

    @ObfuscatedName("jq.ab")
    public final class388 field2609;

    @ObfuscatedName("jq.ai")
    public final class388 field2610;

    @ObfuscatedName("jq.ae")
    public final HashMap field2601;

    @ObfuscatedName("jq.au")
    public int field2606;

    @ObfuscatedName("jq.ah")
    public int field2603;

    @ObfuscatedName("jq.az")
    public int field2614;

    @ObfuscatedName("jq.ax")
    public int field2615;

    @ObfuscatedName("jq.ac")
    public int field2616 = 0;

    public class250(class560[] arg0, HashMap arg1, class388 arg2, class388 arg3) {
        this.field2611 = arg0;
        this.field2601 = arg1;
        this.field2609 = arg2;
        this.field2610 = arg3;
    }

    @ObfuscatedName("jq.aq(Lok;Ljava/lang/String;ZI)V")
    public void method4451(class388 arg0, String arg1, boolean arg2) {
        if (this.field2608) {
            return;
        }
        this.field2612 = false;
        this.field2608 = true;
        System.nanoTime();
        int var4 = arg0.method6555(class267.field2741.field2738);
        int var5 = arg0.method6609(var4, arg1);
        class547 var6 = new class547(arg0.method6558(class267.field2741.field2738, arg1));
        class547 var7 = new class547(arg0.method6558(class267.field2739.field2738, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2607 = new class269();
        try {
            this.field2607.method4612(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2607.method4280();
        this.field2607.method4303();
        this.field2607.method4268();
        this.field2606 = this.field2607.method4281() * 64;
        this.field2603 = this.field2607.method4278() * 64;
        this.field2614 = (this.field2607.method4277() - this.field2607.method4281() + 1) * 64;
        this.field2615 = (this.field2607.method4298() - this.field2607.method4278() + 1) * 64;
        int var9 = this.field2607.method4277() - this.field2607.method4281() + 1;
        int var10 = this.field2607.method4298() - this.field2607.method4278() + 1;
        System.nanoTime();
        System.nanoTime();
        class249.field2593.method5468();
        this.field2602 = new class249[var9][var10];
        Iterator var11 = this.field2607.field2745.iterator();
        while (var11.hasNext()) {
            class243 var12 = (class243) var11.next();
            int var13 = var12.field2670;
            int var14 = var12.field2671;
            int var15 = var13 - this.field2607.method4281();
            int var16 = var14 - this.field2607.method4278();
            this.field2602[var15][var16] = new class249(var13, var14, this.field2607.method4319(), this.field2601);
            this.field2602[var15][var16].method4343(var12, this.field2607.field2747);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2602[var17][var18] == null) {
                    this.field2602[var17][var18] = new class249(this.field2607.method4281() + var17, this.field2607.method4278() + var18, this.field2607.method4319(), this.field2601);
                    this.field2602[var17][var18].method4380(this.field2607.field2746, this.field2607.field2747);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6544(class267.field2740.field2738, arg1)) {
            byte[] var19 = arg0.method6558(class267.field2740.field2738, arg1);
            this.field2604 = class31.method3511(var19);
        }
        System.nanoTime();
        arg0.method6551();
        arg0.method6595();
        this.field2612 = true;
    }

    @ObfuscatedName("jq.ad(I)V")
    public final void method4452() {
        this.field2605 = null;
    }

    @ObfuscatedName("jq.ag(IIIIIIIIB)V")
    public final void method4453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5434;
        int var10 = Statics.field5432;
        int var11 = Statics.field5433;
        float[] var12 = Statics.field5436;
        int[] var13 = new int[4];
        class557.method9054(var13);
        class258 var14 = this.method4457(arg0, arg1, arg2, arg3);
        float var15 = this.method4462(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2616 = var16;
        if (!this.field2613.containsKey(var16)) {
            class270 var17 = new class270(var16);
            var17.method4622();
            this.field2613.put(var16, var17);
        }
        int var18 = var14.field2686 + var14.field2684 - 1;
        int var19 = var14.field2687 + var14.field2685 - 1;
        for (int var20 = var14.field2684; var20 <= var18; var20++) {
            for (int var21 = var14.field2687; var21 <= var19; var21++) {
                this.field2602[var20][var21].method4351(var16, (class270) this.field2613.get(var16), this.field2611, this.field2609, this.field2610);
            }
        }
        class278.method4771(var9, var10, var11, var12);
        class557.method9055(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2606 + arg0;
        int var24 = this.field2603 + arg1;
        for (int var25 = var14.field2684; var25 < var14.field2686 + var14.field2684; var25++) {
            for (int var26 = var14.field2687; var26 < var14.field2687 + var14.field2685; var26++) {
                this.field2602[var25][var26].method4342((this.field2602[var25][var26].field2599 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2602[var25][var26].field2588 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("jq.ak(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class258 var14 = this.method4457(arg0, arg1, arg2, arg3);
        float var15 = this.method4462(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2606 + arg0;
        int var18 = this.field2603 + arg1;
        for (int var19 = var14.field2684; var19 < var14.field2686 + var14.field2684; var19++) {
            for (int var20 = var14.field2687; var20 < var14.field2687 + var14.field2685; var20++) {
                if (arg12) {
                    this.field2602[var19][var20].method4347();
                }
                this.field2602[var19][var20].method4352((this.field2602[var19][var20].field2599 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2602[var19][var20].field2588 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2684; var21 < var14.field2686 + var14.field2684; var21++) {
            for (int var22 = var14.field2687; var22 < var14.field2687 + var14.field2685; var22++) {
                this.field2602[var21][var22].method4353(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jq.ap(IIIILjava/util/HashSet;IIB)V")
    public void method4455(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2604 == null) {
            return;
        }
        this.field2604.method9270(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2605 == null) {
            this.method4461();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2605.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class266 var12 = (class266) var11.next();
                int var13 = (var12.field2732.field3733 - this.field2606) * arg2 / this.field2614;
                int var14 = arg3 - (var12.field2732.field3735 - this.field2603) * arg3 / this.field2615;
                class557.method9053(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jq.an(IIIIIIIIIIB)Ljava/util/List;")
    public List method4490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2612) {
            return var11;
        }
        class258 var12 = this.method4457(arg0, arg1, arg2, arg3);
        float var13 = this.method4462(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2606 + arg0;
        int var16 = this.field2603 + arg1;
        for (int var17 = var12.field2684; var17 < var12.field2686 + var12.field2684; var17++) {
            for (int var18 = var12.field2687; var18 < var12.field2687 + var12.field2685; var18++) {
                List var19 = this.field2602[var17][var18].method4373((this.field2602[var17][var18].field2599 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2602[var17][var18].field2588 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jq.aj(IIIIB)Ljs;")
    public class258 method4457(int arg0, int arg1, int arg2, int arg3) {
        class258 var5 = new class258(this);
        int var6 = this.field2606 + arg0;
        int var7 = this.field2603 + arg1;
        int var8 = this.field2606 + arg2;
        int var9 = this.field2603 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2686 = var12 - var10 + 1;
        var5.field2685 = var13 - var11 + 1;
        var5.field2684 = var10 - this.field2607.method4281();
        var5.field2687 = var11 - this.field2607.method4278();
        if (var5.field2684 < 0) {
            var5.field2686 += var5.field2684;
            var5.field2684 = 0;
        }
        if (var5.field2684 > this.field2602.length - var5.field2686) {
            var5.field2686 = this.field2602.length - var5.field2684;
        }
        if (var5.field2687 < 0) {
            var5.field2685 += var5.field2687;
            var5.field2687 = 0;
        }
        if (var5.field2687 > this.field2602[0].length - var5.field2685) {
            var5.field2685 = this.field2602[0].length - var5.field2687;
        }
        var5.field2686 = Math.min(var5.field2686, this.field2602.length);
        var5.field2685 = Math.min(var5.field2685, this.field2602[0].length);
        return var5;
    }

    @ObfuscatedName("jq.av(I)Z")
    public boolean method4458() {
        return this.field2612;
    }

    @ObfuscatedName("jq.ab(B)I")
    public int method4459() {
        return this.field2607.method4333();
    }

    @ObfuscatedName("jq.ai(I)Ljava/util/HashMap;")
    public HashMap method4463() {
        this.method4461();
        return this.field2605;
    }

    @ObfuscatedName("jq.ae(I)V")
    public void method4461() {
        if (this.field2605 == null) {
            this.field2605 = new HashMap();
        }
        this.field2605.clear();
        for (int var1 = 0; var1 < this.field2602.length; var1++) {
            for (int var2 = 0; var2 < this.field2602[var1].length; var2++) {
                List var3 = this.field2602[var1][var2].method4374();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class266 var5 = (class266) var4.next();
                    if (var5.method4599()) {
                        int var6 = var5.method4215();
                        if (this.field2605.containsKey(var6)) {
                            List var8 = (List) this.field2605.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2605.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jq.au(IIS)F")
    public float method4462(int arg0, int arg1) {
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
