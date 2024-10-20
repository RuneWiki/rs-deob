package deob;

@ObfuscatedName("gu")
public class class164 extends class157 {

    // $FF: synthetic field
    public final class158 this$0;

    @ObfuscatedName("gu.aj")
    public String field1774;

    @ObfuscatedName("gu.al")
    public byte field1775;

    @ObfuscatedName("gu.ac")
    public byte field1773;

    public class164(class158 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gu.aj(Lsy;I)V")
    public void method2959(class478 arg0) {
        this.field1774 = arg0.method8048();
        if (this.field1774 != null) {
            arg0.method7909();
            this.field1775 = arg0.method8163();
            this.field1773 = arg0.method8163();
        }
    }

    @ObfuscatedName("gu.al(Lgn;B)V")
    public void method2961(class161 arg0) {
        arg0.field1760 = this.field1774;
        if (this.field1774 != null) {
            arg0.field1759 = this.field1775;
            arg0.field1762 = this.field1773;
        }
    }
}
