package deob;

@ObfuscatedName("ig")
public final class class260 {

    @ObfuscatedName("ig.c")
    public class176 field3506 = new class176();

    public class260() {
        this.field3506.field2087 = this.field3506;
        this.field3506.field2086 = this.field3506;
    }

    @ObfuscatedName("ig.c(Lfv;)V")
    public void method4472(class176 arg0) {
        if (arg0.field2086 != null) {
            arg0.method3320();
        }
        arg0.field2086 = this.field3506.field2086;
        arg0.field2087 = this.field3506;
        arg0.field2086.field2087 = arg0;
        arg0.field2087.field2086 = arg0;
    }

    @ObfuscatedName("ig.x(Lfv;)V")
    public void method4469(class176 arg0) {
        if (arg0.field2086 != null) {
            arg0.method3320();
        }
        arg0.field2086 = this.field3506;
        arg0.field2087 = this.field3506.field2087;
        arg0.field2086.field2087 = arg0;
        arg0.field2087.field2086 = arg0;
    }

    @ObfuscatedName("ig.t()Lfv;")
    public class176 method4470() {
        class176 var1 = this.field3506.field2087;
        return this.field3506 == var1 ? null : var1;
    }
}
