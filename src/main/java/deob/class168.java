package deob;

@ObfuscatedName("go")
public class class168 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("go.aq")
    public long field1815;

    @ObfuscatedName("go.aw")
    public String field1820;

    public class168(class149 arg0) {
        this.this$0 = arg0;
        this.field1815 = -1L;
        this.field1820 = null;
    }

    @ObfuscatedName("go.aq(Luq;I)V")
    public void method3033(class534 arg0) {
        if (arg0.method8591() != 255) {
            arg0.field5200--;
            this.field1815 = arg0.method8598();
        }
        this.field1820 = arg0.method8601();
    }

    @ObfuscatedName("go.aw(Lgt;I)V")
    public void method3030(class157 arg0) {
        arg0.method3087(this.field1815, this.field1820);
    }
}
