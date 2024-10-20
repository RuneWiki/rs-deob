package deob;

import java.awt.Component;

@ObfuscatedName("am")
public class class50 extends class52 {

    @ObfuscatedName("am.l")
    public int field1093;

    public class50(class128 arg0, int arg1) {
        Statics.field1094 = arg0.method2610();
        this.field1093 = arg1;
    }

    @ObfuscatedName("am.o(Ljava/awt/Component;)V")
    public void method1008(Component arg0) throws Exception {
        Statics.field1094.method994(arg0, Statics.field1685, Statics.field1101, (byte) -110);
    }

    @ObfuscatedName("am.l(I)V")
    public void method1009(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1094.method990(this.field1093, arg0, (byte) -107);
    }

    @ObfuscatedName("am.g()I")
    public int method1007() {
        return Statics.field1094.method989(this.field1093, (byte) 2);
    }

    @ObfuscatedName("am.u()V")
    public void method1011() {
        Statics.field1094.method1002(this.field1093, this.field1102, (byte) 99);
    }

    @ObfuscatedName("am.q()V")
    public void method1012() {
        Statics.field1094.method992(this.field1093, -566721078);
    }

    @ObfuscatedName("am.r()V")
    public void method1013() {
        Statics.field1094.method993(this.field1093, -2116265180);
    }
}
