package deob;

import java.awt.Component;

@ObfuscatedName("ag")
public class class50 extends class52 {

    @ObfuscatedName("ag.s")
    public int field1076;

    public class50(class128 arg0, int arg1) {
        Statics.field1075 = arg0.method2504();
        this.field1076 = arg1;
    }

    @ObfuscatedName("ag.q(Ljava/awt/Component;)V")
    public void method942(Component arg0) throws Exception {
        Statics.field1075.method921(arg0, Statics.field3011, Statics.field1081, -24850062);
    }

    @ObfuscatedName("ag.s(I)V")
    public void method959(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1075.method918(this.field1076, arg0, -1288721986);
    }

    @ObfuscatedName("ag.h()I")
    public int method944() {
        return Statics.field1075.method919(this.field1076, 647779917);
    }

    @ObfuscatedName("ag.e()V")
    public void method945() {
        Statics.field1075.method934(this.field1076, this.field1083, 1990405766);
    }

    @ObfuscatedName("ag.n()V")
    public void method960() {
        Statics.field1075.method920(this.field1076, (byte) 8);
    }

    @ObfuscatedName("ag.t()V")
    public void method946() {
        Statics.field1075.method922(this.field1076, -2117451053);
    }
}
