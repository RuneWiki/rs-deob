package deob;

import java.awt.Component;

@ObfuscatedName("ao")
public class class49 extends class51 {

    @ObfuscatedName("ao.y")
    public int field1057;

    public class49(class127 arg0, int arg1) {
        Statics.field1058 = arg0.method2489();
        this.field1057 = arg1;
    }

    @ObfuscatedName("ao.p(Ljava/awt/Component;)V")
    public void method956(Component arg0) throws Exception {
        Statics.field1058.method953(arg0, Statics.field1071, Statics.field1067, -1039157532);
    }

    @ObfuscatedName("ao.y(I)V")
    public void method957(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1058.method930(this.field1057, arg0, (byte) 93);
    }

    @ObfuscatedName("ao.d()I")
    public int method973() {
        return Statics.field1058.method931(this.field1057, (byte) 42);
    }

    @ObfuscatedName("ao.c()V")
    public void method958() {
        Statics.field1058.method932(this.field1057, this.field1065, -103295093);
    }

    @ObfuscatedName("ao.r()V")
    public void method959() {
        Statics.field1058.method933(this.field1057, 1400494696);
    }

    @ObfuscatedName("ao.f()V")
    public void method960() {
        Statics.field1058.method934(this.field1057, (byte) 16);
    }
}
