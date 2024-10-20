package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("ft")
public class class143 extends class501 {

    @ObfuscatedName("ft.aq")
    public int field1658;

    @ObfuscatedName("ft.ad")
    public class136[][] field1655 = (class136[][]) null;

    @ObfuscatedName("ft.ag")
    public class136[][] field1651 = (class136[][]) null;

    @ObfuscatedName("ft.ak")
    public class282 field1652;

    @ObfuscatedName("ft.ap")
    public int field1653 = 0;

    @ObfuscatedName("ft.an")
    public boolean field1654;

    @ObfuscatedName("ft.ab")
    public Future field1657;

    @ObfuscatedName("ft.ai")
    public List field1659;

    public class143(class388 arg0, class388 arg1, int arg2, boolean arg3) {
        this.field1658 = arg2;
        byte[] var5 = arg0.method6539(this.field1658 >> 16 & 0xFFFF, this.field1658 & 0xFFFF);
        class547 var6 = new class547(var5);
        int var7 = var6.method8804();
        int var8 = var6.method8899();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6546(0, var8);
        } else {
            var9 = arg1.method6546(var8, 0);
        }
        this.field1652 = new class282(var8, var9);
        this.field1659 = new ArrayList();
        this.field1657 = Statics.field1656.submit(new class140(this, var6, var7));
    }

    @ObfuscatedName("ft.aq(Lvp;II)V")
    public void method3043(class547 arg0, int arg1) {
        arg0.method8899();
        arg0.method8899();
        this.field1653 = arg0.method8804();
        int var3 = arg0.method8899();
        this.field1651 = new class136[this.field1652.method4919().method4868()][];
        this.field1655 = new class136[this.field1652.method4918()][];
        class135[] var4 = new class135[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class137 var6 = class137.method1878(arg0.method8804());
            int var7 = arg0.method8743();
            class138 var8 = class138.method8119(arg0.method8804());
            class136 var9 = new class136();
            var9.method2978(arg0, arg1);
            var4[var5] = new class135(this, var9, var6, var8, var7);
            int var10 = var6.method3011();
            class136[][] var11;
            if (class137.field1602 == var6) {
                var11 = this.field1651;
            } else {
                var11 = this.field1655;
            }
            if (var11[var7] == null) {
                var11[var7] = new class136[var10];
            }
            if (class137.field1601 == var6) {
                this.field1654 = true;
            }
        }
        int var12 = var3 / Statics.field1650;
        int var13 = var3 % Statics.field1650;
        int var14 = 0;
        for (int var15 = 0; var15 < Statics.field1650; var15++) {
            int var16 = var14;
            var14 += var12;
            if (var13 > 0) {
                var14++;
                var13--;
            }
            if (var14 == var16) {
                break;
            }
            this.field1659.add(Statics.field1656.submit(new class142(this, var16, var14, var4)));
        }
    }

    @ObfuscatedName("ft.ad(I)Z")
    public boolean method3070() {
        if (this.field1657 == null && this.field1659 == null) {
            return true;
        }
        if (this.field1657 != null) {
            if (!this.field1657.isDone()) {
                return false;
            }
            this.field1657 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1659.size(); var2++) {
            if (((Future) this.field1659.get(var2)).isDone()) {
                this.field1659.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1659 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ft.ag(I)I")
    public int method3044() {
        return this.field1653;
    }

    @ObfuscatedName("ft.ak(I)Z")
    public boolean method3045() {
        return this.field1654;
    }

    @ObfuscatedName("ft.ap(ILfv;III)V")
    public void method3050(int arg0, class133 arg1, int arg2, int arg3) {
        class425 var5 = class425.method3262();
        this.method3047(var5, arg2, arg1, arg0);
        this.method3069(var5, arg2, arg1, arg0);
        this.method3048(var5, arg2, arg1, arg0);
        arg1.method2923(var5);
        var5.method7146();
    }

    @ObfuscatedName("ft.an(Lqg;ILfv;II)V")
    public void method3047(class425 arg0, int arg1, class133 arg2, int arg3) {
        float[] var5 = arg2.method2927(this.field1653);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1651[arg1] != null) {
            class136 var9 = this.field1651[arg1][0];
            class136 var10 = this.field1651[arg1][1];
            class136 var11 = this.field1651[arg1][2];
            if (var9 != null) {
                var6 = var9.method2980(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2980(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2980(arg3);
            }
        }
        class424 var12 = class424.method2166();
        var12.method7079(1.0F, 0.0F, 0.0F, var6);
        class424 var13 = class424.method2166();
        var13.method7079(0.0F, 1.0F, 0.0F, var7);
        class424 var14 = class424.method2166();
        var14.method7079(0.0F, 0.0F, 1.0F, var8);
        class424 var15 = class424.method2166();
        var15.method7082(var14);
        var15.method7082(var12);
        var15.method7082(var13);
        class425[] var16 = class425.field4705;
        class425 var17;
        synchronized (class425.field4705) {
            if (Statics.field4707 == 0) {
                var17 = new class425();
            } else {
                class425.field4705[--Statics.field4707].method7134();
                var17 = class425.field4705[Statics.field4707];
            }
        }
        var17.method7142(var15);
        arg0.method7130(var17);
        var12.method7109();
        var13.method7109();
        var14.method7109();
        var15.method7109();
        var17.method7146();
    }

    @ObfuscatedName("ft.aj(Lqg;ILfv;II)V")
    public void method3048(class425 arg0, int arg1, class133 arg2, int arg3) {
        float[] var5 = arg2.method2925(this.field1653);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1651[arg1] != null) {
            class136 var9 = this.field1651[arg1][3];
            class136 var10 = this.field1651[arg1][4];
            class136 var11 = this.field1651[arg1][5];
            if (var9 != null) {
                var6 = var9.method2980(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2980(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2980(arg3);
            }
        }
        arg0.field4710[12] = var6;
        arg0.field4710[13] = var7;
        arg0.field4710[14] = var8;
    }

    @ObfuscatedName("ft.av(Lqg;ILfv;II)V")
    public void method3069(class425 arg0, int arg1, class133 arg2, int arg3) {
        float[] var5 = arg2.method2965(this.field1653);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1651[arg1] != null) {
            class136 var9 = this.field1651[arg1][6];
            class136 var10 = this.field1651[arg1][7];
            class136 var11 = this.field1651[arg1][8];
            if (var9 != null) {
                var6 = var9.method2980(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2980(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2980(arg3);
            }
        }
        class425[] var12 = class425.field4705;
        class425 var13;
        synchronized (class425.field4705) {
            if (Statics.field4707 == 0) {
                var13 = new class425();
            } else {
                class425.field4705[--Statics.field4707].method7134();
                var13 = class425.field4705[Statics.field4707];
            }
        }
        var13.method7149(var6, var7, var8);
        arg0.method7130(var13);
        var13.method7146();
    }
}
