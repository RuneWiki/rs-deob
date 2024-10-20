package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class44 extends class52 {

    @ObfuscatedName("ay.m")
    public int field1039;

    public class44(class74 arg0, int arg1) {
        Statics.field1040 = arg0.method1501();
        this.field1039 = arg1;
    }

    @ObfuscatedName("ay.g(Ljava/awt/Component;)V")
    public void method921(Component arg0) throws Exception {
        Statics.field1040.method892(arg0, Statics.field1096, Statics.field1085, (byte) 75);
    }

    @ObfuscatedName("ay.m(I)V")
    public void method915(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1040.method899(this.field1039, arg0, (byte) 118);
    }

    @ObfuscatedName("ay.v()I")
    public int method916() {
        return Statics.field1040.method893(this.field1039, 421912263);
    }

    @ObfuscatedName("ay.r()V")
    public void method917() {
        Statics.field1040.method891(this.field1039, this.field1095, -1824686912);
    }

    @ObfuscatedName("ay.n()V")
    public void method918() {
        Statics.field1040.method895(this.field1039, 97970855);
    }

    @ObfuscatedName("ay.i()V")
    public void method929() {
        Statics.field1040.method897(this.field1039, -808841613);
    }
}
