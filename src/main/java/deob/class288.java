package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lb")
public final class class288 {

    @ObfuscatedName("lb.ac")
    public boolean field3133 = false;

    @ObfuscatedName("lb.ae")
    public boolean field3127 = false;

    @ObfuscatedName("lb.ag")
    public class307 field3126;

    @ObfuscatedName("lb.am")
    public class565 field3128;

    @ObfuscatedName("lb.ax")
    public HashMap field3130;

    @ObfuscatedName("lb.aq")
    public class287[][] field3131;

    @ObfuscatedName("lb.af")
    public HashMap field3134 = new HashMap();

    @ObfuscatedName("lb.at")
    public class564[] field3129;

    @ObfuscatedName("lb.au")
    public final class391 field3137;

    @ObfuscatedName("lb.ar")
    public final class391 field3136;

    @ObfuscatedName("lb.al")
    public final HashMap field3132;

    @ObfuscatedName("lb.ad")
    public int field3135;

    @ObfuscatedName("lb.ah")
    public int field3138;

    @ObfuscatedName("lb.ap")
    public int field3139;

    @ObfuscatedName("lb.ab")
    public int field3140;

    @ObfuscatedName("lb.az")
    public int field3141 = 0;

    public class288(class564[] arg0, HashMap arg1, class391 arg2, class391 arg3) {
        this.field3129 = arg0;
        this.field3132 = arg1;
        this.field3137 = arg2;
        this.field3136 = arg3;
    }

