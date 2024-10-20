package deob;

import java.awt.Component;

@ObfuscatedName("al")
public class class44 extends class52 {

    @ObfuscatedName("al.e")
    public int field1037;

    public class44(class74 arg0, int arg1) {
        Statics.field1036 = arg0.method1520();
        this.field1037 = arg1;
    }

    @ObfuscatedName("al.p(Ljava/awt/Component;)V")
    public void method937(Component arg0) throws Exception {
        Statics.field1036.method926(arg0, Statics.field2457, Statics.field1089, 1490080136);
    }

    @ObfuscatedName("al.e(I)V")
    public void method939(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1036.method918(this.field1037, arg0, 351229322);
    }

    @ObfuscatedName("al.a()I")
    public int method940() {
        return Statics.field1036.method919(this.field1037, -1763226228);
    }

    @ObfuscatedName("al.h()V")
    public void method941() {
        Statics.field1036.method920(this.field1037, this.field1084, -1089762753);
    }

    @ObfuscatedName("al.y()V")
    public void method959() {
        Statics.field1036.method921(this.field1037, -1922067717);
    }

    @ObfuscatedName("al.j()V")
    public void method953() {
        Statics.field1036.method923(this.field1037, (byte) 12);
    }
}
