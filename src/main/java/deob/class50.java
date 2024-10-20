package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class50 extends class52 {

    @ObfuscatedName("aa.k")
    public int field1102;

    public class50(class128 arg0, int arg1) {
        Statics.field1103 = arg0.method2544();
        this.field1102 = arg1;
    }

    @ObfuscatedName("aa.y(Ljava/awt/Component;)V")
    public void method984(Component arg0) throws Exception {
        Statics.field1103.method966(arg0, Statics.field1126, Statics.field1125, 1904563976);
    }

    @ObfuscatedName("aa.k(I)V")
    public void method994(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        Statics.field1103.method980(this.field1102, arg0, 337535255);
    }

    @ObfuscatedName("aa.g()I")
    public int method985() {
        return Statics.field1103.method967(this.field1102, 326156807);
    }

    @ObfuscatedName("aa.n()V")
    public void method999() {
        Statics.field1103.method968(this.field1102, this.field1111, -1920586383);
    }

    @ObfuscatedName("aa.t()V")
    public void method988() {
        Statics.field1103.method977(this.field1102, (short) 30296);
    }

    @ObfuscatedName("aa.e()V")
    public void method989() {
        Statics.field1103.method982(this.field1102, 14720128);
    }
}
