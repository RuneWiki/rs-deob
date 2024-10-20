package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class48 extends class50 {

    @ObfuscatedName("ay.u")
    public int field1055;

    public class48(class123 arg0, int arg1) {
        Statics.field1056 = arg0.method2463();
        this.field1055 = arg1;
    }

    @ObfuscatedName("ay.y(Ljava/awt/Component;)V")
    public void method921(Component arg0) throws Exception {
        Statics.field1056.method918(arg0, Statics.field1069, Statics.field1062, (byte) -101);
    }

    @ObfuscatedName("ay.u(I)V")
    public void method922(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1056.method901(this.field1055, arg0, 548229425);
    }

    @ObfuscatedName("ay.k()I")
    public int method923() {
        return Statics.field1056.method902(this.field1055, -1900347919);
    }

    @ObfuscatedName("ay.v()V")
    public void method924() {
        Statics.field1056.method909(this.field1055, this.field1066, -251946244);
    }

    @ObfuscatedName("ay.l()V")
    public void method925() {
        Statics.field1056.method904(this.field1055, -498978811);
    }

    @ObfuscatedName("ay.g()V")
    public void method937() {
        Statics.field1056.method905(this.field1055, -397309589);
    }
}
