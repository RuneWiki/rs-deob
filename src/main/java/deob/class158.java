package deob;

@ObfuscatedName("fr")
public class class158 extends class136 {

    // $FF: synthetic field
    public final class139 this$0;

    @ObfuscatedName("fr.a")
    public long field1747;

    @ObfuscatedName("fr.f")
    public String field1744;

    public class158(class139 arg0) {
        this.this$0 = arg0;
        this.field1747 = -1L;
        this.field1744 = null;
    }

    @ObfuscatedName("fr.a(Lqr;I)V")
    public void method2828(class464 arg0) {
        if (arg0.method7735() != 255) {
            arg0.field4864--;
            this.field1747 = arg0.method7721();
        }
        this.field1744 = arg0.method7899();
    }

    @ObfuscatedName("fr.f(Ler;B)V")
    public void method2834(class147 arg0) {
        arg0.method2922(this.field1747, this.field1744);
    }
}
