package deob;

@ObfuscatedName("gk")
public class class203 {

    @ObfuscatedName("gk.d")
    public class204 field2571 = new class204();

    @ObfuscatedName("gk.x")
    public class204 field2572;

    public class203() {
        this.field2571.field2573 = this.field2571;
        this.field2571.field2574 = this.field2571;
    }

    @ObfuscatedName("gk.d(Lga;)V")
    public void method3517(class204 arg0) {
        if (arg0.field2574 != null) {
            arg0.method3529();
        }
        arg0.field2574 = this.field2571.field2574;
        arg0.field2573 = this.field2571;
        arg0.field2574.field2573 = arg0;
        arg0.field2573.field2574 = arg0;
    }

    @ObfuscatedName("gk.x()Lga;")
    public class204 method3518() {
        class204 var1 = this.field2571.field2573;
        if (this.field2571 == var1) {
            this.field2572 = null;
            return null;
        } else {
            this.field2572 = var1.field2573;
            return var1;
        }
    }

    @ObfuscatedName("gk.k()Lga;")
    public class204 method3528() {
        class204 var1 = this.field2572;
        if (this.field2571 == var1) {
            this.field2572 = null;
            return null;
        } else {
            this.field2572 = var1.field2573;
            return var1;
        }
    }
}
