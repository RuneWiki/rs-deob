package deob;

import java.awt.Component;

@ObfuscatedName("bt")
public class class55 extends class57 {

    @ObfuscatedName("bt.q")
    public int field1165;

    public class55(class136 arg0, int arg1) {
        Statics.field1164 = arg0.method2710();
        this.field1165 = arg1;
    }

    @ObfuscatedName("bt.n(Ljava/awt/Component;)V")
    public void method1110(Component arg0) throws Exception {
        Statics.field1164.method1086(arg0, Statics.field2648, Statics.field2070, -1318627552);
    }

    @ObfuscatedName("bt.q(I)V")
    public void method1111(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1164.method1088(this.field1165, arg0, 284474432);
    }

    @ObfuscatedName("bt.c()I")
    public int method1112() {
        return Statics.field1164.method1091(this.field1165, (byte) -115);
    }

    @ObfuscatedName("bt.l()V")
    public void method1113() {
        Statics.field1164.method1085(this.field1165, this.field1185, 2056081741);
    }

    @ObfuscatedName("bt.r()V")
    public void method1114() {
        Statics.field1164.method1089(this.field1165, (byte) -3);
    }

    @ObfuscatedName("bt.u()V")
    public void method1124() {
        Statics.field1164.method1090(this.field1165, -930996917);
    }
}
