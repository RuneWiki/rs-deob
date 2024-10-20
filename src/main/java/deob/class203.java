package deob;

@ObfuscatedName("gp")
public class class203 {

    @ObfuscatedName("gp.m")
    public class204 field2570 = new class204();

    @ObfuscatedName("gp.p")
    public class204 field2569;

    public class203() {
        this.field2570.field2572 = this.field2570;
        this.field2570.field2571 = this.field2570;
    }

    @ObfuscatedName("gp.m(Lgb;)V")
    public void method3516(class204 arg0) {
        if (arg0.field2571 != null) {
            arg0.method3526();
        }
        arg0.field2571 = this.field2570.field2571;
        arg0.field2572 = this.field2570;
        arg0.field2571.field2572 = arg0;
        arg0.field2572.field2571 = arg0;
    }

    @ObfuscatedName("gp.p()Lgb;")
    public class204 method3518() {
        class204 var1 = this.field2570.field2572;
        if (this.field2570 == var1) {
            this.field2569 = null;
            return null;
        } else {
            this.field2569 = var1.field2572;
            return var1;
        }
    }

    @ObfuscatedName("gp.i()Lgb;")
    public class204 method3515() {
        class204 var1 = this.field2569;
        if (this.field2570 == var1) {
            this.field2569 = null;
            return null;
        } else {
            this.field2569 = var1.field2572;
            return var1;
        }
    }
}
