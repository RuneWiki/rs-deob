package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class48 extends class50 {

    @ObfuscatedName("ab.g")
    public int field1063;

    public class48(class123 arg0, int arg1) {
        Statics.field1064 = arg0.method2532();
        this.field1063 = arg1;
    }

    @ObfuscatedName("ab.p(Ljava/awt/Component;)V")
    public void method979(Component arg0) throws Exception {
        Statics.field1064.method965(arg0, Statics.field2674, Statics.field1924, 1073741824);
    }

    @ObfuscatedName("ab.g(I)V")
    public void method980(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1064.method972(this.field1063, arg0, -2031461372);
    }

    @ObfuscatedName("ab.x()I")
    public int method981() {
        return Statics.field1064.method958(this.field1063, (byte) -29);
    }

    @ObfuscatedName("ab.c()V")
    public void method997() {
        Statics.field1064.method957(this.field1063, this.field1071, (byte) 1);
    }

    @ObfuscatedName("ab.n()V")
    public void method983() {
        Statics.field1064.method960(this.field1063, -1736662850);
    }

    @ObfuscatedName("ab.s()V")
    public void method986() {
        Statics.field1064.method961(this.field1063, (byte) 13);
    }
}
