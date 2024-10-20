package deob;

import java.awt.Component;

@ObfuscatedName("bp")
public class class55 extends class57 {

    @ObfuscatedName("bp.v")
    public int field1169;

    public class55(class136 arg0, int arg1) {
        Statics.field1168 = arg0.method2676();
        this.field1169 = arg1;
    }

    @ObfuscatedName("bp.i(Ljava/awt/Component;)V")
    public void method1066(Component arg0) throws Exception {
        Statics.field1168.method1048(arg0, Statics.field1192, Statics.field1175, 2022017618);
    }

    @ObfuscatedName("bp.v(I)V")
    public void method1059(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1168.method1037(this.field1169, arg0, (byte) 83);
    }

    @ObfuscatedName("bp.f()I")
    public int method1060() {
        return Statics.field1168.method1038(this.field1169, 1766200246);
    }

    @ObfuscatedName("bp.h()V")
    public void method1070() {
        Statics.field1168.method1039(this.field1169, this.field1177, -1673159559);
    }

    @ObfuscatedName("bp.a()V")
    public void method1062() {
        Statics.field1168.method1040(this.field1169, 459365718);
    }

    @ObfuscatedName("bp.s()V")
    public void method1063() {
        Statics.field1168.method1052(this.field1169, -2124742065);
    }
}
