package deob;

@ObfuscatedName("gd")
public final class class203 {

    @ObfuscatedName("gd.w")
    public int field2443;

    @ObfuscatedName("gd.m")
    public class205[] field2442;

    @ObfuscatedName("gd.q")
    public class205 field2445;

    @ObfuscatedName("gd.b")
    public class205 field2441;

    @ObfuscatedName("gd.f")
    public int field2444 = 0;

    public class203(int arg0) {
        this.field2443 = arg0;
        this.field2442 = new class205[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class205 var3 = this.field2442[var2] = new class205();
            var3.field2448 = var3;
            var3.field2449 = var3;
        }
    }

    @ObfuscatedName("gd.w(J)Lgl;")
    public class205 method3748(long arg0) {
        class205 var3 = this.field2442[(int) (arg0 & (long) (this.field2443 - 1))];
        for (this.field2445 = var3.field2448; this.field2445 != var3; this.field2445 = this.field2445.field2448) {
            if (this.field2445.field2450 == arg0) {
                class205 var4 = this.field2445;
                this.field2445 = this.field2445.field2448;
                return var4;
            }
        }
        this.field2445 = null;
        return null;
    }

    @ObfuscatedName("gd.m(Lgl;J)V")
    public void method3747(class205 arg0, long arg1) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        class205 var4 = this.field2442[(int) (arg1 & (long) (this.field2443 - 1))];
        arg0.field2449 = var4.field2449;
        arg0.field2448 = var4;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
        arg0.field2450 = arg1;
    }

    @ObfuscatedName("gd.q()V")
    public void method3738() {
        for (int var1 = 0; var1 < this.field2443; var1++) {
            class205 var2 = this.field2442[var1];
            while (true) {
                class205 var3 = var2.field2448;
                if (var2 == var3) {
                    break;
                }
                var3.method3782();
            }
        }
        this.field2445 = null;
        this.field2441 = null;
    }

    @ObfuscatedName("gd.x()Lgl;")
    public class205 method3739() {
        this.field2444 = 0;
        return this.method3740();
    }

    @ObfuscatedName("gd.j()Lgl;")
    public class205 method3740() {
        if (this.field2444 > 0 && this.field2442[this.field2444 - 1] != this.field2441) {
            class205 var1 = this.field2441;
            this.field2441 = var1.field2448;
            return var1;
        }
        class205 var2;
        do {
            if (this.field2444 >= this.field2443) {
                return null;
            }
            var2 = this.field2442[this.field2444++].field2448;
        } while (this.field2442[this.field2444 - 1] == var2);
        this.field2441 = var2.field2448;
        return var2;
    }
}
