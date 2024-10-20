package deob;

@ObfuscatedName("fx")
public class class144 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("fx.aq")
    public long field1668;

    @ObfuscatedName("fx.aw")
    public String field1665;

    public class144(class149 arg0) {
        this.this$0 = arg0;
        this.field1668 = -1L;
        this.field1665 = null;
    }

    @ObfuscatedName("fx.aq(Luq;I)V")
    public void method3033(class534 arg0) {
        if (arg0.method8591() != 255) {
            arg0.field5200--;
            this.field1668 = arg0.method8598();
        }
        this.field1665 = arg0.method8601();
    }

    @ObfuscatedName("fx.aw(Lgt;I)V")
    public void method3030(class157 arg0) {
        arg0.method3115(this.field1668, this.field1665, 0);
    }
}
