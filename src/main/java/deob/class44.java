package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class44 extends class52 {

    @ObfuscatedName("ax.p")
    public int field1022;

    public class44(class74 arg0, int arg1) {
        Statics.field1021 = arg0.method1465();
        this.field1022 = arg1;
    }

    @ObfuscatedName("ax.x(Ljava/awt/Component;)V")
    public void method904(Component arg0) throws Exception {
        Statics.field1021.method898(arg0, Statics.field1082, Statics.field1974, -2014385585);
    }

    @ObfuscatedName("ax.p(I)V")
    public void method908(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1021.method882(this.field1022, arg0, -812083034);
    }

    @ObfuscatedName("ax.k()I")
    public int method905() {
        return Statics.field1021.method883(this.field1022, (byte) -35);
    }

    @ObfuscatedName("ax.a()V")
    public void method906() {
        Statics.field1021.method884(this.field1022, this.field1087, 459575788);
    }

    @ObfuscatedName("ax.q()V")
    public void method907() {
        Statics.field1021.method885(this.field1022, 506748814);
    }

    @ObfuscatedName("ax.j()V")
    public void method911() {
        Statics.field1021.method886(this.field1022, (byte) 34);
    }
}
