package deob;

@ObfuscatedName("gr")
public class class171 extends class149 {

    // $FF: synthetic field
    public final class152 this$0;

    @ObfuscatedName("gr.ab")
    public long field1813;

    @ObfuscatedName("gr.ay")
    public String field1814;

    public class171(class152 arg0) {
        this.this$0 = arg0;
        this.field1813 = -1L;
        this.field1814 = null;
    }

    @ObfuscatedName("gr.ab(Lvg;I)V")
    public void method3167(class549 arg0) {
        if (arg0.method9025() != 255) {
            arg0.field5378--;
            this.field1813 = arg0.method8804();
        }
        this.field1814 = arg0.method8807();
    }

    @ObfuscatedName("gr.ay(Lgg;I)V")
    public void method3166(class160 arg0) {
        arg0.method3225(this.field1813, this.field1814);
    }
}
