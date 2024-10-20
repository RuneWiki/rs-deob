package deob;

import java.awt.Component;

@ObfuscatedName("bt")
public class class55 extends class57 {

    @ObfuscatedName("bt.v")
    public int field1175;

    public class55(class136 arg0, int arg1) {
        Statics.field1176 = arg0.method2717();
        this.field1175 = arg1;
    }

    @ObfuscatedName("bt.i(Ljava/awt/Component;)V")
    public void method1118(Component arg0) throws Exception {
        Statics.field1176.method1110(arg0, Statics.field1190, Statics.field1182, -683462913);
    }

    @ObfuscatedName("bt.v(I)V")
    public void method1114(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1176.method1099(this.field1175, arg0, (byte) -47);
    }

    @ObfuscatedName("bt.r()I")
    public int method1126() {
        return Statics.field1176.method1093(this.field1175, 2101831879);
    }

    @ObfuscatedName("bt.n()V")
    public void method1117() {
        Statics.field1176.method1104(this.field1175, this.field1184, (byte) 45);
    }

    @ObfuscatedName("bt.x()V")
    public void method1130() {
        Statics.field1176.method1095(this.field1175, -864684635);
    }

    @ObfuscatedName("bt.q()V")
    public void method1119() {
        Statics.field1176.method1091(this.field1175, 1473598626);
    }
}
