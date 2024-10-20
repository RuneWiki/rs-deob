package deob;

import java.awt.Component;

@ObfuscatedName("am")
public class class44 extends class52 {

    @ObfuscatedName("am.i")
    public int field1048;

    public class44(class74 arg0, int arg1) {
        Statics.field1049 = arg0.method1524();
        this.field1048 = arg1;
    }

    @ObfuscatedName("am.p(Ljava/awt/Component;)V")
    public void method947(Component arg0) throws Exception {
        Statics.field1049.method945(arg0, Statics.field1112, Statics.field1095, -845079586);
    }

    @ObfuscatedName("am.i(I)V")
    public void method949(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1049.method925(this.field1048, arg0, (short) -10948);
    }

    @ObfuscatedName("am.o()I")
    public int method953() {
        return Statics.field1049.method926(this.field1048, (byte) -44);
    }

    @ObfuscatedName("am.n()V")
    public void method950() {
        Statics.field1049.method927(this.field1048, this.field1097, -1249298944);
    }

    @ObfuscatedName("am.l()V")
    public void method951() {
        Statics.field1049.method928(this.field1048, -1760148751);
    }

    @ObfuscatedName("am.v()V")
    public void method952() {
        Statics.field1049.method929(this.field1048, 857421408);
    }
}
