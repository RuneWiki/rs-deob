package deob;

@ObfuscatedName("fi")
public class class173 {

    @ObfuscatedName("fi.i")
    public class178 field2803 = new class178();

    @ObfuscatedName("fi.v")
    public class178 field2804;

    public class173() {
        this.field2803.field2816 = this.field2803;
        this.field2803.field2815 = this.field2803;
    }

    @ObfuscatedName("fi.i(Lfs;)V")
    public void method3331(class178 arg0) {
        if (arg0.field2815 != null) {
            arg0.method3401();
        }
        arg0.field2815 = this.field2803.field2815;
        arg0.field2816 = this.field2803;
        arg0.field2815.field2816 = arg0;
        arg0.field2816.field2815 = arg0;
    }

    @ObfuscatedName("fi.v()Lfs;")
    public class178 method3340() {
        class178 var1 = this.field2803.field2816;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fi.m()Lfs;")
    public class178 method3334() {
        class178 var1 = this.field2804;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2816;
            return var1;
        }
    }
}
