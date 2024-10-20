package deob;

@ObfuscatedName("fb")
public class class173 {

    @ObfuscatedName("fb.j")
    public class178 field2797 = new class178();

    @ObfuscatedName("fb.f")
    public class178 field2798;

    public class173() {
        this.field2797.field2809 = this.field2797;
        this.field2797.field2810 = this.field2797;
    }

    @ObfuscatedName("fb.j(Lfd;)V")
    public void method3288(class178 arg0) {
        if (arg0.field2810 != null) {
            arg0.method3346();
        }
        arg0.field2810 = this.field2797.field2810;
        arg0.field2809 = this.field2797;
        arg0.field2810.field2809 = arg0;
        arg0.field2809.field2810 = arg0;
    }

    @ObfuscatedName("fb.f()Lfd;")
    public class178 method3293() {
        class178 var1 = this.field2797.field2809;
        if (this.field2797 == var1) {
            this.field2798 = null;
            return null;
        } else {
            this.field2798 = var1.field2809;
            return var1;
        }
    }

    @ObfuscatedName("fb.o()Lfd;")
    public class178 method3285() {
        class178 var1 = this.field2798;
        if (this.field2797 == var1) {
            this.field2798 = null;
            return null;
        } else {
            this.field2798 = var1.field2809;
            return var1;
        }
    }
}
