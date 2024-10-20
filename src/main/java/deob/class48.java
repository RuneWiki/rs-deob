package deob;

import java.awt.Component;

@ObfuscatedName("an")
public class class48 extends class50 {

    @ObfuscatedName("an.i")
    public int field1070;

    public class48(class123 arg0, int arg1) {
        Statics.field1071 = arg0.method2464();
        this.field1070 = arg1;
    }

    @ObfuscatedName("an.g(Ljava/awt/Component;)V")
    public void method916(Component arg0) throws Exception {
        Statics.field1071.method904(arg0, Statics.field72, Statics.field1089, 1103289821);
    }

    @ObfuscatedName("an.i(I)V")
    public void method915(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1071.method906(this.field1070, arg0, 508412467);
    }

    @ObfuscatedName("an.k()I")
    public int method934() {
        return Statics.field1071.method895(this.field1070, -2122240199);
    }

    @ObfuscatedName("an.e()V")
    public void method918() {
        Statics.field1071.method896(this.field1070, this.field1077, 247503737);
    }

    @ObfuscatedName("an.w()V")
    public void method919() {
        Statics.field1071.method901(this.field1070, -1703909764);
    }

    @ObfuscatedName("an.m()V")
    public void method920() {
        Statics.field1071.method897(this.field1070, (byte) -91);
    }
}
