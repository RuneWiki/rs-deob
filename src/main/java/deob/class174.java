package deob;

@ObfuscatedName("fx")
public final class class174 {

    @ObfuscatedName("fx.e")
    public int field2840;

    @ObfuscatedName("fx.v")
    public class186[] field2841;

    @ObfuscatedName("fx.i")
    public class186 field2842;

    @ObfuscatedName("fx.g")
    public class186 field2843;

    @ObfuscatedName("fx.x")
    public int field2844 = 0;

    public class174(int arg0) {
        this.field2840 = arg0;
        this.field2841 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2841[var2] = new class186();
            var3.field2865 = var3;
            var3.field2866 = var3;
        }
    }

    @ObfuscatedName("fx.e(J)Lgc;")
    public class186 method3171(long arg0) {
        class186 var3 = this.field2841[(int) (arg0 & (long) (this.field2840 - 1))];
        for (this.field2842 = var3.field2865; this.field2842 != var3; this.field2842 = this.field2842.field2865) {
            if (this.field2842.field2867 == arg0) {
                class186 var4 = this.field2842;
                this.field2842 = this.field2842.field2865;
                return var4;
            }
        }
        this.field2842 = null;
        return null;
    }

    @ObfuscatedName("fx.v(Lgc;J)V")
    public void method3168(class186 arg0, long arg1) {
        if (arg0.field2866 != null) {
            arg0.method3273();
        }
        class186 var4 = this.field2841[(int) (arg1 & (long) (this.field2840 - 1))];
        arg0.field2866 = var4.field2866;
        arg0.field2865 = var4;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
        arg0.field2867 = arg1;
    }

    @ObfuscatedName("fx.i()V")
    public void method3159() {
        for (int var1 = 0; var1 < this.field2840; var1++) {
            class186 var2 = this.field2841[var1];
            while (true) {
                class186 var3 = var2.field2865;
                if (var2 == var3) {
                    break;
                }
                var3.method3273();
            }
        }
        this.field2842 = null;
        this.field2843 = null;
    }

    @ObfuscatedName("fx.g()Lgc;")
    public class186 method3162() {
        this.field2844 = 0;
        return this.method3163();
    }

    @ObfuscatedName("fx.x()Lgc;")
    public class186 method3163() {
        if (this.field2844 > 0 && this.field2841[this.field2844 - 1] != this.field2843) {
            class186 var1 = this.field2843;
            this.field2843 = var1.field2865;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2844 >= this.field2840) {
                return null;
            }
            var2 = this.field2841[this.field2844++].field2865;
        } while (this.field2841[this.field2844 - 1] == var2);
        this.field2843 = var2.field2865;
        return var2;
    }
}
