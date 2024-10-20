package deob;

@ObfuscatedName("fg")
public class class173 {

    @ObfuscatedName("fg.p")
    public class178 field2805 = new class178();

    @ObfuscatedName("fg.l")
    public class178 field2806;

    public class173() {
        this.field2805.field2817 = this.field2805;
        this.field2805.field2818 = this.field2805;
    }

    @ObfuscatedName("fg.p(Lfh;)V")
    public void method3389(class178 arg0) {
        if (arg0.field2818 != null) {
            arg0.method3451();
        }
        arg0.field2818 = this.field2805.field2818;
        arg0.field2817 = this.field2805;
        arg0.field2818.field2817 = arg0;
        arg0.field2817.field2818 = arg0;
    }

    @ObfuscatedName("fg.l()Lfh;")
    public class178 method3395() {
        class178 var1 = this.field2805.field2817;
        if (this.field2805 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fg.d()Lfh;")
    public class178 method3390() {
        class178 var1 = this.field2806;
        if (this.field2805 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2817;
            return var1;
        }
    }
}
