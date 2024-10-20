package deob;

import java.awt.Component;

@ObfuscatedName("bq")
public class class55 extends class57 {

    @ObfuscatedName("bq.l")
    public int field1129;

    public class55(class136 arg0, int arg1) {
        Statics.field1128 = arg0.method2761();
        this.field1129 = arg1;
    }

    @ObfuscatedName("bq.m(Ljava/awt/Component;)V")
    public void method1129(Component arg0) throws Exception {
        Statics.field1128.method1125(arg0, Statics.field1139, Statics.field1135, 176439050);
    }

    @ObfuscatedName("bq.l(I)V")
    public void method1147(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1128.method1104(this.field1129, arg0, -2048052225);
    }

    @ObfuscatedName("bq.y()I")
    public int method1131() {
        return Statics.field1128.method1105(this.field1129, (byte) 90);
    }

    @ObfuscatedName("bq.u()V")
    public void method1146() {
        Statics.field1128.method1106(this.field1129, this.field1136, (byte) 4);
    }

    @ObfuscatedName("bq.k()V")
    public void method1133() {
        Statics.field1128.method1103(this.field1129, 1602920578);
    }

    @ObfuscatedName("bq.j()V")
    public void method1130() {
        Statics.field1128.method1115(this.field1129, -543651339);
    }
}
