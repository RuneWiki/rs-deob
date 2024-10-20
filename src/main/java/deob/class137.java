package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fz")
public class class137 extends class457 {

    @ObfuscatedName("fz.at")
    public int field1589;

    @ObfuscatedName("fz.an")
    public class130[][] field1584 = (class130[][]) null;

    @ObfuscatedName("fz.av")
    public class130[][] field1585 = (class130[][]) null;

    @ObfuscatedName("fz.as")
    public class229 field1588;

    @ObfuscatedName("fz.ax")
    public int field1587 = 0;

    @ObfuscatedName("fz.ap")
    public boolean field1583;

    @ObfuscatedName("fz.ae")
    public Future field1591;

    @ObfuscatedName("fz.af")
    public List field1590;

    public class137(class357 arg0, class357 arg1, int arg2, boolean arg3) {
        this.field1589 = arg2;
        byte[] var5 = arg0.method6080(this.field1589 >> 16 & 0xFFFF, this.field1589 & 0xFFFF);
        class501 var6 = new class501(var5);
        int var7 = var6.method8129();
        int var8 = var6.method8195();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6087(0, var8);
        } else {
            var9 = arg1.method6087(var8, 0);
        }
        this.field1588 = new class229(var8, var9);
        this.field1590 = new ArrayList();
        this.field1591 = Statics.field1469.submit(new class134(this, var6, var7));
    }

    @ObfuscatedName("fz.at(Ltz;IB)V")
    public void method2907(class501 arg0, int arg1) {
        arg0.method8195();
        arg0.method8195();
        this.field1587 = arg0.method8129();
        int var3 = arg0.method8195();
        this.field1585 = new class130[this.field1588.method4147().method4091()][];
        this.field1584 = new class130[this.field1588.method4149()][];
        class129[] var4 = new class129[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class131 var6 = class131.method5390(arg0.method8129());
            int var7 = arg0.method8143();
            class132 var8 = class132.method3225(arg0.method8129());
            class130 var9 = new class130();
            var9.method2826(arg0, arg1);
            var4[var5] = new class129(this, var9, var6, var8, var7);
            int var10 = var6.method2853();
            class130[][] var11;
            if (class131.field1530 == var6) {
                var11 = this.field1585;
            } else {
                var11 = this.field1584;
            }
            if (var11[var7] == null) {
                var11[var7] = new class130[var10];
            }
            if (class131.field1533 == var6) {
                this.field1583 = true;
            }
        }
        int var12 = var3 / Statics.field4941;
        int var13 = var3 % Statics.field4941;
        int var14 = 0;
        for (int var15 = 0; var15 < Statics.field4941; var15++) {
            int var16 = var14;
            var14 += var12;
            if (var13 > 0) {
                var14++;
                var13--;
            }
            if (var14 == var16) {
                break;
            }
            this.field1590.add(Statics.field1469.submit(new class136(this, var16, var14, var4)));
        }
    }

    @ObfuscatedName("fz.an(B)Z")
    public boolean method2889() {
        if (this.field1591 == null && this.field1590 == null) {
            return true;
        }
        if (this.field1591 != null) {
            if (!this.field1591.isDone()) {
                return false;
            }
            this.field1591 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1590.size(); var2++) {
            if (((Future) this.field1590.get(var2)).isDone()) {
                this.field1590.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1590 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fz.av(I)I")
    public int method2890() {
        return this.field1587;
    }

    @ObfuscatedName("fz.as(B)Z")
    public boolean method2891() {
        return this.field1583;
    }

    @ObfuscatedName("fz.ax(ILej;III)V")
    public void method2892(int arg0, class127 arg1, int arg2, int arg3) {
        class439 var5 = class439.method6899();
        this.method2893(var5, arg2, arg1, arg0);
        this.method2895(var5, arg2, arg1, arg0);
        this.method2894(var5, arg2, arg1, arg0);
        arg1.method2795(var5);
        var5.method7421();
    }

    @ObfuscatedName("fz.ap(Lqp;ILej;II)V")
    public void method2893(class439 arg0, int arg1, class127 arg2, int arg3) {
        float[] var5 = arg2.method2785(this.field1587);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1585[arg1] != null) {
            class130 var9 = this.field1585[arg1][0];
            class130 var10 = this.field1585[arg1][1];
            class130 var11 = this.field1585[arg1][2];
            if (var9 != null) {
                var6 = var9.method2825(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2825(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2825(arg3);
            }
        }
        class438[] var12 = class438.field4678;
        class438 var13;
        synchronized (class438.field4678) {
            if (class438.field4677 == 0) {
                var13 = new class438();
            } else {
                class438.field4678[--class438.field4677].method7372();
                var13 = class438.field4678[class438.field4677];
            }
        }
        var13.method7371(1.0F, 0.0F, 0.0F, var6);
        class438[] var16 = class438.field4678;
        class438 var17;
        synchronized (class438.field4678) {
            if (class438.field4677 == 0) {
                var17 = new class438();
            } else {
                class438.field4678[--class438.field4677].method7372();
                var17 = class438.field4678[class438.field4677];
            }
        }
        var17.method7371(0.0F, 1.0F, 0.0F, var7);
        class438[] var20 = class438.field4678;
        class438 var21;
        synchronized (class438.field4678) {
            if (class438.field4677 == 0) {
                var21 = new class438();
            } else {
                class438.field4678[--class438.field4677].method7372();
                var21 = class438.field4678[class438.field4677];
            }
        }
        var21.method7371(0.0F, 0.0F, 1.0F, var8);
        class438[] var24 = class438.field4678;
        class438 var25;
        synchronized (class438.field4678) {
            if (class438.field4677 == 0) {
                var25 = new class438();
            } else {
                class438.field4678[--class438.field4677].method7372();
                var25 = class438.field4678[class438.field4677];
            }
        }
        var25.method7373(var21);
        var25.method7373(var13);
        var25.method7373(var17);
        class439 var28 = class439.method6899();
        var28.method7407(var25);
        arg0.method7406(var28);
        var13.method7378();
        var17.method7378();
        var21.method7378();
        var25.method7378();
        var28.method7421();
    }

    @ObfuscatedName("fz.ab(Lqp;ILej;II)V")
    public void method2894(class439 arg0, int arg1, class127 arg2, int arg3) {
        float[] var5 = arg2.method2786(this.field1587);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1585[arg1] != null) {
            class130 var9 = this.field1585[arg1][3];
            class130 var10 = this.field1585[arg1][4];
            class130 var11 = this.field1585[arg1][5];
            if (var9 != null) {
                var6 = var9.method2825(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2825(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2825(arg3);
            }
        }
        arg0.field4686[12] = var6;
        arg0.field4686[13] = var7;
        arg0.field4686[14] = var8;
    }

    @ObfuscatedName("fz.ak(Lqp;ILej;IS)V")
    public void method2895(class439 arg0, int arg1, class127 arg2, int arg3) {
        float[] var5 = arg2.method2787(this.field1587);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1585[arg1] != null) {
            class130 var9 = this.field1585[arg1][6];
            class130 var10 = this.field1585[arg1][7];
            class130 var11 = this.field1585[arg1][8];
            if (var9 != null) {
                var6 = var9.method2825(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2825(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2825(arg3);
            }
        }
        class439 var12 = class439.method6899();
        var12.method7404(var6, var7, var8);
        arg0.method7406(var12);
        var12.method7421();
    }
}
