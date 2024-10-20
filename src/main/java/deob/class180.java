package deob;

@ObfuscatedName("ft")
public class class180 extends class183 {

    @ObfuscatedName("ft.cl")
    public class180 field2822;

    @ObfuscatedName("ft.cr")
    public class180 field2823;

    @ObfuscatedName("ft.fk()V")
    public void method3260() {
        if (this.field2823 != null) {
            this.field2823.field2822 = this.field2822;
            this.field2822.field2823 = this.field2823;
            this.field2822 = null;
            this.field2823 = null;
        }
    }
}
