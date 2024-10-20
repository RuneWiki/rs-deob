package deob;

@ObfuscatedName("fs")
public final class class175 {

    @ObfuscatedName("fs.y")
    public int field2810;

    @ObfuscatedName("fs.m")
    public class179[] field2808;

    @ObfuscatedName("fs.d")
    public class179 field2811;

    @ObfuscatedName("fs.k")
    public class179 field2809;

    @ObfuscatedName("fs.n")
    public int field2807 = 0;

    public class175(int arg0) {
        this.field2810 = arg0;
        this.field2808 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2808[var2] = new class179();
            var3.field2818 = var3;
            var3.field2817 = var3;
        }
    }

    @ObfuscatedName("fs.y(J)Lfk;")
    public class179 method3337(long arg0) {
        class179 var3 = this.field2808[(int) (arg0 & (long) (this.field2810 - 1))];
        for (this.field2811 = var3.field2818; this.field2811 != var3; this.field2811 = this.field2811.field2818) {
            if (this.field2811.field2819 == arg0) {
                class179 var4 = this.field2811;
                this.field2811 = this.field2811.field2818;
                return var4;
            }
        }
        this.field2811 = null;
        return null;
    }

    @ObfuscatedName("fs.m(Lfk;J)V")
    public void method3334(class179 arg0, long arg1) {
        if (arg0.field2817 != null) {
            arg0.method3395();
        }
        class179 var4 = this.field2808[(int) (arg1 & (long) (this.field2810 - 1))];
        arg0.field2817 = var4.field2817;
        arg0.field2818 = var4;
        arg0.field2817.field2818 = arg0;
        arg0.field2818.field2817 = arg0;
        arg0.field2819 = arg1;
    }

    @ObfuscatedName("fs.d()V")
    public void method3343() {
        for (int var1 = 0; var1 < this.field2810; var1++) {
            class179 var2 = this.field2808[var1];
            while (true) {
                class179 var3 = var2.field2818;
                if (var2 == var3) {
                    break;
                }
                var3.method3395();
            }
        }
        this.field2811 = null;
        this.field2809 = null;
    }

    @ObfuscatedName("fs.k()Lfk;")
    public class179 method3335() {
        this.field2807 = 0;
        return this.method3342();
    }

    @ObfuscatedName("fs.n()Lfk;")
    public class179 method3342() {
        if (this.field2807 > 0 && this.field2808[this.field2807 - 1] != this.field2809) {
            class179 var1 = this.field2809;
            this.field2809 = var1.field2818;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2807 >= this.field2810) {
                return null;
            }
            var2 = this.field2808[this.field2807++].field2818;
        } while (this.field2808[this.field2807 - 1] == var2);
        this.field2809 = var2.field2818;
        return var2;
    }
}
