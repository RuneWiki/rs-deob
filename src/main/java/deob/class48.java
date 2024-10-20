package deob;

import java.awt.Component;

@ObfuscatedName("ah")
public class class48 extends class50 {

    @ObfuscatedName("ah.y")
    public int field1046;

    public class48(class123 arg0, int arg1) {
        Statics.field1047 = arg0.method2484();
        this.field1046 = arg1;
    }

    @ObfuscatedName("ah.k(Ljava/awt/Component;)V")
    public void method923(Component arg0) throws Exception {
        Statics.field1047.method919(arg0, Statics.field1074, Statics.field1053, (byte) -84);
    }

    @ObfuscatedName("ah.y(I)V")
    public void method933(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1047.method905(this.field1046, arg0, 89751348);
    }

    @ObfuscatedName("ah.s()I")
    public int method925() {
        return Statics.field1047.method907(this.field1046, (byte) 0);
    }

    @ObfuscatedName("ah.g()V")
    public void method937() {
        Statics.field1047.method909(this.field1046, this.field1054, (byte) 97);
    }

    @ObfuscatedName("ah.h()V")
    public void method941() {
        Statics.field1047.method912(this.field1046, -1054632952);
    }

    @ObfuscatedName("ah.l()V")
    public void method928() {
        Statics.field1047.method910(this.field1046, -915958591);
    }
}
