package deob;

@ObfuscatedName("v")
public class class19 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("v.f")
    public int field141;

    @ObfuscatedName("v.o")
    public boolean field142;

    public class19(class3 arg0) {
        this.this$0 = arg0;
        this.field141 = -1;
    }

    @ObfuscatedName("v.f(Lnu;I)V")
    public void method2(class382 arg0) {
        this.field141 = arg0.method5858();
        this.field142 = arg0.method5856() == 1;
    }

    @ObfuscatedName("v.o(Lm;I)V")
    public void method10(class12 arg0) {
        arg0.method99(this.field141, this.field142);
    }
}
