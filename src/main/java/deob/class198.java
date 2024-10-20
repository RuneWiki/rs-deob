package deob;

@ObfuscatedName("gx")
public final class class198 {

    @ObfuscatedName("gx.m")
    public int field2557;

    @ObfuscatedName("gx.p")
    public class200[] field2556;

    @ObfuscatedName("gx.i")
    public class200 field2555;

    @ObfuscatedName("gx.j")
    public class200 field2558;

    @ObfuscatedName("gx.v")
    public int field2559 = 0;

    public class198(int arg0) {
        this.field2557 = arg0;
        this.field2556 = new class200[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field2556[var2] = new class200();
            var3.field2562 = var3;
            var3.field2564 = var3;
        }
    }

    @ObfuscatedName("gx.m(J)Lgh;")
    public class200 method3444(long arg0) {
        class200 var3 = this.field2556[(int) (arg0 & (long) (this.field2557 - 1))];
        for (this.field2555 = var3.field2562; this.field2555 != var3; this.field2555 = this.field2555.field2562) {
            if (this.field2555.field2563 == arg0) {
                class200 var4 = this.field2555;
                this.field2555 = this.field2555.field2562;
                return var4;
            }
        }
        this.field2555 = null;
        return null;
    }

    @ObfuscatedName("gx.p(Lgh;J)V")
    public void method3431(class200 arg0, long arg1) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        class200 var4 = this.field2556[(int) (arg1 & (long) (this.field2557 - 1))];
        arg0.field2564 = var4.field2564;
        arg0.field2562 = var4;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
        arg0.field2563 = arg1;
    }

    @ObfuscatedName("gx.i()V")
    public void method3432() {
        for (int var1 = 0; var1 < this.field2557; var1++) {
            class200 var2 = this.field2556[var1];
            while (true) {
                class200 var3 = var2.field2562;
                if (var2 == var3) {
                    break;
                }
                var3.method3476();
            }
        }
        this.field2555 = null;
        this.field2558 = null;
    }

    @ObfuscatedName("gx.j()Lgh;")
    public class200 method3433() {
        this.field2559 = 0;
        return this.method3440();
    }

    @ObfuscatedName("gx.v()Lgh;")
    public class200 method3440() {
        if (this.field2559 > 0 && this.field2556[this.field2559 - 1] != this.field2558) {
            class200 var1 = this.field2558;
            this.field2558 = var1.field2562;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2559 >= this.field2557) {
                return null;
            }
            var2 = this.field2556[this.field2559++].field2562;
        } while (this.field2556[this.field2559 - 1] == var2);
        this.field2558 = var2.field2562;
        return var2;
    }
}
