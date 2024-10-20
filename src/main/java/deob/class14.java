package deob;

@ObfuscatedName("k")
public class class14 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("k.f")
    public long field118;

    @ObfuscatedName("k.e")
    public String field122;

    public class14(class3 arg0) {
        this.this$0 = arg0;
        this.field118 = -1L;
        this.field122 = null;
    }

    @ObfuscatedName("k.f(Lnt;I)V")
    public void method11(class384 arg0) {
        if (arg0.method5902() != 255) {
            arg0.field4161--;
            this.field118 = arg0.method5896();
        }
        this.field122 = arg0.method5940();
    }

    @ObfuscatedName("k.e(Lb;I)V")
    public void method3(class12 arg0) {
        arg0.method80(this.field118, this.field122);
    }
}
