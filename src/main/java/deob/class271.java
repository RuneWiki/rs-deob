package deob;

@ObfuscatedName("jv")
public final class class271 {

    @ObfuscatedName("jv.f")
    public class185 field3554 = new class185();

    public class271() {
        this.field3554.field2133 = this.field3554;
        this.field3554.field2134 = this.field3554;
    }

    @ObfuscatedName("jv.f(Lgp;)V")
    public void method4557(class185 arg0) {
        if (arg0.field2134 != null) {
            arg0.method3400();
        }
        arg0.field2134 = this.field3554.field2134;
        arg0.field2133 = this.field3554;
        arg0.field2134.field2133 = arg0;
        arg0.field2133.field2134 = arg0;
    }

    @ObfuscatedName("jv.b(Lgp;)V")
    public void method4555(class185 arg0) {
        if (arg0.field2134 != null) {
            arg0.method3400();
        }
        arg0.field2134 = this.field3554;
        arg0.field2133 = this.field3554.field2133;
        arg0.field2134.field2133 = arg0;
        arg0.field2133.field2134 = arg0;
    }

    @ObfuscatedName("jv.l()Lgp;")
    public class185 method4564() {
        class185 var1 = this.field3554.field2133;
        return this.field3554 == var1 ? null : var1;
    }
}
