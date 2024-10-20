package deob;

@ObfuscatedName("gc")
public class class185 {

    @ObfuscatedName("gc.p")
    public class185 field2863;

    @ObfuscatedName("gc.c")
    public class185 field2862;

    @ObfuscatedName("gc.t()V")
    public void method3259() {
        if (this.field2862 != null) {
            this.field2862.field2863 = this.field2863;
            this.field2863.field2862 = this.field2862;
            this.field2863 = null;
            this.field2862 = null;
        }
    }
}
