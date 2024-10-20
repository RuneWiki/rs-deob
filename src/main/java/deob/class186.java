package deob;

@ObfuscatedName("go")
public final class class186 {

    @ObfuscatedName("go.a")
    public class187 field2896 = new class187();

    public class186() {
        this.field2896.field2897 = this.field2896;
        this.field2896.field2898 = this.field2896;
    }

    @ObfuscatedName("go.a(Lge;)V")
    public void method3308(class187 arg0) {
        if (arg0.field2898 != null) {
            arg0.method3320();
        }
        arg0.field2898 = this.field2896.field2898;
        arg0.field2897 = this.field2896;
        arg0.field2898.field2897 = arg0;
        arg0.field2897.field2898 = arg0;
    }

    @ObfuscatedName("go.v(Lge;)V")
    public void method3309(class187 arg0) {
        if (arg0.field2898 != null) {
            arg0.method3320();
        }
        arg0.field2898 = this.field2896;
        arg0.field2897 = this.field2896.field2897;
        arg0.field2898.field2897 = arg0;
        arg0.field2897.field2898 = arg0;
    }

    @ObfuscatedName("go.i()Lge;")
    public class187 method3313() {
        class187 var1 = this.field2896.field2897;
        if (this.field2896 == var1) {
            return null;
        } else {
            var1.method3320();
            return var1;
        }
    }

    @ObfuscatedName("go.b()Lge;")
    public class187 method3310() {
        class187 var1 = this.field2896.field2897;
        return this.field2896 == var1 ? null : var1;
    }

    @ObfuscatedName("go.l()V")
    public void method3311() {
        while (true) {
            class187 var1 = this.field2896.field2897;
            if (this.field2896 == var1) {
                return;
            }
            var1.method3320();
        }
    }
}
