package deob;

import java.awt.Component;

@ObfuscatedName("ai")
public class class49 extends class51 {

    @ObfuscatedName("ai.j")
    public int field1073;

    public class49(class125 arg0, int arg1) {
        Statics.field1074 = arg0.method2445();
        this.field1073 = arg1;
    }

    @ObfuscatedName("ai.g(Ljava/awt/Component;)V")
    public void method894(Component arg0) throws Exception {
        Statics.field1074.method891(arg0, Statics.field1093, Statics.field1079, (byte) 16);
    }

    @ObfuscatedName("ai.j(I)V")
    public void method902(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1074.method872(this.field1073, arg0, (byte) 22);
    }

    @ObfuscatedName("ai.z()I")
    public int method895() {
        return Statics.field1074.method880(this.field1073, -1689017226);
    }

    @ObfuscatedName("ai.b()V")
    public void method896() {
        Statics.field1074.method874(this.field1073, this.field1082, -1581719905);
    }

    @ObfuscatedName("ai.k()V")
    public void method909() {
        Statics.field1074.method875(this.field1073, (byte) 1);
    }

    @ObfuscatedName("ai.c()V")
    public void method898() {
        Statics.field1074.method879(this.field1073, -746234724);
    }
}
