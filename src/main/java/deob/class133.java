package deob;

@ObfuscatedName("ea")
public class class133 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("ea.c")
    public int field1552;

    @ObfuscatedName("ea.l")
    public byte field1553;

    @ObfuscatedName("ea.s")
    public int field1554;

    @ObfuscatedName("ea.e")
    public String field1555;

    public class133(class144 arg0) {
        this.this$0 = arg0;
        this.field1552 = -1;
    }

    @ObfuscatedName("ea.c(Lpi;B)V")
    public void method2616(class421 arg0) {
        this.field1552 = arg0.method6666();
        this.field1553 = arg0.method6664();
        this.field1554 = arg0.method6666();
        arg0.method6670();
        this.field1555 = arg0.method6674();
    }

    @ObfuscatedName("ea.l(Leg;B)V")
    public void method2621(class147 arg0) {
        class129 var2 = (class129) arg0.field1660.get(this.field1552);
        var2.field1528 = this.field1553;
        var2.field1525 = this.field1554;
        var2.field1527 = new class442(this.field1555);
    }
}
