package deob;

@ObfuscatedName("h")
public class class9 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("h.f")
    public long field60;

    @ObfuscatedName("h.e")
    public String field61;

    public class9(class3 arg0) {
        this.this$0 = arg0;
        this.field60 = -1L;
        this.field61 = null;
    }

    @ObfuscatedName("h.f(Lnt;I)V")
    public void method11(class384 arg0) {
        if (arg0.method5902() != 255) {
            arg0.field4161--;
            this.field60 = arg0.method5896();
        }
        this.field61 = arg0.method5940();
    }

    @ObfuscatedName("h.e(Lb;I)V")
    public void method3(class12 arg0) {
        arg0.method77(this.field60, this.field61, 0);
    }
}
