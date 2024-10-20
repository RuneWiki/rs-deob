package deob;

import java.awt.Component;

@ObfuscatedName("ae")
public class class43 extends class51 {

    @ObfuscatedName("ae.y")
    public int field1023;

    public class43(class73 arg0, int arg1) {
        Statics.field1022 = arg0.method1458();
        this.field1023 = arg1;
    }

    @ObfuscatedName("ae.j(Ljava/awt/Component;)V")
    public void method911(Component arg0) throws Exception {
        Statics.field1022.method891(arg0, Statics.field1091, Statics.field2033, (byte) 0);
    }

    @ObfuscatedName("ae.y(I)V")
    public void method903(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1022.method890(this.field1023, arg0, -1138185563);
    }

    @ObfuscatedName("ae.x()I")
    public int method905() {
        return Statics.field1022.method899(this.field1023, -1445603197);
    }

    @ObfuscatedName("ae.z()V")
    public void method906() {
        Statics.field1022.method898(this.field1023, this.field1072, 38262250);
    }

    @ObfuscatedName("ae.c()V")
    public void method907() {
        Statics.field1022.method892(this.field1023, -557977143);
    }

    @ObfuscatedName("ae.e()V")
    public void method908() {
        Statics.field1022.method894(this.field1023, (byte) 27);
    }
}
