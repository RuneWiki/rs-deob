package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fk")
public class class140 extends class484 {

    @ObfuscatedName("fk.ac")
    public int field1606;

    @ObfuscatedName("fk.al")
    public class133[][] field1604 = (class133[][]) null;

    @ObfuscatedName("fk.ak")
    public class133[][] field1611 = (class133[][]) null;

    @ObfuscatedName("fk.ax")
    public class244 field1607;

    @ObfuscatedName("fk.ao")
    public int field1608 = 0;

    @ObfuscatedName("fk.ah")
    public boolean field1609;

    @ObfuscatedName("fk.am")
    public Future field1610;

    @ObfuscatedName("fk.av")
    public List field1605;

    public class140(class374 arg0, class374 arg1, int arg2, boolean arg3) {
        this.field1606 = arg2;
        byte[] var5 = arg0.method6342(this.field1606 >> 16 & 0xFFFF, this.field1606 & 0xFFFF);
        class530 var6 = new class530(var5);
        int var7 = var6.method8365();
        int var8 = var6.method8598();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6312(0, var8);
        } else {
            var9 = arg1.method6312(var8, 0);
        }
        this.field1607 = new class244(var8, var9);
        this.field1605 = new ArrayList();
        this.field1610 = Statics.field334.submit(new class137(this, var6, var7));
    }

    @ObfuscatedName("fk.ac(Lul;II)V")
    public void method2950(class530 arg0, int arg1) {
        arg0.method8598();
        arg0.method8598();
        this.field1608 = arg0.method8365();
        int var3 = arg0.method8598();
        this.field1611 = new class133[this.field1607.method4292().method4239()][];
        this.field1604 = new class133[this.field1607.method4289()][];
        class132[] var4 = new class132[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class134 var6 = class134.method6753(arg0.method8365());
            int var7 = arg0.method8480();
            class135 var8 = Statics.method3271(arg0.method8365());
            class133 var9 = new class133();
            var9.method2888(arg0, arg1);
            var4[var5] = new class132(this, var9, var6, var8, var7);
            int var10 = var6.method2907();
            class133[][] var11;
            if (class134.field1570 == var6) {
                var11 = this.field1611;
            } else {
                var11 = this.field1604;
            }
            if (var11[var7] == null) {
                var11[var7] = new class133[var10];
            }
            if (class134.field1566 == var6) {
                this.field1609 = true;
            }
        }
        int var12 = var3 / Statics.field3511;
        int var13 = var3 % Statics.field3511;
        int var14 = 0;
        for (int var15 = 0; var15 < Statics.field3511; var15++) {
            int var16 = var14;
            var14 += var12;
            if (var13 > 0) {
                var14++;
                var13--;
            }
            if (var14 == var16) {
                break;
            }
            this.field1605.add(Statics.field334.submit(new class139(this, var16, var14, var4)));
        }
    }

    @ObfuscatedName("fk.al(B)Z")
    public boolean method2938() {
        if (this.field1610 == null && this.field1605 == null) {
            return true;
        }
        if (this.field1610 != null) {
            if (!this.field1610.isDone()) {
                return false;
            }
            this.field1610 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1605.size(); var2++) {
            if (((Future) this.field1605.get(var2)).isDone()) {
                this.field1605.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1605 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fk.ak(B)I")
    public int method2954() {
        return this.field1608;
    }

    @ObfuscatedName("fk.ax(B)Z")
    public boolean method2935() {
        return this.field1609;
    }

    @ObfuscatedName("fk.ao(ILed;III)V")
    public void method2936(int arg0, class130 arg1, int arg2, int arg3) {
        class466 var5 = class466.method3619();
        this.method2937(var5, arg2, arg1, arg0);
        this.method2933(var5, arg2, arg1, arg0);
        this.method2944(var5, arg2, arg1, arg0);
        arg1.method2853(var5);
        var5.method7645();
    }

    @ObfuscatedName("fk.ah(Lrb;ILed;II)V")
    public void method2937(class466 arg0, int arg1, class130 arg2, int arg3) {
        float[] var5 = arg2.method2837(this.field1608);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1611[arg1] != null) {
            class133 var9 = this.field1611[arg1][0];
            class133 var10 = this.field1611[arg1][1];
            class133 var11 = this.field1611[arg1][2];
            if (var9 != null) {
                var6 = var9.method2881(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2881(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2881(arg3);
            }
        }
        class465 var12 = class465.method7311();
        var12.method7564(1.0F, 0.0F, 0.0F, var6);
        class465 var13 = class465.method7311();
        var13.method7564(0.0F, 1.0F, 0.0F, var7);
        class465 var14 = class465.method7311();
        var14.method7564(0.0F, 0.0F, 1.0F, var8);
        class465 var15 = class465.method7311();
        var15.method7572(var14);
        var15.method7572(var12);
        var15.method7572(var13);
        class466 var16 = class466.method3619();
        var16.method7614(var15);
        arg0.method7605(var16);
        var12.method7584();
        var13.method7584();
        var14.method7584();
        var15.method7584();
        var16.method7645();
    }

    @ObfuscatedName("fk.ar(Lrb;ILed;II)V")
    public void method2944(class466 arg0, int arg1, class130 arg2, int arg3) {
        float[] var5 = arg2.method2846(this.field1608);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1611[arg1] != null) {
            class133 var9 = this.field1611[arg1][3];
            class133 var10 = this.field1611[arg1][4];
            class133 var11 = this.field1611[arg1][5];
            if (var9 != null) {
                var6 = var9.method2881(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2881(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2881(arg3);
            }
        }
        arg0.field4786[12] = var6;
        arg0.field4786[13] = var7;
        arg0.field4786[14] = var8;
    }

    @ObfuscatedName("fk.ab(Lrb;ILed;IB)V")
    public void method2933(class466 arg0, int arg1, class130 arg2, int arg3) {
        float[] var5 = arg2.method2839(this.field1608);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1611[arg1] != null) {
            class133 var9 = this.field1611[arg1][6];
            class133 var10 = this.field1611[arg1][7];
            class133 var11 = this.field1611[arg1][8];
            if (var9 != null) {
                var6 = var9.method2881(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2881(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2881(arg3);
            }
        }
        class466 var12 = class466.method3619();
        var12.method7626(var6, var7, var8);
        arg0.method7605(var12);
        var12.method7645();
    }
}
