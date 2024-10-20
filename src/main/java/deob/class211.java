package deob;

@ObfuscatedName("hf")
public class class211 {

    @ObfuscatedName("hf.c")
    public class212 field2474 = new class212();

    @ObfuscatedName("hf.q")
    public class212 field2475;

    public class211() {
        this.field2474.field2477 = this.field2474;
        this.field2474.field2476 = this.field2474;
    }

    @ObfuscatedName("hf.c(Lhe;)V")
    public void method3775(class212 arg0) {
        if (arg0.field2476 != null) {
            arg0.method3780();
        }
        arg0.field2476 = this.field2474.field2476;
        arg0.field2477 = this.field2474;
        arg0.field2476.field2477 = arg0;
        arg0.field2477.field2476 = arg0;
    }

    @ObfuscatedName("hf.q()Lhe;")
    public class212 method3770() {
        class212 var1 = this.field2474.field2477;
        if (this.field2474 == var1) {
            this.field2475 = null;
            return null;
        } else {
            this.field2475 = var1.field2477;
            return var1;
        }
    }

    @ObfuscatedName("hf.m()Lhe;")
    public class212 method3769() {
        class212 var1 = this.field2475;
        if (this.field2474 == var1) {
            this.field2475 = null;
            return null;
        } else {
            this.field2475 = var1.field2477;
            return var1;
        }
    }
}
