package deob;

@ObfuscatedName("ee")
public class class153 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("ee.f")
    public int field1755;

    @ObfuscatedName("ee.w")
    public byte field1753;

    @ObfuscatedName("ee.v")
    public int field1757;

    @ObfuscatedName("ee.s")
    public String field1752;

    public class153(class157 arg0) {
        this.this$0 = arg0;
        this.field1755 = -1;
    }

    @ObfuscatedName("ee.f(Lrd;B)V")
    public void method3007(class474 arg0) {
        arg0.method7964();
        this.field1755 = arg0.method8032();
        this.field1753 = arg0.method7965();
        this.field1757 = arg0.method8032();
        arg0.method8151();
        this.field1752 = arg0.method7983();
        arg0.method7964();
    }

    @ObfuscatedName("ee.w(Lfm;I)V")
    public void method3008(class160 arg0) {
        class142 var2 = (class142) arg0.field1794.get(this.field1755);
        var2.field1657 = this.field1753;
        var2.field1659 = this.field1757;
        var2.field1656 = new class497(this.field1752);
    }
}
