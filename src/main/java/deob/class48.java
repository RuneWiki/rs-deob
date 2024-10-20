package deob;

import java.awt.Component;

@ObfuscatedName("au")
public class class48 extends class50 {

    @ObfuscatedName("au.v")
    public int field1068;

    public class48(class123 arg0, int arg1) {
        Statics.field1067 = arg0.method2484();
        this.field1068 = arg1;
    }

    @ObfuscatedName("au.g(Ljava/awt/Component;)V")
    public void method950(Component arg0) throws Exception {
        Statics.field1067.method932(arg0, Statics.field1074, Statics.field1079, -1832278800);
    }

    @ObfuscatedName("au.v(I)V")
    public void method951(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1067.method930(this.field1068, arg0, -1060109488);
    }

    @ObfuscatedName("au.z()I")
    public int method952() {
        return Statics.field1067.method931(this.field1068, (byte) 50);
    }

    @ObfuscatedName("au.h()V")
    public void method949() {
        Statics.field1067.method929(this.field1068, this.field1089, -1848853814);
    }

    @ObfuscatedName("au.k()V")
    public void method954() {
        Statics.field1067.method933(this.field1068, 923938533);
    }

    @ObfuscatedName("au.l()V")
    public void method956() {
        Statics.field1067.method934(this.field1068, 1452746707);
    }
}
