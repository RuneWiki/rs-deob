package deob;

@ObfuscatedName("go")
public class class174 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("go.ap")
    public String field1860;

    @ObfuscatedName("go.aw")
    public byte field1861;

    @ObfuscatedName("go.ak")
    public byte field1859;

    public class174(class168 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("go.ap(Lvl;I)V")
    public void method3436(class558 arg0) {
        this.field1860 = arg0.method9268();
        if (this.field1860 != null) {
            arg0.method9258();
            this.field1861 = arg0.method9259();
            this.field1859 = arg0.method9259();
        }
    }

    @ObfuscatedName("go.aw(Lgw;I)V")
    public void method3434(class171 arg0) {
        arg0.field1840 = this.field1860;
        if (this.field1860 != null) {
            arg0.field1842 = this.field1861;
            arg0.field1846 = this.field1859;
        }
    }
}
