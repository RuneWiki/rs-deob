package deob;

@ObfuscatedName("cg")
public class class65 extends class457 {

    @ObfuscatedName("cg.at")
    public int field483;

    @ObfuscatedName("cg.an")
    public int field484;

    @ObfuscatedName("cg.av")
    public int field485;

    @ObfuscatedName("cg.as")
    public String field486;

    @ObfuscatedName("cg.ax")
    public class525 field492;

    @ObfuscatedName("cg.ap")
    public class426 field488 = class426.field4619;

    @ObfuscatedName("cg.ab")
    public class426 field489 = class426.field4619;

    @ObfuscatedName("cg.ak")
    public String field490;

    @ObfuscatedName("cg.ae")
    public String field494;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1081(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cg.at(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1081(int arg0, String arg1, String arg2, String arg3) {
        this.field483 = class110.method646();
        this.field484 = client.field506;
        this.field485 = arg0;
        this.field486 = arg1;
        this.method1089();
        this.field490 = arg2;
        this.field494 = arg3;
        this.method1083();
        this.method1094();
    }

    @ObfuscatedName("cg.an(I)V")
    public void method1083() {
        this.field488 = class426.field4619;
    }

    @ObfuscatedName("cg.av(I)Z")
    public final boolean method1084() {
        if (class426.field4619 == this.field488) {
            this.method1085();
        }
        return class426.field4617 == this.field488;
    }

    @ObfuscatedName("cg.as(I)V")
    public void method1085() {
        this.field488 = Statics.field497.field830.method7176(this.field492) ? class426.field4617 : class426.field4616;
    }

    @ObfuscatedName("cg.ax(I)V")
    public void method1094() {
        this.field489 = class426.field4619;
    }

    @ObfuscatedName("cg.ap(I)Z")
    public final boolean method1087() {
        if (class426.field4619 == this.field489) {
            this.method1088();
        }
        return class426.field4617 == this.field489;
    }

    @ObfuscatedName("cg.ab(B)V")
    public void method1088() {
        this.field489 = Statics.field497.field828.method7176(this.field492) ? class426.field4617 : class426.field4616;
    }

    @ObfuscatedName("cg.ak(B)V")
    public final void method1089() {
        if (this.field486 == null) {
            this.field492 = null;
        } else {
            this.field492 = new class525(client.method319(this.field486), Statics.field3059);
        }
    }
}
