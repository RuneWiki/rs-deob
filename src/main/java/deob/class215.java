package deob;

@ObfuscatedName("he")
public final class class215 {

    @ObfuscatedName("he.d")
    public int field2650;

    @ObfuscatedName("he.z")
    public class217[] field2646;

    @ObfuscatedName("he.n")
    public class217 field2648;

    @ObfuscatedName("he.r")
    public class217 field2649;

    @ObfuscatedName("he.e")
    public int field2647 = 0;

    public class215(int arg0) {
        this.field2650 = arg0;
        this.field2646 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2646[var2] = new class217();
            var3.field2654 = var3;
            var3.field2653 = var3;
        }
    }

    @ObfuscatedName("he.d(J)Lho;")
    public class217 method3736(long arg0) {
        class217 var3 = this.field2646[(int) (arg0 & (long) (this.field2650 - 1))];
        for (this.field2648 = var3.field2654; this.field2648 != var3; this.field2648 = this.field2648.field2654) {
            if (this.field2648.field2655 == arg0) {
                class217 var4 = this.field2648;
                this.field2648 = this.field2648.field2654;
                return var4;
            }
        }
        this.field2648 = null;
        return null;
    }

    @ObfuscatedName("he.z(Lho;J)V")
    public void method3745(class217 arg0, long arg1) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        class217 var4 = this.field2646[(int) (arg1 & (long) (this.field2650 - 1))];
        arg0.field2653 = var4.field2653;
        arg0.field2654 = var4;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
        arg0.field2655 = arg1;
    }

    @ObfuscatedName("he.n()V")
    public void method3738() {
        for (int var1 = 0; var1 < this.field2650; var1++) {
            class217 var2 = this.field2646[var1];
            while (true) {
                class217 var3 = var2.field2654;
                if (var2 == var3) {
                    break;
                }
                var3.method3785();
            }
        }
        this.field2648 = null;
        this.field2649 = null;
    }

    @ObfuscatedName("he.r()Lho;")
    public class217 method3739() {
        this.field2647 = 0;
        return this.method3740();
    }

    @ObfuscatedName("he.e()Lho;")
    public class217 method3740() {
        if (this.field2647 > 0 && this.field2646[this.field2647 - 1] != this.field2649) {
            class217 var1 = this.field2649;
            this.field2649 = var1.field2654;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2647 >= this.field2650) {
                return null;
            }
            var2 = this.field2646[this.field2647++].field2654;
        } while (this.field2646[this.field2647 - 1] == var2);
        this.field2649 = var2.field2654;
        return var2;
    }
}
