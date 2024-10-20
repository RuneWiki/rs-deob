package deob;

import java.awt.Component;

@ObfuscatedName("ao")
public class class45 extends class53 {

    @ObfuscatedName("ao.b")
    public int field1056;

    public class45(class75 arg0, int arg1) {
        Statics.field1055 = arg0.method1494();
        this.field1056 = arg1;
    }

    @ObfuscatedName("ao.i(Ljava/awt/Component;)V")
    public void method945(Component arg0) throws Exception {
        Statics.field1055.method918(arg0, Statics.field2014, Statics.field1104, -1071213426);
    }

    @ObfuscatedName("ao.b(I)V")
    public void method936(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1055.method913(this.field1056, arg0, (byte) -122);
    }

    @ObfuscatedName("ao.r()I")
    public int method937() {
        return Statics.field1055.method914(this.field1056, 601205889);
    }

    @ObfuscatedName("ao.l()V")
    public void method935() {
        Statics.field1055.method915(this.field1056, this.field1103, -2018392918);
    }

    @ObfuscatedName("ao.s()V")
    public void method939() {
        Statics.field1055.method916(this.field1056, -1939621612);
    }

    @ObfuscatedName("ao.d()V")
    public void method940() {
        Statics.field1055.method917(this.field1056, (byte) 13);
    }
}
