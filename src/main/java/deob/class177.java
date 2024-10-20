package deob;

@ObfuscatedName("fl")
public final class class177 {

    @ObfuscatedName("fl.g")
    public int field2860;

    @ObfuscatedName("fl.j")
    public class189[] field2861;

    @ObfuscatedName("fl.z")
    public class189 field2863;

    @ObfuscatedName("fl.b")
    public class189 field2862;

    @ObfuscatedName("fl.k")
    public int field2864 = 0;

    public class177(int arg0) {
        this.field2860 = arg0;
        this.field2861 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2861[var2] = new class189();
            var3.field2886 = var3;
            var3.field2885 = var3;
        }
    }

    @ObfuscatedName("fl.g(J)Lgn;")
    public class189 method3140(long arg0) {
        class189 var3 = this.field2861[(int) (arg0 & (long) (this.field2860 - 1))];
        for (this.field2863 = var3.field2886; this.field2863 != var3; this.field2863 = this.field2863.field2886) {
            if (this.field2863.field2887 == arg0) {
                class189 var4 = this.field2863;
                this.field2863 = this.field2863.field2886;
                return var4;
            }
        }
        this.field2863 = null;
        return null;
    }

    @ObfuscatedName("fl.j(Lgn;J)V")
    public void method3137(class189 arg0, long arg1) {
        if (arg0.field2885 != null) {
            arg0.method3259();
        }
        class189 var4 = this.field2861[(int) (arg1 & (long) (this.field2860 - 1))];
        arg0.field2885 = var4.field2885;
        arg0.field2886 = var4;
        arg0.field2885.field2886 = arg0;
        arg0.field2886.field2885 = arg0;
        arg0.field2887 = arg1;
    }

    @ObfuscatedName("fl.z()V")
    public void method3135() {
        for (int var1 = 0; var1 < this.field2860; var1++) {
            class189 var2 = this.field2861[var1];
            while (true) {
                class189 var3 = var2.field2886;
                if (var2 == var3) {
                    break;
                }
                var3.method3259();
            }
        }
        this.field2863 = null;
        this.field2862 = null;
    }

    @ObfuscatedName("fl.b()Lgn;")
    public class189 method3139() {
        this.field2864 = 0;
        return this.method3146();
    }

    @ObfuscatedName("fl.k()Lgn;")
    public class189 method3146() {
        if (this.field2864 > 0 && this.field2861[this.field2864 - 1] != this.field2862) {
            class189 var1 = this.field2862;
            this.field2862 = var1.field2886;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2864 >= this.field2860) {
                return null;
            }
            var2 = this.field2861[this.field2864++].field2886;
        } while (this.field2861[this.field2864 - 1] == var2);
        this.field2862 = var2.field2886;
        return var2;
    }
}
