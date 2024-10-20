package deob;

@ObfuscatedName("er")
public class class139 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("er.c")
    public String field1590;

    @ObfuscatedName("er.b")
    public int field1589;

    @ObfuscatedName("er.p")
    public byte field1591;

    public class139(class144 arg0) {
        this.this$0 = arg0;
        this.field1590 = null;
    }

    @ObfuscatedName("er.c(Lpi;B)V")
    public void method2619(class419 arg0) {
        if (arg0.method6781() != 255) {
            arg0.field4475--;
            arg0.method6676();
        }
        this.field1590 = arg0.method6679();
        this.field1589 = arg0.method6672();
        this.field1591 = arg0.method6846();
        arg0.method6676();
    }

    @ObfuscatedName("er.b(Lei;B)V")
    public void method2621(class147 arg0) {
        class129 var2 = new class129();
        var2.field1506 = new class440(this.field1590);
        var2.field1510 = this.field1589;
        var2.field1507 = this.field1591;
        arg0.method2735(var2);
    }
}
