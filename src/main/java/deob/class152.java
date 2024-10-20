package deob;

@ObfuscatedName("fk")
public class class152 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("fk.ap")
    public int field1706;

    @ObfuscatedName("fk.aw")
    public boolean field1708;

    public class152(class154 arg0) {
        this.this$0 = arg0;
        this.field1706 = -1;
    }

    @ObfuscatedName("fk.ap(Lvl;I)V")
    public void method3401(class558 arg0) {
        this.field1706 = arg0.method9260();
        this.field1708 = arg0.method9258() == 1;
    }

    @ObfuscatedName("fk.aw(Lgy;I)V")
    public void method3402(class162 arg0) {
        arg0.method3460(this.field1706, this.field1708);
    }
}
