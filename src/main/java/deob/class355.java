package deob;

@ObfuscatedName("my")
public final class class355 {

    @ObfuscatedName("my.f")
    public class435 field4343 = new class435();

    public class355() {
        this.field4343.field4702 = this.field4343;
        this.field4343.field4703 = this.field4343;
    }

    @ObfuscatedName("my.f(Lpi;)V")
    public void method6225(class435 arg0) {
        if (arg0.field4703 != null) {
            arg0.method7429();
        }
        arg0.field4703 = this.field4343.field4703;
        arg0.field4702 = this.field4343;
        arg0.field4703.field4702 = arg0;
        arg0.field4702.field4703 = arg0;
    }

    @ObfuscatedName("my.w(Lpi;)V")
    public void method6226(class435 arg0) {
        if (arg0.field4703 != null) {
            arg0.method7429();
        }
        arg0.field4703 = this.field4343;
        arg0.field4702 = this.field4343.field4702;
        arg0.field4703.field4702 = arg0;
        arg0.field4702.field4703 = arg0;
    }

    @ObfuscatedName("my.v()Lpi;")
    public class435 method6224() {
        class435 var1 = this.field4343.field4702;
        return this.field4343 == var1 ? null : var1;
    }
}
