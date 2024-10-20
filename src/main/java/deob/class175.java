package deob;

@ObfuscatedName("fd")
public final class class175 {

    @ObfuscatedName("fd.n")
    public int field2865;

    @ObfuscatedName("fd.x")
    public class187[] field2863;

    @ObfuscatedName("fd.k")
    public class187 field2861;

    @ObfuscatedName("fd.i")
    public class187 field2864;

    @ObfuscatedName("fd.d")
    public int field2862 = 0;

    public class175(int arg0) {
        this.field2865 = arg0;
        this.field2863 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2863[var2] = new class187();
            var3.field2887 = var3;
            var3.field2886 = var3;
        }
    }

    @ObfuscatedName("fd.n(J)Lga;")
    public class187 method3149(long arg0) {
        class187 var3 = this.field2863[(int) (arg0 & (long) (this.field2865 - 1))];
        for (this.field2861 = var3.field2887; this.field2861 != var3; this.field2861 = this.field2861.field2887) {
            if (this.field2861.field2888 == arg0) {
                class187 var4 = this.field2861;
                this.field2861 = this.field2861.field2887;
                return var4;
            }
        }
        this.field2861 = null;
        return null;
    }

    @ObfuscatedName("fd.x(Lga;J)V")
    public void method3156(class187 arg0, long arg1) {
        if (arg0.field2886 != null) {
            arg0.method3277();
        }
        class187 var4 = this.field2863[(int) (arg1 & (long) (this.field2865 - 1))];
        arg0.field2886 = var4.field2886;
        arg0.field2887 = var4;
        arg0.field2886.field2887 = arg0;
        arg0.field2887.field2886 = arg0;
        arg0.field2888 = arg1;
    }

    @ObfuscatedName("fd.k()V")
    public void method3155() {
        for (int var1 = 0; var1 < this.field2865; var1++) {
            class187 var2 = this.field2863[var1];
            while (true) {
                class187 var3 = var2.field2887;
                if (var2 == var3) {
                    break;
                }
                var3.method3277();
            }
        }
        this.field2861 = null;
        this.field2864 = null;
    }

    @ObfuscatedName("fd.i()Lga;")
    public class187 method3153() {
        this.field2862 = 0;
        return this.method3151();
    }

    @ObfuscatedName("fd.d()Lga;")
    public class187 method3151() {
        if (this.field2862 > 0 && this.field2863[this.field2862 - 1] != this.field2864) {
            class187 var1 = this.field2864;
            this.field2864 = var1.field2887;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2862 >= this.field2865) {
                return null;
            }
            var2 = this.field2863[this.field2862++].field2887;
        } while (this.field2863[this.field2862 - 1] == var2);
        this.field2864 = var2.field2887;
        return var2;
    }
}
