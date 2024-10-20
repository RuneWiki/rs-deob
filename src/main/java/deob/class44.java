package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class44 extends class52 {

    @ObfuscatedName("at.c")
    public int field1039;

    public class44(class74 arg0, int arg1) {
        Statics.field1040 = arg0.method1513();
        this.field1039 = arg1;
    }

    @ObfuscatedName("at.q(Ljava/awt/Component;)V")
    public void method929(Component arg0) throws Exception {
        Statics.field1040.method918(arg0, Statics.field1097, Statics.field1034, -808579865);
    }

    @ObfuscatedName("at.c(I)V")
    public void method930(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1040.method921(this.field1039, arg0, 317983404);
    }

    @ObfuscatedName("at.p()I")
    public int method931() {
        return Statics.field1040.method915(this.field1039, -2083095893);
    }

    @ObfuscatedName("at.z()V")
    public void method940() {
        Statics.field1040.method903(this.field1039, this.field1087, 1784968280);
    }

    @ObfuscatedName("at.m()V")
    public void method948() {
        Statics.field1040.method905(this.field1039, -1834776079);
    }

    @ObfuscatedName("at.k()V")
    public void method937() {
        Statics.field1040.method920(this.field1039, -676673527);
    }
}
