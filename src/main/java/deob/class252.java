package deob;

@ObfuscatedName("jk")
public class class252 implements class265 {

    @ObfuscatedName("jk.ap")
    public class237[] field2775;

    @ObfuscatedName("jk.aw")
    public class411 field2779 = new class411();

    @ObfuscatedName("jk.ak")
    public int field2774;

    @ObfuscatedName("jk.aj")
    public int field2773 = 0;

    @ObfuscatedName("jk.ai")
    public double field2777 = 1.0D;

    @ObfuscatedName("jk.ay")
    public int field2778 = 128;

    @ObfuscatedName("jk.as")
    public class392 field2776;

    public class252(class392 arg0, class392 arg1, int arg2, double arg3, int arg4) {
        this.field2776 = arg1;
        this.field2774 = arg2;
        this.field2773 = this.field2774;
        this.field2777 = arg3;
        this.field2778 = arg4;
        int[] var7 = arg0.method7003(0);
        if (var7 == null) {
            this.field2775 = new class237[0];
        } else {
            int var8 = var7.length;
            this.field2775 = new class237[arg0.method7004(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class558 var10 = new class558(arg0.method7009(0, var7[var9]));
                this.field2775[var7[var9]] = new class237(var10);
            }
        }
    }

    @ObfuscatedName("jk.ap(I)I")
    public int method4950() {
        if (this.field2775.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class237[] var3 = this.field2775;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class237 var5 = var3[var4];
            if (var5 != null && var5.field2543 != null) {
                var1 += var5.field2543.length;
                int[] var6 = var5.field2543;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2776.method6997(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("jk.aw(D)V")
    public void method4949(double arg0) {
        this.field2777 = arg0;
        this.method4955();
    }

    @ObfuscatedName("jk.ak(IB)[I")
    public int[] method4951(int arg0) {
        class237 var2 = this.field2775[arg0];
        if (var2 != null) {
            if (var2.field2549 != null) {
                this.field2779.method7244(var2);
                var2.field2550 = true;
                return var2.field2549;
            }
            boolean var3 = var2.method4482(this.field2777, this.field2778, this.field2776);
            if (var3) {
                if (this.field2773 == 0) {
                    class237 var4 = (class237) this.field2779.method7277();
                    var4.method4483();
                } else {
                    this.field2773--;
                }
                this.field2779.method7244(var2);
                var2.field2550 = true;
                return var2.field2549;
            }
        }
        return null;
    }

    @ObfuscatedName("jk.aj(IB)I")
    public int method4967(int arg0) {
        return this.field2775[arg0] == null ? 0 : this.field2775[arg0].field2537;
    }

    @ObfuscatedName("jk.ai(IB)Z")
    public boolean method4972(int arg0) {
        return this.field2775[arg0].field2540;
    }

    @ObfuscatedName("jk.ay(IB)Z")
    public boolean method4954(int arg0) {
        return this.field2778 == 64;
    }

    @ObfuscatedName("jk.as(I)V")
    public void method4955() {
        for (int var1 = 0; var1 < this.field2775.length; var1++) {
            if (this.field2775[var1] != null) {
                this.field2775[var1].method4483();
            }
        }
        this.field2779 = new class411();
        this.field2773 = this.field2774;
    }

    @ObfuscatedName("jk.ae(IB)V")
    public void method4956(int arg0) {
        for (int var2 = 0; var2 < this.field2775.length; var2++) {
            class237 var3 = this.field2775[var2];
            if (var3 != null && var3.field2547 != 0 && var3.field2550) {
                var3.method4484(arg0);
                var3.field2550 = false;
            }
        }
    }
}
