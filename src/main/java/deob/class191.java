package deob;

@ObfuscatedName("gi")
public final class class191 {

    @ObfuscatedName("gi.c")
    public int field2430;

    @ObfuscatedName("gi.o")
    public class193[] field2434;

    @ObfuscatedName("gi.i")
    public class193 field2432;

    @ObfuscatedName("gi.u")
    public class193 field2433;

    @ObfuscatedName("gi.g")
    public int field2431 = 0;

    public class191(int arg0) {
        this.field2430 = arg0;
        this.field2434 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2434[var2] = new class193();
            var3.field2438 = var3;
            var3.field2439 = var3;
        }
    }

    @ObfuscatedName("gi.c(J)Lgh;")
    public class193 method3251(long arg0) {
        class193 var3 = this.field2434[(int) (arg0 & (long) (this.field2430 - 1))];
        for (this.field2432 = var3.field2438; this.field2432 != var3; this.field2432 = this.field2432.field2438) {
            if (this.field2432.field2437 == arg0) {
                class193 var4 = this.field2432;
                this.field2432 = this.field2432.field2438;
                return var4;
            }
        }
        this.field2432 = null;
        return null;
    }

    @ObfuscatedName("gi.o(Lgh;J)V")
    public void method3239(class193 arg0, long arg1) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        class193 var4 = this.field2434[(int) (arg1 & (long) (this.field2430 - 1))];
        arg0.field2439 = var4.field2439;
        arg0.field2438 = var4;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
        arg0.field2437 = arg1;
    }

    @ObfuscatedName("gi.i()V")
    public void method3246() {
        for (int var1 = 0; var1 < this.field2430; var1++) {
            class193 var2 = this.field2434[var1];
            while (true) {
                class193 var3 = var2.field2438;
                if (var2 == var3) {
                    break;
                }
                var3.method3287();
            }
        }
        this.field2432 = null;
        this.field2433 = null;
    }

    @ObfuscatedName("gi.u()Lgh;")
    public class193 method3241() {
        this.field2431 = 0;
        return this.method3242();
    }

    @ObfuscatedName("gi.g()Lgh;")
    public class193 method3242() {
        if (this.field2431 > 0 && this.field2434[this.field2431 - 1] != this.field2433) {
            class193 var1 = this.field2433;
            this.field2433 = var1.field2438;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2431 >= this.field2430) {
                return null;
            }
            var2 = this.field2434[this.field2431++].field2438;
        } while (this.field2434[this.field2431 - 1] == var2);
        this.field2433 = var2.field2438;
        return var2;
    }
}
