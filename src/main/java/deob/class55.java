package deob;

import java.awt.Component;

@ObfuscatedName("bm")
public class class55 extends class57 {

    @ObfuscatedName("bm.d")
    public int field1156;

    public class55(class136 arg0, int arg1) {
        Statics.field1157 = arg0.method2719();
        this.field1156 = arg1;
    }

    @ObfuscatedName("bm.n(Ljava/awt/Component;)V")
    public void method1086(Component arg0) throws Exception {
        Statics.field1157.method1053(arg0, Statics.field1173, Statics.field59, -1156113366);
    }

    @ObfuscatedName("bm.d(I)V")
    public void method1075(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1157.method1064(this.field1156, arg0, -1886824199);
    }

    @ObfuscatedName("bm.s()I")
    public int method1076() {
        return Statics.field1157.method1073(this.field1156, -872591056);
    }

    @ObfuscatedName("bm.q()V")
    public void method1095() {
        Statics.field1157.method1056(this.field1156, this.field1164, 511294605);
    }

    @ObfuscatedName("bm.j()V")
    public void method1078() {
        Statics.field1157.method1057(this.field1156, -1642452788);
    }

    @ObfuscatedName("bm.k()V")
    public void method1079() {
        Statics.field1157.method1058(this.field1156, 1296175851);
    }
}
