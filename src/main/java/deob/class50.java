package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class50 extends class52 {

    @ObfuscatedName("ab.g")
    public int field1125;

    public class50(class128 arg0, int arg1) {
        Statics.field1126 = arg0.method2576();
        this.field1125 = arg1;
    }

    @ObfuscatedName("ab.n(Ljava/awt/Component;)V")
    public void method970(Component arg0) throws Exception {
        Statics.field1126.method966(arg0, Statics.field1142, Statics.field1146, 2064562448);
    }

    @ObfuscatedName("ab.g(I)V")
    public void method977(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1126.method960(this.field1125, arg0, 349125580);
    }

    @ObfuscatedName("ab.a()I")
    public int method972() {
        return Statics.field1126.method964(this.field1125, -1785842168);
    }

    @ObfuscatedName("ab.m()V")
    public void method969() {
        Statics.field1126.method949(this.field1125, this.field1134, (byte) -98);
    }

    @ObfuscatedName("ab.s()V")
    public void method987() {
        Statics.field1126.method950(this.field1125, -1352979555);
    }

    @ObfuscatedName("ab.j()V")
    public void method978() {
        Statics.field1126.method955(this.field1125, -766682132);
    }
}
