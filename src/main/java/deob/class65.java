package deob;

@ObfuscatedName("co")
public class class65 extends class500 {

    @ObfuscatedName("co.ak")
    public int field477;

    @ObfuscatedName("co.al")
    public int field483;

    @ObfuscatedName("co.aj")
    public int field475;

    @ObfuscatedName("co.az")
    public String field484;

    @ObfuscatedName("co.af")
    public class568 field478;

    @ObfuscatedName("co.aa")
    public class475 field479 = class475.field4937;

    @ObfuscatedName("co.at")
    public class475 field480 = class475.field4937;

    @ObfuscatedName("co.ab")
    public String field481;

    @ObfuscatedName("co.ac")
    public String field482;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1101(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("co.ak(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1101(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class114.field1461 - 1;
        this.field477 = var5;
        this.field483 = client.field821;
        this.field475 = arg0;
        this.field484 = arg1;
        this.method1118();
        this.field481 = arg2;
        this.field482 = arg3;
        this.method1102();
        this.method1110();
    }

    @ObfuscatedName("co.al(I)V")
    public void method1102() {
        this.field479 = class475.field4937;
    }

    @ObfuscatedName("co.aj(I)Z")
    public final boolean method1113() {
        if (class475.field4937 == this.field479) {
            this.method1103();
        }
        return class475.field4936 == this.field479;
    }

    @ObfuscatedName("co.az(B)V")
    public void method1103() {
        this.field479 = Statics.field182.field853.method7908(this.field478) ? class475.field4936 : class475.field4935;
    }

    @ObfuscatedName("co.af(I)V")
    public void method1110() {
        this.field480 = class475.field4937;
    }

    @ObfuscatedName("co.aa(I)Z")
    public final boolean method1105() {
        if (class475.field4937 == this.field480) {
            this.method1106();
        }
        return class475.field4936 == this.field480;
    }

    @ObfuscatedName("co.at(S)V")
    public void method1106() {
        this.field480 = Statics.field182.field854.method7908(this.field478) ? class475.field4936 : class475.field4935;
    }

    @ObfuscatedName("co.ab(B)V")
    public final void method1118() {
        if (this.field484 == null) {
            this.field478 = null;
        } else {
            this.field478 = new class568(client.method3098(this.field484), Statics.field2521);
        }
    }
}
