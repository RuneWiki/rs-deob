package deob;

@ObfuscatedName("ge")
public class class199 {

    @ObfuscatedName("ge.l")
    public class211 field3146 = new class211();

    @ObfuscatedName("ge.g")
    public class211 field3147;

    public class199() {
        this.field3146.field3172 = this.field3146;
        this.field3146.field3173 = this.field3146;
    }

    @ObfuscatedName("ge.l(Lhi;)V")
    public void method3674(class211 arg0) {
        if (arg0.field3173 != null) {
            arg0.method3811();
        }
        arg0.field3173 = this.field3146.field3173;
        arg0.field3172 = this.field3146;
        arg0.field3173.field3172 = arg0;
        arg0.field3172.field3173 = arg0;
    }

    @ObfuscatedName("ge.g()Lhi;")
    public class211 method3676() {
        class211 var1 = this.field3146.field3172;
        if (this.field3146 == var1) {
            this.field3147 = null;
            return null;
        } else {
            this.field3147 = var1.field3172;
            return var1;
        }
    }

    @ObfuscatedName("ge.r()Lhi;")
    public class211 method3681() {
        class211 var1 = this.field3147;
        if (this.field3146 == var1) {
            this.field3147 = null;
            return null;
        } else {
            this.field3147 = var1.field3172;
            return var1;
        }
    }
}
