package deob;

@ObfuscatedName("ew")
public class class137 extends class136 {

    // $FF: synthetic field
    public final class139 this$0;

    @ObfuscatedName("ew.a")
    public int field1588;

    @ObfuscatedName("ew.f")
    public boolean field1589;

    public class137(class139 arg0) {
        this.this$0 = arg0;
        this.field1588 = -1;
    }

    @ObfuscatedName("ew.a(Lqr;I)V")
    public void method2828(class464 arg0) {
        this.field1588 = arg0.method7716();
        this.field1589 = arg0.method7735() == 1;
    }

    @ObfuscatedName("ew.f(Ler;B)V")
    public void method2834(class147 arg0) {
        arg0.method2902(this.field1588, this.field1589);
    }
}
