package deob;

import java.awt.Component;

@ObfuscatedName("al")
public class class48 extends class50 {

    @ObfuscatedName("al.s")
    public int field1054;

    public class48(class123 arg0, int arg1) {
        Statics.field1055 = arg0.method2471();
        this.field1054 = arg1;
    }

    @ObfuscatedName("al.t(Ljava/awt/Component;)V")
    public void method901(Component arg0) throws Exception {
        Statics.field1055.method884(arg0, Statics.field1085, Statics.field1061, -2069515014);
    }

    @ObfuscatedName("al.s(I)V")
    public void method902(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1055.method889(this.field1054, arg0, (byte) -87);
    }

    @ObfuscatedName("al.f()I")
    public int method903() {
        return Statics.field1055.method890(this.field1054, -1351455453);
    }

    @ObfuscatedName("al.e()V")
    public void method904() {
        Statics.field1055.method887(this.field1054, this.field1060, (byte) 0);
    }

    @ObfuscatedName("al.d()V")
    public void method905() {
        Statics.field1055.method894(this.field1054, -1971283087);
    }

    @ObfuscatedName("al.n()V")
    public void method906() {
        Statics.field1055.method892(this.field1054, (short) -22480);
    }
}
