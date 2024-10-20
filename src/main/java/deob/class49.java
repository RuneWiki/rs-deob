package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class49 extends class51 {

    @ObfuscatedName("ay.e")
    public int field1071;

    public class49(class127 arg0, int arg1) {
        Statics.field1070 = arg0.method2499();
        this.field1071 = arg1;
    }

    @ObfuscatedName("ay.b(Ljava/awt/Component;)V")
    public void method932(Component arg0) throws Exception {
        Statics.field1070.method904(arg0, Statics.field1092, Statics.field1077, -1583930952);
    }

    @ObfuscatedName("ay.e(I)V")
    public void method928(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1070.method900(this.field1071, arg0, (byte) -2);
    }

    @ObfuscatedName("ay.i()I")
    public int method919() {
        return Statics.field1070.method901(this.field1071, (byte) 87);
    }

    @ObfuscatedName("ay.k()V")
    public void method922() {
        Statics.field1070.method902(this.field1071, this.field1081, (byte) 105);
    }

    @ObfuscatedName("ay.h()V")
    public void method921() {
        Statics.field1070.method905(this.field1071, (short) -13158);
    }

    @ObfuscatedName("ay.p()V")
    public void method925() {
        Statics.field1070.method907(this.field1071, 1276381451);
    }
}
