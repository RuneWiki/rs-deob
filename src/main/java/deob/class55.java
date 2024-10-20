package deob;

import java.awt.Component;

@ObfuscatedName("bn")
public class class55 extends class57 {

    @ObfuscatedName("bn.f")
    public int field1164;

    public class55(class136 arg0, int arg1) {
        Statics.field1165 = arg0.method2721();
        this.field1164 = arg1;
    }

    @ObfuscatedName("bn.v(Ljava/awt/Component;)V")
    public void method1088(Component arg0) throws Exception {
        Statics.field1165.method1086(arg0, Statics.field1170, Statics.field1171, (byte) 81);
    }

    @ObfuscatedName("bn.f(I)V")
    public void method1108(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1165.method1083(this.field1164, arg0, -2136548389);
    }

    @ObfuscatedName("bn.i()I")
    public int method1100() {
        return Statics.field1165.method1070(this.field1164, (byte) 1);
    }

    @ObfuscatedName("bn.d()V")
    public void method1091() {
        Statics.field1165.method1071(this.field1164, this.field1185, 661700913);
    }

    @ObfuscatedName("bn.o()V")
    public void method1092() {
        Statics.field1165.method1075(this.field1164, (byte) 20);
    }

    @ObfuscatedName("bn.c()V")
    public void method1096() {
        Statics.field1165.method1068(this.field1164, -770200277);
    }
}
