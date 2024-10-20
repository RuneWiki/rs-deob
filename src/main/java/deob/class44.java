package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class44 extends class52 {

    @ObfuscatedName("at.l")
    public int field1077;

    public class44(class74 arg0, int arg1) {
        Statics.field1078 = arg0.method1509();
        this.field1077 = arg1;
    }

    @ObfuscatedName("at.t(Ljava/awt/Component;)V")
    public void method951(Component arg0) throws Exception {
        Statics.field1078.method934(arg0, Statics.field2051, Statics.field2022, -1975256435);
    }

    @ObfuscatedName("at.l(I)V")
    public void method952(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1078.method946(this.field1077, arg0, (byte) 53);
    }

    @ObfuscatedName("at.c()I")
    public int method953() {
        return Statics.field1078.method935(this.field1077, -54388488);
    }

    @ObfuscatedName("at.d()V")
    public void method954() {
        Statics.field1078.method938(this.field1077, this.field1123, 2065864781);
    }

    @ObfuscatedName("at.b()V")
    public void method966() {
        Statics.field1078.method937(this.field1077, -1530726718);
    }

    @ObfuscatedName("at.i()V")
    public void method956() {
        Statics.field1078.method936(this.field1077, (byte) 34);
    }
}
