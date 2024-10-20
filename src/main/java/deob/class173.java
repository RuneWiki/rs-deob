package deob;

@ObfuscatedName("fh")
public class class173 {

    @ObfuscatedName("fh.c")
    public class178 field2811 = new class178();

    @ObfuscatedName("fh.q")
    public class178 field2810;

    public class173() {
        this.field2811.field2823 = this.field2811;
        this.field2811.field2822 = this.field2811;
    }

    @ObfuscatedName("fh.c(Lfs;)V")
    public void method3123(class178 arg0) {
        if (arg0.field2822 != null) {
            arg0.method3195();
        }
        arg0.field2822 = this.field2811.field2822;
        arg0.field2823 = this.field2811;
        arg0.field2822.field2823 = arg0;
        arg0.field2823.field2822 = arg0;
    }

    @ObfuscatedName("fh.q()Lfs;")
    public class178 method3129() {
        class178 var1 = this.field2811.field2823;
        if (this.field2811 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2823;
            return var1;
        }
    }

    @ObfuscatedName("fh.y()Lfs;")
    public class178 method3124() {
        class178 var1 = this.field2810;
        if (this.field2811 == var1) {
            this.field2810 = null;
            return null;
        } else {
            this.field2810 = var1.field2823;
            return var1;
        }
    }
}
