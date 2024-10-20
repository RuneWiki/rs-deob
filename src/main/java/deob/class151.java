package deob;

@ObfuscatedName("ei")
public class class151 extends class136 {

    // $FF: synthetic field
    public final class139 this$0;

    @ObfuscatedName("ei.a")
    public long field1712;

    @ObfuscatedName("ei.f")
    public String field1706;

    @ObfuscatedName("ei.c")
    public int field1709;

    public class151(class139 arg0) {
        this.this$0 = arg0;
        this.field1712 = -1L;
        this.field1706 = null;
        this.field1709 = 0;
    }

    @ObfuscatedName("ei.a(Lqr;I)V")
    public void method2828(class464 arg0) {
        if (arg0.method7735() != 255) {
            arg0.field4864--;
            this.field1712 = arg0.method7721();
        }
        this.field1706 = arg0.method7899();
        this.field1709 = arg0.method7716();
    }

    @ObfuscatedName("ei.f(Ler;B)V")
    public void method2834(class147 arg0) {
        arg0.method2880(this.field1712, this.field1706, this.field1709);
    }
}
