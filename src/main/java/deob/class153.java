package deob;

@ObfuscatedName("fu")
public class class153 extends class157 {

    // $FF: synthetic field
    public final class158 this$0;

    @ObfuscatedName("fu.aj")
    public String field1720;

    @ObfuscatedName("fu.al")
    public int field1716;

    @ObfuscatedName("fu.ac")
    public byte field1718;

    public class153(class158 arg0) {
        this.this$0 = arg0;
        this.field1720 = null;
    }

    @ObfuscatedName("fu.aj(Lsy;I)V")
    public void method2959(class478 arg0) {
        if (arg0.method7909() != 255) {
            arg0.field4904--;
            arg0.method7949();
        }
        this.field1720 = arg0.method8048();
        this.field1716 = arg0.method7905();
        this.field1718 = arg0.method8163();
        arg0.method7949();
    }

    @ObfuscatedName("fu.al(Lgn;B)V")
    public void method2961(class161 arg0) {
        class143 var2 = new class143();
        var2.field1622 = new class501(this.field1720);
        var2.field1623 = this.field1716;
        var2.field1624 = this.field1718;
        arg0.method3067(var2);
    }
}
