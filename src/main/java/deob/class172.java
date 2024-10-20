package deob;

@ObfuscatedName("ft")
public final class class172 {

    @ObfuscatedName("ft.g")
    public class174 field2807 = new class174();

    public class172() {
        this.field2807.field2810 = this.field2807;
        this.field2807.field2811 = this.field2807;
    }

    @ObfuscatedName("ft.g(Lfh;)V")
    public void method3318(class174 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3345();
        }
        arg0.field2811 = this.field2807.field2811;
        arg0.field2810 = this.field2807;
        arg0.field2811.field2810 = arg0;
        arg0.field2810.field2811 = arg0;
    }

    @ObfuscatedName("ft.h(Lfh;)V")
    public void method3319(class174 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3345();
        }
        arg0.field2811 = this.field2807;
        arg0.field2810 = this.field2807.field2810;
        arg0.field2811.field2810 = arg0;
        arg0.field2810.field2811 = arg0;
    }

    @ObfuscatedName("ft.s()Lfh;")
    public class174 method3320() {
        class174 var1 = this.field2807.field2810;
        if (this.field2807 == var1) {
            return null;
        } else {
            var1.method3345();
            return var1;
        }
    }

    @ObfuscatedName("ft.o()Lfh;")
    public class174 method3325() {
        class174 var1 = this.field2807.field2810;
        return this.field2807 == var1 ? null : var1;
    }

    @ObfuscatedName("ft.p()V")
    public void method3317() {
        while (true) {
            class174 var1 = this.field2807.field2810;
            if (this.field2807 == var1) {
                return;
            }
            var1.method3345();
        }
    }
}
