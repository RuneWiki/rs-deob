package deob;

@ObfuscatedName("fx")
public class class171 {

    @ObfuscatedName("fx.z")
    public class176 field2741 = new class176();

    @ObfuscatedName("fx.h")
    public class176 field2740;

    public class171() {
        this.field2741.field2752 = this.field2741;
        this.field2741.field2753 = this.field2741;
    }

    @ObfuscatedName("fx.z(Lfu;)V")
    public void method3268(class176 arg0) {
        if (arg0.field2753 != null) {
            arg0.method3343();
        }
        arg0.field2753 = this.field2741.field2753;
        arg0.field2752 = this.field2741;
        arg0.field2753.field2752 = arg0;
        arg0.field2752.field2753 = arg0;
    }

    @ObfuscatedName("fx.h()Lfu;")
    public class176 method3269() {
        class176 var1 = this.field2741.field2752;
        if (this.field2741 == var1) {
            this.field2740 = null;
            return null;
        } else {
            this.field2740 = var1.field2752;
            return var1;
        }
    }

    @ObfuscatedName("fx.c()Lfu;")
    public class176 method3267() {
        class176 var1 = this.field2740;
        if (this.field2741 == var1) {
            this.field2740 = null;
            return null;
        } else {
            this.field2740 = var1.field2752;
            return var1;
        }
    }
}
