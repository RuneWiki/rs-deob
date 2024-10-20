package deob;

import java.awt.Component;

@ObfuscatedName("bs")
public class class55 extends class57 {

    @ObfuscatedName("bs.g")
    public int field1141;

    public class55(class137 arg0, int arg1) {
        Statics.field1140 = arg0.method2744();
        this.field1141 = arg1;
    }

    @ObfuscatedName("bs.b(Ljava/awt/Component;)V")
    public void method1083(Component arg0) throws Exception {
        Statics.field1140.method1079(arg0, Statics.field1154, Statics.field582, (byte) 26);
    }

    @ObfuscatedName("bs.g(I)V")
    public void method1103(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1140.method1064(this.field1141, arg0, -819287642);
    }

    @ObfuscatedName("bs.j()I")
    public int method1105() {
        return Statics.field1140.method1065(this.field1141, 2097522949);
    }

    @ObfuscatedName("bs.d()V")
    public void method1086() {
        Statics.field1140.method1077(this.field1141, this.field1149, (byte) 81);
    }

    @ObfuscatedName("bs.x()V")
    public void method1087() {
        Statics.field1140.method1073(this.field1141, -312531127);
    }

    @ObfuscatedName("bs.y()V")
    public void method1088() {
        Statics.field1140.method1068(this.field1141, (short) 10896);
    }
}
