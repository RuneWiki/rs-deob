package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class44 extends class52 {

    @ObfuscatedName("az.t")
    public int field1030;

    public class44(class74 arg0, int arg1) {
        Statics.field1029 = arg0.method1510();
        this.field1030 = arg1;
    }

    @ObfuscatedName("az.f(Ljava/awt/Component;)V")
    public void method919(Component arg0) throws Exception {
        Statics.field1029.method916(arg0, Statics.field1089, Statics.field1778, -2145888135);
    }

    @ObfuscatedName("az.t(I)V")
    public void method930(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1029.method900(this.field1030, arg0, 2053521828);
    }

    @ObfuscatedName("az.n()I")
    public int method921() {
        return Statics.field1029.method902(this.field1030, 868251891);
    }

    @ObfuscatedName("az.e()V")
    public void method922() {
        Statics.field1029.method903(this.field1030, this.field1078, 474585725);
    }

    @ObfuscatedName("az.l()V")
    public void method939() {
        Statics.field1029.method904(this.field1030, 158645797);
    }

    @ObfuscatedName("az.d()V")
    public void method924() {
        Statics.field1029.method901(this.field1030, -2141260845);
    }
}
