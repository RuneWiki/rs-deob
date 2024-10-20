package deob;

@ObfuscatedName("fm")
public class class173 {

    @ObfuscatedName("fm.t")
    public class178 field2806 = new class178();

    @ObfuscatedName("fm.l")
    public class178 field2805;

    public class173() {
        this.field2806.field2817 = this.field2806;
        this.field2806.field2818 = this.field2806;
    }

    @ObfuscatedName("fm.t(Lfr;)V")
    public void method3295(class178 arg0) {
        if (arg0.field2818 != null) {
            arg0.method3356();
        }
        arg0.field2818 = this.field2806.field2818;
        arg0.field2817 = this.field2806;
        arg0.field2818.field2817 = arg0;
        arg0.field2817.field2818 = arg0;
    }

    @ObfuscatedName("fm.l()Lfr;")
    public class178 method3290() {
        class178 var1 = this.field2806.field2817;
        if (this.field2806 == var1) {
            this.field2805 = null;
            return null;
        } else {
            this.field2805 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fm.c()Lfr;")
    public class178 method3291() {
        class178 var1 = this.field2805;
        if (this.field2806 == var1) {
            this.field2805 = null;
            return null;
        } else {
            this.field2805 = var1.field2817;
            return var1;
        }
    }
}
