package deob;

@ObfuscatedName("bd")
public class class74 extends class185 {

    @ObfuscatedName("bd.n")
    public int field608;

    @ObfuscatedName("bd.v")
    public int field621;

    @ObfuscatedName("bd.d")
    public int field610;

    @ObfuscatedName("bd.c")
    public String field611;

    @ObfuscatedName("bd.y")
    public class294 field612;

    @ObfuscatedName("bd.h")
    public class292 field613 = class292.field3651;

    @ObfuscatedName("bd.z")
    public class292 field614 = class292.field3651;

    @ObfuscatedName("bd.e")
    public String field615;

    @ObfuscatedName("bd.q")
    public String field618;

    public class74(int arg0, String arg1, String arg2, String arg3) {
        this.method1141(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1141(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class101.field1292 - 1;
        this.field608 = var5;
        this.field621 = client.field729;
        this.field610 = arg0;
        this.field611 = arg1;
        this.method1151();
        this.field615 = arg2;
        this.field618 = arg3;
        this.method1140();
        this.method1143();
    }

    @ObfuscatedName("bd.v(B)V")
    public void method1140() {
        this.field613 = class292.field3651;
    }

    @ObfuscatedName("bd.d(I)Z")
    public final boolean method1146() {
        if (class292.field3651 == this.field613) {
            this.method1142();
        }
        return class292.field3650 == this.field613;
    }

    @ObfuscatedName("bd.c(I)V")
    public void method1142() {
        this.field613 = Statics.field574.field1081.method4884(this.field612) ? class292.field3650 : class292.field3652;
    }

    @ObfuscatedName("bd.y(B)V")
    public void method1143() {
        this.field614 = class292.field3651;
    }

    @ObfuscatedName("bd.h(I)Z")
    public final boolean method1144() {
        if (class292.field3651 == this.field614) {
            this.method1145();
        }
        return class292.field3650 == this.field614;
    }

    @ObfuscatedName("bd.z(B)V")
    public void method1145() {
        this.field614 = Statics.field574.field1078.method4884(this.field612) ? class292.field3650 : class292.field3652;
    }

    @ObfuscatedName("bd.e(I)V")
    public final void method1151() {
        if (this.field611 == null) {
            this.field612 = null;
        } else {
            this.field612 = new class294(client.method3788(this.field611), Statics.field617);
        }
    }
}
