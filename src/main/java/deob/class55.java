package deob;

import java.awt.Component;

@ObfuscatedName("bg")
public class class55 extends class57 {

    @ObfuscatedName("bg.w")
    public int field1178;

    public class55(class137 arg0, int arg1) {
        Statics.field1179 = arg0.method2834();
        this.field1178 = arg1;
    }

    @ObfuscatedName("bg.a(Ljava/awt/Component;)V")
    public void method1194(Component arg0) throws Exception {
        Statics.field1179.method1190(arg0, Statics.field974, Statics.field1634, (short) -2768);
    }

    @ObfuscatedName("bg.w(I)V")
    public void method1202(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1179.method1176(this.field1178, arg0, (byte) -93);
    }

    @ObfuscatedName("bg.d()I")
    public int method1198() {
        return Statics.field1179.method1175(this.field1178, 1703020384);
    }

    @ObfuscatedName("bg.c()V")
    public void method1197() {
        Statics.field1179.method1178(this.field1178, this.field1189, -2052258961);
    }

    @ObfuscatedName("bg.y()V")
    public void method1201() {
        Statics.field1179.method1177(this.field1178, -1555225132);
    }

    @ObfuscatedName("bg.k()V")
    public void method1195() {
        Statics.field1179.method1180(this.field1178, (byte) 38);
    }
}
