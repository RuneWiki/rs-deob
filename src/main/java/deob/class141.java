package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fc")
public class class141 extends class488 {

    @ObfuscatedName("fc.aq")
    public int field1640;

    @ObfuscatedName("fc.aw")
    public class133[][] field1633 = (class133[][]) null;

    @ObfuscatedName("fc.al")
    public class133[][] field1635 = (class133[][]) null;

    @ObfuscatedName("fc.ai")
    public class275 field1636;

    @ObfuscatedName("fc.ar")
    public int field1637 = 0;

    @ObfuscatedName("fc.as")
    public boolean field1634;

    @ObfuscatedName("fc.ao")
    public Future field1639;

    @ObfuscatedName("fc.au")
    public List field1638;

    public class141(class378 arg0, class378 arg1, int arg2, boolean arg3) {
        this.field1640 = arg2;
        byte[] var5 = arg0.method6489(this.field1640 >> 16 & 0xFFFF, this.field1640 & 0xFFFF);
        class534 var6 = new class534(var5);
        int var7 = var6.method8591();
        int var8 = var6.method8593();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6426(0, var8);
        } else {
            var9 = arg1.method6426(var8, 0);
        }
        this.field1636 = new class275(var8, var9);
        this.field1638 = new ArrayList();
        this.field1639 = Statics.field4468.submit(new class140(this, var6, var7));
    }

    @ObfuscatedName("fc.aw(Luq;II)V")
    public void method2997(class534 arg0, int arg1) {
        arg0.method8593();
        arg0.method8593();
        this.field1637 = arg0.method8591();
        int var3 = arg0.method8593();
        this.field1635 = new class133[this.field1636.method4883().method4814()][];
        this.field1633 = new class133[this.field1636.method4880()][];
        class132[] var4 = new class132[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method8591();
            class134[] var7 = new class134[] { class134.field1591, class134.field1581, class134.field1587, class134.field1592, class134.field1584, class134.field1585 };
            class134 var8 = (class134) class392.method6317(var7, var6);
            if (var8 == null) {
                var8 = class134.field1591;
            }
            int var11 = arg0.method8606();
            int var12 = arg0.method8591();
            class135 var13 = (class135) class392.method6317(class135.method2986(), var12);
            if (var13 == null) {
                var13 = class135.field1596;
            }
            class133 var16 = new class133();
            var16.method2951(arg0, arg1);
            var4[var5] = new class132(this, var16, var8, var13, var11);
            int var17 = var8.method2962();
            class133[][] var18;
            if (class134.field1581 == var8) {
                var18 = this.field1635;
            } else {
                var18 = this.field1633;
            }
            if (var18[var11] == null) {
                var18[var11] = new class133[var17];
            }
            if (class134.field1584 == var8) {
                this.field1634 = true;
            }
        }
        int var19 = var3 / Statics.field5122;
        int var20 = var3 % Statics.field5122;
        int var21 = 0;
        for (int var22 = 0; var22 < Statics.field5122; var22++) {
            int var23 = var21;
            var21 += var19;
            if (var20 > 0) {
                var21++;
                var20--;
            }
            if (var21 == var23) {
                break;
            }
            this.field1638.add(Statics.field4468.submit(new class136(this, var23, var21, var4)));
        }
    }

    @ObfuscatedName("fc.al(I)Z")
    public boolean method3004() {
        if (this.field1639 == null && this.field1638 == null) {
            return true;
        }
        if (this.field1639 != null) {
            if (!this.field1639.isDone()) {
                return false;
            }
            this.field1639 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1638.size(); var2++) {
            if (((Future) this.field1638.get(var2)).isDone()) {
                this.field1638.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1638 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fc.ai(B)I")
    public int method2999() {
        return this.field1637;
    }

    @ObfuscatedName("fc.ar(B)Z")
    public boolean method3000() {
        return this.field1634;
    }

    @ObfuscatedName("fc.as(ILez;IIB)V")
    public void method3003(int arg0, class130 arg1, int arg2, int arg3) {
        class470 var5 = class470.method2825();
        this.method3016(var5, arg2, arg1, arg0);
        this.method3009(var5, arg2, arg1, arg0);
        this.method3002(var5, arg2, arg1, arg0);
        arg1.method2883(var5);
        var5.method7841();
    }

    @ObfuscatedName("fc.aa(Lsr;ILez;II)V")
    public void method3016(class470 arg0, int arg1, class130 arg2, int arg3) {
        float[] var5 = arg2.method2917(this.field1637);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1635[arg1] != null) {
            class133 var9 = this.field1635[arg1][0];
            class133 var10 = this.field1635[arg1][1];
            class133 var11 = this.field1635[arg1][2];
            if (var9 != null) {
                var6 = var9.method2937(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2937(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2937(arg3);
            }
        }
        class469 var12 = class469.method6286();
        var12.method7785(1.0F, 0.0F, 0.0F, var6);
        class469 var13 = class469.method6286();
        var13.method7785(0.0F, 1.0F, 0.0F, var7);
        class469 var14 = class469.method6286();
        var14.method7785(0.0F, 0.0F, 1.0F, var8);
        class469 var15 = class469.method6286();
        var15.method7787(var14);
        var15.method7787(var12);
        var15.method7787(var13);
        class470 var16 = class470.method2825();
        var16.method7853(var15);
        arg0.method7826(var16);
        var12.method7790();
        var13.method7790();
        var14.method7790();
        var15.method7790();
        var16.method7841();
    }

    @ObfuscatedName("fc.az(Lsr;ILez;IB)V")
    public void method3002(class470 arg0, int arg1, class130 arg2, int arg3) {
        float[] var5 = arg2.method2887(this.field1637);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1635[arg1] != null) {
            class133 var9 = this.field1635[arg1][3];
            class133 var10 = this.field1635[arg1][4];
            class133 var11 = this.field1635[arg1][5];
            if (var9 != null) {
                var6 = var9.method2937(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2937(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2937(arg3);
            }
        }
        arg0.field4844[12] = var6;
        arg0.field4844[13] = var7;
        arg0.field4844[14] = var8;
    }

    @ObfuscatedName("fc.ao(Lsr;ILez;II)V")
    public void method3009(class470 arg0, int arg1, class130 arg2, int arg3) {
        float[] var5 = arg2.method2919(this.field1637);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1635[arg1] != null) {
            class133 var9 = this.field1635[arg1][6];
            class133 var10 = this.field1635[arg1][7];
            class133 var11 = this.field1635[arg1][8];
            if (var9 != null) {
                var6 = var9.method2937(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2937(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2937(arg3);
            }
        }
        class470 var12 = class470.method2825();
        var12.method7824(var6, var7, var8);
        arg0.method7826(var12);
        var12.method7841();
    }
}
