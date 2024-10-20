package deob;

@ObfuscatedName("ia")
public final class class260 {

    @ObfuscatedName("ia.a")
    public class176 field3524 = new class176();

    public class260() {
        this.field3524.field2082 = this.field3524;
        this.field3524.field2083 = this.field3524;
    }

    @ObfuscatedName("ia.a(Lfa;)V")
    public void method4491(class176 arg0) {
        if (arg0.field2083 != null) {
            arg0.method3378();
        }
        arg0.field2083 = this.field3524.field2083;
        arg0.field2082 = this.field3524;
        arg0.field2083.field2082 = arg0;
        arg0.field2082.field2083 = arg0;
    }

    @ObfuscatedName("ia.t(Lfa;)V")
    public void method4496(class176 arg0) {
        if (arg0.field2083 != null) {
            arg0.method3378();
        }
        arg0.field2083 = this.field3524;
        arg0.field2082 = this.field3524.field2082;
        arg0.field2083.field2082 = arg0;
        arg0.field2082.field2083 = arg0;
    }

    @ObfuscatedName("ia.n()Lfa;")
    public class176 method4489() {
        class176 var1 = this.field3524.field2082;
        return this.field3524 == var1 ? null : var1;
    }
}
