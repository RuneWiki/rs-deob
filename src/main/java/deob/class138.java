package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fv")
public class class138 extends class469 {

    @ObfuscatedName("fv.au")
    public int field1629;

    @ObfuscatedName("fv.ae")
    public class131[][] field1628 = (class131[][]) null;

    @ObfuscatedName("fv.ao")
    public class131[][] field1622 = (class131[][]) null;

    @ObfuscatedName("fv.at")
    public class230 field1623;

    @ObfuscatedName("fv.ac")
    public int field1624 = 0;

    @ObfuscatedName("fv.ai")
    public boolean field1632;

    @ObfuscatedName("fv.aa")
    public Future field1627;

    @ObfuscatedName("fv.af")
    public List field1621;

    public class138(class359 arg0, class359 arg1, int arg2, boolean arg3) {
        this.field1629 = arg2;
        byte[] var5 = arg0.method6128(this.field1629 >> 16 & 0xFFFF, this.field1629 & 0xFFFF);
        class515 var6 = new class515(var5);
        int var7 = var6.method8300();
        int var8 = var6.method8448();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6135(0, var8);
        } else {
            var9 = arg1.method6135(var8, 0);
        }
        this.field1623 = new class230(var8, var9);
        this.field1621 = new ArrayList();
        this.field1627 = Statics.field1626.submit(new class135(this, var6, var7));
    }

    @ObfuscatedName("fv.au(Ltm;IB)V")
    public void method2923(class515 arg0, int arg1) {
        arg0.method8448();
        arg0.method8448();
        this.field1624 = arg0.method8300();
        int var3 = arg0.method8448();
        this.field1622 = new class131[this.field1623.method4193().method4137()][];
        this.field1628 = new class131[this.field1623.method4196()][];
        class130[] var4 = new class130[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method8300();
            class132 var7 = (class132) class373.method371(class132.method5043(), var6);
            if (var7 == null) {
                var7 = class132.field1579;
            }
            int var10 = arg0.method8315();
            int var11 = arg0.method8300();
            class133[] var12 = new class133[] { class133.field1589, class133.field1585, class133.field1586, class133.field1587, class133.field1593, class133.field1605, class133.field1590, class133.field1591, class133.field1602, class133.field1595, class133.field1594, class133.field1592, class133.field1596, class133.field1588, class133.field1598, class133.field1599, class133.field1600 };
            class133 var13 = (class133) class373.method371(var12, var11);
            if (var13 == null) {
                var13 = class133.field1589;
            }
            class131 var16 = new class131();
            var16.method2864(arg0, arg1);
            var4[var5] = new class130(this, var16, var7, var13, var10);
            int var17 = var7.method2897();
            class131[][] var18;
            if (class132.field1582 == var7) {
                var18 = this.field1622;
            } else {
                var18 = this.field1628;
            }
            if (var18[var10] == null) {
                var18[var10] = new class131[var17];
            }
            if (class132.field1578 == var7) {
                this.field1632 = true;
            }
        }
        int var19 = var3 / Statics.field3101;
        int var20 = var3 % Statics.field3101;
        int var21 = 0;
        for (int var22 = 0; var22 < Statics.field3101; var22++) {
            int var23 = var21;
            var21 += var19;
            if (var20 > 0) {
                var21++;
                var20--;
            }
            if (var21 == var23) {
                break;
            }
            this.field1621.add(Statics.field1626.submit(new class137(this, var23, var21, var4)));
        }
    }

    @ObfuscatedName("fv.ae(I)Z")
    public boolean method2934() {
        if (this.field1627 == null && this.field1621 == null) {
            return true;
        }
        if (this.field1627 != null) {
            if (!this.field1627.isDone()) {
                return false;
            }
            this.field1627 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1621.size(); var2++) {
            if (((Future) this.field1621.get(var2)).isDone()) {
                this.field1621.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1621 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fv.ao(I)I")
    public int method2925() {
        return this.field1624;
    }

    @ObfuscatedName("fv.at(I)Z")
    public boolean method2926() {
        return this.field1632;
    }

    @ObfuscatedName("fv.ac(ILeo;IIB)V")
    public void method2927(int arg0, class128 arg1, int arg2, int arg3) {
        class451[] var5 = class451.field4738;
        class451 var6;
        synchronized (class451.field4738) {
            if (Statics.field4779 == 0) {
                var6 = new class451();
            } else {
                class451.field4738[--Statics.field4779].method7522();
                var6 = class451.field4738[Statics.field4779];
            }
        }
        this.method2922(var6, arg2, arg1, arg0);
        this.method2932(var6, arg2, arg1, arg0);
        this.method2929(var6, arg2, arg1, arg0);
        arg1.method2822(var6);
        var6.method7563();
    }

    @ObfuscatedName("fv.ai(Lrz;ILeo;II)V")
    public void method2922(class451 arg0, int arg1, class128 arg2, int arg3) {
        float[] var5 = arg2.method2827(this.field1624);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1622[arg1] != null) {
            class131 var9 = this.field1622[arg1][0];
            class131 var10 = this.field1622[arg1][1];
            class131 var11 = this.field1622[arg1][2];
            if (var9 != null) {
                var6 = var9.method2866(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2866(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2866(arg3);
            }
        }
        class450 var12 = class450.method2000();
        var12.method7491(1.0F, 0.0F, 0.0F, var6);
        class450 var13 = class450.method2000();
        var13.method7491(0.0F, 1.0F, 0.0F, var7);
        class450 var14 = class450.method2000();
        var14.method7491(0.0F, 0.0F, 1.0F, var8);
        class450 var15 = class450.method2000();
        var15.method7493(var14);
        var15.method7493(var12);
        var15.method7493(var13);
        class451[] var16 = class451.field4738;
        class451 var17;
        synchronized (class451.field4738) {
            if (Statics.field4779 == 0) {
                var17 = new class451();
            } else {
                class451.field4738[--Statics.field4779].method7522();
                var17 = class451.field4738[Statics.field4779];
            }
        }
        var17.method7568(var15);
        arg0.method7565(var17);
        var12.method7508();
        var13.method7508();
        var14.method7508();
        var15.method7508();
        var17.method7563();
    }

    @ObfuscatedName("fv.az(Lrz;ILeo;II)V")
    public void method2929(class451 arg0, int arg1, class128 arg2, int arg3) {
        float[] var5 = arg2.method2828(this.field1624);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1622[arg1] != null) {
            class131 var9 = this.field1622[arg1][3];
            class131 var10 = this.field1622[arg1][4];
            class131 var11 = this.field1622[arg1][5];
            if (var9 != null) {
                var6 = var9.method2866(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2866(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2866(arg3);
            }
        }
        arg0.field4740[12] = var6;
        arg0.field4740[13] = var7;
        arg0.field4740[14] = var8;
    }

    @ObfuscatedName("fv.ap(Lrz;ILeo;II)V")
    public void method2932(class451 arg0, int arg1, class128 arg2, int arg3) {
        float[] var5 = arg2.method2829(this.field1624);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1622[arg1] != null) {
            class131 var9 = this.field1622[arg1][6];
            class131 var10 = this.field1622[arg1][7];
            class131 var11 = this.field1622[arg1][8];
            if (var9 != null) {
                var6 = var9.method2866(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2866(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2866(arg3);
            }
        }
        class451[] var12 = class451.field4738;
        class451 var13;
        synchronized (class451.field4738) {
            if (Statics.field4779 == 0) {
                var13 = new class451();
            } else {
                class451.field4738[--Statics.field4779].method7522();
                var13 = class451.field4738[Statics.field4779];
            }
        }
        var13.method7526(var6, var7, var8);
        arg0.method7565(var13);
        var13.method7563();
    }
}
