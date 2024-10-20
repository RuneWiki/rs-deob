package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class55 extends class57 {

    @ObfuscatedName("bf.u")
    public int field1181;

    public class55(class137 arg0, int arg1) {
        Statics.field1182 = arg0.method2732();
        this.field1181 = arg1;
    }

    @ObfuscatedName("bf.f(Ljava/awt/Component;)V")
    public void method1148(Component arg0) throws Exception {
        Statics.field1182.method1129(arg0, Statics.field1197, Statics.field1201, (byte) 1);
    }

    @ObfuscatedName("bf.u(I)V")
    public void method1159(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1182.method1123(this.field1181, arg0, -1069426097);
    }

    @ObfuscatedName("bf.x()I")
    public int method1150() {
        return Statics.field1182.method1128(this.field1181, (byte) -69);
    }

    @ObfuscatedName("bf.b()V")
    public void method1162() {
        Statics.field1182.method1125(this.field1181, this.field1192, (byte) 19);
    }

    @ObfuscatedName("bf.l()V")
    public void method1152() {
        Statics.field1182.method1124(this.field1181, (byte) 10);
    }

    @ObfuscatedName("bf.d()V")
    public void method1153() {
        Statics.field1182.method1122(this.field1181, 1851962248);
    }
}
