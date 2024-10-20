package deob;

@ObfuscatedName("fu")
public class class147 extends class149 {

    // $FF: synthetic field
    public final class152 this$0;

    @ObfuscatedName("fu.ab")
    public long field1667;

    @ObfuscatedName("fu.ay")
    public String field1669;

    public class147(class152 arg0) {
        this.this$0 = arg0;
        this.field1667 = -1L;
        this.field1669 = null;
    }

    @ObfuscatedName("fu.ab(Lvg;I)V")
    public void method3167(class549 arg0) {
        if (arg0.method9025() != 255) {
            arg0.field5378--;
            this.field1667 = arg0.method8804();
        }
        this.field1669 = arg0.method8807();
    }

    @ObfuscatedName("fu.ay(Lgg;I)V")
    public void method3166(class160 arg0) {
        arg0.method3222(this.field1667, this.field1669, 0);
    }
}
