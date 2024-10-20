package deob;

@ObfuscatedName("e")
public class class6 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("e.f")
    public int field43;

    public class6(class20 arg0) {
        this.this$0 = arg0;
        this.field43 = -1;
    }

    @ObfuscatedName("e.f(Lnu;I)V")
    public void method62(class382 arg0) {
        this.field43 = arg0.method5858();
        arg0.method5856();
        if (arg0.method5856() != 255) {
            arg0.field4155--;
            arg0.method6069();
        }
    }

    @ObfuscatedName("e.o(Lp;I)V")
    public void method61(class4 arg0) {
        arg0.method36(this.field43);
    }
}
