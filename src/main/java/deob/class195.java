package deob;

@ObfuscatedName("gl")
public class class195 {

    @ObfuscatedName("gl.f")
    public class207 field3078 = new class207();

    @ObfuscatedName("gl.s")
    public class207 field3079;

    public class195() {
        this.field3078.field3103 = this.field3078;
        this.field3078.field3104 = this.field3078;
    }

    @ObfuscatedName("gl.f(Lgy;)V")
    public void method3526(class207 arg0) {
        if (arg0.field3104 != null) {
            arg0.method3663();
        }
        arg0.field3104 = this.field3078.field3104;
        arg0.field3103 = this.field3078;
        arg0.field3104.field3103 = arg0;
        arg0.field3103.field3104 = arg0;
    }

    @ObfuscatedName("gl.s()Lgy;")
    public class207 method3527() {
        class207 var1 = this.field3078.field3103;
        if (this.field3078 == var1) {
            this.field3079 = null;
            return null;
        } else {
            this.field3079 = var1.field3103;
            return var1;
        }
    }

    @ObfuscatedName("gl.q()Lgy;")
    public class207 method3525() {
        class207 var1 = this.field3079;
        if (this.field3078 == var1) {
            this.field3079 = null;
            return null;
        } else {
            this.field3079 = var1.field3103;
            return var1;
        }
    }
}
