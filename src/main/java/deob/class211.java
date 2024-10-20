package deob;

@ObfuscatedName("hk")
public final class class211 {

    @ObfuscatedName("hk.b")
    public int field2605;

    @ObfuscatedName("hk.q")
    public class213[] field2604;

    @ObfuscatedName("hk.o")
    public class213 field2606;

    @ObfuscatedName("hk.p")
    public class213 field2607;

    @ObfuscatedName("hk.a")
    public int field2608 = 0;

    public class211(int arg0) {
        this.field2605 = arg0;
        this.field2604 = new class213[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class213 var3 = this.field2604[var2] = new class213();
            var3.field2612 = var3;
            var3.field2611 = var3;
        }
    }

    @ObfuscatedName("hk.b(J)Lhe;")
    public class213 method3674(long arg0) {
        class213 var3 = this.field2604[(int) (arg0 & (long) (this.field2605 - 1))];
        for (this.field2606 = var3.field2612; this.field2606 != var3; this.field2606 = this.field2606.field2612) {
            if (this.field2606.field2613 == arg0) {
                class213 var4 = this.field2606;
                this.field2606 = this.field2606.field2612;
                return var4;
            }
        }
        this.field2606 = null;
        return null;
    }

    @ObfuscatedName("hk.q(Lhe;J)V")
    public void method3675(class213 arg0, long arg1) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        class213 var4 = this.field2604[(int) (arg1 & (long) (this.field2605 - 1))];
        arg0.field2611 = var4.field2611;
        arg0.field2612 = var4;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
        arg0.field2613 = arg1;
    }

    @ObfuscatedName("hk.o()V")
    public void method3682() {
        for (int var1 = 0; var1 < this.field2605; var1++) {
            class213 var2 = this.field2604[var1];
            while (true) {
                class213 var3 = var2.field2612;
                if (var2 == var3) {
                    break;
                }
                var3.method3726();
            }
        }
        this.field2606 = null;
        this.field2607 = null;
    }

    @ObfuscatedName("hk.p()Lhe;")
    public class213 method3677() {
        this.field2608 = 0;
        return this.method3678();
    }

    @ObfuscatedName("hk.a()Lhe;")
    public class213 method3678() {
        if (this.field2608 > 0 && this.field2604[this.field2608 - 1] != this.field2607) {
            class213 var1 = this.field2607;
            this.field2607 = var1.field2612;
            return var1;
        }
        class213 var2;
        do {
            if (this.field2608 >= this.field2605) {
                return null;
            }
            var2 = this.field2604[this.field2608++].field2612;
        } while (this.field2604[this.field2608 - 1] == var2);
        this.field2607 = var2.field2612;
        return var2;
    }
}
