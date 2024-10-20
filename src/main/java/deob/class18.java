package deob;

@ObfuscatedName("ft")
public final class class18 {

    @ObfuscatedName("ft.v")
    public class7 field229 = new class7();

    @ObfuscatedName("ft.b()Lfk;")
    public class7 method171() {
        class7 var1 = this.field229.field52;
        if (this.field229 == var1) {
            return null;
        } else {
            var1.method49();
            return var1;
        }
    }

    @ObfuscatedName("ft.c(Lfk;)V")
    public void method172(class7 arg0) {
        if (arg0.field53 != null) {
            arg0.method49();
        }
        arg0.field53 = this.field229;
        arg0.field52 = this.field229.field52;
        arg0.field53.field52 = arg0;
        arg0.field52.field53 = arg0;
    }

    public class18() {
        this.field229.field52 = this.field229;
        this.field229.field53 = this.field229;
    }

    @ObfuscatedName("ft.i()Lfk;")
    public class7 method173() {
        class7 var1 = this.field229.field52;
        return this.field229 == var1 ? null : var1;
    }

    @ObfuscatedName("ft.m()V")
    public void method174() {
        while (true) {
            class7 var1 = this.field229.field52;
            if (this.field229 == var1) {
                return;
            }
            var1.method49();
        }
    }

    @ObfuscatedName("ft.v(Lfk;)V")
    public void method175(class7 arg0) {
        if (arg0.field53 != null) {
            arg0.method49();
        }
        arg0.field53 = this.field229.field53;
        arg0.field52 = this.field229;
        arg0.field53.field52 = arg0;
        arg0.field52.field53 = arg0;
    }
}
