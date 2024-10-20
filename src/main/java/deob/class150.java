package deob;

@ObfuscatedName("ex")
public class class150 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("ex.c")
    public String field1663;

    @ObfuscatedName("ex.b")
    public byte field1661;

    @ObfuscatedName("ex.p")
    public byte field1660;

    public class150(class144 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ex.c(Lpi;B)V")
    public void method2619(class419 arg0) {
        this.field1663 = arg0.method6679();
        if (this.field1663 != null) {
            arg0.method6781();
            this.field1661 = arg0.method6846();
            this.field1660 = arg0.method6846();
        }
    }

    @ObfuscatedName("ex.b(Lei;B)V")
    public void method2621(class147 arg0) {
        arg0.field1642 = this.field1663;
        if (this.field1663 != null) {
            arg0.field1637 = this.field1661;
            arg0.field1644 = this.field1660;
        }
    }
}
