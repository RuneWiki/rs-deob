package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class44 extends class52 {

    @ObfuscatedName("ay.r")
    public int field1041;

    public class44(class74 arg0, int arg1) {
        Statics.field1040 = arg0.method1482();
        this.field1041 = arg1;
    }

    @ObfuscatedName("ay.j(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
        Statics.field1040.method901(arg0, Statics.field1205, Statics.field1086, -1892080053);
    }

    @ObfuscatedName("ay.r(I)V")
    public void method918(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1040.method892(this.field1041, arg0, 1120674637);
    }

    @ObfuscatedName("ay.v()I")
    public int method919() {
        return Statics.field1040.method893(this.field1041, 1035685595);
    }

    @ObfuscatedName("ay.p()V")
    public void method920() {
        Statics.field1040.method894(this.field1041, this.field1089, (byte) 107);
    }

    @ObfuscatedName("ay.e()V")
    public void method938() {
        Statics.field1040.method911(this.field1041, (byte) 40);
    }

    @ObfuscatedName("ay.d()V")
    public void method916() {
        Statics.field1040.method895(this.field1041, -2048495210);
    }
}
