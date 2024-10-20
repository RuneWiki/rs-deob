package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class44 extends class52 {

    @ObfuscatedName("aa.c")
    public int field1048;

    public class44(class74 arg0, int arg1) {
        Statics.field1049 = arg0.method1466();
        this.field1048 = arg1;
    }

    @ObfuscatedName("aa.b(Ljava/awt/Component;)V")
    public void method914(Component arg0) throws Exception {
        Statics.field1049.method911(arg0, Statics.field1117, Statics.field1109, 421336467);
    }

    @ObfuscatedName("aa.c(I)V")
    public void method917(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1049.method899(this.field1048, arg0, 1377936559);
    }

    @ObfuscatedName("aa.j()I")
    public int method916() {
        return Statics.field1049.method897(this.field1048, 961360134);
    }

    @ObfuscatedName("aa.i()V")
    public void method931() {
        Statics.field1049.method902(this.field1048, this.field1103, 1303590097);
    }

    @ObfuscatedName("aa.k()V")
    public void method918() {
        Statics.field1049.method898(this.field1048, (byte) 0);
    }

    @ObfuscatedName("aa.q()V")
    public void method919() {
        Statics.field1049.method900(this.field1048, -2137223316);
    }
}
