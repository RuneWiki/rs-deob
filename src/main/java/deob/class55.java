package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class55 extends class57 {

    @ObfuscatedName("bf.e")
    public int field1154;

    public class55(class136 arg0, int arg1) {
        Statics.field1153 = arg0.method2726();
        this.field1154 = arg1;
    }

    @ObfuscatedName("bf.l(Ljava/awt/Component;)V")
    public void method1113(Component arg0) throws Exception {
        Statics.field1153.method1099(arg0, Statics.field1167, Statics.field1946, -1187817471);
    }

    @ObfuscatedName("bf.e(I)V")
    public void method1120(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1153.method1090(this.field1154, arg0, (byte) 16);
    }

    @ObfuscatedName("bf.q()I")
    public int method1115() {
        return Statics.field1153.method1091(this.field1154, 1374648031);
    }

    @ObfuscatedName("bf.o()V")
    public void method1116() {
        Statics.field1153.method1092(this.field1154, this.field1163, 218489690);
    }

    @ObfuscatedName("bf.g()V")
    public void method1117() {
        Statics.field1153.method1093(this.field1154, -1131091611);
    }

    @ObfuscatedName("bf.m()V")
    public void method1128() {
        Statics.field1153.method1094(this.field1154, (byte) 86);
    }
}
