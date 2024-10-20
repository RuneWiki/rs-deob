package deob;

import java.awt.Component;

@ObfuscatedName("ao")
public class class48 extends class50 {

    @ObfuscatedName("ao.z")
    public int field1072;

    public class48(class123 arg0, int arg1) {
        Statics.field1073 = arg0.method2508();
        this.field1072 = arg1;
    }

    @ObfuscatedName("ao.j(Ljava/awt/Component;)V")
    public void method905(Component arg0) throws Exception {
        Statics.field1073.method902(arg0, Statics.field1090, Statics.field1086, (short) 10825);
    }

    @ObfuscatedName("ao.z(I)V")
    public void method906(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1073.method887(this.field1072, arg0, 760722541);
    }

    @ObfuscatedName("ao.y()I")
    public int method919() {
        return Statics.field1073.method888(this.field1072, -2136439152);
    }

    @ObfuscatedName("ao.h()V")
    public void method908() {
        Statics.field1073.method889(this.field1072, this.field1082, -1090307601);
    }

    @ObfuscatedName("ao.r()V")
    public void method927() {
        Statics.field1073.method890(this.field1072, -100072319);
    }

    @ObfuscatedName("ao.e()V")
    public void method910() {
        Statics.field1073.method886(this.field1072, -924305773);
    }
}
