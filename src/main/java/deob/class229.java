package deob;

@ObfuscatedName("ia")
public class class229 implements class237 {

    @ObfuscatedName("ia.aj")
    public class217[] field2627;

    @ObfuscatedName("ia.al")
    public class359 field2629 = new class359();

    @ObfuscatedName("ia.ac")
    public int field2622;

    @ObfuscatedName("ia.ab")
    public int field2620 = 0;

    @ObfuscatedName("ia.an")
    public double field2624 = 1.0D;

    @ObfuscatedName("ia.ao")
    public int field2625 = 128;

    @ObfuscatedName("ia.av")
    public class340 field2626;

    public class229(class340 arg0, class340 arg1, int arg2, double arg3, int arg4) {
        this.field2626 = arg1;
        this.field2622 = arg2;
        this.field2620 = this.field2622;
        this.field2624 = arg3;
        this.field2625 = arg4;
        int[] var7 = arg0.method5890(0);
        int var8 = var7.length;
        this.field2627 = new class217[arg0.method5934(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class478 var10 = new class478(arg0.method5860(0, var7[var9]));
            this.field2627[var7[var9]] = new class217(var10);
        }
    }

    @ObfuscatedName("ia.aj(I)I")
    public int method4210() {
        int var1 = 0;
        int var2 = 0;
        class217[] var3 = this.field2627;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class217 var5 = var3[var4];
            if (var5 != null && var5.field2426 != null) {
                var1 += var5.field2426.length;
                int[] var6 = var5.field2426;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2626.method5863(var8)) {
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

    @ObfuscatedName("ia.al(D)V")
    public void method4211(double arg0) {
        this.field2624 = arg0;
        this.method4215();
    }

    @ObfuscatedName("ia.ac(II)[I")
    public int[] method4212(int arg0) {
        class217 var2 = this.field2627[arg0];
        if (var2 != null) {
            if (var2.field2429 != null) {
                this.field2629.method6092(var2);
                var2.field2417 = true;
                return var2.field2429;
            }
            boolean var3 = var2.method3897(this.field2624, this.field2625, this.field2626);
            if (var3) {
                if (this.field2620 == 0) {
                    class217 var4 = (class217) this.field2629.method6095();
                    var4.method3898();
                } else {
                    this.field2620--;
                }
                this.field2629.method6092(var2);
                var2.field2417 = true;
                return var2.field2429;
            }
        }
        return null;
    }

    @ObfuscatedName("ia.ab(IS)I")
    public int method4213(int arg0) {
        return this.field2627[arg0] == null ? 0 : this.field2627[arg0].field2421;
    }

    @ObfuscatedName("ia.an(II)Z")
    public boolean method4214(int arg0) {
        return this.field2627[arg0].field2424;
    }

    @ObfuscatedName("ia.ao(II)Z")
    public boolean method4225(int arg0) {
        return this.field2625 == 64;
    }

    @ObfuscatedName("ia.av(I)V")
    public void method4215() {
        for (int var1 = 0; var1 < this.field2627.length; var1++) {
            if (this.field2627[var1] != null) {
                this.field2627[var1].method3898();
            }
        }
        this.field2629 = new class359();
        this.field2620 = this.field2622;
    }

    @ObfuscatedName("ia.aq(IB)V")
    public void method4218(int arg0) {
        for (int var2 = 0; var2 < this.field2627.length; var2++) {
            class217 var3 = this.field2627[var2];
            if (var3 != null && var3.field2427 != 0 && var3.field2417) {
                var3.method3899(arg0);
                var3.field2417 = false;
            }
        }
    }
}
