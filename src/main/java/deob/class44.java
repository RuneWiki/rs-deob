package deob;

import java.awt.Component;

@ObfuscatedName("aj")
public class class44 extends class52 {

    @ObfuscatedName("aj.l")
    public int field1045;

    public class44(class74 arg0, int arg1) {
        Statics.field1044 = arg0.method1545();
        this.field1045 = arg1;
    }

    @ObfuscatedName("aj.p(Ljava/awt/Component;)V")
    public void method942(Component arg0) throws Exception {
        Statics.field1044.method933(arg0, Statics.field1099, Statics.field1368, -1978539551);
    }

    @ObfuscatedName("aj.l(I)V")
    public void method943(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1044.method922(this.field1045, arg0, 868890474);
    }

    @ObfuscatedName("aj.d()I")
    public int method952() {
        return Statics.field1044.method921(this.field1045, 1732396367);
    }

    @ObfuscatedName("aj.x()V")
    public void method945() {
        Statics.field1044.method924(this.field1045, this.field1094, (short) 5819);
    }

    @ObfuscatedName("aj.o()V")
    public void method946() {
        Statics.field1044.method925(this.field1045, -1063952126);
    }

    @ObfuscatedName("aj.a()V")
    public void method947() {
        Statics.field1044.method926(this.field1045, 1010601409);
    }
}
