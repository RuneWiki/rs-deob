package deob;

import java.awt.Component;

@ObfuscatedName("bw")
public class class55 extends class57 {

    @ObfuscatedName("bw.q")
    public int field1166;

    public class55(class136 arg0, int arg1) {
        Statics.field1167 = arg0.method2678();
        this.field1166 = arg1;
    }

    @ObfuscatedName("bw.z(Ljava/awt/Component;)V")
    public void method1072(Component arg0) throws Exception {
        Statics.field1167.method1061(arg0, Statics.field1194, Statics.field1173, 555862643);
    }

    @ObfuscatedName("bw.q(I)V")
    public void method1071(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1167.method1055(this.field1166, arg0, (byte) -54);
    }

    @ObfuscatedName("bw.k()I")
    public int method1091() {
        return Statics.field1167.method1056(this.field1166, 1651386613);
    }

    @ObfuscatedName("bw.f()V")
    public void method1087() {
        Statics.field1167.method1057(this.field1166, this.field1182, 1471388251);
    }

    @ObfuscatedName("bw.d()V")
    public void method1074() {
        Statics.field1167.method1058(this.field1166, 1259022999);
    }

    @ObfuscatedName("bw.l()V")
    public void method1076() {
        Statics.field1167.method1059(this.field1166, (short) 382);
    }
}
