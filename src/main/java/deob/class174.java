package deob;

@ObfuscatedName("fg")
public final class class174 {

    @ObfuscatedName("fg.b")
    public int field2840;

    @ObfuscatedName("fg.u")
    public class184[] field2839;

    @ObfuscatedName("fg.x")
    public class184 field2841;

    @ObfuscatedName("fg.j")
    public class184 field2842;

    @ObfuscatedName("fg.o")
    public int field2843 = 0;

    public class174(int arg0) {
        this.field2840 = arg0;
        this.field2839 = new class184[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class184 var3 = this.field2839[var2] = new class184();
            var3.field2860 = var3;
            var3.field2862 = var3;
        }
    }

    @ObfuscatedName("fg.b(J)Lge;")
    public class184 method3157(long arg0) {
        class184 var3 = this.field2839[(int) (arg0 & (long) (this.field2840 - 1))];
        for (this.field2841 = var3.field2860; this.field2841 != var3; this.field2841 = this.field2841.field2860) {
            if (this.field2841.field2861 == arg0) {
                class184 var4 = this.field2841;
                this.field2841 = this.field2841.field2860;
                return var4;
            }
        }
        this.field2841 = null;
        return null;
    }

    @ObfuscatedName("fg.u(Lge;J)V")
    public void method3147(class184 arg0, long arg1) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        class184 var4 = this.field2839[(int) (arg1 & (long) (this.field2840 - 1))];
        arg0.field2862 = var4.field2862;
        arg0.field2860 = var4;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
        arg0.field2861 = arg1;
    }

    @ObfuscatedName("fg.x()V")
    public void method3149() {
        for (int var1 = 0; var1 < this.field2840; var1++) {
            class184 var2 = this.field2839[var1];
            while (true) {
                class184 var3 = var2.field2860;
                if (var2 == var3) {
                    break;
                }
                var3.method3260();
            }
        }
        this.field2841 = null;
        this.field2842 = null;
    }

    @ObfuscatedName("fg.j()Lge;")
    public class184 method3150() {
        this.field2843 = 0;
        return this.method3151();
    }

    @ObfuscatedName("fg.o()Lge;")
    public class184 method3151() {
        if (this.field2843 > 0 && this.field2839[this.field2843 - 1] != this.field2842) {
            class184 var1 = this.field2842;
            this.field2842 = var1.field2860;
            return var1;
        }
        class184 var2;
        do {
            if (this.field2843 >= this.field2840) {
                return null;
            }
            var2 = this.field2839[this.field2843++].field2860;
        } while (this.field2839[this.field2843 - 1] == var2);
        this.field2842 = var2.field2860;
        return var2;
    }
}
