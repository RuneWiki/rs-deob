package deob;

@ObfuscatedName("gn")
public class class203 {

    @ObfuscatedName("gn.b")
    public class204 field2562 = new class204();

    @ObfuscatedName("gn.s")
    public class204 field2563;

    public class203() {
        this.field2562.field2564 = this.field2562;
        this.field2562.field2565 = this.field2562;
    }

    @ObfuscatedName("gn.b(Lgo;)V")
    public void method3431(class204 arg0) {
        if (arg0.field2565 != null) {
            arg0.method3440();
        }
        arg0.field2565 = this.field2562.field2565;
        arg0.field2564 = this.field2562;
        arg0.field2565.field2564 = arg0;
        arg0.field2564.field2565 = arg0;
    }

    @ObfuscatedName("gn.s()Lgo;")
    public class204 method3435() {
        class204 var1 = this.field2562.field2564;
        if (this.field2562 == var1) {
            this.field2563 = null;
            return null;
        } else {
            this.field2563 = var1.field2564;
            return var1;
        }
    }

    @ObfuscatedName("gn.r()Lgo;")
    public class204 method3432() {
        class204 var1 = this.field2563;
        if (this.field2562 == var1) {
            this.field2563 = null;
            return null;
        } else {
            this.field2563 = var1.field2564;
            return var1;
        }
    }
}
