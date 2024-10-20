package deob;

@ObfuscatedName("hm")
public class class221 {

    @ObfuscatedName("hm.g")
    public class222 field2668 = new class222();

    @ObfuscatedName("hm.e")
    public class222 field2667;

    public class221() {
        this.field2668.field2670 = this.field2668;
        this.field2668.field2669 = this.field2668;
    }

    @ObfuscatedName("hm.g(Lhv;)V")
    public void method3846(class222 arg0) {
        if (arg0.field2669 != null) {
            arg0.method3858();
        }
        arg0.field2669 = this.field2668.field2669;
        arg0.field2670 = this.field2668;
        arg0.field2669.field2670 = arg0;
        arg0.field2670.field2669 = arg0;
    }

    @ObfuscatedName("hm.e()Lhv;")
    public class222 method3847() {
        class222 var1 = this.field2668.field2670;
        if (this.field2668 == var1) {
            this.field2667 = null;
            return null;
        } else {
            this.field2667 = var1.field2670;
            return var1;
        }
    }

    @ObfuscatedName("hm.b()Lhv;")
    public class222 method3845() {
        class222 var1 = this.field2667;
        if (this.field2668 == var1) {
            this.field2667 = null;
            return null;
        } else {
            this.field2667 = var1.field2670;
            return var1;
        }
    }
}
