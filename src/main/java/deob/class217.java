package deob;

@ObfuscatedName("hg")
public class class217 {

    @ObfuscatedName("hg.ce")
    public long field2645;

    @ObfuscatedName("hg.cr")
    public class217 field2643;

    @ObfuscatedName("hg.cf")
    public class217 field2644;

    @ObfuscatedName("hg.jy()V")
    public void method3710() {
        if (this.field2644 != null) {
            this.field2644.field2643 = this.field2643;
            this.field2643.field2644 = this.field2644;
            this.field2643 = null;
            this.field2644 = null;
        }
    }

    @ObfuscatedName("hg.ji()Z")
    public boolean method3709() {
        return this.field2644 != null;
    }
}
