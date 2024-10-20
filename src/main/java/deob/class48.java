package deob;

import java.awt.Component;

@ObfuscatedName("ad")
public class class48 extends class50 {

    @ObfuscatedName("ad.o")
    public int field1077;

    public class48(class123 arg0, int arg1) {
        Statics.field1078 = arg0.method2417();
        this.field1077 = arg1;
    }

    @ObfuscatedName("ad.e(Ljava/awt/Component;)V")
    public void method908(Component arg0) throws Exception {
        Statics.field1078.method898(arg0, Statics.field1095, Statics.field1761, -772673298);
    }

    @ObfuscatedName("ad.o(I)V")
    public void method909(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1078.method887(this.field1077, arg0, 1961704454);
    }

    @ObfuscatedName("ad.y()I")
    public int method910() {
        return Statics.field1078.method894(this.field1077, 121225567);
    }

    @ObfuscatedName("ad.b()V")
    public void method916() {
        Statics.field1078.method889(this.field1077, this.field1085, (byte) 60);
    }

    @ObfuscatedName("ad.w()V")
    public void method912() {
        Statics.field1078.method890(this.field1077, -1718612220);
    }

    @ObfuscatedName("ad.r()V")
    public void method907() {
        Statics.field1078.method891(this.field1077, -469757840);
    }
}
