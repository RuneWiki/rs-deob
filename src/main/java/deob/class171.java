package deob;

@ObfuscatedName("gr")
public class class171 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("gr.ak")
    public String field1843;

    @ObfuscatedName("gr.al")
    public byte field1841;

    @ObfuscatedName("gr.aj")
    public byte field1842;

    public class171(class165 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gr.ak(Lua;I)V")
    public void method3089(class546 arg0) {
        this.field1843 = arg0.method8805();
        if (this.field1843 != null) {
            arg0.method8796();
            this.field1841 = arg0.method8797();
            this.field1842 = arg0.method8797();
        }
    }

    @ObfuscatedName("gr.al(Lgo;I)V")
    public void method3091(class168 arg0) {
        arg0.field1828 = this.field1843;
        if (this.field1843 != null) {
            arg0.field1829 = this.field1841;
            arg0.field1830 = this.field1842;
        }
    }
}
