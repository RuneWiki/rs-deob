package deob;

@ObfuscatedName("fd")
public class class154 extends class157 {

    // $FF: synthetic field
    public final class158 this$0;

    @ObfuscatedName("fd.aj")
    public int field1726;

    @ObfuscatedName("fd.al")
    public byte field1722;

    @ObfuscatedName("fd.ac")
    public int field1723;

    @ObfuscatedName("fd.ab")
    public String field1724;

    public class154(class158 arg0) {
        this.this$0 = arg0;
        this.field1726 = -1;
    }

    @ObfuscatedName("fd.aj(Lsy;I)V")
    public void method2959(class478 arg0) {
        arg0.method7909();
        this.field1726 = arg0.method7905();
        this.field1722 = arg0.method8163();
        this.field1723 = arg0.method7905();
        arg0.method7949();
        this.field1724 = arg0.method7950();
        arg0.method7909();
    }

    @ObfuscatedName("fd.al(Lgn;B)V")
    public void method2961(class161 arg0) {
        class143 var2 = (class143) arg0.field1757.get(this.field1726);
        var2.field1624 = this.field1722;
        var2.field1623 = this.field1723;
        var2.field1622 = new class501(this.field1724);
    }
}
