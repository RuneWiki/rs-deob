package deob;

@ObfuscatedName("fk")
public final class class173 {

    @ObfuscatedName("fk.m")
    public class174 field2806 = new class174();

    public class173() {
        this.field2806.field2808 = this.field2806;
        this.field2806.field2807 = this.field2806;
    }

    @ObfuscatedName("fk.m(Lfw;)V")
    public void method3209(class174 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3216();
        }
        arg0.field2807 = this.field2806.field2807;
        arg0.field2808 = this.field2806;
        arg0.field2807.field2808 = arg0;
        arg0.field2808.field2807 = arg0;
    }

    @ObfuscatedName("fk.k(Lfw;)V")
    public void method3203(class174 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3216();
        }
        arg0.field2807 = this.field2806;
        arg0.field2808 = this.field2806.field2808;
        arg0.field2807.field2808 = arg0;
        arg0.field2808.field2807 = arg0;
    }

    @ObfuscatedName("fk.y()Lfw;")
    public class174 method3204() {
        class174 var1 = this.field2806.field2808;
        if (this.field2806 == var1) {
            return null;
        } else {
            var1.method3216();
            return var1;
        }
    }

    @ObfuscatedName("fk.g()Lfw;")
    public class174 method3205() {
        class174 var1 = this.field2806.field2808;
        return this.field2806 == var1 ? null : var1;
    }

    @ObfuscatedName("fk.r()V")
    public void method3202() {
        while (true) {
            class174 var1 = this.field2806.field2808;
            if (this.field2806 == var1) {
                return;
            }
            var1.method3216();
        }
    }
}
