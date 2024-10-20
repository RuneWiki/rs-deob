package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fl")
public class class135 extends class439 {

    @ObfuscatedName("fl.aj")
    public int field1575;

    @ObfuscatedName("fl.al")
    public class128[][] field1569 = (class128[][]) null;

    @ObfuscatedName("fl.ac")
    public class128[][] field1576 = (class128[][]) null;

    @ObfuscatedName("fl.ab")
    public class222 field1571;

    @ObfuscatedName("fl.an")
    public int field1568 = 0;

    @ObfuscatedName("fl.ao")
    public boolean field1570;

    @ObfuscatedName("fl.ap")
    public Future field1573;

    @ObfuscatedName("fl.ar")
    public List field1572;

    public class135(class340 arg0, class340 arg1, int arg2, boolean arg3) {
        this.field1575 = arg2;
        byte[] var5 = arg0.method5860(this.field1575 >> 16 & 0xFFFF, this.field1575 & 0xFFFF);
        class478 var6 = new class478(var5);
        int var7 = var6.method7909();
        int var8 = var6.method7905();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method5866(0, var8);
        } else {
            var9 = arg1.method5866(var8, 0);
        }
        this.field1571 = new class222(var8, var9);
        this.field1572 = new ArrayList();
        this.field1573 = Statics.field1414.submit(new class132(this, var6, var7));
    }

    @ObfuscatedName("fl.aj(Lsy;IB)V")
    public void method2906(class478 arg0, int arg1) {
        arg0.method7905();
        arg0.method7905();
        this.field1568 = arg0.method7909();
        int var3 = arg0.method7905();
        this.field1576 = new class128[this.field1571.method4024().method4004()][];
        this.field1569 = new class128[this.field1571.method4027()][];
        class127[] var4 = new class127[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class129 var6 = class129.method2740(arg0.method7909());
            int var7 = arg0.method7917();
            class130 var8 = class130.method4754(arg0.method7909());
            class128 var9 = new class128();
            var9.method2835(arg0, arg1);
            var4[var5] = new class127(this, var9, var6, var8, var7);
            int var10 = var6.method2869();
            class128[][] var11;
            if (class129.field1535 == var6) {
                var11 = this.field1576;
            } else {
                var11 = this.field1569;
            }
            if (var11[var7] == null) {
                var11[var7] = new class128[var10];
            }
            if (class129.field1527 == var6) {
                this.field1570 = true;
            }
        }
        int var12 = var3 / Statics.field1574;
        int var13 = var3 % Statics.field1574;
        int var14 = 0;
        for (int var15 = 0; var15 < Statics.field1574; var15++) {
            int var16 = var14;
            var14 += var12;
            if (var13 > 0) {
                var14++;
                var13--;
            }
            if (var14 == var16) {
                break;
            }
            this.field1572.add(Statics.field1414.submit(new class134(this, var16, var14, var4)));
        }
    }

    @ObfuscatedName("fl.al(I)Z")
    public boolean method2901() {
        if (this.field1573 == null && this.field1572 == null) {
            return true;
        }
        if (this.field1573 != null) {
            if (!this.field1573.isDone()) {
                return false;
            }
            this.field1573 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1572.size(); var2++) {
            if (((Future) this.field1572.get(var2)).isDone()) {
                this.field1572.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1572 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fl.ac(B)I")
    public int method2915() {
        return this.field1568;
    }

    @ObfuscatedName("fl.ab(I)Z")
    public boolean method2900() {
        return this.field1570;
    }

    @ObfuscatedName("fl.an(ILek;III)V")
    public void method2904(int arg0, class125 arg1, int arg2, int arg3) {
        class422[] var5 = class422.field4612;
        class422 var6;
        synchronized (class422.field4612) {
            if (class422.field4611 == 0) {
                var6 = new class422();
            } else {
                class422.field4612[--class422.field4611].method7195();
                var6 = class422.field4612[class422.field4611];
            }
        }
        this.method2905(var6, arg2, arg1, arg0);
        this.method2902(var6, arg2, arg1, arg0);
        this.method2911(var6, arg2, arg1, arg0);
        arg1.method2810(var6);
        var6.method7227();
    }

    @ObfuscatedName("fl.ao(Lqt;ILek;IB)V")
    public void method2905(class422 arg0, int arg1, class125 arg2, int arg3) {
        float[] var5 = arg2.method2801(this.field1568);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1576[arg1] != null) {
            class128 var9 = this.field1576[arg1][0];
            class128 var10 = this.field1576[arg1][1];
            class128 var11 = this.field1576[arg1][2];
            if (var9 != null) {
                var6 = var9.method2837(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2837(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2837(arg3);
            }
        }
        class421 var12 = class421.method4961();
        var12.method7159(1.0F, 0.0F, 0.0F, var6);
        class421 var13 = class421.method4961();
        var13.method7159(0.0F, 1.0F, 0.0F, var7);
        class421 var14 = class421.method4961();
        var14.method7159(0.0F, 0.0F, 1.0F, var8);
        class421 var15 = class421.method4961();
        var15.method7158(var14);
        var15.method7158(var12);
        var15.method7158(var13);
        class422[] var16 = class422.field4612;
        class422 var17;
        synchronized (class422.field4612) {
            if (class422.field4611 == 0) {
                var17 = new class422();
            } else {
                class422.field4612[--class422.field4611].method7195();
                var17 = class422.field4612[class422.field4611];
            }
        }
        var17.method7191(var15);
        arg0.method7190(var17);
        var12.method7163();
        var13.method7163();
        var14.method7163();
        var15.method7163();
        var17.method7227();
    }

    @ObfuscatedName("fl.av(Lqt;ILek;IB)V")
    public void method2911(class422 arg0, int arg1, class125 arg2, int arg3) {
        float[] var5 = arg2.method2802(this.field1568);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1576[arg1] != null) {
            class128 var9 = this.field1576[arg1][3];
            class128 var10 = this.field1576[arg1][4];
            class128 var11 = this.field1576[arg1][5];
            if (var9 != null) {
                var6 = var9.method2837(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2837(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2837(arg3);
            }
        }
        arg0.field4609[12] = var6;
        arg0.field4609[13] = var7;
        arg0.field4609[14] = var8;
    }

    @ObfuscatedName("fl.aq(Lqt;ILek;IB)V")
    public void method2902(class422 arg0, int arg1, class125 arg2, int arg3) {
        float[] var5 = arg2.method2803(this.field1568);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1576[arg1] != null) {
            class128 var9 = this.field1576[arg1][6];
            class128 var10 = this.field1576[arg1][7];
            class128 var11 = this.field1576[arg1][8];
            if (var9 != null) {
                var6 = var9.method2837(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2837(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2837(arg3);
            }
        }
        class422[] var12 = class422.field4612;
        class422 var13;
        synchronized (class422.field4612) {
            if (class422.field4611 == 0) {
                var13 = new class422();
            } else {
                class422.field4612[--class422.field4611].method7195();
                var13 = class422.field4612[class422.field4611];
            }
        }
        var13.method7186(var6, var7, var8);
        arg0.method7190(var13);
        var13.method7227();
    }
}
