package deob;

@ObfuscatedName("fh")
public final class class177 {

    @ObfuscatedName("fh.c")
    public int field2863;

    @ObfuscatedName("fh.j")
    public class189[] field2860;

    @ObfuscatedName("fh.y")
    public class189 field2862;

    @ObfuscatedName("fh.r")
    public class189 field2861;

    @ObfuscatedName("fh.f")
    public int field2864 = 0;

    public class177(int arg0) {
        this.field2863 = arg0;
        this.field2860 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2860[var2] = new class189();
            var3.field2885 = var3;
            var3.field2887 = var3;
        }
    }

    @ObfuscatedName("fh.c(J)Lgy;")
    public class189 method3206(long arg0) {
        class189 var3 = this.field2860[(int) (arg0 & (long) (this.field2863 - 1))];
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

    @ObfuscatedName("fh.j(Lgy;J)V")
    public void method3207(class189 arg0, long arg1) {
        if (arg0.field2887 != null) {
            arg0.method3334();
        }
        class189 var4 = this.field2860[(int) (arg1 & (long) (this.field2863 - 1))];
        arg0.field2887 = var4.field2887;
        arg0.field2885 = var4;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
        arg0.field2886 = arg1;
    }

    @ObfuscatedName("fh.y()V")
    public void method3208() {
        for (int var1 = 0; var1 < this.field2863; var1++) {
            class189 var2 = this.field2860[var1];
            while (true) {
                class189 var3 = var2.field2885;
                if (var2 == var3) {
                    break;
                }
                var3.method3334();
            }
        }
        this.field2862 = null;
        this.field2861 = null;
    }

    @ObfuscatedName("fh.r()Lgy;")
    public class189 method3220() {
        this.field2864 = 0;
        return this.method3210();
    }

    @ObfuscatedName("fh.f()Lgy;")
    public class189 method3210() {
        if (this.field2864 > 0 && this.field2860[this.field2864 - 1] != this.field2861) {
            class189 var1 = this.field2861;
            this.field2861 = var1.field2885;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2864 >= this.field2863) {
                return null;
            }
            var2 = this.field2860[this.field2864++].field2885;
        } while (this.field2860[this.field2864 - 1] == var2);
        this.field2861 = var2.field2885;
        return var2;
    }
}
