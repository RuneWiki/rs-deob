package deob;

@ObfuscatedName("hh")
public final class class215 {

    @ObfuscatedName("hh.o")
    public int field2645;

    @ObfuscatedName("hh.k")
    public class217[] field2646;

    @ObfuscatedName("hh.t")
    public class217 field2647;

    @ObfuscatedName("hh.d")
    public class217 field2648;

    @ObfuscatedName("hh.h")
    public int field2649 = 0;

    public class215(int arg0) {
        this.field2645 = arg0;
        this.field2646 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2646[var2] = new class217();
            var3.field2653 = var3;
            var3.field2654 = var3;
        }
    }

    @ObfuscatedName("hh.o(J)Lhj;")
    public class217 method3637(long arg0) {
        class217 var3 = this.field2646[(int) (arg0 & (long) (this.field2645 - 1))];
        for (this.field2647 = var3.field2653; this.field2647 != var3; this.field2647 = this.field2647.field2653) {
            if (this.field2647.field2652 == arg0) {
                class217 var4 = this.field2647;
                this.field2647 = this.field2647.field2653;
                return var4;
            }
        }
        this.field2647 = null;
        return null;
    }

    @ObfuscatedName("hh.k(Lhj;J)V")
    public void method3638(class217 arg0, long arg1) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        class217 var4 = this.field2646[(int) (arg1 & (long) (this.field2645 - 1))];
        arg0.field2654 = var4.field2654;
        arg0.field2653 = var4;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
        arg0.field2652 = arg1;
    }

    @ObfuscatedName("hh.t()V")
    public void method3639() {
        for (int var1 = 0; var1 < this.field2645; var1++) {
            class217 var2 = this.field2646[var1];
            while (true) {
                class217 var3 = var2.field2653;
                if (var2 == var3) {
                    break;
                }
                var3.method3681();
            }
        }
        this.field2647 = null;
        this.field2648 = null;
    }

    @ObfuscatedName("hh.d()Lhj;")
    public class217 method3641() {
        this.field2649 = 0;
        return this.method3640();
    }

    @ObfuscatedName("hh.h()Lhj;")
    public class217 method3640() {
        if (this.field2649 > 0 && this.field2646[this.field2649 - 1] != this.field2648) {
            class217 var1 = this.field2648;
            this.field2648 = var1.field2653;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2649 >= this.field2645) {
                return null;
            }
            var2 = this.field2646[this.field2649++].field2653;
        } while (this.field2646[this.field2649 - 1] == var2);
        this.field2648 = var2.field2653;
        return var2;
    }
}
