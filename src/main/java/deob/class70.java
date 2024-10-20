package deob;

@ObfuscatedName("bx")
public class class70 extends class206 {

    @ObfuscatedName("bx.s")
    public int field803 = class95.method2954();

    @ObfuscatedName("bx.g")
    public int field797 = client.field1036;

    @ObfuscatedName("bx.m")
    public int field800;

    @ObfuscatedName("bx.h")
    public String field798;

    @ObfuscatedName("bx.i")
    public class281 field796;

    @ObfuscatedName("bx.w")
    public class279 field805 = class279.field3717;

    @ObfuscatedName("bx.t")
    public class279 field802 = class279.field3717;

    @ObfuscatedName("bx.d")
    public String field801;

    @ObfuscatedName("bx.z")
    public String field804;

    public class70(int arg0, String arg1, String arg2, String arg3) {
        this.field800 = arg0;
        this.field798 = arg1;
        this.method1012();
        this.field801 = arg2;
        this.field804 = arg3;
    }

    @ObfuscatedName("bx.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method993(int arg0, String arg1, String arg2, String arg3) {
        this.field803 = class95.method2954();
        this.field797 = client.field1036;
        this.field800 = arg0;
        this.field798 = arg1;
        this.method1012();
        this.field801 = arg2;
        this.field804 = arg3;
    }

    @ObfuscatedName("bx.g(I)V")
    public void method990() {
        this.field805 = class279.field3717;
    }

    @ObfuscatedName("bx.m(I)Z")
    public final boolean method997() {
        if (class279.field3717 == this.field805) {
            this.method992();
        }
        return class279.field3719 == this.field805;
    }

    @ObfuscatedName("bx.h(I)V")
    public void method992() {
        this.field805 = Statics.field473.field1212.method4863(this.field796) ? class279.field3719 : class279.field3718;
    }

    @ObfuscatedName("bx.i(I)V")
    public void method991() {
        this.field802 = class279.field3717;
    }

    @ObfuscatedName("bx.w(I)Z")
    public final boolean method994() {
        if (class279.field3717 == this.field802) {
            this.method995();
        }
        return class279.field3719 == this.field802;
    }

    @ObfuscatedName("bx.t(B)V")
    public void method995() {
        this.field802 = Statics.field473.field1213.method4863(this.field796) ? class279.field3719 : class279.field3718;
    }

    @ObfuscatedName("bx.d(B)V")
    public final void method1012() {
        if (this.field798 == null) {
            this.field796 = null;
        } else {
            this.field796 = new class281(client.method1758(this.field798), Statics.field2740);
        }
    }
}
