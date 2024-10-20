package deob;

@ObfuscatedName("ga")
public class class205 {

    @ObfuscatedName("ga.cs")
    public long field2422;

    @ObfuscatedName("ga.ct")
    public class205 field2423;

    @ObfuscatedName("ga.cc")
    public class205 field2424;

    @ObfuscatedName("ga.jm()V")
    public void method3756() {
        if (this.field2424 != null) {
            this.field2424.field2423 = this.field2423;
            this.field2423.field2424 = this.field2424;
            this.field2423 = null;
            this.field2424 = null;
        }
    }

    @ObfuscatedName("ga.jw()Z")
    public boolean method3757() {
        return this.field2424 != null;
    }
}
