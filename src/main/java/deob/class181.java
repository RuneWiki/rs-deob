package deob;

@ObfuscatedName("fb")
public class class181 {

    @ObfuscatedName("fb.cc")
    public long field2126;

    @ObfuscatedName("fb.cp")
    public class181 field2127;

    @ObfuscatedName("fb.ce")
    public class181 field2128;

    @ObfuscatedName("fb.fs()V")
    public void method3332() {
        if (this.field2128 != null) {
            this.field2128.field2127 = this.field2127;
            this.field2127.field2128 = this.field2128;
            this.field2127 = null;
            this.field2128 = null;
        }
    }

    @ObfuscatedName("fb.fk()Z")
    public boolean method3328() {
        return this.field2128 != null;
    }
}
