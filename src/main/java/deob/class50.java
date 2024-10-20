package deob;

import java.awt.Component;

@ObfuscatedName("ac")
public class class50 extends class52 {

    @ObfuscatedName("ac.k")
    public int field1113;

    public class50(class128 arg0, int arg1) {
        Statics.field1112 = arg0.method2551();
        this.field1113 = arg1;
    }

    @ObfuscatedName("ac.p(Ljava/awt/Component;)V")
    public void method981(Component arg0) throws Exception {
        Statics.field1112.method948(arg0, Statics.field1494, Statics.field1128, 2038641044);
    }

    @ObfuscatedName("ac.k(I)V")
    public void method965(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1112.method942(this.field1113, arg0, -1416187951);
    }

    @ObfuscatedName("ac.e()I")
    public int method966() {
        return Statics.field1112.method943(this.field1113, (byte) 3);
    }

    @ObfuscatedName("ac.f()V")
    public void method967() {
        Statics.field1112.method958(this.field1113, this.field1120, -465492512);
    }

    @ObfuscatedName("ac.w()V")
    public void method968() {
        Statics.field1112.method953(this.field1113, 1718609112);
    }

    @ObfuscatedName("ac.t()V")
    public void method969() {
        Statics.field1112.method946(this.field1113, 1075391698);
    }
}
