package deob;

@ObfuscatedName("fx")
public class class156 extends class141 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("fx.aj")
    public long field1733;

    @ObfuscatedName("fx.al")
    public String field1738;

    @ObfuscatedName("fx.ac")
    public int field1734;

    public class156(class144 arg0) {
        this.this$0 = arg0;
        this.field1733 = -1L;
        this.field1738 = null;
        this.field1734 = 0;
    }

    @ObfuscatedName("fx.aj(Lsy;I)V")
    public void method2930(class478 arg0) {
        if (arg0.method7909() != 255) {
            arg0.field4904--;
            this.field1733 = arg0.method7949();
        }
        this.field1738 = arg0.method8048();
        this.field1734 = arg0.method7905();
    }

    @ObfuscatedName("fx.al(Lfi;B)V")
    public void method2932(class152 arg0) {
        arg0.method2982(this.field1733, this.field1738, this.field1734);
    }
}
