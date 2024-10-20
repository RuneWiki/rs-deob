package deob;

import java.awt.Component;

@ObfuscatedName("bo")
public class class55 extends class57 {

    @ObfuscatedName("bo.w")
    public int field1143;

    public class55(class137 arg0, int arg1) {
        Statics.field1144 = arg0.method2705();
        this.field1143 = arg1;
    }

    @ObfuscatedName("bo.e(Ljava/awt/Component;)V")
    public void method1081(Component arg0) throws Exception {
        Statics.field1144.method1079(arg0, Statics.field1154, Statics.field1161, 1860243473);
    }

    @ObfuscatedName("bo.w(I)V")
    public void method1094(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1144.method1063(this.field1143, arg0, (byte) -26);
    }

    @ObfuscatedName("bo.f()I")
    public int method1083() {
        return Statics.field1144.method1064(this.field1143, -240789543);
    }

    @ObfuscatedName("bo.s()V")
    public void method1086() {
        Statics.field1144.method1067(this.field1143, this.field1152, (byte) 64);
    }

    @ObfuscatedName("bo.p()V")
    public void method1084() {
        Statics.field1144.method1074(this.field1143, 1691796796);
    }

    @ObfuscatedName("bo.h()V")
    public void method1085() {
        Statics.field1144.method1062(this.field1143, (byte) 0);
    }
}
