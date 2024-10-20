package deob;

import java.awt.Component;

@ObfuscatedName("bx")
public class class55 extends class57 {

    @ObfuscatedName("bx.h")
    public int field1168;

    public class55(class136 arg0, int arg1) {
        Statics.field1167 = arg0.method2679();
        this.field1168 = arg1;
    }

    @ObfuscatedName("bx.c(Ljava/awt/Component;)V")
    public void method1071(Component arg0) throws Exception {
        Statics.field1167.method1065(arg0, Statics.field1191, Statics.field642, (byte) 57);
    }

    @ObfuscatedName("bx.h(I)V")
    public void method1080(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1167.method1050(this.field1168, arg0, -1461922492);
    }

    @ObfuscatedName("bx.k()I")
    public int method1073() {
        return Statics.field1167.method1064(this.field1168, (short) 25238);
    }

    @ObfuscatedName("bx.t()V")
    public void method1083() {
        Statics.field1167.method1049(this.field1168, this.field1175, -532342017);
    }

    @ObfuscatedName("bx.g()V")
    public void method1087() {
        Statics.field1167.method1053(this.field1168, 1159424463);
    }

    @ObfuscatedName("bx.o()V")
    public void method1074() {
        Statics.field1167.method1054(this.field1168, (byte) 3);
    }
}
