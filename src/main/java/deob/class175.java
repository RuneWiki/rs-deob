package deob;

@ObfuscatedName("fk")
public final class class175 {

    @ObfuscatedName("fk.k")
    public int field2853;

    @ObfuscatedName("fk.y")
    public class187[] field2855;

    @ObfuscatedName("fk.s")
    public class187 field2854;

    @ObfuscatedName("fk.g")
    public class187 field2856;

    @ObfuscatedName("fk.h")
    public int field2852 = 0;

    public class175(int arg0) {
        this.field2853 = arg0;
        this.field2855 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2855[var2] = new class187();
            var3.field2878 = var3;
            var3.field2877 = var3;
        }
    }

    @ObfuscatedName("fk.k(J)Lgk;")
    public class187 method3244(long arg0) {
        class187 var3 = this.field2855[(int) (arg0 & (long) (this.field2853 - 1))];
        for (this.field2854 = var3.field2878; this.field2854 != var3; this.field2854 = this.field2854.field2878) {
            if (this.field2854.field2879 == arg0) {
                class187 var4 = this.field2854;
                this.field2854 = this.field2854.field2878;
                return var4;
            }
        }
        this.field2854 = null;
        return null;
    }

    @ObfuscatedName("fk.y(Lgk;J)V")
    public void method3253(class187 arg0, long arg1) {
        if (arg0.field2877 != null) {
            arg0.method3365();
        }
        class187 var4 = this.field2855[(int) (arg1 & (long) (this.field2853 - 1))];
        arg0.field2877 = var4.field2877;
        arg0.field2878 = var4;
        arg0.field2877.field2878 = arg0;
        arg0.field2878.field2877 = arg0;
        arg0.field2879 = arg1;
    }

    @ObfuscatedName("fk.s()V")
    public void method3245() {
        for (int var1 = 0; var1 < this.field2853; var1++) {
            class187 var2 = this.field2855[var1];
            while (true) {
                class187 var3 = var2.field2878;
                if (var2 == var3) {
                    break;
                }
                var3.method3365();
            }
        }
        this.field2854 = null;
        this.field2856 = null;
    }

    @ObfuscatedName("fk.g()Lgk;")
    public class187 method3252() {
        this.field2852 = 0;
        return this.method3248();
    }

    @ObfuscatedName("fk.h()Lgk;")
    public class187 method3248() {
        if (this.field2852 > 0 && this.field2855[this.field2852 - 1] != this.field2856) {
            class187 var1 = this.field2856;
            this.field2856 = var1.field2878;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2852 >= this.field2853) {
                return null;
            }
            var2 = this.field2855[this.field2852++].field2878;
        } while (this.field2855[this.field2852 - 1] == var2);
        this.field2856 = var2.field2878;
        return var2;
    }
}
