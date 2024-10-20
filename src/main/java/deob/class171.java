package deob;

@ObfuscatedName("fm")
public class class171 {

    @ObfuscatedName("fm.g")
    public class176 field2746 = new class176();

    @ObfuscatedName("fm.e")
    public class176 field2747;

    public class171() {
        this.field2746.field2758 = this.field2746;
        this.field2746.field2759 = this.field2746;
    }

    @ObfuscatedName("fm.g(Lfs;)V")
    public void method3342(class176 arg0) {
        if (arg0.field2759 != null) {
            arg0.method3410();
        }
        arg0.field2759 = this.field2746.field2759;
        arg0.field2758 = this.field2746;
        arg0.field2759.field2758 = arg0;
        arg0.field2758.field2759 = arg0;
    }

    @ObfuscatedName("fm.e()Lfs;")
    public class176 method3344() {
        class176 var1 = this.field2746.field2758;
        if (this.field2746 == var1) {
            this.field2747 = null;
            return null;
        } else {
            this.field2747 = var1.field2758;
            return var1;
        }
    }

    @ObfuscatedName("fm.n()Lfs;")
    public class176 method3341() {
        class176 var1 = this.field2747;
        if (this.field2746 == var1) {
            this.field2747 = null;
            return null;
        } else {
            this.field2747 = var1.field2758;
            return var1;
        }
    }
}
