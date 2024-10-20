package deob;

@ObfuscatedName("kj")
public class class280 implements class292 {

    @ObfuscatedName("kj.am")
    public class267[] field2945;

    @ObfuscatedName("kj.ap")
    public class394 field2942 = new class394();

    @ObfuscatedName("kj.af")
    public int field2939;

    @ObfuscatedName("kj.aj")
    public int field2944 = 0;

    @ObfuscatedName("kj.aq")
    public double field2941 = 1.0D;

    @ObfuscatedName("kj.ar")
    public int field2940 = 128;

    @ObfuscatedName("kj.ag")
    public class375 field2943;

    public class280(class375 arg0, class375 arg1, int arg2, double arg3, int arg4) {
        this.field2943 = arg1;
        this.field2939 = arg2;
        this.field2944 = this.field2939;
        this.field2941 = arg3;
        this.field2940 = arg4;
        int[] var7 = arg0.method6405(0);
        if (var7 == null) {
            this.field2945 = new class267[0];
        } else {
            int var8 = var7.length;
            this.field2945 = new class267[arg0.method6406(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class531 var10 = new class531(arg0.method6396(0, var7[var9]));
                this.field2945[var7[var9]] = new class267(var10);
            }
        }
    }

    @ObfuscatedName("kj.am(B)I")
    public int method5086() {
        if (this.field2945.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class267[] var3 = this.field2945;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class267 var5 = var3[var4];
            if (var5 != null && var5.field2759 != null) {
                var1 += var5.field2759.length;
                int[] var6 = var5.field2759;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2943.method6399(var8)) {
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

    @ObfuscatedName("kj.ap(D)V")
    public void method5087(double arg0) {
        this.field2941 = arg0;
        this.method5092();
    }

    @ObfuscatedName("kj.af(IB)[I")
    public int[] method5088(int arg0) {
        class267 var2 = this.field2945[arg0];
        if (var2 != null) {
            if (var2.field2758 != null) {
                this.field2942.method6672(var2);
                var2.field2766 = true;
                return var2.field2758;
            }
            boolean var3 = var2.method4734(this.field2941, this.field2940, this.field2943);
            if (var3) {
                if (this.field2944 == 0) {
                    class267 var4 = (class267) this.field2942.method6669();
                    var4.method4735();
                } else {
                    this.field2944--;
                }
                this.field2942.method6672(var2);
                var2.field2766 = true;
                return var2.field2758;
            }
        }
        return null;
    }

    @ObfuscatedName("kj.aj(IB)I")
    public int method5089(int arg0) {
        return this.field2945[arg0] == null ? 0 : this.field2945[arg0].field2757;
    }

    @ObfuscatedName("kj.aq(II)Z")
    public boolean method5109(int arg0) {
        return this.field2945[arg0].field2764;
    }

    @ObfuscatedName("kj.ar(II)Z")
    public boolean method5108(int arg0) {
        return this.field2940 == 64;
    }

    @ObfuscatedName("kj.ag(I)V")
    public void method5092() {
        for (int var1 = 0; var1 < this.field2945.length; var1++) {
            if (this.field2945[var1] != null) {
                this.field2945[var1].method4735();
            }
        }
        this.field2942 = new class394();
        this.field2944 = this.field2939;
    }

    @ObfuscatedName("kj.ao(II)V")
    public void method5095(int arg0) {
        for (int var2 = 0; var2 < this.field2945.length; var2++) {
            class267 var3 = this.field2945[var2];
            if (var3 != null && var3.field2763 != 0 && var3.field2766) {
                var3.method4739(arg0);
                var3.field2766 = false;
            }
        }
    }
}
