package deob;

@ObfuscatedName("gc")
public class class186 {

    @ObfuscatedName("gc.de")
    public long field2867;

    @ObfuscatedName("gc.eh")
    public class186 field2865;

    @ObfuscatedName("gc.et")
    public class186 field2866;

    @ObfuscatedName("gc.iu()V")
    public void method3273() {
        if (this.field2866 != null) {
            this.field2866.field2865 = this.field2865;
            this.field2865.field2866 = this.field2866;
            this.field2865 = null;
            this.field2866 = null;
        }
    }

    @ObfuscatedName("gc.im()Z")
    public boolean method3274() {
        return this.field2866 != null;
    }
}
