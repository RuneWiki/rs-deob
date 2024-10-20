package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("av")
public final class class42 {

    @ObfuscatedName("av.i")
    public boolean field584 = false;

    @ObfuscatedName("av.w")
    public boolean field575 = false;

    @ObfuscatedName("av.a")
    public class45 field576;

    @ObfuscatedName("av.t")
    public class286 field577;

    @ObfuscatedName("av.s")
    public HashMap field583;

    @ObfuscatedName("av.r")
    public class35[][] field588;

    @ObfuscatedName("av.v")
    public HashMap field586 = new HashMap();

    @ObfuscatedName("av.y")
    public class285[] field581;

    @ObfuscatedName("av.j")
    public final HashMap field582;

    @ObfuscatedName("av.k")
    public int field579;

    @ObfuscatedName("av.e")
    public int field580;

    @ObfuscatedName("av.o")
    public int field585;

    @ObfuscatedName("av.z")
    public int field578;

    public class42(class285[] arg0, HashMap arg1) {
        this.field581 = arg0;
        this.field582 = arg1;
    }

    @ObfuscatedName("av.i(Liq;Ljava/lang/String;ZI)V")
    public void method505(class236 arg0, String arg1, boolean arg2) {
        if (this.field575) {
            return;
        }
        this.field584 = false;
        this.field575 = true;
        System.nanoTime();
        int var4 = arg0.method3800(class41.field565.field567);
        int var5 = arg0.method3785(var4, arg1);
        class174 var6 = new class174(arg0.method3799(class41.field565.field567, arg1));
        class174 var7 = new class174(arg0.method3799(class41.field563.field567, arg1));
        class174 var8 = new class174(arg0.method3799(arg1, class41.field562.field567));
        System.nanoTime();
        System.nanoTime();
        this.field576 = new class45();
        try {
            this.field576.method560(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field576.method299();
        this.field576.method296();
        this.field576.method255();
        this.field579 = this.field576.method268() * 64;
        this.field580 = this.field576.method251() * 64;
        this.field585 = (this.field576.method250() - this.field576.method268() + 1) * 64;
        this.field578 = (this.field576.method252() - this.field576.method251() + 1) * 64;
        int var10 = this.field576.method250() - this.field576.method268() + 1;
        int var11 = this.field576.method252() - this.field576.method251() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field588 = new class35[var10][var11];
        Iterator var12 = this.field576.field608.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field421;
            int var15 = var13.field410;
            int var16 = var14 - this.field576.method268();
            int var17 = var15 - this.field576.method251();
            this.field588[var16][var17] = new class35(var14, var15, this.field576.method257(), this.field582);
            this.field588[var16][var17].method466(var13, this.field576.field607);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field588[var18][var19] == null) {
                    this.field588[var18][var19] = new class35(this.field576.method268() + var18, this.field576.method251() + var19, this.field576.method257(), this.field582);
                    this.field588[var18][var19].method315(this.field576.field609, this.field576.field607);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3844(class41.field568.field567, arg1)) {
            byte[] var20 = arg0.method3799(class41.field568.field567, arg1);
            this.field577 = class55.method3607(var20);
        }
        System.nanoTime();
        this.field584 = true;
    }

    @ObfuscatedName("av.w(I)V")
    public final void method506() {
        this.field583 = null;
    }

    @ObfuscatedName("av.a(IIIIIIIIB)V")
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3758;
        int var10 = Statics.field3761;
        int var11 = Statics.field3757;
        int[] var12 = new int[4];
        class282.method4555(var12);
        class30 var13 = this.method512(arg0, arg1, arg2, arg3);
        float var14 = this.method533(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field586.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method625();
            this.field586.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field431; var18 < var13.field433 + var13.field431; var18++) {
            for (int var19 = var13.field432; var19 < var13.field432 + var13.field430; var19++) {
                this.method544(var18, var19, var17);
                this.field588[var18][var19].method320(var15, (class47) this.field586.get(var15), var17, this.field581);
            }
        }
        class282.method4553(var9, var10, var11);
        class282.method4552(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field579 + arg0;
        int var22 = this.field580 + arg1;
        for (int var23 = var13.field431; var23 < var13.field433 + var13.field431; var23++) {
            for (int var24 = var13.field432; var24 < var13.field432 + var13.field430; var24++) {
                this.field588[var23][var24].method344((this.field588[var23][var24].field486 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field588[var23][var24].field487 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("av.t(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method512(arg0, arg1, arg2, arg3);
        float var15 = this.method533(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field579 + arg0;
        int var18 = this.field580 + arg1;
        for (int var19 = var14.field431; var19 < var14.field433 + var14.field431; var19++) {
            for (int var20 = var14.field432; var20 < var14.field432 + var14.field430; var20++) {
                if (arg12) {
                    this.field588[var19][var20].method342();
                }
                this.field588[var19][var20].method325((this.field588[var19][var20].field486 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field588[var19][var20].field487 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field431; var21 < var14.field433 + var14.field431; var21++) {
            for (int var22 = var14.field432; var22 < var14.field432 + var14.field430; var22++) {
                this.field588[var21][var22].method426(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("av.s(II[Lao;I)V")
    public void method544(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field588.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field588[0].length - 1;
        if (var7) {
            arg2[class229.field3166.method17()] = null;
        } else {
            arg2[class229.field3166.method17()] = this.field588[arg0][arg1 + 1];
        }
        arg2[class229.field3158.method17()] = var7 || var5 ? null : this.field588[arg0 + 1][arg1 + 1];
        arg2[class229.field3164.method17()] = var7 || var4 ? null : this.field588[arg0 - 1][arg1 + 1];
        arg2[class229.field3159.method17()] = var5 ? null : this.field588[arg0 + 1][arg1];
        arg2[class229.field3165.method17()] = var4 ? null : this.field588[arg0 - 1][arg1];
        arg2[class229.field3161.method17()] = var6 ? null : this.field588[arg0][arg1 - 1];
        arg2[class229.field3163.method17()] = var6 || var5 ? null : this.field588[arg0 + 1][arg1 - 1];
        arg2[class229.field3162.method17()] = var6 || var4 ? null : this.field588[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("av.r(IIIILjava/util/HashSet;III)V")
    public void method510(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field577 == null) {
            return;
        }
        this.field577.method4697(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field583 == null) {
            this.method515();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field583.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field551.field2616 - this.field579) * arg2 / this.field585;
                int var14 = arg3 - (var12.field551.field2618 - this.field580) * arg3 / this.field578;
                class282.method4561(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("av.v(IIIIIIIIIII)Ljava/util/List;")
    public List method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field584) {
            return var11;
        }
        class30 var12 = this.method512(arg0, arg1, arg2, arg3);
        float var13 = this.method533(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field579 + arg0;
        int var16 = this.field580 + arg1;
        for (int var17 = var12.field431; var17 < var12.field433 + var12.field431; var17++) {
            for (int var18 = var12.field432; var18 < var12.field432 + var12.field430; var18++) {
                List var19 = this.field588[var17][var18].method349((this.field588[var17][var18].field486 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field588[var17][var18].field487 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("av.y(IIIII)Lai;")
    public class30 method512(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field579 + arg0;
        int var7 = this.field580 + arg1;
        int var8 = this.field579 + arg2;
        int var9 = this.field580 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field433 = var12 - var10 + 1;
        var5.field430 = var13 - var11 + 1;
        var5.field431 = var10 - this.field576.method268();
        var5.field432 = var11 - this.field576.method251();
        if (var5.field431 < 0) {
            var5.field433 += var5.field431;
            var5.field431 = 0;
        }
        if (var5.field431 > this.field588.length - var5.field433) {
            var5.field433 = this.field588.length - var5.field431;
        }
        if (var5.field432 < 0) {
            var5.field430 += var5.field432;
            var5.field432 = 0;
        }
        if (var5.field432 > this.field588[0].length - var5.field430) {
            var5.field430 = this.field588[0].length - var5.field432;
        }
        var5.field433 = Math.min(var5.field433, this.field588.length);
        var5.field430 = Math.min(var5.field430, this.field588[0].length);
        return var5;
    }

    @ObfuscatedName("av.j(I)Z")
    public boolean method547() {
        return this.field584;
    }

    @ObfuscatedName("av.k(B)Ljava/util/HashMap;")
    public HashMap method540() {
        this.method515();
        return this.field583;
    }

    @ObfuscatedName("av.e(I)V")
    public void method515() {
        if (this.field583 == null) {
            this.field583 = new HashMap();
        }
        this.field583.clear();
        for (int var1 = 0; var1 < this.field588.length; var1++) {
            for (int var2 = 0; var2 < this.field588[var1].length; var2++) {
                List var3 = this.field588[var1][var2].method350();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field583.containsKey(var5.field549)) {
                        List var7 = (List) this.field583.get(var5.field549);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field583.put(var5.field549, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.o(III)F")
    public float method533(int arg0, int arg1) {
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
