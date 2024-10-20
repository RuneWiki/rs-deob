package deob;

@ObfuscatedName("gc")
public final class class197 {

    @ObfuscatedName("gc.l")
    public class208 field3141 = new class208();

    @ObfuscatedName("gc.g")
    public int field3137;

    @ObfuscatedName("gc.r")
    public int field3138;

    @ObfuscatedName("gc.e")
    public class200 field3140;

    @ObfuscatedName("gc.h")
    public class207 field3139 = new class207();

    public class197(int arg0) {
        this.field3137 = arg0;
        this.field3138 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3140 = new class200(var2);
    }

    @ObfuscatedName("gc.l(J)Lgm;")
    public class208 method3653(long arg0) {
        class208 var3 = (class208) this.field3140.method3684(arg0);
        if (var3 != null) {
            this.field3139.method3781(var3);
        }
        return var3;
    }

    @ObfuscatedName("gc.g(J)V")
    public void method3654(long arg0) {
        class208 var3 = (class208) this.field3140.method3684(arg0);
        if (var3 != null) {
            var3.method3815();
            var3.method3793();
            this.field3138++;
        }
    }

    @ObfuscatedName("gc.r(Lgm;J)V")
    public void method3655(class208 arg0, long arg1) {
        if (this.field3138 == 0) {
            class208 var4 = this.field3139.method3780();
            var4.method3815();
            var4.method3793();
            if (this.field3141 == var4) {
                class208 var5 = this.field3139.method3780();
                var5.method3815();
                var5.method3793();
            }
        } else {
            this.field3138--;
        }
        this.field3140.method3688(arg0, arg1);
        this.field3139.method3781(arg0);
    }

    @ObfuscatedName("gc.e()V")
    public void method3658() {
        this.field3139.method3782();
        this.field3140.method3686();
        this.field3141 = new class208();
        this.field3138 = this.field3137;
    }
}
