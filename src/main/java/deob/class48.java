package deob;

import java.awt.Component;

@ObfuscatedName("ar")
public class class48 extends class50 {

    @ObfuscatedName("ar.o")
    public int field1067;

    public class48(class123 arg0, int arg1) {
        Statics.field1066 = arg0.method2455();
        this.field1067 = arg1;
    }

    @ObfuscatedName("ar.t(Ljava/awt/Component;)V")
    public void method913(Component arg0) throws Exception {
        Statics.field1066.method899(arg0, Statics.field1088, Statics.field1073, 983563457);
    }

    @ObfuscatedName("ar.o(I)V")
    public void method915(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1066.method892(this.field1067, arg0, 2087170592);
    }

    @ObfuscatedName("ar.i()I")
    public int method920() {
        return Statics.field1066.method893(this.field1067, -1345776438);
    }

    @ObfuscatedName("ar.p()V")
    public void method916() {
        Statics.field1066.method894(this.field1067, this.field1076, 1561277377);
    }

    @ObfuscatedName("ar.c()V")
    public void method917() {
        Statics.field1066.method895(this.field1067, (byte) -19);
    }

    @ObfuscatedName("ar.y()V")
    public void method918() {
        Statics.field1066.method896(this.field1067, (byte) 1);
    }
}
