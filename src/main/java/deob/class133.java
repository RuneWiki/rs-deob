package deob;

@ObfuscatedName("eg")
public class class133 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("eg.c")
    public int field1536;

    @ObfuscatedName("eg.b")
    public byte field1542;

    @ObfuscatedName("eg.p")
    public int field1537;

    @ObfuscatedName("eg.m")
    public String field1539;

    public class133(class144 arg0) {
        this.this$0 = arg0;
        this.field1536 = -1;
    }

    @ObfuscatedName("eg.c(Lpi;B)V")
    public void method2619(class419 arg0) {
        this.field1536 = arg0.method6672();
        this.field1542 = arg0.method6846();
        this.field1537 = arg0.method6672();
        arg0.method6676();
        this.field1539 = arg0.method6707();
    }

    @ObfuscatedName("eg.b(Lei;B)V")
    public void method2621(class147 arg0) {
        class129 var2 = (class129) arg0.field1639.get(this.field1536);
        var2.field1507 = this.field1542;
        var2.field1510 = this.field1537;
        var2.field1506 = new class440(this.field1539);
    }
}
