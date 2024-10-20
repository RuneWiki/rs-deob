package deob;

@ObfuscatedName("er")
public class class143 extends class153 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("er.h")
    public int field1688;

    @ObfuscatedName("er.e")
    public byte field1691;

    @ObfuscatedName("er.v")
    public int field1690;

    @ObfuscatedName("er.x")
    public String field1689;

    public class143(class154 arg0) {
        this.this$0 = arg0;
        this.field1688 = -1;
    }

    @ObfuscatedName("er.h(Lqy;I)V")
    public void method2911(class467 arg0) {
        this.field1688 = arg0.method7794();
        this.field1691 = arg0.method7793();
        this.field1690 = arg0.method7794();
        arg0.method7958();
        this.field1689 = arg0.method7801();
    }

    @ObfuscatedName("er.e(Lfn;I)V")
    public void method2916(class157 arg0) {
        class139 var2 = (class139) arg0.field1804.get(this.field1688);
        var2.field1665 = this.field1691;
        var2.field1664 = this.field1690;
        var2.field1662 = new class490(this.field1689);
    }
}
