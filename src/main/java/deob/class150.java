package deob;

@ObfuscatedName("fa")
public class class150 extends class149 {

    // $FF: synthetic field
    public final class152 this$0;

    @ObfuscatedName("fa.ab")
    public int field1678;

    @ObfuscatedName("fa.ay")
    public boolean field1680;

    public class150(class152 arg0) {
        this.this$0 = arg0;
        this.field1678 = -1;
    }

    @ObfuscatedName("fa.ab(Lvg;I)V")
    public void method3167(class549 arg0) {
        this.field1678 = arg0.method8968();
        this.field1680 = arg0.method9025() == 1;
    }

    @ObfuscatedName("fa.ay(Lgg;I)V")
    public void method3166(class160 arg0) {
        arg0.method3254(this.field1678, this.field1680);
    }
}
