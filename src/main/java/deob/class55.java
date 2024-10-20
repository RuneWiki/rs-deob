package deob;

import java.awt.Component;

@ObfuscatedName("bo")
public class class55 extends class57 {

    @ObfuscatedName("bo.x")
    public int field1177;

    public class55(class137 arg0, int arg1) {
        Statics.field1176 = arg0.method2746();
        this.field1177 = arg1;
    }

    @ObfuscatedName("bo.w(Ljava/awt/Component;)V")
    public void method1130(Component arg0) throws Exception {
        Statics.field1176.method1105(arg0, Statics.field2059, Statics.field1195, (byte) 87);
    }

    @ObfuscatedName("bo.x(I)V")
    public void method1114(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1176.method1099(this.field1177, arg0, (byte) 48);
    }

    @ObfuscatedName("bo.t()I")
    public int method1115() {
        return Statics.field1176.method1100(this.field1177, (byte) 94);
    }

    @ObfuscatedName("bo.p()V")
    public void method1128() {
        Statics.field1176.method1109(this.field1177, this.field1194, (byte) 25);
    }

    @ObfuscatedName("bo.e()V")
    public void method1117() {
        Statics.field1176.method1102(this.field1177, 453033457);
    }

    @ObfuscatedName("bo.y()V")
    public void method1119() {
        Statics.field1176.method1103(this.field1177, -1580650788);
    }
}
