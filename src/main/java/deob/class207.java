package deob;

@ObfuscatedName("gb")
public class class207 {

    @ObfuscatedName("gb.p")
    public class208 field2568 = new class208();

    @ObfuscatedName("gb.i")
    public class208 field2569;

    public class207() {
        this.field2568.field2571 = this.field2568;
        this.field2568.field2570 = this.field2568;
    }

    @ObfuscatedName("gb.p(Lgu;)V")
    public void method3607(class208 arg0) {
        if (arg0.field2570 != null) {
            arg0.method3620();
        }
        arg0.field2570 = this.field2568.field2570;
        arg0.field2571 = this.field2568;
        arg0.field2570.field2571 = arg0;
        arg0.field2571.field2570 = arg0;
    }

    @ObfuscatedName("gb.i()Lgu;")
    public class208 method3606() {
        class208 var1 = this.field2568.field2571;
        if (this.field2568 == var1) {
            this.field2569 = null;
            return null;
        } else {
            this.field2569 = var1.field2571;
            return var1;
        }
    }

    @ObfuscatedName("gb.w()Lgu;")
    public class208 method3608() {
        class208 var1 = this.field2569;
        if (this.field2568 == var1) {
            this.field2569 = null;
            return null;
        } else {
            this.field2569 = var1.field2571;
            return var1;
        }
    }
}
