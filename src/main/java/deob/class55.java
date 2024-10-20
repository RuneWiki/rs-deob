package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class55 extends class57 {

    @ObfuscatedName("bf.d")
    public int field1169;

    public class55(class136 arg0, int arg1) {
        Statics.field1168 = arg0.method2684();
        this.field1169 = arg1;
    }

    @ObfuscatedName("bf.y(Ljava/awt/Component;)V")
    public void method1101(Component arg0) throws Exception {
        Statics.field1168.method1072(arg0, Statics.field2644, Statics.field1178, -1881811511);
    }

    @ObfuscatedName("bf.d(I)V")
    public void method1106(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1168.method1079(this.field1169, arg0, (byte) 1);
    }

    @ObfuscatedName("bf.g()I")
    public int method1110() {
        return Statics.field1168.method1069(this.field1169, -1998531535);
    }

    @ObfuscatedName("bf.w()V")
    public void method1090() {
        Statics.field1168.method1070(this.field1169, this.field1196, -1592843714);
    }

    @ObfuscatedName("bf.e()V")
    public void method1093() {
        Statics.field1168.method1071(this.field1169, (byte) 4);
    }

    @ObfuscatedName("bf.c()V")
    public void method1107() {
        Statics.field1168.method1081(this.field1169, -2058127336);
    }
}
