package deob;

@ObfuscatedName("ew")
public class class153 extends class146 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("ew.c")
    public String field1727;

    @ObfuscatedName("ew.p")
    public byte field1722;

    @ObfuscatedName("ew.f")
    public byte field1721;

    public class153(class147 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ew.c(Lqq;I)V")
    public void method2862(class445 arg0) {
        this.field1727 = arg0.method7205();
        if (this.field1727 != null) {
            arg0.method7196();
            this.field1722 = arg0.method7197();
            this.field1721 = arg0.method7197();
        }
    }

    @ObfuscatedName("ew.p(Ler;B)V")
    public void method2863(class150 arg0) {
        arg0.field1706 = this.field1727;
        if (this.field1727 != null) {
            arg0.field1712 = this.field1722;
            arg0.field1710 = this.field1721;
        }
    }
}
