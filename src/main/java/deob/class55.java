package deob;

import java.awt.Component;

@ObfuscatedName("bt")
public class class55 extends class57 {

    @ObfuscatedName("bt.r")
    public int field1167;

    public class55(class136 arg0, int arg1) {
        Statics.field1168 = arg0.method2712();
        this.field1167 = arg1;
    }

    @ObfuscatedName("bt.a(Ljava/awt/Component;)V")
    public void method1103(Component arg0) throws Exception {
        Statics.field1168.method1092(arg0, Statics.field1186, Statics.field1174, -818573189);
    }

    @ObfuscatedName("bt.r(I)V")
    public void method1105(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1168.method1084(this.field1167, arg0, 2107501968);
    }

    @ObfuscatedName("bt.f()I")
    public int method1106() {
        return Statics.field1168.method1095(this.field1167, (byte) 70);
    }

    @ObfuscatedName("bt.s()V")
    public void method1107() {
        Statics.field1168.method1086(this.field1167, this.field1183, 267842361);
    }

    @ObfuscatedName("bt.y()V")
    public void method1108() {
        Statics.field1168.method1087(this.field1167, 143654874);
    }

    @ObfuscatedName("bt.e()V")
    public void method1104() {
        Statics.field1168.method1085(this.field1167, 99012145);
    }
}
