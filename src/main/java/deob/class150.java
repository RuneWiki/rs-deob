package deob;

@ObfuscatedName("eg")
public class class150 extends class153 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("eg.h")
    public int field1753;

    @ObfuscatedName("eg.e")
    public byte field1752;

    @ObfuscatedName("eg.v")
    public int field1754;

    @ObfuscatedName("eg.x")
    public String field1755;

    public class150(class154 arg0) {
        this.this$0 = arg0;
        this.field1753 = -1;
    }

    @ObfuscatedName("eg.h(Lqy;I)V")
    public void method2911(class467 arg0) {
        arg0.method7792();
        this.field1753 = arg0.method7794();
        this.field1752 = arg0.method7793();
        this.field1754 = arg0.method7794();
        arg0.method7958();
        this.field1755 = arg0.method7801();
        arg0.method7792();
    }

    @ObfuscatedName("eg.e(Lfn;I)V")
    public void method2916(class157 arg0) {
        class139 var2 = (class139) arg0.field1804.get(this.field1753);
        var2.field1665 = this.field1752;
        var2.field1664 = this.field1754;
        var2.field1662 = new class490(this.field1755);
    }
}
