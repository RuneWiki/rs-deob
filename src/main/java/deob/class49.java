package deob;

import java.awt.Component;

@ObfuscatedName("au")
public class class49 extends class51 {

    @ObfuscatedName("au.v")
    public int field1086;

    public class49(class125 arg0, int arg1) {
        Statics.field1085 = arg0.method2504();
        this.field1086 = arg1;
    }

    @ObfuscatedName("au.e(Ljava/awt/Component;)V")
    public void method925(Component arg0) throws Exception {
        Statics.field1085.method906(arg0, Statics.field1108, Statics.field1092, 1482599551);
    }

    @ObfuscatedName("au.v(I)V")
    public void method926(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1085.method912(this.field1086, arg0, -911164171);
    }

    @ObfuscatedName("au.k()I")
    public int method944() {
        return Statics.field1085.method908(this.field1086, -2020549294);
    }

    @ObfuscatedName("au.g()V")
    public void method927() {
        Statics.field1085.method919(this.field1086, this.field1097, 1703144546);
    }

    @ObfuscatedName("au.q()V")
    public void method929() {
        Statics.field1085.method909(this.field1086, (byte) 7);
    }

    @ObfuscatedName("au.l()V")
    public void method930() {
        Statics.field1085.method910(this.field1086, 2108626607);
    }
}
