package deob;

@ObfuscatedName("ic")
public final class class260 {

    @ObfuscatedName("ic.z")
    public class176 field3521 = new class176();

    public class260() {
        this.field3521.field2086 = this.field3521;
        this.field3521.field2087 = this.field3521;
    }

    @ObfuscatedName("ic.z(Lfw;)V")
    public void method4350(class176 arg0) {
        if (arg0.field2087 != null) {
            arg0.method3240();
        }
        arg0.field2087 = this.field3521.field2087;
        arg0.field2086 = this.field3521;
        arg0.field2087.field2086 = arg0;
        arg0.field2086.field2087 = arg0;
    }

    @ObfuscatedName("ic.n(Lfw;)V")
    public void method4354(class176 arg0) {
        if (arg0.field2087 != null) {
            arg0.method3240();
        }
        arg0.field2087 = this.field3521;
        arg0.field2086 = this.field3521.field2086;
        arg0.field2087.field2086 = arg0;
        arg0.field2086.field2087 = arg0;
    }

    @ObfuscatedName("ic.v()Lfw;")
    public class176 method4352() {
        class176 var1 = this.field3521.field2086;
        return this.field3521 == var1 ? null : var1;
    }
}
