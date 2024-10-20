package deob;

import java.awt.Component;

@ObfuscatedName("br")
public class class55 extends class57 {

    @ObfuscatedName("br.i")
    public int field1178;

    public class55(class137 arg0, int arg1) {
        Statics.field1179 = arg0.method2692();
        this.field1178 = arg1;
    }

    @ObfuscatedName("br.t(Ljava/awt/Component;)V")
    public void method1042(Component arg0) throws Exception {
        Statics.field1179.method1031(arg0, Statics.field1195, Statics.field576, -1136173707);
    }

    @ObfuscatedName("br.i(I)V")
    public void method1058(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1179.method1027(this.field1178, arg0, (byte) 83);
    }

    @ObfuscatedName("br.g()I")
    public int method1044() {
        return Statics.field1179.method1028(this.field1178, 1137861106);
    }

    @ObfuscatedName("br.h()V")
    public void method1045() {
        Statics.field1179.method1038(this.field1178, this.field1198, (byte) 0);
    }

    @ObfuscatedName("br.z()V")
    public void method1046() {
        Statics.field1179.method1030(this.field1178, 632341725);
    }

    @ObfuscatedName("br.r()V")
    public void method1041() {
        Statics.field1179.method1037(this.field1178, (byte) 1);
    }
}
