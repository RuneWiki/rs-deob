package deob;

@ObfuscatedName("fu")
public class class168 {

    @ObfuscatedName("fu.m")
    public class175 field2795 = new class175();

    @ObfuscatedName("fu.k")
    public class175 field2796;

    public class168() {
        this.field2795.field2810 = this.field2795;
        this.field2795.field2809 = this.field2795;
    }

    @ObfuscatedName("fu.m(Lfr;)V")
    public void method3144(class175 arg0) {
        if (arg0.field2809 != null) {
            arg0.method3222();
        }
        arg0.field2809 = this.field2795.field2809;
        arg0.field2810 = this.field2795;
        arg0.field2809.field2810 = arg0;
        arg0.field2810.field2809 = arg0;
    }

    @ObfuscatedName("fu.k()Lfr;")
    public class175 method3145() {
        class175 var1 = this.field2795.field2810;
        if (this.field2795 == var1) {
            this.field2796 = null;
            return null;
        } else {
            this.field2796 = var1.field2810;
            return var1;
        }
    }

    @ObfuscatedName("fu.y()Lfr;")
    public class175 method3149() {
        class175 var1 = this.field2796;
        if (this.field2795 == var1) {
            this.field2796 = null;
            return null;
        } else {
            this.field2796 = var1.field2810;
            return var1;
        }
    }
}
