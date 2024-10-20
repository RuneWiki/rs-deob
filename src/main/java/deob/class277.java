package deob;

@ObfuscatedName("kg")
public class class277 implements class289 {

    @ObfuscatedName("kg.at")
    public class264[] field2905;

    @ObfuscatedName("kg.ah")
    public class390 field2898 = new class390();

    @ObfuscatedName("kg.ar")
    public int field2897;

    @ObfuscatedName("kg.ao")
    public int field2900 = 0;

    @ObfuscatedName("kg.ab")
    public double field2901 = 1.0D;

    @ObfuscatedName("kg.au")
    public int field2899 = 128;

    @ObfuscatedName("kg.aa")
    public class371 field2903;

    public class277(class371 arg0, class371 arg1, int arg2, double arg3, int arg4) {
        this.field2903 = arg1;
        this.field2897 = arg2;
        this.field2900 = this.field2897;
        this.field2901 = arg3;
        this.field2899 = arg4;
        int[] var7 = arg0.method6295(0);
        if (var7 == null) {
            this.field2905 = new class264[0];
        } else {
            int var8 = var7.length;
            this.field2905 = new class264[arg0.method6294(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class527 var10 = new class527(arg0.method6284(0, var7[var9]));
                this.field2905[var7[var9]] = new class264(var10);
            }
        }
    }

    @ObfuscatedName("kg.at(B)I")
    public int method5007() {
        if (this.field2905.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class264[] var3 = this.field2905;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class264 var5 = var3[var4];
            if (var5 != null && var5.field2722 != null) {
                var1 += var5.field2722.length;
                int[] var6 = var5.field2722;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2903.method6287(var8)) {
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

    @ObfuscatedName("kg.ah(D)V")
    public void method4987(double arg0) {
        this.field2901 = arg0;
        this.method4991();
    }

    @ObfuscatedName("kg.ar(II)[I")
    public int[] method4988(int arg0) {
        class264 var2 = this.field2905[arg0];
        if (var2 != null) {
            if (var2.field2728 != null) {
                this.field2898.method6575(var2);
                var2.field2729 = true;
                return var2.field2728;
            }
            boolean var3 = var2.method4651(this.field2901, this.field2899, this.field2903);
            if (var3) {
                if (this.field2900 == 0) {
                    class264 var4 = (class264) this.field2898.method6546();
                    var4.method4652();
                } else {
                    this.field2900--;
                }
                this.field2898.method6575(var2);
                var2.field2729 = true;
                return var2.field2728;
            }
        }
        return null;
    }

    @ObfuscatedName("kg.ao(II)I")
    public int method5009(int arg0) {
        return this.field2905[arg0] == null ? 0 : this.field2905[arg0].field2720;
    }

    @ObfuscatedName("kg.ab(II)Z")
    public boolean method4985(int arg0) {
        return this.field2905[arg0].field2726;
    }

    @ObfuscatedName("kg.au(IS)Z")
    public boolean method4990(int arg0) {
        return this.field2899 == 64;
    }

    @ObfuscatedName("kg.aa(I)V")
    public void method4991() {
        for (int var1 = 0; var1 < this.field2905.length; var1++) {
            if (this.field2905[var1] != null) {
                this.field2905[var1].method4652();
            }
        }
        this.field2898 = new class390();
        this.field2900 = this.field2897;
    }

    @ObfuscatedName("kg.ac(II)V")
    public void method4992(int arg0) {
        for (int var2 = 0; var2 < this.field2905.length; var2++) {
            class264 var3 = this.field2905[var2];
            if (var3 != null && var3.field2724 != 0 && var3.field2729) {
                var3.method4654(arg0);
                var3.field2729 = false;
            }
        }
    }
}
