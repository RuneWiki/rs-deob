package deob;

@ObfuscatedName("hh")
public class class219 extends class217 {

    @ObfuscatedName("hh.cg")
    public long field2642;

    @ObfuscatedName("hh.cj")
    public class219 field2643;

    @ObfuscatedName("hh.cl")
    public class219 field2641;

    @ObfuscatedName("hh.ce()V")
    public void method3761() {
        if (this.field2641 != null) {
            this.field2641.field2643 = this.field2643;
            this.field2643.field2641 = this.field2641;
            this.field2643 = null;
            this.field2641 = null;
        }
    }
}
