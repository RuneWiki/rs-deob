package deob;

@ObfuscatedName("fy")
public final class class180 {

    @ObfuscatedName("fy.j")
    public class181 field2852 = new class181();

    public class180() {
        this.field2852.field2853 = this.field2852;
        this.field2852.field2854 = this.field2852;
    }

    @ObfuscatedName("fy.j(Lfe;)V")
    public void method3284(class181 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3294();
        }
        arg0.field2854 = this.field2852.field2854;
        arg0.field2853 = this.field2852;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    @ObfuscatedName("fy.z(Lfe;)V")
    public void method3279(class181 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3294();
        }
        arg0.field2854 = this.field2852;
        arg0.field2853 = this.field2852.field2853;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    @ObfuscatedName("fy.y()Lfe;")
    public class181 method3280() {
        class181 var1 = this.field2852.field2853;
        if (this.field2852 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("fy.h()Lfe;")
    public class181 method3291() {
        class181 var1 = this.field2852.field2853;
        return this.field2852 == var1 ? null : var1;
    }

    @ObfuscatedName("fy.r()V")
    public void method3282() {
        while (true) {
            class181 var1 = this.field2852.field2853;
            if (this.field2852 == var1) {
                return;
            }
            var1.method3294();
        }
    }
}
