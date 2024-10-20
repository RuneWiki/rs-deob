package deob;

@ObfuscatedName("ae")
public class class27 extends class15 {

    // $FF: synthetic field
    public final class3 this$0;

    @ObfuscatedName("ae.v")
    public long field218;

    @ObfuscatedName("ae.n")
    public String field219;

    @ObfuscatedName("ae.f")
    public int field220;

    public class27(class3 arg0) {
        this.this$0 = arg0;
        this.field218 = -1L;
        this.field219 = null;
        this.field220 = 0;
    }

    @ObfuscatedName("ae.v(Lnd;I)V")
    public void method2(class383 arg0) {
        if (arg0.method5965() != 255) {
            arg0.field4158--;
            this.field218 = arg0.method5971();
        }
        this.field219 = arg0.method6180();
        this.field220 = arg0.method5967();
    }

    @ObfuscatedName("ae.n(Ll;B)V")
    public void method1(class12 arg0) {
        arg0.method75(this.field218, this.field219, this.field220);
    }
}
