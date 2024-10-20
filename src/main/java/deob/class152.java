package deob;

@ObfuscatedName("en")
public class class152 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("en.s")
    public String field1693;

    @ObfuscatedName("en.h")
    public byte field1689;

    @ObfuscatedName("en.w")
    public byte field1690;

    public class152(class146 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("en.s(Lqr;I)V")
    public void method2654(class444 arg0) {
        this.field1693 = arg0.method6938();
        if (this.field1693 != null) {
            arg0.method6929();
            this.field1689 = arg0.method6930();
            this.field1690 = arg0.method6930();
        }
    }

    @ObfuscatedName("en.h(Lec;I)V")
    public void method2655(class149 arg0) {
        arg0.field1668 = this.field1693;
        if (this.field1693 != null) {
            arg0.field1667 = this.field1689;
            arg0.field1670 = this.field1690;
        }
    }
}
