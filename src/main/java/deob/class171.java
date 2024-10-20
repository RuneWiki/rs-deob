package deob;

@ObfuscatedName("fq")
public final class class171 {

    @ObfuscatedName("fq.v")
    public class173 field2797 = new class173();

    public class171() {
        this.field2797.field2801 = this.field2797;
        this.field2797.field2800 = this.field2797;
    }

    @ObfuscatedName("fq.v(Lfv;)V")
    public void method3235(class173 arg0) {
        if (arg0.field2800 != null) {
            arg0.method3265();
        }
        arg0.field2800 = this.field2797.field2800;
        arg0.field2801 = this.field2797;
        arg0.field2800.field2801 = arg0;
        arg0.field2801.field2800 = arg0;
    }

    @ObfuscatedName("fq.f(Lfv;)V")
    public void method3236(class173 arg0) {
        if (arg0.field2800 != null) {
            arg0.method3265();
        }
        arg0.field2800 = this.field2797;
        arg0.field2801 = this.field2797.field2801;
        arg0.field2800.field2801 = arg0;
        arg0.field2801.field2800 = arg0;
    }

    @ObfuscatedName("fq.n()Lfv;")
    public class173 method3244() {
        class173 var1 = this.field2797.field2801;
        if (this.field2797 == var1) {
            return null;
        } else {
            var1.method3265();
            return var1;
        }
    }

    @ObfuscatedName("fq.c()Lfv;")
    public class173 method3234() {
        class173 var1 = this.field2797.field2801;
        return this.field2797 == var1 ? null : var1;
    }

    @ObfuscatedName("fq.r()V")
    public void method3238() {
        while (true) {
            class173 var1 = this.field2797.field2801;
            if (this.field2797 == var1) {
                return;
            }
            var1.method3265();
        }
    }
}
