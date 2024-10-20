package deob;

@ObfuscatedName("hu")
public final class class215 {

    @ObfuscatedName("hu.g")
    public int field2651;

    @ObfuscatedName("hu.e")
    public class217[] field2652;

    @ObfuscatedName("hu.b")
    public class217 field2653;

    @ObfuscatedName("hu.z")
    public class217 field2654;

    @ObfuscatedName("hu.n")
    public int field2655 = 0;

    public class215(int arg0) {
        this.field2651 = arg0;
        this.field2652 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2652[var2] = new class217();
            var3.field2659 = var3;
            var3.field2658 = var3;
        }
    }

    @ObfuscatedName("hu.g(J)Lht;")
    public class217 method3740(long arg0) {
        class217 var3 = this.field2652[(int) (arg0 & (long) (this.field2651 - 1))];
        for (this.field2653 = var3.field2659; this.field2653 != var3; this.field2653 = this.field2653.field2659) {
            if (this.field2653.field2660 == arg0) {
                class217 var4 = this.field2653;
                this.field2653 = this.field2653.field2659;
                return var4;
            }
        }
        this.field2653 = null;
        return null;
    }

    @ObfuscatedName("hu.e(Lht;J)V")
    public void method3741(class217 arg0, long arg1) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        class217 var4 = this.field2652[(int) (arg1 & (long) (this.field2651 - 1))];
        arg0.field2658 = var4.field2658;
        arg0.field2659 = var4;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
        arg0.field2660 = arg1;
    }

    @ObfuscatedName("hu.b()V")
    public void method3742() {
        for (int var1 = 0; var1 < this.field2651; var1++) {
            class217 var2 = this.field2652[var1];
            while (true) {
                class217 var3 = var2.field2659;
                if (var2 == var3) {
                    break;
                }
                var3.method3796();
            }
        }
        this.field2653 = null;
        this.field2654 = null;
    }

    @ObfuscatedName("hu.z()Lht;")
    public class217 method3749() {
        this.field2655 = 0;
        return this.method3744();
    }

    @ObfuscatedName("hu.n()Lht;")
    public class217 method3744() {
        if (this.field2655 > 0 && this.field2652[this.field2655 - 1] != this.field2654) {
            class217 var1 = this.field2654;
            this.field2654 = var1.field2659;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2655 >= this.field2651) {
                return null;
            }
            var2 = this.field2652[this.field2655++].field2659;
        } while (this.field2652[this.field2655 - 1] == var2);
        this.field2654 = var2.field2659;
        return var2;
    }
}