    @ObfuscatedName("lb.ac(Lpo;Ljava/lang/String;ZI)V")
    public void method5484(class391 arg0, String arg1, boolean arg2) {
        if (this.field3127) {
            return;
        }
        this.field3133 = false;
        this.field3127 = true;
        System.nanoTime();
        int var4 = arg0.method6797(class305.field3262.field3261);
        int var5 = arg0.method6806(var4, arg1);
        class551 var6 = new class551(arg0.method6800(class305.field3262.field3261, arg1));
        class551 var7 = new class551(arg0.method6800(class305.field3260.field3261, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field3126 = new class307();
        try {
            this.field3126.method5637(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field3126.method5320();
        this.field3126.method5310();
        this.field3126.method5322();
        this.field3135 = this.field3126.method5305() * 64;
        this.field3138 = this.field3126.method5309() * 64;
        this.field3139 = (this.field3126.method5306() - this.field3126.method5305() + 1) * 64;
        this.field3140 = (this.field3126.method5308() - this.field3126.method5309() + 1) * 64;
        int var9 = this.field3126.method5306() - this.field3126.method5305() + 1;
        int var10 = this.field3126.method5308() - this.field3126.method5309() + 1;
        System.nanoTime();
        System.nanoTime();
        class287.field3123.method5709();
        this.field3131 = new class287[var9][var10];
        Iterator var11 = this.field3126.field3270.iterator();
        while (var11.hasNext()) {
            class281 var12 = (class281) var11.next();
            int var13 = var12.field3190;
            int var14 = var12.field3193;
            int var15 = var13 - this.field3126.method5305();
            int var16 = var14 - this.field3126.method5309();
            this.field3131[var15][var16] = new class287(var13, var14, this.field3126.method5295(), this.field3132);
            this.field3131[var15][var16].method5365(var12, this.field3126.field3267);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field3131[var17][var18] == null) {
                    this.field3131[var17][var18] = new class287(this.field3126.method5305() + var17, this.field3126.method5309() + var18, this.field3126.method5295(), this.field3132);
                    this.field3131[var17][var18].method5382(this.field3126.field3268, this.field3126.field3267);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6799(class305.field3259.field3261, arg1)) {
            byte[] var19 = arg0.method6800(class305.field3259.field3261, arg1);
            this.field3128 = class31.method2805(var19);
        }
        System.nanoTime();
        arg0.method6835();
        arg0.method6780();
        this.field3133 = true;
    }

    @ObfuscatedName("lb.ae(I)V")
    public final void method5485() {
        this.field3130 = null;
    }

    @ObfuscatedName("lb.ag(IIIIIIIII)V")
    public final void method5486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5489;
        int var10 = Statics.field5483;
        int var11 = Statics.field5484;
        float[] var12 = Statics.field5485;
        int[] var13 = new int[4];
        class561.method9296(var13);
        class296 var14 = this.method5521(arg0, arg1, arg2, arg3);
        float var15 = this.method5517(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field3141 = var16;
        if (!this.field3134.containsKey(var16)) {
            class308 var17 = new class308(var16);
            var17.method5667();
            this.field3134.put(var16, var17);
        }
        int var18 = var14.field3209 + var14.field3208 - 1;
        int var19 = var14.field3207 + var14.field3206 - 1;
        for (int var20 = var14.field3208; var20 <= var18; var20++) {
            for (int var21 = var14.field3207; var21 <= var19; var21++) {
                this.field3131[var20][var21].method5373(var16, (class308) this.field3134.get(var16), this.field3129, this.field3137, this.field3136, 0.725D);
            }
        }
        class240.method4342(var9, var10, var11, var12);
        class561.method9293(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field3135 + arg0;
        int var24 = this.field3138 + arg1;
        for (int var25 = var14.field3208; var25 < var14.field3209 + var14.field3208; var25++) {
            for (int var26 = var14.field3207; var26 < var14.field3207 + var14.field3206; var26++) {
                this.field3131[var25][var26].method5459((this.field3131[var25][var26].field3114 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field3131[var25][var26].field3118 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("lb.am(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method5487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class296 var14 = this.method5521(arg0, arg1, arg2, arg3);
        float var15 = this.method5517(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field3135 + arg0;
        int var18 = this.field3138 + arg1;
        for (int var19 = var14.field3208; var19 < var14.field3209 + var14.field3208; var19++) {
            for (int var20 = var14.field3207; var20 < var14.field3207 + var14.field3206; var20++) {
                if (arg12) {
                    this.field3131[var19][var20].method5369();
                }
                this.field3131[var19][var20].method5374((this.field3131[var19][var20].field3114 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field3131[var19][var20].field3118 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3208; var21 < var14.field3209 + var14.field3208; var21++) {
            for (int var22 = var14.field3207; var22 < var14.field3207 + var14.field3206; var22++) {
                this.field3131[var21][var22].method5413(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("lb.ax(IIIILjava/util/HashSet;III)V")
    public void method5511(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field3128 == null) {
            return;
        }
        this.field3128.method9455(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field3130 == null) {
            this.method5493();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field3130.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class304 var12 = (class304) var11.next();
                int var13 = (var12.field3256.field3754 - this.field3135) * arg2 / this.field3139;
                int var14 = arg3 - (var12.field3256.field3756 - this.field3138) * arg3 / this.field3140;
                class561.method9372(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("lb.aq(IIIIIIIIIII)Ljava/util/List;")
    public List method5522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field3133) {
            return var11;
        }
        class296 var12 = this.method5521(arg0, arg1, arg2, arg3);
        float var13 = this.method5517(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field3135 + arg0;
        int var16 = this.field3138 + arg1;
        for (int var17 = var12.field3208; var17 < var12.field3209 + var12.field3208; var17++) {
            for (int var18 = var12.field3207; var18 < var12.field3207 + var12.field3206; var18++) {
                List var19 = this.field3131[var17][var18].method5395((this.field3131[var17][var18].field3114 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field3131[var17][var18].field3118 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("lb.af(IIIII)Lln;")
    public class296 method5521(int arg0, int arg1, int arg2, int arg3) {
        class296 var5 = new class296(this);
        int var6 = this.field3135 + arg0;
        int var7 = this.field3138 + arg1;
        int var8 = this.field3135 + arg2;
        int var9 = this.field3138 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3209 = var12 - var10 + 1;
        var5.field3206 = var13 - var11 + 1;
        var5.field3208 = var10 - this.field3126.method5305();
        var5.field3207 = var11 - this.field3126.method5309();
        if (var5.field3208 < 0) {
            var5.field3209 += var5.field3208;
            var5.field3208 = 0;
        }
        if (var5.field3208 > this.field3131.length - var5.field3209) {
            var5.field3209 = this.field3131.length - var5.field3208;
        }
        if (var5.field3207 < 0) {
            var5.field3206 += var5.field3207;
            var5.field3207 = 0;
        }
        if (var5.field3207 > this.field3131[0].length - var5.field3206) {
            var5.field3206 = this.field3131[0].length - var5.field3207;
        }
        var5.field3209 = Math.min(var5.field3209, this.field3131.length);
        var5.field3206 = Math.min(var5.field3206, this.field3131[0].length);
        return var5;
    }

    @ObfuscatedName("lb.at(B)Z")
    public boolean method5490() {
        return this.field3133;
    }

    @ObfuscatedName("lb.au(I)I")
    public int method5491() {
        return this.field3126.method5303();
    }

    @ObfuscatedName("lb.ar(I)Ljava/util/HashMap;")
    public HashMap method5492() {
        this.method5493();
        return this.field3130;
    }

    @ObfuscatedName("lb.al(I)V")
    public void method5493() {
        if (this.field3130 == null) {
            this.field3130 = new HashMap();
        }
        this.field3130.clear();
        for (int var1 = 0; var1 < this.field3131.length; var1++) {
            for (int var2 = 0; var2 < this.field3131[var1].length; var2++) {
                List var3 = this.field3131[var1][var2].method5396();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class304 var5 = (class304) var4.next();
                    if (var5.method5621()) {
                        int var6 = var5.method5246();
                        if (this.field3130.containsKey(var6)) {
                            List var8 = (List) this.field3130.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field3130.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("lb.ad(IIB)F")
    public float method5517(int arg0, int arg1) {
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
