package deob;

import java.awt.Component;

@ObfuscatedName("ar")
public class class48 extends class50 {

    @ObfuscatedName("ar.s")
    public int field1065;

    public class48(class123 arg0, int arg1) {
        Statics.field1066 = arg0.method2417();
        this.field1065 = arg1;
    }

    @ObfuscatedName("ar.g(Ljava/awt/Component;)V")
    public void method908(Component arg0) throws Exception {
        Statics.field1066.method902(arg0, Statics.field1078, Statics.field1072, -1302020519);
    }

    @ObfuscatedName("ar.s(I)V")
    public void method921(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1066.method900(this.field1065, arg0, (byte) 7);
    }

    @ObfuscatedName("ar.v()I")
    public int method929() {
        return Statics.field1066.method894(this.field1065, 1342603932);
    }

    @ObfuscatedName("ar.o()V")
    public void method924() {
        Statics.field1066.method895(this.field1065, this.field1075, 1233158475);
    }

    @ObfuscatedName("ar.k()V")
    public void method912() {
        Statics.field1066.method896(this.field1065, -1727348107);
    }

    @ObfuscatedName("ar.m()V")
    public void method911() {
        Statics.field1066.method897(this.field1065, (byte) 0);
    }
}
