package deob;

import java.awt.Component;

@ObfuscatedName("as")
public class class43 extends class51 {

    @ObfuscatedName("as.e")
    public int field1039;

    public class43(class73 arg0, int arg1) {
        Statics.field1038 = arg0.method1488();
        this.field1039 = arg1;
    }

    @ObfuscatedName("as.g(Ljava/awt/Component;)V")
    public void method923(Component arg0) throws Exception {
        Statics.field1038.method917(arg0, Statics.field1989, Statics.field1970, 1836093035);
    }

    @ObfuscatedName("as.e(I)V")
    public void method945(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1038.method901(this.field1039, arg0, (short) 7622);
    }

    @ObfuscatedName("as.n()I")
    public int method925() {
        return Statics.field1038.method900(this.field1039, (byte) 0);
    }

    @ObfuscatedName("as.j()V")
    public void method926() {
        Statics.field1038.method903(this.field1039, this.field1085, 1343567650);
    }

    @ObfuscatedName("as.i()V")
    public void method924() {
        Statics.field1038.method906(this.field1039, -482214700);
    }

    @ObfuscatedName("as.o()V")
    public void method928() {
        Statics.field1038.method905(this.field1039, -1420176573);
    }
}
