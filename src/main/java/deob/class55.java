package deob;

import java.awt.Component;

@ObfuscatedName("bo")
public class class55 extends class57 {

    @ObfuscatedName("bo.b")
    public int field1166;

    public class55(class136 arg0, int arg1) {
        Statics.field1165 = arg0.method2745();
        this.field1166 = arg1;
    }

    @ObfuscatedName("bo.g(Ljava/awt/Component;)V")
    public void method1122(Component arg0) throws Exception {
        Statics.field1165.method1111(arg0, Statics.field1189, Statics.field1185, 2020885705);
    }

    @ObfuscatedName("bo.b(I)V")
    public void method1123(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1165.method1104(this.field1166, arg0, (byte) -102);
    }

    @ObfuscatedName("bo.w()I")
    public int method1124() {
        return Statics.field1165.method1119(this.field1166, (byte) -116);
    }

    @ObfuscatedName("bo.d()V")
    public void method1121() {
        Statics.field1165.method1106(this.field1166, this.field1171, -1709213472);
    }

    @ObfuscatedName("bo.z()V")
    public void method1135() {
        Statics.field1165.method1107(this.field1166, 1996097572);
    }

    @ObfuscatedName("bo.l()V")
    public void method1125() {
        Statics.field1165.method1115(this.field1166, 106110132);
    }
}
