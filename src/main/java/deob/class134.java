package deob;

@ObfuscatedName("eb")
public class class134 extends class136 {

    // $FF: synthetic field
    public final class139 this$0;

    @ObfuscatedName("eb.a")
    public long field1574;

    @ObfuscatedName("eb.f")
    public String field1573;

    public class134(class139 arg0) {
        this.this$0 = arg0;
        this.field1574 = -1L;
        this.field1573 = null;
    }

    @ObfuscatedName("eb.a(Lqr;I)V")
    public void method2828(class464 arg0) {
        if (arg0.method7735() != 255) {
            arg0.field4864--;
            this.field1574 = arg0.method7721();
        }
        this.field1573 = arg0.method7899();
    }

    @ObfuscatedName("eb.f(Ler;B)V")
    public void method2834(class147 arg0) {
        arg0.method2880(this.field1574, this.field1573, 0);
    }
}
