package deob;

import java.awt.Component;

@ObfuscatedName("ao")
public class class44 extends class52 {

    @ObfuscatedName("ao.f")
    public int field1051;

    public class44(class74 arg0, int arg1) {
        Statics.field1050 = arg0.method1501();
        this.field1051 = arg1;
    }

    @ObfuscatedName("ao.j(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
        Statics.field1050.method908(arg0, Statics.field277, Statics.field2015, 1803523460);
    }

    @ObfuscatedName("ao.f(I)V")
    public void method923(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1050.method911(this.field1051, arg0, -633226131);
    }

    @ObfuscatedName("ao.o()I")
    public int method934() {
        return Statics.field1050.method901(this.field1051, (byte) 17);
    }

    @ObfuscatedName("ao.h()V")
    public void method936() {
        Statics.field1050.method920(this.field1051, this.field1096, 1986043613);
    }

    @ObfuscatedName("ao.u()V")
    public void method924() {
        Statics.field1050.method904(this.field1051, -1446791110);
    }

    @ObfuscatedName("ao.a()V")
    public void method927() {
        Statics.field1050.method902(this.field1051, -425402179);
    }
}
