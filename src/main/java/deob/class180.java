package deob;

@ObfuscatedName("ft")
public final class class180 {

    @ObfuscatedName("ft.b")
    public class181 field2852 = new class181();

    public class180() {
        this.field2852.field2853 = this.field2852;
        this.field2852.field2854 = this.field2852;
    }

    @ObfuscatedName("ft.b(Lff;)V")
    public void method3227(class181 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3243();
        }
        arg0.field2854 = this.field2852.field2854;
        arg0.field2853 = this.field2852;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    @ObfuscatedName("ft.u(Lff;)V")
    public void method3228(class181 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3243();
        }
        arg0.field2854 = this.field2852;
        arg0.field2853 = this.field2852.field2853;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    @ObfuscatedName("ft.x()Lff;")
    public class181 method3236() {
        class181 var1 = this.field2852.field2853;
        if (this.field2852 == var1) {
            return null;
        } else {
            var1.method3243();
            return var1;
        }
    }

    @ObfuscatedName("ft.j()Lff;")
    public class181 method3230() {
        class181 var1 = this.field2852.field2853;
        return this.field2852 == var1 ? null : var1;
    }

    @ObfuscatedName("ft.o()V")
    public void method3239() {
        while (true) {
            class181 var1 = this.field2852.field2853;
            if (this.field2852 == var1) {
                return;
            }
            var1.method3243();
        }
    }
}
