package deob;

@ObfuscatedName("bk")
public class class74 extends class185 {

    @ObfuscatedName("bk.z")
    public int field613;

    @ObfuscatedName("bk.k")
    public int field612;

    @ObfuscatedName("bk.s")
    public int field614;

    @ObfuscatedName("bk.t")
    public String field615;

    @ObfuscatedName("bk.i")
    public class293 field620;

    @ObfuscatedName("bk.o")
    public class291 field623 = class291.field3639;

    @ObfuscatedName("bk.x")
    public class291 field618 = class291.field3639;

    @ObfuscatedName("bk.w")
    public String field619;

    @ObfuscatedName("bk.g")
    public String field617;

    public class74(int arg0, String arg1, String arg2, String arg3) {
        this.method1124(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bk.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1124(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class101.field1304 - 1;
        this.field613 = var5;
        this.field612 = client.field674;
        this.field614 = arg0;
        this.field615 = arg1;
        this.method1114();
        this.field619 = arg2;
        this.field617 = arg3;
        this.method1122();
        this.method1100();
    }

    @ObfuscatedName("bk.k(B)V")
    public void method1122() {
        this.field623 = class291.field3639;
    }

    @ObfuscatedName("bk.s(B)Z")
    public final boolean method1098() {
        if (class291.field3639 == this.field623) {
            this.method1099();
        }
        return class291.field3637 == this.field623;
    }

    @ObfuscatedName("bk.t(I)V")
    public void method1099() {
        this.field623 = Statics.field456.field1097.method4816(this.field620) ? class291.field3637 : class291.field3638;
    }

    @ObfuscatedName("bk.i(I)V")
    public void method1100() {
        this.field618 = class291.field3639;
    }

    @ObfuscatedName("bk.o(B)Z")
    public final boolean method1101() {
        if (class291.field3639 == this.field618) {
            this.method1102();
        }
        return class291.field3637 == this.field618;
    }

    @ObfuscatedName("bk.x(I)V")
    public void method1102() {
        this.field618 = Statics.field456.field1099.method4816(this.field620) ? class291.field3637 : class291.field3638;
    }

    @ObfuscatedName("bk.w(I)V")
    public final void method1114() {
        if (this.field615 == null) {
            this.field620 = null;
        } else {
            this.field620 = new class293(client.method1058(this.field615), Statics.field356);
        }
    }
}
