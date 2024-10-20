package deob;

import java.awt.Component;

@ObfuscatedName("au")
public class class43 extends class51 {

    @ObfuscatedName("au.k")
    public int field1035;

    public class43(class73 arg0, int arg1) {
        Statics.field1036 = arg0.method1486();
        this.field1035 = arg1;
    }

    @ObfuscatedName("au.u(Ljava/awt/Component;)V")
    public void method921(Component arg0) throws Exception {
        Statics.field1036.method896(arg0, Statics.field1083, Statics.field1091, -616324161);
    }

    @ObfuscatedName("au.k(I)V")
    public void method918(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1036.method907(this.field1035, arg0, 2088847726);
    }

    @ObfuscatedName("au.x()I")
    public int method919() {
        return Statics.field1036.method898(this.field1035, (byte) 19);
    }

    @ObfuscatedName("au.m()V")
    public void method920() {
        Statics.field1036.method899(this.field1035, this.field1085, -514224085);
    }

    @ObfuscatedName("au.n()V")
    public void method939() {
        Statics.field1036.method905(this.field1035, (byte) -62);
    }

    @ObfuscatedName("au.q()V")
    public void method930() {
        Statics.field1036.method901(this.field1035, 406857768);
    }
}
