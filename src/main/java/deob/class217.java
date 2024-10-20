package deob;

@ObfuscatedName("hx")
public class class217 {

    @ObfuscatedName("hx.ce")
    public long field2636;

    @ObfuscatedName("hx.cx")
    public class217 field2637;

    @ObfuscatedName("hx.cy")
    public class217 field2638;

    @ObfuscatedName("hx.kc()V")
    public void method3721() {
        if (this.field2638 != null) {
            this.field2638.field2637 = this.field2637;
            this.field2637.field2638 = this.field2638;
            this.field2637 = null;
            this.field2638 = null;
        }
    }

    @ObfuscatedName("hx.kg()Z")
    public boolean method3719() {
        return this.field2638 != null;
    }
}
