package deob;

@ObfuscatedName("je")
public class class253 implements class265 {

    @ObfuscatedName("je.az")
    public class240[] field2745;

    @ObfuscatedName("je.ah")
    public class398 field2744 = new class398();

    @ObfuscatedName("je.af")
    public int field2746;

    @ObfuscatedName("je.at")
    public int field2747 = 0;

    @ObfuscatedName("je.an")
    public double field2748 = 1.0D;

    @ObfuscatedName("je.ao")
    public int field2749 = 128;

    @ObfuscatedName("je.ab")
    public class379 field2750;

    public class253(class379 arg0, class379 arg1, int arg2, double arg3, int arg4) {
        this.field2750 = arg1;
        this.field2746 = arg2;
        this.field2747 = this.field2746;
        this.field2748 = arg3;
        this.field2749 = arg4;
        int[] var7 = arg0.method6350(0);
        if (var7 == null) {
            this.field2745 = new class240[0];
        } else {
            int var8 = var7.length;
            this.field2745 = new class240[arg0.method6338(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class535 var10 = new class535(arg0.method6328(0, var7[var9]));
                this.field2745[var7[var9]] = new class240(var10);
            }
        }
    }

    @ObfuscatedName("je.az(I)I")
    public int method4546() {
        if (this.field2745.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class240[] var3 = this.field2745;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class240 var5 = var3[var4];
            if (var5 != null && var5.field2564 != null) {
                var1 += var5.field2564.length;
                int[] var6 = var5.field2564;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2750.method6331(var8)) {
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

    @ObfuscatedName("je.ah(D)V")
    public void method4534(double arg0) {
        this.field2748 = arg0;
        this.method4562();
    }

    @ObfuscatedName("je.af(II)[I")
    public int[] method4536(int arg0) {
        class240 var2 = this.field2745[arg0];
        if (var2 != null) {
            if (var2.field2561 != null) {
                this.field2744.method6583(var2);
                var2.field2571 = true;
                return var2.field2561;
            }
            boolean var3 = var2.method4190(this.field2748, this.field2749, this.field2750);
            if (var3) {
                if (this.field2747 == 0) {
                    class240 var4 = (class240) this.field2744.method6585();
                    var4.method4194();
                } else {
                    this.field2747--;
                }
                this.field2744.method6583(var2);
                var2.field2571 = true;
                return var2.field2561;
            }
        }
        return null;
    }

    @ObfuscatedName("je.at(II)I")
    public int method4535(int arg0) {
        return this.field2745[arg0] == null ? 0 : this.field2745[arg0].field2562;
    }

    @ObfuscatedName("je.an(IB)Z")
    public boolean method4538(int arg0) {
        return this.field2745[arg0].field2570;
    }

    @ObfuscatedName("je.ao(II)Z")
    public boolean method4539(int arg0) {
        return this.field2749 == 64;
    }

    @ObfuscatedName("je.ab(I)V")
    public void method4562() {
        for (int var1 = 0; var1 < this.field2745.length; var1++) {
            if (this.field2745[var1] != null) {
                this.field2745[var1].method4194();
            }
        }
        this.field2744 = new class398();
        this.field2747 = this.field2746;
    }

    @ObfuscatedName("je.aw(II)V")
    public void method4553(int arg0) {
        for (int var2 = 0; var2 < this.field2745.length; var2++) {
            class240 var3 = this.field2745[var2];
            if (var3 != null && var3.field2568 != 0 && var3.field2571) {
                var3.method4189(arg0);
                var3.field2571 = false;
            }
        }
    }
}
