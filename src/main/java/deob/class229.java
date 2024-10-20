package deob;

@ObfuscatedName("im")
public class class229 implements class241 {

    @ObfuscatedName("im.af")
    public class216[] field2653;

    @ObfuscatedName("im.an")
    public class363 field2656 = new class363();

    @ObfuscatedName("im.aw")
    public int field2658;

    @ObfuscatedName("im.ac")
    public int field2655 = 0;

    @ObfuscatedName("im.au")
    public double field2654 = 1.0D;

    @ObfuscatedName("im.ab")
    public int field2657 = 128;

    @ObfuscatedName("im.aq")
    public class344 field2652;

    public class229(class344 arg0, class344 arg1, int arg2, double arg3, int arg4) {
        this.field2652 = arg1;
        this.field2658 = arg2;
        this.field2655 = this.field2658;
        this.field2654 = arg3;
        this.field2657 = arg4;
        int[] var7 = arg0.method6074(0);
        if (var7 == null) {
            this.field2653 = new class216[0];
        } else {
            int var8 = var7.length;
            this.field2653 = new class216[arg0.method6081(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class489 var10 = new class489(arg0.method6090(0, var7[var9]));
                this.field2653[var7[var9]] = new class216(var10);
            }
        }
    }

    @ObfuscatedName("im.af(I)I")
    public int method4356() {
        if (this.field2653.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class216[] var3 = this.field2653;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class216 var5 = var3[var4];
            if (var5 != null && var5.field2468 != null) {
                var1 += var5.field2468.length;
                int[] var6 = var5.field2468;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2652.method6080(var8)) {
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

    @ObfuscatedName("im.an(D)V")
    public void method4360(double arg0) {
        this.field2654 = arg0;
        this.method4378();
    }

    @ObfuscatedName("im.aw(II)[I")
    public int[] method4358(int arg0) {
        class216 var2 = this.field2653[arg0];
        if (var2 != null) {
            if (var2.field2475 != null) {
                this.field2656.method6325(var2);
                var2.field2477 = true;
                return var2.field2475;
            }
            boolean var3 = var2.method4049(this.field2654, this.field2657, this.field2652);
            if (var3) {
                if (this.field2655 == 0) {
                    class216 var4 = (class216) this.field2656.method6328();
                    var4.method4050();
                } else {
                    this.field2655--;
                }
                this.field2656.method6325(var2);
                var2.field2477 = true;
                return var2.field2475;
            }
        }
        return null;
    }

    @ObfuscatedName("im.ac(II)I")
    public int method4359(int arg0) {
        return this.field2653[arg0] == null ? 0 : this.field2653[arg0].field2467;
    }

    @ObfuscatedName("im.au(IB)Z")
    public boolean method4361(int arg0) {
        return this.field2653[arg0].field2474;
    }

    @ObfuscatedName("im.ab(II)Z")
    public boolean method4362(int arg0) {
        return this.field2657 == 64;
    }

    @ObfuscatedName("im.aq(I)V")
    public void method4378() {
        for (int var1 = 0; var1 < this.field2653.length; var1++) {
            if (this.field2653[var1] != null) {
                this.field2653[var1].method4050();
            }
        }
        this.field2656 = new class363();
        this.field2655 = this.field2658;
    }

    @ObfuscatedName("im.al(II)V")
    public void method4363(int arg0) {
        for (int var2 = 0; var2 < this.field2653.length; var2++) {
            class216 var3 = this.field2653[var2];
            if (var3 != null && var3.field2473 != 0 && var3.field2477) {
                var3.method4051(arg0);
                var3.field2477 = false;
            }
        }
    }
}
