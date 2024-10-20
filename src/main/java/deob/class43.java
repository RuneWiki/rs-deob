package deob;

import java.awt.Component;

@ObfuscatedName("ao")
public class class43 extends class51 {

    @ObfuscatedName("ao.f")
    public int field1026;

    public class43(class73 arg0, int arg1) {
        Statics.field1027 = arg0.method1516();
        this.field1026 = arg1;
    }

    @ObfuscatedName("ao.v(Ljava/awt/Component;)V")
    public void method947(Component arg0) throws Exception {
        Statics.field1027.method912(arg0, Statics.field1076, Statics.field2772, (short) 16166);
    }

    @ObfuscatedName("ao.f(I)V")
    public void method948(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1027.method922(this.field1026, arg0, -1902066335);
    }

    @ObfuscatedName("ao.n()I")
    public int method934() {
        return Statics.field1027.method930(this.field1026, -2051788788);
    }

    @ObfuscatedName("ao.c()V")
    public void method935() {
        Statics.field1027.method911(this.field1026, this.field1073, -1098134715);
    }

    @ObfuscatedName("ao.r()V")
    public void method936() {
        Statics.field1027.method923(this.field1026, 947723241);
    }

    @ObfuscatedName("ao.k()V")
    public void method933() {
        Statics.field1027.method908(this.field1026, (byte) -55);
    }
}
