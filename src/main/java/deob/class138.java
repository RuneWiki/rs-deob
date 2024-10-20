package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fz")
public class class138 extends class470 {

    @ObfuscatedName("fz.aw")
    public int field1608;

    @ObfuscatedName("fz.ay")
    public class131[][] field1609 = (class131[][]) null;

    @ObfuscatedName("fz.ar")
    public class131[][] field1611 = (class131[][]) null;

    @ObfuscatedName("fz.am")
    public class231 field1610;

    @ObfuscatedName("fz.as")
    public int field1612 = 0;

    @ObfuscatedName("fz.aj")
    public boolean field1613;

    @ObfuscatedName("fz.av")
    public Future field1614;

    @ObfuscatedName("fz.ap")
    public List field1615;

    public class138(class360 arg0, class360 arg1, int arg2, boolean arg3) {
        this.field1608 = arg2;
        byte[] var5 = arg0.method6117(this.field1608 >> 16 & 0xFFFF, this.field1608 & 0xFFFF);
        class514 var6 = new class514(var5);
        int var7 = var6.method8244();
        int var8 = var6.method8246();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6124(0, var8);
        } else {
            var9 = arg1.method6124(var8, 0);
        }
        this.field1610 = new class231(var8, var9);
        this.field1615 = new ArrayList();
        this.field1614 = Statics.field345.submit(new class135(this, var6, var7));
    }

    @ObfuscatedName("fz.aw(Lty;IB)V")
    public void method2910(class514 arg0, int arg1) {
        arg0.method8246();
        arg0.method8246();
        this.field1612 = arg0.method8244();
        int var3 = arg0.method8246();
        this.field1611 = new class131[this.field1610.method4181().method4125()][];
        this.field1609 = new class131[this.field1610.method4186()][];
        class130[] var4 = new class130[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method8244();
            class132[] var7 = new class132[] { class132.field1557, class132.field1558, class132.field1561, class132.field1560, class132.field1563, class132.field1562 };
            class132 var8 = (class132) class374.method2465(var7, var6);
            if (var8 == null) {
                var8 = class132.field1557;
            }
            int var11 = arg0.method8259();
            int var12 = arg0.method8244();
            class133 var13 = (class133) class374.method2465(class133.method1994(), var12);
            if (var13 == null) {
                var13 = class133.field1576;
            }
            class131 var16 = new class131();
            var16.method2856(arg0, arg1);
            var4[var5] = new class130(this, var16, var8, var13, var11);
            int var17 = var8.method2882();
            class131[][] var18;
            if (class132.field1558 == var8) {
                var18 = this.field1611;
            } else {
                var18 = this.field1609;
            }
            if (var18[var11] == null) {
                var18[var11] = new class131[var17];
            }
            if (class132.field1563 == var8) {
                this.field1613 = true;
            }
        }
        int var19 = var3 / Statics.field1445;
        int var20 = var3 % Statics.field1445;
        int var21 = 0;
        for (int var22 = 0; var22 < Statics.field1445; var22++) {
            int var23 = var21;
            var21 += var19;
            if (var20 > 0) {
                var21++;
                var20--;
            }
            if (var21 == var23) {
                break;
            }
            this.field1615.add(Statics.field345.submit(new class137(this, var23, var21, var4)));
        }
    }

    @ObfuscatedName("fz.ay(B)Z")
    public boolean method2911() {
        if (this.field1614 == null && this.field1615 == null) {
            return true;
        }
        if (this.field1614 != null) {
            if (!this.field1614.isDone()) {
                return false;
            }
            this.field1614 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1615.size(); var2++) {
            if (((Future) this.field1615.get(var2)).isDone()) {
                this.field1615.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1615 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fz.ar(I)I")
    public int method2937() {
        return this.field1612;
    }

    @ObfuscatedName("fz.am(B)Z")
    public boolean method2928() {
        return this.field1613;
    }

    @ObfuscatedName("fz.as(ILek;III)V")
    public void method2914(int arg0, class128 arg1, int arg2, int arg3) {
        class452 var5 = class452.method2947();
        this.method2915(var5, arg2, arg1, arg0);
        this.method2930(var5, arg2, arg1, arg0);
        this.method2916(var5, arg2, arg1, arg0);
        arg1.method2844(var5);
        var5.method7519();
    }

    @ObfuscatedName("fz.aj(Lrm;ILek;IB)V")
    public void method2915(class452 arg0, int arg1, class128 arg2, int arg3) {
        float[] var5 = arg2.method2821(this.field1612);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1611[arg1] != null) {
            class131 var9 = this.field1611[arg1][0];
            class131 var10 = this.field1611[arg1][1];
            class131 var11 = this.field1611[arg1][2];
            if (var9 != null) {
                var6 = var9.method2858(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2858(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2858(arg3);
            }
        }
        class451 var12 = class451.method4567();
        var12.method7462(1.0F, 0.0F, 0.0F, var6);
        class451 var13 = class451.method4567();
        var13.method7462(0.0F, 1.0F, 0.0F, var7);
        class451 var14 = class451.method4567();
        var14.method7462(0.0F, 0.0F, 1.0F, var8);
        class451 var15 = class451.method4567();
        var15.method7468(var14);
        var15.method7468(var12);
        var15.method7468(var13);
        class452 var16 = class452.method2947();
        var16.method7495(var15);
        arg0.method7525(var16);
        var12.method7464();
        var13.method7464();
        var14.method7464();
        var15.method7464();
        var16.method7519();
    }

    @ObfuscatedName("fz.ag(Lrm;ILek;II)V")
    public void method2916(class452 arg0, int arg1, class128 arg2, int arg3) {
        float[] var5 = arg2.method2822(this.field1612);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1611[arg1] != null) {
            class131 var9 = this.field1611[arg1][3];
            class131 var10 = this.field1611[arg1][4];
            class131 var11 = this.field1611[arg1][5];
            if (var9 != null) {
                var6 = var9.method2858(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2858(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2858(arg3);
            }
        }
        arg0.field4744[12] = var6;
        arg0.field4744[13] = var7;
        arg0.field4744[14] = var8;
    }

    @ObfuscatedName("fz.az(Lrm;ILek;II)V")
    public void method2930(class452 arg0, int arg1, class128 arg2, int arg3) {
        float[] var5 = arg2.method2823(this.field1612);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1611[arg1] != null) {
            class131 var9 = this.field1611[arg1][6];
            class131 var10 = this.field1611[arg1][7];
            class131 var11 = this.field1611[arg1][8];
            if (var9 != null) {
                var6 = var9.method2858(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2858(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2858(arg3);
            }
        }
        class452 var12 = class452.method2947();
        var12.method7506(var6, var7, var8);
        arg0.method7525(var12);
        var12.method7519();
    }
}
