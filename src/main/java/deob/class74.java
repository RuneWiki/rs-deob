package deob;

@ObfuscatedName("by")
public class class74 extends class185 {

    @ObfuscatedName("by.x")
    public int field623;

    @ObfuscatedName("by.m")
    public int field624;

    @ObfuscatedName("by.k")
    public int field625;

    @ObfuscatedName("by.d")
    public String field637;

    @ObfuscatedName("by.w")
    public class293 field631;

    @ObfuscatedName("by.v")
    public class291 field628 = class291.field3615;

    @ObfuscatedName("by.q")
    public class291 field629 = class291.field3615;

    @ObfuscatedName("by.z")
    public String field630;

    @ObfuscatedName("by.t")
    public String field636;

    public class74(int arg0, String arg1, String arg2, String arg3) {
        this.method1139(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("by.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1139(int arg0, String arg1, String arg2, String arg3) {
        this.field623 = class101.method1186();
        this.field624 = client.field690;
        this.field625 = arg0;
        this.field637 = arg1;
        this.method1146();
        this.field630 = arg2;
        this.field636 = arg3;
        this.method1155();
        this.method1143();
    }

    @ObfuscatedName("by.m(I)V")
    public void method1155() {
        this.field628 = class291.field3615;
    }

    @ObfuscatedName("by.k(B)Z")
    public final boolean method1160() {
        if (class291.field3615 == this.field628) {
            this.method1142();
        }
        return class291.field3614 == this.field628;
    }

    @ObfuscatedName("by.d(I)V")
    public void method1142() {
        this.field628 = Statics.field1253.field1091.method4745(this.field631) ? class291.field3614 : class291.field3613;
    }

    @ObfuscatedName("by.w(B)V")
    public void method1143() {
        this.field629 = class291.field3615;
    }

    @ObfuscatedName("by.v(B)Z")
    public final boolean method1152() {
        if (class291.field3615 == this.field629) {
            this.method1140();
        }
        return class291.field3614 == this.field629;
    }

    @ObfuscatedName("by.q(I)V")
    public void method1140() {
        this.field629 = Statics.field1253.field1094.method4745(this.field631) ? class291.field3614 : class291.field3613;
    }

    @ObfuscatedName("by.z(I)V")
    public final void method1146() {
        if (this.field637 == null) {
            this.field631 = null;
        } else {
            this.field631 = new class293(client.method3114(this.field637), Statics.field165);
        }
    }
}
