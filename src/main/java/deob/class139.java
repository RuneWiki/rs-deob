package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fa")
public class class139 extends class489 {

    @ObfuscatedName("fa.az")
    public int field1638;

    @ObfuscatedName("fa.ah")
    public class132[][] field1634 = (class132[][]) null;

    @ObfuscatedName("fa.af")
    public class132[][] field1635 = (class132[][]) null;

    @ObfuscatedName("fa.at")
    public class246 field1636;

    @ObfuscatedName("fa.an")
    public int field1637 = 0;

    @ObfuscatedName("fa.ao")
    public boolean field1644;

    @ObfuscatedName("fa.ad")
    public Future field1639;

    @ObfuscatedName("fa.al")
    public List field1640;

    public class139(class379 arg0, class379 arg1, int arg2, boolean arg3) {
        this.field1638 = arg2;
        byte[] var5 = arg0.method6328(this.field1638 >> 16 & 0xFFFF, this.field1638 & 0xFFFF);
        class535 var6 = new class535(var5);
        int var7 = var6.method8462();
        int var8 = var6.method8670();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6355(0, var8);
        } else {
            var9 = arg1.method6355(var8, 0);
        }
        this.field1636 = new class246(var8, var9);
        this.field1640 = new ArrayList();
        this.field1639 = Statics.field3568.submit(new class136(this, var6, var7));
    }

    @ObfuscatedName("fa.az(Lur;IB)V")
    public void method2943(class535 arg0, int arg1) {
        arg0.method8670();
        arg0.method8670();
        this.field1637 = arg0.method8462();
        int var3 = arg0.method8670();
        this.field1635 = new class132[this.field1636.method4335().method4280()][];
        this.field1634 = new class132[this.field1636.method4333()][];
        class131[] var4 = new class131[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class133 var6 = class133.method6557(arg0.method8462());
            int var7 = arg0.method8477();
            class134 var8 = class134.method5203(arg0.method8462());
            class132 var9 = new class132();
            var9.method2880(arg0, arg1);
            var4[var5] = new class131(this, var9, var6, var8, var7);
            int var10 = var6.method2912();
            class132[][] var11;
            if (class133.field1584 == var6) {
                var11 = this.field1635;
            } else {
                var11 = this.field1634;
            }
            if (var11[var7] == null) {
                var11[var7] = new class132[var10];
            }
            if (class133.field1587 == var6) {
                this.field1644 = true;
            }
        }
        int var12 = var3 / Statics.field1731;
        int var13 = var3 % Statics.field1731;
        int var14 = 0;
        for (int var15 = 0; var15 < Statics.field1731; var15++) {
            int var16 = var14;
            var14 += var12;
            if (var13 > 0) {
                var14++;
                var13--;
            }
            if (var14 == var16) {
                break;
            }
            this.field1640.add(Statics.field3568.submit(new class138(this, var16, var14, var4)));
        }
    }

    @ObfuscatedName("fa.ah(B)Z")
    public boolean method2944() {
        if (this.field1639 == null && this.field1640 == null) {
            return true;
        }
        if (this.field1639 != null) {
            if (!this.field1639.isDone()) {
                return false;
            }
            this.field1639 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1640.size(); var2++) {
            if (((Future) this.field1640.get(var2)).isDone()) {
                this.field1640.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1640 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fa.af(B)I")
    public int method2948() {
        return this.field1637;
    }

    @ObfuscatedName("fa.at(I)Z")
    public boolean method2946() {
        return this.field1644;
    }

    @ObfuscatedName("fa.an(ILei;IIS)V")
    public void method2947(int arg0, class129 arg1, int arg2, int arg3) {
        class471 var5 = class471.method2467();
        this.method2963(var5, arg2, arg1, arg0);
        this.method2950(var5, arg2, arg1, arg0);
        this.method2949(var5, arg2, arg1, arg0);
        arg1.method2830(var5);
        var5.method7738();
    }

    @ObfuscatedName("fa.ao(Lsq;ILei;IS)V")
    public void method2963(class471 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2849(this.field1637);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1635[arg1] != null) {
            class132 var9 = this.field1635[arg1][0];
            class132 var10 = this.field1635[arg1][1];
            class132 var11 = this.field1635[arg1][2];
            if (var9 != null) {
                var6 = var9.method2888(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2888(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2888(arg3);
            }
        }
        class470 var12 = class470.method4824();
        var12.method7661(1.0F, 0.0F, 0.0F, var6);
        class470 var13 = class470.method4824();
        var13.method7661(0.0F, 1.0F, 0.0F, var7);
        class470 var14 = class470.method4824();
        var14.method7661(0.0F, 0.0F, 1.0F, var8);
        class470 var15 = class470.method4824();
        var15.method7660(var14);
        var15.method7660(var12);
        var15.method7660(var13);
        class471 var16 = class471.method2467();
        var16.method7710(var15);
        arg0.method7692(var16);
        var12.method7664();
        var13.method7664();
        var14.method7664();
        var15.method7664();
        var16.method7738();
    }

    @ObfuscatedName("fa.ab(Lsq;ILei;IS)V")
    public void method2949(class471 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2835(this.field1637);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1635[arg1] != null) {
            class132 var9 = this.field1635[arg1][3];
            class132 var10 = this.field1635[arg1][4];
            class132 var11 = this.field1635[arg1][5];
            if (var9 != null) {
                var6 = var9.method2888(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2888(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2888(arg3);
            }
        }
        arg0.field4873[12] = var6;
        arg0.field4873[13] = var7;
        arg0.field4873[14] = var8;
    }

    @ObfuscatedName("fa.aw(Lsq;ILei;IB)V")
    public void method2950(class471 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2825(this.field1637);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1635[arg1] != null) {
            class132 var9 = this.field1635[arg1][6];
            class132 var10 = this.field1635[arg1][7];
            class132 var11 = this.field1635[arg1][8];
            if (var9 != null) {
                var6 = var9.method2888(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2888(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2888(arg3);
            }
        }
        class471 var12 = class471.method2467();
        var12.method7688(var6, var7, var8);
        arg0.method7692(var12);
        var12.method7738();
    }
}
