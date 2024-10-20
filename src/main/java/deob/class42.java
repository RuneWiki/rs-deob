package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ag")
public final class class42 {

    @ObfuscatedName("ag.b")
    public boolean field520 = false;

    @ObfuscatedName("ag.q")
    public boolean field509 = false;

    @ObfuscatedName("ag.o")
    public class45 field510;

    @ObfuscatedName("ag.p")
    public class323 field511;

    @ObfuscatedName("ag.a")
    public HashMap field512;

    @ObfuscatedName("ag.h")
    public class35[][] field515;

    @ObfuscatedName("ag.l")
    public HashMap field514 = new HashMap();

    @ObfuscatedName("ag.y")
    public class322[] field524;

    @ObfuscatedName("ag.g")
    public final HashMap field516;

    @ObfuscatedName("ag.c")
    public int field517;

    @ObfuscatedName("ag.u")
    public int field518;

    @ObfuscatedName("ag.r")
    public int field519;

    @ObfuscatedName("ag.d")
    public int field508;

    public class42(class322[] arg0, HashMap arg1) {
        this.field524 = arg0;
        this.field516 = arg1;
    }

    @ObfuscatedName("ag.b(Lie;Ljava/lang/String;ZI)V")
    public void method517(class256 arg0, String arg1, boolean arg2) {
        if (this.field509) {
            return;
        }
        this.field520 = false;
        this.field509 = true;
        System.nanoTime();
        int var4 = arg0.method4177(class41.field498.field503);
        int var5 = arg0.method4228(var4, arg1);
        class194 var6 = new class194(arg0.method4180(class41.field498.field503, arg1));
        class194 var7 = new class194(arg0.method4180(class41.field504.field503, arg1));
        class194 var8 = new class194(arg0.method4180(arg1, class41.field501.field503));
        System.nanoTime();
        System.nanoTime();
        this.field510 = new class45();
        try {
            this.field510.method569(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field510.method285();
        this.field510.method286();
        this.field510.method331();
        this.field517 = this.field510.method281() * 64;
        this.field518 = this.field510.method318() * 64;
        this.field519 = (this.field510.method282() - this.field510.method281() + 1) * 64;
        this.field508 = (this.field510.method284() - this.field510.method318() + 1) * 64;
        int var10 = this.field510.method282() - this.field510.method281() + 1;
        int var11 = this.field510.method284() - this.field510.method318() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field515 = new class35[var10][var11];
        Iterator var12 = this.field510.field539.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field384;
            int var15 = var13.field374;
            int var16 = var14 - this.field510.method281();
            int var17 = var15 - this.field510.method318();
            this.field515[var16][var17] = new class35(var14, var15, this.field510.method272(), this.field516);
            this.field515[var16][var17].method342(var13, this.field510.field535);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field515[var18][var19] == null) {
                    this.field515[var18][var19] = new class35(this.field510.method281() + var18, this.field510.method318() + var19, this.field510.method272(), this.field516);
                    this.field515[var18][var19].method457(this.field510.field536, this.field510.field535);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4161(class41.field507.field503, arg1)) {
            byte[] var20 = arg0.method4180(class41.field507.field503, arg1);
            this.field511 = Statics.method3002(var20);
        }
        System.nanoTime();
        this.field520 = true;
    }

    @ObfuscatedName("ag.q(I)V")
    public final void method509() {
        this.field512 = null;
    }

    @ObfuscatedName("ag.o(IIIIIIIII)V")
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3876;
        int var10 = Statics.field3881;
        int var11 = Statics.field3877;
        int[] var12 = new int[4];
        class319.method5225(var12);
        class30 var13 = this.method514(arg0, arg1, arg2, arg3);
        float var14 = this.method518(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field514.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method610();
            this.field514.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field390; var18 < var13.field392 + var13.field390; var18++) {
            for (int var19 = var13.field389; var19 < var13.field391 + var13.field389; var19++) {
                this.method521(var18, var19, var17);
                this.field515[var18][var19].method346(var15, (class47) this.field514.get(var15), var17, this.field524);
            }
        }
        class319.method5210(var9, var10, var11);
        class319.method5240(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field517 + arg0;
        int var22 = this.field518 + arg1;
        for (int var23 = var13.field390; var23 < var13.field392 + var13.field390; var23++) {
            for (int var24 = var13.field389; var24 < var13.field391 + var13.field389; var24++) {
                this.field515[var23][var24].method341((this.field515[var23][var24].field448 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field515[var23][var24].field438 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ag.p(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method514(arg0, arg1, arg2, arg3);
        float var15 = this.method518(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field517 + arg0;
        int var18 = this.field518 + arg1;
        for (int var19 = var14.field390; var19 < var14.field392 + var14.field390; var19++) {
            for (int var20 = var14.field389; var20 < var14.field391 + var14.field389; var20++) {
                if (arg12) {
                    this.field515[var19][var20].method370();
                }
                this.field515[var19][var20].method347((this.field515[var19][var20].field448 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field515[var19][var20].field438 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field390; var21 < var14.field392 + var14.field390; var21++) {
            for (int var22 = var14.field389; var22 < var14.field391 + var14.field389; var22++) {
                this.field515[var21][var22].method348(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ag.a(II[Lak;I)V")
    public void method521(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field515.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field515[0].length - 1;
        if (var7) {
            arg2[class249.field3273.method12()] = null;
        } else {
            arg2[class249.field3273.method12()] = this.field515[arg0][arg1 + 1];
        }
        arg2[class249.field3271.method12()] = var7 || var5 ? null : this.field515[arg0 + 1][arg1 + 1];
        arg2[class249.field3274.method12()] = var7 || var4 ? null : this.field515[arg0 - 1][arg1 + 1];
        arg2[class249.field3269.method12()] = var5 ? null : this.field515[arg0 + 1][arg1];
        arg2[class249.field3276.method12()] = var4 ? null : this.field515[arg0 - 1][arg1];
        arg2[class249.field3267.method12()] = var6 ? null : this.field515[arg0][arg1 - 1];
        arg2[class249.field3270.method12()] = var6 || var5 ? null : this.field515[arg0 + 1][arg1 - 1];
        arg2[class249.field3272.method12()] = var6 || var4 ? null : this.field515[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ag.h(IIIILjava/util/HashSet;III)V")
    public void method531(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field511 == null) {
            return;
        }
        this.field511.method5396(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field512 == null) {
            this.method527();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field512.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field491.field2742 - this.field517) * arg2 / this.field519;
                int var14 = arg3 - (var12.field491.field2743 - this.field518) * arg3 / this.field508;
                class319.method5218(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ag.l(IIIIIIIIIIB)Ljava/util/List;")
    public List method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field520) {
            return var11;
        }
        class30 var12 = this.method514(arg0, arg1, arg2, arg3);
        float var13 = this.method518(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field517 + arg0;
        int var16 = this.field518 + arg1;
        for (int var17 = var12.field390; var17 < var12.field392 + var12.field390; var17++) {
            for (int var18 = var12.field389; var18 < var12.field391 + var12.field389; var18++) {
                List var19 = this.field515[var17][var18].method377((this.field515[var17][var18].field448 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field515[var17][var18].field438 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ag.y(IIIIB)Laj;")
    public class30 method514(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field517 + arg0;
        int var7 = this.field518 + arg1;
        int var8 = this.field517 + arg2;
        int var9 = this.field518 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field392 = var12 - var10 + 1;
        var5.field391 = var13 - var11 + 1;
        var5.field390 = var10 - this.field510.method281();
        var5.field389 = var11 - this.field510.method318();
        if (var5.field390 < 0) {
            var5.field392 += var5.field390;
            var5.field390 = 0;
        }
        if (var5.field390 > this.field515.length - var5.field392) {
            var5.field392 = this.field515.length - var5.field390;
        }
        if (var5.field389 < 0) {
            var5.field391 += var5.field389;
            var5.field389 = 0;
        }
        if (var5.field389 > this.field515[0].length - var5.field391) {
            var5.field391 = this.field515[0].length - var5.field389;
        }
        var5.field392 = Math.min(var5.field392, this.field515.length);
        var5.field391 = Math.min(var5.field391, this.field515[0].length);
        return var5;
    }

    @ObfuscatedName("ag.g(I)Z")
    public boolean method515() {
        return this.field520;
    }

    @ObfuscatedName("ag.c(B)Ljava/util/HashMap;")
    public HashMap method522() {
        this.method527();
        return this.field512;
    }

    @ObfuscatedName("ag.u(I)V")
    public void method527() {
        if (this.field512 == null) {
            this.field512 = new HashMap();
        }
        this.field512.clear();
        for (int var1 = 0; var1 < this.field515.length; var1++) {
            for (int var2 = 0; var2 < this.field515[var1].length; var2++) {
                List var3 = this.field515[var1][var2].method378();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field512.containsKey(var5.field489)) {
                        List var7 = (List) this.field512.get(var5.field489);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field512.put(var5.field489, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.t(IIB)F")
    public float method518(int arg0, int arg1) {
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
