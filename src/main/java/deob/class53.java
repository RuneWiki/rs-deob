package deob;

import java.awt.Component;

@ObfuscatedName("bz")
public class class53 extends class55 {

    @ObfuscatedName("bz.y")
    public int field1139;

    public class53(class131 arg0, int arg1) {
        Statics.field1138 = arg0.method2689();
        this.field1139 = arg1;
    }

    @ObfuscatedName("bz.j(Ljava/awt/Component;)V")
    public void method1142(Component arg0) throws Exception {
        Statics.field1138.method1112(arg0, Statics.field1163, Statics.field1145, 1692984064);
    }

    @ObfuscatedName("bz.y(I)V")
    public void method1131(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1138.method1104(this.field1139, arg0, 311233271);
    }

    @ObfuscatedName("bz.z()I")
    public int method1132() {
        return Statics.field1138.method1105(this.field1139, (byte) 122);
    }

    @ObfuscatedName("bz.l()V")
    public void method1133() {
        Statics.field1138.method1106(this.field1139, this.field1159, (byte) 8);
    }

    @ObfuscatedName("bz.w()V")
    public void method1129() {
        Statics.field1138.method1107(this.field1139, -1670229216);
    }

    @ObfuscatedName("bz.d()V")
    public void method1141() {
        Statics.field1138.method1108(this.field1139, 1833274158);
    }
}
