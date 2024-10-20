package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class48 extends class50 {

    @ObfuscatedName("ax.b")
    public int field1069;

    public class48(class123 arg0, int arg1) {
        Statics.field1068 = arg0.method2473();
        this.field1069 = arg1;
    }

    @ObfuscatedName("ax.k(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
        Statics.field1068.method909(arg0, Statics.field1075, Statics.field2958, 1948940691);
    }

    @ObfuscatedName("ax.b(I)V")
    public void method923(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1068.method900(this.field1069, arg0, 1759331914);
    }

    @ObfuscatedName("ax.e()I")
    public int method921() {
        return Statics.field1068.method901(this.field1069, (byte) 16);
    }

    @ObfuscatedName("ax.i()V")
    public void method926() {
        Statics.field1068.method902(this.field1069, this.field1077, -2109484771);
    }

    @ObfuscatedName("ax.t()V")
    public void method935() {
        Statics.field1068.method905(this.field1069, (byte) 0);
    }

    @ObfuscatedName("ax.z()V")
    public void method927() {
        Statics.field1068.method906(this.field1069, -1464173574);
    }
}
