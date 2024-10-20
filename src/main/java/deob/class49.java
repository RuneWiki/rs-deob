package deob;

import java.awt.Component;

@ObfuscatedName("as")
public class class49 extends class51 {

    @ObfuscatedName("as.y")
    public int field1063;

    public class49(class125 arg0, int arg1) {
        Statics.field1064 = arg0.method2500();
        this.field1063 = arg1;
    }

    @ObfuscatedName("as.l(Ljava/awt/Component;)V")
    public void method925(Component arg0) throws Exception {
        Statics.field1064.method910(arg0, Statics.field1086, Statics.field2900, (short) 29100);
    }

    @ObfuscatedName("as.y(I)V")
    public void method944(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1064.method904(this.field1063, arg0, 511459105);
    }

    @ObfuscatedName("as.g()I")
    public int method922() {
        return Statics.field1064.method905(this.field1063, (byte) 80);
    }

    @ObfuscatedName("as.j()V")
    public void method929() {
        Statics.field1064.method906(this.field1063, this.field1072, 1501197775);
    }

    @ObfuscatedName("as.w()V")
    public void method926() {
        Statics.field1064.method907(this.field1063, 1581547418);
    }

    @ObfuscatedName("as.c()V")
    public void method928() {
        Statics.field1064.method908(this.field1063, -1774378816);
    }
}
