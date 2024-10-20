package deob;

@ObfuscatedName("fm")
public class class175 {

    @ObfuscatedName("fm.e")
    public class180 field2826 = new class180();

    @ObfuscatedName("fm.i")
    public class180 field2825;

    public class175() {
        this.field2826.field2837 = this.field2826;
        this.field2826.field2838 = this.field2826;
    }

    @ObfuscatedName("fm.e(Lfx;)V")
    public void method3297(class180 arg0) {
        if (arg0.field2838 != null) {
            arg0.method3363();
        }
        arg0.field2838 = this.field2826.field2838;
        arg0.field2837 = this.field2826;
        arg0.field2838.field2837 = arg0;
        arg0.field2837.field2838 = arg0;
    }

    @ObfuscatedName("fm.i()Lfx;")
    public class180 method3296() {
        class180 var1 = this.field2826.field2837;
        if (this.field2826 == var1) {
            this.field2825 = null;
            return null;
        } else {
            this.field2825 = var1.field2837;
            return var1;
        }
    }

    @ObfuscatedName("fm.k()Lfx;")
    public class180 method3295() {
        class180 var1 = this.field2825;
        if (this.field2826 == var1) {
            this.field2825 = null;
            return null;
        } else {
            this.field2825 = var1.field2837;
            return var1;
        }
    }
}
