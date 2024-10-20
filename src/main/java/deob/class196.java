package deob;

@ObfuscatedName("gd")
public class class196 {

    @ObfuscatedName("gd.ct")
    public long field2490;

    @ObfuscatedName("gd.cs")
    public class196 field2489;

    @ObfuscatedName("gd.cc")
    public class196 field2488;

    @ObfuscatedName("gd.id()V")
    public void method3294() {
        if (this.field2488 != null) {
            this.field2488.field2489 = this.field2489;
            this.field2489.field2488 = this.field2488;
            this.field2489 = null;
            this.field2488 = null;
        }
    }

    @ObfuscatedName("gd.ik()Z")
    public boolean method3295() {
        return this.field2488 != null;
    }
}
