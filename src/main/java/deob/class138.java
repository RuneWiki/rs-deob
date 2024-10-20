package deob;

@ObfuscatedName("es")
public class class138 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("es.f")
    public long field1641;

    @ObfuscatedName("es.w")
    public String field1639;

    public class138(class143 arg0) {
        this.this$0 = arg0;
        this.field1641 = -1L;
        this.field1639 = null;
    }

    @ObfuscatedName("es.f(Lrd;S)V")
    public void method2984(class474 arg0) {
        if (arg0.method7964() != 255) {
            arg0.field4939--;
            this.field1641 = arg0.method8151();
        }
        this.field1639 = arg0.method7973();
    }

    @ObfuscatedName("es.w(Leb;B)V")
    public void method2983(class151 arg0) {
        arg0.method3029(this.field1641, this.field1639, 0);
    }
}
