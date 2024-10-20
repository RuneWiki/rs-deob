package deob;

import java.awt.Component;

@ObfuscatedName("bq")
public class class55 extends class57 {

    @ObfuscatedName("bq.j")
    public int field1174;

    public class55(class137 arg0, int arg1) {
        Statics.field1175 = arg0.method2710();
        this.field1174 = arg1;
    }

    @ObfuscatedName("bq.s(Ljava/awt/Component;)V")
    public void method1075(Component arg0) throws Exception {
        Statics.field1175.method1065(arg0, Statics.field1187, Statics.field1181, 1388610464);
    }

    @ObfuscatedName("bq.j(I)V")
    public void method1077(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1175.method1066(this.field1174, arg0, 1539237816);
    }

    @ObfuscatedName("bq.p()I")
    public int method1083() {
        return Statics.field1175.method1053(this.field1174, (byte) -58);
    }

    @ObfuscatedName("bq.x()V")
    public void method1082() {
        Statics.field1175.method1051(this.field1174, this.field1201, 1951552826);
    }

    @ObfuscatedName("bq.d()V")
    public void method1078() {
        Statics.field1175.method1054(this.field1174, 1757810835);
    }

    @ObfuscatedName("bq.u()V")
    public void method1079() {
        Statics.field1175.method1052(this.field1174, 2063515680);
    }
}
