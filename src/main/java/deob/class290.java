package deob;

@ObfuscatedName("li")
public class class290 implements class303 {

    @ObfuscatedName("li.aq")
    public class275[] field3054;

    @ObfuscatedName("li.ad")
    public class407 field3049 = new class407();

    @ObfuscatedName("li.ag")
    public int field3048;

    @ObfuscatedName("li.ak")
    public int field3053 = 0;

    @ObfuscatedName("li.ap")
    public double field3052 = 1.0D;

    @ObfuscatedName("li.an")
    public int field3051 = 128;

    @ObfuscatedName("li.aj")
    public class388 field3050;

    public class290(class388 arg0, class388 arg1, int arg2, double arg3, int arg4) {
        this.field3050 = arg1;
        this.field3048 = arg2;
        this.field3053 = this.field3048;
        this.field3052 = arg3;
        this.field3051 = arg4;
        int[] var7 = arg0.method6548(0);
        if (var7 == null) {
            this.field3054 = new class275[0];
        } else {
            int var8 = var7.length;
            this.field3054 = new class275[arg0.method6549(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class547 var10 = new class547(arg0.method6539(0, var7[var9]));
                this.field3054[var7[var9]] = new class275(var10);
            }
        }
    }

    @ObfuscatedName("li.aq(I)I")
    public int method5187() {
        if (this.field3054.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class275[] var3 = this.field3054;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class275 var5 = var3[var4];
            if (var5 != null && var5.field2831 != null) {
                var1 += var5.field2831.length;
                int[] var6 = var5.field2831;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field3050.method6542(var8)) {
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

    @ObfuscatedName("li.ad(D)V")
    public void method5188(double arg0) {
        this.field3052 = arg0;
        this.method5193();
    }

    @ObfuscatedName("li.ag(IB)[I")
    public int[] method5205(int arg0) {
        class275 var2 = this.field3054[arg0];
        if (var2 != null) {
            if (var2.field2836 != null) {
                this.field3049.method6793(var2);
                var2.field2837 = true;
                return var2.field2836;
            }
            boolean var3 = var2.method4747(this.field3052, this.field3051, this.field3050);
            if (var3) {
                if (this.field3053 == 0) {
                    class275 var4 = (class275) this.field3049.method6796();
                    var4.method4748();
                } else {
                    this.field3053--;
                }
                this.field3049.method6793(var2);
                var2.field2837 = true;
                return var2.field2836;
            }
        }
        return null;
    }

    @ObfuscatedName("li.ak(II)I")
    public int method5207(int arg0) {
        return this.field3054[arg0] == null ? 0 : this.field3054[arg0].field2828;
    }

    @ObfuscatedName("li.ap(II)Z")
    public boolean method5191(int arg0) {
        return this.field3054[arg0].field2829;
    }

    @ObfuscatedName("li.an(II)Z")
    public boolean method5189(int arg0) {
        return this.field3051 == 64;
    }

    @ObfuscatedName("li.aj(B)V")
    public void method5193() {
        for (int var1 = 0; var1 < this.field3054.length; var1++) {
            if (this.field3054[var1] != null) {
                this.field3054[var1].method4748();
            }
        }
        this.field3049 = new class407();
        this.field3053 = this.field3048;
    }

    @ObfuscatedName("li.av(II)V")
    public void method5200(int arg0) {
        for (int var2 = 0; var2 < this.field3054.length; var2++) {
            class275 var3 = this.field3054[var2];
            if (var3 != null && var3.field2834 != 0 && var3.field2837) {
                var3.method4749(arg0);
                var3.field2837 = false;
            }
        }
    }
}
