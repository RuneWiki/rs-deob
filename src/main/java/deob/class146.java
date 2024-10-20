package deob;

@ObfuscatedName("fc")
public class class146 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("fc.aq")
    public long field1686;

    @ObfuscatedName("fc.ad")
    public String field1684;

    public class146(class151 arg0) {
        this.this$0 = arg0;
        this.field1686 = -1L;
        this.field1684 = null;
    }

    @ObfuscatedName("fc.aq(Lvp;B)V")
    public void method3076(class547 arg0) {
        if (arg0.method8804() != 255) {
            arg0.field5363--;
            this.field1686 = arg0.method8735();
        }
        this.field1684 = arg0.method8738();
    }

    @ObfuscatedName("fc.ad(Lgk;B)V")
    public void method3075(class159 arg0) {
        arg0.method3146(this.field1686, this.field1684, 0);
    }
}
