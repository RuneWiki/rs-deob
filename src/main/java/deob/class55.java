package deob;

import java.awt.Component;

@ObfuscatedName("bd")
public class class55 extends class57 {

    @ObfuscatedName("bd.h")
    public int field1155;

    public class55(class137 arg0, int arg1) {
        Statics.field1154 = arg0.method2709();
        this.field1155 = arg1;
    }

    @ObfuscatedName("bd.j(Ljava/awt/Component;)V")
    public void method1117(Component arg0) throws Exception {
        Statics.field1154.method1087(arg0, Statics.field1182, Statics.field1945, -1089485532);
    }

    @ObfuscatedName("bd.h(I)V")
    public void method1097(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1154.method1070(this.field1155, arg0, 1623817969);
    }

    @ObfuscatedName("bd.m()I")
    public int method1098() {
        return Statics.field1154.method1071(this.field1155, -1202624208);
    }

    @ObfuscatedName("bd.z()V")
    public void method1099() {
        Statics.field1154.method1072(this.field1155, this.field1162, -1256917202);
    }

    @ObfuscatedName("bd.x()V")
    public void method1100() {
        Statics.field1154.method1084(this.field1155, 179917166);
    }

    @ObfuscatedName("bd.e()V")
    public void method1101() {
        Statics.field1154.method1074(this.field1155, (byte) 80);
    }
}
