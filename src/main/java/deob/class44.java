package deob;

import java.awt.Component;

@ObfuscatedName("ag")
public class class44 extends class52 {

    @ObfuscatedName("ag.b")
    public int field1038;

    public class44(class74 arg0, int arg1) {
        Statics.field1037 = arg0.method1512();
        this.field1038 = arg1;
    }

    @ObfuscatedName("ag.l(Ljava/awt/Component;)V")
    public void method940(Component arg0) throws Exception {
        Statics.field1037.method908(arg0, Statics.field745, Statics.field1731, -1880675774);
    }

    @ObfuscatedName("ag.b(I)V")
    public void method924(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1037.method904(this.field1038, arg0, 2035555742);
    }

    @ObfuscatedName("ag.o()I")
    public int method925() {
        return Statics.field1037.method905(this.field1038, 1877025126);
    }

    @ObfuscatedName("ag.w()V")
    public void method926() {
        Statics.field1037.method903(this.field1038, this.field1086, -1234979998);
    }

    @ObfuscatedName("ag.r()V")
    public void method922() {
        Statics.field1037.method907(this.field1038, (byte) -67);
    }

    @ObfuscatedName("ag.k()V")
    public void method930() {
        Statics.field1037.method911(this.field1038, 1120523662);
    }
}
