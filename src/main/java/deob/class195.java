package deob;

@ObfuscatedName("gc")
public class class195 extends class193 {

    @ObfuscatedName("gc.cj")
    public class195 field2478;

    @ObfuscatedName("gc.cr")
    public class195 field2479;

    @ObfuscatedName("gc.cv()V")
    public void method3323() {
        if (this.field2479 != null) {
            this.field2479.field2478 = this.field2478;
            this.field2478.field2479 = this.field2479;
            this.field2478 = null;
            this.field2479 = null;
        }
    }
}
