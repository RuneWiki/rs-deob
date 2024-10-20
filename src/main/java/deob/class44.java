package deob;

import java.awt.Component;

@ObfuscatedName("af")
public class class44 extends class52 {

    @ObfuscatedName("af.p")
    public int field1050;

    public class44(class74 arg0, int arg1) {
        Statics.field1051 = arg0.method1438();
        this.field1050 = arg1;
    }

    @ObfuscatedName("af.i(Ljava/awt/Component;)V")
    public void method912(Component arg0) throws Exception {
        Statics.field1051.method877(arg0, Statics.field763, Statics.field2711, -1609984457);
    }

    @ObfuscatedName("af.p(I)V")
    public void method895(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1051.method886(this.field1050, arg0, -898159642);
    }

    @ObfuscatedName("af.a()I")
    public int method896() {
        return Statics.field1051.method876(this.field1050, 1073225857);
    }

    @ObfuscatedName("af.l()V")
    public void method897() {
        Statics.field1051.method879(this.field1050, this.field1098, (byte) 47);
    }

    @ObfuscatedName("af.q()V")
    public void method898() {
        Statics.field1051.method880(this.field1050, 1965673102);
    }

    @ObfuscatedName("af.b()V")
    public void method899() {
        Statics.field1051.method881(this.field1050, 477431045);
    }
}
