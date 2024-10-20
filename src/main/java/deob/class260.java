package deob;

@ObfuscatedName("ih")
public final class class260 {

    @ObfuscatedName("ih.s")
    public class176 field3511 = new class176();

    public class260() {
        this.field3511.field2088 = this.field3511;
        this.field3511.field2089 = this.field3511;
    }

    @ObfuscatedName("ih.s(Lfe;)V")
    public void method4393(class176 arg0) {
        if (arg0.field2089 != null) {
            arg0.method3297();
        }
        arg0.field2089 = this.field3511.field2089;
        arg0.field2088 = this.field3511;
        arg0.field2089.field2088 = arg0;
        arg0.field2088.field2089 = arg0;
    }

    @ObfuscatedName("ih.j(Lfe;)V")
    public void method4395(class176 arg0) {
        if (arg0.field2089 != null) {
            arg0.method3297();
        }
        arg0.field2089 = this.field3511;
        arg0.field2088 = this.field3511.field2088;
        arg0.field2089.field2088 = arg0;
        arg0.field2088.field2089 = arg0;
    }

    @ObfuscatedName("ih.i()Lfe;")
    public class176 method4396() {
        class176 var1 = this.field3511.field2088;
        return this.field3511 == var1 ? null : var1;
    }
}
