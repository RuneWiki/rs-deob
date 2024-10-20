package deob;

@ObfuscatedName("fj")
public class class156 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("fj.aq")
    public int field1744;

    public class156(class165 arg0) {
        this.this$0 = arg0;
        this.field1744 = -1;
    }

    @ObfuscatedName("fj.aq(Lvp;I)V")
    public void method3101(class547 arg0) {
        this.field1744 = arg0.method8899();
        arg0.method8804();
        if (arg0.method8804() != 255) {
            arg0.field5363--;
            arg0.method8735();
        }
    }

    @ObfuscatedName("fj.ad(Lgj;I)V")
    public void method3102(class168 arg0) {
        arg0.method3215(this.field1744);
    }
}
