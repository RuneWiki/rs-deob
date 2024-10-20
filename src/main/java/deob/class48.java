package deob;

import java.awt.Component;

@ObfuscatedName("as")
public class class48 extends class50 {

    @ObfuscatedName("as.s")
    public int field1062;

    public class48(class123 arg0, int arg1) {
        Statics.field1063 = arg0.method2465();
        this.field1062 = arg1;
    }

    @ObfuscatedName("as.g(Ljava/awt/Component;)V")
    public void method923(Component arg0) throws Exception {
        Statics.field1063.method901(arg0, Statics.field1071, Statics.field1069, (byte) -85);
    }

    @ObfuscatedName("as.s(I)V")
    public void method914(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1063.method906(this.field1062, arg0, -1658636587);
    }

    @ObfuscatedName("as.h()I")
    public int method912() {
        return Statics.field1063.method897(this.field1062, (byte) -60);
    }

    @ObfuscatedName("as.m()V")
    public void method913() {
        Statics.field1063.method892(this.field1062, this.field1068, 1165161607);
    }

    @ObfuscatedName("as.u()V")
    public void method910() {
        Statics.field1063.method893(this.field1062, (byte) -65);
    }

    @ObfuscatedName("as.j()V")
    public void method915() {
        Statics.field1063.method896(this.field1062, (byte) 0);
    }
}
