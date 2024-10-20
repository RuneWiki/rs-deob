package deob;

@ObfuscatedName("ix")
public final class class260 {

    @ObfuscatedName("ix.q")
    public class176 field3538 = new class176();

    public class260() {
        this.field3538.field2105 = this.field3538;
        this.field3538.field2107 = this.field3538;
    }

    @ObfuscatedName("ix.q(Lfb;)V")
    public void method4405(class176 arg0) {
        if (arg0.field2107 != null) {
            arg0.method3276();
        }
        arg0.field2107 = this.field3538.field2107;
        arg0.field2105 = this.field3538;
        arg0.field2107.field2105 = arg0;
        arg0.field2105.field2107 = arg0;
    }

    @ObfuscatedName("ix.w(Lfb;)V")
    public void method4408(class176 arg0) {
        if (arg0.field2107 != null) {
            arg0.method3276();
        }
        arg0.field2107 = this.field3538;
        arg0.field2105 = this.field3538.field2105;
        arg0.field2107.field2105 = arg0;
        arg0.field2105.field2107 = arg0;
    }

    @ObfuscatedName("ix.e()Lfb;")
    public class176 method4407() {
        class176 var1 = this.field3538.field2105;
        return this.field3538 == var1 ? null : var1;
    }
}
