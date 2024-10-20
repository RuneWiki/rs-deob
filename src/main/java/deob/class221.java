package deob;

@ObfuscatedName("hh")
public class class221 {

    @ObfuscatedName("hh.d")
    public class222 field2662 = new class222();

    @ObfuscatedName("hh.z")
    public class222 field2663;

    public class221() {
        this.field2662.field2665 = this.field2662;
        this.field2662.field2664 = this.field2662;
    }

    @ObfuscatedName("hh.d(Lha;)V")
    public void method3835(class222 arg0) {
        if (arg0.field2664 != null) {
            arg0.method3843();
        }
        arg0.field2664 = this.field2662.field2664;
        arg0.field2665 = this.field2662;
        arg0.field2664.field2665 = arg0;
        arg0.field2665.field2664 = arg0;
    }

    @ObfuscatedName("hh.z()Lha;")
    public class222 method3834() {
        class222 var1 = this.field2662.field2665;
        if (this.field2662 == var1) {
            this.field2663 = null;
            return null;
        } else {
            this.field2663 = var1.field2665;
            return var1;
        }
    }

    @ObfuscatedName("hh.n()Lha;")
    public class222 method3840() {
        class222 var1 = this.field2663;
        if (this.field2662 == var1) {
            this.field2663 = null;
            return null;
        } else {
            this.field2663 = var1.field2665;
            return var1;
        }
    }
}
