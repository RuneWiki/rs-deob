package deob;

@ObfuscatedName("ft")
public final class class174 {

    @ObfuscatedName("ft.t")
    public int field2838;

    @ObfuscatedName("ft.s")
    public class186[] field2839;

    @ObfuscatedName("ft.f")
    public class186 field2840;

    @ObfuscatedName("ft.e")
    public class186 field2841;

    @ObfuscatedName("ft.d")
    public int field2842 = 0;

    public class174(int arg0) {
        this.field2838 = arg0;
        this.field2839 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2839[var2] = new class186();
            var3.field2863 = var3;
            var3.field2865 = var3;
        }
    }

    @ObfuscatedName("ft.t(J)Lgm;")
    public class186 method3204(long arg0) {
        class186 var3 = this.field2839[(int) (arg0 & (long) (this.field2838 - 1))];
        for (this.field2840 = var3.field2863; this.field2840 != var3; this.field2840 = this.field2840.field2863) {
            if (this.field2840.field2864 == arg0) {
                class186 var4 = this.field2840;
                this.field2840 = this.field2840.field2863;
                return var4;
            }
        }
        this.field2840 = null;
        return null;
    }

    @ObfuscatedName("ft.s(Lgm;J)V")
    public void method3212(class186 arg0, long arg1) {
        if (arg0.field2865 != null) {
            arg0.method3316();
        }
        class186 var4 = this.field2839[(int) (arg1 & (long) (this.field2838 - 1))];
        arg0.field2865 = var4.field2865;
        arg0.field2863 = var4;
        arg0.field2865.field2863 = arg0;
        arg0.field2863.field2865 = arg0;
        arg0.field2864 = arg1;
    }

    @ObfuscatedName("ft.f()V")
    public void method3214() {
        for (int var1 = 0; var1 < this.field2838; var1++) {
            class186 var2 = this.field2839[var1];
            while (true) {
                class186 var3 = var2.field2863;
                if (var2 == var3) {
                    break;
                }
                var3.method3316();
            }
        }
        this.field2840 = null;
        this.field2841 = null;
    }

    @ObfuscatedName("ft.e()Lgm;")
    public class186 method3202() {
        this.field2842 = 0;
        return this.method3203();
    }

    @ObfuscatedName("ft.d()Lgm;")
    public class186 method3203() {
        if (this.field2842 > 0 && this.field2839[this.field2842 - 1] != this.field2841) {
            class186 var1 = this.field2841;
            this.field2841 = var1.field2863;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2842 >= this.field2838) {
                return null;
            }
            var2 = this.field2839[this.field2842++].field2863;
        } while (this.field2839[this.field2842 - 1] == var2);
        this.field2841 = var2.field2863;
        return var2;
    }
}
