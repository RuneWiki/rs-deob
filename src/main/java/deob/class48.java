package deob;

import java.awt.Component;

@ObfuscatedName("ac")
public class class48 extends class50 {

    @ObfuscatedName("ac.x")
    public int field1065;

    public class48(class123 arg0, int arg1) {
        Statics.field1064 = arg0.method2461();
        this.field1065 = arg1;
    }

    @ObfuscatedName("ac.n(Ljava/awt/Component;)V")
    public void method947(Component arg0) throws Exception {
        Statics.field1064.method919(arg0, Statics.field1082, Statics.field1071, (byte) -27);
    }

    @ObfuscatedName("ac.x(I)V")
    public void method934(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1064.method914(this.field1065, arg0, 1242425256);
    }

    @ObfuscatedName("ac.k()I")
    public int method935() {
        return Statics.field1064.method913(this.field1065, -1961576021);
    }

    @ObfuscatedName("ac.i()V")
    public void method936() {
        Statics.field1064.method924(this.field1065, this.field1091, 1953025006);
    }

    @ObfuscatedName("ac.d()V")
    public void method937() {
        Statics.field1064.method915(this.field1065, 1238792850);
    }

    @ObfuscatedName("ac.q()V")
    public void method949() {
        Statics.field1064.method911(this.field1065, (byte) 92);
    }
}
