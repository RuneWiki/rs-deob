package deob;

import java.awt.Component;

@ObfuscatedName("an")
public class class49 extends class51 {

    @ObfuscatedName("an.v")
    public int field1079;

    public class49(class125 arg0, int arg1) {
        Statics.field1080 = arg0.method2502();
        this.field1079 = arg1;
    }

    @ObfuscatedName("an.x(Ljava/awt/Component;)V")
    public void method963(Component arg0) throws Exception {
        Statics.field1080.method941(arg0, Statics.field1096, Statics.field1092, -1895163095);
    }

    @ObfuscatedName("an.v(I)V")
    public void method952(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1080.method925(this.field1079, arg0, (byte) 0);
    }

    @ObfuscatedName("an.m()I")
    public int method953() {
        return Statics.field1080.method926(this.field1079, (byte) -53);
    }

    @ObfuscatedName("an.e()V")
    public void method964() {
        Statics.field1080.method927(this.field1079, this.field1087, 961494751);
    }

    @ObfuscatedName("an.h()V")
    public void method955() {
        Statics.field1080.method929(this.field1079, 2132437365);
    }

    @ObfuscatedName("an.p()V")
    public void method950() {
        Statics.field1080.method930(this.field1079, (short) -32047);
    }
}
