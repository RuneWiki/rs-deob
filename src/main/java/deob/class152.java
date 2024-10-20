package deob;

@ObfuscatedName("ee")
public class class152 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ee.c")
    public String field1713;

    @ObfuscatedName("ee.v")
    public byte field1711;

    @ObfuscatedName("ee.q")
    public byte field1712;

    public class152(class146 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ee.c(Lqt;I)V")
    public void method2716(class443 arg0) {
        this.field1713 = arg0.method7056();
        if (this.field1713 != null) {
            arg0.method7047();
            this.field1711 = arg0.method7048();
            this.field1712 = arg0.method7048();
        }
    }

    @ObfuscatedName("ee.v(Lex;I)V")
    public void method2719(class149 arg0) {
        arg0.field1695 = this.field1713;
        if (this.field1713 != null) {
            arg0.field1696 = this.field1711;
            arg0.field1697 = this.field1712;
        }
    }
}
