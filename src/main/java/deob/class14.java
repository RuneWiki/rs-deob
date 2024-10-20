package deob;

@ObfuscatedName("c")
public class class14 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("c.f")
    public long field120;

    @ObfuscatedName("c.o")
    public String field117;

    public class14(class3 arg0) {
        this.this$0 = arg0;
        this.field120 = -1L;
        this.field117 = null;
    }

    @ObfuscatedName("c.f(Lnu;I)V")
    public void method2(class382 arg0) {
        if (arg0.method5856() != 255) {
            arg0.field4155--;
            this.field120 = arg0.method6069();
        }
        this.field117 = arg0.method5837();
    }

    @ObfuscatedName("c.o(Lm;I)V")
    public void method10(class12 arg0) {
        arg0.method134(this.field120, this.field117);
    }
}
