package deob;

@ObfuscatedName("ea")
public class class140 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("ea.l")
    public String field1537;

    @ObfuscatedName("ea.q")
    public byte field1534;

    @ObfuscatedName("ea.f")
    public byte field1535;

    public class140(class134 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ea.l(Lot;B)V")
    public void method2400(class401 arg0) {
        this.field1537 = arg0.method6280();
        if (this.field1537 != null) {
            arg0.method6272();
            this.field1534 = arg0.method6273();
            this.field1535 = arg0.method6273();
        }
    }

    @ObfuscatedName("ea.q(Leb;I)V")
    public void method2396(class137 arg0) {
        arg0.field1517 = this.field1537;
        if (this.field1537 != null) {
            arg0.field1518 = this.field1534;
            arg0.field1513 = this.field1535;
        }
    }
}
