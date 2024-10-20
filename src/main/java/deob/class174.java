package deob;

@ObfuscatedName("fz")
public final class class174 {

    @ObfuscatedName("fz.e")
    public int field2849;

    @ObfuscatedName("fz.o")
    public class186[] field2848;

    @ObfuscatedName("fz.y")
    public class186 field2847;

    @ObfuscatedName("fz.b")
    public class186 field2850;

    @ObfuscatedName("fz.w")
    public int field2851 = 0;

    public class174(int arg0) {
        this.field2849 = arg0;
        this.field2848 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2848[var2] = new class186();
            var3.field2873 = var3;
            var3.field2872 = var3;
        }
    }

    @ObfuscatedName("fz.e(J)Lgm;")
    public class186 method3092(long arg0) {
        class186 var3 = this.field2848[(int) (arg0 & (long) (this.field2849 - 1))];
        for (this.field2847 = var3.field2873; this.field2847 != var3; this.field2847 = this.field2847.field2873) {
            if (this.field2847.field2874 == arg0) {
                class186 var4 = this.field2847;
                this.field2847 = this.field2847.field2873;
                return var4;
            }
        }
        this.field2847 = null;
        return null;
    }

    @ObfuscatedName("fz.o(Lgm;J)V")
    public void method3091(class186 arg0, long arg1) {
        if (arg0.field2872 != null) {
            arg0.method3204();
        }
        class186 var4 = this.field2848[(int) (arg1 & (long) (this.field2849 - 1))];
        arg0.field2872 = var4.field2872;
        arg0.field2873 = var4;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
        arg0.field2874 = arg1;
    }

    @ObfuscatedName("fz.y()V")
    public void method3094() {
        for (int var1 = 0; var1 < this.field2849; var1++) {
            class186 var2 = this.field2848[var1];
            while (true) {
                class186 var3 = var2.field2873;
                if (var2 == var3) {
                    break;
                }
                var3.method3204();
            }
        }
        this.field2847 = null;
        this.field2850 = null;
    }

    @ObfuscatedName("fz.b()Lgm;")
    public class186 method3096() {
        this.field2851 = 0;
        return this.method3093();
    }

    @ObfuscatedName("fz.w()Lgm;")
    public class186 method3093() {
        if (this.field2851 > 0 && this.field2848[this.field2851 - 1] != this.field2850) {
            class186 var1 = this.field2850;
            this.field2850 = var1.field2873;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2851 >= this.field2849) {
                return null;
            }
            var2 = this.field2848[this.field2851++].field2873;
        } while (this.field2848[this.field2851 - 1] == var2);
        this.field2850 = var2.field2873;
        return var2;
    }
}
