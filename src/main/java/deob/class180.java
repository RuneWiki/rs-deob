package deob;

@ObfuscatedName("fz")
public final class class180 {

    @ObfuscatedName("fz.z")
    public class181 field2847 = new class181();

    public class180() {
        this.field2847.field2849 = this.field2847;
        this.field2847.field2848 = this.field2847;
    }

    @ObfuscatedName("fz.z(Lfe;)V")
    public void method3271(class181 arg0) {
        if (arg0.field2848 != null) {
            arg0.method3294();
        }
        arg0.field2848 = this.field2847.field2848;
        arg0.field2849 = this.field2847;
        arg0.field2848.field2849 = arg0;
        arg0.field2849.field2848 = arg0;
    }

    @ObfuscatedName("fz.j(Lfe;)V")
    public void method3270(class181 arg0) {
        if (arg0.field2848 != null) {
            arg0.method3294();
        }
        arg0.field2848 = this.field2847;
        arg0.field2849 = this.field2847.field2849;
        arg0.field2848.field2849 = arg0;
        arg0.field2849.field2848 = arg0;
    }

    @ObfuscatedName("fz.a()Lfe;")
    public class181 method3286() {
        class181 var1 = this.field2847.field2849;
        if (this.field2847 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("fz.y()Lfe;")
    public class181 method3274() {
        class181 var1 = this.field2847.field2849;
        return this.field2847 == var1 ? null : var1;
    }

    @ObfuscatedName("fz.i()V")
    public void method3292() {
        while (true) {
            class181 var1 = this.field2847.field2849;
            if (this.field2847 == var1) {
                return;
            }
            var1.method3294();
        }
    }
}
