package deob;

import java.awt.Component;

@ObfuscatedName("ac")
public class class45 extends class47 {

    @ObfuscatedName("ac.k")
    public int field1039;

    public class45(class120 arg0, int arg1) {
        Statics.field1040 = arg0.method2480();
        this.field1039 = arg1;
    }

    @ObfuscatedName("ac.m(Ljava/awt/Component;)V")
    public void method896(Component arg0) throws Exception {
        Statics.field1040.method876(arg0, Statics.field1056, Statics.field1062, -446303709);
    }

    @ObfuscatedName("ac.k(I)V")
    public void method905(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1040.method877(this.field1039, arg0, 1071118537);
    }

    @ObfuscatedName("ac.y()I")
    public int method898() {
        return Statics.field1040.method871(this.field1039, 708911118);
    }

    @ObfuscatedName("ac.g()V")
    public void method897() {
        Statics.field1040.method872(this.field1039, this.field1050, -60821615);
    }

    @ObfuscatedName("ac.r()V")
    public void method900() {
        Statics.field1040.method873(this.field1039, (byte) 66);
    }

    @ObfuscatedName("ac.i()V")
    public void method901() {
        Statics.field1040.method874(this.field1039, -655307713);
    }
}
