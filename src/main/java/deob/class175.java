package deob;

@ObfuscatedName("fo")
public class class175 {

    @ObfuscatedName("fo.i")
    public class180 field2825 = new class180();

    @ObfuscatedName("fo.b")
    public class180 field2824;

    public class175() {
        this.field2825.field2837 = this.field2825;
        this.field2825.field2836 = this.field2825;
    }

    @ObfuscatedName("fo.i(Lfz;)V")
    public void method3306(class180 arg0) {
        if (arg0.field2836 != null) {
            arg0.method3360();
        }
        arg0.field2836 = this.field2825.field2836;
        arg0.field2837 = this.field2825;
        arg0.field2836.field2837 = arg0;
        arg0.field2837.field2836 = arg0;
    }

    @ObfuscatedName("fo.b()Lfz;")
    public class180 method3307() {
        class180 var1 = this.field2825.field2837;
        if (this.field2825 == var1) {
            this.field2824 = null;
            return null;
        } else {
            this.field2824 = var1.field2837;
            return var1;
        }
    }

    @ObfuscatedName("fo.r()Lfz;")
    public class180 method3308() {
        class180 var1 = this.field2824;
        if (this.field2825 == var1) {
            this.field2824 = null;
            return null;
        } else {
            this.field2824 = var1.field2837;
            return var1;
        }
    }
}
