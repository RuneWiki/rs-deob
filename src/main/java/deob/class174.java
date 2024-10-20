package deob;

@ObfuscatedName("fy")
public final class class174 {

    @ObfuscatedName("fy.k")
    public int field2844;

    @ObfuscatedName("fy.b")
    public class186[] field2842;

    @ObfuscatedName("fy.e")
    public class186 field2843;

    @ObfuscatedName("fy.i")
    public class186 field2845;

    @ObfuscatedName("fy.t")
    public int field2841 = 0;

    public class174(int arg0) {
        this.field2844 = arg0;
        this.field2842 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2842[var2] = new class186();
            var3.field2866 = var3;
            var3.field2868 = var3;
        }
    }

    @ObfuscatedName("fy.k(J)Lgy;")
    public class186 method3197(long arg0) {
        class186 var3 = this.field2842[(int) (arg0 & (long) (this.field2844 - 1))];
        for (this.field2843 = var3.field2866; this.field2843 != var3; this.field2843 = this.field2843.field2866) {
            if (this.field2843.field2867 == arg0) {
                class186 var4 = this.field2843;
                this.field2843 = this.field2843.field2866;
                return var4;
            }
        }
        this.field2843 = null;
        return null;
    }

    @ObfuscatedName("fy.b(Lgy;J)V")
    public void method3191(class186 arg0, long arg1) {
        if (arg0.field2868 != null) {
            arg0.method3321();
        }
        class186 var4 = this.field2842[(int) (arg1 & (long) (this.field2844 - 1))];
        arg0.field2868 = var4.field2868;
        arg0.field2866 = var4;
        arg0.field2868.field2866 = arg0;
        arg0.field2866.field2868 = arg0;
        arg0.field2867 = arg1;
    }

    @ObfuscatedName("fy.e()V")
    public void method3192() {
        for (int var1 = 0; var1 < this.field2844; var1++) {
            class186 var2 = this.field2842[var1];
            while (true) {
                class186 var3 = var2.field2866;
                if (var2 == var3) {
                    break;
                }
                var3.method3321();
            }
        }
        this.field2843 = null;
        this.field2845 = null;
    }

    @ObfuscatedName("fy.i()Lgy;")
    public class186 method3199() {
        this.field2841 = 0;
        return this.method3193();
    }

    @ObfuscatedName("fy.t()Lgy;")
    public class186 method3193() {
        if (this.field2841 > 0 && this.field2842[this.field2841 - 1] != this.field2845) {
            class186 var1 = this.field2845;
            this.field2845 = var1.field2866;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2841 >= this.field2844) {
                return null;
            }
            var2 = this.field2842[this.field2841++].field2866;
        } while (this.field2842[this.field2841 - 1] == var2);
        this.field2845 = var2.field2866;
        return var2;
    }
}
