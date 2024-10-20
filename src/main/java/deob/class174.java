package deob;

@ObfuscatedName("gr")
public class class174 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("gr.ac")
    public String field1859;

    @ObfuscatedName("gr.ae")
    public byte field1853;

    @ObfuscatedName("gr.ag")
    public byte field1855;

    public class174(class168 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gr.ac(Lvf;B)V")
    public void method3287(class551 arg0) {
        this.field1859 = arg0.method8987();
        if (this.field1859 != null) {
            arg0.method8955();
            this.field1853 = arg0.method8975();
            this.field1855 = arg0.method8975();
        }
    }

    @ObfuscatedName("gr.ae(Lgm;I)V")
    public void method3286(class171 arg0) {
        arg0.field1841 = this.field1859;
        if (this.field1859 != null) {
            arg0.field1840 = this.field1853;
            arg0.field1834 = this.field1855;
        }
    }
}
