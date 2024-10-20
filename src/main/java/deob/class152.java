package deob;

@ObfuscatedName("en")
public class class152 extends class145 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("en.v")
    public String field1679;

    @ObfuscatedName("en.c")
    public byte field1678;

    @ObfuscatedName("en.i")
    public byte field1677;

    public class152(class146 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("en.v(Lpi;B)V")
    public void method2708(class438 arg0) {
        this.field1679 = arg0.method6980();
        if (this.field1679 != null) {
            arg0.method6971();
            this.field1678 = arg0.method7093();
            this.field1677 = arg0.method7093();
        }
    }

    @ObfuscatedName("en.c(Lea;I)V")
    public void method2709(class149 arg0) {
        arg0.field1658 = this.field1679;
        if (this.field1679 != null) {
            arg0.field1655 = this.field1678;
            arg0.field1660 = this.field1677;
        }
    }
}
