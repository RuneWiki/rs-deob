package deob;

@ObfuscatedName("lt")
public final class class334 {

    @ObfuscatedName("lt.s")
    public class406 field4124 = new class406();

    public class334() {
        this.field4124.field4461 = this.field4124;
        this.field4124.field4462 = this.field4124;
    }

    @ObfuscatedName("lt.s(Loa;)V")
    public void method5419(class406 arg0) {
        if (arg0.field4462 != null) {
            arg0.method6406();
        }
        arg0.field4462 = this.field4124.field4462;
        arg0.field4461 = this.field4124;
        arg0.field4462.field4461 = arg0;
        arg0.field4461.field4462 = arg0;
    }

    @ObfuscatedName("lt.h(Loa;)V")
    public void method5416(class406 arg0) {
        if (arg0.field4462 != null) {
            arg0.method6406();
        }
        arg0.field4462 = this.field4124;
        arg0.field4461 = this.field4124.field4461;
        arg0.field4462.field4461 = arg0;
        arg0.field4461.field4462 = arg0;
    }

    @ObfuscatedName("lt.w()Loa;")
    public class406 method5417() {
        class406 var1 = this.field4124.field4461;
        return this.field4124 == var1 ? null : var1;
    }
}
