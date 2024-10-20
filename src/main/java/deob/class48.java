package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class48 extends class50 {

    @ObfuscatedName("at.u")
    public int field1068;

    public class48(class123 arg0, int arg1) {
        Statics.field1069 = arg0.method2490();
        this.field1068 = arg1;
    }

    @ObfuscatedName("at.b(Ljava/awt/Component;)V")
    public void method917(Component arg0) throws Exception {
        Statics.field1069.method916(arg0, Statics.field1087, Statics.field1075, 249315146);
    }

    @ObfuscatedName("at.u(I)V")
    public void method919(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1069.method898(this.field1068, arg0, (byte) -65);
    }

    @ObfuscatedName("at.x()I")
    public int method920() {
        return Statics.field1069.method899(this.field1068, 1720523081);
    }

    @ObfuscatedName("at.j()V")
    public void method930() {
        Statics.field1069.method902(this.field1068, this.field1074, (short) -11187);
    }

    @ObfuscatedName("at.o()V")
    public void method929() {
        Statics.field1069.method901(this.field1068, 1342138563);
    }

    @ObfuscatedName("at.n()V")
    public void method923() {
        Statics.field1069.method912(this.field1068, -616242258);
    }
}
