package deob;

@ObfuscatedName("ga")
public class class185 {

    @ObfuscatedName("ga.q")
    public class197 field2931 = new class197();

    @ObfuscatedName("ga.s")
    public class197 field2930;

    public class185() {
        this.field2931.field2955 = this.field2931;
        this.field2931.field2956 = this.field2931;
    }

    @ObfuscatedName("ga.q(Lgt;)V")
    public void method3262(class197 arg0) {
        if (arg0.field2956 != null) {
            arg0.method3396();
        }
        arg0.field2956 = this.field2931.field2956;
        arg0.field2955 = this.field2931;
        arg0.field2956.field2955 = arg0;
        arg0.field2955.field2956 = arg0;
    }

    @ObfuscatedName("ga.s()Lgt;")
    public class197 method3263() {
        class197 var1 = this.field2931.field2955;
        if (this.field2931 == var1) {
            this.field2930 = null;
            return null;
        } else {
            this.field2930 = var1.field2955;
            return var1;
        }
    }

    @ObfuscatedName("ga.h()Lgt;")
    public class197 method3272() {
        class197 var1 = this.field2930;
        if (this.field2931 == var1) {
            this.field2930 = null;
            return null;
        } else {
            this.field2930 = var1.field2955;
            return var1;
        }
    }
}
