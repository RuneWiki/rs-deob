package deob;

@ObfuscatedName("ac")
public class class27 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("ac.f")
    public long field202;

    @ObfuscatedName("ac.o")
    public String field207;

    @ObfuscatedName("ac.u")
    public int field206;

    public class27(class3 arg0) {
        this.this$0 = arg0;
        this.field202 = -1L;
        this.field207 = null;
        this.field206 = 0;
    }

    @ObfuscatedName("ac.f(Lnu;I)V")
    public void method2(class382 arg0) {
        if (arg0.method5856() != 255) {
            arg0.field4155--;
            this.field202 = arg0.method6069();
        }
        this.field207 = arg0.method5837();
        this.field206 = arg0.method5858();
    }

    @ObfuscatedName("ac.o(Lm;I)V")
    public void method10(class12 arg0) {
        arg0.method92(this.field202, this.field207, this.field206);
    }
}
