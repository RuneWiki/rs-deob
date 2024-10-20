package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class44 extends class52 {

    @ObfuscatedName("aa.q")
    public int field1063;

    public class44(class74 arg0, int arg1) {
        Statics.field1064 = arg0.method1431();
        this.field1063 = arg1;
    }

    @ObfuscatedName("aa.c(Ljava/awt/Component;)V")
    public void method891(Component arg0) throws Exception {
        Statics.field1064.method876(arg0, Statics.field1118, Statics.field1110, 1918841590);
    }

    @ObfuscatedName("aa.q(I)V")
    public void method897(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1064.method871(this.field1063, arg0, (byte) 77);
    }

    @ObfuscatedName("aa.y()I")
    public int method893() {
        return Statics.field1064.method872(this.field1063, -358825409);
    }

    @ObfuscatedName("aa.v()V")
    public void method894() {
        Statics.field1064.method887(this.field1063, this.field1112, -2014562363);
    }

    @ObfuscatedName("aa.g()V")
    public void method899() {
        Statics.field1064.method874(this.field1063, 2002773049);
    }

    @ObfuscatedName("aa.x()V")
    public void method896() {
        Statics.field1064.method886(this.field1063, 2098580380);
    }
}
