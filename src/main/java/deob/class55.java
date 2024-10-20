package deob;

import java.awt.Component;

@ObfuscatedName("bb")
public class class55 extends class57 {

    @ObfuscatedName("bb.f")
    public int field1164;

    public class55(class136 arg0, int arg1) {
        Statics.field1165 = arg0.method2656();
        this.field1164 = arg1;
    }

    @ObfuscatedName("bb.o(Ljava/awt/Component;)V")
    public void method1049(Component arg0) throws Exception {
        Statics.field1165.method1036(arg0, Statics.field1172, Statics.field2662, -673283792);
    }

    @ObfuscatedName("bb.f(I)V")
    public void method1047(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1165.method1029(this.field1164, arg0, -932698047);
    }

    @ObfuscatedName("bb.i()I")
    public int method1051() {
        return Statics.field1165.method1031(this.field1164, (byte) 1);
    }

    @ObfuscatedName("bb.h()V")
    public void method1052() {
        Statics.field1165.method1035(this.field1164, this.field1171, (byte) -11);
    }

    @ObfuscatedName("bb.q()V")
    public void method1050() {
        Statics.field1165.method1039(this.field1164, -133258909);
    }

    @ObfuscatedName("bb.u()V")
    public void method1063() {
        Statics.field1165.method1032(this.field1164, (byte) -80);
    }
}
