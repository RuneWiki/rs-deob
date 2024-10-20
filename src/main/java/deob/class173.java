package deob;

@ObfuscatedName("fe")
public final class class173 {

    @ObfuscatedName("fe.c")
    public int field2751;

    @ObfuscatedName("fe.j")
    public class177[] field2749;

    @ObfuscatedName("fe.f")
    public class177 field2750;

    @ObfuscatedName("fe.y")
    public class177 field2748;

    @ObfuscatedName("fe.x")
    public int field2752 = 0;

    public class173(int arg0) {
        this.field2751 = arg0;
        this.field2749 = new class177[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class177 var3 = this.field2749[var2] = new class177();
            var3.field2760 = var3;
            var3.field2758 = var3;
        }
    }

    @ObfuscatedName("fe.c(J)Lfk;")
    public class177 method3129(long arg0) {
        class177 var3 = this.field2749[(int) (arg0 & (long) (this.field2751 - 1))];
        for (this.field2750 = var3.field2760; this.field2750 != var3; this.field2750 = this.field2750.field2760) {
            if (this.field2750.field2759 == arg0) {
                class177 var4 = this.field2750;
                this.field2750 = this.field2750.field2760;
                return var4;
            }
        }
        this.field2750 = null;
        return null;
    }

    @ObfuscatedName("fe.j(Lfk;J)V")
    public void method3137(class177 arg0, long arg1) {
        if (arg0.field2758 != null) {
            arg0.method3182();
        }
        class177 var4 = this.field2749[(int) (arg1 & (long) (this.field2751 - 1))];
        arg0.field2758 = var4.field2758;
        arg0.field2760 = var4;
        arg0.field2758.field2760 = arg0;
        arg0.field2760.field2758 = arg0;
        arg0.field2759 = arg1;
    }

    @ObfuscatedName("fe.f()V")
    public void method3131() {
        for (int var1 = 0; var1 < this.field2751; var1++) {
            class177 var2 = this.field2749[var1];
            while (true) {
                class177 var3 = var2.field2760;
                if (var2 == var3) {
                    break;
                }
                var3.method3182();
            }
        }
        this.field2750 = null;
        this.field2748 = null;
    }

    @ObfuscatedName("fe.y()Lfk;")
    public class177 method3141() {
        this.field2752 = 0;
        return this.method3128();
    }

    @ObfuscatedName("fe.x()Lfk;")
    public class177 method3128() {
        if (this.field2752 > 0 && this.field2749[this.field2752 - 1] != this.field2748) {
            class177 var1 = this.field2748;
            this.field2748 = var1.field2760;
            return var1;
        }
        class177 var2;
        do {
            if (this.field2752 >= this.field2751) {
                return null;
            }
            var2 = this.field2749[this.field2752++].field2760;
        } while (this.field2749[this.field2752 - 1] == var2);
        this.field2748 = var2.field2760;
        return var2;
    }
}
