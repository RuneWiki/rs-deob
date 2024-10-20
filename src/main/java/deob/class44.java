package deob;

import java.awt.Component;

@ObfuscatedName("ap")
public class class44 extends class52 {

    @ObfuscatedName("ap.w")
    public int field1053;

    public class44(class74 arg0, int arg1) {
        Statics.field1052 = arg0.method1478();
        this.field1053 = arg1;
    }

    @ObfuscatedName("ap.i(Ljava/awt/Component;)V")
    public void method943(Component arg0) throws Exception {
        Statics.field1052.method916(arg0, Statics.field1100, Statics.field1099, -1760138480);
    }

    @ObfuscatedName("ap.w(I)V")
    public void method944(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1052.method920(this.field1053, arg0, (byte) -28);
    }

    @ObfuscatedName("ap.f()I")
    public int method935() {
        return Statics.field1052.method922(this.field1053, 34740438);
    }

    @ObfuscatedName("ap.e()V")
    public void method936() {
        Statics.field1052.method926(this.field1053, this.field1104, (byte) 10);
    }

    @ObfuscatedName("ap.t()V")
    public void method938() {
        Statics.field1052.method914(this.field1053, 2146695330);
    }

    @ObfuscatedName("ap.d()V")
    public void method949() {
        Statics.field1052.method917(this.field1053, 1632443377);
    }
}
