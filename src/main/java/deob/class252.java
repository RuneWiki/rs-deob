package deob;

@ObfuscatedName("jq")
public class class252 implements class265 {

    @ObfuscatedName("jq.ac")
    public class237[] field2764;

    @ObfuscatedName("jq.ae")
    public class410 field2763 = new class410();

    @ObfuscatedName("jq.ag")
    public int field2767;

    @ObfuscatedName("jq.am")
    public int field2762 = 0;

    @ObfuscatedName("jq.ax")
    public double field2766 = 1.0D;

    @ObfuscatedName("jq.aq")
    public int field2765 = 128;

    @ObfuscatedName("jq.af")
    public class391 field2768;

    public class252(class391 arg0, class391 arg1, int arg2, double arg3, int arg4) {
        this.field2768 = arg1;
        this.field2767 = arg2;
        this.field2762 = this.field2767;
        this.field2766 = arg3;
        this.field2765 = arg4;
        int[] var7 = arg0.method6808(0);
        if (var7 == null) {
            this.field2764 = new class237[0];
        } else {
            int var8 = var7.length;
            this.field2764 = new class237[arg0.method6792(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class551 var10 = new class551(arg0.method6782(0, var7[var9]));
                this.field2764[var7[var9]] = new class237(var10);
            }
        }
    }

    @ObfuscatedName("jq.ac(I)I")
    public int method4759() {
        if (this.field2764.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class237[] var3 = this.field2764;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class237 var5 = var3[var4];
            if (var5 != null && var5.field2535 != null) {
                var1 += var5.field2535.length;
                int[] var6 = var5.field2535;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2768.method6785(var8)) {
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

    @ObfuscatedName("jq.ae(D)V")
    public void method4767(double arg0) {
        this.field2766 = arg0;
        this.method4761();
    }

    @ObfuscatedName("jq.ag(II)[I")
    public int[] method4752(int arg0) {
        class237 var2 = this.field2764[arg0];
        if (var2 != null) {
            if (var2.field2547 != null) {
                this.field2763.method7025(var2);
                var2.field2548 = true;
                return var2.field2547;
            }
            boolean var3 = var2.method4320(this.field2766, this.field2765, this.field2768);
            if (var3) {
                if (this.field2762 == 0) {
                    class237 var4 = (class237) this.field2763.method7022();
                    var4.method4316();
                } else {
                    this.field2762--;
                }
                this.field2763.method7025(var2);
                var2.field2548 = true;
                return var2.field2547;
            }
        }
        return null;
    }

    @ObfuscatedName("jq.am(II)I")
    public int method4753(int arg0) {
        return this.field2764[arg0] == null ? 0 : this.field2764[arg0].field2544;
    }

    @ObfuscatedName("jq.ax(IB)Z")
    public boolean method4754(int arg0) {
        return this.field2764[arg0].field2540;
    }

    @ObfuscatedName("jq.aq(II)Z")
    public boolean method4750(int arg0) {
        return this.field2765 == 64;
    }

    @ObfuscatedName("jq.af(B)V")
    public void method4761() {
        for (int var1 = 0; var1 < this.field2764.length; var1++) {
            if (this.field2764[var1] != null) {
                this.field2764[var1].method4316();
            }
        }
        this.field2763 = new class410();
        this.field2762 = this.field2767;
    }

    @ObfuscatedName("jq.at(II)V")
    public void method4757(int arg0) {
        for (int var2 = 0; var2 < this.field2764.length; var2++) {
            class237 var3 = this.field2764[var2];
            if (var3 != null && var3.field2539 != 0 && var3.field2548) {
                var3.method4317(arg0);
                var3.field2548 = false;
            }
        }
    }
}
