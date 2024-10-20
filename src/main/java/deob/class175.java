package deob;

@ObfuscatedName("fm")
public final class class175 {

    @ObfuscatedName("fm.i")
    public int field2807;

    @ObfuscatedName("fm.p")
    public class179[] field2808;

    @ObfuscatedName("fm.a")
    public class179 field2809;

    @ObfuscatedName("fm.l")
    public class179 field2810;

    @ObfuscatedName("fm.q")
    public int field2811 = 0;

    public class175(int arg0) {
        this.field2807 = arg0;
        this.field2808 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2808[var2] = new class179();
            var3.field2817 = var3;
            var3.field2819 = var3;
        }
    }

    @ObfuscatedName("fm.i(J)Lfk;")
    public class179 method3268(long arg0) {
        class179 var3 = this.field2808[(int) (arg0 & (long) (this.field2807 - 1))];
        for (this.field2809 = var3.field2817; this.field2809 != var3; this.field2809 = this.field2809.field2817) {
            if (this.field2809.field2818 == arg0) {
                class179 var4 = this.field2809;
                this.field2809 = this.field2809.field2817;
                return var4;
            }
        }
        this.field2809 = null;
        return null;
    }

    @ObfuscatedName("fm.p(Lfk;J)V")
    public void method3269(class179 arg0, long arg1) {
        if (arg0.field2819 != null) {
            arg0.method3319();
        }
        class179 var4 = this.field2808[(int) (arg1 & (long) (this.field2807 - 1))];
        arg0.field2819 = var4.field2819;
        arg0.field2817 = var4;
        arg0.field2819.field2817 = arg0;
        arg0.field2817.field2819 = arg0;
        arg0.field2818 = arg1;
    }

    @ObfuscatedName("fm.a()V")
    public void method3270() {
        for (int var1 = 0; var1 < this.field2807; var1++) {
            class179 var2 = this.field2808[var1];
            while (true) {
                class179 var3 = var2.field2817;
                if (var2 == var3) {
                    break;
                }
                var3.method3319();
            }
        }
        this.field2809 = null;
        this.field2810 = null;
    }

    @ObfuscatedName("fm.l()Lfk;")
    public class179 method3271() {
        this.field2811 = 0;
        return this.method3272();
    }

    @ObfuscatedName("fm.q()Lfk;")
    public class179 method3272() {
        if (this.field2811 > 0 && this.field2808[this.field2811 - 1] != this.field2810) {
            class179 var1 = this.field2810;
            this.field2810 = var1.field2817;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2811 >= this.field2807) {
                return null;
            }
            var2 = this.field2808[this.field2811++].field2817;
        } while (this.field2808[this.field2811 - 1] == var2);
        this.field2810 = var2.field2817;
        return var2;
    }
}
