package deob;

import java.awt.Component;

@ObfuscatedName("aw")
public class class45 extends class47 {

    @ObfuscatedName("aw.n")
    public int field1037;

    public class45(class120 arg0, int arg1) {
        Statics.field1038 = arg0.method2508();
        this.field1037 = arg1;
    }

    @ObfuscatedName("aw.z(Ljava/awt/Component;)V")
    public void method939(Component arg0) throws Exception {
        Statics.field1038.method914(arg0, Statics.field2844, Statics.field1053, -1792672297);
    }

    @ObfuscatedName("aw.n(I)V")
    public void method930(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1038.method911(this.field1037, arg0, -1788205402);
    }

    @ObfuscatedName("aw.u()I")
    public int method944() {
        return Statics.field1038.method913(this.field1037, -2077850007);
    }

    @ObfuscatedName("aw.t()V")
    public void method929() {
        Statics.field1038.method918(this.field1037, this.field1058, (byte) -87);
    }

    @ObfuscatedName("aw.e()V")
    public void method934() {
        Statics.field1038.method915(this.field1037, 1382311248);
    }

    @ObfuscatedName("aw.a()V")
    public void method933() {
        Statics.field1038.method921(this.field1037, 119040782);
    }
}
