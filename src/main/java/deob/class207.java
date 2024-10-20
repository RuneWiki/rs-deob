package deob;

@ObfuscatedName("gt")
public class class207 {

    @ObfuscatedName("gt.n")
    public class208 field2603 = new class208();

    @ObfuscatedName("gt.v")
    public class208 field2604;

    public class207() {
        this.field2603.field2605 = this.field2603;
        this.field2603.field2606 = this.field2603;
    }

    @ObfuscatedName("gt.n(Lgf;)V")
    public void method3518(class208 arg0) {
        if (arg0.field2606 != null) {
            arg0.method3529();
        }
        arg0.field2606 = this.field2603.field2606;
        arg0.field2605 = this.field2603;
        arg0.field2606.field2605 = arg0;
        arg0.field2605.field2606 = arg0;
    }

    @ObfuscatedName("gt.v()Lgf;")
    public class208 method3519() {
        class208 var1 = this.field2603.field2605;
        if (this.field2603 == var1) {
            this.field2604 = null;
            return null;
        } else {
            this.field2604 = var1.field2605;
            return var1;
        }
    }

    @ObfuscatedName("gt.y()Lgf;")
    public class208 method3520() {
        class208 var1 = this.field2604;
        if (this.field2603 == var1) {
            this.field2604 = null;
            return null;
        } else {
            this.field2604 = var1.field2605;
            return var1;
        }
    }
}
