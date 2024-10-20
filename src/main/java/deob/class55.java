package deob;

import java.awt.Component;

@ObfuscatedName("bl")
public class class55 extends class57 {

    @ObfuscatedName("bl.m")
    public int field1179;

    public class55(class136 arg0, int arg1) {
        Statics.field1178 = arg0.method2692();
        this.field1179 = arg1;
    }

    @ObfuscatedName("bl.h(Ljava/awt/Component;)V")
    public void method1071(Component arg0) throws Exception {
        Statics.field1178.method1056(arg0, Statics.field1199, Statics.field1185, 1548751075);
    }

    @ObfuscatedName("bl.m(I)V")
    public void method1072(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1178.method1049(this.field1179, arg0, (byte) -87);
    }

    @ObfuscatedName("bl.i()I")
    public int method1073() {
        return Statics.field1178.method1059(this.field1179, -933119177);
    }

    @ObfuscatedName("bl.q()V")
    public void method1074() {
        Statics.field1178.method1052(this.field1179, this.field1189, 1278576071);
    }

    @ObfuscatedName("bl.p()V")
    public void method1084() {
        Statics.field1178.method1053(this.field1179, -1319645211);
    }

    @ObfuscatedName("bl.c()V")
    public void method1076() {
        Statics.field1178.method1054(this.field1179, (byte) 20);
    }
}
