package deob;

@ObfuscatedName("fs")
public final class class172 {

    @ObfuscatedName("fs.d")
    public class174 field2803 = new class174();

    public class172() {
        this.field2803.field2806 = this.field2803;
        this.field2803.field2807 = this.field2803;
    }

    @ObfuscatedName("fs.d(Lfz;)V")
    public void method3226(class174 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3248();
        }
        arg0.field2807 = this.field2803.field2807;
        arg0.field2806 = this.field2803;
        arg0.field2807.field2806 = arg0;
        arg0.field2806.field2807 = arg0;
    }

    @ObfuscatedName("fs.g(Lfz;)V")
    public void method3223(class174 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3248();
        }
        arg0.field2807 = this.field2803;
        arg0.field2806 = this.field2803.field2806;
        arg0.field2807.field2806 = arg0;
        arg0.field2806.field2807 = arg0;
    }

    @ObfuscatedName("fs.a()Lfz;")
    public class174 method3232() {
        class174 var1 = this.field2803.field2806;
        if (this.field2803 == var1) {
            return null;
        } else {
            var1.method3248();
            return var1;
        }
    }

    @ObfuscatedName("fs.t()Lfz;")
    public class174 method3224() {
        class174 var1 = this.field2803.field2806;
        return this.field2803 == var1 ? null : var1;
    }

    @ObfuscatedName("fs.f()V")
    public void method3230() {
        while (true) {
            class174 var1 = this.field2803.field2806;
            if (this.field2803 == var1) {
                return;
            }
            var1.method3248();
        }
    }
}
