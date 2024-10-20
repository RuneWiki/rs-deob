package deob;

@ObfuscatedName("eh")
public class class140 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("eh.n")
    public String field1532;

    @ObfuscatedName("eh.c")
    public byte field1531;

    @ObfuscatedName("eh.m")
    public byte field1536;

    public class140(class134 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("eh.n(Lot;I)V")
    public void method2371(class400 arg0) {
        this.field1532 = arg0.method6198();
        if (this.field1532 != null) {
            arg0.method6217();
            this.field1531 = arg0.method6218();
            this.field1536 = arg0.method6218();
        }
    }

    @ObfuscatedName("eh.c(Leb;B)V")
    public void method2372(class137 arg0) {
        arg0.field1518 = this.field1532;
        if (this.field1532 != null) {
            arg0.field1519 = this.field1531;
            arg0.field1514 = this.field1536;
        }
    }
}
