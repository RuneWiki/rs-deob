package deob;

@ObfuscatedName("ea")
public class class137 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ea.s")
    public int field1591;

    public class137(class146 arg0) {
        this.this$0 = arg0;
        this.field1591 = -1;
    }

    @ObfuscatedName("ea.s(Lqr;I)V")
    public void method2654(class444 arg0) {
        this.field1591 = arg0.method7120();
        arg0.method6929();
        if (arg0.method6929() != 255) {
            arg0.field4708--;
            arg0.method6935();
        }
    }

    @ObfuscatedName("ea.h(Lec;I)V")
    public void method2655(class149 arg0) {
        arg0.method2781(this.field1591);
    }
}
