package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class44 extends class52 {

    @ObfuscatedName("az.m")
    public int field1031;

    public class44(class74 arg0, int arg1) {
        Statics.field1030 = arg0.method1498();
        this.field1031 = arg1;
    }

    @ObfuscatedName("az.y(Ljava/awt/Component;)V")
    public void method935(Component arg0) throws Exception {
        Statics.field1030.method921(arg0, Statics.field1094, Statics.field1077, (byte) -1);
    }

    @ObfuscatedName("az.m(I)V")
    public void method936(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1030.method930(this.field1031, arg0, -1773931191);
    }

    @ObfuscatedName("az.d()I")
    public int method937() {
        return Statics.field1030.method923(this.field1031, (byte) 1);
    }

    @ObfuscatedName("az.k()V")
    public void method945() {
        Statics.field1030.method924(this.field1031, this.field1101, (byte) 15);
    }

    @ObfuscatedName("az.n()V")
    public void method939() {
        Statics.field1030.method925(this.field1031, (byte) -17);
    }

    @ObfuscatedName("az.s()V")
    public void method940() {
        Statics.field1030.method926(this.field1031, -1836068326);
    }
}
