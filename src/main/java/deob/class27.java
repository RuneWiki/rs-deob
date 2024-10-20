package deob;

@ObfuscatedName("aw")
public class class27 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("aw.f")
    public long field213;

    @ObfuscatedName("aw.e")
    public String field207;

    @ObfuscatedName("aw.v")
    public int field209;

    public class27(class3 arg0) {
        this.this$0 = arg0;
        this.field213 = -1L;
        this.field207 = null;
        this.field209 = 0;
    }

    @ObfuscatedName("aw.f(Lnt;I)V")
    public void method11(class384 arg0) {
        if (arg0.method5902() != 255) {
            arg0.field4161--;
            this.field213 = arg0.method5896();
        }
        this.field207 = arg0.method5940();
        this.field209 = arg0.method5899();
    }

    @ObfuscatedName("aw.e(Lb;I)V")
    public void method3(class12 arg0) {
        arg0.method77(this.field213, this.field207, this.field209);
    }
}
