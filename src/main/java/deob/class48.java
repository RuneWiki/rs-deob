package deob;

import java.awt.Component;

@ObfuscatedName("ae")
public class class48 extends class50 {

    @ObfuscatedName("ae.v")
    public int field1057;

    public class48(class123 arg0, int arg1) {
        Statics.field1056 = arg0.method2466();
        this.field1057 = arg1;
    }

    @ObfuscatedName("ae.e(Ljava/awt/Component;)V")
    public void method908(Component arg0) throws Exception {
        Statics.field1056.method889(arg0, Statics.field1077, Statics.field1081, -1727467637);
    }

    @ObfuscatedName("ae.v(I)V")
    public void method909(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1056.method887(this.field1057, arg0, (byte) -77);
    }

    @ObfuscatedName("ae.i()I")
    public int method910() {
        return Statics.field1056.method888(this.field1057, 807354685);
    }

    @ObfuscatedName("ae.g()V")
    public void method921() {
        Statics.field1056.method903(this.field1057, this.field1065, 868439199);
    }

    @ObfuscatedName("ae.x()V")
    public void method911() {
        Statics.field1056.method894(this.field1057, -2113634713);
    }

    @ObfuscatedName("ae.b()V")
    public void method912() {
        Statics.field1056.method891(this.field1057, (byte) -18);
    }
}
