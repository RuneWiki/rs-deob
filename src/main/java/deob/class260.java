package deob;

@ObfuscatedName("jj")
public class class260 implements class273 {

    @ObfuscatedName("jj.ak")
    public class245[] field2836;

    @ObfuscatedName("jj.al")
    public class406 field2832 = new class406();

    @ObfuscatedName("jj.aj")
    public int field2838;

    @ObfuscatedName("jj.az")
    public int field2834 = 0;

    @ObfuscatedName("jj.af")
    public double field2835 = 1.0D;

    @ObfuscatedName("jj.aa")
    public int field2833 = 128;

    @ObfuscatedName("jj.at")
    public class387 field2837;

    public class260(class387 arg0, class387 arg1, int arg2, double arg3, int arg4) {
        this.field2837 = arg1;
        this.field2838 = arg2;
        this.field2834 = this.field2838;
        this.field2835 = arg3;
        this.field2833 = arg4;
        int[] var7 = arg0.method6581(0);
        if (var7 == null) {
            this.field2836 = new class245[0];
        } else {
            int var8 = var7.length;
            this.field2836 = new class245[arg0.method6591(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class546 var10 = new class546(arg0.method6573(0, var7[var9]));
                this.field2836[var7[var9]] = new class245(var10);
            }
        }
    }

    @ObfuscatedName("jj.ak(B)I")
    public int method4749() {
        if (this.field2836.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class245[] var3 = this.field2836;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class245 var5 = var3[var4];
            if (var5 != null && var5.field2618 != null) {
                var1 += var5.field2618.length;
                int[] var6 = var5.field2618;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2837.method6575(var8)) {
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

    @ObfuscatedName("jj.al(D)V")
    public void method4750(double arg0) {
        this.field2835 = arg0;
        this.method4775();
    }

    @ObfuscatedName("jj.aj(IB)[I")
    public int[] method4751(int arg0) {
        class245 var2 = this.field2836[arg0];
        if (var2 != null) {
            if (var2.field2612 != null) {
                this.field2832.method6830(var2);
                var2.field2625 = true;
                return var2.field2612;
            }
            boolean var3 = var2.method4319(this.field2835, this.field2833, this.field2837);
            if (var3) {
                if (this.field2834 == 0) {
                    class245 var4 = (class245) this.field2832.method6833();
                    var4.method4320();
                } else {
                    this.field2834--;
                }
                this.field2832.method6830(var2);
                var2.field2625 = true;
                return var2.field2612;
            }
        }
        return null;
    }

    @ObfuscatedName("jj.az(II)I")
    public int method4752(int arg0) {
        return this.field2836[arg0] == null ? 0 : this.field2836[arg0].field2616;
    }

    @ObfuscatedName("jj.af(II)Z")
    public boolean method4753(int arg0) {
        return this.field2836[arg0].field2619;
    }

    @ObfuscatedName("jj.aa(II)Z")
    public boolean method4765(int arg0) {
        return this.field2833 == 64;
    }

    @ObfuscatedName("jj.at(I)V")
    public void method4775() {
        for (int var1 = 0; var1 < this.field2836.length; var1++) {
            if (this.field2836[var1] != null) {
                this.field2836[var1].method4320();
            }
        }
        this.field2832 = new class406();
        this.field2834 = this.field2838;
    }

    @ObfuscatedName("jj.ab(II)V")
    public void method4768(int arg0) {
        for (int var2 = 0; var2 < this.field2836.length; var2++) {
            class245 var3 = this.field2836[var2];
            if (var3 != null && var3.field2622 != 0 && var3.field2625) {
                var3.method4321(arg0);
                var3.field2625 = false;
            }
        }
    }
}
