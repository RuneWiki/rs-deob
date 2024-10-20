package deob;

import java.awt.Component;

@ObfuscatedName("aq")
public class class49 extends class51 {

    @ObfuscatedName("aq.k")
    public int field1080;

    public class49(class125 arg0, int arg1) {
        Statics.field1079 = arg0.method2541();
        this.field1080 = arg1;
    }

    @ObfuscatedName("aq.f(Ljava/awt/Component;)V")
    public void method975(Component arg0) throws Exception {
        Statics.field1079.method961(arg0, Statics.field1105, Statics.field1097, 965642857);
    }

    @ObfuscatedName("aq.k(I)V")
    public void method976(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1079.method953(this.field1080, arg0, (byte) 0);
    }

    @ObfuscatedName("aq.y()I")
    public int method986() {
        return Statics.field1079.method954(this.field1080, (byte) -107);
    }

    @ObfuscatedName("aq.e()V")
    public void method978() {
        Statics.field1079.method966(this.field1080, this.field1108, 440844524);
    }

    @ObfuscatedName("aq.r()V")
    public void method974() {
        Statics.field1079.method967(this.field1080, 1318971801);
    }

    @ObfuscatedName("aq.a()V")
    public void method980() {
        Statics.field1079.method972(this.field1080, (byte) 0);
    }
}
