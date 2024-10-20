package deob;

@ObfuscatedName("h")
public class class9 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("h.f")
    public long field59;

    @ObfuscatedName("h.o")
    public String field61;

    public class9(class3 arg0) {
        this.this$0 = arg0;
        this.field59 = -1L;
        this.field61 = null;
    }

    @ObfuscatedName("h.f(Lnu;I)V")
    public void method2(class382 arg0) {
        if (arg0.method5856() != 255) {
            arg0.field4155--;
            this.field59 = arg0.method6069();
        }
        this.field61 = arg0.method5837();
    }

    @ObfuscatedName("h.o(Lm;I)V")
    public void method10(class12 arg0) {
        arg0.method92(this.field59, this.field61, 0);
    }
}
