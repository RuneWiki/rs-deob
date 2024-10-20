package deob;

@ObfuscatedName("hu")
public class class211 {

    @ObfuscatedName("hu.v")
    public class212 field2472 = new class212();

    @ObfuscatedName("hu.s")
    public class212 field2473;

    public class211() {
        this.field2472.field2475 = this.field2472;
        this.field2472.field2474 = this.field2472;
    }

    @ObfuscatedName("hu.v(Lhi;)V")
    public void method3832(class212 arg0) {
        if (arg0.field2474 != null) {
            arg0.method3839();
        }
        arg0.field2474 = this.field2472.field2474;
        arg0.field2475 = this.field2472;
        arg0.field2474.field2475 = arg0;
        arg0.field2475.field2474 = arg0;
    }

    @ObfuscatedName("hu.s()Lhi;")
    public class212 method3836() {
        class212 var1 = this.field2472.field2475;
        if (this.field2472 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2475;
            return var1;
        }
    }

    @ObfuscatedName("hu.o()Lhi;")
    public class212 method3833() {
        class212 var1 = this.field2473;
        if (this.field2472 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2475;
            return var1;
        }
    }
}
