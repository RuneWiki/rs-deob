package deob;

@ObfuscatedName("fz")
public class class154 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("fz.aq")
    public int field1722;

    public class154(class163 arg0) {
        this.this$0 = arg0;
        this.field1722 = -1;
    }

    @ObfuscatedName("fz.aq(Luq;I)V")
    public void method3060(class534 arg0) {
        this.field1722 = arg0.method8593();
        arg0.method8591();
        if (arg0.method8591() != 255) {
            arg0.field5200--;
            arg0.method8598();
        }
    }

    @ObfuscatedName("fz.aw(Lgg;I)V")
    public void method3061(class166 arg0) {
        arg0.method3171(this.field1722);
    }
}
