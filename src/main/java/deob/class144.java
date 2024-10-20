package deob;

@ObfuscatedName("eb")
public class class144 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("eb.v")
    public long field1628;

    @ObfuscatedName("eb.c")
    public String field1627;

    @ObfuscatedName("eb.i")
    public int field1626;

    public class144(class132 arg0) {
        this.this$0 = arg0;
        this.field1628 = -1L;
        this.field1627 = null;
        this.field1626 = 0;
    }

    @ObfuscatedName("eb.v(Lpi;I)V")
    public void method2678(class438 arg0) {
        if (arg0.method6971() != 255) {
            arg0.field4621--;
            this.field1628 = arg0.method7003();
        }
        this.field1627 = arg0.method6980();
        this.field1626 = arg0.method7148();
    }

    @ObfuscatedName("eb.c(Lex;S)V")
    public void method2679(class140 arg0) {
        arg0.method2734(this.field1628, this.field1627, this.field1626);
    }
}
