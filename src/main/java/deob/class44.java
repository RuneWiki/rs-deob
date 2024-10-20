package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class44 extends class52 {

    @ObfuscatedName("aa.x")
    public int field1062;

    public class44(class74 arg0, int arg1) {
        Statics.field1061 = arg0.method1457();
        this.field1062 = arg1;
    }

    @ObfuscatedName("aa.a(Ljava/awt/Component;)V")
    public void method924(Component arg0) throws Exception {
        Statics.field1061.method923(arg0, Statics.field1989, Statics.field1125, (byte) 72);
    }

    @ObfuscatedName("aa.x(I)V")
    public void method926(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1061.method906(this.field1062, arg0, 1428887993);
    }

    @ObfuscatedName("aa.e()I")
    public int method927() {
        return Statics.field1061.method905(this.field1062, 1465693213);
    }

    @ObfuscatedName("aa.r()V")
    public void method928() {
        Statics.field1061.method911(this.field1062, this.field1127, 1066696625);
    }

    @ObfuscatedName("aa.p()V")
    public void method929() {
        Statics.field1061.method909(this.field1062, -1603039281);
    }

    @ObfuscatedName("aa.n()V")
    public void method940() {
        Statics.field1061.method910(this.field1062, -2007800007);
    }
}
