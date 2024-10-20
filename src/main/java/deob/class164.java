package deob;

@ObfuscatedName("gs")
public class class164 extends class149 {

    // $FF: synthetic field
    public final class152 this$0;

    @ObfuscatedName("gs.ab")
    public long field1779;

    @ObfuscatedName("gs.ay")
    public String field1780;

    @ObfuscatedName("gs.an")
    public int field1778;

    public class164(class152 arg0) {
        this.this$0 = arg0;
        this.field1779 = -1L;
        this.field1780 = null;
        this.field1778 = 0;
    }

    @ObfuscatedName("gs.ab(Lvg;I)V")
    public void method3167(class549 arg0) {
        if (arg0.method9025() != 255) {
            arg0.field5378--;
            this.field1779 = arg0.method8804();
        }
        this.field1780 = arg0.method8807();
        this.field1778 = arg0.method8968();
    }

    @ObfuscatedName("gs.ay(Lgg;I)V")
    public void method3166(class160 arg0) {
        arg0.method3222(this.field1779, this.field1780, this.field1778);
    }
}
