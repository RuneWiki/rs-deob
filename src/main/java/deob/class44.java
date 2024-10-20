package deob;

import java.awt.Component;

@ObfuscatedName("ag")
public class class44 extends class52 {

    @ObfuscatedName("ag.h")
    public int field1045;

    public class44(class74 arg0, int arg1) {
        Statics.field1046 = arg0.method1497();
        this.field1045 = arg1;
    }

    @ObfuscatedName("ag.g(Ljava/awt/Component;)V")
    public void method945(Component arg0) throws Exception {
        Statics.field1046.method926(arg0, Statics.field1105, Statics.field1092, (byte) 4);
    }

    @ObfuscatedName("ag.h(I)V")
    public void method937(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1046.method920(this.field1045, arg0, -1546658037);
    }

    @ObfuscatedName("ag.s()I")
    public int method936() {
        return Statics.field1046.method919(this.field1045, 1477966579);
    }

    @ObfuscatedName("ag.o()V")
    public void method939() {
        Statics.field1046.method931(this.field1045, this.field1107, (byte) 53);
    }

    @ObfuscatedName("ag.p()V")
    public void method940() {
        Statics.field1046.method933(this.field1045, 2096811390);
    }

    @ObfuscatedName("ag.x()V")
    public void method941() {
        Statics.field1046.method924(this.field1045, -755704301);
    }
}
