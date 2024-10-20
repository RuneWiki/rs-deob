package deob;

@ObfuscatedName("ef")
public class class144 extends class152 {

    // $FF: synthetic field
    public final class153 this$0;

    @ObfuscatedName("ef.a")
    public int field1650;

    public class144(class153 arg0) {
        this.this$0 = arg0;
        this.field1650 = -1;
    }

    @ObfuscatedName("ef.a(Lqr;B)V")
    public void method2858(class464 arg0) {
        this.field1650 = arg0.method7716();
        arg0.method7735();
        if (arg0.method7735() != 255) {
            arg0.field4864--;
            arg0.method7721();
        }
    }

    @ObfuscatedName("ef.f(Leq;I)V")
    public void method2859(class156 arg0) {
        arg0.method2955(this.field1650);
    }
}
