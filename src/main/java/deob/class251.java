package deob;

@ObfuscatedName("jq")
public class class251 implements class263 {

    @ObfuscatedName("jq.ac")
    public class238[] field2698;

    @ObfuscatedName("jq.al")
    public class393 field2690 = new class393();

    @ObfuscatedName("jq.ak")
    public int field2693;

    @ObfuscatedName("jq.ax")
    public int field2691 = 0;

    @ObfuscatedName("jq.ao")
    public double field2692 = 1.0D;

    @ObfuscatedName("jq.ah")
    public int field2688 = 128;

    @ObfuscatedName("jq.ar")
    public class374 field2694;

    public class251(class374 arg0, class374 arg1, int arg2, double arg3, int arg4) {
        this.field2694 = arg1;
        this.field2693 = arg2;
        this.field2691 = this.field2693;
        this.field2692 = arg3;
        this.field2688 = arg4;
        int[] var7 = arg0.method6272(0);
        if (var7 == null) {
            this.field2698 = new class238[0];
        } else {
            int var8 = var7.length;
            this.field2698 = new class238[arg0.method6273(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class530 var10 = new class530(arg0.method6342(0, var7[var9]));
                this.field2698[var7[var9]] = new class238(var10);
            }
        }
    }

    @ObfuscatedName("jq.ac(B)I")
    public int method4494() {
        if (this.field2698.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class238[] var3 = this.field2698;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class238 var5 = var3[var4];
            if (var5 != null && var5.field2505 != null) {
                var1 += var5.field2505.length;
                int[] var6 = var5.field2505;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2694.method6299(var8)) {
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

    @ObfuscatedName("jq.al(D)V")
    public void method4502(double arg0) {
        this.field2692 = arg0;
        this.method4500();
    }

    @ObfuscatedName("jq.ak(II)[I")
    public int[] method4496(int arg0) {
        class238 var2 = this.field2698[arg0];
        if (var2 != null) {
            if (var2.field2513 != null) {
                this.field2690.method6535(var2);
                var2.field2514 = true;
                return var2.field2513;
            }
            boolean var3 = var2.method4142(this.field2692, this.field2688, this.field2694);
            if (var3) {
                if (this.field2691 == 0) {
                    class238 var4 = (class238) this.field2690.method6533();
                    var4.method4136();
                } else {
                    this.field2691--;
                }
                this.field2690.method6535(var2);
                var2.field2514 = true;
                return var2.field2513;
            }
        }
        return null;
    }

    @ObfuscatedName("jq.ax(II)I")
    public int method4497(int arg0) {
        return this.field2698[arg0] == null ? 0 : this.field2698[arg0].field2501;
    }

    @ObfuscatedName("jq.ao(IB)Z")
    public boolean method4498(int arg0) {
        return this.field2698[arg0].field2502;
    }

    @ObfuscatedName("jq.ah(II)Z")
    public boolean method4499(int arg0) {
        return this.field2688 == 64;
    }

    @ObfuscatedName("jq.ar(I)V")
    public void method4500() {
        for (int var1 = 0; var1 < this.field2698.length; var1++) {
            if (this.field2698[var1] != null) {
                this.field2698[var1].method4136();
            }
        }
        this.field2690 = new class393();
        this.field2691 = this.field2693;
    }

    @ObfuscatedName("jq.ab(II)V")
    public void method4503(int arg0) {
        for (int var2 = 0; var2 < this.field2698.length; var2++) {
            class238 var3 = this.field2698[var2];
            if (var3 != null && var3.field2511 != 0 && var3.field2514) {
                var3.method4139(arg0);
                var3.field2514 = false;
            }
        }
    }
}
