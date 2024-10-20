package deob;

import java.awt.Component;

@ObfuscatedName("an")
public class class44 extends class52 {

    @ObfuscatedName("an.e")
    public int field1031;

    public class44(class74 arg0, int arg1) {
        Statics.field1032 = arg0.method1470();
        this.field1031 = arg1;
    }

    @ObfuscatedName("an.b(Ljava/awt/Component;)V")
    public void method915(Component arg0) throws Exception {
        Statics.field1032.method887(arg0, Statics.field1093, Statics.field1078, 448661863);
    }

    @ObfuscatedName("an.e(I)V")
    public void method900(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1032.method875(this.field1031, arg0, (byte) -24);
    }

    @ObfuscatedName("an.g()I")
    public int method901() {
        return Statics.field1032.method876(this.field1031, 711615177);
    }

    @ObfuscatedName("an.o()V")
    public void method902() {
        Statics.field1032.method877(this.field1031, this.field1081, -2106857553);
    }

    @ObfuscatedName("an.a()V")
    public void method904() {
        Statics.field1032.method878(this.field1031, (byte) 56);
    }

    @ObfuscatedName("an.h()V")
    public void method912() {
        Statics.field1032.method879(this.field1031, (byte) 105);
    }
}
