package deob;

@ObfuscatedName("fm")
public class class159 extends class152 {

    // $FF: synthetic field
    public final class153 this$0;

    @ObfuscatedName("fm.a")
    public String field1752;

    @ObfuscatedName("fm.f")
    public byte field1750;

    @ObfuscatedName("fm.c")
    public byte field1753;

    public class159(class153 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("fm.a(Lqr;B)V")
    public void method2858(class464 arg0) {
        this.field1752 = arg0.method7899();
        if (this.field1752 != null) {
            arg0.method7735();
            this.field1750 = arg0.method7881();
            this.field1753 = arg0.method7881();
        }
    }

    @ObfuscatedName("fm.f(Leq;I)V")
    public void method2859(class156 arg0) {
        arg0.field1731 = this.field1752;
        if (this.field1752 != null) {
            arg0.field1726 = this.field1750;
            arg0.field1732 = this.field1753;
        }
    }
}
