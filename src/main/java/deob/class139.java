package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfuscatedName("fu")
public class class139 extends class485 {

    @ObfuscatedName("fu.am")
    public int field1603;

    @ObfuscatedName("fu.ap")
    public class132[][] field1599 = (class132[][]) null;

    @ObfuscatedName("fu.af")
    public class132[][] field1600 = (class132[][]) null;

    @ObfuscatedName("fu.aj")
    public class273 field1602;

    @ObfuscatedName("fu.aq")
    public int field1605 = 0;

    @ObfuscatedName("fu.ar")
    public boolean field1604;

    @ObfuscatedName("fu.ae")
    public Future field1601;

    @ObfuscatedName("fu.aa")
    public List field1598;

    public class139(class375 arg0, class375 arg1, int arg2, boolean arg3) {
        this.field1603 = arg2;
        byte[] var5 = arg0.method6396(this.field1603 >> 16 & 0xFFFF, this.field1603 & 0xFFFF);
        class531 var6 = new class531(var5);
        int var7 = var6.method8561();
        int var8 = var6.method8775();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6423(0, var8);
        } else {
            var9 = arg1.method6423(var8, 0);
        }
        this.field1602 = new class273(var8, var9);
        this.field1598 = new ArrayList();
        this.field1601 = Statics.field86.submit(new class136(this, var6, var7));
    }

    @ObfuscatedName("fu.am(Luk;IB)V")
    public void method3025(class531 arg0, int arg1) {
        arg0.method8775();
        arg0.method8775();
        this.field1605 = arg0.method8561();
        int var3 = arg0.method8775();
        this.field1600 = new class132[this.field1602.method4871().method4821()][];
        this.field1599 = new class132[this.field1602.method4870()][];
        class131[] var4 = new class131[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method8561();
            class133 var7 = (class133) class389.method6514(class133.method2875(), var6);
            if (var7 == null) {
                var7 = class133.field1556;
            }
            int var10 = arg0.method8631();
            class134 var11 = class134.method1037(arg0.method8561());
            class132 var12 = new class132();
            var12.method2956(arg0, arg1);
            var4[var5] = new class131(this, var12, var7, var11, var10);
            int var13 = var7.method2990();
            class132[][] var14;
            if (class133.field1554 == var7) {
                var14 = this.field1600;
            } else {
                var14 = this.field1599;
            }
            if (var14[var10] == null) {
                var14[var10] = new class132[var13];
            }
            if (class133.field1557 == var7) {
                this.field1604 = true;
            }
        }
        int var15 = var3 / Statics.field898;
        int var16 = var3 % Statics.field898;
        int var17 = 0;
        for (int var18 = 0; var18 < Statics.field898; var18++) {
            int var19 = var17;
            var17 += var15;
            if (var16 > 0) {
                var17++;
                var16--;
            }
            if (var17 == var19) {
                break;
            }
            this.field1598.add(Statics.field86.submit(new class138(this, var19, var17, var4)));
        }
    }

    @ObfuscatedName("fu.ap(I)Z")
    public boolean method3026() {
        if (this.field1601 == null && this.field1598 == null) {
            return true;
        }
        if (this.field1601 != null) {
            if (!this.field1601.isDone()) {
                return false;
            }
            this.field1601 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1598.size(); var2++) {
            if (((Future) this.field1598.get(var2)).isDone()) {
                this.field1598.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1598 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fu.af(I)I")
    public int method3027() {
        return this.field1605;
    }

    @ObfuscatedName("fu.aj(I)Z")
    public boolean method3028() {
        return this.field1604;
    }

    @ObfuscatedName("fu.aq(ILez;III)V")
    public void method3029(int arg0, class129 arg1, int arg2, int arg3) {
        class467 var5 = class467.method4584();
        this.method3030(var5, arg2, arg1, arg0);
        this.method3050(var5, arg2, arg1, arg0);
        this.method3031(var5, arg2, arg1, arg0);
        arg1.method2929(var5);
        var5.method7816();
    }

    @ObfuscatedName("fu.ar(Lrh;ILez;II)V")
    public void method3030(class467 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2927(this.field1605);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1600[arg1] != null) {
            class132 var9 = this.field1600[arg1][0];
            class132 var10 = this.field1600[arg1][1];
            class132 var11 = this.field1600[arg1][2];
            if (var9 != null) {
                var6 = var9.method2959(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2959(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2959(arg3);
            }
        }
        class466[] var12 = class466.field4801;
        class466 var13;
        synchronized (class466.field4801) {
            if (class466.field4802 == 0) {
                var13 = new class466();
            } else {
                class466.field4801[--class466.field4802].method7772();
                var13 = class466.field4801[class466.field4802];
            }
        }
        var13.method7771(1.0F, 0.0F, 0.0F, var6);
        class466[] var16 = class466.field4801;
        class466 var17;
        synchronized (class466.field4801) {
            if (class466.field4802 == 0) {
                var17 = new class466();
            } else {
                class466.field4801[--class466.field4802].method7772();
                var17 = class466.field4801[class466.field4802];
            }
        }
        var17.method7771(0.0F, 1.0F, 0.0F, var7);
        class466[] var20 = class466.field4801;
        class466 var21;
        synchronized (class466.field4801) {
            if (class466.field4802 == 0) {
                var21 = new class466();
            } else {
                class466.field4801[--class466.field4802].method7772();
                var21 = class466.field4801[class466.field4802];
            }
        }
        var21.method7771(0.0F, 0.0F, 1.0F, var8);
        class466[] var24 = class466.field4801;
        class466 var25;
        synchronized (class466.field4801) {
            if (class466.field4802 == 0) {
                var25 = new class466();
            } else {
                class466.field4801[--class466.field4802].method7772();
                var25 = class466.field4801[class466.field4802];
            }
        }
        var25.method7788(var21);
        var25.method7788(var13);
        var25.method7788(var17);
        class467 var28 = class467.method4584();
        var28.method7847(var25);
        arg0.method7809(var28);
        var13.method7790();
        var17.method7790();
        var21.method7790();
        var25.method7790();
        var28.method7816();
    }

    @ObfuscatedName("fu.ag(Lrh;ILez;IB)V")
    public void method3031(class467 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2930(this.field1605);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1600[arg1] != null) {
            class132 var9 = this.field1600[arg1][3];
            class132 var10 = this.field1600[arg1][4];
            class132 var11 = this.field1600[arg1][5];
            if (var9 != null) {
                var6 = var9.method2959(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2959(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2959(arg3);
            }
        }
        arg0.field4810[12] = var6;
        arg0.field4810[13] = var7;
        arg0.field4810[14] = var8;
    }

    @ObfuscatedName("fu.ao(Lrh;ILez;II)V")
    public void method3050(class467 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2916(this.field1605);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1600[arg1] != null) {
            class132 var9 = this.field1600[arg1][6];
            class132 var10 = this.field1600[arg1][7];
            class132 var11 = this.field1600[arg1][8];
            if (var9 != null) {
                var6 = var9.method2959(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2959(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2959(arg3);
            }
        }
        class467 var12 = class467.method4584();
        var12.method7836(var6, var7, var8);
        arg0.method7809(var12);
        var12.method7816();
    }
}
