package deob;

@ObfuscatedName("fd")
public final class class177 {

    @ObfuscatedName("fd.l")
    public int field2860;

    @ObfuscatedName("fd.y")
    public class189[] field2861;

    @ObfuscatedName("fd.g")
    public class189 field2862;

    @ObfuscatedName("fd.j")
    public class189 field2863;

    @ObfuscatedName("fd.w")
    public int field2864 = 0;

    public class177(int arg0) {
        this.field2860 = arg0;
        this.field2861 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2861[var2] = new class189();
            var3.field2885 = var3;
            var3.field2887 = var3;
        }
    }

    @ObfuscatedName("fd.l(J)Lgv;")
    public class189 method3254(long arg0) {
        class189 var3 = this.field2861[(int) (arg0 & (long) (this.field2860 - 1))];
        for (this.field2862 = var3.field2885; this.field2862 != var3; this.field2862 = this.field2862.field2885) {
            if (this.field2862.field2886 == arg0) {
                class189 var4 = this.field2862;
                this.field2862 = this.field2862.field2885;
                return var4;
            }
        }
        this.field2862 = null;
        return null;
    }

    @ObfuscatedName("fd.y(Lgv;J)V")
    public void method3260(class189 arg0, long arg1) {
        if (arg0.field2887 != null) {
            arg0.method3375();
        }
        class189 var4 = this.field2861[(int) (arg1 & (long) (this.field2860 - 1))];
        arg0.field2887 = var4.field2887;
        arg0.field2885 = var4;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
        arg0.field2886 = arg1;
    }

    @ObfuscatedName("fd.g()V")
    public void method3256() {
        for (int var1 = 0; var1 < this.field2860; var1++) {
            class189 var2 = this.field2861[var1];
            while (true) {
                class189 var3 = var2.field2885;
                if (var2 == var3) {
                    break;
                }
                var3.method3375();
            }
        }
        this.field2862 = null;
        this.field2863 = null;
    }

    @ObfuscatedName("fd.j()Lgv;")
    public class189 method3257() {
        this.field2864 = 0;
        return this.method3258();
    }

    @ObfuscatedName("fd.w()Lgv;")
    public class189 method3258() {
        if (this.field2864 > 0 && this.field2861[this.field2864 - 1] != this.field2863) {
            class189 var1 = this.field2863;
            this.field2863 = var1.field2885;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2864 >= this.field2860) {
                return null;
            }
            var2 = this.field2861[this.field2864++].field2885;
        } while (this.field2861[this.field2864 - 1] == var2);
        this.field2863 = var2.field2885;
        return var2;
    }
}
