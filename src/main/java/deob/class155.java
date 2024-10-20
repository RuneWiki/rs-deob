package deob;

@ObfuscatedName("fn")
public class class155 extends class159 {

    // $FF: synthetic field
    public final class160 this$0;

    @ObfuscatedName("fn.at")
    public String field1714;

    @ObfuscatedName("fn.an")
    public int field1713;

    @ObfuscatedName("fn.av")
    public byte field1715;

    public class155(class160 arg0) {
        this.this$0 = arg0;
        this.field1714 = null;
    }

    @ObfuscatedName("fn.at(Ltz;I)V")
    public void method2959(class501 arg0) {
        if (arg0.method8129() != 255) {
            arg0.field5017--;
            arg0.method8135();
        }
        this.field1714 = arg0.method8128();
        this.field1713 = arg0.method8195();
        this.field1715 = arg0.method8130();
        arg0.method8135();
    }

    @ObfuscatedName("fn.an(Lgv;I)V")
    public void method2960(class163 arg0) {
        class145 var2 = new class145();
        var2.field1632 = new class525(this.field1714);
        var2.field1631 = this.field1713;
        var2.field1635 = this.field1715;
        arg0.method3065(var2);
    }
}
