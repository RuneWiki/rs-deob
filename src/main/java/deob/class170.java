package deob;

@ObfuscatedName("gm")
public class class170 extends class148 {

    // $FF: synthetic field
    public final class151 this$0;

    @ObfuscatedName("gm.aq")
    public long field1834;

    @ObfuscatedName("gm.ad")
    public String field1831;

    public class170(class151 arg0) {
        this.this$0 = arg0;
        this.field1834 = -1L;
        this.field1831 = null;
    }

    @ObfuscatedName("gm.aq(Lvp;B)V")
    public void method3076(class547 arg0) {
        if (arg0.method8804() != 255) {
            arg0.field5363--;
            this.field1834 = arg0.method8735();
        }
        this.field1831 = arg0.method8738();
    }

    @ObfuscatedName("gm.ad(Lgk;B)V")
    public void method3075(class159 arg0) {
        arg0.method3126(this.field1834, this.field1831);
    }
}
