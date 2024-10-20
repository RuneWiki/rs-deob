package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class48 extends class50 {

    @ObfuscatedName("ab.j")
    public int field1035;

    public class48(class123 arg0, int arg1) {
        Statics.field1036 = arg0.method2486();
        this.field1035 = arg1;
    }

    @ObfuscatedName("ab.z(Ljava/awt/Component;)V")
    public void method912(Component arg0) throws Exception {
        Statics.field1036.method908(arg0, Statics.field1044, Statics.field1042, 1435636428);
    }

    @ObfuscatedName("ab.j(I)V")
    public void method913(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1036.method891(this.field1035, arg0, -593663957);
    }

    @ObfuscatedName("ab.a()I")
    public int method914() {
        return Statics.field1036.method892(this.field1035, -1581241427);
    }

    @ObfuscatedName("ab.y()V")
    public void method915() {
        Statics.field1036.method893(this.field1035, this.field1055, -750197264);
    }

    @ObfuscatedName("ab.i()V")
    public void method911() {
        Statics.field1036.method890(this.field1035, 860464044);
    }

    @ObfuscatedName("ab.b()V")
    public void method917() {
        Statics.field1036.method906(this.field1035, -653676255);
    }
}
