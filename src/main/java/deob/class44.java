package deob;

import java.awt.Component;

@ObfuscatedName("ao")
public class class44 extends class52 {

    @ObfuscatedName("ao.v")
    public int field1050;

    public class44(class74 arg0, int arg1) {
        Statics.field1049 = arg0.method1512();
        this.field1050 = arg1;
    }

    @ObfuscatedName("ao.i(Ljava/awt/Component;)V")
    public void method957(Component arg0) throws Exception {
        Statics.field1049.method940(arg0, Statics.field87, Statics.field1112, (byte) 16);
    }

    @ObfuscatedName("ao.v(I)V")
    public void method969(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1049.method934(this.field1050, arg0, (byte) -128);
    }

    @ObfuscatedName("ao.m()I")
    public int method959() {
        return Statics.field1049.method950(this.field1050, (byte) 27);
    }

    @ObfuscatedName("ao.j()V")
    public void method968() {
        Statics.field1049.method936(this.field1050, this.field1100, 1090417378);
    }

    @ObfuscatedName("ao.o()V")
    public void method960() {
        Statics.field1049.method937(this.field1050, 1542728478);
    }

    @ObfuscatedName("ao.l()V")
    public void method961() {
        Statics.field1049.method938(this.field1050, 359535529);
    }
}
