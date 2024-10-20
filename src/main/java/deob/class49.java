package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class49 extends class51 {

    @ObfuscatedName("az.j")
    public int field1073;

    public class49(class125 arg0, int arg1) {
        Statics.field1072 = arg0.method2498();
        this.field1073 = arg1;
    }

    @ObfuscatedName("az.c(Ljava/awt/Component;)V")
    public void method941(Component arg0) throws Exception {
        Statics.field1072.method928(arg0, Statics.field1814, Statics.field1099, (byte) -28);
    }

    @ObfuscatedName("az.j(I)V")
    public void method932(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1072.method907(this.field1073, arg0, (byte) 0);
    }

    @ObfuscatedName("az.y()I")
    public int method953() {
        return Statics.field1072.method908(this.field1073, 1923171930);
    }

    @ObfuscatedName("az.r()V")
    public void method934() {
        Statics.field1072.method909(this.field1073, this.field1082, -1101093620);
    }

    @ObfuscatedName("az.f()V")
    public void method940() {
        Statics.field1072.method910(this.field1073, -127436719);
    }

    @ObfuscatedName("az.l()V")
    public void method933() {
        Statics.field1072.method912(this.field1073, (byte) 1);
    }
}
