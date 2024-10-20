package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class43 extends class51 {

    @ObfuscatedName("ay.j")
    public int field1038;

    public class43(class73 arg0, int arg1) {
        Statics.field1039 = arg0.method1465();
        this.field1038 = arg1;
    }

    @ObfuscatedName("ay.p(Ljava/awt/Component;)V")
    public void method892(Component arg0) throws Exception {
        Statics.field1039.method875(arg0, Statics.field1265, Statics.field1031, (byte) -50);
    }

    @ObfuscatedName("ay.j(I)V")
    public void method891(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1039.method868(this.field1038, arg0, -1570297989);
    }

    @ObfuscatedName("ay.w()I")
    public int method894() {
        return Statics.field1039.method869(this.field1038, -280901763);
    }

    @ObfuscatedName("ay.h()V")
    public void method899() {
        Statics.field1039.method870(this.field1038, this.field1086, 926612418);
    }

    @ObfuscatedName("ay.v()V")
    public void method896() {
        Statics.field1039.method881(this.field1038, -1062805349);
    }

    @ObfuscatedName("ay.k()V")
    public void method897() {
        Statics.field1039.method872(this.field1038, 2130133440);
    }
}
