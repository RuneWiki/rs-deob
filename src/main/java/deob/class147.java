package deob;

@ObfuscatedName("fn")
public class class147 extends class157 {

    // $FF: synthetic field
    public final class158 this$0;

    @ObfuscatedName("fn.aj")
    public int field1662;

    @ObfuscatedName("fn.al")
    public byte field1656;

    @ObfuscatedName("fn.ac")
    public int field1657;

    @ObfuscatedName("fn.ab")
    public String field1660;

    public class147(class158 arg0) {
        this.this$0 = arg0;
        this.field1662 = -1;
    }

    @ObfuscatedName("fn.aj(Lsy;I)V")
    public void method2959(class478 arg0) {
        this.field1662 = arg0.method7905();
        this.field1656 = arg0.method8163();
        this.field1657 = arg0.method7905();
        arg0.method7949();
        this.field1660 = arg0.method7950();
    }

    @ObfuscatedName("fn.al(Lgn;B)V")
    public void method2961(class161 arg0) {
        class143 var2 = (class143) arg0.field1757.get(this.field1662);
        var2.field1624 = this.field1656;
        var2.field1623 = this.field1657;
        var2.field1622 = new class501(this.field1660);
    }
}
