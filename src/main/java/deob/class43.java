package deob;

import java.awt.Component;

@ObfuscatedName("ak")
public class class43 extends class51 {

    @ObfuscatedName("ak.h")
    public int field1046;

    public class43(class73 arg0, int arg1) {
        Statics.field1045 = arg0.method1506();
        this.field1046 = arg1;
    }

    @ObfuscatedName("ak.z(Ljava/awt/Component;)V")
    public void method916(Component arg0) throws Exception {
        Statics.field1045.method904(arg0, Statics.field2409, Statics.field955, 1679335246);
    }

    @ObfuscatedName("ak.h(I)V")
    public void method917(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1045.method903(this.field1046, arg0, (byte) 0);
    }

    @ObfuscatedName("ak.c()I")
    public int method918() {
        return Statics.field1045.method902(this.field1046, 225115825);
    }

    @ObfuscatedName("ak.p()V")
    public void method932() {
        Statics.field1045.method908(this.field1046, this.field1092, 419475762);
    }

    @ObfuscatedName("ak.i()V")
    public void method923() {
        Statics.field1045.method906(this.field1046, (byte) -7);
    }

    @ObfuscatedName("ak.v()V")
    public void method921() {
        Statics.field1045.method907(this.field1046, (byte) 3);
    }
}
