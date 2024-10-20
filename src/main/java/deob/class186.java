package deob;

@ObfuscatedName("gi")
public class class186 {

    @ObfuscatedName("gi.y")
    public class198 field2997 = new class198();

    @ObfuscatedName("gi.k")
    public class198 field2998;

    public class186() {
        this.field2997.field3022 = this.field2997;
        this.field2997.field3023 = this.field2997;
    }

    @ObfuscatedName("gi.y(Lgs;)V")
    public void method3354(class198 arg0) {
        if (arg0.field3023 != null) {
            arg0.method3479();
        }
        arg0.field3023 = this.field2997.field3023;
        arg0.field3022 = this.field2997;
        arg0.field3023.field3022 = arg0;
        arg0.field3022.field3023 = arg0;
    }

    @ObfuscatedName("gi.k()Lgs;")
    public class198 method3350() {
        class198 var1 = this.field2997.field3022;
        if (this.field2997 == var1) {
            this.field2998 = null;
            return null;
        } else {
            this.field2998 = var1.field3022;
            return var1;
        }
    }

    @ObfuscatedName("gi.g()Lgs;")
    public class198 method3352() {
        class198 var1 = this.field2998;
        if (this.field2997 == var1) {
            this.field2998 = null;
            return null;
        } else {
            this.field2998 = var1.field3022;
            return var1;
        }
    }
}
