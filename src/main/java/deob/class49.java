package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class49 extends class51 {

    @ObfuscatedName("ab.v")
    public int field1077;

    public class49(class127 arg0, int arg1) {
        Statics.field1076 = arg0.method2484();
        this.field1077 = arg1;
    }

    @ObfuscatedName("ab.a(Ljava/awt/Component;)V")
    public void method966(Component arg0) throws Exception {
        Statics.field1076.method935(arg0, Statics.field1084, Statics.field1083, (byte) 45);
    }

    @ObfuscatedName("ab.v(I)V")
    public void method949(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1076.method944(this.field1077, arg0, 1102285009);
    }

    @ObfuscatedName("ab.i()I")
    public int method947() {
        return Statics.field1076.method929(this.field1077, (short) 3171);
    }

    @ObfuscatedName("ab.b()V")
    public void method950() {
        Statics.field1076.method930(this.field1077, this.field1087, 1204818952);
    }

    @ObfuscatedName("ab.l()V")
    public void method955() {
        Statics.field1076.method931(this.field1077, (byte) 43);
    }

    @ObfuscatedName("ab.m()V")
    public void method952() {
        Statics.field1076.method932(this.field1077, -322861429);
    }
}
