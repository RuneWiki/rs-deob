package deob;

@ObfuscatedName("gq")
public final class class205 {

    @ObfuscatedName("gq.g")
    public int field2492;

    @ObfuscatedName("gq.r")
    public class207[] field2490;

    @ObfuscatedName("gq.e")
    public class207 field2491;

    @ObfuscatedName("gq.q")
    public class207 field2489;

    @ObfuscatedName("gq.c")
    public int field2493 = 0;

    public class205(int arg0) {
        this.field2492 = arg0;
        this.field2490 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2490[var2] = new class207();
            var3.field2496 = var3;
            var3.field2498 = var3;
        }
    }

    @ObfuscatedName("gq.g(J)Lgy;")
    public class207 method3905(long arg0) {
        class207 var3 = this.field2490[(int) (arg0 & (long) (this.field2492 - 1))];
        for (this.field2491 = var3.field2496; this.field2491 != var3; this.field2491 = this.field2491.field2496) {
            if (this.field2491.field2497 == arg0) {
                class207 var4 = this.field2491;
                this.field2491 = this.field2491.field2496;
                return var4;
            }
        }
        this.field2491 = null;
        return null;
    }

    @ObfuscatedName("gq.r(Lgy;J)V")
    public void method3907(class207 arg0, long arg1) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        class207 var4 = this.field2490[(int) (arg1 & (long) (this.field2492 - 1))];
        arg0.field2498 = var4.field2498;
        arg0.field2496 = var4;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
        arg0.field2497 = arg1;
    }

    @ObfuscatedName("gq.e()V")
    public void method3908() {
        for (int var1 = 0; var1 < this.field2492; var1++) {
            class207 var2 = this.field2490[var1];
            while (true) {
                class207 var3 = var2.field2496;
                if (var2 == var3) {
                    break;
                }
                var3.method3952();
            }
        }
        this.field2491 = null;
        this.field2489 = null;
    }

    @ObfuscatedName("gq.q()Lgy;")
    public class207 method3916() {
        this.field2493 = 0;
        return this.method3910();
    }

    @ObfuscatedName("gq.c()Lgy;")
    public class207 method3910() {
        if (this.field2493 > 0 && this.field2490[this.field2493 - 1] != this.field2489) {
            class207 var1 = this.field2489;
            this.field2489 = var1.field2496;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2493 >= this.field2492) {
                return null;
            }
            var2 = this.field2490[this.field2493++].field2496;
        } while (this.field2490[this.field2493 - 1] == var2);
        this.field2489 = var2.field2496;
        return var2;
    }
}
