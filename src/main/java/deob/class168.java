package deob;

@ObfuscatedName("fo")
public class class168 {

    @ObfuscatedName("fo.z")
    public class175 field2802 = new class175();

    @ObfuscatedName("fo.n")
    public class175 field2801;

    public class168() {
        this.field2802.field2816 = this.field2802;
        this.field2802.field2815 = this.field2802;
    }

    @ObfuscatedName("fo.z(Lft;)V")
    public void method3204(class175 arg0) {
        if (arg0.field2815 != null) {
            arg0.method3286();
        }
        arg0.field2815 = this.field2802.field2815;
        arg0.field2816 = this.field2802;
        arg0.field2815.field2816 = arg0;
        arg0.field2816.field2815 = arg0;
    }

    @ObfuscatedName("fo.n()Lft;")
    public class175 method3197() {
        class175 var1 = this.field2802.field2816;
        if (this.field2802 == var1) {
            this.field2801 = null;
            return null;
        } else {
            this.field2801 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fo.u()Lft;")
    public class175 method3195() {
        class175 var1 = this.field2801;
        if (this.field2802 == var1) {
            this.field2801 = null;
            return null;
        } else {
            this.field2801 = var1.field2816;
            return var1;
        }
    }
}
