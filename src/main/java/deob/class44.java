package deob;

import java.awt.Component;

@ObfuscatedName("an")
public class class44 extends class52 {

    @ObfuscatedName("an.g")
    public int field1045;

    public class44(class74 arg0, int arg1) {
        Statics.field1044 = arg0.method1463();
        this.field1045 = arg1;
    }

    @ObfuscatedName("an.d(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
        Statics.field1044.method889(arg0, Statics.field2328, Statics.field1178, -1434646897);
    }

    @ObfuscatedName("an.g(I)V")
    public void method906(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1044.method885(this.field1045, arg0, -1779957796);
    }

    @ObfuscatedName("an.a()I")
    public int method907() {
        return Statics.field1044.method886(this.field1045, 484925364);
    }

    @ObfuscatedName("an.t()V")
    public void method908() {
        Statics.field1044.method887(this.field1045, this.field1091, -544426185);
    }

    @ObfuscatedName("an.f()V")
    public void method920() {
        Statics.field1044.method893(this.field1045, -37391022);
    }

    @ObfuscatedName("an.c()V")
    public void method904() {
        Statics.field1044.method892(this.field1045, (byte) 0);
    }
}
