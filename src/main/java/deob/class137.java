package deob;

@ObfuscatedName("ep")
public class class137 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ep.v")
    public int field1572;

    public class137(class146 arg0) {
        this.this$0 = arg0;
        this.field1572 = -1;
    }

    @ObfuscatedName("ep.v(Lpi;B)V")
    public void method2708(class438 arg0) {
        this.field1572 = arg0.method7148();
        arg0.method6971();
        if (arg0.method6971() != 255) {
            arg0.field4621--;
            arg0.method7003();
        }
    }

    @ObfuscatedName("ep.c(Lea;I)V")
    public void method2709(class149 arg0) {
        arg0.method2847(this.field1572);
    }
}
