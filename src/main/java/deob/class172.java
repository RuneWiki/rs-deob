package deob;

@ObfuscatedName("fu")
public class class172 {

    @ObfuscatedName("fu.p")
    public class177 field2796 = new class177();

    @ObfuscatedName("fu.j")
    public class177 field2795;

    public class172() {
        this.field2796.field2808 = this.field2796;
        this.field2796.field2807 = this.field2796;
    }

    @ObfuscatedName("fu.p(Lfj;)V")
    public void method3247(class177 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3317();
        }
        arg0.field2807 = this.field2796.field2807;
        arg0.field2808 = this.field2796;
        arg0.field2807.field2808 = arg0;
        arg0.field2808.field2807 = arg0;
    }

    @ObfuscatedName("fu.j()Lfj;")
    public class177 method3248() {
        class177 var1 = this.field2796.field2808;
        if (this.field2796 == var1) {
            this.field2795 = null;
            return null;
        } else {
            this.field2795 = var1.field2808;
            return var1;
        }
    }

    @ObfuscatedName("fu.w()Lfj;")
    public class177 method3257() {
        class177 var1 = this.field2795;
        if (this.field2796 == var1) {
            this.field2795 = null;
            return null;
        } else {
            this.field2795 = var1.field2808;
            return var1;
        }
    }
}
